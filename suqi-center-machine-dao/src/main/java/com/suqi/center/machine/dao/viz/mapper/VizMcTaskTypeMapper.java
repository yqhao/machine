package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcTaskTypeEo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 任务类型表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-10-20
 */
public interface VizMcTaskTypeMapper extends BaseMapper<VizMcTaskTypeEo> {

    List<VizMcTaskTypeEo> quickPageById(@Param("pageSize") long pageSize,@Param("lastId")long lastId, @Param("ew") QueryWrapper<VizMcTaskTypeEo> wrapper);

    List<VizMcTaskTypeEo> quickPage(@Param("pageNo") long pageNo,@Param("pageSize") long pageSize, @Param("ew") QueryWrapper<VizMcTaskTypeEo> wrapper);
}
