package com.suqi.center.machine.api.dto.request;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.suqi.center.common.dto.ValidationGroups;

/**
 * <p>
 * 百度云机
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@ApiModel(value = "BaiduDevice对象", description = "百度云机")
public class BaiduDeviceParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(groups = ValidationGroups.Update.class, message = "id 不能为null")
    private Long id;

    private String deviceId;

    @ApiModelProperty("百度云机所属账号")
    private Long fkBaiduAccountId;

    private String uid;

    @ApiModelProperty("云机编号")
    private String code;

    @ApiModelProperty("云机所属分组")
    private String groupCode;

    @ApiModelProperty("机房号")
    private String idcCode;

    @ApiModelProperty("当前镜像版本号")
    private String imageVersionId;

    @ApiModelProperty("最后一次重置时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastResetTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndLastResetTime;

    @ApiModelProperty("重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,")
    private Integer resetStatus;

    @ApiModelProperty("重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id")
    private String resetImageVersionId;

    @ApiModelProperty("交付的订单编号")
    private String orderCode;

    @ApiModelProperty("交付日期的备注")
    private String deliverDay;

    @ApiModelProperty("在营销云1.0中的编号")
    private String oldCode;

    @ApiModelProperty("在物理机上的多开序号")
    private String sn;

    @ApiModelProperty("云机的虚拟ip")
    private String ip;

    @ApiModelProperty("底层paas标记")
    private String paas;

    @ApiModelProperty("物理机的code")
    private String deviceCode;

    @ApiModelProperty("物理机ip")
    private String deviceIp;

    @ApiModelProperty("硬件配置")
    private String hardwareCode;

    @ApiModelProperty("网段")
    private String unitSeg;

    @ApiModelProperty("启动时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date bootTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndBootTime;

    @ApiModelProperty("上次心跳时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date hbTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndHbTime;

    @ApiModelProperty("报警超时时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date alertExpireTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndAlertExpireTime;

    @ApiModelProperty("已离线时长用来判断处于离线的云机是重启，还是故障")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date offlineTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndOfflineTime;

    @ApiModelProperty("上行网速，单位B/s网速测算")
    private String tx;

    @ApiModelProperty("下行网速，单位B/s")
    private String rx;

    @ApiModelProperty("云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)")
    private Integer statusOnline;

    @ApiModelProperty("如果云机状态是ping离线或者启动中，这个值是已离线时长")
    private Long offSeconds;

    @ApiModelProperty("云机错误消息")
    private String errorMessage;

    @ApiModelProperty("0 未推流 1 正在推流")
    private Integer statusControl;

    @ApiModelProperty("是否开启报警")
    private Boolean alertEnabled;

    @ApiModelProperty("在paas中状态是否正常")
    private Boolean statusPaaS;

    @ApiModelProperty("上次成功申请到推流token的用户名")
    private String lastApplyUsername;

    @ApiModelProperty("上次成功申请到token的日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastApplyDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndLastApplyDate;

    @ApiModelProperty("上次活跃日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastActiveDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndLastActiveDate;

    @ApiModelProperty("安装的应用，多个使用,分割")
    private String pkgs;

    @ApiModelProperty("标签")
    private String tag;

    @ApiModelProperty("截图是否正常")
    private Boolean captureOk;

    @ApiModelProperty("截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃")
    private Integer capDiff;

    @ApiModelProperty("dg相应字段")
    private String dgVersion;

    private String dgVersionCode;

    private String dgXmStatus;

    private String dgTopApp;

    private Integer dgDisplayWidth;

    private Integer dgAppsCount;

    private String dgPropProduct;

    private String dgSimImei;

    private Integer dgNetStatus;

    private Integer dgNetBs;

    private String dgProxyHost;

    private Integer dgProxyPort;

    private String dgProxyUsername;

    private String dgProxyLocation;

    private String dgProxyIp;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndCreateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndLastUpdateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastSyncTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndLastSyncTime;

    @ApiModelProperty("机房表区域id")
    private Long fkCloudRegionId;

    private String pubIp;

    private Integer audioSockType;

    private Integer audioPort;

    private Integer audioExternalPort;

    private Integer videoPort;

    private Integer videoExternalPort;

    private Integer maxslots;

    private Integer rtcMinPort;

    private Integer rtcMaxPort;

    private Integer rtcMinExternalPort;

    private Integer rtcMaxExternalPort;

    private String resetTastUid;

    private String uploadImageTaskId;

    private String resetReponse;

    private String uploadResponse;

    /**
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
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
     */
    public String getUid() {
        return uid;
    }

    /**
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
     * 最后一次重置时间
     */
    public Date getQueryEndLastResetTime() {
        return queryEndLastResetTime;
    }

    /**
     * 最后一次重置时间
     */
    public void setQueryEndLastResetTime(Date queryEndLastResetTime) {
        this.queryEndLastResetTime = queryEndLastResetTime;
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
     * 启动时间
     */
    public Date getQueryEndBootTime() {
        return queryEndBootTime;
    }

    /**
     * 启动时间
     */
    public void setQueryEndBootTime(Date queryEndBootTime) {
        this.queryEndBootTime = queryEndBootTime;
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
     * 上次心跳时间
     */
    public Date getQueryEndHbTime() {
        return queryEndHbTime;
    }

    /**
     * 上次心跳时间
     */
    public void setQueryEndHbTime(Date queryEndHbTime) {
        this.queryEndHbTime = queryEndHbTime;
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
     * 报警超时时间
     */
    public Date getQueryEndAlertExpireTime() {
        return queryEndAlertExpireTime;
    }

    /**
     * 报警超时时间
     */
    public void setQueryEndAlertExpireTime(Date queryEndAlertExpireTime) {
        this.queryEndAlertExpireTime = queryEndAlertExpireTime;
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
     * 已离线时长用来判断处于离线的云机是重启，还是故障
     */
    public Date getQueryEndOfflineTime() {
        return queryEndOfflineTime;
    }

    /**
     * 已离线时长用来判断处于离线的云机是重启，还是故障
     */
    public void setQueryEndOfflineTime(Date queryEndOfflineTime) {
        this.queryEndOfflineTime = queryEndOfflineTime;
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
     * 上次成功申请到token的日期
     */
    public Date getQueryEndLastApplyDate() {
        return queryEndLastApplyDate;
    }

    /**
     * 上次成功申请到token的日期
     */
    public void setQueryEndLastApplyDate(Date queryEndLastApplyDate) {
        this.queryEndLastApplyDate = queryEndLastApplyDate;
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
     * 上次活跃日期
     */
    public Date getQueryEndLastActiveDate() {
        return queryEndLastActiveDate;
    }

    /**
     * 上次活跃日期
     */
    public void setQueryEndLastActiveDate(Date queryEndLastActiveDate) {
        this.queryEndLastActiveDate = queryEndLastActiveDate;
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
     */
    public String getDgVersionCode() {
        return dgVersionCode;
    }

    /**
     */
    public void setDgVersionCode(String dgVersionCode) {
        this.dgVersionCode = dgVersionCode;
    }

    /**
     */
    public String getDgXmStatus() {
        return dgXmStatus;
    }

    /**
     */
    public void setDgXmStatus(String dgXmStatus) {
        this.dgXmStatus = dgXmStatus;
    }

    /**
     */
    public String getDgTopApp() {
        return dgTopApp;
    }

    /**
     */
    public void setDgTopApp(String dgTopApp) {
        this.dgTopApp = dgTopApp;
    }

    /**
     */
    public Integer getDgDisplayWidth() {
        return dgDisplayWidth;
    }

    /**
     */
    public void setDgDisplayWidth(Integer dgDisplayWidth) {
        this.dgDisplayWidth = dgDisplayWidth;
    }

    /**
     */
    public Integer getDgAppsCount() {
        return dgAppsCount;
    }

    /**
     */
    public void setDgAppsCount(Integer dgAppsCount) {
        this.dgAppsCount = dgAppsCount;
    }

    /**
     */
    public String getDgPropProduct() {
        return dgPropProduct;
    }

    /**
     */
    public void setDgPropProduct(String dgPropProduct) {
        this.dgPropProduct = dgPropProduct;
    }

    /**
     */
    public String getDgSimImei() {
        return dgSimImei;
    }

    /**
     */
    public void setDgSimImei(String dgSimImei) {
        this.dgSimImei = dgSimImei;
    }

    /**
     */
    public Integer getDgNetStatus() {
        return dgNetStatus;
    }

    /**
     */
    public void setDgNetStatus(Integer dgNetStatus) {
        this.dgNetStatus = dgNetStatus;
    }

    /**
     */
    public Integer getDgNetBs() {
        return dgNetBs;
    }

    /**
     */
    public void setDgNetBs(Integer dgNetBs) {
        this.dgNetBs = dgNetBs;
    }

    /**
     */
    public String getDgProxyHost() {
        return dgProxyHost;
    }

    /**
     */
    public void setDgProxyHost(String dgProxyHost) {
        this.dgProxyHost = dgProxyHost;
    }

    /**
     */
    public Integer getDgProxyPort() {
        return dgProxyPort;
    }

    /**
     */
    public void setDgProxyPort(Integer dgProxyPort) {
        this.dgProxyPort = dgProxyPort;
    }

    /**
     */
    public String getDgProxyUsername() {
        return dgProxyUsername;
    }

    /**
     */
    public void setDgProxyUsername(String dgProxyUsername) {
        this.dgProxyUsername = dgProxyUsername;
    }

    /**
     */
    public String getDgProxyLocation() {
        return dgProxyLocation;
    }

    /**
     */
    public void setDgProxyLocation(String dgProxyLocation) {
        this.dgProxyLocation = dgProxyLocation;
    }

    /**
     */
    public String getDgProxyIp() {
        return dgProxyIp;
    }

    /**
     */
    public void setDgProxyIp(String dgProxyIp) {
        this.dgProxyIp = dgProxyIp;
    }

    /**
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     */
    public Date getQueryEndCreateTime() {
        return queryEndCreateTime;
    }

    /**
     */
    public void setQueryEndCreateTime(Date queryEndCreateTime) {
        this.queryEndCreateTime = queryEndCreateTime;
    }

    /**
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     */
    public Date getQueryEndLastUpdateTime() {
        return queryEndLastUpdateTime;
    }

    /**
     */
    public void setQueryEndLastUpdateTime(Date queryEndLastUpdateTime) {
        this.queryEndLastUpdateTime = queryEndLastUpdateTime;
    }

    /**
     */
    public Date getLastSyncTime() {
        return lastSyncTime;
    }

    /**
     */
    public void setLastSyncTime(Date lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
    }

    /**
     */
    public Date getQueryEndLastSyncTime() {
        return queryEndLastSyncTime;
    }

    /**
     */
    public void setQueryEndLastSyncTime(Date queryEndLastSyncTime) {
        this.queryEndLastSyncTime = queryEndLastSyncTime;
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
     */
    public String getPubIp() {
        return pubIp;
    }

    /**
     */
    public void setPubIp(String pubIp) {
        this.pubIp = pubIp;
    }

    /**
     */
    public Integer getAudioSockType() {
        return audioSockType;
    }

    /**
     */
    public void setAudioSockType(Integer audioSockType) {
        this.audioSockType = audioSockType;
    }

    /**
     */
    public Integer getAudioPort() {
        return audioPort;
    }

    /**
     */
    public void setAudioPort(Integer audioPort) {
        this.audioPort = audioPort;
    }

    /**
     */
    public Integer getAudioExternalPort() {
        return audioExternalPort;
    }

    /**
     */
    public void setAudioExternalPort(Integer audioExternalPort) {
        this.audioExternalPort = audioExternalPort;
    }

    /**
     */
    public Integer getVideoPort() {
        return videoPort;
    }

    /**
     */
    public void setVideoPort(Integer videoPort) {
        this.videoPort = videoPort;
    }

    /**
     */
    public Integer getVideoExternalPort() {
        return videoExternalPort;
    }

    /**
     */
    public void setVideoExternalPort(Integer videoExternalPort) {
        this.videoExternalPort = videoExternalPort;
    }

    /**
     */
    public Integer getMaxslots() {
        return maxslots;
    }

    /**
     */
    public void setMaxslots(Integer maxslots) {
        this.maxslots = maxslots;
    }

    /**
     */
    public Integer getRtcMinPort() {
        return rtcMinPort;
    }

    /**
     */
    public void setRtcMinPort(Integer rtcMinPort) {
        this.rtcMinPort = rtcMinPort;
    }

    /**
     */
    public Integer getRtcMaxPort() {
        return rtcMaxPort;
    }

    /**
     */
    public void setRtcMaxPort(Integer rtcMaxPort) {
        this.rtcMaxPort = rtcMaxPort;
    }

    /**
     */
    public Integer getRtcMinExternalPort() {
        return rtcMinExternalPort;
    }

    /**
     */
    public void setRtcMinExternalPort(Integer rtcMinExternalPort) {
        this.rtcMinExternalPort = rtcMinExternalPort;
    }

    /**
     */
    public Integer getRtcMaxExternalPort() {
        return rtcMaxExternalPort;
    }

    /**
     */
    public void setRtcMaxExternalPort(Integer rtcMaxExternalPort) {
        this.rtcMaxExternalPort = rtcMaxExternalPort;
    }

    /**
     */
    public String getResetTastUid() {
        return resetTastUid;
    }

    /**
     */
    public void setResetTastUid(String resetTastUid) {
        this.resetTastUid = resetTastUid;
    }

    /**
     */
    public String getUploadImageTaskId() {
        return uploadImageTaskId;
    }

    /**
     */
    public void setUploadImageTaskId(String uploadImageTaskId) {
        this.uploadImageTaskId = uploadImageTaskId;
    }

    /**
     */
    public String getResetReponse() {
        return resetReponse;
    }

    /**
     */
    public void setResetReponse(String resetReponse) {
        this.resetReponse = resetReponse;
    }

    /**
     */
    public String getUploadResponse() {
        return uploadResponse;
    }

    /**
     */
    public void setUploadResponse(String uploadResponse) {
        this.uploadResponse = uploadResponse;
    }

    @Override
    public String toString() {
        return "BaiduDevice{" + "id=" + id + ", deviceId=" + deviceId + ", fkBaiduAccountId=" + fkBaiduAccountId + ", uid=" + uid + ", code=" + code + ", groupCode=" + groupCode + ", idcCode=" + idcCode + ", imageVersionId=" + imageVersionId + ", lastResetTime=" + lastResetTime + ", resetStatus=" + resetStatus + ", resetImageVersionId=" + resetImageVersionId + ", orderCode=" + orderCode + ", deliverDay=" + deliverDay + ", oldCode=" + oldCode + ", sn=" + sn + ", ip=" + ip + ", paas=" + paas + ", deviceCode=" + deviceCode + ", deviceIp=" + deviceIp + ", hardwareCode=" + hardwareCode + ", unitSeg=" + unitSeg + ", bootTime=" + bootTime + ", hbTime=" + hbTime + ", alertExpireTime=" + alertExpireTime + ", offlineTime=" + offlineTime + ", tx=" + tx + ", rx=" + rx + ", statusOnline=" + statusOnline + ", offSeconds=" + offSeconds + ", errorMessage=" + errorMessage + ", statusControl=" + statusControl + ", alertEnabled=" + alertEnabled + ", statusPaaS=" + statusPaaS + ", lastApplyUsername=" + lastApplyUsername + ", lastApplyDate=" + lastApplyDate + ", lastActiveDate=" + lastActiveDate + ", pkgs=" + pkgs + ", tag=" + tag + ", captureOk=" + captureOk + ", capDiff=" + capDiff + ", dgVersion=" + dgVersion + ", dgVersionCode=" + dgVersionCode + ", dgXmStatus=" + dgXmStatus + ", dgTopApp=" + dgTopApp + ", dgDisplayWidth=" + dgDisplayWidth + ", dgAppsCount=" + dgAppsCount + ", dgPropProduct=" + dgPropProduct + ", dgSimImei=" + dgSimImei + ", dgNetStatus=" + dgNetStatus + ", dgNetBs=" + dgNetBs + ", dgProxyHost=" + dgProxyHost + ", dgProxyPort=" + dgProxyPort + ", dgProxyUsername=" + dgProxyUsername + ", dgProxyLocation=" + dgProxyLocation + ", dgProxyIp=" + dgProxyIp + ", createTime=" + createTime + ", lastUpdateTime=" + lastUpdateTime + ", lastSyncTime=" + lastSyncTime + ", fkCloudRegionId=" + fkCloudRegionId + ", pubIp=" + pubIp + ", audioSockType=" + audioSockType + ", audioPort=" + audioPort + ", audioExternalPort=" + audioExternalPort + ", videoPort=" + videoPort + ", videoExternalPort=" + videoExternalPort + ", maxslots=" + maxslots + ", rtcMinPort=" + rtcMinPort + ", rtcMaxPort=" + rtcMaxPort + ", rtcMinExternalPort=" + rtcMinExternalPort + ", rtcMaxExternalPort=" + rtcMaxExternalPort + ", resetTastUid=" + resetTastUid + ", uploadImageTaskId=" + uploadImageTaskId + ", resetReponse=" + resetReponse + ", uploadResponse=" + uploadResponse + "}";
    }
}
