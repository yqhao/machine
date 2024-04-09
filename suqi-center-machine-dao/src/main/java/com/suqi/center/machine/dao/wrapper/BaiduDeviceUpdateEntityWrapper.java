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
public class BaiduDeviceUpdateEntityWrapper extends UpdateWrapper<BaiduDevice> {

    public static BaiduDeviceUpdateEntityWrapper wrapper(BaiduDevice entity) {
        return new BaiduDeviceUpdateEntityWrapper(entity);
    }

    private BaiduDevice entity;

    public BaiduDeviceUpdateEntityWrapper(BaiduDevice entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 百度云机所属账号
     */
    public BaiduDeviceUpdateEntityWrapper setFkBaiduAccountId(Long fkBaiduAccountId) {
         set("fk_baidu_account_id",fkBaiduAccountId);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setUid(String uid) {
         set("uid",uid);
        return this;
    }
    /**
     * 云机编号
     */
    public BaiduDeviceUpdateEntityWrapper setCode(String code) {
         set("code",code);
        return this;
    }
    /**
     * 云机所属分组
     */
    public BaiduDeviceUpdateEntityWrapper setGroupCode(String groupCode) {
         set("group_code",groupCode);
        return this;
    }
    /**
     * 机房号
     */
    public BaiduDeviceUpdateEntityWrapper setIdcCode(String idcCode) {
         set("idc_code",idcCode);
        return this;
    }
    /**
     * 当前镜像版本号
     */
    public BaiduDeviceUpdateEntityWrapper setImageVersionId(String imageVersionId) {
         set("image_version_id",imageVersionId);
        return this;
    }
    /**
     * 最后一次重置时间
     */
    public BaiduDeviceUpdateEntityWrapper setLastResetTime(Date lastResetTime) {
         set("last_reset_time",lastResetTime);
        return this;
    }
    /**
     * 重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,
     */
    public BaiduDeviceUpdateEntityWrapper setResetStatus(Integer resetStatus) {
         set("reset_status",resetStatus);
        return this;
    }
    /**
     * 重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id
     */
    public BaiduDeviceUpdateEntityWrapper setResetImageVersionId(String resetImageVersionId) {
         set("reset_image_version_id",resetImageVersionId);
        return this;
    }
    /**
     * 交付的订单编号
     */
    public BaiduDeviceUpdateEntityWrapper setOrderCode(String orderCode) {
         set("order_code",orderCode);
        return this;
    }
    /**
     * 交付日期的备注
     */
    public BaiduDeviceUpdateEntityWrapper setDeliverDay(String deliverDay) {
         set("deliver_day",deliverDay);
        return this;
    }
    /**
     * 在营销云1.0中的编号
     */
    public BaiduDeviceUpdateEntityWrapper setOldCode(String oldCode) {
         set("old_code",oldCode);
        return this;
    }
    /**
     * 在物理机上的多开序号
     */
    public BaiduDeviceUpdateEntityWrapper setSn(String sn) {
         set("sn",sn);
        return this;
    }
    /**
     * 云机的虚拟ip
     */
    public BaiduDeviceUpdateEntityWrapper setIp(String ip) {
         set("ip",ip);
        return this;
    }
    /**
     * 底层paas标记
     */
    public BaiduDeviceUpdateEntityWrapper setPaas(String paas) {
         set("paas",paas);
        return this;
    }
    /**
     * 物理机的code
     */
    public BaiduDeviceUpdateEntityWrapper setDeviceCode(String deviceCode) {
         set("device_code",deviceCode);
        return this;
    }
    /**
     * 物理机ip
     */
    public BaiduDeviceUpdateEntityWrapper setDeviceIp(String deviceIp) {
         set("device_ip",deviceIp);
        return this;
    }
    /**
     * 硬件配置
     */
    public BaiduDeviceUpdateEntityWrapper setHardwareCode(String hardwareCode) {
         set("hardware_code",hardwareCode);
        return this;
    }
    /**
     * 网段
     */
    public BaiduDeviceUpdateEntityWrapper setUnitSeg(String unitSeg) {
         set("unit_seg",unitSeg);
        return this;
    }
    /**
     * 启动时间
     */
    public BaiduDeviceUpdateEntityWrapper setBootTime(Date bootTime) {
         set("boot_time",bootTime);
        return this;
    }
    /**
     * 上次心跳时间
     */
    public BaiduDeviceUpdateEntityWrapper setHbTime(Date hbTime) {
         set("hb_time",hbTime);
        return this;
    }
    /**
     * 报警超时时间
     */
    public BaiduDeviceUpdateEntityWrapper setAlertExpireTime(Date alertExpireTime) {
         set("alert_expire_time",alertExpireTime);
        return this;
    }
    /**
     * 已离线时长用来判断处于离线的云机是重启，还是故障
     */
    public BaiduDeviceUpdateEntityWrapper setOfflineTime(Date offlineTime) {
         set("offline_time",offlineTime);
        return this;
    }
    /**
     * 上行网速，单位B/s网速测算
     */
    public BaiduDeviceUpdateEntityWrapper setTx(String tx) {
         set("tx",tx);
        return this;
    }
    /**
     * 下行网速，单位B/s
     */
    public BaiduDeviceUpdateEntityWrapper setRx(String rx) {
         set("rx",rx);
        return this;
    }
    /**
     * 云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)
     */
    public BaiduDeviceUpdateEntityWrapper setStatusOnline(Integer statusOnline) {
         set("status_online",statusOnline);
        return this;
    }
    /**
     * 如果云机状态是ping离线或者启动中，这个值是已离线时长
     */
    public BaiduDeviceUpdateEntityWrapper setOffSeconds(Long offSeconds) {
         set("off_seconds",offSeconds);
        return this;
    }
    /**
     * 云机错误消息
     */
    public BaiduDeviceUpdateEntityWrapper setErrorMessage(String errorMessage) {
         set("error_message",errorMessage);
        return this;
    }
    /**
     * 0 未推流 1 正在推流
     */
    public BaiduDeviceUpdateEntityWrapper setStatusControl(Integer statusControl) {
         set("status_control",statusControl);
        return this;
    }
    /**
     * 是否开启报警
     */
    public BaiduDeviceUpdateEntityWrapper setAlertEnabled(Boolean alertEnabled) {
         set("alert_enabled",alertEnabled);
        return this;
    }
    /**
     * 在paas中状态是否正常
     */
    public BaiduDeviceUpdateEntityWrapper setStatusPaaS(Boolean statusPaaS) {
         set("status_paa_s",statusPaaS);
        return this;
    }
    /**
     * 上次成功申请到推流token的用户名
     */
    public BaiduDeviceUpdateEntityWrapper setLastApplyUsername(String lastApplyUsername) {
         set("last_apply_username",lastApplyUsername);
        return this;
    }
    /**
     * 上次成功申请到token的日期
     */
    public BaiduDeviceUpdateEntityWrapper setLastApplyDate(Date lastApplyDate) {
         set("last_apply_date",lastApplyDate);
        return this;
    }
    /**
     * 上次活跃日期
     */
    public BaiduDeviceUpdateEntityWrapper setLastActiveDate(Date lastActiveDate) {
         set("last_active_date",lastActiveDate);
        return this;
    }
    /**
     * 安装的应用，多个使用,分割
     */
    public BaiduDeviceUpdateEntityWrapper setPkgs(String pkgs) {
         set("pkgs",pkgs);
        return this;
    }
    /**
     * 标签
     */
    public BaiduDeviceUpdateEntityWrapper setTag(String tag) {
         set("tag",tag);
        return this;
    }
    /**
     * 截图是否正常
     */
    public BaiduDeviceUpdateEntityWrapper setCaptureOk(Boolean captureOk) {
         set("capture_ok",captureOk);
        return this;
    }
    /**
     * 截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃
     */
    public BaiduDeviceUpdateEntityWrapper setCapDiff(Integer capDiff) {
         set("cap_diff",capDiff);
        return this;
    }
    /**
     * dg相应字段
     */
    public BaiduDeviceUpdateEntityWrapper setDgVersion(String dgVersion) {
         set("dg_version",dgVersion);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgVersionCode(String dgVersionCode) {
         set("dg_version_code",dgVersionCode);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgXmStatus(String dgXmStatus) {
         set("dg_xm_status",dgXmStatus);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgTopApp(String dgTopApp) {
         set("dg_top_app",dgTopApp);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgDisplayWidth(Integer dgDisplayWidth) {
         set("dg_display_width",dgDisplayWidth);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgAppsCount(Integer dgAppsCount) {
         set("dg_apps_count",dgAppsCount);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgPropProduct(String dgPropProduct) {
         set("dg_prop_product",dgPropProduct);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgSimImei(String dgSimImei) {
         set("dg_sim_imei",dgSimImei);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgNetStatus(Integer dgNetStatus) {
         set("dg_net_status",dgNetStatus);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgNetBs(Integer dgNetBs) {
         set("dg_net_bs",dgNetBs);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgProxyHost(String dgProxyHost) {
         set("dg_proxy_host",dgProxyHost);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgProxyPort(Integer dgProxyPort) {
         set("dg_proxy_port",dgProxyPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgProxyUsername(String dgProxyUsername) {
         set("dg_proxy_username",dgProxyUsername);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgProxyLocation(String dgProxyLocation) {
         set("dg_proxy_location",dgProxyLocation);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgProxyIp(String dgProxyIp) {
         set("dg_proxy_ip",dgProxyIp);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setLastSyncTime(Date lastSyncTime) {
         set("last_sync_time",lastSyncTime);
        return this;
    }
    /**
     * 机房表区域id
     */
    public BaiduDeviceUpdateEntityWrapper setFkCloudRegionId(Long fkCloudRegionId) {
         set("fk_cloud_region_id",fkCloudRegionId);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setPubIp(String pubIp) {
         set("pub_ip",pubIp);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setAudioSockType(Integer audioSockType) {
         set("audio_sock_type",audioSockType);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setAudioPort(Integer audioPort) {
         set("audio_port",audioPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setAudioExternalPort(Integer audioExternalPort) {
         set("audio_external_port",audioExternalPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setVideoPort(Integer videoPort) {
         set("video_port",videoPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setVideoExternalPort(Integer videoExternalPort) {
         set("video_external_port",videoExternalPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setMaxslots(Integer maxslots) {
         set("maxslots",maxslots);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setRtcMinPort(Integer rtcMinPort) {
         set("rtc_min_port",rtcMinPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setRtcMaxPort(Integer rtcMaxPort) {
         set("rtc_max_port",rtcMaxPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setRtcMinExternalPort(Integer rtcMinExternalPort) {
         set("rtc_min_external_port",rtcMinExternalPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setRtcMaxExternalPort(Integer rtcMaxExternalPort) {
         set("rtc_max_external_port",rtcMaxExternalPort);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setResetTastUid(String resetTastUid) {
         set("reset_tast_uid",resetTastUid);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setUploadImageTaskId(String uploadImageTaskId) {
         set("upload_image_task_id",uploadImageTaskId);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setResetReponse(String resetReponse) {
         set("reset_reponse",resetReponse);
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setUploadResponse(String uploadResponse) {
         set("upload_response",uploadResponse);
        return this;
    }

    protected BaiduDevice entity() {
        if(entity==null){
            throw new NullPointerException("BaiduDevice is null");
        }
        return entity;
    }

    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDeviceId() {
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            set("device_id",deviceId);
        }
        return this;
    }
    /**
     * 百度云机所属账号
     */
    public BaiduDeviceUpdateEntityWrapper setFkBaiduAccountId() {
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            set("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setUid() {
        String uid =entity().getUid();
        if(uid!=null){
            set("uid",uid);
        }
        return this;
    }
    /**
     * 云机编号
     */
    public BaiduDeviceUpdateEntityWrapper setCode() {
        String code =entity().getCode();
        if(code!=null){
            set("code",code);
        }
        return this;
    }
    /**
     * 云机所属分组
     */
    public BaiduDeviceUpdateEntityWrapper setGroupCode() {
        String groupCode =entity().getGroupCode();
        if(groupCode!=null){
            set("group_code",groupCode);
        }
        return this;
    }
    /**
     * 机房号
     */
    public BaiduDeviceUpdateEntityWrapper setIdcCode() {
        String idcCode =entity().getIdcCode();
        if(idcCode!=null){
            set("idc_code",idcCode);
        }
        return this;
    }
    /**
     * 当前镜像版本号
     */
    public BaiduDeviceUpdateEntityWrapper setImageVersionId() {
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            set("image_version_id",imageVersionId);
        }
        return this;
    }
    /**
     * 最后一次重置时间
     */
    public BaiduDeviceUpdateEntityWrapper setLastResetTime() {
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            set("last_reset_time",lastResetTime);
        }
        return this;
    }
    /**
     * 重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,
     */
    public BaiduDeviceUpdateEntityWrapper setResetStatus() {
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null){
            set("reset_status",resetStatus);
        }
        return this;
    }
    /**
     * 重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id
     */
    public BaiduDeviceUpdateEntityWrapper setResetImageVersionId() {
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            set("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }
    /**
     * 交付的订单编号
     */
    public BaiduDeviceUpdateEntityWrapper setOrderCode() {
        String orderCode =entity().getOrderCode();
        if(orderCode!=null){
            set("order_code",orderCode);
        }
        return this;
    }
    /**
     * 交付日期的备注
     */
    public BaiduDeviceUpdateEntityWrapper setDeliverDay() {
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null){
            set("deliver_day",deliverDay);
        }
        return this;
    }
    /**
     * 在营销云1.0中的编号
     */
    public BaiduDeviceUpdateEntityWrapper setOldCode() {
        String oldCode =entity().getOldCode();
        if(oldCode!=null){
            set("old_code",oldCode);
        }
        return this;
    }
    /**
     * 在物理机上的多开序号
     */
    public BaiduDeviceUpdateEntityWrapper setSn() {
        String sn =entity().getSn();
        if(sn!=null){
            set("sn",sn);
        }
        return this;
    }
    /**
     * 云机的虚拟ip
     */
    public BaiduDeviceUpdateEntityWrapper setIp() {
        String ip =entity().getIp();
        if(ip!=null){
            set("ip",ip);
        }
        return this;
    }
    /**
     * 底层paas标记
     */
    public BaiduDeviceUpdateEntityWrapper setPaas() {
        String paas =entity().getPaas();
        if(paas!=null){
            set("paas",paas);
        }
        return this;
    }
    /**
     * 物理机的code
     */
    public BaiduDeviceUpdateEntityWrapper setDeviceCode() {
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null){
            set("device_code",deviceCode);
        }
        return this;
    }
    /**
     * 物理机ip
     */
    public BaiduDeviceUpdateEntityWrapper setDeviceIp() {
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null){
            set("device_ip",deviceIp);
        }
        return this;
    }
    /**
     * 硬件配置
     */
    public BaiduDeviceUpdateEntityWrapper setHardwareCode() {
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null){
            set("hardware_code",hardwareCode);
        }
        return this;
    }
    /**
     * 网段
     */
    public BaiduDeviceUpdateEntityWrapper setUnitSeg() {
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null){
            set("unit_seg",unitSeg);
        }
        return this;
    }
    /**
     * 启动时间
     */
    public BaiduDeviceUpdateEntityWrapper setBootTime() {
        Date bootTime =entity().getBootTime();
        if(bootTime!=null){
            set("boot_time",bootTime);
        }
        return this;
    }
    /**
     * 上次心跳时间
     */
    public BaiduDeviceUpdateEntityWrapper setHbTime() {
        Date hbTime =entity().getHbTime();
        if(hbTime!=null){
            set("hb_time",hbTime);
        }
        return this;
    }
    /**
     * 报警超时时间
     */
    public BaiduDeviceUpdateEntityWrapper setAlertExpireTime() {
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null){
            set("alert_expire_time",alertExpireTime);
        }
        return this;
    }
    /**
     * 已离线时长用来判断处于离线的云机是重启，还是故障
     */
    public BaiduDeviceUpdateEntityWrapper setOfflineTime() {
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null){
            set("offline_time",offlineTime);
        }
        return this;
    }
    /**
     * 上行网速，单位B/s网速测算
     */
    public BaiduDeviceUpdateEntityWrapper setTx() {
        String tx =entity().getTx();
        if(tx!=null){
            set("tx",tx);
        }
        return this;
    }
    /**
     * 下行网速，单位B/s
     */
    public BaiduDeviceUpdateEntityWrapper setRx() {
        String rx =entity().getRx();
        if(rx!=null){
            set("rx",rx);
        }
        return this;
    }
    /**
     * 云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)
     */
    public BaiduDeviceUpdateEntityWrapper setStatusOnline() {
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null){
            set("status_online",statusOnline);
        }
        return this;
    }
    /**
     * 如果云机状态是ping离线或者启动中，这个值是已离线时长
     */
    public BaiduDeviceUpdateEntityWrapper setOffSeconds() {
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null){
            set("off_seconds",offSeconds);
        }
        return this;
    }
    /**
     * 云机错误消息
     */
    public BaiduDeviceUpdateEntityWrapper setErrorMessage() {
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null){
            set("error_message",errorMessage);
        }
        return this;
    }
    /**
     * 0 未推流 1 正在推流
     */
    public BaiduDeviceUpdateEntityWrapper setStatusControl() {
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null){
            set("status_control",statusControl);
        }
        return this;
    }
    /**
     * 是否开启报警
     */
    public BaiduDeviceUpdateEntityWrapper setAlertEnabled() {
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null){
            set("alert_enabled",alertEnabled);
        }
        return this;
    }
    /**
     * 在paas中状态是否正常
     */
    public BaiduDeviceUpdateEntityWrapper setStatusPaaS() {
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null){
            set("status_paa_s",statusPaaS);
        }
        return this;
    }
    /**
     * 上次成功申请到推流token的用户名
     */
    public BaiduDeviceUpdateEntityWrapper setLastApplyUsername() {
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null){
            set("last_apply_username",lastApplyUsername);
        }
        return this;
    }
    /**
     * 上次成功申请到token的日期
     */
    public BaiduDeviceUpdateEntityWrapper setLastApplyDate() {
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null){
            set("last_apply_date",lastApplyDate);
        }
        return this;
    }
    /**
     * 上次活跃日期
     */
    public BaiduDeviceUpdateEntityWrapper setLastActiveDate() {
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null){
            set("last_active_date",lastActiveDate);
        }
        return this;
    }
    /**
     * 安装的应用，多个使用,分割
     */
    public BaiduDeviceUpdateEntityWrapper setPkgs() {
        String pkgs =entity().getPkgs();
        if(pkgs!=null){
            set("pkgs",pkgs);
        }
        return this;
    }
    /**
     * 标签
     */
    public BaiduDeviceUpdateEntityWrapper setTag() {
        String tag =entity().getTag();
        if(tag!=null){
            set("tag",tag);
        }
        return this;
    }
    /**
     * 截图是否正常
     */
    public BaiduDeviceUpdateEntityWrapper setCaptureOk() {
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null){
            set("capture_ok",captureOk);
        }
        return this;
    }
    /**
     * 截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃
     */
    public BaiduDeviceUpdateEntityWrapper setCapDiff() {
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null){
            set("cap_diff",capDiff);
        }
        return this;
    }
    /**
     * dg相应字段
     */
    public BaiduDeviceUpdateEntityWrapper setDgVersion() {
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null){
            set("dg_version",dgVersion);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgVersionCode() {
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null){
            set("dg_version_code",dgVersionCode);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgXmStatus() {
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null){
            set("dg_xm_status",dgXmStatus);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgTopApp() {
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null){
            set("dg_top_app",dgTopApp);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgDisplayWidth() {
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null){
            set("dg_display_width",dgDisplayWidth);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgAppsCount() {
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null){
            set("dg_apps_count",dgAppsCount);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgPropProduct() {
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null){
            set("dg_prop_product",dgPropProduct);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgSimImei() {
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null){
            set("dg_sim_imei",dgSimImei);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgNetStatus() {
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null){
            set("dg_net_status",dgNetStatus);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgNetBs() {
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null){
            set("dg_net_bs",dgNetBs);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgProxyHost() {
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null){
            set("dg_proxy_host",dgProxyHost);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgProxyPort() {
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null){
            set("dg_proxy_port",dgProxyPort);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgProxyUsername() {
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null){
            set("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgProxyLocation() {
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null){
            set("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setDgProxyIp() {
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null){
            set("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setLastUpdateTime() {
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            set("last_update_time",lastUpdateTime);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setLastSyncTime() {
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null){
            set("last_sync_time",lastSyncTime);
        }
        return this;
    }
    /**
     * 机房表区域id
     */
    public BaiduDeviceUpdateEntityWrapper setFkCloudRegionId() {
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null){
            set("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setPubIp() {
        String pubIp =entity().getPubIp();
        if(pubIp!=null){
            set("pub_ip",pubIp);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setAudioSockType() {
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null){
            set("audio_sock_type",audioSockType);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setAudioPort() {
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null){
            set("audio_port",audioPort);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setAudioExternalPort() {
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null){
            set("audio_external_port",audioExternalPort);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setVideoPort() {
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null){
            set("video_port",videoPort);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setVideoExternalPort() {
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null){
            set("video_external_port",videoExternalPort);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setMaxslots() {
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null){
            set("maxslots",maxslots);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setRtcMinPort() {
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null){
            set("rtc_min_port",rtcMinPort);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setRtcMaxPort() {
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null){
            set("rtc_max_port",rtcMaxPort);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setRtcMinExternalPort() {
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null){
            set("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setRtcMaxExternalPort() {
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null){
            set("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setResetTastUid() {
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null){
            set("reset_tast_uid",resetTastUid);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setUploadImageTaskId() {
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null){
            set("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setResetReponse() {
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null){
            set("reset_reponse",resetReponse);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduDeviceUpdateEntityWrapper setUploadResponse() {
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null){
            set("upload_response",uploadResponse);
        }
        return this;
    }
    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idLikeRight(Long id){
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
    public BaiduDeviceUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idIn(Collection<Long> value){
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
    public BaiduDeviceUpdateEntityWrapper idIn(Long... values){
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
    public BaiduDeviceUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public BaiduDeviceUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdEq(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDeviceId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdNe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDeviceId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdGt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDeviceId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdGe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDeviceId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdLt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDeviceId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDeviceId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDeviceId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdLikeRight(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdLikeRight(String deviceId){
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
    public BaiduDeviceUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIdIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper deviceIdIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * 等于 = entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdEq(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            eq("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * 不等于 &lt;&gt; entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdNe(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            ne("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * 大于 &gt; entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdGt(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            gt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * 大于等于 &gt;= entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdGe(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            ge("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * 小于 &lt; entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdLt(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            lt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * 小于等于 &lt;= entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdLe(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            le("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * BETWEEN  entity().getFkBaiduAccountId() AND 值2
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdBetween(Long fkBaiduAccountIdEnd){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null && fkBaiduAccountIdEnd!=null){
            between("fk_baidu_account_id",fkBaiduAccountId,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * NOT BETWEEN  entity().getFkBaiduAccountId() AND 值2
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdNotBetween(Long fkBaiduAccountIdEnd){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null && fkBaiduAccountIdEnd!=null){
            notBetween("fk_baidu_account_id",fkBaiduAccountId,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * BETWEEN  entity().getFkBaiduAccountId() AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null && fkBaiduAccountIdEnd!=null){
            between("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * NOT BETWEEN  entity().getFkBaiduAccountId() AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdNotBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null && fkBaiduAccountIdEnd!=null){
            notBetween("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>百度云机所属账号</p>
     * LIKE '%值%' entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdLike(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            like("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * NOT LIKE '%值%' entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdNotLike(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            notLike("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }


    /**
     * <p>百度云机所属账号</p>
     * LIKE '%值' entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdLikeLeft(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            likeLeft("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * LIKE '值%' entity().getFkBaiduAccountId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdLikeRight(){
        Long fkBaiduAccountId =entity().getFkBaiduAccountId();
        if(fkBaiduAccountId!=null){
            likeRight("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

/**
     * <p>百度云机所属账号</p>
     * 等于 =
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdEq(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            eq("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * 不等于 &lt;&gt;
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdNe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            ne("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * 大于 &gt;
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdGt(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            gt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * 大于等于 &gt;=
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdGe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            ge("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * 小于 &lt;
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdLt(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            lt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * 小于等于 &lt;=
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdLe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            le("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * LIKE '%值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdLike(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            like("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * NOT LIKE '%值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdNotLike(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            notLike("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }


    /**
     * <p>百度云机所属账号</p>
     * LIKE '%值'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdLikeLeft(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            likeLeft("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * LIKE '值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdLikeRight(Long fkBaiduAccountId){
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
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdIsNull(){
        isNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdIsNotNull(){
        isNotNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdIn(Collection<Long> value){
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
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdIn(Long... values){
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
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdNotIn(Collection<Long> value){
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
    public BaiduDeviceUpdateEntityWrapper fkBaiduAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_account_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidEq(){
        String uid =entity().getUid();
        if(uid!=null){
            eq("uid",uid);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidNe(){
        String uid =entity().getUid();
        if(uid!=null){
            ne("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidGt(){
        String uid =entity().getUid();
        if(uid!=null){
            gt("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidGe(){
        String uid =entity().getUid();
        if(uid!=null){
            ge("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidLt(){
        String uid =entity().getUid();
        if(uid!=null){
            lt("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidLe(){
        String uid =entity().getUid();
        if(uid!=null){
            le("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getUid() AND 值2
     * @param uidEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidBetween(String uidEnd){
        String uid =entity().getUid();
        if(uid!=null && uidEnd!=null){
            between("uid",uid,uidEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getUid() AND 值2
     * @param uidEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidNotBetween(String uidEnd){
        String uid =entity().getUid();
        if(uid!=null && uidEnd!=null){
            notBetween("uid",uid,uidEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getUid() AND 值2
     * @param uidStart       值1
     * @param uidEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidBetween(String uidStart,String uidEnd){
        String uid =entity().getUid();
        if(uid!=null && uidEnd!=null){
            between("uid",uidStart,uidEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getUid() AND 值2
     * @param uidStart       值1
     * @param uidEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidNotBetween(String uidStart,String uidEnd){
        String uid =entity().getUid();
        if(uid!=null && uidEnd!=null){
            notBetween("uid",uidStart,uidEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidLike(){
        String uid =entity().getUid();
        if(uid!=null){
            like("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidNotLike(){
        String uid =entity().getUid();
        if(uid!=null){
            notLike("uid",uid);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidLikeLeft(){
        String uid =entity().getUid();
        if(uid!=null){
            likeLeft("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidLikeRight(){
        String uid =entity().getUid();
        if(uid!=null){
            likeRight("uid",uid);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidEq(String uid){
        if(uid!=null){
            eq("uid",uid);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidNe(String uid){
        if(uid!=null){
            ne("uid",uid);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidGt(String uid){
        if(uid!=null){
            gt("uid",uid);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidGe(String uid){
        if(uid!=null){
            ge("uid",uid);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidLt(String uid){
        if(uid!=null){
            lt("uid",uid);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidLe(String uid){
        if(uid!=null){
            le("uid",uid);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidLike(String uid){
        if(uid!=null){
            like("uid",uid);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidNotLike(String uid){
        if(uid!=null){
            notLike("uid",uid);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidLikeLeft(String uid){
        if(uid!=null){
            likeLeft("uid",uid);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param uid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidLikeRight(String uid){
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
    public BaiduDeviceUpdateEntityWrapper uidIsNull(){
        isNull("uid");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidIsNotNull(){
        isNotNull("uid");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uidIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper uidIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper uidNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper uidNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("uid",values);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * 等于 = entity().getCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeEq(){
        String code =entity().getCode();
        if(code!=null){
            eq("code",code);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * 不等于 &lt;&gt; entity().getCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeNe(){
        String code =entity().getCode();
        if(code!=null){
            ne("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * 大于 &gt; entity().getCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeGt(){
        String code =entity().getCode();
        if(code!=null){
            gt("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * 大于等于 &gt;= entity().getCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeGe(){
        String code =entity().getCode();
        if(code!=null){
            ge("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * 小于 &lt; entity().getCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeLt(){
        String code =entity().getCode();
        if(code!=null){
            lt("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * 小于等于 &lt;= entity().getCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeLe(){
        String code =entity().getCode();
        if(code!=null){
            le("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * BETWEEN  entity().getCode() AND 值2
     * @param codeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeBetween(String codeEnd){
        String code =entity().getCode();
        if(code!=null && codeEnd!=null){
            between("code",code,codeEnd);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * NOT BETWEEN  entity().getCode() AND 值2
     * @param codeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeNotBetween(String codeEnd){
        String code =entity().getCode();
        if(code!=null && codeEnd!=null){
            notBetween("code",code,codeEnd);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * BETWEEN  entity().getCode() AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeBetween(String codeStart,String codeEnd){
        String code =entity().getCode();
        if(code!=null && codeEnd!=null){
            between("code",codeStart,codeEnd);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * NOT BETWEEN  entity().getCode() AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeNotBetween(String codeStart,String codeEnd){
        String code =entity().getCode();
        if(code!=null && codeEnd!=null){
            notBetween("code",codeStart,codeEnd);
        }
        return this;
     }


    /**
     * <p>云机编号</p>
     * LIKE '%值%' entity().getCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeLike(){
        String code =entity().getCode();
        if(code!=null){
            like("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * NOT LIKE '%值%' entity().getCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeNotLike(){
        String code =entity().getCode();
        if(code!=null){
            notLike("code",code);
        }
        return this;
     }


    /**
     * <p>云机编号</p>
     * LIKE '%值' entity().getCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeLikeLeft(){
        String code =entity().getCode();
        if(code!=null){
            likeLeft("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * LIKE '值%' entity().getCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeLikeRight(){
        String code =entity().getCode();
        if(code!=null){
            likeRight("code",code);
        }
        return this;
     }

/**
     * <p>云机编号</p>
     * 等于 =
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeEq(String code){
        if(code!=null){
            eq("code",code);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * 不等于 &lt;&gt;
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeNe(String code){
        if(code!=null){
            ne("code",code);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * 大于 &gt;
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeGt(String code){
        if(code!=null){
            gt("code",code);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * 大于等于 &gt;=
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeGe(String code){
        if(code!=null){
            ge("code",code);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * 小于 &lt;
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeLt(String code){
        if(code!=null){
            lt("code",code);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * 小于等于 &lt;=
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeLe(String code){
        if(code!=null){
            le("code",code);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * LIKE '%值%'
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeLike(String code){
        if(code!=null){
            like("code",code);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * NOT LIKE '%值%'
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeNotLike(String code){
        if(code!=null){
            notLike("code",code);
        }
        return this;
    }


    /**
     * <p>云机编号</p>
     * LIKE '%值'
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeLikeLeft(String code){
        if(code!=null){
            likeLeft("code",code);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * LIKE '值%'
     * @param code       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeLikeRight(String code){
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
    public BaiduDeviceUpdateEntityWrapper codeIsNull(){
        isNull("code");
        return this;
    }

    /**
     * <p>云机编号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeIsNotNull(){
        isNotNull("code");
        return this;
    }

    /**
     * <p>云机编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper codeIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper codeIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper codeNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper codeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("code",values);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * 等于 = entity().getGroupCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeEq(){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null){
            eq("group_code",groupCode);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * 不等于 &lt;&gt; entity().getGroupCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeNe(){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null){
            ne("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * 大于 &gt; entity().getGroupCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeGt(){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null){
            gt("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * 大于等于 &gt;= entity().getGroupCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeGe(){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null){
            ge("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * 小于 &lt; entity().getGroupCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeLt(){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null){
            lt("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * 小于等于 &lt;= entity().getGroupCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeLe(){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null){
            le("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * BETWEEN  entity().getGroupCode() AND 值2
     * @param groupCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeBetween(String groupCodeEnd){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null && groupCodeEnd!=null){
            between("group_code",groupCode,groupCodeEnd);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * NOT BETWEEN  entity().getGroupCode() AND 值2
     * @param groupCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeNotBetween(String groupCodeEnd){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null && groupCodeEnd!=null){
            notBetween("group_code",groupCode,groupCodeEnd);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * BETWEEN  entity().getGroupCode() AND 值2
     * @param groupCodeStart       值1
     * @param groupCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeBetween(String groupCodeStart,String groupCodeEnd){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null && groupCodeEnd!=null){
            between("group_code",groupCodeStart,groupCodeEnd);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * NOT BETWEEN  entity().getGroupCode() AND 值2
     * @param groupCodeStart       值1
     * @param groupCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeNotBetween(String groupCodeStart,String groupCodeEnd){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null && groupCodeEnd!=null){
            notBetween("group_code",groupCodeStart,groupCodeEnd);
        }
        return this;
     }


    /**
     * <p>云机所属分组</p>
     * LIKE '%值%' entity().getGroupCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeLike(){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null){
            like("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * NOT LIKE '%值%' entity().getGroupCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeNotLike(){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null){
            notLike("group_code",groupCode);
        }
        return this;
     }


    /**
     * <p>云机所属分组</p>
     * LIKE '%值' entity().getGroupCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeLikeLeft(){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null){
            likeLeft("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * LIKE '值%' entity().getGroupCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeLikeRight(){
        String groupCode =entity().getGroupCode();
        if(groupCode!=null){
            likeRight("group_code",groupCode);
        }
        return this;
     }

/**
     * <p>云机所属分组</p>
     * 等于 =
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeEq(String groupCode){
        if(groupCode!=null){
            eq("group_code",groupCode);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * 不等于 &lt;&gt;
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeNe(String groupCode){
        if(groupCode!=null){
            ne("group_code",groupCode);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * 大于 &gt;
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeGt(String groupCode){
        if(groupCode!=null){
            gt("group_code",groupCode);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * 大于等于 &gt;=
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeGe(String groupCode){
        if(groupCode!=null){
            ge("group_code",groupCode);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * 小于 &lt;
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeLt(String groupCode){
        if(groupCode!=null){
            lt("group_code",groupCode);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * 小于等于 &lt;=
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeLe(String groupCode){
        if(groupCode!=null){
            le("group_code",groupCode);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * LIKE '%值%'
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeLike(String groupCode){
        if(groupCode!=null){
            like("group_code",groupCode);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * NOT LIKE '%值%'
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeNotLike(String groupCode){
        if(groupCode!=null){
            notLike("group_code",groupCode);
        }
        return this;
    }


    /**
     * <p>云机所属分组</p>
     * LIKE '%值'
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeLikeLeft(String groupCode){
        if(groupCode!=null){
            likeLeft("group_code",groupCode);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * LIKE '值%'
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeLikeRight(String groupCode){
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
    public BaiduDeviceUpdateEntityWrapper groupCodeIsNull(){
        isNull("group_code");
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeIsNotNull(){
        isNotNull("group_code");
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper groupCodeIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper groupCodeIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper groupCodeNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper groupCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("group_code",values);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * 等于 = entity().getIdcCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeEq(){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null){
            eq("idc_code",idcCode);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * 不等于 &lt;&gt; entity().getIdcCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeNe(){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null){
            ne("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * 大于 &gt; entity().getIdcCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeGt(){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null){
            gt("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * 大于等于 &gt;= entity().getIdcCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeGe(){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null){
            ge("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * 小于 &lt; entity().getIdcCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeLt(){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null){
            lt("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * 小于等于 &lt;= entity().getIdcCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeLe(){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null){
            le("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * BETWEEN  entity().getIdcCode() AND 值2
     * @param idcCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeBetween(String idcCodeEnd){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null && idcCodeEnd!=null){
            between("idc_code",idcCode,idcCodeEnd);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * NOT BETWEEN  entity().getIdcCode() AND 值2
     * @param idcCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeNotBetween(String idcCodeEnd){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null && idcCodeEnd!=null){
            notBetween("idc_code",idcCode,idcCodeEnd);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * BETWEEN  entity().getIdcCode() AND 值2
     * @param idcCodeStart       值1
     * @param idcCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeBetween(String idcCodeStart,String idcCodeEnd){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null && idcCodeEnd!=null){
            between("idc_code",idcCodeStart,idcCodeEnd);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * NOT BETWEEN  entity().getIdcCode() AND 值2
     * @param idcCodeStart       值1
     * @param idcCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeNotBetween(String idcCodeStart,String idcCodeEnd){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null && idcCodeEnd!=null){
            notBetween("idc_code",idcCodeStart,idcCodeEnd);
        }
        return this;
     }


    /**
     * <p>机房号</p>
     * LIKE '%值%' entity().getIdcCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeLike(){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null){
            like("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * NOT LIKE '%值%' entity().getIdcCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeNotLike(){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null){
            notLike("idc_code",idcCode);
        }
        return this;
     }


    /**
     * <p>机房号</p>
     * LIKE '%值' entity().getIdcCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeLikeLeft(){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null){
            likeLeft("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * LIKE '值%' entity().getIdcCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeLikeRight(){
        String idcCode =entity().getIdcCode();
        if(idcCode!=null){
            likeRight("idc_code",idcCode);
        }
        return this;
     }

/**
     * <p>机房号</p>
     * 等于 =
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeEq(String idcCode){
        if(idcCode!=null){
            eq("idc_code",idcCode);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * 不等于 &lt;&gt;
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeNe(String idcCode){
        if(idcCode!=null){
            ne("idc_code",idcCode);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * 大于 &gt;
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeGt(String idcCode){
        if(idcCode!=null){
            gt("idc_code",idcCode);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * 大于等于 &gt;=
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeGe(String idcCode){
        if(idcCode!=null){
            ge("idc_code",idcCode);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * 小于 &lt;
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeLt(String idcCode){
        if(idcCode!=null){
            lt("idc_code",idcCode);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * 小于等于 &lt;=
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeLe(String idcCode){
        if(idcCode!=null){
            le("idc_code",idcCode);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * LIKE '%值%'
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeLike(String idcCode){
        if(idcCode!=null){
            like("idc_code",idcCode);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * NOT LIKE '%值%'
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeNotLike(String idcCode){
        if(idcCode!=null){
            notLike("idc_code",idcCode);
        }
        return this;
    }


    /**
     * <p>机房号</p>
     * LIKE '%值'
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeLikeLeft(String idcCode){
        if(idcCode!=null){
            likeLeft("idc_code",idcCode);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * LIKE '值%'
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeLikeRight(String idcCode){
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
    public BaiduDeviceUpdateEntityWrapper idcCodeIsNull(){
        isNull("idc_code");
        return this;
    }

    /**
     * <p>机房号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeIsNotNull(){
        isNotNull("idc_code");
        return this;
    }

    /**
     * <p>机房号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper idcCodeIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper idcCodeIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper idcCodeNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper idcCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("idc_code",values);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * 等于 = entity().getImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdEq(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            eq("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * 不等于 &lt;&gt; entity().getImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdNe(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            ne("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * 大于 &gt; entity().getImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdGt(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            gt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * 大于等于 &gt;= entity().getImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdGe(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            ge("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * 小于 &lt; entity().getImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdLt(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            lt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * 小于等于 &lt;= entity().getImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdLe(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            le("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * BETWEEN  entity().getImageVersionId() AND 值2
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdBetween(String imageVersionIdEnd){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null && imageVersionIdEnd!=null){
            between("image_version_id",imageVersionId,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * NOT BETWEEN  entity().getImageVersionId() AND 值2
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdNotBetween(String imageVersionIdEnd){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null && imageVersionIdEnd!=null){
            notBetween("image_version_id",imageVersionId,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * BETWEEN  entity().getImageVersionId() AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdBetween(String imageVersionIdStart,String imageVersionIdEnd){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null && imageVersionIdEnd!=null){
            between("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * NOT BETWEEN  entity().getImageVersionId() AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdNotBetween(String imageVersionIdStart,String imageVersionIdEnd){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null && imageVersionIdEnd!=null){
            notBetween("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>当前镜像版本号</p>
     * LIKE '%值%' entity().getImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdLike(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            like("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * NOT LIKE '%值%' entity().getImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdNotLike(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            notLike("image_version_id",imageVersionId);
        }
        return this;
     }


    /**
     * <p>当前镜像版本号</p>
     * LIKE '%值' entity().getImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdLikeLeft(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            likeLeft("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * LIKE '值%' entity().getImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdLikeRight(){
        String imageVersionId =entity().getImageVersionId();
        if(imageVersionId!=null){
            likeRight("image_version_id",imageVersionId);
        }
        return this;
     }

/**
     * <p>当前镜像版本号</p>
     * 等于 =
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdEq(String imageVersionId){
        if(imageVersionId!=null){
            eq("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * 不等于 &lt;&gt;
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdNe(String imageVersionId){
        if(imageVersionId!=null){
            ne("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * 大于 &gt;
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdGt(String imageVersionId){
        if(imageVersionId!=null){
            gt("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * 大于等于 &gt;=
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdGe(String imageVersionId){
        if(imageVersionId!=null){
            ge("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * 小于 &lt;
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdLt(String imageVersionId){
        if(imageVersionId!=null){
            lt("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * 小于等于 &lt;=
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdLe(String imageVersionId){
        if(imageVersionId!=null){
            le("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * LIKE '%值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdLike(String imageVersionId){
        if(imageVersionId!=null){
            like("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * NOT LIKE '%值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdNotLike(String imageVersionId){
        if(imageVersionId!=null){
            notLike("image_version_id",imageVersionId);
        }
        return this;
    }


    /**
     * <p>当前镜像版本号</p>
     * LIKE '%值'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdLikeLeft(String imageVersionId){
        if(imageVersionId!=null){
            likeLeft("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * LIKE '值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdLikeRight(String imageVersionId){
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
    public BaiduDeviceUpdateEntityWrapper imageVersionIdIsNull(){
        isNull("image_version_id");
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdIsNotNull(){
        isNotNull("image_version_id");
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper imageVersionIdIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper imageVersionIdIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper imageVersionIdNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper imageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_version_id",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 等于 = entity().getLastResetTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeEq(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            eq("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 不等于 &lt;&gt; entity().getLastResetTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeNe(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            ne("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于 &gt; entity().getLastResetTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeGt(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            gt("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于等于 &gt;= entity().getLastResetTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeGe(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            ge("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于 &lt; entity().getLastResetTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeLt(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            lt("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于等于 &lt;= entity().getLastResetTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeLe(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            le("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * BETWEEN  entity().getLastResetTime() AND 值2
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeBetween(Date lastResetTimeEnd){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null && lastResetTimeEnd!=null){
            between("last_reset_time",lastResetTime,lastResetTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT BETWEEN  entity().getLastResetTime() AND 值2
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeNotBetween(Date lastResetTimeEnd){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null && lastResetTimeEnd!=null){
            notBetween("last_reset_time",lastResetTime,lastResetTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * BETWEEN  entity().getLastResetTime() AND 值2
     * @param lastResetTimeStart       值1
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null && lastResetTimeEnd!=null){
            between("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT BETWEEN  entity().getLastResetTime() AND 值2
     * @param lastResetTimeStart       值1
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeNotBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null && lastResetTimeEnd!=null){
            notBetween("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值%' entity().getLastResetTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeLike(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            like("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT LIKE '%值%' entity().getLastResetTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeNotLike(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            notLike("last_reset_time",lastResetTime);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值' entity().getLastResetTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeLikeLeft(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            likeLeft("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * LIKE '值%' entity().getLastResetTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeLikeRight(){
        Date lastResetTime =entity().getLastResetTime();
        if(lastResetTime!=null){
            likeRight("last_reset_time",lastResetTime);
        }
        return this;
     }

/**
     * <p>最后一次重置时间</p>
     * 等于 =
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeEq(Date lastResetTime){
        if(lastResetTime!=null){
            eq("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 不等于 &lt;&gt;
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeNe(Date lastResetTime){
        if(lastResetTime!=null){
            ne("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 大于 &gt;
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeGt(Date lastResetTime){
        if(lastResetTime!=null){
            gt("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 大于等于 &gt;=
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeGe(Date lastResetTime){
        if(lastResetTime!=null){
            ge("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 小于 &lt;
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeLt(Date lastResetTime){
        if(lastResetTime!=null){
            lt("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 小于等于 &lt;=
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeLe(Date lastResetTime){
        if(lastResetTime!=null){
            le("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值%'
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeLike(Date lastResetTime){
        if(lastResetTime!=null){
            like("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * NOT LIKE '%值%'
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeNotLike(Date lastResetTime){
        if(lastResetTime!=null){
            notLike("last_reset_time",lastResetTime);
        }
        return this;
    }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值'
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeLikeLeft(Date lastResetTime){
        if(lastResetTime!=null){
            likeLeft("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * LIKE '值%'
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeLikeRight(Date lastResetTime){
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
    public BaiduDeviceUpdateEntityWrapper lastResetTimeIsNull(){
        isNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeIsNotNull(){
        isNotNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastResetTimeIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper lastResetTimeIn(Date... values){
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
    public BaiduDeviceUpdateEntityWrapper lastResetTimeNotIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper lastResetTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_reset_time",values);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 等于 = entity().getResetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusEq(){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null){
            eq("reset_status",resetStatus);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 不等于 &lt;&gt; entity().getResetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusNe(){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null){
            ne("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 大于 &gt; entity().getResetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusGt(){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null){
            gt("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 大于等于 &gt;= entity().getResetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusGe(){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null){
            ge("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 小于 &lt; entity().getResetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusLt(){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null){
            lt("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 小于等于 &lt;= entity().getResetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusLe(){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null){
            le("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * BETWEEN  entity().getResetStatus() AND 值2
     * @param resetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusBetween(Integer resetStatusEnd){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null && resetStatusEnd!=null){
            between("reset_status",resetStatus,resetStatusEnd);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * NOT BETWEEN  entity().getResetStatus() AND 值2
     * @param resetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusNotBetween(Integer resetStatusEnd){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null && resetStatusEnd!=null){
            notBetween("reset_status",resetStatus,resetStatusEnd);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * BETWEEN  entity().getResetStatus() AND 值2
     * @param resetStatusStart       值1
     * @param resetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusBetween(Integer resetStatusStart,Integer resetStatusEnd){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null && resetStatusEnd!=null){
            between("reset_status",resetStatusStart,resetStatusEnd);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * NOT BETWEEN  entity().getResetStatus() AND 值2
     * @param resetStatusStart       值1
     * @param resetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusNotBetween(Integer resetStatusStart,Integer resetStatusEnd){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null && resetStatusEnd!=null){
            notBetween("reset_status",resetStatusStart,resetStatusEnd);
        }
        return this;
     }


    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * LIKE '%值%' entity().getResetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusLike(){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null){
            like("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * NOT LIKE '%值%' entity().getResetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusNotLike(){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null){
            notLike("reset_status",resetStatus);
        }
        return this;
     }


    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * LIKE '%值' entity().getResetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusLikeLeft(){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null){
            likeLeft("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * LIKE '值%' entity().getResetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusLikeRight(){
        Integer resetStatus =entity().getResetStatus();
        if(resetStatus!=null){
            likeRight("reset_status",resetStatus);
        }
        return this;
     }

/**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 等于 =
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusEq(Integer resetStatus){
        if(resetStatus!=null){
            eq("reset_status",resetStatus);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 不等于 &lt;&gt;
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusNe(Integer resetStatus){
        if(resetStatus!=null){
            ne("reset_status",resetStatus);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 大于 &gt;
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusGt(Integer resetStatus){
        if(resetStatus!=null){
            gt("reset_status",resetStatus);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 大于等于 &gt;=
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusGe(Integer resetStatus){
        if(resetStatus!=null){
            ge("reset_status",resetStatus);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 小于 &lt;
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusLt(Integer resetStatus){
        if(resetStatus!=null){
            lt("reset_status",resetStatus);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 小于等于 &lt;=
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusLe(Integer resetStatus){
        if(resetStatus!=null){
            le("reset_status",resetStatus);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * LIKE '%值%'
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusLike(Integer resetStatus){
        if(resetStatus!=null){
            like("reset_status",resetStatus);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * NOT LIKE '%值%'
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusNotLike(Integer resetStatus){
        if(resetStatus!=null){
            notLike("reset_status",resetStatus);
        }
        return this;
    }


    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * LIKE '%值'
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusLikeLeft(Integer resetStatus){
        if(resetStatus!=null){
            likeLeft("reset_status",resetStatus);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * LIKE '值%'
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusLikeRight(Integer resetStatus){
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
    public BaiduDeviceUpdateEntityWrapper resetStatusIsNull(){
        isNull("reset_status");
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusIsNotNull(){
        isNotNull("reset_status");
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetStatusIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper resetStatusIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper resetStatusNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper resetStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("reset_status",values);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 等于 = entity().getResetImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdEq(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            eq("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 不等于 &lt;&gt; entity().getResetImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdNe(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            ne("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 大于 &gt; entity().getResetImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdGt(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            gt("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 大于等于 &gt;= entity().getResetImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdGe(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            ge("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 小于 &lt; entity().getResetImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdLt(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            lt("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 小于等于 &lt;= entity().getResetImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdLe(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            le("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * BETWEEN  entity().getResetImageVersionId() AND 值2
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdBetween(String resetImageVersionIdEnd){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null && resetImageVersionIdEnd!=null){
            between("reset_image_version_id",resetImageVersionId,resetImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * NOT BETWEEN  entity().getResetImageVersionId() AND 值2
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdNotBetween(String resetImageVersionIdEnd){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null && resetImageVersionIdEnd!=null){
            notBetween("reset_image_version_id",resetImageVersionId,resetImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * BETWEEN  entity().getResetImageVersionId() AND 值2
     * @param resetImageVersionIdStart       值1
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdBetween(String resetImageVersionIdStart,String resetImageVersionIdEnd){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null && resetImageVersionIdEnd!=null){
            between("reset_image_version_id",resetImageVersionIdStart,resetImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * NOT BETWEEN  entity().getResetImageVersionId() AND 值2
     * @param resetImageVersionIdStart       值1
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdNotBetween(String resetImageVersionIdStart,String resetImageVersionIdEnd){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null && resetImageVersionIdEnd!=null){
            notBetween("reset_image_version_id",resetImageVersionIdStart,resetImageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * LIKE '%值%' entity().getResetImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdLike(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            like("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * NOT LIKE '%值%' entity().getResetImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdNotLike(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            notLike("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * LIKE '%值' entity().getResetImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdLikeLeft(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            likeLeft("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * LIKE '值%' entity().getResetImageVersionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdLikeRight(){
        String resetImageVersionId =entity().getResetImageVersionId();
        if(resetImageVersionId!=null){
            likeRight("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

/**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 等于 =
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdEq(String resetImageVersionId){
        if(resetImageVersionId!=null){
            eq("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 不等于 &lt;&gt;
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdNe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            ne("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 大于 &gt;
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdGt(String resetImageVersionId){
        if(resetImageVersionId!=null){
            gt("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 大于等于 &gt;=
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdGe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            ge("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 小于 &lt;
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdLt(String resetImageVersionId){
        if(resetImageVersionId!=null){
            lt("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 小于等于 &lt;=
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdLe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            le("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * LIKE '%值%'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdLike(String resetImageVersionId){
        if(resetImageVersionId!=null){
            like("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * NOT LIKE '%值%'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdNotLike(String resetImageVersionId){
        if(resetImageVersionId!=null){
            notLike("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }


    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * LIKE '%值'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdLikeLeft(String resetImageVersionId){
        if(resetImageVersionId!=null){
            likeLeft("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * LIKE '值%'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdLikeRight(String resetImageVersionId){
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
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdIsNull(){
        isNull("reset_image_version_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdIsNotNull(){
        isNotNull("reset_image_version_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper resetImageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_image_version_id",values);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * 等于 = entity().getOrderCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeEq(){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null){
            eq("order_code",orderCode);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * 不等于 &lt;&gt; entity().getOrderCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeNe(){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null){
            ne("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * 大于 &gt; entity().getOrderCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeGt(){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null){
            gt("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * 大于等于 &gt;= entity().getOrderCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeGe(){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null){
            ge("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * 小于 &lt; entity().getOrderCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeLt(){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null){
            lt("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * 小于等于 &lt;= entity().getOrderCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeLe(){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null){
            le("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * BETWEEN  entity().getOrderCode() AND 值2
     * @param orderCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeBetween(String orderCodeEnd){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null && orderCodeEnd!=null){
            between("order_code",orderCode,orderCodeEnd);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * NOT BETWEEN  entity().getOrderCode() AND 值2
     * @param orderCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeNotBetween(String orderCodeEnd){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null && orderCodeEnd!=null){
            notBetween("order_code",orderCode,orderCodeEnd);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * BETWEEN  entity().getOrderCode() AND 值2
     * @param orderCodeStart       值1
     * @param orderCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeBetween(String orderCodeStart,String orderCodeEnd){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null && orderCodeEnd!=null){
            between("order_code",orderCodeStart,orderCodeEnd);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * NOT BETWEEN  entity().getOrderCode() AND 值2
     * @param orderCodeStart       值1
     * @param orderCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeNotBetween(String orderCodeStart,String orderCodeEnd){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null && orderCodeEnd!=null){
            notBetween("order_code",orderCodeStart,orderCodeEnd);
        }
        return this;
     }


    /**
     * <p>交付的订单编号</p>
     * LIKE '%值%' entity().getOrderCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeLike(){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null){
            like("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * NOT LIKE '%值%' entity().getOrderCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeNotLike(){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null){
            notLike("order_code",orderCode);
        }
        return this;
     }


    /**
     * <p>交付的订单编号</p>
     * LIKE '%值' entity().getOrderCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeLikeLeft(){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null){
            likeLeft("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * LIKE '值%' entity().getOrderCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeLikeRight(){
        String orderCode =entity().getOrderCode();
        if(orderCode!=null){
            likeRight("order_code",orderCode);
        }
        return this;
     }

/**
     * <p>交付的订单编号</p>
     * 等于 =
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeEq(String orderCode){
        if(orderCode!=null){
            eq("order_code",orderCode);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * 不等于 &lt;&gt;
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeNe(String orderCode){
        if(orderCode!=null){
            ne("order_code",orderCode);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * 大于 &gt;
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeGt(String orderCode){
        if(orderCode!=null){
            gt("order_code",orderCode);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * 大于等于 &gt;=
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeGe(String orderCode){
        if(orderCode!=null){
            ge("order_code",orderCode);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * 小于 &lt;
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeLt(String orderCode){
        if(orderCode!=null){
            lt("order_code",orderCode);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * 小于等于 &lt;=
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeLe(String orderCode){
        if(orderCode!=null){
            le("order_code",orderCode);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * LIKE '%值%'
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeLike(String orderCode){
        if(orderCode!=null){
            like("order_code",orderCode);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * NOT LIKE '%值%'
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeNotLike(String orderCode){
        if(orderCode!=null){
            notLike("order_code",orderCode);
        }
        return this;
    }


    /**
     * <p>交付的订单编号</p>
     * LIKE '%值'
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeLikeLeft(String orderCode){
        if(orderCode!=null){
            likeLeft("order_code",orderCode);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * LIKE '值%'
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeLikeRight(String orderCode){
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
    public BaiduDeviceUpdateEntityWrapper orderCodeIsNull(){
        isNull("order_code");
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeIsNotNull(){
        isNotNull("order_code");
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper orderCodeIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper orderCodeIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper orderCodeNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper orderCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("order_code",values);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * 等于 = entity().getDeliverDay()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayEq(){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null){
            eq("deliver_day",deliverDay);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * 不等于 &lt;&gt; entity().getDeliverDay()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayNe(){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null){
            ne("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * 大于 &gt; entity().getDeliverDay()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayGt(){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null){
            gt("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * 大于等于 &gt;= entity().getDeliverDay()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayGe(){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null){
            ge("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * 小于 &lt; entity().getDeliverDay()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayLt(){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null){
            lt("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * 小于等于 &lt;= entity().getDeliverDay()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayLe(){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null){
            le("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * BETWEEN  entity().getDeliverDay() AND 值2
     * @param deliverDayEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayBetween(String deliverDayEnd){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null && deliverDayEnd!=null){
            between("deliver_day",deliverDay,deliverDayEnd);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * NOT BETWEEN  entity().getDeliverDay() AND 值2
     * @param deliverDayEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayNotBetween(String deliverDayEnd){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null && deliverDayEnd!=null){
            notBetween("deliver_day",deliverDay,deliverDayEnd);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * BETWEEN  entity().getDeliverDay() AND 值2
     * @param deliverDayStart       值1
     * @param deliverDayEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayBetween(String deliverDayStart,String deliverDayEnd){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null && deliverDayEnd!=null){
            between("deliver_day",deliverDayStart,deliverDayEnd);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * NOT BETWEEN  entity().getDeliverDay() AND 值2
     * @param deliverDayStart       值1
     * @param deliverDayEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayNotBetween(String deliverDayStart,String deliverDayEnd){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null && deliverDayEnd!=null){
            notBetween("deliver_day",deliverDayStart,deliverDayEnd);
        }
        return this;
     }


    /**
     * <p>交付日期的备注</p>
     * LIKE '%值%' entity().getDeliverDay()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayLike(){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null){
            like("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * NOT LIKE '%值%' entity().getDeliverDay()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayNotLike(){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null){
            notLike("deliver_day",deliverDay);
        }
        return this;
     }


    /**
     * <p>交付日期的备注</p>
     * LIKE '%值' entity().getDeliverDay()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayLikeLeft(){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null){
            likeLeft("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * LIKE '值%' entity().getDeliverDay()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayLikeRight(){
        String deliverDay =entity().getDeliverDay();
        if(deliverDay!=null){
            likeRight("deliver_day",deliverDay);
        }
        return this;
     }

/**
     * <p>交付日期的备注</p>
     * 等于 =
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayEq(String deliverDay){
        if(deliverDay!=null){
            eq("deliver_day",deliverDay);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * 不等于 &lt;&gt;
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayNe(String deliverDay){
        if(deliverDay!=null){
            ne("deliver_day",deliverDay);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * 大于 &gt;
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayGt(String deliverDay){
        if(deliverDay!=null){
            gt("deliver_day",deliverDay);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * 大于等于 &gt;=
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayGe(String deliverDay){
        if(deliverDay!=null){
            ge("deliver_day",deliverDay);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * 小于 &lt;
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayLt(String deliverDay){
        if(deliverDay!=null){
            lt("deliver_day",deliverDay);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * 小于等于 &lt;=
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayLe(String deliverDay){
        if(deliverDay!=null){
            le("deliver_day",deliverDay);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * LIKE '%值%'
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayLike(String deliverDay){
        if(deliverDay!=null){
            like("deliver_day",deliverDay);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * NOT LIKE '%值%'
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayNotLike(String deliverDay){
        if(deliverDay!=null){
            notLike("deliver_day",deliverDay);
        }
        return this;
    }


    /**
     * <p>交付日期的备注</p>
     * LIKE '%值'
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayLikeLeft(String deliverDay){
        if(deliverDay!=null){
            likeLeft("deliver_day",deliverDay);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * LIKE '值%'
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayLikeRight(String deliverDay){
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
    public BaiduDeviceUpdateEntityWrapper deliverDayIsNull(){
        isNull("deliver_day");
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayIsNotNull(){
        isNotNull("deliver_day");
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deliverDayIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper deliverDayIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper deliverDayNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper deliverDayNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("deliver_day",values);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * 等于 = entity().getOldCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeEq(){
        String oldCode =entity().getOldCode();
        if(oldCode!=null){
            eq("old_code",oldCode);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * 不等于 &lt;&gt; entity().getOldCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeNe(){
        String oldCode =entity().getOldCode();
        if(oldCode!=null){
            ne("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * 大于 &gt; entity().getOldCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeGt(){
        String oldCode =entity().getOldCode();
        if(oldCode!=null){
            gt("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * 大于等于 &gt;= entity().getOldCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeGe(){
        String oldCode =entity().getOldCode();
        if(oldCode!=null){
            ge("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * 小于 &lt; entity().getOldCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeLt(){
        String oldCode =entity().getOldCode();
        if(oldCode!=null){
            lt("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * 小于等于 &lt;= entity().getOldCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeLe(){
        String oldCode =entity().getOldCode();
        if(oldCode!=null){
            le("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * BETWEEN  entity().getOldCode() AND 值2
     * @param oldCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeBetween(String oldCodeEnd){
        String oldCode =entity().getOldCode();
        if(oldCode!=null && oldCodeEnd!=null){
            between("old_code",oldCode,oldCodeEnd);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * NOT BETWEEN  entity().getOldCode() AND 值2
     * @param oldCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeNotBetween(String oldCodeEnd){
        String oldCode =entity().getOldCode();
        if(oldCode!=null && oldCodeEnd!=null){
            notBetween("old_code",oldCode,oldCodeEnd);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * BETWEEN  entity().getOldCode() AND 值2
     * @param oldCodeStart       值1
     * @param oldCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeBetween(String oldCodeStart,String oldCodeEnd){
        String oldCode =entity().getOldCode();
        if(oldCode!=null && oldCodeEnd!=null){
            between("old_code",oldCodeStart,oldCodeEnd);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * NOT BETWEEN  entity().getOldCode() AND 值2
     * @param oldCodeStart       值1
     * @param oldCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeNotBetween(String oldCodeStart,String oldCodeEnd){
        String oldCode =entity().getOldCode();
        if(oldCode!=null && oldCodeEnd!=null){
            notBetween("old_code",oldCodeStart,oldCodeEnd);
        }
        return this;
     }


    /**
     * <p>在营销云1.0中的编号</p>
     * LIKE '%值%' entity().getOldCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeLike(){
        String oldCode =entity().getOldCode();
        if(oldCode!=null){
            like("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * NOT LIKE '%值%' entity().getOldCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeNotLike(){
        String oldCode =entity().getOldCode();
        if(oldCode!=null){
            notLike("old_code",oldCode);
        }
        return this;
     }


    /**
     * <p>在营销云1.0中的编号</p>
     * LIKE '%值' entity().getOldCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeLikeLeft(){
        String oldCode =entity().getOldCode();
        if(oldCode!=null){
            likeLeft("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * LIKE '值%' entity().getOldCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeLikeRight(){
        String oldCode =entity().getOldCode();
        if(oldCode!=null){
            likeRight("old_code",oldCode);
        }
        return this;
     }

/**
     * <p>在营销云1.0中的编号</p>
     * 等于 =
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeEq(String oldCode){
        if(oldCode!=null){
            eq("old_code",oldCode);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * 不等于 &lt;&gt;
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeNe(String oldCode){
        if(oldCode!=null){
            ne("old_code",oldCode);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * 大于 &gt;
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeGt(String oldCode){
        if(oldCode!=null){
            gt("old_code",oldCode);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * 大于等于 &gt;=
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeGe(String oldCode){
        if(oldCode!=null){
            ge("old_code",oldCode);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * 小于 &lt;
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeLt(String oldCode){
        if(oldCode!=null){
            lt("old_code",oldCode);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * 小于等于 &lt;=
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeLe(String oldCode){
        if(oldCode!=null){
            le("old_code",oldCode);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * LIKE '%值%'
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeLike(String oldCode){
        if(oldCode!=null){
            like("old_code",oldCode);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * NOT LIKE '%值%'
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeNotLike(String oldCode){
        if(oldCode!=null){
            notLike("old_code",oldCode);
        }
        return this;
    }


    /**
     * <p>在营销云1.0中的编号</p>
     * LIKE '%值'
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeLikeLeft(String oldCode){
        if(oldCode!=null){
            likeLeft("old_code",oldCode);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * LIKE '值%'
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeLikeRight(String oldCode){
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
    public BaiduDeviceUpdateEntityWrapper oldCodeIsNull(){
        isNull("old_code");
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeIsNotNull(){
        isNotNull("old_code");
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper oldCodeIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper oldCodeIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper oldCodeNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper oldCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("old_code",values);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * 等于 = entity().getSn()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snEq(){
        String sn =entity().getSn();
        if(sn!=null){
            eq("sn",sn);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * 不等于 &lt;&gt; entity().getSn()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snNe(){
        String sn =entity().getSn();
        if(sn!=null){
            ne("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * 大于 &gt; entity().getSn()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snGt(){
        String sn =entity().getSn();
        if(sn!=null){
            gt("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * 大于等于 &gt;= entity().getSn()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snGe(){
        String sn =entity().getSn();
        if(sn!=null){
            ge("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * 小于 &lt; entity().getSn()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snLt(){
        String sn =entity().getSn();
        if(sn!=null){
            lt("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * 小于等于 &lt;= entity().getSn()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snLe(){
        String sn =entity().getSn();
        if(sn!=null){
            le("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * BETWEEN  entity().getSn() AND 值2
     * @param snEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snBetween(String snEnd){
        String sn =entity().getSn();
        if(sn!=null && snEnd!=null){
            between("sn",sn,snEnd);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * NOT BETWEEN  entity().getSn() AND 值2
     * @param snEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snNotBetween(String snEnd){
        String sn =entity().getSn();
        if(sn!=null && snEnd!=null){
            notBetween("sn",sn,snEnd);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * BETWEEN  entity().getSn() AND 值2
     * @param snStart       值1
     * @param snEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snBetween(String snStart,String snEnd){
        String sn =entity().getSn();
        if(sn!=null && snEnd!=null){
            between("sn",snStart,snEnd);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * NOT BETWEEN  entity().getSn() AND 值2
     * @param snStart       值1
     * @param snEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snNotBetween(String snStart,String snEnd){
        String sn =entity().getSn();
        if(sn!=null && snEnd!=null){
            notBetween("sn",snStart,snEnd);
        }
        return this;
     }


    /**
     * <p>在物理机上的多开序号</p>
     * LIKE '%值%' entity().getSn()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snLike(){
        String sn =entity().getSn();
        if(sn!=null){
            like("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * NOT LIKE '%值%' entity().getSn()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snNotLike(){
        String sn =entity().getSn();
        if(sn!=null){
            notLike("sn",sn);
        }
        return this;
     }


    /**
     * <p>在物理机上的多开序号</p>
     * LIKE '%值' entity().getSn()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snLikeLeft(){
        String sn =entity().getSn();
        if(sn!=null){
            likeLeft("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * LIKE '值%' entity().getSn()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snLikeRight(){
        String sn =entity().getSn();
        if(sn!=null){
            likeRight("sn",sn);
        }
        return this;
     }

/**
     * <p>在物理机上的多开序号</p>
     * 等于 =
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snEq(String sn){
        if(sn!=null){
            eq("sn",sn);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * 不等于 &lt;&gt;
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snNe(String sn){
        if(sn!=null){
            ne("sn",sn);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * 大于 &gt;
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snGt(String sn){
        if(sn!=null){
            gt("sn",sn);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * 大于等于 &gt;=
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snGe(String sn){
        if(sn!=null){
            ge("sn",sn);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * 小于 &lt;
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snLt(String sn){
        if(sn!=null){
            lt("sn",sn);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * 小于等于 &lt;=
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snLe(String sn){
        if(sn!=null){
            le("sn",sn);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * LIKE '%值%'
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snLike(String sn){
        if(sn!=null){
            like("sn",sn);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * NOT LIKE '%值%'
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snNotLike(String sn){
        if(sn!=null){
            notLike("sn",sn);
        }
        return this;
    }


    /**
     * <p>在物理机上的多开序号</p>
     * LIKE '%值'
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snLikeLeft(String sn){
        if(sn!=null){
            likeLeft("sn",sn);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * LIKE '值%'
     * @param sn       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snLikeRight(String sn){
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
    public BaiduDeviceUpdateEntityWrapper snIsNull(){
        isNull("sn");
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snIsNotNull(){
        isNotNull("sn");
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper snIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper snIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper snNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper snNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("sn",values);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * 等于 = entity().getIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipEq(){
        String ip =entity().getIp();
        if(ip!=null){
            eq("ip",ip);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * 不等于 &lt;&gt; entity().getIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipNe(){
        String ip =entity().getIp();
        if(ip!=null){
            ne("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * 大于 &gt; entity().getIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipGt(){
        String ip =entity().getIp();
        if(ip!=null){
            gt("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * 大于等于 &gt;= entity().getIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipGe(){
        String ip =entity().getIp();
        if(ip!=null){
            ge("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * 小于 &lt; entity().getIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipLt(){
        String ip =entity().getIp();
        if(ip!=null){
            lt("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * 小于等于 &lt;= entity().getIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipLe(){
        String ip =entity().getIp();
        if(ip!=null){
            le("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * BETWEEN  entity().getIp() AND 值2
     * @param ipEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipBetween(String ipEnd){
        String ip =entity().getIp();
        if(ip!=null && ipEnd!=null){
            between("ip",ip,ipEnd);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * NOT BETWEEN  entity().getIp() AND 值2
     * @param ipEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipNotBetween(String ipEnd){
        String ip =entity().getIp();
        if(ip!=null && ipEnd!=null){
            notBetween("ip",ip,ipEnd);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * BETWEEN  entity().getIp() AND 值2
     * @param ipStart       值1
     * @param ipEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipBetween(String ipStart,String ipEnd){
        String ip =entity().getIp();
        if(ip!=null && ipEnd!=null){
            between("ip",ipStart,ipEnd);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * NOT BETWEEN  entity().getIp() AND 值2
     * @param ipStart       值1
     * @param ipEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipNotBetween(String ipStart,String ipEnd){
        String ip =entity().getIp();
        if(ip!=null && ipEnd!=null){
            notBetween("ip",ipStart,ipEnd);
        }
        return this;
     }


    /**
     * <p>云机的虚拟ip</p>
     * LIKE '%值%' entity().getIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipLike(){
        String ip =entity().getIp();
        if(ip!=null){
            like("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * NOT LIKE '%值%' entity().getIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipNotLike(){
        String ip =entity().getIp();
        if(ip!=null){
            notLike("ip",ip);
        }
        return this;
     }


    /**
     * <p>云机的虚拟ip</p>
     * LIKE '%值' entity().getIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipLikeLeft(){
        String ip =entity().getIp();
        if(ip!=null){
            likeLeft("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * LIKE '值%' entity().getIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipLikeRight(){
        String ip =entity().getIp();
        if(ip!=null){
            likeRight("ip",ip);
        }
        return this;
     }

/**
     * <p>云机的虚拟ip</p>
     * 等于 =
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipEq(String ip){
        if(ip!=null){
            eq("ip",ip);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * 不等于 &lt;&gt;
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipNe(String ip){
        if(ip!=null){
            ne("ip",ip);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * 大于 &gt;
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipGt(String ip){
        if(ip!=null){
            gt("ip",ip);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * 大于等于 &gt;=
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipGe(String ip){
        if(ip!=null){
            ge("ip",ip);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * 小于 &lt;
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipLt(String ip){
        if(ip!=null){
            lt("ip",ip);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * 小于等于 &lt;=
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipLe(String ip){
        if(ip!=null){
            le("ip",ip);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * LIKE '%值%'
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipLike(String ip){
        if(ip!=null){
            like("ip",ip);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * NOT LIKE '%值%'
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipNotLike(String ip){
        if(ip!=null){
            notLike("ip",ip);
        }
        return this;
    }


    /**
     * <p>云机的虚拟ip</p>
     * LIKE '%值'
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipLikeLeft(String ip){
        if(ip!=null){
            likeLeft("ip",ip);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * LIKE '值%'
     * @param ip       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipLikeRight(String ip){
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
    public BaiduDeviceUpdateEntityWrapper ipIsNull(){
        isNull("ip");
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipIsNotNull(){
        isNotNull("ip");
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper ipIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper ipIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper ipNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper ipNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("ip",values);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * 等于 = entity().getPaas()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasEq(){
        String paas =entity().getPaas();
        if(paas!=null){
            eq("paas",paas);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * 不等于 &lt;&gt; entity().getPaas()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasNe(){
        String paas =entity().getPaas();
        if(paas!=null){
            ne("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * 大于 &gt; entity().getPaas()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasGt(){
        String paas =entity().getPaas();
        if(paas!=null){
            gt("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * 大于等于 &gt;= entity().getPaas()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasGe(){
        String paas =entity().getPaas();
        if(paas!=null){
            ge("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * 小于 &lt; entity().getPaas()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasLt(){
        String paas =entity().getPaas();
        if(paas!=null){
            lt("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * 小于等于 &lt;= entity().getPaas()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasLe(){
        String paas =entity().getPaas();
        if(paas!=null){
            le("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * BETWEEN  entity().getPaas() AND 值2
     * @param paasEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasBetween(String paasEnd){
        String paas =entity().getPaas();
        if(paas!=null && paasEnd!=null){
            between("paas",paas,paasEnd);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * NOT BETWEEN  entity().getPaas() AND 值2
     * @param paasEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasNotBetween(String paasEnd){
        String paas =entity().getPaas();
        if(paas!=null && paasEnd!=null){
            notBetween("paas",paas,paasEnd);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * BETWEEN  entity().getPaas() AND 值2
     * @param paasStart       值1
     * @param paasEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasBetween(String paasStart,String paasEnd){
        String paas =entity().getPaas();
        if(paas!=null && paasEnd!=null){
            between("paas",paasStart,paasEnd);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * NOT BETWEEN  entity().getPaas() AND 值2
     * @param paasStart       值1
     * @param paasEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasNotBetween(String paasStart,String paasEnd){
        String paas =entity().getPaas();
        if(paas!=null && paasEnd!=null){
            notBetween("paas",paasStart,paasEnd);
        }
        return this;
     }


    /**
     * <p>底层paas标记</p>
     * LIKE '%值%' entity().getPaas()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasLike(){
        String paas =entity().getPaas();
        if(paas!=null){
            like("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * NOT LIKE '%值%' entity().getPaas()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasNotLike(){
        String paas =entity().getPaas();
        if(paas!=null){
            notLike("paas",paas);
        }
        return this;
     }


    /**
     * <p>底层paas标记</p>
     * LIKE '%值' entity().getPaas()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasLikeLeft(){
        String paas =entity().getPaas();
        if(paas!=null){
            likeLeft("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * LIKE '值%' entity().getPaas()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasLikeRight(){
        String paas =entity().getPaas();
        if(paas!=null){
            likeRight("paas",paas);
        }
        return this;
     }

/**
     * <p>底层paas标记</p>
     * 等于 =
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasEq(String paas){
        if(paas!=null){
            eq("paas",paas);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * 不等于 &lt;&gt;
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasNe(String paas){
        if(paas!=null){
            ne("paas",paas);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * 大于 &gt;
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasGt(String paas){
        if(paas!=null){
            gt("paas",paas);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * 大于等于 &gt;=
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasGe(String paas){
        if(paas!=null){
            ge("paas",paas);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * 小于 &lt;
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasLt(String paas){
        if(paas!=null){
            lt("paas",paas);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * 小于等于 &lt;=
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasLe(String paas){
        if(paas!=null){
            le("paas",paas);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * LIKE '%值%'
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasLike(String paas){
        if(paas!=null){
            like("paas",paas);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * NOT LIKE '%值%'
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasNotLike(String paas){
        if(paas!=null){
            notLike("paas",paas);
        }
        return this;
    }


    /**
     * <p>底层paas标记</p>
     * LIKE '%值'
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasLikeLeft(String paas){
        if(paas!=null){
            likeLeft("paas",paas);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * LIKE '值%'
     * @param paas       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasLikeRight(String paas){
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
    public BaiduDeviceUpdateEntityWrapper paasIsNull(){
        isNull("paas");
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasIsNotNull(){
        isNotNull("paas");
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper paasIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper paasIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper paasNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper paasNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("paas",values);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * 等于 = entity().getDeviceCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeEq(){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null){
            eq("device_code",deviceCode);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * 不等于 &lt;&gt; entity().getDeviceCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeNe(){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null){
            ne("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * 大于 &gt; entity().getDeviceCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeGt(){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null){
            gt("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * 大于等于 &gt;= entity().getDeviceCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeGe(){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null){
            ge("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * 小于 &lt; entity().getDeviceCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeLt(){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null){
            lt("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * 小于等于 &lt;= entity().getDeviceCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeLe(){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null){
            le("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * BETWEEN  entity().getDeviceCode() AND 值2
     * @param deviceCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeBetween(String deviceCodeEnd){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null && deviceCodeEnd!=null){
            between("device_code",deviceCode,deviceCodeEnd);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * NOT BETWEEN  entity().getDeviceCode() AND 值2
     * @param deviceCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeNotBetween(String deviceCodeEnd){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null && deviceCodeEnd!=null){
            notBetween("device_code",deviceCode,deviceCodeEnd);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * BETWEEN  entity().getDeviceCode() AND 值2
     * @param deviceCodeStart       值1
     * @param deviceCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeBetween(String deviceCodeStart,String deviceCodeEnd){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null && deviceCodeEnd!=null){
            between("device_code",deviceCodeStart,deviceCodeEnd);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * NOT BETWEEN  entity().getDeviceCode() AND 值2
     * @param deviceCodeStart       值1
     * @param deviceCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeNotBetween(String deviceCodeStart,String deviceCodeEnd){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null && deviceCodeEnd!=null){
            notBetween("device_code",deviceCodeStart,deviceCodeEnd);
        }
        return this;
     }


    /**
     * <p>物理机的code</p>
     * LIKE '%值%' entity().getDeviceCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeLike(){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null){
            like("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * NOT LIKE '%值%' entity().getDeviceCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeNotLike(){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null){
            notLike("device_code",deviceCode);
        }
        return this;
     }


    /**
     * <p>物理机的code</p>
     * LIKE '%值' entity().getDeviceCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeLikeLeft(){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null){
            likeLeft("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * LIKE '值%' entity().getDeviceCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeLikeRight(){
        String deviceCode =entity().getDeviceCode();
        if(deviceCode!=null){
            likeRight("device_code",deviceCode);
        }
        return this;
     }

/**
     * <p>物理机的code</p>
     * 等于 =
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeEq(String deviceCode){
        if(deviceCode!=null){
            eq("device_code",deviceCode);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * 不等于 &lt;&gt;
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeNe(String deviceCode){
        if(deviceCode!=null){
            ne("device_code",deviceCode);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * 大于 &gt;
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeGt(String deviceCode){
        if(deviceCode!=null){
            gt("device_code",deviceCode);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * 大于等于 &gt;=
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeGe(String deviceCode){
        if(deviceCode!=null){
            ge("device_code",deviceCode);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * 小于 &lt;
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeLt(String deviceCode){
        if(deviceCode!=null){
            lt("device_code",deviceCode);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * 小于等于 &lt;=
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeLe(String deviceCode){
        if(deviceCode!=null){
            le("device_code",deviceCode);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * LIKE '%值%'
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeLike(String deviceCode){
        if(deviceCode!=null){
            like("device_code",deviceCode);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * NOT LIKE '%值%'
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeNotLike(String deviceCode){
        if(deviceCode!=null){
            notLike("device_code",deviceCode);
        }
        return this;
    }


    /**
     * <p>物理机的code</p>
     * LIKE '%值'
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeLikeLeft(String deviceCode){
        if(deviceCode!=null){
            likeLeft("device_code",deviceCode);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * LIKE '值%'
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeLikeRight(String deviceCode){
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
    public BaiduDeviceUpdateEntityWrapper deviceCodeIsNull(){
        isNull("device_code");
        return this;
    }

    /**
     * <p>物理机的code</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeIsNotNull(){
        isNotNull("device_code");
        return this;
    }

    /**
     * <p>物理机的code</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceCodeIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper deviceCodeIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper deviceCodeNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper deviceCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_code",values);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * 等于 = entity().getDeviceIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpEq(){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null){
            eq("device_ip",deviceIp);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * 不等于 &lt;&gt; entity().getDeviceIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpNe(){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null){
            ne("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * 大于 &gt; entity().getDeviceIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpGt(){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null){
            gt("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * 大于等于 &gt;= entity().getDeviceIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpGe(){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null){
            ge("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * 小于 &lt; entity().getDeviceIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpLt(){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null){
            lt("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * 小于等于 &lt;= entity().getDeviceIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpLe(){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null){
            le("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * BETWEEN  entity().getDeviceIp() AND 值2
     * @param deviceIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpBetween(String deviceIpEnd){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null && deviceIpEnd!=null){
            between("device_ip",deviceIp,deviceIpEnd);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * NOT BETWEEN  entity().getDeviceIp() AND 值2
     * @param deviceIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpNotBetween(String deviceIpEnd){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null && deviceIpEnd!=null){
            notBetween("device_ip",deviceIp,deviceIpEnd);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * BETWEEN  entity().getDeviceIp() AND 值2
     * @param deviceIpStart       值1
     * @param deviceIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpBetween(String deviceIpStart,String deviceIpEnd){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null && deviceIpEnd!=null){
            between("device_ip",deviceIpStart,deviceIpEnd);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * NOT BETWEEN  entity().getDeviceIp() AND 值2
     * @param deviceIpStart       值1
     * @param deviceIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpNotBetween(String deviceIpStart,String deviceIpEnd){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null && deviceIpEnd!=null){
            notBetween("device_ip",deviceIpStart,deviceIpEnd);
        }
        return this;
     }


    /**
     * <p>物理机ip</p>
     * LIKE '%值%' entity().getDeviceIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpLike(){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null){
            like("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * NOT LIKE '%值%' entity().getDeviceIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpNotLike(){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null){
            notLike("device_ip",deviceIp);
        }
        return this;
     }


    /**
     * <p>物理机ip</p>
     * LIKE '%值' entity().getDeviceIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpLikeLeft(){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null){
            likeLeft("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * LIKE '值%' entity().getDeviceIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpLikeRight(){
        String deviceIp =entity().getDeviceIp();
        if(deviceIp!=null){
            likeRight("device_ip",deviceIp);
        }
        return this;
     }

/**
     * <p>物理机ip</p>
     * 等于 =
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpEq(String deviceIp){
        if(deviceIp!=null){
            eq("device_ip",deviceIp);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * 不等于 &lt;&gt;
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpNe(String deviceIp){
        if(deviceIp!=null){
            ne("device_ip",deviceIp);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * 大于 &gt;
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpGt(String deviceIp){
        if(deviceIp!=null){
            gt("device_ip",deviceIp);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * 大于等于 &gt;=
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpGe(String deviceIp){
        if(deviceIp!=null){
            ge("device_ip",deviceIp);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * 小于 &lt;
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpLt(String deviceIp){
        if(deviceIp!=null){
            lt("device_ip",deviceIp);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * 小于等于 &lt;=
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpLe(String deviceIp){
        if(deviceIp!=null){
            le("device_ip",deviceIp);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * LIKE '%值%'
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpLike(String deviceIp){
        if(deviceIp!=null){
            like("device_ip",deviceIp);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * NOT LIKE '%值%'
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpNotLike(String deviceIp){
        if(deviceIp!=null){
            notLike("device_ip",deviceIp);
        }
        return this;
    }


    /**
     * <p>物理机ip</p>
     * LIKE '%值'
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpLikeLeft(String deviceIp){
        if(deviceIp!=null){
            likeLeft("device_ip",deviceIp);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * LIKE '值%'
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpLikeRight(String deviceIp){
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
    public BaiduDeviceUpdateEntityWrapper deviceIpIsNull(){
        isNull("device_ip");
        return this;
    }

    /**
     * <p>物理机ip</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpIsNotNull(){
        isNotNull("device_ip");
        return this;
    }

    /**
     * <p>物理机ip</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper deviceIpIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper deviceIpIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper deviceIpNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper deviceIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_ip",values);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * 等于 = entity().getHardwareCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeEq(){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null){
            eq("hardware_code",hardwareCode);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * 不等于 &lt;&gt; entity().getHardwareCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeNe(){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null){
            ne("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * 大于 &gt; entity().getHardwareCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeGt(){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null){
            gt("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * 大于等于 &gt;= entity().getHardwareCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeGe(){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null){
            ge("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * 小于 &lt; entity().getHardwareCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeLt(){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null){
            lt("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * 小于等于 &lt;= entity().getHardwareCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeLe(){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null){
            le("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * BETWEEN  entity().getHardwareCode() AND 值2
     * @param hardwareCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeBetween(String hardwareCodeEnd){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null && hardwareCodeEnd!=null){
            between("hardware_code",hardwareCode,hardwareCodeEnd);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * NOT BETWEEN  entity().getHardwareCode() AND 值2
     * @param hardwareCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeNotBetween(String hardwareCodeEnd){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null && hardwareCodeEnd!=null){
            notBetween("hardware_code",hardwareCode,hardwareCodeEnd);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * BETWEEN  entity().getHardwareCode() AND 值2
     * @param hardwareCodeStart       值1
     * @param hardwareCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeBetween(String hardwareCodeStart,String hardwareCodeEnd){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null && hardwareCodeEnd!=null){
            between("hardware_code",hardwareCodeStart,hardwareCodeEnd);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * NOT BETWEEN  entity().getHardwareCode() AND 值2
     * @param hardwareCodeStart       值1
     * @param hardwareCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeNotBetween(String hardwareCodeStart,String hardwareCodeEnd){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null && hardwareCodeEnd!=null){
            notBetween("hardware_code",hardwareCodeStart,hardwareCodeEnd);
        }
        return this;
     }


    /**
     * <p>硬件配置</p>
     * LIKE '%值%' entity().getHardwareCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeLike(){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null){
            like("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * NOT LIKE '%值%' entity().getHardwareCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeNotLike(){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null){
            notLike("hardware_code",hardwareCode);
        }
        return this;
     }


    /**
     * <p>硬件配置</p>
     * LIKE '%值' entity().getHardwareCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeLikeLeft(){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null){
            likeLeft("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * LIKE '值%' entity().getHardwareCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeLikeRight(){
        String hardwareCode =entity().getHardwareCode();
        if(hardwareCode!=null){
            likeRight("hardware_code",hardwareCode);
        }
        return this;
     }

/**
     * <p>硬件配置</p>
     * 等于 =
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeEq(String hardwareCode){
        if(hardwareCode!=null){
            eq("hardware_code",hardwareCode);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * 不等于 &lt;&gt;
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeNe(String hardwareCode){
        if(hardwareCode!=null){
            ne("hardware_code",hardwareCode);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * 大于 &gt;
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeGt(String hardwareCode){
        if(hardwareCode!=null){
            gt("hardware_code",hardwareCode);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * 大于等于 &gt;=
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeGe(String hardwareCode){
        if(hardwareCode!=null){
            ge("hardware_code",hardwareCode);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * 小于 &lt;
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeLt(String hardwareCode){
        if(hardwareCode!=null){
            lt("hardware_code",hardwareCode);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * 小于等于 &lt;=
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeLe(String hardwareCode){
        if(hardwareCode!=null){
            le("hardware_code",hardwareCode);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * LIKE '%值%'
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeLike(String hardwareCode){
        if(hardwareCode!=null){
            like("hardware_code",hardwareCode);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * NOT LIKE '%值%'
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeNotLike(String hardwareCode){
        if(hardwareCode!=null){
            notLike("hardware_code",hardwareCode);
        }
        return this;
    }


    /**
     * <p>硬件配置</p>
     * LIKE '%值'
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeLikeLeft(String hardwareCode){
        if(hardwareCode!=null){
            likeLeft("hardware_code",hardwareCode);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * LIKE '值%'
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeLikeRight(String hardwareCode){
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
    public BaiduDeviceUpdateEntityWrapper hardwareCodeIsNull(){
        isNull("hardware_code");
        return this;
    }

    /**
     * <p>硬件配置</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeIsNotNull(){
        isNotNull("hardware_code");
        return this;
    }

    /**
     * <p>硬件配置</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hardwareCodeIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper hardwareCodeIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper hardwareCodeNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper hardwareCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("hardware_code",values);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * 等于 = entity().getUnitSeg()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegEq(){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null){
            eq("unit_seg",unitSeg);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * 不等于 &lt;&gt; entity().getUnitSeg()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegNe(){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null){
            ne("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * 大于 &gt; entity().getUnitSeg()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegGt(){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null){
            gt("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * 大于等于 &gt;= entity().getUnitSeg()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegGe(){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null){
            ge("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * 小于 &lt; entity().getUnitSeg()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegLt(){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null){
            lt("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * 小于等于 &lt;= entity().getUnitSeg()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegLe(){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null){
            le("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * BETWEEN  entity().getUnitSeg() AND 值2
     * @param unitSegEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegBetween(String unitSegEnd){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null && unitSegEnd!=null){
            between("unit_seg",unitSeg,unitSegEnd);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * NOT BETWEEN  entity().getUnitSeg() AND 值2
     * @param unitSegEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegNotBetween(String unitSegEnd){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null && unitSegEnd!=null){
            notBetween("unit_seg",unitSeg,unitSegEnd);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * BETWEEN  entity().getUnitSeg() AND 值2
     * @param unitSegStart       值1
     * @param unitSegEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegBetween(String unitSegStart,String unitSegEnd){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null && unitSegEnd!=null){
            between("unit_seg",unitSegStart,unitSegEnd);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * NOT BETWEEN  entity().getUnitSeg() AND 值2
     * @param unitSegStart       值1
     * @param unitSegEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegNotBetween(String unitSegStart,String unitSegEnd){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null && unitSegEnd!=null){
            notBetween("unit_seg",unitSegStart,unitSegEnd);
        }
        return this;
     }


    /**
     * <p>网段</p>
     * LIKE '%值%' entity().getUnitSeg()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegLike(){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null){
            like("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * NOT LIKE '%值%' entity().getUnitSeg()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegNotLike(){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null){
            notLike("unit_seg",unitSeg);
        }
        return this;
     }


    /**
     * <p>网段</p>
     * LIKE '%值' entity().getUnitSeg()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegLikeLeft(){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null){
            likeLeft("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * LIKE '值%' entity().getUnitSeg()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegLikeRight(){
        String unitSeg =entity().getUnitSeg();
        if(unitSeg!=null){
            likeRight("unit_seg",unitSeg);
        }
        return this;
     }

/**
     * <p>网段</p>
     * 等于 =
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegEq(String unitSeg){
        if(unitSeg!=null){
            eq("unit_seg",unitSeg);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * 不等于 &lt;&gt;
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegNe(String unitSeg){
        if(unitSeg!=null){
            ne("unit_seg",unitSeg);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * 大于 &gt;
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegGt(String unitSeg){
        if(unitSeg!=null){
            gt("unit_seg",unitSeg);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * 大于等于 &gt;=
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegGe(String unitSeg){
        if(unitSeg!=null){
            ge("unit_seg",unitSeg);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * 小于 &lt;
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegLt(String unitSeg){
        if(unitSeg!=null){
            lt("unit_seg",unitSeg);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * 小于等于 &lt;=
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegLe(String unitSeg){
        if(unitSeg!=null){
            le("unit_seg",unitSeg);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * LIKE '%值%'
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegLike(String unitSeg){
        if(unitSeg!=null){
            like("unit_seg",unitSeg);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * NOT LIKE '%值%'
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegNotLike(String unitSeg){
        if(unitSeg!=null){
            notLike("unit_seg",unitSeg);
        }
        return this;
    }


    /**
     * <p>网段</p>
     * LIKE '%值'
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegLikeLeft(String unitSeg){
        if(unitSeg!=null){
            likeLeft("unit_seg",unitSeg);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * LIKE '值%'
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegLikeRight(String unitSeg){
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
    public BaiduDeviceUpdateEntityWrapper unitSegIsNull(){
        isNull("unit_seg");
        return this;
    }

    /**
     * <p>网段</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegIsNotNull(){
        isNotNull("unit_seg");
        return this;
    }

    /**
     * <p>网段</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper unitSegIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper unitSegIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper unitSegNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper unitSegNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("unit_seg",values);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * 等于 = entity().getBootTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeEq(){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null){
            eq("boot_time",bootTime);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * 不等于 &lt;&gt; entity().getBootTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeNe(){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null){
            ne("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * 大于 &gt; entity().getBootTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeGt(){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null){
            gt("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * 大于等于 &gt;= entity().getBootTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeGe(){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null){
            ge("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * 小于 &lt; entity().getBootTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeLt(){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null){
            lt("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * 小于等于 &lt;= entity().getBootTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeLe(){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null){
            le("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * BETWEEN  entity().getBootTime() AND 值2
     * @param bootTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeBetween(Date bootTimeEnd){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null && bootTimeEnd!=null){
            between("boot_time",bootTime,bootTimeEnd);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * NOT BETWEEN  entity().getBootTime() AND 值2
     * @param bootTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeNotBetween(Date bootTimeEnd){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null && bootTimeEnd!=null){
            notBetween("boot_time",bootTime,bootTimeEnd);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * BETWEEN  entity().getBootTime() AND 值2
     * @param bootTimeStart       值1
     * @param bootTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeBetween(Date bootTimeStart,Date bootTimeEnd){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null && bootTimeEnd!=null){
            between("boot_time",bootTimeStart,bootTimeEnd);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * NOT BETWEEN  entity().getBootTime() AND 值2
     * @param bootTimeStart       值1
     * @param bootTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeNotBetween(Date bootTimeStart,Date bootTimeEnd){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null && bootTimeEnd!=null){
            notBetween("boot_time",bootTimeStart,bootTimeEnd);
        }
        return this;
     }


    /**
     * <p>启动时间</p>
     * LIKE '%值%' entity().getBootTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeLike(){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null){
            like("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * NOT LIKE '%值%' entity().getBootTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeNotLike(){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null){
            notLike("boot_time",bootTime);
        }
        return this;
     }


    /**
     * <p>启动时间</p>
     * LIKE '%值' entity().getBootTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeLikeLeft(){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null){
            likeLeft("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * LIKE '值%' entity().getBootTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeLikeRight(){
        Date bootTime =entity().getBootTime();
        if(bootTime!=null){
            likeRight("boot_time",bootTime);
        }
        return this;
     }

/**
     * <p>启动时间</p>
     * 等于 =
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeEq(Date bootTime){
        if(bootTime!=null){
            eq("boot_time",bootTime);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * 不等于 &lt;&gt;
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeNe(Date bootTime){
        if(bootTime!=null){
            ne("boot_time",bootTime);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * 大于 &gt;
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeGt(Date bootTime){
        if(bootTime!=null){
            gt("boot_time",bootTime);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * 大于等于 &gt;=
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeGe(Date bootTime){
        if(bootTime!=null){
            ge("boot_time",bootTime);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * 小于 &lt;
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeLt(Date bootTime){
        if(bootTime!=null){
            lt("boot_time",bootTime);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * 小于等于 &lt;=
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeLe(Date bootTime){
        if(bootTime!=null){
            le("boot_time",bootTime);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * LIKE '%值%'
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeLike(Date bootTime){
        if(bootTime!=null){
            like("boot_time",bootTime);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * NOT LIKE '%值%'
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeNotLike(Date bootTime){
        if(bootTime!=null){
            notLike("boot_time",bootTime);
        }
        return this;
    }


    /**
     * <p>启动时间</p>
     * LIKE '%值'
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeLikeLeft(Date bootTime){
        if(bootTime!=null){
            likeLeft("boot_time",bootTime);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * LIKE '值%'
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeLikeRight(Date bootTime){
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
    public BaiduDeviceUpdateEntityWrapper bootTimeIsNull(){
        isNull("boot_time");
        return this;
    }

    /**
     * <p>启动时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeIsNotNull(){
        isNotNull("boot_time");
        return this;
    }

    /**
     * <p>启动时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper bootTimeIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper bootTimeIn(Date... values){
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
    public BaiduDeviceUpdateEntityWrapper bootTimeNotIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper bootTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("boot_time",values);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * 等于 = entity().getHbTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeEq(){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null){
            eq("hb_time",hbTime);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * 不等于 &lt;&gt; entity().getHbTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeNe(){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null){
            ne("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * 大于 &gt; entity().getHbTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeGt(){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null){
            gt("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * 大于等于 &gt;= entity().getHbTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeGe(){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null){
            ge("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * 小于 &lt; entity().getHbTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeLt(){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null){
            lt("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * 小于等于 &lt;= entity().getHbTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeLe(){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null){
            le("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * BETWEEN  entity().getHbTime() AND 值2
     * @param hbTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeBetween(Date hbTimeEnd){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null && hbTimeEnd!=null){
            between("hb_time",hbTime,hbTimeEnd);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * NOT BETWEEN  entity().getHbTime() AND 值2
     * @param hbTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeNotBetween(Date hbTimeEnd){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null && hbTimeEnd!=null){
            notBetween("hb_time",hbTime,hbTimeEnd);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * BETWEEN  entity().getHbTime() AND 值2
     * @param hbTimeStart       值1
     * @param hbTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeBetween(Date hbTimeStart,Date hbTimeEnd){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null && hbTimeEnd!=null){
            between("hb_time",hbTimeStart,hbTimeEnd);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * NOT BETWEEN  entity().getHbTime() AND 值2
     * @param hbTimeStart       值1
     * @param hbTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeNotBetween(Date hbTimeStart,Date hbTimeEnd){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null && hbTimeEnd!=null){
            notBetween("hb_time",hbTimeStart,hbTimeEnd);
        }
        return this;
     }


    /**
     * <p>上次心跳时间</p>
     * LIKE '%值%' entity().getHbTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeLike(){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null){
            like("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * NOT LIKE '%值%' entity().getHbTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeNotLike(){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null){
            notLike("hb_time",hbTime);
        }
        return this;
     }


    /**
     * <p>上次心跳时间</p>
     * LIKE '%值' entity().getHbTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeLikeLeft(){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null){
            likeLeft("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * LIKE '值%' entity().getHbTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeLikeRight(){
        Date hbTime =entity().getHbTime();
        if(hbTime!=null){
            likeRight("hb_time",hbTime);
        }
        return this;
     }

/**
     * <p>上次心跳时间</p>
     * 等于 =
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeEq(Date hbTime){
        if(hbTime!=null){
            eq("hb_time",hbTime);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * 不等于 &lt;&gt;
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeNe(Date hbTime){
        if(hbTime!=null){
            ne("hb_time",hbTime);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * 大于 &gt;
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeGt(Date hbTime){
        if(hbTime!=null){
            gt("hb_time",hbTime);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * 大于等于 &gt;=
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeGe(Date hbTime){
        if(hbTime!=null){
            ge("hb_time",hbTime);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * 小于 &lt;
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeLt(Date hbTime){
        if(hbTime!=null){
            lt("hb_time",hbTime);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * 小于等于 &lt;=
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeLe(Date hbTime){
        if(hbTime!=null){
            le("hb_time",hbTime);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * LIKE '%值%'
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeLike(Date hbTime){
        if(hbTime!=null){
            like("hb_time",hbTime);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * NOT LIKE '%值%'
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeNotLike(Date hbTime){
        if(hbTime!=null){
            notLike("hb_time",hbTime);
        }
        return this;
    }


    /**
     * <p>上次心跳时间</p>
     * LIKE '%值'
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeLikeLeft(Date hbTime){
        if(hbTime!=null){
            likeLeft("hb_time",hbTime);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * LIKE '值%'
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeLikeRight(Date hbTime){
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
    public BaiduDeviceUpdateEntityWrapper hbTimeIsNull(){
        isNull("hb_time");
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeIsNotNull(){
        isNotNull("hb_time");
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper hbTimeIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper hbTimeIn(Date... values){
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
    public BaiduDeviceUpdateEntityWrapper hbTimeNotIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper hbTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("hb_time",values);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * 等于 = entity().getAlertExpireTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeEq(){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null){
            eq("alert_expire_time",alertExpireTime);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * 不等于 &lt;&gt; entity().getAlertExpireTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeNe(){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null){
            ne("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * 大于 &gt; entity().getAlertExpireTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeGt(){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null){
            gt("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * 大于等于 &gt;= entity().getAlertExpireTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeGe(){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null){
            ge("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * 小于 &lt; entity().getAlertExpireTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeLt(){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null){
            lt("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * 小于等于 &lt;= entity().getAlertExpireTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeLe(){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null){
            le("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * BETWEEN  entity().getAlertExpireTime() AND 值2
     * @param alertExpireTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeBetween(Date alertExpireTimeEnd){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null && alertExpireTimeEnd!=null){
            between("alert_expire_time",alertExpireTime,alertExpireTimeEnd);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * NOT BETWEEN  entity().getAlertExpireTime() AND 值2
     * @param alertExpireTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeNotBetween(Date alertExpireTimeEnd){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null && alertExpireTimeEnd!=null){
            notBetween("alert_expire_time",alertExpireTime,alertExpireTimeEnd);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * BETWEEN  entity().getAlertExpireTime() AND 值2
     * @param alertExpireTimeStart       值1
     * @param alertExpireTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeBetween(Date alertExpireTimeStart,Date alertExpireTimeEnd){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null && alertExpireTimeEnd!=null){
            between("alert_expire_time",alertExpireTimeStart,alertExpireTimeEnd);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * NOT BETWEEN  entity().getAlertExpireTime() AND 值2
     * @param alertExpireTimeStart       值1
     * @param alertExpireTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeNotBetween(Date alertExpireTimeStart,Date alertExpireTimeEnd){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null && alertExpireTimeEnd!=null){
            notBetween("alert_expire_time",alertExpireTimeStart,alertExpireTimeEnd);
        }
        return this;
     }


    /**
     * <p>报警超时时间</p>
     * LIKE '%值%' entity().getAlertExpireTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeLike(){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null){
            like("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * NOT LIKE '%值%' entity().getAlertExpireTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeNotLike(){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null){
            notLike("alert_expire_time",alertExpireTime);
        }
        return this;
     }


    /**
     * <p>报警超时时间</p>
     * LIKE '%值' entity().getAlertExpireTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeLikeLeft(){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null){
            likeLeft("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * LIKE '值%' entity().getAlertExpireTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeLikeRight(){
        Date alertExpireTime =entity().getAlertExpireTime();
        if(alertExpireTime!=null){
            likeRight("alert_expire_time",alertExpireTime);
        }
        return this;
     }

/**
     * <p>报警超时时间</p>
     * 等于 =
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeEq(Date alertExpireTime){
        if(alertExpireTime!=null){
            eq("alert_expire_time",alertExpireTime);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * 不等于 &lt;&gt;
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeNe(Date alertExpireTime){
        if(alertExpireTime!=null){
            ne("alert_expire_time",alertExpireTime);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * 大于 &gt;
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeGt(Date alertExpireTime){
        if(alertExpireTime!=null){
            gt("alert_expire_time",alertExpireTime);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * 大于等于 &gt;=
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeGe(Date alertExpireTime){
        if(alertExpireTime!=null){
            ge("alert_expire_time",alertExpireTime);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * 小于 &lt;
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeLt(Date alertExpireTime){
        if(alertExpireTime!=null){
            lt("alert_expire_time",alertExpireTime);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * 小于等于 &lt;=
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeLe(Date alertExpireTime){
        if(alertExpireTime!=null){
            le("alert_expire_time",alertExpireTime);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * LIKE '%值%'
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeLike(Date alertExpireTime){
        if(alertExpireTime!=null){
            like("alert_expire_time",alertExpireTime);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * NOT LIKE '%值%'
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeNotLike(Date alertExpireTime){
        if(alertExpireTime!=null){
            notLike("alert_expire_time",alertExpireTime);
        }
        return this;
    }


    /**
     * <p>报警超时时间</p>
     * LIKE '%值'
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeLikeLeft(Date alertExpireTime){
        if(alertExpireTime!=null){
            likeLeft("alert_expire_time",alertExpireTime);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * LIKE '值%'
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeLikeRight(Date alertExpireTime){
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
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeIsNull(){
        isNull("alert_expire_time");
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeIsNotNull(){
        isNotNull("alert_expire_time");
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeIn(Date... values){
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
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeNotIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper alertExpireTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("alert_expire_time",values);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 等于 = entity().getOfflineTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeEq(){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null){
            eq("offline_time",offlineTime);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 不等于 &lt;&gt; entity().getOfflineTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeNe(){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null){
            ne("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 大于 &gt; entity().getOfflineTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeGt(){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null){
            gt("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 大于等于 &gt;= entity().getOfflineTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeGe(){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null){
            ge("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 小于 &lt; entity().getOfflineTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeLt(){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null){
            lt("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 小于等于 &lt;= entity().getOfflineTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeLe(){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null){
            le("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * BETWEEN  entity().getOfflineTime() AND 值2
     * @param offlineTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeBetween(Date offlineTimeEnd){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null && offlineTimeEnd!=null){
            between("offline_time",offlineTime,offlineTimeEnd);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * NOT BETWEEN  entity().getOfflineTime() AND 值2
     * @param offlineTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeNotBetween(Date offlineTimeEnd){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null && offlineTimeEnd!=null){
            notBetween("offline_time",offlineTime,offlineTimeEnd);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * BETWEEN  entity().getOfflineTime() AND 值2
     * @param offlineTimeStart       值1
     * @param offlineTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeBetween(Date offlineTimeStart,Date offlineTimeEnd){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null && offlineTimeEnd!=null){
            between("offline_time",offlineTimeStart,offlineTimeEnd);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * NOT BETWEEN  entity().getOfflineTime() AND 值2
     * @param offlineTimeStart       值1
     * @param offlineTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeNotBetween(Date offlineTimeStart,Date offlineTimeEnd){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null && offlineTimeEnd!=null){
            notBetween("offline_time",offlineTimeStart,offlineTimeEnd);
        }
        return this;
     }


    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * LIKE '%值%' entity().getOfflineTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeLike(){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null){
            like("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * NOT LIKE '%值%' entity().getOfflineTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeNotLike(){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null){
            notLike("offline_time",offlineTime);
        }
        return this;
     }


    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * LIKE '%值' entity().getOfflineTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeLikeLeft(){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null){
            likeLeft("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * LIKE '值%' entity().getOfflineTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeLikeRight(){
        Date offlineTime =entity().getOfflineTime();
        if(offlineTime!=null){
            likeRight("offline_time",offlineTime);
        }
        return this;
     }

/**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 等于 =
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeEq(Date offlineTime){
        if(offlineTime!=null){
            eq("offline_time",offlineTime);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 不等于 &lt;&gt;
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeNe(Date offlineTime){
        if(offlineTime!=null){
            ne("offline_time",offlineTime);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 大于 &gt;
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeGt(Date offlineTime){
        if(offlineTime!=null){
            gt("offline_time",offlineTime);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 大于等于 &gt;=
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeGe(Date offlineTime){
        if(offlineTime!=null){
            ge("offline_time",offlineTime);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 小于 &lt;
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeLt(Date offlineTime){
        if(offlineTime!=null){
            lt("offline_time",offlineTime);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 小于等于 &lt;=
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeLe(Date offlineTime){
        if(offlineTime!=null){
            le("offline_time",offlineTime);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * LIKE '%值%'
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeLike(Date offlineTime){
        if(offlineTime!=null){
            like("offline_time",offlineTime);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * NOT LIKE '%值%'
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeNotLike(Date offlineTime){
        if(offlineTime!=null){
            notLike("offline_time",offlineTime);
        }
        return this;
    }


    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * LIKE '%值'
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeLikeLeft(Date offlineTime){
        if(offlineTime!=null){
            likeLeft("offline_time",offlineTime);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * LIKE '值%'
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeLikeRight(Date offlineTime){
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
    public BaiduDeviceUpdateEntityWrapper offlineTimeIsNull(){
        isNull("offline_time");
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeIsNotNull(){
        isNotNull("offline_time");
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offlineTimeIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper offlineTimeIn(Date... values){
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
    public BaiduDeviceUpdateEntityWrapper offlineTimeNotIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper offlineTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("offline_time",values);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 等于 = entity().getTx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txEq(){
        String tx =entity().getTx();
        if(tx!=null){
            eq("tx",tx);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 不等于 &lt;&gt; entity().getTx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txNe(){
        String tx =entity().getTx();
        if(tx!=null){
            ne("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 大于 &gt; entity().getTx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txGt(){
        String tx =entity().getTx();
        if(tx!=null){
            gt("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 大于等于 &gt;= entity().getTx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txGe(){
        String tx =entity().getTx();
        if(tx!=null){
            ge("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 小于 &lt; entity().getTx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txLt(){
        String tx =entity().getTx();
        if(tx!=null){
            lt("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 小于等于 &lt;= entity().getTx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txLe(){
        String tx =entity().getTx();
        if(tx!=null){
            le("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * BETWEEN  entity().getTx() AND 值2
     * @param txEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txBetween(String txEnd){
        String tx =entity().getTx();
        if(tx!=null && txEnd!=null){
            between("tx",tx,txEnd);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * NOT BETWEEN  entity().getTx() AND 值2
     * @param txEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txNotBetween(String txEnd){
        String tx =entity().getTx();
        if(tx!=null && txEnd!=null){
            notBetween("tx",tx,txEnd);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * BETWEEN  entity().getTx() AND 值2
     * @param txStart       值1
     * @param txEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txBetween(String txStart,String txEnd){
        String tx =entity().getTx();
        if(tx!=null && txEnd!=null){
            between("tx",txStart,txEnd);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * NOT BETWEEN  entity().getTx() AND 值2
     * @param txStart       值1
     * @param txEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txNotBetween(String txStart,String txEnd){
        String tx =entity().getTx();
        if(tx!=null && txEnd!=null){
            notBetween("tx",txStart,txEnd);
        }
        return this;
     }


    /**
     * <p>上行网速，单位B/s网速测算</p>
     * LIKE '%值%' entity().getTx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txLike(){
        String tx =entity().getTx();
        if(tx!=null){
            like("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * NOT LIKE '%值%' entity().getTx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txNotLike(){
        String tx =entity().getTx();
        if(tx!=null){
            notLike("tx",tx);
        }
        return this;
     }


    /**
     * <p>上行网速，单位B/s网速测算</p>
     * LIKE '%值' entity().getTx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txLikeLeft(){
        String tx =entity().getTx();
        if(tx!=null){
            likeLeft("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * LIKE '值%' entity().getTx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txLikeRight(){
        String tx =entity().getTx();
        if(tx!=null){
            likeRight("tx",tx);
        }
        return this;
     }

/**
     * <p>上行网速，单位B/s网速测算</p>
     * 等于 =
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txEq(String tx){
        if(tx!=null){
            eq("tx",tx);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 不等于 &lt;&gt;
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txNe(String tx){
        if(tx!=null){
            ne("tx",tx);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 大于 &gt;
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txGt(String tx){
        if(tx!=null){
            gt("tx",tx);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 大于等于 &gt;=
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txGe(String tx){
        if(tx!=null){
            ge("tx",tx);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 小于 &lt;
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txLt(String tx){
        if(tx!=null){
            lt("tx",tx);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 小于等于 &lt;=
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txLe(String tx){
        if(tx!=null){
            le("tx",tx);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * LIKE '%值%'
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txLike(String tx){
        if(tx!=null){
            like("tx",tx);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * NOT LIKE '%值%'
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txNotLike(String tx){
        if(tx!=null){
            notLike("tx",tx);
        }
        return this;
    }


    /**
     * <p>上行网速，单位B/s网速测算</p>
     * LIKE '%值'
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txLikeLeft(String tx){
        if(tx!=null){
            likeLeft("tx",tx);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * LIKE '值%'
     * @param tx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txLikeRight(String tx){
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
    public BaiduDeviceUpdateEntityWrapper txIsNull(){
        isNull("tx");
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txIsNotNull(){
        isNotNull("tx");
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper txIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper txIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper txNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper txNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("tx",values);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * 等于 = entity().getRx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxEq(){
        String rx =entity().getRx();
        if(rx!=null){
            eq("rx",rx);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * 不等于 &lt;&gt; entity().getRx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxNe(){
        String rx =entity().getRx();
        if(rx!=null){
            ne("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * 大于 &gt; entity().getRx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxGt(){
        String rx =entity().getRx();
        if(rx!=null){
            gt("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * 大于等于 &gt;= entity().getRx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxGe(){
        String rx =entity().getRx();
        if(rx!=null){
            ge("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * 小于 &lt; entity().getRx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxLt(){
        String rx =entity().getRx();
        if(rx!=null){
            lt("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * 小于等于 &lt;= entity().getRx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxLe(){
        String rx =entity().getRx();
        if(rx!=null){
            le("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * BETWEEN  entity().getRx() AND 值2
     * @param rxEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxBetween(String rxEnd){
        String rx =entity().getRx();
        if(rx!=null && rxEnd!=null){
            between("rx",rx,rxEnd);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * NOT BETWEEN  entity().getRx() AND 值2
     * @param rxEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxNotBetween(String rxEnd){
        String rx =entity().getRx();
        if(rx!=null && rxEnd!=null){
            notBetween("rx",rx,rxEnd);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * BETWEEN  entity().getRx() AND 值2
     * @param rxStart       值1
     * @param rxEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxBetween(String rxStart,String rxEnd){
        String rx =entity().getRx();
        if(rx!=null && rxEnd!=null){
            between("rx",rxStart,rxEnd);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * NOT BETWEEN  entity().getRx() AND 值2
     * @param rxStart       值1
     * @param rxEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxNotBetween(String rxStart,String rxEnd){
        String rx =entity().getRx();
        if(rx!=null && rxEnd!=null){
            notBetween("rx",rxStart,rxEnd);
        }
        return this;
     }


    /**
     * <p>下行网速，单位B/s</p>
     * LIKE '%值%' entity().getRx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxLike(){
        String rx =entity().getRx();
        if(rx!=null){
            like("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * NOT LIKE '%值%' entity().getRx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxNotLike(){
        String rx =entity().getRx();
        if(rx!=null){
            notLike("rx",rx);
        }
        return this;
     }


    /**
     * <p>下行网速，单位B/s</p>
     * LIKE '%值' entity().getRx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxLikeLeft(){
        String rx =entity().getRx();
        if(rx!=null){
            likeLeft("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * LIKE '值%' entity().getRx()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxLikeRight(){
        String rx =entity().getRx();
        if(rx!=null){
            likeRight("rx",rx);
        }
        return this;
     }

/**
     * <p>下行网速，单位B/s</p>
     * 等于 =
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxEq(String rx){
        if(rx!=null){
            eq("rx",rx);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * 不等于 &lt;&gt;
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxNe(String rx){
        if(rx!=null){
            ne("rx",rx);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * 大于 &gt;
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxGt(String rx){
        if(rx!=null){
            gt("rx",rx);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * 大于等于 &gt;=
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxGe(String rx){
        if(rx!=null){
            ge("rx",rx);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * 小于 &lt;
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxLt(String rx){
        if(rx!=null){
            lt("rx",rx);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * 小于等于 &lt;=
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxLe(String rx){
        if(rx!=null){
            le("rx",rx);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * LIKE '%值%'
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxLike(String rx){
        if(rx!=null){
            like("rx",rx);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * NOT LIKE '%值%'
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxNotLike(String rx){
        if(rx!=null){
            notLike("rx",rx);
        }
        return this;
    }


    /**
     * <p>下行网速，单位B/s</p>
     * LIKE '%值'
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxLikeLeft(String rx){
        if(rx!=null){
            likeLeft("rx",rx);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * LIKE '值%'
     * @param rx       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxLikeRight(String rx){
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
    public BaiduDeviceUpdateEntityWrapper rxIsNull(){
        isNull("rx");
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxIsNotNull(){
        isNotNull("rx");
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rxIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper rxIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper rxNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper rxNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("rx",values);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 等于 = entity().getStatusOnline()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineEq(){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null){
            eq("status_online",statusOnline);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 不等于 &lt;&gt; entity().getStatusOnline()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineNe(){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null){
            ne("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 大于 &gt; entity().getStatusOnline()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineGt(){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null){
            gt("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 大于等于 &gt;= entity().getStatusOnline()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineGe(){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null){
            ge("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 小于 &lt; entity().getStatusOnline()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineLt(){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null){
            lt("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 小于等于 &lt;= entity().getStatusOnline()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineLe(){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null){
            le("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * BETWEEN  entity().getStatusOnline() AND 值2
     * @param statusOnlineEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineBetween(Integer statusOnlineEnd){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null && statusOnlineEnd!=null){
            between("status_online",statusOnline,statusOnlineEnd);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * NOT BETWEEN  entity().getStatusOnline() AND 值2
     * @param statusOnlineEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineNotBetween(Integer statusOnlineEnd){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null && statusOnlineEnd!=null){
            notBetween("status_online",statusOnline,statusOnlineEnd);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * BETWEEN  entity().getStatusOnline() AND 值2
     * @param statusOnlineStart       值1
     * @param statusOnlineEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineBetween(Integer statusOnlineStart,Integer statusOnlineEnd){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null && statusOnlineEnd!=null){
            between("status_online",statusOnlineStart,statusOnlineEnd);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * NOT BETWEEN  entity().getStatusOnline() AND 值2
     * @param statusOnlineStart       值1
     * @param statusOnlineEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineNotBetween(Integer statusOnlineStart,Integer statusOnlineEnd){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null && statusOnlineEnd!=null){
            notBetween("status_online",statusOnlineStart,statusOnlineEnd);
        }
        return this;
     }


    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * LIKE '%值%' entity().getStatusOnline()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineLike(){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null){
            like("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * NOT LIKE '%值%' entity().getStatusOnline()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineNotLike(){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null){
            notLike("status_online",statusOnline);
        }
        return this;
     }


    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * LIKE '%值' entity().getStatusOnline()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineLikeLeft(){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null){
            likeLeft("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * LIKE '值%' entity().getStatusOnline()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineLikeRight(){
        Integer statusOnline =entity().getStatusOnline();
        if(statusOnline!=null){
            likeRight("status_online",statusOnline);
        }
        return this;
     }

/**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 等于 =
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineEq(Integer statusOnline){
        if(statusOnline!=null){
            eq("status_online",statusOnline);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 不等于 &lt;&gt;
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineNe(Integer statusOnline){
        if(statusOnline!=null){
            ne("status_online",statusOnline);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 大于 &gt;
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineGt(Integer statusOnline){
        if(statusOnline!=null){
            gt("status_online",statusOnline);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 大于等于 &gt;=
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineGe(Integer statusOnline){
        if(statusOnline!=null){
            ge("status_online",statusOnline);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 小于 &lt;
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineLt(Integer statusOnline){
        if(statusOnline!=null){
            lt("status_online",statusOnline);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 小于等于 &lt;=
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineLe(Integer statusOnline){
        if(statusOnline!=null){
            le("status_online",statusOnline);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * LIKE '%值%'
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineLike(Integer statusOnline){
        if(statusOnline!=null){
            like("status_online",statusOnline);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * NOT LIKE '%值%'
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineNotLike(Integer statusOnline){
        if(statusOnline!=null){
            notLike("status_online",statusOnline);
        }
        return this;
    }


    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * LIKE '%值'
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineLikeLeft(Integer statusOnline){
        if(statusOnline!=null){
            likeLeft("status_online",statusOnline);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * LIKE '值%'
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineLikeRight(Integer statusOnline){
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
    public BaiduDeviceUpdateEntityWrapper statusOnlineIsNull(){
        isNull("status_online");
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineIsNotNull(){
        isNotNull("status_online");
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusOnlineIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper statusOnlineIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper statusOnlineNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper statusOnlineNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status_online",values);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 等于 = entity().getOffSeconds()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsEq(){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null){
            eq("off_seconds",offSeconds);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 不等于 &lt;&gt; entity().getOffSeconds()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsNe(){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null){
            ne("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 大于 &gt; entity().getOffSeconds()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsGt(){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null){
            gt("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 大于等于 &gt;= entity().getOffSeconds()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsGe(){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null){
            ge("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 小于 &lt; entity().getOffSeconds()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsLt(){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null){
            lt("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 小于等于 &lt;= entity().getOffSeconds()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsLe(){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null){
            le("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * BETWEEN  entity().getOffSeconds() AND 值2
     * @param offSecondsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsBetween(Long offSecondsEnd){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null && offSecondsEnd!=null){
            between("off_seconds",offSeconds,offSecondsEnd);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * NOT BETWEEN  entity().getOffSeconds() AND 值2
     * @param offSecondsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsNotBetween(Long offSecondsEnd){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null && offSecondsEnd!=null){
            notBetween("off_seconds",offSeconds,offSecondsEnd);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * BETWEEN  entity().getOffSeconds() AND 值2
     * @param offSecondsStart       值1
     * @param offSecondsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsBetween(Long offSecondsStart,Long offSecondsEnd){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null && offSecondsEnd!=null){
            between("off_seconds",offSecondsStart,offSecondsEnd);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * NOT BETWEEN  entity().getOffSeconds() AND 值2
     * @param offSecondsStart       值1
     * @param offSecondsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsNotBetween(Long offSecondsStart,Long offSecondsEnd){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null && offSecondsEnd!=null){
            notBetween("off_seconds",offSecondsStart,offSecondsEnd);
        }
        return this;
     }


    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * LIKE '%值%' entity().getOffSeconds()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsLike(){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null){
            like("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * NOT LIKE '%值%' entity().getOffSeconds()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsNotLike(){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null){
            notLike("off_seconds",offSeconds);
        }
        return this;
     }


    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * LIKE '%值' entity().getOffSeconds()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsLikeLeft(){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null){
            likeLeft("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * LIKE '值%' entity().getOffSeconds()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsLikeRight(){
        Long offSeconds =entity().getOffSeconds();
        if(offSeconds!=null){
            likeRight("off_seconds",offSeconds);
        }
        return this;
     }

/**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 等于 =
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsEq(Long offSeconds){
        if(offSeconds!=null){
            eq("off_seconds",offSeconds);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 不等于 &lt;&gt;
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsNe(Long offSeconds){
        if(offSeconds!=null){
            ne("off_seconds",offSeconds);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 大于 &gt;
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsGt(Long offSeconds){
        if(offSeconds!=null){
            gt("off_seconds",offSeconds);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 大于等于 &gt;=
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsGe(Long offSeconds){
        if(offSeconds!=null){
            ge("off_seconds",offSeconds);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 小于 &lt;
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsLt(Long offSeconds){
        if(offSeconds!=null){
            lt("off_seconds",offSeconds);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 小于等于 &lt;=
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsLe(Long offSeconds){
        if(offSeconds!=null){
            le("off_seconds",offSeconds);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * LIKE '%值%'
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsLike(Long offSeconds){
        if(offSeconds!=null){
            like("off_seconds",offSeconds);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * NOT LIKE '%值%'
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsNotLike(Long offSeconds){
        if(offSeconds!=null){
            notLike("off_seconds",offSeconds);
        }
        return this;
    }


    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * LIKE '%值'
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsLikeLeft(Long offSeconds){
        if(offSeconds!=null){
            likeLeft("off_seconds",offSeconds);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * LIKE '值%'
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsLikeRight(Long offSeconds){
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
    public BaiduDeviceUpdateEntityWrapper offSecondsIsNull(){
        isNull("off_seconds");
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsIsNotNull(){
        isNotNull("off_seconds");
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper offSecondsIn(Collection<Long> value){
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
    public BaiduDeviceUpdateEntityWrapper offSecondsIn(Long... values){
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
    public BaiduDeviceUpdateEntityWrapper offSecondsNotIn(Collection<Long> value){
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
    public BaiduDeviceUpdateEntityWrapper offSecondsNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("off_seconds",values);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * 等于 = entity().getErrorMessage()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageEq(){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null){
            eq("error_message",errorMessage);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * 不等于 &lt;&gt; entity().getErrorMessage()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageNe(){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null){
            ne("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * 大于 &gt; entity().getErrorMessage()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageGt(){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null){
            gt("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * 大于等于 &gt;= entity().getErrorMessage()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageGe(){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null){
            ge("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * 小于 &lt; entity().getErrorMessage()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageLt(){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null){
            lt("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * 小于等于 &lt;= entity().getErrorMessage()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageLe(){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null){
            le("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * BETWEEN  entity().getErrorMessage() AND 值2
     * @param errorMessageEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageBetween(String errorMessageEnd){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null && errorMessageEnd!=null){
            between("error_message",errorMessage,errorMessageEnd);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * NOT BETWEEN  entity().getErrorMessage() AND 值2
     * @param errorMessageEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageNotBetween(String errorMessageEnd){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null && errorMessageEnd!=null){
            notBetween("error_message",errorMessage,errorMessageEnd);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * BETWEEN  entity().getErrorMessage() AND 值2
     * @param errorMessageStart       值1
     * @param errorMessageEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageBetween(String errorMessageStart,String errorMessageEnd){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null && errorMessageEnd!=null){
            between("error_message",errorMessageStart,errorMessageEnd);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * NOT BETWEEN  entity().getErrorMessage() AND 值2
     * @param errorMessageStart       值1
     * @param errorMessageEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageNotBetween(String errorMessageStart,String errorMessageEnd){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null && errorMessageEnd!=null){
            notBetween("error_message",errorMessageStart,errorMessageEnd);
        }
        return this;
     }


    /**
     * <p>云机错误消息</p>
     * LIKE '%值%' entity().getErrorMessage()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageLike(){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null){
            like("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * NOT LIKE '%值%' entity().getErrorMessage()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageNotLike(){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null){
            notLike("error_message",errorMessage);
        }
        return this;
     }


    /**
     * <p>云机错误消息</p>
     * LIKE '%值' entity().getErrorMessage()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageLikeLeft(){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null){
            likeLeft("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * LIKE '值%' entity().getErrorMessage()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageLikeRight(){
        String errorMessage =entity().getErrorMessage();
        if(errorMessage!=null){
            likeRight("error_message",errorMessage);
        }
        return this;
     }

/**
     * <p>云机错误消息</p>
     * 等于 =
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageEq(String errorMessage){
        if(errorMessage!=null){
            eq("error_message",errorMessage);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * 不等于 &lt;&gt;
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageNe(String errorMessage){
        if(errorMessage!=null){
            ne("error_message",errorMessage);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * 大于 &gt;
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageGt(String errorMessage){
        if(errorMessage!=null){
            gt("error_message",errorMessage);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * 大于等于 &gt;=
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageGe(String errorMessage){
        if(errorMessage!=null){
            ge("error_message",errorMessage);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * 小于 &lt;
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageLt(String errorMessage){
        if(errorMessage!=null){
            lt("error_message",errorMessage);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * 小于等于 &lt;=
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageLe(String errorMessage){
        if(errorMessage!=null){
            le("error_message",errorMessage);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * LIKE '%值%'
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageLike(String errorMessage){
        if(errorMessage!=null){
            like("error_message",errorMessage);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * NOT LIKE '%值%'
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageNotLike(String errorMessage){
        if(errorMessage!=null){
            notLike("error_message",errorMessage);
        }
        return this;
    }


    /**
     * <p>云机错误消息</p>
     * LIKE '%值'
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageLikeLeft(String errorMessage){
        if(errorMessage!=null){
            likeLeft("error_message",errorMessage);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * LIKE '值%'
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageLikeRight(String errorMessage){
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
    public BaiduDeviceUpdateEntityWrapper errorMessageIsNull(){
        isNull("error_message");
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageIsNotNull(){
        isNotNull("error_message");
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper errorMessageIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper errorMessageIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper errorMessageNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper errorMessageNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("error_message",values);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 等于 = entity().getStatusControl()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlEq(){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null){
            eq("status_control",statusControl);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 不等于 &lt;&gt; entity().getStatusControl()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlNe(){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null){
            ne("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 大于 &gt; entity().getStatusControl()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlGt(){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null){
            gt("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 大于等于 &gt;= entity().getStatusControl()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlGe(){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null){
            ge("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 小于 &lt; entity().getStatusControl()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlLt(){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null){
            lt("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 小于等于 &lt;= entity().getStatusControl()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlLe(){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null){
            le("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * BETWEEN  entity().getStatusControl() AND 值2
     * @param statusControlEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlBetween(Integer statusControlEnd){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null && statusControlEnd!=null){
            between("status_control",statusControl,statusControlEnd);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * NOT BETWEEN  entity().getStatusControl() AND 值2
     * @param statusControlEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlNotBetween(Integer statusControlEnd){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null && statusControlEnd!=null){
            notBetween("status_control",statusControl,statusControlEnd);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * BETWEEN  entity().getStatusControl() AND 值2
     * @param statusControlStart       值1
     * @param statusControlEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlBetween(Integer statusControlStart,Integer statusControlEnd){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null && statusControlEnd!=null){
            between("status_control",statusControlStart,statusControlEnd);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * NOT BETWEEN  entity().getStatusControl() AND 值2
     * @param statusControlStart       值1
     * @param statusControlEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlNotBetween(Integer statusControlStart,Integer statusControlEnd){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null && statusControlEnd!=null){
            notBetween("status_control",statusControlStart,statusControlEnd);
        }
        return this;
     }


    /**
     * <p>0 未推流 1 正在推流</p>
     * LIKE '%值%' entity().getStatusControl()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlLike(){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null){
            like("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * NOT LIKE '%值%' entity().getStatusControl()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlNotLike(){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null){
            notLike("status_control",statusControl);
        }
        return this;
     }


    /**
     * <p>0 未推流 1 正在推流</p>
     * LIKE '%值' entity().getStatusControl()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlLikeLeft(){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null){
            likeLeft("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * LIKE '值%' entity().getStatusControl()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlLikeRight(){
        Integer statusControl =entity().getStatusControl();
        if(statusControl!=null){
            likeRight("status_control",statusControl);
        }
        return this;
     }

/**
     * <p>0 未推流 1 正在推流</p>
     * 等于 =
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlEq(Integer statusControl){
        if(statusControl!=null){
            eq("status_control",statusControl);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 不等于 &lt;&gt;
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlNe(Integer statusControl){
        if(statusControl!=null){
            ne("status_control",statusControl);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 大于 &gt;
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlGt(Integer statusControl){
        if(statusControl!=null){
            gt("status_control",statusControl);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 大于等于 &gt;=
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlGe(Integer statusControl){
        if(statusControl!=null){
            ge("status_control",statusControl);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 小于 &lt;
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlLt(Integer statusControl){
        if(statusControl!=null){
            lt("status_control",statusControl);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 小于等于 &lt;=
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlLe(Integer statusControl){
        if(statusControl!=null){
            le("status_control",statusControl);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * LIKE '%值%'
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlLike(Integer statusControl){
        if(statusControl!=null){
            like("status_control",statusControl);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * NOT LIKE '%值%'
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlNotLike(Integer statusControl){
        if(statusControl!=null){
            notLike("status_control",statusControl);
        }
        return this;
    }


    /**
     * <p>0 未推流 1 正在推流</p>
     * LIKE '%值'
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlLikeLeft(Integer statusControl){
        if(statusControl!=null){
            likeLeft("status_control",statusControl);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * LIKE '值%'
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlLikeRight(Integer statusControl){
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
    public BaiduDeviceUpdateEntityWrapper statusControlIsNull(){
        isNull("status_control");
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlIsNotNull(){
        isNotNull("status_control");
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusControlIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper statusControlIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper statusControlNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper statusControlNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status_control",values);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * 等于 = entity().getAlertEnabled()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledEq(){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null){
            eq("alert_enabled",alertEnabled);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * 不等于 &lt;&gt; entity().getAlertEnabled()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledNe(){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null){
            ne("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * 大于 &gt; entity().getAlertEnabled()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledGt(){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null){
            gt("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * 大于等于 &gt;= entity().getAlertEnabled()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledGe(){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null){
            ge("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * 小于 &lt; entity().getAlertEnabled()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledLt(){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null){
            lt("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * 小于等于 &lt;= entity().getAlertEnabled()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledLe(){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null){
            le("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * BETWEEN  entity().getAlertEnabled() AND 值2
     * @param alertEnabledEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledBetween(Boolean alertEnabledEnd){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null && alertEnabledEnd!=null){
            between("alert_enabled",alertEnabled,alertEnabledEnd);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * NOT BETWEEN  entity().getAlertEnabled() AND 值2
     * @param alertEnabledEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledNotBetween(Boolean alertEnabledEnd){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null && alertEnabledEnd!=null){
            notBetween("alert_enabled",alertEnabled,alertEnabledEnd);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * BETWEEN  entity().getAlertEnabled() AND 值2
     * @param alertEnabledStart       值1
     * @param alertEnabledEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledBetween(Boolean alertEnabledStart,Boolean alertEnabledEnd){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null && alertEnabledEnd!=null){
            between("alert_enabled",alertEnabledStart,alertEnabledEnd);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * NOT BETWEEN  entity().getAlertEnabled() AND 值2
     * @param alertEnabledStart       值1
     * @param alertEnabledEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledNotBetween(Boolean alertEnabledStart,Boolean alertEnabledEnd){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null && alertEnabledEnd!=null){
            notBetween("alert_enabled",alertEnabledStart,alertEnabledEnd);
        }
        return this;
     }


    /**
     * <p>是否开启报警</p>
     * LIKE '%值%' entity().getAlertEnabled()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledLike(){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null){
            like("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * NOT LIKE '%值%' entity().getAlertEnabled()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledNotLike(){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null){
            notLike("alert_enabled",alertEnabled);
        }
        return this;
     }


    /**
     * <p>是否开启报警</p>
     * LIKE '%值' entity().getAlertEnabled()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledLikeLeft(){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null){
            likeLeft("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * LIKE '值%' entity().getAlertEnabled()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledLikeRight(){
        Boolean alertEnabled =entity().getAlertEnabled();
        if(alertEnabled!=null){
            likeRight("alert_enabled",alertEnabled);
        }
        return this;
     }

/**
     * <p>是否开启报警</p>
     * 等于 =
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledEq(Boolean alertEnabled){
        if(alertEnabled!=null){
            eq("alert_enabled",alertEnabled);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * 不等于 &lt;&gt;
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledNe(Boolean alertEnabled){
        if(alertEnabled!=null){
            ne("alert_enabled",alertEnabled);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * 大于 &gt;
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledGt(Boolean alertEnabled){
        if(alertEnabled!=null){
            gt("alert_enabled",alertEnabled);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * 大于等于 &gt;=
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledGe(Boolean alertEnabled){
        if(alertEnabled!=null){
            ge("alert_enabled",alertEnabled);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * 小于 &lt;
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledLt(Boolean alertEnabled){
        if(alertEnabled!=null){
            lt("alert_enabled",alertEnabled);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * 小于等于 &lt;=
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledLe(Boolean alertEnabled){
        if(alertEnabled!=null){
            le("alert_enabled",alertEnabled);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * LIKE '%值%'
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledLike(Boolean alertEnabled){
        if(alertEnabled!=null){
            like("alert_enabled",alertEnabled);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * NOT LIKE '%值%'
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledNotLike(Boolean alertEnabled){
        if(alertEnabled!=null){
            notLike("alert_enabled",alertEnabled);
        }
        return this;
    }


    /**
     * <p>是否开启报警</p>
     * LIKE '%值'
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledLikeLeft(Boolean alertEnabled){
        if(alertEnabled!=null){
            likeLeft("alert_enabled",alertEnabled);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * LIKE '值%'
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledLikeRight(Boolean alertEnabled){
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
    public BaiduDeviceUpdateEntityWrapper alertEnabledIsNull(){
        isNull("alert_enabled");
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledIsNotNull(){
        isNotNull("alert_enabled");
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper alertEnabledIn(Collection<Boolean> value){
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
    public BaiduDeviceUpdateEntityWrapper alertEnabledIn(Boolean... values){
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
    public BaiduDeviceUpdateEntityWrapper alertEnabledNotIn(Collection<Boolean> value){
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
    public BaiduDeviceUpdateEntityWrapper alertEnabledNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("alert_enabled",values);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * 等于 = entity().getStatusPaaS()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSEq(){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null){
            eq("status_paa_s",statusPaaS);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * 不等于 &lt;&gt; entity().getStatusPaaS()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSNe(){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null){
            ne("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * 大于 &gt; entity().getStatusPaaS()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSGt(){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null){
            gt("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * 大于等于 &gt;= entity().getStatusPaaS()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSGe(){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null){
            ge("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * 小于 &lt; entity().getStatusPaaS()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSLt(){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null){
            lt("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * 小于等于 &lt;= entity().getStatusPaaS()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSLe(){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null){
            le("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * BETWEEN  entity().getStatusPaaS() AND 值2
     * @param statusPaaSEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSBetween(Boolean statusPaaSEnd){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null && statusPaaSEnd!=null){
            between("status_paa_s",statusPaaS,statusPaaSEnd);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * NOT BETWEEN  entity().getStatusPaaS() AND 值2
     * @param statusPaaSEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSNotBetween(Boolean statusPaaSEnd){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null && statusPaaSEnd!=null){
            notBetween("status_paa_s",statusPaaS,statusPaaSEnd);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * BETWEEN  entity().getStatusPaaS() AND 值2
     * @param statusPaaSStart       值1
     * @param statusPaaSEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSBetween(Boolean statusPaaSStart,Boolean statusPaaSEnd){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null && statusPaaSEnd!=null){
            between("status_paa_s",statusPaaSStart,statusPaaSEnd);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * NOT BETWEEN  entity().getStatusPaaS() AND 值2
     * @param statusPaaSStart       值1
     * @param statusPaaSEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSNotBetween(Boolean statusPaaSStart,Boolean statusPaaSEnd){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null && statusPaaSEnd!=null){
            notBetween("status_paa_s",statusPaaSStart,statusPaaSEnd);
        }
        return this;
     }


    /**
     * <p>在paas中状态是否正常</p>
     * LIKE '%值%' entity().getStatusPaaS()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSLike(){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null){
            like("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * NOT LIKE '%值%' entity().getStatusPaaS()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSNotLike(){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null){
            notLike("status_paa_s",statusPaaS);
        }
        return this;
     }


    /**
     * <p>在paas中状态是否正常</p>
     * LIKE '%值' entity().getStatusPaaS()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSLikeLeft(){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null){
            likeLeft("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * LIKE '值%' entity().getStatusPaaS()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSLikeRight(){
        Boolean statusPaaS =entity().getStatusPaaS();
        if(statusPaaS!=null){
            likeRight("status_paa_s",statusPaaS);
        }
        return this;
     }

/**
     * <p>在paas中状态是否正常</p>
     * 等于 =
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSEq(Boolean statusPaaS){
        if(statusPaaS!=null){
            eq("status_paa_s",statusPaaS);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * 不等于 &lt;&gt;
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSNe(Boolean statusPaaS){
        if(statusPaaS!=null){
            ne("status_paa_s",statusPaaS);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * 大于 &gt;
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSGt(Boolean statusPaaS){
        if(statusPaaS!=null){
            gt("status_paa_s",statusPaaS);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * 大于等于 &gt;=
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSGe(Boolean statusPaaS){
        if(statusPaaS!=null){
            ge("status_paa_s",statusPaaS);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * 小于 &lt;
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSLt(Boolean statusPaaS){
        if(statusPaaS!=null){
            lt("status_paa_s",statusPaaS);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * 小于等于 &lt;=
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSLe(Boolean statusPaaS){
        if(statusPaaS!=null){
            le("status_paa_s",statusPaaS);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * LIKE '%值%'
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSLike(Boolean statusPaaS){
        if(statusPaaS!=null){
            like("status_paa_s",statusPaaS);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * NOT LIKE '%值%'
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSNotLike(Boolean statusPaaS){
        if(statusPaaS!=null){
            notLike("status_paa_s",statusPaaS);
        }
        return this;
    }


    /**
     * <p>在paas中状态是否正常</p>
     * LIKE '%值'
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSLikeLeft(Boolean statusPaaS){
        if(statusPaaS!=null){
            likeLeft("status_paa_s",statusPaaS);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * LIKE '值%'
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSLikeRight(Boolean statusPaaS){
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
    public BaiduDeviceUpdateEntityWrapper statusPaaSIsNull(){
        isNull("status_paa_s");
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSIsNotNull(){
        isNotNull("status_paa_s");
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper statusPaaSIn(Collection<Boolean> value){
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
    public BaiduDeviceUpdateEntityWrapper statusPaaSIn(Boolean... values){
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
    public BaiduDeviceUpdateEntityWrapper statusPaaSNotIn(Collection<Boolean> value){
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
    public BaiduDeviceUpdateEntityWrapper statusPaaSNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("status_paa_s",values);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 等于 = entity().getLastApplyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameEq(){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null){
            eq("last_apply_username",lastApplyUsername);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 不等于 &lt;&gt; entity().getLastApplyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameNe(){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null){
            ne("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 大于 &gt; entity().getLastApplyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameGt(){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null){
            gt("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 大于等于 &gt;= entity().getLastApplyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameGe(){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null){
            ge("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 小于 &lt; entity().getLastApplyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameLt(){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null){
            lt("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 小于等于 &lt;= entity().getLastApplyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameLe(){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null){
            le("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * BETWEEN  entity().getLastApplyUsername() AND 值2
     * @param lastApplyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameBetween(String lastApplyUsernameEnd){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null && lastApplyUsernameEnd!=null){
            between("last_apply_username",lastApplyUsername,lastApplyUsernameEnd);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * NOT BETWEEN  entity().getLastApplyUsername() AND 值2
     * @param lastApplyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameNotBetween(String lastApplyUsernameEnd){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null && lastApplyUsernameEnd!=null){
            notBetween("last_apply_username",lastApplyUsername,lastApplyUsernameEnd);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * BETWEEN  entity().getLastApplyUsername() AND 值2
     * @param lastApplyUsernameStart       值1
     * @param lastApplyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameBetween(String lastApplyUsernameStart,String lastApplyUsernameEnd){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null && lastApplyUsernameEnd!=null){
            between("last_apply_username",lastApplyUsernameStart,lastApplyUsernameEnd);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * NOT BETWEEN  entity().getLastApplyUsername() AND 值2
     * @param lastApplyUsernameStart       值1
     * @param lastApplyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameNotBetween(String lastApplyUsernameStart,String lastApplyUsernameEnd){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null && lastApplyUsernameEnd!=null){
            notBetween("last_apply_username",lastApplyUsernameStart,lastApplyUsernameEnd);
        }
        return this;
     }


    /**
     * <p>上次成功申请到推流token的用户名</p>
     * LIKE '%值%' entity().getLastApplyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameLike(){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null){
            like("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * NOT LIKE '%值%' entity().getLastApplyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameNotLike(){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null){
            notLike("last_apply_username",lastApplyUsername);
        }
        return this;
     }


    /**
     * <p>上次成功申请到推流token的用户名</p>
     * LIKE '%值' entity().getLastApplyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameLikeLeft(){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null){
            likeLeft("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * LIKE '值%' entity().getLastApplyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameLikeRight(){
        String lastApplyUsername =entity().getLastApplyUsername();
        if(lastApplyUsername!=null){
            likeRight("last_apply_username",lastApplyUsername);
        }
        return this;
     }

/**
     * <p>上次成功申请到推流token的用户名</p>
     * 等于 =
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameEq(String lastApplyUsername){
        if(lastApplyUsername!=null){
            eq("last_apply_username",lastApplyUsername);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 不等于 &lt;&gt;
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameNe(String lastApplyUsername){
        if(lastApplyUsername!=null){
            ne("last_apply_username",lastApplyUsername);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 大于 &gt;
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameGt(String lastApplyUsername){
        if(lastApplyUsername!=null){
            gt("last_apply_username",lastApplyUsername);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 大于等于 &gt;=
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameGe(String lastApplyUsername){
        if(lastApplyUsername!=null){
            ge("last_apply_username",lastApplyUsername);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 小于 &lt;
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameLt(String lastApplyUsername){
        if(lastApplyUsername!=null){
            lt("last_apply_username",lastApplyUsername);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 小于等于 &lt;=
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameLe(String lastApplyUsername){
        if(lastApplyUsername!=null){
            le("last_apply_username",lastApplyUsername);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * LIKE '%值%'
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameLike(String lastApplyUsername){
        if(lastApplyUsername!=null){
            like("last_apply_username",lastApplyUsername);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * NOT LIKE '%值%'
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameNotLike(String lastApplyUsername){
        if(lastApplyUsername!=null){
            notLike("last_apply_username",lastApplyUsername);
        }
        return this;
    }


    /**
     * <p>上次成功申请到推流token的用户名</p>
     * LIKE '%值'
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameLikeLeft(String lastApplyUsername){
        if(lastApplyUsername!=null){
            likeLeft("last_apply_username",lastApplyUsername);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * LIKE '值%'
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameLikeRight(String lastApplyUsername){
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
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameIsNull(){
        isNull("last_apply_username");
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameIsNotNull(){
        isNotNull("last_apply_username");
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper lastApplyUsernameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("last_apply_username",values);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * 等于 = entity().getLastApplyDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateEq(){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null){
            eq("last_apply_date",lastApplyDate);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * 不等于 &lt;&gt; entity().getLastApplyDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateNe(){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null){
            ne("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * 大于 &gt; entity().getLastApplyDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateGt(){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null){
            gt("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * 大于等于 &gt;= entity().getLastApplyDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateGe(){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null){
            ge("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * 小于 &lt; entity().getLastApplyDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateLt(){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null){
            lt("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * 小于等于 &lt;= entity().getLastApplyDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateLe(){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null){
            le("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * BETWEEN  entity().getLastApplyDate() AND 值2
     * @param lastApplyDateEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateBetween(Date lastApplyDateEnd){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null && lastApplyDateEnd!=null){
            between("last_apply_date",lastApplyDate,lastApplyDateEnd);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * NOT BETWEEN  entity().getLastApplyDate() AND 值2
     * @param lastApplyDateEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateNotBetween(Date lastApplyDateEnd){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null && lastApplyDateEnd!=null){
            notBetween("last_apply_date",lastApplyDate,lastApplyDateEnd);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * BETWEEN  entity().getLastApplyDate() AND 值2
     * @param lastApplyDateStart       值1
     * @param lastApplyDateEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateBetween(Date lastApplyDateStart,Date lastApplyDateEnd){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null && lastApplyDateEnd!=null){
            between("last_apply_date",lastApplyDateStart,lastApplyDateEnd);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * NOT BETWEEN  entity().getLastApplyDate() AND 值2
     * @param lastApplyDateStart       值1
     * @param lastApplyDateEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateNotBetween(Date lastApplyDateStart,Date lastApplyDateEnd){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null && lastApplyDateEnd!=null){
            notBetween("last_apply_date",lastApplyDateStart,lastApplyDateEnd);
        }
        return this;
     }


    /**
     * <p>上次成功申请到token的日期</p>
     * LIKE '%值%' entity().getLastApplyDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateLike(){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null){
            like("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * NOT LIKE '%值%' entity().getLastApplyDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateNotLike(){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null){
            notLike("last_apply_date",lastApplyDate);
        }
        return this;
     }


    /**
     * <p>上次成功申请到token的日期</p>
     * LIKE '%值' entity().getLastApplyDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateLikeLeft(){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null){
            likeLeft("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * LIKE '值%' entity().getLastApplyDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateLikeRight(){
        Date lastApplyDate =entity().getLastApplyDate();
        if(lastApplyDate!=null){
            likeRight("last_apply_date",lastApplyDate);
        }
        return this;
     }

/**
     * <p>上次成功申请到token的日期</p>
     * 等于 =
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateEq(Date lastApplyDate){
        if(lastApplyDate!=null){
            eq("last_apply_date",lastApplyDate);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * 不等于 &lt;&gt;
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateNe(Date lastApplyDate){
        if(lastApplyDate!=null){
            ne("last_apply_date",lastApplyDate);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * 大于 &gt;
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateGt(Date lastApplyDate){
        if(lastApplyDate!=null){
            gt("last_apply_date",lastApplyDate);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * 大于等于 &gt;=
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateGe(Date lastApplyDate){
        if(lastApplyDate!=null){
            ge("last_apply_date",lastApplyDate);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * 小于 &lt;
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateLt(Date lastApplyDate){
        if(lastApplyDate!=null){
            lt("last_apply_date",lastApplyDate);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * 小于等于 &lt;=
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateLe(Date lastApplyDate){
        if(lastApplyDate!=null){
            le("last_apply_date",lastApplyDate);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * LIKE '%值%'
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateLike(Date lastApplyDate){
        if(lastApplyDate!=null){
            like("last_apply_date",lastApplyDate);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * NOT LIKE '%值%'
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateNotLike(Date lastApplyDate){
        if(lastApplyDate!=null){
            notLike("last_apply_date",lastApplyDate);
        }
        return this;
    }


    /**
     * <p>上次成功申请到token的日期</p>
     * LIKE '%值'
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateLikeLeft(Date lastApplyDate){
        if(lastApplyDate!=null){
            likeLeft("last_apply_date",lastApplyDate);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * LIKE '值%'
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateLikeRight(Date lastApplyDate){
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
    public BaiduDeviceUpdateEntityWrapper lastApplyDateIsNull(){
        isNull("last_apply_date");
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateIsNotNull(){
        isNotNull("last_apply_date");
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastApplyDateIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper lastApplyDateIn(Date... values){
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
    public BaiduDeviceUpdateEntityWrapper lastApplyDateNotIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper lastApplyDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_apply_date",values);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * 等于 = entity().getLastActiveDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateEq(){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null){
            eq("last_active_date",lastActiveDate);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * 不等于 &lt;&gt; entity().getLastActiveDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateNe(){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null){
            ne("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * 大于 &gt; entity().getLastActiveDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateGt(){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null){
            gt("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * 大于等于 &gt;= entity().getLastActiveDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateGe(){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null){
            ge("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * 小于 &lt; entity().getLastActiveDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateLt(){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null){
            lt("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * 小于等于 &lt;= entity().getLastActiveDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateLe(){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null){
            le("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * BETWEEN  entity().getLastActiveDate() AND 值2
     * @param lastActiveDateEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateBetween(Date lastActiveDateEnd){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null && lastActiveDateEnd!=null){
            between("last_active_date",lastActiveDate,lastActiveDateEnd);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * NOT BETWEEN  entity().getLastActiveDate() AND 值2
     * @param lastActiveDateEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateNotBetween(Date lastActiveDateEnd){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null && lastActiveDateEnd!=null){
            notBetween("last_active_date",lastActiveDate,lastActiveDateEnd);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * BETWEEN  entity().getLastActiveDate() AND 值2
     * @param lastActiveDateStart       值1
     * @param lastActiveDateEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateBetween(Date lastActiveDateStart,Date lastActiveDateEnd){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null && lastActiveDateEnd!=null){
            between("last_active_date",lastActiveDateStart,lastActiveDateEnd);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * NOT BETWEEN  entity().getLastActiveDate() AND 值2
     * @param lastActiveDateStart       值1
     * @param lastActiveDateEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateNotBetween(Date lastActiveDateStart,Date lastActiveDateEnd){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null && lastActiveDateEnd!=null){
            notBetween("last_active_date",lastActiveDateStart,lastActiveDateEnd);
        }
        return this;
     }


    /**
     * <p>上次活跃日期</p>
     * LIKE '%值%' entity().getLastActiveDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateLike(){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null){
            like("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * NOT LIKE '%值%' entity().getLastActiveDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateNotLike(){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null){
            notLike("last_active_date",lastActiveDate);
        }
        return this;
     }


    /**
     * <p>上次活跃日期</p>
     * LIKE '%值' entity().getLastActiveDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateLikeLeft(){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null){
            likeLeft("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * LIKE '值%' entity().getLastActiveDate()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateLikeRight(){
        Date lastActiveDate =entity().getLastActiveDate();
        if(lastActiveDate!=null){
            likeRight("last_active_date",lastActiveDate);
        }
        return this;
     }

/**
     * <p>上次活跃日期</p>
     * 等于 =
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateEq(Date lastActiveDate){
        if(lastActiveDate!=null){
            eq("last_active_date",lastActiveDate);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * 不等于 &lt;&gt;
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateNe(Date lastActiveDate){
        if(lastActiveDate!=null){
            ne("last_active_date",lastActiveDate);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * 大于 &gt;
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateGt(Date lastActiveDate){
        if(lastActiveDate!=null){
            gt("last_active_date",lastActiveDate);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * 大于等于 &gt;=
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateGe(Date lastActiveDate){
        if(lastActiveDate!=null){
            ge("last_active_date",lastActiveDate);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * 小于 &lt;
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateLt(Date lastActiveDate){
        if(lastActiveDate!=null){
            lt("last_active_date",lastActiveDate);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * 小于等于 &lt;=
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateLe(Date lastActiveDate){
        if(lastActiveDate!=null){
            le("last_active_date",lastActiveDate);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * LIKE '%值%'
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateLike(Date lastActiveDate){
        if(lastActiveDate!=null){
            like("last_active_date",lastActiveDate);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * NOT LIKE '%值%'
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateNotLike(Date lastActiveDate){
        if(lastActiveDate!=null){
            notLike("last_active_date",lastActiveDate);
        }
        return this;
    }


    /**
     * <p>上次活跃日期</p>
     * LIKE '%值'
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateLikeLeft(Date lastActiveDate){
        if(lastActiveDate!=null){
            likeLeft("last_active_date",lastActiveDate);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * LIKE '值%'
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateLikeRight(Date lastActiveDate){
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
    public BaiduDeviceUpdateEntityWrapper lastActiveDateIsNull(){
        isNull("last_active_date");
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateIsNotNull(){
        isNotNull("last_active_date");
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastActiveDateIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper lastActiveDateIn(Date... values){
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
    public BaiduDeviceUpdateEntityWrapper lastActiveDateNotIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper lastActiveDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_active_date",values);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 等于 = entity().getPkgs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsEq(){
        String pkgs =entity().getPkgs();
        if(pkgs!=null){
            eq("pkgs",pkgs);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 不等于 &lt;&gt; entity().getPkgs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsNe(){
        String pkgs =entity().getPkgs();
        if(pkgs!=null){
            ne("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 大于 &gt; entity().getPkgs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsGt(){
        String pkgs =entity().getPkgs();
        if(pkgs!=null){
            gt("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 大于等于 &gt;= entity().getPkgs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsGe(){
        String pkgs =entity().getPkgs();
        if(pkgs!=null){
            ge("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 小于 &lt; entity().getPkgs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsLt(){
        String pkgs =entity().getPkgs();
        if(pkgs!=null){
            lt("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 小于等于 &lt;= entity().getPkgs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsLe(){
        String pkgs =entity().getPkgs();
        if(pkgs!=null){
            le("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * BETWEEN  entity().getPkgs() AND 值2
     * @param pkgsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsBetween(String pkgsEnd){
        String pkgs =entity().getPkgs();
        if(pkgs!=null && pkgsEnd!=null){
            between("pkgs",pkgs,pkgsEnd);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * NOT BETWEEN  entity().getPkgs() AND 值2
     * @param pkgsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsNotBetween(String pkgsEnd){
        String pkgs =entity().getPkgs();
        if(pkgs!=null && pkgsEnd!=null){
            notBetween("pkgs",pkgs,pkgsEnd);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * BETWEEN  entity().getPkgs() AND 值2
     * @param pkgsStart       值1
     * @param pkgsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsBetween(String pkgsStart,String pkgsEnd){
        String pkgs =entity().getPkgs();
        if(pkgs!=null && pkgsEnd!=null){
            between("pkgs",pkgsStart,pkgsEnd);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * NOT BETWEEN  entity().getPkgs() AND 值2
     * @param pkgsStart       值1
     * @param pkgsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsNotBetween(String pkgsStart,String pkgsEnd){
        String pkgs =entity().getPkgs();
        if(pkgs!=null && pkgsEnd!=null){
            notBetween("pkgs",pkgsStart,pkgsEnd);
        }
        return this;
     }


    /**
     * <p>安装的应用，多个使用,分割</p>
     * LIKE '%值%' entity().getPkgs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsLike(){
        String pkgs =entity().getPkgs();
        if(pkgs!=null){
            like("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * NOT LIKE '%值%' entity().getPkgs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsNotLike(){
        String pkgs =entity().getPkgs();
        if(pkgs!=null){
            notLike("pkgs",pkgs);
        }
        return this;
     }


    /**
     * <p>安装的应用，多个使用,分割</p>
     * LIKE '%值' entity().getPkgs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsLikeLeft(){
        String pkgs =entity().getPkgs();
        if(pkgs!=null){
            likeLeft("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * LIKE '值%' entity().getPkgs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsLikeRight(){
        String pkgs =entity().getPkgs();
        if(pkgs!=null){
            likeRight("pkgs",pkgs);
        }
        return this;
     }

/**
     * <p>安装的应用，多个使用,分割</p>
     * 等于 =
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsEq(String pkgs){
        if(pkgs!=null){
            eq("pkgs",pkgs);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 不等于 &lt;&gt;
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsNe(String pkgs){
        if(pkgs!=null){
            ne("pkgs",pkgs);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 大于 &gt;
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsGt(String pkgs){
        if(pkgs!=null){
            gt("pkgs",pkgs);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 大于等于 &gt;=
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsGe(String pkgs){
        if(pkgs!=null){
            ge("pkgs",pkgs);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 小于 &lt;
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsLt(String pkgs){
        if(pkgs!=null){
            lt("pkgs",pkgs);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 小于等于 &lt;=
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsLe(String pkgs){
        if(pkgs!=null){
            le("pkgs",pkgs);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * LIKE '%值%'
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsLike(String pkgs){
        if(pkgs!=null){
            like("pkgs",pkgs);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * NOT LIKE '%值%'
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsNotLike(String pkgs){
        if(pkgs!=null){
            notLike("pkgs",pkgs);
        }
        return this;
    }


    /**
     * <p>安装的应用，多个使用,分割</p>
     * LIKE '%值'
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsLikeLeft(String pkgs){
        if(pkgs!=null){
            likeLeft("pkgs",pkgs);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * LIKE '值%'
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsLikeRight(String pkgs){
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
    public BaiduDeviceUpdateEntityWrapper pkgsIsNull(){
        isNull("pkgs");
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsIsNotNull(){
        isNotNull("pkgs");
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pkgsIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper pkgsIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper pkgsNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper pkgsNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("pkgs",values);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * 等于 = entity().getTag()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagEq(){
        String tag =entity().getTag();
        if(tag!=null){
            eq("tag",tag);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * 不等于 &lt;&gt; entity().getTag()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagNe(){
        String tag =entity().getTag();
        if(tag!=null){
            ne("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * 大于 &gt; entity().getTag()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagGt(){
        String tag =entity().getTag();
        if(tag!=null){
            gt("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * 大于等于 &gt;= entity().getTag()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagGe(){
        String tag =entity().getTag();
        if(tag!=null){
            ge("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * 小于 &lt; entity().getTag()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagLt(){
        String tag =entity().getTag();
        if(tag!=null){
            lt("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * 小于等于 &lt;= entity().getTag()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagLe(){
        String tag =entity().getTag();
        if(tag!=null){
            le("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * BETWEEN  entity().getTag() AND 值2
     * @param tagEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagBetween(String tagEnd){
        String tag =entity().getTag();
        if(tag!=null && tagEnd!=null){
            between("tag",tag,tagEnd);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * NOT BETWEEN  entity().getTag() AND 值2
     * @param tagEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagNotBetween(String tagEnd){
        String tag =entity().getTag();
        if(tag!=null && tagEnd!=null){
            notBetween("tag",tag,tagEnd);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * BETWEEN  entity().getTag() AND 值2
     * @param tagStart       值1
     * @param tagEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagBetween(String tagStart,String tagEnd){
        String tag =entity().getTag();
        if(tag!=null && tagEnd!=null){
            between("tag",tagStart,tagEnd);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * NOT BETWEEN  entity().getTag() AND 值2
     * @param tagStart       值1
     * @param tagEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagNotBetween(String tagStart,String tagEnd){
        String tag =entity().getTag();
        if(tag!=null && tagEnd!=null){
            notBetween("tag",tagStart,tagEnd);
        }
        return this;
     }


    /**
     * <p>标签</p>
     * LIKE '%值%' entity().getTag()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagLike(){
        String tag =entity().getTag();
        if(tag!=null){
            like("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * NOT LIKE '%值%' entity().getTag()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagNotLike(){
        String tag =entity().getTag();
        if(tag!=null){
            notLike("tag",tag);
        }
        return this;
     }


    /**
     * <p>标签</p>
     * LIKE '%值' entity().getTag()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagLikeLeft(){
        String tag =entity().getTag();
        if(tag!=null){
            likeLeft("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * LIKE '值%' entity().getTag()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagLikeRight(){
        String tag =entity().getTag();
        if(tag!=null){
            likeRight("tag",tag);
        }
        return this;
     }

/**
     * <p>标签</p>
     * 等于 =
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagEq(String tag){
        if(tag!=null){
            eq("tag",tag);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * 不等于 &lt;&gt;
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagNe(String tag){
        if(tag!=null){
            ne("tag",tag);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * 大于 &gt;
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagGt(String tag){
        if(tag!=null){
            gt("tag",tag);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * 大于等于 &gt;=
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagGe(String tag){
        if(tag!=null){
            ge("tag",tag);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * 小于 &lt;
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagLt(String tag){
        if(tag!=null){
            lt("tag",tag);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * 小于等于 &lt;=
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagLe(String tag){
        if(tag!=null){
            le("tag",tag);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * LIKE '%值%'
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagLike(String tag){
        if(tag!=null){
            like("tag",tag);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * NOT LIKE '%值%'
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagNotLike(String tag){
        if(tag!=null){
            notLike("tag",tag);
        }
        return this;
    }


    /**
     * <p>标签</p>
     * LIKE '%值'
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagLikeLeft(String tag){
        if(tag!=null){
            likeLeft("tag",tag);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * LIKE '值%'
     * @param tag       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagLikeRight(String tag){
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
    public BaiduDeviceUpdateEntityWrapper tagIsNull(){
        isNull("tag");
        return this;
    }

    /**
     * <p>标签</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagIsNotNull(){
        isNotNull("tag");
        return this;
    }

    /**
     * <p>标签</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper tagIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper tagIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper tagNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper tagNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("tag",values);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * 等于 = entity().getCaptureOk()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkEq(){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null){
            eq("capture_ok",captureOk);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * 不等于 &lt;&gt; entity().getCaptureOk()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkNe(){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null){
            ne("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * 大于 &gt; entity().getCaptureOk()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkGt(){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null){
            gt("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * 大于等于 &gt;= entity().getCaptureOk()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkGe(){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null){
            ge("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * 小于 &lt; entity().getCaptureOk()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkLt(){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null){
            lt("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * 小于等于 &lt;= entity().getCaptureOk()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkLe(){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null){
            le("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * BETWEEN  entity().getCaptureOk() AND 值2
     * @param captureOkEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkBetween(Boolean captureOkEnd){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null && captureOkEnd!=null){
            between("capture_ok",captureOk,captureOkEnd);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * NOT BETWEEN  entity().getCaptureOk() AND 值2
     * @param captureOkEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkNotBetween(Boolean captureOkEnd){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null && captureOkEnd!=null){
            notBetween("capture_ok",captureOk,captureOkEnd);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * BETWEEN  entity().getCaptureOk() AND 值2
     * @param captureOkStart       值1
     * @param captureOkEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkBetween(Boolean captureOkStart,Boolean captureOkEnd){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null && captureOkEnd!=null){
            between("capture_ok",captureOkStart,captureOkEnd);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * NOT BETWEEN  entity().getCaptureOk() AND 值2
     * @param captureOkStart       值1
     * @param captureOkEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkNotBetween(Boolean captureOkStart,Boolean captureOkEnd){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null && captureOkEnd!=null){
            notBetween("capture_ok",captureOkStart,captureOkEnd);
        }
        return this;
     }


    /**
     * <p>截图是否正常</p>
     * LIKE '%值%' entity().getCaptureOk()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkLike(){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null){
            like("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * NOT LIKE '%值%' entity().getCaptureOk()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkNotLike(){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null){
            notLike("capture_ok",captureOk);
        }
        return this;
     }


    /**
     * <p>截图是否正常</p>
     * LIKE '%值' entity().getCaptureOk()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkLikeLeft(){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null){
            likeLeft("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * LIKE '值%' entity().getCaptureOk()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkLikeRight(){
        Boolean captureOk =entity().getCaptureOk();
        if(captureOk!=null){
            likeRight("capture_ok",captureOk);
        }
        return this;
     }

/**
     * <p>截图是否正常</p>
     * 等于 =
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkEq(Boolean captureOk){
        if(captureOk!=null){
            eq("capture_ok",captureOk);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * 不等于 &lt;&gt;
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkNe(Boolean captureOk){
        if(captureOk!=null){
            ne("capture_ok",captureOk);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * 大于 &gt;
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkGt(Boolean captureOk){
        if(captureOk!=null){
            gt("capture_ok",captureOk);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * 大于等于 &gt;=
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkGe(Boolean captureOk){
        if(captureOk!=null){
            ge("capture_ok",captureOk);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * 小于 &lt;
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkLt(Boolean captureOk){
        if(captureOk!=null){
            lt("capture_ok",captureOk);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * 小于等于 &lt;=
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkLe(Boolean captureOk){
        if(captureOk!=null){
            le("capture_ok",captureOk);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * LIKE '%值%'
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkLike(Boolean captureOk){
        if(captureOk!=null){
            like("capture_ok",captureOk);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * NOT LIKE '%值%'
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkNotLike(Boolean captureOk){
        if(captureOk!=null){
            notLike("capture_ok",captureOk);
        }
        return this;
    }


    /**
     * <p>截图是否正常</p>
     * LIKE '%值'
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkLikeLeft(Boolean captureOk){
        if(captureOk!=null){
            likeLeft("capture_ok",captureOk);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * LIKE '值%'
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkLikeRight(Boolean captureOk){
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
    public BaiduDeviceUpdateEntityWrapper captureOkIsNull(){
        isNull("capture_ok");
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkIsNotNull(){
        isNotNull("capture_ok");
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper captureOkIn(Collection<Boolean> value){
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
    public BaiduDeviceUpdateEntityWrapper captureOkIn(Boolean... values){
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
    public BaiduDeviceUpdateEntityWrapper captureOkNotIn(Collection<Boolean> value){
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
    public BaiduDeviceUpdateEntityWrapper captureOkNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("capture_ok",values);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 等于 = entity().getCapDiff()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffEq(){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null){
            eq("cap_diff",capDiff);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 不等于 &lt;&gt; entity().getCapDiff()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffNe(){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null){
            ne("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 大于 &gt; entity().getCapDiff()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffGt(){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null){
            gt("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 大于等于 &gt;= entity().getCapDiff()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffGe(){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null){
            ge("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 小于 &lt; entity().getCapDiff()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffLt(){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null){
            lt("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 小于等于 &lt;= entity().getCapDiff()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffLe(){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null){
            le("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * BETWEEN  entity().getCapDiff() AND 值2
     * @param capDiffEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffBetween(Integer capDiffEnd){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null && capDiffEnd!=null){
            between("cap_diff",capDiff,capDiffEnd);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * NOT BETWEEN  entity().getCapDiff() AND 值2
     * @param capDiffEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffNotBetween(Integer capDiffEnd){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null && capDiffEnd!=null){
            notBetween("cap_diff",capDiff,capDiffEnd);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * BETWEEN  entity().getCapDiff() AND 值2
     * @param capDiffStart       值1
     * @param capDiffEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffBetween(Integer capDiffStart,Integer capDiffEnd){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null && capDiffEnd!=null){
            between("cap_diff",capDiffStart,capDiffEnd);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * NOT BETWEEN  entity().getCapDiff() AND 值2
     * @param capDiffStart       值1
     * @param capDiffEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffNotBetween(Integer capDiffStart,Integer capDiffEnd){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null && capDiffEnd!=null){
            notBetween("cap_diff",capDiffStart,capDiffEnd);
        }
        return this;
     }


    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * LIKE '%值%' entity().getCapDiff()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffLike(){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null){
            like("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * NOT LIKE '%值%' entity().getCapDiff()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffNotLike(){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null){
            notLike("cap_diff",capDiff);
        }
        return this;
     }


    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * LIKE '%值' entity().getCapDiff()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffLikeLeft(){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null){
            likeLeft("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * LIKE '值%' entity().getCapDiff()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffLikeRight(){
        Integer capDiff =entity().getCapDiff();
        if(capDiff!=null){
            likeRight("cap_diff",capDiff);
        }
        return this;
     }

/**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 等于 =
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffEq(Integer capDiff){
        if(capDiff!=null){
            eq("cap_diff",capDiff);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 不等于 &lt;&gt;
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffNe(Integer capDiff){
        if(capDiff!=null){
            ne("cap_diff",capDiff);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 大于 &gt;
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffGt(Integer capDiff){
        if(capDiff!=null){
            gt("cap_diff",capDiff);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 大于等于 &gt;=
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffGe(Integer capDiff){
        if(capDiff!=null){
            ge("cap_diff",capDiff);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 小于 &lt;
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffLt(Integer capDiff){
        if(capDiff!=null){
            lt("cap_diff",capDiff);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 小于等于 &lt;=
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffLe(Integer capDiff){
        if(capDiff!=null){
            le("cap_diff",capDiff);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * LIKE '%值%'
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffLike(Integer capDiff){
        if(capDiff!=null){
            like("cap_diff",capDiff);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * NOT LIKE '%值%'
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffNotLike(Integer capDiff){
        if(capDiff!=null){
            notLike("cap_diff",capDiff);
        }
        return this;
    }


    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * LIKE '%值'
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffLikeLeft(Integer capDiff){
        if(capDiff!=null){
            likeLeft("cap_diff",capDiff);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * LIKE '值%'
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffLikeRight(Integer capDiff){
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
    public BaiduDeviceUpdateEntityWrapper capDiffIsNull(){
        isNull("cap_diff");
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffIsNotNull(){
        isNotNull("cap_diff");
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper capDiffIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper capDiffIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper capDiffNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper capDiffNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("cap_diff",values);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * 等于 = entity().getDgVersion()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionEq(){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null){
            eq("dg_version",dgVersion);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * 不等于 &lt;&gt; entity().getDgVersion()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionNe(){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null){
            ne("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * 大于 &gt; entity().getDgVersion()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionGt(){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null){
            gt("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * 大于等于 &gt;= entity().getDgVersion()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionGe(){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null){
            ge("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * 小于 &lt; entity().getDgVersion()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionLt(){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null){
            lt("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * 小于等于 &lt;= entity().getDgVersion()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionLe(){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null){
            le("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * BETWEEN  entity().getDgVersion() AND 值2
     * @param dgVersionEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionBetween(String dgVersionEnd){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null && dgVersionEnd!=null){
            between("dg_version",dgVersion,dgVersionEnd);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * NOT BETWEEN  entity().getDgVersion() AND 值2
     * @param dgVersionEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionNotBetween(String dgVersionEnd){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null && dgVersionEnd!=null){
            notBetween("dg_version",dgVersion,dgVersionEnd);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * BETWEEN  entity().getDgVersion() AND 值2
     * @param dgVersionStart       值1
     * @param dgVersionEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionBetween(String dgVersionStart,String dgVersionEnd){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null && dgVersionEnd!=null){
            between("dg_version",dgVersionStart,dgVersionEnd);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * NOT BETWEEN  entity().getDgVersion() AND 值2
     * @param dgVersionStart       值1
     * @param dgVersionEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionNotBetween(String dgVersionStart,String dgVersionEnd){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null && dgVersionEnd!=null){
            notBetween("dg_version",dgVersionStart,dgVersionEnd);
        }
        return this;
     }


    /**
     * <p>dg相应字段</p>
     * LIKE '%值%' entity().getDgVersion()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionLike(){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null){
            like("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * NOT LIKE '%值%' entity().getDgVersion()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionNotLike(){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null){
            notLike("dg_version",dgVersion);
        }
        return this;
     }


    /**
     * <p>dg相应字段</p>
     * LIKE '%值' entity().getDgVersion()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionLikeLeft(){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null){
            likeLeft("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * LIKE '值%' entity().getDgVersion()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionLikeRight(){
        String dgVersion =entity().getDgVersion();
        if(dgVersion!=null){
            likeRight("dg_version",dgVersion);
        }
        return this;
     }

/**
     * <p>dg相应字段</p>
     * 等于 =
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionEq(String dgVersion){
        if(dgVersion!=null){
            eq("dg_version",dgVersion);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * 不等于 &lt;&gt;
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionNe(String dgVersion){
        if(dgVersion!=null){
            ne("dg_version",dgVersion);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * 大于 &gt;
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionGt(String dgVersion){
        if(dgVersion!=null){
            gt("dg_version",dgVersion);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * 大于等于 &gt;=
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionGe(String dgVersion){
        if(dgVersion!=null){
            ge("dg_version",dgVersion);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * 小于 &lt;
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionLt(String dgVersion){
        if(dgVersion!=null){
            lt("dg_version",dgVersion);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * 小于等于 &lt;=
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionLe(String dgVersion){
        if(dgVersion!=null){
            le("dg_version",dgVersion);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * LIKE '%值%'
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionLike(String dgVersion){
        if(dgVersion!=null){
            like("dg_version",dgVersion);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * NOT LIKE '%值%'
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionNotLike(String dgVersion){
        if(dgVersion!=null){
            notLike("dg_version",dgVersion);
        }
        return this;
    }


    /**
     * <p>dg相应字段</p>
     * LIKE '%值'
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionLikeLeft(String dgVersion){
        if(dgVersion!=null){
            likeLeft("dg_version",dgVersion);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * LIKE '值%'
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionLikeRight(String dgVersion){
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
    public BaiduDeviceUpdateEntityWrapper dgVersionIsNull(){
        isNull("dg_version");
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionIsNotNull(){
        isNotNull("dg_version");
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgVersionIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper dgVersionNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_version",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgVersionCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeEq(){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null){
            eq("dg_version_code",dgVersionCode);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgVersionCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeNe(){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null){
            ne("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgVersionCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeGt(){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null){
            gt("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgVersionCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeGe(){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null){
            ge("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgVersionCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeLt(){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null){
            lt("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgVersionCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeLe(){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null){
            le("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgVersionCode() AND 值2
     * @param dgVersionCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeBetween(String dgVersionCodeEnd){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null && dgVersionCodeEnd!=null){
            between("dg_version_code",dgVersionCode,dgVersionCodeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgVersionCode() AND 值2
     * @param dgVersionCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeNotBetween(String dgVersionCodeEnd){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null && dgVersionCodeEnd!=null){
            notBetween("dg_version_code",dgVersionCode,dgVersionCodeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgVersionCode() AND 值2
     * @param dgVersionCodeStart       值1
     * @param dgVersionCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeBetween(String dgVersionCodeStart,String dgVersionCodeEnd){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null && dgVersionCodeEnd!=null){
            between("dg_version_code",dgVersionCodeStart,dgVersionCodeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgVersionCode() AND 值2
     * @param dgVersionCodeStart       值1
     * @param dgVersionCodeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeNotBetween(String dgVersionCodeStart,String dgVersionCodeEnd){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null && dgVersionCodeEnd!=null){
            notBetween("dg_version_code",dgVersionCodeStart,dgVersionCodeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgVersionCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeLike(){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null){
            like("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgVersionCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeNotLike(){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null){
            notLike("dg_version_code",dgVersionCode);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgVersionCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeLikeLeft(){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null){
            likeLeft("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgVersionCode()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeLikeRight(){
        String dgVersionCode =entity().getDgVersionCode();
        if(dgVersionCode!=null){
            likeRight("dg_version_code",dgVersionCode);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeEq(String dgVersionCode){
        if(dgVersionCode!=null){
            eq("dg_version_code",dgVersionCode);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeNe(String dgVersionCode){
        if(dgVersionCode!=null){
            ne("dg_version_code",dgVersionCode);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeGt(String dgVersionCode){
        if(dgVersionCode!=null){
            gt("dg_version_code",dgVersionCode);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeGe(String dgVersionCode){
        if(dgVersionCode!=null){
            ge("dg_version_code",dgVersionCode);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeLt(String dgVersionCode){
        if(dgVersionCode!=null){
            lt("dg_version_code",dgVersionCode);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeLe(String dgVersionCode){
        if(dgVersionCode!=null){
            le("dg_version_code",dgVersionCode);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeLike(String dgVersionCode){
        if(dgVersionCode!=null){
            like("dg_version_code",dgVersionCode);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeNotLike(String dgVersionCode){
        if(dgVersionCode!=null){
            notLike("dg_version_code",dgVersionCode);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeLikeLeft(String dgVersionCode){
        if(dgVersionCode!=null){
            likeLeft("dg_version_code",dgVersionCode);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeLikeRight(String dgVersionCode){
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
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeIsNull(){
        isNull("dg_version_code");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeIsNotNull(){
        isNotNull("dg_version_code");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgVersionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_version_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgXmStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusEq(){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null){
            eq("dg_xm_status",dgXmStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgXmStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusNe(){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null){
            ne("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgXmStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusGt(){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null){
            gt("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgXmStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusGe(){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null){
            ge("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgXmStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusLt(){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null){
            lt("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgXmStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusLe(){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null){
            le("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgXmStatus() AND 值2
     * @param dgXmStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusBetween(String dgXmStatusEnd){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null && dgXmStatusEnd!=null){
            between("dg_xm_status",dgXmStatus,dgXmStatusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgXmStatus() AND 值2
     * @param dgXmStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusNotBetween(String dgXmStatusEnd){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null && dgXmStatusEnd!=null){
            notBetween("dg_xm_status",dgXmStatus,dgXmStatusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgXmStatus() AND 值2
     * @param dgXmStatusStart       值1
     * @param dgXmStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusBetween(String dgXmStatusStart,String dgXmStatusEnd){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null && dgXmStatusEnd!=null){
            between("dg_xm_status",dgXmStatusStart,dgXmStatusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgXmStatus() AND 值2
     * @param dgXmStatusStart       值1
     * @param dgXmStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusNotBetween(String dgXmStatusStart,String dgXmStatusEnd){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null && dgXmStatusEnd!=null){
            notBetween("dg_xm_status",dgXmStatusStart,dgXmStatusEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgXmStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusLike(){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null){
            like("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgXmStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusNotLike(){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null){
            notLike("dg_xm_status",dgXmStatus);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgXmStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusLikeLeft(){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null){
            likeLeft("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgXmStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusLikeRight(){
        String dgXmStatus =entity().getDgXmStatus();
        if(dgXmStatus!=null){
            likeRight("dg_xm_status",dgXmStatus);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusEq(String dgXmStatus){
        if(dgXmStatus!=null){
            eq("dg_xm_status",dgXmStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusNe(String dgXmStatus){
        if(dgXmStatus!=null){
            ne("dg_xm_status",dgXmStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusGt(String dgXmStatus){
        if(dgXmStatus!=null){
            gt("dg_xm_status",dgXmStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusGe(String dgXmStatus){
        if(dgXmStatus!=null){
            ge("dg_xm_status",dgXmStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusLt(String dgXmStatus){
        if(dgXmStatus!=null){
            lt("dg_xm_status",dgXmStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusLe(String dgXmStatus){
        if(dgXmStatus!=null){
            le("dg_xm_status",dgXmStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusLike(String dgXmStatus){
        if(dgXmStatus!=null){
            like("dg_xm_status",dgXmStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusNotLike(String dgXmStatus){
        if(dgXmStatus!=null){
            notLike("dg_xm_status",dgXmStatus);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusLikeLeft(String dgXmStatus){
        if(dgXmStatus!=null){
            likeLeft("dg_xm_status",dgXmStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusLikeRight(String dgXmStatus){
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
    public BaiduDeviceUpdateEntityWrapper dgXmStatusIsNull(){
        isNull("dg_xm_status");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusIsNotNull(){
        isNotNull("dg_xm_status");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgXmStatusIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgXmStatusIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper dgXmStatusNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgXmStatusNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_xm_status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgTopApp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppEq(){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null){
            eq("dg_top_app",dgTopApp);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgTopApp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppNe(){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null){
            ne("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgTopApp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppGt(){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null){
            gt("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgTopApp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppGe(){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null){
            ge("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgTopApp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppLt(){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null){
            lt("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgTopApp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppLe(){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null){
            le("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgTopApp() AND 值2
     * @param dgTopAppEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppBetween(String dgTopAppEnd){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null && dgTopAppEnd!=null){
            between("dg_top_app",dgTopApp,dgTopAppEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgTopApp() AND 值2
     * @param dgTopAppEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppNotBetween(String dgTopAppEnd){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null && dgTopAppEnd!=null){
            notBetween("dg_top_app",dgTopApp,dgTopAppEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgTopApp() AND 值2
     * @param dgTopAppStart       值1
     * @param dgTopAppEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppBetween(String dgTopAppStart,String dgTopAppEnd){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null && dgTopAppEnd!=null){
            between("dg_top_app",dgTopAppStart,dgTopAppEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgTopApp() AND 值2
     * @param dgTopAppStart       值1
     * @param dgTopAppEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppNotBetween(String dgTopAppStart,String dgTopAppEnd){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null && dgTopAppEnd!=null){
            notBetween("dg_top_app",dgTopAppStart,dgTopAppEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgTopApp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppLike(){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null){
            like("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgTopApp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppNotLike(){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null){
            notLike("dg_top_app",dgTopApp);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgTopApp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppLikeLeft(){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null){
            likeLeft("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgTopApp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppLikeRight(){
        String dgTopApp =entity().getDgTopApp();
        if(dgTopApp!=null){
            likeRight("dg_top_app",dgTopApp);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppEq(String dgTopApp){
        if(dgTopApp!=null){
            eq("dg_top_app",dgTopApp);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppNe(String dgTopApp){
        if(dgTopApp!=null){
            ne("dg_top_app",dgTopApp);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppGt(String dgTopApp){
        if(dgTopApp!=null){
            gt("dg_top_app",dgTopApp);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppGe(String dgTopApp){
        if(dgTopApp!=null){
            ge("dg_top_app",dgTopApp);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppLt(String dgTopApp){
        if(dgTopApp!=null){
            lt("dg_top_app",dgTopApp);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppLe(String dgTopApp){
        if(dgTopApp!=null){
            le("dg_top_app",dgTopApp);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppLike(String dgTopApp){
        if(dgTopApp!=null){
            like("dg_top_app",dgTopApp);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppNotLike(String dgTopApp){
        if(dgTopApp!=null){
            notLike("dg_top_app",dgTopApp);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppLikeLeft(String dgTopApp){
        if(dgTopApp!=null){
            likeLeft("dg_top_app",dgTopApp);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppLikeRight(String dgTopApp){
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
    public BaiduDeviceUpdateEntityWrapper dgTopAppIsNull(){
        isNull("dg_top_app");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppIsNotNull(){
        isNotNull("dg_top_app");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgTopAppIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgTopAppIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper dgTopAppNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgTopAppNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_top_app",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgDisplayWidth()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthEq(){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null){
            eq("dg_display_width",dgDisplayWidth);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgDisplayWidth()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthNe(){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null){
            ne("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgDisplayWidth()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthGt(){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null){
            gt("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgDisplayWidth()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthGe(){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null){
            ge("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgDisplayWidth()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthLt(){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null){
            lt("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgDisplayWidth()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthLe(){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null){
            le("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgDisplayWidth() AND 值2
     * @param dgDisplayWidthEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthBetween(Integer dgDisplayWidthEnd){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null && dgDisplayWidthEnd!=null){
            between("dg_display_width",dgDisplayWidth,dgDisplayWidthEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgDisplayWidth() AND 值2
     * @param dgDisplayWidthEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthNotBetween(Integer dgDisplayWidthEnd){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null && dgDisplayWidthEnd!=null){
            notBetween("dg_display_width",dgDisplayWidth,dgDisplayWidthEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgDisplayWidth() AND 值2
     * @param dgDisplayWidthStart       值1
     * @param dgDisplayWidthEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthBetween(Integer dgDisplayWidthStart,Integer dgDisplayWidthEnd){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null && dgDisplayWidthEnd!=null){
            between("dg_display_width",dgDisplayWidthStart,dgDisplayWidthEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgDisplayWidth() AND 值2
     * @param dgDisplayWidthStart       值1
     * @param dgDisplayWidthEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthNotBetween(Integer dgDisplayWidthStart,Integer dgDisplayWidthEnd){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null && dgDisplayWidthEnd!=null){
            notBetween("dg_display_width",dgDisplayWidthStart,dgDisplayWidthEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgDisplayWidth()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthLike(){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null){
            like("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgDisplayWidth()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthNotLike(){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null){
            notLike("dg_display_width",dgDisplayWidth);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgDisplayWidth()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthLikeLeft(){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null){
            likeLeft("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgDisplayWidth()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthLikeRight(){
        Integer dgDisplayWidth =entity().getDgDisplayWidth();
        if(dgDisplayWidth!=null){
            likeRight("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthEq(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            eq("dg_display_width",dgDisplayWidth);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthNe(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            ne("dg_display_width",dgDisplayWidth);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthGt(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            gt("dg_display_width",dgDisplayWidth);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthGe(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            ge("dg_display_width",dgDisplayWidth);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthLt(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            lt("dg_display_width",dgDisplayWidth);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthLe(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            le("dg_display_width",dgDisplayWidth);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthLike(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            like("dg_display_width",dgDisplayWidth);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthNotLike(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            notLike("dg_display_width",dgDisplayWidth);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthLikeLeft(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            likeLeft("dg_display_width",dgDisplayWidth);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthLikeRight(Integer dgDisplayWidth){
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
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthIsNull(){
        isNull("dg_display_width");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthIsNotNull(){
        isNotNull("dg_display_width");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper dgDisplayWidthNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_display_width",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgAppsCount()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountEq(){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null){
            eq("dg_apps_count",dgAppsCount);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgAppsCount()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountNe(){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null){
            ne("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgAppsCount()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountGt(){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null){
            gt("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgAppsCount()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountGe(){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null){
            ge("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgAppsCount()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountLt(){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null){
            lt("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgAppsCount()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountLe(){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null){
            le("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgAppsCount() AND 值2
     * @param dgAppsCountEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountBetween(Integer dgAppsCountEnd){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null && dgAppsCountEnd!=null){
            between("dg_apps_count",dgAppsCount,dgAppsCountEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgAppsCount() AND 值2
     * @param dgAppsCountEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountNotBetween(Integer dgAppsCountEnd){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null && dgAppsCountEnd!=null){
            notBetween("dg_apps_count",dgAppsCount,dgAppsCountEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgAppsCount() AND 值2
     * @param dgAppsCountStart       值1
     * @param dgAppsCountEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountBetween(Integer dgAppsCountStart,Integer dgAppsCountEnd){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null && dgAppsCountEnd!=null){
            between("dg_apps_count",dgAppsCountStart,dgAppsCountEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgAppsCount() AND 值2
     * @param dgAppsCountStart       值1
     * @param dgAppsCountEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountNotBetween(Integer dgAppsCountStart,Integer dgAppsCountEnd){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null && dgAppsCountEnd!=null){
            notBetween("dg_apps_count",dgAppsCountStart,dgAppsCountEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgAppsCount()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountLike(){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null){
            like("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgAppsCount()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountNotLike(){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null){
            notLike("dg_apps_count",dgAppsCount);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgAppsCount()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountLikeLeft(){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null){
            likeLeft("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgAppsCount()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountLikeRight(){
        Integer dgAppsCount =entity().getDgAppsCount();
        if(dgAppsCount!=null){
            likeRight("dg_apps_count",dgAppsCount);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountEq(Integer dgAppsCount){
        if(dgAppsCount!=null){
            eq("dg_apps_count",dgAppsCount);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountNe(Integer dgAppsCount){
        if(dgAppsCount!=null){
            ne("dg_apps_count",dgAppsCount);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountGt(Integer dgAppsCount){
        if(dgAppsCount!=null){
            gt("dg_apps_count",dgAppsCount);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountGe(Integer dgAppsCount){
        if(dgAppsCount!=null){
            ge("dg_apps_count",dgAppsCount);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountLt(Integer dgAppsCount){
        if(dgAppsCount!=null){
            lt("dg_apps_count",dgAppsCount);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountLe(Integer dgAppsCount){
        if(dgAppsCount!=null){
            le("dg_apps_count",dgAppsCount);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountLike(Integer dgAppsCount){
        if(dgAppsCount!=null){
            like("dg_apps_count",dgAppsCount);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountNotLike(Integer dgAppsCount){
        if(dgAppsCount!=null){
            notLike("dg_apps_count",dgAppsCount);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountLikeLeft(Integer dgAppsCount){
        if(dgAppsCount!=null){
            likeLeft("dg_apps_count",dgAppsCount);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountLikeRight(Integer dgAppsCount){
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
    public BaiduDeviceUpdateEntityWrapper dgAppsCountIsNull(){
        isNull("dg_apps_count");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountIsNotNull(){
        isNotNull("dg_apps_count");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgAppsCountIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper dgAppsCountIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper dgAppsCountNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper dgAppsCountNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_apps_count",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgPropProduct()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductEq(){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null){
            eq("dg_prop_product",dgPropProduct);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgPropProduct()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductNe(){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null){
            ne("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgPropProduct()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductGt(){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null){
            gt("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgPropProduct()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductGe(){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null){
            ge("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgPropProduct()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductLt(){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null){
            lt("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgPropProduct()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductLe(){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null){
            le("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgPropProduct() AND 值2
     * @param dgPropProductEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductBetween(String dgPropProductEnd){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null && dgPropProductEnd!=null){
            between("dg_prop_product",dgPropProduct,dgPropProductEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgPropProduct() AND 值2
     * @param dgPropProductEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductNotBetween(String dgPropProductEnd){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null && dgPropProductEnd!=null){
            notBetween("dg_prop_product",dgPropProduct,dgPropProductEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgPropProduct() AND 值2
     * @param dgPropProductStart       值1
     * @param dgPropProductEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductBetween(String dgPropProductStart,String dgPropProductEnd){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null && dgPropProductEnd!=null){
            between("dg_prop_product",dgPropProductStart,dgPropProductEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgPropProduct() AND 值2
     * @param dgPropProductStart       值1
     * @param dgPropProductEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductNotBetween(String dgPropProductStart,String dgPropProductEnd){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null && dgPropProductEnd!=null){
            notBetween("dg_prop_product",dgPropProductStart,dgPropProductEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgPropProduct()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductLike(){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null){
            like("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgPropProduct()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductNotLike(){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null){
            notLike("dg_prop_product",dgPropProduct);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgPropProduct()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductLikeLeft(){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null){
            likeLeft("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgPropProduct()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductLikeRight(){
        String dgPropProduct =entity().getDgPropProduct();
        if(dgPropProduct!=null){
            likeRight("dg_prop_product",dgPropProduct);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductEq(String dgPropProduct){
        if(dgPropProduct!=null){
            eq("dg_prop_product",dgPropProduct);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductNe(String dgPropProduct){
        if(dgPropProduct!=null){
            ne("dg_prop_product",dgPropProduct);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductGt(String dgPropProduct){
        if(dgPropProduct!=null){
            gt("dg_prop_product",dgPropProduct);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductGe(String dgPropProduct){
        if(dgPropProduct!=null){
            ge("dg_prop_product",dgPropProduct);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductLt(String dgPropProduct){
        if(dgPropProduct!=null){
            lt("dg_prop_product",dgPropProduct);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductLe(String dgPropProduct){
        if(dgPropProduct!=null){
            le("dg_prop_product",dgPropProduct);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductLike(String dgPropProduct){
        if(dgPropProduct!=null){
            like("dg_prop_product",dgPropProduct);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductNotLike(String dgPropProduct){
        if(dgPropProduct!=null){
            notLike("dg_prop_product",dgPropProduct);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductLikeLeft(String dgPropProduct){
        if(dgPropProduct!=null){
            likeLeft("dg_prop_product",dgPropProduct);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductLikeRight(String dgPropProduct){
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
    public BaiduDeviceUpdateEntityWrapper dgPropProductIsNull(){
        isNull("dg_prop_product");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductIsNotNull(){
        isNotNull("dg_prop_product");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgPropProductIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgPropProductIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper dgPropProductNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgPropProductNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_prop_product",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgSimImei()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiEq(){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null){
            eq("dg_sim_imei",dgSimImei);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgSimImei()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiNe(){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null){
            ne("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgSimImei()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiGt(){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null){
            gt("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgSimImei()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiGe(){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null){
            ge("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgSimImei()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiLt(){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null){
            lt("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgSimImei()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiLe(){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null){
            le("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgSimImei() AND 值2
     * @param dgSimImeiEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiBetween(String dgSimImeiEnd){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null && dgSimImeiEnd!=null){
            between("dg_sim_imei",dgSimImei,dgSimImeiEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgSimImei() AND 值2
     * @param dgSimImeiEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiNotBetween(String dgSimImeiEnd){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null && dgSimImeiEnd!=null){
            notBetween("dg_sim_imei",dgSimImei,dgSimImeiEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgSimImei() AND 值2
     * @param dgSimImeiStart       值1
     * @param dgSimImeiEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiBetween(String dgSimImeiStart,String dgSimImeiEnd){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null && dgSimImeiEnd!=null){
            between("dg_sim_imei",dgSimImeiStart,dgSimImeiEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgSimImei() AND 值2
     * @param dgSimImeiStart       值1
     * @param dgSimImeiEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiNotBetween(String dgSimImeiStart,String dgSimImeiEnd){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null && dgSimImeiEnd!=null){
            notBetween("dg_sim_imei",dgSimImeiStart,dgSimImeiEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgSimImei()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiLike(){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null){
            like("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgSimImei()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiNotLike(){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null){
            notLike("dg_sim_imei",dgSimImei);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgSimImei()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiLikeLeft(){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null){
            likeLeft("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgSimImei()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiLikeRight(){
        String dgSimImei =entity().getDgSimImei();
        if(dgSimImei!=null){
            likeRight("dg_sim_imei",dgSimImei);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiEq(String dgSimImei){
        if(dgSimImei!=null){
            eq("dg_sim_imei",dgSimImei);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiNe(String dgSimImei){
        if(dgSimImei!=null){
            ne("dg_sim_imei",dgSimImei);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiGt(String dgSimImei){
        if(dgSimImei!=null){
            gt("dg_sim_imei",dgSimImei);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiGe(String dgSimImei){
        if(dgSimImei!=null){
            ge("dg_sim_imei",dgSimImei);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiLt(String dgSimImei){
        if(dgSimImei!=null){
            lt("dg_sim_imei",dgSimImei);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiLe(String dgSimImei){
        if(dgSimImei!=null){
            le("dg_sim_imei",dgSimImei);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiLike(String dgSimImei){
        if(dgSimImei!=null){
            like("dg_sim_imei",dgSimImei);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiNotLike(String dgSimImei){
        if(dgSimImei!=null){
            notLike("dg_sim_imei",dgSimImei);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiLikeLeft(String dgSimImei){
        if(dgSimImei!=null){
            likeLeft("dg_sim_imei",dgSimImei);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiLikeRight(String dgSimImei){
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
    public BaiduDeviceUpdateEntityWrapper dgSimImeiIsNull(){
        isNull("dg_sim_imei");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiIsNotNull(){
        isNotNull("dg_sim_imei");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgSimImeiIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgSimImeiIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper dgSimImeiNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgSimImeiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_sim_imei",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgNetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusEq(){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null){
            eq("dg_net_status",dgNetStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgNetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusNe(){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null){
            ne("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgNetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusGt(){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null){
            gt("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgNetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusGe(){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null){
            ge("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgNetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusLt(){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null){
            lt("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgNetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusLe(){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null){
            le("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgNetStatus() AND 值2
     * @param dgNetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusBetween(Integer dgNetStatusEnd){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null && dgNetStatusEnd!=null){
            between("dg_net_status",dgNetStatus,dgNetStatusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgNetStatus() AND 值2
     * @param dgNetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusNotBetween(Integer dgNetStatusEnd){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null && dgNetStatusEnd!=null){
            notBetween("dg_net_status",dgNetStatus,dgNetStatusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgNetStatus() AND 值2
     * @param dgNetStatusStart       值1
     * @param dgNetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusBetween(Integer dgNetStatusStart,Integer dgNetStatusEnd){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null && dgNetStatusEnd!=null){
            between("dg_net_status",dgNetStatusStart,dgNetStatusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgNetStatus() AND 值2
     * @param dgNetStatusStart       值1
     * @param dgNetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusNotBetween(Integer dgNetStatusStart,Integer dgNetStatusEnd){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null && dgNetStatusEnd!=null){
            notBetween("dg_net_status",dgNetStatusStart,dgNetStatusEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgNetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusLike(){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null){
            like("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgNetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusNotLike(){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null){
            notLike("dg_net_status",dgNetStatus);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgNetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusLikeLeft(){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null){
            likeLeft("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgNetStatus()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusLikeRight(){
        Integer dgNetStatus =entity().getDgNetStatus();
        if(dgNetStatus!=null){
            likeRight("dg_net_status",dgNetStatus);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusEq(Integer dgNetStatus){
        if(dgNetStatus!=null){
            eq("dg_net_status",dgNetStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusNe(Integer dgNetStatus){
        if(dgNetStatus!=null){
            ne("dg_net_status",dgNetStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusGt(Integer dgNetStatus){
        if(dgNetStatus!=null){
            gt("dg_net_status",dgNetStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusGe(Integer dgNetStatus){
        if(dgNetStatus!=null){
            ge("dg_net_status",dgNetStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusLt(Integer dgNetStatus){
        if(dgNetStatus!=null){
            lt("dg_net_status",dgNetStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusLe(Integer dgNetStatus){
        if(dgNetStatus!=null){
            le("dg_net_status",dgNetStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusLike(Integer dgNetStatus){
        if(dgNetStatus!=null){
            like("dg_net_status",dgNetStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusNotLike(Integer dgNetStatus){
        if(dgNetStatus!=null){
            notLike("dg_net_status",dgNetStatus);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusLikeLeft(Integer dgNetStatus){
        if(dgNetStatus!=null){
            likeLeft("dg_net_status",dgNetStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusLikeRight(Integer dgNetStatus){
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
    public BaiduDeviceUpdateEntityWrapper dgNetStatusIsNull(){
        isNull("dg_net_status");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusIsNotNull(){
        isNotNull("dg_net_status");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetStatusIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper dgNetStatusIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper dgNetStatusNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper dgNetStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_net_status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgNetBs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsEq(){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null){
            eq("dg_net_bs",dgNetBs);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgNetBs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsNe(){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null){
            ne("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgNetBs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsGt(){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null){
            gt("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgNetBs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsGe(){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null){
            ge("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgNetBs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsLt(){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null){
            lt("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgNetBs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsLe(){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null){
            le("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgNetBs() AND 值2
     * @param dgNetBsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsBetween(Integer dgNetBsEnd){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null && dgNetBsEnd!=null){
            between("dg_net_bs",dgNetBs,dgNetBsEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgNetBs() AND 值2
     * @param dgNetBsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsNotBetween(Integer dgNetBsEnd){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null && dgNetBsEnd!=null){
            notBetween("dg_net_bs",dgNetBs,dgNetBsEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgNetBs() AND 值2
     * @param dgNetBsStart       值1
     * @param dgNetBsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsBetween(Integer dgNetBsStart,Integer dgNetBsEnd){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null && dgNetBsEnd!=null){
            between("dg_net_bs",dgNetBsStart,dgNetBsEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgNetBs() AND 值2
     * @param dgNetBsStart       值1
     * @param dgNetBsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsNotBetween(Integer dgNetBsStart,Integer dgNetBsEnd){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null && dgNetBsEnd!=null){
            notBetween("dg_net_bs",dgNetBsStart,dgNetBsEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgNetBs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsLike(){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null){
            like("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgNetBs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsNotLike(){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null){
            notLike("dg_net_bs",dgNetBs);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgNetBs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsLikeLeft(){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null){
            likeLeft("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgNetBs()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsLikeRight(){
        Integer dgNetBs =entity().getDgNetBs();
        if(dgNetBs!=null){
            likeRight("dg_net_bs",dgNetBs);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsEq(Integer dgNetBs){
        if(dgNetBs!=null){
            eq("dg_net_bs",dgNetBs);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsNe(Integer dgNetBs){
        if(dgNetBs!=null){
            ne("dg_net_bs",dgNetBs);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsGt(Integer dgNetBs){
        if(dgNetBs!=null){
            gt("dg_net_bs",dgNetBs);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsGe(Integer dgNetBs){
        if(dgNetBs!=null){
            ge("dg_net_bs",dgNetBs);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsLt(Integer dgNetBs){
        if(dgNetBs!=null){
            lt("dg_net_bs",dgNetBs);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsLe(Integer dgNetBs){
        if(dgNetBs!=null){
            le("dg_net_bs",dgNetBs);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsLike(Integer dgNetBs){
        if(dgNetBs!=null){
            like("dg_net_bs",dgNetBs);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsNotLike(Integer dgNetBs){
        if(dgNetBs!=null){
            notLike("dg_net_bs",dgNetBs);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsLikeLeft(Integer dgNetBs){
        if(dgNetBs!=null){
            likeLeft("dg_net_bs",dgNetBs);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsLikeRight(Integer dgNetBs){
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
    public BaiduDeviceUpdateEntityWrapper dgNetBsIsNull(){
        isNull("dg_net_bs");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsIsNotNull(){
        isNotNull("dg_net_bs");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgNetBsIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper dgNetBsIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper dgNetBsNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper dgNetBsNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_net_bs",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgProxyHost()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostEq(){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null){
            eq("dg_proxy_host",dgProxyHost);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgProxyHost()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostNe(){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null){
            ne("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgProxyHost()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostGt(){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null){
            gt("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgProxyHost()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostGe(){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null){
            ge("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgProxyHost()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostLt(){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null){
            lt("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgProxyHost()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostLe(){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null){
            le("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgProxyHost() AND 值2
     * @param dgProxyHostEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostBetween(String dgProxyHostEnd){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null && dgProxyHostEnd!=null){
            between("dg_proxy_host",dgProxyHost,dgProxyHostEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgProxyHost() AND 值2
     * @param dgProxyHostEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostNotBetween(String dgProxyHostEnd){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null && dgProxyHostEnd!=null){
            notBetween("dg_proxy_host",dgProxyHost,dgProxyHostEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgProxyHost() AND 值2
     * @param dgProxyHostStart       值1
     * @param dgProxyHostEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostBetween(String dgProxyHostStart,String dgProxyHostEnd){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null && dgProxyHostEnd!=null){
            between("dg_proxy_host",dgProxyHostStart,dgProxyHostEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgProxyHost() AND 值2
     * @param dgProxyHostStart       值1
     * @param dgProxyHostEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostNotBetween(String dgProxyHostStart,String dgProxyHostEnd){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null && dgProxyHostEnd!=null){
            notBetween("dg_proxy_host",dgProxyHostStart,dgProxyHostEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgProxyHost()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostLike(){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null){
            like("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgProxyHost()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostNotLike(){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null){
            notLike("dg_proxy_host",dgProxyHost);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgProxyHost()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostLikeLeft(){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null){
            likeLeft("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgProxyHost()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostLikeRight(){
        String dgProxyHost =entity().getDgProxyHost();
        if(dgProxyHost!=null){
            likeRight("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostEq(String dgProxyHost){
        if(dgProxyHost!=null){
            eq("dg_proxy_host",dgProxyHost);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostNe(String dgProxyHost){
        if(dgProxyHost!=null){
            ne("dg_proxy_host",dgProxyHost);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostGt(String dgProxyHost){
        if(dgProxyHost!=null){
            gt("dg_proxy_host",dgProxyHost);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostGe(String dgProxyHost){
        if(dgProxyHost!=null){
            ge("dg_proxy_host",dgProxyHost);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostLt(String dgProxyHost){
        if(dgProxyHost!=null){
            lt("dg_proxy_host",dgProxyHost);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostLe(String dgProxyHost){
        if(dgProxyHost!=null){
            le("dg_proxy_host",dgProxyHost);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostLike(String dgProxyHost){
        if(dgProxyHost!=null){
            like("dg_proxy_host",dgProxyHost);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostNotLike(String dgProxyHost){
        if(dgProxyHost!=null){
            notLike("dg_proxy_host",dgProxyHost);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostLikeLeft(String dgProxyHost){
        if(dgProxyHost!=null){
            likeLeft("dg_proxy_host",dgProxyHost);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostLikeRight(String dgProxyHost){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyHostIsNull(){
        isNull("dg_proxy_host");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostIsNotNull(){
        isNotNull("dg_proxy_host");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyHostIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyHostIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyHostNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyHostNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_host",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgProxyPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortEq(){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null){
            eq("dg_proxy_port",dgProxyPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgProxyPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortNe(){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null){
            ne("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgProxyPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortGt(){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null){
            gt("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgProxyPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortGe(){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null){
            ge("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgProxyPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortLt(){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null){
            lt("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgProxyPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortLe(){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null){
            le("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgProxyPort() AND 值2
     * @param dgProxyPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortBetween(Integer dgProxyPortEnd){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null && dgProxyPortEnd!=null){
            between("dg_proxy_port",dgProxyPort,dgProxyPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgProxyPort() AND 值2
     * @param dgProxyPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortNotBetween(Integer dgProxyPortEnd){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null && dgProxyPortEnd!=null){
            notBetween("dg_proxy_port",dgProxyPort,dgProxyPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgProxyPort() AND 值2
     * @param dgProxyPortStart       值1
     * @param dgProxyPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortBetween(Integer dgProxyPortStart,Integer dgProxyPortEnd){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null && dgProxyPortEnd!=null){
            between("dg_proxy_port",dgProxyPortStart,dgProxyPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgProxyPort() AND 值2
     * @param dgProxyPortStart       值1
     * @param dgProxyPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortNotBetween(Integer dgProxyPortStart,Integer dgProxyPortEnd){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null && dgProxyPortEnd!=null){
            notBetween("dg_proxy_port",dgProxyPortStart,dgProxyPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgProxyPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortLike(){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null){
            like("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgProxyPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortNotLike(){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null){
            notLike("dg_proxy_port",dgProxyPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgProxyPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortLikeLeft(){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null){
            likeLeft("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgProxyPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortLikeRight(){
        Integer dgProxyPort =entity().getDgProxyPort();
        if(dgProxyPort!=null){
            likeRight("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortEq(Integer dgProxyPort){
        if(dgProxyPort!=null){
            eq("dg_proxy_port",dgProxyPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortNe(Integer dgProxyPort){
        if(dgProxyPort!=null){
            ne("dg_proxy_port",dgProxyPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortGt(Integer dgProxyPort){
        if(dgProxyPort!=null){
            gt("dg_proxy_port",dgProxyPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortGe(Integer dgProxyPort){
        if(dgProxyPort!=null){
            ge("dg_proxy_port",dgProxyPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortLt(Integer dgProxyPort){
        if(dgProxyPort!=null){
            lt("dg_proxy_port",dgProxyPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortLe(Integer dgProxyPort){
        if(dgProxyPort!=null){
            le("dg_proxy_port",dgProxyPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortLike(Integer dgProxyPort){
        if(dgProxyPort!=null){
            like("dg_proxy_port",dgProxyPort);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortNotLike(Integer dgProxyPort){
        if(dgProxyPort!=null){
            notLike("dg_proxy_port",dgProxyPort);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortLikeLeft(Integer dgProxyPort){
        if(dgProxyPort!=null){
            likeLeft("dg_proxy_port",dgProxyPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortLikeRight(Integer dgProxyPort){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyPortIsNull(){
        isNull("dg_proxy_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortIsNotNull(){
        isNotNull("dg_proxy_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyPortIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyPortIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyPortNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgProxyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameEq(){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null){
            eq("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgProxyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameNe(){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null){
            ne("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgProxyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameGt(){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null){
            gt("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgProxyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameGe(){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null){
            ge("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgProxyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameLt(){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null){
            lt("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgProxyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameLe(){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null){
            le("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgProxyUsername() AND 值2
     * @param dgProxyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameBetween(String dgProxyUsernameEnd){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null && dgProxyUsernameEnd!=null){
            between("dg_proxy_username",dgProxyUsername,dgProxyUsernameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgProxyUsername() AND 值2
     * @param dgProxyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameNotBetween(String dgProxyUsernameEnd){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null && dgProxyUsernameEnd!=null){
            notBetween("dg_proxy_username",dgProxyUsername,dgProxyUsernameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgProxyUsername() AND 值2
     * @param dgProxyUsernameStart       值1
     * @param dgProxyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameBetween(String dgProxyUsernameStart,String dgProxyUsernameEnd){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null && dgProxyUsernameEnd!=null){
            between("dg_proxy_username",dgProxyUsernameStart,dgProxyUsernameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgProxyUsername() AND 值2
     * @param dgProxyUsernameStart       值1
     * @param dgProxyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameNotBetween(String dgProxyUsernameStart,String dgProxyUsernameEnd){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null && dgProxyUsernameEnd!=null){
            notBetween("dg_proxy_username",dgProxyUsernameStart,dgProxyUsernameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgProxyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameLike(){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null){
            like("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgProxyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameNotLike(){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null){
            notLike("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgProxyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameLikeLeft(){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null){
            likeLeft("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgProxyUsername()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameLikeRight(){
        String dgProxyUsername =entity().getDgProxyUsername();
        if(dgProxyUsername!=null){
            likeRight("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameEq(String dgProxyUsername){
        if(dgProxyUsername!=null){
            eq("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameNe(String dgProxyUsername){
        if(dgProxyUsername!=null){
            ne("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameGt(String dgProxyUsername){
        if(dgProxyUsername!=null){
            gt("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameGe(String dgProxyUsername){
        if(dgProxyUsername!=null){
            ge("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameLt(String dgProxyUsername){
        if(dgProxyUsername!=null){
            lt("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameLe(String dgProxyUsername){
        if(dgProxyUsername!=null){
            le("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameLike(String dgProxyUsername){
        if(dgProxyUsername!=null){
            like("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameNotLike(String dgProxyUsername){
        if(dgProxyUsername!=null){
            notLike("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameLikeLeft(String dgProxyUsername){
        if(dgProxyUsername!=null){
            likeLeft("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameLikeRight(String dgProxyUsername){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameIsNull(){
        isNull("dg_proxy_username");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameIsNotNull(){
        isNotNull("dg_proxy_username");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyUsernameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_username",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgProxyLocation()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationEq(){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null){
            eq("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgProxyLocation()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationNe(){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null){
            ne("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgProxyLocation()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationGt(){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null){
            gt("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgProxyLocation()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationGe(){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null){
            ge("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgProxyLocation()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationLt(){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null){
            lt("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgProxyLocation()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationLe(){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null){
            le("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgProxyLocation() AND 值2
     * @param dgProxyLocationEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationBetween(String dgProxyLocationEnd){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null && dgProxyLocationEnd!=null){
            between("dg_proxy_location",dgProxyLocation,dgProxyLocationEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgProxyLocation() AND 值2
     * @param dgProxyLocationEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationNotBetween(String dgProxyLocationEnd){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null && dgProxyLocationEnd!=null){
            notBetween("dg_proxy_location",dgProxyLocation,dgProxyLocationEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgProxyLocation() AND 值2
     * @param dgProxyLocationStart       值1
     * @param dgProxyLocationEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationBetween(String dgProxyLocationStart,String dgProxyLocationEnd){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null && dgProxyLocationEnd!=null){
            between("dg_proxy_location",dgProxyLocationStart,dgProxyLocationEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgProxyLocation() AND 值2
     * @param dgProxyLocationStart       值1
     * @param dgProxyLocationEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationNotBetween(String dgProxyLocationStart,String dgProxyLocationEnd){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null && dgProxyLocationEnd!=null){
            notBetween("dg_proxy_location",dgProxyLocationStart,dgProxyLocationEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgProxyLocation()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationLike(){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null){
            like("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgProxyLocation()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationNotLike(){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null){
            notLike("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgProxyLocation()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationLikeLeft(){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null){
            likeLeft("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgProxyLocation()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationLikeRight(){
        String dgProxyLocation =entity().getDgProxyLocation();
        if(dgProxyLocation!=null){
            likeRight("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationEq(String dgProxyLocation){
        if(dgProxyLocation!=null){
            eq("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationNe(String dgProxyLocation){
        if(dgProxyLocation!=null){
            ne("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationGt(String dgProxyLocation){
        if(dgProxyLocation!=null){
            gt("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationGe(String dgProxyLocation){
        if(dgProxyLocation!=null){
            ge("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationLt(String dgProxyLocation){
        if(dgProxyLocation!=null){
            lt("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationLe(String dgProxyLocation){
        if(dgProxyLocation!=null){
            le("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationLike(String dgProxyLocation){
        if(dgProxyLocation!=null){
            like("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationNotLike(String dgProxyLocation){
        if(dgProxyLocation!=null){
            notLike("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationLikeLeft(String dgProxyLocation){
        if(dgProxyLocation!=null){
            likeLeft("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationLikeRight(String dgProxyLocation){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationIsNull(){
        isNull("dg_proxy_location");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationIsNotNull(){
        isNotNull("dg_proxy_location");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyLocationNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_location",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getDgProxyIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpEq(){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null){
            eq("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getDgProxyIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpNe(){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null){
            ne("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getDgProxyIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpGt(){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null){
            gt("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getDgProxyIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpGe(){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null){
            ge("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getDgProxyIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpLt(){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null){
            lt("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getDgProxyIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpLe(){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null){
            le("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgProxyIp() AND 值2
     * @param dgProxyIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpBetween(String dgProxyIpEnd){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null && dgProxyIpEnd!=null){
            between("dg_proxy_ip",dgProxyIp,dgProxyIpEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgProxyIp() AND 值2
     * @param dgProxyIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpNotBetween(String dgProxyIpEnd){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null && dgProxyIpEnd!=null){
            notBetween("dg_proxy_ip",dgProxyIp,dgProxyIpEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getDgProxyIp() AND 值2
     * @param dgProxyIpStart       值1
     * @param dgProxyIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpBetween(String dgProxyIpStart,String dgProxyIpEnd){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null && dgProxyIpEnd!=null){
            between("dg_proxy_ip",dgProxyIpStart,dgProxyIpEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getDgProxyIp() AND 值2
     * @param dgProxyIpStart       值1
     * @param dgProxyIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpNotBetween(String dgProxyIpStart,String dgProxyIpEnd){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null && dgProxyIpEnd!=null){
            notBetween("dg_proxy_ip",dgProxyIpStart,dgProxyIpEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getDgProxyIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpLike(){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null){
            like("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getDgProxyIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpNotLike(){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null){
            notLike("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getDgProxyIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpLikeLeft(){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null){
            likeLeft("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getDgProxyIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpLikeRight(){
        String dgProxyIp =entity().getDgProxyIp();
        if(dgProxyIp!=null){
            likeRight("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpEq(String dgProxyIp){
        if(dgProxyIp!=null){
            eq("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpNe(String dgProxyIp){
        if(dgProxyIp!=null){
            ne("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpGt(String dgProxyIp){
        if(dgProxyIp!=null){
            gt("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpGe(String dgProxyIp){
        if(dgProxyIp!=null){
            ge("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpLt(String dgProxyIp){
        if(dgProxyIp!=null){
            lt("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpLe(String dgProxyIp){
        if(dgProxyIp!=null){
            le("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpLike(String dgProxyIp){
        if(dgProxyIp!=null){
            like("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpNotLike(String dgProxyIp){
        if(dgProxyIp!=null){
            notLike("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpLikeLeft(String dgProxyIp){
        if(dgProxyIp!=null){
            likeLeft("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpLikeRight(String dgProxyIp){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyIpIsNull(){
        isNull("dg_proxy_ip");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpIsNotNull(){
        isNotNull("dg_proxy_ip");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper dgProxyIpIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyIpIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyIpNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper dgProxyIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_ip",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public BaiduDeviceUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper createTimeIn(Date... values){
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
    public BaiduDeviceUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getLastSyncTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeEq(){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null){
            eq("last_sync_time",lastSyncTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getLastSyncTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeNe(){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null){
            ne("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getLastSyncTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeGt(){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null){
            gt("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getLastSyncTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeGe(){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null){
            ge("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getLastSyncTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeLt(){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null){
            lt("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getLastSyncTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeLe(){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null){
            le("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastSyncTime() AND 值2
     * @param lastSyncTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeBetween(Date lastSyncTimeEnd){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null && lastSyncTimeEnd!=null){
            between("last_sync_time",lastSyncTime,lastSyncTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastSyncTime() AND 值2
     * @param lastSyncTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeNotBetween(Date lastSyncTimeEnd){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null && lastSyncTimeEnd!=null){
            notBetween("last_sync_time",lastSyncTime,lastSyncTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastSyncTime() AND 值2
     * @param lastSyncTimeStart       值1
     * @param lastSyncTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeBetween(Date lastSyncTimeStart,Date lastSyncTimeEnd){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null && lastSyncTimeEnd!=null){
            between("last_sync_time",lastSyncTimeStart,lastSyncTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastSyncTime() AND 值2
     * @param lastSyncTimeStart       值1
     * @param lastSyncTimeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeNotBetween(Date lastSyncTimeStart,Date lastSyncTimeEnd){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null && lastSyncTimeEnd!=null){
            notBetween("last_sync_time",lastSyncTimeStart,lastSyncTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getLastSyncTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeLike(){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null){
            like("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getLastSyncTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeNotLike(){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null){
            notLike("last_sync_time",lastSyncTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getLastSyncTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeLikeLeft(){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null){
            likeLeft("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getLastSyncTime()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeLikeRight(){
        Date lastSyncTime =entity().getLastSyncTime();
        if(lastSyncTime!=null){
            likeRight("last_sync_time",lastSyncTime);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeEq(Date lastSyncTime){
        if(lastSyncTime!=null){
            eq("last_sync_time",lastSyncTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeNe(Date lastSyncTime){
        if(lastSyncTime!=null){
            ne("last_sync_time",lastSyncTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeGt(Date lastSyncTime){
        if(lastSyncTime!=null){
            gt("last_sync_time",lastSyncTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeGe(Date lastSyncTime){
        if(lastSyncTime!=null){
            ge("last_sync_time",lastSyncTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeLt(Date lastSyncTime){
        if(lastSyncTime!=null){
            lt("last_sync_time",lastSyncTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeLe(Date lastSyncTime){
        if(lastSyncTime!=null){
            le("last_sync_time",lastSyncTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeLike(Date lastSyncTime){
        if(lastSyncTime!=null){
            like("last_sync_time",lastSyncTime);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeNotLike(Date lastSyncTime){
        if(lastSyncTime!=null){
            notLike("last_sync_time",lastSyncTime);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeLikeLeft(Date lastSyncTime){
        if(lastSyncTime!=null){
            likeLeft("last_sync_time",lastSyncTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeLikeRight(Date lastSyncTime){
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
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeIsNull(){
        isNull("last_sync_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeIsNotNull(){
        isNotNull("last_sync_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeIn(Date... values){
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
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeNotIn(Collection<Date> value){
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
    public BaiduDeviceUpdateEntityWrapper lastSyncTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_sync_time",values);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * 等于 = entity().getFkCloudRegionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdEq(){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null){
            eq("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * 不等于 &lt;&gt; entity().getFkCloudRegionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdNe(){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null){
            ne("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * 大于 &gt; entity().getFkCloudRegionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdGt(){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null){
            gt("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * 大于等于 &gt;= entity().getFkCloudRegionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdGe(){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null){
            ge("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * 小于 &lt; entity().getFkCloudRegionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdLt(){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null){
            lt("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * 小于等于 &lt;= entity().getFkCloudRegionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdLe(){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null){
            le("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * BETWEEN  entity().getFkCloudRegionId() AND 值2
     * @param fkCloudRegionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdBetween(Long fkCloudRegionIdEnd){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null && fkCloudRegionIdEnd!=null){
            between("fk_cloud_region_id",fkCloudRegionId,fkCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * NOT BETWEEN  entity().getFkCloudRegionId() AND 值2
     * @param fkCloudRegionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdNotBetween(Long fkCloudRegionIdEnd){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null && fkCloudRegionIdEnd!=null){
            notBetween("fk_cloud_region_id",fkCloudRegionId,fkCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * BETWEEN  entity().getFkCloudRegionId() AND 值2
     * @param fkCloudRegionIdStart       值1
     * @param fkCloudRegionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdBetween(Long fkCloudRegionIdStart,Long fkCloudRegionIdEnd){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null && fkCloudRegionIdEnd!=null){
            between("fk_cloud_region_id",fkCloudRegionIdStart,fkCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * NOT BETWEEN  entity().getFkCloudRegionId() AND 值2
     * @param fkCloudRegionIdStart       值1
     * @param fkCloudRegionIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdNotBetween(Long fkCloudRegionIdStart,Long fkCloudRegionIdEnd){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null && fkCloudRegionIdEnd!=null){
            notBetween("fk_cloud_region_id",fkCloudRegionIdStart,fkCloudRegionIdEnd);
        }
        return this;
     }


    /**
     * <p>机房表区域id</p>
     * LIKE '%值%' entity().getFkCloudRegionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdLike(){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null){
            like("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * NOT LIKE '%值%' entity().getFkCloudRegionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdNotLike(){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null){
            notLike("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }


    /**
     * <p>机房表区域id</p>
     * LIKE '%值' entity().getFkCloudRegionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdLikeLeft(){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null){
            likeLeft("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * LIKE '值%' entity().getFkCloudRegionId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdLikeRight(){
        Long fkCloudRegionId =entity().getFkCloudRegionId();
        if(fkCloudRegionId!=null){
            likeRight("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

/**
     * <p>机房表区域id</p>
     * 等于 =
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdEq(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            eq("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * 不等于 &lt;&gt;
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdNe(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            ne("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * 大于 &gt;
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdGt(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            gt("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * 大于等于 &gt;=
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdGe(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            ge("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * 小于 &lt;
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdLt(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            lt("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * 小于等于 &lt;=
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdLe(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            le("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * LIKE '%值%'
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdLike(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            like("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * NOT LIKE '%值%'
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdNotLike(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            notLike("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }


    /**
     * <p>机房表区域id</p>
     * LIKE '%值'
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdLikeLeft(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            likeLeft("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * LIKE '值%'
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdLikeRight(Long fkCloudRegionId){
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
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdIsNull(){
        isNull("fk_cloud_region_id");
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdIsNotNull(){
        isNotNull("fk_cloud_region_id");
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdIn(Collection<Long> value){
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
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdIn(Long... values){
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
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdNotIn(Collection<Long> value){
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
    public BaiduDeviceUpdateEntityWrapper fkCloudRegionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_cloud_region_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getPubIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpEq(){
        String pubIp =entity().getPubIp();
        if(pubIp!=null){
            eq("pub_ip",pubIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getPubIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpNe(){
        String pubIp =entity().getPubIp();
        if(pubIp!=null){
            ne("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getPubIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpGt(){
        String pubIp =entity().getPubIp();
        if(pubIp!=null){
            gt("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getPubIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpGe(){
        String pubIp =entity().getPubIp();
        if(pubIp!=null){
            ge("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getPubIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpLt(){
        String pubIp =entity().getPubIp();
        if(pubIp!=null){
            lt("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getPubIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpLe(){
        String pubIp =entity().getPubIp();
        if(pubIp!=null){
            le("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getPubIp() AND 值2
     * @param pubIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpBetween(String pubIpEnd){
        String pubIp =entity().getPubIp();
        if(pubIp!=null && pubIpEnd!=null){
            between("pub_ip",pubIp,pubIpEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getPubIp() AND 值2
     * @param pubIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpNotBetween(String pubIpEnd){
        String pubIp =entity().getPubIp();
        if(pubIp!=null && pubIpEnd!=null){
            notBetween("pub_ip",pubIp,pubIpEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getPubIp() AND 值2
     * @param pubIpStart       值1
     * @param pubIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpBetween(String pubIpStart,String pubIpEnd){
        String pubIp =entity().getPubIp();
        if(pubIp!=null && pubIpEnd!=null){
            between("pub_ip",pubIpStart,pubIpEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getPubIp() AND 值2
     * @param pubIpStart       值1
     * @param pubIpEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpNotBetween(String pubIpStart,String pubIpEnd){
        String pubIp =entity().getPubIp();
        if(pubIp!=null && pubIpEnd!=null){
            notBetween("pub_ip",pubIpStart,pubIpEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getPubIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpLike(){
        String pubIp =entity().getPubIp();
        if(pubIp!=null){
            like("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getPubIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpNotLike(){
        String pubIp =entity().getPubIp();
        if(pubIp!=null){
            notLike("pub_ip",pubIp);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getPubIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpLikeLeft(){
        String pubIp =entity().getPubIp();
        if(pubIp!=null){
            likeLeft("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getPubIp()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpLikeRight(){
        String pubIp =entity().getPubIp();
        if(pubIp!=null){
            likeRight("pub_ip",pubIp);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpEq(String pubIp){
        if(pubIp!=null){
            eq("pub_ip",pubIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpNe(String pubIp){
        if(pubIp!=null){
            ne("pub_ip",pubIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpGt(String pubIp){
        if(pubIp!=null){
            gt("pub_ip",pubIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpGe(String pubIp){
        if(pubIp!=null){
            ge("pub_ip",pubIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpLt(String pubIp){
        if(pubIp!=null){
            lt("pub_ip",pubIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpLe(String pubIp){
        if(pubIp!=null){
            le("pub_ip",pubIp);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpLike(String pubIp){
        if(pubIp!=null){
            like("pub_ip",pubIp);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpNotLike(String pubIp){
        if(pubIp!=null){
            notLike("pub_ip",pubIp);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpLikeLeft(String pubIp){
        if(pubIp!=null){
            likeLeft("pub_ip",pubIp);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpLikeRight(String pubIp){
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
    public BaiduDeviceUpdateEntityWrapper pubIpIsNull(){
        isNull("pub_ip");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpIsNotNull(){
        isNotNull("pub_ip");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper pubIpIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper pubIpIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper pubIpNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper pubIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("pub_ip",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getAudioSockType()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeEq(){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null){
            eq("audio_sock_type",audioSockType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getAudioSockType()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeNe(){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null){
            ne("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getAudioSockType()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeGt(){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null){
            gt("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getAudioSockType()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeGe(){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null){
            ge("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getAudioSockType()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeLt(){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null){
            lt("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getAudioSockType()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeLe(){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null){
            le("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getAudioSockType() AND 值2
     * @param audioSockTypeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeBetween(Integer audioSockTypeEnd){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null && audioSockTypeEnd!=null){
            between("audio_sock_type",audioSockType,audioSockTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getAudioSockType() AND 值2
     * @param audioSockTypeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeNotBetween(Integer audioSockTypeEnd){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null && audioSockTypeEnd!=null){
            notBetween("audio_sock_type",audioSockType,audioSockTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getAudioSockType() AND 值2
     * @param audioSockTypeStart       值1
     * @param audioSockTypeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeBetween(Integer audioSockTypeStart,Integer audioSockTypeEnd){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null && audioSockTypeEnd!=null){
            between("audio_sock_type",audioSockTypeStart,audioSockTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getAudioSockType() AND 值2
     * @param audioSockTypeStart       值1
     * @param audioSockTypeEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeNotBetween(Integer audioSockTypeStart,Integer audioSockTypeEnd){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null && audioSockTypeEnd!=null){
            notBetween("audio_sock_type",audioSockTypeStart,audioSockTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getAudioSockType()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeLike(){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null){
            like("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getAudioSockType()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeNotLike(){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null){
            notLike("audio_sock_type",audioSockType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getAudioSockType()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeLikeLeft(){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null){
            likeLeft("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getAudioSockType()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeLikeRight(){
        Integer audioSockType =entity().getAudioSockType();
        if(audioSockType!=null){
            likeRight("audio_sock_type",audioSockType);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeEq(Integer audioSockType){
        if(audioSockType!=null){
            eq("audio_sock_type",audioSockType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeNe(Integer audioSockType){
        if(audioSockType!=null){
            ne("audio_sock_type",audioSockType);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeGt(Integer audioSockType){
        if(audioSockType!=null){
            gt("audio_sock_type",audioSockType);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeGe(Integer audioSockType){
        if(audioSockType!=null){
            ge("audio_sock_type",audioSockType);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeLt(Integer audioSockType){
        if(audioSockType!=null){
            lt("audio_sock_type",audioSockType);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeLe(Integer audioSockType){
        if(audioSockType!=null){
            le("audio_sock_type",audioSockType);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeLike(Integer audioSockType){
        if(audioSockType!=null){
            like("audio_sock_type",audioSockType);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeNotLike(Integer audioSockType){
        if(audioSockType!=null){
            notLike("audio_sock_type",audioSockType);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeLikeLeft(Integer audioSockType){
        if(audioSockType!=null){
            likeLeft("audio_sock_type",audioSockType);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeLikeRight(Integer audioSockType){
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
    public BaiduDeviceUpdateEntityWrapper audioSockTypeIsNull(){
        isNull("audio_sock_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeIsNotNull(){
        isNotNull("audio_sock_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioSockTypeIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper audioSockTypeIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper audioSockTypeNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper audioSockTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("audio_sock_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getAudioPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortEq(){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null){
            eq("audio_port",audioPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getAudioPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortNe(){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null){
            ne("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getAudioPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortGt(){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null){
            gt("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getAudioPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortGe(){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null){
            ge("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getAudioPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortLt(){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null){
            lt("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getAudioPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortLe(){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null){
            le("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getAudioPort() AND 值2
     * @param audioPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortBetween(Integer audioPortEnd){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null && audioPortEnd!=null){
            between("audio_port",audioPort,audioPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getAudioPort() AND 值2
     * @param audioPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortNotBetween(Integer audioPortEnd){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null && audioPortEnd!=null){
            notBetween("audio_port",audioPort,audioPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getAudioPort() AND 值2
     * @param audioPortStart       值1
     * @param audioPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortBetween(Integer audioPortStart,Integer audioPortEnd){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null && audioPortEnd!=null){
            between("audio_port",audioPortStart,audioPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getAudioPort() AND 值2
     * @param audioPortStart       值1
     * @param audioPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortNotBetween(Integer audioPortStart,Integer audioPortEnd){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null && audioPortEnd!=null){
            notBetween("audio_port",audioPortStart,audioPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getAudioPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortLike(){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null){
            like("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getAudioPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortNotLike(){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null){
            notLike("audio_port",audioPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getAudioPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortLikeLeft(){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null){
            likeLeft("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getAudioPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortLikeRight(){
        Integer audioPort =entity().getAudioPort();
        if(audioPort!=null){
            likeRight("audio_port",audioPort);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortEq(Integer audioPort){
        if(audioPort!=null){
            eq("audio_port",audioPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortNe(Integer audioPort){
        if(audioPort!=null){
            ne("audio_port",audioPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortGt(Integer audioPort){
        if(audioPort!=null){
            gt("audio_port",audioPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortGe(Integer audioPort){
        if(audioPort!=null){
            ge("audio_port",audioPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortLt(Integer audioPort){
        if(audioPort!=null){
            lt("audio_port",audioPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortLe(Integer audioPort){
        if(audioPort!=null){
            le("audio_port",audioPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortLike(Integer audioPort){
        if(audioPort!=null){
            like("audio_port",audioPort);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortNotLike(Integer audioPort){
        if(audioPort!=null){
            notLike("audio_port",audioPort);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortLikeLeft(Integer audioPort){
        if(audioPort!=null){
            likeLeft("audio_port",audioPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortLikeRight(Integer audioPort){
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
    public BaiduDeviceUpdateEntityWrapper audioPortIsNull(){
        isNull("audio_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortIsNotNull(){
        isNotNull("audio_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioPortIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper audioPortIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper audioPortNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper audioPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("audio_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getAudioExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortEq(){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null){
            eq("audio_external_port",audioExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getAudioExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortNe(){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null){
            ne("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getAudioExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortGt(){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null){
            gt("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getAudioExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortGe(){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null){
            ge("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getAudioExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortLt(){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null){
            lt("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getAudioExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortLe(){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null){
            le("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getAudioExternalPort() AND 值2
     * @param audioExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortBetween(Integer audioExternalPortEnd){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null && audioExternalPortEnd!=null){
            between("audio_external_port",audioExternalPort,audioExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getAudioExternalPort() AND 值2
     * @param audioExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortNotBetween(Integer audioExternalPortEnd){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null && audioExternalPortEnd!=null){
            notBetween("audio_external_port",audioExternalPort,audioExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getAudioExternalPort() AND 值2
     * @param audioExternalPortStart       值1
     * @param audioExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortBetween(Integer audioExternalPortStart,Integer audioExternalPortEnd){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null && audioExternalPortEnd!=null){
            between("audio_external_port",audioExternalPortStart,audioExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getAudioExternalPort() AND 值2
     * @param audioExternalPortStart       值1
     * @param audioExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortNotBetween(Integer audioExternalPortStart,Integer audioExternalPortEnd){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null && audioExternalPortEnd!=null){
            notBetween("audio_external_port",audioExternalPortStart,audioExternalPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getAudioExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortLike(){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null){
            like("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getAudioExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortNotLike(){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null){
            notLike("audio_external_port",audioExternalPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getAudioExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortLikeLeft(){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null){
            likeLeft("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getAudioExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortLikeRight(){
        Integer audioExternalPort =entity().getAudioExternalPort();
        if(audioExternalPort!=null){
            likeRight("audio_external_port",audioExternalPort);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortEq(Integer audioExternalPort){
        if(audioExternalPort!=null){
            eq("audio_external_port",audioExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortNe(Integer audioExternalPort){
        if(audioExternalPort!=null){
            ne("audio_external_port",audioExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortGt(Integer audioExternalPort){
        if(audioExternalPort!=null){
            gt("audio_external_port",audioExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortGe(Integer audioExternalPort){
        if(audioExternalPort!=null){
            ge("audio_external_port",audioExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortLt(Integer audioExternalPort){
        if(audioExternalPort!=null){
            lt("audio_external_port",audioExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortLe(Integer audioExternalPort){
        if(audioExternalPort!=null){
            le("audio_external_port",audioExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortLike(Integer audioExternalPort){
        if(audioExternalPort!=null){
            like("audio_external_port",audioExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortNotLike(Integer audioExternalPort){
        if(audioExternalPort!=null){
            notLike("audio_external_port",audioExternalPort);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortLikeLeft(Integer audioExternalPort){
        if(audioExternalPort!=null){
            likeLeft("audio_external_port",audioExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortLikeRight(Integer audioExternalPort){
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
    public BaiduDeviceUpdateEntityWrapper audioExternalPortIsNull(){
        isNull("audio_external_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortIsNotNull(){
        isNotNull("audio_external_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper audioExternalPortIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper audioExternalPortIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper audioExternalPortNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper audioExternalPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("audio_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getVideoPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortEq(){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null){
            eq("video_port",videoPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVideoPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortNe(){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null){
            ne("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVideoPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortGt(){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null){
            gt("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVideoPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortGe(){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null){
            ge("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVideoPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortLt(){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null){
            lt("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVideoPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortLe(){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null){
            le("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVideoPort() AND 值2
     * @param videoPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortBetween(Integer videoPortEnd){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null && videoPortEnd!=null){
            between("video_port",videoPort,videoPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVideoPort() AND 值2
     * @param videoPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortNotBetween(Integer videoPortEnd){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null && videoPortEnd!=null){
            notBetween("video_port",videoPort,videoPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVideoPort() AND 值2
     * @param videoPortStart       值1
     * @param videoPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortBetween(Integer videoPortStart,Integer videoPortEnd){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null && videoPortEnd!=null){
            between("video_port",videoPortStart,videoPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVideoPort() AND 值2
     * @param videoPortStart       值1
     * @param videoPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortNotBetween(Integer videoPortStart,Integer videoPortEnd){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null && videoPortEnd!=null){
            notBetween("video_port",videoPortStart,videoPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getVideoPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortLike(){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null){
            like("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getVideoPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortNotLike(){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null){
            notLike("video_port",videoPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getVideoPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortLikeLeft(){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null){
            likeLeft("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getVideoPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortLikeRight(){
        Integer videoPort =entity().getVideoPort();
        if(videoPort!=null){
            likeRight("video_port",videoPort);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortEq(Integer videoPort){
        if(videoPort!=null){
            eq("video_port",videoPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortNe(Integer videoPort){
        if(videoPort!=null){
            ne("video_port",videoPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortGt(Integer videoPort){
        if(videoPort!=null){
            gt("video_port",videoPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortGe(Integer videoPort){
        if(videoPort!=null){
            ge("video_port",videoPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortLt(Integer videoPort){
        if(videoPort!=null){
            lt("video_port",videoPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortLe(Integer videoPort){
        if(videoPort!=null){
            le("video_port",videoPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortLike(Integer videoPort){
        if(videoPort!=null){
            like("video_port",videoPort);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortNotLike(Integer videoPort){
        if(videoPort!=null){
            notLike("video_port",videoPort);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortLikeLeft(Integer videoPort){
        if(videoPort!=null){
            likeLeft("video_port",videoPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortLikeRight(Integer videoPort){
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
    public BaiduDeviceUpdateEntityWrapper videoPortIsNull(){
        isNull("video_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortIsNotNull(){
        isNotNull("video_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoPortIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper videoPortIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper videoPortNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper videoPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("video_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getVideoExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortEq(){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null){
            eq("video_external_port",videoExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVideoExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortNe(){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null){
            ne("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVideoExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortGt(){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null){
            gt("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVideoExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortGe(){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null){
            ge("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVideoExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortLt(){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null){
            lt("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVideoExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortLe(){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null){
            le("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVideoExternalPort() AND 值2
     * @param videoExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortBetween(Integer videoExternalPortEnd){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null && videoExternalPortEnd!=null){
            between("video_external_port",videoExternalPort,videoExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVideoExternalPort() AND 值2
     * @param videoExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortNotBetween(Integer videoExternalPortEnd){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null && videoExternalPortEnd!=null){
            notBetween("video_external_port",videoExternalPort,videoExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVideoExternalPort() AND 值2
     * @param videoExternalPortStart       值1
     * @param videoExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortBetween(Integer videoExternalPortStart,Integer videoExternalPortEnd){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null && videoExternalPortEnd!=null){
            between("video_external_port",videoExternalPortStart,videoExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVideoExternalPort() AND 值2
     * @param videoExternalPortStart       值1
     * @param videoExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortNotBetween(Integer videoExternalPortStart,Integer videoExternalPortEnd){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null && videoExternalPortEnd!=null){
            notBetween("video_external_port",videoExternalPortStart,videoExternalPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getVideoExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortLike(){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null){
            like("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getVideoExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortNotLike(){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null){
            notLike("video_external_port",videoExternalPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getVideoExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortLikeLeft(){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null){
            likeLeft("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getVideoExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortLikeRight(){
        Integer videoExternalPort =entity().getVideoExternalPort();
        if(videoExternalPort!=null){
            likeRight("video_external_port",videoExternalPort);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortEq(Integer videoExternalPort){
        if(videoExternalPort!=null){
            eq("video_external_port",videoExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortNe(Integer videoExternalPort){
        if(videoExternalPort!=null){
            ne("video_external_port",videoExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortGt(Integer videoExternalPort){
        if(videoExternalPort!=null){
            gt("video_external_port",videoExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortGe(Integer videoExternalPort){
        if(videoExternalPort!=null){
            ge("video_external_port",videoExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortLt(Integer videoExternalPort){
        if(videoExternalPort!=null){
            lt("video_external_port",videoExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortLe(Integer videoExternalPort){
        if(videoExternalPort!=null){
            le("video_external_port",videoExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortLike(Integer videoExternalPort){
        if(videoExternalPort!=null){
            like("video_external_port",videoExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortNotLike(Integer videoExternalPort){
        if(videoExternalPort!=null){
            notLike("video_external_port",videoExternalPort);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortLikeLeft(Integer videoExternalPort){
        if(videoExternalPort!=null){
            likeLeft("video_external_port",videoExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortLikeRight(Integer videoExternalPort){
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
    public BaiduDeviceUpdateEntityWrapper videoExternalPortIsNull(){
        isNull("video_external_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortIsNotNull(){
        isNotNull("video_external_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper videoExternalPortIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper videoExternalPortIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper videoExternalPortNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper videoExternalPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("video_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getMaxslots()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsEq(){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null){
            eq("maxslots",maxslots);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getMaxslots()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsNe(){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null){
            ne("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getMaxslots()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsGt(){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null){
            gt("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getMaxslots()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsGe(){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null){
            ge("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getMaxslots()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsLt(){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null){
            lt("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getMaxslots()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsLe(){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null){
            le("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getMaxslots() AND 值2
     * @param maxslotsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsBetween(Integer maxslotsEnd){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null && maxslotsEnd!=null){
            between("maxslots",maxslots,maxslotsEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getMaxslots() AND 值2
     * @param maxslotsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsNotBetween(Integer maxslotsEnd){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null && maxslotsEnd!=null){
            notBetween("maxslots",maxslots,maxslotsEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getMaxslots() AND 值2
     * @param maxslotsStart       值1
     * @param maxslotsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsBetween(Integer maxslotsStart,Integer maxslotsEnd){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null && maxslotsEnd!=null){
            between("maxslots",maxslotsStart,maxslotsEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getMaxslots() AND 值2
     * @param maxslotsStart       值1
     * @param maxslotsEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsNotBetween(Integer maxslotsStart,Integer maxslotsEnd){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null && maxslotsEnd!=null){
            notBetween("maxslots",maxslotsStart,maxslotsEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getMaxslots()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsLike(){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null){
            like("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getMaxslots()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsNotLike(){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null){
            notLike("maxslots",maxslots);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getMaxslots()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsLikeLeft(){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null){
            likeLeft("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getMaxslots()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsLikeRight(){
        Integer maxslots =entity().getMaxslots();
        if(maxslots!=null){
            likeRight("maxslots",maxslots);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsEq(Integer maxslots){
        if(maxslots!=null){
            eq("maxslots",maxslots);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsNe(Integer maxslots){
        if(maxslots!=null){
            ne("maxslots",maxslots);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsGt(Integer maxslots){
        if(maxslots!=null){
            gt("maxslots",maxslots);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsGe(Integer maxslots){
        if(maxslots!=null){
            ge("maxslots",maxslots);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsLt(Integer maxslots){
        if(maxslots!=null){
            lt("maxslots",maxslots);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsLe(Integer maxslots){
        if(maxslots!=null){
            le("maxslots",maxslots);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsLike(Integer maxslots){
        if(maxslots!=null){
            like("maxslots",maxslots);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsNotLike(Integer maxslots){
        if(maxslots!=null){
            notLike("maxslots",maxslots);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsLikeLeft(Integer maxslots){
        if(maxslots!=null){
            likeLeft("maxslots",maxslots);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsLikeRight(Integer maxslots){
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
    public BaiduDeviceUpdateEntityWrapper maxslotsIsNull(){
        isNull("maxslots");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsIsNotNull(){
        isNotNull("maxslots");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper maxslotsIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper maxslotsIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper maxslotsNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper maxslotsNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("maxslots",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getRtcMinPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortEq(){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null){
            eq("rtc_min_port",rtcMinPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getRtcMinPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortNe(){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null){
            ne("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getRtcMinPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortGt(){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null){
            gt("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getRtcMinPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortGe(){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null){
            ge("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getRtcMinPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortLt(){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null){
            lt("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getRtcMinPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortLe(){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null){
            le("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRtcMinPort() AND 值2
     * @param rtcMinPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortBetween(Integer rtcMinPortEnd){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null && rtcMinPortEnd!=null){
            between("rtc_min_port",rtcMinPort,rtcMinPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRtcMinPort() AND 值2
     * @param rtcMinPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortNotBetween(Integer rtcMinPortEnd){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null && rtcMinPortEnd!=null){
            notBetween("rtc_min_port",rtcMinPort,rtcMinPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRtcMinPort() AND 值2
     * @param rtcMinPortStart       值1
     * @param rtcMinPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortBetween(Integer rtcMinPortStart,Integer rtcMinPortEnd){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null && rtcMinPortEnd!=null){
            between("rtc_min_port",rtcMinPortStart,rtcMinPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRtcMinPort() AND 值2
     * @param rtcMinPortStart       值1
     * @param rtcMinPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortNotBetween(Integer rtcMinPortStart,Integer rtcMinPortEnd){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null && rtcMinPortEnd!=null){
            notBetween("rtc_min_port",rtcMinPortStart,rtcMinPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getRtcMinPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortLike(){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null){
            like("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getRtcMinPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortNotLike(){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null){
            notLike("rtc_min_port",rtcMinPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getRtcMinPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortLikeLeft(){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null){
            likeLeft("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getRtcMinPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortLikeRight(){
        Integer rtcMinPort =entity().getRtcMinPort();
        if(rtcMinPort!=null){
            likeRight("rtc_min_port",rtcMinPort);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortEq(Integer rtcMinPort){
        if(rtcMinPort!=null){
            eq("rtc_min_port",rtcMinPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortNe(Integer rtcMinPort){
        if(rtcMinPort!=null){
            ne("rtc_min_port",rtcMinPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortGt(Integer rtcMinPort){
        if(rtcMinPort!=null){
            gt("rtc_min_port",rtcMinPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortGe(Integer rtcMinPort){
        if(rtcMinPort!=null){
            ge("rtc_min_port",rtcMinPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortLt(Integer rtcMinPort){
        if(rtcMinPort!=null){
            lt("rtc_min_port",rtcMinPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortLe(Integer rtcMinPort){
        if(rtcMinPort!=null){
            le("rtc_min_port",rtcMinPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortLike(Integer rtcMinPort){
        if(rtcMinPort!=null){
            like("rtc_min_port",rtcMinPort);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortNotLike(Integer rtcMinPort){
        if(rtcMinPort!=null){
            notLike("rtc_min_port",rtcMinPort);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortLikeLeft(Integer rtcMinPort){
        if(rtcMinPort!=null){
            likeLeft("rtc_min_port",rtcMinPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortLikeRight(Integer rtcMinPort){
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
    public BaiduDeviceUpdateEntityWrapper rtcMinPortIsNull(){
        isNull("rtc_min_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortIsNotNull(){
        isNotNull("rtc_min_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinPortIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper rtcMinPortIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper rtcMinPortNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper rtcMinPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rtc_min_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getRtcMaxPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortEq(){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null){
            eq("rtc_max_port",rtcMaxPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getRtcMaxPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortNe(){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null){
            ne("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getRtcMaxPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortGt(){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null){
            gt("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getRtcMaxPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortGe(){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null){
            ge("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getRtcMaxPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortLt(){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null){
            lt("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getRtcMaxPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortLe(){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null){
            le("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRtcMaxPort() AND 值2
     * @param rtcMaxPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortBetween(Integer rtcMaxPortEnd){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null && rtcMaxPortEnd!=null){
            between("rtc_max_port",rtcMaxPort,rtcMaxPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRtcMaxPort() AND 值2
     * @param rtcMaxPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortNotBetween(Integer rtcMaxPortEnd){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null && rtcMaxPortEnd!=null){
            notBetween("rtc_max_port",rtcMaxPort,rtcMaxPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRtcMaxPort() AND 值2
     * @param rtcMaxPortStart       值1
     * @param rtcMaxPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortBetween(Integer rtcMaxPortStart,Integer rtcMaxPortEnd){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null && rtcMaxPortEnd!=null){
            between("rtc_max_port",rtcMaxPortStart,rtcMaxPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRtcMaxPort() AND 值2
     * @param rtcMaxPortStart       值1
     * @param rtcMaxPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortNotBetween(Integer rtcMaxPortStart,Integer rtcMaxPortEnd){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null && rtcMaxPortEnd!=null){
            notBetween("rtc_max_port",rtcMaxPortStart,rtcMaxPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getRtcMaxPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortLike(){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null){
            like("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getRtcMaxPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortNotLike(){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null){
            notLike("rtc_max_port",rtcMaxPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getRtcMaxPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortLikeLeft(){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null){
            likeLeft("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getRtcMaxPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortLikeRight(){
        Integer rtcMaxPort =entity().getRtcMaxPort();
        if(rtcMaxPort!=null){
            likeRight("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortEq(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            eq("rtc_max_port",rtcMaxPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortNe(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            ne("rtc_max_port",rtcMaxPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortGt(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            gt("rtc_max_port",rtcMaxPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortGe(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            ge("rtc_max_port",rtcMaxPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortLt(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            lt("rtc_max_port",rtcMaxPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortLe(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            le("rtc_max_port",rtcMaxPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortLike(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            like("rtc_max_port",rtcMaxPort);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortNotLike(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            notLike("rtc_max_port",rtcMaxPort);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortLikeLeft(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            likeLeft("rtc_max_port",rtcMaxPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortLikeRight(Integer rtcMaxPort){
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
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortIsNull(){
        isNull("rtc_max_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortIsNotNull(){
        isNotNull("rtc_max_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper rtcMaxPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rtc_max_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getRtcMinExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortEq(){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null){
            eq("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getRtcMinExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortNe(){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null){
            ne("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getRtcMinExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortGt(){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null){
            gt("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getRtcMinExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortGe(){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null){
            ge("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getRtcMinExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortLt(){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null){
            lt("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getRtcMinExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortLe(){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null){
            le("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRtcMinExternalPort() AND 值2
     * @param rtcMinExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortBetween(Integer rtcMinExternalPortEnd){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null && rtcMinExternalPortEnd!=null){
            between("rtc_min_external_port",rtcMinExternalPort,rtcMinExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRtcMinExternalPort() AND 值2
     * @param rtcMinExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortNotBetween(Integer rtcMinExternalPortEnd){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null && rtcMinExternalPortEnd!=null){
            notBetween("rtc_min_external_port",rtcMinExternalPort,rtcMinExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRtcMinExternalPort() AND 值2
     * @param rtcMinExternalPortStart       值1
     * @param rtcMinExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortBetween(Integer rtcMinExternalPortStart,Integer rtcMinExternalPortEnd){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null && rtcMinExternalPortEnd!=null){
            between("rtc_min_external_port",rtcMinExternalPortStart,rtcMinExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRtcMinExternalPort() AND 值2
     * @param rtcMinExternalPortStart       值1
     * @param rtcMinExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortNotBetween(Integer rtcMinExternalPortStart,Integer rtcMinExternalPortEnd){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null && rtcMinExternalPortEnd!=null){
            notBetween("rtc_min_external_port",rtcMinExternalPortStart,rtcMinExternalPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getRtcMinExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortLike(){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null){
            like("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getRtcMinExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortNotLike(){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null){
            notLike("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getRtcMinExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortLikeLeft(){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null){
            likeLeft("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getRtcMinExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortLikeRight(){
        Integer rtcMinExternalPort =entity().getRtcMinExternalPort();
        if(rtcMinExternalPort!=null){
            likeRight("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortEq(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            eq("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortNe(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            ne("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortGt(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            gt("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortGe(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            ge("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortLt(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            lt("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortLe(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            le("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortLike(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            like("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortNotLike(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            notLike("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortLikeLeft(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            likeLeft("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortLikeRight(Integer rtcMinExternalPort){
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
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortIsNull(){
        isNull("rtc_min_external_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortIsNotNull(){
        isNotNull("rtc_min_external_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper rtcMinExternalPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rtc_min_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getRtcMaxExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortEq(){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null){
            eq("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getRtcMaxExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortNe(){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null){
            ne("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getRtcMaxExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortGt(){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null){
            gt("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getRtcMaxExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortGe(){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null){
            ge("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getRtcMaxExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortLt(){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null){
            lt("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getRtcMaxExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortLe(){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null){
            le("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRtcMaxExternalPort() AND 值2
     * @param rtcMaxExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortBetween(Integer rtcMaxExternalPortEnd){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null && rtcMaxExternalPortEnd!=null){
            between("rtc_max_external_port",rtcMaxExternalPort,rtcMaxExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRtcMaxExternalPort() AND 值2
     * @param rtcMaxExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortNotBetween(Integer rtcMaxExternalPortEnd){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null && rtcMaxExternalPortEnd!=null){
            notBetween("rtc_max_external_port",rtcMaxExternalPort,rtcMaxExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getRtcMaxExternalPort() AND 值2
     * @param rtcMaxExternalPortStart       值1
     * @param rtcMaxExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortBetween(Integer rtcMaxExternalPortStart,Integer rtcMaxExternalPortEnd){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null && rtcMaxExternalPortEnd!=null){
            between("rtc_max_external_port",rtcMaxExternalPortStart,rtcMaxExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getRtcMaxExternalPort() AND 值2
     * @param rtcMaxExternalPortStart       值1
     * @param rtcMaxExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortNotBetween(Integer rtcMaxExternalPortStart,Integer rtcMaxExternalPortEnd){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null && rtcMaxExternalPortEnd!=null){
            notBetween("rtc_max_external_port",rtcMaxExternalPortStart,rtcMaxExternalPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getRtcMaxExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortLike(){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null){
            like("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getRtcMaxExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortNotLike(){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null){
            notLike("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getRtcMaxExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortLikeLeft(){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null){
            likeLeft("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getRtcMaxExternalPort()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortLikeRight(){
        Integer rtcMaxExternalPort =entity().getRtcMaxExternalPort();
        if(rtcMaxExternalPort!=null){
            likeRight("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortEq(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            eq("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortNe(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            ne("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortGt(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            gt("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortGe(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            ge("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortLt(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            lt("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortLe(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            le("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortLike(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            like("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortNotLike(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            notLike("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortLikeLeft(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            likeLeft("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortLikeRight(Integer rtcMaxExternalPort){
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
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortIsNull(){
        isNull("rtc_max_external_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortIsNotNull(){
        isNotNull("rtc_max_external_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortIn(Integer... values){
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
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortNotIn(Collection<Integer> value){
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
    public BaiduDeviceUpdateEntityWrapper rtcMaxExternalPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rtc_max_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getResetTastUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidEq(){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null){
            eq("reset_tast_uid",resetTastUid);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getResetTastUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidNe(){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null){
            ne("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getResetTastUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidGt(){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null){
            gt("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getResetTastUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidGe(){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null){
            ge("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getResetTastUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidLt(){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null){
            lt("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getResetTastUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidLe(){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null){
            le("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getResetTastUid() AND 值2
     * @param resetTastUidEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidBetween(String resetTastUidEnd){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null && resetTastUidEnd!=null){
            between("reset_tast_uid",resetTastUid,resetTastUidEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getResetTastUid() AND 值2
     * @param resetTastUidEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidNotBetween(String resetTastUidEnd){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null && resetTastUidEnd!=null){
            notBetween("reset_tast_uid",resetTastUid,resetTastUidEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getResetTastUid() AND 值2
     * @param resetTastUidStart       值1
     * @param resetTastUidEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidBetween(String resetTastUidStart,String resetTastUidEnd){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null && resetTastUidEnd!=null){
            between("reset_tast_uid",resetTastUidStart,resetTastUidEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getResetTastUid() AND 值2
     * @param resetTastUidStart       值1
     * @param resetTastUidEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidNotBetween(String resetTastUidStart,String resetTastUidEnd){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null && resetTastUidEnd!=null){
            notBetween("reset_tast_uid",resetTastUidStart,resetTastUidEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getResetTastUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidLike(){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null){
            like("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getResetTastUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidNotLike(){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null){
            notLike("reset_tast_uid",resetTastUid);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getResetTastUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidLikeLeft(){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null){
            likeLeft("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getResetTastUid()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidLikeRight(){
        String resetTastUid =entity().getResetTastUid();
        if(resetTastUid!=null){
            likeRight("reset_tast_uid",resetTastUid);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidEq(String resetTastUid){
        if(resetTastUid!=null){
            eq("reset_tast_uid",resetTastUid);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidNe(String resetTastUid){
        if(resetTastUid!=null){
            ne("reset_tast_uid",resetTastUid);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidGt(String resetTastUid){
        if(resetTastUid!=null){
            gt("reset_tast_uid",resetTastUid);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidGe(String resetTastUid){
        if(resetTastUid!=null){
            ge("reset_tast_uid",resetTastUid);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidLt(String resetTastUid){
        if(resetTastUid!=null){
            lt("reset_tast_uid",resetTastUid);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidLe(String resetTastUid){
        if(resetTastUid!=null){
            le("reset_tast_uid",resetTastUid);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidLike(String resetTastUid){
        if(resetTastUid!=null){
            like("reset_tast_uid",resetTastUid);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidNotLike(String resetTastUid){
        if(resetTastUid!=null){
            notLike("reset_tast_uid",resetTastUid);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidLikeLeft(String resetTastUid){
        if(resetTastUid!=null){
            likeLeft("reset_tast_uid",resetTastUid);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidLikeRight(String resetTastUid){
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
    public BaiduDeviceUpdateEntityWrapper resetTastUidIsNull(){
        isNull("reset_tast_uid");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidIsNotNull(){
        isNotNull("reset_tast_uid");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetTastUidIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper resetTastUidIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper resetTastUidNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper resetTastUidNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_tast_uid",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getUploadImageTaskId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdEq(){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null){
            eq("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getUploadImageTaskId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdNe(){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null){
            ne("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getUploadImageTaskId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdGt(){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null){
            gt("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getUploadImageTaskId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdGe(){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null){
            ge("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getUploadImageTaskId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdLt(){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null){
            lt("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getUploadImageTaskId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdLe(){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null){
            le("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getUploadImageTaskId() AND 值2
     * @param uploadImageTaskIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdBetween(String uploadImageTaskIdEnd){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null && uploadImageTaskIdEnd!=null){
            between("upload_image_task_id",uploadImageTaskId,uploadImageTaskIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getUploadImageTaskId() AND 值2
     * @param uploadImageTaskIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdNotBetween(String uploadImageTaskIdEnd){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null && uploadImageTaskIdEnd!=null){
            notBetween("upload_image_task_id",uploadImageTaskId,uploadImageTaskIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getUploadImageTaskId() AND 值2
     * @param uploadImageTaskIdStart       值1
     * @param uploadImageTaskIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdBetween(String uploadImageTaskIdStart,String uploadImageTaskIdEnd){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null && uploadImageTaskIdEnd!=null){
            between("upload_image_task_id",uploadImageTaskIdStart,uploadImageTaskIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getUploadImageTaskId() AND 值2
     * @param uploadImageTaskIdStart       值1
     * @param uploadImageTaskIdEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdNotBetween(String uploadImageTaskIdStart,String uploadImageTaskIdEnd){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null && uploadImageTaskIdEnd!=null){
            notBetween("upload_image_task_id",uploadImageTaskIdStart,uploadImageTaskIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getUploadImageTaskId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdLike(){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null){
            like("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getUploadImageTaskId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdNotLike(){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null){
            notLike("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getUploadImageTaskId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdLikeLeft(){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null){
            likeLeft("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getUploadImageTaskId()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdLikeRight(){
        String uploadImageTaskId =entity().getUploadImageTaskId();
        if(uploadImageTaskId!=null){
            likeRight("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdEq(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            eq("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdNe(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            ne("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdGt(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            gt("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdGe(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            ge("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdLt(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            lt("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdLe(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            le("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdLike(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            like("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdNotLike(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            notLike("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdLikeLeft(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            likeLeft("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdLikeRight(String uploadImageTaskId){
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
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdIsNull(){
        isNull("upload_image_task_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdIsNotNull(){
        isNotNull("upload_image_task_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper uploadImageTaskIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("upload_image_task_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getResetReponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseEq(){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null){
            eq("reset_reponse",resetReponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getResetReponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseNe(){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null){
            ne("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getResetReponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseGt(){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null){
            gt("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getResetReponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseGe(){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null){
            ge("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getResetReponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseLt(){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null){
            lt("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getResetReponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseLe(){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null){
            le("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getResetReponse() AND 值2
     * @param resetReponseEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseBetween(String resetReponseEnd){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null && resetReponseEnd!=null){
            between("reset_reponse",resetReponse,resetReponseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getResetReponse() AND 值2
     * @param resetReponseEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseNotBetween(String resetReponseEnd){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null && resetReponseEnd!=null){
            notBetween("reset_reponse",resetReponse,resetReponseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getResetReponse() AND 值2
     * @param resetReponseStart       值1
     * @param resetReponseEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseBetween(String resetReponseStart,String resetReponseEnd){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null && resetReponseEnd!=null){
            between("reset_reponse",resetReponseStart,resetReponseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getResetReponse() AND 值2
     * @param resetReponseStart       值1
     * @param resetReponseEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseNotBetween(String resetReponseStart,String resetReponseEnd){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null && resetReponseEnd!=null){
            notBetween("reset_reponse",resetReponseStart,resetReponseEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getResetReponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseLike(){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null){
            like("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getResetReponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseNotLike(){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null){
            notLike("reset_reponse",resetReponse);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getResetReponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseLikeLeft(){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null){
            likeLeft("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getResetReponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseLikeRight(){
        String resetReponse =entity().getResetReponse();
        if(resetReponse!=null){
            likeRight("reset_reponse",resetReponse);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseEq(String resetReponse){
        if(resetReponse!=null){
            eq("reset_reponse",resetReponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseNe(String resetReponse){
        if(resetReponse!=null){
            ne("reset_reponse",resetReponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseGt(String resetReponse){
        if(resetReponse!=null){
            gt("reset_reponse",resetReponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseGe(String resetReponse){
        if(resetReponse!=null){
            ge("reset_reponse",resetReponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseLt(String resetReponse){
        if(resetReponse!=null){
            lt("reset_reponse",resetReponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseLe(String resetReponse){
        if(resetReponse!=null){
            le("reset_reponse",resetReponse);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseLike(String resetReponse){
        if(resetReponse!=null){
            like("reset_reponse",resetReponse);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseNotLike(String resetReponse){
        if(resetReponse!=null){
            notLike("reset_reponse",resetReponse);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseLikeLeft(String resetReponse){
        if(resetReponse!=null){
            likeLeft("reset_reponse",resetReponse);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseLikeRight(String resetReponse){
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
    public BaiduDeviceUpdateEntityWrapper resetReponseIsNull(){
        isNull("reset_reponse");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseIsNotNull(){
        isNotNull("reset_reponse");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper resetReponseIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper resetReponseIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper resetReponseNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper resetReponseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_reponse",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getUploadResponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseEq(){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null){
            eq("upload_response",uploadResponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getUploadResponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseNe(){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null){
            ne("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getUploadResponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseGt(){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null){
            gt("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getUploadResponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseGe(){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null){
            ge("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getUploadResponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseLt(){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null){
            lt("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getUploadResponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseLe(){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null){
            le("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getUploadResponse() AND 值2
     * @param uploadResponseEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseBetween(String uploadResponseEnd){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null && uploadResponseEnd!=null){
            between("upload_response",uploadResponse,uploadResponseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getUploadResponse() AND 值2
     * @param uploadResponseEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseNotBetween(String uploadResponseEnd){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null && uploadResponseEnd!=null){
            notBetween("upload_response",uploadResponse,uploadResponseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getUploadResponse() AND 值2
     * @param uploadResponseStart       值1
     * @param uploadResponseEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseBetween(String uploadResponseStart,String uploadResponseEnd){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null && uploadResponseEnd!=null){
            between("upload_response",uploadResponseStart,uploadResponseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getUploadResponse() AND 值2
     * @param uploadResponseStart       值1
     * @param uploadResponseEnd      值2
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseNotBetween(String uploadResponseStart,String uploadResponseEnd){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null && uploadResponseEnd!=null){
            notBetween("upload_response",uploadResponseStart,uploadResponseEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getUploadResponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseLike(){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null){
            like("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getUploadResponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseNotLike(){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null){
            notLike("upload_response",uploadResponse);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getUploadResponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseLikeLeft(){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null){
            likeLeft("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getUploadResponse()
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseLikeRight(){
        String uploadResponse =entity().getUploadResponse();
        if(uploadResponse!=null){
            likeRight("upload_response",uploadResponse);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseEq(String uploadResponse){
        if(uploadResponse!=null){
            eq("upload_response",uploadResponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseNe(String uploadResponse){
        if(uploadResponse!=null){
            ne("upload_response",uploadResponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseGt(String uploadResponse){
        if(uploadResponse!=null){
            gt("upload_response",uploadResponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseGe(String uploadResponse){
        if(uploadResponse!=null){
            ge("upload_response",uploadResponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseLt(String uploadResponse){
        if(uploadResponse!=null){
            lt("upload_response",uploadResponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseLe(String uploadResponse){
        if(uploadResponse!=null){
            le("upload_response",uploadResponse);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseLike(String uploadResponse){
        if(uploadResponse!=null){
            like("upload_response",uploadResponse);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseNotLike(String uploadResponse){
        if(uploadResponse!=null){
            notLike("upload_response",uploadResponse);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseLikeLeft(String uploadResponse){
        if(uploadResponse!=null){
            likeLeft("upload_response",uploadResponse);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseLikeRight(String uploadResponse){
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
    public BaiduDeviceUpdateEntityWrapper uploadResponseIsNull(){
        isNull("upload_response");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseIsNotNull(){
        isNotNull("upload_response");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceUpdateEntityWrapper uploadResponseIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper uploadResponseIn(String... values){
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
    public BaiduDeviceUpdateEntityWrapper uploadResponseNotIn(Collection<String> value){
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
    public BaiduDeviceUpdateEntityWrapper uploadResponseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("upload_response",values);
        }
        return this;
    }


}
