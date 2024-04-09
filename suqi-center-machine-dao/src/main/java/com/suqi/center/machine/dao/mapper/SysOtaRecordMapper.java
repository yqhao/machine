package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.SysOtaRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-10-31
 */
public interface SysOtaRecordMapper extends BaseMapper<SysOtaRecord> {

    List<SysOtaRecord> quickPageById(@Param("pageSize") long pageSize,@Param("lastId")long lastId, @Param("ew") QueryWrapper<SysOtaRecord> wrapper);

    List<SysOtaRecord> quickPage(@Param("pageNo") long pageNo,@Param("pageSize") long pageSize, @Param("ew") QueryWrapper<SysOtaRecord> wrapper);
}
