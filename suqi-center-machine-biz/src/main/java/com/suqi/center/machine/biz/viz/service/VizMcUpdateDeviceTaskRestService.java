package com.suqi.center.machine.biz.viz.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.api.viz.dto.request.*;
import com.suqi.center.machine.api.viz.dto.response.*;
import com.suqi.center.machine.api.viz.enums.SubtaskCompletionNotificationEnum;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtaskRecord;

import java.util.List;

/**
 * @version 1.0
 * @date 2023/8/11 15:00
 */
public interface VizMcUpdateDeviceTaskRestService {

    /**
     * 分页查询数据
     * @param param
     * @return
     */
    Page<McUpdateDeviceTaskPageResult> page(McUpdateDeviceTaskPageParam param);

    /**
     * 查询任务详情
     * @param id
     * @return
     */
    McUpdateDeviceTaskInfoResult info(Long id);

    /**
     * 保存或者修改任务
     * @param param
     * @return
     */
    Boolean saveOrUpdate(McUpdateDeviceTaskSaveOrUpdateParam param);

    /**
     * 查询子任务列表
     * @param mcUpdateDeviceTaskId
     * @return
     */
    List<McUpdateDeviceSubtaskListResult> subtaskList(Long mcUpdateDeviceTaskId);

    /**
     * 保存或者修改子任务
     * @param param
     * @return
     */
    Boolean subtaskSaveOrUpdate(McUpdateDeviceSubtaskSaveOrUpdateParam param);

    /**
     * 分页查询推送记录
     * @param param
     * @return
     */
    Page<TaskRecordPageResult> taskRecordPage(TaskRecordPageParam param);

    /**
     * 查询推送记录子任务
     * @param mcUpdateDeviceTaskRecordId
     * @return
     */
    List<TaskRecordSubtaskResult> taskRecordSubtask(Long mcUpdateDeviceTaskRecordId);

    /**
     * 查询主任务列表
     * @param param
     * @return
     */
    List<McUpdateDeviceTaskListResult> list(McUpdateDeviceTaskListParam param);

    /**
     * 批量停止任务
     * @param param
     * @return
     */
    List<BatchTaskResult> batchStopTask(BatchStopTaskParam param);

    /**
     * 批量重新开始任务
     * @param param
     * @return
     */
    List<BatchTaskResult> batchStartTask(BatchStartTaskParam param);

    /**
     * 批量添加设备
     * @param param
     * @return
     */
    List<BatchTaskResult> batchAddTask(BatchAddTaskParam param);

    /**
     * 修改当前主任务执行状态
     * @param mcUpdateDeviceTaskRecordId
     * @param status
     * @return
     */
    Boolean changeMainTaskExecutionStatus(Long mcUpdateDeviceTaskRecordId, Integer status);

    /**
     * 发送 kafka 消息通知服务任务执行状态
     * @param mcUpdateDeviceSubtaskRecord
     * @param subtaskCompletionNotificationEnum
     * @return
     */
    Boolean notifiesTheServiceTaskExecutionStatus(McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord, SubtaskCompletionNotificationEnum subtaskCompletionNotificationEnum);

    /**
     * 发送 kafka 消息通知服务任务执行状态
     * @param fkMcUpdateDeviceTaskRecordId
     * @param subtaskCompletionNotificationEnum
     * @return
     */
    Boolean notifiesTheServiceTaskExecutionStatus(Long fkMcUpdateDeviceTaskRecordId, SubtaskCompletionNotificationEnum subtaskCompletionNotificationEnum);
}
