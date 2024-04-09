package com.suqi.center.machine.api.query;

import com.suqi.center.common.utils.RestResponse;
import com.suqi.center.machine.api.dto.DeviceUseRecord;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Api(tags = {"机器接口服务"})
@FeignClient(
//        name = "suqi-center-machine.ServerToServerMachineRefApi",
        name = "suqi-center-machine",
        path = "/v1/server",
        url = ""
)
public interface IServerToServerMachineRefApi {

    @PostMapping("/query/deviceid/byuuid")
    @ApiOperation(value = "通过uuid，获取其所在云机id")
    RestResponse<String> queryDeviceIdByUuid(@RequestParam("memberId") Long memberId, @RequestParam("uuid") String uuid);

    @PostMapping("/query/deviceids/byuuid")
    @ApiOperation(value = "通过uuid，需支持查询所在云机id的历史数据")
    RestResponse<List<DeviceUseRecord>> queryDeviceIdsByUuid(@RequestParam("memberId") Long memberId, @RequestParam("uuid") String uuid);

}
