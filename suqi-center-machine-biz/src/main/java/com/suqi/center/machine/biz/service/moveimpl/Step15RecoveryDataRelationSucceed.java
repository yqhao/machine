package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.MoveDeviceService;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Step15RecoveryDataRelationSucceed extends AbstractMoveDeviceStepState {


    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_15_recovery_data_relation_succeed;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        Boolean dataMigration = mcMoveDevice.getDataMigration();
        boolean noMoveData = dataMigration == null || !dataMigration;
        try {
            if(noMoveData){
                //不迁移数据不需要重启新云机，不要重启旧云机
                //重置旧云机
                updateStatus(mcMoveDevice, MoveStateEnum.step_21_old_device_reboot_succeed);
            }else {
                //重启新云机，待上线后退出维护模式
                moveStatusService.restartNewDevice(mcMoveDevice, getPcpConfig(mcMoveDevice.getToDeviceId()));
            }
        } catch (Throwable e) {
            if(noMoveData){
                //不迁移数据不需要重启新云机
                //重试失败
                updateStatus(mcMoveDevice, MoveStateEnum.step_15_recovery_data_relation_succeed);
            }else {
                updateStatus(mcMoveDevice, MoveStateEnum.step_17_new_device_reboot_fail);
            }
            log.error(e.getMessage(), e);
        }
    }

}
