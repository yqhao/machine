package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineStreamsQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineStreamsQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineStreamsUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineStreamsUpdateWrapper;
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
 * 机器streaming端口映射
 * </p>
 *
 * @author PC001
 * @since 2023-10-21
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_machine_streams")
@ApiModel(value = "VizMcMachineStreams对象", description = "机器streaming端口映射")
public class VizMcMachineStreams implements Serializable {

    private static final long serialVersionUID = 1L;

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

    @ApiModelProperty("状态：idle、busy")
    @TableField("status")
    private String status;

    @ApiModelProperty("内网ip")
    @TableField("internal_address")
    private String internalAddress;

    @ApiModelProperty("内网音频端口")
    @TableField("internal_aport")
    private Integer internalAport;

    @ApiModelProperty("内网音频端口类型")
    @TableField("internal_atype")
    private Integer internalAtype;

    @ApiModelProperty("内网视频端口")
    @TableField("internal_vport")
    private Integer internalVport;

    @ApiModelProperty("外网ip")
    @TableField("external_address")
    private String externalAddress;

    @ApiModelProperty("外网音频端口")
    @TableField("external_aport")
    private Integer externalAport;

    @ApiModelProperty("外网音频端口类型")
    @TableField("external_atype")
    private Integer externalAtype;

    @ApiModelProperty("外网视频端口")
    @TableField("external_vport")
    private Integer externalVport;

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

    @ApiModelProperty("逻辑删除-默认dr=50，(50：正常，-50：删除)")
    @TableField("dr")
    private Integer dr;

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
     * 状态：idle、busy
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态：idle、busy
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * 内网ip
     */
    public String getInternalAddress() {
        return internalAddress;
    }

    /**
     * 内网ip
     */
    public void setInternalAddress(String internalAddress) {
        this.internalAddress = internalAddress;
    }
    /**
     * 内网音频端口
     */
    public Integer getInternalAport() {
        return internalAport;
    }

    /**
     * 内网音频端口
     */
    public void setInternalAport(Integer internalAport) {
        this.internalAport = internalAport;
    }
    /**
     * 内网音频端口类型
     */
    public Integer getInternalAtype() {
        return internalAtype;
    }

    /**
     * 内网音频端口类型
     */
    public void setInternalAtype(Integer internalAtype) {
        this.internalAtype = internalAtype;
    }
    /**
     * 内网视频端口
     */
    public Integer getInternalVport() {
        return internalVport;
    }

    /**
     * 内网视频端口
     */
    public void setInternalVport(Integer internalVport) {
        this.internalVport = internalVport;
    }
    /**
     * 外网ip
     */
    public String getExternalAddress() {
        return externalAddress;
    }

    /**
     * 外网ip
     */
    public void setExternalAddress(String externalAddress) {
        this.externalAddress = externalAddress;
    }
    /**
     * 外网音频端口
     */
    public Integer getExternalAport() {
        return externalAport;
    }

    /**
     * 外网音频端口
     */
    public void setExternalAport(Integer externalAport) {
        this.externalAport = externalAport;
    }
    /**
     * 外网音频端口类型
     */
    public Integer getExternalAtype() {
        return externalAtype;
    }

    /**
     * 外网音频端口类型
     */
    public void setExternalAtype(Integer externalAtype) {
        this.externalAtype = externalAtype;
    }
    /**
     * 外网视频端口
     */
    public Integer getExternalVport() {
        return externalVport;
    }

    /**
     * 外网视频端口
     */
    public void setExternalVport(Integer externalVport) {
        this.externalVport = externalVport;
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
     * 逻辑删除-默认dr=50，(50：正常，-50：删除)
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 逻辑删除-默认dr=50，(50：正常，-50：删除)
     */
    public void setDr(Integer dr) {
        this.dr = dr;
    }

    /**
     * 
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
     * 状态：idle、busy
     */
    public static final String STATUS = "status";

    /**
     * 内网ip
     */
    public static final String INTERNAL_ADDRESS = "internal_address";

    /**
     * 内网音频端口
     */
    public static final String INTERNAL_APORT = "internal_aport";

    /**
     * 内网音频端口类型
     */
    public static final String INTERNAL_ATYPE = "internal_atype";

    /**
     * 内网视频端口
     */
    public static final String INTERNAL_VPORT = "internal_vport";

    /**
     * 外网ip
     */
    public static final String EXTERNAL_ADDRESS = "external_address";

    /**
     * 外网音频端口
     */
    public static final String EXTERNAL_APORT = "external_aport";

    /**
     * 外网音频端口类型
     */
    public static final String EXTERNAL_ATYPE = "external_atype";

    /**
     * 外网视频端口
     */
    public static final String EXTERNAL_VPORT = "external_vport";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 最后修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 逻辑删除-默认dr=50，(50：正常，-50：删除)
     */
    public static final String DR = "dr";

    @Override
    public String toString() {
        return "VizMcMachineStreams{" +
            "id=" + id +
            ", fkMcMachineId=" + fkMcMachineId +
            ", deviceId=" + deviceId +
            ", instanceId=" + instanceId +
            ", status=" + status +
            ", internalAddress=" + internalAddress +
            ", internalAport=" + internalAport +
            ", internalAtype=" + internalAtype +
            ", internalVport=" + internalVport +
            ", externalAddress=" + externalAddress +
            ", externalAport=" + externalAport +
            ", externalAtype=" + externalAtype +
            ", externalVport=" + externalVport +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", dr=" + dr +
        "}";
    }

    public VizMcMachineStreamsQueryEntityWrapper queryWrapper(){
        return VizMcMachineStreamsQueryEntityWrapper.wrapper(this);
    }

    public VizMcMachineStreamsUpdateEntityWrapper updateWrapper(){
        return VizMcMachineStreamsUpdateEntityWrapper.wrapper(this);
    }

    public static VizMcMachineStreamsQueryWrapper qWrapper(){
        return VizMcMachineStreamsQueryWrapper.wrapper();
    }

    public static VizMcMachineStreamsUpdateWrapper uWrapper(){
        return VizMcMachineStreamsUpdateWrapper.wrapper();
    }

}
