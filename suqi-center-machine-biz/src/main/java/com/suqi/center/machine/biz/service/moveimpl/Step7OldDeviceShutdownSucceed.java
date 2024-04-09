package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step7OldDeviceShutdownSucceed extends AbstractMoveDeviceStepState {

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_7_old_device_shutdown_succeed;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        //导出旧云机数据
        String deviceId = mcMoveDevice.getFromDeviceId();
        try {
            moveStatusService.exportOldDeviceData(mcMoveDevice,getPcpDevice(deviceId),getPcpConfig(deviceId));
        } catch (Throwable e) {
            updateStatus(mcMoveDevice, MoveStateEnum.step_9_old_device_export_data_fail);
            throw new RuntimeException(e);
        }
    }
}
