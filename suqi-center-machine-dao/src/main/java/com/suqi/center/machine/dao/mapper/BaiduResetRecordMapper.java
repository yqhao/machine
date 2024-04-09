package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.BaiduResetRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 百度云机重置记录 Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
public interface BaiduResetRecordMapper extends BaseMapper<BaiduResetRecord> {

    List<BaiduResetRecord> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<BaiduResetRecord> wrapper);

    List<BaiduResetRecord> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<BaiduResetRecord> wrapper);
}
