package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step9OldDeviceExportDataFail extends Step7OldDeviceShutdownSucceed{

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_9_old_device_export_data_fail;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        super.handler(mcMoveDevice);
    }
}
