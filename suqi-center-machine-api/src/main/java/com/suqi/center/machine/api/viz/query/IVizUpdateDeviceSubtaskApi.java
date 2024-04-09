package com.suqi.center.machine.api.viz.query;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.ExecuteTheNextSubtaskParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @version 1.0
 * @date 2023/9/12 11:39
 */
@Api(tags = {"更新机器主任务"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/viz/v1/machine/update/device/subtask/task",
        url = ""
)
public interface IVizUpdateDeviceSubtaskApi {

    @PostMapping("/execute/next/subtask")
    @ApiOperation(value = "执行下一个子任务", notes = "检查是否存在下一个子任务如果存在则执行下一个子任务")
    Result<Boolean> executeTheNextSubtask(@RequestBody ExecuteTheNextSubtaskParam param);
}
