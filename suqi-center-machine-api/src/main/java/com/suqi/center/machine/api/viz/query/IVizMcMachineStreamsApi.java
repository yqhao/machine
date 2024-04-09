package com.suqi.center.machine.api.viz.query;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineStreamsInfoParam;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineStreamsSaveOrUpdateParam;
import com.suqi.center.machine.api.viz.dto.response.VizMcMachineStreamsInfoResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @version 1.0
 * @date 2022/10/28 11:08
 */
@Api(tags = {"机器streaming端口映射相关接口"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/viz/v1/machine/streams",
        url = ""
)
public interface IVizMcMachineStreamsApi {

    @PostMapping("/info")
    @ApiOperation(value = "根据设备ID或实例ID、机器基础信息表记录id机器streaming端口映射", notes = "根据设备ID或实例ID、机器基础信息表记录id机器streaming端口映射")
    Result<VizMcMachineStreamsInfoResult> info(@RequestBody VizMcMachineStreamsInfoParam param);


    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "保存或者修改机器streaming端口映射", notes = "保存或者修改机器streaming端口映射")
    Result<Boolean> saveOrUpdate(@RequestBody VizMcMachineStreamsSaveOrUpdateParam param);

}
