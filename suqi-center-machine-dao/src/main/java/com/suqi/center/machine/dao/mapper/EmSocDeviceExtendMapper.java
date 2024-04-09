package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.EmSocDeviceExtend;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 设备扩展信息表（em_soc_device_extend） Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-29
 */
public interface EmSocDeviceExtendMapper extends BaseMapper<EmSocDeviceExtend> {

    List<EmSocDeviceExtend> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<EmSocDeviceExtend> wrapper);

    List<EmSocDeviceExtend> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<EmSocDeviceExtend> wrapper);
}
