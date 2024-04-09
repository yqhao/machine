package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.machine.dao.entity.McMoveJobs;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.machine.dao.service.IMcMoveJobsService;
import org.springframework.stereotype.Service;
import java.util.Date;

/**
 * <p>
 *  接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
@Service
public class McMoveJobsCurdServiceImpl extends CurdService<McMoveJobs, Long,IMcMoveJobsService> {


    @Override
    protected QueryWrapper<McMoveJobs> queryPageWrapper(McMoveJobs q) {
        return q.queryWrapper()
                    .idEq()//
                    .fkMcMoveDeviceIdEq()//
                    .exportRequestParamLike()//
                    .exportJobIdEq()//
                    .exportJobResultLike()//
                    .exportStartTimeGe()//
                    .exportEndTimeGe()//
                    .importRequestParamLike()//
                    .importJobIdEq()//
                    .importJobResultLike()//
                    .importStartTimeGe()//
                    .importEndTimeGe()//
                    .createTimeGe()//
                    .lastUpdateTimeGe()//
                ;
    }

    @Override
    protected Page<McMoveJobs> pageQuery(PageSet pageSet, QueryWrapper<McMoveJobs> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()),queryWrapper);
    }
}