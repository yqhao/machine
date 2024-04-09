package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.machine.dao.entity.BaiduResetRecord;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.machine.dao.service.IBaiduResetRecordService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 百度云机重置记录 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
@Service
public class BaiduResetRecordCurdServiceImpl extends CurdService<BaiduResetRecord, Long, IBaiduResetRecordService> {

    @Override
    protected QueryWrapper<BaiduResetRecord> queryPageWrapper(BaiduResetRecord q) {
        return q.queryWrapper().//
        idEq().//
        fkBaiduDeviceIdEq().//百度云机id
        codeEq().//
        fkBaiduImagesIdEq().//镜像版本
        versionCodeEq().//镜像名称
        titleEq().//重置前镜像版本id
        oldImageVersionIdEq().//当前重置镜像版本id
        resetImageVersionIdEq().//
        resetUserIdEq().//
        responseLike().//重置时间
        createTimeGe();
    }

    @Override
    protected Page<BaiduResetRecord> pageQuery(PageSet pageSet, QueryWrapper<BaiduResetRecord> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()), queryWrapper);
    }
}
