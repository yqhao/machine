package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcMachineStreams;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 机器streaming端口映射 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-10-10
 */
public interface VizMcMachineStreamsMapper extends BaseMapper<VizMcMachineStreams> {

    List<VizMcMachineStreams> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<VizMcMachineStreams> wrapper);

    List<VizMcMachineStreams> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<VizMcMachineStreams> wrapper);
}
