package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.dao.entity.PcpConfig;
import com.suqi.center.machine.dao.entity.PcpDevice;
import com.suqi.center.machine.dao.service.IPcpConfigService;
import com.suqi.center.machine.dao.service.IPcpDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoveQueryServiceImpl  {

    @Autowired
    IPcpDeviceService iPcpDeviceService;

    @Autowired
    IPcpConfigService iPcpConfigService;


    public PcpDevice getPcpDevice(String deviceId) {
        return iPcpDeviceService.getPcpDeviceByDeviceId(deviceId);
    }

    public PcpConfig getPcpConfig(String deviceId) {
        PcpDevice pcpDevice = getPcpDevice(deviceId);
        String projectId = pcpDevice.getProjectId();
        return getPcpConfigByProjectId(projectId);
    }

    public PcpConfig getPcpConfigByProjectId(String projectId) {
        return iPcpConfigService.getPcpConfigByProjectId(projectId);
    }
}
