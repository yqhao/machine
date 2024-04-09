package com.suqi.center.machine.dao.viz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.dto.TaskRecordPageDto;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskRecord;
import com.suqi.center.machine.dao.viz.mapper.McUpdateDeviceTaskRecordMapper;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceTaskRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskListVo;
import com.suqi.center.machine.dao.vo.TaskRecordPageVo;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

/**
 * <p>
 * 机器更新任务记录表 服务实现类
 * </p>
 *
 * @author 18374
 * @since 2023-08-14
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class McUpdateDeviceTaskRecordServiceImpl extends ServiceImpl<McUpdateDeviceTaskRecordMapper, McUpdateDeviceTaskRecord> implements IMcUpdateDeviceTaskRecordService {

    @Override
    public Page<TaskRecordPageVo> taskRecordPage(TaskRecordPageDto param) {
        Page<McUpdateDeviceTaskListVo> page = new Page<>(param.getCurrent(), param.getSize());
        return baseMapper.taskRecordPage(param, page);
    }

    @Override
    public Page<McUpdateDeviceTaskRecord> quickPageById(boolean queryTotals, Page<McUpdateDeviceTaskRecord> page, long lastId, QueryWrapper<McUpdateDeviceTaskRecord> wrapper) {
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
    public Page<McUpdateDeviceTaskRecord> quickPage(Page<McUpdateDeviceTaskRecord> page, QueryWrapper<McUpdateDeviceTaskRecord> wrapper) {
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
