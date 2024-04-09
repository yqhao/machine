package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step14RecoveryDataRelationFail extends Step13NewDeviceImportDataSucceed {

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_14_recovery_data_relation_fail;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        super.handler(mcMoveDevice);
    }
}
