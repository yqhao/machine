package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskTenantQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskTenantQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskTenantUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McUpdateDeviceTaskTenantUpdateWrapper;
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
 * 租户更新机器任务表
 * </p>
 *
 * @author 18374
 * @since 2023-08-16
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_update_device_task_tenant")
@ApiModel(value = "McUpdateDeviceTaskTenant对象", description = "租户更新机器任务表")
public class McUpdateDeviceTaskTenant implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("更新机器任务表记录Id")
    @TableField("fk_mc_update_device_task_id")
    private Long fkMcUpdateDeviceTaskId;

    @ApiModelProperty("租户Id")
    @TableField("fk_tenant_id")
    private Long fkTenantId;

    @ApiModelProperty("状态（-50：删除，50：正常）")
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
     * 更新机器任务表记录Id
     */
    public Long getFkMcUpdateDeviceTaskId() {
        return fkMcUpdateDeviceTaskId;
    }

    /**
     * 更新机器任务表记录Id
     */
    public void setFkMcUpdateDeviceTaskId(Long fkMcUpdateDeviceTaskId) {
        this.fkMcUpdateDeviceTaskId = fkMcUpdateDeviceTaskId;
    }
    /**
     * 租户Id
     */
    public Long getFkTenantId() {
        return fkTenantId;
    }

    /**
     * 租户Id
     */
    public void setFkTenantId(Long fkTenantId) {
        this.fkTenantId = fkTenantId;
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
     * 更新机器任务表记录Id
     */
    public static final String FK_MC_UPDATE_DEVICE_TASK_ID = "fk_mc_update_device_task_id";

    /**
     * 租户Id
     */
    public static final String FK_TENANT_ID = "fk_tenant_id";

    /**
     * 状态（-50：删除，50：正常）
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
        return "McUpdateDeviceTaskTenant{" +
            "id=" + id +
            ", fkMcUpdateDeviceTaskId=" + fkMcUpdateDeviceTaskId +
            ", fkTenantId=" + fkTenantId +
            ", status=" + status +
            ", versionId=" + versionId +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }

    public McUpdateDeviceTaskTenantQueryEntityWrapper queryWrapper(){
        return McUpdateDeviceTaskTenantQueryEntityWrapper.wrapper(this);
    }

    public McUpdateDeviceTaskTenantUpdateEntityWrapper updateWrapper(){
        return McUpdateDeviceTaskTenantUpdateEntityWrapper.wrapper(this);
    }

    public static McUpdateDeviceTaskTenantQueryWrapper qWrapper(){
        return McUpdateDeviceTaskTenantQueryWrapper.wrapper();
    }

    public static McUpdateDeviceTaskTenantUpdateWrapper uWrapper(){
        return McUpdateDeviceTaskTenantUpdateWrapper.wrapper();
    }

}
