package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceExtendQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceExtendQueryWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceExtendUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDeviceExtendUpdateWrapper;
import java.io.Serializable;
import java.math.BigDecimal;
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
 * 设备扩展信息表（em_soc_device_extend）
 * </p>
 *
 * @author PC001
 * @since 2023-08-29
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("em_soc_device_extend")
@ApiModel(value = "EmSocDeviceExtend对象", description = "设备扩展信息表（em_soc_device_extend）")
public class EmSocDeviceExtend implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("物理设备id")
    @TableField("fk_em_soc_devices_id")
    private Long fkEmSocDevicesId;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("华为云机id")
    @TableField("phone_id")
    private String phoneId;

    @ApiModelProperty("报警值")
    @TableField("alarm_value")
    private BigDecimal alarmValue;

    @ApiModelProperty("挂机状态(0：未挂机，1：挂机中)")
    @TableField("hang_up_status")
    private Integer hangUpStatus;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("修改时间")
    @TableField("last_update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @ApiModelProperty("版本id")
    @TableField("version_id")
    private Long versionId;

    @ApiModelProperty("重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）")
    @TableField("restart_status")
    private Integer restartStatus;

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
     * 华为云机id
     */
    public String getPhoneId() {
        return phoneId;
    }

    /**
     * 华为云机id
     */
    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }
    /**
     * 报警值
     */
    public BigDecimal getAlarmValue() {
        return alarmValue;
    }

    /**
     * 报警值
     */
    public void setAlarmValue(BigDecimal alarmValue) {
        this.alarmValue = alarmValue;
    }
    /**
     * 挂机状态(0：未挂机，1：挂机中)
     */
    public Integer getHangUpStatus() {
        return hangUpStatus;
    }

    /**
     * 挂机状态(0：未挂机，1：挂机中)
     */
    public void setHangUpStatus(Integer hangUpStatus) {
        this.hangUpStatus = hangUpStatus;
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
     * 修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    /**
     * 版本id
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 版本id
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }
    /**
     * 重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）
     */
    public Integer getRestartStatus() {
        return restartStatus;
    }

    /**
     * 重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）
     */
    public void setRestartStatus(Integer restartStatus) {
        this.restartStatus = restartStatus;
    }

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 物理设备id
     */
    public static final String FK_EM_SOC_DEVICES_ID = "fk_em_soc_devices_id";

    /**
     * 设备唯一码
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 华为云机id
     */
    public static final String PHONE_ID = "phone_id";

    /**
     * 报警值
     */
    public static final String ALARM_VALUE = "alarm_value";

    /**
     * 挂机状态(0：未挂机，1：挂机中)
     */
    public static final String HANG_UP_STATUS = "hang_up_status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 版本id
     */
    public static final String VERSION_ID = "version_id";

    /**
     * 重启状态（0，未重启，1：不更换云机重启中，2：不更换云机重启中需要通知）
     */
    public static final String RESTART_STATUS = "restart_status";

    @Override
    public String toString() {
        return "EmSocDeviceExtend{" +
            "id=" + id +
            ", fkEmSocDevicesId=" + fkEmSocDevicesId +
            ", deviceId=" + deviceId +
            ", phoneId=" + phoneId +
            ", alarmValue=" + alarmValue +
            ", hangUpStatus=" + hangUpStatus +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", versionId=" + versionId +
            ", restartStatus=" + restartStatus +
        "}";
    }

    public EmSocDeviceExtendQueryEntityWrapper queryWrapper(){
        return EmSocDeviceExtendQueryEntityWrapper.wrapper(this);
    }

    public EmSocDeviceExtendUpdateEntityWrapper updateWrapper(){
        return EmSocDeviceExtendUpdateEntityWrapper.wrapper(this);
    }

    public static EmSocDeviceExtendQueryWrapper qWrapper(){
        return EmSocDeviceExtendQueryWrapper.wrapper();
    }

    public static EmSocDeviceExtendUpdateWrapper uWrapper(){
        return EmSocDeviceExtendUpdateWrapper.wrapper();
    }

}
