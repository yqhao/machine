package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.YunMemberHangUp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 商户挂机时长表 Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-29
 */
public interface YunMemberHangUpMapper extends BaseMapper<YunMemberHangUp> {

    List<YunMemberHangUp> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<YunMemberHangUp> wrapper);

    List<YunMemberHangUp> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<YunMemberHangUp> wrapper);
}
