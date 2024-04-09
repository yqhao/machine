package com.suqi.center.machine.biz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.common.enums.MessageType;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.utils.JsonUtil;
import com.suqi.center.machine.biz.dto.BaseCloudResetParam;
import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.MoveDeviceService;
import com.suqi.center.machine.biz.service.OverrideCacheService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.center.machine.dao.entity.PcpDevice;
import com.suqi.center.machine.dao.entity.YunMemberDevice;
import com.suqi.center.machine.dao.service.IDevRoomPlayerService;
import com.suqi.center.machine.dao.service.IPcpDeviceService;
import com.suqi.center.machine.dao.service.ISysOtaRecordService;
import com.suqi.center.machine.dao.service.IYunMemberDeviceService;
import com.suqi.center.machine.dao.service.impl.EmSocDevicesServiceImpl;
import com.suqi.core.kafka.BoxOtaService;
import com.suqi.core.kafka.KafkaService;
import com.suqi.core.kafka.dto.BoxStreamMessage;
import com.suqi.core.kafka.dto.KafkaResult;
import com.suqi.core.kafka.dto.ToBox;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;

@Service
public class MoveDeviceServiceImpl implements MoveDeviceService {
    protected static Logger log = LoggerFactory.getLogger(MoveDeviceServiceImpl.class);

    public static final String CLOUD_PHONE_RESET_TOPIC = "cloud.phone.move.reset.topic";

    @Autowired
    EmSocDevicesServiceImpl emSocDevicesService;


    @Autowired
    IYunMemberDeviceService iYunMemberDeviceService;

    @Autowired
    McMoveDeviceCurdServiceImpl mcMoveDeviceCurdService;

    @Autowired
    IPcpDeviceService pcpDeviceService;

    @Autowired
    OverrideCacheService overrideCacheService;

    @Autowired
    KafkaService kafkaService;

    @Autowired
    IDevRoomPlayerService iDevRoomPlayerService;

    @Autowired
    BoxOtaService boxOtaService;

    @Value("${stopStreamingMessage:退出云机，开始进行换机}")
    String stopStreamingMessage="退出云机，开始进行换机";

    @Autowired
    ISysOtaRecordService iSysOtaRecordService;

//    @Autowired
//    RedisTemplate redisTemplate;
//
//    @Autowired
//    MoveStatusService moveStatusService;
//
//    @Autowired
//    MoveQueryServiceImpl moveQueryService;


