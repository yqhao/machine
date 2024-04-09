package com.suqi.center.machine.dao.mapper;

import com.suqi.center.machine.dao.entity.PcpConfig;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 华为云配置表 Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-05-08
 */
public interface PcpConfigMapper extends BaseMapper<PcpConfig> {

    List<PcpConfig> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<PcpConfig> wrapper);

    List<PcpConfig> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<PcpConfig> wrapper);
}
