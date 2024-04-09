package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceSubtaskQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceSubtaskQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceSubtaskUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceSubtaskUpdateWrapper;
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
 * 更新机器子任务表
 * </p>
 *
 * @author 18374
 * @since 2023-08-22
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_update_device_subtask")
@ApiModel(value = "McUpdateDeviceSubtask对象", description = "更新机器子任务表")
public class McUpdateDeviceSubtask implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("更新机器任务表Id")
    @TableField("fk_mc_update_device_task_id")
    private Long fkMcUpdateDeviceTaskId;

    @ApiModelProperty("1：重置机器并安装服务，2：OTA重启，3：服务商重启")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("执行顺序")
    @TableField("execution_flow")
    private Integer executionFlow;

    @ApiModelProperty("状态（-50：删除，50：正常）")
    @TableField("status")
    private Integer status;

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
     * 状态（-50：删除，50：正常）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（-50：删除，50：正常）
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 更新机器任务表Id
     */
    public static final String FK_MC_UPDATE_DEVICE_TASK_ID = "fk_mc_update_device_task_id";

    /**
     * 1：重置机器并安装服务，2：OTA重启，3：服务商重启
     */
    public static final String TYPE = "type";

    /**
     * 执行顺序
     */
    public static final String EXECUTION_FLOW = "execution_flow";

    /**
     * 状态（-50：删除，50：正常）
     */
    public static final String STATUS = "status";

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
        return "McUpdateDeviceSubtask{" +
            "id=" + id +
            ", fkMcUpdateDeviceTaskId=" + fkMcUpdateDeviceTaskId +
            ", type=" + type +
            ", executionFlow=" + executionFlow +
            ", status=" + status +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }

    public McUpdateDeviceSubtaskQueryEntityWrapper queryWrapper(){
        return McUpdateDeviceSubtaskQueryEntityWrapper.wrapper(this);
    }

    public McUpdateDeviceSubtaskUpdateEntityWrapper updateWrapper(){
        return McUpdateDeviceSubtaskUpdateEntityWrapper.wrapper(this);
    }

    public static McUpdateDeviceSubtaskQueryWrapper qWrapper(){
        return McUpdateDeviceSubtaskQueryWrapper.wrapper();
    }

    public static McUpdateDeviceSubtaskUpdateWrapper uWrapper(){
        return McUpdateDeviceSubtaskUpdateWrapper.wrapper();
    }

}
