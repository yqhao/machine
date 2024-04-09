package com.suqi.center.machine.biz.viz.service;

import com.suqi.center.machine.biz.viz.dto.SubtaskResult;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtask;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtaskRecord;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskRecord;

/**
 * @version 1.0
 * @date 2023/9/12 15:46
 */
public interface VizUpdateDeviceSubtaskService {

    /**
     * 获取子任务类型
     * @return
     */
    Integer getType();

    /**
     * 执行子任务
     * @param mcUpdateDeviceSubtask
     * @param mcUpdateDeviceTaskRecord
     * @return
     */
    String subtaskExecution(McUpdateDeviceSubtask mcUpdateDeviceSubtask, McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord);

    /**
     * 获取子任务执行结果
     * @param mcUpdateDeviceSubtaskRecord
     * @param mcUpdateDeviceTaskRecord
     * @return
     */
    SubtaskResult getSubtaskResult(McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord, McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord);

}
