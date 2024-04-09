package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step3OldDeviceBeforeStatusFail extends Step2FetchIdleDeviceSucceed{

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_3_old_device_before_status_fail;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        super.handler(mcMoveDevice);
    }
}
