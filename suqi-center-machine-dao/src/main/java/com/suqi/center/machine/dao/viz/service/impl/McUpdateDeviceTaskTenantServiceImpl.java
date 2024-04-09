package com.suqi.center.machine.dao.viz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.dto.McUpdateDeviceTaskTenantListDto;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskTenant;
import com.suqi.center.machine.dao.viz.mapper.McUpdateDeviceTaskTenantMapper;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceTaskService;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceTaskTenantService;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskInfoVo;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskTenantListVo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 租户更新机器任务表 服务实现类
 * </p>
 *
 * @author 18374
 * @since 2023-08-16
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class McUpdateDeviceTaskTenantServiceImpl extends ServiceImpl<McUpdateDeviceTaskTenantMapper, McUpdateDeviceTaskTenant> implements IMcUpdateDeviceTaskTenantService {

    @Resource
    private IMcUpdateDeviceTaskService iMcUpdateDeviceTaskService;

    @Override
    public Page<McUpdateDeviceTaskTenantListVo> listPage(McUpdateDeviceTaskTenantListDto param) {
        Page<McUpdateDeviceTaskTenantListVo> page = new Page<>(param.getCurrent(), param.getSize());
        return baseMapper.listPage(param, page);
    }

    @Override
    public Page<McUpdateDeviceTaskTenant> quickPageById(boolean queryTotals, Page<McUpdateDeviceTaskTenant> page, long lastId, QueryWrapper<McUpdateDeviceTaskTenant> wrapper) {
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
    public Page<McUpdateDeviceTaskTenant> quickPage(Page<McUpdateDeviceTaskTenant> page, QueryWrapper<McUpdateDeviceTaskTenant> wrapper) {
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

    @Override
    public Boolean checkTaskRepeat(Long fkTenantId, Long fkMcUpdateDeviceTaskId) {
        McUpdateDeviceTaskInfoVo info = iMcUpdateDeviceTaskService.info(fkMcUpdateDeviceTaskId);
        return baseMapper.checkTaskRepeat(fkTenantId, info.getFkMcServiceSoftwarePackageTypeId(), info.getSupplierType()) > 0;
    }
}
