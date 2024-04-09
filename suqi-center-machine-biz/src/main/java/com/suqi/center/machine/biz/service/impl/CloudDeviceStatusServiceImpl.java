package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.suqi.center.machine.biz.service.ICloudDeviceStatusService;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.suqi.center.machine.dao.entity.MemberDevice;
import com.suqi.center.machine.dao.service.IEmSocDevicesService;
import com.suqi.center.machine.dao.service.IMemberDeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CloudDeviceStatusServiceImpl implements ICloudDeviceStatusService {

    @Autowired
    IEmSocDevicesService iEmSocDevicesService;

    @Autowired
    IMemberDeviceService iMemberDeviceService;

    @Override
    public Integer deviceStatus(Long memberId,String deviceId) {

        LambdaQueryWrapper<MemberDevice> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(MemberDevice::getFkMemberId, memberId)
                .eq(MemberDevice::getDeviceId, deviceId)
                .eq(MemberDevice::getStatus, 50)
                .select(MemberDevice::getFkMemberId);
        MemberDevice md = iMemberDeviceService.getOne(queryWrapper, false);
        if(md==null){
            return 0;
        }
        LambdaQueryWrapper<EmSocDevices> emSocDevicesLambdaQueryWrapper = new LambdaQueryWrapper<>();
        emSocDevicesLambdaQueryWrapper
                .eq(EmSocDevices::getDeviceId, deviceId)
                .eq(EmSocDevices::getStatus, 50)
                .select(EmSocDevices::getIsReseting, EmSocDevices::getMaintStatus, EmSocDevices::getIsUserSave, EmSocDevices::getHealthStatus);
        //0设备过期或不存在，1 重启中，2 重启完成 ，3：维护中，4 备份中，5 离线 ，6 在线
        EmSocDevices one = iEmSocDevicesService.getOne(emSocDevicesLambdaQueryWrapper,false);
        if(one==null){
            return 6;
        }
        //是否重置中（0：未重置，1：重置中，2：重启中）
        Integer isReseting = one.getIsReseting();
        if(isReseting!=null && isReseting==2){
            return 1;
        }
        //维护模式状态（0：非维护模式，1：维护模式）
        Integer maintStatus = one.getMaintStatus();
        if(maintStatus!=null && maintStatus==1){
            return 3;
        }
        //是否在保存app用户数据(0：否，1：是)
        Integer isUserSave = one.getIsUserSave();
        if(isUserSave!=null && isUserSave==1){
            return 4;
        }
        //健康状态(1：在线，0:故障)
        Integer healthStatus = one.getHealthStatus();
        if(healthStatus!=null && healthStatus==0){
            return 5;
        }
        return 6;
    }
}
