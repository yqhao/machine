package com.suqi.center.machine.api.viz.query;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.McDefaultUpdateDeviceTaskSaveOrUpdateParam;
import com.suqi.center.machine.api.viz.dto.response.McDefaultUpdateDeviceTaskListResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @version 1.0
 * @date 2023/8/16 14:48
 */
@Api(tags = {"更新机器默认任务管理"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/viz/v1/machine/default/update/device/task",
        url = ""
)
public interface IVizMcDefaultUpdateDeviceTaskApi {

    @PostMapping("/list")
    @ApiOperation(value = "查询更新机器默认任务列表", notes = "查询更新机器默认任务列表")
    Result<List<McDefaultUpdateDeviceTaskListResult>> list();

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "保存或者修改更新机器默认任务", notes = "保存或者修改更新机器默认任务")
    Result<Boolean> saveOrUpdate(@RequestBody McDefaultUpdateDeviceTaskSaveOrUpdateParam param);

}
