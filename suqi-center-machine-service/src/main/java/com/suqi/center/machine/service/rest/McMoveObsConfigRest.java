package com.suqi.center.machine.service.rest;

import com.suqi.center.machine.dao.entity.McMoveObsConfig;
import com.suqi.center.machine.api.dto.request.McMoveObsConfigParam;
import com.suqi.center.machine.api.dto.response.McMoveObsConfigResult;
import com.suqi.center.machine.api.query.IMcMoveObsConfigApi;
import com.suqi.center.machine.biz.service.impl.McMoveObsConfigCurdServiceImpl;
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
 * @since 2023-09-25
 */
@Api(tags = {"接口"})
@RestController
@Validated
@RequestMapping("/v1/machine/McMoveObsConfig")
public class McMoveObsConfigRest extends BaseRest<McMoveObsConfigCurdServiceImpl, McMoveObsConfig,Long, McMoveObsConfigResult, McMoveObsConfigParam, IMcMoveObsConfigApi> implements IMcMoveObsConfigApi{


    @Override
    protected QueryWrapper<McMoveObsConfig> queryWrapper(McMoveObsConfigParam q) {
        return McMoveObsConfig.qWrapper()
                    //
                    .idEq(q.getId())
                    //商户id(0：系统，其它商户自定义）
                    .fkMemberIdEq(q.getFkMemberId())
                    //区域id
                    .fkPcpAreaIdEq(q.getFkPcpAreaId())
                    //区域名称
                    .areaNameEq(q.getAreaName())
                    //桶名称
                    .bucketNameEq(q.getBucketName())
                    //包含路径
                    .moveIncludeFilesLike(q.getMoveIncludeFiles())
                    //排除路径
                    .moveExcludeFilesLike(q.getMoveExcludeFiles())
                    //状态(-50：删除，50：正常)
                    .statusEq(q.getStatus())
                    //创建时间
                    .createTimeGe(q.getCreateTime())
                    //创建时间结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                    //修改时间
                    .lastUpdateTimeGe(q.getLastUpdateTime())
                    //修改时间结束范围值
                    .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                ;
    }
}