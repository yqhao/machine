package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.McMoveObsConfig;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-09-25
 */
public interface McMoveObsConfigMapper extends BaseMapper<McMoveObsConfig> {

    List<McMoveObsConfig> quickPageById(@Param("pageSize") long pageSize,@Param("lastId")long lastId, @Param("ew") QueryWrapper<McMoveObsConfig> wrapper);

    List<McMoveObsConfig> quickPage(@Param("pageNo") long pageNo,@Param("pageSize") long pageSize, @Param("ew") QueryWrapper<McMoveObsConfig> wrapper);
}
