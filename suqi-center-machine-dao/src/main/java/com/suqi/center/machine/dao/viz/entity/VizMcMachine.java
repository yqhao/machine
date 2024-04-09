package com.suqi.center.machine.dao.viz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineQueryEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineQueryWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineUpdateEntityWrapper;
import com.suqi.center.machine.dao.viz.wrapper.VizMcMachineUpdateWrapper;
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
 * 机器基础信息表
 * </p>
 *
 * @author 18374
 * @since 2023-11-28
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("viz_mc_machine")
@ApiModel(value = "VizMcMachine对象", description = "机器基础信息表")
public class VizMcMachine implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty("机房记录id")
    @TableField("fk_ext_cloud_region_id")
    private Long fkExtCloudRegionId;

    @ApiModelProperty("机房名称【区域名称】")
    @TableField("ext_cloud_region_name")
    private String extCloudRegionName;

    @ApiModelProperty("内网ip地址")
    @TableField("external_addr")
    private String externalAddr;

    @ApiModelProperty("外网ip地址")
    @TableField("internal_addr")
    private String internalAddr;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("实例Id")
    @TableField("instance_id")
    private String instanceId;

    @ApiModelProperty("设备唯一码macAddr")
    @TableField("mac_addr")
    private String macAddr;

    @ApiModelProperty("云机端软件包版本")
    @TableField("service_software_package_version")
    private String serviceSoftwarePackageVersion;

    @ApiModelProperty("设备型号")
    @TableField("chip_model")
    private String chipModel;

    @ApiModelProperty("系统版本")
    @TableField("os_version")
    private String osVersion;

    @ApiModelProperty("销售状态(0：未售，1：已售)")
    @TableField("sales_status")
    private Integer salesStatus;

    @ApiModelProperty("3: 打开日志，127: 关闭日志")
    @TableField("log_level")
    private Integer logLevel;

    @ApiModelProperty("日志包名")
    @TableField("log_pkg")
    private String logPkg;

    @ApiModelProperty("供应商类型[1:huawei  2:tencent  3: baidu  4: etc]")
    @TableField("supplier_type")
    private Integer supplierType;

    @ApiModelProperty("设备状态(-50：删除，0：暂停使用，50：正常)")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("版本id")
    @TableField("version_id")
    private Long versionId;

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

    @ApiModelProperty("物理规格型号")
    @TableField("specification_model")
    private String specificationModel;

    @ApiModelProperty("内存配额，单位为MB")
    @TableField("memory_limit")
    private Long memoryLimit;

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
     * 机房记录id
     */
    public Long getFkExtCloudRegionId() {
        return fkExtCloudRegionId;
    }

    /**
     * 机房记录id
     */
    public void setFkExtCloudRegionId(Long fkExtCloudRegionId) {
        this.fkExtCloudRegionId = fkExtCloudRegionId;
    }
    /**
     * 机房名称【区域名称】
     */
    public String getExtCloudRegionName() {
        return extCloudRegionName;
    }

    /**
     * 机房名称【区域名称】
     */
    public void setExtCloudRegionName(String extCloudRegionName) {
        this.extCloudRegionName = extCloudRegionName;
    }
    /**
     * 内网ip地址
     */
    public String getExternalAddr() {
        return externalAddr;
    }

    /**
     * 内网ip地址
     */
    public void setExternalAddr(String externalAddr) {
        this.externalAddr = externalAddr;
    }
    /**
     * 外网ip地址
     */
    public String getInternalAddr() {
        return internalAddr;
    }

    /**
     * 外网ip地址
     */
    public void setInternalAddr(String internalAddr) {
        this.internalAddr = internalAddr;
    }
    /**
     * 设备唯一码
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设备唯一码
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    /**
     * 实例Id
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 实例Id
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    /**
     * 设备唯一码macAddr
     */
    public String getMacAddr() {
        return macAddr;
    }

    /**
     * 设备唯一码macAddr
     */
    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }
    /**
     * 云机端软件包版本
     */
    public String getServiceSoftwarePackageVersion() {
        return serviceSoftwarePackageVersion;
    }

    /**
     * 云机端软件包版本
     */
    public void setServiceSoftwarePackageVersion(String serviceSoftwarePackageVersion) {
        this.serviceSoftwarePackageVersion = serviceSoftwarePackageVersion;
    }
    /**
     * 设备型号
     */
    public String getChipModel() {
        return chipModel;
    }

    /**
     * 设备型号
     */
    public void setChipModel(String chipModel) {
        this.chipModel = chipModel;
    }
    /**
     * 系统版本
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * 系统版本
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
    /**
     * 销售状态(0：未售，1：已售)
     */
    public Integer getSalesStatus() {
        return salesStatus;
    }

    /**
     * 销售状态(0：未售，1：已售)
     */
    public void setSalesStatus(Integer salesStatus) {
        this.salesStatus = salesStatus;
    }
    /**
     * 3: 打开日志，127: 关闭日志
     */
    public Integer getLogLevel() {
        return logLevel;
    }

    /**
     * 3: 打开日志，127: 关闭日志
     */
    public void setLogLevel(Integer logLevel) {
        this.logLevel = logLevel;
    }
    /**
     * 日志包名
     */
    public String getLogPkg() {
        return logPkg;
    }

    /**
     * 日志包名
     */
    public void setLogPkg(String logPkg) {
        this.logPkg = logPkg;
    }
    /**
     * 供应商类型[1:huawei  2:tencent  3: baidu  4: etc]
     */
    public Integer getSupplierType() {
        return supplierType;
    }

    /**
     * 供应商类型[1:huawei  2:tencent  3: baidu  4: etc]
     */
    public void setSupplierType(Integer supplierType) {
        this.supplierType = supplierType;
    }
    /**
     * 设备状态(-50：删除，0：暂停使用，50：正常)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设备状态(-50：删除，0：暂停使用，50：正常)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**
     * 版本id
     */
    public Long getVersionId() {
        return versionId;
    }

    /**
     * 版本id
     */
    public void setVersionId(Long versionId) {
        this.versionId = versionId;
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
     * 物理规格型号
     */
    public String getSpecificationModel() {
        return specificationModel;
    }

    /**
     * 物理规格型号
     */
    public void setSpecificationModel(String specificationModel) {
        this.specificationModel = specificationModel;
    }
    /**
     * 内存配额，单位为MB
     */
    public Long getMemoryLimit() {
        return memoryLimit;
    }

    /**
     * 内存配额，单位为MB
     */
    public void setMemoryLimit(Long memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    /**
     * 记录id自动增长
     */
    public static final String ID = "id";

    /**
     * 机房记录id
     */
    public static final String FK_EXT_CLOUD_REGION_ID = "fk_ext_cloud_region_id";

    /**
     * 机房名称【区域名称】
     */
    public static final String EXT_CLOUD_REGION_NAME = "ext_cloud_region_name";

    /**
     * 内网ip地址
     */
    public static final String EXTERNAL_ADDR = "external_addr";

    /**
     * 外网ip地址
     */
    public static final String INTERNAL_ADDR = "internal_addr";

    /**
     * 设备唯一码
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 实例Id
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 设备唯一码macAddr
     */
    public static final String MAC_ADDR = "mac_addr";

    /**
     * 云机端软件包版本
     */
    public static final String SERVICE_SOFTWARE_PACKAGE_VERSION = "service_software_package_version";

    /**
     * 设备型号
     */
    public static final String CHIP_MODEL = "chip_model";

    /**
     * 系统版本
     */
    public static final String OS_VERSION = "os_version";

    /**
     * 销售状态(0：未售，1：已售)
     */
    public static final String SALES_STATUS = "sales_status";

    /**
     * 3: 打开日志，127: 关闭日志
     */
    public static final String LOG_LEVEL = "log_level";

    /**
     * 日志包名
     */
    public static final String LOG_PKG = "log_pkg";

    /**
     * 供应商类型[1:huawei  2:tencent  3: baidu  4: etc]
     */
    public static final String SUPPLIER_TYPE = "supplier_type";

    /**
     * 设备状态(-50：删除，0：暂停使用，50：正常)
     */
    public static final String STATUS = "status";

    /**
     * 版本id
     */
    public static final String VERSION_ID = "version_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 最后修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 物理规格型号
     */
    public static final String SPECIFICATION_MODEL = "specification_model";

    /**
     * 内存配额，单位为MB
     */
    public static final String MEMORY_LIMIT = "memory_limit";

    @Override
    public String toString() {
        return "VizMcMachine{" +
            "id=" + id +
            ", fkExtCloudRegionId=" + fkExtCloudRegionId +
            ", extCloudRegionName=" + extCloudRegionName +
            ", externalAddr=" + externalAddr +
            ", internalAddr=" + internalAddr +
            ", deviceId=" + deviceId +
            ", instanceId=" + instanceId +
            ", macAddr=" + macAddr +
            ", serviceSoftwarePackageVersion=" + serviceSoftwarePackageVersion +
            ", chipModel=" + chipModel +
            ", osVersion=" + osVersion +
            ", salesStatus=" + salesStatus +
            ", logLevel=" + logLevel +
            ", logPkg=" + logPkg +
            ", supplierType=" + supplierType +
            ", status=" + status +
            ", versionId=" + versionId +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", specificationModel=" + specificationModel +
            ", memoryLimit=" + memoryLimit +
        "}";
    }

    public VizMcMachineQueryEntityWrapper queryWrapper(){
        return VizMcMachineQueryEntityWrapper.wrapper(this);
    }

    public VizMcMachineUpdateEntityWrapper updateWrapper(){
        return VizMcMachineUpdateEntityWrapper.wrapper(this);
    }

    public static VizMcMachineQueryWrapper qWrapper(){
        return VizMcMachineQueryWrapper.wrapper();
    }

    public static VizMcMachineUpdateWrapper uWrapper(){
        return VizMcMachineUpdateWrapper.wrapper();
    }

}
