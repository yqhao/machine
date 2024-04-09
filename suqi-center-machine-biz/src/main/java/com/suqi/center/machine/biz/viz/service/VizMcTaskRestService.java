package com.suqi.center.machine.biz.viz.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.api.viz.dto.request.*;
import com.suqi.center.machine.api.viz.dto.response.*;

import java.util.List;

/**
 * @version 1.0
 * @date 2023/10/20 16:03
 */
public interface VizMcTaskRestService {

    /**
     * 查询任务类型列表
     * @return VizTaskTypeListResult
     */
    List<VizTaskTypeListResult> taskTypeList();

    /**
     * 分页查询任务列表
     * @param param
     * @return
     */
    Page<VizMcTaskPageResult> page(VizMcTaskPageParam param);

    /**
     * 保存任务
     * @param param
     * @return
     */
    VizMcTaskSaveResult save(VizMcTaskSaveParam param);

    /**
     * 修改任务
     * @param param
     * @return
     */
    Boolean update(VizMcTaskUpdateParam param);

    /**
     * 保存任务机器
     * @param param
     * @return
     */
    Boolean saveMachine(VizDeviceTaskSaveParam param);


    /**
     * 重试任务机器
     * @param param
     * @return
     */
    Boolean retryMachine(VizDeviceTaskRetryParam param);

    /**
     * 分页查询机器子任务列表
     * @param param
     * @return
     */
    Page<VizMcMachineTaskPageResult> pageMachine(VizMcMachineTaskPageParam param);

    /**
     * 定时任务分页查询需要执行的任务
     * @param param
     * @return
     */
    Page<VizMcTaskSchedulePageResult> schedulePage(VizMcTaskSchedulePageParam param);

    /**
     * 定时任务分页查询需要执行的云机任务
     * @param param
     * @return
     */
    Page<VizMcTaskSchedulePageMachineResult> schedulePageMachine(VizMcTaskSchedulePageMachineParam param);

    /**
     * 定时任务修改任务
     * @param param
     * @return
     */
    Boolean scheduleUpdate(VizMcTaskScheduleUpdateParam param);

    /**
     * 定时任务修改云机任务
     * @param param
     * @return
     */
    Boolean scheduleUpdateMachine(VizMcTaskScheduleUpdateMachineParam param);

    /**
     * 定时任务根据任务ID获取任务
     * @param param
     * @return
     */
    VizMcTaskSchedulePageResult scheduleGetTask(VizMcTaskScheduleGetTaskParam param);

    /**
     * 定时任务根据任务ID获取云机任务
     * @param param
     * @return
     */
    VizMcTaskSchedulePageMachineResult scheduleGetTaskMachine(VizMcTaskScheduleGetTaskParam param);

    /**
     * 检查当前任务是否还存在等待中或者执行中的任务
     * @param param
     * @return
     */
    Boolean scheduleCheckMachineIncomplete(VizMcTaskScheduleIncompleteParam param);
}
