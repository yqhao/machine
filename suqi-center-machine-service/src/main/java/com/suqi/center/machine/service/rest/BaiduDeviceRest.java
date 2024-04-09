package com.suqi.center.machine.service.rest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.common.dto.Page;
import com.suqi.center.common.dto.PageQueryParamBody;
import com.suqi.center.common.dto.Result;
import com.suqi.center.common.dto.ValidationGroups;
import com.suqi.center.common.utils.PropUtils;
import com.suqi.center.machine.api.dto.request.BaiduDeviceParam;
import com.suqi.center.machine.api.dto.response.BaiduDeviceResult;
import com.suqi.center.machine.api.query.IBaiduDeviceApi;
import com.suqi.center.machine.biz.service.impl.BaiduDeviceCurdServiceImpl;
import com.suqi.center.machine.dao.entity.BaiduDevice;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.suqi.center.machine.dao.entity.PcpDevice;
import com.suqi.center.machine.dao.service.IEmSocDevicesService;
import com.suqi.center.machine.dao.service.IPcpDeviceService;
import com.suqi.center.service.rest.BaseRest;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 百度云机 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@Api(tags = {"百度云机接口"})
@RestController
@Validated
@RequestMapping("/v1/machine/BaiduDevice")
public class BaiduDeviceRest extends BaseRest<BaiduDeviceCurdServiceImpl, BaiduDevice,Long, BaiduDeviceResult, BaiduDeviceParam, IBaiduDeviceApi> implements IBaiduDeviceApi{


    @Autowired
    IEmSocDevicesService iEmSocDevicesService;

    @Autowired
    IPcpDeviceService iPcpDeviceService;

    @Override
    public Result<String> reset(@Validated(ValidationGroups.Update.class) BaiduDeviceParam baiduDeviceParam) {
        return service.reset(baiduDeviceParam);
    }

    @Override
    protected QueryWrapper<BaiduDevice> queryWrapper(BaiduDeviceParam q) {
        return BaiduDevice.qWrapper()
                    //
                    .idEq(q.getId())
                    //
                    .deviceIdEq(q.getDeviceId())
                    //百度云机所属账号
                    .fkBaiduAccountIdEq(q.getFkBaiduAccountId())
                    //
                    .uidEq(q.getUid())
                    //云机编号
                    .codeEq(q.getCode())
                    //云机所属分组
                    .groupCodeEq(q.getGroupCode())
                    //机房号
                    .idcCodeEq(q.getIdcCode())
                    //当前镜像版本号
                    .imageVersionIdEq(q.getImageVersionId())
                    //最后一次重置时间
                    .lastResetTimeGe(q.getLastResetTime())
                    //最后一次重置时间结束范围值
                    .lastResetTimeLe(q.getQueryEndLastResetTime())
                    //重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,
                    .resetStatusEq(q.getResetStatus())
                    //重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id
                    .resetImageVersionIdEq(q.getResetImageVersionId())
                    //交付的订单编号
                    .orderCodeEq(q.getOrderCode())
                    //交付日期的备注
                    .deliverDayEq(q.getDeliverDay())
                    //在营销云1.0中的编号
                    .oldCodeEq(q.getOldCode())
                    //在物理机上的多开序号
                    .snEq(q.getSn())
                    //云机的虚拟ip
                    .ipEq(q.getIp())
                    //底层paas标记
                    .paasEq(q.getPaas())
                    //物理机的code
                    .deviceCodeEq(q.getDeviceCode())
                    //物理机ip
                    .deviceIpEq(q.getDeviceIp())
                    //硬件配置
                    .hardwareCodeEq(q.getHardwareCode())
                    //网段
                    .unitSegEq(q.getUnitSeg())
                    //启动时间
                    .bootTimeGe(q.getBootTime())
                    //启动时间结束范围值
                    .bootTimeLe(q.getQueryEndBootTime())
                    //上次心跳时间
                    .hbTimeGe(q.getHbTime())
                    //上次心跳时间结束范围值
                    .hbTimeLe(q.getQueryEndHbTime())
                    //报警超时时间
                    .alertExpireTimeGe(q.getAlertExpireTime())
                    //报警超时时间结束范围值
                    .alertExpireTimeLe(q.getQueryEndAlertExpireTime())
                    //已离线时长用来判断处于离线的云机是重启，还是故障
                    .offlineTimeGe(q.getOfflineTime())
                    //已离线时长用来判断处于离线的云机是重启，还是故障结束范围值
                    .offlineTimeLe(q.getQueryEndOfflineTime())
                    //上行网速，单位B/s网速测算
                    .txEq(q.getTx())
                    //下行网速，单位B/s
                    .rxEq(q.getRx())
                    //云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)
                    .statusOnlineEq(q.getStatusOnline())
                    //如果云机状态是ping离线或者启动中，这个值是已离线时长
                    .offSecondsEq(q.getOffSeconds())
                    //云机错误消息
                    .errorMessageLike(q.getErrorMessage())
                    //0 未推流 1 正在推流
                    .statusControlEq(q.getStatusControl())
                    //是否开启报警
                    .alertEnabledEq(q.getAlertEnabled())
                    //在paas中状态是否正常
                    .statusPaaSEq(q.getStatusPaaS())
                    //上次成功申请到推流token的用户名
                    .lastApplyUsernameEq(q.getLastApplyUsername())
                    //上次成功申请到token的日期
                    .lastApplyDateGe(q.getLastApplyDate())
                    //上次成功申请到token的日期结束范围值
                    .lastApplyDateLe(q.getQueryEndLastApplyDate())
                    //上次活跃日期
                    .lastActiveDateGe(q.getLastActiveDate())
                    //上次活跃日期结束范围值
                    .lastActiveDateLe(q.getQueryEndLastActiveDate())
                    //安装的应用，多个使用,分割
                    .pkgsLike(q.getPkgs())
                    //标签
                    .tagEq(q.getTag())
                    //截图是否正常
                    .captureOkEq(q.getCaptureOk())
                    //截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃
                    .capDiffEq(q.getCapDiff())
                    //dg相应字段
                    .dgVersionEq(q.getDgVersion())
                    //
                    .dgVersionCodeEq(q.getDgVersionCode())
                    //
                    .dgXmStatusEq(q.getDgXmStatus())
                    //
                    .dgTopAppLike(q.getDgTopApp())
                    //
                    .dgDisplayWidthEq(q.getDgDisplayWidth())
                    //
                    .dgAppsCountEq(q.getDgAppsCount())
                    //
                    .dgPropProductEq(q.getDgPropProduct())
                    //
                    .dgSimImeiEq(q.getDgSimImei())
                    //
                    .dgNetStatusEq(q.getDgNetStatus())
                    //
                    .dgNetBsEq(q.getDgNetBs())
                    //
                    .dgProxyHostEq(q.getDgProxyHost())
                    //
                    .dgProxyPortEq(q.getDgProxyPort())
                    //
                    .dgProxyUsernameEq(q.getDgProxyUsername())
                    //
                    .dgProxyLocationEq(q.getDgProxyLocation())
                    //
                    .dgProxyIpEq(q.getDgProxyIp())
                    //
                    .createTimeGe(q.getCreateTime())
                    //结束范围值
                    .createTimeLe(q.getQueryEndCreateTime())
                    //
                    .lastUpdateTimeGe(q.getLastUpdateTime())
                    //结束范围值
                    .lastUpdateTimeLe(q.getQueryEndLastUpdateTime())
                    //
                    .lastSyncTimeGe(q.getLastSyncTime())
                    //结束范围值
                    .lastSyncTimeLe(q.getQueryEndLastSyncTime())
                    //机房表区域id
                    .fkCloudRegionIdEq(q.getFkCloudRegionId())
                    //
                    .pubIpEq(q.getPubIp())
                    //
                    .audioSockTypeEq(q.getAudioSockType())
                    //
                    .audioPortEq(q.getAudioPort())
                    //
                    .audioExternalPortEq(q.getAudioExternalPort())
                    //
                    .videoPortEq(q.getVideoPort())
                    //
                    .videoExternalPortEq(q.getVideoExternalPort())
                    //
                    .maxslotsEq(q.getMaxslots())
                    //
                    .rtcMinPortEq(q.getRtcMinPort())
                    //
                    .rtcMaxPortEq(q.getRtcMaxPort())
                    //
                    .rtcMinExternalPortEq(q.getRtcMinExternalPort())
                    //
                    .rtcMaxExternalPortEq(q.getRtcMaxExternalPort())
                ;
    }

