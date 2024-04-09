package com.suqi.center.machine.api.viz.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.*;
import com.suqi.center.machine.api.viz.dto.response.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @version 1.0
 * @date 2023/8/11 11:37
 */
@Api(tags = {"更新机器任务"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/viz/v1/machine/update/device/task",
        url = ""
)
public interface IVizMcUpdateDeviceTaskApi {

    @PostMapping("/page")
    @ApiOperation(value = "分页查询任务列表", notes = "分页查询主任务列表")
    Result<Page<McUpdateDeviceTaskPageResult>> page(@RequestBody McUpdateDeviceTaskPageParam param);

    @PostMapping("/list")
    @ApiOperation(value = "查询主任务列表", notes = "查询主任务列表")
    Result<List<McUpdateDeviceTaskListResult>> list(@RequestBody McUpdateDeviceTaskListParam param);

    @GetMapping("/info")
    @ApiOperation(value = "查询任务详情", notes = "查询任务详情")
    Result<McUpdateDeviceTaskInfoResult> info(@RequestParam("id") Long id);

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "保存或者修改任务", notes = "保存或者修改任务")
    Result<Boolean> saveOrUpdate(@RequestBody McUpdateDeviceTaskSaveOrUpdateParam param);

    @GetMapping("/subtask/list")
    @ApiOperation(value = "查询子任务列表", notes = "查询子任务列表")
    Result<List<McUpdateDeviceSubtaskListResult>> subtaskList(@RequestParam("mcUpdateDeviceTaskId") Long mcUpdateDeviceTaskId);

    @PostMapping("/subtask/saveOrUpdate")
    @ApiOperation(value = "保存或者修改子任务", notes = "保存或者修改子任务")
    Result<Boolean> subtaskSaveOrUpdate(@RequestBody McUpdateDeviceSubtaskSaveOrUpdateParam param);

    @PostMapping("/task/record/page")
    @ApiOperation(value = "分页查询推送记录", notes = "分页查询推送记录")
    Result<Page<TaskRecordPageResult>> taskRecordPage(@RequestBody TaskRecordPageParam param);

    @GetMapping("/task/record/subtask")
    @ApiOperation(value = "查询推送记录子任务", notes = "查询推送记录子任务")
    Result<List<TaskRecordSubtaskResult>> taskRecordSubtask(@RequestParam("mcUpdateDeviceTaskRecordId") Long mcUpdateDeviceTaskRecordId);

    @PostMapping("/batch/stop/task")
    @ApiOperation(value = "批量停止任务", notes = "批量停止任务")
    Result<List<BatchTaskResult>> batchStopTask(@RequestBody BatchStopTaskParam param);

    @PostMapping("/batch/start/task")
    @ApiOperation(value = "批量重新开始任务", notes = "批量重新开始任务")
    Result<List<BatchTaskResult>> batchStartTask(@RequestBody BatchStartTaskParam param);

    @PostMapping("/batch/add/task")
    @ApiOperation(value = "批量添加设备", notes = "批量添加设备")
    Result<List<BatchTaskResult>> batchAddTask(@RequestBody BatchAddTaskParam param);

    @PostMapping("/change/main/status")
    @ApiOperation(value = "修改当前主任务执行状态", notes = "修改当前主任务执行状态")
    Result<Boolean> changeMainTaskExecutionStatus(@RequestBody ChangeMainStatusParam param);

}
