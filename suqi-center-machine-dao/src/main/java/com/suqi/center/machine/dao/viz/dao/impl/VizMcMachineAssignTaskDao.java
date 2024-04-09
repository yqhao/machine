package com.suqi.center.machine.dao.viz.dao.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.dao.IVizMcMachineAssignTaskDao;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineAssignTaskEo;
import com.suqi.center.machine.dao.viz.mapper.VizMcMachineAssignTaskMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 【可视化】机器分配任务表 服务实现类
 * </p>
 *
 * @author Administrator
 * @since 2023-10-16
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class VizMcMachineAssignTaskDao extends ServiceImpl<VizMcMachineAssignTaskMapper, VizMcMachineAssignTaskEo> implements IVizMcMachineAssignTaskDao {

    @Override
    public Page<VizMcMachineAssignTaskEo> quickPageById(boolean queryTotals, Page<VizMcMachineAssignTaskEo> page, long lastId, QueryWrapper<VizMcMachineAssignTaskEo> wrapper) {
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
    public Page<VizMcMachineAssignTaskEo> quickPage(Page<VizMcMachineAssignTaskEo> page, QueryWrapper<VizMcMachineAssignTaskEo> wrapper) {
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