    @Override
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean lockIdleDevice(String deviceId, McMoveDevice mcMoveDevice) {
        log.info("锁定设备：{},源设备：{}",deviceId,mcMoveDevice.getFromDeviceId());
        EmSocDevices socDevices = getEmSocDevices(deviceId);

        long fkMemberId = mcMoveDevice.getFkMemberId();
        //新设备进入维护模式，排队模式，标记为已分配
        YunMemberDevice yunMemberDevice = iYunMemberDeviceService.selectOne(e -> e.fkMemberIdEq(fkMemberId).deviceIdEq(deviceId).statusEq(50));
        if (yunMemberDevice == null) {
            log.info("锁定换机设备失败，商户：{}，用户设备{},状态不可用,设备信息：{}", fkMemberId, deviceId, yunMemberDevice);
            return false;
        }

        boolean ylocked = iYunMemberDeviceService.update(yunMemberDevice.updateWrapper().setAllotStatus(1).setServiceBizType(1).idEq().allotStatusEq().serviceBizTypeEq());
        if (!ylocked) {
            log.info("锁定换机设备失败，商户：{}，用户设备{},状态已变更,设备信息：{}", fkMemberId, deviceId, yunMemberDevice);
            return false;
        }

        if (socDevices == null || socDevices.getHealthStatus() == 0 || socDevices.getIsReseting() != null && socDevices.getIsReseting() != 0) {
            log.info("锁定换机设备失败，商户：{}，设备{},状态不可用,设备信息：{}", fkMemberId, deviceId, socDevices);
            //抛出异常回滚iYunMemberDeviceService修改
            throw new BizException(deviceId + "设备锁定失败，状态不可用");
        }
        boolean dlocked = emSocDevicesService.update(socDevices.updateWrapper().setMaintStatus(1).setRunningStatus(1).setStreamingStatus(10).setLastUpdateTime(new Date()).idEq());
        if (!dlocked) {
            log.info("锁定换机设备失败，商户：{}，设备{},状态已变更,设备信息：{}", fkMemberId, deviceId, socDevices);
            //抛出异常回滚iYunMemberDeviceService修改
            throw new BizException(deviceId + "设备锁定失败，状态已变更");
        }
        PcpDevice pcpDevice = pcpDeviceService.selectOne(e -> e.selectColumns(c -> c.phoneId()).deviceIdEq(deviceId));
//        if (pcpDevice == null) {
//            log.info("锁定换机设备失败，商户：{}，设备{},pcpDevice：{}", fkMemberId, deviceId, pcpDevice);
//            //抛出异常回滚iYunMemberDeviceService修改
//            throw new BizException(deviceId + "设备锁定失败，华为云机信息不存在");
//        }
        //修改移机记录状态为锁定设备成功，并更新新锁定的设备id和phoneId信息
        boolean update = mcMoveDeviceCurdService.update(mcMoveDevice.updateWrapper().setStatus(MoveStateEnum.step_2_fetch_idle_device_succeed.value()).setToDeviceId(deviceId).setToPhoneId(pcpDevice==null?null:pcpDevice.getPhoneId()).setLastUpdateTime(new Date()).idEq());
        if (!update) {
            log.info("锁定失败换机记录更新失败，商户：{}，移机记录{},update：{}", fkMemberId, mcMoveDevice, update);
            //抛出异常回滚iYunMemberDeviceService修改
            throw new BizException(deviceId + "锁定失败换机记录更新失败，更新换机记录新设备记录失败");
        }
        return true;
    }

    @Override
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean rollBackMoveDeviceStatus(McMoveDevice mcMoveDevice) {
        long fkMemberId = mcMoveDevice.getFkMemberId();
        String toDeviceId = mcMoveDevice.getToDeviceId();
        //取消新设备进入维护模式，排队模式，标记为已分配
        YunMemberDevice yunMemberDevice = iYunMemberDeviceService.selectOne(e -> e.fkMemberIdEq(fkMemberId).deviceIdEq(toDeviceId).statusEq(50));
        iYunMemberDeviceService.update(yunMemberDevice.updateWrapper().setAllotStatus(0).setServiceBizType(0).idEq().allotStatusEq().serviceBizTypeEq());

        EmSocDevices socDevices = getEmSocDevices(toDeviceId);
        emSocDevicesService.update(socDevices.updateWrapper().setMaintStatus(0).setRunningStatus(0).setStreamingStatus(0).setLastUpdateTime(new Date()).idEq());
        rollBackMoveOldDeviceStatus(mcMoveDevice);

        return true;
    }


