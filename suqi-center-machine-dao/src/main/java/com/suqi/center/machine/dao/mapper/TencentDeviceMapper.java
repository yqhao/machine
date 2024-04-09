package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suqi.center.machine.dao.dto.TencentDeviceDto;
import com.suqi.center.machine.dao.entity.TencentDevice;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import java.util.List;

/**
 * <p>
 * 腾讯设备表 Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-13
 */
public interface TencentDeviceMapper extends BaseMapper<TencentDevice> {

    List<TencentDevice> quickPageById(@Param("pageSize") long pageSize,@Param("lastId")long lastId, @Param("ew") QueryWrapper<TencentDevice> wrapper);

    List<TencentDevice> quickPage(@Param("pageNo") long pageNo,@Param("pageSize") long pageSize, @Param("ew") QueryWrapper<TencentDevice> wrapper);

    long userQuickPageCount(@Param("p") TencentDevice tencentDevice,@Param("publicIp") String publicIp);

    List<TencentDeviceDto> userQuickPage(@Param("pageNo") long pageNo,@Param("pageSize") long pageSize,@Param("p") TencentDevice tencentDevice,@Param("publicIp") String publicIp);
}
