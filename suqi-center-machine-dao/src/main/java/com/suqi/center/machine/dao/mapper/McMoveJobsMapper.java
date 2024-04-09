package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.McMoveJobs;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-24
 */
public interface McMoveJobsMapper extends BaseMapper<McMoveJobs> {

    List<McMoveJobs> quickPageById(@Param("pageSize") long pageSize,@Param("lastId")long lastId, @Param("ew") QueryWrapper<McMoveJobs> wrapper);

    List<McMoveJobs> quickPage(@Param("pageNo") long pageNo,@Param("pageSize") long pageSize, @Param("ew") QueryWrapper<McMoveJobs> wrapper);
}
