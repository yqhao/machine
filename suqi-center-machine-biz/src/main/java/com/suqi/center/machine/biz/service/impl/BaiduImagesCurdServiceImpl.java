package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.common.dto.Result;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.utils.JsonUtil;
import com.suqi.center.machine.api.dto.request.BatchSetBaiduDeviceImageParam;
import com.suqi.center.machine.dao.entity.BaiduAccount;
import com.suqi.center.machine.dao.entity.BaiduDevice;
import com.suqi.center.machine.dao.entity.BaiduImages;
import com.suqi.center.machine.dao.service.IBaiduAccountService;
import com.suqi.center.machine.dao.service.IBaiduDeviceService;
import com.suqi.center.machine.dao.service.IBaiduImagesService;
import com.suqi.center.machine.dao.wrapper.BaiduImagesQueryWrapper;
import com.suqi.core.baidu.dto.BaiduAospImageUploadRequest;
import com.suqi.core.baidu.dto.BaiduAospImageUploadRequest.ImageFile;
import com.suqi.core.baidu.dto.BaiduAospImageUploadResponse;
import com.suqi.core.baidu.service.BaiduApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * <p>
 *  百度镜像接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@Service
public class BaiduImagesCurdServiceImpl extends CurdService<BaiduImages, Long, IBaiduImagesService> {

    protected static Logger log = LoggerFactory.getLogger(BaiduImagesCurdServiceImpl.class);

    @Autowired
    BaiduApiService baiduApiService;

    @Autowired
    IBaiduAccountService iBaiduAccountService;

    @Autowired
    IBaiduDeviceService iBaiduDeviceService;

    @Override
    public Result<Boolean> add(BaiduImages baiduImages) {
        log.info("百度新增镜像：{}", baiduImages);
        long count = daoService.count(baiduImages.queryWrapper().fkBaiduAccountIdEq().rootImageFileMd5Eq().systemImageFileMd5Eq().odmImageFileMd5Eq().vendorImageFileMd5Eq().statusNotIn(-50, 3));
        if (count > 0) {
            throw new BizException("镜像版本已存在");
        }
        BaiduAccount account = iBaiduAccountService.getById(baiduImages.getFkBaiduAccountId());
        BaiduAospImageUploadRequest req = BaiduAospImageUploadRequest.builder().romVersion(baiduImages.getRomVersion()).serverType(baiduImages.getServerType())
                .imageFiles(Arrays.asList(ImageFile.builder().imageFileUrl(baiduImages.getRootImageFileUrl()).imageFileName(baiduImages.getRootImageFileName()).imageFileMd5(baiduImages.getRootImageFileMd5()).imageFileType(Optional.ofNullable(baiduImages.getRootImageFileType()).orElse("root_aosp")).build(), ImageFile.builder().imageFileUrl(baiduImages.getSystemImageFileUrl()).imageFileName(baiduImages.getSystemImageFileName()).imageFileMd5(baiduImages.getSystemImageFileMd5()).imageFileType(Optional.ofNullable(baiduImages.getSystemImageFileType()).orElse("system_aosp")).build(), ImageFile.builder().imageFileUrl(baiduImages.getOdmImageFileUrl()).imageFileName(baiduImages.getOdmImageFileName()).imageFileMd5(baiduImages.getOdmImageFileMd5()).imageFileType(Optional.ofNullable(baiduImages.getOdmImageFileType()).orElse("odm_aosp")).build(), ImageFile.builder().imageFileUrl(baiduImages.getVendorImageFileUrl()).imageFileName(baiduImages.getVendorImageFileName())
                        .imageFileMd5(baiduImages.getVendorImageFileMd5()).imageFileType(Optional.ofNullable(baiduImages.getVendorImageFileType()).orElse("vendor_aosp")).build())).build();
        log.info("百度创建镜像参数：{}", JsonUtil.objectToJson(req));
        BaiduAospImageUploadResponse response = baiduApiService.imageUpload(account.getHost(), account.getBearerToken(), req);
        log.info("百度创建镜像返回：{}", JsonUtil.objectToJson(response));
        baiduImages.setImageVersionId(response.getData().getImageVersionId());
        baiduImages.setStatus(0);
        baiduImages.setCreateTime(new Date());
        daoService.save(baiduImages);
        return Result.data(true);
    }

    public BaiduImagesCurdServiceImpl() {
        super((e, id) -> {
            e.setId(id);
            e.setStatus(-50);
            e.setLastUpdateTime(new Date());
        });
    }

    @Override
    protected QueryWrapper<BaiduImages> queryPageWrapper(BaiduImages q) {
        return q.queryWrapper().//
                idEq().//百度账号id
                fkBaiduAccountIdEq().//镜像名称
                titleEq().//镜像版本
                versionCodeEq().//
                rootImageFileUrlLike().//
                rootImageFileNameLike().//
                rootImageFileTypeEq().//
                rootImageFileMd5Eq().//
                systemImageFileUrlLike().//
                systemImageFileNameLike().//
                systemImageFileTypeEq().//
                systemImageFileMd5Eq().//
                odmImageFileUrlLike().//
                odmImageFileNameLike().//
                odmImageFileTypeEq().//
                odmImageFileMd5Eq().//
                vendorImageFileUrlLike().//
                vendorImageFileNameLike().//
                vendorImageFileTypeEq().//
                vendorImageFileMd5Eq().//设备类型（3399，3288，3588，Ampere32，845，865）
                serverTypeEq().//系统版本（android6.0，android8.1，，android10.0，android12.0）
                romVersionEq().//创建时间
                createTimeGe().//镜像版本id
                imageVersionIdEq().//镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）
                statusEq().//
                lastUpdateTimeGe();
    }

    @Override
    protected Page<BaiduImages> pageQuery(PageSet pageSet, QueryWrapper<BaiduImages> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()), queryWrapper);
    }

    public Result<Boolean> changeImageId(BatchSetBaiduDeviceImageParam batchSetBaiduDeviceImageParam) {
        Result<Boolean> rs = new Result<>(false);
        String imageVersionId = batchSetBaiduDeviceImageParam.getImageVersionId();
        BaiduImages tencentImages = daoService.getBaseMapper().selectOne(BaiduImagesQueryWrapper.wrapper().imageVersionIdEq(imageVersionId));
        Integer status = tencentImages.getStatus();
        if (status == null || !status.equals(2)) {
            throw new RuntimeException("镜像状态不可使用，请等镜像创建成功后再设置云机重置镜像");
        }
        List<String> codes = batchSetBaiduDeviceImageParam.getCodes();
        List<BaiduDevice> baiduDevices = null;
        if (codes != null && !codes.isEmpty()) {
            baiduDevices = iBaiduDeviceService.select(e -> e.codeIn(codes));
        } else {
            List<String> publicIps = batchSetBaiduDeviceImageParam.getPublicIps();
            if (publicIps != null) {
                baiduDevices = iBaiduDeviceService.select(e->e.pubIpIn(publicIps));
            }
        }

        if (baiduDevices != null && !baiduDevices.isEmpty()) {
            baiduDevices.forEach(e -> {
                BaiduDevice up = new BaiduDevice();
                up.setId(e.getId());
                up.setResetImageVersionId(imageVersionId);
                up.setLastUpdateTime(new Date());
                iBaiduDeviceService.updateById(up);
            });
            rs.setData(true);
        }
        return rs;
    }
}
