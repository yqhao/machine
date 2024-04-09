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
 *
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@ApiModel(value = "BaiduImages对象", description = "")
public class BaiduImagesParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull(groups = ValidationGroups.Update.class, message = "id 不能为null")
    private Long id;

    @ApiModelProperty("百度账号id")
    @NotNull(groups = ValidationGroups.Insert.class, message = "百度账号id不能为null")
    private Long fkBaiduAccountId;

    @ApiModelProperty("镜像名称")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "镜像名称不能为空")
    private String title;

    @ApiModelProperty("镜像版本")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "镜像版本不能为空")
    private String versionCode;

    @ApiModelProperty("root镜像文件下载地，文件下载url最大长度1000")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "root镜像下载地址不能为空")
    private String rootImageFileUrl;

    @ApiModelProperty("root镜像文件名。文件名字最大长度100\n" + "文件后缀名必须为img\n" + "文件名字前缀匹配与镜像类型\n" + "关联，镜像类型为root_aosp\n" + "的文件必须以root_aosp开\n" + "头，例如：\n" + "root_aosp12345678.img，其\n" + "他类型镜像规则同上")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "文件名称（带后缀）不能为空")
    private String rootImageFileName;

    @ApiModelProperty("root镜像类型：root_aosp")
    private String rootImageFileType;

    @ApiModelProperty("root镜像文件MD5")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "root镜像文件MD5不能为空")
    private String rootImageFileMd5;

    @ApiModelProperty("system镜像文件下载地，文件下载url最大长度1000")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "system镜像下载地址不能为空")
    private String systemImageFileUrl;

    @ApiModelProperty("system镜像文件名，文件名字最大长度100\n" + "文件后缀名必须为img\n" + "文件名字前缀匹配与镜像类型\n" + "关联，镜像类型为system_aosp\n" + "的文件必须以system_aosp开\n" + "头，例如：\n" + "system_aosp12345678.img，其\n" + "他类型镜像规则同上")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "文件名称（带后缀）不能为空")
    private String systemImageFileName;

    @ApiModelProperty("镜像类型：system_aosp")
    private String systemImageFileType;

    @ApiModelProperty("system镜像文件MD5")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "system镜像文件MD5不能为空")
    private String systemImageFileMd5;

    @ApiModelProperty("odm镜像文件下载地，文件下载url最大长度1000")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "odm镜像下载地址不能为空")
    private String odmImageFileUrl;

    @ApiModelProperty("odm镜像文件名，文件名字最大长度100\n" + "文件后缀名必须为img\n" + "文件名字前缀匹配与镜像类型\n" + "关联，镜像类型为odm_aosp\n" + "的文件必须以odm_aosp开\n" + "头，例如：\n" + "odm_aosp12345678.img，其\n" + "他类型镜像规则同上")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "文件名称（带后缀）不能为空")
    private String odmImageFileName;

    @ApiModelProperty("镜像类型：odm_aosp")
    private String odmImageFileType;

    @ApiModelProperty("odm镜像文件MD5")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "odm镜像文件MD5不能为空")
    private String odmImageFileMd5;

    @ApiModelProperty("vendor镜像文件下载地，文件下载url最大长度1000")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "vendor镜像下载地址不能为空")
    private String vendorImageFileUrl;

    @ApiModelProperty("vendor镜像文件名，文件名字最大长度100\n" + "文件后缀名必须为img\n" + "文件名字前缀匹配与镜像类型\n" + "关联，镜像类型为vendor_aosp\n" + "的文件必须以vendor_aosp开\n" + "头，例如：\n" + "vendor_aosp12345678.img，其\n" + "他类型镜像规则同上")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "文件名称（带后缀）不能为空")
    private String vendorImageFileName;

    @ApiModelProperty("镜像类型：vendor_aosp")
    private String vendorImageFileType;

    @ApiModelProperty("vendor镜像文件MD5")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "vendor镜像文件MD5不能为空")
    private String vendorImageFileMd5;

    @ApiModelProperty("设备类型（3399，3288，3588，Ampere32，845，865）")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "设备类型不能为空")
    private String serverType;

    @ApiModelProperty("系统版本（android6.0，android8.1，，android10.0，android12.0）")
    @NotEmpty(groups = ValidationGroups.Insert.class, message = "系统版本不能为空")
    private String romVersion;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndCreateTime;

    @ApiModelProperty("镜像版本id")
    private String imageVersionId;

    @ApiModelProperty("镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）")
    private Integer status;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date queryEndLastUpdateTime;

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
     */
    public String getRootImageFileUrl() {
        return rootImageFileUrl;
    }

    /**
     */
    public void setRootImageFileUrl(String rootImageFileUrl) {
        this.rootImageFileUrl = rootImageFileUrl;
    }

    /**
     */
    public String getRootImageFileName() {
        return rootImageFileName;
    }

    /**
     */
    public void setRootImageFileName(String rootImageFileName) {
        this.rootImageFileName = rootImageFileName;
    }

    /**
     */
    public String getRootImageFileType() {
        return rootImageFileType;
    }

    /**
     */
    public void setRootImageFileType(String rootImageFileType) {
        this.rootImageFileType = rootImageFileType;
    }

    /**
     */
    public String getRootImageFileMd5() {
        return rootImageFileMd5;
    }

    /**
     */
    public void setRootImageFileMd5(String rootImageFileMd5) {
        this.rootImageFileMd5 = rootImageFileMd5;
    }

    /**
     */
    public String getSystemImageFileUrl() {
        return systemImageFileUrl;
    }

    /**
     */
    public void setSystemImageFileUrl(String systemImageFileUrl) {
        this.systemImageFileUrl = systemImageFileUrl;
    }

    /**
     */
    public String getSystemImageFileName() {
        return systemImageFileName;
    }

    /**
     */
    public void setSystemImageFileName(String systemImageFileName) {
        this.systemImageFileName = systemImageFileName;
    }

    /**
     */
    public String getSystemImageFileType() {
        return systemImageFileType;
    }

    /**
     */
    public void setSystemImageFileType(String systemImageFileType) {
        this.systemImageFileType = systemImageFileType;
    }

    /**
     */
    public String getSystemImageFileMd5() {
        return systemImageFileMd5;
    }

    /**
     */
    public void setSystemImageFileMd5(String systemImageFileMd5) {
        this.systemImageFileMd5 = systemImageFileMd5;
    }

    /**
     */
    public String getOdmImageFileUrl() {
        return odmImageFileUrl;
    }

    /**
     */
    public void setOdmImageFileUrl(String odmImageFileUrl) {
        this.odmImageFileUrl = odmImageFileUrl;
    }

    /**
     */
    public String getOdmImageFileName() {
        return odmImageFileName;
    }

    /**
     */
    public void setOdmImageFileName(String odmImageFileName) {
        this.odmImageFileName = odmImageFileName;
    }

    /**
     */
    public String getOdmImageFileType() {
        return odmImageFileType;
    }

    /**
     */
    public void setOdmImageFileType(String odmImageFileType) {
        this.odmImageFileType = odmImageFileType;
    }

    /**
     */
    public String getOdmImageFileMd5() {
        return odmImageFileMd5;
    }

    /**
     */
    public void setOdmImageFileMd5(String odmImageFileMd5) {
        this.odmImageFileMd5 = odmImageFileMd5;
    }

    /**
     */
    public String getVendorImageFileUrl() {
        return vendorImageFileUrl;
    }

    /**
     */
    public void setVendorImageFileUrl(String vendorImageFileUrl) {
        this.vendorImageFileUrl = vendorImageFileUrl;
    }

    /**
     */
    public String getVendorImageFileName() {
        return vendorImageFileName;
    }

    /**
     */
    public void setVendorImageFileName(String vendorImageFileName) {
        this.vendorImageFileName = vendorImageFileName;
    }

    /**
     */
    public String getVendorImageFileType() {
        return vendorImageFileType;
    }

    /**
     */
    public void setVendorImageFileType(String vendorImageFileType) {
        this.vendorImageFileType = vendorImageFileType;
    }

    /**
     */
    public String getVendorImageFileMd5() {
        return vendorImageFileMd5;
    }

    /**
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
     * 创建时间
     */
    public Date getQueryEndCreateTime() {
        return queryEndCreateTime;
    }

    /**
     * 创建时间
     */
    public void setQueryEndCreateTime(Date queryEndCreateTime) {
        this.queryEndCreateTime = queryEndCreateTime;
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
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     */
    public Date getQueryEndLastUpdateTime() {
        return queryEndLastUpdateTime;
    }

    /**
     */
    public void setQueryEndLastUpdateTime(Date queryEndLastUpdateTime) {
        this.queryEndLastUpdateTime = queryEndLastUpdateTime;
    }

    @Override
    public String toString() {
        return "BaiduImages{" + "id=" + id + ", fkBaiduAccountId=" + fkBaiduAccountId + ", title=" + title + ", versionCode=" + versionCode + ", rootImageFileUrl=" + rootImageFileUrl + ", rootImageFileName=" + rootImageFileName + ", rootImageFileType=" + rootImageFileType + ", rootImageFileMd5=" + rootImageFileMd5 + ", systemImageFileUrl=" + systemImageFileUrl + ", systemImageFileName=" + systemImageFileName + ", systemImageFileType=" + systemImageFileType + ", systemImageFileMd5=" + systemImageFileMd5 + ", odmImageFileUrl=" + odmImageFileUrl + ", odmImageFileName=" + odmImageFileName + ", odmImageFileType=" + odmImageFileType + ", odmImageFileMd5=" + odmImageFileMd5 + ", vendorImageFileUrl=" + vendorImageFileUrl + ", vendorImageFileName=" + vendorImageFileName + ", vendorImageFileType=" + vendorImageFileType + ", vendorImageFileMd5=" + vendorImageFileMd5 + ", serverType=" + serverType + ", romVersion=" + romVersion + ", createTime=" + createTime + ", imageVersionId=" + imageVersionId + ", status=" + status + ", lastUpdateTime=" + lastUpdateTime + "}";
    }
}
