package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.BaiduImagesQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduImagesQueryWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduImagesUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.BaiduImagesUpdateWrapper;
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
 * 百度镜像
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("baidu_images")
@ApiModel(value = "BaiduImages对象", description = "百度镜像")
public class BaiduImages implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("百度账号id")
    @TableField("fk_baidu_account_id")
    private Long fkBaiduAccountId;

    @ApiModelProperty("镜像名称")
    @TableField("title")
    private String title;

    @ApiModelProperty("镜像版本")
    @TableField("version_code")
    private String versionCode;

    @TableField("root_image_file_url")
    private String rootImageFileUrl;

    @TableField("root_image_file_name")
    private String rootImageFileName;

    @TableField("root_image_file_type")
    private String rootImageFileType;

    @TableField("root_image_file_md5")
    private String rootImageFileMd5;

    @TableField("system_image_file_url")
    private String systemImageFileUrl;

    @TableField("system_image_file_name")
    private String systemImageFileName;

    @TableField("system_image_file_type")
    private String systemImageFileType;

    @TableField("system_image_file_md5")
    private String systemImageFileMd5;

    @TableField("odm_image_file_url")
    private String odmImageFileUrl;

    @TableField("odm_image_file_name")
    private String odmImageFileName;

    @TableField("odm_image_file_type")
    private String odmImageFileType;

    @TableField("odm_image_file_md5")
    private String odmImageFileMd5;

    @TableField("vendor_image_file_url")
    private String vendorImageFileUrl;

    @TableField("vendor_image_file_name")
    private String vendorImageFileName;

    @TableField("vendor_image_file_type")
    private String vendorImageFileType;

    @TableField("vendor_image_file_md5")
    private String vendorImageFileMd5;

    @ApiModelProperty("设备类型（3399，3288，3588，Ampere32，845，865）")
    @TableField("server_type")
    private String serverType;

    @ApiModelProperty("系统版本（android6.0，android8.1，，android10.0，android12.0）")
    @TableField("rom_version")
    private String romVersion;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("镜像版本id")
    @TableField("image_version_id")
    private String imageVersionId;

    @ApiModelProperty("镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）")
    @TableField("status")
    private Integer status;

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
     * 百度账号id
     */
    public Long getFkBaiduAccountId() {
        return fkBaiduAccountId;
    }

    /**
     * 百度账号id
     */
    public void setFkBaiduAccountId(Long fkBaiduAccountId) {
        this.fkBaiduAccountId = fkBaiduAccountId;
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
     * 
     */
    public String getRootImageFileUrl() {
        return rootImageFileUrl;
    }

    /**
     * 
     */
    public void setRootImageFileUrl(String rootImageFileUrl) {
        this.rootImageFileUrl = rootImageFileUrl;
    }
    /**
     * 
     */
    public String getRootImageFileName() {
        return rootImageFileName;
    }

    /**
     * 
     */
    public void setRootImageFileName(String rootImageFileName) {
        this.rootImageFileName = rootImageFileName;
    }
    /**
     * 
     */
    public String getRootImageFileType() {
        return rootImageFileType;
    }

    /**
     * 
     */
    public void setRootImageFileType(String rootImageFileType) {
        this.rootImageFileType = rootImageFileType;
    }
    /**
     * 
     */
    public String getRootImageFileMd5() {
        return rootImageFileMd5;
    }

    /**
     * 
     */
    public void setRootImageFileMd5(String rootImageFileMd5) {
        this.rootImageFileMd5 = rootImageFileMd5;
    }
    /**
     * 
     */
    public String getSystemImageFileUrl() {
        return systemImageFileUrl;
    }

    /**
     * 
     */
    public void setSystemImageFileUrl(String systemImageFileUrl) {
        this.systemImageFileUrl = systemImageFileUrl;
    }
    /**
     * 
     */
    public String getSystemImageFileName() {
        return systemImageFileName;
    }

    /**
     * 
     */
    public void setSystemImageFileName(String systemImageFileName) {
        this.systemImageFileName = systemImageFileName;
    }
    /**
     * 
     */
    public String getSystemImageFileType() {
        return systemImageFileType;
    }

    /**
     * 
     */
    public void setSystemImageFileType(String systemImageFileType) {
        this.systemImageFileType = systemImageFileType;
    }
    /**
     * 
     */
    public String getSystemImageFileMd5() {
        return systemImageFileMd5;
    }

    /**
     * 
     */
    public void setSystemImageFileMd5(String systemImageFileMd5) {
        this.systemImageFileMd5 = systemImageFileMd5;
    }
    /**
     * 
     */
    public String getOdmImageFileUrl() {
        return odmImageFileUrl;
    }

    /**
     * 
     */
    public void setOdmImageFileUrl(String odmImageFileUrl) {
        this.odmImageFileUrl = odmImageFileUrl;
    }
    /**
     * 
     */
    public String getOdmImageFileName() {
        return odmImageFileName;
    }

    /**
     * 
     */
    public void setOdmImageFileName(String odmImageFileName) {
        this.odmImageFileName = odmImageFileName;
    }
    /**
     * 
     */
    public String getOdmImageFileType() {
        return odmImageFileType;
    }

    /**
     * 
     */
    public void setOdmImageFileType(String odmImageFileType) {
        this.odmImageFileType = odmImageFileType;
    }
    /**
     * 
     */
    public String getOdmImageFileMd5() {
        return odmImageFileMd5;
    }

    /**
     * 
     */
    public void setOdmImageFileMd5(String odmImageFileMd5) {
        this.odmImageFileMd5 = odmImageFileMd5;
    }
    /**
     * 
     */
    public String getVendorImageFileUrl() {
        return vendorImageFileUrl;
    }

    /**
     * 
     */
    public void setVendorImageFileUrl(String vendorImageFileUrl) {
        this.vendorImageFileUrl = vendorImageFileUrl;
    }
    /**
     * 
     */
    public String getVendorImageFileName() {
        return vendorImageFileName;
    }

    /**
     * 
     */
    public void setVendorImageFileName(String vendorImageFileName) {
        this.vendorImageFileName = vendorImageFileName;
    }
    /**
     * 
     */
    public String getVendorImageFileType() {
        return vendorImageFileType;
    }

    /**
     * 
     */
    public void setVendorImageFileType(String vendorImageFileType) {
        this.vendorImageFileType = vendorImageFileType;
    }
    /**
     * 
     */
    public String getVendorImageFileMd5() {
        return vendorImageFileMd5;
    }

    /**
     * 
     */
    public void setVendorImageFileMd5(String vendorImageFileMd5) {
        this.vendorImageFileMd5 = vendorImageFileMd5;
    }
    /**
     * 设备类型（3399，3288，3588，Ampere32，845，865）
     */
    public String getServerType() {
        return serverType;
    }

    /**
     * 设备类型（3399，3288，3588，Ampere32，845，865）
     */
    public void setServerType(String serverType) {
        this.serverType = serverType;
    }
    /**
     * 系统版本（android6.0，android8.1，，android10.0，android12.0）
     */
    public String getRomVersion() {
        return romVersion;
    }

    /**
     * 系统版本（android6.0，android8.1，，android10.0，android12.0）
     */
    public void setRomVersion(String romVersion) {
        this.romVersion = romVersion;
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
     * 镜像版本id
     */
    public String getImageVersionId() {
        return imageVersionId;
    }

    /**
     * 镜像版本id
     */
    public void setImageVersionId(String imageVersionId) {
        this.imageVersionId = imageVersionId;
    }
    /**
     * 镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）
     */
    public void setStatus(Integer status) {
        this.status = status;
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
    public static final String ID = "id";

    /**
     * 百度账号id
     */
    public static final String FK_BAIDU_ACCOUNT_ID = "fk_baidu_account_id";

    /**
     * 镜像名称
     */
    public static final String TITLE = "title";

    /**
     * 镜像版本
     */
    public static final String VERSION_CODE = "version_code";

    /**
     * 
     */
    public static final String ROOT_IMAGE_FILE_URL = "root_image_file_url";

    /**
     * 
     */
    public static final String ROOT_IMAGE_FILE_NAME = "root_image_file_name";

    /**
     * 
     */
    public static final String ROOT_IMAGE_FILE_TYPE = "root_image_file_type";

    /**
     * 
     */
    public static final String ROOT_IMAGE_FILE_MD5 = "root_image_file_md5";

    /**
     * 
     */
    public static final String SYSTEM_IMAGE_FILE_URL = "system_image_file_url";

    /**
     * 
     */
    public static final String SYSTEM_IMAGE_FILE_NAME = "system_image_file_name";

    /**
     * 
     */
    public static final String SYSTEM_IMAGE_FILE_TYPE = "system_image_file_type";

    /**
     * 
     */
    public static final String SYSTEM_IMAGE_FILE_MD5 = "system_image_file_md5";

    /**
     * 
     */
    public static final String ODM_IMAGE_FILE_URL = "odm_image_file_url";

    /**
     * 
     */
    public static final String ODM_IMAGE_FILE_NAME = "odm_image_file_name";

    /**
     * 
     */
    public static final String ODM_IMAGE_FILE_TYPE = "odm_image_file_type";

    /**
     * 
     */
    public static final String ODM_IMAGE_FILE_MD5 = "odm_image_file_md5";

    /**
     * 
     */
    public static final String VENDOR_IMAGE_FILE_URL = "vendor_image_file_url";

    /**
     * 
     */
    public static final String VENDOR_IMAGE_FILE_NAME = "vendor_image_file_name";

    /**
     * 
     */
    public static final String VENDOR_IMAGE_FILE_TYPE = "vendor_image_file_type";

    /**
     * 
     */
    public static final String VENDOR_IMAGE_FILE_MD5 = "vendor_image_file_md5";

    /**
     * 设备类型（3399，3288，3588，Ampere32，845，865）
     */
    public static final String SERVER_TYPE = "server_type";

    /**
     * 系统版本（android6.0，android8.1，，android10.0，android12.0）
     */
    public static final String ROM_VERSION = "rom_version";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 镜像版本id
     */
    public static final String IMAGE_VERSION_ID = "image_version_id";

    /**
     * 镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）
     */
    public static final String STATUS = "status";

    /**
     * 
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    @Override
    public String toString() {
        return "BaiduImages{" +
            "id=" + id +
            ", fkBaiduAccountId=" + fkBaiduAccountId +
            ", title=" + title +
            ", versionCode=" + versionCode +
            ", rootImageFileUrl=" + rootImageFileUrl +
            ", rootImageFileName=" + rootImageFileName +
            ", rootImageFileType=" + rootImageFileType +
            ", rootImageFileMd5=" + rootImageFileMd5 +
            ", systemImageFileUrl=" + systemImageFileUrl +
            ", systemImageFileName=" + systemImageFileName +
            ", systemImageFileType=" + systemImageFileType +
            ", systemImageFileMd5=" + systemImageFileMd5 +
            ", odmImageFileUrl=" + odmImageFileUrl +
            ", odmImageFileName=" + odmImageFileName +
            ", odmImageFileType=" + odmImageFileType +
            ", odmImageFileMd5=" + odmImageFileMd5 +
            ", vendorImageFileUrl=" + vendorImageFileUrl +
            ", vendorImageFileName=" + vendorImageFileName +
            ", vendorImageFileType=" + vendorImageFileType +
            ", vendorImageFileMd5=" + vendorImageFileMd5 +
            ", serverType=" + serverType +
            ", romVersion=" + romVersion +
            ", createTime=" + createTime +
            ", imageVersionId=" + imageVersionId +
            ", status=" + status +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }

    public BaiduImagesQueryEntityWrapper queryWrapper(){
        return BaiduImagesQueryEntityWrapper.wrapper(this);
    }

    public BaiduImagesUpdateEntityWrapper updateWrapper(){
        return BaiduImagesUpdateEntityWrapper.wrapper(this);
    }

    public static BaiduImagesQueryWrapper qWrapper(){
        return BaiduImagesQueryWrapper.wrapper();
    }

    public static BaiduImagesUpdateWrapper uWrapper(){
        return BaiduImagesUpdateWrapper.wrapper();
    }

}
