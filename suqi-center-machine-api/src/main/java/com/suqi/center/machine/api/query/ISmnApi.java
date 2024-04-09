package com.suqi.center.machine.api.query;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.GpuUsageStatusAlarmParam;
import com.suqi.center.machine.api.dto.request.SmnLackOfSpaceWarningParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @AUTHOR: oyxueyi
 * @PACKAGE_NAME: com.suqi.center.machine.api
 * @NAME: ISmnApi
 * @DATE: 2023/5/6 16:11
 * @PROJECT_NAME: suqi-application-backendapi
 * @Description:
 */
@Api(tags = {"SMN 告警接口服务"})
@FeignClient(
        name = "suqi-center-machine",
        path = "/v1/machine/smn"
)
public interface ISmnApi {

    /**
     * 旧版本的cpu预警 废弃但是还是保留 命名有问题 实际是cpu告警
     * @param smnAlarmRequest
     * @return
     */
    @Deprecated
    @PostMapping("/gpu/alarm")
    Result<Boolean> gpuAlarm(@RequestBody SmnLackOfSpaceWarningParam smnAlarmRequest);

    /**
     * CPU告警
     * @param smnAlarmRequest
     * @return
     */
    @ApiOperation(value = "【SMN 告警】-CPU告警", notes = "【SMN 告警】-CPU告警")
    @PostMapping(value = "/cpu/alarm", produces = "application/json")
    Result<Boolean> cpuAlarm(@RequestBody SmnLackOfSpaceWarningParam smnAlarmRequest);

    /**
     * 运行内存告警
     * @param smnAlarmRequest
     * @return
     */
    @ApiOperation(value = "【SMN 告警】-运行内存告警", notes = "【SMN 告警】-运行内存告警")
    @PostMapping(value = "/run/memory/alarm", produces = "application/json")
    Result<Boolean> runMemoryAlarm(@RequestBody SmnLackOfSpaceWarningParam smnAlarmRequest);

    @PostMapping("/gpu/usage/status/alarm")
    Result<Boolean> gpuUsageStatusAlarm(@RequestBody GpuUsageStatusAlarmParam gpuUsageStatusAlarmParam);

}
