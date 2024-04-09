package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.MoveDeviceService;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Step22OldDeviceReset extends AbstractMoveDeviceStepState{

    @Autowired
    MoveDeviceService moveDeviceService;

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_22_old_device_reset;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        //检测是否重置成功
        log.info("检测是否重置成功：{}",mcMoveDevice);
        moveDeviceService.checkResetOldDeviceStatus(mcMoveDevice);
    }
}
