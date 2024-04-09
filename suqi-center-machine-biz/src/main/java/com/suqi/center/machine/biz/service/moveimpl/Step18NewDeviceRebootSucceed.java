package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step18NewDeviceRebootSucceed extends AbstractMoveDeviceStepState {



    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_18_new_device_reboot_succeed;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        //开始重启旧云机
        try {
            moveStatusService.restartOldDevice(mcMoveDevice,getPcpConfig(mcMoveDevice.getFromDeviceId()));
        } catch (Throwable e) {
            updateStatus(mcMoveDevice, MoveStateEnum.step_20_old_device_reboot_fail);
            log.error(e.getMessage(), e);
        }
    }

}
