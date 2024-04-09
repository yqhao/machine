package com.suqi.center.machine.dao.mapper;

import com.suqi.center.machine.dao.entity.DevRoomPlayer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * <p>
 * 设备房间成员记录表（dev_room_player） Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2022-11-11
 */
public interface DevRoomPlayerMapper extends BaseMapper<DevRoomPlayer> {

    List<DevRoomPlayer> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<DevRoomPlayer> wrapper);

    List<DevRoomPlayer> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<DevRoomPlayer> wrapper);
}
