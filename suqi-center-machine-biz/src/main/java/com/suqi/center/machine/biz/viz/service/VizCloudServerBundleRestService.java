package com.suqi.center.machine.biz.viz.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.api.viz.dto.request.AddOrUpdMcServiceSoftwarePackageParam;
import com.suqi.center.machine.api.viz.dto.request.McServiceSoftwarePackageParam;
import com.suqi.center.machine.api.viz.dto.request.OssTmpUploadParam;
import com.suqi.center.machine.api.viz.dto.request.ReportOssUploadResultParam;
import com.suqi.center.machine.api.viz.dto.response.McServiceSoftwarePackageResult;
import com.suqi.center.machine.api.viz.dto.response.OssServerBundleRecordResult;
import com.suqi.center.machine.api.viz.dto.response.ServerBundleOssTmpUploadResult;

import java.util.List;

/**
 * @version 1.0
 * @date 2023/7/26 11:43
 */
public interface VizCloudServerBundleRestService {

    /**
     * 分页获取云机端服务软件包
     * @param param
     * @return
     */
    Page<McServiceSoftwarePackageResult> page(McServiceSoftwarePackageParam param);

    /**
     * 添加云机端服务软件包
     * @param param
     * @return
     */
    Boolean addOrUpd(AddOrUpdMcServiceSoftwarePackageParam param);

    /**
     * 根据云机端软包记录Id获取对象存储服务上传记录
     * @param id
     * @return
     */
    List<OssServerBundleRecordResult> getOssRecord(Long id);

    /**
     * 获取云机端软包临时上传地址
     * @param param
     * @return
     */
    ServerBundleOssTmpUploadResult getOssTmpUpload(OssTmpUploadParam param);

    /**
     * 上报云机端软包上传结果
     * @param param
     * @return
     */
    Boolean reportOssUploadResult(ReportOssUploadResultParam param);

    /**
     * 获取云机端服务软件包列表
     * @param param
     * @return
     */
    List<McServiceSoftwarePackageResult> list(McServiceSoftwarePackageParam param);
}
