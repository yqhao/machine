package com.suqi.center.machine.biz.viz.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.utils.SqKeyValuePair;
import com.suqi.center.machine.api.viz.dto.request.*;
import com.suqi.center.machine.api.viz.dto.response.*;

import java.util.List;

/**
 * @version 1.0
 * @date 2023/8/21 15:44
 */
public interface VizMcMachineRestService {

    /**
     * 根据条件分页查询设备列表
     * @param param
     * @return
     */
    Page<MachinePageResult> page(MachinePageParam param);

    /**
     * 根据设备ID或实例ID、自增ID查询机器信息
     * @param param
     * @return
     */
    MachineInfoResult info(MachineInfoParam param);

    /**
     * 根据设备ID或实例ID、自增ID查询机器状态信息
     * @param param
     * @return
     */
    MachineStatusInfoResult statusInfo(MachineInfoParam param);

    /**
     * 根据设备ID或实例ID、自增ID修改机器状态信息
     * @param param
     * @return
     */
    Boolean statusUpdate(MachineStatusParam param);

    /**
     * 根据自增ID修改机器信息
     * @param param
     * @return
     */
    Boolean update(MachineUpdateParam param);

    /**
     * 根据分配任务更新更新机器的销售状态
     * @param saleStatusReqDto
     * @return
     */
    Boolean updateSalesStatusByTaskId(MachineSaleStatusReqDto saleStatusReqDto);

    /**
     * 根据回收任务更新更新机器的销售状态
     * @param saleStatusReqDto
     * @return
     */
    Boolean updateRecycleStatusByTaskId(McMachineTaskUpdateReqDto saleStatusReqDto);


    /**
     * 查询并未售机器并且没有分配任务的数据
     * @param saleStatusReqDto
     * @return
     */
    VizAssignResultRespDto executeUnSoldMachine(MachineSaleStatusReqDto saleStatusReqDto);
    /**
     * 处理分配任务
     *
     * @param saleStatusReqDto
     * @return
     */
    VizMcMachineAssignTaskRespDto handleAssignTask(McMachineTaskHandleDto saleStatusReqDto);

    /**
     * 预执行回收-租户下可用机器并且没有回收任务的数据
     * @param reqDto
     * @return
     */
    SqKeyValuePair<List<String>,List<McMachineTaskHandleDto>> executeRecycleDevice(List<MachineRecycleReqDto> reqDto);

    /**
     * 处理回收任务
     * @param saleStatusReqDto
     * @return
     */
    VizMcMachineRecycleTaskRespDto handleRecycleTask(McMachineTaskHandleDto saleStatusReqDto);

    Boolean save(VizMcMachineParam vizMcMachineParam);
}
