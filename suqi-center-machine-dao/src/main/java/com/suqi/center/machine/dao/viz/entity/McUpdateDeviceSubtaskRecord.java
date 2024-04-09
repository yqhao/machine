package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceSubtaskRecordQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceSubtaskRecordQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceSubtaskRecordUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceSubtaskRecordUpdateWrapper;
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
 * 机器更新子任务记录表
 * </p>
 *
 * @author 18374
 * @since 2023-08-23
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_update_device_subtask_record")
@ApiModel(value = "McUpdateDeviceSubtaskRecord对象", description = "机器更新子任务记录表")
public class McUpdateDeviceSubtaskRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("机器更新任务记录表Id")
    @TableField("fk_mc_update_device_task_record_id")
    private Long fkMcUpdateDeviceTaskRecordId;

    @ApiModelProperty("更新机器子任务表Id")
    @TableField("fk_mc_update_device_subtask_id")
    private Long fkMcUpdateDeviceSubtaskId;

    @ApiModelProperty("1：重置机器并安装服务，2：OTA重启，3：服务商重启")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("任务ID")
    @TableField("task_id")
    private String taskId;

    @ApiModelProperty("执行顺序")
    @TableField("execution_flow")
    private Integer executionFlow;

    @ApiModelProperty("执行任务消息")
    @TableField("execute_msg")
    private String executeMsg;

    @ApiModelProperty("状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）")
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
     * 机器更新任务记录表Id
     */
    public Long getFkMcUpdateDeviceTaskRecordId() {
        return fkMcUpdateDeviceTaskRecordId;
    }

    /**
     * 机器更新任务记录表Id
     */
    public void setFkMcUpdateDeviceTaskRecordId(Long fkMcUpdateDeviceTaskRecordId) {
        this.fkMcUpdateDeviceTaskRecordId = fkMcUpdateDeviceTaskRecordId;
    }
    /**
     * 更新机器子任务表Id
     */
    public Long getFkMcUpdateDeviceSubtaskId() {
        return fkMcUpdateDeviceSubtaskId;
    }

    /**
     * 更新机器子任务表Id
     */
    public void setFkMcUpdateDeviceSubtaskId(Long fkMcUpdateDeviceSubtaskId) {
        this.fkMcUpdateDeviceSubtaskId = fkMcUpdateDeviceSubtaskId;
    }
    /**
     * 1：重置机器并安装服务，2：OTA重启，3：服务商重启
     */
    public Integer getType() {
        return type;
    }

    /**
     * 1：重置机器并安装服务，2：OTA重启，3：服务商重启
     */
    public void setType(Integer type) {
        this.type = type;
    }
    /**
     * 任务ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 任务ID
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
    /**
     * 执行顺序
     */
    public Integer getExecutionFlow() {
        return executionFlow;
    }

    /**
     * 执行顺序
     */
    public void setExecutionFlow(Integer executionFlow) {
        this.executionFlow = executionFlow;
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
     * 状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）
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
     * 机器更新任务记录表Id
     */
    public static final String FK_MC_UPDATE_DEVICE_TASK_RECORD_ID = "fk_mc_update_device_task_record_id";

    /**
     * 更新机器子任务表Id
     */
    public static final String FK_MC_UPDATE_DEVICE_SUBTASK_ID = "fk_mc_update_device_subtask_id";

    /**
     * 1：重置机器并安装服务，2：OTA重启，3：服务商重启
     */
    public static final String TYPE = "type";

    /**
     * 任务ID
     */
    public static final String TASK_ID = "task_id";

    /**
     * 执行顺序
     */
    public static final String EXECUTION_FLOW = "execution_flow";

    /**
     * 执行任务消息
     */
    public static final String EXECUTE_MSG = "execute_msg";

    /**
     * 状态（-50：删除，-20：停止任务，-10：任务执行失败，10：任务执行中，，50：正常）
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
        return "McUpdateDeviceSubtaskRecord{" +
            "id=" + id +
            ", fkMcUpdateDeviceTaskRecordId=" + fkMcUpdateDeviceTaskRecordId +
            ", fkMcUpdateDeviceSubtaskId=" + fkMcUpdateDeviceSubtaskId +
            ", type=" + type +
            ", taskId=" + taskId +
            ", executionFlow=" + executionFlow +
            ", executeMsg=" + executeMsg +
            ", status=" + status +
            ", versionId=" + versionId +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }

    public McUpdateDeviceSubtaskRecordQueryEntityWrapper queryWrapper(){
        return McUpdateDeviceSubtaskRecordQueryEntityWrapper.wrapper(this);
    }

    public McUpdateDeviceSubtaskRecordUpdateEntityWrapper updateWrapper(){
        return McUpdateDeviceSubtaskRecordUpdateEntityWrapper.wrapper(this);
    }

    public static McUpdateDeviceSubtaskRecordQueryWrapper qWrapper(){
        return McUpdateDeviceSubtaskRecordQueryWrapper.wrapper();
    }

    public static McUpdateDeviceSubtaskRecordUpdateWrapper uWrapper(){
        return McUpdateDeviceSubtaskRecordUpdateWrapper.wrapper();
    }

}
