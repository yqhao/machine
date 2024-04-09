package com.suqi.center.machine.api.viz.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.*;
import com.suqi.center.machine.api.viz.dto.response.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @version 1.0
 * @date 2023/10/20 15:17
 */
@Api(tags = {"【可视化】-任务相关接口"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/viz/v1/task",
        url = ""
)
public interface IVizMcTaskApi {

    @PostMapping("/type/list")
    @ApiOperation(value = "查询任务类型列表", notes = "查询任务类型列表")
    Result<List<VizTaskTypeListResult>> taskTypeList();

    @PostMapping("/page")
    @ApiOperation(value = "分页查询任务列表", notes = "分页查询任务列表")
    Result<Page<VizMcTaskPageResult>> page(@RequestBody VizMcTaskPageParam param);

    @PostMapping("/save")
    @ApiOperation(value = "保存任务", notes = "保存任务")
    Result<VizMcTaskSaveResult> save(@RequestBody VizMcTaskSaveParam param);

    @PostMapping("/update")
    @ApiOperation(value = "修改任务", notes = "修改任务")
    Result<Boolean> update(@RequestBody VizMcTaskUpdateParam param);

    @PostMapping("/page/machine")
    @ApiOperation(value = "分页查询机器子任务列表", notes = "分页查询机器子任务列表")
    Result<Page<VizMcMachineTaskPageResult>> pageMachine(@RequestBody VizMcMachineTaskPageParam param);

    @PostMapping("/save/machine")
    @ApiOperation(value = "保存任务机器", notes = "保存任务机器")
    Result<Boolean> saveMachine(@RequestBody VizDeviceTaskSaveParam param);

    @PostMapping("/batch/retry/machine")
    @ApiOperation(value = "批量重试任务机器", notes = "批量重试任务机器")
    Result<Boolean> retryMachine(@RequestBody VizDeviceTaskRetryParam param);

    @PostMapping("/schedule/page")
    @ApiOperation(value = "定时任务分页查询需要执行的任务", notes = "定时任务分页查询需要执行的任务")
    Result<Page<VizMcTaskSchedulePageResult>> schedulePage(@RequestBody VizMcTaskSchedulePageParam param);

    @PostMapping("/schedule/page/machine")
    @ApiOperation(value = "定时任务分页查询需要执行的云机任务", notes = "定时任务分页查询需要执行的云机任务")
    Result<Page<VizMcTaskSchedulePageMachineResult>> schedulePageMachine(@RequestBody VizMcTaskSchedulePageMachineParam param);

    @PostMapping("/schedule/update")
    @ApiOperation(value = "定时任务修改任务", notes = "定时任务修改任务")
    Result<Boolean> scheduleUpdate(@RequestBody VizMcTaskScheduleUpdateParam param);

    @PostMapping("/schedule/update/machine")
    @ApiOperation(value = "定时任务修改云机任务", notes = "定时任务修改云机任务")
    Result<Boolean> scheduleUpdateMachine(@RequestBody VizMcTaskScheduleUpdateMachineParam param);

    @PostMapping("/schedule/getTask")
    @ApiOperation(value = "定时任务根据任务ID获取任务", notes = "定时任务根据任务ID获取任务")
    Result<VizMcTaskSchedulePageResult> scheduleGetTask(@RequestBody VizMcTaskScheduleGetTaskParam param);

    @PostMapping("/schedule/getTask/machine")
    @ApiOperation(value = "定时任务根据任务ID获取云机任务", notes = "定时任务根据任务ID获取云机任务")
    Result<VizMcTaskSchedulePageMachineResult> scheduleGetTaskMachine(@RequestBody VizMcTaskScheduleGetTaskParam param);

    @PostMapping("/schedule/check/machine/incomplete")
    @ApiOperation(value = "检查当前任务是否还存在等待中或者执行中的任务", notes = "检查当前任务是否还存在等待中或者执行中的任务存在则返回 true，不存在则返回false")
    Result<Boolean> scheduleCheckMachineIncomplete(@RequestBody VizMcTaskScheduleIncompleteParam param);


}
