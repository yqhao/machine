package com.suqi.center.machine.service.viz.rest;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.ExecuteTheNextSubtaskParam;
import com.suqi.center.machine.api.viz.query.IVizUpdateDeviceSubtaskApi;
import com.suqi.center.machine.biz.viz.service.VizUpdateDeviceSubtaskRestService;
import com.suqi.center.machine.service.rest.BaseApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @date 2023/9/12 11:49
 */
@RestController
@RequestMapping("/viz/v1/machine/update/device/subtask/task")
public class VizUpdateDeviceSubtaskRest extends BaseApiController implements IVizUpdateDeviceSubtaskApi {

    @Resource
    VizUpdateDeviceSubtaskRestService vizUpdateDeviceSubtaskRestService;

    @Override
    public Result<Boolean> executeTheNextSubtask(ExecuteTheNextSubtaskParam param) {
        return rest(()->vizUpdateDeviceSubtaskRestService.executeTheNextSubtask(param));
    }
}
