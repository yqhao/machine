package com.suqi.center.machine.service.rest;

import com.suqi.center.common.dto.Result;
import com.suqi.center.machine.api.dto.request.GpuUsageStatusAlarmParam;
import com.suqi.center.machine.api.dto.request.SmnLackOfSpaceWarningParam;
import com.suqi.center.machine.api.query.ISmnApi;
import com.suqi.center.machine.biz.service.ISmnService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR: oyxueyi
 * @PACKAGE_NAME: com.suqi.center.machine.service.api.impl
 * @NAME: SmnApiImpl
 * @DATE: 2023/5/6 16:12
 * @PROJECT_NAME: suqi-application-backendapi
 * @Description:
 */
@RestController
@RequestMapping("/v1/machine/smn")
public class SmnApiImpl extends BaseApiController implements ISmnApi {

    /**
     * 华为 smn 告警 service 组件
     */
    private final ISmnService smnService;

    public SmnApiImpl(ISmnService smnService) {
        this.smnService = smnService;
    }

    /**
     * 旧版本的cpu预警 废弃但是还是保留 命名有问题 实际是cpu告警
     * @param smnAlarmRequest
     * @return
     */
    @Override
    public Result<Boolean> gpuAlarm(SmnLackOfSpaceWarningParam smnAlarmRequest) {
        return Result.data(smnService.gpuAlarm(smnAlarmRequest));
    }

    /**
     * CPU告警
     *
     * @param smnAlarmRequest
     * @return
     */
    @Override
    public Result<Boolean> cpuAlarm(SmnLackOfSpaceWarningParam smnAlarmRequest) {
        return Result.data(smnService.cpuAlarm(smnAlarmRequest));
    }

    /**
     * 运行内存告警
     *
     * @param smnAlarmRequest
     * @return
     */
    @Override
    public Result<Boolean> runMemoryAlarm(SmnLackOfSpaceWarningParam smnAlarmRequest) {
        return Result.data(smnService.runMemoryAlarm(smnAlarmRequest));
    }

    @Override
    public Result<Boolean> gpuUsageStatusAlarm(GpuUsageStatusAlarmParam gpuUsageStatusAlarmParam) {
        return rest(()->smnService.gpuUsageStatusAlarm(gpuUsageStatusAlarmParam));
    }
}
