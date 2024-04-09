package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.machine.dao.entity.TencentResetRecord;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.machine.dao.service.ITencentResetRecordService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 腾讯云机重置记录 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
@Service
public class TencentResetRecordCurdServiceImpl extends CurdService<TencentResetRecord, Long, ITencentResetRecordService> {

    @Override
    protected QueryWrapper<TencentResetRecord> queryPageWrapper(TencentResetRecord q) {
        return q.queryWrapper().//
        idEq().//
        fkTencentDeviceIdEq().//腾讯云机id
        instanceIdEq().//
        fkTencentImagesIdEq().//镜像版本
        versionCodeEq().//镜像名称
        titleEq().//重置前镜像版本id
        oldImageIdEq().//当前重置镜像版本id
        resetImageIdEq().//
        resetUserIdEq().//
        responseLike().//重置时间
        createTimeGe();
    }

    @Override
    protected Page<TencentResetRecord> pageQuery(PageSet pageSet, QueryWrapper<TencentResetRecord> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()), queryWrapper);
    }
}
