package com.suqi.center.machine.api.dto.request;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.suqi.center.common.dto.ValidationGroups;

/**
 * <p>
 * 腾讯云机重置记录
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
@ApiModel(value = "TencentResetRecord对象", description = "腾讯云机重置记录")
public class TencentResetRecordParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(groups = ValidationGroups.Update.class, message = "id 不能为null")
    private Long id;

    private Long fkTencentDeviceId;

    @ApiModelProperty("腾讯云机id")
    private String instanceId;

    private Long fkTencentImagesId;

    @ApiModelProperty("镜像版本")
    private String versionCode;

    @ApiModelProperty("镜像名称")
    private String title;

    @ApiModelProperty("重置前镜像版本id")
    private String oldImageId;

    @ApiModelProperty("当前重置镜像版本id")
    private String resetImageId;

    private Long resetUserId;

    private String response;

    @ApiModelProperty("重置时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndCreateTime;

    /**
     */
    public Long getId() {
        return id;
    }

    /**
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     */
    public Long getFkTencentDeviceId() {
        return fkTencentDeviceId;
    }

    /**
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
     */
    public Long getFkTencentImagesId() {
        return fkTencentImagesId;
    }

    /**
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
     */
    public Long getResetUserId() {
        return resetUserId;
    }

    /**
     */
    public void setResetUserId(Long resetUserId) {
        this.resetUserId = resetUserId;
    }

    /**
     */
    public String getResponse() {
        return response;
    }

    /**
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
     * 重置时间
     */
    public Date getQueryEndCreateTime() {
        return queryEndCreateTime;
    }

    /**
     * 重置时间
     */
    public void setQueryEndCreateTime(Date queryEndCreateTime) {
        this.queryEndCreateTime = queryEndCreateTime;
    }

    @Override
    public String toString() {
        return "TencentResetRecord{" + "id=" + id + ", fkTencentDeviceId=" + fkTencentDeviceId + ", instanceId=" + instanceId + ", fkTencentImagesId=" + fkTencentImagesId + ", versionCode=" + versionCode + ", title=" + title + ", oldImageId=" + oldImageId + ", resetImageId=" + resetImageId + ", resetUserId=" + resetUserId + ", response=" + response + ", createTime=" + createTime + "}";
    }
}
