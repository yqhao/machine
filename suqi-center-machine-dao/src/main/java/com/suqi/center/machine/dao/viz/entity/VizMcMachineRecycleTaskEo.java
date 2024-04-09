package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineRecycleTaskEoQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineRecycleTaskEoQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineRecycleTaskEoUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineRecycleTaskEoUpdateWrapper;
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
 * 【可视化】机器回收任务表
 * </p>
 *
 * @author Administrator
 * @since 2023-11-13
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_machine_recycle_task")
@ApiModel(value = "VizMcMachineRecycleTaskEo对象", description = "【可视化】机器回收任务表")
public class VizMcMachineRecycleTaskEo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("任务批次号")
    @TableField("batch_no")
    private String batchNo;

    @ApiModelProperty("商户ID")
    @TableField("tenant_id")
    private Long tenantId;

    @ApiModelProperty("商户名称")
    @TableField("tenant_name")
    private String tenantName;

    @ApiModelProperty("内网ip地址")
    @TableField("external_addr")
    private String externalAddr;

    @ApiModelProperty("外网ip地址")
    @TableField("internal_addr")
    private String internalAddr;

    @ApiModelProperty("机器基础信息表记录id")
    @TableField("fk_mc_machine_id")
    private Long fkMcMachineId;

    @ApiModelProperty("租户设备表记录id")
    @TableField("fk_viz_tn_machine_id")
    private Long fkVizTnMachineId;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("实例Id")
    @TableField("instance_id")
    private String instanceId;

    @ApiModelProperty("回收状态(10：待回收，20：已回收, 30:回收失败)")
    @TableField("recycle_status")
    private Integer recycleStatus;

    @ApiModelProperty("操作人用户ID")
    @TableField("operate_user_id")
    private Long operateUserId;

    @ApiModelProperty("回收时间")
    @TableField("recycle_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date recycleTime;

    @ApiModelProperty("版本id")
    @TableField("version_id")
    private Long versionId;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("创建人")
    @TableField(value = "create_person", fill = FieldFill.INSERT)
    private String createPerson;

    @ApiModelProperty("最后修改时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

    @ApiModelProperty("是否删除")
    @TableField("dr")
    private Integer dr;

    @ApiModelProperty("执行结果")
    @TableField("msg")
    private String msg;

    @ApiModelProperty("链路ID")
    @TableField("trace_id")
    private String traceId;

    @ApiModelProperty("商户资源池ID【非必填】")
    @TableField("fk_cp_tn_resource_pool_id")
    private Long fkCpTnResourcePoolId;

    @ApiModelProperty("资源池名称【非必填】")
    @TableField("resource_pool_name")
    private String resourcePoolName;

    /**
     * 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 任务批次号
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 任务批次号
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }
    /**
     * 商户ID
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * 商户ID
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }
    /**
     * 商户名称
     */
    public String getTenantName() {
        return tenantName;
    }

    /**
     * 商户名称
     */
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }
    /**
     * 内网ip地址
     */
    public String getExternalAddr() {
        return externalAddr;
    }

    /**
     * 内网ip地址
     */
    public void setExternalAddr(String externalAddr) {
        this.externalAddr = externalAddr;
    }
    /**
     * 外网ip地址
     */
    public String getInternalAddr() {
        return internalAddr;
    }

    /**
     * 外网ip地址
     */
    public void setInternalAddr(String internalAddr) {
        this.internalAddr = internalAddr;
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
     * 租户设备表记录id
     */
    public Long getFkVizTnMachineId() {
        return fkVizTnMachineId;
    }

    /**
     * 租户设备表记录id
     */
    public void setFkVizTnMachineId(Long fkVizTnMachineId) {
        this.fkVizTnMachineId = fkVizTnMachineId;
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
     * 回收状态(10：待回收，20：已回收, 30:回收失败)
     */
    public Integer getRecycleStatus() {
        return recycleStatus;
    }

    /**
     * 回收状态(10：待回收，20：已回收, 30:回收失败)
     */
    public void setRecycleStatus(Integer recycleStatus) {
        this.recycleStatus = recycleStatus;
    }
    /**
     * 操作人用户ID
     */
    public Long getOperateUserId() {
        return operateUserId;
    }

    /**
     * 操作人用户ID
     */
    public void setOperateUserId(Long operateUserId) {
        this.operateUserId = operateUserId;
    }
    /**
     * 回收时间
     */
    public Date getRecycleTime() {
        return recycleTime;
    }

    /**
     * 回收时间
     */
    public void setRecycleTime(Date recycleTime) {
        this.recycleTime = recycleTime;
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
     * 创建人
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * 创建人
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }
    /**
     * 最后修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 最后修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
     * 是否删除
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 是否删除
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }
    /**
     * 执行结果
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 执行结果
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    /**
     * 链路ID
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * 链路ID
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
    /**
     * 商户资源池ID【非必填】
     */
    public Long getFkCpTnResourcePoolId() {
        return fkCpTnResourcePoolId;
    }

    /**
     * 商户资源池ID【非必填】
     */
    public void setFkCpTnResourcePoolId(Long fkCpTnResourcePoolId) {
        this.fkCpTnResourcePoolId = fkCpTnResourcePoolId;
    }
    /**
     * 资源池名称【非必填】
     */
    public String getResourcePoolName() {
        return resourcePoolName;
    }

    /**
     * 资源池名称【非必填】
     */
    public void setResourcePoolName(String resourcePoolName) {
        this.resourcePoolName = resourcePoolName;
    }

    /**
     * 主键ID
     */
    public static final String ID = "id";

    /**
     * 任务批次号
     */
    public static final String BATCH_NO = "batch_no";

    /**
     * 商户ID
     */
    public static final String TENANT_ID = "tenant_id";

    /**
     * 商户名称
     */
    public static final String TENANT_NAME = "tenant_name";

    /**
     * 内网ip地址
     */
    public static final String EXTERNAL_ADDR = "external_addr";

    /**
     * 外网ip地址
     */
    public static final String INTERNAL_ADDR = "internal_addr";

    /**
     * 机器基础信息表记录id
     */
    public static final String FK_MC_MACHINE_ID = "fk_mc_machine_id";

    /**
     * 租户设备表记录id
     */
    public static final String FK_VIZ_TN_MACHINE_ID = "fk_viz_tn_machine_id";

    /**
     * 设备唯一码
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 实例Id
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 回收状态(10：待回收，20：已回收, 30:回收失败)
     */
    public static final String RECYCLE_STATUS = "recycle_status";

    /**
     * 操作人用户ID
     */
    public static final String OPERATE_USER_ID = "operate_user_id";

    /**
     * 回收时间
     */
    public static final String RECYCLE_TIME = "recycle_time";

    /**
     * 版本id
     */
    public static final String VERSION_ID = "version_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 创建人
     */
    public static final String CREATE_PERSON = "create_person";

    /**
     * 最后修改时间
     */
    public static final String UPDATE_TIME = "update_time";

    /**
     * 是否删除
     */
    public static final String DR = "dr";

    /**
     * 执行结果
     */
    public static final String MSG = "msg";

    /**
     * 链路ID
     */
    public static final String TRACE_ID = "trace_id";

    /**
     * 商户资源池ID【非必填】
     */
    public static final String FK_CP_TN_RESOURCE_POOL_ID = "fk_cp_tn_resource_pool_id";

    /**
     * 资源池名称【非必填】
     */
    public static final String RESOURCE_POOL_NAME = "resource_pool_name";

    @Override
    public String toString() {
        return "VizMcMachineRecycleTaskEo{" +
            "id=" + id +
            ", batchNo=" + batchNo +
            ", tenantId=" + tenantId +
            ", tenantName=" + tenantName +
            ", externalAddr=" + externalAddr +
            ", internalAddr=" + internalAddr +
            ", fkMcMachineId=" + fkMcMachineId +
            ", fkVizTnMachineId=" + fkVizTnMachineId +
            ", deviceId=" + deviceId +
            ", instanceId=" + instanceId +
            ", recycleStatus=" + recycleStatus +
            ", operateUserId=" + operateUserId +
            ", recycleTime=" + recycleTime +
            ", versionId=" + versionId +
            ", createTime=" + createTime +
            ", createPerson=" + createPerson +
            ", updateTime=" + updateTime +
            ", dr=" + dr +
            ", msg=" + msg +
            ", traceId=" + traceId +
            ", fkCpTnResourcePoolId=" + fkCpTnResourcePoolId +
            ", resourcePoolName=" + resourcePoolName +
        "}";
    }

    public VizMcMachineRecycleTaskEoQueryEntityWrapper queryWrapper(){
        return VizMcMachineRecycleTaskEoQueryEntityWrapper.wrapper(this);
    }

    public VizMcMachineRecycleTaskEoUpdateEntityWrapper updateWrapper(){
        return VizMcMachineRecycleTaskEoUpdateEntityWrapper.wrapper(this);
    }

    public static VizMcMachineRecycleTaskEoQueryWrapper qWrapper(){
        return VizMcMachineRecycleTaskEoQueryWrapper.wrapper();
    }

    public static VizMcMachineRecycleTaskEoUpdateWrapper uWrapper(){
        return VizMcMachineRecycleTaskEoUpdateWrapper.wrapper();
    }

}
