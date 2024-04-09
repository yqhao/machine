package com.suqi.center.machine.biz.service.impl;

import cn.hutool.core.util.StrUtil;
import com.suqi.center.common.enums.LastRebootTypeEnum;
import com.suqi.center.common.enums.MemberNotificationEnum;
import com.suqi.center.common.enums.RebootOptRoleEnum;
import com.suqi.center.common.utils.DateUtil;
import com.suqi.center.common.utils.SqKeyValuePair;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.api.dto.request.GpuUsageStatusAlarmParam;
import com.suqi.center.machine.api.dto.request.SmnLackOfSpaceWarningParam;
import com.suqi.center.machine.biz.config.SmnDeviceProperties;
import com.suqi.center.machine.biz.dto.ExternalAddrByServerIdResult;
import com.suqi.center.machine.biz.enums.CloudMachineAlarmRuleTemplateTypeEnum;
import com.suqi.center.machine.biz.service.*;
import com.suqi.center.machine.biz.utils.notify.NotifyServerUtils;
import com.suqi.center.machine.dao.entity.*;
import com.suqi.center.machine.dao.service.*;
import com.suqi.center.machine.dao.vo.MemberDeviceVo;
import com.suqi.core.kafka.BoxOtaService;
import com.suqi.core.lock.RedissonLock;
import com.suqi.core.redis.core.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @AUTHOR: oyxueyi
 * @PACKAGE_NAME: com.suqi.center.machine.biz.service.impl
 * @NAME: SmnServiceImpl
 * @DATE: 2023/5/6 16:26
 * @PROJECT_NAME: suqi-application-backendapi
 * @Description: 华为 smn service 组件
 */
@Service
@Slf4j
public class SmnServiceImpl implements ISmnService {

    @Value("${alarm.enable.gpuAlarm:true}")
    private Boolean enableGpuAlarm;
    @Resource
    private RedisService redisService;
    @Autowired
    private IEmSocDeviceCmdRebootLastRecordService iEmSocDeviceCmdRebootLastRecordService;
    @Autowired
    IEmSocDevicesService emSocDevicesService;
    @Autowired
    IEmSocDeviceCmdRebootRecordService emSocDeviceCmdRebootRecordService;
    @Resource
    private RedissonLock redissonLock;
    @Resource
    private SmnDeviceProperties smnDeviceProperties;
    private final IPcpDeviceService pcpDeviceService;

    private final CloudMachineAlarmRuleTemplateService cloudMachineAlarmRuleTemplateService;

    private final BoxOtaService boxOtaService;

    private final MemberNotificationService memberNotificationService;

    private final RoomService roomService;

    private final NotifyServerUtils notifyServerUtils;

    private final IMemberDeviceService memberDeviceService;

    private final MachineService machineService;
    /**
     * 重启时间间隔 默认（5分钟内）
     */
    @Value("${alarm.restart.interval.time:300}")
    private Integer restartIntervalTime;

    /**
     * 分布式锁、避免 如果单路云机 同时多个告警阈值触发并发时 控制不住【当天重试次数和间隔时长】规则
     */
    public static final String SMN_NOTICE_DEVICE_LOCK_KEY = "SMN_NOTICE_DEVICE_LOCK_KEY:";

    /**
     * 重启类型：（内存告警/cpu告警）
     * 2个类型告警重启时间间隔太短（5分钟内），则抛弃该重启行为也不回调给商户
     */
    public static final String SMN_NOTICE_INTERVAL_TIME_KEY = "SMN_NOTICE_INTERVAL_TIME_KEY:";
    /**
     * 重启类型：（内存告警/cpu告警）
     * 单路【当天】告警 已重启次数超出n次（可配置）后则飞书通知运维介入，后续不再执行重启操作不回调给商户
     */
    public static final String SMN_NOTICE_CURRENT_DAY_RESTARTED_COUNT_KEY = "SMN_NOTICE_CURRENT_DAY_RESTARTED_COUNT_KEY:";

