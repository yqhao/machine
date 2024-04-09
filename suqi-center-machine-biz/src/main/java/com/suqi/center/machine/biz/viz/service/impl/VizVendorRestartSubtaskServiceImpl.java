package com.suqi.center.machine.biz.viz.service.impl;

import com.suqi.center.external.api.dto.request.TaskParam;
import com.suqi.center.external.api.dto.response.TaskResult;
import com.suqi.center.external.api.query.cloudphone.ICloudDeviceOptApi;
import com.suqi.center.machine.biz.viz.dto.SubtaskResult;
import com.suqi.center.machine.biz.viz.enums.McUpdateDeviceSubtaskTypeEnum;
import com.suqi.center.machine.biz.viz.service.VizUpdateDeviceSubtaskService;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtask;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtaskRecord;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @date 2023/9/12 16:01
 */
@Slf4j
@Service
public class VizVendorRestartSubtaskServiceImpl implements VizUpdateDeviceSubtaskService {

    @Resource
    ICloudDeviceOptApi iCloudDeviceOptApi;

    @Override
    public Integer getType() {
        return McUpdateDeviceSubtaskTypeEnum.VENDOR_RESTART.value;
    }

    @Override
    public String subtaskExecution(McUpdateDeviceSubtask mcUpdateDeviceSubtask, McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord) {
        return iCloudDeviceOptApi.reboot(mcUpdateDeviceTaskRecord.getDeviceId()).getData(); // 服务商重启
    }

    @Override
    public SubtaskResult getSubtaskResult(McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord, McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord) {
        // 服务商重启
        TaskParam taskParam = new TaskParam();
        taskParam.setDeviceId(mcUpdateDeviceTaskRecord.getDeviceId());
        taskParam.setTaskId(mcUpdateDeviceSubtaskRecord.getTaskId());
        TaskResult taskResult = iCloudDeviceOptApi.syncTask(taskParam).getData();
        SubtaskResult response = new SubtaskResult();
        response.setMessage(taskResult.getMessage());
        response.setErrorMsg(taskResult.getErrorMsg());
        response.setErrorCode(taskResult.getErrorCode());
        response.setStatus(taskResult.getSqStatus());
        return response;
    }
}
