package com.suqi.center.machine.dao.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.SysDeviceLabel;
import com.suqi.center.machine.dao.mapper.SysDeviceLabelMapper;
import com.suqi.center.machine.dao.service.ISysDeviceLabelService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 * 设备系统标签表 服务实现类
 * </p>
 *
 * @author PC001
 * @since 2023-03-29
 */
@Service
public class SysDeviceLabelServiceImpl extends ServiceImpl<SysDeviceLabelMapper, SysDeviceLabel> implements ISysDeviceLabelService {

    @Override
    public Integer getDeviceNum(Long tenantId, Long deviceLabelId, Integer allotStatus) {
        return baseMapper.getDeviceIdleNum(tenantId, deviceLabelId, allotStatus);
    }

    @Override
    @DS(DBConstants.SLAVE)
    public Map<Long, SysDeviceLabel> getMapByIds(List<Long> ids) {
        LambdaQueryWrapper<SysDeviceLabel> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.in(SysDeviceLabel::getId, ids);
        List<SysDeviceLabel> sysDeviceLabels = baseMapper.selectList(lambdaQueryWrapper);
        return sysDeviceLabels.stream().collect(Collectors.toMap(SysDeviceLabel::getId, each -> each, (value1, value2) -> value1));
    }

    @Override
    @DS(DBConstants.SLAVE)
    public SysDeviceLabel getInfoById(Long id) {
        LambdaQueryWrapper<SysDeviceLabel> sysDeviceLabelLambdaQueryWrapper = new LambdaQueryWrapper<>();
        sysDeviceLabelLambdaQueryWrapper.eq(SysDeviceLabel::getId, id)
                .eq(SysDeviceLabel::getStatus, 50);
        return this.getOne(sysDeviceLabelLambdaQueryWrapper, false);
    }
}
