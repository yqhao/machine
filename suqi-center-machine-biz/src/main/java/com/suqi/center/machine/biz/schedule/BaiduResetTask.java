package com.suqi.center.machine.biz.schedule;

import com.suqi.center.common.lock.annotations.TraceId;
import com.suqi.center.machine.biz.service.impl.BaiduResetAfterServiceImpl;
import com.suqi.center.machine.dao.service.IBaiduDeviceService;
import com.suqi.center.machine.dao.wrapper.BaiduDeviceQueryWrapper;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@RefreshScope
public class BaiduResetTask {
    private static Logger log = LoggerFactory.getLogger(BaiduResetTask.class);




    @Autowired
    IBaiduDeviceService baiduDeviceService;

    @Autowired
    BaiduResetAfterServiceImpl baiduResetAfterService;


    @XxlJob("suqi-center-machine/ImageCreateResultTask.baiduRestCheckSyncJobHandler")
    @TraceId
    //@Scheduled(cron = "0/10 * * * * *")
    public void baiduRestCheckSyncJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, 百度重置同步任务.");
        baiduDeviceService.pageConsumer(50, BaiduDeviceQueryWrapper.wrapper().resetStatusEq(1), t -> {
            baiduResetAfterService.syncResetStatus(t);
        });
        baiduDeviceService.pageConsumer(50, BaiduDeviceQueryWrapper.wrapper().resetStatusEq(2), t -> {
            baiduResetAfterService.recoverResetFail(t);
        });
        baiduDeviceService.pageConsumer(50, BaiduDeviceQueryWrapper.wrapper().resetStatusEq(4), t -> {
            baiduResetAfterService.syncUpgradeStatus(t);
        });
        baiduDeviceService.pageConsumer(50, BaiduDeviceQueryWrapper.wrapper().resetStatusEq(5), t -> {
            baiduResetAfterService.upgradeImage(t);
        });
    }


}
