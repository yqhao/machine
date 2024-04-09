package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceSubtask;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 更新机器子任务表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-08-14
 */
public interface McUpdateDeviceSubtaskMapper extends BaseMapper<McUpdateDeviceSubtask> {

    List<McUpdateDeviceSubtask> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<McUpdateDeviceSubtask> wrapper);

    List<McUpdateDeviceSubtask> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<McUpdateDeviceSubtask> wrapper);
}
