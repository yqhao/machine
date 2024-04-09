package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.dao.viz.dto.McUpdateDeviceTaskTenantListDto;
import com.suqi.center.machine.dao.viz.entity.McUpdateDeviceTaskTenant;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suqi.center.machine.dao.viz.vo.McUpdateDeviceTaskTenantListVo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 租户更新机器任务表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-08-16
 */
public interface McUpdateDeviceTaskTenantMapper extends BaseMapper<McUpdateDeviceTaskTenant> {

    Page<McUpdateDeviceTaskTenantListVo> listPage(@Param("param") McUpdateDeviceTaskTenantListDto param, @Param("page") Page<McUpdateDeviceTaskTenantListVo> page);

    List<McUpdateDeviceTaskTenant> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<McUpdateDeviceTaskTenant> wrapper);

    List<McUpdateDeviceTaskTenant> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<McUpdateDeviceTaskTenant> wrapper);

    Integer checkTaskRepeat(@Param("fkTenantId") Long fkTenantId, @Param("fkMcServiceSoftwarePackageTypeId") Long fkMcServiceSoftwarePackageTypeId, @Param("supplierType") Integer supplierType);
}
