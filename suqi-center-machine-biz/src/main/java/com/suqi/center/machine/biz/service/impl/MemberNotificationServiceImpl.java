package com.suqi.center.machine.biz.service.impl;

import cn.hutool.json.JSONUtil;
import com.suqi.center.common.constant.MqTopicConstants;
import com.suqi.center.common.enums.MemberNotificationEnum;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.biz.dto.NotificationBaseVo;
import com.suqi.center.machine.biz.dto.SmnLackOfSpaceWarningNotice;
import com.suqi.center.machine.biz.service.MemberNotificationService;
import com.suqi.center.machine.dao.entity.DevRoomPlayer;
import com.suqi.core.kafka.KafkaService;
import com.suqi.core.kafka.dto.KafkaResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * 发送回调给商户
 * @version 1.0
 * @date 2023/4/20 17:31
 */
@Service
@Slf4j
public class MemberNotificationServiceImpl implements MemberNotificationService {

    @Resource
    KafkaService kafkaService;

    @Override
    public Boolean smnLackOfSpaceWarning(DevRoomPlayer devRoomPlayer) {
        // 拼接请求参数
        NotificationBaseVo<SmnLackOfSpaceWarningNotice> notificationBaseVo = new NotificationBaseVo();
        notificationBaseVo.setFkMemberId(devRoomPlayer.getFkMemberId());
        notificationBaseVo.setType(MemberNotificationEnum.INSUFFICIENT_CLOUD_MACHINE_SPACE_ALARM.value());
        SmnLackOfSpaceWarningNotice d = new SmnLackOfSpaceWarningNotice();
        d.setEvent_time(SystemClock.now());
        d.setPhoneId(devRoomPlayer.getPhoneId());
        notificationBaseVo.setData(d);
        log.info("SMN 云机空间不足告警：{}",notificationBaseVo);
        // 发送通知消息
        KafkaResult kafkaResult = kafkaService.sendKafkaMessage(MqTopicConstants.TO_MEMBER_NOTIFICATION, JSONUtil.toJsonStr(notificationBaseVo));
        if (kafkaResult.isFail()) {
            log.error("kafka消息失败{}，结果：{}", notificationBaseVo, kafkaResult);
            return false;
        }
        log.info("发送结果：{}", kafkaResult);
        return true;
    }


    /**
     * @param devRoomPlayer
     * @param memberNotificationEnum
     * @param consumer
     */
    @Override
    public void smnAlarm(DevRoomPlayer devRoomPlayer, MemberNotificationEnum memberNotificationEnum, Consumer<SmnLackOfSpaceWarningNotice> consumer) {
        // 拼接请求参数
        NotificationBaseVo<SmnLackOfSpaceWarningNotice> notificationBase = new NotificationBaseVo<>();
        notificationBase.setFkMemberId(Optional.ofNullable(devRoomPlayer).map(DevRoomPlayer::getFkMemberId).orElse(null));
        notificationBase.setType(memberNotificationEnum.value());
        SmnLackOfSpaceWarningNotice notice = new SmnLackOfSpaceWarningNotice();
        notice.setEvent_time(SystemClock.now());
        notice.setPhoneId(Optional.ofNullable(devRoomPlayer).map(DevRoomPlayer::getPhoneId).orElse(null));
        notice.setEvent_type(memberNotificationEnum.info());
        notificationBase.setData(notice);
        if(Objects.nonNull(consumer)){
            consumer.accept(notice);
        }
        log.info("SMN 告警：{}", notificationBase);
        // 发送通知消息
        KafkaResult kafkaResult = kafkaService.sendKafkaMessage(MqTopicConstants.TO_MEMBER_NOTIFICATION, JSONUtil.toJsonStr(notificationBase));
        if (kafkaResult.isFail()) {
            log.error("kafka消息失败{}，结果：{}", notificationBase, kafkaResult);
        }
        log.info("发送结果：{}", kafkaResult);
    }

    @Override
    public void smnAlarm(DevRoomPlayer devRoomPlayer, MemberNotificationEnum memberNotificationEnum) {
        this.smnAlarm(devRoomPlayer,memberNotificationEnum, null);
    }
}
