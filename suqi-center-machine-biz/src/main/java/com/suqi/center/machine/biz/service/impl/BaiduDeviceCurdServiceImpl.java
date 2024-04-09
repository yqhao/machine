package com.suqi.center.machine.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.suqi.center.biz.service.CurdService;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.common.dto.Result;
import com.suqi.center.common.exception.BizException;
import com.suqi.center.common.utils.JsonUtil;
import com.suqi.center.common.utils.ServiceContextOrgUtils;
import com.suqi.center.machine.api.dto.request.BaiduDeviceParam;
import com.suqi.center.machine.dao.entity.*;
import com.suqi.center.machine.dao.service.*;
import com.suqi.core.baidu.dto.BaiduResetRequest;
import com.suqi.core.baidu.dto.BaiduResetResponse;
import com.suqi.core.baidu.service.BaiduApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 百度云机 接口
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@Service
public class BaiduDeviceCurdServiceImpl extends CurdService<BaiduDevice, Long, IBaiduDeviceService> {

    protected static Logger log = LoggerFactory.getLogger(BaiduDeviceCurdServiceImpl.class);

    @Autowired
    BaiduApiService baiduApiService;

    @Autowired
    IBaiduAccountService baiduAccountService;

    @Autowired
    IEmSocDevicesService iEmSocDevicesService;

    @Autowired
    IPcpDeviceService iPcpDeviceService;

    @Autowired
    IBaiduResetRecordService iBaiduResetRecordService;

    @Autowired
    IBaiduImagesService iBaiduImagesService;

    public Result<String> reset(BaiduDeviceParam baiduDeviceParam) {
        Long id = baiduDeviceParam.getId();
        if (id == null) {
            throw new BizException("云机记录id不能为空！");
        }
        BaiduDevice b = daoService.getById(id);
        if (b == null) {
            throw new BizException("云机记录不存在！");
        }
        String code = b.getCode();
        BaiduAccount a = baiduAccountService.getById(code);
        //进维护模式
        EmSocDevices emSocDevices = iEmSocDevicesService.selectOne(e -> e.deviceIdEq(b.getDeviceId()));
        if (emSocDevices == null) {
            emSocDevices = iEmSocDevicesService.selectOne(e -> e.deviceIdEq(code));
        }
        if (emSocDevices != null) {
            //进入维护模式
            Long socId = emSocDevices.getId();
            iEmSocDevicesService.update(u -> u.setMaintStatus(1).idEq(socId));
        }
        PcpDevice pcpDevice = iPcpDeviceService.selectOne(e -> e.phoneIdEq(code));
        if (pcpDevice != null) {
            EmSocDevices macEmSocDevices = iEmSocDevicesService.selectOne(e -> e.deviceIdEq(pcpDevice.getDeviceId()));
            if ((emSocDevices == null && macEmSocDevices != null) || emSocDevices != null && macEmSocDevices != null && !emSocDevices.getId().equals(macEmSocDevices.getId())) {
                //进入维护模式
                //mac地址版本
                Long socId = macEmSocDevices.getId();
                iEmSocDevicesService.update(u -> u.setMaintStatus(1).idEq(socId));
            }
        }
        //调用百度重置
        BaiduResetRequest req = new BaiduResetRequest(b.getGroupCode());
        req.setCodes(Arrays.asList(code));
        log.info("百度重置请求：{}", JsonUtil.objectToJson(req));
        BaiduResetResponse response = baiduApiService.reset(a.getHost(), a.getBearerToken(), req);
        String json = JsonUtil.objectToJson(response);
        log.info("百度重置返回：{}", json);
        //记录重置任务id
        String taskUid = String.valueOf(response.getData().getUid());
        daoService.update(u -> u.setResetStatus(1).setResetTastUid(taskUid).setResetReponse(json).setLastUpdateTime(new Date()).idEq(b.getId()));
        //待定时器更新镜像

        saveResetRecod(b, response);

        return Result.data(json);
    }

    /**
     * 保存重置历史记录
     * @param b
     * @param response
     */
    public void saveResetRecod(BaiduDevice b, BaiduResetResponse response) {
        String resetImageVersionId = ObjectUtils.isEmpty(b.getResetImageVersionId()) ? b.getImageVersionId() : b.getResetImageVersionId();
        BaiduResetRecord.BaiduResetRecordBuilder builder = BaiduResetRecord.builder()
                .fkBaiduDeviceId(b.getId())
                .code(b.getCode())
                .oldImageVersionId(b.getImageVersionId())
                .resetImageVersionId(resetImageVersionId)
                .resetUserId(ObjectUtils.isEmpty(ServiceContextOrgUtils.getCurrentUserId()) ? null : Long.valueOf(ServiceContextOrgUtils.getCurrentUserId()))
                .response(response !=null?JsonUtil.objectToJson(response):null)
                .createTime(new Date())
                ;
        BaiduImages baiduImages = iBaiduImagesService.selectOne(e -> e.fkBaiduAccountIdEq(b.getFkBaiduAccountId()).imageVersionIdEq(resetImageVersionId));
        if(baiduImages!=null){
            builder.fkBaiduImagesId(baiduImages.getId()).title(baiduImages.getTitle()).versionCode(baiduImages.getVersionCode());
        }
        iBaiduResetRecordService.save(builder.build());
    }

