package com.suqi.center.machine.biz.viz.schedule;

import com.suqi.center.common.constant.CenterConstant;
import com.suqi.center.common.lock.annotations.TraceId;
import com.suqi.center.machine.api.viz.enums.SubtaskCompletionNotificationEnum;
import com.suqi.center.machine.biz.viz.dto.SubtaskResult;
import com.suqi.center.machine.biz.viz.enums.McUpdateDeviceSubtaskRecordStatusEnum;
import com.suqi.center.machine.biz.viz.enums.SubtaskStatusEnum;
import com.suqi.center.machine.biz.viz.service.VizMcUpdateDeviceTaskRestService;
import com.suqi.center.machine.biz.viz.service.VizUpdateDeviceSubtaskRestService;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtaskRecord;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskRecord;
import com.suqi.center.machine.dao.viz.service.IMcUpdateDeviceSubtaskRecordService;
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
 * @date 2023/8/23 18:31
 */
@Slf4j
@Component
@RefreshScope
public class UpdateDeviceSubtaskTask {

    @Resource
    IMcUpdateDeviceTaskRecordService iMcUpdateDeviceTaskRecordService;

    @Resource
    IMcUpdateDeviceSubtaskRecordService iMcUpdateDeviceSubtaskRecordService;

    @Resource
    VizUpdateDeviceSubtaskRestService vizUpdateDeviceSubtaskRestService;

    @Resource
    VizMcUpdateDeviceTaskRestService vizMcUpdateDeviceTaskRestService;

    /**
     * 获取子任务执行结果（Bean模式）
     */
    @XxlJob("suqi-center-machine/RetryUpdateDeviceSubtaskTask.retryUpdateDeviceSubtaskTaskJobHandler")
    @TraceId
    public void getUpdateDeviceSubtaskTaskJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, 定时查询需要执行的云机更新任务：{}", MDC.get(CenterConstant.LOG_TRACE_ID));
        iMcUpdateDeviceSubtaskRecordService.pageConsumerByWrapper(e -> {
            e.statusEq(McUpdateDeviceSubtaskRecordStatusEnum.TASK_EXECUTION.getValue());
        }, c -> {
            //查看当前任务
            McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord = iMcUpdateDeviceTaskRecordService.selectOne(e -> e.idEq(c.getFkMcUpdateDeviceTaskRecordId()));
            if(mcUpdateDeviceTaskRecord == null){
                log.error("任务记录不存在！ID：{}", c.getFkMcUpdateDeviceTaskRecordId());
                updateMcUpdateDeviceSubtaskRecordStatus(c, McUpdateDeviceSubtaskRecordStatusEnum.STOP_TASK.getValue(), "任务记录不存在！");
                return;
            }
            if(mcUpdateDeviceTaskRecord.getStatus() == -20){
                log.error("主任务已经停止，停止子任务！ID：{}", c.getFkMcUpdateDeviceTaskRecordId());
                updateMcUpdateDeviceSubtaskRecordStatus(c, McUpdateDeviceSubtaskRecordStatusEnum.STOP_TASK.getValue(), "主任务已经停止，停止子任务！");
                return;
            }
            SubtaskResult subtaskResult = vizUpdateDeviceSubtaskRestService.getSubtaskResult(c, mcUpdateDeviceTaskRecord);
            if(subtaskResult == null){
                log.error("子任务查询结果失败！ID：{}", c.getFkMcUpdateDeviceTaskRecordId());
                return;
            }
            if(SubtaskStatusEnum.SUCCESS.getValue().equals(subtaskResult.getStatus())){
                log.info("当前子任务已经执行成功！ID：{}", c.getFkMcUpdateDeviceTaskRecordId());
                updateMcUpdateDeviceSubtaskRecordStatus(c, McUpdateDeviceSubtaskRecordStatusEnum.NORMAL.getValue(), "当前子任务已经执行成功！");
                // 开始发送kafka消息通知主任务开始执行下一个子任务
                vizMcUpdateDeviceTaskRestService.notifiesTheServiceTaskExecutionStatus(c,SubtaskCompletionNotificationEnum.PROCESSING);
            } else if (SubtaskStatusEnum.FAILED.getValue().equals(subtaskResult.getStatus())) {
                log.error("当前子任务执行失败！ID：{}", c.getFkMcUpdateDeviceTaskRecordId());
                // 开始继续重新
                Boolean b = vizUpdateDeviceSubtaskRestService.retrySubtask(mcUpdateDeviceTaskRecord, c);
                log.info("重试当前子任务！ID：{}，状态：{}", c.getFkMcUpdateDeviceTaskRecordId(), b);
                if(!b){
                    // 修改当前子任务失败
                    updateMcUpdateDeviceSubtaskRecordStatus(c, McUpdateDeviceSubtaskRecordStatusEnum.TASK_EXECUTION_FAILURE.getValue(), "重试当前子任务失败！");
                    // 开始发送kafka消息通知主任务执行失败
                    vizMcUpdateDeviceTaskRestService.notifiesTheServiceTaskExecutionStatus(c,SubtaskCompletionNotificationEnum.FAILED);
                }
            }else {
                log.info("当前任务还在运行中跳过该任务！ID：{}", c.getFkMcUpdateDeviceTaskRecordId());
            }
        });
    }

    /**
     * 修改子任务状态
     * @param mcUpdateDeviceSubtaskRecord
     * @param status
     * @param message
     * @return
     */
    public Boolean updateMcUpdateDeviceSubtaskRecordStatus(McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord, Integer status, String message){
        McUpdateDeviceSubtaskRecord updateDeviceSubtaskRecord = new McUpdateDeviceSubtaskRecord();
        updateDeviceSubtaskRecord.setId(mcUpdateDeviceSubtaskRecord.getId());
        updateDeviceSubtaskRecord.setStatus(status);
        updateDeviceSubtaskRecord.setExecuteMsg(message);
        return iMcUpdateDeviceSubtaskRecordService.updateById(updateDeviceSubtaskRecord);
    }

}
