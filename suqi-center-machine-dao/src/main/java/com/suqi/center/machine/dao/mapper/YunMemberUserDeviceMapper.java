package com.suqi.center.machine.dao.mapper;

import com.suqi.center.machine.dao.entity.YunMemberUserDevice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 商户用户设备表（yun_member_user_device） Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-05-19
 */
public interface YunMemberUserDeviceMapper extends BaseMapper<YunMemberUserDevice> {

    List<YunMemberUserDevice> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<YunMemberUserDevice> wrapper);

    List<YunMemberUserDevice> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<YunMemberUserDevice> wrapper);
}
