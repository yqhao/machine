package com.suqi.center.machine.biz.viz.service;

import com.suqi.center.machine.api.viz.dto.request.VizMcMachineStreamsInfoParam;
import com.suqi.center.machine.api.viz.dto.request.VizMcMachineStreamsSaveOrUpdateParam;
import com.suqi.center.machine.api.viz.dto.response.VizMcMachineStreamsInfoResult;

/**
 * @version 1.0
 * @date 2023/10/10 19:13
 */
public interface VizMcMachineStreamsRestService {

    /**
     * 根据设备ID或实例ID、机器基础信息表记录id机器streaming端口映射
     * @param param
     * @return
     */
    VizMcMachineStreamsInfoResult info(VizMcMachineStreamsInfoParam param);

    /**
     * 保存或者修改机器streaming端口映射
     * @param param
     * @return
     */
    Boolean saveOrUpdate(VizMcMachineStreamsSaveOrUpdateParam param);
}
