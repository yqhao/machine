package com.suqi.center.machine.service.rest;

import com.suqi.center.common.dto.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.dao.entity.TencentAccountArea;
import com.suqi.center.machine.api.dto.request.TencentAccountAreaParam;
import com.suqi.center.machine.api.dto.reponse.TencentAccountAreaResult;
import com.suqi.center.machine.api.query.ITencentAccountAreaApi;
import com.suqi.center.machine.biz.service.impl.TencentAccountAreaCurdServiceImpl;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

/**
 * <p>
 * 腾讯账号区域表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@Api(tags = {"腾讯账号区域表接口"})
@RestController
@RequestMapping("/v1/machine/TencentAccountArea")
@Validated
public class TencentAccountAreaRest extends BaseRest<TencentAccountAreaCurdServiceImpl, TencentAccountArea,Long, TencentAccountAreaResult, TencentAccountAreaParam, ITencentAccountAreaApi> {


    @Override
    protected QueryWrapper<TencentAccountArea> queryWrapper(TencentAccountAreaParam q) {
        return TencentAccountArea.qWrapper()
                    //
                    .idEq(q.getId())
                    //腾讯账号Id
                    .fkTencentAccountIdEq(q.getFkTencentAccountId())
                    //box_soc的表的主键ID[用这个id做关联]
                    .fkAccountAreaIdEq(q.getFkAccountAreaId())
                    //腾讯区域
                    .regionEq(q.getRegion())
                    //创建时间
                    .createTimeGe(q.getCreateTime())
                    //创建时间结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                    //最后修改时间
                    .lastUpdateTimeGe(q.getLastUpdateTime())
                    //最后修改时间结束范围值
                    .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                    //区域表ID
                    .fkPcpAreaIdEq(q.getFkPcpAreaId())
                ;
    }
}