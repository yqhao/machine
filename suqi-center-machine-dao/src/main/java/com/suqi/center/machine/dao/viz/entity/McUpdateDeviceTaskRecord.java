package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskRecordQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskRecordQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskRecordUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskRecordUpdateWrapper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 机器更新任务记录表
 * </p>
 *
 * @author 18374
 * @since 2023-08-23
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_update_device_task_record")
@ApiModel(value = "McUpdateDeviceTaskRecord对象", description = "机器更新任务记录表")
public class McUpdateDeviceTaskRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("云机端软件包记录Id")
    @TableField("fk_mc_server_software_package_id")
    private Long fkMcServerSoftwarePackageId;

    @ApiModelProperty("更新机器任务表Id")
    @TableField("fk_mc_update_device_task_id")
    private Long fkMcUpdateDeviceTaskId;

    @ApiModelProperty("机器基础信息表记录Id")
    @TableField("fk_mc_machine_id")
    private Long fkMcMachineId;

    @ApiModelProperty("机器更新子任务记录Id")
    @TableField("fk_mc_update_device_subtask_record_id")
    private Long fkMcUpdateDeviceSubtaskRecordId;

    @ApiModelProperty("任务类型（1：系统任务，2：用户任务）")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备实例Id")
    @TableField("instance_id")
    private String instanceId;

    @ApiModelProperty("执行任务消息")
    @TableField("execute_msg")
    private String executeMsg;

    @ApiModelProperty("任务开始执行时间（具体开始时间）")
    @TableField("task_start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date taskStartTime;

    @ApiModelProperty("等待执行开始时间")
    @TableField("wait_over_start_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date waitOverStartDate;

    @ApiModelProperty("任务开始时间（定时开始时间）")
    @TableField("start_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date startTime;

    @ApiModelProperty("状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("版本Id")
    @TableField("version_id")
    private Long versionId;

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
     * 云机端软件包记录Id
     */
    public Long getFkMcServerSoftwarePackageId() {
        return fkMcServerSoftwarePackageId;
    }

    /**
     * 云机端软件包记录Id
     */
    public void setFkMcServerSoftwarePackageId(Long fkMcServerSoftwarePackageId) {
        this.fkMcServerSoftwarePackageId = fkMcServerSoftwarePackageId;
    }
    /**
     * 更新机器任务表Id
     */
    public Long getFkMcUpdateDeviceTaskId() {
        return fkMcUpdateDeviceTaskId;
    }

    /**
     * 更新机器任务表Id
     */
    public void setFkMcUpdateDeviceTaskId(Long fkMcUpdateDeviceTaskId) {
        this.fkMcUpdateDeviceTaskId = fkMcUpdateDeviceTaskId;
    }
    /**
     * 机器基础信息表记录Id
     */
    public Long getFkMcMachineId() {
        return fkMcMachineId;
    }

    /**
     * 机器基础信息表记录Id
     */
    public void setFkMcMachineId(Long fkMcMachineId) {
        this.fkMcMachineId = fkMcMachineId;
    }
    /**
     * 机器更新子任务记录Id
     */
    public Long getFkMcUpdateDeviceSubtaskRecordId() {
        return fkMcUpdateDeviceSubtaskRecordId;
    }

    /**
     * 机器更新子任务记录Id
     */
    public void setFkMcUpdateDeviceSubtaskRecordId(Long fkMcUpdateDeviceSubtaskRecordId) {
        this.fkMcUpdateDeviceSubtaskRecordId = fkMcUpdateDeviceSubtaskRecordId;
    }
    /**
     * 任务类型（1：系统任务，2：用户任务）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 任务类型（1：系统任务，2：用户任务）
     */
    public void setType(Integer type) {
        this.type = type;
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
     * 设备实例Id
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 设备实例Id
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    /**
     * 执行任务消息
     */
    public String getExecuteMsg() {
        return executeMsg;
    }

    /**
     * 执行任务消息
     */
    public void setExecuteMsg(String executeMsg) {
        this.executeMsg = executeMsg;
    }
    /**
     * 任务开始执行时间（具体开始时间）
     */
    public Date getTaskStartTime() {
        return taskStartTime;
    }

    /**
     * 任务开始执行时间（具体开始时间）
     */
    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }
    /**
     * 等待执行开始时间
     */
    public Date getWaitOverStartDate() {
        return waitOverStartDate;
    }

    /**
     * 等待执行开始时间
     */
    public void setWaitOverStartDate(Date waitOverStartDate) {
        this.waitOverStartDate = waitOverStartDate;
    }
    /**
     * 任务开始时间（定时开始时间）
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 任务开始时间（定时开始时间）
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    /**
     * 状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**
     * 版本Id
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 版本Id
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
     * 记录id自动增长
     */
    public static final String ID = "id";

    /**
     * 云机端软件包记录Id
     */
    public static final String FK_MC_SERVER_SOFTWARE_PACKAGE_ID = "fk_mc_server_software_package_id";

    /**
     * 更新机器任务表Id
     */
    public static final String FK_MC_UPDATE_DEVICE_TASK_ID = "fk_mc_update_device_task_id";

    /**
     * 机器基础信息表记录Id
     */
    public static final String FK_MC_MACHINE_ID = "fk_mc_machine_id";

    /**
     * 机器更新子任务记录Id
     */
    public static final String FK_MC_UPDATE_DEVICE_SUBTASK_RECORD_ID = "fk_mc_update_device_subtask_record_id";

    /**
     * 任务类型（1：系统任务，2：用户任务）
     */
    public static final String TYPE = "type";

    /**
     * 设备唯一码
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 设备实例Id
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 执行任务消息
     */
    public static final String EXECUTE_MSG = "execute_msg";

    /**
     * 任务开始执行时间（具体开始时间）
     */
    public static final String TASK_START_TIME = "task_start_time";

    /**
     * 等待执行开始时间
     */
    public static final String WAIT_OVER_START_DATE = "wait_over_start_date";

    /**
     * 任务开始时间（定时开始时间）
     */
    public static final String START_TIME = "start_time";

    /**
     * 状态（-50：删除，-20：停止任务，-10：任务执行失败，0：等待执行中，10：任务执行中，50：正常）
     */
    public static final String STATUS = "status";

    /**
     * 版本Id
     */
    public static final String VERSION_ID = "version_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    @Override
    public String toString() {
        return "McUpdateDeviceTaskRecord{" +
            "id=" + id +
            ", fkMcServerSoftwarePackageId=" + fkMcServerSoftwarePackageId +
            ", fkMcUpdateDeviceTaskId=" + fkMcUpdateDeviceTaskId +
            ", fkMcMachineId=" + fkMcMachineId +
            ", fkMcUpdateDeviceSubtaskRecordId=" + fkMcUpdateDeviceSubtaskRecordId +
            ", type=" + type +
            ", deviceId=" + deviceId +
            ", instanceId=" + instanceId +
            ", executeMsg=" + executeMsg +
            ", taskStartTime=" + taskStartTime +
            ", waitOverStartDate=" + waitOverStartDate +
            ", startTime=" + startTime +
            ", status=" + status +
            ", versionId=" + versionId +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }

    public McUpdateDeviceTaskRecordQueryEntityWrapper queryWrapper(){
        return McUpdateDeviceTaskRecordQueryEntityWrapper.wrapper(this);
    }

    public McUpdateDeviceTaskRecordUpdateEntityWrapper updateWrapper(){
        return McUpdateDeviceTaskRecordUpdateEntityWrapper.wrapper(this);
    }

    public static McUpdateDeviceTaskRecordQueryWrapper qWrapper(){
        return McUpdateDeviceTaskRecordQueryWrapper.wrapper();
    }

    public static McUpdateDeviceTaskRecordUpdateWrapper uWrapper(){
        return McUpdateDeviceTaskRecordUpdateWrapper.wrapper();
    }

}
