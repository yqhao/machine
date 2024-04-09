package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.VizMcDeviceTaskEo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 机器任务表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-10-20
 */
public interface VizMcDeviceTaskMapper extends BaseMapper<VizMcDeviceTaskEo> {

    List<VizMcDeviceTaskEo> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<VizMcDeviceTaskEo> wrapper);

    List<VizMcDeviceTaskEo> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<VizMcDeviceTaskEo> wrapper);
}
