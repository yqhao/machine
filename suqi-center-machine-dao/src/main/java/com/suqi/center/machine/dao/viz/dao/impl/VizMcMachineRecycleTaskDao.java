package com.suqi.center.machine.dao.viz.dao.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.dao.IVizMcMachineRecycleTaskDao;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineRecycleTaskEo;
import com.suqi.center.machine.dao.viz.mapper.VizMcMachineRecycleTaskMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 【可视化】机器回收任务表 服务实现类
 * </p>
 *
 * @author Administrator
 * @since 2023-10-17
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class VizMcMachineRecycleTaskDao extends ServiceImpl<VizMcMachineRecycleTaskMapper, VizMcMachineRecycleTaskEo> implements IVizMcMachineRecycleTaskDao {

    @Override
    public Page<VizMcMachineRecycleTaskEo> quickPageById(boolean queryTotals, Page<VizMcMachineRecycleTaskEo> page, long lastId, QueryWrapper<VizMcMachineRecycleTaskEo> wrapper) {
        page.setCurrent(page.getCurrent());
        if (queryTotals) {
            long total = 0L;
            boolean overrideSelect = false;
            wrapper.eq("dr",0);
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
    public Page<VizMcMachineRecycleTaskEo> quickPage(Page<VizMcMachineRecycleTaskEo> page, QueryWrapper<VizMcMachineRecycleTaskEo> wrapper) {
        long total = 0L;
        boolean overrideSelect = false;
        wrapper.eq("dr",0);
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
