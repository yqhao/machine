package com.suqi.center.machine.dao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.PcpDevice;
import com.suqi.center.machine.dao.mapper.PcpDeviceMapper;
import com.suqi.center.machine.dao.service.IPcpDeviceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 云机id对照表 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2023-04-20
 */
@Service
public class PcpDeviceServiceImpl extends ServiceImpl<PcpDeviceMapper, PcpDevice> implements IPcpDeviceService {

    @Override
    @DS(DBConstants.SLAVE)
    public PcpDevice checkMachineExistEnv(String cphPhoneId, String cphServerId) {
        PcpDevice pcpDevice = baseMapper.checkMachineExistEnv(cphPhoneId, cphServerId);
        return pcpDevice;
    }

    @Override
    @DS(DBConstants.SLAVE)
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED,rollbackFor = Throwable.class)
    public PcpDevice getPcpDeviceByDeviceId(String deviceId) {
        LambdaQueryWrapper<PcpDevice> pcpDeviceLambdaQueryWrapper = new LambdaQueryWrapper<>();
        pcpDeviceLambdaQueryWrapper.eq(PcpDevice::getDeviceId, deviceId).last("limit 1");
        PcpDevice pcpDevice = this.getOne(pcpDeviceLambdaQueryWrapper);
        return pcpDevice;
    }

    @Override
    @DS(DBConstants.SLAVE)
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED,rollbackFor = Throwable.class)
    public PcpDevice selectByPhoneIdAndServerId(String phoneId, String serverId) {
        LambdaQueryWrapper<PcpDevice> pcpDeviceLambdaQueryWrapper = new LambdaQueryWrapper<>();
        pcpDeviceLambdaQueryWrapper.eq(PcpDevice::getPhoneId, phoneId).eq(PcpDevice::getServerId, serverId).last("limit 1");
        return this.getOne(pcpDeviceLambdaQueryWrapper);
    }

    @Override
    @DS(DBConstants.SLAVE)
    public PcpDevice getPcpDeviceByServerId(String serverId) {
        LambdaQueryWrapper<PcpDevice> pcpDeviceLambdaQueryWrapper = new LambdaQueryWrapper<>();
        pcpDeviceLambdaQueryWrapper.eq(PcpDevice::getServerId, serverId).last("limit 1");
        return this.getOne(pcpDeviceLambdaQueryWrapper);
    }

    @Override
    @DS(DBConstants.SLAVE)
    public Page<PcpDevice> quickPageById(boolean queryTotals, Page<PcpDevice> page, long lastId, QueryWrapper<PcpDevice> wrapper) {
        page.setCurrent(page.getCurrent());
        if (queryTotals) {
            long total = 0L;
            boolean overrideSelect = false;
            String sqlSelect = wrapper.getSqlSelect();
            if (sqlSelect != null && !"".equals(sqlSelect) && sqlSelect.indexOf(",") > 0) {
                wrapper.select("*");
                overrideSelect = true;
            }
            total = baseMapper.selectCount(wrapper);
            if (overrideSelect) {
                wrapper.select(sqlSelect);
            }
            page.setTotal(total);
            if (total == 0L) {
                return page;
            }
        }
        page.setRecords(baseMapper.quickPageById(page.getSize(), lastId, wrapper));
        return page;
    }

    @Override
    @DS(DBConstants.SLAVE)
    public Page<PcpDevice> quickPage(Page<PcpDevice> page, QueryWrapper<PcpDevice> wrapper) {
        long total = 0L;
        boolean overrideSelect = false;
        String sqlSelect = wrapper.getSqlSelect();
        if (sqlSelect != null && !"".equals(sqlSelect) && sqlSelect.indexOf(",") > 0) {
            wrapper.select("*");
            overrideSelect = true;
        }
        total = baseMapper.selectCount(wrapper);
        if (overrideSelect) {
            wrapper.select(sqlSelect);
        }
        page.setTotal(total);
        if (total > 0L) {
            page.setRecords(baseMapper.quickPage(page.getCurrent(), page.getSize(), wrapper));
        }
        return page;
    }
}
