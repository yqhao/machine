package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.viz.dto.TaskRecordPageDto;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskListVo;
import com.suqi.center.machine.dao.vo.TaskRecordPageVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 机器更新任务记录表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-08-14
 */
public interface McUpdateDeviceTaskRecordMapper extends BaseMapper<McUpdateDeviceTaskRecord> {

    Page<TaskRecordPageVo> taskRecordPage(@Param("param") TaskRecordPageDto param, @Param("page") Page<McUpdateDeviceTaskListVo> page);

    List<McUpdateDeviceTaskRecord> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<McUpdateDeviceTaskRecord> wrapper);

    List<McUpdateDeviceTaskRecord> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<McUpdateDeviceTaskRecord> wrapper);
}
