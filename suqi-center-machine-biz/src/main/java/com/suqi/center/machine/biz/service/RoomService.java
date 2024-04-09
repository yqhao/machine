package com.suqi.center.machine.biz.service;

import com.suqi.center.common.utils.SqKeyValuePair;
import com.suqi.center.machine.dao.entity.DevRoomPlayer;

/**
 * 房间处理相关接口
 * @version 1.0
 * @date 2023/4/20 17:38
 */
public interface RoomService {

    /**
     * 根据设备ID获取当前使用的房间
     * @param deviceId
     * @return
     */
    DevRoomPlayer getRoomByDeviceId(String deviceId);

    /**
     * 根据userPhoneId获取房间信息
     * @param userPhoneId
     * @return
     */
    DevRoomPlayer getRoomByUserPhoneId(String userPhoneId);


    /**
     * 查询非串流并且是挂机状态下的设备信息
     * SqKeyValuePair<Boolean=是否非串流中true是 false=否,DevRoomPlayer房间信息 可能为空>
     */
    SqKeyValuePair<Boolean,DevRoomPlayer> selectNoStreamingByDeviceId(String deviceId);
}
