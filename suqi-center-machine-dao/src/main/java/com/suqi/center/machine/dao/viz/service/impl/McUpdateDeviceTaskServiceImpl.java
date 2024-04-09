package com.suqi.center.machine.dao.viz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.dto.McUpdateDeviceTaskListDto;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTask;
import com.suqi.center.machine.dao.viz.mapper.McUpdateDeviceTaskMapper;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskInfoVo;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskListVo;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

/**
 * <p>
 * 更新机器任务表 服务实现类
 * </p>
 *
 * @author 18374
 * @since 2023-08-11
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class McUpdateDeviceTaskServiceImpl extends ServiceImpl<McUpdateDeviceTaskMapper, McUpdateDeviceTask> implements IMcUpdateDeviceTaskService {

    @Override
    public Page<McUpdateDeviceTaskListVo> listPage(McUpdateDeviceTaskListDto param) {
        Page<McUpdateDeviceTaskListVo> page = new Page<>(param.getCurrent(), param.getSize());
        return baseMapper.listPage(param, page);
    }

    @Override
    public McUpdateDeviceTaskInfoVo info(Long mcUpdateDeviceTaskId) {
        return baseMapper.info(mcUpdateDeviceTaskId);
    }

    @Override
    public Page<McUpdateDeviceTask> quickPageById(boolean queryTotals, Page<McUpdateDeviceTask> page, long lastId, QueryWrapper<McUpdateDeviceTask> wrapper) {
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
    public Page<McUpdateDeviceTask> quickPage(Page<McUpdateDeviceTask> page, QueryWrapper<McUpdateDeviceTask> wrapper) {
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
