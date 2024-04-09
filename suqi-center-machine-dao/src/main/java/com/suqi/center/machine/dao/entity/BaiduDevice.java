package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.BaiduDeviceQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduDeviceUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduDeviceUpdateWrapper;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * <p>
 * 百度云机
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("baidu_device")
@ApiModel(value = "BaiduDevice对象", description = "百度云机")
public class BaiduDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("百度云机所属账号")
    @TableField("fk_baidu_account_id")
    private Long fkBaiduAccountId;

    @TableField("uid")
    private String uid;

    @ApiModelProperty("云机编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("云机所属分组")
    @TableField("group_code")
    private String groupCode;

    @ApiModelProperty("机房号")
    @TableField("idc_code")
    private String idcCode;

    @ApiModelProperty("当前镜像版本号")
    @TableField("image_version_id")
    private String imageVersionId;

    @ApiModelProperty("最后一次重置时间")
    @TableField("last_reset_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastResetTime;

    @ApiModelProperty("重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,")
    @TableField("reset_status")
    private Integer resetStatus;

    @ApiModelProperty("重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id")
    @TableField("reset_image_version_id")
    private String resetImageVersionId;

    @ApiModelProperty("交付的订单编号")
    @TableField("order_code")
    private String orderCode;

    @ApiModelProperty("交付日期的备注")
    @TableField("deliver_day")
    private String deliverDay;

    @ApiModelProperty("在营销云1.0中的编号")
    @TableField("old_code")
    private String oldCode;

    @ApiModelProperty("在物理机上的多开序号")
    @TableField("sn")
    private String sn;

    @ApiModelProperty("云机的虚拟ip")
    @TableField("ip")
    private String ip;

    @ApiModelProperty("底层paas标记")
    @TableField("paas")
    private String paas;

    @ApiModelProperty("物理机的code")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("物理机ip")
    @TableField("device_ip")
    private String deviceIp;

    @ApiModelProperty("硬件配置")
    @TableField("hardware_code")
    private String hardwareCode;

    @ApiModelProperty("网段")
    @TableField("unit_seg")
    private String unitSeg;

    @ApiModelProperty("启动时间")
    @TableField("boot_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date bootTime;

    @ApiModelProperty("上次心跳时间")
    @TableField("hb_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date hbTime;

    @ApiModelProperty("报警超时时间")
    @TableField("alert_expire_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date alertExpireTime;

    @ApiModelProperty("已离线时长用来判断处于离线的云机是重启，还是故障")
    @TableField("offline_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date offlineTime;

    @ApiModelProperty("上行网速，单位B/s网速测算")
    @TableField("tx")
    private String tx;

    @ApiModelProperty("下行网速，单位B/s")
    @TableField("rx")
    private String rx;

    @ApiModelProperty("云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)")
    @TableField("status_online")
    private Integer statusOnline;

    @ApiModelProperty("如果云机状态是ping离线或者启动中，这个值是已离线时长")
    @TableField("off_seconds")
    private Long offSeconds;

    @ApiModelProperty("云机错误消息")
    @TableField("error_message")
    private String errorMessage;

    @ApiModelProperty("0 未推流 1 正在推流")
    @TableField("status_control")
    private Integer statusControl;

    @ApiModelProperty("是否开启报警")
    @TableField("alert_enabled")
    private Boolean alertEnabled;

    @ApiModelProperty("在paas中状态是否正常")
    @TableField("status_paa_s")
    private Boolean statusPaaS;

    @ApiModelProperty("上次成功申请到推流token的用户名")
    @TableField("last_apply_username")
    private String lastApplyUsername;

    @ApiModelProperty("上次成功申请到token的日期")
    @TableField("last_apply_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastApplyDate;

    @ApiModelProperty("上次活跃日期")
    @TableField("last_active_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastActiveDate;

    @ApiModelProperty("安装的应用，多个使用,分割")
    @TableField("pkgs")
    private String pkgs;

    @ApiModelProperty("标签")
    @TableField("tag")
    private String tag;

    @ApiModelProperty("截图是否正常")
    @TableField("capture_ok")
    private Boolean captureOk;

    @ApiModelProperty("截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃")
    @TableField("cap_diff")
    private Integer capDiff;

    @ApiModelProperty("dg相应字段")
    @TableField("dg_version")
    private String dgVersion;

    @TableField("dg_version_code")
    private String dgVersionCode;

    @TableField("dg_xm_status")
    private String dgXmStatus;

    @TableField("dg_top_app")
    private String dgTopApp;

    @TableField("dg_display_width")
    private Integer dgDisplayWidth;

    @TableField("dg_apps_count")
    private Integer dgAppsCount;

    @TableField("dg_prop_product")
    private String dgPropProduct;

    @TableField("dg_sim_imei")
    private String dgSimImei;

    @TableField("dg_net_status")
    private Integer dgNetStatus;

    @TableField("dg_net_bs")
    private Integer dgNetBs;

    @TableField("dg_proxy_host")
    private String dgProxyHost;

    @TableField("dg_proxy_port")
    private Integer dgProxyPort;

    @TableField("dg_proxy_username")
    private String dgProxyUsername;

    @TableField("dg_proxy_location")
    private String dgProxyLocation;

    @TableField("dg_proxy_ip")
    private String dgProxyIp;

    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @TableField("last_update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @TableField("last_sync_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastSyncTime;

    @ApiModelProperty("机房表区域id")
    @TableField("fk_cloud_region_id")
    private Long fkCloudRegionId;

    @TableField("pub_ip")
    private String pubIp;

    @TableField("audio_sock_type")
    private Integer audioSockType;

    @TableField("audio_port")
    private Integer audioPort;

    @TableField("audio_external_port")
    private Integer audioExternalPort;

    @TableField("video_port")
    private Integer videoPort;

    @TableField("video_external_port")
    private Integer videoExternalPort;

    @TableField("maxslots")
    private Integer maxslots;

    @TableField("rtc_min_port")
    private Integer rtcMinPort;

    @TableField("rtc_max_port")
    private Integer rtcMaxPort;

    @TableField("rtc_min_external_port")
    private Integer rtcMinExternalPort;

    @TableField("rtc_max_external_port")
    private Integer rtcMaxExternalPort;

    @TableField("reset_tast_uid")
    private String resetTastUid;

    @TableField("upload_image_task_id")
    private String uploadImageTaskId;

    @TableField("reset_reponse")
    private String resetReponse;

    @TableField("upload_response")
    private String uploadResponse;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    /**
     * 百度云机所属账号
     */
    public Long getFkBaiduAccountId() {
        return fkBaiduAccountId;
    }

    /**
     * 百度云机所属账号
     */
    public void setFkBaiduAccountId(Long fkBaiduAccountId) {
        this.fkBaiduAccountId = fkBaiduAccountId;
    }
    /**
     * 
     */
    public String getUid() {
        return uid;
    }

    /**
     * 
     */
    public void setUid(String uid) {
        this.uid = uid;
    }
    /**
     * 云机编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 云机编号
     */
    public void setCode(String code) {
        this.code = code;
    }
    /**
     * 云机所属分组
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * 云机所属分组
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
    /**
     * 机房号
     */
    public String getIdcCode() {
        return idcCode;
    }

    /**
     * 机房号
     */
    public void setIdcCode(String idcCode) {
        this.idcCode = idcCode;
    }
    /**
     * 当前镜像版本号
     */
    public String getImageVersionId() {
        return imageVersionId;
    }

    /**
     * 当前镜像版本号
     */
    public void setImageVersionId(String imageVersionId) {
        this.imageVersionId = imageVersionId;
    }
    /**
     * 最后一次重置时间
     */
    public Date getLastResetTime() {
        return lastResetTime;
    }

    /**
     * 最后一次重置时间
     */
    public void setLastResetTime(Date lastResetTime) {
        this.lastResetTime = lastResetTime;
    }
    /**
     * 重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,
     */
    public Integer getResetStatus() {
        return resetStatus;
    }

    /**
     * 重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,
     */
    public void setResetStatus(Integer resetStatus) {
        this.resetStatus = resetStatus;
    }
    /**
     * 重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id
     */
    public String getResetImageVersionId() {
        return resetImageVersionId;
    }

    /**
     * 重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id
     */
    public void setResetImageVersionId(String resetImageVersionId) {
        this.resetImageVersionId = resetImageVersionId;
    }
    /**
     * 交付的订单编号
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 交付的订单编号
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }
    /**
     * 交付日期的备注
     */
    public String getDeliverDay() {
        return deliverDay;
    }

    /**
     * 交付日期的备注
     */
    public void setDeliverDay(String deliverDay) {
        this.deliverDay = deliverDay;
    }
    /**
     * 在营销云1.0中的编号
     */
    public String getOldCode() {
        return oldCode;
    }

    /**
     * 在营销云1.0中的编号
     */
    public void setOldCode(String oldCode) {
        this.oldCode = oldCode;
    }
    /**
     * 在物理机上的多开序号
     */
    public String getSn() {
        return sn;
    }

    /**
     * 在物理机上的多开序号
     */
    public void setSn(String sn) {
        this.sn = sn;
    }
    /**
     * 云机的虚拟ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 云机的虚拟ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }
    /**
     * 底层paas标记
     */
    public String getPaas() {
        return paas;
    }

    /**
     * 底层paas标记
     */
    public void setPaas(String paas) {
        this.paas = paas;
    }
    /**
     * 物理机的code
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * 物理机的code
     */
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }
    /**
     * 物理机ip
     */
    public String getDeviceIp() {
        return deviceIp;
    }

    /**
     * 物理机ip
     */
    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }
    /**
     * 硬件配置
     */
    public String getHardwareCode() {
        return hardwareCode;
    }

    /**
     * 硬件配置
     */
    public void setHardwareCode(String hardwareCode) {
        this.hardwareCode = hardwareCode;
    }
    /**
     * 网段
     */
    public String getUnitSeg() {
        return unitSeg;
    }

    /**
     * 网段
     */
    public void setUnitSeg(String unitSeg) {
        this.unitSeg = unitSeg;
    }
    /**
     * 启动时间
     */
    public Date getBootTime() {
        return bootTime;
    }

    /**
     * 启动时间
     */
    public void setBootTime(Date bootTime) {
        this.bootTime = bootTime;
    }
    /**
     * 上次心跳时间
     */
    public Date getHbTime() {
        return hbTime;
    }

    /**
     * 上次心跳时间
     */
    public void setHbTime(Date hbTime) {
        this.hbTime = hbTime;
    }
    /**
     * 报警超时时间
     */
    public Date getAlertExpireTime() {
        return alertExpireTime;
    }

    /**
     * 报警超时时间
     */
    public void setAlertExpireTime(Date alertExpireTime) {
        this.alertExpireTime = alertExpireTime;
    }
    /**
     * 已离线时长用来判断处于离线的云机是重启，还是故障
     */
    public Date getOfflineTime() {
        return offlineTime;
    }

    /**
     * 已离线时长用来判断处于离线的云机是重启，还是故障
     */
    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }
    /**
     * 上行网速，单位B/s网速测算
     */
    public String getTx() {
        return tx;
    }

    /**
     * 上行网速，单位B/s网速测算
     */
    public void setTx(String tx) {
        this.tx = tx;
    }
    /**
     * 下行网速，单位B/s
     */
    public String getRx() {
        return rx;
    }

    /**
     * 下行网速，单位B/s
     */
    public void setRx(String rx) {
        this.rx = rx;
    }
    /**
     * 云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)
     */
    public Integer getStatusOnline() {
        return statusOnline;
    }

    /**
     * 云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)
     */
    public void setStatusOnline(Integer statusOnline) {
        this.statusOnline = statusOnline;
    }
    /**
     * 如果云机状态是ping离线或者启动中，这个值是已离线时长
     */
    public Long getOffSeconds() {
        return offSeconds;
    }

    /**
     * 如果云机状态是ping离线或者启动中，这个值是已离线时长
     */
    public void setOffSeconds(Long offSeconds) {
        this.offSeconds = offSeconds;
    }
    /**
     * 云机错误消息
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 云机错误消息
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    /**
     * 0 未推流 1 正在推流
     */
    public Integer getStatusControl() {
        return statusControl;
    }

    /**
     * 0 未推流 1 正在推流
     */
    public void setStatusControl(Integer statusControl) {
        this.statusControl = statusControl;
    }
    /**
     * 是否开启报警
     */
    public Boolean getAlertEnabled() {
        return alertEnabled;
    }

    /**
     * 是否开启报警
     */
    public void setAlertEnabled(Boolean alertEnabled) {
        this.alertEnabled = alertEnabled;
    }
    /**
     * 在paas中状态是否正常
     */
    public Boolean getStatusPaaS() {
        return statusPaaS;
    }

    /**
     * 在paas中状态是否正常
     */
    public void setStatusPaaS(Boolean statusPaaS) {
        this.statusPaaS = statusPaaS;
    }
    /**
     * 上次成功申请到推流token的用户名
     */
    public String getLastApplyUsername() {
        return lastApplyUsername;
    }

    /**
     * 上次成功申请到推流token的用户名
     */
    public void setLastApplyUsername(String lastApplyUsername) {
        this.lastApplyUsername = lastApplyUsername;
    }
    /**
     * 上次成功申请到token的日期
     */
    public Date getLastApplyDate() {
        return lastApplyDate;
    }

    /**
     * 上次成功申请到token的日期
     */
    public void setLastApplyDate(Date lastApplyDate) {
        this.lastApplyDate = lastApplyDate;
    }
    /**
     * 上次活跃日期
     */
    public Date getLastActiveDate() {
        return lastActiveDate;
    }

    /**
     * 上次活跃日期
     */
    public void setLastActiveDate(Date lastActiveDate) {
        this.lastActiveDate = lastActiveDate;
    }
    /**
     * 安装的应用，多个使用,分割
     */
    public String getPkgs() {
        return pkgs;
    }

    /**
     * 安装的应用，多个使用,分割
     */
    public void setPkgs(String pkgs) {
        this.pkgs = pkgs;
    }
    /**
     * 标签
     */
    public String getTag() {
        return tag;
    }

    /**
     * 标签
     */
    public void setTag(String tag) {
        this.tag = tag;
    }
    /**
     * 截图是否正常
     */
    public Boolean getCaptureOk() {
        return captureOk;
    }

    /**
     * 截图是否正常
     */
    public void setCaptureOk(Boolean captureOk) {
        this.captureOk = captureOk;
    }
    /**
     * 截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃
     */
    public Integer getCapDiff() {
        return capDiff;
    }

    /**
     * 截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃
     */
    public void setCapDiff(Integer capDiff) {
        this.capDiff = capDiff;
    }
    /**
     * dg相应字段
     */
    public String getDgVersion() {
        return dgVersion;
    }

    /**
     * dg相应字段
     */
    public void setDgVersion(String dgVersion) {
        this.dgVersion = dgVersion;
    }
    /**
     * 
     */
    public String getDgVersionCode() {
        return dgVersionCode;
    }

    /**
     * 
     */
    public void setDgVersionCode(String dgVersionCode) {
        this.dgVersionCode = dgVersionCode;
    }
    /**
     * 
     */
    public String getDgXmStatus() {
        return dgXmStatus;
    }

    /**
     * 
     */
    public void setDgXmStatus(String dgXmStatus) {
        this.dgXmStatus = dgXmStatus;
    }
    /**
     * 
     */
    public String getDgTopApp() {
        return dgTopApp;
    }

    /**
     * 
     */
    public void setDgTopApp(String dgTopApp) {
        this.dgTopApp = dgTopApp;
    }
    /**
     * 
     */
    public Integer getDgDisplayWidth() {
        return dgDisplayWidth;
    }

    /**
     * 
     */
    public void setDgDisplayWidth(Integer dgDisplayWidth) {
        this.dgDisplayWidth = dgDisplayWidth;
    }
    /**
     * 
     */
    public Integer getDgAppsCount() {
        return dgAppsCount;
    }

    /**
     * 
     */
    public void setDgAppsCount(Integer dgAppsCount) {
        this.dgAppsCount = dgAppsCount;
    }
    /**
     * 
     */
    public String getDgPropProduct() {
        return dgPropProduct;
    }

    /**
     * 
     */
    public void setDgPropProduct(String dgPropProduct) {
        this.dgPropProduct = dgPropProduct;
    }
    /**
     * 
     */
    public String getDgSimImei() {
        return dgSimImei;
    }

    /**
     * 
     */
    public void setDgSimImei(String dgSimImei) {
        this.dgSimImei = dgSimImei;
    }
    /**
     * 
     */
    public Integer getDgNetStatus() {
        return dgNetStatus;
    }

    /**
     * 
     */
    public void setDgNetStatus(Integer dgNetStatus) {
        this.dgNetStatus = dgNetStatus;
    }
    /**
     * 
     */
    public Integer getDgNetBs() {
        return dgNetBs;
    }

    /**
     * 
     */
    public void setDgNetBs(Integer dgNetBs) {
        this.dgNetBs = dgNetBs;
    }
    /**
     * 
     */
    public String getDgProxyHost() {
        return dgProxyHost;
    }

    /**
     * 
     */
    public void setDgProxyHost(String dgProxyHost) {
        this.dgProxyHost = dgProxyHost;
    }
    /**
     * 
     */
    public Integer getDgProxyPort() {
        return dgProxyPort;
    }

    /**
     * 
     */
    public void setDgProxyPort(Integer dgProxyPort) {
        this.dgProxyPort = dgProxyPort;
    }
    /**
     * 
     */
    public String getDgProxyUsername() {
        return dgProxyUsername;
    }

    /**
     * 
     */
    public void setDgProxyUsername(String dgProxyUsername) {
        this.dgProxyUsername = dgProxyUsername;
    }
    /**
     * 
     */
    public String getDgProxyLocation() {
        return dgProxyLocation;
    }

    /**
     * 
     */
    public void setDgProxyLocation(String dgProxyLocation) {
        this.dgProxyLocation = dgProxyLocation;
    }
    /**
     * 
     */
    public String getDgProxyIp() {
        return dgProxyIp;
    }

    /**
     * 
     */
    public void setDgProxyIp(String dgProxyIp) {
        this.dgProxyIp = dgProxyIp;
    }
    /**
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
     * 
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    /**
     * 
     */
    public Date getLastSyncTime() {
        return lastSyncTime;
    }

    /**
     * 
     */
    public void setLastSyncTime(Date lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }
    /**
     * 机房表区域id
     */
    public Long getFkCloudRegionId() {
        return fkCloudRegionId;
    }

    /**
     * 机房表区域id
     */
    public void setFkCloudRegionId(Long fkCloudRegionId) {
        this.fkCloudRegionId = fkCloudRegionId;
    }
    /**
     * 
     */
    public String getPubIp() {
        return pubIp;
    }

    /**
     * 
     */
    public void setPubIp(String pubIp) {
        this.pubIp = pubIp;
    }
    /**
     * 
     */
    public Integer getAudioSockType() {
        return audioSockType;
    }

    /**
     * 
     */
    public void setAudioSockType(Integer audioSockType) {
        this.audioSockType = audioSockType;
    }
    /**
     * 
     */
    public Integer getAudioPort() {
        return audioPort;
    }

    /**
     * 
     */
    public void setAudioPort(Integer audioPort) {
        this.audioPort = audioPort;
    }
    /**
     * 
     */
    public Integer getAudioExternalPort() {
        return audioExternalPort;
    }

    /**
     * 
     */
    public void setAudioExternalPort(Integer audioExternalPort) {
        this.audioExternalPort = audioExternalPort;
    }
    /**
     * 
     */
    public Integer getVideoPort() {
        return videoPort;
    }

    /**
     * 
     */
    public void setVideoPort(Integer videoPort) {
        this.videoPort = videoPort;
    }
    /**
     * 
     */
    public Integer getVideoExternalPort() {
        return videoExternalPort;
    }

    /**
     * 
     */
    public void setVideoExternalPort(Integer videoExternalPort) {
        this.videoExternalPort = videoExternalPort;
    }
    /**
     * 
     */
    public Integer getMaxslots() {
        return maxslots;
    }

    /**
     * 
     */
    public void setMaxslots(Integer maxslots) {
        this.maxslots = maxslots;
    }
    /**
     * 
     */
    public Integer getRtcMinPort() {
        return rtcMinPort;
    }

    /**
     * 
     */
    public void setRtcMinPort(Integer rtcMinPort) {
        this.rtcMinPort = rtcMinPort;
    }
    /**
     * 
     */
    public Integer getRtcMaxPort() {
        return rtcMaxPort;
    }

    /**
     * 
     */
    public void setRtcMaxPort(Integer rtcMaxPort) {
        this.rtcMaxPort = rtcMaxPort;
    }
    /**
     * 
     */
    public Integer getRtcMinExternalPort() {
        return rtcMinExternalPort;
    }

    /**
     * 
     */
    public void setRtcMinExternalPort(Integer rtcMinExternalPort) {
        this.rtcMinExternalPort = rtcMinExternalPort;
    }
    /**
     * 
     */
    public Integer getRtcMaxExternalPort() {
        return rtcMaxExternalPort;
    }

    /**
     * 
     */
    public void setRtcMaxExternalPort(Integer rtcMaxExternalPort) {
        this.rtcMaxExternalPort = rtcMaxExternalPort;
    }
    /**
     * 
     */
    public String getResetTastUid() {
        return resetTastUid;
    }

    /**
     * 
     */
    public void setResetTastUid(String resetTastUid) {
        this.resetTastUid = resetTastUid;
    }
    /**
     * 
     */
    public String getUploadImageTaskId() {
        return uploadImageTaskId;
    }

    /**
     * 
     */
    public void setUploadImageTaskId(String uploadImageTaskId) {
        this.uploadImageTaskId = uploadImageTaskId;
    }
    /**
     * 
     */
    public String getResetReponse() {
        return resetReponse;
    }

    /**
     * 
     */
    public void setResetReponse(String resetReponse) {
        this.resetReponse = resetReponse;
    }
    /**
     * 
     */
    public String getUploadResponse() {
        return uploadResponse;
    }

    /**
     * 
     */
    public void setUploadResponse(String uploadResponse) {
        this.uploadResponse = uploadResponse;
    }

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 百度云机所属账号
     */
    public static final String FK_BAIDU_ACCOUNT_ID = "fk_baidu_account_id";

    /**
     * 
     */
    public static final String UID = "uid";

    /**
     * 云机编号
     */
    public static final String CODE = "code";

    /**
     * 云机所属分组
     */
    public static final String GROUP_CODE = "group_code";

    /**
     * 机房号
     */
    public static final String IDC_CODE = "idc_code";

    /**
     * 当前镜像版本号
     */
    public static final String IMAGE_VERSION_ID = "image_version_id";

    /**
     * 最后一次重置时间
     */
    public static final String LAST_RESET_TIME = "last_reset_time";

    /**
     * 重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,
     */
    public static final String RESET_STATUS = "reset_status";

    /**
     * 重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id
     */
    public static final String RESET_IMAGE_VERSION_ID = "reset_image_version_id";

    /**
     * 交付的订单编号
     */
    public static final String ORDER_CODE = "order_code";

    /**
     * 交付日期的备注
     */
    public static final String DELIVER_DAY = "deliver_day";

    /**
     * 在营销云1.0中的编号
     */
    public static final String OLD_CODE = "old_code";

    /**
     * 在物理机上的多开序号
     */
    public static final String SN = "sn";

    /**
     * 云机的虚拟ip
     */
    public static final String IP = "ip";

    /**
     * 底层paas标记
     */
    public static final String PAAS = "paas";

    /**
     * 物理机的code
     */
    public static final String DEVICE_CODE = "device_code";

    /**
     * 物理机ip
     */
    public static final String DEVICE_IP = "device_ip";

    /**
     * 硬件配置
     */
    public static final String HARDWARE_CODE = "hardware_code";

    /**
     * 网段
     */
    public static final String UNIT_SEG = "unit_seg";

    /**
     * 启动时间
     */
    public static final String BOOT_TIME = "boot_time";

    /**
     * 上次心跳时间
     */
    public static final String HB_TIME = "hb_time";

    /**
     * 报警超时时间
     */
    public static final String ALERT_EXPIRE_TIME = "alert_expire_time";

    /**
     * 已离线时长用来判断处于离线的云机是重启，还是故障
     */
    public static final String OFFLINE_TIME = "offline_time";

    /**
     * 上行网速，单位B/s网速测算
     */
    public static final String TX = "tx";

    /**
     * 下行网速，单位B/s
     */
    public static final String RX = "rx";

    /**
     * 云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)
     */
    public static final String STATUS_ONLINE = "status_online";

    /**
     * 如果云机状态是ping离线或者启动中，这个值是已离线时长
     */
    public static final String OFF_SECONDS = "off_seconds";

    /**
     * 云机错误消息
     */
    public static final String ERROR_MESSAGE = "error_message";

    /**
     * 0 未推流 1 正在推流
     */
    public static final String STATUS_CONTROL = "status_control";

    /**
     * 是否开启报警
     */
    public static final String ALERT_ENABLED = "alert_enabled";

    /**
     * 在paas中状态是否正常
     */
    public static final String STATUS_PAA_S = "status_paa_s";

    /**
     * 上次成功申请到推流token的用户名
     */
    public static final String LAST_APPLY_USERNAME = "last_apply_username";

    /**
     * 上次成功申请到token的日期
     */
    public static final String LAST_APPLY_DATE = "last_apply_date";

    /**
     * 上次活跃日期
     */
    public static final String LAST_ACTIVE_DATE = "last_active_date";

    /**
     * 安装的应用，多个使用,分割
     */
    public static final String PKGS = "pkgs";

    /**
     * 标签
     */
    public static final String TAG = "tag";

    /**
     * 截图是否正常
     */
    public static final String CAPTURE_OK = "capture_ok";

    /**
     * 截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃
     */
    public static final String CAP_DIFF = "cap_diff";

    /**
     * dg相应字段
     */
    public static final String DG_VERSION = "dg_version";

    /**
     * 
     */
    public static final String DG_VERSION_CODE = "dg_version_code";

    /**
     * 
     */
    public static final String DG_XM_STATUS = "dg_xm_status";

    /**
     * 
     */
    public static final String DG_TOP_APP = "dg_top_app";

    /**
     * 
     */
    public static final String DG_DISPLAY_WIDTH = "dg_display_width";

    /**
     * 
     */
    public static final String DG_APPS_COUNT = "dg_apps_count";

    /**
     * 
     */
    public static final String DG_PROP_PRODUCT = "dg_prop_product";

    /**
     * 
     */
    public static final String DG_SIM_IMEI = "dg_sim_imei";

    /**
     * 
     */
    public static final String DG_NET_STATUS = "dg_net_status";

    /**
     * 
     */
    public static final String DG_NET_BS = "dg_net_bs";

    /**
     * 
     */
    public static final String DG_PROXY_HOST = "dg_proxy_host";

    /**
     * 
     */
    public static final String DG_PROXY_PORT = "dg_proxy_port";

    /**
     * 
     */
    public static final String DG_PROXY_USERNAME = "dg_proxy_username";

    /**
     * 
     */
    public static final String DG_PROXY_LOCATION = "dg_proxy_location";

    /**
     * 
     */
    public static final String DG_PROXY_IP = "dg_proxy_ip";

    /**
     * 
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 
     */
    public static final String LAST_SYNC_TIME = "last_sync_time";

    /**
     * 机房表区域id
     */
    public static final String FK_CLOUD_REGION_ID = "fk_cloud_region_id";

    /**
     * 
     */
    public static final String PUB_IP = "pub_ip";

    /**
     * 
     */
    public static final String AUDIO_SOCK_TYPE = "audio_sock_type";

    /**
     * 
     */
    public static final String AUDIO_PORT = "audio_port";

    /**
     * 
     */
    public static final String AUDIO_EXTERNAL_PORT = "audio_external_port";

    /**
     * 
     */
    public static final String VIDEO_PORT = "video_port";

    /**
     * 
     */
    public static final String VIDEO_EXTERNAL_PORT = "video_external_port";

    /**
     * 
     */
    public static final String MAXSLOTS = "maxslots";

    /**
     * 
     */
    public static final String RTC_MIN_PORT = "rtc_min_port";

    /**
     * 
     */
    public static final String RTC_MAX_PORT = "rtc_max_port";

    /**
     * 
     */
    public static final String RTC_MIN_EXTERNAL_PORT = "rtc_min_external_port";

    /**
     * 
     */
    public static final String RTC_MAX_EXTERNAL_PORT = "rtc_max_external_port";

    /**
     * 
     */
    public static final String RESET_TAST_UID = "reset_tast_uid";

    /**
     * 
     */
    public static final String UPLOAD_IMAGE_TASK_ID = "upload_image_task_id";

    /**
     * 
     */
    public static final String RESET_REPONSE = "reset_reponse";

    /**
     * 
     */
    public static final String UPLOAD_RESPONSE = "upload_response";

    @Override
    public String toString() {
        return "BaiduDevice{" +
            "id=" + id +
            ", deviceId=" + deviceId +
            ", fkBaiduAccountId=" + fkBaiduAccountId +
            ", uid=" + uid +
            ", code=" + code +
            ", groupCode=" + groupCode +
            ", idcCode=" + idcCode +
            ", imageVersionId=" + imageVersionId +
            ", lastResetTime=" + lastResetTime +
            ", resetStatus=" + resetStatus +
            ", resetImageVersionId=" + resetImageVersionId +
            ", orderCode=" + orderCode +
            ", deliverDay=" + deliverDay +
            ", oldCode=" + oldCode +
            ", sn=" + sn +
            ", ip=" + ip +
            ", paas=" + paas +
            ", deviceCode=" + deviceCode +
            ", deviceIp=" + deviceIp +
            ", hardwareCode=" + hardwareCode +
            ", unitSeg=" + unitSeg +
            ", bootTime=" + bootTime +
            ", hbTime=" + hbTime +
            ", alertExpireTime=" + alertExpireTime +
            ", offlineTime=" + offlineTime +
            ", tx=" + tx +
            ", rx=" + rx +
            ", statusOnline=" + statusOnline +
            ", offSeconds=" + offSeconds +
            ", errorMessage=" + errorMessage +
            ", statusControl=" + statusControl +
            ", alertEnabled=" + alertEnabled +
            ", statusPaaS=" + statusPaaS +
            ", lastApplyUsername=" + lastApplyUsername +
            ", lastApplyDate=" + lastApplyDate +
            ", lastActiveDate=" + lastActiveDate +
            ", pkgs=" + pkgs +
            ", tag=" + tag +
            ", captureOk=" + captureOk +
            ", capDiff=" + capDiff +
            ", dgVersion=" + dgVersion +
            ", dgVersionCode=" + dgVersionCode +
            ", dgXmStatus=" + dgXmStatus +
            ", dgTopApp=" + dgTopApp +
            ", dgDisplayWidth=" + dgDisplayWidth +
            ", dgAppsCount=" + dgAppsCount +
            ", dgPropProduct=" + dgPropProduct +
            ", dgSimImei=" + dgSimImei +
            ", dgNetStatus=" + dgNetStatus +
            ", dgNetBs=" + dgNetBs +
            ", dgProxyHost=" + dgProxyHost +
            ", dgProxyPort=" + dgProxyPort +
            ", dgProxyUsername=" + dgProxyUsername +
            ", dgProxyLocation=" + dgProxyLocation +
            ", dgProxyIp=" + dgProxyIp +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", lastSyncTime=" + lastSyncTime +
            ", fkCloudRegionId=" + fkCloudRegionId +
            ", pubIp=" + pubIp +
            ", audioSockType=" + audioSockType +
            ", audioPort=" + audioPort +
            ", audioExternalPort=" + audioExternalPort +
            ", videoPort=" + videoPort +
            ", videoExternalPort=" + videoExternalPort +
            ", maxslots=" + maxslots +
            ", rtcMinPort=" + rtcMinPort +
            ", rtcMaxPort=" + rtcMaxPort +
            ", rtcMinExternalPort=" + rtcMinExternalPort +
            ", rtcMaxExternalPort=" + rtcMaxExternalPort +
            ", resetTastUid=" + resetTastUid +
            ", uploadImageTaskId=" + uploadImageTaskId +
            ", resetReponse=" + resetReponse +
            ", uploadResponse=" + uploadResponse +
        "}";
    }

    public BaiduDeviceQueryEntityWrapper queryWrapper(){
        return BaiduDeviceQueryEntityWrapper.wrapper(this);
    }

    public BaiduDeviceUpdateEntityWrapper updateWrapper(){
        return BaiduDeviceUpdateEntityWrapper.wrapper(this);
    }

    public static BaiduDeviceQueryWrapper qWrapper(){
        return BaiduDeviceQueryWrapper.wrapper();
    }

    public static BaiduDeviceUpdateWrapper uWrapper(){
        return BaiduDeviceUpdateWrapper.wrapper();
    }

}
