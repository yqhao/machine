package com.suqi.center.machine.biz.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.api.dto.reponse.DevicesLabelListResult;
import com.suqi.center.machine.api.dto.request.AddDevicesLabelParam;
import com.suqi.center.machine.api.dto.request.DevicesLabelListParam;

/**
 * 设备标签接口层
 *
 * @version 1.0
 * @date 2023/3/30 15:02
 */
public interface DeviceLabelService {

    /**
     * 分页获取设备标签
     * @param param
     * @return
     */
    Page<DevicesLabelListResult> list(DevicesLabelListParam param);

    /**
     * 批量添加设备标签
     * @param param
     * @return
     */
    Boolean saveOrUpdate(AddDevicesLabelParam param);

}
