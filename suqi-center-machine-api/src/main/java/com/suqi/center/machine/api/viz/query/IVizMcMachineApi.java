package com.suqi.center.machine.api.viz.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.*;
import com.suqi.center.machine.api.viz.dto.response.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @version 1.0
 * @date 2022/10/28 11:08
 */
@Api(tags = {"机器接口服务"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/viz/v1/machine",
        url = ""
)
public interface IVizMcMachineApi {

    @PostMapping("/page")
    @ApiOperation(value = "根据条件分页查询设备列表", notes = "根据条件分页查询设备列表")
    Result<Page<MachinePageResult>> page(@RequestBody MachinePageParam param);

    @PostMapping("/unSoldPage")
    @ApiOperation(value = "根据条件分页查询未售设备列表", notes = "根据条件分页查询未售设备列表")
    Result<Page<MachinePageResult>> unSoldPage(@RequestBody MachinePageParam param);

    @PostMapping("/info")
    @ApiOperation(value = "根据设备ID或实例ID、自增ID查询机器信息", notes = "根据设备ID或实例ID、自增ID查询机器信息")
    Result<MachineInfoResult> info(@RequestBody MachineInfoParam param);

    @PostMapping("/update")
    @ApiOperation(value = "根据自增ID修改机器信息", notes = "根据自增ID修改机器信息")
    Result<Boolean> update(@RequestBody MachineUpdateParam param);

    @PostMapping("/status/info")
    @ApiOperation(value = "根据设备ID或实例ID、自增ID查询机器状态信息", notes = "根据设备ID或实例ID、自增ID查询机器状态信息")
    Result<MachineStatusInfoResult> statusInfo(@RequestBody MachineInfoParam param);

    @PostMapping("/status/update")
    @ApiOperation(value = "根据自增ID修改机器状态信息", notes = "根据自增ID修改机器状态信息")
    Result<Boolean> statusUpdate(@RequestBody MachineStatusParam param);

    @PostMapping("/updateSalesStatusByTaskId")
    @ApiOperation(value = "根据分配任务更新更新机器的销售状态", notes = "根据分配任务更新更新机器的销售状态")
    Result<Boolean> updateSalesStatusByTaskId(@RequestBody @Validated MachineSaleStatusReqDto saleStatusReqDto);

    @PostMapping("/updateRecycleStatusByTaskId")
    @ApiOperation(value = "根据回收任务更新更新机器的销售状态", notes = "根据回收任务更新更新机器的销售状态")
    Result<Boolean> updateRecycleStatusByTaskId(@RequestBody @Validated McMachineTaskUpdateReqDto saleStatusReqDto);

    @PostMapping("/executeUnSoldMachine")
    @ApiOperation(value = "预执行分配-未售机器并且没有分配任务的数据", notes = "预执行分配-未售机器并且没有分配任务的数据")
    Result<VizAssignResultRespDto> executeUnSoldMachine(@RequestBody @Validated MachineSaleStatusReqDto saleStatusReqDto);

    @PostMapping("/handleAssignTask")
    @ApiOperation(value = "处理分配任务", notes = "处理分配任务")
    Result<VizMcMachineAssignTaskRespDto> handleAssignTask(@RequestBody @Validated McMachineTaskHandleDto saleStatusReqDto);

    @PostMapping("/executeRecycleDevice")
    @ApiOperation(value = "预执行回收-租户下可用机器并且没有回收任务的数据", notes = "预执行回收-租户下可用机器并且没有回收任务的数据")
    Result<List<String>> executeRecycleDevice(@RequestBody @Validated List<MachineRecycleReqDto> reqDto);

    @PostMapping("/handleRecycleTask")
    @ApiOperation(value = "处理回收任务", notes = "处理回收任务")
    Result<VizMcMachineRecycleTaskRespDto> handleRecycleTask(@RequestBody @Validated McMachineTaskHandleDto saleStatusReqDto);


    @PostMapping("save")
    @ApiOperation(value = "保存云机信息", notes = "保存云机和端口信息")
    Result<Boolean> save(@RequestBody @Validated VizMcMachineParam vizMcMachineParam);

}