    @Override
    public Result<Page<String>> publicIpPage(PageQueryParamBody<String> params) {
        return service.publicIpPage(params.getP(),params.getPageSet());
    }

    @Override
    public Result<Page<BaiduDeviceResult>> queryPage(PageQueryParamBody<BaiduDeviceParam> params) {

        Result<Page<BaiduDeviceResult>> pageResult = super.queryPage(params);
        Page<BaiduDeviceResult> page = new Page<BaiduDeviceResult>();
        page.setTotalCount(pageResult.getData().getTotalCount());

        List<BaiduDeviceResult> records = pageResult.getData().getResult();
        if (Objects.nonNull(records)) {
//            PropUtils.distinctKeys(records,BaiduDeviceResult::get)
            List<String> codes = PropUtils.distinctKeys(records, BaiduDeviceResult::getCode);
            List<EmSocDevices> socs = iEmSocDevicesService.select(e -> e.deviceIdIn(codes));
            page.setResult(records.stream().map(e->{
                BaiduDeviceResult t = new BaiduDeviceResult();
                BeanUtils.copyProperties(e,t);
                socs.stream().filter(x->t.getCode().equalsIgnoreCase(x.getDeviceId())).findFirst().ifPresent(d->t.setHealthStatus(d.getHealthStatus()));
                return t;
            }).toList());
            List<BaiduDeviceResult> result = page.getResult();
            List<String> rrmaping = result.stream().filter(x -> x.getHealthStatus() == null).map(BaiduDeviceResult::getDeviceId).toList();
            if(rrmaping!=null &&!rrmaping.isEmpty()){
                List<PcpDevice> pds = iPcpDeviceService.select(e -> e.phoneIdIn(rrmaping));
                if(pds!=null && !pds.isEmpty()){
                    List<String> dids = PropUtils.distinctKeys(pds, PcpDevice::getDeviceId);
                    List<EmSocDevices>  socs2 = iEmSocDevicesService.select(e -> e.deviceIdIn(dids));
                    if(socs2!=null && !socs2.isEmpty()) {
                        result.stream().filter(x -> x.getHealthStatus() == null).forEach(c -> {
                            pds.stream().filter(pd -> pd.getPhoneId().equalsIgnoreCase(c.getCode())).findFirst().ifPresent(px->{
                                socs.stream().filter(x->px.getDeviceId().equalsIgnoreCase(x.getDeviceId())).findFirst().ifPresent(d->c.setHealthStatus(d.getHealthStatus()));
                            });
                        });
                    }
                }
            }

        }
        return Result.data(page);
    }
}