package com.suqi.center.machine.service.rest;

import com.suqi.center.machine.dao.entity.McMoveJobs;
import com.suqi.center.machine.api.dto.request.McMoveJobsParam;
import com.suqi.center.machine.api.dto.response.McMoveJobsResult;
import com.suqi.center.machine.api.query.IMcMoveJobsApi;
import com.suqi.center.machine.biz.service.impl.McMoveJobsCurdServiceImpl;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

/**
 * <p>
 *  接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
@Api(tags = {"换机任务接口"})
@RestController
@Validated
@RequestMapping("/v1/machine/McMoveJobs")
public class McMoveJobsRest extends BaseRest<McMoveJobsCurdServiceImpl, McMoveJobs,Long, McMoveJobsResult, McMoveJobsParam, IMcMoveJobsApi> implements IMcMoveJobsApi{


    @Override
    protected QueryWrapper<McMoveJobs> queryWrapper(McMoveJobsParam q) {
        return McMoveJobs.qWrapper()
                    //
                    .idEq(q.getId())
                    //
                    .fkMcMoveDeviceIdEq(q.getFkMcMoveDeviceId())
                    //
                    .exportRequestParamLike(q.getExportRequestParam())
                    //
                    .exportJobIdEq(q.getExportJobId())
                    //
                    .exportJobResultLike(q.getExportJobResult())
                    //
                    .exportStartTimeGe(q.getExportStartTime())
                    //结束范围值
                    .exportStartTimeLe(q.getQueryEndExportStartTime())
                    //
                    .exportEndTimeGe(q.getExportEndTime())
                    //结束范围值
                    .exportEndTimeLe(q.getQueryEndExportEndTime())
                    //
                    .importRequestParamLike(q.getImportRequestParam())
                    //
                    .importJobIdEq(q.getImportJobId())
                    //
                    .importJobResultLike(q.getImportJobResult())
                    //
                    .importStartTimeGe(q.getImportStartTime())
                    //结束范围值
                    .importStartTimeLe(q.getQueryEndImportStartTime())
                    //
                    .importEndTimeGe(q.getImportEndTime())
                    //结束范围值
                    .importEndTimeLe(q.getQueryEndImportEndTime())
                    //
                    .createTimeGe(q.getCreateTime())
                    //结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                    //
                    .lastUpdateTimeGe(q.getLastUpdateTime())
                    //结束范围值
                    .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                ;
    }
}