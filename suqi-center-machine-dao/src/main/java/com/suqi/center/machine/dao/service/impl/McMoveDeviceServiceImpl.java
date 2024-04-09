package com.suqi.center.machine.dao.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.center.machine.dao.mapper.McMoveDeviceMapper;
import com.suqi.center.machine.dao.service.IMcMoveDeviceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.wrapper.McMoveDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.McMoveDeviceUpdateWrapper;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.machine.dao.constants.DBConstants;

import java.util.List;
import java.util.function.Consumer;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class McMoveDeviceServiceImpl extends ServiceImpl<McMoveDeviceMapper, McMoveDevice> implements IMcMoveDeviceService {


    @Override
    @DS(DBConstants.SHARDING)
    public long count(Consumer<McMoveDeviceQueryWrapper> wrapperConsumer) {
        return IMcMoveDeviceService.super.count(wrapperConsumer);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public McMoveDevice selectOne(Consumer<McMoveDeviceQueryWrapper> wrapperConsumer) {
        return IMcMoveDeviceService.super.selectOne(wrapperConsumer);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public List<McMoveDevice> select(Consumer<McMoveDeviceQueryWrapper> wrapperConsumer) {
        return IMcMoveDeviceService.super.select(wrapperConsumer);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public List<McMoveDevice> list(Consumer<McMoveDeviceQueryWrapper> wrapperConsumer) {
        return IMcMoveDeviceService.super.list(wrapperConsumer);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public boolean update(Consumer<McMoveDeviceUpdateWrapper> wrapper) {
        return IMcMoveDeviceService.super.update(wrapper);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public boolean update(McMoveDevice up, Consumer<McMoveDeviceUpdateWrapper> wrapper) {
        return IMcMoveDeviceService.super.update(up, wrapper);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public boolean update(Consumer<McMoveDevice> setUp, Consumer<McMoveDeviceUpdateWrapper> wrapper) {
        return IMcMoveDeviceService.super.update(setUp, wrapper);
    }

    @Override
    @DS(DBConstants.SHARDING)
    public Page<McMoveDevice> quickPageById(boolean queryTotals, Page<McMoveDevice> page, long lastId, QueryWrapper<McMoveDevice> wrapper) {
        page.setCurrent(page.getCurrent());
        if (queryTotals) {
            long total = 0L;
            boolean overrideSelect = false;
            String sqlSelect = wrapper.getSqlSelect();
            if (sqlSelect != null && !"".equals(sqlSelect) && sqlSelect.indexOf(",") > 0) {
                wrapper.select("*");
                overrideSelect = true;
            }
            total = baseMapper.selectCount(wrapper);
            if (overrideSelect) {
                wrapper.select(sqlSelect);
            }
            page.setTotal(total);
            if (total == 0L) {
                return page;
            }
        }
        page.setRecords(baseMapper.quickPageById(page.getSize(), lastId, wrapper));
        return page;
    }

    @Override
    @DS(DBConstants.SHARDING)
    public Page<McMoveDevice> quickPage(Page<McMoveDevice> page, QueryWrapper<McMoveDevice> wrapper) {
        long total = 0L;
        boolean overrideSelect = false;
        String sqlSelect = wrapper.getSqlSelect();
        if (sqlSelect != null && !"".equals(sqlSelect) && sqlSelect.indexOf(",") > 0) {
            wrapper.select("*");
            overrideSelect = true;
        }
        total = baseMapper.selectCount(wrapper);
        if (overrideSelect) {
            wrapper.select(sqlSelect);
        }
        page.setTotal(total);
        if (total > 0L) {
            page.setRecords(baseMapper.quickPage(page.getCurrent(), page.getSize(), wrapper));
        }
        return page;
    }
}
