package com.suqi.center.machine.service.viz.rest;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.McDefaultUpdateDeviceTaskSaveOrUpdateParam;
import com.suqi.center.machine.api.viz.dto.response.McDefaultUpdateDeviceTaskListResult;
import com.suqi.center.machine.api.viz.query.IVizMcDefaultUpdateDeviceTaskApi;
import com.suqi.center.machine.biz.viz.service.VizMcDefaultUpdateDeviceTaskRestService;
import com.suqi.center.machine.service.rest.BaseApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/8/16 14:54
 */
@RestController
@RequestMapping("/viz/v1/machine/default/update/device/task")
public class VizMcDefaultUpdateDeviceTaskRest extends BaseApiController implements IVizMcDefaultUpdateDeviceTaskApi {

    @Resource
    VizMcDefaultUpdateDeviceTaskRestService vizMcDefaultUpdateDeviceTaskRestService;

    @Override
    public Result<List<McDefaultUpdateDeviceTaskListResult>> list() {
        return rest(()->vizMcDefaultUpdateDeviceTaskRestService.list());
    }

    @Override
    public Result<Boolean> saveOrUpdate(McDefaultUpdateDeviceTaskSaveOrUpdateParam param) {
        return rest(()->vizMcDefaultUpdateDeviceTaskRestService.saveOrUpdate(param));
    }

}
