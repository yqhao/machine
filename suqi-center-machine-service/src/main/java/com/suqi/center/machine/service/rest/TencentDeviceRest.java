package com.suqi.center.machine.service.rest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.common.dto.*;
import com.suqi.center.common.utils.PropUtils;
import com.suqi.center.machine.api.dto.reponse.TencentDeviceIpInfoResult;
import com.suqi.center.machine.api.dto.reponse.TencentDeviceResult;
import com.suqi.center.machine.api.dto.request.TencentDeviceParam;
import com.suqi.center.machine.api.query.ITencentDeviceApi;
import com.suqi.center.machine.biz.service.impl.TencentDeviceCurdServiceImpl;
import com.suqi.center.machine.dao.dto.TencentDeviceDto;
import com.suqi.center.machine.dao.dto.TencentDeviceIpInfoDto;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.suqi.center.machine.dao.entity.PcpDevice;
import com.suqi.center.machine.dao.entity.TencentDevice;
import com.suqi.center.machine.dao.entity.TencentDeviceAccessInfo;
import com.suqi.center.machine.dao.service.IEmSocDevicesService;
import com.suqi.center.machine.dao.service.IPcpDeviceService;
import com.suqi.center.machine.dao.service.ITencentDeviceAccessInfoService;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 腾讯设备表 接口
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@Api(tags = {"腾讯设备表接口"})
@RestController
@RequestMapping("/v1/machine/TencentDevice")
@Validated
public class TencentDeviceRest extends BaseRest<TencentDeviceCurdServiceImpl, TencentDevice, Long, TencentDeviceResult, TencentDeviceParam, ITencentDeviceApi> implements ITencentDeviceApi {

    @Autowired
    ITencentDeviceAccessInfoService iTencentDeviceAccessInfoService;

    @Autowired
    IEmSocDevicesService iEmSocDevicesService;

    @Autowired
    IPcpDeviceService iPcpDeviceService;

    @Override
    protected QueryWrapper<TencentDevice> queryWrapper(TencentDeviceParam q) {
        return TencentDevice.qWrapper()
                //
                .idEq(q.getId())
                //腾讯账号区域Id
                .fkTencentAccountAreaIdEq(q.getFkTencentAccountAreaId())
                //实例 ID
                .instanceIdEq(q.getInstanceId())
                //实例所在区域
                .regionEq(q.getRegion())
                //当前实例所使用的镜像
                .imageIdEq(q.getImageId())
                //实例类型
                .instanceTypeEq(q.getInstanceType())
                //实例内网 IP
                .ipEq(q.getIp())
                //实例所在物理宿主机编号
                .hostSerialNumberEq(q.getHostSerialNumber())
                //实例特殊配置
                .debugPropertiesStringLike(q.getDebugPropertiesString())
                //创建时间
                .createTimeGe(q.getCreateTime())
                //创建时间结束范围值
                .createTimeLe(q.getQueryEndCreateTime())
                //最后修改时间
                .lastUpdateTimeGe(q.getLastUpdateTime())
                //最后修改时间结束范围值
                .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                //最后一次重置时间
                .lastResetTimeGe(q.getLastResetTime())
                //最后一次重置时间结束范围值
                .lastResetTimeLe(q.getQueryEndLastResetTime())
                //最后一次重置任务ID
                .lastTaskIdEq(q.getLastTaskId())
                //重置使用的镜像id不配置时使用image_id当前云机使用的镜像id
                .resetImageIdEq(q.getResetImageId())
                //云机ID=实例 ID的小写
                .deviceIdEq(q.getDeviceId())
                ;
    }

    @Override
    public Result<String> reset(@Validated(ValidationGroups.Update.class) TencentDeviceParam tencentDeviceParam) {
        return service.reset(tencentDeviceParam);
    }

    @Override
    public Result<Page<TencentDeviceResult>> queryPage(PageQueryParamBody<TencentDeviceParam> params) {

        TencentDeviceParam p = params.getP();

        Page<TencentDeviceDto> pageResult = service.userPage(params.getPageSet(), createEntityFrom(p), p.getPublicIp());//super.queryPage(params);
        Page<TencentDeviceResult> page = new Page<TencentDeviceResult>();
        page.setTotalCount(pageResult.getTotalCount());

        List<TencentDeviceDto> records = pageResult.getResult();
            if (Objects.nonNull(records)) {
                List<String> instanceIds = PropUtils.distinctKeys(records, TencentDeviceDto::getInstanceId);
                List<EmSocDevices> socs = iEmSocDevicesService.select(e -> e.deviceIdIn(instanceIds));
                page.setResult(records.stream().map(e->{
                    TencentDeviceResult t = new TencentDeviceResult();
                    BeanUtils.copyProperties(e,t);
                    List<TencentDeviceIpInfoDto> publicIps = e.getPublicIps();
                    if(Objects.nonNull(publicIps)){
                        t.setPublicIps(publicIps.stream().map(a->TencentDeviceIpInfoResult.builder().isp(a.getIsp()).publicIp(a.getPublicIp()).minPort(a.getPublicPort()).build()).toList());
                    }
                    socs.stream().filter(x->t.getInstanceId().equalsIgnoreCase(x.getDeviceId())).findFirst().ifPresent(d->t.setHealthStatus(d.getHealthStatus()));
                    return t;
                }).toList());
                List<TencentDeviceResult> result = page.getResult();
                List<String> rrmaping = result.stream().filter(x -> x.getHealthStatus() == null).map(TencentDeviceResult::getDeviceId).toList();
                if(rrmaping!=null &&!rrmaping.isEmpty()){
                    List<PcpDevice> pds = iPcpDeviceService.select(e -> e.phoneIdIn(rrmaping));
                    if(pds!=null && !pds.isEmpty()){
                        List<String> dids = PropUtils.distinctKeys(pds, PcpDevice::getDeviceId);
                        List<EmSocDevices>  socs2 = iEmSocDevicesService.select(e -> e.deviceIdIn(dids));
                        if(socs2!=null && !socs2.isEmpty()) {
                            result.stream().filter(x -> x.getHealthStatus() == null).forEach(c -> {
                                pds.stream().filter(pd -> pd.getPhoneId().equalsIgnoreCase(c.getInstanceId())).findFirst().ifPresent(px->{
                                    socs.stream().filter(x->px.getDeviceId().equalsIgnoreCase(x.getDeviceId())).findFirst().ifPresent(d->c.setHealthStatus(d.getHealthStatus()));
                                });
                            });
                        }
                    }
                }


//                List<String> instanceIds = PropUtils.distinctKeys(records, TencentDeviceResult::getInstanceId);
//                List<TencentDeviceAccessInfo> address = iTencentDeviceAccessInfoService.select(e -> e.selectColumns(c -> c.instanceId().isp().publicIp().minPublicPort()/*.includes(
//                        s -> s.add("min(" + TencentDeviceAccessInfo.PUBLIC_PORT + ")"))*/).instanceIdIn(instanceIds).groupBy(
//                        TencentDeviceAccessInfo.INSTANCE_ID,
//                        TencentDeviceAccessInfo.PUBLIC_IP));
//                records.stream().forEach(i -> {
//                    i.setPublicIps(address.stream().filter(d -> d.getInstanceId().equals(i.getInstanceId())).map(
//                            a -> {
//                                return TencentDeviceIpInfoResult.builder().isp(a.getIsp()).publicIp(a.getPublicIp()).minPort(a.getPublicPort()).build();
//                            }).toList());
//                });
            }
        return Result.data(page);
    }
}