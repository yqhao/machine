package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.BaiduResetRecordQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduResetRecordQueryWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduResetRecordUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduResetRecordUpdateWrapper;
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
 * 百度云机重置记录
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("baidu_reset_record")
@ApiModel(value = "BaiduResetRecord对象", description = "百度云机重置记录")
public class BaiduResetRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("fk_baidu_device_id")
    private Long fkBaiduDeviceId;

    @ApiModelProperty("百度云机id")
    @TableField("code")
    private String code;

    @TableField("fk_baidu_images_id")
    private Long fkBaiduImagesId;

    @ApiModelProperty("镜像版本")
    @TableField("version_code")
    private String versionCode;

    @ApiModelProperty("镜像名称")
    @TableField("title")
    private String title;

    @ApiModelProperty("重置前镜像版本id")
    @TableField("old_image_version_id")
    private String oldImageVersionId;

    @ApiModelProperty("当前重置镜像版本id")
    @TableField("reset_image_version_id")
    private String resetImageVersionId;

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
    public Long getFkBaiduDeviceId() {
        return fkBaiduDeviceId;
    }

    /**
     * 
     */
    public void setFkBaiduDeviceId(Long fkBaiduDeviceId) {
        this.fkBaiduDeviceId = fkBaiduDeviceId;
    }
    /**
     * 百度云机id
     */
    public String getCode() {
        return code;
    }

    /**
     * 百度云机id
     */
    public void setCode(String code) {
        this.code = code;
    }
    /**
     * 
     */
    public Long getFkBaiduImagesId() {
        return fkBaiduImagesId;
    }

    /**
     * 
     */
    public void setFkBaiduImagesId(Long fkBaiduImagesId) {
        this.fkBaiduImagesId = fkBaiduImagesId;
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
    public String getOldImageVersionId() {
        return oldImageVersionId;
    }

    /**
     * 重置前镜像版本id
     */
    public void setOldImageVersionId(String oldImageVersionId) {
        this.oldImageVersionId = oldImageVersionId;
    }
    /**
     * 当前重置镜像版本id
     */
    public String getResetImageVersionId() {
        return resetImageVersionId;
    }

    /**
     * 当前重置镜像版本id
     */
    public void setResetImageVersionId(String resetImageVersionId) {
        this.resetImageVersionId = resetImageVersionId;
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
    public static final String FK_BAIDU_DEVICE_ID = "fk_baidu_device_id";

    /**
     * 百度云机id
     */
    public static final String CODE = "code";

    /**
     * 
     */
    public static final String FK_BAIDU_IMAGES_ID = "fk_baidu_images_id";

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
    public static final String OLD_IMAGE_VERSION_ID = "old_image_version_id";

    /**
     * 当前重置镜像版本id
     */
    public static final String RESET_IMAGE_VERSION_ID = "reset_image_version_id";

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
        return "BaiduResetRecord{" +
            "id=" + id +
            ", fkBaiduDeviceId=" + fkBaiduDeviceId +
            ", code=" + code +
            ", fkBaiduImagesId=" + fkBaiduImagesId +
            ", versionCode=" + versionCode +
            ", title=" + title +
            ", oldImageVersionId=" + oldImageVersionId +
            ", resetImageVersionId=" + resetImageVersionId +
            ", resetUserId=" + resetUserId +
            ", response=" + response +
            ", createTime=" + createTime +
        "}";
    }

    public BaiduResetRecordQueryEntityWrapper queryWrapper(){
        return BaiduResetRecordQueryEntityWrapper.wrapper(this);
    }

    public BaiduResetRecordUpdateEntityWrapper updateWrapper(){
        return BaiduResetRecordUpdateEntityWrapper.wrapper(this);
    }

    public static BaiduResetRecordQueryWrapper qWrapper(){
        return BaiduResetRecordQueryWrapper.wrapper();
    }

    public static BaiduResetRecordUpdateWrapper uWrapper(){
        return BaiduResetRecordUpdateWrapper.wrapper();
    }

}
