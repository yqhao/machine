package com.suqi.center.machine.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.suqi.center.machine.dao.wrapper.EmSocDevicesQueryEntityWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDevicesQueryWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDevicesUpdateEntityWrapper;
import com.suqi.center.machine.dao.wrapper.EmSocDevicesUpdateWrapper;
import java.io.Serializable;
import java.math.BigDecimal;
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
 * 设备（em_soc_devices）
 * </p>
 *
 * @author PC001
 * @since 2023-08-28
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("em_soc_devices")
@ApiModel(value = "EmSocDevices对象", description = "设备（em_soc_devices）")
public class EmSocDevices implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("fk_pcp_area_id")
    private Long fkPcpAreaId;

    @ApiModelProperty("设备唯一码")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("移动终端的唯一标识")
    @TableField("imei")
    private String imei;

    @ApiModelProperty("国际移动用户识别码")
    @TableField("imsi")
    private String imsi;

    @ApiModelProperty("macAddr")
    @TableField("mac_addr")
    private String macAddr;

    @ApiModelProperty("internalAddr")
    @TableField("internal_addr")
    private String internalAddr;

    @ApiModelProperty("externalAddr")
    @TableField("external_addr")
    private String externalAddr;

    @ApiModelProperty("省份ccode")
    @TableField("province_ccode")
    private Long provinceCcode;

    @ApiModelProperty("省份名称")
    @TableField("province_name")
    private String provinceName;

    @ApiModelProperty("城市ccode")
    @TableField("city_ccode")
    private Long cityCcode;

    @ApiModelProperty("城市名称")
    @TableField("city_name")
    private String cityName;

    @ApiModelProperty("地区ccode")
    @TableField("area_ccode")
    private Long areaCcode;

    @ApiModelProperty("地区名称")
    @TableField("area_name")
    private String areaName;

    @ApiModelProperty("地址地区名称详细（省市区街道名称以逗号分开）")
    @TableField("region_name")
    private String regionName;

    @ApiModelProperty("location")
    @TableField("location")
    private String location;

    @ApiModelProperty("cpu线程数")
    @TableField("processors")
    private Integer processors;

    @ApiModelProperty("修订版本号")
    @TableField("build_id")
    private String buildId;

    @ApiModelProperty("build_radio")
    @TableField("build_radio")
    private String buildRadio;

    @ApiModelProperty("版本即最终用户可见的名称")
    @TableField("build_model")
    private String buildModel;

    @ApiModelProperty("硬件制造商")
    @TableField("build_manufacturer")
    private String buildManufacturer;

    @ApiModelProperty("build_bootloader")
    @TableField("build_bootloader")
    private String buildBootloader;

    @ApiModelProperty("主板")
    @TableField("build_board")
    private String buildBoard;

    @ApiModelProperty("系统定制商")
    @TableField("build_brand")
    private String buildBrand;

    @ApiModelProperty("build_cpu_abi")
    @TableField("build_cpu_abi")
    private String buildCpuAbi;

    @ApiModelProperty("build_cpu_abi2")
    @TableField("build_cpu_abi2")
    private String buildCpuAbi2;

    @ApiModelProperty("设备参数")
    @TableField("build_device")
    private String buildDevice;

    @ApiModelProperty("显示屏参数")
    @TableField("build_display")
    private String buildDisplay;

    @ApiModelProperty("唯一识别码")
    @TableField("build_fingerprint")
    private String buildFingerprint;

    @ApiModelProperty("build_host")
    @TableField("build_host")
    private String buildHost;

    @ApiModelProperty("整个产品的名称")
    @TableField("build_product")
    private String buildProduct;

    @ApiModelProperty("硬件名称")
    @TableField("build_hardware")
    private String buildHardware;

    @ApiModelProperty("硬件序列")
    @TableField("build_serial")
    private String buildSerial;

    @ApiModelProperty("cpu指令集")
    @TableField("build_supported_abis")
    private String buildSupportedAbis;

    @ApiModelProperty("cpu指令集")
    @TableField("build_supported_32_bit_abis")
    private String buildSupported32BitAbis;

    @ApiModelProperty("cpu指令集")
    @TableField("build_supported_64_bit_abis")
    private String buildSupported64BitAbis;

    @ApiModelProperty("build_version_incremental")
    @TableField("build_version_incremental")
    private String buildVersionIncremental;

    @ApiModelProperty("系统版本")
    @TableField("build_version_release")
    private String buildVersionRelease;

    @ApiModelProperty("build_version_sdk")
    @TableField("build_version_sdk")
    private String buildVersionSdk;

    @ApiModelProperty("SDK版本")
    @TableField("build_version_sdkint")
    private String buildVersionSdkint;

    @ApiModelProperty("build_version_codename")
    @TableField("build_version_codename")
    private String buildVersionCodename;

    @ApiModelProperty("build_type")
    @TableField("build_type")
    private String buildType;

    @ApiModelProperty("build_api_level")
    @TableField("build_api_level")
    private Integer buildApiLevel;

    @ApiModelProperty("Android系统第一次启动时产生的一个64bit数")
    @TableField("andorid_id")
    private String andoridId;

    @ApiModelProperty("os_arch")
    @TableField("os_arch")
    private String osArch;

    @ApiModelProperty("手机的网络制式(GSM,CDMA)")
    @TableField("phone_type")
    private String phoneType;

    @ApiModelProperty("os_version")
    @TableField("os_version")
    private String osVersion;

    @ApiModelProperty("SIM卡的序列号")
    @TableField("sim_serial_number")
    private String simSerialNumber;

    @ApiModelProperty("SIM卡的运营商")
    @TableField("network_operator")
    private String networkOperator;

    @ApiModelProperty("SIM卡的运营商名称")
    @TableField("network_operator_name")
    private String networkOperatorName;

    @ApiModelProperty("UI mode")
    @TableField("uimode")
    private String uimode;

    @ApiModelProperty("resolution")
    @TableField("resolution")
    private String resolution;

    @ApiModelProperty("totalMem")
    @TableField("total_mem")
    private Long totalMem;

    @ApiModelProperty("availMem")
    @TableField("avail_mem")
    private Long availMem;

    @ApiModelProperty("totalStorage")
    @TableField("total_storage")
    private Long totalStorage;

    @ApiModelProperty("availStorage")
    @TableField("avail_storage")
    private Long availStorage;

    @ApiModelProperty("root_access(true:1；false:0)")
    @TableField("root_access")
    private Integer rootAccess;

    @ApiModelProperty("经度")
    @TableField("lng")
    private BigDecimal lng;

    @ApiModelProperty("纬度")
    @TableField("lat")
    private BigDecimal lat;

    @ApiModelProperty("业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)")
    @TableField("biz_type")
    private Integer bizType;

    @ApiModelProperty("盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）")
    @TableField("server_type")
    private Integer serverType;

    @ApiModelProperty("销售状态(0：未售，1：已售)")
    @TableField("sales_status")
    private Integer salesStatus;

    @ApiModelProperty("运行状态(0：空闲，1：运行中)")
    @TableField("running_status")
    private Integer runningStatus;

    @ApiModelProperty("设备状态(-50：删除，0：暂停使用，50：正常)")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("健康状态(1：在线，0:故障)")
    @TableField("health_status")
    private Integer healthStatus;

    @ApiModelProperty("托管状态(0：待托管/已解除托管，1:已托管（默认）)")
    @TableField("trusteeship_status")
    private Integer trusteeshipStatus;

    @ApiModelProperty("是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）")
    @TableField("plan_switch_type")
    private Integer planSwitchType;

    @ApiModelProperty("streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）")
    @TableField("streaming_status")
    private Integer streamingStatus;

    @ApiModelProperty("维护模式状态（0：非维护模式，1：维护模式）")
    @TableField("maint_status")
    private Integer maintStatus;

    @ApiModelProperty("是否重置中（0：未重置，1：重置中，2：重启中）")
    @TableField("is_reseting")
    private Integer isReseting;

    @ApiModelProperty("rom系统软件版本")
    @TableField("rom_version")
    private String romVersion;

    @ApiModelProperty("版本id")
    @TableField("version_id")
    private Long versionId;

    @TableField("create_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createTime;

    @ApiModelProperty("盒子信息修改时间")
    @TableField("last_update_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date lastUpdateTime;

    @ApiModelProperty("是否在保存app用户数据(0：否，1：是)")
    @TableField("is_user_save")
    private Integer isUserSave;

    @ApiModelProperty("3: 打开日志，127: 关闭日志")
    @TableField("loglevel")
    private Integer loglevel;

    @TableField("logpkg")
    private String logpkg;

    @ApiModelProperty("是升级中（0：未升级，1：升级中）")
    @TableField("is_ota_upgrade")
    private Integer isOtaUpgrade;

    @ApiModelProperty("供应商类型[1:华为 2:腾讯]")
    @TableField("supplier_type")
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

    /**
     * 
     */
    public static final String ID = "id";

    /**
     * 
     */
    public static final String FK_PCP_AREA_ID = "fk_pcp_area_id";

    /**
     * 设备唯一码
     */
    public static final String DEVICE_ID = "device_id";

    /**
     * 移动终端的唯一标识
     */
    public static final String IMEI = "imei";

    /**
     * 国际移动用户识别码
     */
    public static final String IMSI = "imsi";

    /**
     * macAddr
     */
    public static final String MAC_ADDR = "mac_addr";

    /**
     * internalAddr
     */
    public static final String INTERNAL_ADDR = "internal_addr";

    /**
     * externalAddr
     */
    public static final String EXTERNAL_ADDR = "external_addr";

    /**
     * 省份ccode
     */
    public static final String PROVINCE_CCODE = "province_ccode";

    /**
     * 省份名称
     */
    public static final String PROVINCE_NAME = "province_name";

    /**
     * 城市ccode
     */
    public static final String CITY_CCODE = "city_ccode";

    /**
     * 城市名称
     */
    public static final String CITY_NAME = "city_name";

    /**
     * 地区ccode
     */
    public static final String AREA_CCODE = "area_ccode";

    /**
     * 地区名称
     */
    public static final String AREA_NAME = "area_name";

    /**
     * 地址地区名称详细（省市区街道名称以逗号分开）
     */
    public static final String REGION_NAME = "region_name";

    /**
     * location
     */
    public static final String LOCATION = "location";

    /**
     * cpu线程数
     */
    public static final String PROCESSORS = "processors";

    /**
     * 修订版本号
     */
    public static final String BUILD_ID = "build_id";

    /**
     * build_radio
     */
    public static final String BUILD_RADIO = "build_radio";

    /**
     * 版本即最终用户可见的名称
     */
    public static final String BUILD_MODEL = "build_model";

    /**
     * 硬件制造商
     */
    public static final String BUILD_MANUFACTURER = "build_manufacturer";

    /**
     * build_bootloader
     */
    public static final String BUILD_BOOTLOADER = "build_bootloader";

    /**
     * 主板
     */
    public static final String BUILD_BOARD = "build_board";

    /**
     * 系统定制商
     */
    public static final String BUILD_BRAND = "build_brand";

    /**
     * build_cpu_abi
     */
    public static final String BUILD_CPU_ABI = "build_cpu_abi";

    /**
     * build_cpu_abi2
     */
    public static final String BUILD_CPU_ABI2 = "build_cpu_abi2";

    /**
     * 设备参数
     */
    public static final String BUILD_DEVICE = "build_device";

    /**
     * 显示屏参数
     */
    public static final String BUILD_DISPLAY = "build_display";

    /**
     * 唯一识别码
     */
    public static final String BUILD_FINGERPRINT = "build_fingerprint";

    /**
     * build_host
     */
    public static final String BUILD_HOST = "build_host";

    /**
     * 整个产品的名称
     */
    public static final String BUILD_PRODUCT = "build_product";

    /**
     * 硬件名称
     */
    public static final String BUILD_HARDWARE = "build_hardware";

    /**
     * 硬件序列
     */
    public static final String BUILD_SERIAL = "build_serial";

    /**
     * cpu指令集
     */
    public static final String BUILD_SUPPORTED_ABIS = "build_supported_abis";

    /**
     * cpu指令集
     */
    public static final String BUILD_SUPPORTED_32_BIT_ABIS = "build_supported_32_bit_abis";

    /**
     * cpu指令集
     */
    public static final String BUILD_SUPPORTED_64_BIT_ABIS = "build_supported_64_bit_abis";

    /**
     * build_version_incremental
     */
    public static final String BUILD_VERSION_INCREMENTAL = "build_version_incremental";

    /**
     * 系统版本
     */
    public static final String BUILD_VERSION_RELEASE = "build_version_release";

    /**
     * build_version_sdk
     */
    public static final String BUILD_VERSION_SDK = "build_version_sdk";

    /**
     * SDK版本
     */
    public static final String BUILD_VERSION_SDKINT = "build_version_sdkint";

    /**
     * build_version_codename
     */
    public static final String BUILD_VERSION_CODENAME = "build_version_codename";

    /**
     * build_type
     */
    public static final String BUILD_TYPE = "build_type";

    /**
     * build_api_level
     */
    public static final String BUILD_API_LEVEL = "build_api_level";

    /**
     * Android系统第一次启动时产生的一个64bit数
     */
    public static final String ANDORID_ID = "andorid_id";

    /**
     * os_arch
     */
    public static final String OS_ARCH = "os_arch";

    /**
     * 手机的网络制式(GSM,CDMA)
     */
    public static final String PHONE_TYPE = "phone_type";

    /**
     * os_version
     */
    public static final String OS_VERSION = "os_version";

    /**
     * SIM卡的序列号
     */
    public static final String SIM_SERIAL_NUMBER = "sim_serial_number";

    /**
     * SIM卡的运营商
     */
    public static final String NETWORK_OPERATOR = "network_operator";

    /**
     * SIM卡的运营商名称
     */
    public static final String NETWORK_OPERATOR_NAME = "network_operator_name";

    /**
     * UI mode
     */
    public static final String UIMODE = "uimode";

    /**
     * resolution
     */
    public static final String RESOLUTION = "resolution";

    /**
     * totalMem
     */
    public static final String TOTAL_MEM = "total_mem";

    /**
     * availMem
     */
    public static final String AVAIL_MEM = "avail_mem";

    /**
     * totalStorage
     */
    public static final String TOTAL_STORAGE = "total_storage";

    /**
     * availStorage
     */
    public static final String AVAIL_STORAGE = "avail_storage";

    /**
     * root_access(true:1；false:0)
     */
    public static final String ROOT_ACCESS = "root_access";

    /**
     * 经度
     */
    public static final String LNG = "lng";

    /**
     * 纬度
     */
    public static final String LAT = "lat";

    /**
     * 业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)
     */
    public static final String BIZ_TYPE = "biz_type";

    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）
     */
    public static final String SERVER_TYPE = "server_type";

    /**
     * 销售状态(0：未售，1：已售)
     */
    public static final String SALES_STATUS = "sales_status";

    /**
     * 运行状态(0：空闲，1：运行中)
     */
    public static final String RUNNING_STATUS = "running_status";

    /**
     * 设备状态(-50：删除，0：暂停使用，50：正常)
     */
    public static final String STATUS = "status";

    /**
     * 健康状态(1：在线，0:故障)
     */
    public static final String HEALTH_STATUS = "health_status";

    /**
     * 托管状态(0：待托管/已解除托管，1:已托管（默认）)
     */
    public static final String TRUSTEESHIP_STATUS = "trusteeship_status";

    /**
     * 是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）
     */
    public static final String PLAN_SWITCH_TYPE = "plan_switch_type";

    /**
     * streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）
     */
    public static final String STREAMING_STATUS = "streaming_status";

    /**
     * 维护模式状态（0：非维护模式，1：维护模式）
     */
    public static final String MAINT_STATUS = "maint_status";

    /**
     * 是否重置中（0：未重置，1：重置中，2：重启中）
     */
    public static final String IS_RESETING = "is_reseting";

    /**
     * rom系统软件版本
     */
    public static final String ROM_VERSION = "rom_version";

    /**
     * 版本id
     */
    public static final String VERSION_ID = "version_id";

    /**
     * 
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 盒子信息修改时间
     */
    public static final String LAST_UPDATE_TIME = "last_update_time";

    /**
     * 是否在保存app用户数据(0：否，1：是)
     */
    public static final String IS_USER_SAVE = "is_user_save";

    /**
     * 3: 打开日志，127: 关闭日志
     */
    public static final String LOGLEVEL = "loglevel";

    /**
     * 
     */
    public static final String LOGPKG = "logpkg";

    /**
     * 是升级中（0：未升级，1：升级中）
     */
    public static final String IS_OTA_UPGRADE = "is_ota_upgrade";

    /**
     * 供应商类型[1:华为 2:腾讯]
     */
    public static final String SUPPLIER_TYPE = "supplier_type";

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

    public EmSocDevicesQueryEntityWrapper queryWrapper(){
        return EmSocDevicesQueryEntityWrapper.wrapper(this);
    }

    public EmSocDevicesUpdateEntityWrapper updateWrapper(){
        return EmSocDevicesUpdateEntityWrapper.wrapper(this);
    }

    public static EmSocDevicesQueryWrapper qWrapper(){
        return EmSocDevicesQueryWrapper.wrapper();
    }

    public static EmSocDevicesUpdateWrapper uWrapper(){
        return EmSocDevicesUpdateWrapper.wrapper();
    }

}
