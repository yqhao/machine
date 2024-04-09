package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.McDefaultUpdateDeviceTask;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suqi.center.machine.dao.viz.vo.McDefaultUpdateDeviceTaskListVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 更新机器默认任务表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-08-16
 */
public interface McDefaultUpdateDeviceTaskMapper extends BaseMapper<McDefaultUpdateDeviceTask> {

    List<McDefaultUpdateDeviceTask> quickPageById(@Param("pageSize") long pageSize,@Param("lastId")long lastId, @Param("ew") QueryWrapper<McDefaultUpdateDeviceTask> wrapper);

    List<McDefaultUpdateDeviceTask> quickPage(@Param("pageNo") long pageNo,@Param("pageSize") long pageSize, @Param("ew") QueryWrapper<McDefaultUpdateDeviceTask> wrapper);

    List<McDefaultUpdateDeviceTaskListVo> listVo();

    Integer checkTaskRepeat(@Param("fkMcServiceSoftwarePackageTypeId") Long fkMcServiceSoftwarePackageTypeId, @Param("supplierType") Integer supplierType);
}
