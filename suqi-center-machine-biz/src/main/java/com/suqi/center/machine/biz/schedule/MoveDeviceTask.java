package com.suqi.center.machine.biz.schedule;

import com.suqi.center.common.lock.annotations.RedisNx;
import com.suqi.center.common.lock.annotations.TraceId;
import com.suqi.center.common.utils.DateUtil;
import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.IMoveDeviceStepState;
import com.suqi.center.machine.biz.service.MoveDeviceService;
import com.suqi.center.machine.biz.service.MoveStatusService;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.center.machine.dao.service.IMcMoveDeviceService;
import com.suqi.center.machine.dao.wrapper.McMoveDeviceQueryWrapper;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
@RefreshScope
@EnableScheduling
public class MoveDeviceTask {
    private static Logger log = LoggerFactory.getLogger(MoveDeviceTask.class);

    @Autowired
    IMcMoveDeviceService iMcMoveDeviceService;

    @Autowired
    IMoveDeviceStepState<McMoveDevice> iMoveDeviceStepState;

    @Autowired
    MoveStatusService moveStatusService;

    @Autowired
    MoveDeviceService moveDeviceService;

    @Value("${moveDeviceTimeOut:1}")
    int moveDeviceTimeOut = 1;

    @Value("${interruptWaitTime:30}")
    int interruptWaitTime = 30;

    @Value("${waitTime:3}")
    int waitTime = 3;

    @Value("${movePageSize:50}")
    int pageSize = 50;

    static final List<Integer> checks = Arrays.asList(
            //异步结果检测
            MoveStateEnum.step_5_old_device_shutdown.value(),
            MoveStateEnum.step_8_old_device_export_data.value(),
            MoveStateEnum.step_11_new_device_import_data.value(),
            MoveStateEnum.step_16_new_device_reboot.value(),
            MoveStateEnum.step_19_old_device_reboot.value(),
            MoveStateEnum.step_22_old_device_reset.value(),
            //失败恢复
            MoveStateEnum.step_1_fetch_idle_device_fail.value(),
            MoveStateEnum.step_3_old_device_before_status_fail.value(),
            MoveStateEnum.step_6_old_device_shutdown_fail.value(),
            MoveStateEnum.step_9_old_device_export_data_fail.value(),
            MoveStateEnum.step_12_new_device_import_data_fail.value(),
            MoveStateEnum.step_14_recovery_data_relation_fail.value(),
            MoveStateEnum.step_17_new_device_reboot_fail.value(),
            MoveStateEnum.step_20_old_device_reboot_fail.value(),
            MoveStateEnum.step_21_old_device_reboot_succeed.value(),//每次检查
            MoveStateEnum.step_23_old_device_reset_fail.value()
    );

    static final List<Integer> succeeds = Arrays.asList(
            MoveStateEnum.step_2_fetch_idle_device_succeed.value(),
            MoveStateEnum.step_4_old_device_before_status_succeed.value(),
            MoveStateEnum.step_7_old_device_shutdown_succeed.value(),
            MoveStateEnum.step_10_old_device_export_data_succeed.value(),
            MoveStateEnum.step_13_new_device_import_data_succeed.value(),
            MoveStateEnum.step_15_recovery_data_relation_succeed.value(),
            MoveStateEnum.step_18_new_device_reboot_succeed.value()
    );

    /**
     * 移机任务状态机定时任务（Bean模式）
     */
    @XxlJob("suqi-center-machine/MoveDeviceTask.moveDeviceStatusSyncJobHandler")
    @TraceId
//    @Scheduled(cron = "*/5 * * * * *")
//    @RedisNx
    public void moveDeviceStatusSyncJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, 移机任务状态机定时任务.");
        log.info("移机任务状态机定时任务");

        //移机异步任务状态同步  //移机失败恢复
        iMcMoveDeviceService.pageConsumer(pageSize, McMoveDeviceQueryWrapper.wrapper().statusIn(checks).createTimeLt(DateUtil.addSeconds(new Date(), -interruptWaitTime)), t -> {
            iMoveDeviceStepState.handler(t);
        });

        //处理待执行状态中断的移机请求;
        iMcMoveDeviceService.pageConsumer(pageSize, McMoveDeviceQueryWrapper.wrapper().statusEq(MoveStateEnum.step_0_apply.value()).createTimeLt(DateUtil.addSeconds(new Date(), -waitTime)), t -> {
            iMoveDeviceStepState.handler(t);
        });
        // 处理成功后续中断的状态
        iMcMoveDeviceService.pageConsumer(pageSize, McMoveDeviceQueryWrapper.wrapper().statusIn(succeeds).lastUpdateTimeLt(DateUtil.addSeconds(new Date(), -interruptWaitTime)), t -> {
            iMoveDeviceStepState.handler(t);
        });

        //移机超时检测
        iMcMoveDeviceService.pageConsumer(pageSize, McMoveDeviceQueryWrapper.wrapper().statusBetween(0, 17).createTimeLt(DateUtil.addHours(new Date(), -moveDeviceTimeOut)), t -> {
            try {
                if (t.getStatus() < MoveStateEnum.step_15_recovery_data_relation_succeed.value()) {
                    if (t.getStatus() < MoveStateEnum.step_11_new_device_import_data.value()) {
                        //直接释放新云机
                        moveDeviceService.rollBackMoveDeviceStatus(t);
                    } else {
                        //已经执行了数据导入，需要重置新云机释放
                        moveDeviceService.rollBackMoveResetNewDeviceOldDeviceStatus(t);
                    }
                }
                moveStatusService.updateStatus(t, MoveStateEnum.step_cancel);
                log.info("换机任务超时：{}, 超时时长：", t, moveDeviceTimeOut);
            } catch (Throwable e) {
                log.error("回滚异常：" + e.getMessage(), e);
            }
        });


    }

}
