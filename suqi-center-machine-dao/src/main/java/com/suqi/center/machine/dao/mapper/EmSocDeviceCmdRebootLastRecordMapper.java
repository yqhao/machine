package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suqi.center.machine.dao.entity.EmSocDeviceCmdRebootLastRecord;
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
public interface EmSocDeviceCmdRebootLastRecordMapper extends BaseMapper<EmSocDeviceCmdRebootLastRecord> {

    List<EmSocDeviceCmdRebootLastRecord> quickPageById(@Param("pageSize") long pageSize,@Param("lastId")long lastId, @Param("ew") QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper);

    List<EmSocDeviceCmdRebootLastRecord> quickPage(@Param("pageNo") long pageNo,@Param("pageSize") long pageSize, @Param("ew") QueryWrapper<EmSocDeviceCmdRebootLastRecord> wrapper);
}
