package com.suqi.center.machine.service.viz.rest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.common.enums.TnMachineSaleStatusEnum;
import com.suqi.center.common.exception.ExceptionCode;
import com.suqi.center.machine.api.viz.dto.request.*;
import com.suqi.center.machine.api.viz.dto.response.*;
import com.suqi.center.machine.api.viz.query.IVizMcMachineApi;
import com.suqi.center.machine.biz.viz.service.VizMcMachineRestService;
import com.suqi.center.machine.biz.viz.service.common.MachineTopicSendUtils;
import com.suqi.center.machine.service.rest.BaseApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @date 2022/10/28 11:11
 */
@RestController
@RequestMapping("/viz/v1/machine")
public class VizMcMachineRest extends BaseApiController implements IVizMcMachineApi {

    @Resource
    VizMcMachineRestService vizMcMachineRestService;
    @Resource
    MachineTopicSendUtils machineTopicSendUtils;

    @Override
    public Result<Page<MachinePageResult>> page(MachinePageParam param) {
        return rest(() -> vizMcMachineRestService.page(param));
    }

    /**
     * 根据条件分页查询未售设备列表
     *
     * @param param
     * @return
     */
    @Override
    public Result<Page<MachinePageResult>> unSoldPage(MachinePageParam param) {
        param.setSalesStatus(TnMachineSaleStatusEnum.UN_SOLD.getStatus());
        return rest(() -> vizMcMachineRestService.page(param));
    }

    @Override
    public Result<MachineInfoResult> info(MachineInfoParam param) {
        return rest(() -> vizMcMachineRestService.info(param));
    }

    @Override
    public Result<Boolean> update(MachineUpdateParam param) {
        return rest(() -> {
            if (param == null || param.getId() == null) {
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return vizMcMachineRestService.update(param);
        });
    }

    @Override
    public Result<MachineStatusInfoResult> statusInfo(MachineInfoParam param) {
        return rest(() -> vizMcMachineRestService.statusInfo(param));
    }

    @Override
    public Result<Boolean> statusUpdate(MachineStatusParam param) {
        return rest(() -> {
            if (param == null || param.getId() == null) {
                ExceptionCode.INVALID_PARAM.throwBizException();
            }
            return vizMcMachineRestService.statusUpdate(param);
        });
    }

    /**
     * 根据分配任务更新更新机器的销售状态
     *
     * @param saleStatusReqDto
     * @return
     */
    @Override
    public Result<Boolean> updateSalesStatusByTaskId(MachineSaleStatusReqDto saleStatusReqDto) {
        return Result.data(vizMcMachineRestService.updateSalesStatusByTaskId(saleStatusReqDto));
    }

    /**
     * 根据回收任务更新更新机器的销售状态
     * @param saleStatusReqDto
     * @return
     */
    @Override
    public Result<Boolean> updateRecycleStatusByTaskId(McMachineTaskUpdateReqDto saleStatusReqDto) {
        return Result.data(vizMcMachineRestService.updateRecycleStatusByTaskId(saleStatusReqDto));
    }

    /**
     * 查询并未售机器并且没有分配任务的数据
     *
     * @param saleStatusReqDto
     * @return
     */
    @Override
    public Result<VizAssignResultRespDto> executeUnSoldMachine(MachineSaleStatusReqDto saleStatusReqDto) {
        return Result.data(machineTopicSendUtils.executeUnSoldMachine(saleStatusReqDto));
    }

    /**
     * 处理分配任务
     *
     * @param saleStatusReqDto
     * @return
     */
    @Override
    public Result<VizMcMachineAssignTaskRespDto> handleAssignTask(McMachineTaskHandleDto saleStatusReqDto) {
        return Result.data(vizMcMachineRestService.handleAssignTask(saleStatusReqDto));
    }

    /**
     * 预执行回收-租户下可用机器并且没有回收任务的数据
     *
     * @param reqDto
     * @return
     */
    @Override
    public Result<List<String>> executeRecycleDevice(List<MachineRecycleReqDto> reqDto) {
        return Result.data(machineTopicSendUtils.executeRecycleDevice(reqDto));
    }

    /**
     * 处理回收任务
     *
     * @param saleStatusReqDto
     * @return
     */
    @Override
    public Result<VizMcMachineRecycleTaskRespDto> handleRecycleTask(McMachineTaskHandleDto saleStatusReqDto) {
        return Result.data(vizMcMachineRestService.handleRecycleTask(saleStatusReqDto));
    }
    @Override
    public Result<Boolean> save(VizMcMachineParam vizMcMachineParam) {
        return Result.data(vizMcMachineRestService.save(vizMcMachineParam));
    }
}
