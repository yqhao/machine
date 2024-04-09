package com.suqi.center.machine.service.rest;

import com.suqi.center.machine.dao.entity.BaiduResetRecord;
import com.suqi.center.machine.api.dto.request.BaiduResetRecordParam;
import com.suqi.center.machine.api.dto.response.BaiduResetRecordResult;
import com.suqi.center.machine.api.query.IBaiduResetRecordApi;
import com.suqi.center.machine.biz.service.impl.BaiduResetRecordCurdServiceImpl;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

/**
 * <p>
 * 百度云机重置记录 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
@Api(tags = {"百度云机重置记录接口"})
@RestController
@Validated
@RequestMapping("/v1/machine/BaiduResetRecord")
public class BaiduResetRecordRest extends BaseRest<BaiduResetRecordCurdServiceImpl, BaiduResetRecord,Long, BaiduResetRecordResult, BaiduResetRecordParam, IBaiduResetRecordApi> implements IBaiduResetRecordApi{


    @Override
    protected QueryWrapper<BaiduResetRecord> queryWrapper(BaiduResetRecordParam q) {
        return BaiduResetRecord.qWrapper()
                    //
                    .idEq(q.getId())
                    //
                    .fkBaiduDeviceIdEq(q.getFkBaiduDeviceId())
                    //百度云机id
                    .codeEq(q.getCode())
                    //
                    .fkBaiduImagesIdEq(q.getFkBaiduImagesId())
                    //镜像版本
                    .versionCodeEq(q.getVersionCode())
                    //镜像名称
                    .titleEq(q.getTitle())
                    //重置前镜像版本id
                    .oldImageVersionIdEq(q.getOldImageVersionId())
                    //当前重置镜像版本id
                    .resetImageVersionIdEq(q.getResetImageVersionId())
                    //
                    .resetUserIdEq(q.getResetUserId())
                    //重置时间
                    .createTimeGe(q.getCreateTime())
                    //重置时间结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                ;
    }
}