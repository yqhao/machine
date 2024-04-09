package com.suqi.center.machine.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.suqi.center.machine.dao.entity.MemberDevice;
import com.suqi.center.machine.dao.vo.MemberDeviceVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 用户设备表（yun_member_device） Mapper 接口
 * </p>
 *
 * @author PC001
 * @since 2022-11-16
 */
public interface MemberDeviceMapper extends BaseMapper<MemberDevice> {

    String getMemberNameByDeviceId(@Param("deviceId") String deviceId);

    /**
     * 根据公网ip获取当前用到的商户
     * @param externalAddr
     * @return
     */
    List<String> getMemberByExternalAddr(@Param("externalAddr") String externalAddr);

    MemberDeviceVo getMemberDeviceByDeviceId(@Param("deviceId") String deviceId);
}
