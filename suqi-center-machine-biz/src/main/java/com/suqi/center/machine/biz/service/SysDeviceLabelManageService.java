package com.suqi.center.machine.biz.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.api.dto.reponse.SysDeviceLabelListResult;
import com.suqi.center.machine.api.dto.request.GetDeviceIdleNumParam;
import com.suqi.center.machine.api.dto.request.SysDeviceLabelListParam;
import com.suqi.center.machine.api.dto.request.SysDeviceLabelParam;
import com.suqi.center.machine.api.dto.response.GetDeviceIdleNumResult;
import com.suqi.center.machine.api.dto.response.GetDeviceNumResult;

/**
 * 设备系统标签接口层
 * @version 1.0
 * @date 2023/3/29 19:29
 */
public interface SysDeviceLabelManageService {

    /**
     * 分页获取设备系统标签
     * @param param
     * @return
     */
    Page<SysDeviceLabelListResult> list(SysDeviceLabelListParam param);

    /**
     * 添加设备系统标签
     * @param param
     * @return
     */
    Boolean add(SysDeviceLabelParam param);

    /**
     * 修改设备系统标签
     * @param param
     * @return
     */
    Boolean update(SysDeviceLabelParam param);

    /**
     * 根据标签名称获取标签详情
     * @param param
     * @return
     */
    SysDeviceLabelListResult getInfoByLabelName(SysDeviceLabelListParam param);

    /**
     * 根据标签获取空闲设备数
     * @param param
     * @return
     */
    GetDeviceIdleNumResult getDeviceIdleNum(GetDeviceIdleNumParam param);

    /**
     * 查询某一个标签的设备数量
     * @param param
     * @return
     */
    GetDeviceNumResult getDeviceNum(GetDeviceIdleNumParam param);
}
