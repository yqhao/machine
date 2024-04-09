package com.suqi.center.machine.biz.service.moveimpl;

import com.suqi.center.common.utils.JsonUtil;
import com.suqi.center.machine.biz.dto.BaseCloudResetParam;
import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.MoveDeviceService;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.core.kafka.KafkaService;
import com.suqi.core.kafka.dto.KafkaResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Step21OldDeviceRebootSucceed extends AbstractMoveDeviceStepState {



    @Autowired
    MoveDeviceService moveDeviceService;



    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_21_old_device_reboot_succeed;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        //开始重设置旧云机
        try {
            moveDeviceService.toDeviceExitMaintStatus(mcMoveDevice);
            String fromDeviceId = mcMoveDevice.getFromDeviceId();
            EmSocDevices emSocDevices = moveDeviceService.getEmSocDevices(fromDeviceId);
            if(emSocDevices.getHealthStatus()==0){
                return ;
            }

            //重新开机后，会自动退出维护模式，需要旧云机重新进入维护模式
            moveDeviceService.setMaint(fromDeviceId);
            KafkaResult kafkaResult = moveDeviceService.sendResetCommand(mcMoveDevice, fromDeviceId);
            if (kafkaResult != null && kafkaResult.isSuccess()) {
                updateStatus(mcMoveDevice, MoveStateEnum.step_22_old_device_reset);
            } else {
                updateStatus(mcMoveDevice, MoveStateEnum.step_23_old_device_reset_fail);
            }
        } catch (Throwable e) {
            updateStatus(mcMoveDevice, MoveStateEnum.step_23_old_device_reset_fail);
            throw new RuntimeException(e);
        }
    }



}
