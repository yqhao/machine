package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.center.machine.dao.entity.PcpConfig;
import com.suqi.center.machine.dao.service.IPcpConfigService;
import com.suqi.center.machine.dao.service.impl.PcpConfigServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Step4OldDeviceBeforeStatusSucceed extends AbstractMoveDeviceStepState{



    @Autowired
    PcpConfigServiceImpl pcpConfigService;


    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_4_old_device_before_status_succeed;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        Boolean dataMigration = mcMoveDevice.getDataMigration();
        boolean noMoveData = dataMigration == null || !dataMigration;
        try {
            if(noMoveData){
                //不迁移数据
                //切换新旧云机关系数据
                updateStatus(mcMoveDevice, MoveStateEnum.step_13_new_device_import_data_succeed);
            }else {
                //迁移数据准备
                //关闭旧云机
                moveStatusService.stopOldDevice(mcMoveDevice, getPcpConfig(mcMoveDevice.getFromDeviceId()));
            }
        } catch (Throwable e) {
            if(noMoveData){
                updateStatus(mcMoveDevice, MoveStateEnum.step_4_old_device_before_status_succeed);
            }else {
                updateStatus(mcMoveDevice, MoveStateEnum.step_6_old_device_shutdown_fail);
            }
            throw new RuntimeException(e);
        }
    }
}
