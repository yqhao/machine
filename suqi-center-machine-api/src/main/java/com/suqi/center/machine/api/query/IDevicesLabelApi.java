package com.suqi.center.machine.api.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.reponse.DevicesLabelListResult;
import com.suqi.center.machine.api.dto.reponse.SysDeviceLabelListResult;
import com.suqi.center.machine.api.dto.request.AddDevicesLabelParam;
import com.suqi.center.machine.api.dto.request.DevicesLabelListParam;
import com.suqi.center.machine.api.dto.request.SysDeviceLabelParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 设备标签Feign接口
 * @version 1.0
 * @date 2023/3/30 14:57
 */
@Api(tags = {"设备标签接口"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/device/label",
        url = ""
)
public interface IDevicesLabelApi {

    @PostMapping("/list")
    @ApiOperation(value = "分页获取设备标签",notes = "用于管理后台分页获取设备标签")
    Result<Page<DevicesLabelListResult>> list(@RequestBody DevicesLabelListParam param);

    @PostMapping("/batch/saveOrUpdate")
    @ApiOperation(value = "批量添加设备标签",notes = "用于管理后台添加设备标签")
    Result<Boolean> saveOrUpdate(@RequestBody AddDevicesLabelParam param);


}
