package com.suqi.center.machine.api.dto.reponse;

import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 腾讯镜像管理
 * </p>
 *
 * @author PC001
 * @since 2023-06-12
 */
@ApiModel(value = "TencentImages对象", description = "腾讯镜像管理")
public class TencentImagesResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    @ApiModelProperty("腾讯账号区域Id")

    private Long fkTencentAccountAreaId;

    private String region;
    @ApiModelProperty("镜像名称")

    private String title;
    @ApiModelProperty("镜像版本")

    private String versionCode;
    @ApiModelProperty("镜像下载地址")

    private String url;
    @ApiModelProperty("镜像导出文件 MD5 校验值")

    private String md5;
    @ApiModelProperty("镜像描述")

    private String imageDescription;
    @ApiModelProperty("镜像id")

    private String imageId;

    private Integer status;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    private Long createUserId;

    private Long lastUpdateId;

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
     * 
     */
    public String getRegion() {
        return region;
    }

    /**
     * 
     */
    public void setRegion(String region) {
        this.region = region;
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
     * 镜像下载地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 镜像下载地址
     */
    public void setUrl(String url) {
        this.url = url;
    }
    /**
     * 镜像导出文件 MD5 校验值
     */
    public String getMd5() {
        return md5;
    }

    /**
     * 镜像导出文件 MD5 校验值
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }
    /**
     * 镜像描述
     */
    public String getImageDescription() {
        return imageDescription;
    }

    /**
     * 镜像描述
     */
    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
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
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
     * 
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    /**
     * 
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }
    /**
     * 
     */
    public Long getLastUpdateId() {
        return lastUpdateId;
    }

    /**
     * 
     */
    public void setLastUpdateId(Long lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
    }

    @Override
    public String toString() {
        return "TencentImages{" +
            "id=" + id +
            ", fkTencentAccountAreaId=" + fkTencentAccountAreaId +
            ", region=" + region +
            ", title=" + title +
            ", versionCode=" + versionCode +
            ", url=" + url +
            ", md5=" + md5 +
            ", imageDescription=" + imageDescription +
            ", imageId=" + imageId +
            ", status=" + status +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", createUserId=" + createUserId +
            ", lastUpdateId=" + lastUpdateId +
        "}";
    }



}
