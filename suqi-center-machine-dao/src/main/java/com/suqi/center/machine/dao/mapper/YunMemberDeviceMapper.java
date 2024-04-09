package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.YunMemberDevice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 用户设备表（yun_member_device） Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-28
 */
public interface YunMemberDeviceMapper extends BaseMapper<YunMemberDevice> {

    List<YunMemberDevice> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<YunMemberDevice> wrapper);

    List<YunMemberDevice> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<YunMemberDevice> wrapper);
}
