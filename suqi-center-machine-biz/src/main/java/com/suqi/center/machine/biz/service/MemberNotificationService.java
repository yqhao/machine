package com.suqi.center.machine.biz.service;

import com.suqi.center.common.enums.MemberNotificationEnum;
import com.suqi.center.machine.biz.dto.SmnLackOfSpaceWarningNotice;
import com.suqi.center.machine.dao.entity.DevRoomPlayer;

import java.util.function.Consumer;

/**
 * 发送回调给商户
 * @author zxx
 * @version 1.0
 * @date 2021/7/2 15:07
 */
public interface MemberNotificationService {

    Boolean smnLackOfSpaceWarning(DevRoomPlayer devRoomPlayer);


    /**
     * smn 告警发送给商户
     * @param devRoomPlayer 房间
     * @param memberNotificationEnum 通知租户类型
     * @return  是否成功
     */
    void smnAlarm(DevRoomPlayer devRoomPlayer, MemberNotificationEnum memberNotificationEnum);

    void smnAlarm(DevRoomPlayer devRoomPlayer, MemberNotificationEnum memberNotificationEnum, Consumer<SmnLackOfSpaceWarningNotice> consumer);
}
