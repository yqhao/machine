package com.suqi.center.machine.api.viz.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * @author 18374
 * @since 2023-10-10
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "VizMcMachineStreams对象", description = "机器streaming端口映射")
public class VizMcMachineStreamsParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @ApiModelProperty("机器基础信息表记录id")
    private Long fkMcMachineId;

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("实例Id")
    private String instanceId;

    @ApiModelProperty("状态：idle、busy")
    private String status;

    @ApiModelProperty("内网ip")
    private String internalAddress;

    @ApiModelProperty("内网音频端口")
    private Integer internalAport;

    @ApiModelProperty("内网音频端口类型")
    private Integer internalAtype;

    @ApiModelProperty("内网视频端口")
    private Integer internalVport;

    @ApiModelProperty("外网ip")
    private String externalAddress;

    @ApiModelProperty("外网音频端口")
    private Integer externalAport;

    @ApiModelProperty("外网音频端口类型")
    private Integer externalAtype;

    @ApiModelProperty("外网视频端口")
    private Integer externalVport;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;


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


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":").append(id);
        sb.append(", \"fkMcMachineId\":").append(fkMcMachineId);
        sb.append(", \"deviceId\":\"").append(deviceId).append('\"');
        sb.append(", \"instanceId\":\"").append(instanceId).append('\"');
        sb.append(", \"status\":\"").append(status).append('\"');
        sb.append(", \"internalAddress\":\"").append(internalAddress).append('\"');
        sb.append(", \"internalAport\":").append(internalAport);
        sb.append(", \"internalAtype\":").append(internalAtype);
        sb.append(", \"internalVport\":").append(internalVport);
        sb.append(", \"externalAddress\":\"").append(externalAddress).append('\"');
        sb.append(", \"externalAport\":").append(externalAport);
        sb.append(", \"externalAtype\":").append(externalAtype);
        sb.append(", \"externalVport\":").append(externalVport);
        sb.append(", \"createTime\":\"").append(createTime).append('\"');
        sb.append(", \"lastUpdateTime\":\"").append(lastUpdateTime).append('\"');
        sb.append('}');
        return sb.toString();
    }


}
