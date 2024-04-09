package com.suqi.center.machine.service.rest;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.StatisticsDistributableNumParam;
import com.suqi.center.machine.api.dto.response.StatisticsDistributableNumResult;
import com.suqi.center.machine.api.query.IMachineStatisticsApi;
import com.suqi.center.machine.biz.service.MachineStatisticsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @date 2023/9/6 17:39
 */
@RestController
@RequestMapping("/v1/machine/statistics/")
public class MachineStatisticsRest extends BaseApiController implements IMachineStatisticsApi {

    @Resource
    MachineStatisticsService machineStatisticsService;

    @Override
    public Result<StatisticsDistributableNumResult> getDistributableNum(StatisticsDistributableNumParam param) {
        return rest(()->machineStatisticsService.getDistributableNum(param));
    }
}
