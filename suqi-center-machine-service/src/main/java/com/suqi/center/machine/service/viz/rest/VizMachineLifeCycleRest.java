package com.suqi.center.machine.service.viz.rest;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.VizLifeCycleRebootOnlineParam;
import com.suqi.center.machine.api.viz.query.IVizMachineLifeCycleApi;
import com.suqi.center.machine.biz.viz.service.VizMachineLifeCycleRestService;
import com.suqi.center.machine.service.rest.BaseApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @date 2023/10/21 15:53
 */
@RestController
@RequestMapping("/viz/v1/lifeCycle")
public class VizMachineLifeCycleRest extends BaseApiController implements IVizMachineLifeCycleApi {

    @Resource
    VizMachineLifeCycleRestService vizMachineLifeCycleRestService;

    @Override
    public Result<Boolean> rebootOnline(VizLifeCycleRebootOnlineParam param) {
        return rest(()->vizMachineLifeCycleRestService.rebootOnline(param));
    }
}