    public SmnServiceImpl(IPcpDeviceService pcpDeviceService,
                          CloudMachineAlarmRuleTemplateService cloudMachineAlarmRuleTemplateService,
                          BoxOtaService boxOtaService,
                          MemberNotificationService memberNotificationService,
                          RoomService roomService,
                          NotifyServerUtils notifyServerUtils,
                          IMemberDeviceService memberDeviceService,
                          MachineService machineService) {
        this.pcpDeviceService = pcpDeviceService;
        this.cloudMachineAlarmRuleTemplateService = cloudMachineAlarmRuleTemplateService;
        this.boxOtaService = boxOtaService;
        this.memberNotificationService = memberNotificationService;
        this.roomService = roomService;
        this.notifyServerUtils = notifyServerUtils;
        this.memberDeviceService = memberDeviceService;
        this.machineService = machineService;
    }

    /**
     * 旧版本的cpu预警 废弃但是还是保留 命名有问题 实际是cpu告警
     *
     * @param smnAlarmRequest 告警参数
     * @return
     */
    @Override
    public Boolean gpuAlarm(SmnLackOfSpaceWarningParam smnAlarmRequest) {
        // 未开启
        if(!enableGpuAlarm) {
            log.error("SMN 告警：未开启 GPU 不足告警：{}", smnAlarmRequest);
            return Boolean.FALSE;
        }
        // 设备不存在
        PcpDevice pcpDevice = pcpDeviceService.selectByPhoneIdAndServerId(smnAlarmRequest.getCphPhoneId(), smnAlarmRequest.getCphServerId());
        if(pcpDevice == null){
            log.error("SMN 告警：当前设备不存在当前环境：{}", smnAlarmRequest);
            return Boolean.FALSE;
        }
        // 查询告警手机
        String memberPhone = memberDeviceService.getMemberNameByDeviceId(pcpDevice.getDeviceId());
        // 查询房间
        DevRoomPlayer devRoomPlayer = roomService.getRoomByDeviceId(pcpDevice.getDeviceId());
        if(Objects.nonNull(devRoomPlayer)) {
            // 读取商户的配置模板
            McCloudMachineAlarmRuleTemplate ruleByAlarmValue = cloudMachineAlarmRuleTemplateService.getRuleByType(CloudMachineAlarmRuleTemplateTypeEnum.CPU_GRAPHICS_MEMORY_REACHES_THRESHOLD_ALARM.getValue(), memberPhone);
            if(Objects.isNull(ruleByAlarmValue)) {
                // 读取默认模板
                ruleByAlarmValue = cloudMachineAlarmRuleTemplateService.getRuleByType(CloudMachineAlarmRuleTemplateTypeEnum.CPU_GRAPHICS_MEMORY_REACHES_THRESHOLD_ALARM.getValue(), "default");
            }
            log.info("查询的商户告警通知模板 ruleByAlarmValue：{}", ruleByAlarmValue);
            // 是否发送给用户
            if (ruleByAlarmValue.getIsNoticeUser()) {
                // 发送给用户的模板
                if (StrUtil.isNotBlank(ruleByAlarmValue.getMessageTemplate())) {
                    // 构建 command 参数
                    LinkedHashMap<String, Object> command
                            = buildCommand(ruleByAlarmValue.getTitle(), ruleByAlarmValue.getMessageTemplate());
                    // 通知用户
                    boxOtaService.sendMasterMessages(pcpDevice.getDeviceId(), List.of(command));
                }
            }
            // 是否发送通租户
            if (ruleByAlarmValue.getIsNoticeTenant()) {
                // 通知租户
                memberNotificationService.smnAlarm(devRoomPlayer, MemberNotificationEnum.CPU_GRAPHICS_MEMORY_REACHES_THRESHOLD);
                log.info("发送 kafka 通知商户 memberPhone：{}", memberPhone);
            }
            // 是否通知飞书
            if(ruleByAlarmValue.getIsNoticeFeishu()) {
                // 飞书通知
                notifyServerUtils.sendSmnFlyBookAlarm(
                        devRoomPlayer, pcpDevice.getDeviceId(), memberPhone, "GPU 达到阈值 ",
                        smnAlarmRequest.getCurrentData(), MemberNotificationEnum.CPU_GRAPHICS_MEMORY_REACHES_THRESHOLD.info(), ruleByAlarmValue.getIsRestart());
            }
            // 是否触发重启
            enableRestart(pcpDevice, ruleByAlarmValue);
            // 成功
            return Boolean.TRUE;
        }
        // 飞书通知
        notifyServerUtils.sendSmnFlyBookAlarm(
                devRoomPlayer, pcpDevice.getDeviceId(), memberPhone, "GUP 达到阈值 ",
                smnAlarmRequest.getCurrentData(), MemberNotificationEnum.CPU_GRAPHICS_MEMORY_REACHES_THRESHOLD.info(), Boolean.FALSE);
        return Boolean.TRUE;
    }

