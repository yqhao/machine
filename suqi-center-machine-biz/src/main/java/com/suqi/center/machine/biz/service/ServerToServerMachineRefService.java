package com.suqi.center.machine.biz.service;

import com.suqi.center.common.utils.RestResponse;
import com.suqi.center.machine.api.dto.DeviceUseRecord;

import java.util.List;

public interface ServerToServerMachineRefService {

    RestResponse<String> queryDeviceIdByUuid(Long memberId, String uuid);

    RestResponse<List<DeviceUseRecord>> queryDeviceIdsByUuid(Long memberId, String uuid);

}
