package com.suqi.center.machine.biz.viz.service;

import com.suqi.center.machine.api.viz.dto.request.ExecuteTheNextSubtaskParam;
import com.suqi.center.machine.biz.viz.dto.SubtaskResult;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtask;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtaskRecord;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskRecord;

/**
 * @version 1.0
 * @date 2023/9/12 11:50
 */
public interface VizUpdateDeviceSubtaskRestService {

    /**
     * 执行下一个子任务
     * @param param
     * @return
     */
    Boolean executeTheNextSubtask(ExecuteTheNextSubtaskParam param);

    /**
     * 执行子任务
     * @param mcUpdateDeviceSubtask
     * @param mcUpdateDeviceTaskRecord
     * @return
     */
    String subtaskExecution(McUpdateDeviceSubtask mcUpdateDeviceSubtask, McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord);

    /**
     * 重试子任务
     * @param mcUpdateDeviceTaskRecord
     * @param mcUpdateDeviceSubtaskRecord
     * @return
     */
    Boolean retrySubtask(McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord, McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord);

    /**
     * 获取子任务结果
     * @param mcUpdateDeviceSubtaskRecord
     * @param mcUpdateDeviceTaskRecord
     * @return
     */
    SubtaskResult getSubtaskResult(McUpdateDeviceSubtaskRecord mcUpdateDeviceSubtaskRecord, McUpdateDeviceTaskRecord mcUpdateDeviceTaskRecord);

}
