package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.McServiceSoftwarePackageUpdateWrapper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 云机端软件包表
 * </p>
 *
 * @author 18374
 * @since 2023-07-25
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_service_software_package")
@ApiModel(value = "McServiceSoftwarePackage对象", description = "云机端软件包表")
public class McServiceSoftwarePackage implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("软件包类型记录id")
    @TableField("fk_mc_service_software_package_type_id")
    private Long fkMcServiceSoftwarePackageTypeId;

    @ApiModelProperty("供应商类型（1：华为，2：腾讯，3：百度）")
    @TableField("supplier_type")
    private Integer supplierType;

    @ApiModelProperty("软件包名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("镜像id")
    @TableField("image_id")
    private String imageId;

    @ApiModelProperty("版本名称")
    @TableField("version")
    private String version;

    @ApiModelProperty("状态(-50：删除，50：正常)")
    @TableField("status")
    private Integer status;

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

    /**
     * 记录id自动增长
     */
    public Long getId() {
        return id;
    }

    /**
     * 记录id自动增长
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 软件包类型记录id
     */
    public Long getFkMcServiceSoftwarePackageTypeId() {
        return fkMcServiceSoftwarePackageTypeId;
    }

    /**
     * 软件包类型记录id
     */
    public void setFkMcServiceSoftwarePackageTypeId(Long fkMcServiceSoftwarePackageTypeId) {
        this.fkMcServiceSoftwarePackageTypeId = fkMcServiceSoftwarePackageTypeId;
    }
    /**
     * 供应商类型（1：华为，2：腾讯，3：百度）
     */
    public Integer getSupplierType() {
        return supplierType;
    }

    /**
     * 供应商类型（1：华为，2：腾讯，3：百度）
     */
    public void setSupplierType(Integer supplierType) {
        this.supplierType = supplierType;
    }
    /**
     * 软件包名称
     */
    public String getName() {
        return name;
    }

    /**
     * 软件包名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 版本名称
     */
    public String getVersion() {
        return version;
    }

    /**
     * 版本名称
     */
    public void setVersion(String version) {
        this.version = version;
    }
    /**
     * 状态(-50：删除，50：正常)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态(-50：删除，50：正常)
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 记录id自动增长
     */
    public static final String ID = "id";

    /**
     * 软件包类型记录id
     */
    public static final String FK_MC_SERVICE_SOFTWARE_PACKAGE_TYPE_ID = "fk_mc_service_software_package_type_id";

    /**
     * 供应商类型（1：华为，2：腾讯，3：百度）
     */
    public static final String SUPPLIER_TYPE = "supplier_type";

    /**
     * 软件包名称
     */
    public static final String NAME = "name";

    /**
     * 镜像id
     */
    public static final String IMAGE_ID = "image_id";

    /**
     * 版本名称
     */
    public static final String VERSION = "version";

    /**
     * 状态(-50：删除，50：正常)
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 最后修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    @Override
    public String toString() {
        return "McServiceSoftwarePackage{" +
            "id=" + id +
            ", fkMcServiceSoftwarePackageTypeId=" + fkMcServiceSoftwarePackageTypeId +
            ", supplierType=" + supplierType +
            ", name=" + name +
            ", imageId=" + imageId +
            ", version=" + version +
            ", status=" + status +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
        "}";
    }

    public McServiceSoftwarePackageQueryEntityWrapper queryWrapper(){
        return McServiceSoftwarePackageQueryEntityWrapper.wrapper(this);
    }

    public McServiceSoftwarePackageUpdateEntityWrapper updateWrapper(){
        return McServiceSoftwarePackageUpdateEntityWrapper.wrapper(this);
    }

    public static McServiceSoftwarePackageQueryWrapper qWrapper(){
        return McServiceSoftwarePackageQueryWrapper.wrapper();
    }

    public static McServiceSoftwarePackageUpdateWrapper uWrapper(){
        return McServiceSoftwarePackageUpdateWrapper.wrapper();
    }

}
