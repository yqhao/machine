package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackageType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 云机端软件包类型表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-07-25
 */
public interface McServiceSoftwarePackageTypeMapper extends BaseMapper<McServiceSoftwarePackageType> {

    List<McServiceSoftwarePackageType> quickPageById(@Param("pageSize") long pageSize,@Param("lastId")long lastId, @Param("ew") QueryWrapper<McServiceSoftwarePackageType> wrapper);

    List<McServiceSoftwarePackageType> quickPage(@Param("pageNo") long pageNo,@Param("pageSize") long pageSize, @Param("ew") QueryWrapper<McServiceSoftwarePackageType> wrapper);
}
