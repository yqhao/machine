package com.suqi.center.machine.api.query;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.McSmnRecordParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 华为smn消息记录相关接口
 * @version 1.0
 * @date 2023/4/19 16:12
 */
@Api(tags = {"华为smn消息记录接口服务"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/smn/record",
        url = ""
)
public interface IMcSmnRecordApi {

    @PostMapping("/save")
    @ApiOperation(value = "保存华为smn消息记录", notes = "保存华为smn消息记录")
    Result<Boolean> save(@RequestBody McSmnRecordParam param);
}
