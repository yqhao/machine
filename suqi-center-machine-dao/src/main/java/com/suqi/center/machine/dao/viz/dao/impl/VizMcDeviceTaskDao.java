package com.suqi.center.machine.dao.viz.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.viz.entity.VizMcDeviceTaskEo;
import com.suqi.center.machine.dao.viz.mapper.VizMcDeviceTaskMapper;
import com.suqi.center.machine.dao.viz.dao.IVizMcDeviceTaskDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.machine.dao.constants.DBConstants;

/**
 * <p>
 * 机器任务表 服务实现类
 * </p>
 *
 * @author 18374
 * @since 2023-10-20
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class VizMcDeviceTaskDao extends ServiceImpl<VizMcDeviceTaskMapper, VizMcDeviceTaskEo> implements IVizMcDeviceTaskDao {

    @Override
    public Page<VizMcDeviceTaskEo> quickPageById(boolean queryTotals, Page<VizMcDeviceTaskEo> page, long lastId, QueryWrapper<VizMcDeviceTaskEo> wrapper) {
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
    public Page<VizMcDeviceTaskEo> quickPage(Page<VizMcDeviceTaskEo> page, QueryWrapper<VizMcDeviceTaskEo> wrapper) {
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
