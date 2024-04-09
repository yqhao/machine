package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.OverrideCacheService;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Step13NewDeviceImportDataSucceed extends AbstractMoveDeviceStepState{

    @Autowired
    MoveCloudPhoneRelationServiceImpl moveCloudPhoneRelationService;

    @Autowired
    OverrideCacheService overrideCacheService;

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_13_new_device_import_data_succeed;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        //切换新旧云机关系数据
        try {
            boolean next = moveCloudPhoneRelationService.changeRelation(mcMoveDevice);
            if(next){
                overrideCacheService.addPhoneId(mcMoveDevice.getUserPhoneId());
                iMoveDeviceStepState.handler(mcMoveDevice);
            }
        } catch (Throwable e) {
            updateStatus(mcMoveDevice, MoveStateEnum.step_14_recovery_data_relation_fail);
            throw new RuntimeException(e);
        }

    }
}
