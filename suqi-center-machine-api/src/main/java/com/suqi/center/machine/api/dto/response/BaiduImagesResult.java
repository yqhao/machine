package com.suqi.center.machine.api.dto.response;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 *
 * </p>
 *
 * @author PC001
 * @since 2023-08-25
 */
@ApiModel(value = "BaiduImages对象", description = "")
public class BaiduImagesResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @ApiModelProperty("百度账号id")
    private Long fkBaiduAccountId;

    @ApiModelProperty("镜像名称")
    private String title;

    @ApiModelProperty("镜像版本")
    private String versionCode;

    private String rootImageFileUrl;

    private String rootImageFileName;

    private String rootImageFileType;

    private String rootImageFileMd5;

    private String systemImageFileUrl;

    private String systemImageFileName;

    private String systemImageFileType;

    private String systemImageFileMd5;

    private String odmImageFileUrl;

    private String odmImageFileName;

    private String odmImageFileType;

    private String odmImageFileMd5;

    private String vendorImageFileUrl;

    private String vendorImageFileName;

    private String vendorImageFileType;

    private String vendorImageFileMd5;

    @ApiModelProperty("设备类型（3399，3288，3588，Ampere32，845，865）")
    private String serverType;

    @ApiModelProperty("系统版本（android6.0，android8.1，，android10.0，android12.0）")
    private String romVersion;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty("镜像版本id")
    private String imageVersionId;

    @ApiModelProperty("镜像制作状态（-50：删除，-40：超时，0：待制作，1：制作中，2：制作成功，3：制作失败）")
    private Integer status;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateTime;

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

    @Override
    public String toString() {
        return "BaiduImages{" + "id=" + id + ", fkBaiduAccountId=" + fkBaiduAccountId + ", title=" + title + ", versionCode=" + versionCode + ", rootImageFileUrl=" + rootImageFileUrl + ", rootImageFileName=" + rootImageFileName + ", rootImageFileType=" + rootImageFileType + ", rootImageFileMd5=" + rootImageFileMd5 + ", systemImageFileUrl=" + systemImageFileUrl + ", systemImageFileName=" + systemImageFileName + ", systemImageFileType=" + systemImageFileType + ", systemImageFileMd5=" + systemImageFileMd5 + ", odmImageFileUrl=" + odmImageFileUrl + ", odmImageFileName=" + odmImageFileName + ", odmImageFileType=" + odmImageFileType + ", odmImageFileMd5=" + odmImageFileMd5 + ", vendorImageFileUrl=" + vendorImageFileUrl + ", vendorImageFileName=" + vendorImageFileName + ", vendorImageFileType=" + vendorImageFileType + ", vendorImageFileMd5=" + vendorImageFileMd5 + ", serverType=" + serverType + ", romVersion=" + romVersion + ", createTime=" + createTime + ", imageVersionId=" + imageVersionId + ", status=" + status + ", lastUpdateTime=" + lastUpdateTime + "}";
    }
}
