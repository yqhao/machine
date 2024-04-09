package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcTaskEo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 任务表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-10-20
 */
public interface VizMcTaskMapper extends BaseMapper<VizMcTaskEo> {

    List<VizMcTaskEo> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<VizMcTaskEo> wrapper);

    List<VizMcTaskEo> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<VizMcTaskEo> wrapper);
}
