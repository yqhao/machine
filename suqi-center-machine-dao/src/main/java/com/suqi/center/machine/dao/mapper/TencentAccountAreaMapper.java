package com.suqi.center.machine.dao.mapper;

import com.suqi.center.machine.dao.entity.TencentAccountArea;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 腾讯账号区域表 Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-02
 */
public interface TencentAccountAreaMapper extends BaseMapper<TencentAccountArea> {

    List<TencentAccountArea> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<TencentAccountArea> wrapper);

    List<TencentAccountArea> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<TencentAccountArea> wrapper);
}
