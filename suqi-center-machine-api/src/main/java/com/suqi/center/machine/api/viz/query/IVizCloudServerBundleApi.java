package com.suqi.center.machine.api.viz.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.viz.dto.request.AddOrUpdMcServiceSoftwarePackageParam;
import com.suqi.center.machine.api.viz.dto.request.McServiceSoftwarePackageParam;
import com.suqi.center.machine.api.viz.dto.request.OssTmpUploadParam;
import com.suqi.center.machine.api.viz.dto.request.ReportOssUploadResultParam;
import com.suqi.center.machine.api.viz.dto.response.McServiceSoftwarePackageResult;
import com.suqi.center.machine.api.viz.dto.response.OssServerBundleRecordResult;
import com.suqi.center.machine.api.viz.dto.response.ServerBundleOssTmpUploadResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @version 1.0
 * @date 2023/7/25 17:17
 */
@Api(tags = {"云机端服务软件包类型管理接口"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/viz/v1/cloud/server/bundle",
        url = ""
)
public interface IVizCloudServerBundleApi {

    @PostMapping("/page")
    @ApiOperation(value = "分页获取云机端服务软件包",notes = "分页获取云机端服务软件包")
    Result<Page<McServiceSoftwarePackageResult>> page(@RequestBody McServiceSoftwarePackageParam param);

    @PostMapping("/list")
    @ApiOperation(value = "获取云机端服务软件包列表",notes = "获取云机端服务软件包列表")
    Result<List<McServiceSoftwarePackageResult>> list(@RequestBody McServiceSoftwarePackageParam param);

    @PostMapping("/add/or/upd")
    @ApiOperation(value = "添加或修改云机端服务软件包",notes = "添加或修改云机端服务软件包")
    Result<Boolean> addOrUpd(@RequestBody AddOrUpdMcServiceSoftwarePackageParam param);


    @GetMapping("/get/oss/record/{id}")
    @ApiOperation(value = "根据云机端软包记录Id获取对象存储服务上传记录",notes = "根据云机端软包记录Id获取对象存储服务上传记录")
    Result<List<OssServerBundleRecordResult>> getOssRecord(@PathVariable Long id);

    @PostMapping("/get/oss/tmp/upload")
    @ApiOperation(value = "获取云机端软包临时上传地址",notes = "根据对象存储记录Id获取临时上传地址")
    Result<ServerBundleOssTmpUploadResult> getOssTmpUpload(@RequestBody OssTmpUploadParam param);

    @PostMapping("/report/oss/upload/result")
    @ApiOperation(value = "上报云机端软包上传结果",notes = "上报云机端软包上传结果")
    Result<Boolean> reportOssUploadResult(@RequestBody ReportOssUploadResultParam param);


}
