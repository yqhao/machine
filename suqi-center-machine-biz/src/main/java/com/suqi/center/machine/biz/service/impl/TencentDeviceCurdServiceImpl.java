package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fast.fsyun.tencent.service.ClientConfig;
import com.fast.fsyun.tencent.service.TencentApiService;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.common.dto.Page;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.common.dto.Result;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.utils.JsonUtil;
import com.suqi.center.common.utils.ServiceContextOrgUtils;
import com.suqi.center.machine.api.dto.request.TencentDeviceParam;
import com.suqi.center.machine.api.query.ITencentResetRecordApi;
import com.suqi.center.machine.dao.dto.TencentDeviceDto;
import com.suqi.center.machine.dao.entity.*;
import com.suqi.center.machine.dao.mapper.TencentDeviceMapper;
import com.suqi.center.machine.dao.service.*;
import com.tencentcloudapi.gs.v20191118.GsClient;
import com.tencentcloudapi.gs.v20191118.models.ResetCloudDevicesResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Date;

@Service
public class TencentDeviceCurdServiceImpl extends CurdService<TencentDevice, Long, ITencentDeviceService> {
    @Autowired
    ITencentImagesService iTencentImagesService;

    @Autowired
    TencentApiService tencentApiService;
    @Autowired
    ITencentAccountService iTencentAccountService;

    @Autowired
    ITencentAccountAreaService iTencentAccountAreaService;

    @Autowired
    ClientConfig clientConfig;

    @Autowired
    ITencentDeviceAccessInfoService iTencentDeviceAccessInfoService;

    @Autowired
    TencentDeviceMapper tencentDeviceMapper;

    @Autowired
    IEmSocDevicesService iEmSocDevicesService;

    @Autowired
    IPcpDeviceService iPcpDeviceService;

    @Autowired
    ITencentResetRecordService iTencentResetRecordService;

    public TencentDeviceCurdServiceImpl() {
        this.logicDelete = false;
    }

    @Override
    protected QueryWrapper<TencentDevice> queryPageWrapper(TencentDevice q) {
        return q.queryWrapper()
                .idEq()
                .instanceIdEq()
                .fkTencentAccountAreaIdEq()
                .regionEq()
                .imageIdEq()
                .instanceTypeEq()
                .hostSerialNumberEq()
                .debugPropertiesStringLike()
                .lastTaskIdEq()
                .resetImageIdEq()
                ;
    }

    public Result<String> reset(TencentDeviceParam tencentDeviceParam) {
        GsClient client = null;
        TencentDevice tencentDevice = daoService.getById(tencentDeviceParam.getId());
        if (tencentDevice == null) {
            throw new BizException("腾讯云机不存在");
        }
        EmSocDevices emSocDevices = iEmSocDevicesService.selectOne(e -> e.deviceIdEq(tencentDevice.getDeviceId()));
        String instanceId = tencentDevice.getInstanceId();
        if(emSocDevices==null){
            emSocDevices = iEmSocDevicesService.selectOne(e -> e.deviceIdEq(instanceId));
        }
        if(emSocDevices!=null){
            //进入维护模式
            Long id = emSocDevices.getId();
            iEmSocDevicesService.update(u->u.setMaintStatus(1).idEq(id));
        }
//        if(emSocDevices==null){
            //兼容mac地址版本
            PcpDevice pcpDevice = iPcpDeviceService.selectOne(e -> e.phoneIdEq(instanceId));
            if(pcpDevice!=null){
                EmSocDevices macEmSocDevices = iEmSocDevicesService.selectOne(e -> e.deviceIdEq(pcpDevice.getDeviceId()));
                if((emSocDevices==null && macEmSocDevices!=null)||emSocDevices!=null && macEmSocDevices!=null && !emSocDevices.getId().equals(macEmSocDevices.getId())){
                    //进入维护模式
                    Long id = macEmSocDevices.getId();//mac地址版本
                    iEmSocDevicesService.update(u->u.setMaintStatus(1).idEq(id));
                }
            }
//        }



        Long fkTencentAccountAreaId = tencentDevice.getFkTencentAccountAreaId();
        if (fkTencentAccountAreaId != null) {
            TencentAccountArea tencentAccountArea = iTencentAccountAreaService.getBaseMapper().selectById(fkTencentAccountAreaId);
            TencentAccount tencentAccount = iTencentAccountService.getBaseMapper().selectById(tencentAccountArea.getFkTencentAccountId());
            if (tencentAccount != null) {
                client = clientConfig.getClient(tencentAccount.getSecretId(), tencentAccount.getSecretKey(), tencentAccount.getEndpoint(), tencentAccountArea.getRegion());
            }
        }
        if (client == null) {
            client = clientConfig.getClient();
        }
        String imageId = StringUtils.isNotEmpty(tencentDevice.getResetImageId()) && tencentDevice.getResetImageId().trim().length() != 0 ? tencentDevice.getResetImageId() : tencentDevice.getImageId();
        ResetCloudDevicesResponse response = tencentApiService.resetCloudDevices(clientConfig.getClient(), new String[]{instanceId}, imageId, null);
        String jsonString = ResetCloudDevicesResponse.toJsonString(response);
        logger.info("重置返回：{}", jsonString);
        saveResetRecod(tencentDevice, fkTencentAccountAreaId, imageId,response);
        return Result.data(jsonString);
    }

    /**
     * 保存重置历史记录
     * @param tencentDevice
     * @param fkTencentAccountAreaId
     * @param imageId
     */
    public void saveResetRecod(TencentDevice tencentDevice, Long fkTencentAccountAreaId, String imageId,ResetCloudDevicesResponse response) {
        TencentImages tencentImages = iTencentImagesService.selectOne(e -> e.fkTencentAccountAreaIdEq(fkTencentAccountAreaId).imageIdEq(imageId));
        TencentResetRecord.TencentResetRecordBuilder builder = TencentResetRecord.builder()
                .fkTencentDeviceId(tencentDevice.getId())
                .instanceId(tencentDevice.getInstanceId())
                .oldImageId(tencentDevice.getImageId())
                .resetImageId(imageId)
                .resetUserId(ObjectUtils.isEmpty(ServiceContextOrgUtils.getCurrentUserId()) ? null : Long.valueOf(ServiceContextOrgUtils.getCurrentUserId()))
                .response(response!=null?JsonUtil.objectToJson(response):null)
                .createTime(new Date())
                ;
        if(tencentImages!=null){
            builder.fkTencentImagesId(tencentImages.getId()).title(tencentImages.getTitle()).versionCode(tencentImages.getVersionCode());
        }
        iTencentResetRecordService.save(builder.build());
    }


    public Page<TencentDeviceDto> userPage(PageSet pageSet,TencentDevice tencentDevice,String publicIp){
        Page<TencentDeviceDto> page =new Page<>();
        page.setTotalCount(tencentDeviceMapper.userQuickPageCount(tencentDevice,publicIp));
        page.setResult(tencentDeviceMapper.userQuickPage(pageSet.getPageNo(),pageSet.getPageSize(),tencentDevice,publicIp));
        return page;
    }


}
