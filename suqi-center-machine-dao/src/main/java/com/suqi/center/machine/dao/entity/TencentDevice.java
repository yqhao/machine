package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.TencentDeviceQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.TencentDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentDeviceUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.TencentDeviceUpdateWrapper;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 腾讯设备表
 * </p>
 *
 * @author PC001
 * @since 2023-06-14
 */
@TableName("tencent_device")
@ApiModel(value = "TencentDevice对象", description = "腾讯设备表")
public class TencentDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("腾讯账号区域Id")
    @TableField("fk_tencent_account_area_id")
    private Long fkTencentAccountAreaId;

    @ApiModelProperty("实例 ID")
    @TableField("instance_id")
    private String instanceId;

    @ApiModelProperty("实例所在区域")
    @TableField("region")
    private String region;

    @ApiModelProperty("当前实例所使用的镜像")
    @TableField("image_id")
    private String imageId;

    @ApiModelProperty("实例类型")
    @TableField("instance_type")
    private String instanceType;

    @ApiModelProperty("实例内网 IP")
    @TableField("ip")
    private String ip;

    @ApiModelProperty("实例所在物理宿主机编号")
    @TableField("host_serial_number")
    private String hostSerialNumber;

    @ApiModelProperty("实例特殊配置")
    @TableField("debug_properties_string")
    private String debugPropertiesString;

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

    @ApiModelProperty("最后一次重置时间")
    @TableField("last_reset_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastResetTime;

    @ApiModelProperty("最后一次重置任务ID")
    @TableField("last_task_id")
    private String lastTaskId;

    @ApiModelProperty("重置使用的镜像id不配置时使用image_id当前云机使用的镜像id")
    @TableField("reset_image_id")
    private String resetImageId;

    @ApiModelProperty("云机ID=实例 ID的小写")
    @TableField("device_id")
    private String deviceId;

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

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 腾讯账号区域Id
     */
    public static final String FK_TENCENT_ACCOUNT_AREA_ID = "fk_tencent_account_area_id";

    /**
     * 实例 ID
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 实例所在区域
     */
    public static final String REGION = "region";

    /**
     * 当前实例所使用的镜像
     */
    public static final String IMAGE_ID = "image_id";

    /**
     * 实例类型
     */
    public static final String INSTANCE_TYPE = "instance_type";

    /**
     * 实例内网 IP
     */
    public static final String IP = "ip";

    /**
     * 实例所在物理宿主机编号
     */
    public static final String HOST_SERIAL_NUMBER = "host_serial_number";

    /**
     * 实例特殊配置
     */
    public static final String DEBUG_PROPERTIES_STRING = "debug_properties_string";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 最后修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 最后一次重置时间
     */
    public static final String LAST_RESET_TIME = "last_reset_time";

    /**
     * 最后一次重置任务ID
     */
    public static final String LAST_TASK_ID = "last_task_id";

    /**
     * 重置使用的镜像id不配置时使用image_id当前云机使用的镜像id
     */
    public static final String RESET_IMAGE_ID = "reset_image_id";

    /**
     * 云机ID=实例 ID的小写
     */
    public static final String DEVICE_ID = "device_id";

    @Override
    public String toString() {
        return "TencentDevice{" +
            "id=" + id +
            ", fkTencentAccountAreaId=" + fkTencentAccountAreaId +
            ", instanceId=" + instanceId +
            ", region=" + region +
            ", imageId=" + imageId +
            ", instanceType=" + instanceType +
            ", ip=" + ip +
            ", hostSerialNumber=" + hostSerialNumber +
            ", debugPropertiesString=" + debugPropertiesString +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", lastResetTime=" + lastResetTime +
            ", lastTaskId=" + lastTaskId +
            ", resetImageId=" + resetImageId +
            ", deviceId=" + deviceId +
        "}";
    }

    public TencentDeviceQueryEntityWrapper queryWrapper(){
        return TencentDeviceQueryEntityWrapper.wrapper(this);
    }

    public TencentDeviceUpdateEntityWrapper updateWrapper(){
        return TencentDeviceUpdateEntityWrapper.wrapper(this);
    }

    public static TencentDeviceQueryWrapper qWrapper(){
        return TencentDeviceQueryWrapper.wrapper();
    }

    public static TencentDeviceUpdateWrapper uWrapper(){
        return TencentDeviceUpdateWrapper.wrapper();
    }

}
