package com.suqi.center.machine.api.viz.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.McUpdateDeviceTaskTenantPageParam;
import com.suqi.center.machine.api.viz.dto.request.McUpdateDeviceTaskTenantSaveOrUpdateParam;
import com.suqi.center.machine.api.viz.dto.response.McUpdateDeviceTaskTenantListResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @version 1.0
 * @date 2023/8/15 18:39
 */
@Api(tags = {"租户更新任务管理"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/viz/v1/machine/update/device/task/tenant",
        url = ""
)
public interface IVizMcUpdateDeviceTaskTenantApi {

    @PostMapping("/page")
    @ApiOperation(value = "分页查询租户更新任务列表", notes = "分页查询租户更新任务列表")
    Result<Page<McUpdateDeviceTaskTenantListResult>> page(@RequestBody McUpdateDeviceTaskTenantPageParam param);

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "保存或者修改租户更新任务", notes = "保存或者修改租户更新任务")
    Result<Boolean> saveOrUpdate(@RequestBody McUpdateDeviceTaskTenantSaveOrUpdateParam param);

}
