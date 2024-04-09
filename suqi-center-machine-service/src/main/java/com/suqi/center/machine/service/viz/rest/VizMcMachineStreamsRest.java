package com.suqi.center.machine.service.viz.rest;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineStreamsInfoParam;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineStreamsSaveOrUpdateParam;
import com.suqi.center.machine.api.viz.dto.response.VizMcMachineStreamsInfoResult;
import com.suqi.center.machine.api.viz.query.IVizMcMachineStreamsApi;
import com.suqi.center.machine.biz.viz.service.VizMcMachineStreamsRestService;
import com.suqi.center.machine.service.rest.BaseApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @date 2023/10/10 19:12
 */
@RestController
@RequestMapping("/viz/v1/machine/streams")
public class VizMcMachineStreamsRest extends BaseApiController implements IVizMcMachineStreamsApi {

    @Resource
    VizMcMachineStreamsRestService vizMcMachineStreamsRestService;

    @Override
    public Result<VizMcMachineStreamsInfoResult> info(VizMcMachineStreamsInfoParam param) {
        return rest(()->vizMcMachineStreamsRestService.info(param));
    }

    @Override
    public Result<Boolean> saveOrUpdate(VizMcMachineStreamsSaveOrUpdateParam param) {
        return rest(()->vizMcMachineStreamsRestService.saveOrUpdate(param));
    }
}
