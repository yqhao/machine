package com.suqi.center.machine.dao.mapper;

import com.suqi.center.machine.dao.entity.PcpDevice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

/**
 * <p>
 * 云机id对照表 Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2023-04-20
 */
public interface PcpDeviceMapper extends BaseMapper<PcpDevice> {

    PcpDevice checkMachineExistEnv(@Param("cphPhoneId") String cphPhoneId, @Param("cphServerId") String cphServerId);

    List<PcpDevice> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<PcpDevice> wrapper);

    List<PcpDevice> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<PcpDevice> wrapper);
}
