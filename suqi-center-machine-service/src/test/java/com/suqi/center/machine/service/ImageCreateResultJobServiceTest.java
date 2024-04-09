package com.suqi.center.machine.service;

import com.suqi.center.machine.biz.schedule.ImageCreateResultTask;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ImageCreateResultJobServiceTest {

    @Autowired
    ImageCreateResultTask imageCreateResultJobService;

    @Test
    public void test() throws Exception {
        imageCreateResultJobService.imageSyncJobHandler();
    }
}
