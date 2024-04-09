package com.suqi.center.machine.service.rest;

import com.suqi.center.common.utils.RestResponse;
import com.suqi.center.machine.api.query.IServerToServerMachineRefApi;
import com.suqi.center.machine.api.dto.DeviceUseRecord;
import com.suqi.center.machine.biz.service.ServerToServerMachineRefService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @date 2022/10/28 11:11
 */
@RestController
@RequestMapping("/v1/server")
@Slf4j
public class ServerToServerMachineRefRest implements IServerToServerMachineRefApi {
    @Resource
    ServerToServerMachineRefService serverToServerMachineRefService;

//    @PostConstruct
//    public void init(){
//        RestResponse<String> stringRestResponse = serverToServerMachineRefService.queryDeviceIdByUuid(23L, "123456");
//        log.info("{}",stringRestResponse.getData());
//    }


    @Override
    public RestResponse<String> queryDeviceIdByUuid(Long memberId, String uuid) {
        return serverToServerMachineRefService.queryDeviceIdByUuid(memberId,uuid);
    }

    @Override
    public RestResponse<List<DeviceUseRecord>> queryDeviceIdsByUuid(Long memberId, String uuid) {
        return serverToServerMachineRefService.queryDeviceIdsByUuid(memberId,uuid);
    }
}
