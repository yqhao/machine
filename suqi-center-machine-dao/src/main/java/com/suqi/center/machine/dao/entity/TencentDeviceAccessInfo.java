package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.TencentDeviceAccessInfoQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.TencentDeviceAccessInfoQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentDeviceAccessInfoUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.TencentDeviceAccessInfoUpdateWrapper;
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
 * 腾讯设备公网映射表
 * </p>
 *
 * @author PC001
 * @since 2023-07-19
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("tencent_device_access_info")
@ApiModel(value = "TencentDeviceAccessInfo对象", description = "腾讯设备公网映射表")
public class TencentDeviceAccessInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("腾讯设备Id")
    @TableField("fk_tencent_device_id")
    private Long fkTencentDeviceId;

    @ApiModelProperty("实例ID")
    @TableField("instance_id")
    private String instanceId;

    @ApiModelProperty("云手机服务内网IP")
    @TableField("server_ip")
    private String serverIp;

    @ApiModelProperty("云手机服务监听端口")
    @TableField("server_port")
    private Integer serverPort;

    @ApiModelProperty("云手机服务公网映射 IP")
    @TableField("public_ip")
    private String publicIp;

    @ApiModelProperty("云手机服务公网映射端口")
    @TableField("public_port")
    private Integer publicPort;

    @ApiModelProperty("云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）")
    @TableField("isp")
    private String isp;

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

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 腾讯设备Id
     */
    public static final String FK_TENCENT_DEVICE_ID = "fk_tencent_device_id";

    /**
     * 实例ID
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 云手机服务内网IP
     */
    public static final String SERVER_IP = "server_ip";

    /**
     * 云手机服务监听端口
     */
    public static final String SERVER_PORT = "server_port";

    /**
     * 云手机服务公网映射 IP
     */
    public static final String PUBLIC_IP = "public_ip";

    /**
     * 云手机服务公网映射端口
     */
    public static final String PUBLIC_PORT = "public_port";

    /**
     * 云手机服务公网运营商（中国联通：CUCC， 中国电信：CTCC ，中国移动：CMCC）
     */
    public static final String ISP = "isp";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 最后修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

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

    public TencentDeviceAccessInfoQueryEntityWrapper queryWrapper(){
        return TencentDeviceAccessInfoQueryEntityWrapper.wrapper(this);
    }

    public TencentDeviceAccessInfoUpdateEntityWrapper updateWrapper(){
        return TencentDeviceAccessInfoUpdateEntityWrapper.wrapper(this);
    }

    public static TencentDeviceAccessInfoQueryWrapper qWrapper(){
        return TencentDeviceAccessInfoQueryWrapper.wrapper();
    }

    public static TencentDeviceAccessInfoUpdateWrapper uWrapper(){
        return TencentDeviceAccessInfoUpdateWrapper.wrapper();
    }

}
