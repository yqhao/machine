package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineRecycleTaskEo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 【可视化】机器回收任务表 Mapper 接口
 * </p>
 *
 * @author Administrator
 * @since 2023-10-17
 */
public interface VizMcMachineRecycleTaskMapper extends BaseMapper<VizMcMachineRecycleTaskEo> {

    List<VizMcMachineRecycleTaskEo> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<VizMcMachineRecycleTaskEo> wrapper);

    List<VizMcMachineRecycleTaskEo> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<VizMcMachineRecycleTaskEo> wrapper);
}
