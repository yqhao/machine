package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.BaiduDevice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 百度云机 Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
public interface BaiduDeviceMapper extends BaseMapper<BaiduDevice> {

    List<BaiduDevice> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<BaiduDevice> wrapper);

    List<BaiduDevice> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<BaiduDevice> wrapper);
}
