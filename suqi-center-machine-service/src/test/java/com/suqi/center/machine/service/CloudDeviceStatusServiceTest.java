package com.suqi.center.machine.service;

import com.suqi.center.machine.biz.service.ICloudDeviceStatusService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class CloudDeviceStatusServiceTest extends BaseTest{

    @Autowired
    ICloudDeviceStatusService iCloudDeviceStatusService;


    @Test
    public void test(){
        Integer deviceStatus = iCloudDeviceStatusService.deviceStatus(0L,"ac:db:be:cf:da:b8");
        log.info("{}",deviceStatus);
    }

}
