package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.YunMemberUserDeviceQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberUserDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberUserDeviceUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.YunMemberUserDeviceUpdateWrapper;
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
 * 商户用户设备表（yun_member_user_device）
 * </p>
 *
 * @author PC001
 * @since 2023-10-24
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("yun_member_user_device")
@ApiModel(value = "YunMemberUserDevice对象", description = "商户用户设备表（yun_member_user_device）")
public class YunMemberUserDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("商户id")
    @TableField("fk_member_id")
    private Long fkMemberId;

    @ApiModelProperty("商户设备表id")
    @TableField("fk_yun_member_facilities_id")
    private Long fkYunMemberFacilitiesId;

    @ApiModelProperty("商户用户id")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("设备id")
    @TableField("facilities_id")
    private String facilitiesId;

    @ApiModelProperty("用户设备id")
    @TableField("user_phone_id")
    private String userPhoneId;

    @ApiModelProperty("调用方保证每次分配唯一请求id")
    @TableField("request_id")
    private String requestId;

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

    @ApiModelProperty("设备状态（冻结：0，使用中：50，已过期/注销：-50）")
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

    @ApiModelProperty("最近修改时间")
    @TableField("last_update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @TableField("version_id")
    private Long versionId;

    @ApiModelProperty("运行状态(0：空闲，1：运行中)")
    @TableField("running_status")
    private Integer runningStatus;

    @ApiModelProperty("手机规格名称，不得超过64byte。(废弃)")
    @TableField("spec_code")
    private String specCode;

    @ApiModelProperty("设备系统标签Id")
    @TableField("fk_sys_device_label_id")
    private Long fkSysDeviceLabelId;

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
     * 商户id
     */
    public Long getFkMemberId() {
        return fkMemberId;
    }

    /**
     * 商户id
     */
    public void setFkMemberId(Long fkMemberId) {
        this.fkMemberId = fkMemberId;
    }
    /**
     * 商户设备表id
     */
    public Long getFkYunMemberFacilitiesId() {
        return fkYunMemberFacilitiesId;
    }

    /**
     * 商户设备表id
     */
    public void setFkYunMemberFacilitiesId(Long fkYunMemberFacilitiesId) {
        this.fkYunMemberFacilitiesId = fkYunMemberFacilitiesId;
    }
    /**
     * 商户用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 商户用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    /**
     * 设备id
     */
    public String getFacilitiesId() {
        return facilitiesId;
    }

    /**
     * 设备id
     */
    public void setFacilitiesId(String facilitiesId) {
        this.facilitiesId = facilitiesId;
    }
    /**
     * 用户设备id
     */
    public String getUserPhoneId() {
        return userPhoneId;
    }

    /**
     * 用户设备id
     */
    public void setUserPhoneId(String userPhoneId) {
        this.userPhoneId = userPhoneId;
    }
    /**
     * 调用方保证每次分配唯一请求id
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * 调用方保证每次分配唯一请求id
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
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
     * 设备状态（冻结：0，使用中：50，已过期/注销：-50）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设备状态（冻结：0，使用中：50，已过期/注销：-50）
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
     * 最近修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 最近修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
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
     * 运行状态(0：空闲，1：运行中)
     */
    public Integer getRunningStatus() {
        return runningStatus;
    }

    /**
     * 运行状态(0：空闲，1：运行中)
     */
    public void setRunningStatus(Integer runningStatus) {
        this.runningStatus = runningStatus;
    }
    /**
     * 手机规格名称，不得超过64byte。(废弃)
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * 手机规格名称，不得超过64byte。(废弃)
     */
    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }
    /**
     * 设备系统标签Id
     */
    public Long getFkSysDeviceLabelId() {
        return fkSysDeviceLabelId;
    }

    /**
     * 设备系统标签Id
     */
    public void setFkSysDeviceLabelId(Long fkSysDeviceLabelId) {
        this.fkSysDeviceLabelId = fkSysDeviceLabelId;
    }

    /**
     * id
     */
    public static final String ID = "id";

    /**
     * 商户id
     */
    public static final String FK_MEMBER_ID = "fk_member_id";

    /**
     * 商户设备表id
     */
    public static final String FK_YUN_MEMBER_FACILITIES_ID = "fk_yun_member_facilities_id";

    /**
     * 商户用户id
     */
    public static final String USER_ID = "user_id";

    /**
     * 设备id
     */
    public static final String FACILITIES_ID = "facilities_id";

    /**
     * 用户设备id
     */
    public static final String USER_PHONE_ID = "user_phone_id";

    /**
     * 调用方保证每次分配唯一请求id
     */
    public static final String REQUEST_ID = "request_id";

    /**
     * 使用有效期开始时间
     */
    public static final String VALID_START_TIME = "valid_start_time";

    /**
     * 使用有效期结束时间
     */
    public static final String VALID_END_TIME = "valid_end_time";

    /**
     * 设备状态（冻结：0，使用中：50，已过期/注销：-50）
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
     * 最近修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 
     */
    public static final String VERSION_ID = "version_id";

    /**
     * 运行状态(0：空闲，1：运行中)
     */
    public static final String RUNNING_STATUS = "running_status";

    /**
     * 手机规格名称，不得超过64byte。(废弃)
     */
    public static final String SPEC_CODE = "spec_code";

    /**
     * 设备系统标签Id
     */
    public static final String FK_SYS_DEVICE_LABEL_ID = "fk_sys_device_label_id";

    @Override
    public String toString() {
        return "YunMemberUserDevice{" +
            "id=" + id +
            ", fkMemberId=" + fkMemberId +
            ", fkYunMemberFacilitiesId=" + fkYunMemberFacilitiesId +
            ", userId=" + userId +
            ", facilitiesId=" + facilitiesId +
            ", userPhoneId=" + userPhoneId +
            ", requestId=" + requestId +
            ", validStartTime=" + validStartTime +
            ", validEndTime=" + validEndTime +
            ", status=" + status +
            ", buyTime=" + buyTime +
            ", lastRenewTime=" + lastRenewTime +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", versionId=" + versionId +
            ", runningStatus=" + runningStatus +
            ", specCode=" + specCode +
            ", fkSysDeviceLabelId=" + fkSysDeviceLabelId +
        "}";
    }

    public YunMemberUserDeviceQueryEntityWrapper queryWrapper(){
        return YunMemberUserDeviceQueryEntityWrapper.wrapper(this);
    }

    public YunMemberUserDeviceUpdateEntityWrapper updateWrapper(){
        return YunMemberUserDeviceUpdateEntityWrapper.wrapper(this);
    }

    public static YunMemberUserDeviceQueryWrapper qWrapper(){
        return YunMemberUserDeviceQueryWrapper.wrapper();
    }

    public static YunMemberUserDeviceUpdateWrapper uWrapper(){
        return YunMemberUserDeviceUpdateWrapper.wrapper();
    }

}
