package com.suqi.center.machine.service.rest;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.BatchSetBaiduDeviceImageParam;
import com.suqi.center.machine.dao.entity.BaiduImages;
import com.suqi.center.machine.api.dto.request.BaiduImagesParam;
import com.suqi.center.machine.api.dto.response.BaiduImagesResult;
import com.suqi.center.machine.api.query.IBaiduImagesApi;
import com.suqi.center.machine.biz.service.impl.BaiduImagesCurdServiceImpl;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

/**
 * <p>
 *  接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@Api(tags = {"百度镜像接口"})
@RestController
@Validated
@RequestMapping("/v1/machine/BaiduImages")
public class BaiduImagesRest extends BaseRest<BaiduImagesCurdServiceImpl, BaiduImages,Long, BaiduImagesResult, BaiduImagesParam, IBaiduImagesApi> implements IBaiduImagesApi{


    @Override
    public Result<Boolean> changeImageId(BatchSetBaiduDeviceImageParam batchSetBaiduDeviceImageParam) {

        return service.changeImageId(batchSetBaiduDeviceImageParam);
    }

    @Override
    protected QueryWrapper<BaiduImages> queryWrapper(BaiduImagesParam q) {
        return BaiduImages.qWrapper()
                    //
                    .idEq(q.getId())
                    //镜像名称
                    .titleEq(q.getTitle())
                    //镜像版本
                    .versionCodeEq(q.getVersionCode())
                    //
                    .rootImageFileUrlLike(q.getRootImageFileUrl())
                    //
                    .rootImageFileNameLike(q.getRootImageFileName())
                    //
                    .rootImageFileTypeEq(q.getRootImageFileType())
                    //
                    .rootImageFileMd5Eq(q.getRootImageFileMd5())
                    //
                    .systemImageFileUrlLike(q.getSystemImageFileUrl())
                    //
                    .systemImageFileNameLike(q.getSystemImageFileName())
                    //
                    .systemImageFileTypeEq(q.getSystemImageFileType())
                    //
                    .systemImageFileMd5Eq(q.getSystemImageFileMd5())
                    //
                    .odmImageFileUrlLike(q.getOdmImageFileUrl())
                    //
                    .odmImageFileNameLike(q.getOdmImageFileName())
                    //
                    .odmImageFileTypeEq(q.getOdmImageFileType())
                    //
                    .odmImageFileMd5Eq(q.getOdmImageFileMd5())
                    //
                    .vendorImageFileUrlLike(q.getVendorImageFileUrl())
                    //
                    .vendorImageFileNameLike(q.getVendorImageFileName())
                    //
                    .vendorImageFileTypeEq(q.getVendorImageFileType())
                    //
                    .vendorImageFileMd5Eq(q.getVendorImageFileMd5())
                    //设备类型（3399，3288，3588，Ampere32，845，865）
                    .serverTypeEq(q.getServerType())
                    //系统版本（android6.0，android8.1，，android10.0，android12.0）
                    .romVersionEq(q.getRomVersion())
                    //创建时间
                    .createTimeGe(q.getCreateTime())
                    //创建时间结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                    //镜像版本id
                    .imageVersionIdEq(q.getImageVersionId())
                    //
                    .lastUpdateTimeGe(q.getLastUpdateTime())
                    //结束范围值
                    .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                ;
    }

}