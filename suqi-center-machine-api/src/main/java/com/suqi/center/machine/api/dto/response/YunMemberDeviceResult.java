package com.suqi.center.machine.api.dto.response;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 用户设备表（yun_member_device）
 * </p>
 *
 * @author PC001
 * @since 2023-08-28
 */
@ApiModel(value = "YunMemberDevice对象", description = "用户设备表（yun_member_device）")
public class YunMemberDeviceResult implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("id")

    private Long id;
    @ApiModelProperty("用户id")

    private Long fkMemberId;
    @ApiModelProperty("分组id")

    private Long fkEmMemberGroupId;
    @ApiModelProperty("用户设备编号")

    private String userDeviceNo;
    @ApiModelProperty("严选下单实例id")

    private String smkpInstanceId;
    @ApiModelProperty("物理设备id")

    private Long fkEmSocDevicesId;
    @ApiModelProperty("虚拟设备id")

    private Long fkSocVmDevicesId;
    @ApiModelProperty("分组名称")

    private String memberGroupName;
    @ApiModelProperty("云机产品id")

    private Long fkYunProductId;
    @ApiModelProperty("云机产品套餐skuid")

    private Long fkYunProductSkuId;
    @ApiModelProperty("产品名称")

    private String productName;
    @ApiModelProperty("设备唯一码")

    private String deviceId;
    @ApiModelProperty("设备名")

    private String deviceName;
    @ApiModelProperty("使用有效期开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date validStartTime;
    @ApiModelProperty("使用有效期结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date validEndTime;
    @ApiModelProperty("冻结开始时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date freezeStartTime;
    @ApiModelProperty("冻结结束时间（释放设备的时间）")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date freezeEndTime;
    @ApiModelProperty("总天数（单位：天）")

    private Integer totalAvailableDays;
    @ApiModelProperty("总时长（单位：小时）")

    private Integer totalAvailableTimes;
    @ApiModelProperty("剩余可用天数")

    private Integer restValidDays;
    @ApiModelProperty("剩余可用时长")

    private Integer restValidTimes;
    @ApiModelProperty("设备类型(1:测试设备，2：商用设备)")

    private Integer bizType;
    @ApiModelProperty("设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）")

    private Integer sourceType;
    @ApiModelProperty("过期缓冲时间")

    private Integer expiredTimes;
    @ApiModelProperty("生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)")

    private String lifecycle;
    @ApiModelProperty("恢复出厂设置次数")

    private Integer factoryResetTimes;
    @ApiModelProperty("是否静音（静音：1，非静音：0）")

    private Integer isSilent;
    @ApiModelProperty("重启设备次数")

    private Integer rebootTimes;
    @ApiModelProperty("客户申报故障（0：无，1故障）")

    private Integer failure;
    @ApiModelProperty("应用同步安装(0：未执行，1同步中)")

    private Integer syncInstall;
    @ApiModelProperty("房间session")

    private String roomSession;
    @ApiModelProperty("房间最大容纳成员数")

    private Integer roomPeopleMaxNum;
    @ApiModelProperty("房间当前总成员数")

    private Integer roomPeopleTotalNum;
    @ApiModelProperty("用户设备分配状态（未分配：0，已分配：1）")

    private Integer allotStatus;
    @ApiModelProperty("盒子服务类型(10：boxStream服务，20：boxRtc服务）")

    private Integer serverType;
    @ApiModelProperty("服务业务类型（0：普通业务类型，1：排队业务类型）")

    private Integer serviceBizType;
    @ApiModelProperty("打开当前应用的下行宽带（kb）")

    private Long downstreamBroadband;
    @ApiModelProperty("设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）")

    private Integer status;
    @ApiModelProperty("订购时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date buyTime;
    @ApiModelProperty("最近一次续费时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastRenewTime;
    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
    @ApiModelProperty("设备空闲上报时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date idleTime;

    private Long versionId;

    private String proxyProvince;

    private String proxyCity;
    @ApiModelProperty("代理服务器的地址，缺省或null或\"\"时，表示没有使用代理")

    private String proxyServer;
    @ApiModelProperty("代理是否连上")

    private Boolean connected;
    @ApiModelProperty("当前代理的网络IP")

    private String proxyNetIp;
    @ApiModelProperty("IP的地理位置显示")

    private String proxyNetIpAddress;
    @ApiModelProperty("是否种子机（0：否，1：是）")

    private Boolean seedDevice;
    @ApiModelProperty("物理机使用率记录id")

    private Long fkServerHostUsageRateId;
    @ApiModelProperty("区域id")

    private Long fkPcpAreaId;

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 用户id
     */
    public Long getFkMemberId() {
        return fkMemberId;
    }

    /**
     * 用户id
     */
    public void setFkMemberId(Long fkMemberId) {
        this.fkMemberId = fkMemberId;
    }
    /**
     * 分组id
     */
    public Long getFkEmMemberGroupId() {
        return fkEmMemberGroupId;
    }

    /**
     * 分组id
     */
    public void setFkEmMemberGroupId(Long fkEmMemberGroupId) {
        this.fkEmMemberGroupId = fkEmMemberGroupId;
    }
    /**
     * 用户设备编号
     */
    public String getUserDeviceNo() {
        return userDeviceNo;
    }

    /**
     * 用户设备编号
     */
    public void setUserDeviceNo(String userDeviceNo) {
        this.userDeviceNo = userDeviceNo;
    }
    /**
     * 严选下单实例id
     */
    public String getSmkpInstanceId() {
        return smkpInstanceId;
    }

    /**
     * 严选下单实例id
     */
    public void setSmkpInstanceId(String smkpInstanceId) {
        this.smkpInstanceId = smkpInstanceId;
    }
    /**
     * 物理设备id
     */
    public Long getFkEmSocDevicesId() {
        return fkEmSocDevicesId;
    }

    /**
     * 物理设备id
     */
    public void setFkEmSocDevicesId(Long fkEmSocDevicesId) {
        this.fkEmSocDevicesId = fkEmSocDevicesId;
    }
    /**
     * 虚拟设备id
     */
    public Long getFkSocVmDevicesId() {
        return fkSocVmDevicesId;
    }

    /**
     * 虚拟设备id
     */
    public void setFkSocVmDevicesId(Long fkSocVmDevicesId) {
        this.fkSocVmDevicesId = fkSocVmDevicesId;
    }
    /**
     * 分组名称
     */
    public String getMemberGroupName() {
        return memberGroupName;
    }

    /**
     * 分组名称
     */
    public void setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
    }
    /**
     * 云机产品id
     */
    public Long getFkYunProductId() {
        return fkYunProductId;
    }

    /**
     * 云机产品id
     */
    public void setFkYunProductId(Long fkYunProductId) {
        this.fkYunProductId = fkYunProductId;
    }
    /**
     * 云机产品套餐skuid
     */
    public Long getFkYunProductSkuId() {
        return fkYunProductSkuId;
    }

    /**
     * 云机产品套餐skuid
     */
    public void setFkYunProductSkuId(Long fkYunProductSkuId) {
        this.fkYunProductSkuId = fkYunProductSkuId;
    }
    /**
     * 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    /**
     * 设备唯一码
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设备唯一码
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    /**
     * 设备名
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * 设备名
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    /**
     * 使用有效期开始时间
     */
    public Date getValidStartTime() {
        return validStartTime;
    }

    /**
     * 使用有效期开始时间
     */
    public void setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
    }
    /**
     * 使用有效期结束时间
     */
    public Date getValidEndTime() {
        return validEndTime;
    }

    /**
     * 使用有效期结束时间
     */
    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
    }
    /**
     * 冻结开始时间
     */
    public Date getFreezeStartTime() {
        return freezeStartTime;
    }

    /**
     * 冻结开始时间
     */
    public void setFreezeStartTime(Date freezeStartTime) {
        this.freezeStartTime = freezeStartTime;
    }
    /**
     * 冻结结束时间（释放设备的时间）
     */
    public Date getFreezeEndTime() {
        return freezeEndTime;
    }

    /**
     * 冻结结束时间（释放设备的时间）
     */
    public void setFreezeEndTime(Date freezeEndTime) {
        this.freezeEndTime = freezeEndTime;
    }
    /**
     * 总天数（单位：天）
     */
    public Integer getTotalAvailableDays() {
        return totalAvailableDays;
    }

    /**
     * 总天数（单位：天）
     */
    public void setTotalAvailableDays(Integer totalAvailableDays) {
        this.totalAvailableDays = totalAvailableDays;
    }
    /**
     * 总时长（单位：小时）
     */
    public Integer getTotalAvailableTimes() {
        return totalAvailableTimes;
    }

    /**
     * 总时长（单位：小时）
     */
    public void setTotalAvailableTimes(Integer totalAvailableTimes) {
        this.totalAvailableTimes = totalAvailableTimes;
    }
    /**
     * 剩余可用天数
     */
    public Integer getRestValidDays() {
        return restValidDays;
    }

    /**
     * 剩余可用天数
     */
    public void setRestValidDays(Integer restValidDays) {
        this.restValidDays = restValidDays;
    }
    /**
     * 剩余可用时长
     */
    public Integer getRestValidTimes() {
        return restValidTimes;
    }

    /**
     * 剩余可用时长
     */
    public void setRestValidTimes(Integer restValidTimes) {
        this.restValidTimes = restValidTimes;
    }
    /**
     * 设备类型(1:测试设备，2：商用设备)
     */
    public Integer getBizType() {
        return bizType;
    }

    /**
     * 设备类型(1:测试设备，2：商用设备)
     */
    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }
    /**
     * 设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * 设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }
    /**
     * 过期缓冲时间
     */
    public Integer getExpiredTimes() {
        return expiredTimes;
    }

    /**
     * 过期缓冲时间
     */
    public void setExpiredTimes(Integer expiredTimes) {
        this.expiredTimes = expiredTimes;
    }
    /**
     * 生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)
     */
    public String getLifecycle() {
        return lifecycle;
    }

    /**
     * 生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)
     */
    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }
    /**
     * 恢复出厂设置次数
     */
    public Integer getFactoryResetTimes() {
        return factoryResetTimes;
    }

    /**
     * 恢复出厂设置次数
     */
    public void setFactoryResetTimes(Integer factoryResetTimes) {
        this.factoryResetTimes = factoryResetTimes;
    }
    /**
     * 是否静音（静音：1，非静音：0）
     */
    public Integer getIsSilent() {
        return isSilent;
    }

    /**
     * 是否静音（静音：1，非静音：0）
     */
    public void setIsSilent(Integer isSilent) {
        this.isSilent = isSilent;
    }
    /**
     * 重启设备次数
     */
    public Integer getRebootTimes() {
        return rebootTimes;
    }

    /**
     * 重启设备次数
     */
    public void setRebootTimes(Integer rebootTimes) {
        this.rebootTimes = rebootTimes;
    }
    /**
     * 客户申报故障（0：无，1故障）
     */
    public Integer getFailure() {
        return failure;
    }

    /**
     * 客户申报故障（0：无，1故障）
     */
    public void setFailure(Integer failure) {
        this.failure = failure;
    }
    /**
     * 应用同步安装(0：未执行，1同步中)
     */
    public Integer getSyncInstall() {
        return syncInstall;
    }

    /**
     * 应用同步安装(0：未执行，1同步中)
     */
    public void setSyncInstall(Integer syncInstall) {
        this.syncInstall = syncInstall;
    }
    /**
     * 房间session
     */
    public String getRoomSession() {
        return roomSession;
    }

    /**
     * 房间session
     */
    public void setRoomSession(String roomSession) {
        this.roomSession = roomSession;
    }
    /**
     * 房间最大容纳成员数
     */
    public Integer getRoomPeopleMaxNum() {
        return roomPeopleMaxNum;
    }

    /**
     * 房间最大容纳成员数
     */
    public void setRoomPeopleMaxNum(Integer roomPeopleMaxNum) {
        this.roomPeopleMaxNum = roomPeopleMaxNum;
    }
    /**
     * 房间当前总成员数
     */
    public Integer getRoomPeopleTotalNum() {
        return roomPeopleTotalNum;
    }

    /**
     * 房间当前总成员数
     */
    public void setRoomPeopleTotalNum(Integer roomPeopleTotalNum) {
        this.roomPeopleTotalNum = roomPeopleTotalNum;
    }
    /**
     * 用户设备分配状态（未分配：0，已分配：1）
     */
    public Integer getAllotStatus() {
        return allotStatus;
    }

    /**
     * 用户设备分配状态（未分配：0，已分配：1）
     */
    public void setAllotStatus(Integer allotStatus) {
        this.allotStatus = allotStatus;
    }
    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务）
     */
    public Integer getServerType() {
        return serverType;
    }

    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务）
     */
    public void setServerType(Integer serverType) {
        this.serverType = serverType;
    }
    /**
     * 服务业务类型（0：普通业务类型，1：排队业务类型）
     */
    public Integer getServiceBizType() {
        return serviceBizType;
    }

    /**
     * 服务业务类型（0：普通业务类型，1：排队业务类型）
     */
    public void setServiceBizType(Integer serviceBizType) {
        this.serviceBizType = serviceBizType;
    }
    /**
     * 打开当前应用的下行宽带（kb）
     */
    public Long getDownstreamBroadband() {
        return downstreamBroadband;
    }

    /**
     * 打开当前应用的下行宽带（kb）
     */
    public void setDownstreamBroadband(Long downstreamBroadband) {
        this.downstreamBroadband = downstreamBroadband;
    }
    /**
     * 设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**
     * 订购时间
     */
    public Date getBuyTime() {
        return buyTime;
    }

    /**
     * 订购时间
     */
    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }
    /**
     * 最近一次续费时间
     */
    public Date getLastRenewTime() {
        return lastRenewTime;
    }

    /**
     * 最近一次续费时间
     */
    public void setLastRenewTime(Date lastRenewTime) {
        this.lastRenewTime = lastRenewTime;
    }
    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
     * 设备空闲上报时间
     */
    public Date getIdleTime() {
        return idleTime;
    }

    /**
     * 设备空闲上报时间
     */
    public void setIdleTime(Date idleTime) {
        this.idleTime = idleTime;
    }
    /**
     * 
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }
    /**
     * 
     */
    public String getProxyProvince() {
        return proxyProvince;
    }

    /**
     * 
     */
    public void setProxyProvince(String proxyProvince) {
        this.proxyProvince = proxyProvince;
    }
    /**
     * 
     */
    public String getProxyCity() {
        return proxyCity;
    }

    /**
     * 
     */
    public void setProxyCity(String proxyCity) {
        this.proxyCity = proxyCity;
    }
    /**
     * 代理服务器的地址，缺省或null或\"\"时，表示没有使用代理
     */
    public String getProxyServer() {
        return proxyServer;
    }

    /**
     * 代理服务器的地址，缺省或null或\"\"时，表示没有使用代理
     */
    public void setProxyServer(String proxyServer) {
        this.proxyServer = proxyServer;
    }
    /**
     * 代理是否连上
     */
    public Boolean getConnected() {
        return connected;
    }

    /**
     * 代理是否连上
     */
    public void setConnected(Boolean connected) {
        this.connected = connected;
    }
    /**
     * 当前代理的网络IP
     */
    public String getProxyNetIp() {
        return proxyNetIp;
    }

    /**
     * 当前代理的网络IP
     */
    public void setProxyNetIp(String proxyNetIp) {
        this.proxyNetIp = proxyNetIp;
    }
    /**
     * IP的地理位置显示
     */
    public String getProxyNetIpAddress() {
        return proxyNetIpAddress;
    }

    /**
     * IP的地理位置显示
     */
    public void setProxyNetIpAddress(String proxyNetIpAddress) {
        this.proxyNetIpAddress = proxyNetIpAddress;
    }
    /**
     * 是否种子机（0：否，1：是）
     */
    public Boolean getSeedDevice() {
        return seedDevice;
    }

    /**
     * 是否种子机（0：否，1：是）
     */
    public void setSeedDevice(Boolean seedDevice) {
        this.seedDevice = seedDevice;
    }
    /**
     * 物理机使用率记录id
     */
    public Long getFkServerHostUsageRateId() {
        return fkServerHostUsageRateId;
    }

    /**
     * 物理机使用率记录id
     */
    public void setFkServerHostUsageRateId(Long fkServerHostUsageRateId) {
        this.fkServerHostUsageRateId = fkServerHostUsageRateId;
    }
    /**
     * 区域id
     */
    public Long getFkPcpAreaId() {
        return fkPcpAreaId;
    }

    /**
     * 区域id
     */
    public void setFkPcpAreaId(Long fkPcpAreaId) {
        this.fkPcpAreaId = fkPcpAreaId;
    }

    @Override
    public String toString() {
        return "YunMemberDevice{" +
            "id=" + id +
            ", fkMemberId=" + fkMemberId +
            ", fkEmMemberGroupId=" + fkEmMemberGroupId +
            ", userDeviceNo=" + userDeviceNo +
            ", smkpInstanceId=" + smkpInstanceId +
            ", fkEmSocDevicesId=" + fkEmSocDevicesId +
            ", fkSocVmDevicesId=" + fkSocVmDevicesId +
            ", memberGroupName=" + memberGroupName +
            ", fkYunProductId=" + fkYunProductId +
            ", fkYunProductSkuId=" + fkYunProductSkuId +
            ", productName=" + productName +
            ", deviceId=" + deviceId +
            ", deviceName=" + deviceName +
            ", validStartTime=" + validStartTime +
            ", validEndTime=" + validEndTime +
            ", freezeStartTime=" + freezeStartTime +
            ", freezeEndTime=" + freezeEndTime +
            ", totalAvailableDays=" + totalAvailableDays +
            ", totalAvailableTimes=" + totalAvailableTimes +
            ", restValidDays=" + restValidDays +
            ", restValidTimes=" + restValidTimes +
            ", bizType=" + bizType +
            ", sourceType=" + sourceType +
            ", expiredTimes=" + expiredTimes +
            ", lifecycle=" + lifecycle +
            ", factoryResetTimes=" + factoryResetTimes +
            ", isSilent=" + isSilent +
            ", rebootTimes=" + rebootTimes +
            ", failure=" + failure +
            ", syncInstall=" + syncInstall +
            ", roomSession=" + roomSession +
            ", roomPeopleMaxNum=" + roomPeopleMaxNum +
            ", roomPeopleTotalNum=" + roomPeopleTotalNum +
            ", allotStatus=" + allotStatus +
            ", serverType=" + serverType +
            ", serviceBizType=" + serviceBizType +
            ", downstreamBroadband=" + downstreamBroadband +
            ", status=" + status +
            ", buyTime=" + buyTime +
            ", lastRenewTime=" + lastRenewTime +
            ", createTime=" + createTime +
            ", idleTime=" + idleTime +
            ", versionId=" + versionId +
            ", proxyProvince=" + proxyProvince +
            ", proxyCity=" + proxyCity +
            ", proxyServer=" + proxyServer +
            ", connected=" + connected +
            ", proxyNetIp=" + proxyNetIp +
            ", proxyNetIpAddress=" + proxyNetIpAddress +
            ", seedDevice=" + seedDevice +
            ", fkServerHostUsageRateId=" + fkServerHostUsageRateId +
            ", fkPcpAreaId=" + fkPcpAreaId +
        "}";
    }



}
