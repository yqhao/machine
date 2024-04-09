package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suqi.center.machine.dao.entity.EmSocDeviceCmdRebootRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Administrator
 * @since 2023-12-20
 */
public interface EmSocDeviceCmdRebootRecordMapper extends BaseMapper<EmSocDeviceCmdRebootRecord> {

    List<EmSocDeviceCmdRebootRecord> quickPageById(@Param("pageSize") long pageSize,@Param("lastId")long lastId, @Param("ew") QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper);

    List<EmSocDeviceCmdRebootRecord> quickPage(@Param("pageNo") long pageNo,@Param("pageSize") long pageSize, @Param("ew") QueryWrapper<EmSocDeviceCmdRebootRecord> wrapper);
}
