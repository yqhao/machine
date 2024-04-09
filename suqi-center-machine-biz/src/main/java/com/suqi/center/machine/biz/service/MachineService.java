package com.suqi.center.machine.biz.service;

import com.suqi.center.machine.biz.dto.ExternalAddrByServerIdResult;

/**
 * @version 1.0
 * @date 2022/10/28 11:17
 */
public interface MachineService {

    /**
     * 根据设备ID服务商重启设备
     * @param deviceId
     * @return
     */
    Boolean restartDeviceByDeviceId(String deviceId);

    /**
     * 根据华为serverId获取设备的公网IP
     * @param serverId
     * @return
     */
    ExternalAddrByServerIdResult getExternalAddrByServerId(String serverId);

}
