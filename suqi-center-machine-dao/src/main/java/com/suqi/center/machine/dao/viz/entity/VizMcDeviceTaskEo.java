package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.viz.wrapper.VizMcDeviceTaskEoQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcDeviceTaskEoQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcDeviceTaskEoUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcDeviceTaskEoUpdateWrapper;
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
 * 机器任务表
 * </p>
 *
 * @author 18374
 * @since 2023-10-21
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_device_task")
@ApiModel(value = "VizMcDeviceTaskEo对象", description = "机器任务表")
public class VizMcDeviceTaskEo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id雪花算法")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("任务表记录id")
    @TableField("fk_viz_mc_task_id")
    private Long fkVizMcTaskId;

    @ApiModelProperty("机器基础信息表记录id")
    @TableField("fk_mc_machine_id")
    private Long fkMcMachineId;

    @ApiModelProperty("任务表Id")
    @TableField("instance_id")
    private String instanceId;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("执行任务消息")
    @TableField("execute_msg")
    private String executeMsg;

    @ApiModelProperty("执行任务ID")
    @TableField("job_id")
    private String jobId;

    @ApiModelProperty("任务处理开始时间")
    @TableField("begin_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date beginTime;

    @ApiModelProperty("任务处理结束时间")
    @TableField("end_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date endTime;

    @ApiModelProperty("状态（-50：失败，0：等待中，10：运行中，50：成功）")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("操作人员")
    @TableField("operate_sys_user_id")
    private Long operateSysUserId;

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

    @ApiModelProperty("逻辑删除-默认dr=0")
    @TableField("dr")
    private Integer dr;

    /**
     * 记录id雪花算法
     */
    public Long getId() {
        return id;
    }

    /**
     * 记录id雪花算法
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 任务表记录id
     */
    public Long getFkVizMcTaskId() {
        return fkVizMcTaskId;
    }

    /**
     * 任务表记录id
     */
    public void setFkVizMcTaskId(Long fkVizMcTaskId) {
        this.fkVizMcTaskId = fkVizMcTaskId;
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
     * 任务表Id
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 任务表Id
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
     * 执行任务ID
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * 执行任务ID
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    /**
     * 任务处理开始时间
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * 任务处理开始时间
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }
    /**
     * 任务处理结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 任务处理结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    /**
     * 状态（-50：失败，0：等待中，10：运行中，50：成功）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（-50：失败，0：等待中，10：运行中，50：成功）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**
     * 操作人员
     */
    public Long getOperateSysUserId() {
        return operateSysUserId;
    }

    /**
     * 操作人员
     */
    public void setOperateSysUserId(Long operateSysUserId) {
        this.operateSysUserId = operateSysUserId;
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
     * 逻辑删除-默认dr=0
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 逻辑删除-默认dr=0
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }

    /**
     * 记录id雪花算法
     */
    public static final String ID = "id";

    /**
     * 任务表记录id
     */
    public static final String FK_VIZ_MC_TASK_ID = "fk_viz_mc_task_id";

    /**
     * 机器基础信息表记录id
     */
    public static final String FK_MC_MACHINE_ID = "fk_mc_machine_id";

    /**
     * 任务表Id
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 设备唯一码
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 执行任务消息
     */
    public static final String EXECUTE_MSG = "execute_msg";

    /**
     * 执行任务ID
     */
    public static final String JOB_ID = "job_id";

    /**
     * 任务处理开始时间
     */
    public static final String BEGIN_TIME = "begin_time";

    /**
     * 任务处理结束时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 状态（-50：失败，0：等待中，10：运行中，50：成功）
     */
    public static final String STATUS = "status";

    /**
     * 操作人员
     */
    public static final String OPERATE_SYS_USER_ID = "operate_sys_user_id";

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

    /**
     * 逻辑删除-默认dr=0
     */
    public static final String DR = "dr";

    @Override
    public String toString() {
        return "VizMcDeviceTaskEo{" +
            "id=" + id +
            ", fkVizMcTaskId=" + fkVizMcTaskId +
            ", fkMcMachineId=" + fkMcMachineId +
            ", instanceId=" + instanceId +
            ", deviceId=" + deviceId +
            ", executeMsg=" + executeMsg +
            ", jobId=" + jobId +
            ", beginTime=" + beginTime +
            ", endTime=" + endTime +
            ", status=" + status +
            ", operateSysUserId=" + operateSysUserId +
            ", versionId=" + versionId +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", dr=" + dr +
        "}";
    }

    public VizMcDeviceTaskEoQueryEntityWrapper queryWrapper(){
        return VizMcDeviceTaskEoQueryEntityWrapper.wrapper(this);
    }

    public VizMcDeviceTaskEoUpdateEntityWrapper updateWrapper(){
        return VizMcDeviceTaskEoUpdateEntityWrapper.wrapper(this);
    }

    public static VizMcDeviceTaskEoQueryWrapper qWrapper(){
        return VizMcDeviceTaskEoQueryWrapper.wrapper();
    }

    public static VizMcDeviceTaskEoUpdateWrapper uWrapper(){
        return VizMcDeviceTaskEoUpdateWrapper.wrapper();
    }

}
