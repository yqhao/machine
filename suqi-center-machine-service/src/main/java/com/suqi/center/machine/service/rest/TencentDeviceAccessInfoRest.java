package com.suqi.center.machine.service.rest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.common.dto.Page;
import com.suqi.center.common.dto.PageQueryParamBody;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.reponse.TencentDeviceAccessInfoResult;
import com.suqi.center.machine.api.dto.request.TencentDeviceAccessInfoParam;
import com.suqi.center.machine.api.query.ITencentDeviceAccessInfoApi;
import com.suqi.center.machine.biz.service.impl.TencentDeviceAccessInfoCurdServiceImpl;
import com.suqi.center.machine.dao.entity.TencentDeviceAccessInfo;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 腾讯设备公网映射表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@Api(tags = {"腾讯设备公网映射表接口"})
@RestController
@RequestMapping("/v1/machine/TencentDeviceAccessInfo")
@Validated
public class TencentDeviceAccessInfoRest extends BaseRest<TencentDeviceAccessInfoCurdServiceImpl, TencentDeviceAccessInfo,Long, TencentDeviceAccessInfoResult, TencentDeviceAccessInfoParam, ITencentDeviceAccessInfoApi> implements ITencentDeviceAccessInfoApi{


    @Override
    protected QueryWrapper<TencentDeviceAccessInfo> queryWrapper(TencentDeviceAccessInfoParam q) {
        return TencentDeviceAccessInfo.qWrapper()
                    //
                    .idEq(q.getId())
                    //腾讯设备Id
                    .fkTencentDeviceIdEq(q.getFkTencentDeviceId())
                    //实例ID
                    .instanceIdEq(q.getInstanceId())
                    //云手机服务内网IP
                    .serverIpEq(q.getServerIp())
                    //云手机服务监听端口
                    .serverPortEq(q.getServerPort())
                    //云手机服务公网映射 IP
                    .publicIpEq(q.getPublicIp())
                    //云手机服务公网映射端口
                    .publicPortEq(q.getPublicPort())
                    //云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）
                    .ispEq(q.getIsp())
                    //创建时间
                    .createTimeGe(q.getCreateTime())
                    //创建时间结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                    //最后修改时间
                    .lastUpdateTimeGe(q.getLastUpdateTime())
                    //最后修改时间结束范围值
                    .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                ;
    }

    @Override
    public Result<Page<String>> publicIpPage(PageQueryParamBody<String> params) {
        return service.publicIpPage(params.getP(),params.getPageSet());
    }
}