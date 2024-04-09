package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineStatusQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineStatusQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineStatusUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineStatusUpdateWrapper;
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
 * 机器状态表
 * </p>
 *
 * @author 18374
 * @since 2023-10-18
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_machine_status")
@ApiModel(value = "VizMcMachineStatus对象", description = "机器状态表")
public class VizMcMachineStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("机器基础信息表记录id")
    @TableField("fk_mc_machine_id")
    private Long fkMcMachineId;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("实例Id")
    @TableField("instance_id")
    private String instanceId;

    @ApiModelProperty("运行状态(0：空闲，1：运行中)")
    @TableField("running_status")
    private Integer runningStatus;

    @ApiModelProperty("健康状态(1：在线，0:故障)")
    @TableField("health_status")
    private Integer healthStatus;

    @ApiModelProperty("streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）")
    @TableField("streaming_status")
    private Integer streamingStatus;

    @ApiModelProperty("维护模式状态（0：非维护模式，1：维护模式）")
    @TableField("maint_status")
    private Integer maintStatus;

    @ApiModelProperty("是否重置中（0：未重置，1：重置中）")
    @TableField("is_reseting")
    private Integer isReseting;

    @ApiModelProperty("是否在保存app用户数据(0：否，1：是)")
    @TableField("is_user_save")
    private Integer isUserSave;

    @ApiModelProperty("是升级中（0：未升级，1：升级中）")
    @TableField("is_ota_upgrade")
    private Integer isOtaUpgrade;

    @ApiModelProperty("挂机状态(0：未挂机，1：挂机中)")
    @TableField("hang_up_status")
    private Integer hangUpStatus;

    @ApiModelProperty("重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）")
    @TableField("restart_status")
    private Integer restartStatus;

    @ApiModelProperty("是否存在root权限(1；是，0：否)")
    @TableField("root_access")
    private Integer rootAccess;

    @ApiModelProperty("版本id")
    @TableField("version_id")
    private Long versionId;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("最后修改时间")
    @TableField("last_update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    /**
     * 记录id自动增长
     */
    public Long getId() {
        return id;
    }

    /**
     * 记录id自动增长
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 机器基础信息表记录id
     */
    public Long getFkMcMachineId() {
        return fkMcMachineId;
    }

    /**
     * 机器基础信息表记录id
     */
    public void setFkMcMachineId(Long fkMcMachineId) {
        this.fkMcMachineId = fkMcMachineId;
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
     * 实例Id
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 实例Id
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
     * 健康状态(1：在线，0:故障)
     */
    public Integer getHealthStatus() {
        return healthStatus;
    }

    /**
     * 健康状态(1：在线，0:故障)
     */
    public void setHealthStatus(Integer healthStatus) {
        this.healthStatus = healthStatus;
    }
    /**
     * streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）
     */
    public Integer getStreamingStatus() {
        return streamingStatus;
    }

    /**
     * streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）
     */
    public void setStreamingStatus(Integer streamingStatus) {
        this.streamingStatus = streamingStatus;
    }
    /**
     * 维护模式状态（0：非维护模式，1：维护模式）
     */
    public Integer getMaintStatus() {
        return maintStatus;
    }

    /**
     * 维护模式状态（0：非维护模式，1：维护模式）
     */
    public void setMaintStatus(Integer maintStatus) {
        this.maintStatus = maintStatus;
    }
    /**
     * 是否重置中（0：未重置，1：重置中）
     */
    public Integer getIsReseting() {
        return isReseting;
    }

    /**
     * 是否重置中（0：未重置，1：重置中）
     */
    public void setIsReseting(Integer isReseting) {
        this.isReseting = isReseting;
    }
    /**
     * 是否在保存app用户数据(0：否，1：是)
     */
    public Integer getIsUserSave() {
        return isUserSave;
    }

    /**
     * 是否在保存app用户数据(0：否，1：是)
     */
    public void setIsUserSave(Integer isUserSave) {
        this.isUserSave = isUserSave;
    }
    /**
     * 是升级中（0：未升级，1：升级中）
     */
    public Integer getIsOtaUpgrade() {
        return isOtaUpgrade;
    }

    /**
     * 是升级中（0：未升级，1：升级中）
     */
    public void setIsOtaUpgrade(Integer isOtaUpgrade) {
        this.isOtaUpgrade = isOtaUpgrade;
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
     * 重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）
     */
    public Integer getRestartStatus() {
        return restartStatus;
    }

    /**
     * 重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）
     */
    public void setRestartStatus(Integer restartStatus) {
        this.restartStatus = restartStatus;
    }
    /**
     * 是否存在root权限(1；是，0：否)
     */
    public Integer getRootAccess() {
        return rootAccess;
    }

    /**
     * 是否存在root权限(1；是，0：否)
     */
    public void setRootAccess(Integer rootAccess) {
        this.rootAccess = rootAccess;
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
     * 最后修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 最后修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 记录id自动增长
     */
    public static final String ID = "id";

    /**
     * 机器基础信息表记录id
     */
    public static final String FK_MC_MACHINE_ID = "fk_mc_machine_id";

    /**
     * 设备唯一码
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 实例Id
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 运行状态(0：空闲，1：运行中)
     */
    public static final String RUNNING_STATUS = "running_status";

    /**
     * 健康状态(1：在线，0:故障)
     */
    public static final String HEALTH_STATUS = "health_status";

    /**
     * streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）
     */
    public static final String STREAMING_STATUS = "streaming_status";

    /**
     * 维护模式状态（0：非维护模式，1：维护模式）
     */
    public static final String MAINT_STATUS = "maint_status";

    /**
     * 是否重置中（0：未重置，1：重置中）
     */
    public static final String IS_RESETING = "is_reseting";

    /**
     * 是否在保存app用户数据(0：否，1：是)
     */
    public static final String IS_USER_SAVE = "is_user_save";

    /**
     * 是升级中（0：未升级，1：升级中）
     */
    public static final String IS_OTA_UPGRADE = "is_ota_upgrade";

    /**
     * 挂机状态(0：未挂机，1：挂机中)
     */
    public static final String HANG_UP_STATUS = "hang_up_status";

    /**
     * 重启状态（0，未重启，1：重启中，2：不更换云机重启中，3：不更换云机重启中需要通知）
     */
    public static final String RESTART_STATUS = "restart_status";

    /**
     * 是否存在root权限(1；是，0：否)
     */
    public static final String ROOT_ACCESS = "root_access";

    /**
     * 版本id
     */
    public static final String VERSION_ID = "version_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 最后修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    @Override
    public String toString() {
        return "VizMcMachineStatus{" +
            "id=" + id +
            ", fkMcMachineId=" + fkMcMachineId +
            ", deviceId=" + deviceId +
            ", instanceId=" + instanceId +
            ", runningStatus=" + runningStatus +
            ", healthStatus=" + healthStatus +
            ", streamingStatus=" + streamingStatus +
            ", maintStatus=" + maintStatus +
            ", isReseting=" + isReseting +
            ", isUserSave=" + isUserSave +
            ", isOtaUpgrade=" + isOtaUpgrade +
            ", hangUpStatus=" + hangUpStatus +
            ", restartStatus=" + restartStatus +
            ", rootAccess=" + rootAccess +
            ", versionId=" + versionId +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }

    public VizMcMachineStatusQueryEntityWrapper queryWrapper(){
        return VizMcMachineStatusQueryEntityWrapper.wrapper(this);
    }

    public VizMcMachineStatusUpdateEntityWrapper updateWrapper(){
        return VizMcMachineStatusUpdateEntityWrapper.wrapper(this);
    }

    public static VizMcMachineStatusQueryWrapper qWrapper(){
        return VizMcMachineStatusQueryWrapper.wrapper();
    }

    public static VizMcMachineStatusUpdateWrapper uWrapper(){
        return VizMcMachineStatusUpdateWrapper.wrapper();
    }

}
