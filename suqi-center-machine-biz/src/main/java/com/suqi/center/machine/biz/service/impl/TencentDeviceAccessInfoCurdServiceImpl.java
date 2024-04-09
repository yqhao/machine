package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.common.dto.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.dao.entity.TencentDeviceAccessInfo;
import com.suqi.center.machine.dao.service.ITencentDeviceAccessInfoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 腾讯设备公网映射表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-09
 */
@Service
public class TencentDeviceAccessInfoCurdServiceImpl extends CurdService<TencentDeviceAccessInfo, Long, ITencentDeviceAccessInfoService> {

    public Result<Page<String>> publicIpPage(String p, PageSet pageSet) {
        com.baomidou.mybatisplus.extension.plugins.pagination.Page<TencentDeviceAccessInfo> page = new com.baomidou.mybatisplus.extension.plugins.pagination.Page<>(pageSet.getPageNo(), pageSet.getPageSize());
        com.baomidou.mybatisplus.extension.plugins.pagination.Page<TencentDeviceAccessInfo> r = daoService.quickPage(page, e -> e.selectColumns(c->c.distinct().publicIp()).publicIpLike(p));
        Page<String> data = pageSet.page();
        data.setTotalCount(r.getTotal());
        List<TencentDeviceAccessInfo> records = r.getRecords();
        if(records!=null) {
            data.setResult(records.stream().map(TencentDeviceAccessInfo::getPublicIp).collect(Collectors.toList()));
        }
        return Result.data(data);
    }

    @Override
    protected QueryWrapper<TencentDeviceAccessInfo> queryPageWrapper(TencentDeviceAccessInfo q) {
        return q.queryWrapper().//
        idEq().//腾讯设备Id
        fkTencentDeviceIdEq().//实例ID
        instanceIdEq().//云手机服务内网IP
        serverIpEq().//云手机服务监听端口
        serverPortEq().//云手机服务公网映射 IP
        publicIpEq().//云手机服务公网映射端口
        publicPortEq().//云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）
        ispEq().//创建时间
        createTimeGe().//最后修改时间
        lastUpdateTimeGe();
    }

}
