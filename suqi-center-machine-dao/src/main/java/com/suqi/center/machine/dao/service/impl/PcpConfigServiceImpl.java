package com.suqi.center.machine.dao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.PcpConfig;
import com.suqi.center.machine.dao.mapper.PcpConfigMapper;
import com.suqi.center.machine.dao.service.IPcpConfigService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.context.annotation.Primary;

/**
 * <p>
 * 华为云配置表 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2023-05-08
 */
@Service
public class PcpConfigServiceImpl extends ServiceImpl<PcpConfigMapper, PcpConfig> implements IPcpConfigService {

    @Override
    @DS(DBConstants.SLAVE)
    public PcpConfig getPcpConfigByProjectId(String projectId) {
        LambdaQueryWrapper<PcpConfig> pcpConfigLambdaQueryWrapper = new LambdaQueryWrapper<>();
        pcpConfigLambdaQueryWrapper.eq(PcpConfig::getProjectId, projectId).last("limit 1");
        PcpConfig pcpConfig = this.getOne(pcpConfigLambdaQueryWrapper);
        return pcpConfig;
    }

    @Override
    public Page<PcpConfig> quickPageById(boolean queryTotals, Page<PcpConfig> page, long lastId, QueryWrapper<PcpConfig> wrapper) {
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
    public Page<PcpConfig> quickPage(Page<PcpConfig> page, QueryWrapper<PcpConfig> wrapper) {
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
