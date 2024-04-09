package com.suqi.center.machine.service.rest;

import com.suqi.center.common.utils.RestResponse;
import com.suqi.center.common.utils.StringUtil;
import com.suqi.center.machine.api.query.ICloudDeviceStatusApi;
import com.suqi.center.machine.biz.service.ICloudDeviceStatusService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @date 2022/10/28 11:11
 */
@RestController
@RequestMapping("/v1/cloud")
public class CloudDeviceStatusRest implements ICloudDeviceStatusApi {

    @Resource
    ICloudDeviceStatusService iCloudDeviceStatusService;

    @Override
    public RestResponse<Integer> deviceStatus(@RequestParam("memberId") Long memberId,@RequestParam("deviceId")String deviceId) {
        if(StringUtil.isBlank(deviceId)){
            return  RestResponse.errorException("设备id不能为空");
        }
        return new RestResponse<>(iCloudDeviceStatusService.deviceStatus(memberId,deviceId));
    }
}
