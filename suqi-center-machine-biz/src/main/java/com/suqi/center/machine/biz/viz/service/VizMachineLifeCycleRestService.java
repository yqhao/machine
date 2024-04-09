package com.suqi.center.machine.biz.viz.service;

import com.suqi.center.machine.api.viz.dto.request.VizLifeCycleRebootOnlineParam;

/**
 * @version 1.0
 * @date 2023/10/21 15:55
 */
public interface VizMachineLifeCycleRestService {

    /**
     * 云机重启、初始化后第一次上线
     * @param param
     * @return
     */
    Boolean rebootOnline(VizLifeCycleRebootOnlineParam param);
}
