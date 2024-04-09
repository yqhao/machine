package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.machine.dao.entity.McMoveObsConfig;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.machine.dao.service.IMcMoveObsConfigService;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * <p>
 *  接口
 * </p>
 *
 * @author PC001
 * @since 2023-09-25
 */
@Service
public class McMoveObsConfigCurdServiceImpl extends CurdService<McMoveObsConfig, Long,IMcMoveObsConfigService> {

    public McMoveObsConfigCurdServiceImpl() {
        super((e, id) -> {
            e.setId(id);
            e.setStatus(-50);
            e.setLastUpdateTime(new Date());
        });
    }

    @Override
    protected QueryWrapper<McMoveObsConfig> queryPageWrapper(McMoveObsConfig q) {
        return q.queryWrapper()
                    .idEq()//
                    .fkMemberIdEq()//商户id(0：系统，其它商户自定义）
                    .fkPcpAreaIdEq()//区域id
                    .areaNameEq()//区域名称
                    .bucketNameEq()//桶名称
                    .moveIncludeFilesLike()//包含路径
                    .moveExcludeFilesLike()//排除路径
                    .statusEq()//状态(-50：删除，50：正常)
                    .createTimeGe()//创建时间
                    .lastUpdateTimeGe()//修改时间
                ;
    }

    @Override
    protected Page<McMoveObsConfig> pageQuery(PageSet pageSet, QueryWrapper<McMoveObsConfig> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()),queryWrapper);
    }
}