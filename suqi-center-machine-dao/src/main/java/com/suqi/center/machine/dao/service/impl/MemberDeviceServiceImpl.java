package com.suqi.center.machine.dao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.MemberDevice;
import com.suqi.center.machine.dao.mapper.MemberDeviceMapper;
import com.suqi.center.machine.dao.service.IMemberDeviceService;
import com.suqi.center.machine.dao.vo.MemberDeviceVo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户设备表（yun_member_device） 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2022-11-16
 */
@Service
@Primary
@DS(DBConstants.SLAVE)
public class MemberDeviceServiceImpl extends ServiceImpl<MemberDeviceMapper, MemberDevice> implements IMemberDeviceService {

    @Override
    public String getMemberNameByDeviceId(String deviceId) {
        return baseMapper.getMemberNameByDeviceId(deviceId);
    }

    /**
     * @param deviceId
     * @return
     */
    @Override
    public MemberDeviceVo getMemberDeviceByDeviceId(String deviceId) {
        return baseMapper.getMemberDeviceByDeviceId(deviceId);
    }
}
