package com.suqi.center.machine.biz.service.impl;

import cn.hutool.core.util.StrUtil;
import com.suqi.center.machine.api.dto.request.SmnLackOfSpaceWarningParam;
import com.suqi.center.machine.biz.enums.CloudMachineAlarmRuleTemplateTypeEnum;
import com.suqi.center.machine.biz.service.CloudMachineAlarmRuleTemplateService;
import com.suqi.center.machine.biz.service.MemberNotificationService;
import com.suqi.center.machine.biz.service.RoomService;
import com.suqi.center.machine.biz.service.SmnLackOfSpaceWarningService;
import com.suqi.center.machine.biz.utils.notify.NotifyServerUtils;
import com.suqi.center.machine.dao.entity.DevRoomPlayer;
import com.suqi.center.machine.dao.entity.McCloudMachineAlarmRuleTemplate;
import com.suqi.center.machine.dao.entity.PcpDevice;
import com.suqi.center.machine.dao.service.IMemberDeviceService;
import com.suqi.center.machine.dao.service.IPcpDeviceService;
import com.suqi.core.kafka.BoxOtaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * SMN 云机空间不足告警实现层
 * @version 1.0
 * @date 2023/4/20 15:38
 */
@Service
@Slf4j
public class SmnLackOfSpaceWarningServiceImpl implements SmnLackOfSpaceWarningService {

    @Value("${alarm.enable.spaceWarning:true}")
    private Boolean enableSpaceWarning;

    @Resource
    IPcpDeviceService iPcpDeviceService;

    @Resource
    CloudMachineAlarmRuleTemplateService cloudMachineAlarmRuleTemplateService;

    @Resource
    BoxOtaService boxOtaService;

    @Resource
    MemberNotificationService memberNotificationService;

    @Resource
    RoomService roomService;

    @Resource
    NotifyServerUtils notifyServerUtils;

    @Resource
    IMemberDeviceService iMemberDeviceService;

    @Override
    public Boolean smnLackOfSpaceWarning(SmnLackOfSpaceWarningParam param) {

        // 未开启
        if(!enableSpaceWarning) {
            log.error("未开启 SMN 云机空间不足告警：{}", enableSpaceWarning);
            return Boolean.FALSE;
        }

        PcpDevice pcpDevice = iPcpDeviceService.checkMachineExistEnv(param.getCphPhoneId(), param.getCphServerId());
        if(pcpDevice == null){
            log.info("SMN 云机空间不足告警：当前设备不存在当前环境：{}",param);
            return false;
        }
        String memberPhone = iMemberDeviceService.getMemberNameByDeviceId(pcpDevice.getDeviceId());
        DevRoomPlayer devRoomPlayer = roomService.getRoomByDeviceId(pcpDevice.getDeviceId());
        if(devRoomPlayer != null) {
            McCloudMachineAlarmRuleTemplate ruleByAlarmValue = cloudMachineAlarmRuleTemplateService.getRuleByAlarmValue(param.getCurrentData(), CloudMachineAlarmRuleTemplateTypeEnum.INSUFFICIENT_CLOUD_MACHINE_SPACE_ALARM.getValue());
            if (ruleByAlarmValue == null) {
                log.info("SMN 云机空间不足告警：未存在匹配的告警规则：{}", param);
                return false;
            }
            Boolean isSendMaster = false;
            List<LinkedHashMap<String, Object>> commands = new ArrayList<>();
            LinkedHashMap<String, Object> command = new LinkedHashMap<>();
            command.put("command", "popupNotification");
            if (ruleByAlarmValue.getIsNoticeUser()) {
                if (StrUtil.isNotBlank(ruleByAlarmValue.getMessageTemplate())) {
                    command.put("title", ruleByAlarmValue.getTitle());
                    command.put("message", ruleByAlarmValue.getMessageTemplate());
                    isSendMaster = true;
                }
            }
            if (StrUtil.isNotBlank(ruleByAlarmValue.getCommandTemplate())) {
                command.put("todo", ruleByAlarmValue.getCommandTemplate());
                isSendMaster = true;
            }
            if (isSendMaster) {
                commands.add(command);
                boxOtaService.sendMasterMessages(pcpDevice.getDeviceId(), commands);
            }
            if (ruleByAlarmValue.getIsNoticeTenant()) {
                memberNotificationService.smnLackOfSpaceWarning(devRoomPlayer);
            }
            if(ruleByAlarmValue.getIsNoticeFeishu()){
                notifyServerUtils.sendSmnLackOfSpaceWarningFeiShuNotify(devRoomPlayer, pcpDevice.getDeviceId(),param.getCurrentData(), memberPhone);
            }
        }else{
            // 发送飞书消息
            notifyServerUtils.sendSmnLackOfSpaceWarningFeiShuNotify(devRoomPlayer, pcpDevice.getDeviceId(),param.getCurrentData(), memberPhone);
        }
        return true;
    }
}
