package com.suqi.center.machine.dao.viz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtask;
import com.suqi.center.machine.dao.viz.mapper.McUpdateDeviceSubtaskMapper;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceSubtaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

/**
 * <p>
 * 更新机器子任务表 服务实现类
 * </p>
 *
 * @author 18374
 * @since 2023-08-14
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class McUpdateDeviceSubtaskServiceImpl extends ServiceImpl<McUpdateDeviceSubtaskMapper, McUpdateDeviceSubtask> implements IMcUpdateDeviceSubtaskService {

    @Override
    public Page<McUpdateDeviceSubtask> quickPageById(boolean queryTotals, Page<McUpdateDeviceSubtask> page, long lastId, QueryWrapper<McUpdateDeviceSubtask> wrapper) {
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
    public Page<McUpdateDeviceSubtask> quickPage(Page<McUpdateDeviceSubtask> page, QueryWrapper<McUpdateDeviceSubtask> wrapper) {
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
