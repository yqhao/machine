package com.suqi.center.machine.api.viz.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 机器基础信息表
 * </p>
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "VizMcMachine对象", description = "机器基础信息表")
public class VizMcMachineParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id自动增长")
    private Long id;

    @ApiModelProperty("机房记录id")
    private Long fkExtCloudRegionId;

    @ApiModelProperty("机房名称【区域名称】")
    private String extCloudRegionName;

    @ApiModelProperty("内网ip地址")
    private String externalAddr;

    @ApiModelProperty("外网ip地址")
    private String internalAddr;

    @ApiModelProperty("设备唯一码")
    private String deviceId;

    @ApiModelProperty("实例Id")
    private String instanceId;

    @ApiModelProperty("设备唯一码macAddr")
    private String macAddr;

    @ApiModelProperty("云机端软件包版本")
    private String serviceSoftwarePackageVersion;

    @ApiModelProperty("设备型号")
    private String chipModel;

    @ApiModelProperty("系统版本")
    private String osVersion;

    @ApiModelProperty("销售状态(0：未售，1：已售)")
    private Integer salesStatus;

    @ApiModelProperty("3: 打开日志，127: 关闭日志")
    private Integer logLevel;

    @ApiModelProperty("日志包名")
    private String logPkg;

    @ApiModelProperty("供应商类型[1:huawei  2:tencent  3: baidu  4: etc]")
    private Integer supplierType;

    @ApiModelProperty("设备状态(-50：删除，0：暂停使用，50：正常)")
    private Integer status;

    @ApiModelProperty("版本id")
    private Long versionId;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty("最后修改时间")

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastUpdateTime;

    @ApiModelProperty("物理规格型号")
    private String specificationModel;

    @ApiModelProperty("内存配额，单位为MB")
    private Long memoryLimit;

    @ApiModelProperty("端口列表")
    List<VizMcMachineStreamsParam> vizMcMachineStreamsParams;


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


    public List<VizMcMachineStreamsParam> getVizMcMachineStreamsParams() {
        return vizMcMachineStreamsParams;
    }

    public void setVizMcMachineStreamsParams(List<VizMcMachineStreamsParam> vizMcMachineStreamsParams) {
        this.vizMcMachineStreamsParams = vizMcMachineStreamsParams;
    }

    public String getSpecificationModel() {
        return specificationModel;
    }

    public void setSpecificationModel(String specificationModel) {
        this.specificationModel = specificationModel;
    }

    public Long getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(Long memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":").append(id);
        sb.append(", \"fkExtCloudRegionId\":").append(fkExtCloudRegionId);
        sb.append(", \"extCloudRegionName\":\"").append(extCloudRegionName).append('\"');
        sb.append(", \"externalAddr\":\"").append(externalAddr).append('\"');
        sb.append(", \"internalAddr\":\"").append(internalAddr).append('\"');
        sb.append(", \"deviceId\":\"").append(deviceId).append('\"');
        sb.append(", \"instanceId\":\"").append(instanceId).append('\"');
        sb.append(", \"macAddr\":\"").append(macAddr).append('\"');
        sb.append(", \"serviceSoftwarePackageVersion\":\"").append(serviceSoftwarePackageVersion).append('\"');
        sb.append(", \"chipModel\":\"").append(chipModel).append('\"');
        sb.append(", \"osVersion\":\"").append(osVersion).append('\"');
        sb.append(", \"salesStatus\":").append(salesStatus);
        sb.append(", \"logLevel\":").append(logLevel);
        sb.append(", \"logPkg\":\"").append(logPkg).append('\"');
        sb.append(", \"supplierType\":").append(supplierType);
        sb.append(", \"status\":").append(status);
        sb.append(", \"versionId\":").append(versionId);
        sb.append(", \"createTime\":\"").append(createTime).append('\"');
        sb.append(", \"lastUpdateTime\":\"").append(lastUpdateTime).append('\"');
        sb.append(", \"specificationModel\":\"").append(specificationModel).append('\"');
        sb.append(", \"memoryLimit\":").append(memoryLimit);
        sb.append(", \"vizMcMachineStreamsParams\":").append(vizMcMachineStreamsParams);
        sb.append('}');
        return sb.toString();
    }


}
