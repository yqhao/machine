package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.stereotype.Component;

@Component
public class Step11NewDeviceImportData extends AbstractMoveDeviceStepState{

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_11_new_device_import_data;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        //检测导入新云机数据结果
        boolean next = moveStatusService.checkNewDeviceBatchReStoreStatus(mcMoveDevice, getPcpConfig(mcMoveDevice.getToDeviceId()));
        if (next) {
            iMoveDeviceStepState.handler(mcMoveDevice);
        }
    }
}
