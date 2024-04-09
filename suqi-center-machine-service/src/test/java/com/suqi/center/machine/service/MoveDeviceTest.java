package com.suqi.center.machine.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.mapper.EmSocDevicesMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MoveDeviceTest {

    @Autowired
    EmSocDevicesMapper emSocDevicesMapper;

    @Test
    public void test(){
        Long totals = emSocDevicesMapper.fetchIdelDeviceTotals(15L, "codetest",1L,true);
        List<String> list = emSocDevicesMapper.fetchIdelDevice(1, 10, 15L, "codetest",1L,true);
        log.info("{},{}",totals,list);
    }
}
