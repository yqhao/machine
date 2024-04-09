package com.suqi.center.machine.service.rest.old;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.reponse.SysDeviceLabelListResult;
import com.suqi.center.machine.api.dto.request.GetDeviceIdleNumParam;
import com.suqi.center.machine.api.dto.request.SysDeviceLabelListParam;
import com.suqi.center.machine.api.dto.request.SysDeviceLabelParam;
import com.suqi.center.machine.api.dto.response.GetDeviceIdleNumResult;
import com.suqi.center.machine.api.dto.response.GetDeviceNumResult;
import com.suqi.center.machine.api.query.ISysDeviceLabelApi;
import com.suqi.center.machine.biz.service.SysDeviceLabelManageService;
import com.suqi.center.machine.service.rest.BaseApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 设备系统标签控制层
 *
 * @version 1.0
 * @date 2023/3/29 19:28
 */
@RestController
@RequestMapping("/v1/machine/sys/device/label")
public class SysDeviceLabelRest extends BaseApiController implements ISysDeviceLabelApi {

    @Resource
    SysDeviceLabelManageService sysDeviceLabelManageService;

    @Override
    public Result<Page<SysDeviceLabelListResult>> list(SysDeviceLabelListParam param) {
        return rest(() -> {
            return sysDeviceLabelManageService.list(param);
        });
    }

    @Override
    public Result<Boolean> add(SysDeviceLabelParam param) {
        return rest(() -> {
            return sysDeviceLabelManageService.add(param);
        });
    }

    @Override
    public Result<Boolean> update(SysDeviceLabelParam param) {
        return rest(() -> {
            return sysDeviceLabelManageService.update(param);
        });
    }

    @Override
    public Result<SysDeviceLabelListResult> getInfoByLabelName(SysDeviceLabelListParam param) {
        return rest(() -> {
            return sysDeviceLabelManageService.getInfoByLabelName(param);
        });
    }

    @Override
    public Result<GetDeviceIdleNumResult> getDeviceIdleNum(GetDeviceIdleNumParam param) {
        return rest(() -> {
            return sysDeviceLabelManageService.getDeviceIdleNum(param);
        });
    }

    @Override
    public Result<GetDeviceNumResult> getDeviceNum(GetDeviceIdleNumParam param) {
        return rest(() -> sysDeviceLabelManageService.getDeviceNum(param));
    }
}
