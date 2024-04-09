package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.BaiduDevice;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 百度云机
 * </p>
 * "baidu_device"
 * @author PC001
 */
public class BaiduDeviceUpdateWrapper extends UpdateWrapper<BaiduDevice> {

    public static BaiduDeviceUpdateWrapper wrapper() {
        return new BaiduDeviceUpdateWrapper();
    }

    public BaiduDeviceUpdateWrapper() {
        super();
    }

    public BaiduDeviceUpdateWrapper(BaiduDevice entity) {
        super(entity);
    }

    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 百度云机所属账号
     */
    public BaiduDeviceUpdateWrapper setFkBaiduAccountId(Long fkBaiduAccountId) {
         set("fk_baidu_account_id",fkBaiduAccountId);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setUid(String uid) {
         set("uid",uid);
        return this;
    }
    /**
     * 云机编号
     */
    public BaiduDeviceUpdateWrapper setCode(String code) {
         set("code",code);
        return this;
    }
    /**
     * 云机所属分组
     */
    public BaiduDeviceUpdateWrapper setGroupCode(String groupCode) {
         set("group_code",groupCode);
        return this;
    }
    /**
     * 机房号
     */
    public BaiduDeviceUpdateWrapper setIdcCode(String idcCode) {
         set("idc_code",idcCode);
        return this;
    }
    /**
     * 当前镜像版本号
     */
    public BaiduDeviceUpdateWrapper setImageVersionId(String imageVersionId) {
         set("image_version_id",imageVersionId);
        return this;
    }
    /**
     * 最后一次重置时间
     */
    public BaiduDeviceUpdateWrapper setLastResetTime(Date lastResetTime) {
         set("last_reset_time",lastResetTime);
        return this;
    }
    /**
     * 重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,
     */
    public BaiduDeviceUpdateWrapper setResetStatus(Integer resetStatus) {
         set("reset_status",resetStatus);
        return this;
    }
    /**
     * 重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id
     */
    public BaiduDeviceUpdateWrapper setResetImageVersionId(String resetImageVersionId) {
         set("reset_image_version_id",resetImageVersionId);
        return this;
    }
    /**
     * 交付的订单编号
     */
    public BaiduDeviceUpdateWrapper setOrderCode(String orderCode) {
         set("order_code",orderCode);
        return this;
    }
    /**
     * 交付日期的备注
     */
    public BaiduDeviceUpdateWrapper setDeliverDay(String deliverDay) {
         set("deliver_day",deliverDay);
        return this;
    }
    /**
     * 在营销云1.0中的编号
     */
    public BaiduDeviceUpdateWrapper setOldCode(String oldCode) {
         set("old_code",oldCode);
        return this;
    }
    /**
     * 在物理机上的多开序号
     */
    public BaiduDeviceUpdateWrapper setSn(String sn) {
         set("sn",sn);
        return this;
    }
    /**
     * 云机的虚拟ip
     */
    public BaiduDeviceUpdateWrapper setIp(String ip) {
         set("ip",ip);
        return this;
    }
    /**
     * 底层paas标记
     */
    public BaiduDeviceUpdateWrapper setPaas(String paas) {
         set("paas",paas);
        return this;
    }
    /**
     * 物理机的code
     */
    public BaiduDeviceUpdateWrapper setDeviceCode(String deviceCode) {
         set("device_code",deviceCode);
        return this;
    }
    /**
     * 物理机ip
     */
    public BaiduDeviceUpdateWrapper setDeviceIp(String deviceIp) {
         set("device_ip",deviceIp);
        return this;
    }
    /**
     * 硬件配置
     */
    public BaiduDeviceUpdateWrapper setHardwareCode(String hardwareCode) {
         set("hardware_code",hardwareCode);
        return this;
    }
    /**
     * 网段
     */
    public BaiduDeviceUpdateWrapper setUnitSeg(String unitSeg) {
         set("unit_seg",unitSeg);
        return this;
    }
    /**
     * 启动时间
     */
    public BaiduDeviceUpdateWrapper setBootTime(Date bootTime) {
         set("boot_time",bootTime);
        return this;
    }
    /**
     * 上次心跳时间
     */
    public BaiduDeviceUpdateWrapper setHbTime(Date hbTime) {
         set("hb_time",hbTime);
        return this;
    }
    /**
     * 报警超时时间
     */
    public BaiduDeviceUpdateWrapper setAlertExpireTime(Date alertExpireTime) {
         set("alert_expire_time",alertExpireTime);
        return this;
    }
    /**
     * 已离线时长用来判断处于离线的云机是重启，还是故障
     */
    public BaiduDeviceUpdateWrapper setOfflineTime(Date offlineTime) {
         set("offline_time",offlineTime);
        return this;
    }
    /**
     * 上行网速，单位B/s网速测算
     */
    public BaiduDeviceUpdateWrapper setTx(String tx) {
         set("tx",tx);
        return this;
    }
    /**
     * 下行网速，单位B/s
     */
    public BaiduDeviceUpdateWrapper setRx(String rx) {
         set("rx",rx);
        return this;
    }
    /**
     * 云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)
     */
    public BaiduDeviceUpdateWrapper setStatusOnline(Integer statusOnline) {
         set("status_online",statusOnline);
        return this;
    }
    /**
     * 如果云机状态是ping离线或者启动中，这个值是已离线时长
     */
    public BaiduDeviceUpdateWrapper setOffSeconds(Long offSeconds) {
         set("off_seconds",offSeconds);
        return this;
    }
    /**
     * 云机错误消息
     */
    public BaiduDeviceUpdateWrapper setErrorMessage(String errorMessage) {
         set("error_message",errorMessage);
        return this;
    }
    /**
     * 0 未推流 1 正在推流
     */
    public BaiduDeviceUpdateWrapper setStatusControl(Integer statusControl) {
         set("status_control",statusControl);
        return this;
    }
    /**
     * 是否开启报警
     */
    public BaiduDeviceUpdateWrapper setAlertEnabled(Boolean alertEnabled) {
         set("alert_enabled",alertEnabled);
        return this;
    }
    /**
     * 在paas中状态是否正常
     */
    public BaiduDeviceUpdateWrapper setStatusPaaS(Boolean statusPaaS) {
         set("status_paa_s",statusPaaS);
        return this;
    }
    /**
     * 上次成功申请到推流token的用户名
     */
    public BaiduDeviceUpdateWrapper setLastApplyUsername(String lastApplyUsername) {
         set("last_apply_username",lastApplyUsername);
        return this;
    }
    /**
     * 上次成功申请到token的日期
     */
    public BaiduDeviceUpdateWrapper setLastApplyDate(Date lastApplyDate) {
         set("last_apply_date",lastApplyDate);
        return this;
    }
    /**
     * 上次活跃日期
     */
    public BaiduDeviceUpdateWrapper setLastActiveDate(Date lastActiveDate) {
         set("last_active_date",lastActiveDate);
        return this;
    }
    /**
     * 安装的应用，多个使用,分割
     */
    public BaiduDeviceUpdateWrapper setPkgs(String pkgs) {
         set("pkgs",pkgs);
        return this;
    }
    /**
     * 标签
     */
    public BaiduDeviceUpdateWrapper setTag(String tag) {
         set("tag",tag);
        return this;
    }
    /**
     * 截图是否正常
     */
    public BaiduDeviceUpdateWrapper setCaptureOk(Boolean captureOk) {
         set("capture_ok",captureOk);
        return this;
    }
    /**
     * 截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃
     */
    public BaiduDeviceUpdateWrapper setCapDiff(Integer capDiff) {
         set("cap_diff",capDiff);
        return this;
    }
    /**
     * dg相应字段
     */
    public BaiduDeviceUpdateWrapper setDgVersion(String dgVersion) {
         set("dg_version",dgVersion);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgVersionCode(String dgVersionCode) {
         set("dg_version_code",dgVersionCode);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgXmStatus(String dgXmStatus) {
         set("dg_xm_status",dgXmStatus);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgTopApp(String dgTopApp) {
         set("dg_top_app",dgTopApp);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgDisplayWidth(Integer dgDisplayWidth) {
         set("dg_display_width",dgDisplayWidth);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgAppsCount(Integer dgAppsCount) {
         set("dg_apps_count",dgAppsCount);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgPropProduct(String dgPropProduct) {
         set("dg_prop_product",dgPropProduct);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgSimImei(String dgSimImei) {
         set("dg_sim_imei",dgSimImei);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgNetStatus(Integer dgNetStatus) {
         set("dg_net_status",dgNetStatus);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgNetBs(Integer dgNetBs) {
         set("dg_net_bs",dgNetBs);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgProxyHost(String dgProxyHost) {
         set("dg_proxy_host",dgProxyHost);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgProxyPort(Integer dgProxyPort) {
         set("dg_proxy_port",dgProxyPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgProxyUsername(String dgProxyUsername) {
         set("dg_proxy_username",dgProxyUsername);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgProxyLocation(String dgProxyLocation) {
         set("dg_proxy_location",dgProxyLocation);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setDgProxyIp(String dgProxyIp) {
         set("dg_proxy_ip",dgProxyIp);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setLastSyncTime(Date lastSyncTime) {
         set("last_sync_time",lastSyncTime);
        return this;
    }
    /**
     * 机房表区域id
     */
    public BaiduDeviceUpdateWrapper setFkCloudRegionId(Long fkCloudRegionId) {
         set("fk_cloud_region_id",fkCloudRegionId);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setPubIp(String pubIp) {
         set("pub_ip",pubIp);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setAudioSockType(Integer audioSockType) {
         set("audio_sock_type",audioSockType);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setAudioPort(Integer audioPort) {
         set("audio_port",audioPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setAudioExternalPort(Integer audioExternalPort) {
         set("audio_external_port",audioExternalPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setVideoPort(Integer videoPort) {
         set("video_port",videoPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setVideoExternalPort(Integer videoExternalPort) {
         set("video_external_port",videoExternalPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setMaxslots(Integer maxslots) {
         set("maxslots",maxslots);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setRtcMinPort(Integer rtcMinPort) {
         set("rtc_min_port",rtcMinPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setRtcMaxPort(Integer rtcMaxPort) {
         set("rtc_max_port",rtcMaxPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setRtcMinExternalPort(Integer rtcMinExternalPort) {
         set("rtc_min_external_port",rtcMinExternalPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setRtcMaxExternalPort(Integer rtcMaxExternalPort) {
         set("rtc_max_external_port",rtcMaxExternalPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setResetTastUid(String resetTastUid) {
         set("reset_tast_uid",resetTastUid);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setUploadImageTaskId(String uploadImageTaskId) {
         set("upload_image_task_id",uploadImageTaskId);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setResetReponse(String resetReponse) {
         set("reset_reponse",resetReponse);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateWrapper setUploadResponse(String uploadResponse) {
         set("upload_response",uploadResponse);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; deviceId
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; deviceId
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= deviceId
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; deviceId
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= deviceId
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' deviceId
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * 等于 = fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdEq(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            eq("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * 不等于 &lt;&gt; fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdNe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            ne("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * 大于 &gt; fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdGt(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            gt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * 大于等于 &gt;= fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdGe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            ge("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * 小于 &lt; fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdLt(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            lt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * 小于等于 &lt;= fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdLe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            le("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * BETWEEN 值1 AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        if(fkBaiduAccountIdStart!=null && fkBaiduAccountIdEnd!=null){
            between("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdNotBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        if(fkBaiduAccountIdStart!=null && fkBaiduAccountIdEnd!=null){
            notBetween("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>百度云机所属账号</p>
     * LIKE '%值%' fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdLike(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            like("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * NOT LIKE '%值%' fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdNotLike(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            notLike("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }


    /**
     * <p>百度云机所属账号</p>
     * LIKE '%值' fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdLikeLeft(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            likeLeft("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * LIKE '值%' fkBaiduAccountId
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdLikeRight(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            likeRight("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdIsNull(){
        isNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdIsNotNull(){
        isNotNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_baidu_account_id",value);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_baidu_account_id",values);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_baidu_account_id",value);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkBaiduAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_account_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = uid
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidEq(String uid){
        if(uid!=null){
            eq("uid",uid);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; uid
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidNe(String uid){
        if(uid!=null){
            ne("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; uid
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidGt(String uid){
        if(uid!=null){
            gt("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= uid
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidGe(String uid){
        if(uid!=null){
            ge("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; uid
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidLt(String uid){
        if(uid!=null){
            lt("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= uid
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidLe(String uid){
        if(uid!=null){
            le("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param uidStart       值1
     * @param uidEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidBetween(String uidStart,String uidEnd){
        if(uidStart!=null && uidEnd!=null){
            between("uid",uidStart,uidEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param uidStart       值1
     * @param uidEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidNotBetween(String uidStart,String uidEnd){
        if(uidStart!=null && uidEnd!=null){
            notBetween("uid",uidStart,uidEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' uid
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidLike(String uid){
        if(uid!=null){
            like("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' uid
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidNotLike(String uid){
        if(uid!=null){
            notLike("uid",uid);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' uid
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidLikeLeft(String uid){
        if(uid!=null){
            likeLeft("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' uid
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidLikeRight(String uid){
        if(uid!=null){
            likeRight("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidIsNull(){
        isNull("uid");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidIsNotNull(){
        isNotNull("uid");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("uid",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidIn(String... values){
        if(values!=null && values.length>0){
            in("uid",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("uid",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper uidNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("uid",values);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * 等于 = code
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeEq(String code){
        if(code!=null){
            eq("code",code);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * 不等于 &lt;&gt; code
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeNe(String code){
        if(code!=null){
            ne("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * 大于 &gt; code
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeGt(String code){
        if(code!=null){
            gt("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * 大于等于 &gt;= code
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeGe(String code){
        if(code!=null){
            ge("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * 小于 &lt; code
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeLt(String code){
        if(code!=null){
            lt("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * 小于等于 &lt;= code
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeLe(String code){
        if(code!=null){
            le("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * BETWEEN 值1 AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeBetween(String codeStart,String codeEnd){
        if(codeStart!=null && codeEnd!=null){
            between("code",codeStart,codeEnd);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeNotBetween(String codeStart,String codeEnd){
        if(codeStart!=null && codeEnd!=null){
            notBetween("code",codeStart,codeEnd);
        }
        return this;
     }


    /**
     * <p>云机编号</p>
     * LIKE '%值%' code
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeLike(String code){
        if(code!=null){
            like("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * NOT LIKE '%值%' code
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeNotLike(String code){
        if(code!=null){
            notLike("code",code);
        }
        return this;
     }


    /**
     * <p>云机编号</p>
     * LIKE '%值' code
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeLikeLeft(String code){
        if(code!=null){
            likeLeft("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * LIKE '值%' code
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeLikeRight(String code){
        if(code!=null){
            likeRight("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeIsNull(){
        isNull("code");
        return this;
    }

    /**
     * <p>云机编号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeIsNotNull(){
        isNotNull("code");
        return this;
    }

    /**
     * <p>云机编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("code",value);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeIn(String... values){
        if(values!=null && values.length>0){
            in("code",values);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("code",value);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper codeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("code",values);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * 等于 = groupCode
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeEq(String groupCode){
        if(groupCode!=null){
            eq("group_code",groupCode);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * 不等于 &lt;&gt; groupCode
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeNe(String groupCode){
        if(groupCode!=null){
            ne("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * 大于 &gt; groupCode
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeGt(String groupCode){
        if(groupCode!=null){
            gt("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * 大于等于 &gt;= groupCode
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeGe(String groupCode){
        if(groupCode!=null){
            ge("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * 小于 &lt; groupCode
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeLt(String groupCode){
        if(groupCode!=null){
            lt("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * 小于等于 &lt;= groupCode
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeLe(String groupCode){
        if(groupCode!=null){
            le("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * BETWEEN 值1 AND 值2
     * @param groupCodeStart       值1
     * @param groupCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeBetween(String groupCodeStart,String groupCodeEnd){
        if(groupCodeStart!=null && groupCodeEnd!=null){
            between("group_code",groupCodeStart,groupCodeEnd);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * NOT BETWEEN 值1 AND 值2
     * @param groupCodeStart       值1
     * @param groupCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeNotBetween(String groupCodeStart,String groupCodeEnd){
        if(groupCodeStart!=null && groupCodeEnd!=null){
            notBetween("group_code",groupCodeStart,groupCodeEnd);
        }
        return this;
     }


    /**
     * <p>云机所属分组</p>
     * LIKE '%值%' groupCode
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeLike(String groupCode){
        if(groupCode!=null){
            like("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * NOT LIKE '%值%' groupCode
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeNotLike(String groupCode){
        if(groupCode!=null){
            notLike("group_code",groupCode);
        }
        return this;
     }


    /**
     * <p>云机所属分组</p>
     * LIKE '%值' groupCode
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeLikeLeft(String groupCode){
        if(groupCode!=null){
            likeLeft("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * LIKE '值%' groupCode
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeLikeRight(String groupCode){
        if(groupCode!=null){
            likeRight("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeIsNull(){
        isNull("group_code");
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeIsNotNull(){
        isNotNull("group_code");
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("group_code",value);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeIn(String... values){
        if(values!=null && values.length>0){
            in("group_code",values);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("group_code",value);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper groupCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("group_code",values);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * 等于 = idcCode
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeEq(String idcCode){
        if(idcCode!=null){
            eq("idc_code",idcCode);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * 不等于 &lt;&gt; idcCode
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeNe(String idcCode){
        if(idcCode!=null){
            ne("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * 大于 &gt; idcCode
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeGt(String idcCode){
        if(idcCode!=null){
            gt("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * 大于等于 &gt;= idcCode
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeGe(String idcCode){
        if(idcCode!=null){
            ge("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * 小于 &lt; idcCode
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeLt(String idcCode){
        if(idcCode!=null){
            lt("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * 小于等于 &lt;= idcCode
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeLe(String idcCode){
        if(idcCode!=null){
            le("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * BETWEEN 值1 AND 值2
     * @param idcCodeStart       值1
     * @param idcCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeBetween(String idcCodeStart,String idcCodeEnd){
        if(idcCodeStart!=null && idcCodeEnd!=null){
            between("idc_code",idcCodeStart,idcCodeEnd);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idcCodeStart       值1
     * @param idcCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeNotBetween(String idcCodeStart,String idcCodeEnd){
        if(idcCodeStart!=null && idcCodeEnd!=null){
            notBetween("idc_code",idcCodeStart,idcCodeEnd);
        }
        return this;
     }


    /**
     * <p>机房号</p>
     * LIKE '%值%' idcCode
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeLike(String idcCode){
        if(idcCode!=null){
            like("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * NOT LIKE '%值%' idcCode
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeNotLike(String idcCode){
        if(idcCode!=null){
            notLike("idc_code",idcCode);
        }
        return this;
     }


    /**
     * <p>机房号</p>
     * LIKE '%值' idcCode
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeLikeLeft(String idcCode){
        if(idcCode!=null){
            likeLeft("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * LIKE '值%' idcCode
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeLikeRight(String idcCode){
        if(idcCode!=null){
            likeRight("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeIsNull(){
        isNull("idc_code");
        return this;
    }

    /**
     * <p>机房号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeIsNotNull(){
        isNotNull("idc_code");
        return this;
    }

    /**
     * <p>机房号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("idc_code",value);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeIn(String... values){
        if(values!=null && values.length>0){
            in("idc_code",values);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("idc_code",value);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper idcCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("idc_code",values);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * 等于 = imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdEq(String imageVersionId){
        if(imageVersionId!=null){
            eq("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * 不等于 &lt;&gt; imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdNe(String imageVersionId){
        if(imageVersionId!=null){
            ne("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * 大于 &gt; imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdGt(String imageVersionId){
        if(imageVersionId!=null){
            gt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * 大于等于 &gt;= imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdGe(String imageVersionId){
        if(imageVersionId!=null){
            ge("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * 小于 &lt; imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdLt(String imageVersionId){
        if(imageVersionId!=null){
            lt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * 小于等于 &lt;= imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdLe(String imageVersionId){
        if(imageVersionId!=null){
            le("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * BETWEEN 值1 AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdBetween(String imageVersionIdStart,String imageVersionIdEnd){
        if(imageVersionIdStart!=null && imageVersionIdEnd!=null){
            between("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdNotBetween(String imageVersionIdStart,String imageVersionIdEnd){
        if(imageVersionIdStart!=null && imageVersionIdEnd!=null){
            notBetween("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>当前镜像版本号</p>
     * LIKE '%值%' imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdLike(String imageVersionId){
        if(imageVersionId!=null){
            like("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * NOT LIKE '%值%' imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdNotLike(String imageVersionId){
        if(imageVersionId!=null){
            notLike("image_version_id",imageVersionId);
        }
        return this;
     }


    /**
     * <p>当前镜像版本号</p>
     * LIKE '%值' imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdLikeLeft(String imageVersionId){
        if(imageVersionId!=null){
            likeLeft("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * LIKE '值%' imageVersionId
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdLikeRight(String imageVersionId){
        if(imageVersionId!=null){
            likeRight("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdIsNull(){
        isNull("image_version_id");
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdIsNotNull(){
        isNotNull("image_version_id");
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("image_version_id",value);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdIn(String... values){
        if(values!=null && values.length>0){
            in("image_version_id",values);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("image_version_id",value);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper imageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_version_id",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 等于 = lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeEq(Date lastResetTime){
        if(lastResetTime!=null){
            eq("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 不等于 &lt;&gt; lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeNe(Date lastResetTime){
        if(lastResetTime!=null){
            ne("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于 &gt; lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeGt(Date lastResetTime){
        if(lastResetTime!=null){
            gt("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于等于 &gt;= lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeGe(Date lastResetTime){
        if(lastResetTime!=null){
            ge("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于 &lt; lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeLt(Date lastResetTime){
        if(lastResetTime!=null){
            lt("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于等于 &lt;= lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeLe(Date lastResetTime){
        if(lastResetTime!=null){
            le("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastResetTimeStart       值1
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        if(lastResetTimeStart!=null && lastResetTimeEnd!=null){
            between("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastResetTimeStart       值1
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeNotBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        if(lastResetTimeStart!=null && lastResetTimeEnd!=null){
            notBetween("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值%' lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeLike(Date lastResetTime){
        if(lastResetTime!=null){
            like("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT LIKE '%值%' lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeNotLike(Date lastResetTime){
        if(lastResetTime!=null){
            notLike("last_reset_time",lastResetTime);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值' lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeLikeLeft(Date lastResetTime){
        if(lastResetTime!=null){
            likeLeft("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * LIKE '值%' lastResetTime
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeLikeRight(Date lastResetTime){
        if(lastResetTime!=null){
            likeRight("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeIsNull(){
        isNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeIsNotNull(){
        isNotNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_reset_time",value);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_reset_time",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_reset_time",value);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastResetTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_reset_time",values);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 等于 = resetStatus
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusEq(Integer resetStatus){
        if(resetStatus!=null){
            eq("reset_status",resetStatus);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 不等于 &lt;&gt; resetStatus
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusNe(Integer resetStatus){
        if(resetStatus!=null){
            ne("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 大于 &gt; resetStatus
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusGt(Integer resetStatus){
        if(resetStatus!=null){
            gt("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 大于等于 &gt;= resetStatus
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusGe(Integer resetStatus){
        if(resetStatus!=null){
            ge("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 小于 &lt; resetStatus
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusLt(Integer resetStatus){
        if(resetStatus!=null){
            lt("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 小于等于 &lt;= resetStatus
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusLe(Integer resetStatus){
        if(resetStatus!=null){
            le("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * BETWEEN 值1 AND 值2
     * @param resetStatusStart       值1
     * @param resetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusBetween(Integer resetStatusStart,Integer resetStatusEnd){
        if(resetStatusStart!=null && resetStatusEnd!=null){
            between("reset_status",resetStatusStart,resetStatusEnd);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetStatusStart       值1
     * @param resetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusNotBetween(Integer resetStatusStart,Integer resetStatusEnd){
        if(resetStatusStart!=null && resetStatusEnd!=null){
            notBetween("reset_status",resetStatusStart,resetStatusEnd);
        }
        return this;
     }


    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * LIKE '%值%' resetStatus
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusLike(Integer resetStatus){
        if(resetStatus!=null){
            like("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * NOT LIKE '%值%' resetStatus
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusNotLike(Integer resetStatus){
        if(resetStatus!=null){
            notLike("reset_status",resetStatus);
        }
        return this;
     }


    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * LIKE '%值' resetStatus
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusLikeLeft(Integer resetStatus){
        if(resetStatus!=null){
            likeLeft("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * LIKE '值%' resetStatus
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusLikeRight(Integer resetStatus){
        if(resetStatus!=null){
            likeRight("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusIsNull(){
        isNull("reset_status");
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusIsNotNull(){
        isNotNull("reset_status");
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("reset_status",value);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("reset_status",values);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_status",value);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("reset_status",values);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 等于 = resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdEq(String resetImageVersionId){
        if(resetImageVersionId!=null){
            eq("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 不等于 &lt;&gt; resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdNe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            ne("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 大于 &gt; resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdGt(String resetImageVersionId){
        if(resetImageVersionId!=null){
            gt("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 大于等于 &gt;= resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdGe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            ge("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 小于 &lt; resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdLt(String resetImageVersionId){
        if(resetImageVersionId!=null){
            lt("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 小于等于 &lt;= resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdLe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            le("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * BETWEEN 值1 AND 值2
     * @param resetImageVersionIdStart       值1
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdBetween(String resetImageVersionIdStart,String resetImageVersionIdEnd){
        if(resetImageVersionIdStart!=null && resetImageVersionIdEnd!=null){
            between("reset_image_version_id",resetImageVersionIdStart,resetImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetImageVersionIdStart       值1
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdNotBetween(String resetImageVersionIdStart,String resetImageVersionIdEnd){
        if(resetImageVersionIdStart!=null && resetImageVersionIdEnd!=null){
            notBetween("reset_image_version_id",resetImageVersionIdStart,resetImageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * LIKE '%值%' resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdLike(String resetImageVersionId){
        if(resetImageVersionId!=null){
            like("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * NOT LIKE '%值%' resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdNotLike(String resetImageVersionId){
        if(resetImageVersionId!=null){
            notLike("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * LIKE '%值' resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdLikeLeft(String resetImageVersionId){
        if(resetImageVersionId!=null){
            likeLeft("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * LIKE '值%' resetImageVersionId
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdLikeRight(String resetImageVersionId){
        if(resetImageVersionId!=null){
            likeRight("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdIsNull(){
        isNull("reset_image_version_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdIsNotNull(){
        isNotNull("reset_image_version_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("reset_image_version_id",value);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdIn(String... values){
        if(values!=null && values.length>0){
            in("reset_image_version_id",values);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_image_version_id",value);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetImageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_image_version_id",values);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * 等于 = orderCode
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeEq(String orderCode){
        if(orderCode!=null){
            eq("order_code",orderCode);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * 不等于 &lt;&gt; orderCode
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeNe(String orderCode){
        if(orderCode!=null){
            ne("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * 大于 &gt; orderCode
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeGt(String orderCode){
        if(orderCode!=null){
            gt("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * 大于等于 &gt;= orderCode
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeGe(String orderCode){
        if(orderCode!=null){
            ge("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * 小于 &lt; orderCode
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeLt(String orderCode){
        if(orderCode!=null){
            lt("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * 小于等于 &lt;= orderCode
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeLe(String orderCode){
        if(orderCode!=null){
            le("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * BETWEEN 值1 AND 值2
     * @param orderCodeStart       值1
     * @param orderCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeBetween(String orderCodeStart,String orderCodeEnd){
        if(orderCodeStart!=null && orderCodeEnd!=null){
            between("order_code",orderCodeStart,orderCodeEnd);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param orderCodeStart       值1
     * @param orderCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeNotBetween(String orderCodeStart,String orderCodeEnd){
        if(orderCodeStart!=null && orderCodeEnd!=null){
            notBetween("order_code",orderCodeStart,orderCodeEnd);
        }
        return this;
     }


    /**
     * <p>交付的订单编号</p>
     * LIKE '%值%' orderCode
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeLike(String orderCode){
        if(orderCode!=null){
            like("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * NOT LIKE '%值%' orderCode
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeNotLike(String orderCode){
        if(orderCode!=null){
            notLike("order_code",orderCode);
        }
        return this;
     }


    /**
     * <p>交付的订单编号</p>
     * LIKE '%值' orderCode
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeLikeLeft(String orderCode){
        if(orderCode!=null){
            likeLeft("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * LIKE '值%' orderCode
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeLikeRight(String orderCode){
        if(orderCode!=null){
            likeRight("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeIsNull(){
        isNull("order_code");
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeIsNotNull(){
        isNotNull("order_code");
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("order_code",value);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeIn(String... values){
        if(values!=null && values.length>0){
            in("order_code",values);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("order_code",value);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper orderCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("order_code",values);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * 等于 = deliverDay
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayEq(String deliverDay){
        if(deliverDay!=null){
            eq("deliver_day",deliverDay);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * 不等于 &lt;&gt; deliverDay
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayNe(String deliverDay){
        if(deliverDay!=null){
            ne("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * 大于 &gt; deliverDay
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayGt(String deliverDay){
        if(deliverDay!=null){
            gt("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * 大于等于 &gt;= deliverDay
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayGe(String deliverDay){
        if(deliverDay!=null){
            ge("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * 小于 &lt; deliverDay
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayLt(String deliverDay){
        if(deliverDay!=null){
            lt("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * 小于等于 &lt;= deliverDay
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayLe(String deliverDay){
        if(deliverDay!=null){
            le("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * BETWEEN 值1 AND 值2
     * @param deliverDayStart       值1
     * @param deliverDayEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayBetween(String deliverDayStart,String deliverDayEnd){
        if(deliverDayStart!=null && deliverDayEnd!=null){
            between("deliver_day",deliverDayStart,deliverDayEnd);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deliverDayStart       值1
     * @param deliverDayEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayNotBetween(String deliverDayStart,String deliverDayEnd){
        if(deliverDayStart!=null && deliverDayEnd!=null){
            notBetween("deliver_day",deliverDayStart,deliverDayEnd);
        }
        return this;
     }


    /**
     * <p>交付日期的备注</p>
     * LIKE '%值%' deliverDay
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayLike(String deliverDay){
        if(deliverDay!=null){
            like("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * NOT LIKE '%值%' deliverDay
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayNotLike(String deliverDay){
        if(deliverDay!=null){
            notLike("deliver_day",deliverDay);
        }
        return this;
     }


    /**
     * <p>交付日期的备注</p>
     * LIKE '%值' deliverDay
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayLikeLeft(String deliverDay){
        if(deliverDay!=null){
            likeLeft("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * LIKE '值%' deliverDay
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayLikeRight(String deliverDay){
        if(deliverDay!=null){
            likeRight("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayIsNull(){
        isNull("deliver_day");
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayIsNotNull(){
        isNotNull("deliver_day");
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("deliver_day",value);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayIn(String... values){
        if(values!=null && values.length>0){
            in("deliver_day",values);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("deliver_day",value);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deliverDayNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("deliver_day",values);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * 等于 = oldCode
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeEq(String oldCode){
        if(oldCode!=null){
            eq("old_code",oldCode);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * 不等于 &lt;&gt; oldCode
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeNe(String oldCode){
        if(oldCode!=null){
            ne("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * 大于 &gt; oldCode
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeGt(String oldCode){
        if(oldCode!=null){
            gt("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * 大于等于 &gt;= oldCode
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeGe(String oldCode){
        if(oldCode!=null){
            ge("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * 小于 &lt; oldCode
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeLt(String oldCode){
        if(oldCode!=null){
            lt("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * 小于等于 &lt;= oldCode
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeLe(String oldCode){
        if(oldCode!=null){
            le("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * BETWEEN 值1 AND 值2
     * @param oldCodeStart       值1
     * @param oldCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeBetween(String oldCodeStart,String oldCodeEnd){
        if(oldCodeStart!=null && oldCodeEnd!=null){
            between("old_code",oldCodeStart,oldCodeEnd);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param oldCodeStart       值1
     * @param oldCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeNotBetween(String oldCodeStart,String oldCodeEnd){
        if(oldCodeStart!=null && oldCodeEnd!=null){
            notBetween("old_code",oldCodeStart,oldCodeEnd);
        }
        return this;
     }


    /**
     * <p>在营销云1.0中的编号</p>
     * LIKE '%值%' oldCode
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeLike(String oldCode){
        if(oldCode!=null){
            like("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * NOT LIKE '%值%' oldCode
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeNotLike(String oldCode){
        if(oldCode!=null){
            notLike("old_code",oldCode);
        }
        return this;
     }


    /**
     * <p>在营销云1.0中的编号</p>
     * LIKE '%值' oldCode
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeLikeLeft(String oldCode){
        if(oldCode!=null){
            likeLeft("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * LIKE '值%' oldCode
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeLikeRight(String oldCode){
        if(oldCode!=null){
            likeRight("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeIsNull(){
        isNull("old_code");
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeIsNotNull(){
        isNotNull("old_code");
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("old_code",value);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeIn(String... values){
        if(values!=null && values.length>0){
            in("old_code",values);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("old_code",value);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper oldCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("old_code",values);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * 等于 = sn
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper snEq(String sn){
        if(sn!=null){
            eq("sn",sn);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * 不等于 &lt;&gt; sn
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper snNe(String sn){
        if(sn!=null){
            ne("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * 大于 &gt; sn
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper snGt(String sn){
        if(sn!=null){
            gt("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * 大于等于 &gt;= sn
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper snGe(String sn){
        if(sn!=null){
            ge("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * 小于 &lt; sn
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper snLt(String sn){
        if(sn!=null){
            lt("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * 小于等于 &lt;= sn
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper snLe(String sn){
        if(sn!=null){
            le("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * BETWEEN 值1 AND 值2
     * @param snStart       值1
     * @param snEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper snBetween(String snStart,String snEnd){
        if(snStart!=null && snEnd!=null){
            between("sn",snStart,snEnd);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param snStart       值1
     * @param snEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper snNotBetween(String snStart,String snEnd){
        if(snStart!=null && snEnd!=null){
            notBetween("sn",snStart,snEnd);
        }
        return this;
     }


    /**
     * <p>在物理机上的多开序号</p>
     * LIKE '%值%' sn
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper snLike(String sn){
        if(sn!=null){
            like("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * NOT LIKE '%值%' sn
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper snNotLike(String sn){
        if(sn!=null){
            notLike("sn",sn);
        }
        return this;
     }


    /**
     * <p>在物理机上的多开序号</p>
     * LIKE '%值' sn
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper snLikeLeft(String sn){
        if(sn!=null){
            likeLeft("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * LIKE '值%' sn
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper snLikeRight(String sn){
        if(sn!=null){
            likeRight("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper snIsNull(){
        isNull("sn");
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper snIsNotNull(){
        isNotNull("sn");
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper snIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("sn",value);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper snIn(String... values){
        if(values!=null && values.length>0){
            in("sn",values);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper snNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("sn",value);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper snNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("sn",values);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * 等于 = ip
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipEq(String ip){
        if(ip!=null){
            eq("ip",ip);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * 不等于 &lt;&gt; ip
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipNe(String ip){
        if(ip!=null){
            ne("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * 大于 &gt; ip
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipGt(String ip){
        if(ip!=null){
            gt("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * 大于等于 &gt;= ip
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipGe(String ip){
        if(ip!=null){
            ge("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * 小于 &lt; ip
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipLt(String ip){
        if(ip!=null){
            lt("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * 小于等于 &lt;= ip
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipLe(String ip){
        if(ip!=null){
            le("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * BETWEEN 值1 AND 值2
     * @param ipStart       值1
     * @param ipEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipBetween(String ipStart,String ipEnd){
        if(ipStart!=null && ipEnd!=null){
            between("ip",ipStart,ipEnd);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * NOT BETWEEN 值1 AND 值2
     * @param ipStart       值1
     * @param ipEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipNotBetween(String ipStart,String ipEnd){
        if(ipStart!=null && ipEnd!=null){
            notBetween("ip",ipStart,ipEnd);
        }
        return this;
     }


    /**
     * <p>云机的虚拟ip</p>
     * LIKE '%值%' ip
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipLike(String ip){
        if(ip!=null){
            like("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * NOT LIKE '%值%' ip
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipNotLike(String ip){
        if(ip!=null){
            notLike("ip",ip);
        }
        return this;
     }


    /**
     * <p>云机的虚拟ip</p>
     * LIKE '%值' ip
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipLikeLeft(String ip){
        if(ip!=null){
            likeLeft("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * LIKE '值%' ip
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipLikeRight(String ip){
        if(ip!=null){
            likeRight("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipIsNull(){
        isNull("ip");
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipIsNotNull(){
        isNotNull("ip");
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("ip",value);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipIn(String... values){
        if(values!=null && values.length>0){
            in("ip",values);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("ip",value);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper ipNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("ip",values);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * 等于 = paas
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasEq(String paas){
        if(paas!=null){
            eq("paas",paas);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * 不等于 &lt;&gt; paas
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasNe(String paas){
        if(paas!=null){
            ne("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * 大于 &gt; paas
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasGt(String paas){
        if(paas!=null){
            gt("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * 大于等于 &gt;= paas
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasGe(String paas){
        if(paas!=null){
            ge("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * 小于 &lt; paas
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasLt(String paas){
        if(paas!=null){
            lt("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * 小于等于 &lt;= paas
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasLe(String paas){
        if(paas!=null){
            le("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * BETWEEN 值1 AND 值2
     * @param paasStart       值1
     * @param paasEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasBetween(String paasStart,String paasEnd){
        if(paasStart!=null && paasEnd!=null){
            between("paas",paasStart,paasEnd);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * NOT BETWEEN 值1 AND 值2
     * @param paasStart       值1
     * @param paasEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasNotBetween(String paasStart,String paasEnd){
        if(paasStart!=null && paasEnd!=null){
            notBetween("paas",paasStart,paasEnd);
        }
        return this;
     }


    /**
     * <p>底层paas标记</p>
     * LIKE '%值%' paas
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasLike(String paas){
        if(paas!=null){
            like("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * NOT LIKE '%值%' paas
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasNotLike(String paas){
        if(paas!=null){
            notLike("paas",paas);
        }
        return this;
     }


    /**
     * <p>底层paas标记</p>
     * LIKE '%值' paas
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasLikeLeft(String paas){
        if(paas!=null){
            likeLeft("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * LIKE '值%' paas
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasLikeRight(String paas){
        if(paas!=null){
            likeRight("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasIsNull(){
        isNull("paas");
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasIsNotNull(){
        isNotNull("paas");
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("paas",value);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasIn(String... values){
        if(values!=null && values.length>0){
            in("paas",values);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("paas",value);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper paasNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("paas",values);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * 等于 = deviceCode
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeEq(String deviceCode){
        if(deviceCode!=null){
            eq("device_code",deviceCode);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * 不等于 &lt;&gt; deviceCode
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeNe(String deviceCode){
        if(deviceCode!=null){
            ne("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * 大于 &gt; deviceCode
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeGt(String deviceCode){
        if(deviceCode!=null){
            gt("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * 大于等于 &gt;= deviceCode
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeGe(String deviceCode){
        if(deviceCode!=null){
            ge("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * 小于 &lt; deviceCode
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeLt(String deviceCode){
        if(deviceCode!=null){
            lt("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * 小于等于 &lt;= deviceCode
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeLe(String deviceCode){
        if(deviceCode!=null){
            le("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * BETWEEN 值1 AND 值2
     * @param deviceCodeStart       值1
     * @param deviceCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeBetween(String deviceCodeStart,String deviceCodeEnd){
        if(deviceCodeStart!=null && deviceCodeEnd!=null){
            between("device_code",deviceCodeStart,deviceCodeEnd);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceCodeStart       值1
     * @param deviceCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeNotBetween(String deviceCodeStart,String deviceCodeEnd){
        if(deviceCodeStart!=null && deviceCodeEnd!=null){
            notBetween("device_code",deviceCodeStart,deviceCodeEnd);
        }
        return this;
     }


    /**
     * <p>物理机的code</p>
     * LIKE '%值%' deviceCode
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeLike(String deviceCode){
        if(deviceCode!=null){
            like("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * NOT LIKE '%值%' deviceCode
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeNotLike(String deviceCode){
        if(deviceCode!=null){
            notLike("device_code",deviceCode);
        }
        return this;
     }


    /**
     * <p>物理机的code</p>
     * LIKE '%值' deviceCode
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeLikeLeft(String deviceCode){
        if(deviceCode!=null){
            likeLeft("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * LIKE '值%' deviceCode
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeLikeRight(String deviceCode){
        if(deviceCode!=null){
            likeRight("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeIsNull(){
        isNull("device_code");
        return this;
    }

    /**
     * <p>物理机的code</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeIsNotNull(){
        isNotNull("device_code");
        return this;
    }

    /**
     * <p>物理机的code</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_code",value);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeIn(String... values){
        if(values!=null && values.length>0){
            in("device_code",values);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_code",value);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_code",values);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * 等于 = deviceIp
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpEq(String deviceIp){
        if(deviceIp!=null){
            eq("device_ip",deviceIp);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * 不等于 &lt;&gt; deviceIp
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpNe(String deviceIp){
        if(deviceIp!=null){
            ne("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * 大于 &gt; deviceIp
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpGt(String deviceIp){
        if(deviceIp!=null){
            gt("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * 大于等于 &gt;= deviceIp
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpGe(String deviceIp){
        if(deviceIp!=null){
            ge("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * 小于 &lt; deviceIp
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpLt(String deviceIp){
        if(deviceIp!=null){
            lt("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * 小于等于 &lt;= deviceIp
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpLe(String deviceIp){
        if(deviceIp!=null){
            le("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * BETWEEN 值1 AND 值2
     * @param deviceIpStart       值1
     * @param deviceIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpBetween(String deviceIpStart,String deviceIpEnd){
        if(deviceIpStart!=null && deviceIpEnd!=null){
            between("device_ip",deviceIpStart,deviceIpEnd);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIpStart       值1
     * @param deviceIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpNotBetween(String deviceIpStart,String deviceIpEnd){
        if(deviceIpStart!=null && deviceIpEnd!=null){
            notBetween("device_ip",deviceIpStart,deviceIpEnd);
        }
        return this;
     }


    /**
     * <p>物理机ip</p>
     * LIKE '%值%' deviceIp
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpLike(String deviceIp){
        if(deviceIp!=null){
            like("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * NOT LIKE '%值%' deviceIp
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpNotLike(String deviceIp){
        if(deviceIp!=null){
            notLike("device_ip",deviceIp);
        }
        return this;
     }


    /**
     * <p>物理机ip</p>
     * LIKE '%值' deviceIp
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpLikeLeft(String deviceIp){
        if(deviceIp!=null){
            likeLeft("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * LIKE '值%' deviceIp
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpLikeRight(String deviceIp){
        if(deviceIp!=null){
            likeRight("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpIsNull(){
        isNull("device_ip");
        return this;
    }

    /**
     * <p>物理机ip</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpIsNotNull(){
        isNotNull("device_ip");
        return this;
    }

    /**
     * <p>物理机ip</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_ip",value);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpIn(String... values){
        if(values!=null && values.length>0){
            in("device_ip",values);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_ip",value);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper deviceIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_ip",values);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * 等于 = hardwareCode
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeEq(String hardwareCode){
        if(hardwareCode!=null){
            eq("hardware_code",hardwareCode);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * 不等于 &lt;&gt; hardwareCode
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeNe(String hardwareCode){
        if(hardwareCode!=null){
            ne("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * 大于 &gt; hardwareCode
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeGt(String hardwareCode){
        if(hardwareCode!=null){
            gt("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * 大于等于 &gt;= hardwareCode
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeGe(String hardwareCode){
        if(hardwareCode!=null){
            ge("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * 小于 &lt; hardwareCode
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeLt(String hardwareCode){
        if(hardwareCode!=null){
            lt("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * 小于等于 &lt;= hardwareCode
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeLe(String hardwareCode){
        if(hardwareCode!=null){
            le("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * BETWEEN 值1 AND 值2
     * @param hardwareCodeStart       值1
     * @param hardwareCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeBetween(String hardwareCodeStart,String hardwareCodeEnd){
        if(hardwareCodeStart!=null && hardwareCodeEnd!=null){
            between("hardware_code",hardwareCodeStart,hardwareCodeEnd);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * NOT BETWEEN 值1 AND 值2
     * @param hardwareCodeStart       值1
     * @param hardwareCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeNotBetween(String hardwareCodeStart,String hardwareCodeEnd){
        if(hardwareCodeStart!=null && hardwareCodeEnd!=null){
            notBetween("hardware_code",hardwareCodeStart,hardwareCodeEnd);
        }
        return this;
     }


    /**
     * <p>硬件配置</p>
     * LIKE '%值%' hardwareCode
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeLike(String hardwareCode){
        if(hardwareCode!=null){
            like("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * NOT LIKE '%值%' hardwareCode
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeNotLike(String hardwareCode){
        if(hardwareCode!=null){
            notLike("hardware_code",hardwareCode);
        }
        return this;
     }


    /**
     * <p>硬件配置</p>
     * LIKE '%值' hardwareCode
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeLikeLeft(String hardwareCode){
        if(hardwareCode!=null){
            likeLeft("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * LIKE '值%' hardwareCode
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeLikeRight(String hardwareCode){
        if(hardwareCode!=null){
            likeRight("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeIsNull(){
        isNull("hardware_code");
        return this;
    }

    /**
     * <p>硬件配置</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeIsNotNull(){
        isNotNull("hardware_code");
        return this;
    }

    /**
     * <p>硬件配置</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("hardware_code",value);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeIn(String... values){
        if(values!=null && values.length>0){
            in("hardware_code",values);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("hardware_code",value);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper hardwareCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("hardware_code",values);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * 等于 = unitSeg
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegEq(String unitSeg){
        if(unitSeg!=null){
            eq("unit_seg",unitSeg);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * 不等于 &lt;&gt; unitSeg
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegNe(String unitSeg){
        if(unitSeg!=null){
            ne("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * 大于 &gt; unitSeg
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegGt(String unitSeg){
        if(unitSeg!=null){
            gt("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * 大于等于 &gt;= unitSeg
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegGe(String unitSeg){
        if(unitSeg!=null){
            ge("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * 小于 &lt; unitSeg
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegLt(String unitSeg){
        if(unitSeg!=null){
            lt("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * 小于等于 &lt;= unitSeg
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegLe(String unitSeg){
        if(unitSeg!=null){
            le("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * BETWEEN 值1 AND 值2
     * @param unitSegStart       值1
     * @param unitSegEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegBetween(String unitSegStart,String unitSegEnd){
        if(unitSegStart!=null && unitSegEnd!=null){
            between("unit_seg",unitSegStart,unitSegEnd);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * NOT BETWEEN 值1 AND 值2
     * @param unitSegStart       值1
     * @param unitSegEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegNotBetween(String unitSegStart,String unitSegEnd){
        if(unitSegStart!=null && unitSegEnd!=null){
            notBetween("unit_seg",unitSegStart,unitSegEnd);
        }
        return this;
     }


    /**
     * <p>网段</p>
     * LIKE '%值%' unitSeg
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegLike(String unitSeg){
        if(unitSeg!=null){
            like("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * NOT LIKE '%值%' unitSeg
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegNotLike(String unitSeg){
        if(unitSeg!=null){
            notLike("unit_seg",unitSeg);
        }
        return this;
     }


    /**
     * <p>网段</p>
     * LIKE '%值' unitSeg
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegLikeLeft(String unitSeg){
        if(unitSeg!=null){
            likeLeft("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * LIKE '值%' unitSeg
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegLikeRight(String unitSeg){
        if(unitSeg!=null){
            likeRight("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegIsNull(){
        isNull("unit_seg");
        return this;
    }

    /**
     * <p>网段</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegIsNotNull(){
        isNotNull("unit_seg");
        return this;
    }

    /**
     * <p>网段</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("unit_seg",value);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegIn(String... values){
        if(values!=null && values.length>0){
            in("unit_seg",values);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("unit_seg",value);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper unitSegNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("unit_seg",values);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * 等于 = bootTime
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeEq(Date bootTime){
        if(bootTime!=null){
            eq("boot_time",bootTime);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * 不等于 &lt;&gt; bootTime
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeNe(Date bootTime){
        if(bootTime!=null){
            ne("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * 大于 &gt; bootTime
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeGt(Date bootTime){
        if(bootTime!=null){
            gt("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * 大于等于 &gt;= bootTime
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeGe(Date bootTime){
        if(bootTime!=null){
            ge("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * 小于 &lt; bootTime
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeLt(Date bootTime){
        if(bootTime!=null){
            lt("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * 小于等于 &lt;= bootTime
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeLe(Date bootTime){
        if(bootTime!=null){
            le("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * BETWEEN 值1 AND 值2
     * @param bootTimeStart       值1
     * @param bootTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeBetween(Date bootTimeStart,Date bootTimeEnd){
        if(bootTimeStart!=null && bootTimeEnd!=null){
            between("boot_time",bootTimeStart,bootTimeEnd);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param bootTimeStart       值1
     * @param bootTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeNotBetween(Date bootTimeStart,Date bootTimeEnd){
        if(bootTimeStart!=null && bootTimeEnd!=null){
            notBetween("boot_time",bootTimeStart,bootTimeEnd);
        }
        return this;
     }


    /**
     * <p>启动时间</p>
     * LIKE '%值%' bootTime
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeLike(Date bootTime){
        if(bootTime!=null){
            like("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * NOT LIKE '%值%' bootTime
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeNotLike(Date bootTime){
        if(bootTime!=null){
            notLike("boot_time",bootTime);
        }
        return this;
     }


    /**
     * <p>启动时间</p>
     * LIKE '%值' bootTime
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeLikeLeft(Date bootTime){
        if(bootTime!=null){
            likeLeft("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * LIKE '值%' bootTime
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeLikeRight(Date bootTime){
        if(bootTime!=null){
            likeRight("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeIsNull(){
        isNull("boot_time");
        return this;
    }

    /**
     * <p>启动时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeIsNotNull(){
        isNotNull("boot_time");
        return this;
    }

    /**
     * <p>启动时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("boot_time",value);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("boot_time",values);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("boot_time",value);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper bootTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("boot_time",values);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * 等于 = hbTime
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeEq(Date hbTime){
        if(hbTime!=null){
            eq("hb_time",hbTime);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * 不等于 &lt;&gt; hbTime
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeNe(Date hbTime){
        if(hbTime!=null){
            ne("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * 大于 &gt; hbTime
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeGt(Date hbTime){
        if(hbTime!=null){
            gt("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * 大于等于 &gt;= hbTime
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeGe(Date hbTime){
        if(hbTime!=null){
            ge("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * 小于 &lt; hbTime
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeLt(Date hbTime){
        if(hbTime!=null){
            lt("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * 小于等于 &lt;= hbTime
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeLe(Date hbTime){
        if(hbTime!=null){
            le("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * BETWEEN 值1 AND 值2
     * @param hbTimeStart       值1
     * @param hbTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeBetween(Date hbTimeStart,Date hbTimeEnd){
        if(hbTimeStart!=null && hbTimeEnd!=null){
            between("hb_time",hbTimeStart,hbTimeEnd);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param hbTimeStart       值1
     * @param hbTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeNotBetween(Date hbTimeStart,Date hbTimeEnd){
        if(hbTimeStart!=null && hbTimeEnd!=null){
            notBetween("hb_time",hbTimeStart,hbTimeEnd);
        }
        return this;
     }


    /**
     * <p>上次心跳时间</p>
     * LIKE '%值%' hbTime
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeLike(Date hbTime){
        if(hbTime!=null){
            like("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * NOT LIKE '%值%' hbTime
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeNotLike(Date hbTime){
        if(hbTime!=null){
            notLike("hb_time",hbTime);
        }
        return this;
     }


    /**
     * <p>上次心跳时间</p>
     * LIKE '%值' hbTime
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeLikeLeft(Date hbTime){
        if(hbTime!=null){
            likeLeft("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * LIKE '值%' hbTime
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeLikeRight(Date hbTime){
        if(hbTime!=null){
            likeRight("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeIsNull(){
        isNull("hb_time");
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeIsNotNull(){
        isNotNull("hb_time");
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("hb_time",value);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("hb_time",values);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("hb_time",value);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper hbTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("hb_time",values);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * 等于 = alertExpireTime
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeEq(Date alertExpireTime){
        if(alertExpireTime!=null){
            eq("alert_expire_time",alertExpireTime);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * 不等于 &lt;&gt; alertExpireTime
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeNe(Date alertExpireTime){
        if(alertExpireTime!=null){
            ne("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * 大于 &gt; alertExpireTime
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeGt(Date alertExpireTime){
        if(alertExpireTime!=null){
            gt("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * 大于等于 &gt;= alertExpireTime
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeGe(Date alertExpireTime){
        if(alertExpireTime!=null){
            ge("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * 小于 &lt; alertExpireTime
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeLt(Date alertExpireTime){
        if(alertExpireTime!=null){
            lt("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * 小于等于 &lt;= alertExpireTime
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeLe(Date alertExpireTime){
        if(alertExpireTime!=null){
            le("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * BETWEEN 值1 AND 值2
     * @param alertExpireTimeStart       值1
     * @param alertExpireTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeBetween(Date alertExpireTimeStart,Date alertExpireTimeEnd){
        if(alertExpireTimeStart!=null && alertExpireTimeEnd!=null){
            between("alert_expire_time",alertExpireTimeStart,alertExpireTimeEnd);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param alertExpireTimeStart       值1
     * @param alertExpireTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeNotBetween(Date alertExpireTimeStart,Date alertExpireTimeEnd){
        if(alertExpireTimeStart!=null && alertExpireTimeEnd!=null){
            notBetween("alert_expire_time",alertExpireTimeStart,alertExpireTimeEnd);
        }
        return this;
     }


    /**
     * <p>报警超时时间</p>
     * LIKE '%值%' alertExpireTime
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeLike(Date alertExpireTime){
        if(alertExpireTime!=null){
            like("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * NOT LIKE '%值%' alertExpireTime
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeNotLike(Date alertExpireTime){
        if(alertExpireTime!=null){
            notLike("alert_expire_time",alertExpireTime);
        }
        return this;
     }


    /**
     * <p>报警超时时间</p>
     * LIKE '%值' alertExpireTime
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeLikeLeft(Date alertExpireTime){
        if(alertExpireTime!=null){
            likeLeft("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * LIKE '值%' alertExpireTime
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeLikeRight(Date alertExpireTime){
        if(alertExpireTime!=null){
            likeRight("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeIsNull(){
        isNull("alert_expire_time");
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeIsNotNull(){
        isNotNull("alert_expire_time");
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("alert_expire_time",value);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("alert_expire_time",values);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("alert_expire_time",value);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertExpireTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("alert_expire_time",values);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 等于 = offlineTime
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeEq(Date offlineTime){
        if(offlineTime!=null){
            eq("offline_time",offlineTime);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 不等于 &lt;&gt; offlineTime
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeNe(Date offlineTime){
        if(offlineTime!=null){
            ne("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 大于 &gt; offlineTime
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeGt(Date offlineTime){
        if(offlineTime!=null){
            gt("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 大于等于 &gt;= offlineTime
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeGe(Date offlineTime){
        if(offlineTime!=null){
            ge("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 小于 &lt; offlineTime
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeLt(Date offlineTime){
        if(offlineTime!=null){
            lt("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 小于等于 &lt;= offlineTime
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeLe(Date offlineTime){
        if(offlineTime!=null){
            le("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * BETWEEN 值1 AND 值2
     * @param offlineTimeStart       值1
     * @param offlineTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeBetween(Date offlineTimeStart,Date offlineTimeEnd){
        if(offlineTimeStart!=null && offlineTimeEnd!=null){
            between("offline_time",offlineTimeStart,offlineTimeEnd);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * NOT BETWEEN 值1 AND 值2
     * @param offlineTimeStart       值1
     * @param offlineTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeNotBetween(Date offlineTimeStart,Date offlineTimeEnd){
        if(offlineTimeStart!=null && offlineTimeEnd!=null){
            notBetween("offline_time",offlineTimeStart,offlineTimeEnd);
        }
        return this;
     }


    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * LIKE '%值%' offlineTime
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeLike(Date offlineTime){
        if(offlineTime!=null){
            like("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * NOT LIKE '%值%' offlineTime
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeNotLike(Date offlineTime){
        if(offlineTime!=null){
            notLike("offline_time",offlineTime);
        }
        return this;
     }


    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * LIKE '%值' offlineTime
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeLikeLeft(Date offlineTime){
        if(offlineTime!=null){
            likeLeft("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * LIKE '值%' offlineTime
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeLikeRight(Date offlineTime){
        if(offlineTime!=null){
            likeRight("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeIsNull(){
        isNull("offline_time");
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeIsNotNull(){
        isNotNull("offline_time");
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("offline_time",value);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("offline_time",values);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("offline_time",value);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper offlineTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("offline_time",values);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 等于 = tx
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper txEq(String tx){
        if(tx!=null){
            eq("tx",tx);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 不等于 &lt;&gt; tx
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper txNe(String tx){
        if(tx!=null){
            ne("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 大于 &gt; tx
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper txGt(String tx){
        if(tx!=null){
            gt("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 大于等于 &gt;= tx
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper txGe(String tx){
        if(tx!=null){
            ge("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 小于 &lt; tx
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper txLt(String tx){
        if(tx!=null){
            lt("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 小于等于 &lt;= tx
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper txLe(String tx){
        if(tx!=null){
            le("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * BETWEEN 值1 AND 值2
     * @param txStart       值1
     * @param txEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper txBetween(String txStart,String txEnd){
        if(txStart!=null && txEnd!=null){
            between("tx",txStart,txEnd);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * NOT BETWEEN 值1 AND 值2
     * @param txStart       值1
     * @param txEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper txNotBetween(String txStart,String txEnd){
        if(txStart!=null && txEnd!=null){
            notBetween("tx",txStart,txEnd);
        }
        return this;
     }


    /**
     * <p>上行网速，单位B/s网速测算</p>
     * LIKE '%值%' tx
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper txLike(String tx){
        if(tx!=null){
            like("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * NOT LIKE '%值%' tx
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper txNotLike(String tx){
        if(tx!=null){
            notLike("tx",tx);
        }
        return this;
     }


    /**
     * <p>上行网速，单位B/s网速测算</p>
     * LIKE '%值' tx
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper txLikeLeft(String tx){
        if(tx!=null){
            likeLeft("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * LIKE '值%' tx
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper txLikeRight(String tx){
        if(tx!=null){
            likeRight("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper txIsNull(){
        isNull("tx");
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper txIsNotNull(){
        isNotNull("tx");
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper txIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("tx",value);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper txIn(String... values){
        if(values!=null && values.length>0){
            in("tx",values);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper txNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("tx",value);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper txNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("tx",values);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * 等于 = rx
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxEq(String rx){
        if(rx!=null){
            eq("rx",rx);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * 不等于 &lt;&gt; rx
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxNe(String rx){
        if(rx!=null){
            ne("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * 大于 &gt; rx
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxGt(String rx){
        if(rx!=null){
            gt("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * 大于等于 &gt;= rx
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxGe(String rx){
        if(rx!=null){
            ge("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * 小于 &lt; rx
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxLt(String rx){
        if(rx!=null){
            lt("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * 小于等于 &lt;= rx
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxLe(String rx){
        if(rx!=null){
            le("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * BETWEEN 值1 AND 值2
     * @param rxStart       值1
     * @param rxEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxBetween(String rxStart,String rxEnd){
        if(rxStart!=null && rxEnd!=null){
            between("rx",rxStart,rxEnd);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * NOT BETWEEN 值1 AND 值2
     * @param rxStart       值1
     * @param rxEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxNotBetween(String rxStart,String rxEnd){
        if(rxStart!=null && rxEnd!=null){
            notBetween("rx",rxStart,rxEnd);
        }
        return this;
     }


    /**
     * <p>下行网速，单位B/s</p>
     * LIKE '%值%' rx
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxLike(String rx){
        if(rx!=null){
            like("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * NOT LIKE '%值%' rx
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxNotLike(String rx){
        if(rx!=null){
            notLike("rx",rx);
        }
        return this;
     }


    /**
     * <p>下行网速，单位B/s</p>
     * LIKE '%值' rx
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxLikeLeft(String rx){
        if(rx!=null){
            likeLeft("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * LIKE '值%' rx
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxLikeRight(String rx){
        if(rx!=null){
            likeRight("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxIsNull(){
        isNull("rx");
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxIsNotNull(){
        isNotNull("rx");
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("rx",value);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxIn(String... values){
        if(values!=null && values.length>0){
            in("rx",values);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("rx",value);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rxNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("rx",values);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 等于 = statusOnline
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineEq(Integer statusOnline){
        if(statusOnline!=null){
            eq("status_online",statusOnline);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 不等于 &lt;&gt; statusOnline
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineNe(Integer statusOnline){
        if(statusOnline!=null){
            ne("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 大于 &gt; statusOnline
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineGt(Integer statusOnline){
        if(statusOnline!=null){
            gt("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 大于等于 &gt;= statusOnline
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineGe(Integer statusOnline){
        if(statusOnline!=null){
            ge("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 小于 &lt; statusOnline
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineLt(Integer statusOnline){
        if(statusOnline!=null){
            lt("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 小于等于 &lt;= statusOnline
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineLe(Integer statusOnline){
        if(statusOnline!=null){
            le("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * BETWEEN 值1 AND 值2
     * @param statusOnlineStart       值1
     * @param statusOnlineEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineBetween(Integer statusOnlineStart,Integer statusOnlineEnd){
        if(statusOnlineStart!=null && statusOnlineEnd!=null){
            between("status_online",statusOnlineStart,statusOnlineEnd);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusOnlineStart       值1
     * @param statusOnlineEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineNotBetween(Integer statusOnlineStart,Integer statusOnlineEnd){
        if(statusOnlineStart!=null && statusOnlineEnd!=null){
            notBetween("status_online",statusOnlineStart,statusOnlineEnd);
        }
        return this;
     }


    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * LIKE '%值%' statusOnline
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineLike(Integer statusOnline){
        if(statusOnline!=null){
            like("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * NOT LIKE '%值%' statusOnline
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineNotLike(Integer statusOnline){
        if(statusOnline!=null){
            notLike("status_online",statusOnline);
        }
        return this;
     }


    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * LIKE '%值' statusOnline
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineLikeLeft(Integer statusOnline){
        if(statusOnline!=null){
            likeLeft("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * LIKE '值%' statusOnline
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineLikeRight(Integer statusOnline){
        if(statusOnline!=null){
            likeRight("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineIsNull(){
        isNull("status_online");
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineIsNotNull(){
        isNotNull("status_online");
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status_online",value);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineIn(Integer... values){
        if(values!=null && values.length>0){
            in("status_online",values);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status_online",value);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusOnlineNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status_online",values);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 等于 = offSeconds
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsEq(Long offSeconds){
        if(offSeconds!=null){
            eq("off_seconds",offSeconds);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 不等于 &lt;&gt; offSeconds
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsNe(Long offSeconds){
        if(offSeconds!=null){
            ne("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 大于 &gt; offSeconds
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsGt(Long offSeconds){
        if(offSeconds!=null){
            gt("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 大于等于 &gt;= offSeconds
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsGe(Long offSeconds){
        if(offSeconds!=null){
            ge("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 小于 &lt; offSeconds
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsLt(Long offSeconds){
        if(offSeconds!=null){
            lt("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 小于等于 &lt;= offSeconds
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsLe(Long offSeconds){
        if(offSeconds!=null){
            le("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * BETWEEN 值1 AND 值2
     * @param offSecondsStart       值1
     * @param offSecondsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsBetween(Long offSecondsStart,Long offSecondsEnd){
        if(offSecondsStart!=null && offSecondsEnd!=null){
            between("off_seconds",offSecondsStart,offSecondsEnd);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * NOT BETWEEN 值1 AND 值2
     * @param offSecondsStart       值1
     * @param offSecondsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsNotBetween(Long offSecondsStart,Long offSecondsEnd){
        if(offSecondsStart!=null && offSecondsEnd!=null){
            notBetween("off_seconds",offSecondsStart,offSecondsEnd);
        }
        return this;
     }


    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * LIKE '%值%' offSeconds
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsLike(Long offSeconds){
        if(offSeconds!=null){
            like("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * NOT LIKE '%值%' offSeconds
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsNotLike(Long offSeconds){
        if(offSeconds!=null){
            notLike("off_seconds",offSeconds);
        }
        return this;
     }


    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * LIKE '%值' offSeconds
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsLikeLeft(Long offSeconds){
        if(offSeconds!=null){
            likeLeft("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * LIKE '值%' offSeconds
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsLikeRight(Long offSeconds){
        if(offSeconds!=null){
            likeRight("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsIsNull(){
        isNull("off_seconds");
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsIsNotNull(){
        isNotNull("off_seconds");
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("off_seconds",value);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsIn(Long... values){
        if(values!=null && values.length>0){
            in("off_seconds",values);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("off_seconds",value);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper offSecondsNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("off_seconds",values);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * 等于 = errorMessage
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageEq(String errorMessage){
        if(errorMessage!=null){
            eq("error_message",errorMessage);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * 不等于 &lt;&gt; errorMessage
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageNe(String errorMessage){
        if(errorMessage!=null){
            ne("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * 大于 &gt; errorMessage
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageGt(String errorMessage){
        if(errorMessage!=null){
            gt("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * 大于等于 &gt;= errorMessage
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageGe(String errorMessage){
        if(errorMessage!=null){
            ge("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * 小于 &lt; errorMessage
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageLt(String errorMessage){
        if(errorMessage!=null){
            lt("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * 小于等于 &lt;= errorMessage
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageLe(String errorMessage){
        if(errorMessage!=null){
            le("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * BETWEEN 值1 AND 值2
     * @param errorMessageStart       值1
     * @param errorMessageEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageBetween(String errorMessageStart,String errorMessageEnd){
        if(errorMessageStart!=null && errorMessageEnd!=null){
            between("error_message",errorMessageStart,errorMessageEnd);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * NOT BETWEEN 值1 AND 值2
     * @param errorMessageStart       值1
     * @param errorMessageEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageNotBetween(String errorMessageStart,String errorMessageEnd){
        if(errorMessageStart!=null && errorMessageEnd!=null){
            notBetween("error_message",errorMessageStart,errorMessageEnd);
        }
        return this;
     }


    /**
     * <p>云机错误消息</p>
     * LIKE '%值%' errorMessage
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageLike(String errorMessage){
        if(errorMessage!=null){
            like("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * NOT LIKE '%值%' errorMessage
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageNotLike(String errorMessage){
        if(errorMessage!=null){
            notLike("error_message",errorMessage);
        }
        return this;
     }


    /**
     * <p>云机错误消息</p>
     * LIKE '%值' errorMessage
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageLikeLeft(String errorMessage){
        if(errorMessage!=null){
            likeLeft("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * LIKE '值%' errorMessage
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageLikeRight(String errorMessage){
        if(errorMessage!=null){
            likeRight("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageIsNull(){
        isNull("error_message");
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageIsNotNull(){
        isNotNull("error_message");
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("error_message",value);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageIn(String... values){
        if(values!=null && values.length>0){
            in("error_message",values);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("error_message",value);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper errorMessageNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("error_message",values);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 等于 = statusControl
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlEq(Integer statusControl){
        if(statusControl!=null){
            eq("status_control",statusControl);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 不等于 &lt;&gt; statusControl
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlNe(Integer statusControl){
        if(statusControl!=null){
            ne("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 大于 &gt; statusControl
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlGt(Integer statusControl){
        if(statusControl!=null){
            gt("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 大于等于 &gt;= statusControl
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlGe(Integer statusControl){
        if(statusControl!=null){
            ge("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 小于 &lt; statusControl
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlLt(Integer statusControl){
        if(statusControl!=null){
            lt("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 小于等于 &lt;= statusControl
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlLe(Integer statusControl){
        if(statusControl!=null){
            le("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * BETWEEN 值1 AND 值2
     * @param statusControlStart       值1
     * @param statusControlEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlBetween(Integer statusControlStart,Integer statusControlEnd){
        if(statusControlStart!=null && statusControlEnd!=null){
            between("status_control",statusControlStart,statusControlEnd);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusControlStart       值1
     * @param statusControlEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlNotBetween(Integer statusControlStart,Integer statusControlEnd){
        if(statusControlStart!=null && statusControlEnd!=null){
            notBetween("status_control",statusControlStart,statusControlEnd);
        }
        return this;
     }


    /**
     * <p>0 未推流 1 正在推流</p>
     * LIKE '%值%' statusControl
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlLike(Integer statusControl){
        if(statusControl!=null){
            like("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * NOT LIKE '%值%' statusControl
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlNotLike(Integer statusControl){
        if(statusControl!=null){
            notLike("status_control",statusControl);
        }
        return this;
     }


    /**
     * <p>0 未推流 1 正在推流</p>
     * LIKE '%值' statusControl
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlLikeLeft(Integer statusControl){
        if(statusControl!=null){
            likeLeft("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * LIKE '值%' statusControl
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlLikeRight(Integer statusControl){
        if(statusControl!=null){
            likeRight("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlIsNull(){
        isNull("status_control");
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlIsNotNull(){
        isNotNull("status_control");
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status_control",value);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlIn(Integer... values){
        if(values!=null && values.length>0){
            in("status_control",values);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status_control",value);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusControlNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status_control",values);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * 等于 = alertEnabled
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledEq(Boolean alertEnabled){
        if(alertEnabled!=null){
            eq("alert_enabled",alertEnabled);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * 不等于 &lt;&gt; alertEnabled
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledNe(Boolean alertEnabled){
        if(alertEnabled!=null){
            ne("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * 大于 &gt; alertEnabled
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledGt(Boolean alertEnabled){
        if(alertEnabled!=null){
            gt("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * 大于等于 &gt;= alertEnabled
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledGe(Boolean alertEnabled){
        if(alertEnabled!=null){
            ge("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * 小于 &lt; alertEnabled
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledLt(Boolean alertEnabled){
        if(alertEnabled!=null){
            lt("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * 小于等于 &lt;= alertEnabled
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledLe(Boolean alertEnabled){
        if(alertEnabled!=null){
            le("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * BETWEEN 值1 AND 值2
     * @param alertEnabledStart       值1
     * @param alertEnabledEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledBetween(Boolean alertEnabledStart,Boolean alertEnabledEnd){
        if(alertEnabledStart!=null && alertEnabledEnd!=null){
            between("alert_enabled",alertEnabledStart,alertEnabledEnd);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * NOT BETWEEN 值1 AND 值2
     * @param alertEnabledStart       值1
     * @param alertEnabledEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledNotBetween(Boolean alertEnabledStart,Boolean alertEnabledEnd){
        if(alertEnabledStart!=null && alertEnabledEnd!=null){
            notBetween("alert_enabled",alertEnabledStart,alertEnabledEnd);
        }
        return this;
     }


    /**
     * <p>是否开启报警</p>
     * LIKE '%值%' alertEnabled
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledLike(Boolean alertEnabled){
        if(alertEnabled!=null){
            like("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * NOT LIKE '%值%' alertEnabled
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledNotLike(Boolean alertEnabled){
        if(alertEnabled!=null){
            notLike("alert_enabled",alertEnabled);
        }
        return this;
     }


    /**
     * <p>是否开启报警</p>
     * LIKE '%值' alertEnabled
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledLikeLeft(Boolean alertEnabled){
        if(alertEnabled!=null){
            likeLeft("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * LIKE '值%' alertEnabled
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledLikeRight(Boolean alertEnabled){
        if(alertEnabled!=null){
            likeRight("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledIsNull(){
        isNull("alert_enabled");
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledIsNotNull(){
        isNotNull("alert_enabled");
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("alert_enabled",value);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledIn(Boolean... values){
        if(values!=null && values.length>0){
            in("alert_enabled",values);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("alert_enabled",value);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper alertEnabledNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("alert_enabled",values);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * 等于 = statusPaaS
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSEq(Boolean statusPaaS){
        if(statusPaaS!=null){
            eq("status_paa_s",statusPaaS);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * 不等于 &lt;&gt; statusPaaS
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSNe(Boolean statusPaaS){
        if(statusPaaS!=null){
            ne("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * 大于 &gt; statusPaaS
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSGt(Boolean statusPaaS){
        if(statusPaaS!=null){
            gt("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * 大于等于 &gt;= statusPaaS
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSGe(Boolean statusPaaS){
        if(statusPaaS!=null){
            ge("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * 小于 &lt; statusPaaS
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSLt(Boolean statusPaaS){
        if(statusPaaS!=null){
            lt("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * 小于等于 &lt;= statusPaaS
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSLe(Boolean statusPaaS){
        if(statusPaaS!=null){
            le("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * BETWEEN 值1 AND 值2
     * @param statusPaaSStart       值1
     * @param statusPaaSEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSBetween(Boolean statusPaaSStart,Boolean statusPaaSEnd){
        if(statusPaaSStart!=null && statusPaaSEnd!=null){
            between("status_paa_s",statusPaaSStart,statusPaaSEnd);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusPaaSStart       值1
     * @param statusPaaSEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSNotBetween(Boolean statusPaaSStart,Boolean statusPaaSEnd){
        if(statusPaaSStart!=null && statusPaaSEnd!=null){
            notBetween("status_paa_s",statusPaaSStart,statusPaaSEnd);
        }
        return this;
     }


    /**
     * <p>在paas中状态是否正常</p>
     * LIKE '%值%' statusPaaS
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSLike(Boolean statusPaaS){
        if(statusPaaS!=null){
            like("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * NOT LIKE '%值%' statusPaaS
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSNotLike(Boolean statusPaaS){
        if(statusPaaS!=null){
            notLike("status_paa_s",statusPaaS);
        }
        return this;
     }


    /**
     * <p>在paas中状态是否正常</p>
     * LIKE '%值' statusPaaS
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSLikeLeft(Boolean statusPaaS){
        if(statusPaaS!=null){
            likeLeft("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * LIKE '值%' statusPaaS
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSLikeRight(Boolean statusPaaS){
        if(statusPaaS!=null){
            likeRight("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSIsNull(){
        isNull("status_paa_s");
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSIsNotNull(){
        isNotNull("status_paa_s");
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("status_paa_s",value);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSIn(Boolean... values){
        if(values!=null && values.length>0){
            in("status_paa_s",values);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("status_paa_s",value);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper statusPaaSNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("status_paa_s",values);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 等于 = lastApplyUsername
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameEq(String lastApplyUsername){
        if(lastApplyUsername!=null){
            eq("last_apply_username",lastApplyUsername);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 不等于 &lt;&gt; lastApplyUsername
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameNe(String lastApplyUsername){
        if(lastApplyUsername!=null){
            ne("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 大于 &gt; lastApplyUsername
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameGt(String lastApplyUsername){
        if(lastApplyUsername!=null){
            gt("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 大于等于 &gt;= lastApplyUsername
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameGe(String lastApplyUsername){
        if(lastApplyUsername!=null){
            ge("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 小于 &lt; lastApplyUsername
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameLt(String lastApplyUsername){
        if(lastApplyUsername!=null){
            lt("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 小于等于 &lt;= lastApplyUsername
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameLe(String lastApplyUsername){
        if(lastApplyUsername!=null){
            le("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * BETWEEN 值1 AND 值2
     * @param lastApplyUsernameStart       值1
     * @param lastApplyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameBetween(String lastApplyUsernameStart,String lastApplyUsernameEnd){
        if(lastApplyUsernameStart!=null && lastApplyUsernameEnd!=null){
            between("last_apply_username",lastApplyUsernameStart,lastApplyUsernameEnd);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastApplyUsernameStart       值1
     * @param lastApplyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameNotBetween(String lastApplyUsernameStart,String lastApplyUsernameEnd){
        if(lastApplyUsernameStart!=null && lastApplyUsernameEnd!=null){
            notBetween("last_apply_username",lastApplyUsernameStart,lastApplyUsernameEnd);
        }
        return this;
     }


    /**
     * <p>上次成功申请到推流token的用户名</p>
     * LIKE '%值%' lastApplyUsername
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameLike(String lastApplyUsername){
        if(lastApplyUsername!=null){
            like("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * NOT LIKE '%值%' lastApplyUsername
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameNotLike(String lastApplyUsername){
        if(lastApplyUsername!=null){
            notLike("last_apply_username",lastApplyUsername);
        }
        return this;
     }


    /**
     * <p>上次成功申请到推流token的用户名</p>
     * LIKE '%值' lastApplyUsername
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameLikeLeft(String lastApplyUsername){
        if(lastApplyUsername!=null){
            likeLeft("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * LIKE '值%' lastApplyUsername
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameLikeRight(String lastApplyUsername){
        if(lastApplyUsername!=null){
            likeRight("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameIsNull(){
        isNull("last_apply_username");
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameIsNotNull(){
        isNotNull("last_apply_username");
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("last_apply_username",value);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameIn(String... values){
        if(values!=null && values.length>0){
            in("last_apply_username",values);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_apply_username",value);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyUsernameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("last_apply_username",values);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * 等于 = lastApplyDate
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateEq(Date lastApplyDate){
        if(lastApplyDate!=null){
            eq("last_apply_date",lastApplyDate);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * 不等于 &lt;&gt; lastApplyDate
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateNe(Date lastApplyDate){
        if(lastApplyDate!=null){
            ne("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * 大于 &gt; lastApplyDate
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateGt(Date lastApplyDate){
        if(lastApplyDate!=null){
            gt("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * 大于等于 &gt;= lastApplyDate
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateGe(Date lastApplyDate){
        if(lastApplyDate!=null){
            ge("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * 小于 &lt; lastApplyDate
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateLt(Date lastApplyDate){
        if(lastApplyDate!=null){
            lt("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * 小于等于 &lt;= lastApplyDate
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateLe(Date lastApplyDate){
        if(lastApplyDate!=null){
            le("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * BETWEEN 值1 AND 值2
     * @param lastApplyDateStart       值1
     * @param lastApplyDateEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateBetween(Date lastApplyDateStart,Date lastApplyDateEnd){
        if(lastApplyDateStart!=null && lastApplyDateEnd!=null){
            between("last_apply_date",lastApplyDateStart,lastApplyDateEnd);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastApplyDateStart       值1
     * @param lastApplyDateEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateNotBetween(Date lastApplyDateStart,Date lastApplyDateEnd){
        if(lastApplyDateStart!=null && lastApplyDateEnd!=null){
            notBetween("last_apply_date",lastApplyDateStart,lastApplyDateEnd);
        }
        return this;
     }


    /**
     * <p>上次成功申请到token的日期</p>
     * LIKE '%值%' lastApplyDate
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateLike(Date lastApplyDate){
        if(lastApplyDate!=null){
            like("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * NOT LIKE '%值%' lastApplyDate
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateNotLike(Date lastApplyDate){
        if(lastApplyDate!=null){
            notLike("last_apply_date",lastApplyDate);
        }
        return this;
     }


    /**
     * <p>上次成功申请到token的日期</p>
     * LIKE '%值' lastApplyDate
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateLikeLeft(Date lastApplyDate){
        if(lastApplyDate!=null){
            likeLeft("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * LIKE '值%' lastApplyDate
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateLikeRight(Date lastApplyDate){
        if(lastApplyDate!=null){
            likeRight("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateIsNull(){
        isNull("last_apply_date");
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateIsNotNull(){
        isNotNull("last_apply_date");
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_apply_date",value);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateIn(Date... values){
        if(values!=null && values.length>0){
            in("last_apply_date",values);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_apply_date",value);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastApplyDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_apply_date",values);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * 等于 = lastActiveDate
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateEq(Date lastActiveDate){
        if(lastActiveDate!=null){
            eq("last_active_date",lastActiveDate);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * 不等于 &lt;&gt; lastActiveDate
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateNe(Date lastActiveDate){
        if(lastActiveDate!=null){
            ne("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * 大于 &gt; lastActiveDate
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateGt(Date lastActiveDate){
        if(lastActiveDate!=null){
            gt("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * 大于等于 &gt;= lastActiveDate
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateGe(Date lastActiveDate){
        if(lastActiveDate!=null){
            ge("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * 小于 &lt; lastActiveDate
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateLt(Date lastActiveDate){
        if(lastActiveDate!=null){
            lt("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * 小于等于 &lt;= lastActiveDate
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateLe(Date lastActiveDate){
        if(lastActiveDate!=null){
            le("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * BETWEEN 值1 AND 值2
     * @param lastActiveDateStart       值1
     * @param lastActiveDateEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateBetween(Date lastActiveDateStart,Date lastActiveDateEnd){
        if(lastActiveDateStart!=null && lastActiveDateEnd!=null){
            between("last_active_date",lastActiveDateStart,lastActiveDateEnd);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastActiveDateStart       值1
     * @param lastActiveDateEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateNotBetween(Date lastActiveDateStart,Date lastActiveDateEnd){
        if(lastActiveDateStart!=null && lastActiveDateEnd!=null){
            notBetween("last_active_date",lastActiveDateStart,lastActiveDateEnd);
        }
        return this;
     }


    /**
     * <p>上次活跃日期</p>
     * LIKE '%值%' lastActiveDate
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateLike(Date lastActiveDate){
        if(lastActiveDate!=null){
            like("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * NOT LIKE '%值%' lastActiveDate
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateNotLike(Date lastActiveDate){
        if(lastActiveDate!=null){
            notLike("last_active_date",lastActiveDate);
        }
        return this;
     }


    /**
     * <p>上次活跃日期</p>
     * LIKE '%值' lastActiveDate
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateLikeLeft(Date lastActiveDate){
        if(lastActiveDate!=null){
            likeLeft("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * LIKE '值%' lastActiveDate
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateLikeRight(Date lastActiveDate){
        if(lastActiveDate!=null){
            likeRight("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateIsNull(){
        isNull("last_active_date");
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateIsNotNull(){
        isNotNull("last_active_date");
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_active_date",value);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateIn(Date... values){
        if(values!=null && values.length>0){
            in("last_active_date",values);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_active_date",value);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastActiveDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_active_date",values);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 等于 = pkgs
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsEq(String pkgs){
        if(pkgs!=null){
            eq("pkgs",pkgs);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 不等于 &lt;&gt; pkgs
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsNe(String pkgs){
        if(pkgs!=null){
            ne("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 大于 &gt; pkgs
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsGt(String pkgs){
        if(pkgs!=null){
            gt("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 大于等于 &gt;= pkgs
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsGe(String pkgs){
        if(pkgs!=null){
            ge("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 小于 &lt; pkgs
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsLt(String pkgs){
        if(pkgs!=null){
            lt("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 小于等于 &lt;= pkgs
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsLe(String pkgs){
        if(pkgs!=null){
            le("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * BETWEEN 值1 AND 值2
     * @param pkgsStart       值1
     * @param pkgsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsBetween(String pkgsStart,String pkgsEnd){
        if(pkgsStart!=null && pkgsEnd!=null){
            between("pkgs",pkgsStart,pkgsEnd);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * NOT BETWEEN 值1 AND 值2
     * @param pkgsStart       值1
     * @param pkgsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsNotBetween(String pkgsStart,String pkgsEnd){
        if(pkgsStart!=null && pkgsEnd!=null){
            notBetween("pkgs",pkgsStart,pkgsEnd);
        }
        return this;
     }


    /**
     * <p>安装的应用，多个使用,分割</p>
     * LIKE '%值%' pkgs
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsLike(String pkgs){
        if(pkgs!=null){
            like("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * NOT LIKE '%值%' pkgs
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsNotLike(String pkgs){
        if(pkgs!=null){
            notLike("pkgs",pkgs);
        }
        return this;
     }


    /**
     * <p>安装的应用，多个使用,分割</p>
     * LIKE '%值' pkgs
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsLikeLeft(String pkgs){
        if(pkgs!=null){
            likeLeft("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * LIKE '值%' pkgs
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsLikeRight(String pkgs){
        if(pkgs!=null){
            likeRight("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsIsNull(){
        isNull("pkgs");
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsIsNotNull(){
        isNotNull("pkgs");
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("pkgs",value);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsIn(String... values){
        if(values!=null && values.length>0){
            in("pkgs",values);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("pkgs",value);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper pkgsNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("pkgs",values);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * 等于 = tag
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagEq(String tag){
        if(tag!=null){
            eq("tag",tag);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * 不等于 &lt;&gt; tag
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagNe(String tag){
        if(tag!=null){
            ne("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * 大于 &gt; tag
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagGt(String tag){
        if(tag!=null){
            gt("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * 大于等于 &gt;= tag
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagGe(String tag){
        if(tag!=null){
            ge("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * 小于 &lt; tag
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagLt(String tag){
        if(tag!=null){
            lt("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * 小于等于 &lt;= tag
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagLe(String tag){
        if(tag!=null){
            le("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * BETWEEN 值1 AND 值2
     * @param tagStart       值1
     * @param tagEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagBetween(String tagStart,String tagEnd){
        if(tagStart!=null && tagEnd!=null){
            between("tag",tagStart,tagEnd);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * NOT BETWEEN 值1 AND 值2
     * @param tagStart       值1
     * @param tagEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagNotBetween(String tagStart,String tagEnd){
        if(tagStart!=null && tagEnd!=null){
            notBetween("tag",tagStart,tagEnd);
        }
        return this;
     }


    /**
     * <p>标签</p>
     * LIKE '%值%' tag
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagLike(String tag){
        if(tag!=null){
            like("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * NOT LIKE '%值%' tag
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagNotLike(String tag){
        if(tag!=null){
            notLike("tag",tag);
        }
        return this;
     }


    /**
     * <p>标签</p>
     * LIKE '%值' tag
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagLikeLeft(String tag){
        if(tag!=null){
            likeLeft("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * LIKE '值%' tag
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagLikeRight(String tag){
        if(tag!=null){
            likeRight("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagIsNull(){
        isNull("tag");
        return this;
    }

    /**
     * <p>标签</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagIsNotNull(){
        isNotNull("tag");
        return this;
    }

    /**
     * <p>标签</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("tag",value);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagIn(String... values){
        if(values!=null && values.length>0){
            in("tag",values);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("tag",value);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper tagNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("tag",values);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * 等于 = captureOk
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkEq(Boolean captureOk){
        if(captureOk!=null){
            eq("capture_ok",captureOk);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * 不等于 &lt;&gt; captureOk
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkNe(Boolean captureOk){
        if(captureOk!=null){
            ne("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * 大于 &gt; captureOk
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkGt(Boolean captureOk){
        if(captureOk!=null){
            gt("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * 大于等于 &gt;= captureOk
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkGe(Boolean captureOk){
        if(captureOk!=null){
            ge("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * 小于 &lt; captureOk
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkLt(Boolean captureOk){
        if(captureOk!=null){
            lt("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * 小于等于 &lt;= captureOk
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkLe(Boolean captureOk){
        if(captureOk!=null){
            le("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * BETWEEN 值1 AND 值2
     * @param captureOkStart       值1
     * @param captureOkEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkBetween(Boolean captureOkStart,Boolean captureOkEnd){
        if(captureOkStart!=null && captureOkEnd!=null){
            between("capture_ok",captureOkStart,captureOkEnd);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * NOT BETWEEN 值1 AND 值2
     * @param captureOkStart       值1
     * @param captureOkEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkNotBetween(Boolean captureOkStart,Boolean captureOkEnd){
        if(captureOkStart!=null && captureOkEnd!=null){
            notBetween("capture_ok",captureOkStart,captureOkEnd);
        }
        return this;
     }


    /**
     * <p>截图是否正常</p>
     * LIKE '%值%' captureOk
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkLike(Boolean captureOk){
        if(captureOk!=null){
            like("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * NOT LIKE '%值%' captureOk
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkNotLike(Boolean captureOk){
        if(captureOk!=null){
            notLike("capture_ok",captureOk);
        }
        return this;
     }


    /**
     * <p>截图是否正常</p>
     * LIKE '%值' captureOk
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkLikeLeft(Boolean captureOk){
        if(captureOk!=null){
            likeLeft("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * LIKE '值%' captureOk
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkLikeRight(Boolean captureOk){
        if(captureOk!=null){
            likeRight("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkIsNull(){
        isNull("capture_ok");
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkIsNotNull(){
        isNotNull("capture_ok");
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("capture_ok",value);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkIn(Boolean... values){
        if(values!=null && values.length>0){
            in("capture_ok",values);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("capture_ok",value);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper captureOkNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("capture_ok",values);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 等于 = capDiff
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffEq(Integer capDiff){
        if(capDiff!=null){
            eq("cap_diff",capDiff);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 不等于 &lt;&gt; capDiff
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffNe(Integer capDiff){
        if(capDiff!=null){
            ne("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 大于 &gt; capDiff
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffGt(Integer capDiff){
        if(capDiff!=null){
            gt("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 大于等于 &gt;= capDiff
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffGe(Integer capDiff){
        if(capDiff!=null){
            ge("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 小于 &lt; capDiff
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffLt(Integer capDiff){
        if(capDiff!=null){
            lt("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 小于等于 &lt;= capDiff
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffLe(Integer capDiff){
        if(capDiff!=null){
            le("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * BETWEEN 值1 AND 值2
     * @param capDiffStart       值1
     * @param capDiffEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffBetween(Integer capDiffStart,Integer capDiffEnd){
        if(capDiffStart!=null && capDiffEnd!=null){
            between("cap_diff",capDiffStart,capDiffEnd);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * NOT BETWEEN 值1 AND 值2
     * @param capDiffStart       值1
     * @param capDiffEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffNotBetween(Integer capDiffStart,Integer capDiffEnd){
        if(capDiffStart!=null && capDiffEnd!=null){
            notBetween("cap_diff",capDiffStart,capDiffEnd);
        }
        return this;
     }


    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * LIKE '%值%' capDiff
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffLike(Integer capDiff){
        if(capDiff!=null){
            like("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * NOT LIKE '%值%' capDiff
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffNotLike(Integer capDiff){
        if(capDiff!=null){
            notLike("cap_diff",capDiff);
        }
        return this;
     }


    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * LIKE '%值' capDiff
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffLikeLeft(Integer capDiff){
        if(capDiff!=null){
            likeLeft("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * LIKE '值%' capDiff
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffLikeRight(Integer capDiff){
        if(capDiff!=null){
            likeRight("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffIsNull(){
        isNull("cap_diff");
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffIsNotNull(){
        isNotNull("cap_diff");
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("cap_diff",value);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffIn(Integer... values){
        if(values!=null && values.length>0){
            in("cap_diff",values);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("cap_diff",value);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper capDiffNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("cap_diff",values);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * 等于 = dgVersion
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionEq(String dgVersion){
        if(dgVersion!=null){
            eq("dg_version",dgVersion);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * 不等于 &lt;&gt; dgVersion
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionNe(String dgVersion){
        if(dgVersion!=null){
            ne("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * 大于 &gt; dgVersion
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionGt(String dgVersion){
        if(dgVersion!=null){
            gt("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * 大于等于 &gt;= dgVersion
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionGe(String dgVersion){
        if(dgVersion!=null){
            ge("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * 小于 &lt; dgVersion
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionLt(String dgVersion){
        if(dgVersion!=null){
            lt("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * 小于等于 &lt;= dgVersion
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionLe(String dgVersion){
        if(dgVersion!=null){
            le("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * BETWEEN 值1 AND 值2
     * @param dgVersionStart       值1
     * @param dgVersionEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionBetween(String dgVersionStart,String dgVersionEnd){
        if(dgVersionStart!=null && dgVersionEnd!=null){
            between("dg_version",dgVersionStart,dgVersionEnd);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgVersionStart       值1
     * @param dgVersionEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionNotBetween(String dgVersionStart,String dgVersionEnd){
        if(dgVersionStart!=null && dgVersionEnd!=null){
            notBetween("dg_version",dgVersionStart,dgVersionEnd);
        }
        return this;
     }


    /**
     * <p>dg相应字段</p>
     * LIKE '%值%' dgVersion
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionLike(String dgVersion){
        if(dgVersion!=null){
            like("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * NOT LIKE '%值%' dgVersion
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionNotLike(String dgVersion){
        if(dgVersion!=null){
            notLike("dg_version",dgVersion);
        }
        return this;
     }


    /**
     * <p>dg相应字段</p>
     * LIKE '%值' dgVersion
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionLikeLeft(String dgVersion){
        if(dgVersion!=null){
            likeLeft("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * LIKE '值%' dgVersion
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionLikeRight(String dgVersion){
        if(dgVersion!=null){
            likeRight("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionIsNull(){
        isNull("dg_version");
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionIsNotNull(){
        isNotNull("dg_version");
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_version",value);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionIn(String... values){
        if(values!=null && values.length>0){
            in("dg_version",values);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_version",value);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_version",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgVersionCode
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeEq(String dgVersionCode){
        if(dgVersionCode!=null){
            eq("dg_version_code",dgVersionCode);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgVersionCode
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeNe(String dgVersionCode){
        if(dgVersionCode!=null){
            ne("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgVersionCode
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeGt(String dgVersionCode){
        if(dgVersionCode!=null){
            gt("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgVersionCode
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeGe(String dgVersionCode){
        if(dgVersionCode!=null){
            ge("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgVersionCode
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeLt(String dgVersionCode){
        if(dgVersionCode!=null){
            lt("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgVersionCode
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeLe(String dgVersionCode){
        if(dgVersionCode!=null){
            le("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgVersionCodeStart       值1
     * @param dgVersionCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeBetween(String dgVersionCodeStart,String dgVersionCodeEnd){
        if(dgVersionCodeStart!=null && dgVersionCodeEnd!=null){
            between("dg_version_code",dgVersionCodeStart,dgVersionCodeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgVersionCodeStart       值1
     * @param dgVersionCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeNotBetween(String dgVersionCodeStart,String dgVersionCodeEnd){
        if(dgVersionCodeStart!=null && dgVersionCodeEnd!=null){
            notBetween("dg_version_code",dgVersionCodeStart,dgVersionCodeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgVersionCode
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeLike(String dgVersionCode){
        if(dgVersionCode!=null){
            like("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgVersionCode
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeNotLike(String dgVersionCode){
        if(dgVersionCode!=null){
            notLike("dg_version_code",dgVersionCode);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgVersionCode
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeLikeLeft(String dgVersionCode){
        if(dgVersionCode!=null){
            likeLeft("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgVersionCode
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeLikeRight(String dgVersionCode){
        if(dgVersionCode!=null){
            likeRight("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeIsNull(){
        isNull("dg_version_code");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeIsNotNull(){
        isNotNull("dg_version_code");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_version_code",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeIn(String... values){
        if(values!=null && values.length>0){
            in("dg_version_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_version_code",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgVersionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_version_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgXmStatus
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusEq(String dgXmStatus){
        if(dgXmStatus!=null){
            eq("dg_xm_status",dgXmStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgXmStatus
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusNe(String dgXmStatus){
        if(dgXmStatus!=null){
            ne("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgXmStatus
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusGt(String dgXmStatus){
        if(dgXmStatus!=null){
            gt("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgXmStatus
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusGe(String dgXmStatus){
        if(dgXmStatus!=null){
            ge("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgXmStatus
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusLt(String dgXmStatus){
        if(dgXmStatus!=null){
            lt("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgXmStatus
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusLe(String dgXmStatus){
        if(dgXmStatus!=null){
            le("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgXmStatusStart       值1
     * @param dgXmStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusBetween(String dgXmStatusStart,String dgXmStatusEnd){
        if(dgXmStatusStart!=null && dgXmStatusEnd!=null){
            between("dg_xm_status",dgXmStatusStart,dgXmStatusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgXmStatusStart       值1
     * @param dgXmStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusNotBetween(String dgXmStatusStart,String dgXmStatusEnd){
        if(dgXmStatusStart!=null && dgXmStatusEnd!=null){
            notBetween("dg_xm_status",dgXmStatusStart,dgXmStatusEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgXmStatus
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusLike(String dgXmStatus){
        if(dgXmStatus!=null){
            like("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgXmStatus
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusNotLike(String dgXmStatus){
        if(dgXmStatus!=null){
            notLike("dg_xm_status",dgXmStatus);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgXmStatus
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusLikeLeft(String dgXmStatus){
        if(dgXmStatus!=null){
            likeLeft("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgXmStatus
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusLikeRight(String dgXmStatus){
        if(dgXmStatus!=null){
            likeRight("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusIsNull(){
        isNull("dg_xm_status");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusIsNotNull(){
        isNotNull("dg_xm_status");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_xm_status",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusIn(String... values){
        if(values!=null && values.length>0){
            in("dg_xm_status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_xm_status",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgXmStatusNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_xm_status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgTopApp
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppEq(String dgTopApp){
        if(dgTopApp!=null){
            eq("dg_top_app",dgTopApp);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgTopApp
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppNe(String dgTopApp){
        if(dgTopApp!=null){
            ne("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgTopApp
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppGt(String dgTopApp){
        if(dgTopApp!=null){
            gt("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgTopApp
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppGe(String dgTopApp){
        if(dgTopApp!=null){
            ge("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgTopApp
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppLt(String dgTopApp){
        if(dgTopApp!=null){
            lt("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgTopApp
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppLe(String dgTopApp){
        if(dgTopApp!=null){
            le("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgTopAppStart       值1
     * @param dgTopAppEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppBetween(String dgTopAppStart,String dgTopAppEnd){
        if(dgTopAppStart!=null && dgTopAppEnd!=null){
            between("dg_top_app",dgTopAppStart,dgTopAppEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgTopAppStart       值1
     * @param dgTopAppEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppNotBetween(String dgTopAppStart,String dgTopAppEnd){
        if(dgTopAppStart!=null && dgTopAppEnd!=null){
            notBetween("dg_top_app",dgTopAppStart,dgTopAppEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgTopApp
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppLike(String dgTopApp){
        if(dgTopApp!=null){
            like("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgTopApp
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppNotLike(String dgTopApp){
        if(dgTopApp!=null){
            notLike("dg_top_app",dgTopApp);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgTopApp
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppLikeLeft(String dgTopApp){
        if(dgTopApp!=null){
            likeLeft("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgTopApp
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppLikeRight(String dgTopApp){
        if(dgTopApp!=null){
            likeRight("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppIsNull(){
        isNull("dg_top_app");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppIsNotNull(){
        isNotNull("dg_top_app");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_top_app",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppIn(String... values){
        if(values!=null && values.length>0){
            in("dg_top_app",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_top_app",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgTopAppNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_top_app",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgDisplayWidth
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthEq(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            eq("dg_display_width",dgDisplayWidth);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgDisplayWidth
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthNe(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            ne("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgDisplayWidth
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthGt(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            gt("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgDisplayWidth
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthGe(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            ge("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgDisplayWidth
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthLt(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            lt("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgDisplayWidth
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthLe(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            le("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgDisplayWidthStart       值1
     * @param dgDisplayWidthEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthBetween(Integer dgDisplayWidthStart,Integer dgDisplayWidthEnd){
        if(dgDisplayWidthStart!=null && dgDisplayWidthEnd!=null){
            between("dg_display_width",dgDisplayWidthStart,dgDisplayWidthEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgDisplayWidthStart       值1
     * @param dgDisplayWidthEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthNotBetween(Integer dgDisplayWidthStart,Integer dgDisplayWidthEnd){
        if(dgDisplayWidthStart!=null && dgDisplayWidthEnd!=null){
            notBetween("dg_display_width",dgDisplayWidthStart,dgDisplayWidthEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgDisplayWidth
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthLike(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            like("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgDisplayWidth
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthNotLike(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            notLike("dg_display_width",dgDisplayWidth);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgDisplayWidth
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthLikeLeft(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            likeLeft("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgDisplayWidth
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthLikeRight(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            likeRight("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthIsNull(){
        isNull("dg_display_width");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthIsNotNull(){
        isNotNull("dg_display_width");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dg_display_width",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthIn(Integer... values){
        if(values!=null && values.length>0){
            in("dg_display_width",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_display_width",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgDisplayWidthNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_display_width",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgAppsCount
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountEq(Integer dgAppsCount){
        if(dgAppsCount!=null){
            eq("dg_apps_count",dgAppsCount);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgAppsCount
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountNe(Integer dgAppsCount){
        if(dgAppsCount!=null){
            ne("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgAppsCount
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountGt(Integer dgAppsCount){
        if(dgAppsCount!=null){
            gt("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgAppsCount
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountGe(Integer dgAppsCount){
        if(dgAppsCount!=null){
            ge("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgAppsCount
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountLt(Integer dgAppsCount){
        if(dgAppsCount!=null){
            lt("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgAppsCount
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountLe(Integer dgAppsCount){
        if(dgAppsCount!=null){
            le("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgAppsCountStart       值1
     * @param dgAppsCountEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountBetween(Integer dgAppsCountStart,Integer dgAppsCountEnd){
        if(dgAppsCountStart!=null && dgAppsCountEnd!=null){
            between("dg_apps_count",dgAppsCountStart,dgAppsCountEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgAppsCountStart       值1
     * @param dgAppsCountEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountNotBetween(Integer dgAppsCountStart,Integer dgAppsCountEnd){
        if(dgAppsCountStart!=null && dgAppsCountEnd!=null){
            notBetween("dg_apps_count",dgAppsCountStart,dgAppsCountEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgAppsCount
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountLike(Integer dgAppsCount){
        if(dgAppsCount!=null){
            like("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgAppsCount
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountNotLike(Integer dgAppsCount){
        if(dgAppsCount!=null){
            notLike("dg_apps_count",dgAppsCount);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgAppsCount
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountLikeLeft(Integer dgAppsCount){
        if(dgAppsCount!=null){
            likeLeft("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgAppsCount
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountLikeRight(Integer dgAppsCount){
        if(dgAppsCount!=null){
            likeRight("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountIsNull(){
        isNull("dg_apps_count");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountIsNotNull(){
        isNotNull("dg_apps_count");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dg_apps_count",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountIn(Integer... values){
        if(values!=null && values.length>0){
            in("dg_apps_count",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_apps_count",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgAppsCountNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_apps_count",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgPropProduct
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductEq(String dgPropProduct){
        if(dgPropProduct!=null){
            eq("dg_prop_product",dgPropProduct);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgPropProduct
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductNe(String dgPropProduct){
        if(dgPropProduct!=null){
            ne("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgPropProduct
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductGt(String dgPropProduct){
        if(dgPropProduct!=null){
            gt("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgPropProduct
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductGe(String dgPropProduct){
        if(dgPropProduct!=null){
            ge("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgPropProduct
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductLt(String dgPropProduct){
        if(dgPropProduct!=null){
            lt("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgPropProduct
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductLe(String dgPropProduct){
        if(dgPropProduct!=null){
            le("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgPropProductStart       值1
     * @param dgPropProductEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductBetween(String dgPropProductStart,String dgPropProductEnd){
        if(dgPropProductStart!=null && dgPropProductEnd!=null){
            between("dg_prop_product",dgPropProductStart,dgPropProductEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgPropProductStart       值1
     * @param dgPropProductEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductNotBetween(String dgPropProductStart,String dgPropProductEnd){
        if(dgPropProductStart!=null && dgPropProductEnd!=null){
            notBetween("dg_prop_product",dgPropProductStart,dgPropProductEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgPropProduct
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductLike(String dgPropProduct){
        if(dgPropProduct!=null){
            like("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgPropProduct
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductNotLike(String dgPropProduct){
        if(dgPropProduct!=null){
            notLike("dg_prop_product",dgPropProduct);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgPropProduct
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductLikeLeft(String dgPropProduct){
        if(dgPropProduct!=null){
            likeLeft("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgPropProduct
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductLikeRight(String dgPropProduct){
        if(dgPropProduct!=null){
            likeRight("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductIsNull(){
        isNull("dg_prop_product");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductIsNotNull(){
        isNotNull("dg_prop_product");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_prop_product",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductIn(String... values){
        if(values!=null && values.length>0){
            in("dg_prop_product",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_prop_product",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgPropProductNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_prop_product",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgSimImei
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiEq(String dgSimImei){
        if(dgSimImei!=null){
            eq("dg_sim_imei",dgSimImei);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgSimImei
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiNe(String dgSimImei){
        if(dgSimImei!=null){
            ne("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgSimImei
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiGt(String dgSimImei){
        if(dgSimImei!=null){
            gt("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgSimImei
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiGe(String dgSimImei){
        if(dgSimImei!=null){
            ge("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgSimImei
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiLt(String dgSimImei){
        if(dgSimImei!=null){
            lt("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgSimImei
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiLe(String dgSimImei){
        if(dgSimImei!=null){
            le("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgSimImeiStart       值1
     * @param dgSimImeiEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiBetween(String dgSimImeiStart,String dgSimImeiEnd){
        if(dgSimImeiStart!=null && dgSimImeiEnd!=null){
            between("dg_sim_imei",dgSimImeiStart,dgSimImeiEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgSimImeiStart       值1
     * @param dgSimImeiEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiNotBetween(String dgSimImeiStart,String dgSimImeiEnd){
        if(dgSimImeiStart!=null && dgSimImeiEnd!=null){
            notBetween("dg_sim_imei",dgSimImeiStart,dgSimImeiEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgSimImei
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiLike(String dgSimImei){
        if(dgSimImei!=null){
            like("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgSimImei
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiNotLike(String dgSimImei){
        if(dgSimImei!=null){
            notLike("dg_sim_imei",dgSimImei);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgSimImei
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiLikeLeft(String dgSimImei){
        if(dgSimImei!=null){
            likeLeft("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgSimImei
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiLikeRight(String dgSimImei){
        if(dgSimImei!=null){
            likeRight("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiIsNull(){
        isNull("dg_sim_imei");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiIsNotNull(){
        isNotNull("dg_sim_imei");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_sim_imei",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiIn(String... values){
        if(values!=null && values.length>0){
            in("dg_sim_imei",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_sim_imei",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgSimImeiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_sim_imei",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgNetStatus
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusEq(Integer dgNetStatus){
        if(dgNetStatus!=null){
            eq("dg_net_status",dgNetStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgNetStatus
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusNe(Integer dgNetStatus){
        if(dgNetStatus!=null){
            ne("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgNetStatus
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusGt(Integer dgNetStatus){
        if(dgNetStatus!=null){
            gt("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgNetStatus
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusGe(Integer dgNetStatus){
        if(dgNetStatus!=null){
            ge("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgNetStatus
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusLt(Integer dgNetStatus){
        if(dgNetStatus!=null){
            lt("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgNetStatus
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusLe(Integer dgNetStatus){
        if(dgNetStatus!=null){
            le("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgNetStatusStart       值1
     * @param dgNetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusBetween(Integer dgNetStatusStart,Integer dgNetStatusEnd){
        if(dgNetStatusStart!=null && dgNetStatusEnd!=null){
            between("dg_net_status",dgNetStatusStart,dgNetStatusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgNetStatusStart       值1
     * @param dgNetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusNotBetween(Integer dgNetStatusStart,Integer dgNetStatusEnd){
        if(dgNetStatusStart!=null && dgNetStatusEnd!=null){
            notBetween("dg_net_status",dgNetStatusStart,dgNetStatusEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgNetStatus
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusLike(Integer dgNetStatus){
        if(dgNetStatus!=null){
            like("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgNetStatus
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusNotLike(Integer dgNetStatus){
        if(dgNetStatus!=null){
            notLike("dg_net_status",dgNetStatus);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgNetStatus
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusLikeLeft(Integer dgNetStatus){
        if(dgNetStatus!=null){
            likeLeft("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgNetStatus
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusLikeRight(Integer dgNetStatus){
        if(dgNetStatus!=null){
            likeRight("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusIsNull(){
        isNull("dg_net_status");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusIsNotNull(){
        isNotNull("dg_net_status");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dg_net_status",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("dg_net_status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_net_status",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_net_status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgNetBs
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsEq(Integer dgNetBs){
        if(dgNetBs!=null){
            eq("dg_net_bs",dgNetBs);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgNetBs
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsNe(Integer dgNetBs){
        if(dgNetBs!=null){
            ne("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgNetBs
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsGt(Integer dgNetBs){
        if(dgNetBs!=null){
            gt("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgNetBs
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsGe(Integer dgNetBs){
        if(dgNetBs!=null){
            ge("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgNetBs
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsLt(Integer dgNetBs){
        if(dgNetBs!=null){
            lt("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgNetBs
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsLe(Integer dgNetBs){
        if(dgNetBs!=null){
            le("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgNetBsStart       值1
     * @param dgNetBsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsBetween(Integer dgNetBsStart,Integer dgNetBsEnd){
        if(dgNetBsStart!=null && dgNetBsEnd!=null){
            between("dg_net_bs",dgNetBsStart,dgNetBsEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgNetBsStart       值1
     * @param dgNetBsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsNotBetween(Integer dgNetBsStart,Integer dgNetBsEnd){
        if(dgNetBsStart!=null && dgNetBsEnd!=null){
            notBetween("dg_net_bs",dgNetBsStart,dgNetBsEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgNetBs
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsLike(Integer dgNetBs){
        if(dgNetBs!=null){
            like("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgNetBs
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsNotLike(Integer dgNetBs){
        if(dgNetBs!=null){
            notLike("dg_net_bs",dgNetBs);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgNetBs
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsLikeLeft(Integer dgNetBs){
        if(dgNetBs!=null){
            likeLeft("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgNetBs
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsLikeRight(Integer dgNetBs){
        if(dgNetBs!=null){
            likeRight("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsIsNull(){
        isNull("dg_net_bs");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsIsNotNull(){
        isNotNull("dg_net_bs");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dg_net_bs",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsIn(Integer... values){
        if(values!=null && values.length>0){
            in("dg_net_bs",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_net_bs",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgNetBsNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_net_bs",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgProxyHost
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostEq(String dgProxyHost){
        if(dgProxyHost!=null){
            eq("dg_proxy_host",dgProxyHost);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgProxyHost
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostNe(String dgProxyHost){
        if(dgProxyHost!=null){
            ne("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgProxyHost
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostGt(String dgProxyHost){
        if(dgProxyHost!=null){
            gt("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgProxyHost
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostGe(String dgProxyHost){
        if(dgProxyHost!=null){
            ge("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgProxyHost
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostLt(String dgProxyHost){
        if(dgProxyHost!=null){
            lt("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgProxyHost
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostLe(String dgProxyHost){
        if(dgProxyHost!=null){
            le("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgProxyHostStart       值1
     * @param dgProxyHostEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostBetween(String dgProxyHostStart,String dgProxyHostEnd){
        if(dgProxyHostStart!=null && dgProxyHostEnd!=null){
            between("dg_proxy_host",dgProxyHostStart,dgProxyHostEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgProxyHostStart       值1
     * @param dgProxyHostEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostNotBetween(String dgProxyHostStart,String dgProxyHostEnd){
        if(dgProxyHostStart!=null && dgProxyHostEnd!=null){
            notBetween("dg_proxy_host",dgProxyHostStart,dgProxyHostEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgProxyHost
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostLike(String dgProxyHost){
        if(dgProxyHost!=null){
            like("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgProxyHost
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostNotLike(String dgProxyHost){
        if(dgProxyHost!=null){
            notLike("dg_proxy_host",dgProxyHost);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgProxyHost
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostLikeLeft(String dgProxyHost){
        if(dgProxyHost!=null){
            likeLeft("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgProxyHost
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostLikeRight(String dgProxyHost){
        if(dgProxyHost!=null){
            likeRight("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostIsNull(){
        isNull("dg_proxy_host");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostIsNotNull(){
        isNotNull("dg_proxy_host");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_proxy_host",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostIn(String... values){
        if(values!=null && values.length>0){
            in("dg_proxy_host",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_proxy_host",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyHostNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_host",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgProxyPort
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortEq(Integer dgProxyPort){
        if(dgProxyPort!=null){
            eq("dg_proxy_port",dgProxyPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgProxyPort
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortNe(Integer dgProxyPort){
        if(dgProxyPort!=null){
            ne("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgProxyPort
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortGt(Integer dgProxyPort){
        if(dgProxyPort!=null){
            gt("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgProxyPort
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortGe(Integer dgProxyPort){
        if(dgProxyPort!=null){
            ge("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgProxyPort
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortLt(Integer dgProxyPort){
        if(dgProxyPort!=null){
            lt("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgProxyPort
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortLe(Integer dgProxyPort){
        if(dgProxyPort!=null){
            le("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgProxyPortStart       值1
     * @param dgProxyPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortBetween(Integer dgProxyPortStart,Integer dgProxyPortEnd){
        if(dgProxyPortStart!=null && dgProxyPortEnd!=null){
            between("dg_proxy_port",dgProxyPortStart,dgProxyPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgProxyPortStart       值1
     * @param dgProxyPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortNotBetween(Integer dgProxyPortStart,Integer dgProxyPortEnd){
        if(dgProxyPortStart!=null && dgProxyPortEnd!=null){
            notBetween("dg_proxy_port",dgProxyPortStart,dgProxyPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgProxyPort
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortLike(Integer dgProxyPort){
        if(dgProxyPort!=null){
            like("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgProxyPort
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortNotLike(Integer dgProxyPort){
        if(dgProxyPort!=null){
            notLike("dg_proxy_port",dgProxyPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgProxyPort
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortLikeLeft(Integer dgProxyPort){
        if(dgProxyPort!=null){
            likeLeft("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgProxyPort
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortLikeRight(Integer dgProxyPort){
        if(dgProxyPort!=null){
            likeRight("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortIsNull(){
        isNull("dg_proxy_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortIsNotNull(){
        isNotNull("dg_proxy_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dg_proxy_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("dg_proxy_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_proxy_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgProxyUsername
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameEq(String dgProxyUsername){
        if(dgProxyUsername!=null){
            eq("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgProxyUsername
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameNe(String dgProxyUsername){
        if(dgProxyUsername!=null){
            ne("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgProxyUsername
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameGt(String dgProxyUsername){
        if(dgProxyUsername!=null){
            gt("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgProxyUsername
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameGe(String dgProxyUsername){
        if(dgProxyUsername!=null){
            ge("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgProxyUsername
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameLt(String dgProxyUsername){
        if(dgProxyUsername!=null){
            lt("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgProxyUsername
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameLe(String dgProxyUsername){
        if(dgProxyUsername!=null){
            le("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgProxyUsernameStart       值1
     * @param dgProxyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameBetween(String dgProxyUsernameStart,String dgProxyUsernameEnd){
        if(dgProxyUsernameStart!=null && dgProxyUsernameEnd!=null){
            between("dg_proxy_username",dgProxyUsernameStart,dgProxyUsernameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgProxyUsernameStart       值1
     * @param dgProxyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameNotBetween(String dgProxyUsernameStart,String dgProxyUsernameEnd){
        if(dgProxyUsernameStart!=null && dgProxyUsernameEnd!=null){
            notBetween("dg_proxy_username",dgProxyUsernameStart,dgProxyUsernameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgProxyUsername
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameLike(String dgProxyUsername){
        if(dgProxyUsername!=null){
            like("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgProxyUsername
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameNotLike(String dgProxyUsername){
        if(dgProxyUsername!=null){
            notLike("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgProxyUsername
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameLikeLeft(String dgProxyUsername){
        if(dgProxyUsername!=null){
            likeLeft("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgProxyUsername
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameLikeRight(String dgProxyUsername){
        if(dgProxyUsername!=null){
            likeRight("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameIsNull(){
        isNull("dg_proxy_username");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameIsNotNull(){
        isNotNull("dg_proxy_username");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_proxy_username",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameIn(String... values){
        if(values!=null && values.length>0){
            in("dg_proxy_username",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_proxy_username",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyUsernameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_username",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgProxyLocation
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationEq(String dgProxyLocation){
        if(dgProxyLocation!=null){
            eq("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgProxyLocation
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationNe(String dgProxyLocation){
        if(dgProxyLocation!=null){
            ne("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgProxyLocation
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationGt(String dgProxyLocation){
        if(dgProxyLocation!=null){
            gt("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgProxyLocation
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationGe(String dgProxyLocation){
        if(dgProxyLocation!=null){
            ge("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgProxyLocation
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationLt(String dgProxyLocation){
        if(dgProxyLocation!=null){
            lt("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgProxyLocation
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationLe(String dgProxyLocation){
        if(dgProxyLocation!=null){
            le("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgProxyLocationStart       值1
     * @param dgProxyLocationEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationBetween(String dgProxyLocationStart,String dgProxyLocationEnd){
        if(dgProxyLocationStart!=null && dgProxyLocationEnd!=null){
            between("dg_proxy_location",dgProxyLocationStart,dgProxyLocationEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgProxyLocationStart       值1
     * @param dgProxyLocationEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationNotBetween(String dgProxyLocationStart,String dgProxyLocationEnd){
        if(dgProxyLocationStart!=null && dgProxyLocationEnd!=null){
            notBetween("dg_proxy_location",dgProxyLocationStart,dgProxyLocationEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgProxyLocation
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationLike(String dgProxyLocation){
        if(dgProxyLocation!=null){
            like("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgProxyLocation
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationNotLike(String dgProxyLocation){
        if(dgProxyLocation!=null){
            notLike("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgProxyLocation
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationLikeLeft(String dgProxyLocation){
        if(dgProxyLocation!=null){
            likeLeft("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgProxyLocation
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationLikeRight(String dgProxyLocation){
        if(dgProxyLocation!=null){
            likeRight("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationIsNull(){
        isNull("dg_proxy_location");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationIsNotNull(){
        isNotNull("dg_proxy_location");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_proxy_location",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationIn(String... values){
        if(values!=null && values.length>0){
            in("dg_proxy_location",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_proxy_location",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyLocationNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_location",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = dgProxyIp
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpEq(String dgProxyIp){
        if(dgProxyIp!=null){
            eq("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; dgProxyIp
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpNe(String dgProxyIp){
        if(dgProxyIp!=null){
            ne("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; dgProxyIp
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpGt(String dgProxyIp){
        if(dgProxyIp!=null){
            gt("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= dgProxyIp
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpGe(String dgProxyIp){
        if(dgProxyIp!=null){
            ge("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; dgProxyIp
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpLt(String dgProxyIp){
        if(dgProxyIp!=null){
            lt("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= dgProxyIp
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpLe(String dgProxyIp){
        if(dgProxyIp!=null){
            le("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgProxyIpStart       值1
     * @param dgProxyIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpBetween(String dgProxyIpStart,String dgProxyIpEnd){
        if(dgProxyIpStart!=null && dgProxyIpEnd!=null){
            between("dg_proxy_ip",dgProxyIpStart,dgProxyIpEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgProxyIpStart       值1
     * @param dgProxyIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpNotBetween(String dgProxyIpStart,String dgProxyIpEnd){
        if(dgProxyIpStart!=null && dgProxyIpEnd!=null){
            notBetween("dg_proxy_ip",dgProxyIpStart,dgProxyIpEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' dgProxyIp
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpLike(String dgProxyIp){
        if(dgProxyIp!=null){
            like("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' dgProxyIp
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpNotLike(String dgProxyIp){
        if(dgProxyIp!=null){
            notLike("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' dgProxyIp
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpLikeLeft(String dgProxyIp){
        if(dgProxyIp!=null){
            likeLeft("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' dgProxyIp
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpLikeRight(String dgProxyIp){
        if(dgProxyIp!=null){
            likeRight("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpIsNull(){
        isNull("dg_proxy_ip");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpIsNotNull(){
        isNotNull("dg_proxy_ip");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_proxy_ip",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpIn(String... values){
        if(values!=null && values.length>0){
            in("dg_proxy_ip",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_proxy_ip",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper dgProxyIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_ip",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = lastSyncTime
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeEq(Date lastSyncTime){
        if(lastSyncTime!=null){
            eq("last_sync_time",lastSyncTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; lastSyncTime
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeNe(Date lastSyncTime){
        if(lastSyncTime!=null){
            ne("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; lastSyncTime
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeGt(Date lastSyncTime){
        if(lastSyncTime!=null){
            gt("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= lastSyncTime
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeGe(Date lastSyncTime){
        if(lastSyncTime!=null){
            ge("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; lastSyncTime
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeLt(Date lastSyncTime){
        if(lastSyncTime!=null){
            lt("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= lastSyncTime
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeLe(Date lastSyncTime){
        if(lastSyncTime!=null){
            le("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param lastSyncTimeStart       值1
     * @param lastSyncTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeBetween(Date lastSyncTimeStart,Date lastSyncTimeEnd){
        if(lastSyncTimeStart!=null && lastSyncTimeEnd!=null){
            between("last_sync_time",lastSyncTimeStart,lastSyncTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastSyncTimeStart       值1
     * @param lastSyncTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeNotBetween(Date lastSyncTimeStart,Date lastSyncTimeEnd){
        if(lastSyncTimeStart!=null && lastSyncTimeEnd!=null){
            notBetween("last_sync_time",lastSyncTimeStart,lastSyncTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' lastSyncTime
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeLike(Date lastSyncTime){
        if(lastSyncTime!=null){
            like("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' lastSyncTime
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeNotLike(Date lastSyncTime){
        if(lastSyncTime!=null){
            notLike("last_sync_time",lastSyncTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' lastSyncTime
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeLikeLeft(Date lastSyncTime){
        if(lastSyncTime!=null){
            likeLeft("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' lastSyncTime
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeLikeRight(Date lastSyncTime){
        if(lastSyncTime!=null){
            likeRight("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeIsNull(){
        isNull("last_sync_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeIsNotNull(){
        isNotNull("last_sync_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_sync_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_sync_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_sync_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper lastSyncTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_sync_time",values);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * 等于 = fkCloudRegionId
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdEq(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            eq("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * 不等于 &lt;&gt; fkCloudRegionId
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdNe(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            ne("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * 大于 &gt; fkCloudRegionId
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdGt(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            gt("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * 大于等于 &gt;= fkCloudRegionId
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdGe(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            ge("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * 小于 &lt; fkCloudRegionId
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdLt(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            lt("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * 小于等于 &lt;= fkCloudRegionId
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdLe(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            le("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * BETWEEN 值1 AND 值2
     * @param fkCloudRegionIdStart       值1
     * @param fkCloudRegionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdBetween(Long fkCloudRegionIdStart,Long fkCloudRegionIdEnd){
        if(fkCloudRegionIdStart!=null && fkCloudRegionIdEnd!=null){
            between("fk_cloud_region_id",fkCloudRegionIdStart,fkCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkCloudRegionIdStart       值1
     * @param fkCloudRegionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdNotBetween(Long fkCloudRegionIdStart,Long fkCloudRegionIdEnd){
        if(fkCloudRegionIdStart!=null && fkCloudRegionIdEnd!=null){
            notBetween("fk_cloud_region_id",fkCloudRegionIdStart,fkCloudRegionIdEnd);
        }
        return this;
     }


    /**
     * <p>机房表区域id</p>
     * LIKE '%值%' fkCloudRegionId
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdLike(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            like("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * NOT LIKE '%值%' fkCloudRegionId
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdNotLike(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            notLike("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }


    /**
     * <p>机房表区域id</p>
     * LIKE '%值' fkCloudRegionId
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdLikeLeft(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            likeLeft("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * LIKE '值%' fkCloudRegionId
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdLikeRight(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            likeRight("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdIsNull(){
        isNull("fk_cloud_region_id");
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdIsNotNull(){
        isNotNull("fk_cloud_region_id");
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_cloud_region_id",value);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_cloud_region_id",values);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_cloud_region_id",value);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper fkCloudRegionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_cloud_region_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = pubIp
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpEq(String pubIp){
        if(pubIp!=null){
            eq("pub_ip",pubIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; pubIp
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpNe(String pubIp){
        if(pubIp!=null){
            ne("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; pubIp
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpGt(String pubIp){
        if(pubIp!=null){
            gt("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= pubIp
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpGe(String pubIp){
        if(pubIp!=null){
            ge("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; pubIp
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpLt(String pubIp){
        if(pubIp!=null){
            lt("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= pubIp
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpLe(String pubIp){
        if(pubIp!=null){
            le("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param pubIpStart       值1
     * @param pubIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpBetween(String pubIpStart,String pubIpEnd){
        if(pubIpStart!=null && pubIpEnd!=null){
            between("pub_ip",pubIpStart,pubIpEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param pubIpStart       值1
     * @param pubIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpNotBetween(String pubIpStart,String pubIpEnd){
        if(pubIpStart!=null && pubIpEnd!=null){
            notBetween("pub_ip",pubIpStart,pubIpEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' pubIp
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpLike(String pubIp){
        if(pubIp!=null){
            like("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' pubIp
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpNotLike(String pubIp){
        if(pubIp!=null){
            notLike("pub_ip",pubIp);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' pubIp
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpLikeLeft(String pubIp){
        if(pubIp!=null){
            likeLeft("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' pubIp
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpLikeRight(String pubIp){
        if(pubIp!=null){
            likeRight("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpIsNull(){
        isNull("pub_ip");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpIsNotNull(){
        isNotNull("pub_ip");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("pub_ip",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpIn(String... values){
        if(values!=null && values.length>0){
            in("pub_ip",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("pub_ip",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper pubIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("pub_ip",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = audioSockType
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeEq(Integer audioSockType){
        if(audioSockType!=null){
            eq("audio_sock_type",audioSockType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; audioSockType
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeNe(Integer audioSockType){
        if(audioSockType!=null){
            ne("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; audioSockType
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeGt(Integer audioSockType){
        if(audioSockType!=null){
            gt("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= audioSockType
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeGe(Integer audioSockType){
        if(audioSockType!=null){
            ge("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; audioSockType
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeLt(Integer audioSockType){
        if(audioSockType!=null){
            lt("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= audioSockType
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeLe(Integer audioSockType){
        if(audioSockType!=null){
            le("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param audioSockTypeStart       值1
     * @param audioSockTypeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeBetween(Integer audioSockTypeStart,Integer audioSockTypeEnd){
        if(audioSockTypeStart!=null && audioSockTypeEnd!=null){
            between("audio_sock_type",audioSockTypeStart,audioSockTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param audioSockTypeStart       值1
     * @param audioSockTypeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeNotBetween(Integer audioSockTypeStart,Integer audioSockTypeEnd){
        if(audioSockTypeStart!=null && audioSockTypeEnd!=null){
            notBetween("audio_sock_type",audioSockTypeStart,audioSockTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' audioSockType
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeLike(Integer audioSockType){
        if(audioSockType!=null){
            like("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' audioSockType
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeNotLike(Integer audioSockType){
        if(audioSockType!=null){
            notLike("audio_sock_type",audioSockType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' audioSockType
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeLikeLeft(Integer audioSockType){
        if(audioSockType!=null){
            likeLeft("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' audioSockType
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeLikeRight(Integer audioSockType){
        if(audioSockType!=null){
            likeRight("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeIsNull(){
        isNull("audio_sock_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeIsNotNull(){
        isNotNull("audio_sock_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("audio_sock_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("audio_sock_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("audio_sock_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioSockTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("audio_sock_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = audioPort
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortEq(Integer audioPort){
        if(audioPort!=null){
            eq("audio_port",audioPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; audioPort
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortNe(Integer audioPort){
        if(audioPort!=null){
            ne("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; audioPort
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortGt(Integer audioPort){
        if(audioPort!=null){
            gt("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= audioPort
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortGe(Integer audioPort){
        if(audioPort!=null){
            ge("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; audioPort
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortLt(Integer audioPort){
        if(audioPort!=null){
            lt("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= audioPort
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortLe(Integer audioPort){
        if(audioPort!=null){
            le("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param audioPortStart       值1
     * @param audioPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortBetween(Integer audioPortStart,Integer audioPortEnd){
        if(audioPortStart!=null && audioPortEnd!=null){
            between("audio_port",audioPortStart,audioPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param audioPortStart       值1
     * @param audioPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortNotBetween(Integer audioPortStart,Integer audioPortEnd){
        if(audioPortStart!=null && audioPortEnd!=null){
            notBetween("audio_port",audioPortStart,audioPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' audioPort
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortLike(Integer audioPort){
        if(audioPort!=null){
            like("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' audioPort
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortNotLike(Integer audioPort){
        if(audioPort!=null){
            notLike("audio_port",audioPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' audioPort
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortLikeLeft(Integer audioPort){
        if(audioPort!=null){
            likeLeft("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' audioPort
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortLikeRight(Integer audioPort){
        if(audioPort!=null){
            likeRight("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortIsNull(){
        isNull("audio_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortIsNotNull(){
        isNotNull("audio_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("audio_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("audio_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("audio_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("audio_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = audioExternalPort
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortEq(Integer audioExternalPort){
        if(audioExternalPort!=null){
            eq("audio_external_port",audioExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; audioExternalPort
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortNe(Integer audioExternalPort){
        if(audioExternalPort!=null){
            ne("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; audioExternalPort
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortGt(Integer audioExternalPort){
        if(audioExternalPort!=null){
            gt("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= audioExternalPort
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortGe(Integer audioExternalPort){
        if(audioExternalPort!=null){
            ge("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; audioExternalPort
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortLt(Integer audioExternalPort){
        if(audioExternalPort!=null){
            lt("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= audioExternalPort
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortLe(Integer audioExternalPort){
        if(audioExternalPort!=null){
            le("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param audioExternalPortStart       值1
     * @param audioExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortBetween(Integer audioExternalPortStart,Integer audioExternalPortEnd){
        if(audioExternalPortStart!=null && audioExternalPortEnd!=null){
            between("audio_external_port",audioExternalPortStart,audioExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param audioExternalPortStart       值1
     * @param audioExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortNotBetween(Integer audioExternalPortStart,Integer audioExternalPortEnd){
        if(audioExternalPortStart!=null && audioExternalPortEnd!=null){
            notBetween("audio_external_port",audioExternalPortStart,audioExternalPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' audioExternalPort
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortLike(Integer audioExternalPort){
        if(audioExternalPort!=null){
            like("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' audioExternalPort
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortNotLike(Integer audioExternalPort){
        if(audioExternalPort!=null){
            notLike("audio_external_port",audioExternalPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' audioExternalPort
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortLikeLeft(Integer audioExternalPort){
        if(audioExternalPort!=null){
            likeLeft("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' audioExternalPort
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortLikeRight(Integer audioExternalPort){
        if(audioExternalPort!=null){
            likeRight("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortIsNull(){
        isNull("audio_external_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortIsNotNull(){
        isNotNull("audio_external_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("audio_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("audio_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("audio_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper audioExternalPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("audio_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = videoPort
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortEq(Integer videoPort){
        if(videoPort!=null){
            eq("video_port",videoPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; videoPort
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortNe(Integer videoPort){
        if(videoPort!=null){
            ne("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; videoPort
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortGt(Integer videoPort){
        if(videoPort!=null){
            gt("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= videoPort
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortGe(Integer videoPort){
        if(videoPort!=null){
            ge("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; videoPort
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortLt(Integer videoPort){
        if(videoPort!=null){
            lt("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= videoPort
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortLe(Integer videoPort){
        if(videoPort!=null){
            le("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param videoPortStart       值1
     * @param videoPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortBetween(Integer videoPortStart,Integer videoPortEnd){
        if(videoPortStart!=null && videoPortEnd!=null){
            between("video_port",videoPortStart,videoPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param videoPortStart       值1
     * @param videoPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortNotBetween(Integer videoPortStart,Integer videoPortEnd){
        if(videoPortStart!=null && videoPortEnd!=null){
            notBetween("video_port",videoPortStart,videoPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' videoPort
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortLike(Integer videoPort){
        if(videoPort!=null){
            like("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' videoPort
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortNotLike(Integer videoPort){
        if(videoPort!=null){
            notLike("video_port",videoPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' videoPort
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortLikeLeft(Integer videoPort){
        if(videoPort!=null){
            likeLeft("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' videoPort
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortLikeRight(Integer videoPort){
        if(videoPort!=null){
            likeRight("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortIsNull(){
        isNull("video_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortIsNotNull(){
        isNotNull("video_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("video_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("video_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("video_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("video_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = videoExternalPort
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortEq(Integer videoExternalPort){
        if(videoExternalPort!=null){
            eq("video_external_port",videoExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; videoExternalPort
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortNe(Integer videoExternalPort){
        if(videoExternalPort!=null){
            ne("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; videoExternalPort
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortGt(Integer videoExternalPort){
        if(videoExternalPort!=null){
            gt("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= videoExternalPort
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortGe(Integer videoExternalPort){
        if(videoExternalPort!=null){
            ge("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; videoExternalPort
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortLt(Integer videoExternalPort){
        if(videoExternalPort!=null){
            lt("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= videoExternalPort
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortLe(Integer videoExternalPort){
        if(videoExternalPort!=null){
            le("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param videoExternalPortStart       值1
     * @param videoExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortBetween(Integer videoExternalPortStart,Integer videoExternalPortEnd){
        if(videoExternalPortStart!=null && videoExternalPortEnd!=null){
            between("video_external_port",videoExternalPortStart,videoExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param videoExternalPortStart       值1
     * @param videoExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortNotBetween(Integer videoExternalPortStart,Integer videoExternalPortEnd){
        if(videoExternalPortStart!=null && videoExternalPortEnd!=null){
            notBetween("video_external_port",videoExternalPortStart,videoExternalPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' videoExternalPort
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortLike(Integer videoExternalPort){
        if(videoExternalPort!=null){
            like("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' videoExternalPort
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortNotLike(Integer videoExternalPort){
        if(videoExternalPort!=null){
            notLike("video_external_port",videoExternalPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' videoExternalPort
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortLikeLeft(Integer videoExternalPort){
        if(videoExternalPort!=null){
            likeLeft("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' videoExternalPort
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortLikeRight(Integer videoExternalPort){
        if(videoExternalPort!=null){
            likeRight("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortIsNull(){
        isNull("video_external_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortIsNotNull(){
        isNotNull("video_external_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("video_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("video_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("video_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper videoExternalPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("video_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = maxslots
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsEq(Integer maxslots){
        if(maxslots!=null){
            eq("maxslots",maxslots);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; maxslots
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsNe(Integer maxslots){
        if(maxslots!=null){
            ne("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; maxslots
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsGt(Integer maxslots){
        if(maxslots!=null){
            gt("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= maxslots
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsGe(Integer maxslots){
        if(maxslots!=null){
            ge("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; maxslots
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsLt(Integer maxslots){
        if(maxslots!=null){
            lt("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= maxslots
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsLe(Integer maxslots){
        if(maxslots!=null){
            le("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param maxslotsStart       值1
     * @param maxslotsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsBetween(Integer maxslotsStart,Integer maxslotsEnd){
        if(maxslotsStart!=null && maxslotsEnd!=null){
            between("maxslots",maxslotsStart,maxslotsEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param maxslotsStart       值1
     * @param maxslotsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsNotBetween(Integer maxslotsStart,Integer maxslotsEnd){
        if(maxslotsStart!=null && maxslotsEnd!=null){
            notBetween("maxslots",maxslotsStart,maxslotsEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' maxslots
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsLike(Integer maxslots){
        if(maxslots!=null){
            like("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' maxslots
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsNotLike(Integer maxslots){
        if(maxslots!=null){
            notLike("maxslots",maxslots);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' maxslots
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsLikeLeft(Integer maxslots){
        if(maxslots!=null){
            likeLeft("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' maxslots
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsLikeRight(Integer maxslots){
        if(maxslots!=null){
            likeRight("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsIsNull(){
        isNull("maxslots");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsIsNotNull(){
        isNotNull("maxslots");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("maxslots",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsIn(Integer... values){
        if(values!=null && values.length>0){
            in("maxslots",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("maxslots",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper maxslotsNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("maxslots",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = rtcMinPort
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortEq(Integer rtcMinPort){
        if(rtcMinPort!=null){
            eq("rtc_min_port",rtcMinPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; rtcMinPort
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortNe(Integer rtcMinPort){
        if(rtcMinPort!=null){
            ne("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; rtcMinPort
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortGt(Integer rtcMinPort){
        if(rtcMinPort!=null){
            gt("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= rtcMinPort
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortGe(Integer rtcMinPort){
        if(rtcMinPort!=null){
            ge("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; rtcMinPort
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortLt(Integer rtcMinPort){
        if(rtcMinPort!=null){
            lt("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= rtcMinPort
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortLe(Integer rtcMinPort){
        if(rtcMinPort!=null){
            le("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rtcMinPortStart       值1
     * @param rtcMinPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortBetween(Integer rtcMinPortStart,Integer rtcMinPortEnd){
        if(rtcMinPortStart!=null && rtcMinPortEnd!=null){
            between("rtc_min_port",rtcMinPortStart,rtcMinPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rtcMinPortStart       值1
     * @param rtcMinPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortNotBetween(Integer rtcMinPortStart,Integer rtcMinPortEnd){
        if(rtcMinPortStart!=null && rtcMinPortEnd!=null){
            notBetween("rtc_min_port",rtcMinPortStart,rtcMinPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' rtcMinPort
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortLike(Integer rtcMinPort){
        if(rtcMinPort!=null){
            like("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' rtcMinPort
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortNotLike(Integer rtcMinPort){
        if(rtcMinPort!=null){
            notLike("rtc_min_port",rtcMinPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' rtcMinPort
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortLikeLeft(Integer rtcMinPort){
        if(rtcMinPort!=null){
            likeLeft("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' rtcMinPort
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortLikeRight(Integer rtcMinPort){
        if(rtcMinPort!=null){
            likeRight("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortIsNull(){
        isNull("rtc_min_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortIsNotNull(){
        isNotNull("rtc_min_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("rtc_min_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("rtc_min_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("rtc_min_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rtc_min_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = rtcMaxPort
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortEq(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            eq("rtc_max_port",rtcMaxPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; rtcMaxPort
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortNe(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            ne("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; rtcMaxPort
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortGt(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            gt("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= rtcMaxPort
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortGe(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            ge("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; rtcMaxPort
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortLt(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            lt("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= rtcMaxPort
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortLe(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            le("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rtcMaxPortStart       值1
     * @param rtcMaxPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortBetween(Integer rtcMaxPortStart,Integer rtcMaxPortEnd){
        if(rtcMaxPortStart!=null && rtcMaxPortEnd!=null){
            between("rtc_max_port",rtcMaxPortStart,rtcMaxPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rtcMaxPortStart       值1
     * @param rtcMaxPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortNotBetween(Integer rtcMaxPortStart,Integer rtcMaxPortEnd){
        if(rtcMaxPortStart!=null && rtcMaxPortEnd!=null){
            notBetween("rtc_max_port",rtcMaxPortStart,rtcMaxPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' rtcMaxPort
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortLike(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            like("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' rtcMaxPort
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortNotLike(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            notLike("rtc_max_port",rtcMaxPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' rtcMaxPort
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortLikeLeft(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            likeLeft("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' rtcMaxPort
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortLikeRight(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            likeRight("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortIsNull(){
        isNull("rtc_max_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortIsNotNull(){
        isNotNull("rtc_max_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("rtc_max_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("rtc_max_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("rtc_max_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rtc_max_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = rtcMinExternalPort
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortEq(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            eq("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; rtcMinExternalPort
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortNe(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            ne("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; rtcMinExternalPort
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortGt(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            gt("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= rtcMinExternalPort
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortGe(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            ge("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; rtcMinExternalPort
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortLt(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            lt("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= rtcMinExternalPort
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortLe(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            le("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rtcMinExternalPortStart       值1
     * @param rtcMinExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortBetween(Integer rtcMinExternalPortStart,Integer rtcMinExternalPortEnd){
        if(rtcMinExternalPortStart!=null && rtcMinExternalPortEnd!=null){
            between("rtc_min_external_port",rtcMinExternalPortStart,rtcMinExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rtcMinExternalPortStart       值1
     * @param rtcMinExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortNotBetween(Integer rtcMinExternalPortStart,Integer rtcMinExternalPortEnd){
        if(rtcMinExternalPortStart!=null && rtcMinExternalPortEnd!=null){
            notBetween("rtc_min_external_port",rtcMinExternalPortStart,rtcMinExternalPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' rtcMinExternalPort
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortLike(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            like("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' rtcMinExternalPort
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortNotLike(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            notLike("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' rtcMinExternalPort
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortLikeLeft(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            likeLeft("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' rtcMinExternalPort
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortLikeRight(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            likeRight("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortIsNull(){
        isNull("rtc_min_external_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortIsNotNull(){
        isNotNull("rtc_min_external_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("rtc_min_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("rtc_min_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("rtc_min_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMinExternalPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rtc_min_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = rtcMaxExternalPort
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortEq(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            eq("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; rtcMaxExternalPort
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortNe(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            ne("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; rtcMaxExternalPort
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortGt(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            gt("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= rtcMaxExternalPort
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortGe(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            ge("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; rtcMaxExternalPort
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortLt(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            lt("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= rtcMaxExternalPort
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortLe(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            le("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rtcMaxExternalPortStart       值1
     * @param rtcMaxExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortBetween(Integer rtcMaxExternalPortStart,Integer rtcMaxExternalPortEnd){
        if(rtcMaxExternalPortStart!=null && rtcMaxExternalPortEnd!=null){
            between("rtc_max_external_port",rtcMaxExternalPortStart,rtcMaxExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rtcMaxExternalPortStart       值1
     * @param rtcMaxExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortNotBetween(Integer rtcMaxExternalPortStart,Integer rtcMaxExternalPortEnd){
        if(rtcMaxExternalPortStart!=null && rtcMaxExternalPortEnd!=null){
            notBetween("rtc_max_external_port",rtcMaxExternalPortStart,rtcMaxExternalPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' rtcMaxExternalPort
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortLike(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            like("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' rtcMaxExternalPort
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortNotLike(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            notLike("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' rtcMaxExternalPort
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortLikeLeft(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            likeLeft("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' rtcMaxExternalPort
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortLikeRight(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            likeRight("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortIsNull(){
        isNull("rtc_max_external_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortIsNotNull(){
        isNotNull("rtc_max_external_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("rtc_max_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("rtc_max_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("rtc_max_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper rtcMaxExternalPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rtc_max_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = resetTastUid
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidEq(String resetTastUid){
        if(resetTastUid!=null){
            eq("reset_tast_uid",resetTastUid);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; resetTastUid
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidNe(String resetTastUid){
        if(resetTastUid!=null){
            ne("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; resetTastUid
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidGt(String resetTastUid){
        if(resetTastUid!=null){
            gt("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= resetTastUid
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidGe(String resetTastUid){
        if(resetTastUid!=null){
            ge("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; resetTastUid
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidLt(String resetTastUid){
        if(resetTastUid!=null){
            lt("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= resetTastUid
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidLe(String resetTastUid){
        if(resetTastUid!=null){
            le("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param resetTastUidStart       值1
     * @param resetTastUidEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidBetween(String resetTastUidStart,String resetTastUidEnd){
        if(resetTastUidStart!=null && resetTastUidEnd!=null){
            between("reset_tast_uid",resetTastUidStart,resetTastUidEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetTastUidStart       值1
     * @param resetTastUidEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidNotBetween(String resetTastUidStart,String resetTastUidEnd){
        if(resetTastUidStart!=null && resetTastUidEnd!=null){
            notBetween("reset_tast_uid",resetTastUidStart,resetTastUidEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' resetTastUid
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidLike(String resetTastUid){
        if(resetTastUid!=null){
            like("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' resetTastUid
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidNotLike(String resetTastUid){
        if(resetTastUid!=null){
            notLike("reset_tast_uid",resetTastUid);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' resetTastUid
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidLikeLeft(String resetTastUid){
        if(resetTastUid!=null){
            likeLeft("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' resetTastUid
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidLikeRight(String resetTastUid){
        if(resetTastUid!=null){
            likeRight("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidIsNull(){
        isNull("reset_tast_uid");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidIsNotNull(){
        isNotNull("reset_tast_uid");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("reset_tast_uid",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidIn(String... values){
        if(values!=null && values.length>0){
            in("reset_tast_uid",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_tast_uid",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetTastUidNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_tast_uid",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = uploadImageTaskId
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdEq(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            eq("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; uploadImageTaskId
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdNe(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            ne("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; uploadImageTaskId
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdGt(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            gt("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= uploadImageTaskId
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdGe(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            ge("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; uploadImageTaskId
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdLt(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            lt("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= uploadImageTaskId
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdLe(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            le("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param uploadImageTaskIdStart       值1
     * @param uploadImageTaskIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdBetween(String uploadImageTaskIdStart,String uploadImageTaskIdEnd){
        if(uploadImageTaskIdStart!=null && uploadImageTaskIdEnd!=null){
            between("upload_image_task_id",uploadImageTaskIdStart,uploadImageTaskIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param uploadImageTaskIdStart       值1
     * @param uploadImageTaskIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdNotBetween(String uploadImageTaskIdStart,String uploadImageTaskIdEnd){
        if(uploadImageTaskIdStart!=null && uploadImageTaskIdEnd!=null){
            notBetween("upload_image_task_id",uploadImageTaskIdStart,uploadImageTaskIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' uploadImageTaskId
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdLike(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            like("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' uploadImageTaskId
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdNotLike(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            notLike("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' uploadImageTaskId
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdLikeLeft(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            likeLeft("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' uploadImageTaskId
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdLikeRight(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            likeRight("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdIsNull(){
        isNull("upload_image_task_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdIsNotNull(){
        isNotNull("upload_image_task_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("upload_image_task_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdIn(String... values){
        if(values!=null && values.length>0){
            in("upload_image_task_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("upload_image_task_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadImageTaskIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("upload_image_task_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = resetReponse
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseEq(String resetReponse){
        if(resetReponse!=null){
            eq("reset_reponse",resetReponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; resetReponse
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseNe(String resetReponse){
        if(resetReponse!=null){
            ne("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; resetReponse
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseGt(String resetReponse){
        if(resetReponse!=null){
            gt("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= resetReponse
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseGe(String resetReponse){
        if(resetReponse!=null){
            ge("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; resetReponse
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseLt(String resetReponse){
        if(resetReponse!=null){
            lt("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= resetReponse
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseLe(String resetReponse){
        if(resetReponse!=null){
            le("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param resetReponseStart       值1
     * @param resetReponseEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseBetween(String resetReponseStart,String resetReponseEnd){
        if(resetReponseStart!=null && resetReponseEnd!=null){
            between("reset_reponse",resetReponseStart,resetReponseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetReponseStart       值1
     * @param resetReponseEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseNotBetween(String resetReponseStart,String resetReponseEnd){
        if(resetReponseStart!=null && resetReponseEnd!=null){
            notBetween("reset_reponse",resetReponseStart,resetReponseEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' resetReponse
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseLike(String resetReponse){
        if(resetReponse!=null){
            like("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' resetReponse
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseNotLike(String resetReponse){
        if(resetReponse!=null){
            notLike("reset_reponse",resetReponse);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' resetReponse
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseLikeLeft(String resetReponse){
        if(resetReponse!=null){
            likeLeft("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' resetReponse
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseLikeRight(String resetReponse){
        if(resetReponse!=null){
            likeRight("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseIsNull(){
        isNull("reset_reponse");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseIsNotNull(){
        isNotNull("reset_reponse");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("reset_reponse",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseIn(String... values){
        if(values!=null && values.length>0){
            in("reset_reponse",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_reponse",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper resetReponseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_reponse",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = uploadResponse
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseEq(String uploadResponse){
        if(uploadResponse!=null){
            eq("upload_response",uploadResponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; uploadResponse
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseNe(String uploadResponse){
        if(uploadResponse!=null){
            ne("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; uploadResponse
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseGt(String uploadResponse){
        if(uploadResponse!=null){
            gt("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= uploadResponse
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseGe(String uploadResponse){
        if(uploadResponse!=null){
            ge("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; uploadResponse
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseLt(String uploadResponse){
        if(uploadResponse!=null){
            lt("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= uploadResponse
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseLe(String uploadResponse){
        if(uploadResponse!=null){
            le("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param uploadResponseStart       值1
     * @param uploadResponseEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseBetween(String uploadResponseStart,String uploadResponseEnd){
        if(uploadResponseStart!=null && uploadResponseEnd!=null){
            between("upload_response",uploadResponseStart,uploadResponseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param uploadResponseStart       值1
     * @param uploadResponseEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseNotBetween(String uploadResponseStart,String uploadResponseEnd){
        if(uploadResponseStart!=null && uploadResponseEnd!=null){
            notBetween("upload_response",uploadResponseStart,uploadResponseEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' uploadResponse
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseLike(String uploadResponse){
        if(uploadResponse!=null){
            like("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' uploadResponse
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseNotLike(String uploadResponse){
        if(uploadResponse!=null){
            notLike("upload_response",uploadResponse);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' uploadResponse
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseLikeLeft(String uploadResponse){
        if(uploadResponse!=null){
            likeLeft("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' uploadResponse
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseLikeRight(String uploadResponse){
        if(uploadResponse!=null){
            likeRight("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseIsNull(){
        isNull("upload_response");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseIsNotNull(){
        isNotNull("upload_response");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("upload_response",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseIn(String... values){
        if(values!=null && values.length>0){
            in("upload_response",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("upload_response",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateWrapper uploadResponseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("upload_response",values);
        }
        return this;
    }


}
