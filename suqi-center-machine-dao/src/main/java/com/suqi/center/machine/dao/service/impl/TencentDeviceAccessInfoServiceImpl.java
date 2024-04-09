package com.suqi.center.machine.dao.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.entity.TencentDeviceAccessInfo;
import com.suqi.center.machine.dao.mapper.TencentDeviceAccessInfoMapper;
import com.suqi.center.machine.dao.service.ITencentDeviceAccessInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

/**
 * <p>
 * 腾讯设备公网映射表 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2023-06-14
 */
@Service
@Primary
public class TencentDeviceAccessInfoServiceImpl extends ServiceImpl<TencentDeviceAccessInfoMapper, TencentDeviceAccessInfo> implements ITencentDeviceAccessInfoService {

    @Override
    public Page<TencentDeviceAccessInfo> quickPageById(boolean queryTotals, Page<TencentDeviceAccessInfo> page, long lastId, QueryWrapper<TencentDeviceAccessInfo> wrapper) {
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
    public Page<TencentDeviceAccessInfo> quickPage(Page<TencentDeviceAccessInfo> page, QueryWrapper<TencentDeviceAccessInfo> wrapper) {
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
