package com.suqi.center.machine.biz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.suqi.center.common.utils.SqKeyValuePair;
import com.suqi.center.machine.api.enums.PlayerLoginStatusEnum;
import com.suqi.center.machine.biz.service.RoomService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.DevRoomPlayer;
import com.suqi.center.machine.dao.service.IDevRoomPlayerService;
import com.suqi.center.machine.dao.service.IEmSocDeviceExtendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 房间处理相关实现
 * @version 1.0
 * @date 2023/4/20 17:39
 */
@Service
@Slf4j
public class RoomServiceImpl implements RoomService {

    List<Integer> statuss = Arrays.asList(PlayerLoginStatusEnum.Entered.value(),PlayerLoginStatusEnum.TOBEENTERED.value(),PlayerLoginStatusEnum.OUTER.value());

    @Autowired
    IDevRoomPlayerService iDevRoomPlayerService;
    @Autowired
    IEmSocDeviceExtendService emSocDeviceExtendService;

    @Override
    @DS(DBConstants.SLAVE)
    public DevRoomPlayer getRoomByDeviceId(String deviceId) {
        log.info("getRoomByDeviceId deviceId: {}", deviceId);
        LambdaQueryWrapper<DevRoomPlayer> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DevRoomPlayer::getDeviceId, deviceId)
                .in(DevRoomPlayer::getPlayerLoginStatus, statuss);
        queryWrapper.orderByDesc(DevRoomPlayer::getId);
        queryWrapper.last("limit 1");
        DevRoomPlayer obj = iDevRoomPlayerService.getOne(queryWrapper);
        return obj;
    }

    @Override
    @DS(DBConstants.SLAVE)
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED,rollbackFor = Throwable.class)
    public DevRoomPlayer getRoomByUserPhoneId(String userPhoneId) {
        log.info("getRoomByDeviceId userPhoneId: {}", userPhoneId);
        LambdaQueryWrapper<DevRoomPlayer> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DevRoomPlayer::getPhoneId, userPhoneId)
                .in(DevRoomPlayer::getPlayerLoginStatus, statuss);
        queryWrapper.orderByDesc(DevRoomPlayer::getId);
        queryWrapper.last("limit 1");
        DevRoomPlayer obj = iDevRoomPlayerService.getOne(queryWrapper);
        return obj;
    }
    /**
     * 查询非串流 如果是挂机则查询出挂机状态下的房间信息
     *
     * @param deviceId
     */
    @Override
    @DS(DBConstants.SLAVE)
    public SqKeyValuePair<Boolean, DevRoomPlayer> selectNoStreamingByDeviceId(String deviceId) {
        log.info("selectNoStreamingButHangUpByDeviceId deviceId: {}", deviceId);
        LambdaQueryWrapper<DevRoomPlayer> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DevRoomPlayer::getDeviceId, deviceId)
                .in(DevRoomPlayer::getPlayerLoginStatus, PlayerLoginStatusEnum.Entered.value(), PlayerLoginStatusEnum.OUTER.value());
        queryWrapper.orderByDesc(DevRoomPlayer::getId);
        queryWrapper.last("limit 1");
        DevRoomPlayer obj = iDevRoomPlayerService.getOne(queryWrapper);
        // 如果房间记录为空 应该可以重启
        if (Objects.isNull(obj)) {
            return new SqKeyValuePair<>(true, null);
        }
        // 当前房间状态为 10 则串流中
        if(obj.getPlayerLoginStatus().equals(PlayerLoginStatusEnum.Entered.value())){
            return new SqKeyValuePair<>(false, null);
        }
        // 如果当前房间状态为 -10 则还得判断下设备是否挂机状态 才认为是非串流但挂机中
        if (obj.getPlayerLoginStatus().equals(PlayerLoginStatusEnum.OUTER.value())) {
            long count = emSocDeviceExtendService.count((query) -> query.deviceIdEq(deviceId).hangUpStatusEq(1));
            // 如果不是挂机状态 则房间记录则认为为空
            if (count <= 0) {
                obj = null;
            }
        }
        return new SqKeyValuePair<>(true, obj);
    }

}
