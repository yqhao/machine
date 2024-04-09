package com.suqi.center.machine.biz.service.moveimpl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.machine.biz.enums.MoveStateEnum;
import com.suqi.center.machine.biz.service.MoveDeviceService;
import com.suqi.center.machine.biz.service.impl.PcpConfigCurdServiceImpl;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.suqi.center.machine.dao.service.impl.EmSocDevicesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Component
public class Step0Apply extends AbstractMoveDeviceStepState {


    @Autowired
    EmSocDevicesServiceImpl emSocDevicesService;

    @Autowired
    MoveDeviceService moveDeviceService;

    @Autowired
    PcpConfigCurdServiceImpl pcpConfigCurdService;

    @Override
    public MoveStateEnum state() {
        return MoveStateEnum.step_0_apply;
    }

    @Override
    public void handler(McMoveDevice mcMoveDevice) {
        try {

            boolean streaming=moveDeviceService.checkAndStopStream(mcMoveDevice);
            if(streaming){
                log.warn("userPhoneId: {},设备：{}, streaming退出中",mcMoveDevice.getUserPhoneId(),mcMoveDevice.getFromDeviceId());
                return ;
            }
            Boolean dataMigration = mcMoveDevice.getDataMigration();
            boolean noMoveData = dataMigration == null || !dataMigration;
            boolean moveData=!noMoveData;
            Page<String> page = new Page<>();
            page.setCurrent(1);
            page.setSize(100);
            Long fkMemberId = mcMoveDevice.getFkMemberId();
            String specCode = mcMoveDevice.getSpecCode();
            specCode=ObjectUtils.isEmpty(specCode)?null:specCode;
            Long fkPcpAreaId = pcpConfigCurdService.getFkPcpAreaId(mcMoveDevice);

            page = emSocDevicesService.fetchIdelDevicePage(page, fkMemberId, specCode,fkPcpAreaId,false);
            do {

                page = emSocDevicesService.fetchIdelDevicePage(page, fkMemberId,specCode,fkPcpAreaId,moveData);
                List<String> records = page.getRecords();
                log.info("换机商户：{},查询可用空闲设备：{}",mcMoveDevice.getFkMemberId(),records);
                if((records==null || records.isEmpty()) && noMoveData ){
                    //不迁移数据，可不限制区域拿设备

                    page = emSocDevicesService.fetchIdelDevicePage(page, fkMemberId,specCode,null,moveData);
                    records = page.getRecords();
                }
                if (records != null) {
                    for (String deviceId : records) {
                        boolean b = moveDeviceService.lockIdleDevice(deviceId, mcMoveDevice);
                        if(b){
                            iMoveDeviceStepState.handler(mcMoveDevice);
                            return ;
                        }
                    }

                }
                page.setCurrent(page.getCurrent()-1);
                if(page.getPages()<page.getCurrent()){
                    page.setCurrent(page.getPages());
                }
                if(page.getCurrent()<1){
                    break;
                }
            } while (page.getCurrent() >0);
        } catch (Throwable e) {
            updateStatus(mcMoveDevice,MoveStateEnum.step_1_fetch_idle_device_fail);
            throw new RuntimeException(e);
        }

    }
}
