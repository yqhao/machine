package com.suqi.center.machine.api.viz.query;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.VizLifeCycleRebootOnlineParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @version 1.0
 * @date 2023/10/21 15:50
 */
@Api(tags = {"云机生命周期处理接口"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/viz/v1/lifeCycle",
        url = ""
)
public interface IVizMachineLifeCycleApi {

    @PostMapping("/reboot/online")
    @ApiOperation(value = "云机重启、初始化后第一次上线", notes = "云机重启、初始化后第一次上线")
    Result<Boolean> rebootOnline(@RequestBody VizLifeCycleRebootOnlineParam param);

}
