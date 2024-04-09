package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.PcpDeviceQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.PcpDeviceQueryWrapper;
import com.suqi.center.machine.dao.wrapper.PcpDeviceUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.PcpDeviceUpdateWrapper;
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
 * 云机id对照表
 * </p>
 *
 * @author PC001
 * @since 2023-08-16
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("pcp_device")
@ApiModel(value = "PcpDevice对象", description = "云机id对照表")
public class PcpDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("华为项目id")
    @TableField("project_id")
    private String projectId;

    @ApiModelProperty("华为云机id")
    @TableField("phone_id")
    private String phoneId;

    @ApiModelProperty("mac地址")
    @TableField("macAddress")
    private String macAddress;

    @ApiModelProperty("调用地址")
    @TableField("endpointPhonesUrl")
    private String endpointPhonesUrl;

    @ApiModelProperty("云服务器id")
    @TableField("serverId")
    private String serverId;

    @ApiModelProperty("镜像id")
    @TableField("imageId")
    private String imageId;

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

    @TableField("version_id")
    private Long versionId;

    @ApiModelProperty("手机规格名称，不得超过64byte。")
    @TableField("phone_model_name")
    private String phoneModelName;

    @ApiModelProperty("云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)")
    @TableField("phone_name")
    private String phoneName;

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
     * 华为项目id
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * 华为项目id
     */
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    /**
     * 华为云机id
     */
    public String getPhoneId() {
        return phoneId;
    }

    /**
     * 华为云机id
     */
    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }
    /**
     * mac地址
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * mac地址
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
    /**
     * 调用地址
     */
    public String getEndpointPhonesUrl() {
        return endpointPhonesUrl;
    }

    /**
     * 调用地址
     */
    public void setEndpointPhonesUrl(String endpointPhonesUrl) {
        this.endpointPhonesUrl = endpointPhonesUrl;
    }
    /**
     * 云服务器id
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * 云服务器id
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }
    /**
     * 镜像id
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * 镜像id
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
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
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }
    /**
     * 手机规格名称，不得超过64byte。
     */
    public String getPhoneModelName() {
        return phoneModelName;
    }

    /**
     * 手机规格名称，不得超过64byte。
     */
    public void setPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
    }
    /**
     * 云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)
     */
    public String getPhoneName() {
        return phoneName;
    }

    /**
     * 云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)
     */
    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 设备唯一码
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 华为项目id
     */
    public static final String PROJECT_ID = "project_id";

    /**
     * 华为云机id
     */
    public static final String PHONE_ID = "phone_id";

    /**
     * mac地址
     */
    public static final String MACADDRESS = "macAddress";

    /**
     * 调用地址
     */
    public static final String ENDPOINTPHONESURL = "endpointPhonesUrl";

    /**
     * 云服务器id
     */
    public static final String SERVERID = "serverId";

    /**
     * 镜像id
     */
    public static final String IMAGEID = "imageId";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 最后修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 
     */
    public static final String VERSION_ID = "version_id";

    /**
     * 手机规格名称，不得超过64byte。
     */
    public static final String PHONE_MODEL_NAME = "phone_model_name";

    /**
     * 云手机的名称，(对应自动规格类型（“热门”、“冷门”、“大包” ）)
     */
    public static final String PHONE_NAME = "phone_name";

    @Override
    public String toString() {
        return "PcpDevice{" +
            "id=" + id +
            ", deviceId=" + deviceId +
            ", projectId=" + projectId +
            ", phoneId=" + phoneId +
            ", macAddress=" + macAddress +
            ", endpointPhonesUrl=" + endpointPhonesUrl +
            ", serverId=" + serverId +
            ", imageId=" + imageId +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", versionId=" + versionId +
            ", phoneModelName=" + phoneModelName +
            ", phoneName=" + phoneName +
        "}";
    }

    public PcpDeviceQueryEntityWrapper queryWrapper(){
        return PcpDeviceQueryEntityWrapper.wrapper(this);
    }

    public PcpDeviceUpdateEntityWrapper updateWrapper(){
        return PcpDeviceUpdateEntityWrapper.wrapper(this);
    }

    public static PcpDeviceQueryWrapper qWrapper(){
        return PcpDeviceQueryWrapper.wrapper();
    }

    public static PcpDeviceUpdateWrapper uWrapper(){
        return PcpDeviceUpdateWrapper.wrapper();
    }

}
