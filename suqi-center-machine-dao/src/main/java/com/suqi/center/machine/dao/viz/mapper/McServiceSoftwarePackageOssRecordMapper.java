package com.suqi.center.machine.dao.viz.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackageOssRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 云机端软件包对象存储记录表 Mapper 接口
 * </p>
 *
 * @author 18374
 * @since 2023-07-26
 */
public interface McServiceSoftwarePackageOssRecordMapper extends BaseMapper<McServiceSoftwarePackageOssRecord> {

    List<McServiceSoftwarePackageOssRecord> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper);

    List<McServiceSoftwarePackageOssRecord> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<McServiceSoftwarePackageOssRecord> wrapper);
}
