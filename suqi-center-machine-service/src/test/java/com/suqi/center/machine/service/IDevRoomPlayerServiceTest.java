package com.suqi.center.machine.service;


import com.suqi.center.common.utils.RestResponse;
import com.suqi.center.machine.biz.service.ServerToServerMachineRefService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
//@ActiveProfiles("dev")
public class IDevRoomPlayerServiceTest  {

    @Resource
    ServerToServerMachineRefService serverToServerMachineRefService;

    @Test
    public void findOne() {
        RestResponse<String> stringRestResponse = serverToServerMachineRefService.queryDeviceIdByUuid(23L, "123456");
        log.info("{}",stringRestResponse.getData());
    }


}