    @Override
    public Boolean gpuUsageStatusAlarm(GpuUsageStatusAlarmParam gpuUsageStatusAlarmParam) {
        ExternalAddrByServerIdResult externalAddrByServerId = machineService.getExternalAddrByServerId(gpuUsageStatusAlarmParam.getServerId());
        // 飞书通知
        notifyServerUtils.sendGpuUsageStatusWarningFeiShuNotify(
                externalAddrByServerId,
                gpuUsageStatusAlarmParam.getGpuIndex(),
                gpuUsageStatusAlarmParam.getCurrentData());
        return Boolean.TRUE;
    }

    /**
     * 新 CPU告警
     *
     * @param smnAlarmRequest
     * @return
     */
    @Override
    public Boolean cpuAlarm(SmnLackOfSpaceWarningParam smnAlarmRequest) {
        // 根据华为云ID查询系统映射的设备
        PcpDevice pcpDevice = pcpDeviceService.selectByPhoneIdAndServerId(smnAlarmRequest.getCphPhoneId(), smnAlarmRequest.getCphServerId());
        if (pcpDevice == null) {
            log.error("SMN 告警：当前设备不存在当前环境：{}", smnAlarmRequest);
            return Boolean.FALSE;
        }
        String deviceId = pcpDevice.getDeviceId();
        // 查询告警手机
        MemberDeviceVo memberDevice = memberDeviceService.getMemberDeviceByDeviceId(deviceId);
        if (memberDevice == null) {
            log.error("SMN 告警：当前设备不存在当前环境上绑定商户：{}", smnAlarmRequest);
            return Boolean.FALSE;
        }
        String memberPhone = memberDevice.getMobile();
        // 如后台开启了cpu告警预值重启开关，并且云机是在非串流状态下则对某路云机执行重启
        Integer alarmType = CloudMachineAlarmRuleTemplateTypeEnum.CPU_GRAPHICS_MEMORY_REACHES_THRESHOLD_ALARM.getValue();
        if ((StringUtils.isNoneBlank(smnDeviceProperties.getSwitchActive()))) {
            if (!smnDeviceProperties.getDeviceList().contains(deviceId)) {
                log.info("SMN 告警：告警类型:[{}] 商户:{} 非nacos配置的测试云机 不做消息处理{}", alarmType, memberPhone, smnAlarmRequest);
                return Boolean.FALSE;
            }
        }
        McCloudMachineAlarmRuleTemplate template = queryRuleByType(alarmType, memberPhone);
        if (Objects.isNull(template)) {
            log.info("SMN 告警：告警类型:CPU告警[{}] 商户:{} 未配置模板{}", alarmType, memberPhone, smnAlarmRequest);
            return Boolean.FALSE;
        }
        if (Boolean.FALSE.equals(template.getIsRestart())) {
            log.info("SMN 告警：告警类型:CPU告警[{}] 商户:{} 未开启CPU不足告警 {}", alarmType, memberPhone, template);
            return Boolean.FALSE;
        }
        // 分布式锁、避免 如果单路云机 同时多个告警阈值触发并发时 控制不住【当天重试次数和间隔时长】规则
        return redissonLock.currentFairLock(SMN_NOTICE_DEVICE_LOCK_KEY + deviceId, 5000, 5000, () -> {

            // 设备再[非]串流状态下才操作 SqKeyValuePair<是否非串流, 如果挂机状态下房间记录不为空>
            SqKeyValuePair<Boolean, DevRoomPlayer> keyValuePair = roomService.selectNoStreamingByDeviceId(deviceId);
            // 是否非串流 true表示非串流
            Boolean isNoStreamingFlag = keyValuePair.getKey();
            DevRoomPlayer devRoomPlayer = keyValuePair.getValue();
            if (Boolean.TRUE.equals(isNoStreamingFlag)) {

                // 单路2个类型告警重启时间间隔太短（5分钟内），则抛弃该重启行为也不回调给商户
                Object result = redisService.get(getSmnNoticeIntervalTimeKey(deviceId));
                if (Objects.nonNull(result)) {
                    log.info("SMN 重启时间间隔：告警类型:CPU告警[{}] 云机:[{}] 本次重启间隔上次未到[{}]秒 则抛弃该重启行为也不回调给商户", alarmType, deviceId, restartIntervalTime);
                    return Boolean.FALSE;
                }

                // 单路当天告警重启次数超出3次（可配置）后则飞书通知运维介入，后续不再执行重启操作不回调给商户
                Long total = redisService.get(getSmnNoticeCurrentDayRestartedCountKey(deviceId), Long.class);
                if (Objects.nonNull(total)) {
                    if (total > template.getMaximum()) {
                        log.info("SMN 当天告警重启次数超出{}次：告警类型:[{}] 云机:[{}] 则飞书通知运维介入，后续不再执行重启操作不回调给商户:{}", template.getMaximum(), alarmType, deviceId, memberPhone);
                        notifyServerUtils.sendSmnFlyBookAlarmV2(
                                devRoomPlayer, pcpDevice.getDeviceId(), memberPhone, template.getTitle(),
                                smnAlarmRequest.getCurrentData(), MemberNotificationEnum.CPU_GRAPHICS_MEMORY_REACHES_THRESHOLD_ALARM.info(), template.getIsRestart(),
                                "CPU告警",template.getMaximum());
                        return Boolean.FALSE;
                    }
                }
                // 通知租户
                memberNotificationService.smnAlarm(devRoomPlayer, MemberNotificationEnum.CPU_GRAPHICS_MEMORY_REACHES_THRESHOLD_ALARM, (req) -> {
                    req.setAlarmThreshold(smnAlarmRequest.getCurrentData());
                    req.setRestartType("CPU告警");
                });
                log.info("发送 kafka 通知商户 CPU告警 memberPhone：{}", memberPhone);

                // 是否触发重启
                Boolean restartResult = triggerRestart(pcpDevice, template);
                if (restartResult) {
                    saveLastReboot(pcpDevice.getDeviceId(), LastRebootTypeEnum.CPU_ALARM_RESTART.getValue(), RebootOptRoleEnum.YunJi.getValue(), memberDevice.getFkMemberId());
                    // 单路2个类型告警重启时间间隔太短（5分钟内），则抛弃该重启行为也不回调给商户
                    redisService.set(getSmnNoticeIntervalTimeKey(pcpDevice.getDeviceId()), 1, restartIntervalTime, TimeUnit.SECONDS);
                    redisService.incr(getSmnNoticeCurrentDayRestartedCountKey(pcpDevice.getDeviceId()), 1L);
                }
            }
            return Boolean.TRUE;
        });
    }


