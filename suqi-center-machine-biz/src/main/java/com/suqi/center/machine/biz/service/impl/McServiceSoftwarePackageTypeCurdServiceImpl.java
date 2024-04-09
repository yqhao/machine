package com.suqi.center.machine.biz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackageType;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.machine.dao.viz.service.IMcServiceSoftwarePackageTypeService;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * <p>
 * 云机端软件包类型表 接口
 * </p>
 *
 * @author 18374
 * @since 2023-07-25
 */
@Service
@DS(DBConstants.SHARDING)
public class McServiceSoftwarePackageTypeCurdServiceImpl extends CurdService<McServiceSoftwarePackageType, Long,IMcServiceSoftwarePackageTypeService> {

    public McServiceSoftwarePackageTypeCurdServiceImpl() {
        super((e, id) -> {
            e.setId(id);
            e.setStatus(-50);
            e.setLastUpdateTime(new Date());
        });
    }

    @Override
    protected QueryWrapper<McServiceSoftwarePackageType> queryPageWrapper(McServiceSoftwarePackageType q) {
        return q.queryWrapper()
                    .idEq()//记录id自动增长
                    .nameEq()//类型名称
                    .statusEq()//状态(-50：删除，50：正常)
                    .createTimeGe()//创建时间
                    .lastUpdateTimeGe()//最后修改时间
                ;
    }

    @Override
    protected Page<McServiceSoftwarePackageType> pageQuery(PageSet pageSet, QueryWrapper<McServiceSoftwarePackageType> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()),queryWrapper);
    }
}