package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.YunMemberDeviceQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberDeviceUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberDeviceUpdateWrapper;
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
 * 用户设备表（yun_member_device）
 * </p>
 *
 * @author PC001
 * @since 2023-08-29
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("yun_member_device")
@ApiModel(value = "YunMemberDevice对象", description = "用户设备表（yun_member_device）")
public class YunMemberDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户id")
    @TableField("fk_member_id")
    private Long fkMemberId;

    @ApiModelProperty("分组id")
    @TableField("fk_em_member_group_id")
    private Long fkEmMemberGroupId;

    @ApiModelProperty("用户设备编号")
    @TableField("user_device_no")
    private String userDeviceNo;

    @ApiModelProperty("严选下单实例id")
    @TableField("smkp_instance_id")
    private String smkpInstanceId;

    @ApiModelProperty("物理设备id")
    @TableField("fk_em_soc_devices_id")
    private Long fkEmSocDevicesId;

    @ApiModelProperty("虚拟设备id")
    @TableField("fk_soc_vm_devices_id")
    private Long fkSocVmDevicesId;

    @ApiModelProperty("分组名称")
    @TableField("member_group_name")
    private String memberGroupName;

    @ApiModelProperty("云机产品id")
    @TableField("fk_yun_product_id")
    private Long fkYunProductId;

    @ApiModelProperty("云机产品套餐skuid")
    @TableField("fk_yun_product_sku_id")
    private Long fkYunProductSkuId;

    @ApiModelProperty("产品名称")
    @TableField("product_name")
    private String productName;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备名")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("使用有效期开始时间")
    @TableField("valid_start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date validStartTime;

    @ApiModelProperty("使用有效期结束时间")
    @TableField("valid_end_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date validEndTime;

    @ApiModelProperty("冻结开始时间")
    @TableField("freeze_start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date freezeStartTime;

    @ApiModelProperty("冻结结束时间（释放设备的时间）")
    @TableField("freeze_end_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date freezeEndTime;

    @ApiModelProperty("总天数（单位：天）")
    @TableField("total_available_days")
    private Integer totalAvailableDays;

    @ApiModelProperty("总时长（单位：小时）")
    @TableField("total_available_times")
    private Integer totalAvailableTimes;

    @ApiModelProperty("剩余可用天数")
    @TableField("rest_valid_days")
    private Integer restValidDays;

    @ApiModelProperty("剩余可用时长")
    @TableField("rest_valid_times")
    private Integer restValidTimes;

    @ApiModelProperty("设备类型(1:测试设备，2：商用设备)")
    @TableField("biz_type")
    private Integer bizType;

    @ApiModelProperty("设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）")
    @TableField("source_type")
    private Integer sourceType;

    @ApiModelProperty("过期缓冲时间")
    @TableField("expired_times")
    private Integer expiredTimes;

    @ApiModelProperty("生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)")
    @TableField("lifecycle")
    private String lifecycle;

    @ApiModelProperty("恢复出厂设置次数")
    @TableField("factory_reset_times")
    private Integer factoryResetTimes;

    @ApiModelProperty("是否静音（静音：1，非静音：0）")
    @TableField("is_silent")
    private Integer isSilent;

    @ApiModelProperty("重启设备次数")
    @TableField("reboot_times")
    private Integer rebootTimes;

    @ApiModelProperty("客户申报故障（0：无，1故障）")
    @TableField("failure")
    private Integer failure;

    @ApiModelProperty("应用同步安装(0：未执行，1同步中)")
    @TableField("sync_install")
    private Integer syncInstall;

    @ApiModelProperty("房间session")
    @TableField("room_session")
    private String roomSession;

    @ApiModelProperty("房间最大容纳成员数")
    @TableField("room_people_max_num")
    private Integer roomPeopleMaxNum;

    @ApiModelProperty("房间当前总成员数")
    @TableField("room_people_total_num")
    private Integer roomPeopleTotalNum;

    @ApiModelProperty("用户设备分配状态（未分配：0，已分配：1）")
    @TableField("allot_status")
    private Integer allotStatus;

    @ApiModelProperty("盒子服务类型(10：boxStream服务，20：boxRtc服务）")
    @TableField("server_type")
    private Integer serverType;

    @ApiModelProperty("服务业务类型（0：普通业务类型，1：排队业务类型）")
    @TableField("service_biz_type")
    private Integer serviceBizType;

    @ApiModelProperty("打开当前应用的下行宽带（kb）")
    @TableField("downstream_broadband")
    private Long downstreamBroadband;

    @ApiModelProperty("设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("订购时间")
    @TableField("buy_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date buyTime;

    @ApiModelProperty("最近一次续费时间")
    @TableField("last_renew_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastRenewTime;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("设备空闲上报时间")
    @TableField("idle_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date idleTime;

    @TableField("version_id")
    private Long versionId;

    @TableField("proxy_province")
    private String proxyProvince;

    @TableField("proxy_city")
    private String proxyCity;

    @ApiModelProperty("代理服务器的地址，缺省或null或\"\"时，表示没有使用代理")
    @TableField("proxy_server")
    private String proxyServer;

    @ApiModelProperty("代理是否连上")
    @TableField("connected")
    private Boolean connected;

    @ApiModelProperty("当前代理的网络IP")
    @TableField("proxy_net_ip")
    private String proxyNetIp;

    @ApiModelProperty("IP的地理位置显示")
    @TableField("proxy_net_ip_address")
    private String proxyNetIpAddress;

    @ApiModelProperty("是否种子机（0：否，1：是）")
    @TableField("seed_device")
    private Boolean seedDevice;

    @ApiModelProperty("物理机使用率记录id")
    @TableField("fk_server_host_usage_rate_id")
    private Long fkServerHostUsageRateId;

    @ApiModelProperty("区域id")
    @TableField("fk_pcp_area_id")
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

    /**
     * id
     */
    public static final String ID = "id";

    /**
     * 用户id
     */
    public static final String FK_MEMBER_ID = "fk_member_id";

    /**
     * 分组id
     */
    public static final String FK_EM_MEMBER_GROUP_ID = "fk_em_member_group_id";

    /**
     * 用户设备编号
     */
    public static final String USER_DEVICE_NO = "user_device_no";

    /**
     * 严选下单实例id
     */
    public static final String SMKP_INSTANCE_ID = "smkp_instance_id";

    /**
     * 物理设备id
     */
    public static final String FK_EM_SOC_DEVICES_ID = "fk_em_soc_devices_id";

    /**
     * 虚拟设备id
     */
    public static final String FK_SOC_VM_DEVICES_ID = "fk_soc_vm_devices_id";

    /**
     * 分组名称
     */
    public static final String MEMBER_GROUP_NAME = "member_group_name";

    /**
     * 云机产品id
     */
    public static final String FK_YUN_PRODUCT_ID = "fk_yun_product_id";

    /**
     * 云机产品套餐skuid
     */
    public static final String FK_YUN_PRODUCT_SKU_ID = "fk_yun_product_sku_id";

    /**
     * 产品名称
     */
    public static final String PRODUCT_NAME = "product_name";

    /**
     * 设备唯一码
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 设备名
     */
    public static final String DEVICE_NAME = "device_name";

    /**
     * 使用有效期开始时间
     */
    public static final String VALID_START_TIME = "valid_start_time";

    /**
     * 使用有效期结束时间
     */
    public static final String VALID_END_TIME = "valid_end_time";

    /**
     * 冻结开始时间
     */
    public static final String FREEZE_START_TIME = "freeze_start_time";

    /**
     * 冻结结束时间（释放设备的时间）
     */
    public static final String FREEZE_END_TIME = "freeze_end_time";

    /**
     * 总天数（单位：天）
     */
    public static final String TOTAL_AVAILABLE_DAYS = "total_available_days";

    /**
     * 总时长（单位：小时）
     */
    public static final String TOTAL_AVAILABLE_TIMES = "total_available_times";

    /**
     * 剩余可用天数
     */
    public static final String REST_VALID_DAYS = "rest_valid_days";

    /**
     * 剩余可用时长
     */
    public static final String REST_VALID_TIMES = "rest_valid_times";

    /**
     * 设备类型(1:测试设备，2：商用设备)
     */
    public static final String BIZ_TYPE = "biz_type";

    /**
     * 设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）
     */
    public static final String SOURCE_TYPE = "source_type";

    /**
     * 过期缓冲时间
     */
    public static final String EXPIRED_TIMES = "expired_times";

    /**
     * 生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)
     */
    public static final String LIFECYCLE = "lifecycle";

    /**
     * 恢复出厂设置次数
     */
    public static final String FACTORY_RESET_TIMES = "factory_reset_times";

    /**
     * 是否静音（静音：1，非静音：0）
     */
    public static final String IS_SILENT = "is_silent";

    /**
     * 重启设备次数
     */
    public static final String REBOOT_TIMES = "reboot_times";

    /**
     * 客户申报故障（0：无，1故障）
     */
    public static final String FAILURE = "failure";

    /**
     * 应用同步安装(0：未执行，1同步中)
     */
    public static final String SYNC_INSTALL = "sync_install";

    /**
     * 房间session
     */
    public static final String ROOM_SESSION = "room_session";

    /**
     * 房间最大容纳成员数
     */
    public static final String ROOM_PEOPLE_MAX_NUM = "room_people_max_num";

    /**
     * 房间当前总成员数
     */
    public static final String ROOM_PEOPLE_TOTAL_NUM = "room_people_total_num";

    /**
     * 用户设备分配状态（未分配：0，已分配：1）
     */
    public static final String ALLOT_STATUS = "allot_status";

    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务）
     */
    public static final String SERVER_TYPE = "server_type";

    /**
     * 服务业务类型（0：普通业务类型，1：排队业务类型）
     */
    public static final String SERVICE_BIZ_TYPE = "service_biz_type";

    /**
     * 打开当前应用的下行宽带（kb）
     */
    public static final String DOWNSTREAM_BROADBAND = "downstream_broadband";

    /**
     * 设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）
     */
    public static final String STATUS = "status";

    /**
     * 订购时间
     */
    public static final String BUY_TIME = "buy_time";

    /**
     * 最近一次续费时间
     */
    public static final String LAST_RENEW_TIME = "last_renew_time";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 设备空闲上报时间
     */
    public static final String IDLE_TIME = "idle_time";

    /**
     * 
     */
    public static final String VERSION_ID = "version_id";

    /**
     * 
     */
    public static final String PROXY_PROVINCE = "proxy_province";

    /**
     * 
     */
    public static final String PROXY_CITY = "proxy_city";

    /**
     * 代理服务器的地址，缺省或null或\"\"时，表示没有使用代理
     */
    public static final String PROXY_SERVER = "proxy_server";

    /**
     * 代理是否连上
     */
    public static final String CONNECTED = "connected";

    /**
     * 当前代理的网络IP
     */
    public static final String PROXY_NET_IP = "proxy_net_ip";

    /**
     * IP的地理位置显示
     */
    public static final String PROXY_NET_IP_ADDRESS = "proxy_net_ip_address";

    /**
     * 是否种子机（0：否，1：是）
     */
    public static final String SEED_DEVICE = "seed_device";

    /**
     * 物理机使用率记录id
     */
    public static final String FK_SERVER_HOST_USAGE_RATE_ID = "fk_server_host_usage_rate_id";

    /**
     * 区域id
     */
    public static final String FK_PCP_AREA_ID = "fk_pcp_area_id";

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

    public YunMemberDeviceQueryEntityWrapper queryWrapper(){
        return YunMemberDeviceQueryEntityWrapper.wrapper(this);
    }

    public YunMemberDeviceUpdateEntityWrapper updateWrapper(){
        return YunMemberDeviceUpdateEntityWrapper.wrapper(this);
    }

    public static YunMemberDeviceQueryWrapper qWrapper(){
        return YunMemberDeviceQueryWrapper.wrapper();
    }

    public static YunMemberDeviceUpdateWrapper uWrapper(){
        return YunMemberDeviceUpdateWrapper.wrapper();
    }

}
