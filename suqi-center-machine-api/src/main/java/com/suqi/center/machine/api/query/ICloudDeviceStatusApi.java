package com.suqi.center.machine.api.query;


import com.suqi.center.common.utils.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version 1.0
 * @date 2022/10/28 11:08
 */
@Api(tags = {"机器接口服务"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/cloud",
        url = ""
)
public interface ICloudDeviceStatusApi {

    @PostMapping("device/status")
    @ApiOperation(value = "云机状态接口")
    RestResponse<Integer> deviceStatus(@RequestParam("memberId") Long memberId,@RequestParam("deviceId")String deviceId);

}
