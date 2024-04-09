package com.suqi.center.machine.api.query;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.SmnLackOfSpaceWarningParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * SMN 云机空间不足告警接口
 * @version 1.0
 * @date 2023/4/20 15:25
 */
@Api(tags = {"SMN 云机空间不足告警接口服务"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/smn/lack/space/warning",
        url = ""
)
public interface ISmnLackOfSpaceWarningApi {

    @PostMapping("/warning")
    @ApiOperation(value = "根据告警值进行平台规则判断处理告警", notes = "根据告警值进行平台规则判断处理告警")
    Result<Boolean> smnLackOfSpaceWarning(@RequestBody SmnLackOfSpaceWarningParam param);
}
