package com.suqi.center.machine.api.dto.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 设备（em_soc_devices）
 * </p>
 *
 * @author PC001
 * @since 2023-08-16
 */
@ApiModel(value = "EmSocDevices对象", description = "设备（em_soc_devices）")
public class EmSocDevicesResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long fkPcpAreaId;
    @ApiModelProperty("设备唯一码")

    private String deviceId;
    @ApiModelProperty("移动终端的唯一标识")

    private String imei;
    @ApiModelProperty("国际移动用户识别码")

    private String imsi;
    @ApiModelProperty("macAddr")

    private String macAddr;
    @ApiModelProperty("internalAddr")

    private String internalAddr;
    @ApiModelProperty("externalAddr")

    private String externalAddr;
    @ApiModelProperty("省份ccode")

    private Long provinceCcode;
    @ApiModelProperty("省份名称")

    private String provinceName;
    @ApiModelProperty("城市ccode")

    private Long cityCcode;
    @ApiModelProperty("城市名称")

    private String cityName;
    @ApiModelProperty("地区ccode")

    private Long areaCcode;
    @ApiModelProperty("地区名称")

    private String areaName;
    @ApiModelProperty("地址地区名称详细（省市区街道名称以逗号分开）")

    private String regionName;
    @ApiModelProperty("location")

    private String location;
    @ApiModelProperty("cpu线程数")

    private Integer processors;
    @ApiModelProperty("修订版本号")

    private String buildId;
    @ApiModelProperty("build_radio")

    private String buildRadio;
    @ApiModelProperty("版本即最终用户可见的名称")

    private String buildModel;
    @ApiModelProperty("硬件制造商")

    private String buildManufacturer;
    @ApiModelProperty("build_bootloader")

    private String buildBootloader;
    @ApiModelProperty("主板")

    private String buildBoard;
    @ApiModelProperty("系统定制商")

    private String buildBrand;
    @ApiModelProperty("build_cpu_abi")

    private String buildCpuAbi;
    @ApiModelProperty("build_cpu_abi2")

    private String buildCpuAbi2;
    @ApiModelProperty("设备参数")

    private String buildDevice;
    @ApiModelProperty("显示屏参数")

    private String buildDisplay;
    @ApiModelProperty("唯一识别码")

    private String buildFingerprint;
    @ApiModelProperty("build_host")

    private String buildHost;
    @ApiModelProperty("整个产品的名称")

    private String buildProduct;
    @ApiModelProperty("硬件名称")

    private String buildHardware;
    @ApiModelProperty("硬件序列")

    private String buildSerial;
    @ApiModelProperty("cpu指令集")

    private String buildSupportedAbis;
    @ApiModelProperty("cpu指令集")

    private String buildSupported32BitAbis;
    @ApiModelProperty("cpu指令集")

    private String buildSupported64BitAbis;
    @ApiModelProperty("build_version_incremental")

    private String buildVersionIncremental;
    @ApiModelProperty("系统版本")

    private String buildVersionRelease;
    @ApiModelProperty("build_version_sdk")

    private String buildVersionSdk;
    @ApiModelProperty("SDK版本")

    private String buildVersionSdkint;
    @ApiModelProperty("build_version_codename")

    private String buildVersionCodename;
    @ApiModelProperty("build_type")

    private String buildType;
    @ApiModelProperty("build_api_level")

    private Integer buildApiLevel;
    @ApiModelProperty("Android系统第一次启动时产生的一个64bit数")

    private String andoridId;
    @ApiModelProperty("os_arch")

    private String osArch;
    @ApiModelProperty("手机的网络制式(GSM,CDMA)")

    private String phoneType;
    @ApiModelProperty("os_version")

    private String osVersion;
    @ApiModelProperty("SIM卡的序列号")

    private String simSerialNumber;
    @ApiModelProperty("SIM卡的运营商")

    private String networkOperator;
    @ApiModelProperty("SIM卡的运营商名称")

    private String networkOperatorName;
    @ApiModelProperty("UI mode")

    private String uimode;
    @ApiModelProperty("resolution")

    private String resolution;
    @ApiModelProperty("totalMem")

    private Long totalMem;
    @ApiModelProperty("availMem")

    private Long availMem;
    @ApiModelProperty("totalStorage")

    private Long totalStorage;
    @ApiModelProperty("availStorage")

    private Long availStorage;
    @ApiModelProperty("root_access(true:1；false:0)")

    private Integer rootAccess;
    @ApiModelProperty("经度")

    private BigDecimal lng;
    @ApiModelProperty("纬度")

    private BigDecimal lat;
    @ApiModelProperty("业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)")

    private Integer bizType;
    @ApiModelProperty("盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）")

    private Integer serverType;
    @ApiModelProperty("销售状态(0：未售，1：已售)")

    private Integer salesStatus;
    @ApiModelProperty("运行状态(0：空闲，1：运行中)")

    private Integer runningStatus;
    @ApiModelProperty("设备状态(-50：删除，0：暂停使用，50：正常)")

    private Integer status;
    @ApiModelProperty("健康状态(1：在线，0:故障)")

    private Integer healthStatus;
    @ApiModelProperty("托管状态(0：待托管/已解除托管，1:已托管（默认）)")

    private Integer trusteeshipStatus;
    @ApiModelProperty("是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）")

    private Integer planSwitchType;
    @ApiModelProperty("streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）")

    private Integer streamingStatus;
    @ApiModelProperty("维护模式状态（0：非维护模式，1：维护模式）")

    private Integer maintStatus;
    @ApiModelProperty("是否重置中（0：未重置，1：重置中，2：重启中）")

    private Integer isReseting;
    @ApiModelProperty("rom系统软件版本")

    private String romVersion;
    @ApiModelProperty("版本id")

    private Long versionId;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;
    @ApiModelProperty("盒子信息修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;
    @ApiModelProperty("是否在保存app用户数据(0：否，1：是)")

    private Integer isUserSave;
    @ApiModelProperty("3: 打开日志，127: 关闭日志")

    private Integer loglevel;

    private String logpkg;
    @ApiModelProperty("是升级中（0：未升级，1：升级中）")

    private Integer isOtaUpgrade;
    @ApiModelProperty("供应商类型[1:华为 2:腾讯]")

    private Integer supplierType;

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
     * 
     */
    public Long getFkPcpAreaId() {
        return fkPcpAreaId;
    }

    /**
     * 
     */
    public void setFkPcpAreaId(Long fkPcpAreaId) {
        this.fkPcpAreaId = fkPcpAreaId;
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
     * 移动终端的唯一标识
     */
    public String getImei() {
        return imei;
    }

    /**
     * 移动终端的唯一标识
     */
    public void setImei(String imei) {
        this.imei = imei;
    }
    /**
     * 国际移动用户识别码
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * 国际移动用户识别码
     */
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }
    /**
     * macAddr
     */
    public String getMacAddr() {
        return macAddr;
    }

    /**
     * macAddr
     */
    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }
    /**
     * internalAddr
     */
    public String getInternalAddr() {
        return internalAddr;
    }

    /**
     * internalAddr
     */
    public void setInternalAddr(String internalAddr) {
        this.internalAddr = internalAddr;
    }
    /**
     * externalAddr
     */
    public String getExternalAddr() {
        return externalAddr;
    }

    /**
     * externalAddr
     */
    public void setExternalAddr(String externalAddr) {
        this.externalAddr = externalAddr;
    }
    /**
     * 省份ccode
     */
    public Long getProvinceCcode() {
        return provinceCcode;
    }

    /**
     * 省份ccode
     */
    public void setProvinceCcode(Long provinceCcode) {
        this.provinceCcode = provinceCcode;
    }
    /**
     * 省份名称
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 省份名称
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    /**
     * 城市ccode
     */
    public Long getCityCcode() {
        return cityCcode;
    }

    /**
     * 城市ccode
     */
    public void setCityCcode(Long cityCcode) {
        this.cityCcode = cityCcode;
    }
    /**
     * 城市名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 城市名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    /**
     * 地区ccode
     */
    public Long getAreaCcode() {
        return areaCcode;
    }

    /**
     * 地区ccode
     */
    public void setAreaCcode(Long areaCcode) {
        this.areaCcode = areaCcode;
    }
    /**
     * 地区名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 地区名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
    /**
     * 地址地区名称详细（省市区街道名称以逗号分开）
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * 地址地区名称详细（省市区街道名称以逗号分开）
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    /**
     * location
     */
    public String getLocation() {
        return location;
    }

    /**
     * location
     */
    public void setLocation(String location) {
        this.location = location;
    }
    /**
     * cpu线程数
     */
    public Integer getProcessors() {
        return processors;
    }

    /**
     * cpu线程数
     */
    public void setProcessors(Integer processors) {
        this.processors = processors;
    }
    /**
     * 修订版本号
     */
    public String getBuildId() {
        return buildId;
    }

    /**
     * 修订版本号
     */
    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }
    /**
     * build_radio
     */
    public String getBuildRadio() {
        return buildRadio;
    }

    /**
     * build_radio
     */
    public void setBuildRadio(String buildRadio) {
        this.buildRadio = buildRadio;
    }
    /**
     * 版本即最终用户可见的名称
     */
    public String getBuildModel() {
        return buildModel;
    }

    /**
     * 版本即最终用户可见的名称
     */
    public void setBuildModel(String buildModel) {
        this.buildModel = buildModel;
    }
    /**
     * 硬件制造商
     */
    public String getBuildManufacturer() {
        return buildManufacturer;
    }

    /**
     * 硬件制造商
     */
    public void setBuildManufacturer(String buildManufacturer) {
        this.buildManufacturer = buildManufacturer;
    }
    /**
     * build_bootloader
     */
    public String getBuildBootloader() {
        return buildBootloader;
    }

    /**
     * build_bootloader
     */
    public void setBuildBootloader(String buildBootloader) {
        this.buildBootloader = buildBootloader;
    }
    /**
     * 主板
     */
    public String getBuildBoard() {
        return buildBoard;
    }

    /**
     * 主板
     */
    public void setBuildBoard(String buildBoard) {
        this.buildBoard = buildBoard;
    }
    /**
     * 系统定制商
     */
    public String getBuildBrand() {
        return buildBrand;
    }

    /**
     * 系统定制商
     */
    public void setBuildBrand(String buildBrand) {
        this.buildBrand = buildBrand;
    }
    /**
     * build_cpu_abi
     */
    public String getBuildCpuAbi() {
        return buildCpuAbi;
    }

    /**
     * build_cpu_abi
     */
    public void setBuildCpuAbi(String buildCpuAbi) {
        this.buildCpuAbi = buildCpuAbi;
    }
    /**
     * build_cpu_abi2
     */
    public String getBuildCpuAbi2() {
        return buildCpuAbi2;
    }

    /**
     * build_cpu_abi2
     */
    public void setBuildCpuAbi2(String buildCpuAbi2) {
        this.buildCpuAbi2 = buildCpuAbi2;
    }
    /**
     * 设备参数
     */
    public String getBuildDevice() {
        return buildDevice;
    }

    /**
     * 设备参数
     */
    public void setBuildDevice(String buildDevice) {
        this.buildDevice = buildDevice;
    }
    /**
     * 显示屏参数
     */
    public String getBuildDisplay() {
        return buildDisplay;
    }

    /**
     * 显示屏参数
     */
    public void setBuildDisplay(String buildDisplay) {
        this.buildDisplay = buildDisplay;
    }
    /**
     * 唯一识别码
     */
    public String getBuildFingerprint() {
        return buildFingerprint;
    }

    /**
     * 唯一识别码
     */
    public void setBuildFingerprint(String buildFingerprint) {
        this.buildFingerprint = buildFingerprint;
    }
    /**
     * build_host
     */
    public String getBuildHost() {
        return buildHost;
    }

    /**
     * build_host
     */
    public void setBuildHost(String buildHost) {
        this.buildHost = buildHost;
    }
    /**
     * 整个产品的名称
     */
    public String getBuildProduct() {
        return buildProduct;
    }

    /**
     * 整个产品的名称
     */
    public void setBuildProduct(String buildProduct) {
        this.buildProduct = buildProduct;
    }
    /**
     * 硬件名称
     */
    public String getBuildHardware() {
        return buildHardware;
    }

    /**
     * 硬件名称
     */
    public void setBuildHardware(String buildHardware) {
        this.buildHardware = buildHardware;
    }
    /**
     * 硬件序列
     */
    public String getBuildSerial() {
        return buildSerial;
    }

    /**
     * 硬件序列
     */
    public void setBuildSerial(String buildSerial) {
        this.buildSerial = buildSerial;
    }
    /**
     * cpu指令集
     */
    public String getBuildSupportedAbis() {
        return buildSupportedAbis;
    }

    /**
     * cpu指令集
     */
    public void setBuildSupportedAbis(String buildSupportedAbis) {
        this.buildSupportedAbis = buildSupportedAbis;
    }
    /**
     * cpu指令集
     */
    public String getBuildSupported32BitAbis() {
        return buildSupported32BitAbis;
    }

    /**
     * cpu指令集
     */
    public void setBuildSupported32BitAbis(String buildSupported32BitAbis) {
        this.buildSupported32BitAbis = buildSupported32BitAbis;
    }
    /**
     * cpu指令集
     */
    public String getBuildSupported64BitAbis() {
        return buildSupported64BitAbis;
    }

    /**
     * cpu指令集
     */
    public void setBuildSupported64BitAbis(String buildSupported64BitAbis) {
        this.buildSupported64BitAbis = buildSupported64BitAbis;
    }
    /**
     * build_version_incremental
     */
    public String getBuildVersionIncremental() {
        return buildVersionIncremental;
    }

    /**
     * build_version_incremental
     */
    public void setBuildVersionIncremental(String buildVersionIncremental) {
        this.buildVersionIncremental = buildVersionIncremental;
    }
    /**
     * 系统版本
     */
    public String getBuildVersionRelease() {
        return buildVersionRelease;
    }

    /**
     * 系统版本
     */
    public void setBuildVersionRelease(String buildVersionRelease) {
        this.buildVersionRelease = buildVersionRelease;
    }
    /**
     * build_version_sdk
     */
    public String getBuildVersionSdk() {
        return buildVersionSdk;
    }

    /**
     * build_version_sdk
     */
    public void setBuildVersionSdk(String buildVersionSdk) {
        this.buildVersionSdk = buildVersionSdk;
    }
    /**
     * SDK版本
     */
    public String getBuildVersionSdkint() {
        return buildVersionSdkint;
    }

    /**
     * SDK版本
     */
    public void setBuildVersionSdkint(String buildVersionSdkint) {
        this.buildVersionSdkint = buildVersionSdkint;
    }
    /**
     * build_version_codename
     */
    public String getBuildVersionCodename() {
        return buildVersionCodename;
    }

    /**
     * build_version_codename
     */
    public void setBuildVersionCodename(String buildVersionCodename) {
        this.buildVersionCodename = buildVersionCodename;
    }
    /**
     * build_type
     */
    public String getBuildType() {
        return buildType;
    }

    /**
     * build_type
     */
    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }
    /**
     * build_api_level
     */
    public Integer getBuildApiLevel() {
        return buildApiLevel;
    }

    /**
     * build_api_level
     */
    public void setBuildApiLevel(Integer buildApiLevel) {
        this.buildApiLevel = buildApiLevel;
    }
    /**
     * Android系统第一次启动时产生的一个64bit数
     */
    public String getAndoridId() {
        return andoridId;
    }

    /**
     * Android系统第一次启动时产生的一个64bit数
     */
    public void setAndoridId(String andoridId) {
        this.andoridId = andoridId;
    }
    /**
     * os_arch
     */
    public String getOsArch() {
        return osArch;
    }

    /**
     * os_arch
     */
    public void setOsArch(String osArch) {
        this.osArch = osArch;
    }
    /**
     * 手机的网络制式(GSM,CDMA)
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * 手机的网络制式(GSM,CDMA)
     */
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }
    /**
     * os_version
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * os_version
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
    /**
     * SIM卡的序列号
     */
    public String getSimSerialNumber() {
        return simSerialNumber;
    }

    /**
     * SIM卡的序列号
     */
    public void setSimSerialNumber(String simSerialNumber) {
        this.simSerialNumber = simSerialNumber;
    }
    /**
     * SIM卡的运营商
     */
    public String getNetworkOperator() {
        return networkOperator;
    }

    /**
     * SIM卡的运营商
     */
    public void setNetworkOperator(String networkOperator) {
        this.networkOperator = networkOperator;
    }
    /**
     * SIM卡的运营商名称
     */
    public String getNetworkOperatorName() {
        return networkOperatorName;
    }

    /**
     * SIM卡的运营商名称
     */
    public void setNetworkOperatorName(String networkOperatorName) {
        this.networkOperatorName = networkOperatorName;
    }
    /**
     * UI mode
     */
    public String getUimode() {
        return uimode;
    }

    /**
     * UI mode
     */
    public void setUimode(String uimode) {
        this.uimode = uimode;
    }
    /**
     * resolution
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * resolution
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    /**
     * totalMem
     */
    public Long getTotalMem() {
        return totalMem;
    }

    /**
     * totalMem
     */
    public void setTotalMem(Long totalMem) {
        this.totalMem = totalMem;
    }
    /**
     * availMem
     */
    public Long getAvailMem() {
        return availMem;
    }

    /**
     * availMem
     */
    public void setAvailMem(Long availMem) {
        this.availMem = availMem;
    }
    /**
     * totalStorage
     */
    public Long getTotalStorage() {
        return totalStorage;
    }

    /**
     * totalStorage
     */
    public void setTotalStorage(Long totalStorage) {
        this.totalStorage = totalStorage;
    }
    /**
     * availStorage
     */
    public Long getAvailStorage() {
        return availStorage;
    }

    /**
     * availStorage
     */
    public void setAvailStorage(Long availStorage) {
        this.availStorage = availStorage;
    }
    /**
     * root_access(true:1；false:0)
     */
    public Integer getRootAccess() {
        return rootAccess;
    }

    /**
     * root_access(true:1；false:0)
     */
    public void setRootAccess(Integer rootAccess) {
        this.rootAccess = rootAccess;
    }
    /**
     * 经度
     */
    public BigDecimal getLng() {
        return lng;
    }

    /**
     * 经度
     */
    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }
    /**
     * 纬度
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * 纬度
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }
    /**
     * 业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)
     */
    public Integer getBizType() {
        return bizType;
    }

    /**
     * 业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)
     */
    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }
    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）
     */
    public Integer getServerType() {
        return serverType;
    }

    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）
     */
    public void setServerType(Integer serverType) {
        this.serverType = serverType;
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
     * 运行状态(0：空闲，1：运行中)
     */
    public Integer getRunningStatus() {
        return runningStatus;
    }

    /**
     * 运行状态(0：空闲，1：运行中)
     */
    public void setRunningStatus(Integer runningStatus) {
        this.runningStatus = runningStatus;
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
     * 健康状态(1：在线，0:故障)
     */
    public Integer getHealthStatus() {
        return healthStatus;
    }

    /**
     * 健康状态(1：在线，0:故障)
     */
    public void setHealthStatus(Integer healthStatus) {
        this.healthStatus = healthStatus;
    }
    /**
     * 托管状态(0：待托管/已解除托管，1:已托管（默认）)
     */
    public Integer getTrusteeshipStatus() {
        return trusteeshipStatus;
    }

    /**
     * 托管状态(0：待托管/已解除托管，1:已托管（默认）)
     */
    public void setTrusteeshipStatus(Integer trusteeshipStatus) {
        this.trusteeshipStatus = trusteeshipStatus;
    }
    /**
     * 是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）
     */
    public Integer getPlanSwitchType() {
        return planSwitchType;
    }

    /**
     * 是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）
     */
    public void setPlanSwitchType(Integer planSwitchType) {
        this.planSwitchType = planSwitchType;
    }
    /**
     * streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）
     */
    public Integer getStreamingStatus() {
        return streamingStatus;
    }

    /**
     * streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）
     */
    public void setStreamingStatus(Integer streamingStatus) {
        this.streamingStatus = streamingStatus;
    }
    /**
     * 维护模式状态（0：非维护模式，1：维护模式）
     */
    public Integer getMaintStatus() {
        return maintStatus;
    }

    /**
     * 维护模式状态（0：非维护模式，1：维护模式）
     */
    public void setMaintStatus(Integer maintStatus) {
        this.maintStatus = maintStatus;
    }
    /**
     * 是否重置中（0：未重置，1：重置中，2：重启中）
     */
    public Integer getIsReseting() {
        return isReseting;
    }

    /**
     * 是否重置中（0：未重置，1：重置中，2：重启中）
     */
    public void setIsReseting(Integer isReseting) {
        this.isReseting = isReseting;
    }
    /**
     * rom系统软件版本
     */
    public String getRomVersion() {
        return romVersion;
    }

    /**
     * rom系统软件版本
     */
    public void setRomVersion(String romVersion) {
        this.romVersion = romVersion;
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
     * 盒子信息修改时间
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * 盒子信息修改时间
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    /**
     * 是否在保存app用户数据(0：否，1：是)
     */
    public Integer getIsUserSave() {
        return isUserSave;
    }

    /**
     * 是否在保存app用户数据(0：否，1：是)
     */
    public void setIsUserSave(Integer isUserSave) {
        this.isUserSave = isUserSave;
    }
    /**
     * 3: 打开日志，127: 关闭日志
     */
    public Integer getLoglevel() {
        return loglevel;
    }

    /**
     * 3: 打开日志，127: 关闭日志
     */
    public void setLoglevel(Integer loglevel) {
        this.loglevel = loglevel;
    }
    /**
     * 
     */
    public String getLogpkg() {
        return logpkg;
    }

    /**
     * 
     */
    public void setLogpkg(String logpkg) {
        this.logpkg = logpkg;
    }
    /**
     * 是升级中（0：未升级，1：升级中）
     */
    public Integer getIsOtaUpgrade() {
        return isOtaUpgrade;
    }

    /**
     * 是升级中（0：未升级，1：升级中）
     */
    public void setIsOtaUpgrade(Integer isOtaUpgrade) {
        this.isOtaUpgrade = isOtaUpgrade;
    }
    /**
     * 供应商类型[1:华为 2:腾讯]
     */
    public Integer getSupplierType() {
        return supplierType;
    }

    /**
     * 供应商类型[1:华为 2:腾讯]
     */
    public void setSupplierType(Integer supplierType) {
        this.supplierType = supplierType;
    }

    @Override
    public String toString() {
        return "EmSocDevices{" +
            "id=" + id +
            ", fkPcpAreaId=" + fkPcpAreaId +
            ", deviceId=" + deviceId +
            ", imei=" + imei +
            ", imsi=" + imsi +
            ", macAddr=" + macAddr +
            ", internalAddr=" + internalAddr +
            ", externalAddr=" + externalAddr +
            ", provinceCcode=" + provinceCcode +
            ", provinceName=" + provinceName +
            ", cityCcode=" + cityCcode +
            ", cityName=" + cityName +
            ", areaCcode=" + areaCcode +
            ", areaName=" + areaName +
            ", regionName=" + regionName +
            ", location=" + location +
            ", processors=" + processors +
            ", buildId=" + buildId +
            ", buildRadio=" + buildRadio +
            ", buildModel=" + buildModel +
            ", buildManufacturer=" + buildManufacturer +
            ", buildBootloader=" + buildBootloader +
            ", buildBoard=" + buildBoard +
            ", buildBrand=" + buildBrand +
            ", buildCpuAbi=" + buildCpuAbi +
            ", buildCpuAbi2=" + buildCpuAbi2 +
            ", buildDevice=" + buildDevice +
            ", buildDisplay=" + buildDisplay +
            ", buildFingerprint=" + buildFingerprint +
            ", buildHost=" + buildHost +
            ", buildProduct=" + buildProduct +
            ", buildHardware=" + buildHardware +
            ", buildSerial=" + buildSerial +
            ", buildSupportedAbis=" + buildSupportedAbis +
            ", buildSupported32BitAbis=" + buildSupported32BitAbis +
            ", buildSupported64BitAbis=" + buildSupported64BitAbis +
            ", buildVersionIncremental=" + buildVersionIncremental +
            ", buildVersionRelease=" + buildVersionRelease +
            ", buildVersionSdk=" + buildVersionSdk +
            ", buildVersionSdkint=" + buildVersionSdkint +
            ", buildVersionCodename=" + buildVersionCodename +
            ", buildType=" + buildType +
            ", buildApiLevel=" + buildApiLevel +
            ", andoridId=" + andoridId +
            ", osArch=" + osArch +
            ", phoneType=" + phoneType +
            ", osVersion=" + osVersion +
            ", simSerialNumber=" + simSerialNumber +
            ", networkOperator=" + networkOperator +
            ", networkOperatorName=" + networkOperatorName +
            ", uimode=" + uimode +
            ", resolution=" + resolution +
            ", totalMem=" + totalMem +
            ", availMem=" + availMem +
            ", totalStorage=" + totalStorage +
            ", availStorage=" + availStorage +
            ", rootAccess=" + rootAccess +
            ", lng=" + lng +
            ", lat=" + lat +
            ", bizType=" + bizType +
            ", serverType=" + serverType +
            ", salesStatus=" + salesStatus +
            ", runningStatus=" + runningStatus +
            ", status=" + status +
            ", healthStatus=" + healthStatus +
            ", trusteeshipStatus=" + trusteeshipStatus +
            ", planSwitchType=" + planSwitchType +
            ", streamingStatus=" + streamingStatus +
            ", maintStatus=" + maintStatus +
            ", isReseting=" + isReseting +
            ", romVersion=" + romVersion +
            ", versionId=" + versionId +
            ", createTime=" + createTime +
            ", lastUpdateTime=" + lastUpdateTime +
            ", isUserSave=" + isUserSave +
            ", loglevel=" + loglevel +
            ", logpkg=" + logpkg +
            ", isOtaUpgrade=" + isOtaUpgrade +
            ", supplierType=" + supplierType +
        "}";
    }



}
