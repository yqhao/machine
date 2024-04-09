package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.MoveDeviceService;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Step16NewDeviceReboot extends AbstractMoveDeviceStepState{

    @Autowired
    MoveDeviceService moveDeviceService;

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_16_new_device_reboot;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        //检测导入新云机数据结果
        boolean next = moveStatusService.checkRestartNewDeviceStatus(mcMoveDevice, getPcpConfig(mcMoveDevice.getToDeviceId()));
        if (next) {
            moveDeviceService.toDeviceExitMaintStatus(mcMoveDevice);
            iMoveDeviceStepState.handler(mcMoveDevice);
        }
    }
}
