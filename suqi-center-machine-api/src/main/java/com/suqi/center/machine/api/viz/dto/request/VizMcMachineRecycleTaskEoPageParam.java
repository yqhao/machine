package com.suqi.center.machine.api.viz.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.common.dto.PageSet;
import com.suqi.center.common.dto.ValidationGroups;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 【可视化】机器回收任务表
 * </p>
 *
 * @author Administrator
 * @since 2023-10-31
 */
@ApiModel(value = "VizMcMachineRecycleTaskEoPageParam分页查询参数对象", description = "【可视化】机器回收任务表")

public class VizMcMachineRecycleTaskEoPageParam extends PageSet implements Serializable{


    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键ID")
    @NotNull(groups = ValidationGroups.Update.class,message = "id 主键ID不能为null")
    private Long id;


    @ApiModelProperty("任务批次号")
    @NotEmpty(groups = ValidationGroups.Insert.class,message = "任务批次号不能为空")
    private String batchNo;


    @ApiModelProperty("商户ID")
    @NotNull(groups = ValidationGroups.Insert.class,message = "商户ID不能为null")
    private Long tenantId;


    @ApiModelProperty("商户名称")
    @NotEmpty(groups = ValidationGroups.Insert.class,message = "商户名称不能为空")
    private String tenantName;


    @ApiModelProperty("内网ip地址")
    private String externalAddr;


    @ApiModelProperty("外网ip地址")
    private String internalAddr;


    @ApiModelProperty("机器基础信息表记录id")
    @NotNull(groups = ValidationGroups.Insert.class,message = "机器基础信息表记录id不能为null")
    private Long fkMcMachineId;


    @ApiModelProperty("租户设备表记录id")
    @NotNull(groups = ValidationGroups.Insert.class,message = "租户设备表记录id不能为null")
    private Long fkVizTnMachineId;


    @ApiModelProperty("设备唯一码")
    @NotEmpty(groups = ValidationGroups.Insert.class,message = "设备唯一码不能为空")
    private String deviceId;


    @ApiModelProperty("实例Id")
    private String instanceId;


    @ApiModelProperty("回收状态(10：待回收，20：已回收, 30:回收失败)")
    private Integer recycleStatus;


    @ApiModelProperty("操作人用户ID")
    @NotNull(groups = ValidationGroups.Insert.class,message = "操作人用户ID不能为null")
    private Long operateUserId;


    @ApiModelProperty("回收时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date recycleTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndRecycleTime;


    @ApiModelProperty("版本id")
    private Long versionId;


    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndCreateTime;


    @ApiModelProperty("创建人")
    private String createPerson;


    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date updateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndUpdateTime;


    @ApiModelProperty("是否删除")
    private Boolean dr;


    @ApiModelProperty("执行结果")
    private String msg;


    @ApiModelProperty("链路ID")
    private String traceId;


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
     * 回收时间
     */
    public Date getQueryEndRecycleTime() {
        return queryEndRecycleTime;
    }

    /**
     * 回收时间
     */
    public void setQueryEndRecycleTime(Date queryEndRecycleTime) {
        this.queryEndRecycleTime = queryEndRecycleTime;
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
     * 创建时间
     */
    public Date getQueryEndCreateTime() {
        return queryEndCreateTime;
    }

    /**
     * 创建时间
     */
    public void setQueryEndCreateTime(Date queryEndCreateTime) {
        this.queryEndCreateTime = queryEndCreateTime;
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
     * 最后修改时间
     */
    public Date getQueryEndUpdateTime() {
        return queryEndUpdateTime;
    }

    /**
     * 最后修改时间
     */
    public void setQueryEndUpdateTime(Date queryEndUpdateTime) {
        this.queryEndUpdateTime = queryEndUpdateTime;
    }
    /**
     * 是否删除
     */
    public Boolean getDr() {
        return dr;
    }

    /**
     * 是否删除
     */
    public void setDr(Boolean dr) {
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
        "}";
    }



}
