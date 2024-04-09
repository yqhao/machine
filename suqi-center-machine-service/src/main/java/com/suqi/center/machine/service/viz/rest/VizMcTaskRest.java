package com.suqi.center.machine.service.viz.rest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.common.exception.ExceptionCode;
import com.suqi.center.machine.api.viz.dto.request.*;
import com.suqi.center.machine.api.viz.dto.response.*;
import com.suqi.center.machine.api.viz.query.IVizMcTaskApi;
import com.suqi.center.machine.biz.viz.service.VizMcTaskRestService;
import com.suqi.center.machine.service.rest.BaseApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/10/20 16:03
 */
@RestController
@RequestMapping("/viz/v1/task")
public class VizMcTaskRest extends BaseApiController implements IVizMcTaskApi {

    @Resource
    VizMcTaskRestService vizMcTaskRestService;

    @Override
    public Result<List<VizTaskTypeListResult>> taskTypeList() {
        return rest(()->vizMcTaskRestService.taskTypeList());
    }

    @Override
    public Result<Page<VizMcTaskPageResult>> page(VizMcTaskPageParam param) {
        return rest(()->vizMcTaskRestService.page(param));
    }

    @Override
    public Result<VizMcTaskSaveResult> save(VizMcTaskSaveParam param) {
        return rest(()->{
            if(param.getFkVizMcTaskTypeId() == null
                    || param.getFkTenantId() == null
                    || param.getOperateSysUserId() == null){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return vizMcTaskRestService.save(param);
        });
    }

    @Override
    public Result<Boolean> update(VizMcTaskUpdateParam param) {
        return rest(()->{
            if(param.getTaskId() == null
                    || param.getOperateSysUserId() == null){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return vizMcTaskRestService.update(param);
        });
    }

    @Override
    public Result<Page<VizMcMachineTaskPageResult>> pageMachine(VizMcMachineTaskPageParam param) {
        return rest(()->{
            if(param.getFkVizMcTaskId() == null){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return vizMcTaskRestService.pageMachine(param);
        });
    }

    @Override
    public Result<Boolean> saveMachine(VizDeviceTaskSaveParam param) {
        return rest(()->{
            if(param.getFkVizMcTaskId() == null
                    || param.getOperateSysUserId() == null
                    || param.getDeviceTaskSaveParamList() == null
                    || param.getDeviceTaskSaveParamList().isEmpty() ){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return vizMcTaskRestService.saveMachine(param);
        });
    }

    @Override
    public Result<Boolean> retryMachine(VizDeviceTaskRetryParam param) {
        return rest(()->{
            if(param == null || param.getOperateSysUserId() == null ){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return vizMcTaskRestService.retryMachine(param);
        });
    }

    @Override
    public Result<Page<VizMcTaskSchedulePageResult>> schedulePage(VizMcTaskSchedulePageParam param) {
        return rest(()->vizMcTaskRestService.schedulePage(param));
    }

    @Override
    public Result<Page<VizMcTaskSchedulePageMachineResult>> schedulePageMachine(VizMcTaskSchedulePageMachineParam param) {
        return rest(()->vizMcTaskRestService.schedulePageMachine(param));
    }

    @Override
    public Result<Boolean> scheduleUpdate(VizMcTaskScheduleUpdateParam param) {
        return rest(()->{
            if(param.getId() == null){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return vizMcTaskRestService.scheduleUpdate(param);
        });
    }

    @Override
    public Result<Boolean> scheduleUpdateMachine(VizMcTaskScheduleUpdateMachineParam param) {
        return rest(()->{
            if(param.getId() == null){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return vizMcTaskRestService.scheduleUpdateMachine(param);
        });
    }

    @Override
    public Result<VizMcTaskSchedulePageResult> scheduleGetTask(VizMcTaskScheduleGetTaskParam param) {
        return rest(()->{
            if(param.getId() == null){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return vizMcTaskRestService.scheduleGetTask(param);
        });
    }

    @Override
    public Result<VizMcTaskSchedulePageMachineResult> scheduleGetTaskMachine(VizMcTaskScheduleGetTaskParam param) {
        return rest(()->{
            if(param.getId() == null){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return vizMcTaskRestService.scheduleGetTaskMachine(param);
        });
    }

    @Override
    public Result<Boolean> scheduleCheckMachineIncomplete(VizMcTaskScheduleIncompleteParam param) {
        return rest(()->{
            if(param.getVizMcTaskId() == null){
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return vizMcTaskRestService.scheduleCheckMachineIncomplete(param);
        });
    }
}
