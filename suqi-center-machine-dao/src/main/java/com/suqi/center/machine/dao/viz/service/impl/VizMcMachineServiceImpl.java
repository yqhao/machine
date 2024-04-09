package com.suqi.center.machine.dao.viz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.dto.MachinePageDto;
import com.suqi.center.machine.dao.viz.entity.VizMcMachine;
import com.suqi.center.machine.dao.viz.mapper.VizMcMachineMapper;
import com.suqi.center.machine.dao.viz.service.IVizMcMachineService;
import com.suqi.center.machine.dao.viz.vo.MachinePageVo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 机器基础信息表 服务实现类
 * </p>
 *
 * @author 18374
 * @since 2023-10-11
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class VizMcMachineServiceImpl extends ServiceImpl<VizMcMachineMapper, VizMcMachine> implements IVizMcMachineService {

    @Override
    public Page<MachinePageVo> pageList(MachinePageDto param) {
        Page<MachinePageVo> page = new Page<>(param.getPageNo(), param.getPageSize());
        return baseMapper.listPage(param, page);
    }

    @Override
    public Page<VizMcMachine> quickPageById(boolean queryTotals, Page<VizMcMachine> page, long lastId, QueryWrapper<VizMcMachine> wrapper) {
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
    public Page<VizMcMachine> quickPage(Page<VizMcMachine> page, QueryWrapper<VizMcMachine> wrapper) {
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
