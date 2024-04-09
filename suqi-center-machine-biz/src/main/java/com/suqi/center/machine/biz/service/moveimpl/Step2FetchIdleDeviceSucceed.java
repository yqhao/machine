package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.MoveDeviceService;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Step2FetchIdleDeviceSucceed extends AbstractMoveDeviceStepState {
    @Autowired
    MoveDeviceService moveDeviceService;


    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_2_fetch_idle_device_succeed;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        //旧云机进维护和排队
        try {
            boolean next = moveDeviceService.updateFromDevicePreState(mcMoveDevice);
            if(next){
                iMoveDeviceStepState.handler(mcMoveDevice);
            }
        } catch (Throwable e) {
            updateStatus(mcMoveDevice, MoveStateEnum.step_3_old_device_before_status_fail);
            log.error(e.getMessage(), e);
            e.printStackTrace();
        }
    }
}
