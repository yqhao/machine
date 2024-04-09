package com.suqi.center.machine.service.rest;

import com.suqi.center.machine.dao.entity.TencentResetRecord;
import com.suqi.center.machine.api.dto.request.TencentResetRecordParam;
import com.suqi.center.machine.api.dto.response.TencentResetRecordResult;
import com.suqi.center.machine.api.query.ITencentResetRecordApi;
import com.suqi.center.machine.biz.service.impl.TencentResetRecordCurdServiceImpl;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

/**
 * <p>
 * 腾讯云机重置记录 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
@Api(tags = {"腾讯云机重置记录接口"})
@RestController
@Validated
@RequestMapping("/v1/machine/TencentResetRecord")
public class TencentResetRecordRest extends BaseRest<TencentResetRecordCurdServiceImpl, TencentResetRecord,Long, TencentResetRecordResult, TencentResetRecordParam, ITencentResetRecordApi> implements ITencentResetRecordApi{


    @Override
    protected QueryWrapper<TencentResetRecord> queryWrapper(TencentResetRecordParam q) {
        return TencentResetRecord.qWrapper()
                    //
                    .idEq(q.getId())
                    //
                    .fkTencentDeviceIdEq(q.getFkTencentDeviceId())
                    //腾讯云机id
                    .instanceIdEq(q.getInstanceId())
                    //
                    .fkTencentImagesIdEq(q.getFkTencentImagesId())
                    //镜像版本
                    .versionCodeEq(q.getVersionCode())
                    //镜像名称
                    .titleEq(q.getTitle())
                    //重置前镜像版本id
                    .oldImageIdEq(q.getOldImageId())
                    //当前重置镜像版本id
                    .resetImageIdEq(q.getResetImageId())
                    //
                    .resetUserIdEq(q.getResetUserId())
                    //重置时间
                    .createTimeGe(q.getCreateTime())
                    //重置时间结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                ;
    }
}