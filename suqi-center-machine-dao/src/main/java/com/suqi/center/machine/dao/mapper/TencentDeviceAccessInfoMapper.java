package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.TencentDeviceAccessInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 腾讯设备公网映射表 Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-14
 */
public interface TencentDeviceAccessInfoMapper extends BaseMapper<TencentDeviceAccessInfo> {

    List<TencentDeviceAccessInfo> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<TencentDeviceAccessInfo> wrapper);

    List<TencentDeviceAccessInfo> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<TencentDeviceAccessInfo> wrapper);
}
