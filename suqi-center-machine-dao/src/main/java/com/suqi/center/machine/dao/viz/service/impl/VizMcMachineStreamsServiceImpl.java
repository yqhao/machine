package com.suqi.center.machine.dao.viz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineStreams;
import com.suqi.center.machine.dao.viz.mapper.VizMcMachineStreamsMapper;
import com.suqi.center.machine.dao.viz.service.IVizMcMachineStreamsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

/**
 * <p>
 * 机器streaming端口映射 服务实现类
 * </p>
 *
 * @author 18374
 * @since 2023-10-10
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class VizMcMachineStreamsServiceImpl extends ServiceImpl<VizMcMachineStreamsMapper, VizMcMachineStreams> implements IVizMcMachineStreamsService {

    @Override
    public Page<VizMcMachineStreams> quickPageById(boolean queryTotals, Page<VizMcMachineStreams> page, long lastId, QueryWrapper<VizMcMachineStreams> wrapper) {
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
    public Page<VizMcMachineStreams> quickPage(Page<VizMcMachineStreams> page, QueryWrapper<VizMcMachineStreams> wrapper) {
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
