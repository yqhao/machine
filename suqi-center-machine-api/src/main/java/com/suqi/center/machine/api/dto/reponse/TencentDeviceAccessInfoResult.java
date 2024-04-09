package com.suqi.center.machine.api.dto.reponse;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 腾讯设备公网映射表
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@ApiModel(value = "TencentDeviceAccessInfo对象", description = "腾讯设备公网映射表")
public class TencentDeviceAccessInfoResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    @ApiModelProperty("腾讯设备Id")

    private Long fkTencentDeviceId;
    @ApiModelProperty("实例ID")

    private String instanceId;
    @ApiModelProperty("云手机服务内网IP")

    private String serverIp;
    @ApiModelProperty("云手机服务监听端口")

    private Integer serverPort;
    @ApiModelProperty("云手机服务公网映射 IP")

    private String publicIp;
    @ApiModelProperty("云手机服务公网映射端口")

    private Integer publicPort;
    @ApiModelProperty("云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）")

    private String isp;
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
     * 腾讯设备Id
     */
    public Long getFkTencentDeviceId() {
        return fkTencentDeviceId;
    }

    /**
     * 腾讯设备Id
     */
    public void setFkTencentDeviceId(Long fkTencentDeviceId) {
        this.fkTencentDeviceId = fkTencentDeviceId;
    }
    /**
     * 实例ID
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 实例ID
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    /**
     * 云手机服务内网IP
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * 云手机服务内网IP
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }
    /**
     * 云手机服务监听端口
     */
    public Integer getServerPort() {
        return serverPort;
    }

    /**
     * 云手机服务监听端口
     */
    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }
    /**
     * 云手机服务公网映射 IP
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * 云手机服务公网映射 IP
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    /**
     * 云手机服务公网映射端口
     */
    public Integer getPublicPort() {
        return publicPort;
    }

    /**
     * 云手机服务公网映射端口
     */
    public void setPublicPort(Integer publicPort) {
        this.publicPort = publicPort;
    }
    /**
     * 云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）
     */
    public String getIsp() {
        return isp;
    }

    /**
     * 云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）
     */
    public void setIsp(String isp) {
        this.isp = isp;
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
        return "TencentDeviceAccessInfo{" +
            "id=" + id +
            ", fkTencentDeviceId=" + fkTencentDeviceId +
            ", instanceId=" + instanceId +
            ", serverIp=" + serverIp +
            ", serverPort=" + serverPort +
            ", publicIp=" + publicIp +
            ", publicPort=" + publicPort +
            ", isp=" + isp +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }



}
