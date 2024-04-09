package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtaskRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 机器更新子任务记录表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-08-15
 */
public interface McUpdateDeviceSubtaskRecordMapper extends BaseMapper<McUpdateDeviceSubtaskRecord> {

    List<McUpdateDeviceSubtaskRecord> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper);

    List<McUpdateDeviceSubtaskRecord> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<McUpdateDeviceSubtaskRecord> wrapper);
}
