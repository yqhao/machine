package com.suqi.center.machine.api.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.reponse.SysDeviceLabelListResult;
import com.suqi.center.machine.api.dto.request.GetDeviceIdleNumParam;
import com.suqi.center.machine.api.dto.request.SysDeviceLabelListParam;
import com.suqi.center.machine.api.dto.request.SysDeviceLabelParam;
import com.suqi.center.machine.api.dto.response.GetDeviceIdleNumResult;
import com.suqi.center.machine.api.dto.response.GetDeviceNumResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 设备系统标签Feign接口
 * @version 1.0
 * @date 2023/3/29 19:16
 */
@Api(tags = {"设备系统标签接口"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/sys/device/label",
        url = ""
)
public interface ISysDeviceLabelApi {

    @PostMapping("/list")
    @ApiOperation(value = "分页获取设备系统标签",notes = "用于管理后台分页获取设备系统标签")
    Result<Page<SysDeviceLabelListResult>> list(@RequestBody SysDeviceLabelListParam param);

    @PostMapping("add")
    @ApiOperation(value = "添加设备系统标签",notes = "用于管理后台添加设备系统标签")
    Result<Boolean> add(@RequestBody SysDeviceLabelParam param);

    @PostMapping("batch/update")
    @ApiOperation(value = "修改设备系统标签",notes = "用于管理后台修改设备系统标签")
    Result<Boolean> update(@RequestBody SysDeviceLabelParam param);

    @PostMapping("/get/info")
    @ApiOperation(value = "根据标签名称获取标签详情",notes = "根据标签名称获取标签详情")
    Result<SysDeviceLabelListResult> getInfoByLabelName(@RequestBody SysDeviceLabelListParam param);

    @PostMapping("/get/device/idle/num")
    @ApiOperation(value = "根据标签获取空闲设备数",notes = "根据标签获取空闲设备数")
    Result<GetDeviceIdleNumResult> getDeviceIdleNum(@RequestBody GetDeviceIdleNumParam param);

    @PostMapping("/get/device/num")
    @ApiOperation(value = "查询某一个标签的设备数量",notes = "查询某一个标签的设备数量")
    Result<GetDeviceNumResult> getDeviceNum(@RequestBody GetDeviceIdleNumParam param);

}
