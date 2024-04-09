package com.suqi.center.machine.biz.viz.schedule;

import cn.hutool.core.util.StrUtil;
import com.suqi.center.common.constant.CenterConstant;
import com.suqi.center.common.lock.annotations.TraceId;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.api.viz.enums.SubtaskCompletionNotificationEnum;
import com.suqi.center.machine.biz.viz.enums.McUpdateDeviceSubtaskRecordStatusEnum;
import com.suqi.center.machine.biz.viz.enums.McUpdateDeviceTaskRecordStatusEnum;
import com.suqi.center.machine.biz.viz.enums.StatusEnum;
import com.suqi.center.machine.biz.viz.service.VizMcUpdateDeviceTaskRestService;
import com.suqi.center.machine.biz.viz.service.VizUpdateDeviceSubtaskRestService;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtask;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtaskRecord;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskRecord;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceSubtaskRecordService;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceSubtaskService;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceTaskRecordService;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @date 2023/8/23 10:40
 */
@Slf4j
@Component
@RefreshScope
public class ExecuteMcUpdateDeviceTask {

    @Resource
    private IMcUpdateDeviceTaskRecordService iMcUpdateDeviceTaskRecordService;

    @Resource
    private IMcUpdateDeviceSubtaskService iMcUpdateDeviceSubtaskService;

    @Resource
    private IMcUpdateDeviceSubtaskRecordService iMcUpdateDeviceSubtaskRecordService;

    @Resource
    private VizUpdateDeviceSubtaskRestService vizUpdateDeviceSubtaskRestService;

    @Resource
    private VizMcUpdateDeviceTaskRestService vizMcUpdateDeviceTaskRestService;

    /**
     * 定时查询需要执行的云机更新任务（Bean模式）
     */
    @XxlJob("suqi-center-machine/ExecuteMcUpdateDeviceTask.updateDeviceTaskJobHandler")
    @TraceId
    public void updateDeviceTaskJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, 定时查询需要执行的云机更新任务：{}", MDC.get(CenterConstant.LOG_TRACE_ID));
        iMcUpdateDeviceTaskRecordService.pageConsumerByWrapper(e -> {
            e.statusEq(McUpdateDeviceTaskRecordStatusEnum.PENDING_EXECUTION.getValue()).startTimeLe(SystemClock.date());
        }, c -> {
            // 查询出有没有在执行的子任务数量
            long subtaskExecutionCount = iMcUpdateDeviceSubtaskRecordService.count(e ->
                    e.fkMcUpdateDeviceTaskRecordIdEq(c.getId())
                            .statusEq(McUpdateDeviceSubtaskRecordStatusEnum.TASK_EXECUTION.getValue()));
            if(subtaskExecutionCount != 0){
                log.debug("当前任务存在未执行完的子任务跳过该任务。instance_id：{}，fk_mc_update_device_task_id：{}", c.getInstanceId(), c.getFkMcUpdateDeviceTaskId());
                return;
            }
            try {
                // 查询出需要执行的子任务
                McUpdateDeviceSubtask mcUpdateDeviceSubtask = iMcUpdateDeviceSubtaskService.selectOne(e -> e.fkMcUpdateDeviceTaskIdEq(c.getFkMcUpdateDeviceTaskId()).statusEq(StatusEnum.NORMAL.getValue()).orderByAsc("execution_flow"));
                if(mcUpdateDeviceSubtask == null){
                    log.info("没有需要执行的子任务，标记当前任务成功：{}",c.getId());
                    vizMcUpdateDeviceTaskRestService.notifiesTheServiceTaskExecutionStatus(c.getId(), SubtaskCompletionNotificationEnum.SUCCESS);
                    return;
                }
                String taskId = vizUpdateDeviceSubtaskRestService.subtaskExecution(mcUpdateDeviceSubtask, c);
                if(StrUtil.isBlank(taskId)){
                    log.debug("当前任务执行子任务失败跳过该任务。instance_id：{}，fk_mc_update_device_task_id：{}", c.getInstanceId(), c.getFkMcUpdateDeviceTaskId());
                    return;
                }
                // 开始执行该子任务
                // 保存子任务执行记录到 机器更新子任务记录表中
                McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord = new McUpdateDeviceSubtaskRecord();
                mcUpdateDeviceSubtaskRecord.setFkMcUpdateDeviceSubtaskId(mcUpdateDeviceSubtask.getId());
                mcUpdateDeviceSubtaskRecord.setFkMcUpdateDeviceTaskRecordId(c.getId());
                mcUpdateDeviceSubtaskRecord.setType(mcUpdateDeviceSubtask.getType());
                mcUpdateDeviceSubtaskRecord.setTaskId(taskId);
                mcUpdateDeviceSubtaskRecord.setExecutionFlow(mcUpdateDeviceSubtask.getExecutionFlow());
                mcUpdateDeviceSubtaskRecord.setStatus(McUpdateDeviceSubtaskRecordStatusEnum.TASK_EXECUTION.getValue());
                mcUpdateDeviceSubtaskRecord.setVersionId(0L);
                mcUpdateDeviceSubtaskRecord.setCreateTime(SystemClock.date());
                mcUpdateDeviceSubtaskRecord.setLastUpdateTime(SystemClock.date());
                boolean save = iMcUpdateDeviceSubtaskRecordService.save(mcUpdateDeviceSubtaskRecord);
                log.debug("定时查询需要执行的云机更新任务，保存子任务执行记录到 机器更新子任务记录表中instance_id：{}，fk_mc_update_device_task_id：{}，是否成功：{}", c.getInstanceId(), c.getFkMcUpdateDeviceTaskId(), save);
                // 修改当前记录为执行中
                McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord = new McUpdateDeviceTaskRecord();
                mcUpdateDeviceTaskRecord.setId(c.getId());
                mcUpdateDeviceTaskRecord.setFkMcUpdateDeviceSubtaskRecordId(mcUpdateDeviceSubtaskRecord.getId());
                mcUpdateDeviceTaskRecord.setStatus(McUpdateDeviceTaskRecordStatusEnum.TASK_EXECUTION.getValue());
                mcUpdateDeviceTaskRecord.setTaskStartTime(SystemClock.date());
                mcUpdateDeviceTaskRecord.setLastUpdateTime(SystemClock.date());
                boolean b = iMcUpdateDeviceTaskRecordService.updateById(mcUpdateDeviceTaskRecord);
                log.debug("定时查询需要执行的云机更新任务，修改当前记录为执行中instance_id：{}，fk_mc_update_device_task_id：{}，是否成功：{}", c.getInstanceId(), c.getFkMcUpdateDeviceTaskId(), save);
                // 结束
            }catch (Throwable throwable){
                throwable.printStackTrace();
                log.error(throwable.getMessage(), throwable);
            }
        });
    }
}
