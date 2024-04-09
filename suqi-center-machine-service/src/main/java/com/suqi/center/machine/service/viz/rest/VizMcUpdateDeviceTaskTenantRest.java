package com.suqi.center.machine.service.viz.rest;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.McUpdateDeviceTaskTenantPageParam;
import com.suqi.center.machine.api.viz.dto.request.McUpdateDeviceTaskTenantSaveOrUpdateParam;
import com.suqi.center.machine.api.viz.dto.response.McUpdateDeviceTaskTenantListResult;
import com.suqi.center.machine.api.viz.query.IVizMcUpdateDeviceTaskTenantApi;
import com.suqi.center.machine.biz.viz.service.VizMcUpdateDeviceTaskTenantRestService;
import com.suqi.center.machine.service.rest.BaseApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @date 2023/8/16 10:45
 */
@RestController
@RequestMapping("/viz/v1/machine/update/device/task/tenant")
public class VizMcUpdateDeviceTaskTenantRest extends BaseApiController implements IVizMcUpdateDeviceTaskTenantApi {

    @Resource
    VizMcUpdateDeviceTaskTenantRestService vizMcUpdateDeviceTaskTenantRestService;


    @Override
    public Result<Page<McUpdateDeviceTaskTenantListResult>> page(McUpdateDeviceTaskTenantPageParam param) {
        return rest(()->vizMcUpdateDeviceTaskTenantRestService.page(param));
    }

    @Override
    public Result<Boolean> saveOrUpdate(McUpdateDeviceTaskTenantSaveOrUpdateParam param) {
        return rest(()->vizMcUpdateDeviceTaskTenantRestService.saveOrUpdate(param));
    }


}
