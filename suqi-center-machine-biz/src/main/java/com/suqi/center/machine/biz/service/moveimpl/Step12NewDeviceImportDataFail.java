package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step12NewDeviceImportDataFail extends Step10OldDeviceExportDataSucceed{

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_12_new_device_import_data_fail;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
            super.handler(mcMoveDevice);
    }
}
