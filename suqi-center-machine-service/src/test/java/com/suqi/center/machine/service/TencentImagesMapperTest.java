package com.suqi.center.machine.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.machine.dao.entity.TencentDevice;
import com.suqi.center.machine.dao.entity.TencentImages;
import com.suqi.center.machine.dao.mapper.TencentDeviceMapper;
import com.suqi.center.machine.dao.mapper.TencentImagesMapper;
import com.suqi.center.machine.dao.service.ITencentDeviceService;
import com.suqi.center.machine.dao.wrapper.TencentDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentImagesQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class TencentImagesMapperTest extends BaseTest{
    protected Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    TencentImagesMapper tencentImagesMapper;

    @Autowired
    TencentDeviceMapper tencentDeviceMapper;

    @Test
    public void test(){
        List<TencentImages> xx = tencentImagesMapper.quickPage(1,10, TencentImagesQueryWrapper.wrapper().titleEq("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",xx);
        xx = tencentImagesMapper.quickPage(2,10, TencentImagesQueryWrapper.wrapper().titleEq("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",xx);
        xx = tencentImagesMapper.quickPage(3,10, TencentImagesQueryWrapper.wrapper().titleEq("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",xx);
        xx = tencentImagesMapper.quickPage(10000,10, TencentImagesQueryWrapper.wrapper().titleEq("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",xx);
    }

    @Test
    public void test2(){
        PageSet pageSet = new PageSet();

        List<TencentDevice> xx = tencentDeviceMapper.quickPage(1,10, TencentDeviceQueryWrapper.wrapper().instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",xx);
        pageSet.setPageNo(2);
        xx = tencentDeviceMapper.quickPage(2,10,TencentDeviceQueryWrapper.wrapper().instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",xx);
        pageSet.setPageNo(3);
        xx = tencentDeviceMapper.quickPage(3,10,TencentDeviceQueryWrapper.wrapper().instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",xx);
        pageSet.setPageNo(10000);
        xx = tencentDeviceMapper.quickPage(10000,10,TencentDeviceQueryWrapper.wrapper().instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",xx);

        List<TencentDevice> xx1 = tencentDeviceMapper.quickPageById(10, 0, TencentDeviceQueryWrapper.wrapper().instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",xx1);
        xx1 = tencentDeviceMapper.quickPageById(10, 80000, TencentDeviceQueryWrapper.wrapper().instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",xx1);

    }

    @Autowired
    ITencentDeviceService iTencentDeviceService;

    @Test
    public void test3(){
        Page<TencentDevice> page =null;
        page = iTencentDeviceService.quickPageById(new Page<>(1, 10), 9L, q -> q.instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",page);
        page= iTencentDeviceService.quickPageById(new Page<>(1, 10), 0L, TencentDeviceQueryWrapper.wrapper().select(TencentDevice.ID,TencentDevice.DEVICE_ID).instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",page);
        page= iTencentDeviceService.quickPageById(new Page<>(1, 10), 9L, TencentDeviceQueryWrapper.wrapper().select(TencentDevice.ID,TencentDevice.DEVICE_ID).instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",page);
        page= iTencentDeviceService.quickPageById(new Page<>(1, 10), 19L, TencentDeviceQueryWrapper.wrapper().select(TencentDevice.ID,TencentDevice.DEVICE_ID).instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",page);
        page= iTencentDeviceService.quickPage(new Page<>(1, 10), TencentDeviceQueryWrapper.wrapper().instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",page);
        page= iTencentDeviceService.quickPage(new Page<>(2, 10), TencentDeviceQueryWrapper.wrapper().instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",page);
        page= iTencentDeviceService.quickPage(new Page<>(11, 10), TencentDeviceQueryWrapper.wrapper().instanceIdGe("RK5838P1262202166_6b2aeda1-056d-4469-a335-1044876d4a8e"));
        logger.info("{}",page);

    }

    public static void main(String[] args) {
        TencentDeviceQueryWrapper xx = TencentDeviceQueryWrapper.wrapper().instanceIdGe("0000");
        xx.select(TencentDevice.ID,TencentDevice.DEVICE_ID);
        System.out.println(xx.getSqlSelect());//sqlSelect
        System.out.println(xx.getSqlSegment());
    }
}
