package com.suqi.center.machine.biz.viz.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.enums.StatusIntEnum;
import com.suqi.center.common.enums.SupplierTypeEnum;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.utils.ObsPathUtil;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.external.api.dto.request.ObsTmpUploadParam;
import com.suqi.center.external.api.dto.response.GetObsBucketsResult;
import com.suqi.center.external.api.dto.response.ObsUploadTemporaryResult;
import com.suqi.center.external.api.query.objectstore.IObsConfigEoApi;
import com.suqi.center.machine.api.viz.dto.request.AddOrUpdMcServiceSoftwarePackageParam;
import com.suqi.center.machine.api.viz.dto.request.McServiceSoftwarePackageParam;
import com.suqi.center.machine.api.viz.dto.request.OssTmpUploadParam;
import com.suqi.center.machine.api.viz.dto.request.ReportOssUploadResultParam;
import com.suqi.center.machine.api.viz.dto.response.McServiceSoftwarePackageResult;
import com.suqi.center.machine.api.viz.dto.response.OssServerBundleRecordResult;
import com.suqi.center.machine.api.viz.dto.response.ServerBundleOssTmpUploadResult;
import com.suqi.center.machine.biz.viz.service.VizCloudServerBundleRestService;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackage;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackageOssRecord;
import com.suqi.center.machine.dao.viz.service.IMcServiceSoftwarePackageOssRecordService;
import com.suqi.center.machine.dao.viz.service.IMcServiceSoftwarePackageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 * 云机端软件包表 接口
 * </p>
 *
 * @author 18374
 * @since 2023-07-25
 */
@Slf4j
@Service
@RefreshScope
public class VizCloudServerBundleRestServiceImpl implements VizCloudServerBundleRestService {

    @Resource
    IMcServiceSoftwarePackageService iMcServiceSoftwarePackageService;

    @Resource
    IMcServiceSoftwarePackageOssRecordService iMcServiceSoftwarePackageOssRecordService;

    @Resource
    IObsConfigEoApi iObsConfigEoApi;

    @Resource
    ObsPathUtil obsPathUtil;

    @Value("${expire.seconds:7200}")
    private Long expireSeconds;

    @Override
    @DS(DBConstants.SHARDING)
    public Page<McServiceSoftwarePackageResult> page(McServiceSoftwarePackageParam param) {
        Page<McServiceSoftwarePackage> page = new Page<>();
        page.setCurrent(param.getCurrent());
        page.setSize(param.getSize());
        Page resultPage = iMcServiceSoftwarePackageService.page(page, e -> {
            e.fkMcServiceSoftwarePackageTypeIdEq(param.getFkMcServiceSoftwarePackageTypeId())
                    .supplierTypeEq(param.getSupplierType())
                    .nameLike(param.getName())
                    .imageIdEq(param.getImageId())
                    .statusEq(50)
                    .versionEq(param.getVersion());
        });
        if(resultPage == null || resultPage.getRecords() == null || resultPage.getRecords().isEmpty()){
            return resultPage;
        }
        List<McServiceSoftwarePackageResult> resultList = new ArrayList<>(resultPage.getRecords().size());
        resultPage.getRecords().forEach(e->{
            McServiceSoftwarePackageResult mcServiceSoftwarePackageResult = softwarePackageToSoftwarePackageResult((McServiceSoftwarePackage) e);
            resultList.add(mcServiceSoftwarePackageResult);
        });
        resultPage.setRecords(resultList);
        return resultPage;
    }

