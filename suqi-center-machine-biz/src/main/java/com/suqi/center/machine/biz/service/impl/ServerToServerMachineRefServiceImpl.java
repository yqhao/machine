package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.suqi.center.common.utils.RestResponse;
import com.suqi.center.machine.api.dto.DeviceUseRecord;
import com.suqi.center.machine.api.enums.PlayerLoginStatusEnum;
import com.suqi.center.machine.biz.service.ServerToServerMachineRefService;
import com.suqi.center.machine.dao.entity.DevRoomPlayer;
import com.suqi.center.machine.dao.service.IDevRoomPlayerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class ServerToServerMachineRefServiceImpl implements ServerToServerMachineRefService {

    @Autowired
    IDevRoomPlayerService iDevRoomPlayerService;

    List<Integer> statuss = Arrays.asList(PlayerLoginStatusEnum.Entered.value(),PlayerLoginStatusEnum.TOBEENTERED.value(),PlayerLoginStatusEnum.OUTER.value());

    @Override
    public RestResponse<String> queryDeviceIdByUuid(Long memberId, String uuid) {
        log.info("queryDeviceIdByUuid memberId: {}, uuid: {}", memberId, uuid);
        LambdaQueryWrapper<DevRoomPlayer> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DevRoomPlayer::getFkMemberId, memberId)
                .eq(DevRoomPlayer::getPhoneId, uuid)
                .in(DevRoomPlayer::getPlayerLoginStatus, statuss);
        queryWrapper.orderByDesc(DevRoomPlayer::getId);
        queryWrapper.last("limit 1");
        DevRoomPlayer obj = iDevRoomPlayerService.getOne(queryWrapper);
        String data = obj != null ? obj.getDeviceId() : null;
        log.info("queryDeviceIdByUuid memberId: {}, uuid: {}, deviceId: {}", memberId, uuid, data);
        return RestResponse.ok(data);
    }

    @Override
    public RestResponse<List<DeviceUseRecord>> queryDeviceIdsByUuid(Long memberId, String uuid) {
        log.info("queryDeviceIdsByUuid memberId: {}, uuid: {}", memberId, uuid);
        LambdaQueryWrapper<DevRoomPlayer> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DevRoomPlayer::getFkMemberId, memberId)
                .eq(DevRoomPlayer::getPhoneId, uuid);
        queryWrapper.orderByDesc(DevRoomPlayer::getId);
        List<DevRoomPlayer> list = iDevRoomPlayerService.list(queryWrapper);
        if(list!=null && !list.isEmpty()) {
            List<DeviceUseRecord> data = new ArrayList<>();
            for (DevRoomPlayer devRoomPlayer : list) {
                DeviceUseRecord deviceUseRecord = new DeviceUseRecord();
                deviceUseRecord.setDeviceId(devRoomPlayer.getDeviceId());
                deviceUseRecord.setLoginTime(devRoomPlayer.getLoginTime());
                deviceUseRecord.setLogoutTime(devRoomPlayer.getLogoutTime());
                data.add(deviceUseRecord);
            }
            log.info("queryDeviceIdsByUuid memberId: {}, uuid: {}, deviceId: {}", memberId, uuid, data);
            return RestResponse.ok(data);
        }
        return RestResponse.ok();
    }
}
