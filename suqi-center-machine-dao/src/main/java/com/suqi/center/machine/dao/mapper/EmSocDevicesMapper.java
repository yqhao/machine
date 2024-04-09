package com.suqi.center.machine.dao.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 设备（em_soc_devices） Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2022-11-16
 */
@DS(DBConstants.MASTER)
@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED, rollbackFor = Throwable.class)
public interface EmSocDevicesMapper extends BaseMapper<EmSocDevices> {

    List<String> fetchIdelDevice(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("fkMemberId") Long fkMemberId,@Param("specCode") String specCode,@Param("fkPcpAreaId") Long fkPcpAreaId,@Param("moveData")boolean moveData);

    Long fetchIdelDeviceTotals(@Param("fkMemberId") Long fkMemberId,@Param("specCode") String specCode,@Param("fkPcpAreaId") Long fkPcpAreaId,@Param("moveData")boolean moveData);

    List<EmSocDevices> quickPageById(@Param("pageSize") long pageSize, @Param("lastId") long lastId, @Param("ew") QueryWrapper<EmSocDevices> wrapper);

    List<EmSocDevices> quickPage(@Param("pageNo") long pageNo, @Param("pageSize") long pageSize, @Param("ew") QueryWrapper<EmSocDevices> wrapper);
}
