package com.suqi.center.machine.service.rest;

import com.suqi.center.common.dto.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.common.dto.Result;
import com.suqi.center.common.utils.PropUtils;
import com.suqi.center.machine.api.dto.request.BatchSetTencentDeviceImageParam;
import com.suqi.center.machine.api.query.ITencentAccountAreaApi;
import com.suqi.center.machine.dao.entity.TencentAccountArea;
import com.suqi.center.machine.dao.entity.TencentImages;
import com.suqi.center.machine.api.dto.request.TencentImagesParam;
import com.suqi.center.machine.api.dto.reponse.TencentImagesResult;
import com.suqi.center.machine.api.query.ITencentImagesApi;
import com.suqi.center.machine.biz.service.impl.TencentImagesCurdServiceImpl;
import com.suqi.center.machine.dao.service.ITencentAccountAreaService;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 腾讯镜像管理 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@Api(tags = {"腾讯镜像管理接口"})
@RestController
@RequestMapping("/v1/machine/TencentImages")
@Validated
public class TencentImagesRest extends BaseRest<TencentImagesCurdServiceImpl, TencentImages,Long, TencentImagesResult, TencentImagesParam, ITencentImagesApi> implements ITencentImagesApi {

    @Autowired
    ITencentAccountAreaService iTencentAccountAreaService;

    @Override
    protected void addEntityData(TencentImages tencentImages) {
        if (Objects.isNull(tencentImages.getCreateTime())) {
            tencentImages.setCreateTime(new Date());
        }
        if (Objects.isNull(tencentImages.getCreateUserId())) {
            tencentImages.setCreateUserId(0L);
        }
    }

    @Override
    protected void updateEntityData(TencentImages tencentImages) {
        if (Objects.isNull(tencentImages.getLastUpdateTime())) {
            tencentImages.setLastUpdateTime(new Date());
        }
        if (Objects.isNull(tencentImages.getLastUpdateId())) {
            tencentImages.setLastUpdateId(0L);
        }
    }

    @Override
    protected QueryWrapper<TencentImages> queryWrapper(TencentImagesParam q) {
        return TencentImages.qWrapper()
                    //
                    .idEq(q.getId())
                    //腾讯账号区域Id
                    .fkTencentAccountAreaIdEq(q.getFkTencentAccountAreaId())
                    //
                    .regionEq(q.getRegion())
                    //镜像名称
                    .titleLike(q.getTitle())
                    //镜像版本
                    .versionCodeEq(q.getVersionCode())
                    //镜像下载地址
                    .urlLike(q.getUrl())
                    //镜像导出文件 MD5 校验值
                    .md5Eq(q.getMd5())
                    //镜像描述
                    .imageDescriptionLike(q.getImageDescription())
                    //镜像id
                    .imageIdEq(q.getImageId())
                    //
                    .statusEq(q.getStatus())
                    //
                    .createTimeGe(q.getCreateTime())
                    //结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                    //
                    .lastUpdateTimeGe(q.getLastUpdateTime())
                    //结束范围值
                    .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                    //
                    .createUserIdEq(q.getCreateUserId())
                    //
                    .lastUpdateIdEq(q.getLastUpdateId())
                ;
    }

    @Override
    public Result<Boolean> changeImageId(BatchSetTencentDeviceImageParam batchSetTencentDeviceImageParam) {
        if (batchSetTencentDeviceImageParam.getInstanceIds() == null && batchSetTencentDeviceImageParam.getPublicIps() == null) {
            throw new RuntimeException("实例列表和公网列表必须填一个");
        }
        return service.changeImageId(batchSetTencentDeviceImageParam);
    }

    @Override
    protected Result<Page<TencentImages>> queryPageData(TencentImagesParam tencentImagesParam, PageSet pageSet) {
        Result<Page<TencentImages>> pageResult = super.queryPageData(tencentImagesParam, pageSet);
        if(pageResult!=null) {
            Page<TencentImages> data = pageResult.getData();
            if(data!=null){
                List<TencentImages> result = data.getResult();
                if(result!=null){
                    List<Long> ids = PropUtils.distinctKeys(result, TencentImages::getFkTencentAccountAreaId);
                    if(ids!=null && !ids.isEmpty()){
                        List<TencentAccountArea> areas = iTencentAccountAreaService.select(e -> e.idIn(ids));
                        if(areas!=null && !areas.isEmpty()) {
                            result.forEach(a -> a.setRegion(areas.stream().filter(b->b.getId().equals(a.getFkTencentAccountAreaId())).map(x->x.getRegion()).findFirst().orElse(null)));
                        }
                    }
                }
            }
        }

        return pageResult;
    }
}