    /**
     * 运行内存告警
     *
     * @param smnAlarmRequest
     * @return
     */
    @Override
    public Boolean runMemoryAlarm(SmnLackOfSpaceWarningParam smnAlarmRequest) {
        // 根据华为云ID查询系统映射的设备
        PcpDevice pcpDevice = pcpDeviceService.selectByPhoneIdAndServerId(smnAlarmRequest.getCphPhoneId(), smnAlarmRequest.getCphServerId());
        if (pcpDevice == null) {
            log.error("SMN 告警：当前设备不存在当前环境：{}", smnAlarmRequest);
            return Boolean.FALSE;
        }
        String deviceId = pcpDevice.getDeviceId();
        // 查询告警手机
        MemberDeviceVo memberDevice = memberDeviceService.getMemberDeviceByDeviceId(deviceId);
        if (memberDevice == null) {
            log.error("SMN 告警：当前设备不存在当前环境上绑定商户：{}", smnAlarmRequest);
            return Boolean.FALSE;
        }
        String memberPhone = memberDevice.getMobile();
        // 如后台开启了cpu告警预值重启开关，并且云机是在非串流状态下则对某路云机执行重启
        Integer alarmType = CloudMachineAlarmRuleTemplateTypeEnum.RUN_MEMORY_REACHES_THRESHOLD_ALARM.getValue();
        if ((StringUtils.isNoneBlank(smnDeviceProperties.getSwitchActive()))) {
            if (!smnDeviceProperties.getDeviceList().contains(deviceId)) {
                log.info("SMN 告警：告警类型:[{}] 商户:{} 非nacos配置的测试云机 不做消息处理{}", alarmType, memberPhone, smnAlarmRequest);
                return Boolean.FALSE;
            }
        }
        McCloudMachineAlarmRuleTemplate template = queryRuleByType(alarmType, memberPhone);
        if (Objects.isNull(template)) {
            log.info("SMN 告警：告警类型:运行内存告警[{}] 商户:{} 未配置模板{}", alarmType, memberPhone, smnAlarmRequest);
            return Boolean.FALSE;
        }
        if (Boolean.FALSE.equals(template.getIsRestart())) {
            log.info("SMN 告警：告警类型:运行内存[{}] 商户:{} 未开启运行内存不足告警 {}", alarmType, memberPhone, template);
            return Boolean.FALSE;
        }
        // 分布式锁、避免 如果单路云机 同时多个告警阈值触发并发时 控制不住【当天重试次数和间隔时长】规则
        return redissonLock.currentFairLock(SMN_NOTICE_DEVICE_LOCK_KEY + deviceId, 5000, 5000, () -> {

            // 设备再[非]串流状态下才操作 SqKeyValuePair<是否非串流, 如果挂机状态下房间记录不为空>
            SqKeyValuePair<Boolean, DevRoomPlayer> keyValuePair = roomService.selectNoStreamingByDeviceId(deviceId);
            // 是否非串流 true表示非串流
            Boolean isNoStreamingFlag = keyValuePair.getKey();
            DevRoomPlayer devRoomPlayer = keyValuePair.getValue();
            if (Boolean.TRUE.equals(isNoStreamingFlag)) {
                // 单路2个类型告警重启时间间隔太短（5分钟内），则抛弃该重启行为也不回调给商户
                Object result = redisService.get(getSmnNoticeIntervalTimeKey(deviceId));
                if (Objects.nonNull(result)) {
                    log.info("SMN 重启时间间隔：告警类型:运行内存[{}] 云机:[{}] 本次重启间隔上次未到[{}]秒 则抛弃该重启行为也不回调给商户", alarmType, deviceId, restartIntervalTime);
                    return Boolean.FALSE;
                }

                // 单路当天告警重启次数超出3次（可配置）后则飞书通知运维介入，后续不再执行重启操作不回调给商户
                Long total = redisService.get(getSmnNoticeCurrentDayRestartedCountKey(deviceId), Long.class);
                if (Objects.nonNull(total)) {
                    if (total > template.getMaximum()) {
                        log.info("SMN 当天告警重启次数超出{}次：告警类型:[{}] 云机:[{}] 则飞书通知运维介入，后续不再执行重启操作不回调给商户:{}", template.getMaximum(), alarmType, deviceId, memberPhone);
                        notifyServerUtils.sendSmnFlyBookAlarmV2(
                                devRoomPlayer, pcpDevice.getDeviceId(), memberPhone, template.getTitle(),
                                smnAlarmRequest.getCurrentData(), MemberNotificationEnum.RUN_MEMORY_REACHES_THRESHOLD_ALARM.info(), template.getIsRestart(),
                                "运行内存告警", template.getMaximum());
                        return Boolean.FALSE;
                    }
                } else {
                    redisService.set(getSmnNoticeCurrentDayRestartedCountKey(deviceId), 0L, DateUtil.todaySurplusSecond(), TimeUnit.SECONDS);
                }
                // 通知租户
                memberNotificationService.smnAlarm(devRoomPlayer, MemberNotificationEnum.RUN_MEMORY_REACHES_THRESHOLD_ALARM, (req) -> {
                    req.setAlarmThreshold(smnAlarmRequest.getCurrentData());
                    req.setRestartType("运行内存告警");
                });
                log.info("发送 kafka 通知商户 运行内存告警 memberPhone：{}", memberPhone);

                // 是否触发重启
                Boolean restartResult = triggerRestart(pcpDevice, template);
                if (restartResult) {
                    saveLastReboot(pcpDevice.getDeviceId(), LastRebootTypeEnum.RUN_MEMORY_ALARM_RESTART.getValue(), RebootOptRoleEnum.YunJi.getValue(), memberDevice.getFkMemberId());
                    // 单路2个类型告警重启时间间隔太短（5分钟内），则抛弃该重启行为也不回调给商户
                    redisService.set(getSmnNoticeIntervalTimeKey(pcpDevice.getDeviceId()), 1, restartIntervalTime, TimeUnit.SECONDS);
                    redisService.incr(getSmnNoticeCurrentDayRestartedCountKey(pcpDevice.getDeviceId()), 1L);
                }
            }
            return Boolean.TRUE;
        });
    }

