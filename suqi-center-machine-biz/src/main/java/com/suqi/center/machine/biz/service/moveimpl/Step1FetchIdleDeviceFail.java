package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step1FetchIdleDeviceFail extends Step0Apply{

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_1_fetch_idle_device_fail;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        super.handler(mcMoveDevice);
    }
}