    @Override
    @DS(DBConstants.SHARDING)
    public Boolean addOrUpd(AddOrUpdMcServiceSoftwarePackageParam param) {
        if(SupplierTypeEnum.TENCENT.value().equals(param.getSupplierType()) && StrUtil.isBlank(param.getImageId())){
            throw new BizException("镜像Id不能为空");
        }
        McServiceSoftwarePackage mcServiceSoftwarePackage = new McServiceSoftwarePackage();
        mcServiceSoftwarePackage.setFkMcServiceSoftwarePackageTypeId(param.getFkMcServiceSoftwarePackageTypeId());
        mcServiceSoftwarePackage.setSupplierType(param.getSupplierType());
        mcServiceSoftwarePackage.setName(param.getName());
        mcServiceSoftwarePackage.setImageId(param.getImageId());
        mcServiceSoftwarePackage.setVersion(param.getVersion());
        mcServiceSoftwarePackage.setStatus(param.getStatus());
        if(param.getId() != null){
            McServiceSoftwarePackage old = iMcServiceSoftwarePackageService.getById(param.getId());
            if(old == null){
                throw new BizException("云机端软件包不存在！");
            }
            mcServiceSoftwarePackage.setLastUpdateTime(SystemClock.date());
            mcServiceSoftwarePackage.setId(old.getId());
        }else{
            mcServiceSoftwarePackage.setCreateTime(SystemClock.date());

        }
        return iMcServiceSoftwarePackageService.saveOrUpdate(mcServiceSoftwarePackage);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public List<OssServerBundleRecordResult> getOssRecord(Long id) {
        List<OssServerBundleRecordResult> resultList = new ArrayList<>();
        List<GetObsBucketsResult> obsBuckets = iObsConfigEoApi.getObsBuckets().getData();
        if(obsBuckets == null){
            return resultList;
        }
        List<McServiceSoftwarePackageOssRecord> mcServiceSoftwarePackageOssRecords = iMcServiceSoftwarePackageOssRecordService.select(e -> e.fkMcServiceSoftwarePackageIdEq(id).statusEq(StatusIntEnum.NORMAL.getCode()));
        Map<String, McServiceSoftwarePackageOssRecord> collect = mcServiceSoftwarePackageOssRecords.stream().collect(Collectors.toMap(McServiceSoftwarePackageOssRecord::getBucketName, obj -> obj));
        obsBuckets.forEach(e->{
            OssServerBundleRecordResult result = new OssServerBundleRecordResult();
            result.setOssId(e.getType());
            result.setName(e.getName());
            result.setOssType(1);
            result.setBucketName(e.getBucketName());
            McServiceSoftwarePackageOssRecord mcServiceSoftwarePackageOssRecord = collect.get(e.getBucketName());
            if(mcServiceSoftwarePackageOssRecord != null){
                result.setStatus( mcServiceSoftwarePackageOssRecord.getStatus());
                result.setCreateTime(mcServiceSoftwarePackageOssRecord.getCreateTime());
                result.setLastUpdateTime(mcServiceSoftwarePackageOssRecord.getLastUpdateTime());
            }else {
                result.setStatus(0);
            }
            resultList.add(result);
        });
        return resultList;
    }

    @Override
    @DS(DBConstants.SHARDING)
    public ServerBundleOssTmpUploadResult getOssTmpUpload(OssTmpUploadParam param) {

        McServiceSoftwarePackageOssRecord mcServiceSoftwarePackageOssRecord = iMcServiceSoftwarePackageOssRecordService.selectOne(e ->
                e.fkMcServiceSoftwarePackageIdEq(param.getMcServiceSoftwarePackageId())
                        .ossIdEq(param.getOssId())
                        .ossTypeEq(param.getOssType())
        );

        // 获取临时上传地址
        ObsTmpUploadParam obsTmpUploadParam = new ObsTmpUploadParam();
        obsTmpUploadParam.setOssId(param.getOssId());
        // 获取路径
        String objectName = "";
        if(mcServiceSoftwarePackageOssRecord != null){
            objectName = mcServiceSoftwarePackageOssRecord.getObjectPath();
        }else {
            StringBuilder serverBundle = obsPathUtil.getSystemPath("ServerBundle");
            serverBundle.append(SystemClock.now()).append(".tar");
            objectName = serverBundle.toString();
        }
        obsTmpUploadParam.setObjectName(objectName);
        obsTmpUploadParam.setExpireSeconds(expireSeconds);
        ObsUploadTemporaryResult data = iObsConfigEoApi.getTmpUpload(obsTmpUploadParam).getData();
        if(data == null){
            throw new BizException("获取临时上传地址失败");
        }
        // 添加记录到云机端软件包对象存储记录表中
        if(mcServiceSoftwarePackageOssRecord != null){
            mcServiceSoftwarePackageOssRecord.setBucketName(data.getBucketName());
            mcServiceSoftwarePackageOssRecord.setObjectPath(data.getObjectPath());
            mcServiceSoftwarePackageOssRecord.setStatus(0);
            mcServiceSoftwarePackageOssRecord.setLastUpdateTime(SystemClock.date());
        }else {
            mcServiceSoftwarePackageOssRecord = new McServiceSoftwarePackageOssRecord();
            mcServiceSoftwarePackageOssRecord.setFkMcServiceSoftwarePackageId(param.getMcServiceSoftwarePackageId());
            mcServiceSoftwarePackageOssRecord.setOssId(param.getOssId());
            mcServiceSoftwarePackageOssRecord.setOssType(param.getOssType());
            mcServiceSoftwarePackageOssRecord.setBucketName(data.getBucketName());
            mcServiceSoftwarePackageOssRecord.setObjectPath(data.getObjectPath());
            mcServiceSoftwarePackageOssRecord.setStatus(0);
            mcServiceSoftwarePackageOssRecord.setCreateTime(SystemClock.date());
        }
        boolean save = iMcServiceSoftwarePackageOssRecordService.saveOrUpdate(mcServiceSoftwarePackageOssRecord);
        if (!save) {
            throw new BizException("保存记录失败");
        }
        ServerBundleOssTmpUploadResult serverBundleOssTmpUploadResult = new ServerBundleOssTmpUploadResult();
        serverBundleOssTmpUploadResult.setMcServiceSoftwarePackageOssRecordId(mcServiceSoftwarePackageOssRecord.getId());
        serverBundleOssTmpUploadResult.setHeaders(data.getHeaders());
        serverBundleOssTmpUploadResult.setSignedUrl(data.getSignedUrl());
        return serverBundleOssTmpUploadResult;
    }

    @Override
    @DS(DBConstants.SHARDING)
    public Boolean reportOssUploadResult(ReportOssUploadResultParam param) {
        McServiceSoftwarePackageOssRecord mcServiceSoftwarePackageOssRecord = iMcServiceSoftwarePackageOssRecordService.getById(param.getMcServiceSoftwarePackageOssRecordId());
        if(mcServiceSoftwarePackageOssRecord == null){
            throw new BizException("记录不存在");
        }
        return iMcServiceSoftwarePackageOssRecordService.update(e->{
            e.idEq(mcServiceSoftwarePackageOssRecord.getId())
                    .setStatus(param.getStatus())
                    .setLastUpdateTime(SystemClock.date());
        });
    }

    @Override
    public List<McServiceSoftwarePackageResult> list(McServiceSoftwarePackageParam param) {
        List<McServiceSoftwarePackageResult> results = new ArrayList<>();
        List<McServiceSoftwarePackage> list = iMcServiceSoftwarePackageService.list(e -> {
            e.fkMcServiceSoftwarePackageTypeIdEq(param.getFkMcServiceSoftwarePackageTypeId())
                    .supplierTypeEq(param.getSupplierType())
                    .nameLike(param.getName())
                    .imageIdEq(param.getImageId())
                    .statusEq(50)
                    .versionEq(param.getVersion());
        });
        if(list != null && !list.isEmpty()){
            list.forEach(e->results.add(softwarePackageToSoftwarePackageResult(e)));
        }
        return results;
    }

    private McServiceSoftwarePackageResult softwarePackageToSoftwarePackageResult(McServiceSoftwarePackage mcServiceSoftwarePackage){
        McServiceSoftwarePackageResult mcServiceSoftwarePackageResult = new McServiceSoftwarePackageResult();
        mcServiceSoftwarePackageResult.setId(mcServiceSoftwarePackage.getId());
        mcServiceSoftwarePackageResult.setFkMcServiceSoftwarePackageTypeId(mcServiceSoftwarePackage.getFkMcServiceSoftwarePackageTypeId());
        mcServiceSoftwarePackageResult.setSupplierType(mcServiceSoftwarePackage.getSupplierType());
        mcServiceSoftwarePackageResult.setName(mcServiceSoftwarePackage.getName());
        mcServiceSoftwarePackageResult.setImageId(mcServiceSoftwarePackage.getImageId());
        mcServiceSoftwarePackageResult.setVersion(mcServiceSoftwarePackage.getVersion());
        mcServiceSoftwarePackageResult.setStatus(mcServiceSoftwarePackage.getStatus());
        mcServiceSoftwarePackageResult.setCreateTime(mcServiceSoftwarePackage.getCreateTime());
        mcServiceSoftwarePackageResult.setLastUpdateTime(mcServiceSoftwarePackage.getLastUpdateTime());
        return mcServiceSoftwarePackageResult;
    }
}