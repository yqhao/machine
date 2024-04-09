package com.suqi.center.machine.dao.viz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackageOssRecord;
import com.suqi.center.machine.dao.viz.mapper.McServiceSoftwarePackageOssRecordMapper;
import com.suqi.center.machine.dao.viz.service.IMcServiceSoftwarePackageOssRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;

/**
 * <p>
 * 云机端软件包对象存储记录表 服务实现类
 * </p>
 *
 * @author 18374
 * @since 2023-07-26
 */
@Service
@Primary
@DS(DBConstants.SHARDING)
public class McServiceSoftwarePackageOssRecordServiceImpl extends ServiceImpl<McServiceSoftwarePackageOssRecordMapper, McServiceSoftwarePackageOssRecord> implements IMcServiceSoftwarePackageOssRecordService {

    @Override
    public Page<McServiceSoftwarePackageOssRecord> quickPageById(boolean queryTotals, Page<McServiceSoftwarePackageOssRecord> page, long lastId, QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper) {
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
    public Page<McServiceSoftwarePackageOssRecord> quickPage(Page<McServiceSoftwarePackageOssRecord> page, QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper) {
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
