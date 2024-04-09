package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.TencentResetRecordQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.TencentResetRecordQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentResetRecordUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.TencentResetRecordUpdateWrapper;
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
 * 腾讯云机重置记录
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("tencent_reset_record")
@ApiModel(value = "TencentResetRecord对象", description = "腾讯云机重置记录")
public class TencentResetRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("fk_tencent_device_id")
    private Long fkTencentDeviceId;

    @ApiModelProperty("腾讯云机id")
    @TableField("instance_id")
    private String instanceId;

    @TableField("fk_tencent_images_id")
    private Long fkTencentImagesId;

    @ApiModelProperty("镜像版本")
    @TableField("version_code")
    private String versionCode;

    @ApiModelProperty("镜像名称")
    @TableField("title")
    private String title;

    @ApiModelProperty("重置前镜像版本id")
    @TableField("old_image_id")
    private String oldImageId;

    @ApiModelProperty("当前重置镜像版本id")
    @TableField("reset_image_id")
    private String resetImageId;

    @TableField("reset_user_id")
    private Long resetUserId;

    @TableField("response")
    private String response;

    @ApiModelProperty("重置时间")
    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

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
     * 
     */
    public Long getFkTencentDeviceId() {
        return fkTencentDeviceId;
    }

    /**
     * 
     */
    public void setFkTencentDeviceId(Long fkTencentDeviceId) {
        this.fkTencentDeviceId = fkTencentDeviceId;
    }
    /**
     * 腾讯云机id
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 腾讯云机id
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    /**
     * 
     */
    public Long getFkTencentImagesId() {
        return fkTencentImagesId;
    }

    /**
     * 
     */
    public void setFkTencentImagesId(Long fkTencentImagesId) {
        this.fkTencentImagesId = fkTencentImagesId;
    }
    /**
     * 镜像版本
     */
    public String getVersionCode() {
        return versionCode;
    }

    /**
     * 镜像版本
     */
    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }
    /**
     * 镜像名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 镜像名称
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * 重置前镜像版本id
     */
    public String getOldImageId() {
        return oldImageId;
    }

    /**
     * 重置前镜像版本id
     */
    public void setOldImageId(String oldImageId) {
        this.oldImageId = oldImageId;
    }
    /**
     * 当前重置镜像版本id
     */
    public String getResetImageId() {
        return resetImageId;
    }

    /**
     * 当前重置镜像版本id
     */
    public void setResetImageId(String resetImageId) {
        this.resetImageId = resetImageId;
    }
    /**
     * 
     */
    public Long getResetUserId() {
        return resetUserId;
    }

    /**
     * 
     */
    public void setResetUserId(Long resetUserId) {
        this.resetUserId = resetUserId;
    }
    /**
     * 
     */
    public String getResponse() {
        return response;
    }

    /**
     * 
     */
    public void setResponse(String response) {
        this.response = response;
    }
    /**
     * 重置时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 重置时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 
     */
    public static final String FK_TENCENT_DEVICE_ID = "fk_tencent_device_id";

    /**
     * 腾讯云机id
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 
     */
    public static final String FK_TENCENT_IMAGES_ID = "fk_tencent_images_id";

    /**
     * 镜像版本
     */
    public static final String VERSION_CODE = "version_code";

    /**
     * 镜像名称
     */
    public static final String TITLE = "title";

    /**
     * 重置前镜像版本id
     */
    public static final String OLD_IMAGE_ID = "old_image_id";

    /**
     * 当前重置镜像版本id
     */
    public static final String RESET_IMAGE_ID = "reset_image_id";

    /**
     * 
     */
    public static final String RESET_USER_ID = "reset_user_id";

    /**
     * 
     */
    public static final String RESPONSE = "response";

    /**
     * 重置时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public String toString() {
        return "TencentResetRecord{" +
            "id=" + id +
            ", fkTencentDeviceId=" + fkTencentDeviceId +
            ", instanceId=" + instanceId +
            ", fkTencentImagesId=" + fkTencentImagesId +
            ", versionCode=" + versionCode +
            ", title=" + title +
            ", oldImageId=" + oldImageId +
            ", resetImageId=" + resetImageId +
            ", resetUserId=" + resetUserId +
            ", response=" + response +
            ", createTime=" + createTime +
        "}";
    }

    public TencentResetRecordQueryEntityWrapper queryWrapper(){
        return TencentResetRecordQueryEntityWrapper.wrapper(this);
    }

    public TencentResetRecordUpdateEntityWrapper updateWrapper(){
        return TencentResetRecordUpdateEntityWrapper.wrapper(this);
    }

    public static TencentResetRecordQueryWrapper qWrapper(){
        return TencentResetRecordQueryWrapper.wrapper();
    }

    public static TencentResetRecordUpdateWrapper uWrapper(){
        return TencentResetRecordUpdateWrapper.wrapper();
    }

}
