package com.suqi.center.machine.service.viz.rest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.api.viz.dto.request.McServiceSoftwarePackageTypeParam;
import com.suqi.center.machine.api.viz.dto.response.McServiceSoftwarePackageTypeResult;
import com.suqi.center.machine.api.viz.query.IVizMcServiceSoftwarePackageTypeApi;
import com.suqi.center.machine.biz.service.impl.McServiceSoftwarePackageTypeCurdServiceImpl;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackageType;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 云机端软件包类型表 接口
 * </p>
 *
 * @author 18374
 * @since 2023-07-25
 */
@Api(tags = {"云机端软件包类型表接口"})
@RestController
@Validated
@RequestMapping("/viz/v1/machine/McServiceSoftwarePackageType")
public class VizMcServiceSoftwarePackageTypeRest extends BaseRest<McServiceSoftwarePackageTypeCurdServiceImpl, McServiceSoftwarePackageType,Long, McServiceSoftwarePackageTypeResult, McServiceSoftwarePackageTypeParam, IVizMcServiceSoftwarePackageTypeApi> implements IVizMcServiceSoftwarePackageTypeApi{


    @Override
    protected QueryWrapper<McServiceSoftwarePackageType> queryWrapper(McServiceSoftwarePackageTypeParam q) {
        return McServiceSoftwarePackageType.qWrapper()
                    //记录id自动增长
                    .idEq(q.getId())
                    //类型名称
                    .nameEq(q.getName())
                    //状态(-50：删除，50：正常)
                    .statusEq(q.getStatus())
                    //创建时间
                    .createTimeGe(q.getCreateTime())
                    //创建时间结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                    //最后修改时间
                    .lastUpdateTimeGe(q.getLastUpdateTime())
                    //最后修改时间结束范围值
                    .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                ;
    }
}