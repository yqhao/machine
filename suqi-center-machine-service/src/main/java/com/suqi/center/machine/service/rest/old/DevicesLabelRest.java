package com.suqi.center.machine.service.rest.old;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.reponse.DevicesLabelListResult;
import com.suqi.center.machine.api.dto.request.AddDevicesLabelParam;
import com.suqi.center.machine.api.dto.request.DevicesLabelListParam;
import com.suqi.center.machine.api.query.IDevicesLabelApi;
import com.suqi.center.machine.biz.service.DeviceLabelService;
import com.suqi.center.machine.service.rest.BaseApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 设备标签控制层
 * @version 1.0
 * @date 2023/3/30 15:01
 */
@RestController
@RequestMapping("/v1/machine/device/label")
public class DevicesLabelRest  extends BaseApiController implements IDevicesLabelApi {

    @Resource
    DeviceLabelService deviceLabelService;


    @Override
    public Result<Page<DevicesLabelListResult>> list(DevicesLabelListParam param) {
        return rest(() -> {
            return deviceLabelService.list(param);
        });
    }

    @Override
    public Result<Boolean> saveOrUpdate(AddDevicesLabelParam param) {
        return rest(() -> {
            return deviceLabelService.saveOrUpdate(param);
        });
    }

}
