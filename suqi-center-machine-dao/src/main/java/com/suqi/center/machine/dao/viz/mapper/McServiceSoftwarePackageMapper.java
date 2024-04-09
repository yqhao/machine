package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 云机端软件包表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-07-25
 */
public interface McServiceSoftwarePackageMapper extends BaseMapper<McServiceSoftwarePackage> {

    List<McServiceSoftwarePackage> quickPageById(@Param("pageSize") long pageSize,@Param("lastId")long lastId, @Param("ew") QueryWrapper<McServiceSoftwarePackage> wrapper);

    List<McServiceSoftwarePackage> quickPage(@Param("pageNo") long pageNo,@Param("pageSize") long pageSize, @Param("ew") QueryWrapper<McServiceSoftwarePackage> wrapper);
}
