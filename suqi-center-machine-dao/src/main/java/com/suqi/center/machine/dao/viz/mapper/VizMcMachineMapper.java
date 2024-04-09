package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.viz.dto.MachinePageDto;
import com.suqi.center.machine.dao.viz.entity.VizMcMachine;
import com.suqi.center.machine.dao.viz.vo.MachinePageVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 机器基础信息表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-10-11
 */
public interface VizMcMachineMapper extends BaseMapper<VizMcMachine> {

    Page<MachinePageVo> listPage(@Param("param") MachinePageDto param, @Param("page") Page<MachinePageVo> page);

    List<VizMcMachine> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<VizMcMachine> wrapper);

    List<VizMcMachine> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<VizMcMachine> wrapper);
}
