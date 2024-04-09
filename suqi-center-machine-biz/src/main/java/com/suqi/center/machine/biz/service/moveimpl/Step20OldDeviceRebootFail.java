package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step20OldDeviceRebootFail extends Step18NewDeviceRebootSucceed {

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_20_old_device_reboot_fail;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        super.handler(mcMoveDevice);
    }
}
