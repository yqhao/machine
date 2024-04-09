package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step23OldDeviceResetFail extends Step21OldDeviceRebootSucceed {

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_23_old_device_reset_fail;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        super.handler(mcMoveDevice);
    }
}