    @NotNull
    private static String getSmnNoticeCurrentDayRestartedCountKey(String deviceId) {
        return SMN_NOTICE_CURRENT_DAY_RESTARTED_COUNT_KEY + deviceId;
    }

    @NotNull
    private static String getSmnNoticeIntervalTimeKey(String deviceId) {
        return SMN_NOTICE_INTERVAL_TIME_KEY + deviceId;
    }


    /**
     * 1、根据手机号查询商户规则配置、如果没有就查询默认配置
     * 2、并且是否重启开关是否有开启
     *
     * @param type
     * @param memberPhone
     * @return
     */
    private McCloudMachineAlarmRuleTemplate queryRuleByType(Integer type, String memberPhone) {
        McCloudMachineAlarmRuleTemplate template = cloudMachineAlarmRuleTemplateService.getRuleByType(type, memberPhone);
        if (Objects.isNull(template)) {
            // 读取默认模板
            template = cloudMachineAlarmRuleTemplateService.getRuleByType(type, "default");
        }
        log.info("查询的商户告警通知模板 告警类型:{} 查询结果: {} 配置规则模板：{}", type, memberPhone, template);
        return template;
    }

    /**
     * 是否触发重启
     * @param pcpDevice         设备
     * @param ruleByAlarmValue  模板
     */
    private void enableRestart(PcpDevice pcpDevice, McCloudMachineAlarmRuleTemplate ruleByAlarmValue) {
        if(ruleByAlarmValue.getIsRestart() && Objects.nonNull(ruleByAlarmValue.getRestartDelaySeconds())) {
            Timer timer = new Timer();
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    log.info("执行重启 phoneId：{}，deviceId：{}", pcpDevice.getPhoneId(), pcpDevice.getDeviceId());
                    machineService.restartDeviceByDeviceId(pcpDevice.getDeviceId());
                }
            };
            // 延迟 ruleByAlarmValue.getRestartDelaySeconds() 后重启
            timer.schedule(timerTask, ruleByAlarmValue.getRestartDelaySeconds() * 1000);
        }
    }

    /**
     * 构建请求参数
     *
     * @param title   标题
     * @param message 消息
     * @return commandMap
     */
    private LinkedHashMap<String, Object> buildCommand(String title, String message) {
        // 构建的列表参数
        LinkedHashMap<String, Object> commandMap = new LinkedHashMap<>(6);
        // 参数设置
        commandMap.put("command", "popupNotification");
        commandMap.put("title", title);
        commandMap.put("message", message);
        commandMap.put("todo", "");
        return commandMap;
    }

    /**
     * 是否触发重启
     *
     * @param pcpDevice        设备
     * @param ruleByAlarmValue 模板
     */
    private Boolean triggerRestart(PcpDevice pcpDevice, McCloudMachineAlarmRuleTemplate ruleByAlarmValue) {
        if (ruleByAlarmValue.getIsRestart()) {
            log.info("triggerRestart 执行重启 phoneId：{}，deviceId：{}", pcpDevice.getPhoneId(), pcpDevice.getDeviceId());
            return machineService.restartDeviceByDeviceId(pcpDevice.getDeviceId());
        }
        return false;
    }


    public void saveLastReboot(String deviceId, int lastRebootType, int optRoleType, Long fkMemberId) {
        EmSocDeviceCmdRebootLastRecord old = iEmSocDeviceCmdRebootLastRecordService.selectOne(e -> e.deviceIdEq(deviceId));
        Date date = SystemClock.date();
        if (old != null) {
            EmSocDeviceCmdRebootLastRecord up = new EmSocDeviceCmdRebootLastRecord();
            up.setId(old.getId());
            up.setLastCmdReboot(date);
            up.setType(lastRebootType);
            up.setOptRole(optRoleType);
            iEmSocDeviceCmdRebootLastRecordService.updateById(up);
            up.setDeviceId(deviceId);// 初始化设备id
            saveRebootRecord(up, fkMemberId);
            return;
        }
        EmSocDevices emSocDevices = emSocDevicesService.selectOne(e -> e.deviceIdEq(deviceId));
        if (emSocDevices == null) {
            log.warn("设备：{}，设备记录：{}", deviceId, emSocDevices);
            return;
        }
        EmSocDeviceCmdRebootLastRecord insert = new EmSocDeviceCmdRebootLastRecord();
        insert.setId(emSocDevices.getId());
        insert.setDeviceId(deviceId);
        insert.setLastCmdReboot(date);
        insert.setCreateTime(date);
        insert.setType(lastRebootType);
        insert.setOptRole(optRoleType);
        iEmSocDeviceCmdRebootLastRecordService.save(insert);
        saveRebootRecord(insert, fkMemberId);
    }

    public void saveRebootRecord(EmSocDeviceCmdRebootLastRecord lastRecord, Long fkMemberId) {
        EmSocDeviceCmdRebootRecord i = new EmSocDeviceCmdRebootRecord();
        String deviceId = lastRecord.getDeviceId();
        i.setDeviceId(deviceId);
        i.setCreateTime(lastRecord.getLastCmdReboot());
        i.setFkMemberId(fkMemberId);
        i.setOptRole(lastRecord.getOptRole());
        i.setType(lastRecord.getType());
        emSocDeviceCmdRebootRecordService.save(i);
    }
}
