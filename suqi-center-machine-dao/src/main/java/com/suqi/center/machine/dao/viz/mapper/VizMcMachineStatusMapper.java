package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineStatus;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 机器状态表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-10-11
 */
public interface VizMcMachineStatusMapper extends BaseMapper<VizMcMachineStatus> {

    List<VizMcMachineStatus> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<VizMcMachineStatus> wrapper);

    List<VizMcMachineStatus> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<VizMcMachineStatus> wrapper);
}
