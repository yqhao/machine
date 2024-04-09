package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.TencentImages;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 腾讯镜像管理 Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-13
 */
public interface TencentImagesMapper extends BaseMapper<TencentImages> {

    List<TencentImages> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<TencentImages> wrapper);

    List<TencentImages> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<TencentImages> wrapper);
}