    @Override
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean updateFromDevicePreState(McMoveDevice mcMoveDevice) {
        String deviceId = mcMoveDevice.getFromDeviceId();
        long fkMemberId = mcMoveDevice.getFkMemberId();

        YunMemberDevice yunMemberDevice = iYunMemberDeviceService.selectOne(e -> e.fkMemberIdEq(fkMemberId).deviceIdEq(deviceId).statusEq(50));
        if (yunMemberDevice == null ) {
            log.info("旧设备获取失败，商户：{}，用户设备{},状态不可用,设备信息：{}", fkMemberId, deviceId, yunMemberDevice);
            return false;
        }

        boolean ylocked = iYunMemberDeviceService.update(yunMemberDevice.updateWrapper().setServiceBizType(1).idEq());
        if (!ylocked) {
            log.info("旧设备获取失败，商户：{}，用户设备{},状态已变更,设备信息：{}", fkMemberId, deviceId, yunMemberDevice);
            return false;
        }

        //旧设备进入维护模式
        EmSocDevices socDevices = getEmSocDevices(deviceId);
        if (socDevices == null) {
            log.info("旧设备获取失败，商户：{}，设备{},状态不可用,设备信息：{}", fkMemberId, deviceId, socDevices);
            //抛出异常回滚iYunMemberDeviceService修改
            throw new BizException(deviceId + "旧设备获取失败，状态不可用");
        }
        //旧设备进入维护模式
        emSocDevicesService.update(socDevices.updateWrapper().setMaintStatus(1).setRunningStatus(0).setStreamingStatus(0).setLastUpdateTime(new Date()).idEq());

        mcMoveDeviceCurdService.update(mcMoveDevice.updateWrapper().setStatus(MoveStateEnum.step_4_old_device_before_status_succeed.value()).setLastUpdateTime(new Date()).idEq());
        return true;
    }

    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean setMaint(String deviceId){
        EmSocDevices socDevices = getEmSocDevices(deviceId);
        if (socDevices == null) {
            log.info("设备获取失败，商户：{}，设备{},状态不可用,设备信息：{}", deviceId, socDevices);
            //抛出异常回滚iYunMemberDeviceService修改
            throw new BizException(deviceId + "设备获取失败，状态不可用");
        }
        //设备进入维护模式
        emSocDevicesService.update(socDevices.updateWrapper().setMaintStatus(1).setLastUpdateTime(new Date()).idEq());
        return true;
    }

    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean exitMaint(String deviceId){
        EmSocDevices socDevices = getEmSocDevices(deviceId);
        if (socDevices == null) {
            log.info("设备获取失败，商户：{}，设备{},状态不可用,设备信息：{}", deviceId, socDevices);
            //抛出异常回滚iYunMemberDeviceService修改
            throw new BizException(deviceId + "设备获取失败，状态不可用");
        }
        //设备退出维护模式
        log.info("设备退出维护模式: {}",deviceId);
        emSocDevicesService.update(socDevices.updateWrapper().setMaintStatus(0).setLastUpdateTime(new Date()).idEq());
        return true;
    }

    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public EmSocDevices getEmSocDevices(String deviceId) {
        EmSocDevices socDevices = emSocDevicesService.selectOne(e -> e.deviceIdEq(deviceId));
        return socDevices;
    }

    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean exitQueueBizMode(String deviceId) {
        YunMemberDevice yunMemberDevice = iYunMemberDeviceService.selectOne(e -> e.deviceIdEq(deviceId).statusEq(50));
        if(yunMemberDevice.getServiceBizType()!=0) {
            YunMemberDevice yunMemberDeviceUp = new YunMemberDevice();
            if (yunMemberDevice != null) {
                yunMemberDeviceUp.setId(yunMemberDevice.getId());
            }
            yunMemberDeviceUp.setServiceBizType(0);
            iYunMemberDeviceService.updateById(yunMemberDeviceUp);
            exitMaint(deviceId);
        }
        return true;
    }

    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean toDeviceExitMaintQueue(McMoveDevice mcMoveDevice) {
        try {
            String deviceId = mcMoveDevice.getToDeviceId();
            long fkMemberId = mcMoveDevice.getFkMemberId();
            YunMemberDevice yunMemberDevice = iYunMemberDeviceService.selectOne(e -> e.fkMemberIdEq(fkMemberId).deviceIdEq(deviceId).statusEq(50));
            iYunMemberDeviceService.update(yunMemberDevice.updateWrapper().setServiceBizType(0).idEq().serviceBizTypeEq());
            EmSocDevices socDevices = getEmSocDevices(deviceId);
            emSocDevicesService.update(socDevices.updateWrapper().setMaintStatus(0).setRunningStatus(1).setStreamingStatus(0).setLastUpdateTime(new Date()).idEq());
            mcMoveDeviceCurdService.update(mcMoveDevice.updateWrapper().setStatus(MoveStateEnum.step_18_new_device_reboot_succeed.value()).setLastUpdateTime(new Date()).idEq());
            overrideCacheService.addPhoneId(mcMoveDevice.getUserPhoneId());
        } catch (RuntimeException e) {
            overrideCacheService.removePhoneId(mcMoveDevice.getUserPhoneId());
            throw new RuntimeException(e);
        }
        return true;
    }

    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    @Override
    public boolean checkResetOldDeviceStatus(McMoveDevice mcMoveDevice) {
        String fromDeviceId = mcMoveDevice.getFromDeviceId();
        EmSocDevices socDevices = getEmSocDevices(fromDeviceId);
        Integer maintStatus = socDevices.getMaintStatus();
        Integer isReseting = socDevices.getIsReseting();
        Integer healthStatus = socDevices.getHealthStatus();

        toDeviceExitMaintStatus(mcMoveDevice);
        long hasOk = iSysOtaRecordService.count(q -> q.deviceIdEq(fromDeviceId).createTimeGt(mcMoveDevice.getCreateTime()).statusEq(50));
        long count = iSysOtaRecordService.count(q -> q.deviceIdEq(fromDeviceId).statusBetween(0, 30));
        log.info("移机最后状态检测{},maintStatus:{},isReseting:{} , ota count:{} ",mcMoveDevice,maintStatus,isReseting,count);
        if (maintStatus != null && isReseting != null && healthStatus != null  && isReseting == 0 && healthStatus == 1 && count==0 && hasOk>0) {
            //旧云机取消排队模式
            log.info("移机最后清理{}",mcMoveDevice);
            Boolean release = mcMoveDevice.getReleaseUse();
            if(release!=null && release) {
                log.info("旧云机取消排队模式{}",fromDeviceId);
                exitQueueBizMode(fromDeviceId);
                log.info("旧云机取消维护模式{}",fromDeviceId);
                exitMaint(fromDeviceId);
            }else{
                //不释放，需要再次进入维护模式
                log.info("旧云机不释放，需要再次进入维护模式{}",fromDeviceId);
                setMaint(fromDeviceId);
            }
            mcMoveDeviceCurdService.update(mcMoveDevice.updateWrapper().setStatus(MoveStateEnum.step_50_complete.value()).setLastUpdateTime(new Date()).idEq());
            overrideCacheService.removePhoneIdMoveDeviceTaskRunning(mcMoveDevice.getUserPhoneId());

        }
        return false;
    }


    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean toDeviceExitMaintStatus(McMoveDevice mcMoveDevice) {
        //华为重查新云机重启未退维护问题，退出新云机维护模式状态
        String toDeviceId = mcMoveDevice.getToDeviceId();
        EmSocDevices toEmSocDevice = getEmSocDevices(toDeviceId);
        Integer toMaintStatus = toEmSocDevice.getMaintStatus();
        if(toMaintStatus!=null && toMaintStatus.equals(1)){
            //重启新云机，待上线后退出维护模式
//            Boolean absent = redisTemplate.opsForValue().setIfAbsent("lock.move.data.to.device.rerestart." + toDeviceId, true, 60, TimeUnit.SECONDS);
//            if(absent!=null && absent) {
//                PcpConfig pcpConfig = moveQueryService.getPcpConfig(toDeviceId);
//                if(pcpConfig!=null) {
//                    String countKey = "lock.move.data.to.device.rerestart.count." + toDeviceId;
//                    Long increment = redisTemplate.opsForValue().increment(countKey);
//                    if (increment != null && increment.equals(1L)) {
//                        redisTemplate.expire(countKey, 20, TimeUnit.MINUTES);
//                    }
//                    log.info("新云机重启异常：{}，重新重启", toEmSocDevice.getDeviceId());
//
//                    HuaWeiAppResult huaWeiAppResult = moveStatusService.restartToDevice(mcMoveDevice, pcpConfig);
//                    log.info("新云机重启异常：{}，重新重启任务返回：{}", toEmSocDevice.getDeviceId(), huaWeiAppResult);
//                    redisTemplate.opsForValue().increment("lock.move.data.to.device.rerestart." + toDeviceId);
//                    if (increment != null && increment >= 10L) {
//                        exitMaint(toDeviceId);
//                    }
//                }else{
                    log.info("新云机未退维护模式异常：{}，退出维护模式", toEmSocDevice.getDeviceId());
                    boolean b = exitMaint(toDeviceId);
                    log.info("新云机未退维护模式异常：{}，退出维护模式，结果：{}", toEmSocDevice.getDeviceId(),b);
//                }
//            }
        }
        return true;
    }

    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean rollBackMoveOldDeviceStatus(McMoveDevice mcMoveDevice) {
        String fromDeviceId = mcMoveDevice.getFromDeviceId();
        long fkMemberId = mcMoveDevice.getFkMemberId();

        //取消排队模式
        YunMemberDevice yunMemberDevice = iYunMemberDeviceService.selectOne(e -> e.fkMemberIdEq(fkMemberId).deviceIdEq(fromDeviceId).statusEq(50));
        iYunMemberDeviceService.update(yunMemberDevice.updateWrapper().setServiceBizType(0).idEq());

        EmSocDevices socDevices = getEmSocDevices(fromDeviceId);
        //取消旧设备进入维护模式
        emSocDevicesService.update(socDevices.updateWrapper().setMaintStatus(0).setRunningStatus(1).setLastUpdateTime(new Date()).idEq());

        mcMoveDeviceCurdService.update(mcMoveDevice.updateWrapper().setStatus(MoveStateEnum.step_4_old_device_before_status_succeed.value()).setLastUpdateTime(new Date()).idEq());
        return true;
    }

