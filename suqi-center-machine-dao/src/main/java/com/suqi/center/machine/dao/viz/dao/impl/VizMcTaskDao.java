package com.suqi.center.machine.dao.viz.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.viz.entity.VizMcTaskEo;
import com.suqi.center.machine.dao.viz.mapper.VizMcTaskMapper;
import com.suqi.center.machine.dao.viz.dao.IVizMcTaskDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.machine.dao.constants.DBConstants;

/**
 * <p>
 * 任务表 服务实现类
 * </p>
 *
 * @author 18374
 * @since 2023-10-20
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class VizMcTaskDao extends ServiceImpl<VizMcTaskMapper, VizMcTaskEo> implements IVizMcTaskDao {

    @Override
    public Page<VizMcTaskEo> quickPageById(boolean queryTotals, Page<VizMcTaskEo> page, long lastId, QueryWrapper<VizMcTaskEo> wrapper) {
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
    public Page<VizMcTaskEo> quickPage(Page<VizMcTaskEo> page, QueryWrapper<VizMcTaskEo> wrapper) {
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
