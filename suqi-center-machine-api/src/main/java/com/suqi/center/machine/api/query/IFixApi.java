package com.suqi.center.machine.api.query;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.reponse.ReserveNumberResult;
import com.suqi.center.machine.api.dto.request.ReserveNumberParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 开放式云手机独有接口
 * @version 1.0
 * @date 2023/5/19 11:40
 */
@Api(tags = {"开放式云手机独有接口"}, produces = "application/json")
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/fix",
        url = ""
)
public interface IFixApi {


    @PostMapping("/reserve/number")
    @ApiOperation(value = "获取商户库存数", notes = "用于查询当前商户剩余库存数和库存数量")
    Result<ReserveNumberResult> reserveNumber(@RequestBody ReserveNumberParam param);

}
