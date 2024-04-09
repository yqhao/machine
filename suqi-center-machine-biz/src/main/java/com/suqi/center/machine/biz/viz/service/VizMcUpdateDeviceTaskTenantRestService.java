package com.suqi.center.machine.biz.viz.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.api.viz.dto.request.McUpdateDeviceTaskTenantPageParam;
import com.suqi.center.machine.api.viz.dto.request.McUpdateDeviceTaskTenantSaveOrUpdateParam;
import com.suqi.center.machine.api.viz.dto.response.McUpdateDeviceTaskTenantListResult;

/**
 * @version 1.0
 * @date 2023/8/16 10:47
 */
public interface VizMcUpdateDeviceTaskTenantRestService {

    /**
     * 分页查询租户更新任务列表
     * @param param
     * @return
     */
    Page<McUpdateDeviceTaskTenantListResult> page(McUpdateDeviceTaskTenantPageParam param);

    /**
     * 保存或者修改租户更新任务
     * @param param
     * @return
     */
    Boolean saveOrUpdate(McUpdateDeviceTaskTenantSaveOrUpdateParam param);

}
