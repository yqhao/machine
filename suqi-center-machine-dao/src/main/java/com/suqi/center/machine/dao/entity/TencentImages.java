package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.TencentImagesQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.TencentImagesQueryWrapper;
import com.suqi.center.machine.dao.wrapper.TencentImagesUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.TencentImagesUpdateWrapper;
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
 * 腾讯镜像管理
 * </p>
 *
 * @author PC001
 * @since 2023-08-22
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("tencent_images")
@ApiModel(value = "TencentImages对象", description = "腾讯镜像管理")
public class TencentImages implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("腾讯账号区域Id")
    @TableField("fk_tencent_account_area_id")
    private Long fkTencentAccountAreaId;

    @ApiModelProperty("状态：（-50：删除，-40：超时，1：创建中，50：正常）")
    @TableField("region")
    private String region;

    @ApiModelProperty("镜像名称")
    @TableField("title")
    private String title;

    @ApiModelProperty("镜像版本")
    @TableField("version_code")
    private String versionCode;

    @ApiModelProperty("镜像下载地址")
    @TableField("url")
    private String url;

    @ApiModelProperty("镜像导出文件 MD5 校验值")
    @TableField("md5")
    private String md5;

    @ApiModelProperty("镜像描述")
    @TableField("image_description")
    private String imageDescription;

    @ApiModelProperty("镜像id")
    @TableField("image_id")
    private String imageId;

    @TableField("status")
    private Integer status;

    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @TableField("last_update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @TableField("create_user_id")
    private Long createUserId;

    @TableField("last_update_id")
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
     * 状态：（-50：删除，-40：超时，1：创建中，50：正常）
     */
    public String getRegion() {
        return region;
    }

    /**
     * 状态：（-50：删除，-40：超时，1：创建中，50：正常）
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

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 腾讯账号区域Id
     */
    public static final String FK_TENCENT_ACCOUNT_AREA_ID = "fk_tencent_account_area_id";

    /**
     * 状态：（-50：删除，-40：超时，1：创建中，50：正常）
     */
    public static final String REGION = "region";

    /**
     * 镜像名称
     */
    public static final String TITLE = "title";

    /**
     * 镜像版本
     */
    public static final String VERSION_CODE = "version_code";

    /**
     * 镜像下载地址
     */
    public static final String URL = "url";

    /**
     * 镜像导出文件 MD5 校验值
     */
    public static final String MD5 = "md5";

    /**
     * 镜像描述
     */
    public static final String IMAGE_DESCRIPTION = "image_description";

    /**
     * 镜像id
     */
    public static final String IMAGE_ID = "image_id";

    /**
     * 
     */
    public static final String STATUS = "status";

    /**
     * 
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 
     */
    public static final String CREATE_USER_ID = "create_user_id";

    /**
     * 
     */
    public static final String LAST_UPDATE_ID = "last_update_id";

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

    public TencentImagesQueryEntityWrapper queryWrapper(){
        return TencentImagesQueryEntityWrapper.wrapper(this);
    }

    public TencentImagesUpdateEntityWrapper updateWrapper(){
        return TencentImagesUpdateEntityWrapper.wrapper(this);
    }

    public static TencentImagesQueryWrapper qWrapper(){
        return TencentImagesQueryWrapper.wrapper();
    }

    public static TencentImagesUpdateWrapper uWrapper(){
        return TencentImagesUpdateWrapper.wrapper();
    }

}
