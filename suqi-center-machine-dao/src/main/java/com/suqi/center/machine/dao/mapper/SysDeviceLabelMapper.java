package com.suqi.center.machine.dao.mapper;

import com.suqi.center.machine.dao.entity.SysDeviceLabel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 设备系统标签表 Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-03-29
 */
public interface SysDeviceLabelMapper extends BaseMapper<SysDeviceLabel> {

    /**
     * 根据标签获取空闲设备数
     * @param tenantId
     * @param deviceLabelId
     * @param allotStatus 用户设备分配状态（未分配：0，已分配：1）
     * @return
     */
    Integer getDeviceIdleNum(@Param("tenantId") Long tenantId, @Param("deviceLabelId") Long deviceLabelId, @Param("allotStatus") Integer allotStatus);

}
