package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.viz.dto.McUpdateDeviceTaskListDto;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTask;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskInfoVo;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskListVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 更新机器任务表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-08-11
 */
public interface McUpdateDeviceTaskMapper extends BaseMapper<McUpdateDeviceTask> {

    Page<McUpdateDeviceTaskListVo> listPage(@Param("param") McUpdateDeviceTaskListDto param, @Param("page") Page<McUpdateDeviceTaskListVo> page);

    List<McUpdateDeviceTask> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<McUpdateDeviceTask> wrapper);

    List<McUpdateDeviceTask> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<McUpdateDeviceTask> wrapper);

    McUpdateDeviceTaskInfoVo info(@Param("mcUpdateDeviceTaskId") Long mcUpdateDeviceTaskId);
}
