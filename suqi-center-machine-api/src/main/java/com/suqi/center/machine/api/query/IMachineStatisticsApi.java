package com.suqi.center.machine.api.query;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.StatisticsDistributableNumParam;
import com.suqi.center.machine.api.dto.response.StatisticsDistributableNumResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @version 1.0
 * @date 2023/9/6 17:16
 */
@Api(tags = {"机器统计相关接口"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/statistics/",
        url = ""
)
public interface IMachineStatisticsApi {

    @PostMapping("/get/distributable/num")
    @ApiOperation(value = "获取当前可分配云机数量",notes = "获取当前可分配云机数量")
    Result<StatisticsDistributableNumResult> getDistributableNum(@RequestBody StatisticsDistributableNumParam param);

}
