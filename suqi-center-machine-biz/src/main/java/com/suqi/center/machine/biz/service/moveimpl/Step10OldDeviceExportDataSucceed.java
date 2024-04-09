package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step10OldDeviceExportDataSucceed extends AbstractMoveDeviceStepState {

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_10_old_device_export_data_succeed;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        //恢复旧云机导出数据到新云机
        String toDeviceId = mcMoveDevice.getToDeviceId();
        try {
            moveStatusService.importNewDeviceData(mcMoveDevice, getPcpDevice(toDeviceId), getPcpConfig(toDeviceId));
        } catch (Throwable e) {
            updateStatus(mcMoveDevice, MoveStateEnum.step_12_new_device_import_data_fail);
            throw new RuntimeException(e);
        }
    }
}
