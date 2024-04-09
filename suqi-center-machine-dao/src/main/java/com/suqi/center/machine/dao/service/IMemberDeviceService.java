package com.suqi.center.machine.dao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.suqi.center.machine.dao.entity.MemberDevice;
import com.suqi.center.machine.dao.vo.MemberDeviceVo;

/**
 * <p>
 * 用户设备表（yun_member_device） 服务类
 * </p>
 *
 * @author PC001
 * @since 2022-11-16
 */
public interface IMemberDeviceService extends IService<MemberDevice> {

    /**
     * 根据设备ID获取商户手机号
     * @param deviceId
     * @return
     */
    String getMemberNameByDeviceId(String deviceId);

    MemberDeviceVo getMemberDeviceByDeviceId(String deviceId);

}
