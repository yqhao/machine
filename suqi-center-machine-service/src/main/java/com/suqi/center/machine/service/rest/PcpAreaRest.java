package com.suqi.center.machine.service.rest;

import com.suqi.center.common.dto.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.dao.entity.PcpArea;
import com.suqi.center.machine.api.dto.request.PcpAreaParam;
import com.suqi.center.machine.api.dto.reponse.PcpAreaResult;
import com.suqi.center.machine.api.query.IPcpAreaApi;
import com.suqi.center.machine.biz.service.impl.PcpAreaCurdServiceImpl;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

/**
 * <p>
 * pcp区域表（pcp_area） 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@Api(tags = {"pcp区域表（pcp_area）接口"})
@RestController
@RequestMapping("/v1/machine/PcpArea")
public class PcpAreaRest extends BaseRest<PcpAreaCurdServiceImpl, PcpArea,Long, PcpAreaResult, PcpAreaParam, IPcpAreaApi> {


    @Override
    protected QueryWrapper<PcpArea> queryWrapper(PcpAreaParam q) {
        return PcpArea.qWrapper()
                    //
                    .idEq(q.getId())
                    //
                    .nameEq(q.getName())
                    //经度
                    .lngEq(q.getLng())
                    //纬度
                    .latEq(q.getLat())
                    //
                    .codeEq(q.getCode())
                    //区域
                    .regionLike(q.getRegion())
                ;
    }
}