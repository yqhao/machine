package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.viz.wrapper.VizMcTaskEoQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcTaskEoQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcTaskEoUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcTaskEoUpdateWrapper;
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
 * 任务表
 * </p>
 *
 * @author 18374
 * @since 2023-10-23
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_task")
@ApiModel(value = "VizMcTaskEo对象", description = "任务表")
public class VizMcTaskEo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id雪花算法")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("租户id")
    @TableField("fk_tenant_id")
    private Long fkTenantId;

    @ApiModelProperty("任务类型ID")
    @TableField("fk_viz_mc_task_type_id")
    private Long fkVizMcTaskTypeId;

    @ApiModelProperty("任务名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("任务描述")
    @TableField("task_description")
    private String taskDescription;

    @ApiModelProperty("执行命令")
    @TableField("command")
    private String command;

    @ApiModelProperty("扩展外键ID")
    @TableField("fk_extend_id")
    private Long fkExtendId;

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
     * 租户id
     */
    public Long getFkTenantId() {
        return fkTenantId;
    }

    /**
     * 租户id
     */
    public void setFkTenantId(Long fkTenantId) {
        this.fkTenantId = fkTenantId;
    }
    /**
     * 任务类型ID
     */
    public Long getFkVizMcTaskTypeId() {
        return fkVizMcTaskTypeId;
    }

    /**
     * 任务类型ID
     */
    public void setFkVizMcTaskTypeId(Long fkVizMcTaskTypeId) {
        this.fkVizMcTaskTypeId = fkVizMcTaskTypeId;
    }
    /**
     * 任务名称
     */
    public String getName() {
        return name;
    }

    /**
     * 任务名称
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 任务描述
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * 任务描述
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    /**
     * 执行命令
     */
    public String getCommand() {
        return command;
    }

    /**
     * 执行命令
     */
    public void setCommand(String command) {
        this.command = command;
    }
    /**
     * 扩展外键ID
     */
    public Long getFkExtendId() {
        return fkExtendId;
    }

    /**
     * 扩展外键ID
     */
    public void setFkExtendId(Long fkExtendId) {
        this.fkExtendId = fkExtendId;
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
     * 租户id
     */
    public static final String FK_TENANT_ID = "fk_tenant_id";

    /**
     * 任务类型ID
     */
    public static final String FK_VIZ_MC_TASK_TYPE_ID = "fk_viz_mc_task_type_id";

    /**
     * 任务名称
     */
    public static final String NAME = "name";

    /**
     * 任务描述
     */
    public static final String TASK_DESCRIPTION = "task_description";

    /**
     * 执行命令
     */
    public static final String COMMAND = "command";

    /**
     * 扩展外键ID
     */
    public static final String FK_EXTEND_ID = "fk_extend_id";

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
        return "VizMcTaskEo{" +
            "id=" + id +
            ", fkTenantId=" + fkTenantId +
            ", fkVizMcTaskTypeId=" + fkVizMcTaskTypeId +
            ", name=" + name +
            ", taskDescription=" + taskDescription +
            ", command=" + command +
            ", fkExtendId=" + fkExtendId +
            ", status=" + status +
            ", operateSysUserId=" + operateSysUserId +
            ", versionId=" + versionId +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", dr=" + dr +
        "}";
    }

    public VizMcTaskEoQueryEntityWrapper queryWrapper(){
        return VizMcTaskEoQueryEntityWrapper.wrapper(this);
    }

    public VizMcTaskEoUpdateEntityWrapper updateWrapper(){
        return VizMcTaskEoUpdateEntityWrapper.wrapper(this);
    }

    public static VizMcTaskEoQueryWrapper qWrapper(){
        return VizMcTaskEoQueryWrapper.wrapper();
    }

    public static VizMcTaskEoUpdateWrapper uWrapper(){
        return VizMcTaskEoUpdateWrapper.wrapper();
    }

}
