package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step5OldDeviceShutdown extends AbstractMoveDeviceStepState {

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_5_old_device_shutdown;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        //查询关机是否成功
        boolean next = moveStatusService.checkOldDeviceStopStatus(mcMoveDevice, getPcpConfig(mcMoveDevice.getFromDeviceId()));
        if (next) {
            iMoveDeviceStepState.handler(mcMoveDevice);
        }
    }
}
