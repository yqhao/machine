package com.suqi.center.machine.api.dto.reponse;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 腾讯设备表
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@ApiModel(value = "TencentDevice对象", description = "腾讯设备表")
public class TencentDeviceResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    @ApiModelProperty("腾讯账号区域Id")

    private Long fkTencentAccountAreaId;
    @ApiModelProperty("实例 ID")

    private String instanceId;
    @ApiModelProperty("实例所在区域")

    private String region;
    @ApiModelProperty("当前实例所使用的镜像")

    private String imageId;
    @ApiModelProperty("实例类型")

    private String instanceType;
    @ApiModelProperty("实例内网 IP")

    private String ip;
    @ApiModelProperty("实例所在物理宿主机编号")

    private String hostSerialNumber;
    @ApiModelProperty("实例特殊配置")

    private String debugPropertiesString;
    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
    @ApiModelProperty("最后修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;
    @ApiModelProperty("最后一次重置时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastResetTime;
    @ApiModelProperty("最后一次重置任务ID")

    private String lastTaskId;
    @ApiModelProperty("重置使用的镜像id不配置时使用image_id当前云机使用的镜像id")

    private String resetImageId;
    @ApiModelProperty("云机ID=实例 ID的小写")

    private String deviceId;

    @ApiModelProperty("健康状态(1：在线，0:故障)")
    private Integer healthStatus;


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
     * 腾讯账号区域Id
     */
    public Long getFkTencentAccountAreaId() {
        return fkTencentAccountAreaId;
    }

    /**
     * 腾讯账号区域Id
     */
    public void setFkTencentAccountAreaId(Long fkTencentAccountAreaId) {
        this.fkTencentAccountAreaId = fkTencentAccountAreaId;
    }
    /**
     * 实例 ID
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 实例 ID
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    /**
     * 实例所在区域
     */
    public String getRegion() {
        return region;
    }

    /**
     * 实例所在区域
     */
    public void setRegion(String region) {
        this.region = region;
    }
    /**
     * 当前实例所使用的镜像
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * 当前实例所使用的镜像
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    /**
     * 实例类型
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * 实例类型
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    /**
     * 实例内网 IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 实例内网 IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }
    /**
     * 实例所在物理宿主机编号
     */
    public String getHostSerialNumber() {
        return hostSerialNumber;
    }

    /**
     * 实例所在物理宿主机编号
     */
    public void setHostSerialNumber(String hostSerialNumber) {
        this.hostSerialNumber = hostSerialNumber;
    }
    /**
     * 实例特殊配置
     */
    public String getDebugPropertiesString() {
        return debugPropertiesString;
    }

    /**
     * 实例特殊配置
     */
    public void setDebugPropertiesString(String debugPropertiesString) {
        this.debugPropertiesString = debugPropertiesString;
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
     * 最后一次重置时间
     */
    public Date getLastResetTime() {
        return lastResetTime;
    }

    /**
     * 最后一次重置时间
     */
    public void setLastResetTime(Date lastResetTime) {
        this.lastResetTime = lastResetTime;
    }
    /**
     * 最后一次重置任务ID
     */
    public String getLastTaskId() {
        return lastTaskId;
    }

    /**
     * 最后一次重置任务ID
     */
    public void setLastTaskId(String lastTaskId) {
        this.lastTaskId = lastTaskId;
    }
    /**
     * 重置使用的镜像id不配置时使用image_id当前云机使用的镜像id
     */
    public String getResetImageId() {
        return resetImageId;
    }

    /**
     * 重置使用的镜像id不配置时使用image_id当前云机使用的镜像id
     */
    public void setResetImageId(String resetImageId) {
        this.resetImageId = resetImageId;
    }
    /**
     * 云机ID=实例 ID的小写
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 云机ID=实例 ID的小写
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public List<TencentDeviceIpInfoResult> getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(List<TencentDeviceIpInfoResult> publicIps) {
        this.publicIps = publicIps;
    }

    @ApiModelProperty("公网信息")
    private List<TencentDeviceIpInfoResult> publicIps;


    public Integer getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(Integer healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":").append(id);
        sb.append(", \"fkTencentAccountAreaId\":").append(fkTencentAccountAreaId);
        sb.append(", \"instanceId\":\"").append(instanceId).append('\"');
        sb.append(", \"region\":\"").append(region).append('\"');
        sb.append(", \"imageId\":\"").append(imageId).append('\"');
        sb.append(", \"instanceType\":\"").append(instanceType).append('\"');
        sb.append(", \"ip\":\"").append(ip).append('\"');
        sb.append(", \"hostSerialNumber\":\"").append(hostSerialNumber).append('\"');
        sb.append(", \"debugPropertiesString\":\"").append(debugPropertiesString).append('\"');
        sb.append(", \"createTime\":\"").append(createTime).append('\"');
        sb.append(", \"lastUpdateTime\":\"").append(lastUpdateTime).append('\"');
        sb.append(", \"lastResetTime\":\"").append(lastResetTime).append('\"');
        sb.append(", \"lastTaskId\":\"").append(lastTaskId).append('\"');
        sb.append(", \"resetImageId\":\"").append(resetImageId).append('\"');
        sb.append(", \"deviceId\":\"").append(deviceId).append('\"');
        sb.append(", \"healthStatus\":").append(healthStatus);
        sb.append(", \"publicIps\":").append(publicIps);
        sb.append('}');
        return sb.toString();
    }


}