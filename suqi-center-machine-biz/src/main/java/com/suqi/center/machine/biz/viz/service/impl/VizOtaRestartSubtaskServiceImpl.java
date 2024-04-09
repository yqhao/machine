package com.suqi.center.machine.biz.viz.service.impl;

import com.suqi.center.common.utils.UUIDUtil;
import com.suqi.center.machine.biz.viz.dto.SubtaskResult;
import com.suqi.center.machine.biz.viz.enums.McUpdateDeviceSubtaskTypeEnum;
import com.suqi.center.machine.biz.viz.enums.SubtaskStatusEnum;
import com.suqi.center.machine.biz.viz.service.VizUpdateDeviceSubtaskService;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtask;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtaskRecord;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskRecord;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineStatus;
import com.suqi.center.machine.dao.viz.service.IVizMcMachineStatusService;
import com.suqi.core.kafka.BoxOtaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @date 2023/9/12 15:59
 */
@Slf4j
@Service
public class VizOtaRestartSubtaskServiceImpl implements VizUpdateDeviceSubtaskService {

    @Resource
    IVizMcMachineStatusService iVizMcMachineStatusService;

    @Resource
    private BoxOtaService boxOtaService;

    @Override
    public Integer getType() {
        return McUpdateDeviceSubtaskTypeEnum.OTA_RESTART.value;
    }

    @Override
    public String subtaskExecution(McUpdateDeviceSubtask mcUpdateDeviceSubtask, McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord) {
        String taskId = UUIDUtil.uuid();
        Boolean aBoolean = boxOtaService.sendOtaCommand(List.of(mcUpdateDeviceTaskRecord.getDeviceId()), "reboot", m -> m.put("superuser", true));
        log.info("当前执行OTA重启任务ID：{}，deviceId：{}，设备实例Id：{},结果为：{}", taskId, mcUpdateDeviceTaskRecord.getDeviceId(), mcUpdateDeviceTaskRecord.getInstanceId(), aBoolean);
        if(aBoolean){
            return taskId;
        }
        return null;
    }

    @Override
    public SubtaskResult getSubtaskResult(McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord, McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord) {
        SubtaskResult response = new SubtaskResult();
        // OTA重启
        VizMcMachineStatus mcMachineStatus = iVizMcMachineStatusService.selectOne(e -> e.fkMcMachineIdEq(mcUpdateDeviceTaskRecord.getFkMcMachineId()).restartStatusEq(0).healthStatusEq(1));
        if(mcMachineStatus == null){
            response.setStatus(SubtaskStatusEnum.PROCESSING.getValue());
        }else {
            response.setStatus(SubtaskStatusEnum.SUCCESS.getValue());
        }
        return response;
    }
}