    public KafkaResult sendResetCommand(McMoveDevice mcMoveDevice, String deviceId) {
        String resetParam = JsonUtil.objectToJson(BaseCloudResetParam.builder()
                .memberId(mcMoveDevice.getFkMemberId())
                .deviceId(deviceId)
                .isMaint(true)
                .type(1)
                .userPhoneId(mcMoveDevice.getUserPhoneId())
                .build());
        log.info("重设置参数：{}",resetParam);
        KafkaResult kafkaResult = kafkaService.sendKafkaMessage(CLOUD_PHONE_RESET_TOPIC, resetParam);
        return kafkaResult;
    }

    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean rollBackMoveResetNewDeviceOldDeviceStatus(McMoveDevice mcMoveDevice) {
        KafkaResult kafkaResult = sendResetCommand(mcMoveDevice, mcMoveDevice.getToDeviceId());
        if (kafkaResult != null && kafkaResult.isSuccess()) {
            rollBackMoveOldDeviceStatus(mcMoveDevice);
            return true;
        } else {
            throw new BizException("回滚移机，发送重置新云机命令失败");
        }
    }

    @Override
    @DS(DBConstants.MASTER)
    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
    public boolean checkAndStopStream(McMoveDevice mcMoveDevice) {
        //先进入维护模式
        boolean b = setMaint(mcMoveDevice.getFromDeviceId());
        overrideCacheService.addPhoneIdMoveDeviceTaskRunning(mcMoveDevice.getUserPhoneId());
        long count = iDevRoomPlayerService.count(e -> e.phoneIdEq(mcMoveDevice.getUserPhoneId()).playerLoginStatusIn(5, 10));
        if (count > 0) {
            //stopStreaming
            BoxStreamMessage bsm = new BoxStreamMessage();
            LinkedHashMap<String, Object> cmd  =new LinkedHashMap<>();
            cmd.put("command","stopStreaming");
            cmd.put("code",10001);
            cmd.put("message",stopStreamingMessage);
            cmd.put("guajiModel",true);
            bsm.setData(Arrays.asList(cmd));
            ToBox<BoxStreamMessage> toBox = new ToBox<BoxStreamMessage>(MessageType.STREAM_PUSH_MESSAGE_TO_BOX.type(), mcMoveDevice.getFromDeviceId(), bsm);
            log.info("{}，{}云机迁移退出stream指令{}",mcMoveDevice.getUserPhoneId(),mcMoveDevice.getFromDeviceId(),toBox);
            KafkaResult boxMsg = boxOtaService.toBoxMsg(toBox);
            log.info("{}，{}云机迁移退出stream指令发送结果：{}",mcMoveDevice.getUserPhoneId(),mcMoveDevice.getFromDeviceId(),boxMsg);
            return true;
        }
        return false;
    }
}
