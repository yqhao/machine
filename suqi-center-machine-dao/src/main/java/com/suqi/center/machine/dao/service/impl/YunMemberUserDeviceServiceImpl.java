package com.suqi.center.machine.dao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.YunMemberUserDevice;
import com.suqi.center.machine.dao.mapper.YunMemberUserDeviceMapper;
import com.suqi.center.machine.dao.service.IYunMemberUserDeviceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.wrapper.YunMemberUserDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberUserDeviceUpdateWrapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;

/**
 * <p>
 * 商户用户设备表（yun_member_user_device） 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2023-05-19
 */
@Service
public class YunMemberUserDeviceServiceImpl extends ServiceImpl<YunMemberUserDeviceMapper, YunMemberUserDevice> implements IYunMemberUserDeviceService {

    @Override
    @DS(DBConstants.POOL_SLAVE)
    public long count(Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer) {
        return IYunMemberUserDeviceService.super.count(wrapperConsumer);
    }

    @Override
    @DS(DBConstants.POOL_SLAVE)
    public YunMemberUserDevice selectOne(Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer) {
        return IYunMemberUserDeviceService.super.selectOne(wrapperConsumer);
    }

    @Override
    @DS(DBConstants.POOL_SLAVE)
    public List<YunMemberUserDevice> select(Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer) {
        return IYunMemberUserDeviceService.super.select(wrapperConsumer);
    }

    @Override
    @DS(DBConstants.POOL_SLAVE)
    public List<YunMemberUserDevice> list(Consumer<YunMemberUserDeviceQueryWrapper> wrapperConsumer) {
        return IYunMemberUserDeviceService.super.list(wrapperConsumer);
    }

    @Override
    @DS(DBConstants.POOL_MASTER)
    public boolean update(Consumer<YunMemberUserDeviceUpdateWrapper> wrapper) {
        return IYunMemberUserDeviceService.super.update(wrapper);
    }

    @Override
    @DS(DBConstants.POOL_MASTER)
    public boolean update(YunMemberUserDevice up, Consumer<YunMemberUserDeviceUpdateWrapper> wrapper) {
        return IYunMemberUserDeviceService.super.update(up, wrapper);
    }

    @Override
    @DS(DBConstants.POOL_MASTER)
    public boolean update(Consumer<YunMemberUserDevice> setUp, Consumer<YunMemberUserDeviceUpdateWrapper> wrapper) {
        return IYunMemberUserDeviceService.super.update(setUp, wrapper);
    }
}
