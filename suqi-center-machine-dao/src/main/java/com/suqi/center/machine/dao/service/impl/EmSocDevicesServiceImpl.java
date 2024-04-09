package com.suqi.center.machine.dao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.center.machine.dao.entity.PcpDevice;
import com.suqi.center.machine.dao.entity.YunMemberDevice;
import com.suqi.center.machine.dao.mapper.EmSocDevicesMapper;
import com.suqi.center.machine.dao.service.IEmSocDevicesService;
import com.suqi.center.machine.dao.service.IMcMoveDeviceService;
import com.suqi.center.machine.dao.service.IPcpDeviceService;
import com.suqi.center.machine.dao.service.IYunMemberDeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 设备（em_soc_devices） 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2022-11-16
 */
@Service
@Primary
public class EmSocDevicesServiceImpl extends ServiceImpl<EmSocDevicesMapper, EmSocDevices> implements IEmSocDevicesService {

    protected static Logger log = LoggerFactory.getLogger(EmSocDevicesServiceImpl.class);

    @Autowired
    EmSocDevicesMapper emSocDevicesMapper;


    @DS(DBConstants.SLAVE)
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED,rollbackFor = Throwable.class)
    public EmSocDevices getEmSocDevicesByDeviceId(String deviceId) {
        return selectOne(e->e.deviceIdEq(deviceId).statusEq(50));
    }


    public Page<String> fetchIdelDevicePage(Page<String> page, Long fkMemberId,String specCode,Long fkPcpAreaId,boolean moveData) {
        return fetchIdelDevicePage(page,fkMemberId,specCode,fkPcpAreaId,true,moveData);
    }
    public Page<String> fetchIdelDevicePage(Page<String> page, Long fkMemberId,String specCode,Long fkPcpAreaId,boolean loadData,boolean moveData) {
        Long totals = emSocDevicesMapper.fetchIdelDeviceTotals(fkMemberId,specCode,fkPcpAreaId,moveData);
        if (totals == 0) {
            return page;
        }
        page.setTotal(totals);
        if(loadData) {
            page.setCurrent(page.getCurrent()==0?1:page.getCurrent());
            List<String> ideDevices = emSocDevicesMapper.fetchIdelDevice(page.getCurrent(), page.getSize(), fkMemberId,specCode,fkPcpAreaId,moveData);
            page.setRecords(ideDevices);
        }
        return page;
    }



    @Override
    public Page<EmSocDevices> quickPageById(boolean queryTotals, Page<EmSocDevices> page, long lastId, QueryWrapper<EmSocDevices> wrapper) {
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
    public Page<EmSocDevices> quickPage(Page<EmSocDevices> page, QueryWrapper<EmSocDevices> wrapper) {
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
