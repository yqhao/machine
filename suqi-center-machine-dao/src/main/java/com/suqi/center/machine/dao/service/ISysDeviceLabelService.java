package com.suqi.center.machine.dao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.entity.SysDeviceLabel;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 设备系统标签表 服务类
 * </p>
 *
 * @author PC001
 * @since 2023-03-29
 */
public interface ISysDeviceLabelService extends IService<SysDeviceLabel> {

    /**
     * 查询某一个标签的设备数量
     *
     * @param tenantId
     * @param deviceLabelId
     * @param allotStatus 用户设备分配状态（未分配：0，已分配：1）
     * @return
     */
    Integer getDeviceNum(Long tenantId, Long deviceLabelId, Integer allotStatus);

    /**
     * 根据设备ID获取设备标签列表
     * @param ids
     * @return
     */
    Map<Long, SysDeviceLabel> getMapByIds(List<Long> ids);

    /**
     * 根据标签ID获取详情
     * @param id
     * @return
     */
    SysDeviceLabel getInfoById(Long id);
}
