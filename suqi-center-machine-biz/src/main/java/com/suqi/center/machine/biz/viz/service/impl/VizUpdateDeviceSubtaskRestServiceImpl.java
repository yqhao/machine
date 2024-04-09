package com.suqi.center.machine.biz.viz.service.impl;

import cn.hutool.core.util.StrUtil;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.api.viz.dto.request.ExecuteTheNextSubtaskParam;
import com.suqi.center.machine.api.viz.enums.SubtaskCompletionNotificationEnum;
import com.suqi.center.machine.biz.viz.dto.SubtaskResult;
import com.suqi.center.machine.biz.viz.enums.McUpdateDeviceSubtaskRecordStatusEnum;
import com.suqi.center.machine.biz.viz.enums.McUpdateDeviceTaskRecordStatusEnum;
import com.suqi.center.machine.biz.viz.enums.StatusEnum;
import com.suqi.center.machine.biz.viz.service.VizMcUpdateDeviceTaskRestService;
import com.suqi.center.machine.biz.viz.service.VizUpdateDeviceSubtaskRestService;
import com.suqi.center.machine.biz.viz.service.VizUpdateDeviceSubtaskService;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtask;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtaskRecord;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskRecord;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceSubtaskRecordService;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceSubtaskService;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceTaskRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @date 2023/9/12 11:50
 */
@Slf4j
@Order(0)
@Service
public class VizUpdateDeviceSubtaskRestServiceImpl implements VizUpdateDeviceSubtaskRestService, InitializingBean {

    @Resource
    IMcUpdateDeviceTaskRecordService iMcUpdateDeviceTaskRecordService;

    @Resource
    IMcUpdateDeviceSubtaskService iMcUpdateDeviceSubtaskService;

    @Resource
    private IMcUpdateDeviceSubtaskRecordService iMcUpdateDeviceSubtaskRecordService;

    @Resource
    private VizMcUpdateDeviceTaskRestService vizMcUpdateDeviceTaskRestService;

    @Resource
    List<VizUpdateDeviceSubtaskService> vizUpdateDeviceSubtaskServices;

