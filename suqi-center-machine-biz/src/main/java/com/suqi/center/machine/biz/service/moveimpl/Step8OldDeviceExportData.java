package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step8OldDeviceExportData extends AbstractMoveDeviceStepState {

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_8_old_device_export_data;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        //检测导出任务结果
        boolean next = moveStatusService.checkOldDeviceBatchStorageStatus(mcMoveDevice, getPcpConfig(mcMoveDevice.getFromDeviceId()));
        if (next) {
            iMoveDeviceStepState.handler(mcMoveDevice);
        }
    }
}
