package com.suqi.center.machine.service.viz.rest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.*;
import com.suqi.center.machine.api.viz.dto.response.*;
import com.suqi.center.machine.api.viz.query.IVizMcUpdateDeviceTaskApi;
import com.suqi.center.machine.biz.viz.service.VizMcUpdateDeviceTaskRestService;
import com.suqi.center.machine.service.rest.BaseApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/8/11 14:55
 */
@RestController
@RequestMapping("/viz/v1/machine/update/device/task")
public class VizMcUpdateDeviceTaskRest extends BaseApiController implements IVizMcUpdateDeviceTaskApi {

    @Resource
    VizMcUpdateDeviceTaskRestService vizMcUpdateDeviceTaskRestService;

    @Override
    public Result<Page<McUpdateDeviceTaskPageResult>> page(McUpdateDeviceTaskPageParam param) {
        return rest(()->vizMcUpdateDeviceTaskRestService.page(param));
    }

    @Override
    public Result<List<McUpdateDeviceTaskListResult>> list(McUpdateDeviceTaskListParam param) {
        return rest(()->vizMcUpdateDeviceTaskRestService.list(param));
    }

    @Override
    public Result<McUpdateDeviceTaskInfoResult> info(Long id) {
        return rest(()->vizMcUpdateDeviceTaskRestService.info(id));
    }

    @Override
    public Result<Boolean> saveOrUpdate(McUpdateDeviceTaskSaveOrUpdateParam param) {
        return rest(()->vizMcUpdateDeviceTaskRestService.saveOrUpdate(param));
    }

    @Override
    public Result<List<McUpdateDeviceSubtaskListResult>> subtaskList(Long mcUpdateDeviceTaskId) {
        return rest(()->vizMcUpdateDeviceTaskRestService.subtaskList(mcUpdateDeviceTaskId));
    }

    @Override
    public Result<Boolean> subtaskSaveOrUpdate(McUpdateDeviceSubtaskSaveOrUpdateParam param) {
        return rest(()->vizMcUpdateDeviceTaskRestService.subtaskSaveOrUpdate(param));
    }

    @Override
    public Result<Page<TaskRecordPageResult>> taskRecordPage(TaskRecordPageParam param) {
        return rest(()->vizMcUpdateDeviceTaskRestService.taskRecordPage(param));
    }

    @Override
    public Result<List<TaskRecordSubtaskResult>> taskRecordSubtask(Long mcUpdateDeviceTaskRecordId) {
        return rest(()->vizMcUpdateDeviceTaskRestService.taskRecordSubtask(mcUpdateDeviceTaskRecordId));
    }

    @Override
    public Result<List<BatchTaskResult>> batchStopTask(BatchStopTaskParam param) {
        return rest(()->vizMcUpdateDeviceTaskRestService.batchStopTask(param));
    }

    @Override
    public Result<List<BatchTaskResult>> batchStartTask(BatchStartTaskParam param) {
        return rest(()->vizMcUpdateDeviceTaskRestService.batchStartTask(param));
    }

    @Override
    public Result<List<BatchTaskResult>> batchAddTask(BatchAddTaskParam param) {
        return rest(()->vizMcUpdateDeviceTaskRestService.batchAddTask(param));
    }

    @Override
    public Result<Boolean> changeMainTaskExecutionStatus(ChangeMainStatusParam param) {
        return rest(()->vizMcUpdateDeviceTaskRestService.changeMainTaskExecutionStatus(param.getFkMcUpdateDeviceTaskRecordId(), param.getStatus()));
    }
}
