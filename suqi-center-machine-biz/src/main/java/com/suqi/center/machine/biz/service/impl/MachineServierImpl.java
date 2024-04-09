package com.suqi.center.machine.biz.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.suqi.center.machine.biz.dto.ExternalAddrByServerIdResult;
import com.suqi.center.machine.biz.dto.HuaWeiAppResult;
import com.suqi.center.machine.biz.dto.HuaWeiTaskParam;
import com.suqi.center.machine.biz.service.MachineService;
import com.suqi.center.machine.biz.utils.huawei.HuaWeiCphUtils;
import com.suqi.center.machine.dao.constants.DBConstants;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.suqi.center.machine.dao.entity.PcpConfig;
import com.suqi.center.machine.dao.entity.PcpDevice;
import com.suqi.center.machine.dao.mapper.MemberDeviceMapper;
import com.suqi.center.machine.dao.service.IEmSocDevicesService;
import com.suqi.center.machine.dao.service.IPcpConfigService;
import com.suqi.center.machine.dao.service.IPcpDeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 1.0
 * @date 2022/10/28 11:17
 */
@Service
@Slf4j
public class MachineServierImpl implements MachineService {

    @Resource
    IPcpDeviceService iPcpDeviceService;

    @Resource
    IPcpConfigService iPcpConfigService;

    @Resource
    IEmSocDevicesService iEmSocDevicesService;

    @Resource
    MemberDeviceMapper memberDeviceMapper;

    @Override
    public Boolean restartDeviceByDeviceId(String deviceId) {
        PcpDevice pcpDevice = iPcpDeviceService.getPcpDeviceByDeviceId(deviceId);
        if(pcpDevice == null){
            return false;
        }
        PcpConfig pcpConfig = iPcpConfigService.getPcpConfigByProjectId(pcpDevice.getProjectId());
        if (pcpConfig == null){
            return false;
        }
        HuaWeiTaskParam huaWeiTaskParam = new HuaWeiTaskParam(pcpDevice.getPhoneId(), pcpDevice.getDeviceId(), null, null);
        HuaWeiAppResult huaWeiAppResult = HuaWeiCphUtils.batchRestart(pcpConfig, huaWeiTaskParam);
        return huaWeiAppResult != null;
    }

    @Override
    @DS(DBConstants.SLAVE)
    public ExternalAddrByServerIdResult getExternalAddrByServerId(String serverId) {
        ExternalAddrByServerIdResult result = new ExternalAddrByServerIdResult();
        result.setServerId(serverId);
        PcpDevice pcpDevice = iPcpDeviceService.getPcpDeviceByServerId(serverId);
        if(pcpDevice == null){
            log.info("pcpDevice 没找到；ServerId：{}", serverId);
            return result;
        }
        LambdaQueryWrapper<EmSocDevices> emSocDevicesLambdaQueryWrapper = new LambdaQueryWrapper<>();
        emSocDevicesLambdaQueryWrapper
                .eq(EmSocDevices::getDeviceId, pcpDevice.getDeviceId())
                .last("limit 1");
        EmSocDevices emSocDevices = iEmSocDevicesService.getOne(emSocDevicesLambdaQueryWrapper);
        result.setExternalAddr(emSocDevices.getExternalAddr());
        List<String> memberMobiles = memberDeviceMapper.getMemberByExternalAddr(emSocDevices.getExternalAddr());
        result.setMemberMobiles(memberMobiles);
        return result;
    }
}
