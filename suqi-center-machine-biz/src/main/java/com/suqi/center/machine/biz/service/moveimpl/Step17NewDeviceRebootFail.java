package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step17NewDeviceRebootFail extends Step15RecoveryDataRelationSucceed {

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_17_new_device_reboot_fail;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        super.handler(mcMoveDevice);
    }
}
