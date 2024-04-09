package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.utils.SystemClock;
import com.suqi.center.machine.api.dto.reponse.DevicesLabelListResult;
import com.suqi.center.machine.api.dto.request.AddDevicesLabelParam;
import com.suqi.center.machine.api.dto.request.DevicesLabelListParam;
import com.suqi.center.machine.biz.service.DeviceLabelService;
import com.suqi.center.machine.dao.dto.DevicesLabelListDto;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.suqi.center.machine.dao.entity.EmSocDevicesLabel;
import com.suqi.center.machine.dao.mapper.EmSocDevicesLabelMapper;
import com.suqi.center.machine.dao.service.IEmSocDevicesService;
import com.suqi.center.machine.dao.vo.DevicesLabelListVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 设备标签接口实现层
 *
 * @version 1.0
 * @date 2023/3/30 15:03
 */
@Service
@Slf4j
public class DeviceLabelServiceImpl implements DeviceLabelService {

    @Resource
    EmSocDevicesLabelMapper emSocDevicesLabelMapper;

    @Resource
    IEmSocDevicesService iEmSocDevicesService;

    @Override
    public Page<DevicesLabelListResult> list(DevicesLabelListParam param) {
        Page page = new Page<>(param.getCurrent(), param.getSize());
        DevicesLabelListDto paramDto = new DevicesLabelListDto();
        paramDto.setDeviceId(param.getDeviceId());
        paramDto.setExternalAddr(param.getExternalAddr());
        paramDto.setStatus(param.getStatus());
        page = emSocDevicesLabelMapper.list(paramDto ,page);
        if (page.getRecords().size() > 0) {
            List<DevicesLabelListResult> devicesLabelListResults = new ArrayList<>();
            page.getRecords().forEach(e -> devicesLabelListResults.add(devicesLabelListVoToDevicesLabelListResult((DevicesLabelListVo) e)));
            page.setRecords(devicesLabelListResults);
        }
        return page;
    }

    @Override
    public Boolean saveOrUpdate(AddDevicesLabelParam param) {
        if(param.getExternalAddrs() != null && !param.getExternalAddrs().isEmpty()){
            LambdaQueryWrapper<EmSocDevices> emSocDevicesLambdaQueryWrapper = new LambdaQueryWrapper<>();
            emSocDevicesLambdaQueryWrapper.in(EmSocDevices::getExternalAddr, param.getExternalAddrs())
                    .eq(EmSocDevices::getStatus, 50)
                    .select(EmSocDevices::getDeviceId);
            List<EmSocDevices> emSocDevices = iEmSocDevicesService.list(emSocDevicesLambdaQueryWrapper);
            param.setDeviceIds(emSocDevices.stream().map(EmSocDevices::getDeviceId).collect(Collectors.toList()));
        }
        List<EmSocDevicesLabel> updateList = new ArrayList<>();
        for (String deviceId : param.getDeviceIds()) {
            EmSocDevicesLabel update = new EmSocDevicesLabel();
            update.setDeviceId(deviceId);
            update.setFkSysDeviceLabelId(param.getFkSysDeviceLabelId());
            update.setStatus(param.getStatus());
            update.setCreateTime(SystemClock.date());
            update.setLastUpdateTime(SystemClock.date());
            update.setVersionId(0L);
            updateList.add(update);
        }
        if(updateList.isEmpty()){
            log.info("没有需要修改的设备数");
            return false;
        }
        return emSocDevicesLabelMapper.saveOrUpdate(updateList) > 0;
    }

    public DevicesLabelListResult devicesLabelListVoToDevicesLabelListResult(DevicesLabelListVo devicesLabelListVo) {
        DevicesLabelListResult devicesLabelListResult = new DevicesLabelListResult();
        devicesLabelListResult.setDeviceId(devicesLabelListVo.getDeviceId());
        devicesLabelListResult.setExternalAddr(devicesLabelListVo.getExternalAddr());
        devicesLabelListResult.setInternalAddr(devicesLabelListVo.getInternalAddr());
        devicesLabelListResult.setFkSysDeviceLabelId(devicesLabelListVo.getFkSysDeviceLabelId());
        devicesLabelListResult.setSysDeviceLabelName(devicesLabelListVo.getSysDeviceLabelName());
        devicesLabelListResult.setStatus(devicesLabelListVo.getStatus());
        devicesLabelListResult.setCreateTime(devicesLabelListVo.getCreateTime());
        devicesLabelListResult.setLastUpdateTime(devicesLabelListVo.getLastUpdateTime());
        return devicesLabelListResult;
    }

}
