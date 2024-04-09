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
 * 百度云机重置记录
 * </p>
 *
 * @author PC001
 * @since 2023-08-31
 */
@ApiModel(value = "BaiduResetRecord对象", description = "百度云机重置记录")
public class BaiduResetRecordParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(groups = ValidationGroups.Update.class, message = "id 不能为null")
    private Long id;

    private Long fkBaiduDeviceId;

    @ApiModelProperty("百度云机id")
    private String code;

    private Long fkBaiduImagesId;

    @ApiModelProperty("镜像版本")
    private String versionCode;

    @ApiModelProperty("镜像名称")
    private String title;

    @ApiModelProperty("重置前镜像版本id")
    private String oldImageVersionId;

    @ApiModelProperty("当前重置镜像版本id")
    private String resetImageVersionId;

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
    public Long getFkBaiduDeviceId() {
        return fkBaiduDeviceId;
    }

    /**
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
     */
    public Long getFkBaiduImagesId() {
        return fkBaiduImagesId;
    }

    /**
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
        return "BaiduResetRecord{" + "id=" + id + ", fkBaiduDeviceId=" + fkBaiduDeviceId + ", code=" + code + ", fkBaiduImagesId=" + fkBaiduImagesId + ", versionCode=" + versionCode + ", title=" + title + ", oldImageVersionId=" + oldImageVersionId + ", resetImageVersionId=" + resetImageVersionId + ", resetUserId=" + resetUserId + ", response=" + response + ", createTime=" + createTime + "}";
    }
}
