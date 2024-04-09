package com.suqi.center.machine.biz.viz.service;

import com.suqi.center.machine.api.viz.dto.request.McDefaultUpdateDeviceTaskSaveOrUpdateParam;
import com.suqi.center.machine.api.viz.dto.response.McDefaultUpdateDeviceTaskListResult;

import java.util.List;

/**
 * @version 1.0
 * @date 2023/8/16 14:55
 */
public interface VizMcDefaultUpdateDeviceTaskRestService {

    /**
     * 查询更新机器默认任务列表
     * @return
     */
    List<McDefaultUpdateDeviceTaskListResult> list();

    /**
     * 保存或者修改更新机器默认任务
     * @param param
     * @return
     */
    Boolean saveOrUpdate(McDefaultUpdateDeviceTaskSaveOrUpdateParam param);

}