    @Override
    protected QueryWrapper<BaiduDevice> queryPageWrapper(BaiduDevice q) {
        return q.queryWrapper().//
        idEq().//
        deviceIdEq().//百度云机所属账号
        fkBaiduAccountIdEq().//
        uidEq().//云机编号
        codeEq().//云机所属分组
        groupCodeEq().//机房号
        idcCodeEq().//当前镜像版本号
        imageVersionIdEq().//最后一次重置时间
        lastResetTimeGe().//重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,
        resetStatusEq().//重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id
        resetImageVersionIdEq().//交付的订单编号
        orderCodeEq().//交付日期的备注
        deliverDayEq().//在营销云1.0中的编号
        oldCodeEq().//在物理机上的多开序号
        snEq().//云机的虚拟ip
        ipEq().//底层paas标记
        paasEq().//物理机的code
        deviceCodeEq().//物理机ip
        deviceIpEq().//硬件配置
        hardwareCodeEq().//网段
        unitSegEq().//启动时间
        bootTimeGe().//上次心跳时间
        hbTimeGe().//报警超时时间
        alertExpireTimeGe().//已离线时长用来判断处于离线的云机是重启，还是故障
        offlineTimeGe().//上行网速，单位B/s网速测算
        txEq().//下行网速，单位B/s
        rxEq().//云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)
        statusOnlineEq().//如果云机状态是ping离线或者启动中，这个值是已离线时长
        offSecondsEq().//云机错误消息
        errorMessageLike().//0 未推流 1 正在推流
        statusControlEq().//是否开启报警
        alertEnabledEq().//在paas中状态是否正常
        statusPaaSEq().//上次成功申请到推流token的用户名
        lastApplyUsernameEq().//上次成功申请到token的日期
        lastApplyDateGe().//上次活跃日期
        lastActiveDateGe().//安装的应用，多个使用,分割
        pkgsLike().//标签
        tagEq().//截图是否正常
        captureOkEq().//截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃
        capDiffEq().//dg相应字段
        dgVersionEq().//
        dgVersionCodeEq().//
        dgXmStatusEq().//
        dgTopAppLike().//
        dgDisplayWidthEq().//
        dgAppsCountEq().//
        dgPropProductEq().//
        dgSimImeiEq().//
        dgNetStatusEq().//
        dgNetBsEq().//
        dgProxyHostEq().//
        dgProxyPortEq().//
        dgProxyUsernameEq().//
        dgProxyLocationEq().//
        dgProxyIpEq().//
        createTimeGe().//
        lastUpdateTimeGe().//
        lastSyncTimeGe().//机房表区域id
        fkCloudRegionIdEq().//
        pubIpEq().//
        audioSockTypeEq().//
        audioPortEq().//
        audioExternalPortEq().//
        videoPortEq().//
        videoExternalPortEq().//
        maxslotsEq().//
        rtcMinPortEq().//
        rtcMaxPortEq().//
        rtcMinExternalPortEq().//
        rtcMaxExternalPortEq().//
        resetTastUidEq().//
        uploadImageTaskIdEq().//
        resetReponseLike().//
        uploadResponseLike();
    }

    @Override
    protected Page<BaiduDevice> pageQuery(PageSet pageSet, QueryWrapper<BaiduDevice> queryWrapper) {
        return daoService.quickPage(new Page<>(pageSet.getPageNo(), pageSet.getPageSize()), queryWrapper);
    }

    public Result<com.suqi.center.common.dto.Page<String>> publicIpPage(String p, PageSet pageSet) {
        Page<BaiduDevice> page = new Page<>(pageSet.getPageNo(), pageSet.getPageSize());
        com.baomidou.mybatisplus.extension.plugins.pagination.Page<BaiduDevice> r = daoService.quickPage(page, e -> e.selectColumns(c->c.distinct().pubIp()).pubIpLike(p));
        com.suqi.center.common.dto.Page<String> data = pageSet.page();
        data.setTotalCount(r.getTotal());
        List<BaiduDevice> records = r.getRecords();
        if(records!=null) {
            data.setResult(records.stream().map(BaiduDevice::getPubIp).collect(Collectors.toList()));
        }
        return Result.data(data);

    }
}
