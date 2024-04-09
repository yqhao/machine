package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step19OldDeviceReboot extends AbstractMoveDeviceStepState {


    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_19_old_device_reboot;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        //
        boolean next= moveStatusService.checkRestartOldDeviceStatus(mcMoveDevice, getPcpConfig(mcMoveDevice.getFromDeviceId()));
        if(next){
            iMoveDeviceStepState.handler(mcMoveDevice);
        }

    }
}
