package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineAssignTaskEo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 【可视化】机器分配任务表 Mapper 接口
 * </p>
 *
 * @author Administrator
 * @since 2023-10-16
 */
public interface VizMcMachineAssignTaskMapper extends BaseMapper<VizMcMachineAssignTaskEo> {

    List<VizMcMachineAssignTaskEo> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<VizMcMachineAssignTaskEo> wrapper);

    List<VizMcMachineAssignTaskEo> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<VizMcMachineAssignTaskEo> wrapper);
}