    Map<Integer, VizUpdateDeviceSubtaskService> updateDeviceSubtaskServiceHashMap = new HashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        for (VizUpdateDeviceSubtaskService updateDeviceSubtaskService: vizUpdateDeviceSubtaskServices){
            updateDeviceSubtaskServiceHashMap.put(updateDeviceSubtaskService.getType(), updateDeviceSubtaskService);
        }
    }


    @Override
    public Boolean executeTheNextSubtask(ExecuteTheNextSubtaskParam param) {
        McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord = iMcUpdateDeviceTaskRecordService.selectOne(e -> e.idEq(param.getFkMcUpdateDeviceTaskRecordId()));
        if(mcUpdateDeviceTaskRecord == null){
            log.error("记录不存在：{}", param.getFkMcUpdateDeviceTaskRecordId());
            return false;
        }
        if(McUpdateDeviceTaskRecordStatusEnum.STOP_TASK.getValue().equals(mcUpdateDeviceTaskRecord.getStatus())){
            log.error("任务已停止，停止执行下一个子任务：{}", param.getFkMcUpdateDeviceTaskRecordId());
            return false;
        }
        // 查询出需要执行的子任务
        McUpdateDeviceSubtask mcUpdateDeviceSubtask = iMcUpdateDeviceSubtaskService.selectOne(e -> e.fkMcUpdateDeviceTaskIdEq(mcUpdateDeviceTaskRecord.getFkMcUpdateDeviceTaskId()).executionFlowGt(param.getExecutionFlow()).statusEq(StatusEnum.NORMAL.getValue()).orderByAsc("execution_flow"));
        if(mcUpdateDeviceSubtask == null){
            //查询不到子任务则标记主任务成功
            return vizMcUpdateDeviceTaskRestService.notifiesTheServiceTaskExecutionStatus(mcUpdateDeviceTaskRecord.getId(), SubtaskCompletionNotificationEnum.SUCCESS);
        }
        String taskId = subtaskExecution(mcUpdateDeviceSubtask, mcUpdateDeviceTaskRecord);
        if(StrUtil.isBlank(taskId)){
            log.error("当前任务执行子任务失败跳过该任务。instance_id：{}，fk_mc_update_device_task_id：{}", mcUpdateDeviceTaskRecord.getInstanceId(), mcUpdateDeviceTaskRecord.getFkMcUpdateDeviceTaskId());
            return false;
        }
        // 开始执行该子任务
        // 保存子任务执行记录到 机器更新子任务记录表中
        McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord = new McUpdateDeviceSubtaskRecord();
        mcUpdateDeviceSubtaskRecord.setFkMcUpdateDeviceSubtaskId(mcUpdateDeviceSubtask.getId());
        mcUpdateDeviceSubtaskRecord.setFkMcUpdateDeviceTaskRecordId(mcUpdateDeviceTaskRecord.getId());
        mcUpdateDeviceSubtaskRecord.setType(mcUpdateDeviceSubtask.getType());
        mcUpdateDeviceSubtaskRecord.setTaskId(taskId);
        mcUpdateDeviceSubtaskRecord.setExecutionFlow(mcUpdateDeviceSubtask.getExecutionFlow());
        mcUpdateDeviceSubtaskRecord.setStatus(McUpdateDeviceSubtaskRecordStatusEnum.TASK_EXECUTION.getValue());
        mcUpdateDeviceSubtaskRecord.setVersionId(0L);
        mcUpdateDeviceSubtaskRecord.setCreateTime(SystemClock.date());
        mcUpdateDeviceSubtaskRecord.setLastUpdateTime(SystemClock.date());
        boolean save = iMcUpdateDeviceSubtaskRecordService.save(mcUpdateDeviceSubtaskRecord);
        log.debug("定时查询需要执行的云机更新任务，保存子任务执行记录到 机器更新子任务记录表中instance_id：{}，fk_mc_update_device_task_id：{}，是否成功：{}", mcUpdateDeviceTaskRecord.getInstanceId(), mcUpdateDeviceTaskRecord.getFkMcUpdateDeviceTaskId(), save);
        // 修改当前主任务记录执行的子任务ID
        McUpdateDeviceTaskRecord up = new McUpdateDeviceTaskRecord();
        up.setId(mcUpdateDeviceTaskRecord.getId());
        up.setFkMcUpdateDeviceSubtaskRecordId(mcUpdateDeviceSubtaskRecord.getId());
        up.setLastUpdateTime(SystemClock.date());
        boolean b = iMcUpdateDeviceTaskRecordService.updateById(up);
        log.debug("定时查询需要执行的云机更新任务，修改当前记录为执行中instance_id：{}，fk_mc_update_device_task_id：{}，是否成功：{}", mcUpdateDeviceTaskRecord.getInstanceId(), mcUpdateDeviceTaskRecord.getFkMcUpdateDeviceTaskId(), save);
        return b;
    }

    @Override
    public String subtaskExecution(McUpdateDeviceSubtask mcUpdateDeviceSubtask, McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord){
        return updateDeviceSubtaskServiceHashMap.get(mcUpdateDeviceSubtask.getType()).subtaskExecution(mcUpdateDeviceSubtask, mcUpdateDeviceTaskRecord);
    }

    @Override
    public Boolean retrySubtask(McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord, McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord) {
        McUpdateDeviceSubtask mcUpdateDeviceSubtask = iMcUpdateDeviceSubtaskService.selectOne(e -> e.idEq(mcUpdateDeviceSubtaskRecord.getFkMcUpdateDeviceSubtaskId()));
        if(mcUpdateDeviceSubtask == null){
            log.error("重试子任务失败，找不到子任务：{}", mcUpdateDeviceSubtaskRecord.getFkMcUpdateDeviceSubtaskId());
            // 通知主任务失败
            return false;
        }
        String taskId = subtaskExecution(mcUpdateDeviceSubtask, mcUpdateDeviceTaskRecord);
        if(StrUtil.isBlank(taskId)){
            log.debug("当前任务执行子任务失败不执行该任务标记为失败。{}", mcUpdateDeviceSubtaskRecord.getFkMcUpdateDeviceSubtaskId());
            return false;
        }
        McUpdateDeviceSubtaskRecord up = new McUpdateDeviceSubtaskRecord();
        up.setId(mcUpdateDeviceSubtaskRecord.getId());
        up.setTaskId(taskId);
        up.setStatus(McUpdateDeviceSubtaskRecordStatusEnum.TASK_EXECUTION.getValue());
        up.setLastUpdateTime(SystemClock.date());
        return iMcUpdateDeviceSubtaskRecordService.updateById(up);
    }

    @Override
    public SubtaskResult getSubtaskResult(McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord, McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord) {
        return updateDeviceSubtaskServiceHashMap.get(mcUpdateDeviceSubtaskRecord.getType()).getSubtaskResult(mcUpdateDeviceSubtaskRecord, mcUpdateDeviceTaskRecord);
    }
}
