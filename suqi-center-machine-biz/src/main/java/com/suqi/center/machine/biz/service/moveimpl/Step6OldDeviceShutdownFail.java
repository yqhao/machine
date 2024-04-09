package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step6OldDeviceShutdownFail extends Step4OldDeviceBeforeStatusSucceed {

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_6_old_device_shutdown_fail;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        super.handler(mcMoveDevice);
    }
}
