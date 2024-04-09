package com.suqi.center.machine.biz.service;

import com.suqi.center.machine.api.dto.request.GpuUsageStatusAlarmParam;
import com.suqi.center.machine.api.dto.request.SmnLackOfSpaceWarningParam;

/**
 * @AUTHOR: oyxueyi
 * @PACKAGE_NAME: com.suqi.center.machine.biz.service
 * @NAME: ISmnService
 * @DATE: 2023/5/6 16:25
 * @PROJECT_NAME: suqi-application-backendapi
 * @Description: 华为 smn service 组件
 */
public interface ISmnService {

    /**
     * 旧版本的cpu预警 不用了但是还是保留 命名有问题 实际是cpu告警
     * GPU内存 告警
     * @param smnAlarmRequest   告警参数
     * @return  是否处理成功
     */
    @Deprecated
    Boolean gpuAlarm(SmnLackOfSpaceWarningParam smnAlarmRequest);

    /**
     * GPU状态异常告警
     * @param gpuUsageStatusAlarmParam
     * @return
     */
    Boolean gpuUsageStatusAlarm(GpuUsageStatusAlarmParam gpuUsageStatusAlarmParam);

    /**
     * CPU告警
     * @param smnAlarmRequest
     * @return
     */
    Boolean cpuAlarm(SmnLackOfSpaceWarningParam smnAlarmRequest);

    /**
     * 运行内存告警
     * @param smnAlarmRequest
     * @return
     */
    Boolean runMemoryAlarm(SmnLackOfSpaceWarningParam smnAlarmRequest);
}
