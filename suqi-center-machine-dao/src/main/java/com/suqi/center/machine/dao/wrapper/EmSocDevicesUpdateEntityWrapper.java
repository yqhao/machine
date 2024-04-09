package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.EmSocDevices;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 设备（em_soc_devices）
 * </p>
 * "em_soc_devices"
 * @author PC001
 */
public class EmSocDevicesUpdateEntityWrapper extends UpdateWrapper<EmSocDevices> {

    public static EmSocDevicesUpdateEntityWrapper wrapper(EmSocDevices entity) {
        return new EmSocDevicesUpdateEntityWrapper(entity);
    }

    private EmSocDevices entity;

    public EmSocDevicesUpdateEntityWrapper(EmSocDevices entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public EmSocDevicesUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public EmSocDevicesUpdateEntityWrapper setFkPcpAreaId(Long fkPcpAreaId) {
         set("fk_pcp_area_id",fkPcpAreaId);
        return this;
    }
    /**
     * 设备唯一码
     */
    public EmSocDevicesUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 移动终端的唯一标识
     */
    public EmSocDevicesUpdateEntityWrapper setImei(String imei) {
         set("imei",imei);
        return this;
    }
    /**
     * 国际移动用户识别码
     */
    public EmSocDevicesUpdateEntityWrapper setImsi(String imsi) {
         set("imsi",imsi);
        return this;
    }
    /**
     * macAddr
     */
    public EmSocDevicesUpdateEntityWrapper setMacAddr(String macAddr) {
         set("mac_addr",macAddr);
        return this;
    }
    /**
     * internalAddr
     */
    public EmSocDevicesUpdateEntityWrapper setInternalAddr(String internalAddr) {
         set("internal_addr",internalAddr);
        return this;
    }
    /**
     * externalAddr
     */
    public EmSocDevicesUpdateEntityWrapper setExternalAddr(String externalAddr) {
         set("external_addr",externalAddr);
        return this;
    }
    /**
     * 省份ccode
     */
    public EmSocDevicesUpdateEntityWrapper setProvinceCcode(Long provinceCcode) {
         set("province_ccode",provinceCcode);
        return this;
    }
    /**
     * 省份名称
     */
    public EmSocDevicesUpdateEntityWrapper setProvinceName(String provinceName) {
         set("province_name",provinceName);
        return this;
    }
    /**
     * 城市ccode
     */
    public EmSocDevicesUpdateEntityWrapper setCityCcode(Long cityCcode) {
         set("city_ccode",cityCcode);
        return this;
    }
    /**
     * 城市名称
     */
    public EmSocDevicesUpdateEntityWrapper setCityName(String cityName) {
         set("city_name",cityName);
        return this;
    }
    /**
     * 地区ccode
     */
    public EmSocDevicesUpdateEntityWrapper setAreaCcode(Long areaCcode) {
         set("area_ccode",areaCcode);
        return this;
    }
    /**
     * 地区名称
     */
    public EmSocDevicesUpdateEntityWrapper setAreaName(String areaName) {
         set("area_name",areaName);
        return this;
    }
    /**
     * 地址地区名称详细（省市区街道名称以逗号分开）
     */
    public EmSocDevicesUpdateEntityWrapper setRegionName(String regionName) {
         set("region_name",regionName);
        return this;
    }
    /**
     * location
     */
    public EmSocDevicesUpdateEntityWrapper setLocation(String location) {
         set("location",location);
        return this;
    }
    /**
     * cpu线程数
     */
    public EmSocDevicesUpdateEntityWrapper setProcessors(Integer processors) {
         set("processors",processors);
        return this;
    }
    /**
     * 修订版本号
     */
    public EmSocDevicesUpdateEntityWrapper setBuildId(String buildId) {
         set("build_id",buildId);
        return this;
    }
    /**
     * build_radio
     */
    public EmSocDevicesUpdateEntityWrapper setBuildRadio(String buildRadio) {
         set("build_radio",buildRadio);
        return this;
    }
    /**
     * 版本即最终用户可见的名称
     */
    public EmSocDevicesUpdateEntityWrapper setBuildModel(String buildModel) {
         set("build_model",buildModel);
        return this;
    }
    /**
     * 硬件制造商
     */
    public EmSocDevicesUpdateEntityWrapper setBuildManufacturer(String buildManufacturer) {
         set("build_manufacturer",buildManufacturer);
        return this;
    }
    /**
     * build_bootloader
     */
    public EmSocDevicesUpdateEntityWrapper setBuildBootloader(String buildBootloader) {
         set("build_bootloader",buildBootloader);
        return this;
    }
    /**
     * 主板
     */
    public EmSocDevicesUpdateEntityWrapper setBuildBoard(String buildBoard) {
         set("build_board",buildBoard);
        return this;
    }
    /**
     * 系统定制商
     */
    public EmSocDevicesUpdateEntityWrapper setBuildBrand(String buildBrand) {
         set("build_brand",buildBrand);
        return this;
    }
    /**
     * build_cpu_abi
     */
    public EmSocDevicesUpdateEntityWrapper setBuildCpuAbi(String buildCpuAbi) {
         set("build_cpu_abi",buildCpuAbi);
        return this;
    }
    /**
     * build_cpu_abi2
     */
    public EmSocDevicesUpdateEntityWrapper setBuildCpuAbi2(String buildCpuAbi2) {
         set("build_cpu_abi2",buildCpuAbi2);
        return this;
    }
    /**
     * 设备参数
     */
    public EmSocDevicesUpdateEntityWrapper setBuildDevice(String buildDevice) {
         set("build_device",buildDevice);
        return this;
    }
    /**
     * 显示屏参数
     */
    public EmSocDevicesUpdateEntityWrapper setBuildDisplay(String buildDisplay) {
         set("build_display",buildDisplay);
        return this;
    }
    /**
     * 唯一识别码
     */
    public EmSocDevicesUpdateEntityWrapper setBuildFingerprint(String buildFingerprint) {
         set("build_fingerprint",buildFingerprint);
        return this;
    }
    /**
     * build_host
     */
    public EmSocDevicesUpdateEntityWrapper setBuildHost(String buildHost) {
         set("build_host",buildHost);
        return this;
    }
    /**
     * 整个产品的名称
     */
    public EmSocDevicesUpdateEntityWrapper setBuildProduct(String buildProduct) {
         set("build_product",buildProduct);
        return this;
    }
    /**
     * 硬件名称
     */
    public EmSocDevicesUpdateEntityWrapper setBuildHardware(String buildHardware) {
         set("build_hardware",buildHardware);
        return this;
    }
    /**
     * 硬件序列
     */
    public EmSocDevicesUpdateEntityWrapper setBuildSerial(String buildSerial) {
         set("build_serial",buildSerial);
        return this;
    }
    /**
     * cpu指令集
     */
    public EmSocDevicesUpdateEntityWrapper setBuildSupportedAbis(String buildSupportedAbis) {
         set("build_supported_abis",buildSupportedAbis);
        return this;
    }
    /**
     * cpu指令集
     */
    public EmSocDevicesUpdateEntityWrapper setBuildSupported32BitAbis(String buildSupported32BitAbis) {
         set("build_supported_32_bit_abis",buildSupported32BitAbis);
        return this;
    }
    /**
     * cpu指令集
     */
    public EmSocDevicesUpdateEntityWrapper setBuildSupported64BitAbis(String buildSupported64BitAbis) {
         set("build_supported_64_bit_abis",buildSupported64BitAbis);
        return this;
    }
    /**
     * build_version_incremental
     */
    public EmSocDevicesUpdateEntityWrapper setBuildVersionIncremental(String buildVersionIncremental) {
         set("build_version_incremental",buildVersionIncremental);
        return this;
    }
    /**
     * 系统版本
     */
    public EmSocDevicesUpdateEntityWrapper setBuildVersionRelease(String buildVersionRelease) {
         set("build_version_release",buildVersionRelease);
        return this;
    }
    /**
     * build_version_sdk
     */
    public EmSocDevicesUpdateEntityWrapper setBuildVersionSdk(String buildVersionSdk) {
         set("build_version_sdk",buildVersionSdk);
        return this;
    }
    /**
     * SDK版本
     */
    public EmSocDevicesUpdateEntityWrapper setBuildVersionSdkint(String buildVersionSdkint) {
         set("build_version_sdkint",buildVersionSdkint);
        return this;
    }
    /**
     * build_version_codename
     */
    public EmSocDevicesUpdateEntityWrapper setBuildVersionCodename(String buildVersionCodename) {
         set("build_version_codename",buildVersionCodename);
        return this;
    }
    /**
     * build_type
     */
    public EmSocDevicesUpdateEntityWrapper setBuildType(String buildType) {
         set("build_type",buildType);
        return this;
    }
    /**
     * build_api_level
     */
    public EmSocDevicesUpdateEntityWrapper setBuildApiLevel(Integer buildApiLevel) {
         set("build_api_level",buildApiLevel);
        return this;
    }
    /**
     * Android系统第一次启动时产生的一个64bit数
     */
    public EmSocDevicesUpdateEntityWrapper setAndoridId(String andoridId) {
         set("andorid_id",andoridId);
        return this;
    }
    /**
     * os_arch
     */
    public EmSocDevicesUpdateEntityWrapper setOsArch(String osArch) {
         set("os_arch",osArch);
        return this;
    }
    /**
     * 手机的网络制式(GSM,CDMA)
     */
    public EmSocDevicesUpdateEntityWrapper setPhoneType(String phoneType) {
         set("phone_type",phoneType);
        return this;
    }
    /**
     * os_version
     */
    public EmSocDevicesUpdateEntityWrapper setOsVersion(String osVersion) {
         set("os_version",osVersion);
        return this;
    }
    /**
     * SIM卡的序列号
     */
    public EmSocDevicesUpdateEntityWrapper setSimSerialNumber(String simSerialNumber) {
         set("sim_serial_number",simSerialNumber);
        return this;
    }
    /**
     * SIM卡的运营商
     */
    public EmSocDevicesUpdateEntityWrapper setNetworkOperator(String networkOperator) {
         set("network_operator",networkOperator);
        return this;
    }
    /**
     * SIM卡的运营商名称
     */
    public EmSocDevicesUpdateEntityWrapper setNetworkOperatorName(String networkOperatorName) {
         set("network_operator_name",networkOperatorName);
        return this;
    }
    /**
     * UI mode
     */
    public EmSocDevicesUpdateEntityWrapper setUimode(String uimode) {
         set("uimode",uimode);
        return this;
    }
    /**
     * resolution
     */
    public EmSocDevicesUpdateEntityWrapper setResolution(String resolution) {
         set("resolution",resolution);
        return this;
    }
    /**
     * totalMem
     */
    public EmSocDevicesUpdateEntityWrapper setTotalMem(Long totalMem) {
         set("total_mem",totalMem);
        return this;
    }
    /**
     * availMem
     */
    public EmSocDevicesUpdateEntityWrapper setAvailMem(Long availMem) {
         set("avail_mem",availMem);
        return this;
    }
    /**
     * totalStorage
     */
    public EmSocDevicesUpdateEntityWrapper setTotalStorage(Long totalStorage) {
         set("total_storage",totalStorage);
        return this;
    }
    /**
     * availStorage
     */
    public EmSocDevicesUpdateEntityWrapper setAvailStorage(Long availStorage) {
         set("avail_storage",availStorage);
        return this;
    }
    /**
     * root_access(true:1；false:0)
     */
    public EmSocDevicesUpdateEntityWrapper setRootAccess(Integer rootAccess) {
         set("root_access",rootAccess);
        return this;
    }
    /**
     * 经度
     */
    public EmSocDevicesUpdateEntityWrapper setLng(BigDecimal lng) {
         set("lng",lng);
        return this;
    }
    /**
     * 纬度
     */
    public EmSocDevicesUpdateEntityWrapper setLat(BigDecimal lat) {
         set("lat",lat);
        return this;
    }
    /**
     * 业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)
     */
    public EmSocDevicesUpdateEntityWrapper setBizType(Integer bizType) {
         set("biz_type",bizType);
        return this;
    }
    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）
     */
    public EmSocDevicesUpdateEntityWrapper setServerType(Integer serverType) {
         set("server_type",serverType);
        return this;
    }
    /**
     * 销售状态(0：未售，1：已售)
     */
    public EmSocDevicesUpdateEntityWrapper setSalesStatus(Integer salesStatus) {
         set("sales_status",salesStatus);
        return this;
    }
    /**
     * 运行状态(0：空闲，1：运行中)
     */
    public EmSocDevicesUpdateEntityWrapper setRunningStatus(Integer runningStatus) {
         set("running_status",runningStatus);
        return this;
    }
    /**
     * 设备状态(-50：删除，0：暂停使用，50：正常)
     */
    public EmSocDevicesUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 健康状态(1：在线，0:故障)
     */
    public EmSocDevicesUpdateEntityWrapper setHealthStatus(Integer healthStatus) {
         set("health_status",healthStatus);
        return this;
    }
    /**
     * 托管状态(0：待托管/已解除托管，1:已托管（默认）)
     */
    public EmSocDevicesUpdateEntityWrapper setTrusteeshipStatus(Integer trusteeshipStatus) {
         set("trusteeship_status",trusteeshipStatus);
        return this;
    }
    /**
     * 是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）
     */
    public EmSocDevicesUpdateEntityWrapper setPlanSwitchType(Integer planSwitchType) {
         set("plan_switch_type",planSwitchType);
        return this;
    }
    /**
     * streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）
     */
    public EmSocDevicesUpdateEntityWrapper setStreamingStatus(Integer streamingStatus) {
         set("streaming_status",streamingStatus);
        return this;
    }
    /**
     * 维护模式状态（0：非维护模式，1：维护模式）
     */
    public EmSocDevicesUpdateEntityWrapper setMaintStatus(Integer maintStatus) {
         set("maint_status",maintStatus);
        return this;
    }
    /**
     * 是否重置中（0：未重置，1：重置中，2：重启中）
     */
    public EmSocDevicesUpdateEntityWrapper setIsReseting(Integer isReseting) {
         set("is_reseting",isReseting);
        return this;
    }
    /**
     * rom系统软件版本
     */
    public EmSocDevicesUpdateEntityWrapper setRomVersion(String romVersion) {
         set("rom_version",romVersion);
        return this;
    }
    /**
     * 版本id
     */
    public EmSocDevicesUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 
     */
    public EmSocDevicesUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 盒子信息修改时间
     */
    public EmSocDevicesUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 是否在保存app用户数据(0：否，1：是)
     */
    public EmSocDevicesUpdateEntityWrapper setIsUserSave(Integer isUserSave) {
         set("is_user_save",isUserSave);
        return this;
    }
    /**
     * 3: 打开日志，127: 关闭日志
     */
    public EmSocDevicesUpdateEntityWrapper setLoglevel(Integer loglevel) {
         set("loglevel",loglevel);
        return this;
    }
    /**
     * 
     */
    public EmSocDevicesUpdateEntityWrapper setLogpkg(String logpkg) {
         set("logpkg",logpkg);
        return this;
    }
    /**
     * 是升级中（0：未升级，1：升级中）
     */
    public EmSocDevicesUpdateEntityWrapper setIsOtaUpgrade(Integer isOtaUpgrade) {
         set("is_ota_upgrade",isOtaUpgrade);
        return this;
    }
    /**
     * 供应商类型[1:华为 2:腾讯]
     */
    public EmSocDevicesUpdateEntityWrapper setSupplierType(Integer supplierType) {
         set("supplier_type",supplierType);
        return this;
    }

    protected EmSocDevices entity() {
        if(entity==null){
            throw new NullPointerException("EmSocDevices is null");
        }
        return entity;
    }

    /**
     * 
     */
    public EmSocDevicesUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 
     */
    public EmSocDevicesUpdateEntityWrapper setFkPcpAreaId() {
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            set("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }
    /**
     * 设备唯一码
     */
    public EmSocDevicesUpdateEntityWrapper setDeviceId() {
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            set("device_id",deviceId);
        }
        return this;
    }
    /**
     * 移动终端的唯一标识
     */
    public EmSocDevicesUpdateEntityWrapper setImei() {
        String imei =entity().getImei();
        if(imei!=null){
            set("imei",imei);
        }
        return this;
    }
    /**
     * 国际移动用户识别码
     */
    public EmSocDevicesUpdateEntityWrapper setImsi() {
        String imsi =entity().getImsi();
        if(imsi!=null){
            set("imsi",imsi);
        }
        return this;
    }
    /**
     * macAddr
     */
    public EmSocDevicesUpdateEntityWrapper setMacAddr() {
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            set("mac_addr",macAddr);
        }
        return this;
    }
    /**
     * internalAddr
     */
    public EmSocDevicesUpdateEntityWrapper setInternalAddr() {
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            set("internal_addr",internalAddr);
        }
        return this;
    }
    /**
     * externalAddr
     */
    public EmSocDevicesUpdateEntityWrapper setExternalAddr() {
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            set("external_addr",externalAddr);
        }
        return this;
    }
    /**
     * 省份ccode
     */
    public EmSocDevicesUpdateEntityWrapper setProvinceCcode() {
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            set("province_ccode",provinceCcode);
        }
        return this;
    }
    /**
     * 省份名称
     */
    public EmSocDevicesUpdateEntityWrapper setProvinceName() {
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            set("province_name",provinceName);
        }
        return this;
    }
    /**
     * 城市ccode
     */
    public EmSocDevicesUpdateEntityWrapper setCityCcode() {
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            set("city_ccode",cityCcode);
        }
        return this;
    }
    /**
     * 城市名称
     */
    public EmSocDevicesUpdateEntityWrapper setCityName() {
        String cityName =entity().getCityName();
        if(cityName!=null){
            set("city_name",cityName);
        }
        return this;
    }
    /**
     * 地区ccode
     */
    public EmSocDevicesUpdateEntityWrapper setAreaCcode() {
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            set("area_ccode",areaCcode);
        }
        return this;
    }
    /**
     * 地区名称
     */
    public EmSocDevicesUpdateEntityWrapper setAreaName() {
        String areaName =entity().getAreaName();
        if(areaName!=null){
            set("area_name",areaName);
        }
        return this;
    }
    /**
     * 地址地区名称详细（省市区街道名称以逗号分开）
     */
    public EmSocDevicesUpdateEntityWrapper setRegionName() {
        String regionName =entity().getRegionName();
        if(regionName!=null){
            set("region_name",regionName);
        }
        return this;
    }
    /**
     * location
     */
    public EmSocDevicesUpdateEntityWrapper setLocation() {
        String location =entity().getLocation();
        if(location!=null){
            set("location",location);
        }
        return this;
    }
    /**
     * cpu线程数
     */
    public EmSocDevicesUpdateEntityWrapper setProcessors() {
        Integer processors =entity().getProcessors();
        if(processors!=null){
            set("processors",processors);
        }
        return this;
    }
    /**
     * 修订版本号
     */
    public EmSocDevicesUpdateEntityWrapper setBuildId() {
        String buildId =entity().getBuildId();
        if(buildId!=null){
            set("build_id",buildId);
        }
        return this;
    }
    /**
     * build_radio
     */
    public EmSocDevicesUpdateEntityWrapper setBuildRadio() {
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            set("build_radio",buildRadio);
        }
        return this;
    }
    /**
     * 版本即最终用户可见的名称
     */
    public EmSocDevicesUpdateEntityWrapper setBuildModel() {
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            set("build_model",buildModel);
        }
        return this;
    }
    /**
     * 硬件制造商
     */
    public EmSocDevicesUpdateEntityWrapper setBuildManufacturer() {
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            set("build_manufacturer",buildManufacturer);
        }
        return this;
    }
    /**
     * build_bootloader
     */
    public EmSocDevicesUpdateEntityWrapper setBuildBootloader() {
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            set("build_bootloader",buildBootloader);
        }
        return this;
    }
    /**
     * 主板
     */
    public EmSocDevicesUpdateEntityWrapper setBuildBoard() {
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            set("build_board",buildBoard);
        }
        return this;
    }
    /**
     * 系统定制商
     */
    public EmSocDevicesUpdateEntityWrapper setBuildBrand() {
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            set("build_brand",buildBrand);
        }
        return this;
    }
    /**
     * build_cpu_abi
     */
    public EmSocDevicesUpdateEntityWrapper setBuildCpuAbi() {
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            set("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }
    /**
     * build_cpu_abi2
     */
    public EmSocDevicesUpdateEntityWrapper setBuildCpuAbi2() {
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            set("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }
    /**
     * 设备参数
     */
    public EmSocDevicesUpdateEntityWrapper setBuildDevice() {
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            set("build_device",buildDevice);
        }
        return this;
    }
    /**
     * 显示屏参数
     */
    public EmSocDevicesUpdateEntityWrapper setBuildDisplay() {
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            set("build_display",buildDisplay);
        }
        return this;
    }
    /**
     * 唯一识别码
     */
    public EmSocDevicesUpdateEntityWrapper setBuildFingerprint() {
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            set("build_fingerprint",buildFingerprint);
        }
        return this;
    }
    /**
     * build_host
     */
    public EmSocDevicesUpdateEntityWrapper setBuildHost() {
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            set("build_host",buildHost);
        }
        return this;
    }
    /**
     * 整个产品的名称
     */
    public EmSocDevicesUpdateEntityWrapper setBuildProduct() {
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            set("build_product",buildProduct);
        }
        return this;
    }
    /**
     * 硬件名称
     */
    public EmSocDevicesUpdateEntityWrapper setBuildHardware() {
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            set("build_hardware",buildHardware);
        }
        return this;
    }
    /**
     * 硬件序列
     */
    public EmSocDevicesUpdateEntityWrapper setBuildSerial() {
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            set("build_serial",buildSerial);
        }
        return this;
    }
    /**
     * cpu指令集
     */
    public EmSocDevicesUpdateEntityWrapper setBuildSupportedAbis() {
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            set("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }
    /**
     * cpu指令集
     */
    public EmSocDevicesUpdateEntityWrapper setBuildSupported32BitAbis() {
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            set("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }
    /**
     * cpu指令集
     */
    public EmSocDevicesUpdateEntityWrapper setBuildSupported64BitAbis() {
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            set("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }
    /**
     * build_version_incremental
     */
    public EmSocDevicesUpdateEntityWrapper setBuildVersionIncremental() {
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            set("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }
    /**
     * 系统版本
     */
    public EmSocDevicesUpdateEntityWrapper setBuildVersionRelease() {
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            set("build_version_release",buildVersionRelease);
        }
        return this;
    }
    /**
     * build_version_sdk
     */
    public EmSocDevicesUpdateEntityWrapper setBuildVersionSdk() {
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            set("build_version_sdk",buildVersionSdk);
        }
        return this;
    }
    /**
     * SDK版本
     */
    public EmSocDevicesUpdateEntityWrapper setBuildVersionSdkint() {
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            set("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }
    /**
     * build_version_codename
     */
    public EmSocDevicesUpdateEntityWrapper setBuildVersionCodename() {
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            set("build_version_codename",buildVersionCodename);
        }
        return this;
    }
    /**
     * build_type
     */
    public EmSocDevicesUpdateEntityWrapper setBuildType() {
        String buildType =entity().getBuildType();
        if(buildType!=null){
            set("build_type",buildType);
        }
        return this;
    }
    /**
     * build_api_level
     */
    public EmSocDevicesUpdateEntityWrapper setBuildApiLevel() {
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            set("build_api_level",buildApiLevel);
        }
        return this;
    }
    /**
     * Android系统第一次启动时产生的一个64bit数
     */
    public EmSocDevicesUpdateEntityWrapper setAndoridId() {
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            set("andorid_id",andoridId);
        }
        return this;
    }
    /**
     * os_arch
     */
    public EmSocDevicesUpdateEntityWrapper setOsArch() {
        String osArch =entity().getOsArch();
        if(osArch!=null){
            set("os_arch",osArch);
        }
        return this;
    }
    /**
     * 手机的网络制式(GSM,CDMA)
     */
    public EmSocDevicesUpdateEntityWrapper setPhoneType() {
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            set("phone_type",phoneType);
        }
        return this;
    }
    /**
     * os_version
     */
    public EmSocDevicesUpdateEntityWrapper setOsVersion() {
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            set("os_version",osVersion);
        }
        return this;
    }
    /**
     * SIM卡的序列号
     */
    public EmSocDevicesUpdateEntityWrapper setSimSerialNumber() {
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            set("sim_serial_number",simSerialNumber);
        }
        return this;
    }
    /**
     * SIM卡的运营商
     */
    public EmSocDevicesUpdateEntityWrapper setNetworkOperator() {
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            set("network_operator",networkOperator);
        }
        return this;
    }
    /**
     * SIM卡的运营商名称
     */
    public EmSocDevicesUpdateEntityWrapper setNetworkOperatorName() {
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            set("network_operator_name",networkOperatorName);
        }
        return this;
    }
    /**
     * UI mode
     */
    public EmSocDevicesUpdateEntityWrapper setUimode() {
        String uimode =entity().getUimode();
        if(uimode!=null){
            set("uimode",uimode);
        }
        return this;
    }
    /**
     * resolution
     */
    public EmSocDevicesUpdateEntityWrapper setResolution() {
        String resolution =entity().getResolution();
        if(resolution!=null){
            set("resolution",resolution);
        }
        return this;
    }
    /**
     * totalMem
     */
    public EmSocDevicesUpdateEntityWrapper setTotalMem() {
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            set("total_mem",totalMem);
        }
        return this;
    }
    /**
     * availMem
     */
    public EmSocDevicesUpdateEntityWrapper setAvailMem() {
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            set("avail_mem",availMem);
        }
        return this;
    }
    /**
     * totalStorage
     */
    public EmSocDevicesUpdateEntityWrapper setTotalStorage() {
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            set("total_storage",totalStorage);
        }
        return this;
    }
    /**
     * availStorage
     */
    public EmSocDevicesUpdateEntityWrapper setAvailStorage() {
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            set("avail_storage",availStorage);
        }
        return this;
    }
    /**
     * root_access(true:1；false:0)
     */
    public EmSocDevicesUpdateEntityWrapper setRootAccess() {
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            set("root_access",rootAccess);
        }
        return this;
    }
    /**
     * 经度
     */
    public EmSocDevicesUpdateEntityWrapper setLng() {
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            set("lng",lng);
        }
        return this;
    }
    /**
     * 纬度
     */
    public EmSocDevicesUpdateEntityWrapper setLat() {
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            set("lat",lat);
        }
        return this;
    }
    /**
     * 业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)
     */
    public EmSocDevicesUpdateEntityWrapper setBizType() {
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            set("biz_type",bizType);
        }
        return this;
    }
    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）
     */
    public EmSocDevicesUpdateEntityWrapper setServerType() {
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            set("server_type",serverType);
        }
        return this;
    }
    /**
     * 销售状态(0：未售，1：已售)
     */
    public EmSocDevicesUpdateEntityWrapper setSalesStatus() {
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            set("sales_status",salesStatus);
        }
        return this;
    }
    /**
     * 运行状态(0：空闲，1：运行中)
     */
    public EmSocDevicesUpdateEntityWrapper setRunningStatus() {
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            set("running_status",runningStatus);
        }
        return this;
    }
    /**
     * 设备状态(-50：删除，0：暂停使用，50：正常)
     */
    public EmSocDevicesUpdateEntityWrapper setStatus() {
        Integer status =entity().getStatus();
        if(status!=null){
            set("status",status);
        }
        return this;
    }
    /**
     * 健康状态(1：在线，0:故障)
     */
    public EmSocDevicesUpdateEntityWrapper setHealthStatus() {
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            set("health_status",healthStatus);
        }
        return this;
    }
    /**
     * 托管状态(0：待托管/已解除托管，1:已托管（默认）)
     */
    public EmSocDevicesUpdateEntityWrapper setTrusteeshipStatus() {
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            set("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }
    /**
     * 是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）
     */
    public EmSocDevicesUpdateEntityWrapper setPlanSwitchType() {
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            set("plan_switch_type",planSwitchType);
        }
        return this;
    }
    /**
     * streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）
     */
    public EmSocDevicesUpdateEntityWrapper setStreamingStatus() {
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            set("streaming_status",streamingStatus);
        }
        return this;
    }
    /**
     * 维护模式状态（0：非维护模式，1：维护模式）
     */
    public EmSocDevicesUpdateEntityWrapper setMaintStatus() {
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            set("maint_status",maintStatus);
        }
        return this;
    }
    /**
     * 是否重置中（0：未重置，1：重置中，2：重启中）
     */
    public EmSocDevicesUpdateEntityWrapper setIsReseting() {
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            set("is_reseting",isReseting);
        }
        return this;
    }
    /**
     * rom系统软件版本
     */
    public EmSocDevicesUpdateEntityWrapper setRomVersion() {
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            set("rom_version",romVersion);
        }
        return this;
    }
    /**
     * 版本id
     */
    public EmSocDevicesUpdateEntityWrapper setVersionId() {
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            set("version_id",versionId);
        }
        return this;
    }
    /**
     * 
     */
    public EmSocDevicesUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 盒子信息修改时间
     */
    public EmSocDevicesUpdateEntityWrapper setLastUpdateTime() {
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            set("last_update_time",lastUpdateTime);
        }
        return this;
    }
    /**
     * 是否在保存app用户数据(0：否，1：是)
     */
    public EmSocDevicesUpdateEntityWrapper setIsUserSave() {
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            set("is_user_save",isUserSave);
        }
        return this;
    }
    /**
     * 3: 打开日志，127: 关闭日志
     */
    public EmSocDevicesUpdateEntityWrapper setLoglevel() {
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            set("loglevel",loglevel);
        }
        return this;
    }
    /**
     * 
     */
    public EmSocDevicesUpdateEntityWrapper setLogpkg() {
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            set("logpkg",logpkg);
        }
        return this;
    }
    /**
     * 是升级中（0：未升级，1：升级中）
     */
    public EmSocDevicesUpdateEntityWrapper setIsOtaUpgrade() {
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            set("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }
    /**
     * 供应商类型[1:华为 2:腾讯]
     */
    public EmSocDevicesUpdateEntityWrapper setSupplierType() {
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            set("supplier_type",supplierType);
        }
        return this;
    }
    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdEq(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdNe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdGt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdGe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdLt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdLe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaId,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaId,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdNotLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdLikeLeft(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getFkPcpAreaId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdLikeRight(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdEq(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 不等于 &lt;&gt; entity().getDeviceId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdNe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt; entity().getDeviceId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdGt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;= entity().getDeviceId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdGe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt; entity().getDeviceId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdLt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;= entity().getDeviceId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值' entity().getDeviceId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%' entity().getDeviceId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdLikeRight(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

/**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
    }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * 等于 = entity().getImei()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiEq(){
        String imei =entity().getImei();
        if(imei!=null){
            eq("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * 不等于 &lt;&gt; entity().getImei()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiNe(){
        String imei =entity().getImei();
        if(imei!=null){
            ne("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 大于 &gt; entity().getImei()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiGt(){
        String imei =entity().getImei();
        if(imei!=null){
            gt("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 大于等于 &gt;= entity().getImei()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiGe(){
        String imei =entity().getImei();
        if(imei!=null){
            ge("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 小于 &lt; entity().getImei()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiLt(){
        String imei =entity().getImei();
        if(imei!=null){
            lt("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 小于等于 &lt;= entity().getImei()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiLe(){
        String imei =entity().getImei();
        if(imei!=null){
            le("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * BETWEEN  entity().getImei() AND 值2
     * @param imeiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiBetween(String imeiEnd){
        String imei =entity().getImei();
        if(imei!=null && imeiEnd!=null){
            between("imei",imei,imeiEnd);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT BETWEEN  entity().getImei() AND 值2
     * @param imeiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiNotBetween(String imeiEnd){
        String imei =entity().getImei();
        if(imei!=null && imeiEnd!=null){
            notBetween("imei",imei,imeiEnd);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * BETWEEN  entity().getImei() AND 值2
     * @param imeiStart       值1
     * @param imeiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiBetween(String imeiStart,String imeiEnd){
        String imei =entity().getImei();
        if(imei!=null && imeiEnd!=null){
            between("imei",imeiStart,imeiEnd);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT BETWEEN  entity().getImei() AND 值2
     * @param imeiStart       值1
     * @param imeiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiNotBetween(String imeiStart,String imeiEnd){
        String imei =entity().getImei();
        if(imei!=null && imeiEnd!=null){
            notBetween("imei",imeiStart,imeiEnd);
        }
        return this;
     }


    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '%值%' entity().getImei()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiLike(){
        String imei =entity().getImei();
        if(imei!=null){
            like("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT LIKE '%值%' entity().getImei()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiNotLike(){
        String imei =entity().getImei();
        if(imei!=null){
            notLike("imei",imei);
        }
        return this;
     }


    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '%值' entity().getImei()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiLikeLeft(){
        String imei =entity().getImei();
        if(imei!=null){
            likeLeft("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '值%' entity().getImei()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiLikeRight(){
        String imei =entity().getImei();
        if(imei!=null){
            likeRight("imei",imei);
        }
        return this;
     }

/**
     * <p>移动终端的唯一标识</p>
     * 等于 =
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiEq(String imei){
        if(imei!=null){
            eq("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * 不等于 &lt;&gt;
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiNe(String imei){
        if(imei!=null){
            ne("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * 大于 &gt;
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiGt(String imei){
        if(imei!=null){
            gt("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * 大于等于 &gt;=
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiGe(String imei){
        if(imei!=null){
            ge("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * 小于 &lt;
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiLt(String imei){
        if(imei!=null){
            lt("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * 小于等于 &lt;=
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiLe(String imei){
        if(imei!=null){
            le("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '%值%'
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiLike(String imei){
        if(imei!=null){
            like("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT LIKE '%值%'
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiNotLike(String imei){
        if(imei!=null){
            notLike("imei",imei);
        }
        return this;
    }


    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '%值'
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiLikeLeft(String imei){
        if(imei!=null){
            likeLeft("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '值%'
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiLikeRight(String imei){
        if(imei!=null){
            likeRight("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiIsNull(){
        isNull("imei");
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiIsNotNull(){
        isNotNull("imei");
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("imei",value);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiIn(String... values){
        if(values!=null && values.length>0){
            in("imei",values);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("imei",value);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imeiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("imei",values);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * 等于 = entity().getImsi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiEq(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            eq("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * 不等于 &lt;&gt; entity().getImsi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiNe(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            ne("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 大于 &gt; entity().getImsi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiGt(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            gt("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 大于等于 &gt;= entity().getImsi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiGe(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            ge("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 小于 &lt; entity().getImsi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiLt(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            lt("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 小于等于 &lt;= entity().getImsi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiLe(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            le("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * BETWEEN  entity().getImsi() AND 值2
     * @param imsiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiBetween(String imsiEnd){
        String imsi =entity().getImsi();
        if(imsi!=null && imsiEnd!=null){
            between("imsi",imsi,imsiEnd);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * NOT BETWEEN  entity().getImsi() AND 值2
     * @param imsiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiNotBetween(String imsiEnd){
        String imsi =entity().getImsi();
        if(imsi!=null && imsiEnd!=null){
            notBetween("imsi",imsi,imsiEnd);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * BETWEEN  entity().getImsi() AND 值2
     * @param imsiStart       值1
     * @param imsiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiBetween(String imsiStart,String imsiEnd){
        String imsi =entity().getImsi();
        if(imsi!=null && imsiEnd!=null){
            between("imsi",imsiStart,imsiEnd);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * NOT BETWEEN  entity().getImsi() AND 值2
     * @param imsiStart       值1
     * @param imsiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiNotBetween(String imsiStart,String imsiEnd){
        String imsi =entity().getImsi();
        if(imsi!=null && imsiEnd!=null){
            notBetween("imsi",imsiStart,imsiEnd);
        }
        return this;
     }


    /**
     * <p>国际移动用户识别码</p>
     * LIKE '%值%' entity().getImsi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiLike(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            like("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * NOT LIKE '%值%' entity().getImsi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiNotLike(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            notLike("imsi",imsi);
        }
        return this;
     }


    /**
     * <p>国际移动用户识别码</p>
     * LIKE '%值' entity().getImsi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiLikeLeft(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            likeLeft("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * LIKE '值%' entity().getImsi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiLikeRight(){
        String imsi =entity().getImsi();
        if(imsi!=null){
            likeRight("imsi",imsi);
        }
        return this;
     }

/**
     * <p>国际移动用户识别码</p>
     * 等于 =
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiEq(String imsi){
        if(imsi!=null){
            eq("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * 不等于 &lt;&gt;
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiNe(String imsi){
        if(imsi!=null){
            ne("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * 大于 &gt;
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiGt(String imsi){
        if(imsi!=null){
            gt("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * 大于等于 &gt;=
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiGe(String imsi){
        if(imsi!=null){
            ge("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * 小于 &lt;
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiLt(String imsi){
        if(imsi!=null){
            lt("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * 小于等于 &lt;=
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiLe(String imsi){
        if(imsi!=null){
            le("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * LIKE '%值%'
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiLike(String imsi){
        if(imsi!=null){
            like("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * NOT LIKE '%值%'
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiNotLike(String imsi){
        if(imsi!=null){
            notLike("imsi",imsi);
        }
        return this;
    }


    /**
     * <p>国际移动用户识别码</p>
     * LIKE '%值'
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiLikeLeft(String imsi){
        if(imsi!=null){
            likeLeft("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * LIKE '值%'
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiLikeRight(String imsi){
        if(imsi!=null){
            likeRight("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiIsNull(){
        isNull("imsi");
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiIsNotNull(){
        isNotNull("imsi");
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("imsi",value);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiIn(String... values){
        if(values!=null && values.length>0){
            in("imsi",values);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("imsi",value);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper imsiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("imsi",values);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * 等于 = entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrEq(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            eq("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * 不等于 &lt;&gt; entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrNe(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            ne("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 大于 &gt; entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrGt(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            gt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 大于等于 &gt;= entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrGe(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            ge("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 小于 &lt; entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrLt(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            lt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 小于等于 &lt;= entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrLe(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            le("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrBetween(String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            between("mac_addr",macAddr,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * NOT BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrNotBetween(String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            notBetween("mac_addr",macAddr,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrBetween(String macAddrStart,String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            between("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * NOT BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrNotBetween(String macAddrStart,String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            notBetween("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }


    /**
     * <p>macAddr</p>
     * LIKE '%值%' entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrLike(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            like("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * NOT LIKE '%值%' entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrNotLike(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            notLike("mac_addr",macAddr);
        }
        return this;
     }


    /**
     * <p>macAddr</p>
     * LIKE '%值' entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrLikeLeft(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            likeLeft("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * LIKE '值%' entity().getMacAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrLikeRight(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            likeRight("mac_addr",macAddr);
        }
        return this;
     }

/**
     * <p>macAddr</p>
     * 等于 =
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrEq(String macAddr){
        if(macAddr!=null){
            eq("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * 不等于 &lt;&gt;
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrNe(String macAddr){
        if(macAddr!=null){
            ne("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * 大于 &gt;
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrGt(String macAddr){
        if(macAddr!=null){
            gt("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * 大于等于 &gt;=
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrGe(String macAddr){
        if(macAddr!=null){
            ge("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * 小于 &lt;
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrLt(String macAddr){
        if(macAddr!=null){
            lt("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * 小于等于 &lt;=
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrLe(String macAddr){
        if(macAddr!=null){
            le("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * LIKE '%值%'
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrLike(String macAddr){
        if(macAddr!=null){
            like("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * NOT LIKE '%值%'
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrNotLike(String macAddr){
        if(macAddr!=null){
            notLike("mac_addr",macAddr);
        }
        return this;
    }


    /**
     * <p>macAddr</p>
     * LIKE '%值'
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrLikeLeft(String macAddr){
        if(macAddr!=null){
            likeLeft("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * LIKE '值%'
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrLikeRight(String macAddr){
        if(macAddr!=null){
            likeRight("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrIsNull(){
        isNull("mac_addr");
        return this;
    }

    /**
     * <p>macAddr</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrIsNotNull(){
        isNotNull("mac_addr");
        return this;
    }

    /**
     * <p>macAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("mac_addr",value);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrIn(String... values){
        if(values!=null && values.length>0){
            in("mac_addr",values);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("mac_addr",value);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper macAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("mac_addr",values);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * 等于 = entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrEq(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * 不等于 &lt;&gt; entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrNe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 大于 &gt; entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrGt(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 大于等于 &gt;= entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrGe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 小于 &lt; entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrLt(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 小于等于 &lt;= entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrLe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrBetween(String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddr,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * NOT BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrNotBetween(String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddr,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * NOT BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }


    /**
     * <p>internalAddr</p>
     * LIKE '%值%' entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrLike(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * NOT LIKE '%值%' entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrNotLike(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
     }


    /**
     * <p>internalAddr</p>
     * LIKE '%值' entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrLikeLeft(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * LIKE '值%' entity().getInternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrLikeRight(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            likeRight("internal_addr",internalAddr);
        }
        return this;
     }

/**
     * <p>internalAddr</p>
     * 等于 =
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrEq(String internalAddr){
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * 不等于 &lt;&gt;
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrNe(String internalAddr){
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * 大于 &gt;
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrGt(String internalAddr){
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * 大于等于 &gt;=
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrGe(String internalAddr){
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * 小于 &lt;
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrLt(String internalAddr){
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * 小于等于 &lt;=
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrLe(String internalAddr){
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrLike(String internalAddr){
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * NOT LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrNotLike(String internalAddr){
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
    }


    /**
     * <p>internalAddr</p>
     * LIKE '%值'
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrLikeLeft(String internalAddr){
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * LIKE '值%'
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrLikeRight(String internalAddr){
        if(internalAddr!=null){
            likeRight("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>internalAddr</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>internalAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("internal_addr",value);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrIn(String... values){
        if(values!=null && values.length>0){
            in("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_addr",value);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper internalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * 等于 = entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrEq(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * 不等于 &lt;&gt; entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrNe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 大于 &gt; entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrGt(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 大于等于 &gt;= entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrGe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 小于 &lt; entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrLt(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 小于等于 &lt;= entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrLe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrBetween(String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            between("external_addr",externalAddr,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * NOT BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrNotBetween(String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddr,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            between("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * NOT BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }


    /**
     * <p>externalAddr</p>
     * LIKE '%值%' entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrLike(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * NOT LIKE '%值%' entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrNotLike(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
     }


    /**
     * <p>externalAddr</p>
     * LIKE '%值' entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrLikeLeft(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * LIKE '值%' entity().getExternalAddr()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrLikeRight(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            likeRight("external_addr",externalAddr);
        }
        return this;
     }

/**
     * <p>externalAddr</p>
     * 等于 =
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrEq(String externalAddr){
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * 不等于 &lt;&gt;
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrNe(String externalAddr){
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * 大于 &gt;
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrGt(String externalAddr){
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * 大于等于 &gt;=
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrGe(String externalAddr){
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * 小于 &lt;
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrLt(String externalAddr){
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * 小于等于 &lt;=
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrLe(String externalAddr){
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrLike(String externalAddr){
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * NOT LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrNotLike(String externalAddr){
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
    }


    /**
     * <p>externalAddr</p>
     * LIKE '%值'
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrLikeLeft(String externalAddr){
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * LIKE '值%'
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrLikeRight(String externalAddr){
        if(externalAddr!=null){
            likeRight("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>externalAddr</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>externalAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("external_addr",value);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrIn(String... values){
        if(values!=null && values.length>0){
            in("external_addr",values);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_addr",value);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper externalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_addr",values);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * 等于 = entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeEq(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            eq("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * 不等于 &lt;&gt; entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeNe(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            ne("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 大于 &gt; entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeGt(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            gt("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 大于等于 &gt;= entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeGe(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            ge("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 小于 &lt; entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeLt(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            lt("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 小于等于 &lt;= entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeLe(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            le("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * BETWEEN  entity().getProvinceCcode() AND 值2
     * @param provinceCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeBetween(Long provinceCcodeEnd){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null && provinceCcodeEnd!=null){
            between("province_ccode",provinceCcode,provinceCcodeEnd);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * NOT BETWEEN  entity().getProvinceCcode() AND 值2
     * @param provinceCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeNotBetween(Long provinceCcodeEnd){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null && provinceCcodeEnd!=null){
            notBetween("province_ccode",provinceCcode,provinceCcodeEnd);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * BETWEEN  entity().getProvinceCcode() AND 值2
     * @param provinceCcodeStart       值1
     * @param provinceCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeBetween(Long provinceCcodeStart,Long provinceCcodeEnd){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null && provinceCcodeEnd!=null){
            between("province_ccode",provinceCcodeStart,provinceCcodeEnd);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * NOT BETWEEN  entity().getProvinceCcode() AND 值2
     * @param provinceCcodeStart       值1
     * @param provinceCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeNotBetween(Long provinceCcodeStart,Long provinceCcodeEnd){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null && provinceCcodeEnd!=null){
            notBetween("province_ccode",provinceCcodeStart,provinceCcodeEnd);
        }
        return this;
     }


    /**
     * <p>省份ccode</p>
     * LIKE '%值%' entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeLike(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            like("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * NOT LIKE '%值%' entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeNotLike(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            notLike("province_ccode",provinceCcode);
        }
        return this;
     }


    /**
     * <p>省份ccode</p>
     * LIKE '%值' entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeLikeLeft(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            likeLeft("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * LIKE '值%' entity().getProvinceCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeLikeRight(){
        Long provinceCcode =entity().getProvinceCcode();
        if(provinceCcode!=null){
            likeRight("province_ccode",provinceCcode);
        }
        return this;
     }

/**
     * <p>省份ccode</p>
     * 等于 =
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeEq(Long provinceCcode){
        if(provinceCcode!=null){
            eq("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * 不等于 &lt;&gt;
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeNe(Long provinceCcode){
        if(provinceCcode!=null){
            ne("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * 大于 &gt;
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeGt(Long provinceCcode){
        if(provinceCcode!=null){
            gt("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * 大于等于 &gt;=
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeGe(Long provinceCcode){
        if(provinceCcode!=null){
            ge("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * 小于 &lt;
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeLt(Long provinceCcode){
        if(provinceCcode!=null){
            lt("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * 小于等于 &lt;=
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeLe(Long provinceCcode){
        if(provinceCcode!=null){
            le("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * LIKE '%值%'
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeLike(Long provinceCcode){
        if(provinceCcode!=null){
            like("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * NOT LIKE '%值%'
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeNotLike(Long provinceCcode){
        if(provinceCcode!=null){
            notLike("province_ccode",provinceCcode);
        }
        return this;
    }


    /**
     * <p>省份ccode</p>
     * LIKE '%值'
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeLikeLeft(Long provinceCcode){
        if(provinceCcode!=null){
            likeLeft("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * LIKE '值%'
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeLikeRight(Long provinceCcode){
        if(provinceCcode!=null){
            likeRight("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeIsNull(){
        isNull("province_ccode");
        return this;
    }

    /**
     * <p>省份ccode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeIsNotNull(){
        isNotNull("province_ccode");
        return this;
    }

    /**
     * <p>省份ccode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("province_ccode",value);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeIn(Long... values){
        if(values!=null && values.length>0){
            in("province_ccode",values);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("province_ccode",value);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceCcodeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("province_ccode",values);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * 等于 = entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameEq(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            eq("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * 不等于 &lt;&gt; entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameNe(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            ne("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 大于 &gt; entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameGt(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            gt("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 大于等于 &gt;= entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameGe(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            ge("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 小于 &lt; entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameLt(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            lt("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 小于等于 &lt;= entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameLe(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            le("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * BETWEEN  entity().getProvinceName() AND 值2
     * @param provinceNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameBetween(String provinceNameEnd){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null && provinceNameEnd!=null){
            between("province_name",provinceName,provinceNameEnd);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * NOT BETWEEN  entity().getProvinceName() AND 值2
     * @param provinceNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameNotBetween(String provinceNameEnd){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null && provinceNameEnd!=null){
            notBetween("province_name",provinceName,provinceNameEnd);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * BETWEEN  entity().getProvinceName() AND 值2
     * @param provinceNameStart       值1
     * @param provinceNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameBetween(String provinceNameStart,String provinceNameEnd){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null && provinceNameEnd!=null){
            between("province_name",provinceNameStart,provinceNameEnd);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * NOT BETWEEN  entity().getProvinceName() AND 值2
     * @param provinceNameStart       值1
     * @param provinceNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameNotBetween(String provinceNameStart,String provinceNameEnd){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null && provinceNameEnd!=null){
            notBetween("province_name",provinceNameStart,provinceNameEnd);
        }
        return this;
     }


    /**
     * <p>省份名称</p>
     * LIKE '%值%' entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameLike(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            like("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * NOT LIKE '%值%' entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameNotLike(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            notLike("province_name",provinceName);
        }
        return this;
     }


    /**
     * <p>省份名称</p>
     * LIKE '%值' entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameLikeLeft(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            likeLeft("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * LIKE '值%' entity().getProvinceName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameLikeRight(){
        String provinceName =entity().getProvinceName();
        if(provinceName!=null){
            likeRight("province_name",provinceName);
        }
        return this;
     }

/**
     * <p>省份名称</p>
     * 等于 =
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameEq(String provinceName){
        if(provinceName!=null){
            eq("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * 不等于 &lt;&gt;
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameNe(String provinceName){
        if(provinceName!=null){
            ne("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * 大于 &gt;
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameGt(String provinceName){
        if(provinceName!=null){
            gt("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * 大于等于 &gt;=
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameGe(String provinceName){
        if(provinceName!=null){
            ge("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * 小于 &lt;
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameLt(String provinceName){
        if(provinceName!=null){
            lt("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * 小于等于 &lt;=
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameLe(String provinceName){
        if(provinceName!=null){
            le("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * LIKE '%值%'
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameLike(String provinceName){
        if(provinceName!=null){
            like("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * NOT LIKE '%值%'
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameNotLike(String provinceName){
        if(provinceName!=null){
            notLike("province_name",provinceName);
        }
        return this;
    }


    /**
     * <p>省份名称</p>
     * LIKE '%值'
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameLikeLeft(String provinceName){
        if(provinceName!=null){
            likeLeft("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * LIKE '值%'
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameLikeRight(String provinceName){
        if(provinceName!=null){
            likeRight("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameIsNull(){
        isNull("province_name");
        return this;
    }

    /**
     * <p>省份名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameIsNotNull(){
        isNotNull("province_name");
        return this;
    }

    /**
     * <p>省份名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("province_name",value);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameIn(String... values){
        if(values!=null && values.length>0){
            in("province_name",values);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("province_name",value);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper provinceNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("province_name",values);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * 等于 = entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeEq(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            eq("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * 不等于 &lt;&gt; entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeNe(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            ne("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 大于 &gt; entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeGt(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            gt("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 大于等于 &gt;= entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeGe(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            ge("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 小于 &lt; entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeLt(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            lt("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 小于等于 &lt;= entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeLe(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            le("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * BETWEEN  entity().getCityCcode() AND 值2
     * @param cityCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeBetween(Long cityCcodeEnd){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null && cityCcodeEnd!=null){
            between("city_ccode",cityCcode,cityCcodeEnd);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * NOT BETWEEN  entity().getCityCcode() AND 值2
     * @param cityCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeNotBetween(Long cityCcodeEnd){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null && cityCcodeEnd!=null){
            notBetween("city_ccode",cityCcode,cityCcodeEnd);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * BETWEEN  entity().getCityCcode() AND 值2
     * @param cityCcodeStart       值1
     * @param cityCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeBetween(Long cityCcodeStart,Long cityCcodeEnd){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null && cityCcodeEnd!=null){
            between("city_ccode",cityCcodeStart,cityCcodeEnd);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * NOT BETWEEN  entity().getCityCcode() AND 值2
     * @param cityCcodeStart       值1
     * @param cityCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeNotBetween(Long cityCcodeStart,Long cityCcodeEnd){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null && cityCcodeEnd!=null){
            notBetween("city_ccode",cityCcodeStart,cityCcodeEnd);
        }
        return this;
     }


    /**
     * <p>城市ccode</p>
     * LIKE '%值%' entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeLike(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            like("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * NOT LIKE '%值%' entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeNotLike(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            notLike("city_ccode",cityCcode);
        }
        return this;
     }


    /**
     * <p>城市ccode</p>
     * LIKE '%值' entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeLikeLeft(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            likeLeft("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * LIKE '值%' entity().getCityCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeLikeRight(){
        Long cityCcode =entity().getCityCcode();
        if(cityCcode!=null){
            likeRight("city_ccode",cityCcode);
        }
        return this;
     }

/**
     * <p>城市ccode</p>
     * 等于 =
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeEq(Long cityCcode){
        if(cityCcode!=null){
            eq("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * 不等于 &lt;&gt;
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeNe(Long cityCcode){
        if(cityCcode!=null){
            ne("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * 大于 &gt;
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeGt(Long cityCcode){
        if(cityCcode!=null){
            gt("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * 大于等于 &gt;=
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeGe(Long cityCcode){
        if(cityCcode!=null){
            ge("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * 小于 &lt;
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeLt(Long cityCcode){
        if(cityCcode!=null){
            lt("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * 小于等于 &lt;=
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeLe(Long cityCcode){
        if(cityCcode!=null){
            le("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * LIKE '%值%'
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeLike(Long cityCcode){
        if(cityCcode!=null){
            like("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * NOT LIKE '%值%'
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeNotLike(Long cityCcode){
        if(cityCcode!=null){
            notLike("city_ccode",cityCcode);
        }
        return this;
    }


    /**
     * <p>城市ccode</p>
     * LIKE '%值'
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeLikeLeft(Long cityCcode){
        if(cityCcode!=null){
            likeLeft("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * LIKE '值%'
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeLikeRight(Long cityCcode){
        if(cityCcode!=null){
            likeRight("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeIsNull(){
        isNull("city_ccode");
        return this;
    }

    /**
     * <p>城市ccode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeIsNotNull(){
        isNotNull("city_ccode");
        return this;
    }

    /**
     * <p>城市ccode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("city_ccode",value);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeIn(Long... values){
        if(values!=null && values.length>0){
            in("city_ccode",values);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("city_ccode",value);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityCcodeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("city_ccode",values);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * 等于 = entity().getCityName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameEq(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            eq("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * 不等于 &lt;&gt; entity().getCityName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameNe(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            ne("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 大于 &gt; entity().getCityName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameGt(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            gt("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 大于等于 &gt;= entity().getCityName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameGe(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            ge("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 小于 &lt; entity().getCityName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameLt(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            lt("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 小于等于 &lt;= entity().getCityName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameLe(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            le("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * BETWEEN  entity().getCityName() AND 值2
     * @param cityNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameBetween(String cityNameEnd){
        String cityName =entity().getCityName();
        if(cityName!=null && cityNameEnd!=null){
            between("city_name",cityName,cityNameEnd);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * NOT BETWEEN  entity().getCityName() AND 值2
     * @param cityNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameNotBetween(String cityNameEnd){
        String cityName =entity().getCityName();
        if(cityName!=null && cityNameEnd!=null){
            notBetween("city_name",cityName,cityNameEnd);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * BETWEEN  entity().getCityName() AND 值2
     * @param cityNameStart       值1
     * @param cityNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameBetween(String cityNameStart,String cityNameEnd){
        String cityName =entity().getCityName();
        if(cityName!=null && cityNameEnd!=null){
            between("city_name",cityNameStart,cityNameEnd);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * NOT BETWEEN  entity().getCityName() AND 值2
     * @param cityNameStart       值1
     * @param cityNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameNotBetween(String cityNameStart,String cityNameEnd){
        String cityName =entity().getCityName();
        if(cityName!=null && cityNameEnd!=null){
            notBetween("city_name",cityNameStart,cityNameEnd);
        }
        return this;
     }


    /**
     * <p>城市名称</p>
     * LIKE '%值%' entity().getCityName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameLike(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            like("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * NOT LIKE '%值%' entity().getCityName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameNotLike(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            notLike("city_name",cityName);
        }
        return this;
     }


    /**
     * <p>城市名称</p>
     * LIKE '%值' entity().getCityName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameLikeLeft(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            likeLeft("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * LIKE '值%' entity().getCityName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameLikeRight(){
        String cityName =entity().getCityName();
        if(cityName!=null){
            likeRight("city_name",cityName);
        }
        return this;
     }

/**
     * <p>城市名称</p>
     * 等于 =
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameEq(String cityName){
        if(cityName!=null){
            eq("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * 不等于 &lt;&gt;
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameNe(String cityName){
        if(cityName!=null){
            ne("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * 大于 &gt;
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameGt(String cityName){
        if(cityName!=null){
            gt("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * 大于等于 &gt;=
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameGe(String cityName){
        if(cityName!=null){
            ge("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * 小于 &lt;
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameLt(String cityName){
        if(cityName!=null){
            lt("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * 小于等于 &lt;=
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameLe(String cityName){
        if(cityName!=null){
            le("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * LIKE '%值%'
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameLike(String cityName){
        if(cityName!=null){
            like("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * NOT LIKE '%值%'
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameNotLike(String cityName){
        if(cityName!=null){
            notLike("city_name",cityName);
        }
        return this;
    }


    /**
     * <p>城市名称</p>
     * LIKE '%值'
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameLikeLeft(String cityName){
        if(cityName!=null){
            likeLeft("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * LIKE '值%'
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameLikeRight(String cityName){
        if(cityName!=null){
            likeRight("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameIsNull(){
        isNull("city_name");
        return this;
    }

    /**
     * <p>城市名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameIsNotNull(){
        isNotNull("city_name");
        return this;
    }

    /**
     * <p>城市名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("city_name",value);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameIn(String... values){
        if(values!=null && values.length>0){
            in("city_name",values);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("city_name",value);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper cityNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("city_name",values);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * 等于 = entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeEq(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            eq("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * 不等于 &lt;&gt; entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeNe(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            ne("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 大于 &gt; entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeGt(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            gt("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 大于等于 &gt;= entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeGe(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            ge("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 小于 &lt; entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeLt(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            lt("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 小于等于 &lt;= entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeLe(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            le("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * BETWEEN  entity().getAreaCcode() AND 值2
     * @param areaCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeBetween(Long areaCcodeEnd){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null && areaCcodeEnd!=null){
            between("area_ccode",areaCcode,areaCcodeEnd);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * NOT BETWEEN  entity().getAreaCcode() AND 值2
     * @param areaCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeNotBetween(Long areaCcodeEnd){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null && areaCcodeEnd!=null){
            notBetween("area_ccode",areaCcode,areaCcodeEnd);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * BETWEEN  entity().getAreaCcode() AND 值2
     * @param areaCcodeStart       值1
     * @param areaCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeBetween(Long areaCcodeStart,Long areaCcodeEnd){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null && areaCcodeEnd!=null){
            between("area_ccode",areaCcodeStart,areaCcodeEnd);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * NOT BETWEEN  entity().getAreaCcode() AND 值2
     * @param areaCcodeStart       值1
     * @param areaCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeNotBetween(Long areaCcodeStart,Long areaCcodeEnd){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null && areaCcodeEnd!=null){
            notBetween("area_ccode",areaCcodeStart,areaCcodeEnd);
        }
        return this;
     }


    /**
     * <p>地区ccode</p>
     * LIKE '%值%' entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeLike(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            like("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * NOT LIKE '%值%' entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeNotLike(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            notLike("area_ccode",areaCcode);
        }
        return this;
     }


    /**
     * <p>地区ccode</p>
     * LIKE '%值' entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeLikeLeft(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            likeLeft("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * LIKE '值%' entity().getAreaCcode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeLikeRight(){
        Long areaCcode =entity().getAreaCcode();
        if(areaCcode!=null){
            likeRight("area_ccode",areaCcode);
        }
        return this;
     }

/**
     * <p>地区ccode</p>
     * 等于 =
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeEq(Long areaCcode){
        if(areaCcode!=null){
            eq("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * 不等于 &lt;&gt;
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeNe(Long areaCcode){
        if(areaCcode!=null){
            ne("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * 大于 &gt;
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeGt(Long areaCcode){
        if(areaCcode!=null){
            gt("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * 大于等于 &gt;=
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeGe(Long areaCcode){
        if(areaCcode!=null){
            ge("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * 小于 &lt;
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeLt(Long areaCcode){
        if(areaCcode!=null){
            lt("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * 小于等于 &lt;=
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeLe(Long areaCcode){
        if(areaCcode!=null){
            le("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * LIKE '%值%'
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeLike(Long areaCcode){
        if(areaCcode!=null){
            like("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * NOT LIKE '%值%'
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeNotLike(Long areaCcode){
        if(areaCcode!=null){
            notLike("area_ccode",areaCcode);
        }
        return this;
    }


    /**
     * <p>地区ccode</p>
     * LIKE '%值'
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeLikeLeft(Long areaCcode){
        if(areaCcode!=null){
            likeLeft("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * LIKE '值%'
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeLikeRight(Long areaCcode){
        if(areaCcode!=null){
            likeRight("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeIsNull(){
        isNull("area_ccode");
        return this;
    }

    /**
     * <p>地区ccode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeIsNotNull(){
        isNotNull("area_ccode");
        return this;
    }

    /**
     * <p>地区ccode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("area_ccode",value);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeIn(Long... values){
        if(values!=null && values.length>0){
            in("area_ccode",values);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("area_ccode",value);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaCcodeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("area_ccode",values);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * 等于 = entity().getAreaName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameEq(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            eq("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * 不等于 &lt;&gt; entity().getAreaName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameNe(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            ne("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 大于 &gt; entity().getAreaName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameGt(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            gt("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 大于等于 &gt;= entity().getAreaName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameGe(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            ge("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 小于 &lt; entity().getAreaName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameLt(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            lt("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 小于等于 &lt;= entity().getAreaName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameLe(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            le("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * BETWEEN  entity().getAreaName() AND 值2
     * @param areaNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameBetween(String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            between("area_name",areaName,areaNameEnd);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * NOT BETWEEN  entity().getAreaName() AND 值2
     * @param areaNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameNotBetween(String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            notBetween("area_name",areaName,areaNameEnd);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * BETWEEN  entity().getAreaName() AND 值2
     * @param areaNameStart       值1
     * @param areaNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameBetween(String areaNameStart,String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            between("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * NOT BETWEEN  entity().getAreaName() AND 值2
     * @param areaNameStart       值1
     * @param areaNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameNotBetween(String areaNameStart,String areaNameEnd){
        String areaName =entity().getAreaName();
        if(areaName!=null && areaNameEnd!=null){
            notBetween("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }


    /**
     * <p>地区名称</p>
     * LIKE '%值%' entity().getAreaName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameLike(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            like("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * NOT LIKE '%值%' entity().getAreaName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameNotLike(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            notLike("area_name",areaName);
        }
        return this;
     }


    /**
     * <p>地区名称</p>
     * LIKE '%值' entity().getAreaName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameLikeLeft(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            likeLeft("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * LIKE '值%' entity().getAreaName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameLikeRight(){
        String areaName =entity().getAreaName();
        if(areaName!=null){
            likeRight("area_name",areaName);
        }
        return this;
     }

/**
     * <p>地区名称</p>
     * 等于 =
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameEq(String areaName){
        if(areaName!=null){
            eq("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * 不等于 &lt;&gt;
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameNe(String areaName){
        if(areaName!=null){
            ne("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * 大于 &gt;
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameGt(String areaName){
        if(areaName!=null){
            gt("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * 大于等于 &gt;=
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameGe(String areaName){
        if(areaName!=null){
            ge("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * 小于 &lt;
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameLt(String areaName){
        if(areaName!=null){
            lt("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * 小于等于 &lt;=
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameLe(String areaName){
        if(areaName!=null){
            le("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * LIKE '%值%'
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameLike(String areaName){
        if(areaName!=null){
            like("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * NOT LIKE '%值%'
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameNotLike(String areaName){
        if(areaName!=null){
            notLike("area_name",areaName);
        }
        return this;
    }


    /**
     * <p>地区名称</p>
     * LIKE '%值'
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameLikeLeft(String areaName){
        if(areaName!=null){
            likeLeft("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * LIKE '值%'
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameLikeRight(String areaName){
        if(areaName!=null){
            likeRight("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameIsNull(){
        isNull("area_name");
        return this;
    }

    /**
     * <p>地区名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameIsNotNull(){
        isNotNull("area_name");
        return this;
    }

    /**
     * <p>地区名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("area_name",value);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameIn(String... values){
        if(values!=null && values.length>0){
            in("area_name",values);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("area_name",value);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper areaNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("area_name",values);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 等于 = entity().getRegionName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameEq(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            eq("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 不等于 &lt;&gt; entity().getRegionName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameNe(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            ne("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 大于 &gt; entity().getRegionName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameGt(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            gt("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 大于等于 &gt;= entity().getRegionName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameGe(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            ge("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 小于 &lt; entity().getRegionName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameLt(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            lt("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 小于等于 &lt;= entity().getRegionName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameLe(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            le("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * BETWEEN  entity().getRegionName() AND 值2
     * @param regionNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameBetween(String regionNameEnd){
        String regionName =entity().getRegionName();
        if(regionName!=null && regionNameEnd!=null){
            between("region_name",regionName,regionNameEnd);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT BETWEEN  entity().getRegionName() AND 值2
     * @param regionNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameNotBetween(String regionNameEnd){
        String regionName =entity().getRegionName();
        if(regionName!=null && regionNameEnd!=null){
            notBetween("region_name",regionName,regionNameEnd);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * BETWEEN  entity().getRegionName() AND 值2
     * @param regionNameStart       值1
     * @param regionNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameBetween(String regionNameStart,String regionNameEnd){
        String regionName =entity().getRegionName();
        if(regionName!=null && regionNameEnd!=null){
            between("region_name",regionNameStart,regionNameEnd);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT BETWEEN  entity().getRegionName() AND 值2
     * @param regionNameStart       值1
     * @param regionNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameNotBetween(String regionNameStart,String regionNameEnd){
        String regionName =entity().getRegionName();
        if(regionName!=null && regionNameEnd!=null){
            notBetween("region_name",regionNameStart,regionNameEnd);
        }
        return this;
     }


    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '%值%' entity().getRegionName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameLike(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            like("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT LIKE '%值%' entity().getRegionName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameNotLike(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            notLike("region_name",regionName);
        }
        return this;
     }


    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '%值' entity().getRegionName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameLikeLeft(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            likeLeft("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '值%' entity().getRegionName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameLikeRight(){
        String regionName =entity().getRegionName();
        if(regionName!=null){
            likeRight("region_name",regionName);
        }
        return this;
     }

/**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 等于 =
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameEq(String regionName){
        if(regionName!=null){
            eq("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 不等于 &lt;&gt;
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameNe(String regionName){
        if(regionName!=null){
            ne("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 大于 &gt;
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameGt(String regionName){
        if(regionName!=null){
            gt("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 大于等于 &gt;=
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameGe(String regionName){
        if(regionName!=null){
            ge("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 小于 &lt;
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameLt(String regionName){
        if(regionName!=null){
            lt("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 小于等于 &lt;=
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameLe(String regionName){
        if(regionName!=null){
            le("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '%值%'
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameLike(String regionName){
        if(regionName!=null){
            like("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT LIKE '%值%'
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameNotLike(String regionName){
        if(regionName!=null){
            notLike("region_name",regionName);
        }
        return this;
    }


    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '%值'
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameLikeLeft(String regionName){
        if(regionName!=null){
            likeLeft("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '值%'
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameLikeRight(String regionName){
        if(regionName!=null){
            likeRight("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameIsNull(){
        isNull("region_name");
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameIsNotNull(){
        isNotNull("region_name");
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("region_name",value);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameIn(String... values){
        if(values!=null && values.length>0){
            in("region_name",values);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("region_name",value);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper regionNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region_name",values);
        }
        return this;
    }

    /**
     * <p>location</p>
     * 等于 = entity().getLocation()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationEq(){
        String location =entity().getLocation();
        if(location!=null){
            eq("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * 不等于 &lt;&gt; entity().getLocation()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationNe(){
        String location =entity().getLocation();
        if(location!=null){
            ne("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 大于 &gt; entity().getLocation()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationGt(){
        String location =entity().getLocation();
        if(location!=null){
            gt("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 大于等于 &gt;= entity().getLocation()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationGe(){
        String location =entity().getLocation();
        if(location!=null){
            ge("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 小于 &lt; entity().getLocation()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationLt(){
        String location =entity().getLocation();
        if(location!=null){
            lt("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 小于等于 &lt;= entity().getLocation()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationLe(){
        String location =entity().getLocation();
        if(location!=null){
            le("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * BETWEEN  entity().getLocation() AND 值2
     * @param locationEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationBetween(String locationEnd){
        String location =entity().getLocation();
        if(location!=null && locationEnd!=null){
            between("location",location,locationEnd);
        }
        return this;
     }

    /**
     * <p>location</p>
     * NOT BETWEEN  entity().getLocation() AND 值2
     * @param locationEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationNotBetween(String locationEnd){
        String location =entity().getLocation();
        if(location!=null && locationEnd!=null){
            notBetween("location",location,locationEnd);
        }
        return this;
     }

    /**
     * <p>location</p>
     * BETWEEN  entity().getLocation() AND 值2
     * @param locationStart       值1
     * @param locationEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationBetween(String locationStart,String locationEnd){
        String location =entity().getLocation();
        if(location!=null && locationEnd!=null){
            between("location",locationStart,locationEnd);
        }
        return this;
     }

    /**
     * <p>location</p>
     * NOT BETWEEN  entity().getLocation() AND 值2
     * @param locationStart       值1
     * @param locationEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationNotBetween(String locationStart,String locationEnd){
        String location =entity().getLocation();
        if(location!=null && locationEnd!=null){
            notBetween("location",locationStart,locationEnd);
        }
        return this;
     }


    /**
     * <p>location</p>
     * LIKE '%值%' entity().getLocation()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationLike(){
        String location =entity().getLocation();
        if(location!=null){
            like("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * NOT LIKE '%值%' entity().getLocation()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationNotLike(){
        String location =entity().getLocation();
        if(location!=null){
            notLike("location",location);
        }
        return this;
     }


    /**
     * <p>location</p>
     * LIKE '%值' entity().getLocation()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationLikeLeft(){
        String location =entity().getLocation();
        if(location!=null){
            likeLeft("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * LIKE '值%' entity().getLocation()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationLikeRight(){
        String location =entity().getLocation();
        if(location!=null){
            likeRight("location",location);
        }
        return this;
     }

/**
     * <p>location</p>
     * 等于 =
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationEq(String location){
        if(location!=null){
            eq("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * 不等于 &lt;&gt;
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationNe(String location){
        if(location!=null){
            ne("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * 大于 &gt;
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationGt(String location){
        if(location!=null){
            gt("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * 大于等于 &gt;=
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationGe(String location){
        if(location!=null){
            ge("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * 小于 &lt;
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationLt(String location){
        if(location!=null){
            lt("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * 小于等于 &lt;=
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationLe(String location){
        if(location!=null){
            le("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * LIKE '%值%'
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationLike(String location){
        if(location!=null){
            like("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * NOT LIKE '%值%'
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationNotLike(String location){
        if(location!=null){
            notLike("location",location);
        }
        return this;
    }


    /**
     * <p>location</p>
     * LIKE '%值'
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationLikeLeft(String location){
        if(location!=null){
            likeLeft("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * LIKE '值%'
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationLikeRight(String location){
        if(location!=null){
            likeRight("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationIsNull(){
        isNull("location");
        return this;
    }

    /**
     * <p>location</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationIsNotNull(){
        isNotNull("location");
        return this;
    }

    /**
     * <p>location</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("location",value);
        }
        return this;
    }

    /**
     * <p>location</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationIn(String... values){
        if(values!=null && values.length>0){
            in("location",values);
        }
        return this;
    }

    /**
     * <p>location</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("location",value);
        }
        return this;
    }

    /**
     * <p>location</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper locationNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("location",values);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * 等于 = entity().getProcessors()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsEq(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            eq("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * 不等于 &lt;&gt; entity().getProcessors()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsNe(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            ne("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 大于 &gt; entity().getProcessors()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsGt(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            gt("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 大于等于 &gt;= entity().getProcessors()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsGe(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            ge("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 小于 &lt; entity().getProcessors()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsLt(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            lt("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 小于等于 &lt;= entity().getProcessors()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsLe(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            le("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * BETWEEN  entity().getProcessors() AND 值2
     * @param processorsEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsBetween(Integer processorsEnd){
        Integer processors =entity().getProcessors();
        if(processors!=null && processorsEnd!=null){
            between("processors",processors,processorsEnd);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * NOT BETWEEN  entity().getProcessors() AND 值2
     * @param processorsEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsNotBetween(Integer processorsEnd){
        Integer processors =entity().getProcessors();
        if(processors!=null && processorsEnd!=null){
            notBetween("processors",processors,processorsEnd);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * BETWEEN  entity().getProcessors() AND 值2
     * @param processorsStart       值1
     * @param processorsEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsBetween(Integer processorsStart,Integer processorsEnd){
        Integer processors =entity().getProcessors();
        if(processors!=null && processorsEnd!=null){
            between("processors",processorsStart,processorsEnd);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * NOT BETWEEN  entity().getProcessors() AND 值2
     * @param processorsStart       值1
     * @param processorsEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsNotBetween(Integer processorsStart,Integer processorsEnd){
        Integer processors =entity().getProcessors();
        if(processors!=null && processorsEnd!=null){
            notBetween("processors",processorsStart,processorsEnd);
        }
        return this;
     }


    /**
     * <p>cpu线程数</p>
     * LIKE '%值%' entity().getProcessors()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsLike(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            like("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * NOT LIKE '%值%' entity().getProcessors()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsNotLike(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            notLike("processors",processors);
        }
        return this;
     }


    /**
     * <p>cpu线程数</p>
     * LIKE '%值' entity().getProcessors()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsLikeLeft(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            likeLeft("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * LIKE '值%' entity().getProcessors()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsLikeRight(){
        Integer processors =entity().getProcessors();
        if(processors!=null){
            likeRight("processors",processors);
        }
        return this;
     }

/**
     * <p>cpu线程数</p>
     * 等于 =
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsEq(Integer processors){
        if(processors!=null){
            eq("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * 不等于 &lt;&gt;
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsNe(Integer processors){
        if(processors!=null){
            ne("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * 大于 &gt;
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsGt(Integer processors){
        if(processors!=null){
            gt("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * 大于等于 &gt;=
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsGe(Integer processors){
        if(processors!=null){
            ge("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * 小于 &lt;
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsLt(Integer processors){
        if(processors!=null){
            lt("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * 小于等于 &lt;=
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsLe(Integer processors){
        if(processors!=null){
            le("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * LIKE '%值%'
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsLike(Integer processors){
        if(processors!=null){
            like("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * NOT LIKE '%值%'
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsNotLike(Integer processors){
        if(processors!=null){
            notLike("processors",processors);
        }
        return this;
    }


    /**
     * <p>cpu线程数</p>
     * LIKE '%值'
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsLikeLeft(Integer processors){
        if(processors!=null){
            likeLeft("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * LIKE '值%'
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsLikeRight(Integer processors){
        if(processors!=null){
            likeRight("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsIsNull(){
        isNull("processors");
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsIsNotNull(){
        isNotNull("processors");
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("processors",value);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsIn(Integer... values){
        if(values!=null && values.length>0){
            in("processors",values);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("processors",value);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper processorsNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("processors",values);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * 等于 = entity().getBuildId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdEq(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            eq("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * 不等于 &lt;&gt; entity().getBuildId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdNe(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            ne("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 大于 &gt; entity().getBuildId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdGt(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            gt("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 大于等于 &gt;= entity().getBuildId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdGe(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            ge("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 小于 &lt; entity().getBuildId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdLt(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            lt("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 小于等于 &lt;= entity().getBuildId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdLe(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            le("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * BETWEEN  entity().getBuildId() AND 值2
     * @param buildIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdBetween(String buildIdEnd){
        String buildId =entity().getBuildId();
        if(buildId!=null && buildIdEnd!=null){
            between("build_id",buildId,buildIdEnd);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * NOT BETWEEN  entity().getBuildId() AND 值2
     * @param buildIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdNotBetween(String buildIdEnd){
        String buildId =entity().getBuildId();
        if(buildId!=null && buildIdEnd!=null){
            notBetween("build_id",buildId,buildIdEnd);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * BETWEEN  entity().getBuildId() AND 值2
     * @param buildIdStart       值1
     * @param buildIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdBetween(String buildIdStart,String buildIdEnd){
        String buildId =entity().getBuildId();
        if(buildId!=null && buildIdEnd!=null){
            between("build_id",buildIdStart,buildIdEnd);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * NOT BETWEEN  entity().getBuildId() AND 值2
     * @param buildIdStart       值1
     * @param buildIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdNotBetween(String buildIdStart,String buildIdEnd){
        String buildId =entity().getBuildId();
        if(buildId!=null && buildIdEnd!=null){
            notBetween("build_id",buildIdStart,buildIdEnd);
        }
        return this;
     }


    /**
     * <p>修订版本号</p>
     * LIKE '%值%' entity().getBuildId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdLike(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            like("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * NOT LIKE '%值%' entity().getBuildId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdNotLike(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            notLike("build_id",buildId);
        }
        return this;
     }


    /**
     * <p>修订版本号</p>
     * LIKE '%值' entity().getBuildId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdLikeLeft(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            likeLeft("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * LIKE '值%' entity().getBuildId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdLikeRight(){
        String buildId =entity().getBuildId();
        if(buildId!=null){
            likeRight("build_id",buildId);
        }
        return this;
     }

/**
     * <p>修订版本号</p>
     * 等于 =
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdEq(String buildId){
        if(buildId!=null){
            eq("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * 不等于 &lt;&gt;
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdNe(String buildId){
        if(buildId!=null){
            ne("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * 大于 &gt;
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdGt(String buildId){
        if(buildId!=null){
            gt("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * 大于等于 &gt;=
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdGe(String buildId){
        if(buildId!=null){
            ge("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * 小于 &lt;
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdLt(String buildId){
        if(buildId!=null){
            lt("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * 小于等于 &lt;=
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdLe(String buildId){
        if(buildId!=null){
            le("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * LIKE '%值%'
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdLike(String buildId){
        if(buildId!=null){
            like("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * NOT LIKE '%值%'
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdNotLike(String buildId){
        if(buildId!=null){
            notLike("build_id",buildId);
        }
        return this;
    }


    /**
     * <p>修订版本号</p>
     * LIKE '%值'
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdLikeLeft(String buildId){
        if(buildId!=null){
            likeLeft("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * LIKE '值%'
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdLikeRight(String buildId){
        if(buildId!=null){
            likeRight("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdIsNull(){
        isNull("build_id");
        return this;
    }

    /**
     * <p>修订版本号</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdIsNotNull(){
        isNotNull("build_id");
        return this;
    }

    /**
     * <p>修订版本号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_id",value);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdIn(String... values){
        if(values!=null && values.length>0){
            in("build_id",values);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_id",value);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_id",values);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * 等于 = entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioEq(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            eq("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * 不等于 &lt;&gt; entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioNe(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            ne("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 大于 &gt; entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioGt(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            gt("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 大于等于 &gt;= entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioGe(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            ge("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 小于 &lt; entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioLt(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            lt("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 小于等于 &lt;= entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioLe(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            le("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * BETWEEN  entity().getBuildRadio() AND 值2
     * @param buildRadioEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioBetween(String buildRadioEnd){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null && buildRadioEnd!=null){
            between("build_radio",buildRadio,buildRadioEnd);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * NOT BETWEEN  entity().getBuildRadio() AND 值2
     * @param buildRadioEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioNotBetween(String buildRadioEnd){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null && buildRadioEnd!=null){
            notBetween("build_radio",buildRadio,buildRadioEnd);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * BETWEEN  entity().getBuildRadio() AND 值2
     * @param buildRadioStart       值1
     * @param buildRadioEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioBetween(String buildRadioStart,String buildRadioEnd){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null && buildRadioEnd!=null){
            between("build_radio",buildRadioStart,buildRadioEnd);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * NOT BETWEEN  entity().getBuildRadio() AND 值2
     * @param buildRadioStart       值1
     * @param buildRadioEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioNotBetween(String buildRadioStart,String buildRadioEnd){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null && buildRadioEnd!=null){
            notBetween("build_radio",buildRadioStart,buildRadioEnd);
        }
        return this;
     }


    /**
     * <p>build_radio</p>
     * LIKE '%值%' entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioLike(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            like("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * NOT LIKE '%值%' entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioNotLike(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            notLike("build_radio",buildRadio);
        }
        return this;
     }


    /**
     * <p>build_radio</p>
     * LIKE '%值' entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioLikeLeft(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            likeLeft("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * LIKE '值%' entity().getBuildRadio()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioLikeRight(){
        String buildRadio =entity().getBuildRadio();
        if(buildRadio!=null){
            likeRight("build_radio",buildRadio);
        }
        return this;
     }

/**
     * <p>build_radio</p>
     * 等于 =
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioEq(String buildRadio){
        if(buildRadio!=null){
            eq("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * 不等于 &lt;&gt;
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioNe(String buildRadio){
        if(buildRadio!=null){
            ne("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * 大于 &gt;
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioGt(String buildRadio){
        if(buildRadio!=null){
            gt("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * 大于等于 &gt;=
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioGe(String buildRadio){
        if(buildRadio!=null){
            ge("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * 小于 &lt;
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioLt(String buildRadio){
        if(buildRadio!=null){
            lt("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * 小于等于 &lt;=
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioLe(String buildRadio){
        if(buildRadio!=null){
            le("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * LIKE '%值%'
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioLike(String buildRadio){
        if(buildRadio!=null){
            like("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * NOT LIKE '%值%'
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioNotLike(String buildRadio){
        if(buildRadio!=null){
            notLike("build_radio",buildRadio);
        }
        return this;
    }


    /**
     * <p>build_radio</p>
     * LIKE '%值'
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioLikeLeft(String buildRadio){
        if(buildRadio!=null){
            likeLeft("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * LIKE '值%'
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioLikeRight(String buildRadio){
        if(buildRadio!=null){
            likeRight("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioIsNull(){
        isNull("build_radio");
        return this;
    }

    /**
     * <p>build_radio</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioIsNotNull(){
        isNotNull("build_radio");
        return this;
    }

    /**
     * <p>build_radio</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_radio",value);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioIn(String... values){
        if(values!=null && values.length>0){
            in("build_radio",values);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_radio",value);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildRadioNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_radio",values);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 等于 = entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelEq(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            eq("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 不等于 &lt;&gt; entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelNe(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            ne("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 大于 &gt; entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelGt(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            gt("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 大于等于 &gt;= entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelGe(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            ge("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 小于 &lt; entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelLt(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            lt("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 小于等于 &lt;= entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelLe(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            le("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * BETWEEN  entity().getBuildModel() AND 值2
     * @param buildModelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelBetween(String buildModelEnd){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null && buildModelEnd!=null){
            between("build_model",buildModel,buildModelEnd);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT BETWEEN  entity().getBuildModel() AND 值2
     * @param buildModelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelNotBetween(String buildModelEnd){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null && buildModelEnd!=null){
            notBetween("build_model",buildModel,buildModelEnd);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * BETWEEN  entity().getBuildModel() AND 值2
     * @param buildModelStart       值1
     * @param buildModelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelBetween(String buildModelStart,String buildModelEnd){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null && buildModelEnd!=null){
            between("build_model",buildModelStart,buildModelEnd);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT BETWEEN  entity().getBuildModel() AND 值2
     * @param buildModelStart       值1
     * @param buildModelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelNotBetween(String buildModelStart,String buildModelEnd){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null && buildModelEnd!=null){
            notBetween("build_model",buildModelStart,buildModelEnd);
        }
        return this;
     }


    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '%值%' entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelLike(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            like("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT LIKE '%值%' entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelNotLike(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            notLike("build_model",buildModel);
        }
        return this;
     }


    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '%值' entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelLikeLeft(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            likeLeft("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '值%' entity().getBuildModel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelLikeRight(){
        String buildModel =entity().getBuildModel();
        if(buildModel!=null){
            likeRight("build_model",buildModel);
        }
        return this;
     }

/**
     * <p>版本即最终用户可见的名称</p>
     * 等于 =
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelEq(String buildModel){
        if(buildModel!=null){
            eq("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 不等于 &lt;&gt;
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelNe(String buildModel){
        if(buildModel!=null){
            ne("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 大于 &gt;
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelGt(String buildModel){
        if(buildModel!=null){
            gt("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 大于等于 &gt;=
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelGe(String buildModel){
        if(buildModel!=null){
            ge("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 小于 &lt;
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelLt(String buildModel){
        if(buildModel!=null){
            lt("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 小于等于 &lt;=
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelLe(String buildModel){
        if(buildModel!=null){
            le("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '%值%'
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelLike(String buildModel){
        if(buildModel!=null){
            like("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT LIKE '%值%'
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelNotLike(String buildModel){
        if(buildModel!=null){
            notLike("build_model",buildModel);
        }
        return this;
    }


    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '%值'
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelLikeLeft(String buildModel){
        if(buildModel!=null){
            likeLeft("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '值%'
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelLikeRight(String buildModel){
        if(buildModel!=null){
            likeRight("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelIsNull(){
        isNull("build_model");
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelIsNotNull(){
        isNotNull("build_model");
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_model",value);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelIn(String... values){
        if(values!=null && values.length>0){
            in("build_model",values);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_model",value);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildModelNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_model",values);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * 等于 = entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerEq(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            eq("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * 不等于 &lt;&gt; entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerNe(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            ne("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 大于 &gt; entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerGt(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            gt("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 大于等于 &gt;= entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerGe(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            ge("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 小于 &lt; entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerLt(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            lt("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 小于等于 &lt;= entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerLe(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            le("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * BETWEEN  entity().getBuildManufacturer() AND 值2
     * @param buildManufacturerEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerBetween(String buildManufacturerEnd){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null && buildManufacturerEnd!=null){
            between("build_manufacturer",buildManufacturer,buildManufacturerEnd);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * NOT BETWEEN  entity().getBuildManufacturer() AND 值2
     * @param buildManufacturerEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerNotBetween(String buildManufacturerEnd){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null && buildManufacturerEnd!=null){
            notBetween("build_manufacturer",buildManufacturer,buildManufacturerEnd);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * BETWEEN  entity().getBuildManufacturer() AND 值2
     * @param buildManufacturerStart       值1
     * @param buildManufacturerEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerBetween(String buildManufacturerStart,String buildManufacturerEnd){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null && buildManufacturerEnd!=null){
            between("build_manufacturer",buildManufacturerStart,buildManufacturerEnd);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * NOT BETWEEN  entity().getBuildManufacturer() AND 值2
     * @param buildManufacturerStart       值1
     * @param buildManufacturerEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerNotBetween(String buildManufacturerStart,String buildManufacturerEnd){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null && buildManufacturerEnd!=null){
            notBetween("build_manufacturer",buildManufacturerStart,buildManufacturerEnd);
        }
        return this;
     }


    /**
     * <p>硬件制造商</p>
     * LIKE '%值%' entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerLike(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            like("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * NOT LIKE '%值%' entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerNotLike(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            notLike("build_manufacturer",buildManufacturer);
        }
        return this;
     }


    /**
     * <p>硬件制造商</p>
     * LIKE '%值' entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerLikeLeft(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            likeLeft("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * LIKE '值%' entity().getBuildManufacturer()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerLikeRight(){
        String buildManufacturer =entity().getBuildManufacturer();
        if(buildManufacturer!=null){
            likeRight("build_manufacturer",buildManufacturer);
        }
        return this;
     }

/**
     * <p>硬件制造商</p>
     * 等于 =
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerEq(String buildManufacturer){
        if(buildManufacturer!=null){
            eq("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * 不等于 &lt;&gt;
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerNe(String buildManufacturer){
        if(buildManufacturer!=null){
            ne("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * 大于 &gt;
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerGt(String buildManufacturer){
        if(buildManufacturer!=null){
            gt("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * 大于等于 &gt;=
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerGe(String buildManufacturer){
        if(buildManufacturer!=null){
            ge("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * 小于 &lt;
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerLt(String buildManufacturer){
        if(buildManufacturer!=null){
            lt("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * 小于等于 &lt;=
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerLe(String buildManufacturer){
        if(buildManufacturer!=null){
            le("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * LIKE '%值%'
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerLike(String buildManufacturer){
        if(buildManufacturer!=null){
            like("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * NOT LIKE '%值%'
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerNotLike(String buildManufacturer){
        if(buildManufacturer!=null){
            notLike("build_manufacturer",buildManufacturer);
        }
        return this;
    }


    /**
     * <p>硬件制造商</p>
     * LIKE '%值'
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerLikeLeft(String buildManufacturer){
        if(buildManufacturer!=null){
            likeLeft("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * LIKE '值%'
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerLikeRight(String buildManufacturer){
        if(buildManufacturer!=null){
            likeRight("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerIsNull(){
        isNull("build_manufacturer");
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerIsNotNull(){
        isNotNull("build_manufacturer");
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_manufacturer",value);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerIn(String... values){
        if(values!=null && values.length>0){
            in("build_manufacturer",values);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_manufacturer",value);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildManufacturerNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_manufacturer",values);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * 等于 = entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderEq(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            eq("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * 不等于 &lt;&gt; entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderNe(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            ne("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 大于 &gt; entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderGt(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            gt("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 大于等于 &gt;= entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderGe(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            ge("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 小于 &lt; entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderLt(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            lt("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 小于等于 &lt;= entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderLe(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            le("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * BETWEEN  entity().getBuildBootloader() AND 值2
     * @param buildBootloaderEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderBetween(String buildBootloaderEnd){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null && buildBootloaderEnd!=null){
            between("build_bootloader",buildBootloader,buildBootloaderEnd);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * NOT BETWEEN  entity().getBuildBootloader() AND 值2
     * @param buildBootloaderEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderNotBetween(String buildBootloaderEnd){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null && buildBootloaderEnd!=null){
            notBetween("build_bootloader",buildBootloader,buildBootloaderEnd);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * BETWEEN  entity().getBuildBootloader() AND 值2
     * @param buildBootloaderStart       值1
     * @param buildBootloaderEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderBetween(String buildBootloaderStart,String buildBootloaderEnd){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null && buildBootloaderEnd!=null){
            between("build_bootloader",buildBootloaderStart,buildBootloaderEnd);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * NOT BETWEEN  entity().getBuildBootloader() AND 值2
     * @param buildBootloaderStart       值1
     * @param buildBootloaderEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderNotBetween(String buildBootloaderStart,String buildBootloaderEnd){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null && buildBootloaderEnd!=null){
            notBetween("build_bootloader",buildBootloaderStart,buildBootloaderEnd);
        }
        return this;
     }


    /**
     * <p>build_bootloader</p>
     * LIKE '%值%' entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderLike(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            like("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * NOT LIKE '%值%' entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderNotLike(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            notLike("build_bootloader",buildBootloader);
        }
        return this;
     }


    /**
     * <p>build_bootloader</p>
     * LIKE '%值' entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderLikeLeft(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            likeLeft("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * LIKE '值%' entity().getBuildBootloader()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderLikeRight(){
        String buildBootloader =entity().getBuildBootloader();
        if(buildBootloader!=null){
            likeRight("build_bootloader",buildBootloader);
        }
        return this;
     }

/**
     * <p>build_bootloader</p>
     * 等于 =
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderEq(String buildBootloader){
        if(buildBootloader!=null){
            eq("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * 不等于 &lt;&gt;
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderNe(String buildBootloader){
        if(buildBootloader!=null){
            ne("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * 大于 &gt;
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderGt(String buildBootloader){
        if(buildBootloader!=null){
            gt("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * 大于等于 &gt;=
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderGe(String buildBootloader){
        if(buildBootloader!=null){
            ge("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * 小于 &lt;
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderLt(String buildBootloader){
        if(buildBootloader!=null){
            lt("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * 小于等于 &lt;=
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderLe(String buildBootloader){
        if(buildBootloader!=null){
            le("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * LIKE '%值%'
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderLike(String buildBootloader){
        if(buildBootloader!=null){
            like("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * NOT LIKE '%值%'
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderNotLike(String buildBootloader){
        if(buildBootloader!=null){
            notLike("build_bootloader",buildBootloader);
        }
        return this;
    }


    /**
     * <p>build_bootloader</p>
     * LIKE '%值'
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderLikeLeft(String buildBootloader){
        if(buildBootloader!=null){
            likeLeft("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * LIKE '值%'
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderLikeRight(String buildBootloader){
        if(buildBootloader!=null){
            likeRight("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderIsNull(){
        isNull("build_bootloader");
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderIsNotNull(){
        isNotNull("build_bootloader");
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_bootloader",value);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderIn(String... values){
        if(values!=null && values.length>0){
            in("build_bootloader",values);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_bootloader",value);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBootloaderNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_bootloader",values);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * 等于 = entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardEq(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            eq("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * 不等于 &lt;&gt; entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardNe(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            ne("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 大于 &gt; entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardGt(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            gt("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 大于等于 &gt;= entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardGe(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            ge("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 小于 &lt; entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardLt(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            lt("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 小于等于 &lt;= entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardLe(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            le("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * BETWEEN  entity().getBuildBoard() AND 值2
     * @param buildBoardEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardBetween(String buildBoardEnd){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null && buildBoardEnd!=null){
            between("build_board",buildBoard,buildBoardEnd);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * NOT BETWEEN  entity().getBuildBoard() AND 值2
     * @param buildBoardEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardNotBetween(String buildBoardEnd){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null && buildBoardEnd!=null){
            notBetween("build_board",buildBoard,buildBoardEnd);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * BETWEEN  entity().getBuildBoard() AND 值2
     * @param buildBoardStart       值1
     * @param buildBoardEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardBetween(String buildBoardStart,String buildBoardEnd){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null && buildBoardEnd!=null){
            between("build_board",buildBoardStart,buildBoardEnd);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * NOT BETWEEN  entity().getBuildBoard() AND 值2
     * @param buildBoardStart       值1
     * @param buildBoardEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardNotBetween(String buildBoardStart,String buildBoardEnd){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null && buildBoardEnd!=null){
            notBetween("build_board",buildBoardStart,buildBoardEnd);
        }
        return this;
     }


    /**
     * <p>主板</p>
     * LIKE '%值%' entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardLike(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            like("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * NOT LIKE '%值%' entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardNotLike(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            notLike("build_board",buildBoard);
        }
        return this;
     }


    /**
     * <p>主板</p>
     * LIKE '%值' entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardLikeLeft(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            likeLeft("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * LIKE '值%' entity().getBuildBoard()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardLikeRight(){
        String buildBoard =entity().getBuildBoard();
        if(buildBoard!=null){
            likeRight("build_board",buildBoard);
        }
        return this;
     }

/**
     * <p>主板</p>
     * 等于 =
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardEq(String buildBoard){
        if(buildBoard!=null){
            eq("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * 不等于 &lt;&gt;
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardNe(String buildBoard){
        if(buildBoard!=null){
            ne("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * 大于 &gt;
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardGt(String buildBoard){
        if(buildBoard!=null){
            gt("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * 大于等于 &gt;=
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardGe(String buildBoard){
        if(buildBoard!=null){
            ge("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * 小于 &lt;
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardLt(String buildBoard){
        if(buildBoard!=null){
            lt("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * 小于等于 &lt;=
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardLe(String buildBoard){
        if(buildBoard!=null){
            le("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * LIKE '%值%'
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardLike(String buildBoard){
        if(buildBoard!=null){
            like("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * NOT LIKE '%值%'
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardNotLike(String buildBoard){
        if(buildBoard!=null){
            notLike("build_board",buildBoard);
        }
        return this;
    }


    /**
     * <p>主板</p>
     * LIKE '%值'
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardLikeLeft(String buildBoard){
        if(buildBoard!=null){
            likeLeft("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * LIKE '值%'
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardLikeRight(String buildBoard){
        if(buildBoard!=null){
            likeRight("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardIsNull(){
        isNull("build_board");
        return this;
    }

    /**
     * <p>主板</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardIsNotNull(){
        isNotNull("build_board");
        return this;
    }

    /**
     * <p>主板</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_board",value);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardIn(String... values){
        if(values!=null && values.length>0){
            in("build_board",values);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_board",value);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBoardNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_board",values);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * 等于 = entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandEq(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            eq("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * 不等于 &lt;&gt; entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandNe(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            ne("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 大于 &gt; entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandGt(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            gt("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 大于等于 &gt;= entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandGe(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            ge("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 小于 &lt; entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandLt(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            lt("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 小于等于 &lt;= entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandLe(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            le("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * BETWEEN  entity().getBuildBrand() AND 值2
     * @param buildBrandEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandBetween(String buildBrandEnd){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null && buildBrandEnd!=null){
            between("build_brand",buildBrand,buildBrandEnd);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * NOT BETWEEN  entity().getBuildBrand() AND 值2
     * @param buildBrandEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandNotBetween(String buildBrandEnd){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null && buildBrandEnd!=null){
            notBetween("build_brand",buildBrand,buildBrandEnd);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * BETWEEN  entity().getBuildBrand() AND 值2
     * @param buildBrandStart       值1
     * @param buildBrandEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandBetween(String buildBrandStart,String buildBrandEnd){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null && buildBrandEnd!=null){
            between("build_brand",buildBrandStart,buildBrandEnd);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * NOT BETWEEN  entity().getBuildBrand() AND 值2
     * @param buildBrandStart       值1
     * @param buildBrandEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandNotBetween(String buildBrandStart,String buildBrandEnd){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null && buildBrandEnd!=null){
            notBetween("build_brand",buildBrandStart,buildBrandEnd);
        }
        return this;
     }


    /**
     * <p>系统定制商</p>
     * LIKE '%值%' entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandLike(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            like("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * NOT LIKE '%值%' entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandNotLike(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            notLike("build_brand",buildBrand);
        }
        return this;
     }


    /**
     * <p>系统定制商</p>
     * LIKE '%值' entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandLikeLeft(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            likeLeft("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * LIKE '值%' entity().getBuildBrand()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandLikeRight(){
        String buildBrand =entity().getBuildBrand();
        if(buildBrand!=null){
            likeRight("build_brand",buildBrand);
        }
        return this;
     }

/**
     * <p>系统定制商</p>
     * 等于 =
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandEq(String buildBrand){
        if(buildBrand!=null){
            eq("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * 不等于 &lt;&gt;
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandNe(String buildBrand){
        if(buildBrand!=null){
            ne("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * 大于 &gt;
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandGt(String buildBrand){
        if(buildBrand!=null){
            gt("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * 大于等于 &gt;=
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandGe(String buildBrand){
        if(buildBrand!=null){
            ge("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * 小于 &lt;
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandLt(String buildBrand){
        if(buildBrand!=null){
            lt("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * 小于等于 &lt;=
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandLe(String buildBrand){
        if(buildBrand!=null){
            le("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * LIKE '%值%'
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandLike(String buildBrand){
        if(buildBrand!=null){
            like("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * NOT LIKE '%值%'
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandNotLike(String buildBrand){
        if(buildBrand!=null){
            notLike("build_brand",buildBrand);
        }
        return this;
    }


    /**
     * <p>系统定制商</p>
     * LIKE '%值'
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandLikeLeft(String buildBrand){
        if(buildBrand!=null){
            likeLeft("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * LIKE '值%'
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandLikeRight(String buildBrand){
        if(buildBrand!=null){
            likeRight("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandIsNull(){
        isNull("build_brand");
        return this;
    }

    /**
     * <p>系统定制商</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandIsNotNull(){
        isNotNull("build_brand");
        return this;
    }

    /**
     * <p>系统定制商</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_brand",value);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandIn(String... values){
        if(values!=null && values.length>0){
            in("build_brand",values);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_brand",value);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildBrandNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_brand",values);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * 等于 = entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiEq(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            eq("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * 不等于 &lt;&gt; entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiNe(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            ne("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 大于 &gt; entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiGt(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            gt("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 大于等于 &gt;= entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiGe(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            ge("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 小于 &lt; entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiLt(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            lt("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 小于等于 &lt;= entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiLe(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            le("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * BETWEEN  entity().getBuildCpuAbi() AND 值2
     * @param buildCpuAbiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiBetween(String buildCpuAbiEnd){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null && buildCpuAbiEnd!=null){
            between("build_cpu_abi",buildCpuAbi,buildCpuAbiEnd);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * NOT BETWEEN  entity().getBuildCpuAbi() AND 值2
     * @param buildCpuAbiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiNotBetween(String buildCpuAbiEnd){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null && buildCpuAbiEnd!=null){
            notBetween("build_cpu_abi",buildCpuAbi,buildCpuAbiEnd);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * BETWEEN  entity().getBuildCpuAbi() AND 值2
     * @param buildCpuAbiStart       值1
     * @param buildCpuAbiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiBetween(String buildCpuAbiStart,String buildCpuAbiEnd){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null && buildCpuAbiEnd!=null){
            between("build_cpu_abi",buildCpuAbiStart,buildCpuAbiEnd);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * NOT BETWEEN  entity().getBuildCpuAbi() AND 值2
     * @param buildCpuAbiStart       值1
     * @param buildCpuAbiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiNotBetween(String buildCpuAbiStart,String buildCpuAbiEnd){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null && buildCpuAbiEnd!=null){
            notBetween("build_cpu_abi",buildCpuAbiStart,buildCpuAbiEnd);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi</p>
     * LIKE '%值%' entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiLike(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            like("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * NOT LIKE '%值%' entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiNotLike(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            notLike("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi</p>
     * LIKE '%值' entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiLikeLeft(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            likeLeft("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * LIKE '值%' entity().getBuildCpuAbi()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiLikeRight(){
        String buildCpuAbi =entity().getBuildCpuAbi();
        if(buildCpuAbi!=null){
            likeRight("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

/**
     * <p>build_cpu_abi</p>
     * 等于 =
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiEq(String buildCpuAbi){
        if(buildCpuAbi!=null){
            eq("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * 不等于 &lt;&gt;
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiNe(String buildCpuAbi){
        if(buildCpuAbi!=null){
            ne("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * 大于 &gt;
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiGt(String buildCpuAbi){
        if(buildCpuAbi!=null){
            gt("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * 大于等于 &gt;=
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiGe(String buildCpuAbi){
        if(buildCpuAbi!=null){
            ge("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * 小于 &lt;
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiLt(String buildCpuAbi){
        if(buildCpuAbi!=null){
            lt("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * 小于等于 &lt;=
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiLe(String buildCpuAbi){
        if(buildCpuAbi!=null){
            le("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * LIKE '%值%'
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiLike(String buildCpuAbi){
        if(buildCpuAbi!=null){
            like("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * NOT LIKE '%值%'
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiNotLike(String buildCpuAbi){
        if(buildCpuAbi!=null){
            notLike("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }


    /**
     * <p>build_cpu_abi</p>
     * LIKE '%值'
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiLikeLeft(String buildCpuAbi){
        if(buildCpuAbi!=null){
            likeLeft("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * LIKE '值%'
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiLikeRight(String buildCpuAbi){
        if(buildCpuAbi!=null){
            likeRight("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiIsNull(){
        isNull("build_cpu_abi");
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiIsNotNull(){
        isNotNull("build_cpu_abi");
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_cpu_abi",value);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiIn(String... values){
        if(values!=null && values.length>0){
            in("build_cpu_abi",values);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_cpu_abi",value);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_cpu_abi",values);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * 等于 = entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Eq(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            eq("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * 不等于 &lt;&gt; entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Ne(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            ne("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 大于 &gt; entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Gt(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            gt("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 大于等于 &gt;= entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Ge(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            ge("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 小于 &lt; entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Lt(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            lt("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 小于等于 &lt;= entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Le(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            le("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * BETWEEN  entity().getBuildCpuAbi2() AND 值2
     * @param buildCpuAbi2End      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Between(String buildCpuAbi2End){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null && buildCpuAbi2End!=null){
            between("build_cpu_abi2",buildCpuAbi2,buildCpuAbi2End);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * NOT BETWEEN  entity().getBuildCpuAbi2() AND 值2
     * @param buildCpuAbi2End      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2NotBetween(String buildCpuAbi2End){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null && buildCpuAbi2End!=null){
            notBetween("build_cpu_abi2",buildCpuAbi2,buildCpuAbi2End);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * BETWEEN  entity().getBuildCpuAbi2() AND 值2
     * @param buildCpuAbi2Start       值1
     * @param buildCpuAbi2End      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Between(String buildCpuAbi2Start,String buildCpuAbi2End){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null && buildCpuAbi2End!=null){
            between("build_cpu_abi2",buildCpuAbi2Start,buildCpuAbi2End);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * NOT BETWEEN  entity().getBuildCpuAbi2() AND 值2
     * @param buildCpuAbi2Start       值1
     * @param buildCpuAbi2End      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2NotBetween(String buildCpuAbi2Start,String buildCpuAbi2End){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null && buildCpuAbi2End!=null){
            notBetween("build_cpu_abi2",buildCpuAbi2Start,buildCpuAbi2End);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi2</p>
     * LIKE '%值%' entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Like(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            like("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * NOT LIKE '%值%' entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2NotLike(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            notLike("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi2</p>
     * LIKE '%值' entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2LikeLeft(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            likeLeft("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * LIKE '值%' entity().getBuildCpuAbi2()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2LikeRight(){
        String buildCpuAbi2 =entity().getBuildCpuAbi2();
        if(buildCpuAbi2!=null){
            likeRight("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

/**
     * <p>build_cpu_abi2</p>
     * 等于 =
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Eq(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            eq("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * 不等于 &lt;&gt;
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Ne(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            ne("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * 大于 &gt;
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Gt(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            gt("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * 大于等于 &gt;=
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Ge(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            ge("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * 小于 &lt;
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Lt(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            lt("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * 小于等于 &lt;=
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Le(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            le("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * LIKE '%值%'
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2Like(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            like("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * NOT LIKE '%值%'
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2NotLike(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            notLike("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }


    /**
     * <p>build_cpu_abi2</p>
     * LIKE '%值'
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2LikeLeft(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            likeLeft("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * LIKE '值%'
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2LikeRight(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            likeRight("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2IsNull(){
        isNull("build_cpu_abi2");
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2IsNotNull(){
        isNotNull("build_cpu_abi2");
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2In(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_cpu_abi2",value);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2In(String... values){
        if(values!=null && values.length>0){
            in("build_cpu_abi2",values);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2NotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_cpu_abi2",value);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildCpuAbi2NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_cpu_abi2",values);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * 等于 = entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceEq(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            eq("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * 不等于 &lt;&gt; entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceNe(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            ne("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 大于 &gt; entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceGt(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            gt("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 大于等于 &gt;= entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceGe(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            ge("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 小于 &lt; entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceLt(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            lt("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 小于等于 &lt;= entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceLe(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            le("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * BETWEEN  entity().getBuildDevice() AND 值2
     * @param buildDeviceEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceBetween(String buildDeviceEnd){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null && buildDeviceEnd!=null){
            between("build_device",buildDevice,buildDeviceEnd);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * NOT BETWEEN  entity().getBuildDevice() AND 值2
     * @param buildDeviceEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceNotBetween(String buildDeviceEnd){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null && buildDeviceEnd!=null){
            notBetween("build_device",buildDevice,buildDeviceEnd);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * BETWEEN  entity().getBuildDevice() AND 值2
     * @param buildDeviceStart       值1
     * @param buildDeviceEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceBetween(String buildDeviceStart,String buildDeviceEnd){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null && buildDeviceEnd!=null){
            between("build_device",buildDeviceStart,buildDeviceEnd);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * NOT BETWEEN  entity().getBuildDevice() AND 值2
     * @param buildDeviceStart       值1
     * @param buildDeviceEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceNotBetween(String buildDeviceStart,String buildDeviceEnd){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null && buildDeviceEnd!=null){
            notBetween("build_device",buildDeviceStart,buildDeviceEnd);
        }
        return this;
     }


    /**
     * <p>设备参数</p>
     * LIKE '%值%' entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceLike(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            like("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * NOT LIKE '%值%' entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceNotLike(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            notLike("build_device",buildDevice);
        }
        return this;
     }


    /**
     * <p>设备参数</p>
     * LIKE '%值' entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceLikeLeft(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            likeLeft("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * LIKE '值%' entity().getBuildDevice()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceLikeRight(){
        String buildDevice =entity().getBuildDevice();
        if(buildDevice!=null){
            likeRight("build_device",buildDevice);
        }
        return this;
     }

/**
     * <p>设备参数</p>
     * 等于 =
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceEq(String buildDevice){
        if(buildDevice!=null){
            eq("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * 不等于 &lt;&gt;
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceNe(String buildDevice){
        if(buildDevice!=null){
            ne("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * 大于 &gt;
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceGt(String buildDevice){
        if(buildDevice!=null){
            gt("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * 大于等于 &gt;=
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceGe(String buildDevice){
        if(buildDevice!=null){
            ge("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * 小于 &lt;
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceLt(String buildDevice){
        if(buildDevice!=null){
            lt("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * 小于等于 &lt;=
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceLe(String buildDevice){
        if(buildDevice!=null){
            le("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * LIKE '%值%'
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceLike(String buildDevice){
        if(buildDevice!=null){
            like("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * NOT LIKE '%值%'
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceNotLike(String buildDevice){
        if(buildDevice!=null){
            notLike("build_device",buildDevice);
        }
        return this;
    }


    /**
     * <p>设备参数</p>
     * LIKE '%值'
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceLikeLeft(String buildDevice){
        if(buildDevice!=null){
            likeLeft("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * LIKE '值%'
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceLikeRight(String buildDevice){
        if(buildDevice!=null){
            likeRight("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceIsNull(){
        isNull("build_device");
        return this;
    }

    /**
     * <p>设备参数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceIsNotNull(){
        isNotNull("build_device");
        return this;
    }

    /**
     * <p>设备参数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_device",value);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceIn(String... values){
        if(values!=null && values.length>0){
            in("build_device",values);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_device",value);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDeviceNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_device",values);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * 等于 = entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayEq(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            eq("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * 不等于 &lt;&gt; entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayNe(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            ne("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 大于 &gt; entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayGt(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            gt("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 大于等于 &gt;= entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayGe(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            ge("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 小于 &lt; entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayLt(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            lt("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 小于等于 &lt;= entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayLe(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            le("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * BETWEEN  entity().getBuildDisplay() AND 值2
     * @param buildDisplayEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayBetween(String buildDisplayEnd){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null && buildDisplayEnd!=null){
            between("build_display",buildDisplay,buildDisplayEnd);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * NOT BETWEEN  entity().getBuildDisplay() AND 值2
     * @param buildDisplayEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayNotBetween(String buildDisplayEnd){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null && buildDisplayEnd!=null){
            notBetween("build_display",buildDisplay,buildDisplayEnd);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * BETWEEN  entity().getBuildDisplay() AND 值2
     * @param buildDisplayStart       值1
     * @param buildDisplayEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayBetween(String buildDisplayStart,String buildDisplayEnd){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null && buildDisplayEnd!=null){
            between("build_display",buildDisplayStart,buildDisplayEnd);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * NOT BETWEEN  entity().getBuildDisplay() AND 值2
     * @param buildDisplayStart       值1
     * @param buildDisplayEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayNotBetween(String buildDisplayStart,String buildDisplayEnd){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null && buildDisplayEnd!=null){
            notBetween("build_display",buildDisplayStart,buildDisplayEnd);
        }
        return this;
     }


    /**
     * <p>显示屏参数</p>
     * LIKE '%值%' entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayLike(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            like("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * NOT LIKE '%值%' entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayNotLike(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            notLike("build_display",buildDisplay);
        }
        return this;
     }


    /**
     * <p>显示屏参数</p>
     * LIKE '%值' entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayLikeLeft(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            likeLeft("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * LIKE '值%' entity().getBuildDisplay()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayLikeRight(){
        String buildDisplay =entity().getBuildDisplay();
        if(buildDisplay!=null){
            likeRight("build_display",buildDisplay);
        }
        return this;
     }

/**
     * <p>显示屏参数</p>
     * 等于 =
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayEq(String buildDisplay){
        if(buildDisplay!=null){
            eq("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * 不等于 &lt;&gt;
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayNe(String buildDisplay){
        if(buildDisplay!=null){
            ne("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * 大于 &gt;
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayGt(String buildDisplay){
        if(buildDisplay!=null){
            gt("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * 大于等于 &gt;=
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayGe(String buildDisplay){
        if(buildDisplay!=null){
            ge("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * 小于 &lt;
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayLt(String buildDisplay){
        if(buildDisplay!=null){
            lt("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * 小于等于 &lt;=
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayLe(String buildDisplay){
        if(buildDisplay!=null){
            le("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * LIKE '%值%'
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayLike(String buildDisplay){
        if(buildDisplay!=null){
            like("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * NOT LIKE '%值%'
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayNotLike(String buildDisplay){
        if(buildDisplay!=null){
            notLike("build_display",buildDisplay);
        }
        return this;
    }


    /**
     * <p>显示屏参数</p>
     * LIKE '%值'
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayLikeLeft(String buildDisplay){
        if(buildDisplay!=null){
            likeLeft("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * LIKE '值%'
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayLikeRight(String buildDisplay){
        if(buildDisplay!=null){
            likeRight("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayIsNull(){
        isNull("build_display");
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayIsNotNull(){
        isNotNull("build_display");
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_display",value);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayIn(String... values){
        if(values!=null && values.length>0){
            in("build_display",values);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_display",value);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildDisplayNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_display",values);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * 等于 = entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintEq(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            eq("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * 不等于 &lt;&gt; entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintNe(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            ne("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 大于 &gt; entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintGt(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            gt("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 大于等于 &gt;= entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintGe(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            ge("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 小于 &lt; entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintLt(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            lt("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 小于等于 &lt;= entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintLe(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            le("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * BETWEEN  entity().getBuildFingerprint() AND 值2
     * @param buildFingerprintEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintBetween(String buildFingerprintEnd){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null && buildFingerprintEnd!=null){
            between("build_fingerprint",buildFingerprint,buildFingerprintEnd);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * NOT BETWEEN  entity().getBuildFingerprint() AND 值2
     * @param buildFingerprintEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintNotBetween(String buildFingerprintEnd){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null && buildFingerprintEnd!=null){
            notBetween("build_fingerprint",buildFingerprint,buildFingerprintEnd);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * BETWEEN  entity().getBuildFingerprint() AND 值2
     * @param buildFingerprintStart       值1
     * @param buildFingerprintEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintBetween(String buildFingerprintStart,String buildFingerprintEnd){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null && buildFingerprintEnd!=null){
            between("build_fingerprint",buildFingerprintStart,buildFingerprintEnd);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * NOT BETWEEN  entity().getBuildFingerprint() AND 值2
     * @param buildFingerprintStart       值1
     * @param buildFingerprintEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintNotBetween(String buildFingerprintStart,String buildFingerprintEnd){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null && buildFingerprintEnd!=null){
            notBetween("build_fingerprint",buildFingerprintStart,buildFingerprintEnd);
        }
        return this;
     }


    /**
     * <p>唯一识别码</p>
     * LIKE '%值%' entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintLike(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            like("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * NOT LIKE '%值%' entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintNotLike(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            notLike("build_fingerprint",buildFingerprint);
        }
        return this;
     }


    /**
     * <p>唯一识别码</p>
     * LIKE '%值' entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintLikeLeft(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            likeLeft("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * LIKE '值%' entity().getBuildFingerprint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintLikeRight(){
        String buildFingerprint =entity().getBuildFingerprint();
        if(buildFingerprint!=null){
            likeRight("build_fingerprint",buildFingerprint);
        }
        return this;
     }

/**
     * <p>唯一识别码</p>
     * 等于 =
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintEq(String buildFingerprint){
        if(buildFingerprint!=null){
            eq("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * 不等于 &lt;&gt;
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintNe(String buildFingerprint){
        if(buildFingerprint!=null){
            ne("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * 大于 &gt;
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintGt(String buildFingerprint){
        if(buildFingerprint!=null){
            gt("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * 大于等于 &gt;=
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintGe(String buildFingerprint){
        if(buildFingerprint!=null){
            ge("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * 小于 &lt;
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintLt(String buildFingerprint){
        if(buildFingerprint!=null){
            lt("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * 小于等于 &lt;=
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintLe(String buildFingerprint){
        if(buildFingerprint!=null){
            le("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * LIKE '%值%'
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintLike(String buildFingerprint){
        if(buildFingerprint!=null){
            like("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * NOT LIKE '%值%'
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintNotLike(String buildFingerprint){
        if(buildFingerprint!=null){
            notLike("build_fingerprint",buildFingerprint);
        }
        return this;
    }


    /**
     * <p>唯一识别码</p>
     * LIKE '%值'
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintLikeLeft(String buildFingerprint){
        if(buildFingerprint!=null){
            likeLeft("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * LIKE '值%'
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintLikeRight(String buildFingerprint){
        if(buildFingerprint!=null){
            likeRight("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintIsNull(){
        isNull("build_fingerprint");
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintIsNotNull(){
        isNotNull("build_fingerprint");
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_fingerprint",value);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintIn(String... values){
        if(values!=null && values.length>0){
            in("build_fingerprint",values);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_fingerprint",value);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildFingerprintNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_fingerprint",values);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * 等于 = entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostEq(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            eq("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * 不等于 &lt;&gt; entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostNe(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            ne("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 大于 &gt; entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostGt(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            gt("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 大于等于 &gt;= entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostGe(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            ge("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 小于 &lt; entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostLt(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            lt("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 小于等于 &lt;= entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostLe(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            le("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * BETWEEN  entity().getBuildHost() AND 值2
     * @param buildHostEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostBetween(String buildHostEnd){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null && buildHostEnd!=null){
            between("build_host",buildHost,buildHostEnd);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * NOT BETWEEN  entity().getBuildHost() AND 值2
     * @param buildHostEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostNotBetween(String buildHostEnd){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null && buildHostEnd!=null){
            notBetween("build_host",buildHost,buildHostEnd);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * BETWEEN  entity().getBuildHost() AND 值2
     * @param buildHostStart       值1
     * @param buildHostEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostBetween(String buildHostStart,String buildHostEnd){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null && buildHostEnd!=null){
            between("build_host",buildHostStart,buildHostEnd);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * NOT BETWEEN  entity().getBuildHost() AND 值2
     * @param buildHostStart       值1
     * @param buildHostEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostNotBetween(String buildHostStart,String buildHostEnd){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null && buildHostEnd!=null){
            notBetween("build_host",buildHostStart,buildHostEnd);
        }
        return this;
     }


    /**
     * <p>build_host</p>
     * LIKE '%值%' entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostLike(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            like("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * NOT LIKE '%值%' entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostNotLike(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            notLike("build_host",buildHost);
        }
        return this;
     }


    /**
     * <p>build_host</p>
     * LIKE '%值' entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostLikeLeft(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            likeLeft("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * LIKE '值%' entity().getBuildHost()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostLikeRight(){
        String buildHost =entity().getBuildHost();
        if(buildHost!=null){
            likeRight("build_host",buildHost);
        }
        return this;
     }

/**
     * <p>build_host</p>
     * 等于 =
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostEq(String buildHost){
        if(buildHost!=null){
            eq("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * 不等于 &lt;&gt;
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostNe(String buildHost){
        if(buildHost!=null){
            ne("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * 大于 &gt;
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostGt(String buildHost){
        if(buildHost!=null){
            gt("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * 大于等于 &gt;=
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostGe(String buildHost){
        if(buildHost!=null){
            ge("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * 小于 &lt;
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostLt(String buildHost){
        if(buildHost!=null){
            lt("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * 小于等于 &lt;=
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostLe(String buildHost){
        if(buildHost!=null){
            le("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * LIKE '%值%'
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostLike(String buildHost){
        if(buildHost!=null){
            like("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * NOT LIKE '%值%'
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostNotLike(String buildHost){
        if(buildHost!=null){
            notLike("build_host",buildHost);
        }
        return this;
    }


    /**
     * <p>build_host</p>
     * LIKE '%值'
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostLikeLeft(String buildHost){
        if(buildHost!=null){
            likeLeft("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * LIKE '值%'
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostLikeRight(String buildHost){
        if(buildHost!=null){
            likeRight("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostIsNull(){
        isNull("build_host");
        return this;
    }

    /**
     * <p>build_host</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostIsNotNull(){
        isNotNull("build_host");
        return this;
    }

    /**
     * <p>build_host</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_host",value);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostIn(String... values){
        if(values!=null && values.length>0){
            in("build_host",values);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_host",value);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHostNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_host",values);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * 等于 = entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductEq(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            eq("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * 不等于 &lt;&gt; entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductNe(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            ne("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 大于 &gt; entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductGt(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            gt("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 大于等于 &gt;= entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductGe(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            ge("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 小于 &lt; entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductLt(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            lt("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 小于等于 &lt;= entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductLe(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            le("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * BETWEEN  entity().getBuildProduct() AND 值2
     * @param buildProductEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductBetween(String buildProductEnd){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null && buildProductEnd!=null){
            between("build_product",buildProduct,buildProductEnd);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * NOT BETWEEN  entity().getBuildProduct() AND 值2
     * @param buildProductEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductNotBetween(String buildProductEnd){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null && buildProductEnd!=null){
            notBetween("build_product",buildProduct,buildProductEnd);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * BETWEEN  entity().getBuildProduct() AND 值2
     * @param buildProductStart       值1
     * @param buildProductEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductBetween(String buildProductStart,String buildProductEnd){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null && buildProductEnd!=null){
            between("build_product",buildProductStart,buildProductEnd);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * NOT BETWEEN  entity().getBuildProduct() AND 值2
     * @param buildProductStart       值1
     * @param buildProductEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductNotBetween(String buildProductStart,String buildProductEnd){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null && buildProductEnd!=null){
            notBetween("build_product",buildProductStart,buildProductEnd);
        }
        return this;
     }


    /**
     * <p>整个产品的名称</p>
     * LIKE '%值%' entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductLike(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            like("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * NOT LIKE '%值%' entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductNotLike(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            notLike("build_product",buildProduct);
        }
        return this;
     }


    /**
     * <p>整个产品的名称</p>
     * LIKE '%值' entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductLikeLeft(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            likeLeft("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * LIKE '值%' entity().getBuildProduct()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductLikeRight(){
        String buildProduct =entity().getBuildProduct();
        if(buildProduct!=null){
            likeRight("build_product",buildProduct);
        }
        return this;
     }

/**
     * <p>整个产品的名称</p>
     * 等于 =
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductEq(String buildProduct){
        if(buildProduct!=null){
            eq("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * 不等于 &lt;&gt;
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductNe(String buildProduct){
        if(buildProduct!=null){
            ne("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * 大于 &gt;
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductGt(String buildProduct){
        if(buildProduct!=null){
            gt("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * 大于等于 &gt;=
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductGe(String buildProduct){
        if(buildProduct!=null){
            ge("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * 小于 &lt;
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductLt(String buildProduct){
        if(buildProduct!=null){
            lt("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * 小于等于 &lt;=
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductLe(String buildProduct){
        if(buildProduct!=null){
            le("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * LIKE '%值%'
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductLike(String buildProduct){
        if(buildProduct!=null){
            like("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * NOT LIKE '%值%'
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductNotLike(String buildProduct){
        if(buildProduct!=null){
            notLike("build_product",buildProduct);
        }
        return this;
    }


    /**
     * <p>整个产品的名称</p>
     * LIKE '%值'
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductLikeLeft(String buildProduct){
        if(buildProduct!=null){
            likeLeft("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * LIKE '值%'
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductLikeRight(String buildProduct){
        if(buildProduct!=null){
            likeRight("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductIsNull(){
        isNull("build_product");
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductIsNotNull(){
        isNotNull("build_product");
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_product",value);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductIn(String... values){
        if(values!=null && values.length>0){
            in("build_product",values);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_product",value);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildProductNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_product",values);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * 等于 = entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareEq(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            eq("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * 不等于 &lt;&gt; entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareNe(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            ne("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 大于 &gt; entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareGt(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            gt("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 大于等于 &gt;= entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareGe(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            ge("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 小于 &lt; entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareLt(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            lt("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 小于等于 &lt;= entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareLe(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            le("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * BETWEEN  entity().getBuildHardware() AND 值2
     * @param buildHardwareEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareBetween(String buildHardwareEnd){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null && buildHardwareEnd!=null){
            between("build_hardware",buildHardware,buildHardwareEnd);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * NOT BETWEEN  entity().getBuildHardware() AND 值2
     * @param buildHardwareEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareNotBetween(String buildHardwareEnd){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null && buildHardwareEnd!=null){
            notBetween("build_hardware",buildHardware,buildHardwareEnd);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * BETWEEN  entity().getBuildHardware() AND 值2
     * @param buildHardwareStart       值1
     * @param buildHardwareEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareBetween(String buildHardwareStart,String buildHardwareEnd){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null && buildHardwareEnd!=null){
            between("build_hardware",buildHardwareStart,buildHardwareEnd);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * NOT BETWEEN  entity().getBuildHardware() AND 值2
     * @param buildHardwareStart       值1
     * @param buildHardwareEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareNotBetween(String buildHardwareStart,String buildHardwareEnd){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null && buildHardwareEnd!=null){
            notBetween("build_hardware",buildHardwareStart,buildHardwareEnd);
        }
        return this;
     }


    /**
     * <p>硬件名称</p>
     * LIKE '%值%' entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareLike(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            like("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * NOT LIKE '%值%' entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareNotLike(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            notLike("build_hardware",buildHardware);
        }
        return this;
     }


    /**
     * <p>硬件名称</p>
     * LIKE '%值' entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareLikeLeft(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            likeLeft("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * LIKE '值%' entity().getBuildHardware()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareLikeRight(){
        String buildHardware =entity().getBuildHardware();
        if(buildHardware!=null){
            likeRight("build_hardware",buildHardware);
        }
        return this;
     }

/**
     * <p>硬件名称</p>
     * 等于 =
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareEq(String buildHardware){
        if(buildHardware!=null){
            eq("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * 不等于 &lt;&gt;
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareNe(String buildHardware){
        if(buildHardware!=null){
            ne("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * 大于 &gt;
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareGt(String buildHardware){
        if(buildHardware!=null){
            gt("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * 大于等于 &gt;=
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareGe(String buildHardware){
        if(buildHardware!=null){
            ge("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * 小于 &lt;
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareLt(String buildHardware){
        if(buildHardware!=null){
            lt("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * 小于等于 &lt;=
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareLe(String buildHardware){
        if(buildHardware!=null){
            le("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * LIKE '%值%'
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareLike(String buildHardware){
        if(buildHardware!=null){
            like("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * NOT LIKE '%值%'
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareNotLike(String buildHardware){
        if(buildHardware!=null){
            notLike("build_hardware",buildHardware);
        }
        return this;
    }


    /**
     * <p>硬件名称</p>
     * LIKE '%值'
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareLikeLeft(String buildHardware){
        if(buildHardware!=null){
            likeLeft("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * LIKE '值%'
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareLikeRight(String buildHardware){
        if(buildHardware!=null){
            likeRight("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareIsNull(){
        isNull("build_hardware");
        return this;
    }

    /**
     * <p>硬件名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareIsNotNull(){
        isNotNull("build_hardware");
        return this;
    }

    /**
     * <p>硬件名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_hardware",value);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareIn(String... values){
        if(values!=null && values.length>0){
            in("build_hardware",values);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_hardware",value);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildHardwareNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_hardware",values);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * 等于 = entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialEq(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            eq("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * 不等于 &lt;&gt; entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialNe(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            ne("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 大于 &gt; entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialGt(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            gt("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 大于等于 &gt;= entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialGe(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            ge("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 小于 &lt; entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialLt(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            lt("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 小于等于 &lt;= entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialLe(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            le("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * BETWEEN  entity().getBuildSerial() AND 值2
     * @param buildSerialEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialBetween(String buildSerialEnd){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null && buildSerialEnd!=null){
            between("build_serial",buildSerial,buildSerialEnd);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * NOT BETWEEN  entity().getBuildSerial() AND 值2
     * @param buildSerialEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialNotBetween(String buildSerialEnd){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null && buildSerialEnd!=null){
            notBetween("build_serial",buildSerial,buildSerialEnd);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * BETWEEN  entity().getBuildSerial() AND 值2
     * @param buildSerialStart       值1
     * @param buildSerialEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialBetween(String buildSerialStart,String buildSerialEnd){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null && buildSerialEnd!=null){
            between("build_serial",buildSerialStart,buildSerialEnd);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * NOT BETWEEN  entity().getBuildSerial() AND 值2
     * @param buildSerialStart       值1
     * @param buildSerialEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialNotBetween(String buildSerialStart,String buildSerialEnd){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null && buildSerialEnd!=null){
            notBetween("build_serial",buildSerialStart,buildSerialEnd);
        }
        return this;
     }


    /**
     * <p>硬件序列</p>
     * LIKE '%值%' entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialLike(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            like("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * NOT LIKE '%值%' entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialNotLike(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            notLike("build_serial",buildSerial);
        }
        return this;
     }


    /**
     * <p>硬件序列</p>
     * LIKE '%值' entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialLikeLeft(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            likeLeft("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * LIKE '值%' entity().getBuildSerial()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialLikeRight(){
        String buildSerial =entity().getBuildSerial();
        if(buildSerial!=null){
            likeRight("build_serial",buildSerial);
        }
        return this;
     }

/**
     * <p>硬件序列</p>
     * 等于 =
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialEq(String buildSerial){
        if(buildSerial!=null){
            eq("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * 不等于 &lt;&gt;
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialNe(String buildSerial){
        if(buildSerial!=null){
            ne("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * 大于 &gt;
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialGt(String buildSerial){
        if(buildSerial!=null){
            gt("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * 大于等于 &gt;=
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialGe(String buildSerial){
        if(buildSerial!=null){
            ge("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * 小于 &lt;
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialLt(String buildSerial){
        if(buildSerial!=null){
            lt("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * 小于等于 &lt;=
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialLe(String buildSerial){
        if(buildSerial!=null){
            le("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * LIKE '%值%'
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialLike(String buildSerial){
        if(buildSerial!=null){
            like("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * NOT LIKE '%值%'
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialNotLike(String buildSerial){
        if(buildSerial!=null){
            notLike("build_serial",buildSerial);
        }
        return this;
    }


    /**
     * <p>硬件序列</p>
     * LIKE '%值'
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialLikeLeft(String buildSerial){
        if(buildSerial!=null){
            likeLeft("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * LIKE '值%'
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialLikeRight(String buildSerial){
        if(buildSerial!=null){
            likeRight("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialIsNull(){
        isNull("build_serial");
        return this;
    }

    /**
     * <p>硬件序列</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialIsNotNull(){
        isNotNull("build_serial");
        return this;
    }

    /**
     * <p>硬件序列</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_serial",value);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialIn(String... values){
        if(values!=null && values.length>0){
            in("build_serial",values);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_serial",value);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSerialNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_serial",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 等于 = entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisEq(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            eq("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt; entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisNe(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            ne("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt; entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisGt(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            gt("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;= entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisGe(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            ge("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt; entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisLt(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            lt("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;= entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisLe(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            le("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN  entity().getBuildSupportedAbis() AND 值2
     * @param buildSupportedAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisBetween(String buildSupportedAbisEnd){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null && buildSupportedAbisEnd!=null){
            between("build_supported_abis",buildSupportedAbis,buildSupportedAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN  entity().getBuildSupportedAbis() AND 值2
     * @param buildSupportedAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisNotBetween(String buildSupportedAbisEnd){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null && buildSupportedAbisEnd!=null){
            notBetween("build_supported_abis",buildSupportedAbis,buildSupportedAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN  entity().getBuildSupportedAbis() AND 值2
     * @param buildSupportedAbisStart       值1
     * @param buildSupportedAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisBetween(String buildSupportedAbisStart,String buildSupportedAbisEnd){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null && buildSupportedAbisEnd!=null){
            between("build_supported_abis",buildSupportedAbisStart,buildSupportedAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN  entity().getBuildSupportedAbis() AND 值2
     * @param buildSupportedAbisStart       值1
     * @param buildSupportedAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisNotBetween(String buildSupportedAbisStart,String buildSupportedAbisEnd){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null && buildSupportedAbisEnd!=null){
            notBetween("build_supported_abis",buildSupportedAbisStart,buildSupportedAbisEnd);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值%' entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisLike(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            like("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%' entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisNotLike(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            notLike("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值' entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisLikeLeft(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            likeLeft("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%' entity().getBuildSupportedAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisLikeRight(){
        String buildSupportedAbis =entity().getBuildSupportedAbis();
        if(buildSupportedAbis!=null){
            likeRight("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

/**
     * <p>cpu指令集</p>
     * 等于 =
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisEq(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            eq("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt;
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisNe(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            ne("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt;
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisGt(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            gt("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;=
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisGe(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            ge("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt;
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisLt(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            lt("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;=
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisLe(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            le("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * LIKE '%值%'
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisLike(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            like("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%'
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisNotLike(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            notLike("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值'
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisLikeLeft(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            likeLeft("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%'
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisLikeRight(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            likeRight("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisIsNull(){
        isNull("build_supported_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisIsNotNull(){
        isNotNull("build_supported_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_supported_abis",value);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisIn(String... values){
        if(values!=null && values.length>0){
            in("build_supported_abis",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_supported_abis",value);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupportedAbisNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_supported_abis",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 等于 = entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisEq(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            eq("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt; entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisNe(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            ne("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt; entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisGt(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            gt("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;= entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisGe(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            ge("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt; entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisLt(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            lt("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;= entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisLe(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            le("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN  entity().getBuildSupported32BitAbis() AND 值2
     * @param buildSupported32BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisBetween(String buildSupported32BitAbisEnd){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null && buildSupported32BitAbisEnd!=null){
            between("build_supported_32_bit_abis",buildSupported32BitAbis,buildSupported32BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN  entity().getBuildSupported32BitAbis() AND 值2
     * @param buildSupported32BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisNotBetween(String buildSupported32BitAbisEnd){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null && buildSupported32BitAbisEnd!=null){
            notBetween("build_supported_32_bit_abis",buildSupported32BitAbis,buildSupported32BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN  entity().getBuildSupported32BitAbis() AND 值2
     * @param buildSupported32BitAbisStart       值1
     * @param buildSupported32BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisBetween(String buildSupported32BitAbisStart,String buildSupported32BitAbisEnd){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null && buildSupported32BitAbisEnd!=null){
            between("build_supported_32_bit_abis",buildSupported32BitAbisStart,buildSupported32BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN  entity().getBuildSupported32BitAbis() AND 值2
     * @param buildSupported32BitAbisStart       值1
     * @param buildSupported32BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisNotBetween(String buildSupported32BitAbisStart,String buildSupported32BitAbisEnd){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null && buildSupported32BitAbisEnd!=null){
            notBetween("build_supported_32_bit_abis",buildSupported32BitAbisStart,buildSupported32BitAbisEnd);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值%' entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisLike(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            like("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%' entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisNotLike(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            notLike("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值' entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisLikeLeft(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            likeLeft("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%' entity().getBuildSupported32BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisLikeRight(){
        String buildSupported32BitAbis =entity().getBuildSupported32BitAbis();
        if(buildSupported32BitAbis!=null){
            likeRight("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

/**
     * <p>cpu指令集</p>
     * 等于 =
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisEq(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            eq("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt;
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisNe(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            ne("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt;
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisGt(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            gt("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;=
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisGe(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            ge("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt;
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisLt(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            lt("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;=
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisLe(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            le("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * LIKE '%值%'
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisLike(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            like("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%'
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisNotLike(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            notLike("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值'
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisLikeLeft(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            likeLeft("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%'
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisLikeRight(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            likeRight("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisIsNull(){
        isNull("build_supported_32_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisIsNotNull(){
        isNotNull("build_supported_32_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_supported_32_bit_abis",value);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisIn(String... values){
        if(values!=null && values.length>0){
            in("build_supported_32_bit_abis",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_supported_32_bit_abis",value);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported32BitAbisNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_supported_32_bit_abis",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 等于 = entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisEq(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            eq("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt; entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisNe(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            ne("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt; entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisGt(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            gt("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;= entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisGe(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            ge("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt; entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisLt(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            lt("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;= entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisLe(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            le("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN  entity().getBuildSupported64BitAbis() AND 值2
     * @param buildSupported64BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisBetween(String buildSupported64BitAbisEnd){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null && buildSupported64BitAbisEnd!=null){
            between("build_supported_64_bit_abis",buildSupported64BitAbis,buildSupported64BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN  entity().getBuildSupported64BitAbis() AND 值2
     * @param buildSupported64BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisNotBetween(String buildSupported64BitAbisEnd){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null && buildSupported64BitAbisEnd!=null){
            notBetween("build_supported_64_bit_abis",buildSupported64BitAbis,buildSupported64BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN  entity().getBuildSupported64BitAbis() AND 值2
     * @param buildSupported64BitAbisStart       值1
     * @param buildSupported64BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisBetween(String buildSupported64BitAbisStart,String buildSupported64BitAbisEnd){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null && buildSupported64BitAbisEnd!=null){
            between("build_supported_64_bit_abis",buildSupported64BitAbisStart,buildSupported64BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN  entity().getBuildSupported64BitAbis() AND 值2
     * @param buildSupported64BitAbisStart       值1
     * @param buildSupported64BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisNotBetween(String buildSupported64BitAbisStart,String buildSupported64BitAbisEnd){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null && buildSupported64BitAbisEnd!=null){
            notBetween("build_supported_64_bit_abis",buildSupported64BitAbisStart,buildSupported64BitAbisEnd);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值%' entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisLike(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            like("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%' entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisNotLike(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            notLike("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值' entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisLikeLeft(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            likeLeft("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%' entity().getBuildSupported64BitAbis()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisLikeRight(){
        String buildSupported64BitAbis =entity().getBuildSupported64BitAbis();
        if(buildSupported64BitAbis!=null){
            likeRight("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

/**
     * <p>cpu指令集</p>
     * 等于 =
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisEq(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            eq("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt;
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisNe(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            ne("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt;
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisGt(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            gt("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;=
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisGe(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            ge("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt;
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisLt(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            lt("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;=
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisLe(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            le("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * LIKE '%值%'
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisLike(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            like("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%'
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisNotLike(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            notLike("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值'
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisLikeLeft(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            likeLeft("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%'
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisLikeRight(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            likeRight("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisIsNull(){
        isNull("build_supported_64_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisIsNotNull(){
        isNotNull("build_supported_64_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_supported_64_bit_abis",value);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisIn(String... values){
        if(values!=null && values.length>0){
            in("build_supported_64_bit_abis",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_supported_64_bit_abis",value);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildSupported64BitAbisNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_supported_64_bit_abis",values);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * 等于 = entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalEq(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            eq("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * 不等于 &lt;&gt; entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalNe(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            ne("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 大于 &gt; entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalGt(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            gt("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 大于等于 &gt;= entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalGe(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            ge("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 小于 &lt; entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalLt(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            lt("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 小于等于 &lt;= entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalLe(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            le("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * BETWEEN  entity().getBuildVersionIncremental() AND 值2
     * @param buildVersionIncrementalEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalBetween(String buildVersionIncrementalEnd){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null && buildVersionIncrementalEnd!=null){
            between("build_version_incremental",buildVersionIncremental,buildVersionIncrementalEnd);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * NOT BETWEEN  entity().getBuildVersionIncremental() AND 值2
     * @param buildVersionIncrementalEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalNotBetween(String buildVersionIncrementalEnd){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null && buildVersionIncrementalEnd!=null){
            notBetween("build_version_incremental",buildVersionIncremental,buildVersionIncrementalEnd);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * BETWEEN  entity().getBuildVersionIncremental() AND 值2
     * @param buildVersionIncrementalStart       值1
     * @param buildVersionIncrementalEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalBetween(String buildVersionIncrementalStart,String buildVersionIncrementalEnd){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null && buildVersionIncrementalEnd!=null){
            between("build_version_incremental",buildVersionIncrementalStart,buildVersionIncrementalEnd);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * NOT BETWEEN  entity().getBuildVersionIncremental() AND 值2
     * @param buildVersionIncrementalStart       值1
     * @param buildVersionIncrementalEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalNotBetween(String buildVersionIncrementalStart,String buildVersionIncrementalEnd){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null && buildVersionIncrementalEnd!=null){
            notBetween("build_version_incremental",buildVersionIncrementalStart,buildVersionIncrementalEnd);
        }
        return this;
     }


    /**
     * <p>build_version_incremental</p>
     * LIKE '%值%' entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalLike(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            like("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * NOT LIKE '%值%' entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalNotLike(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            notLike("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }


    /**
     * <p>build_version_incremental</p>
     * LIKE '%值' entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalLikeLeft(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            likeLeft("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * LIKE '值%' entity().getBuildVersionIncremental()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalLikeRight(){
        String buildVersionIncremental =entity().getBuildVersionIncremental();
        if(buildVersionIncremental!=null){
            likeRight("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

/**
     * <p>build_version_incremental</p>
     * 等于 =
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalEq(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            eq("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * 不等于 &lt;&gt;
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalNe(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            ne("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * 大于 &gt;
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalGt(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            gt("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * 大于等于 &gt;=
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalGe(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            ge("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * 小于 &lt;
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalLt(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            lt("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * 小于等于 &lt;=
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalLe(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            le("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * LIKE '%值%'
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalLike(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            like("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * NOT LIKE '%值%'
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalNotLike(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            notLike("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }


    /**
     * <p>build_version_incremental</p>
     * LIKE '%值'
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalLikeLeft(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            likeLeft("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * LIKE '值%'
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalLikeRight(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            likeRight("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalIsNull(){
        isNull("build_version_incremental");
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalIsNotNull(){
        isNotNull("build_version_incremental");
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_version_incremental",value);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalIn(String... values){
        if(values!=null && values.length>0){
            in("build_version_incremental",values);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_version_incremental",value);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionIncrementalNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_incremental",values);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 等于 = entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseEq(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            eq("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 不等于 &lt;&gt; entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseNe(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            ne("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于 &gt; entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseGt(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            gt("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于等于 &gt;= entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseGe(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            ge("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于 &lt; entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseLt(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            lt("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于等于 &lt;= entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseLe(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            le("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * BETWEEN  entity().getBuildVersionRelease() AND 值2
     * @param buildVersionReleaseEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseBetween(String buildVersionReleaseEnd){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null && buildVersionReleaseEnd!=null){
            between("build_version_release",buildVersionRelease,buildVersionReleaseEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT BETWEEN  entity().getBuildVersionRelease() AND 值2
     * @param buildVersionReleaseEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseNotBetween(String buildVersionReleaseEnd){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null && buildVersionReleaseEnd!=null){
            notBetween("build_version_release",buildVersionRelease,buildVersionReleaseEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * BETWEEN  entity().getBuildVersionRelease() AND 值2
     * @param buildVersionReleaseStart       值1
     * @param buildVersionReleaseEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseBetween(String buildVersionReleaseStart,String buildVersionReleaseEnd){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null && buildVersionReleaseEnd!=null){
            between("build_version_release",buildVersionReleaseStart,buildVersionReleaseEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT BETWEEN  entity().getBuildVersionRelease() AND 值2
     * @param buildVersionReleaseStart       值1
     * @param buildVersionReleaseEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseNotBetween(String buildVersionReleaseStart,String buildVersionReleaseEnd){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null && buildVersionReleaseEnd!=null){
            notBetween("build_version_release",buildVersionReleaseStart,buildVersionReleaseEnd);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值%' entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseLike(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            like("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT LIKE '%值%' entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseNotLike(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            notLike("build_version_release",buildVersionRelease);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值' entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseLikeLeft(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            likeLeft("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * LIKE '值%' entity().getBuildVersionRelease()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseLikeRight(){
        String buildVersionRelease =entity().getBuildVersionRelease();
        if(buildVersionRelease!=null){
            likeRight("build_version_release",buildVersionRelease);
        }
        return this;
     }

/**
     * <p>系统版本</p>
     * 等于 =
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseEq(String buildVersionRelease){
        if(buildVersionRelease!=null){
            eq("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 不等于 &lt;&gt;
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseNe(String buildVersionRelease){
        if(buildVersionRelease!=null){
            ne("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 大于 &gt;
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseGt(String buildVersionRelease){
        if(buildVersionRelease!=null){
            gt("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 大于等于 &gt;=
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseGe(String buildVersionRelease){
        if(buildVersionRelease!=null){
            ge("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 小于 &lt;
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseLt(String buildVersionRelease){
        if(buildVersionRelease!=null){
            lt("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 小于等于 &lt;=
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseLe(String buildVersionRelease){
        if(buildVersionRelease!=null){
            le("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * LIKE '%值%'
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseLike(String buildVersionRelease){
        if(buildVersionRelease!=null){
            like("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * NOT LIKE '%值%'
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseNotLike(String buildVersionRelease){
        if(buildVersionRelease!=null){
            notLike("build_version_release",buildVersionRelease);
        }
        return this;
    }


    /**
     * <p>系统版本</p>
     * LIKE '%值'
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseLikeLeft(String buildVersionRelease){
        if(buildVersionRelease!=null){
            likeLeft("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * LIKE '值%'
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseLikeRight(String buildVersionRelease){
        if(buildVersionRelease!=null){
            likeRight("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseIsNull(){
        isNull("build_version_release");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseIsNotNull(){
        isNotNull("build_version_release");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_version_release",value);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseIn(String... values){
        if(values!=null && values.length>0){
            in("build_version_release",values);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_version_release",value);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionReleaseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_release",values);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * 等于 = entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkEq(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            eq("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * 不等于 &lt;&gt; entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkNe(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            ne("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 大于 &gt; entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkGt(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            gt("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 大于等于 &gt;= entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkGe(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            ge("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 小于 &lt; entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkLt(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            lt("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 小于等于 &lt;= entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkLe(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            le("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * BETWEEN  entity().getBuildVersionSdk() AND 值2
     * @param buildVersionSdkEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkBetween(String buildVersionSdkEnd){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null && buildVersionSdkEnd!=null){
            between("build_version_sdk",buildVersionSdk,buildVersionSdkEnd);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * NOT BETWEEN  entity().getBuildVersionSdk() AND 值2
     * @param buildVersionSdkEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkNotBetween(String buildVersionSdkEnd){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null && buildVersionSdkEnd!=null){
            notBetween("build_version_sdk",buildVersionSdk,buildVersionSdkEnd);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * BETWEEN  entity().getBuildVersionSdk() AND 值2
     * @param buildVersionSdkStart       值1
     * @param buildVersionSdkEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkBetween(String buildVersionSdkStart,String buildVersionSdkEnd){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null && buildVersionSdkEnd!=null){
            between("build_version_sdk",buildVersionSdkStart,buildVersionSdkEnd);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * NOT BETWEEN  entity().getBuildVersionSdk() AND 值2
     * @param buildVersionSdkStart       值1
     * @param buildVersionSdkEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkNotBetween(String buildVersionSdkStart,String buildVersionSdkEnd){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null && buildVersionSdkEnd!=null){
            notBetween("build_version_sdk",buildVersionSdkStart,buildVersionSdkEnd);
        }
        return this;
     }


    /**
     * <p>build_version_sdk</p>
     * LIKE '%值%' entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkLike(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            like("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * NOT LIKE '%值%' entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkNotLike(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            notLike("build_version_sdk",buildVersionSdk);
        }
        return this;
     }


    /**
     * <p>build_version_sdk</p>
     * LIKE '%值' entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkLikeLeft(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            likeLeft("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * LIKE '值%' entity().getBuildVersionSdk()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkLikeRight(){
        String buildVersionSdk =entity().getBuildVersionSdk();
        if(buildVersionSdk!=null){
            likeRight("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

/**
     * <p>build_version_sdk</p>
     * 等于 =
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkEq(String buildVersionSdk){
        if(buildVersionSdk!=null){
            eq("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * 不等于 &lt;&gt;
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkNe(String buildVersionSdk){
        if(buildVersionSdk!=null){
            ne("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * 大于 &gt;
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkGt(String buildVersionSdk){
        if(buildVersionSdk!=null){
            gt("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * 大于等于 &gt;=
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkGe(String buildVersionSdk){
        if(buildVersionSdk!=null){
            ge("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * 小于 &lt;
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkLt(String buildVersionSdk){
        if(buildVersionSdk!=null){
            lt("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * 小于等于 &lt;=
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkLe(String buildVersionSdk){
        if(buildVersionSdk!=null){
            le("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * LIKE '%值%'
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkLike(String buildVersionSdk){
        if(buildVersionSdk!=null){
            like("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * NOT LIKE '%值%'
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkNotLike(String buildVersionSdk){
        if(buildVersionSdk!=null){
            notLike("build_version_sdk",buildVersionSdk);
        }
        return this;
    }


    /**
     * <p>build_version_sdk</p>
     * LIKE '%值'
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkLikeLeft(String buildVersionSdk){
        if(buildVersionSdk!=null){
            likeLeft("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * LIKE '值%'
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkLikeRight(String buildVersionSdk){
        if(buildVersionSdk!=null){
            likeRight("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkIsNull(){
        isNull("build_version_sdk");
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkIsNotNull(){
        isNotNull("build_version_sdk");
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_version_sdk",value);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkIn(String... values){
        if(values!=null && values.length>0){
            in("build_version_sdk",values);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_version_sdk",value);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_sdk",values);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * 等于 = entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintEq(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            eq("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * 不等于 &lt;&gt; entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintNe(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            ne("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 大于 &gt; entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintGt(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            gt("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 大于等于 &gt;= entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintGe(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            ge("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 小于 &lt; entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintLt(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            lt("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 小于等于 &lt;= entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintLe(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            le("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * BETWEEN  entity().getBuildVersionSdkint() AND 值2
     * @param buildVersionSdkintEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintBetween(String buildVersionSdkintEnd){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null && buildVersionSdkintEnd!=null){
            between("build_version_sdkint",buildVersionSdkint,buildVersionSdkintEnd);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * NOT BETWEEN  entity().getBuildVersionSdkint() AND 值2
     * @param buildVersionSdkintEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintNotBetween(String buildVersionSdkintEnd){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null && buildVersionSdkintEnd!=null){
            notBetween("build_version_sdkint",buildVersionSdkint,buildVersionSdkintEnd);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * BETWEEN  entity().getBuildVersionSdkint() AND 值2
     * @param buildVersionSdkintStart       值1
     * @param buildVersionSdkintEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintBetween(String buildVersionSdkintStart,String buildVersionSdkintEnd){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null && buildVersionSdkintEnd!=null){
            between("build_version_sdkint",buildVersionSdkintStart,buildVersionSdkintEnd);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * NOT BETWEEN  entity().getBuildVersionSdkint() AND 值2
     * @param buildVersionSdkintStart       值1
     * @param buildVersionSdkintEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintNotBetween(String buildVersionSdkintStart,String buildVersionSdkintEnd){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null && buildVersionSdkintEnd!=null){
            notBetween("build_version_sdkint",buildVersionSdkintStart,buildVersionSdkintEnd);
        }
        return this;
     }


    /**
     * <p>SDK版本</p>
     * LIKE '%值%' entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintLike(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            like("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * NOT LIKE '%值%' entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintNotLike(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            notLike("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }


    /**
     * <p>SDK版本</p>
     * LIKE '%值' entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintLikeLeft(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            likeLeft("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * LIKE '值%' entity().getBuildVersionSdkint()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintLikeRight(){
        String buildVersionSdkint =entity().getBuildVersionSdkint();
        if(buildVersionSdkint!=null){
            likeRight("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

/**
     * <p>SDK版本</p>
     * 等于 =
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintEq(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            eq("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * 不等于 &lt;&gt;
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintNe(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            ne("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * 大于 &gt;
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintGt(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            gt("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * 大于等于 &gt;=
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintGe(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            ge("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * 小于 &lt;
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintLt(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            lt("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * 小于等于 &lt;=
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintLe(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            le("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * LIKE '%值%'
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintLike(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            like("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * NOT LIKE '%值%'
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintNotLike(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            notLike("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }


    /**
     * <p>SDK版本</p>
     * LIKE '%值'
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintLikeLeft(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            likeLeft("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * LIKE '值%'
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintLikeRight(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            likeRight("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintIsNull(){
        isNull("build_version_sdkint");
        return this;
    }

    /**
     * <p>SDK版本</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintIsNotNull(){
        isNotNull("build_version_sdkint");
        return this;
    }

    /**
     * <p>SDK版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_version_sdkint",value);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintIn(String... values){
        if(values!=null && values.length>0){
            in("build_version_sdkint",values);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_version_sdkint",value);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionSdkintNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_sdkint",values);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * 等于 = entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameEq(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            eq("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * 不等于 &lt;&gt; entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameNe(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            ne("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 大于 &gt; entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameGt(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            gt("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 大于等于 &gt;= entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameGe(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            ge("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 小于 &lt; entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameLt(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            lt("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 小于等于 &lt;= entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameLe(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            le("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * BETWEEN  entity().getBuildVersionCodename() AND 值2
     * @param buildVersionCodenameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameBetween(String buildVersionCodenameEnd){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null && buildVersionCodenameEnd!=null){
            between("build_version_codename",buildVersionCodename,buildVersionCodenameEnd);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * NOT BETWEEN  entity().getBuildVersionCodename() AND 值2
     * @param buildVersionCodenameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameNotBetween(String buildVersionCodenameEnd){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null && buildVersionCodenameEnd!=null){
            notBetween("build_version_codename",buildVersionCodename,buildVersionCodenameEnd);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * BETWEEN  entity().getBuildVersionCodename() AND 值2
     * @param buildVersionCodenameStart       值1
     * @param buildVersionCodenameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameBetween(String buildVersionCodenameStart,String buildVersionCodenameEnd){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null && buildVersionCodenameEnd!=null){
            between("build_version_codename",buildVersionCodenameStart,buildVersionCodenameEnd);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * NOT BETWEEN  entity().getBuildVersionCodename() AND 值2
     * @param buildVersionCodenameStart       值1
     * @param buildVersionCodenameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameNotBetween(String buildVersionCodenameStart,String buildVersionCodenameEnd){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null && buildVersionCodenameEnd!=null){
            notBetween("build_version_codename",buildVersionCodenameStart,buildVersionCodenameEnd);
        }
        return this;
     }


    /**
     * <p>build_version_codename</p>
     * LIKE '%值%' entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameLike(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            like("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * NOT LIKE '%值%' entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameNotLike(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            notLike("build_version_codename",buildVersionCodename);
        }
        return this;
     }


    /**
     * <p>build_version_codename</p>
     * LIKE '%值' entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameLikeLeft(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            likeLeft("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * LIKE '值%' entity().getBuildVersionCodename()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameLikeRight(){
        String buildVersionCodename =entity().getBuildVersionCodename();
        if(buildVersionCodename!=null){
            likeRight("build_version_codename",buildVersionCodename);
        }
        return this;
     }

/**
     * <p>build_version_codename</p>
     * 等于 =
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameEq(String buildVersionCodename){
        if(buildVersionCodename!=null){
            eq("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * 不等于 &lt;&gt;
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameNe(String buildVersionCodename){
        if(buildVersionCodename!=null){
            ne("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * 大于 &gt;
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameGt(String buildVersionCodename){
        if(buildVersionCodename!=null){
            gt("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * 大于等于 &gt;=
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameGe(String buildVersionCodename){
        if(buildVersionCodename!=null){
            ge("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * 小于 &lt;
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameLt(String buildVersionCodename){
        if(buildVersionCodename!=null){
            lt("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * 小于等于 &lt;=
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameLe(String buildVersionCodename){
        if(buildVersionCodename!=null){
            le("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * LIKE '%值%'
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameLike(String buildVersionCodename){
        if(buildVersionCodename!=null){
            like("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * NOT LIKE '%值%'
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameNotLike(String buildVersionCodename){
        if(buildVersionCodename!=null){
            notLike("build_version_codename",buildVersionCodename);
        }
        return this;
    }


    /**
     * <p>build_version_codename</p>
     * LIKE '%值'
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameLikeLeft(String buildVersionCodename){
        if(buildVersionCodename!=null){
            likeLeft("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * LIKE '值%'
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameLikeRight(String buildVersionCodename){
        if(buildVersionCodename!=null){
            likeRight("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameIsNull(){
        isNull("build_version_codename");
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameIsNotNull(){
        isNotNull("build_version_codename");
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_version_codename",value);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameIn(String... values){
        if(values!=null && values.length>0){
            in("build_version_codename",values);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_version_codename",value);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildVersionCodenameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_codename",values);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * 等于 = entity().getBuildType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeEq(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            eq("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * 不等于 &lt;&gt; entity().getBuildType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeNe(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            ne("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 大于 &gt; entity().getBuildType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeGt(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            gt("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 大于等于 &gt;= entity().getBuildType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeGe(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            ge("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 小于 &lt; entity().getBuildType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeLt(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            lt("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 小于等于 &lt;= entity().getBuildType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeLe(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            le("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * BETWEEN  entity().getBuildType() AND 值2
     * @param buildTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeBetween(String buildTypeEnd){
        String buildType =entity().getBuildType();
        if(buildType!=null && buildTypeEnd!=null){
            between("build_type",buildType,buildTypeEnd);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * NOT BETWEEN  entity().getBuildType() AND 值2
     * @param buildTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeNotBetween(String buildTypeEnd){
        String buildType =entity().getBuildType();
        if(buildType!=null && buildTypeEnd!=null){
            notBetween("build_type",buildType,buildTypeEnd);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * BETWEEN  entity().getBuildType() AND 值2
     * @param buildTypeStart       值1
     * @param buildTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeBetween(String buildTypeStart,String buildTypeEnd){
        String buildType =entity().getBuildType();
        if(buildType!=null && buildTypeEnd!=null){
            between("build_type",buildTypeStart,buildTypeEnd);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * NOT BETWEEN  entity().getBuildType() AND 值2
     * @param buildTypeStart       值1
     * @param buildTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeNotBetween(String buildTypeStart,String buildTypeEnd){
        String buildType =entity().getBuildType();
        if(buildType!=null && buildTypeEnd!=null){
            notBetween("build_type",buildTypeStart,buildTypeEnd);
        }
        return this;
     }


    /**
     * <p>build_type</p>
     * LIKE '%值%' entity().getBuildType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeLike(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            like("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * NOT LIKE '%值%' entity().getBuildType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeNotLike(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            notLike("build_type",buildType);
        }
        return this;
     }


    /**
     * <p>build_type</p>
     * LIKE '%值' entity().getBuildType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeLikeLeft(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            likeLeft("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * LIKE '值%' entity().getBuildType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeLikeRight(){
        String buildType =entity().getBuildType();
        if(buildType!=null){
            likeRight("build_type",buildType);
        }
        return this;
     }

/**
     * <p>build_type</p>
     * 等于 =
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeEq(String buildType){
        if(buildType!=null){
            eq("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * 不等于 &lt;&gt;
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeNe(String buildType){
        if(buildType!=null){
            ne("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * 大于 &gt;
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeGt(String buildType){
        if(buildType!=null){
            gt("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * 大于等于 &gt;=
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeGe(String buildType){
        if(buildType!=null){
            ge("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * 小于 &lt;
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeLt(String buildType){
        if(buildType!=null){
            lt("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * 小于等于 &lt;=
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeLe(String buildType){
        if(buildType!=null){
            le("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * LIKE '%值%'
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeLike(String buildType){
        if(buildType!=null){
            like("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * NOT LIKE '%值%'
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeNotLike(String buildType){
        if(buildType!=null){
            notLike("build_type",buildType);
        }
        return this;
    }


    /**
     * <p>build_type</p>
     * LIKE '%值'
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeLikeLeft(String buildType){
        if(buildType!=null){
            likeLeft("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * LIKE '值%'
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeLikeRight(String buildType){
        if(buildType!=null){
            likeRight("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeIsNull(){
        isNull("build_type");
        return this;
    }

    /**
     * <p>build_type</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeIsNotNull(){
        isNotNull("build_type");
        return this;
    }

    /**
     * <p>build_type</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("build_type",value);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeIn(String... values){
        if(values!=null && values.length>0){
            in("build_type",values);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_type",value);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_type",values);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * 等于 = entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelEq(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            eq("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * 不等于 &lt;&gt; entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelNe(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            ne("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 大于 &gt; entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelGt(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            gt("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 大于等于 &gt;= entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelGe(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            ge("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 小于 &lt; entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelLt(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            lt("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 小于等于 &lt;= entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelLe(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            le("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * BETWEEN  entity().getBuildApiLevel() AND 值2
     * @param buildApiLevelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelBetween(Integer buildApiLevelEnd){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null && buildApiLevelEnd!=null){
            between("build_api_level",buildApiLevel,buildApiLevelEnd);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * NOT BETWEEN  entity().getBuildApiLevel() AND 值2
     * @param buildApiLevelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelNotBetween(Integer buildApiLevelEnd){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null && buildApiLevelEnd!=null){
            notBetween("build_api_level",buildApiLevel,buildApiLevelEnd);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * BETWEEN  entity().getBuildApiLevel() AND 值2
     * @param buildApiLevelStart       值1
     * @param buildApiLevelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelBetween(Integer buildApiLevelStart,Integer buildApiLevelEnd){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null && buildApiLevelEnd!=null){
            between("build_api_level",buildApiLevelStart,buildApiLevelEnd);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * NOT BETWEEN  entity().getBuildApiLevel() AND 值2
     * @param buildApiLevelStart       值1
     * @param buildApiLevelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelNotBetween(Integer buildApiLevelStart,Integer buildApiLevelEnd){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null && buildApiLevelEnd!=null){
            notBetween("build_api_level",buildApiLevelStart,buildApiLevelEnd);
        }
        return this;
     }


    /**
     * <p>build_api_level</p>
     * LIKE '%值%' entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelLike(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            like("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * NOT LIKE '%值%' entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelNotLike(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            notLike("build_api_level",buildApiLevel);
        }
        return this;
     }


    /**
     * <p>build_api_level</p>
     * LIKE '%值' entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelLikeLeft(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            likeLeft("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * LIKE '值%' entity().getBuildApiLevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelLikeRight(){
        Integer buildApiLevel =entity().getBuildApiLevel();
        if(buildApiLevel!=null){
            likeRight("build_api_level",buildApiLevel);
        }
        return this;
     }

/**
     * <p>build_api_level</p>
     * 等于 =
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelEq(Integer buildApiLevel){
        if(buildApiLevel!=null){
            eq("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * 不等于 &lt;&gt;
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelNe(Integer buildApiLevel){
        if(buildApiLevel!=null){
            ne("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * 大于 &gt;
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelGt(Integer buildApiLevel){
        if(buildApiLevel!=null){
            gt("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * 大于等于 &gt;=
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelGe(Integer buildApiLevel){
        if(buildApiLevel!=null){
            ge("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * 小于 &lt;
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelLt(Integer buildApiLevel){
        if(buildApiLevel!=null){
            lt("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * 小于等于 &lt;=
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelLe(Integer buildApiLevel){
        if(buildApiLevel!=null){
            le("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * LIKE '%值%'
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelLike(Integer buildApiLevel){
        if(buildApiLevel!=null){
            like("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * NOT LIKE '%值%'
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelNotLike(Integer buildApiLevel){
        if(buildApiLevel!=null){
            notLike("build_api_level",buildApiLevel);
        }
        return this;
    }


    /**
     * <p>build_api_level</p>
     * LIKE '%值'
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelLikeLeft(Integer buildApiLevel){
        if(buildApiLevel!=null){
            likeLeft("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * LIKE '值%'
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelLikeRight(Integer buildApiLevel){
        if(buildApiLevel!=null){
            likeRight("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelIsNull(){
        isNull("build_api_level");
        return this;
    }

    /**
     * <p>build_api_level</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelIsNotNull(){
        isNotNull("build_api_level");
        return this;
    }

    /**
     * <p>build_api_level</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("build_api_level",value);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelIn(Integer... values){
        if(values!=null && values.length>0){
            in("build_api_level",values);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("build_api_level",value);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper buildApiLevelNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("build_api_level",values);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 等于 = entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdEq(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            eq("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 不等于 &lt;&gt; entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdNe(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            ne("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 大于 &gt; entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdGt(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            gt("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 大于等于 &gt;= entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdGe(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            ge("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 小于 &lt; entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdLt(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            lt("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 小于等于 &lt;= entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdLe(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            le("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * BETWEEN  entity().getAndoridId() AND 值2
     * @param andoridIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdBetween(String andoridIdEnd){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null && andoridIdEnd!=null){
            between("andorid_id",andoridId,andoridIdEnd);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT BETWEEN  entity().getAndoridId() AND 值2
     * @param andoridIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdNotBetween(String andoridIdEnd){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null && andoridIdEnd!=null){
            notBetween("andorid_id",andoridId,andoridIdEnd);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * BETWEEN  entity().getAndoridId() AND 值2
     * @param andoridIdStart       值1
     * @param andoridIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdBetween(String andoridIdStart,String andoridIdEnd){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null && andoridIdEnd!=null){
            between("andorid_id",andoridIdStart,andoridIdEnd);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT BETWEEN  entity().getAndoridId() AND 值2
     * @param andoridIdStart       值1
     * @param andoridIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdNotBetween(String andoridIdStart,String andoridIdEnd){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null && andoridIdEnd!=null){
            notBetween("andorid_id",andoridIdStart,andoridIdEnd);
        }
        return this;
     }


    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '%值%' entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdLike(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            like("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT LIKE '%值%' entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdNotLike(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            notLike("andorid_id",andoridId);
        }
        return this;
     }


    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '%值' entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdLikeLeft(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            likeLeft("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '值%' entity().getAndoridId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdLikeRight(){
        String andoridId =entity().getAndoridId();
        if(andoridId!=null){
            likeRight("andorid_id",andoridId);
        }
        return this;
     }

/**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 等于 =
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdEq(String andoridId){
        if(andoridId!=null){
            eq("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 不等于 &lt;&gt;
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdNe(String andoridId){
        if(andoridId!=null){
            ne("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 大于 &gt;
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdGt(String andoridId){
        if(andoridId!=null){
            gt("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 大于等于 &gt;=
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdGe(String andoridId){
        if(andoridId!=null){
            ge("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 小于 &lt;
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdLt(String andoridId){
        if(andoridId!=null){
            lt("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 小于等于 &lt;=
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdLe(String andoridId){
        if(andoridId!=null){
            le("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '%值%'
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdLike(String andoridId){
        if(andoridId!=null){
            like("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT LIKE '%值%'
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdNotLike(String andoridId){
        if(andoridId!=null){
            notLike("andorid_id",andoridId);
        }
        return this;
    }


    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '%值'
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdLikeLeft(String andoridId){
        if(andoridId!=null){
            likeLeft("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '值%'
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdLikeRight(String andoridId){
        if(andoridId!=null){
            likeRight("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdIsNull(){
        isNull("andorid_id");
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdIsNotNull(){
        isNotNull("andorid_id");
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("andorid_id",value);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdIn(String... values){
        if(values!=null && values.length>0){
            in("andorid_id",values);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("andorid_id",value);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper andoridIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("andorid_id",values);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * 等于 = entity().getOsArch()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchEq(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            eq("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * 不等于 &lt;&gt; entity().getOsArch()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchNe(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            ne("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 大于 &gt; entity().getOsArch()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchGt(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            gt("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 大于等于 &gt;= entity().getOsArch()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchGe(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            ge("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 小于 &lt; entity().getOsArch()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchLt(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            lt("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 小于等于 &lt;= entity().getOsArch()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchLe(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            le("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * BETWEEN  entity().getOsArch() AND 值2
     * @param osArchEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchBetween(String osArchEnd){
        String osArch =entity().getOsArch();
        if(osArch!=null && osArchEnd!=null){
            between("os_arch",osArch,osArchEnd);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * NOT BETWEEN  entity().getOsArch() AND 值2
     * @param osArchEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchNotBetween(String osArchEnd){
        String osArch =entity().getOsArch();
        if(osArch!=null && osArchEnd!=null){
            notBetween("os_arch",osArch,osArchEnd);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * BETWEEN  entity().getOsArch() AND 值2
     * @param osArchStart       值1
     * @param osArchEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchBetween(String osArchStart,String osArchEnd){
        String osArch =entity().getOsArch();
        if(osArch!=null && osArchEnd!=null){
            between("os_arch",osArchStart,osArchEnd);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * NOT BETWEEN  entity().getOsArch() AND 值2
     * @param osArchStart       值1
     * @param osArchEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchNotBetween(String osArchStart,String osArchEnd){
        String osArch =entity().getOsArch();
        if(osArch!=null && osArchEnd!=null){
            notBetween("os_arch",osArchStart,osArchEnd);
        }
        return this;
     }


    /**
     * <p>os_arch</p>
     * LIKE '%值%' entity().getOsArch()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchLike(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            like("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * NOT LIKE '%值%' entity().getOsArch()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchNotLike(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            notLike("os_arch",osArch);
        }
        return this;
     }


    /**
     * <p>os_arch</p>
     * LIKE '%值' entity().getOsArch()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchLikeLeft(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            likeLeft("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * LIKE '值%' entity().getOsArch()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchLikeRight(){
        String osArch =entity().getOsArch();
        if(osArch!=null){
            likeRight("os_arch",osArch);
        }
        return this;
     }

/**
     * <p>os_arch</p>
     * 等于 =
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchEq(String osArch){
        if(osArch!=null){
            eq("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * 不等于 &lt;&gt;
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchNe(String osArch){
        if(osArch!=null){
            ne("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * 大于 &gt;
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchGt(String osArch){
        if(osArch!=null){
            gt("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * 大于等于 &gt;=
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchGe(String osArch){
        if(osArch!=null){
            ge("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * 小于 &lt;
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchLt(String osArch){
        if(osArch!=null){
            lt("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * 小于等于 &lt;=
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchLe(String osArch){
        if(osArch!=null){
            le("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * LIKE '%值%'
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchLike(String osArch){
        if(osArch!=null){
            like("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * NOT LIKE '%值%'
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchNotLike(String osArch){
        if(osArch!=null){
            notLike("os_arch",osArch);
        }
        return this;
    }


    /**
     * <p>os_arch</p>
     * LIKE '%值'
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchLikeLeft(String osArch){
        if(osArch!=null){
            likeLeft("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * LIKE '值%'
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchLikeRight(String osArch){
        if(osArch!=null){
            likeRight("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchIsNull(){
        isNull("os_arch");
        return this;
    }

    /**
     * <p>os_arch</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchIsNotNull(){
        isNotNull("os_arch");
        return this;
    }

    /**
     * <p>os_arch</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("os_arch",value);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchIn(String... values){
        if(values!=null && values.length>0){
            in("os_arch",values);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("os_arch",value);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osArchNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os_arch",values);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 等于 = entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeEq(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            eq("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 不等于 &lt;&gt; entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeNe(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            ne("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 大于 &gt; entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeGt(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            gt("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 大于等于 &gt;= entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeGe(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            ge("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 小于 &lt; entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeLt(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            lt("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 小于等于 &lt;= entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeLe(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            le("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * BETWEEN  entity().getPhoneType() AND 值2
     * @param phoneTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeBetween(String phoneTypeEnd){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null && phoneTypeEnd!=null){
            between("phone_type",phoneType,phoneTypeEnd);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT BETWEEN  entity().getPhoneType() AND 值2
     * @param phoneTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeNotBetween(String phoneTypeEnd){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null && phoneTypeEnd!=null){
            notBetween("phone_type",phoneType,phoneTypeEnd);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * BETWEEN  entity().getPhoneType() AND 值2
     * @param phoneTypeStart       值1
     * @param phoneTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeBetween(String phoneTypeStart,String phoneTypeEnd){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null && phoneTypeEnd!=null){
            between("phone_type",phoneTypeStart,phoneTypeEnd);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT BETWEEN  entity().getPhoneType() AND 值2
     * @param phoneTypeStart       值1
     * @param phoneTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeNotBetween(String phoneTypeStart,String phoneTypeEnd){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null && phoneTypeEnd!=null){
            notBetween("phone_type",phoneTypeStart,phoneTypeEnd);
        }
        return this;
     }


    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '%值%' entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeLike(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            like("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT LIKE '%值%' entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeNotLike(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            notLike("phone_type",phoneType);
        }
        return this;
     }


    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '%值' entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeLikeLeft(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            likeLeft("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '值%' entity().getPhoneType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeLikeRight(){
        String phoneType =entity().getPhoneType();
        if(phoneType!=null){
            likeRight("phone_type",phoneType);
        }
        return this;
     }

/**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 等于 =
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeEq(String phoneType){
        if(phoneType!=null){
            eq("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 不等于 &lt;&gt;
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeNe(String phoneType){
        if(phoneType!=null){
            ne("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 大于 &gt;
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeGt(String phoneType){
        if(phoneType!=null){
            gt("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 大于等于 &gt;=
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeGe(String phoneType){
        if(phoneType!=null){
            ge("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 小于 &lt;
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeLt(String phoneType){
        if(phoneType!=null){
            lt("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 小于等于 &lt;=
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeLe(String phoneType){
        if(phoneType!=null){
            le("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '%值%'
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeLike(String phoneType){
        if(phoneType!=null){
            like("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT LIKE '%值%'
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeNotLike(String phoneType){
        if(phoneType!=null){
            notLike("phone_type",phoneType);
        }
        return this;
    }


    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '%值'
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeLikeLeft(String phoneType){
        if(phoneType!=null){
            likeLeft("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '值%'
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeLikeRight(String phoneType){
        if(phoneType!=null){
            likeRight("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeIsNull(){
        isNull("phone_type");
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeIsNotNull(){
        isNotNull("phone_type");
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_type",value);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeIn(String... values){
        if(values!=null && values.length>0){
            in("phone_type",values);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_type",value);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper phoneTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_type",values);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * 等于 = entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionEq(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            eq("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * 不等于 &lt;&gt; entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionNe(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            ne("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 大于 &gt; entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionGt(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            gt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 大于等于 &gt;= entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionGe(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            ge("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 小于 &lt; entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionLt(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            lt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 小于等于 &lt;= entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionLe(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            le("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionBetween(String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            between("os_version",osVersion,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * NOT BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionNotBetween(String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            notBetween("os_version",osVersion,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionBetween(String osVersionStart,String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            between("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * NOT BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionNotBetween(String osVersionStart,String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            notBetween("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }


    /**
     * <p>os_version</p>
     * LIKE '%值%' entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionLike(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            like("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * NOT LIKE '%值%' entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionNotLike(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            notLike("os_version",osVersion);
        }
        return this;
     }


    /**
     * <p>os_version</p>
     * LIKE '%值' entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionLikeLeft(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            likeLeft("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * LIKE '值%' entity().getOsVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionLikeRight(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            likeRight("os_version",osVersion);
        }
        return this;
     }

/**
     * <p>os_version</p>
     * 等于 =
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionEq(String osVersion){
        if(osVersion!=null){
            eq("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * 不等于 &lt;&gt;
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionNe(String osVersion){
        if(osVersion!=null){
            ne("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * 大于 &gt;
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionGt(String osVersion){
        if(osVersion!=null){
            gt("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * 大于等于 &gt;=
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionGe(String osVersion){
        if(osVersion!=null){
            ge("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * 小于 &lt;
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionLt(String osVersion){
        if(osVersion!=null){
            lt("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * 小于等于 &lt;=
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionLe(String osVersion){
        if(osVersion!=null){
            le("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * LIKE '%值%'
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionLike(String osVersion){
        if(osVersion!=null){
            like("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * NOT LIKE '%值%'
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionNotLike(String osVersion){
        if(osVersion!=null){
            notLike("os_version",osVersion);
        }
        return this;
    }


    /**
     * <p>os_version</p>
     * LIKE '%值'
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionLikeLeft(String osVersion){
        if(osVersion!=null){
            likeLeft("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * LIKE '值%'
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionLikeRight(String osVersion){
        if(osVersion!=null){
            likeRight("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionIsNull(){
        isNull("os_version");
        return this;
    }

    /**
     * <p>os_version</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionIsNotNull(){
        isNotNull("os_version");
        return this;
    }

    /**
     * <p>os_version</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("os_version",value);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionIn(String... values){
        if(values!=null && values.length>0){
            in("os_version",values);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("os_version",value);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper osVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os_version",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * 等于 = entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberEq(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            eq("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * 不等于 &lt;&gt; entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberNe(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            ne("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 大于 &gt; entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberGt(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            gt("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 大于等于 &gt;= entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberGe(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            ge("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 小于 &lt; entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberLt(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            lt("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 小于等于 &lt;= entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberLe(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            le("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * BETWEEN  entity().getSimSerialNumber() AND 值2
     * @param simSerialNumberEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberBetween(String simSerialNumberEnd){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null && simSerialNumberEnd!=null){
            between("sim_serial_number",simSerialNumber,simSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * NOT BETWEEN  entity().getSimSerialNumber() AND 值2
     * @param simSerialNumberEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberNotBetween(String simSerialNumberEnd){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null && simSerialNumberEnd!=null){
            notBetween("sim_serial_number",simSerialNumber,simSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * BETWEEN  entity().getSimSerialNumber() AND 值2
     * @param simSerialNumberStart       值1
     * @param simSerialNumberEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberBetween(String simSerialNumberStart,String simSerialNumberEnd){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null && simSerialNumberEnd!=null){
            between("sim_serial_number",simSerialNumberStart,simSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * NOT BETWEEN  entity().getSimSerialNumber() AND 值2
     * @param simSerialNumberStart       值1
     * @param simSerialNumberEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberNotBetween(String simSerialNumberStart,String simSerialNumberEnd){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null && simSerialNumberEnd!=null){
            notBetween("sim_serial_number",simSerialNumberStart,simSerialNumberEnd);
        }
        return this;
     }


    /**
     * <p>SIM卡的序列号</p>
     * LIKE '%值%' entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberLike(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            like("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * NOT LIKE '%值%' entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberNotLike(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            notLike("sim_serial_number",simSerialNumber);
        }
        return this;
     }


    /**
     * <p>SIM卡的序列号</p>
     * LIKE '%值' entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberLikeLeft(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            likeLeft("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * LIKE '值%' entity().getSimSerialNumber()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberLikeRight(){
        String simSerialNumber =entity().getSimSerialNumber();
        if(simSerialNumber!=null){
            likeRight("sim_serial_number",simSerialNumber);
        }
        return this;
     }

/**
     * <p>SIM卡的序列号</p>
     * 等于 =
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberEq(String simSerialNumber){
        if(simSerialNumber!=null){
            eq("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * 不等于 &lt;&gt;
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberNe(String simSerialNumber){
        if(simSerialNumber!=null){
            ne("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * 大于 &gt;
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberGt(String simSerialNumber){
        if(simSerialNumber!=null){
            gt("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * 大于等于 &gt;=
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberGe(String simSerialNumber){
        if(simSerialNumber!=null){
            ge("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * 小于 &lt;
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberLt(String simSerialNumber){
        if(simSerialNumber!=null){
            lt("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * 小于等于 &lt;=
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberLe(String simSerialNumber){
        if(simSerialNumber!=null){
            le("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * LIKE '%值%'
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberLike(String simSerialNumber){
        if(simSerialNumber!=null){
            like("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * NOT LIKE '%值%'
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberNotLike(String simSerialNumber){
        if(simSerialNumber!=null){
            notLike("sim_serial_number",simSerialNumber);
        }
        return this;
    }


    /**
     * <p>SIM卡的序列号</p>
     * LIKE '%值'
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberLikeLeft(String simSerialNumber){
        if(simSerialNumber!=null){
            likeLeft("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * LIKE '值%'
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberLikeRight(String simSerialNumber){
        if(simSerialNumber!=null){
            likeRight("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberIsNull(){
        isNull("sim_serial_number");
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberIsNotNull(){
        isNotNull("sim_serial_number");
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("sim_serial_number",value);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberIn(String... values){
        if(values!=null && values.length>0){
            in("sim_serial_number",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("sim_serial_number",value);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper simSerialNumberNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("sim_serial_number",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * 等于 = entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorEq(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            eq("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * 不等于 &lt;&gt; entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNe(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            ne("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 大于 &gt; entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorGt(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            gt("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 大于等于 &gt;= entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorGe(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            ge("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 小于 &lt; entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorLt(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            lt("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 小于等于 &lt;= entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorLe(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            le("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * BETWEEN  entity().getNetworkOperator() AND 值2
     * @param networkOperatorEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorBetween(String networkOperatorEnd){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null && networkOperatorEnd!=null){
            between("network_operator",networkOperator,networkOperatorEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * NOT BETWEEN  entity().getNetworkOperator() AND 值2
     * @param networkOperatorEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNotBetween(String networkOperatorEnd){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null && networkOperatorEnd!=null){
            notBetween("network_operator",networkOperator,networkOperatorEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * BETWEEN  entity().getNetworkOperator() AND 值2
     * @param networkOperatorStart       值1
     * @param networkOperatorEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorBetween(String networkOperatorStart,String networkOperatorEnd){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null && networkOperatorEnd!=null){
            between("network_operator",networkOperatorStart,networkOperatorEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * NOT BETWEEN  entity().getNetworkOperator() AND 值2
     * @param networkOperatorStart       值1
     * @param networkOperatorEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNotBetween(String networkOperatorStart,String networkOperatorEnd){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null && networkOperatorEnd!=null){
            notBetween("network_operator",networkOperatorStart,networkOperatorEnd);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商</p>
     * LIKE '%值%' entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorLike(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            like("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * NOT LIKE '%值%' entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNotLike(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            notLike("network_operator",networkOperator);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商</p>
     * LIKE '%值' entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorLikeLeft(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            likeLeft("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * LIKE '值%' entity().getNetworkOperator()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorLikeRight(){
        String networkOperator =entity().getNetworkOperator();
        if(networkOperator!=null){
            likeRight("network_operator",networkOperator);
        }
        return this;
     }

/**
     * <p>SIM卡的运营商</p>
     * 等于 =
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorEq(String networkOperator){
        if(networkOperator!=null){
            eq("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * 不等于 &lt;&gt;
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNe(String networkOperator){
        if(networkOperator!=null){
            ne("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * 大于 &gt;
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorGt(String networkOperator){
        if(networkOperator!=null){
            gt("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * 大于等于 &gt;=
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorGe(String networkOperator){
        if(networkOperator!=null){
            ge("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * 小于 &lt;
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorLt(String networkOperator){
        if(networkOperator!=null){
            lt("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * 小于等于 &lt;=
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorLe(String networkOperator){
        if(networkOperator!=null){
            le("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * LIKE '%值%'
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorLike(String networkOperator){
        if(networkOperator!=null){
            like("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * NOT LIKE '%值%'
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNotLike(String networkOperator){
        if(networkOperator!=null){
            notLike("network_operator",networkOperator);
        }
        return this;
    }


    /**
     * <p>SIM卡的运营商</p>
     * LIKE '%值'
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorLikeLeft(String networkOperator){
        if(networkOperator!=null){
            likeLeft("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * LIKE '值%'
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorLikeRight(String networkOperator){
        if(networkOperator!=null){
            likeRight("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorIsNull(){
        isNull("network_operator");
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorIsNotNull(){
        isNotNull("network_operator");
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("network_operator",value);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorIn(String... values){
        if(values!=null && values.length>0){
            in("network_operator",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("network_operator",value);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("network_operator",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * 等于 = entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameEq(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            eq("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * 不等于 &lt;&gt; entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameNe(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            ne("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 大于 &gt; entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameGt(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            gt("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 大于等于 &gt;= entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameGe(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            ge("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 小于 &lt; entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameLt(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            lt("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 小于等于 &lt;= entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameLe(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            le("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * BETWEEN  entity().getNetworkOperatorName() AND 值2
     * @param networkOperatorNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameBetween(String networkOperatorNameEnd){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null && networkOperatorNameEnd!=null){
            between("network_operator_name",networkOperatorName,networkOperatorNameEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT BETWEEN  entity().getNetworkOperatorName() AND 值2
     * @param networkOperatorNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameNotBetween(String networkOperatorNameEnd){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null && networkOperatorNameEnd!=null){
            notBetween("network_operator_name",networkOperatorName,networkOperatorNameEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * BETWEEN  entity().getNetworkOperatorName() AND 值2
     * @param networkOperatorNameStart       值1
     * @param networkOperatorNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameBetween(String networkOperatorNameStart,String networkOperatorNameEnd){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null && networkOperatorNameEnd!=null){
            between("network_operator_name",networkOperatorNameStart,networkOperatorNameEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT BETWEEN  entity().getNetworkOperatorName() AND 值2
     * @param networkOperatorNameStart       值1
     * @param networkOperatorNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameNotBetween(String networkOperatorNameStart,String networkOperatorNameEnd){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null && networkOperatorNameEnd!=null){
            notBetween("network_operator_name",networkOperatorNameStart,networkOperatorNameEnd);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '%值%' entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameLike(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            like("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT LIKE '%值%' entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameNotLike(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            notLike("network_operator_name",networkOperatorName);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '%值' entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameLikeLeft(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            likeLeft("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '值%' entity().getNetworkOperatorName()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameLikeRight(){
        String networkOperatorName =entity().getNetworkOperatorName();
        if(networkOperatorName!=null){
            likeRight("network_operator_name",networkOperatorName);
        }
        return this;
     }

/**
     * <p>SIM卡的运营商名称</p>
     * 等于 =
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameEq(String networkOperatorName){
        if(networkOperatorName!=null){
            eq("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * 不等于 &lt;&gt;
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameNe(String networkOperatorName){
        if(networkOperatorName!=null){
            ne("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * 大于 &gt;
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameGt(String networkOperatorName){
        if(networkOperatorName!=null){
            gt("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * 大于等于 &gt;=
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameGe(String networkOperatorName){
        if(networkOperatorName!=null){
            ge("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * 小于 &lt;
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameLt(String networkOperatorName){
        if(networkOperatorName!=null){
            lt("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * 小于等于 &lt;=
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameLe(String networkOperatorName){
        if(networkOperatorName!=null){
            le("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '%值%'
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameLike(String networkOperatorName){
        if(networkOperatorName!=null){
            like("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT LIKE '%值%'
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameNotLike(String networkOperatorName){
        if(networkOperatorName!=null){
            notLike("network_operator_name",networkOperatorName);
        }
        return this;
    }


    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '%值'
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameLikeLeft(String networkOperatorName){
        if(networkOperatorName!=null){
            likeLeft("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '值%'
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameLikeRight(String networkOperatorName){
        if(networkOperatorName!=null){
            likeRight("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameIsNull(){
        isNull("network_operator_name");
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameIsNotNull(){
        isNotNull("network_operator_name");
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("network_operator_name",value);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameIn(String... values){
        if(values!=null && values.length>0){
            in("network_operator_name",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("network_operator_name",value);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper networkOperatorNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("network_operator_name",values);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * 等于 = entity().getUimode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeEq(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            eq("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * 不等于 &lt;&gt; entity().getUimode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeNe(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            ne("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 大于 &gt; entity().getUimode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeGt(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            gt("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 大于等于 &gt;= entity().getUimode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeGe(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            ge("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 小于 &lt; entity().getUimode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeLt(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            lt("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 小于等于 &lt;= entity().getUimode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeLe(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            le("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * BETWEEN  entity().getUimode() AND 值2
     * @param uimodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeBetween(String uimodeEnd){
        String uimode =entity().getUimode();
        if(uimode!=null && uimodeEnd!=null){
            between("uimode",uimode,uimodeEnd);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * NOT BETWEEN  entity().getUimode() AND 值2
     * @param uimodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeNotBetween(String uimodeEnd){
        String uimode =entity().getUimode();
        if(uimode!=null && uimodeEnd!=null){
            notBetween("uimode",uimode,uimodeEnd);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * BETWEEN  entity().getUimode() AND 值2
     * @param uimodeStart       值1
     * @param uimodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeBetween(String uimodeStart,String uimodeEnd){
        String uimode =entity().getUimode();
        if(uimode!=null && uimodeEnd!=null){
            between("uimode",uimodeStart,uimodeEnd);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * NOT BETWEEN  entity().getUimode() AND 值2
     * @param uimodeStart       值1
     * @param uimodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeNotBetween(String uimodeStart,String uimodeEnd){
        String uimode =entity().getUimode();
        if(uimode!=null && uimodeEnd!=null){
            notBetween("uimode",uimodeStart,uimodeEnd);
        }
        return this;
     }


    /**
     * <p>UI mode</p>
     * LIKE '%值%' entity().getUimode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeLike(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            like("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * NOT LIKE '%值%' entity().getUimode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeNotLike(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            notLike("uimode",uimode);
        }
        return this;
     }


    /**
     * <p>UI mode</p>
     * LIKE '%值' entity().getUimode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeLikeLeft(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            likeLeft("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * LIKE '值%' entity().getUimode()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeLikeRight(){
        String uimode =entity().getUimode();
        if(uimode!=null){
            likeRight("uimode",uimode);
        }
        return this;
     }

/**
     * <p>UI mode</p>
     * 等于 =
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeEq(String uimode){
        if(uimode!=null){
            eq("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * 不等于 &lt;&gt;
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeNe(String uimode){
        if(uimode!=null){
            ne("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * 大于 &gt;
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeGt(String uimode){
        if(uimode!=null){
            gt("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * 大于等于 &gt;=
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeGe(String uimode){
        if(uimode!=null){
            ge("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * 小于 &lt;
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeLt(String uimode){
        if(uimode!=null){
            lt("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * 小于等于 &lt;=
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeLe(String uimode){
        if(uimode!=null){
            le("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * LIKE '%值%'
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeLike(String uimode){
        if(uimode!=null){
            like("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * NOT LIKE '%值%'
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeNotLike(String uimode){
        if(uimode!=null){
            notLike("uimode",uimode);
        }
        return this;
    }


    /**
     * <p>UI mode</p>
     * LIKE '%值'
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeLikeLeft(String uimode){
        if(uimode!=null){
            likeLeft("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * LIKE '值%'
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeLikeRight(String uimode){
        if(uimode!=null){
            likeRight("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeIsNull(){
        isNull("uimode");
        return this;
    }

    /**
     * <p>UI mode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeIsNotNull(){
        isNotNull("uimode");
        return this;
    }

    /**
     * <p>UI mode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("uimode",value);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeIn(String... values){
        if(values!=null && values.length>0){
            in("uimode",values);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("uimode",value);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper uimodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("uimode",values);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * 等于 = entity().getResolution()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionEq(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            eq("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * 不等于 &lt;&gt; entity().getResolution()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionNe(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            ne("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 大于 &gt; entity().getResolution()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionGt(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            gt("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 大于等于 &gt;= entity().getResolution()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionGe(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            ge("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 小于 &lt; entity().getResolution()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionLt(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            lt("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 小于等于 &lt;= entity().getResolution()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionLe(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            le("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * BETWEEN  entity().getResolution() AND 值2
     * @param resolutionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionBetween(String resolutionEnd){
        String resolution =entity().getResolution();
        if(resolution!=null && resolutionEnd!=null){
            between("resolution",resolution,resolutionEnd);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * NOT BETWEEN  entity().getResolution() AND 值2
     * @param resolutionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionNotBetween(String resolutionEnd){
        String resolution =entity().getResolution();
        if(resolution!=null && resolutionEnd!=null){
            notBetween("resolution",resolution,resolutionEnd);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * BETWEEN  entity().getResolution() AND 值2
     * @param resolutionStart       值1
     * @param resolutionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionBetween(String resolutionStart,String resolutionEnd){
        String resolution =entity().getResolution();
        if(resolution!=null && resolutionEnd!=null){
            between("resolution",resolutionStart,resolutionEnd);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * NOT BETWEEN  entity().getResolution() AND 值2
     * @param resolutionStart       值1
     * @param resolutionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionNotBetween(String resolutionStart,String resolutionEnd){
        String resolution =entity().getResolution();
        if(resolution!=null && resolutionEnd!=null){
            notBetween("resolution",resolutionStart,resolutionEnd);
        }
        return this;
     }


    /**
     * <p>resolution</p>
     * LIKE '%值%' entity().getResolution()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionLike(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            like("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * NOT LIKE '%值%' entity().getResolution()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionNotLike(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            notLike("resolution",resolution);
        }
        return this;
     }


    /**
     * <p>resolution</p>
     * LIKE '%值' entity().getResolution()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionLikeLeft(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            likeLeft("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * LIKE '值%' entity().getResolution()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionLikeRight(){
        String resolution =entity().getResolution();
        if(resolution!=null){
            likeRight("resolution",resolution);
        }
        return this;
     }

/**
     * <p>resolution</p>
     * 等于 =
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionEq(String resolution){
        if(resolution!=null){
            eq("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * 不等于 &lt;&gt;
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionNe(String resolution){
        if(resolution!=null){
            ne("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * 大于 &gt;
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionGt(String resolution){
        if(resolution!=null){
            gt("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * 大于等于 &gt;=
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionGe(String resolution){
        if(resolution!=null){
            ge("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * 小于 &lt;
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionLt(String resolution){
        if(resolution!=null){
            lt("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * 小于等于 &lt;=
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionLe(String resolution){
        if(resolution!=null){
            le("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * LIKE '%值%'
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionLike(String resolution){
        if(resolution!=null){
            like("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * NOT LIKE '%值%'
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionNotLike(String resolution){
        if(resolution!=null){
            notLike("resolution",resolution);
        }
        return this;
    }


    /**
     * <p>resolution</p>
     * LIKE '%值'
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionLikeLeft(String resolution){
        if(resolution!=null){
            likeLeft("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * LIKE '值%'
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionLikeRight(String resolution){
        if(resolution!=null){
            likeRight("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionIsNull(){
        isNull("resolution");
        return this;
    }

    /**
     * <p>resolution</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionIsNotNull(){
        isNotNull("resolution");
        return this;
    }

    /**
     * <p>resolution</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("resolution",value);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionIn(String... values){
        if(values!=null && values.length>0){
            in("resolution",values);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("resolution",value);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper resolutionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("resolution",values);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * 等于 = entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemEq(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            eq("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * 不等于 &lt;&gt; entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemNe(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            ne("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 大于 &gt; entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemGt(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            gt("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 大于等于 &gt;= entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemGe(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            ge("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 小于 &lt; entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemLt(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            lt("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 小于等于 &lt;= entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemLe(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            le("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * BETWEEN  entity().getTotalMem() AND 值2
     * @param totalMemEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemBetween(Long totalMemEnd){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null && totalMemEnd!=null){
            between("total_mem",totalMem,totalMemEnd);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * NOT BETWEEN  entity().getTotalMem() AND 值2
     * @param totalMemEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemNotBetween(Long totalMemEnd){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null && totalMemEnd!=null){
            notBetween("total_mem",totalMem,totalMemEnd);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * BETWEEN  entity().getTotalMem() AND 值2
     * @param totalMemStart       值1
     * @param totalMemEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemBetween(Long totalMemStart,Long totalMemEnd){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null && totalMemEnd!=null){
            between("total_mem",totalMemStart,totalMemEnd);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * NOT BETWEEN  entity().getTotalMem() AND 值2
     * @param totalMemStart       值1
     * @param totalMemEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemNotBetween(Long totalMemStart,Long totalMemEnd){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null && totalMemEnd!=null){
            notBetween("total_mem",totalMemStart,totalMemEnd);
        }
        return this;
     }


    /**
     * <p>totalMem</p>
     * LIKE '%值%' entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemLike(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            like("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * NOT LIKE '%值%' entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemNotLike(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            notLike("total_mem",totalMem);
        }
        return this;
     }


    /**
     * <p>totalMem</p>
     * LIKE '%值' entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemLikeLeft(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            likeLeft("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * LIKE '值%' entity().getTotalMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemLikeRight(){
        Long totalMem =entity().getTotalMem();
        if(totalMem!=null){
            likeRight("total_mem",totalMem);
        }
        return this;
     }

/**
     * <p>totalMem</p>
     * 等于 =
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemEq(Long totalMem){
        if(totalMem!=null){
            eq("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * 不等于 &lt;&gt;
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemNe(Long totalMem){
        if(totalMem!=null){
            ne("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * 大于 &gt;
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemGt(Long totalMem){
        if(totalMem!=null){
            gt("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * 大于等于 &gt;=
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemGe(Long totalMem){
        if(totalMem!=null){
            ge("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * 小于 &lt;
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemLt(Long totalMem){
        if(totalMem!=null){
            lt("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * 小于等于 &lt;=
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemLe(Long totalMem){
        if(totalMem!=null){
            le("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * LIKE '%值%'
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemLike(Long totalMem){
        if(totalMem!=null){
            like("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * NOT LIKE '%值%'
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemNotLike(Long totalMem){
        if(totalMem!=null){
            notLike("total_mem",totalMem);
        }
        return this;
    }


    /**
     * <p>totalMem</p>
     * LIKE '%值'
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemLikeLeft(Long totalMem){
        if(totalMem!=null){
            likeLeft("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * LIKE '值%'
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemLikeRight(Long totalMem){
        if(totalMem!=null){
            likeRight("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemIsNull(){
        isNull("total_mem");
        return this;
    }

    /**
     * <p>totalMem</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemIsNotNull(){
        isNotNull("total_mem");
        return this;
    }

    /**
     * <p>totalMem</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("total_mem",value);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemIn(Long... values){
        if(values!=null && values.length>0){
            in("total_mem",values);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("total_mem",value);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalMemNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("total_mem",values);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * 等于 = entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemEq(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            eq("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * 不等于 &lt;&gt; entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemNe(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            ne("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 大于 &gt; entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemGt(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            gt("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 大于等于 &gt;= entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemGe(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            ge("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 小于 &lt; entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemLt(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            lt("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 小于等于 &lt;= entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemLe(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            le("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * BETWEEN  entity().getAvailMem() AND 值2
     * @param availMemEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemBetween(Long availMemEnd){
        Long availMem =entity().getAvailMem();
        if(availMem!=null && availMemEnd!=null){
            between("avail_mem",availMem,availMemEnd);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * NOT BETWEEN  entity().getAvailMem() AND 值2
     * @param availMemEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemNotBetween(Long availMemEnd){
        Long availMem =entity().getAvailMem();
        if(availMem!=null && availMemEnd!=null){
            notBetween("avail_mem",availMem,availMemEnd);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * BETWEEN  entity().getAvailMem() AND 值2
     * @param availMemStart       值1
     * @param availMemEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemBetween(Long availMemStart,Long availMemEnd){
        Long availMem =entity().getAvailMem();
        if(availMem!=null && availMemEnd!=null){
            between("avail_mem",availMemStart,availMemEnd);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * NOT BETWEEN  entity().getAvailMem() AND 值2
     * @param availMemStart       值1
     * @param availMemEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemNotBetween(Long availMemStart,Long availMemEnd){
        Long availMem =entity().getAvailMem();
        if(availMem!=null && availMemEnd!=null){
            notBetween("avail_mem",availMemStart,availMemEnd);
        }
        return this;
     }


    /**
     * <p>availMem</p>
     * LIKE '%值%' entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemLike(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            like("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * NOT LIKE '%值%' entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemNotLike(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            notLike("avail_mem",availMem);
        }
        return this;
     }


    /**
     * <p>availMem</p>
     * LIKE '%值' entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemLikeLeft(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            likeLeft("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * LIKE '值%' entity().getAvailMem()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemLikeRight(){
        Long availMem =entity().getAvailMem();
        if(availMem!=null){
            likeRight("avail_mem",availMem);
        }
        return this;
     }

/**
     * <p>availMem</p>
     * 等于 =
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemEq(Long availMem){
        if(availMem!=null){
            eq("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * 不等于 &lt;&gt;
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemNe(Long availMem){
        if(availMem!=null){
            ne("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * 大于 &gt;
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemGt(Long availMem){
        if(availMem!=null){
            gt("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * 大于等于 &gt;=
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemGe(Long availMem){
        if(availMem!=null){
            ge("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * 小于 &lt;
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemLt(Long availMem){
        if(availMem!=null){
            lt("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * 小于等于 &lt;=
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemLe(Long availMem){
        if(availMem!=null){
            le("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * LIKE '%值%'
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemLike(Long availMem){
        if(availMem!=null){
            like("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * NOT LIKE '%值%'
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemNotLike(Long availMem){
        if(availMem!=null){
            notLike("avail_mem",availMem);
        }
        return this;
    }


    /**
     * <p>availMem</p>
     * LIKE '%值'
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemLikeLeft(Long availMem){
        if(availMem!=null){
            likeLeft("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * LIKE '值%'
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemLikeRight(Long availMem){
        if(availMem!=null){
            likeRight("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemIsNull(){
        isNull("avail_mem");
        return this;
    }

    /**
     * <p>availMem</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemIsNotNull(){
        isNotNull("avail_mem");
        return this;
    }

    /**
     * <p>availMem</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("avail_mem",value);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemIn(Long... values){
        if(values!=null && values.length>0){
            in("avail_mem",values);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("avail_mem",value);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availMemNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("avail_mem",values);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * 等于 = entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageEq(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            eq("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * 不等于 &lt;&gt; entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageNe(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            ne("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 大于 &gt; entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageGt(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            gt("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 大于等于 &gt;= entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageGe(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            ge("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 小于 &lt; entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageLt(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            lt("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 小于等于 &lt;= entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageLe(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            le("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * BETWEEN  entity().getTotalStorage() AND 值2
     * @param totalStorageEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageBetween(Long totalStorageEnd){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null && totalStorageEnd!=null){
            between("total_storage",totalStorage,totalStorageEnd);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * NOT BETWEEN  entity().getTotalStorage() AND 值2
     * @param totalStorageEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageNotBetween(Long totalStorageEnd){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null && totalStorageEnd!=null){
            notBetween("total_storage",totalStorage,totalStorageEnd);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * BETWEEN  entity().getTotalStorage() AND 值2
     * @param totalStorageStart       值1
     * @param totalStorageEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageBetween(Long totalStorageStart,Long totalStorageEnd){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null && totalStorageEnd!=null){
            between("total_storage",totalStorageStart,totalStorageEnd);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * NOT BETWEEN  entity().getTotalStorage() AND 值2
     * @param totalStorageStart       值1
     * @param totalStorageEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageNotBetween(Long totalStorageStart,Long totalStorageEnd){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null && totalStorageEnd!=null){
            notBetween("total_storage",totalStorageStart,totalStorageEnd);
        }
        return this;
     }


    /**
     * <p>totalStorage</p>
     * LIKE '%值%' entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageLike(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            like("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * NOT LIKE '%值%' entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageNotLike(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            notLike("total_storage",totalStorage);
        }
        return this;
     }


    /**
     * <p>totalStorage</p>
     * LIKE '%值' entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageLikeLeft(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            likeLeft("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * LIKE '值%' entity().getTotalStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageLikeRight(){
        Long totalStorage =entity().getTotalStorage();
        if(totalStorage!=null){
            likeRight("total_storage",totalStorage);
        }
        return this;
     }

/**
     * <p>totalStorage</p>
     * 等于 =
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageEq(Long totalStorage){
        if(totalStorage!=null){
            eq("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * 不等于 &lt;&gt;
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageNe(Long totalStorage){
        if(totalStorage!=null){
            ne("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * 大于 &gt;
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageGt(Long totalStorage){
        if(totalStorage!=null){
            gt("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * 大于等于 &gt;=
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageGe(Long totalStorage){
        if(totalStorage!=null){
            ge("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * 小于 &lt;
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageLt(Long totalStorage){
        if(totalStorage!=null){
            lt("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * 小于等于 &lt;=
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageLe(Long totalStorage){
        if(totalStorage!=null){
            le("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * LIKE '%值%'
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageLike(Long totalStorage){
        if(totalStorage!=null){
            like("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * NOT LIKE '%值%'
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageNotLike(Long totalStorage){
        if(totalStorage!=null){
            notLike("total_storage",totalStorage);
        }
        return this;
    }


    /**
     * <p>totalStorage</p>
     * LIKE '%值'
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageLikeLeft(Long totalStorage){
        if(totalStorage!=null){
            likeLeft("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * LIKE '值%'
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageLikeRight(Long totalStorage){
        if(totalStorage!=null){
            likeRight("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageIsNull(){
        isNull("total_storage");
        return this;
    }

    /**
     * <p>totalStorage</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageIsNotNull(){
        isNotNull("total_storage");
        return this;
    }

    /**
     * <p>totalStorage</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("total_storage",value);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageIn(Long... values){
        if(values!=null && values.length>0){
            in("total_storage",values);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("total_storage",value);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper totalStorageNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("total_storage",values);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * 等于 = entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageEq(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            eq("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * 不等于 &lt;&gt; entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageNe(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            ne("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 大于 &gt; entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageGt(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            gt("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 大于等于 &gt;= entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageGe(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            ge("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 小于 &lt; entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageLt(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            lt("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 小于等于 &lt;= entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageLe(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            le("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * BETWEEN  entity().getAvailStorage() AND 值2
     * @param availStorageEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageBetween(Long availStorageEnd){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null && availStorageEnd!=null){
            between("avail_storage",availStorage,availStorageEnd);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * NOT BETWEEN  entity().getAvailStorage() AND 值2
     * @param availStorageEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageNotBetween(Long availStorageEnd){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null && availStorageEnd!=null){
            notBetween("avail_storage",availStorage,availStorageEnd);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * BETWEEN  entity().getAvailStorage() AND 值2
     * @param availStorageStart       值1
     * @param availStorageEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageBetween(Long availStorageStart,Long availStorageEnd){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null && availStorageEnd!=null){
            between("avail_storage",availStorageStart,availStorageEnd);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * NOT BETWEEN  entity().getAvailStorage() AND 值2
     * @param availStorageStart       值1
     * @param availStorageEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageNotBetween(Long availStorageStart,Long availStorageEnd){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null && availStorageEnd!=null){
            notBetween("avail_storage",availStorageStart,availStorageEnd);
        }
        return this;
     }


    /**
     * <p>availStorage</p>
     * LIKE '%值%' entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageLike(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            like("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * NOT LIKE '%值%' entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageNotLike(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            notLike("avail_storage",availStorage);
        }
        return this;
     }


    /**
     * <p>availStorage</p>
     * LIKE '%值' entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageLikeLeft(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            likeLeft("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * LIKE '值%' entity().getAvailStorage()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageLikeRight(){
        Long availStorage =entity().getAvailStorage();
        if(availStorage!=null){
            likeRight("avail_storage",availStorage);
        }
        return this;
     }

/**
     * <p>availStorage</p>
     * 等于 =
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageEq(Long availStorage){
        if(availStorage!=null){
            eq("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * 不等于 &lt;&gt;
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageNe(Long availStorage){
        if(availStorage!=null){
            ne("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * 大于 &gt;
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageGt(Long availStorage){
        if(availStorage!=null){
            gt("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * 大于等于 &gt;=
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageGe(Long availStorage){
        if(availStorage!=null){
            ge("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * 小于 &lt;
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageLt(Long availStorage){
        if(availStorage!=null){
            lt("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * 小于等于 &lt;=
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageLe(Long availStorage){
        if(availStorage!=null){
            le("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * LIKE '%值%'
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageLike(Long availStorage){
        if(availStorage!=null){
            like("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * NOT LIKE '%值%'
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageNotLike(Long availStorage){
        if(availStorage!=null){
            notLike("avail_storage",availStorage);
        }
        return this;
    }


    /**
     * <p>availStorage</p>
     * LIKE '%值'
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageLikeLeft(Long availStorage){
        if(availStorage!=null){
            likeLeft("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * LIKE '值%'
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageLikeRight(Long availStorage){
        if(availStorage!=null){
            likeRight("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageIsNull(){
        isNull("avail_storage");
        return this;
    }

    /**
     * <p>availStorage</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageIsNotNull(){
        isNotNull("avail_storage");
        return this;
    }

    /**
     * <p>availStorage</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("avail_storage",value);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageIn(Long... values){
        if(values!=null && values.length>0){
            in("avail_storage",values);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("avail_storage",value);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper availStorageNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("avail_storage",values);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 等于 = entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessEq(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            eq("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 不等于 &lt;&gt; entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessNe(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            ne("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 大于 &gt; entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessGt(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            gt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 大于等于 &gt;= entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessGe(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            ge("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 小于 &lt; entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessLt(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            lt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 小于等于 &lt;= entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessLe(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            le("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * BETWEEN  entity().getRootAccess() AND 值2
     * @param rootAccessEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessBetween(Integer rootAccessEnd){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null && rootAccessEnd!=null){
            between("root_access",rootAccess,rootAccessEnd);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT BETWEEN  entity().getRootAccess() AND 值2
     * @param rootAccessEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessNotBetween(Integer rootAccessEnd){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null && rootAccessEnd!=null){
            notBetween("root_access",rootAccess,rootAccessEnd);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * BETWEEN  entity().getRootAccess() AND 值2
     * @param rootAccessStart       值1
     * @param rootAccessEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessBetween(Integer rootAccessStart,Integer rootAccessEnd){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null && rootAccessEnd!=null){
            between("root_access",rootAccessStart,rootAccessEnd);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT BETWEEN  entity().getRootAccess() AND 值2
     * @param rootAccessStart       值1
     * @param rootAccessEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessNotBetween(Integer rootAccessStart,Integer rootAccessEnd){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null && rootAccessEnd!=null){
            notBetween("root_access",rootAccessStart,rootAccessEnd);
        }
        return this;
     }


    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '%值%' entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessLike(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            like("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT LIKE '%值%' entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessNotLike(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            notLike("root_access",rootAccess);
        }
        return this;
     }


    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '%值' entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessLikeLeft(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            likeLeft("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '值%' entity().getRootAccess()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessLikeRight(){
        Integer rootAccess =entity().getRootAccess();
        if(rootAccess!=null){
            likeRight("root_access",rootAccess);
        }
        return this;
     }

/**
     * <p>root_access(true:1；false:0)</p>
     * 等于 =
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessEq(Integer rootAccess){
        if(rootAccess!=null){
            eq("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 不等于 &lt;&gt;
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessNe(Integer rootAccess){
        if(rootAccess!=null){
            ne("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 大于 &gt;
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessGt(Integer rootAccess){
        if(rootAccess!=null){
            gt("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 大于等于 &gt;=
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessGe(Integer rootAccess){
        if(rootAccess!=null){
            ge("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 小于 &lt;
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessLt(Integer rootAccess){
        if(rootAccess!=null){
            lt("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 小于等于 &lt;=
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessLe(Integer rootAccess){
        if(rootAccess!=null){
            le("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '%值%'
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessLike(Integer rootAccess){
        if(rootAccess!=null){
            like("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT LIKE '%值%'
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessNotLike(Integer rootAccess){
        if(rootAccess!=null){
            notLike("root_access",rootAccess);
        }
        return this;
    }


    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '%值'
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessLikeLeft(Integer rootAccess){
        if(rootAccess!=null){
            likeLeft("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '值%'
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessLikeRight(Integer rootAccess){
        if(rootAccess!=null){
            likeRight("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessIsNull(){
        isNull("root_access");
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessIsNotNull(){
        isNotNull("root_access");
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("root_access",value);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessIn(Integer... values){
        if(values!=null && values.length>0){
            in("root_access",values);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_access",value);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper rootAccessNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("root_access",values);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 等于 = entity().getLng()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngEq(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            eq("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 不等于 &lt;&gt; entity().getLng()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngNe(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            ne("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于 &gt; entity().getLng()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngGt(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            gt("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于等于 &gt;= entity().getLng()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngGe(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            ge("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于 &lt; entity().getLng()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngLt(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            lt("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于等于 &lt;= entity().getLng()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngLe(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            le("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * BETWEEN  entity().getLng() AND 值2
     * @param lngEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngBetween(BigDecimal lngEnd){
        BigDecimal lng =entity().getLng();
        if(lng!=null && lngEnd!=null){
            between("lng",lng,lngEnd);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT BETWEEN  entity().getLng() AND 值2
     * @param lngEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngNotBetween(BigDecimal lngEnd){
        BigDecimal lng =entity().getLng();
        if(lng!=null && lngEnd!=null){
            notBetween("lng",lng,lngEnd);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * BETWEEN  entity().getLng() AND 值2
     * @param lngStart       值1
     * @param lngEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngBetween(BigDecimal lngStart,BigDecimal lngEnd){
        BigDecimal lng =entity().getLng();
        if(lng!=null && lngEnd!=null){
            between("lng",lngStart,lngEnd);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT BETWEEN  entity().getLng() AND 值2
     * @param lngStart       值1
     * @param lngEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngNotBetween(BigDecimal lngStart,BigDecimal lngEnd){
        BigDecimal lng =entity().getLng();
        if(lng!=null && lngEnd!=null){
            notBetween("lng",lngStart,lngEnd);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值%' entity().getLng()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngLike(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            like("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT LIKE '%值%' entity().getLng()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngNotLike(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            notLike("lng",lng);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值' entity().getLng()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngLikeLeft(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            likeLeft("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * LIKE '值%' entity().getLng()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngLikeRight(){
        BigDecimal lng =entity().getLng();
        if(lng!=null){
            likeRight("lng",lng);
        }
        return this;
     }

/**
     * <p>经度</p>
     * 等于 =
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngEq(BigDecimal lng){
        if(lng!=null){
            eq("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 不等于 &lt;&gt;
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngNe(BigDecimal lng){
        if(lng!=null){
            ne("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 大于 &gt;
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngGt(BigDecimal lng){
        if(lng!=null){
            gt("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 大于等于 &gt;=
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngGe(BigDecimal lng){
        if(lng!=null){
            ge("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 小于 &lt;
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngLt(BigDecimal lng){
        if(lng!=null){
            lt("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 小于等于 &lt;=
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngLe(BigDecimal lng){
        if(lng!=null){
            le("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * LIKE '%值%'
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngLike(BigDecimal lng){
        if(lng!=null){
            like("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * NOT LIKE '%值%'
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngNotLike(BigDecimal lng){
        if(lng!=null){
            notLike("lng",lng);
        }
        return this;
    }


    /**
     * <p>经度</p>
     * LIKE '%值'
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngLikeLeft(BigDecimal lng){
        if(lng!=null){
            likeLeft("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * LIKE '值%'
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngLikeRight(BigDecimal lng){
        if(lng!=null){
            likeRight("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngIsNull(){
        isNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngIsNotNull(){
        isNotNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            in("lng",value);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngIn(BigDecimal... values){
        if(values!=null && values.length>0){
            in("lng",values);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngNotIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            notIn("lng",value);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lngNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lng",values);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 等于 = entity().getLat()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latEq(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            eq("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 不等于 &lt;&gt; entity().getLat()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latNe(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            ne("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于 &gt; entity().getLat()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latGt(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            gt("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于等于 &gt;= entity().getLat()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latGe(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            ge("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于 &lt; entity().getLat()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latLt(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            lt("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于等于 &lt;= entity().getLat()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latLe(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            le("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * BETWEEN  entity().getLat() AND 值2
     * @param latEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latBetween(BigDecimal latEnd){
        BigDecimal lat =entity().getLat();
        if(lat!=null && latEnd!=null){
            between("lat",lat,latEnd);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT BETWEEN  entity().getLat() AND 值2
     * @param latEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latNotBetween(BigDecimal latEnd){
        BigDecimal lat =entity().getLat();
        if(lat!=null && latEnd!=null){
            notBetween("lat",lat,latEnd);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * BETWEEN  entity().getLat() AND 值2
     * @param latStart       值1
     * @param latEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latBetween(BigDecimal latStart,BigDecimal latEnd){
        BigDecimal lat =entity().getLat();
        if(lat!=null && latEnd!=null){
            between("lat",latStart,latEnd);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT BETWEEN  entity().getLat() AND 值2
     * @param latStart       值1
     * @param latEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latNotBetween(BigDecimal latStart,BigDecimal latEnd){
        BigDecimal lat =entity().getLat();
        if(lat!=null && latEnd!=null){
            notBetween("lat",latStart,latEnd);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值%' entity().getLat()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latLike(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            like("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT LIKE '%值%' entity().getLat()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latNotLike(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            notLike("lat",lat);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值' entity().getLat()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latLikeLeft(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            likeLeft("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * LIKE '值%' entity().getLat()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latLikeRight(){
        BigDecimal lat =entity().getLat();
        if(lat!=null){
            likeRight("lat",lat);
        }
        return this;
     }

/**
     * <p>纬度</p>
     * 等于 =
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latEq(BigDecimal lat){
        if(lat!=null){
            eq("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 不等于 &lt;&gt;
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latNe(BigDecimal lat){
        if(lat!=null){
            ne("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 大于 &gt;
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latGt(BigDecimal lat){
        if(lat!=null){
            gt("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 大于等于 &gt;=
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latGe(BigDecimal lat){
        if(lat!=null){
            ge("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 小于 &lt;
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latLt(BigDecimal lat){
        if(lat!=null){
            lt("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 小于等于 &lt;=
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latLe(BigDecimal lat){
        if(lat!=null){
            le("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * LIKE '%值%'
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latLike(BigDecimal lat){
        if(lat!=null){
            like("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * NOT LIKE '%值%'
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latNotLike(BigDecimal lat){
        if(lat!=null){
            notLike("lat",lat);
        }
        return this;
    }


    /**
     * <p>纬度</p>
     * LIKE '%值'
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latLikeLeft(BigDecimal lat){
        if(lat!=null){
            likeLeft("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * LIKE '值%'
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latLikeRight(BigDecimal lat){
        if(lat!=null){
            likeRight("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latIsNull(){
        isNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latIsNotNull(){
        isNotNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            in("lat",value);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latIn(BigDecimal... values){
        if(values!=null && values.length>0){
            in("lat",values);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latNotIn(Collection<BigDecimal> value){
        if(value!=null && !value.isEmpty()){
            notIn("lat",value);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper latNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lat",values);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 等于 = entity().getBizType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeEq(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            eq("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 不等于 &lt;&gt; entity().getBizType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeNe(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            ne("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 大于 &gt; entity().getBizType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeGt(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            gt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 大于等于 &gt;= entity().getBizType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeGe(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            ge("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 小于 &lt; entity().getBizType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeLt(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            lt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 小于等于 &lt;= entity().getBizType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeLe(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            le("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeBetween(Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            between("biz_type",bizType,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeNotBetween(Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            notBetween("biz_type",bizType,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeBetween(Integer bizTypeStart,Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            between("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeNotBetween(Integer bizTypeStart,Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            notBetween("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }


    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '%值%' entity().getBizType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeLike(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            like("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT LIKE '%值%' entity().getBizType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeNotLike(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            notLike("biz_type",bizType);
        }
        return this;
     }


    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '%值' entity().getBizType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeLikeLeft(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            likeLeft("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '值%' entity().getBizType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeLikeRight(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            likeRight("biz_type",bizType);
        }
        return this;
     }

/**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 等于 =
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeEq(Integer bizType){
        if(bizType!=null){
            eq("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 不等于 &lt;&gt;
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeNe(Integer bizType){
        if(bizType!=null){
            ne("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 大于 &gt;
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeGt(Integer bizType){
        if(bizType!=null){
            gt("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 大于等于 &gt;=
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeGe(Integer bizType){
        if(bizType!=null){
            ge("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 小于 &lt;
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeLt(Integer bizType){
        if(bizType!=null){
            lt("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 小于等于 &lt;=
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeLe(Integer bizType){
        if(bizType!=null){
            le("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '%值%'
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeLike(Integer bizType){
        if(bizType!=null){
            like("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT LIKE '%值%'
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeNotLike(Integer bizType){
        if(bizType!=null){
            notLike("biz_type",bizType);
        }
        return this;
    }


    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '%值'
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeLikeLeft(Integer bizType){
        if(bizType!=null){
            likeLeft("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '值%'
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeLikeRight(Integer bizType){
        if(bizType!=null){
            likeRight("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeIsNull(){
        isNull("biz_type");
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeIsNotNull(){
        isNotNull("biz_type");
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("biz_type",value);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("biz_type",values);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("biz_type",value);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper bizTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("biz_type",values);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 等于 = entity().getServerType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeEq(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 不等于 &lt;&gt; entity().getServerType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeNe(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 大于 &gt; entity().getServerType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeGt(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 大于等于 &gt;= entity().getServerType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeGe(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 小于 &lt; entity().getServerType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeLt(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 小于等于 &lt;= entity().getServerType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeLe(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeBetween(Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            between("server_type",serverType,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeNotBetween(Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            notBetween("server_type",serverType,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeBetween(Integer serverTypeStart,Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            between("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeNotBetween(Integer serverTypeStart,Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '%值%' entity().getServerType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeLike(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT LIKE '%值%' entity().getServerType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeNotLike(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '%值' entity().getServerType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeLikeLeft(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '值%' entity().getServerType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeLikeRight(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            likeRight("server_type",serverType);
        }
        return this;
     }

/**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 等于 =
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeEq(Integer serverType){
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 不等于 &lt;&gt;
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeNe(Integer serverType){
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 大于 &gt;
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeGt(Integer serverType){
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 大于等于 &gt;=
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeGe(Integer serverType){
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 小于 &lt;
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeLt(Integer serverType){
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 小于等于 &lt;=
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeLe(Integer serverType){
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeLike(Integer serverType){
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeNotLike(Integer serverType){
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
    }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '%值'
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeLikeLeft(Integer serverType){
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '值%'
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeLikeRight(Integer serverType){
        if(serverType!=null){
            likeRight("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("server_type",value);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("server_type",values);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("server_type",value);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper serverTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 等于 = entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusEq(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            eq("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 不等于 &lt;&gt; entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusNe(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            ne("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于 &gt; entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusGt(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            gt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于等于 &gt;= entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusGe(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            ge("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于 &lt; entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusLt(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            lt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于等于 &lt;= entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusLe(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            le("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * BETWEEN  entity().getSalesStatus() AND 值2
     * @param salesStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusBetween(Integer salesStatusEnd){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null && salesStatusEnd!=null){
            between("sales_status",salesStatus,salesStatusEnd);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT BETWEEN  entity().getSalesStatus() AND 值2
     * @param salesStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusNotBetween(Integer salesStatusEnd){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null && salesStatusEnd!=null){
            notBetween("sales_status",salesStatus,salesStatusEnd);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * BETWEEN  entity().getSalesStatus() AND 值2
     * @param salesStatusStart       值1
     * @param salesStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusBetween(Integer salesStatusStart,Integer salesStatusEnd){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null && salesStatusEnd!=null){
            between("sales_status",salesStatusStart,salesStatusEnd);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT BETWEEN  entity().getSalesStatus() AND 值2
     * @param salesStatusStart       值1
     * @param salesStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusNotBetween(Integer salesStatusStart,Integer salesStatusEnd){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null && salesStatusEnd!=null){
            notBetween("sales_status",salesStatusStart,salesStatusEnd);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值%' entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusLike(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            like("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT LIKE '%值%' entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusNotLike(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            notLike("sales_status",salesStatus);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值' entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusLikeLeft(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            likeLeft("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '值%' entity().getSalesStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusLikeRight(){
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            likeRight("sales_status",salesStatus);
        }
        return this;
     }

/**
     * <p>销售状态(0：未售，1：已售)</p>
     * 等于 =
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusEq(Integer salesStatus){
        if(salesStatus!=null){
            eq("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 不等于 &lt;&gt;
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusNe(Integer salesStatus){
        if(salesStatus!=null){
            ne("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于 &gt;
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusGt(Integer salesStatus){
        if(salesStatus!=null){
            gt("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于等于 &gt;=
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusGe(Integer salesStatus){
        if(salesStatus!=null){
            ge("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于 &lt;
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusLt(Integer salesStatus){
        if(salesStatus!=null){
            lt("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于等于 &lt;=
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusLe(Integer salesStatus){
        if(salesStatus!=null){
            le("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值%'
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusLike(Integer salesStatus){
        if(salesStatus!=null){
            like("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT LIKE '%值%'
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusNotLike(Integer salesStatus){
        if(salesStatus!=null){
            notLike("sales_status",salesStatus);
        }
        return this;
    }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值'
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusLikeLeft(Integer salesStatus){
        if(salesStatus!=null){
            likeLeft("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '值%'
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusLikeRight(Integer salesStatus){
        if(salesStatus!=null){
            likeRight("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusIsNull(){
        isNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusIsNotNull(){
        isNotNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("sales_status",value);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("sales_status",values);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("sales_status",value);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper salesStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("sales_status",values);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 = entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusEq(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            eq("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 不等于 &lt;&gt; entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusNe(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            ne("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于 &gt; entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusGt(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            gt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于等于 &gt;= entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusGe(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            ge("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于 &lt; entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusLt(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            lt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于等于 &lt;= entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusLe(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            le("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusBetween(Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            between("running_status",runningStatus,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusNotBetween(Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            notBetween("running_status",runningStatus,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusBetween(Integer runningStatusStart,Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            between("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusNotBetween(Integer runningStatusStart,Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            notBetween("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值%' entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusLike(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            like("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT LIKE '%值%' entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusNotLike(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            notLike("running_status",runningStatus);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值' entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusLikeLeft(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            likeLeft("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '值%' entity().getRunningStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusLikeRight(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            likeRight("running_status",runningStatus);
        }
        return this;
     }

/**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 =
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusEq(Integer runningStatus){
        if(runningStatus!=null){
            eq("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 不等于 &lt;&gt;
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusNe(Integer runningStatus){
        if(runningStatus!=null){
            ne("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于 &gt;
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusGt(Integer runningStatus){
        if(runningStatus!=null){
            gt("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于等于 &gt;=
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusGe(Integer runningStatus){
        if(runningStatus!=null){
            ge("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于 &lt;
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusLt(Integer runningStatus){
        if(runningStatus!=null){
            lt("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于等于 &lt;=
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusLe(Integer runningStatus){
        if(runningStatus!=null){
            le("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值%'
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusLike(Integer runningStatus){
        if(runningStatus!=null){
            like("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT LIKE '%值%'
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusNotLike(Integer runningStatus){
        if(runningStatus!=null){
            notLike("running_status",runningStatus);
        }
        return this;
    }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值'
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusLikeLeft(Integer runningStatus){
        if(runningStatus!=null){
            likeLeft("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '值%'
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusLikeRight(Integer runningStatus){
        if(runningStatus!=null){
            likeRight("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusIsNull(){
        isNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusIsNotNull(){
        isNotNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("running_status",value);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("running_status",values);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("running_status",value);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper runningStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("running_status",values);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

/**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
    }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 等于 = entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusEq(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            eq("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 不等于 &lt;&gt; entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusNe(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            ne("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于 &gt; entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusGt(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            gt("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于等于 &gt;= entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusGe(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            ge("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于 &lt; entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusLt(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            lt("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于等于 &lt;= entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusLe(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            le("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * BETWEEN  entity().getHealthStatus() AND 值2
     * @param healthStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusBetween(Integer healthStatusEnd){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null && healthStatusEnd!=null){
            between("health_status",healthStatus,healthStatusEnd);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT BETWEEN  entity().getHealthStatus() AND 值2
     * @param healthStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusNotBetween(Integer healthStatusEnd){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null && healthStatusEnd!=null){
            notBetween("health_status",healthStatus,healthStatusEnd);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * BETWEEN  entity().getHealthStatus() AND 值2
     * @param healthStatusStart       值1
     * @param healthStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusBetween(Integer healthStatusStart,Integer healthStatusEnd){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null && healthStatusEnd!=null){
            between("health_status",healthStatusStart,healthStatusEnd);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT BETWEEN  entity().getHealthStatus() AND 值2
     * @param healthStatusStart       值1
     * @param healthStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusNotBetween(Integer healthStatusStart,Integer healthStatusEnd){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null && healthStatusEnd!=null){
            notBetween("health_status",healthStatusStart,healthStatusEnd);
        }
        return this;
     }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值%' entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusLike(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            like("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT LIKE '%值%' entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusNotLike(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            notLike("health_status",healthStatus);
        }
        return this;
     }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值' entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusLikeLeft(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            likeLeft("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '值%' entity().getHealthStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusLikeRight(){
        Integer healthStatus =entity().getHealthStatus();
        if(healthStatus!=null){
            likeRight("health_status",healthStatus);
        }
        return this;
     }

/**
     * <p>健康状态(1：在线，0:故障)</p>
     * 等于 =
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusEq(Integer healthStatus){
        if(healthStatus!=null){
            eq("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 不等于 &lt;&gt;
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusNe(Integer healthStatus){
        if(healthStatus!=null){
            ne("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于 &gt;
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusGt(Integer healthStatus){
        if(healthStatus!=null){
            gt("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于等于 &gt;=
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusGe(Integer healthStatus){
        if(healthStatus!=null){
            ge("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于 &lt;
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusLt(Integer healthStatus){
        if(healthStatus!=null){
            lt("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于等于 &lt;=
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusLe(Integer healthStatus){
        if(healthStatus!=null){
            le("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值%'
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusLike(Integer healthStatus){
        if(healthStatus!=null){
            like("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT LIKE '%值%'
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusNotLike(Integer healthStatus){
        if(healthStatus!=null){
            notLike("health_status",healthStatus);
        }
        return this;
    }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值'
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusLikeLeft(Integer healthStatus){
        if(healthStatus!=null){
            likeLeft("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '值%'
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusLikeRight(Integer healthStatus){
        if(healthStatus!=null){
            likeRight("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusIsNull(){
        isNull("health_status");
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusIsNotNull(){
        isNotNull("health_status");
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("health_status",value);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("health_status",values);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("health_status",value);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper healthStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("health_status",values);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 等于 = entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusEq(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            eq("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 不等于 &lt;&gt; entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusNe(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            ne("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 大于 &gt; entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusGt(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            gt("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 大于等于 &gt;= entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusGe(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            ge("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 小于 &lt; entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusLt(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            lt("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 小于等于 &lt;= entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusLe(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            le("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * BETWEEN  entity().getTrusteeshipStatus() AND 值2
     * @param trusteeshipStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusBetween(Integer trusteeshipStatusEnd){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null && trusteeshipStatusEnd!=null){
            between("trusteeship_status",trusteeshipStatus,trusteeshipStatusEnd);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT BETWEEN  entity().getTrusteeshipStatus() AND 值2
     * @param trusteeshipStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusNotBetween(Integer trusteeshipStatusEnd){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null && trusteeshipStatusEnd!=null){
            notBetween("trusteeship_status",trusteeshipStatus,trusteeshipStatusEnd);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * BETWEEN  entity().getTrusteeshipStatus() AND 值2
     * @param trusteeshipStatusStart       值1
     * @param trusteeshipStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusBetween(Integer trusteeshipStatusStart,Integer trusteeshipStatusEnd){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null && trusteeshipStatusEnd!=null){
            between("trusteeship_status",trusteeshipStatusStart,trusteeshipStatusEnd);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT BETWEEN  entity().getTrusteeshipStatus() AND 值2
     * @param trusteeshipStatusStart       值1
     * @param trusteeshipStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusNotBetween(Integer trusteeshipStatusStart,Integer trusteeshipStatusEnd){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null && trusteeshipStatusEnd!=null){
            notBetween("trusteeship_status",trusteeshipStatusStart,trusteeshipStatusEnd);
        }
        return this;
     }


    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '%值%' entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusLike(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            like("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT LIKE '%值%' entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusNotLike(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            notLike("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }


    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '%值' entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusLikeLeft(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            likeLeft("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '值%' entity().getTrusteeshipStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusLikeRight(){
        Integer trusteeshipStatus =entity().getTrusteeshipStatus();
        if(trusteeshipStatus!=null){
            likeRight("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

/**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 等于 =
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusEq(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            eq("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 不等于 &lt;&gt;
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusNe(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            ne("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 大于 &gt;
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusGt(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            gt("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 大于等于 &gt;=
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusGe(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            ge("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 小于 &lt;
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusLt(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            lt("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 小于等于 &lt;=
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusLe(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            le("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '%值%'
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusLike(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            like("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT LIKE '%值%'
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusNotLike(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            notLike("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }


    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '%值'
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusLikeLeft(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            likeLeft("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '值%'
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusLikeRight(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            likeRight("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusIsNull(){
        isNull("trusteeship_status");
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusIsNotNull(){
        isNotNull("trusteeship_status");
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("trusteeship_status",value);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("trusteeship_status",values);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("trusteeship_status",value);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper trusteeshipStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("trusteeship_status",values);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 等于 = entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeEq(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            eq("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 不等于 &lt;&gt; entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeNe(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            ne("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 大于 &gt; entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeGt(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            gt("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 大于等于 &gt;= entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeGe(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            ge("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 小于 &lt; entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeLt(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            lt("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 小于等于 &lt;= entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeLe(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            le("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * BETWEEN  entity().getPlanSwitchType() AND 值2
     * @param planSwitchTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeBetween(Integer planSwitchTypeEnd){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null && planSwitchTypeEnd!=null){
            between("plan_switch_type",planSwitchType,planSwitchTypeEnd);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT BETWEEN  entity().getPlanSwitchType() AND 值2
     * @param planSwitchTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeNotBetween(Integer planSwitchTypeEnd){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null && planSwitchTypeEnd!=null){
            notBetween("plan_switch_type",planSwitchType,planSwitchTypeEnd);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * BETWEEN  entity().getPlanSwitchType() AND 值2
     * @param planSwitchTypeStart       值1
     * @param planSwitchTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeBetween(Integer planSwitchTypeStart,Integer planSwitchTypeEnd){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null && planSwitchTypeEnd!=null){
            between("plan_switch_type",planSwitchTypeStart,planSwitchTypeEnd);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT BETWEEN  entity().getPlanSwitchType() AND 值2
     * @param planSwitchTypeStart       值1
     * @param planSwitchTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeNotBetween(Integer planSwitchTypeStart,Integer planSwitchTypeEnd){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null && planSwitchTypeEnd!=null){
            notBetween("plan_switch_type",planSwitchTypeStart,planSwitchTypeEnd);
        }
        return this;
     }


    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '%值%' entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeLike(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            like("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT LIKE '%值%' entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeNotLike(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            notLike("plan_switch_type",planSwitchType);
        }
        return this;
     }


    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '%值' entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeLikeLeft(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            likeLeft("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '值%' entity().getPlanSwitchType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeLikeRight(){
        Integer planSwitchType =entity().getPlanSwitchType();
        if(planSwitchType!=null){
            likeRight("plan_switch_type",planSwitchType);
        }
        return this;
     }

/**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 等于 =
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeEq(Integer planSwitchType){
        if(planSwitchType!=null){
            eq("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 不等于 &lt;&gt;
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeNe(Integer planSwitchType){
        if(planSwitchType!=null){
            ne("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 大于 &gt;
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeGt(Integer planSwitchType){
        if(planSwitchType!=null){
            gt("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 大于等于 &gt;=
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeGe(Integer planSwitchType){
        if(planSwitchType!=null){
            ge("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 小于 &lt;
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeLt(Integer planSwitchType){
        if(planSwitchType!=null){
            lt("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 小于等于 &lt;=
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeLe(Integer planSwitchType){
        if(planSwitchType!=null){
            le("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '%值%'
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeLike(Integer planSwitchType){
        if(planSwitchType!=null){
            like("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT LIKE '%值%'
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeNotLike(Integer planSwitchType){
        if(planSwitchType!=null){
            notLike("plan_switch_type",planSwitchType);
        }
        return this;
    }


    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '%值'
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeLikeLeft(Integer planSwitchType){
        if(planSwitchType!=null){
            likeLeft("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '值%'
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeLikeRight(Integer planSwitchType){
        if(planSwitchType!=null){
            likeRight("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeIsNull(){
        isNull("plan_switch_type");
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeIsNotNull(){
        isNotNull("plan_switch_type");
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("plan_switch_type",value);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("plan_switch_type",values);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("plan_switch_type",value);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper planSwitchTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("plan_switch_type",values);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 等于 = entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusEq(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            eq("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 不等于 &lt;&gt; entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusNe(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            ne("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于 &gt; entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusGt(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            gt("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于等于 &gt;= entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusGe(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            ge("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于 &lt; entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusLt(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            lt("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于等于 &lt;= entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusLe(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            le("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * BETWEEN  entity().getStreamingStatus() AND 值2
     * @param streamingStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusBetween(Integer streamingStatusEnd){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null && streamingStatusEnd!=null){
            between("streaming_status",streamingStatus,streamingStatusEnd);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT BETWEEN  entity().getStreamingStatus() AND 值2
     * @param streamingStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusNotBetween(Integer streamingStatusEnd){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null && streamingStatusEnd!=null){
            notBetween("streaming_status",streamingStatus,streamingStatusEnd);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * BETWEEN  entity().getStreamingStatus() AND 值2
     * @param streamingStatusStart       值1
     * @param streamingStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusBetween(Integer streamingStatusStart,Integer streamingStatusEnd){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null && streamingStatusEnd!=null){
            between("streaming_status",streamingStatusStart,streamingStatusEnd);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT BETWEEN  entity().getStreamingStatus() AND 值2
     * @param streamingStatusStart       值1
     * @param streamingStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusNotBetween(Integer streamingStatusStart,Integer streamingStatusEnd){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null && streamingStatusEnd!=null){
            notBetween("streaming_status",streamingStatusStart,streamingStatusEnd);
        }
        return this;
     }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值%' entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusLike(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            like("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT LIKE '%值%' entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusNotLike(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            notLike("streaming_status",streamingStatus);
        }
        return this;
     }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值' entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusLikeLeft(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            likeLeft("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '值%' entity().getStreamingStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusLikeRight(){
        Integer streamingStatus =entity().getStreamingStatus();
        if(streamingStatus!=null){
            likeRight("streaming_status",streamingStatus);
        }
        return this;
     }

/**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 等于 =
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusEq(Integer streamingStatus){
        if(streamingStatus!=null){
            eq("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 不等于 &lt;&gt;
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusNe(Integer streamingStatus){
        if(streamingStatus!=null){
            ne("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于 &gt;
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusGt(Integer streamingStatus){
        if(streamingStatus!=null){
            gt("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于等于 &gt;=
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusGe(Integer streamingStatus){
        if(streamingStatus!=null){
            ge("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于 &lt;
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusLt(Integer streamingStatus){
        if(streamingStatus!=null){
            lt("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于等于 &lt;=
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusLe(Integer streamingStatus){
        if(streamingStatus!=null){
            le("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值%'
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusLike(Integer streamingStatus){
        if(streamingStatus!=null){
            like("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT LIKE '%值%'
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusNotLike(Integer streamingStatus){
        if(streamingStatus!=null){
            notLike("streaming_status",streamingStatus);
        }
        return this;
    }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值'
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusLikeLeft(Integer streamingStatus){
        if(streamingStatus!=null){
            likeLeft("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '值%'
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusLikeRight(Integer streamingStatus){
        if(streamingStatus!=null){
            likeRight("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusIsNull(){
        isNull("streaming_status");
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusIsNotNull(){
        isNotNull("streaming_status");
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("streaming_status",value);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("streaming_status",values);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("streaming_status",value);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper streamingStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("streaming_status",values);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 等于 = entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusEq(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            eq("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 不等于 &lt;&gt; entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusNe(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            ne("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于 &gt; entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusGt(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            gt("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于等于 &gt;= entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusGe(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            ge("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于 &lt; entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusLt(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            lt("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于等于 &lt;= entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusLe(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            le("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * BETWEEN  entity().getMaintStatus() AND 值2
     * @param maintStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusBetween(Integer maintStatusEnd){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null && maintStatusEnd!=null){
            between("maint_status",maintStatus,maintStatusEnd);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT BETWEEN  entity().getMaintStatus() AND 值2
     * @param maintStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusNotBetween(Integer maintStatusEnd){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null && maintStatusEnd!=null){
            notBetween("maint_status",maintStatus,maintStatusEnd);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * BETWEEN  entity().getMaintStatus() AND 值2
     * @param maintStatusStart       值1
     * @param maintStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusBetween(Integer maintStatusStart,Integer maintStatusEnd){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null && maintStatusEnd!=null){
            between("maint_status",maintStatusStart,maintStatusEnd);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT BETWEEN  entity().getMaintStatus() AND 值2
     * @param maintStatusStart       值1
     * @param maintStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusNotBetween(Integer maintStatusStart,Integer maintStatusEnd){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null && maintStatusEnd!=null){
            notBetween("maint_status",maintStatusStart,maintStatusEnd);
        }
        return this;
     }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值%' entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusLike(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            like("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT LIKE '%值%' entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusNotLike(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            notLike("maint_status",maintStatus);
        }
        return this;
     }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值' entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusLikeLeft(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            likeLeft("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '值%' entity().getMaintStatus()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusLikeRight(){
        Integer maintStatus =entity().getMaintStatus();
        if(maintStatus!=null){
            likeRight("maint_status",maintStatus);
        }
        return this;
     }

/**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 等于 =
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusEq(Integer maintStatus){
        if(maintStatus!=null){
            eq("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 不等于 &lt;&gt;
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusNe(Integer maintStatus){
        if(maintStatus!=null){
            ne("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于 &gt;
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusGt(Integer maintStatus){
        if(maintStatus!=null){
            gt("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于等于 &gt;=
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusGe(Integer maintStatus){
        if(maintStatus!=null){
            ge("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于 &lt;
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusLt(Integer maintStatus){
        if(maintStatus!=null){
            lt("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于等于 &lt;=
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusLe(Integer maintStatus){
        if(maintStatus!=null){
            le("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值%'
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusLike(Integer maintStatus){
        if(maintStatus!=null){
            like("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT LIKE '%值%'
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusNotLike(Integer maintStatus){
        if(maintStatus!=null){
            notLike("maint_status",maintStatus);
        }
        return this;
    }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值'
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusLikeLeft(Integer maintStatus){
        if(maintStatus!=null){
            likeLeft("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '值%'
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusLikeRight(Integer maintStatus){
        if(maintStatus!=null){
            likeRight("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusIsNull(){
        isNull("maint_status");
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusIsNotNull(){
        isNotNull("maint_status");
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("maint_status",value);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("maint_status",values);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("maint_status",value);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper maintStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("maint_status",values);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 等于 = entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingEq(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            eq("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 不等于 &lt;&gt; entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingNe(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            ne("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 大于 &gt; entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingGt(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            gt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 大于等于 &gt;= entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingGe(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            ge("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 小于 &lt; entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingLt(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            lt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 小于等于 &lt;= entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingLe(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            le("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * BETWEEN  entity().getIsReseting() AND 值2
     * @param isResetingEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingBetween(Integer isResetingEnd){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null && isResetingEnd!=null){
            between("is_reseting",isReseting,isResetingEnd);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT BETWEEN  entity().getIsReseting() AND 值2
     * @param isResetingEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingNotBetween(Integer isResetingEnd){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null && isResetingEnd!=null){
            notBetween("is_reseting",isReseting,isResetingEnd);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * BETWEEN  entity().getIsReseting() AND 值2
     * @param isResetingStart       值1
     * @param isResetingEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingBetween(Integer isResetingStart,Integer isResetingEnd){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null && isResetingEnd!=null){
            between("is_reseting",isResetingStart,isResetingEnd);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT BETWEEN  entity().getIsReseting() AND 值2
     * @param isResetingStart       值1
     * @param isResetingEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingNotBetween(Integer isResetingStart,Integer isResetingEnd){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null && isResetingEnd!=null){
            notBetween("is_reseting",isResetingStart,isResetingEnd);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '%值%' entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingLike(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            like("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT LIKE '%值%' entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingNotLike(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            notLike("is_reseting",isReseting);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '%值' entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingLikeLeft(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            likeLeft("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '值%' entity().getIsReseting()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingLikeRight(){
        Integer isReseting =entity().getIsReseting();
        if(isReseting!=null){
            likeRight("is_reseting",isReseting);
        }
        return this;
     }

/**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 等于 =
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingEq(Integer isReseting){
        if(isReseting!=null){
            eq("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 不等于 &lt;&gt;
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingNe(Integer isReseting){
        if(isReseting!=null){
            ne("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 大于 &gt;
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingGt(Integer isReseting){
        if(isReseting!=null){
            gt("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 大于等于 &gt;=
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingGe(Integer isReseting){
        if(isReseting!=null){
            ge("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 小于 &lt;
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingLt(Integer isReseting){
        if(isReseting!=null){
            lt("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 小于等于 &lt;=
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingLe(Integer isReseting){
        if(isReseting!=null){
            le("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '%值%'
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingLike(Integer isReseting){
        if(isReseting!=null){
            like("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT LIKE '%值%'
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingNotLike(Integer isReseting){
        if(isReseting!=null){
            notLike("is_reseting",isReseting);
        }
        return this;
    }


    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '%值'
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingLikeLeft(Integer isReseting){
        if(isReseting!=null){
            likeLeft("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '值%'
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingLikeRight(Integer isReseting){
        if(isReseting!=null){
            likeRight("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingIsNull(){
        isNull("is_reseting");
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingIsNotNull(){
        isNotNull("is_reseting");
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("is_reseting",value);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingIn(Integer... values){
        if(values!=null && values.length>0){
            in("is_reseting",values);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("is_reseting",value);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isResetingNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_reseting",values);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * 等于 = entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionEq(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            eq("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * 不等于 &lt;&gt; entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionNe(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            ne("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 大于 &gt; entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionGt(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            gt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 大于等于 &gt;= entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionGe(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            ge("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 小于 &lt; entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionLt(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            lt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 小于等于 &lt;= entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionLe(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            le("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionBetween(String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            between("rom_version",romVersion,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * NOT BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionNotBetween(String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            notBetween("rom_version",romVersion,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionBetween(String romVersionStart,String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            between("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * NOT BETWEEN  entity().getRomVersion() AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionNotBetween(String romVersionStart,String romVersionEnd){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null && romVersionEnd!=null){
            notBetween("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }


    /**
     * <p>rom系统软件版本</p>
     * LIKE '%值%' entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionLike(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            like("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * NOT LIKE '%值%' entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionNotLike(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            notLike("rom_version",romVersion);
        }
        return this;
     }


    /**
     * <p>rom系统软件版本</p>
     * LIKE '%值' entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionLikeLeft(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            likeLeft("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * LIKE '值%' entity().getRomVersion()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionLikeRight(){
        String romVersion =entity().getRomVersion();
        if(romVersion!=null){
            likeRight("rom_version",romVersion);
        }
        return this;
     }

/**
     * <p>rom系统软件版本</p>
     * 等于 =
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionEq(String romVersion){
        if(romVersion!=null){
            eq("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * 不等于 &lt;&gt;
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionNe(String romVersion){
        if(romVersion!=null){
            ne("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * 大于 &gt;
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionGt(String romVersion){
        if(romVersion!=null){
            gt("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * 大于等于 &gt;=
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionGe(String romVersion){
        if(romVersion!=null){
            ge("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * 小于 &lt;
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionLt(String romVersion){
        if(romVersion!=null){
            lt("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * 小于等于 &lt;=
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionLe(String romVersion){
        if(romVersion!=null){
            le("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * LIKE '%值%'
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionLike(String romVersion){
        if(romVersion!=null){
            like("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * NOT LIKE '%值%'
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionNotLike(String romVersion){
        if(romVersion!=null){
            notLike("rom_version",romVersion);
        }
        return this;
    }


    /**
     * <p>rom系统软件版本</p>
     * LIKE '%值'
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionLikeLeft(String romVersion){
        if(romVersion!=null){
            likeLeft("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * LIKE '值%'
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionLikeRight(String romVersion){
        if(romVersion!=null){
            likeRight("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionIsNull(){
        isNull("rom_version");
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionIsNotNull(){
        isNotNull("rom_version");
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("rom_version",value);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionIn(String... values){
        if(values!=null && values.length>0){
            in("rom_version",values);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("rom_version",value);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper romVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("rom_version",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdEq(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 不等于 &lt;&gt; entity().getVersionId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值' entity().getVersionId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '值%' entity().getVersionId()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

/**
     * <p>版本id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 不等于 &lt;&gt;
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 大于 &gt;
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 大于等于 &gt;=
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 小于 &lt;
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 小于等于 &lt;=
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
    }


    /**
     * <p>版本id</p>
     * LIKE '%值'
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * LIKE '值%'
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdLikeRight(Long versionId){
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("version_id",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>盒子信息修改时间</p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>盒子信息修改时间</p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

/**
     * <p>盒子信息修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
    }


    /**
     * <p>盒子信息修改时间</p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 等于 = entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveEq(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            eq("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 不等于 &lt;&gt; entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveNe(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            ne("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于 &gt; entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveGt(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            gt("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于等于 &gt;= entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveGe(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            ge("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于 &lt; entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveLt(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            lt("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于等于 &lt;= entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveLe(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            le("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * BETWEEN  entity().getIsUserSave() AND 值2
     * @param isUserSaveEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveBetween(Integer isUserSaveEnd){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null && isUserSaveEnd!=null){
            between("is_user_save",isUserSave,isUserSaveEnd);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT BETWEEN  entity().getIsUserSave() AND 值2
     * @param isUserSaveEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveNotBetween(Integer isUserSaveEnd){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null && isUserSaveEnd!=null){
            notBetween("is_user_save",isUserSave,isUserSaveEnd);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * BETWEEN  entity().getIsUserSave() AND 值2
     * @param isUserSaveStart       值1
     * @param isUserSaveEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveBetween(Integer isUserSaveStart,Integer isUserSaveEnd){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null && isUserSaveEnd!=null){
            between("is_user_save",isUserSaveStart,isUserSaveEnd);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT BETWEEN  entity().getIsUserSave() AND 值2
     * @param isUserSaveStart       值1
     * @param isUserSaveEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveNotBetween(Integer isUserSaveStart,Integer isUserSaveEnd){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null && isUserSaveEnd!=null){
            notBetween("is_user_save",isUserSaveStart,isUserSaveEnd);
        }
        return this;
     }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值%' entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveLike(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            like("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT LIKE '%值%' entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveNotLike(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            notLike("is_user_save",isUserSave);
        }
        return this;
     }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值' entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveLikeLeft(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            likeLeft("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '值%' entity().getIsUserSave()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveLikeRight(){
        Integer isUserSave =entity().getIsUserSave();
        if(isUserSave!=null){
            likeRight("is_user_save",isUserSave);
        }
        return this;
     }

/**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 等于 =
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveEq(Integer isUserSave){
        if(isUserSave!=null){
            eq("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 不等于 &lt;&gt;
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveNe(Integer isUserSave){
        if(isUserSave!=null){
            ne("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于 &gt;
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveGt(Integer isUserSave){
        if(isUserSave!=null){
            gt("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于等于 &gt;=
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveGe(Integer isUserSave){
        if(isUserSave!=null){
            ge("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于 &lt;
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveLt(Integer isUserSave){
        if(isUserSave!=null){
            lt("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于等于 &lt;=
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveLe(Integer isUserSave){
        if(isUserSave!=null){
            le("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值%'
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveLike(Integer isUserSave){
        if(isUserSave!=null){
            like("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT LIKE '%值%'
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveNotLike(Integer isUserSave){
        if(isUserSave!=null){
            notLike("is_user_save",isUserSave);
        }
        return this;
    }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值'
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveLikeLeft(Integer isUserSave){
        if(isUserSave!=null){
            likeLeft("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '值%'
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveLikeRight(Integer isUserSave){
        if(isUserSave!=null){
            likeRight("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveIsNull(){
        isNull("is_user_save");
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveIsNotNull(){
        isNotNull("is_user_save");
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("is_user_save",value);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveIn(Integer... values){
        if(values!=null && values.length>0){
            in("is_user_save",values);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("is_user_save",value);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isUserSaveNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_user_save",values);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 等于 = entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelEq(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            eq("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 不等于 &lt;&gt; entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelNe(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            ne("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于 &gt; entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelGt(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            gt("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于等于 &gt;= entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelGe(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            ge("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于 &lt; entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelLt(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            lt("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于等于 &lt;= entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelLe(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            le("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * BETWEEN  entity().getLoglevel() AND 值2
     * @param loglevelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelBetween(Integer loglevelEnd){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null && loglevelEnd!=null){
            between("loglevel",loglevel,loglevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT BETWEEN  entity().getLoglevel() AND 值2
     * @param loglevelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelNotBetween(Integer loglevelEnd){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null && loglevelEnd!=null){
            notBetween("loglevel",loglevel,loglevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * BETWEEN  entity().getLoglevel() AND 值2
     * @param loglevelStart       值1
     * @param loglevelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelBetween(Integer loglevelStart,Integer loglevelEnd){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null && loglevelEnd!=null){
            between("loglevel",loglevelStart,loglevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT BETWEEN  entity().getLoglevel() AND 值2
     * @param loglevelStart       值1
     * @param loglevelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelNotBetween(Integer loglevelStart,Integer loglevelEnd){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null && loglevelEnd!=null){
            notBetween("loglevel",loglevelStart,loglevelEnd);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值%' entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelLike(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            like("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT LIKE '%值%' entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelNotLike(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            notLike("loglevel",loglevel);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值' entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelLikeLeft(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            likeLeft("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '值%' entity().getLoglevel()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelLikeRight(){
        Integer loglevel =entity().getLoglevel();
        if(loglevel!=null){
            likeRight("loglevel",loglevel);
        }
        return this;
     }

/**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 等于 =
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelEq(Integer loglevel){
        if(loglevel!=null){
            eq("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 不等于 &lt;&gt;
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelNe(Integer loglevel){
        if(loglevel!=null){
            ne("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于 &gt;
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelGt(Integer loglevel){
        if(loglevel!=null){
            gt("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于等于 &gt;=
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelGe(Integer loglevel){
        if(loglevel!=null){
            ge("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于 &lt;
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelLt(Integer loglevel){
        if(loglevel!=null){
            lt("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于等于 &lt;=
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelLe(Integer loglevel){
        if(loglevel!=null){
            le("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值%'
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelLike(Integer loglevel){
        if(loglevel!=null){
            like("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT LIKE '%值%'
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelNotLike(Integer loglevel){
        if(loglevel!=null){
            notLike("loglevel",loglevel);
        }
        return this;
    }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值'
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelLikeLeft(Integer loglevel){
        if(loglevel!=null){
            likeLeft("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '值%'
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelLikeRight(Integer loglevel){
        if(loglevel!=null){
            likeRight("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelIsNull(){
        isNull("loglevel");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelIsNotNull(){
        isNotNull("loglevel");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("loglevel",value);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelIn(Integer... values){
        if(values!=null && values.length>0){
            in("loglevel",values);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("loglevel",value);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper loglevelNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("loglevel",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgEq(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            eq("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgNe(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            ne("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgGt(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            gt("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgGe(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            ge("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgLt(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            lt("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgLe(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            le("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLogpkg() AND 值2
     * @param logpkgEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgBetween(String logpkgEnd){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null && logpkgEnd!=null){
            between("logpkg",logpkg,logpkgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLogpkg() AND 值2
     * @param logpkgEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgNotBetween(String logpkgEnd){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null && logpkgEnd!=null){
            notBetween("logpkg",logpkg,logpkgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLogpkg() AND 值2
     * @param logpkgStart       值1
     * @param logpkgEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgBetween(String logpkgStart,String logpkgEnd){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null && logpkgEnd!=null){
            between("logpkg",logpkgStart,logpkgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLogpkg() AND 值2
     * @param logpkgStart       值1
     * @param logpkgEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgNotBetween(String logpkgStart,String logpkgEnd){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null && logpkgEnd!=null){
            notBetween("logpkg",logpkgStart,logpkgEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgLike(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            like("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgNotLike(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            notLike("logpkg",logpkg);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgLikeLeft(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            likeLeft("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getLogpkg()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgLikeRight(){
        String logpkg =entity().getLogpkg();
        if(logpkg!=null){
            likeRight("logpkg",logpkg);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgEq(String logpkg){
        if(logpkg!=null){
            eq("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgNe(String logpkg){
        if(logpkg!=null){
            ne("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgGt(String logpkg){
        if(logpkg!=null){
            gt("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgGe(String logpkg){
        if(logpkg!=null){
            ge("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgLt(String logpkg){
        if(logpkg!=null){
            lt("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgLe(String logpkg){
        if(logpkg!=null){
            le("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgLike(String logpkg){
        if(logpkg!=null){
            like("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgNotLike(String logpkg){
        if(logpkg!=null){
            notLike("logpkg",logpkg);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgLikeLeft(String logpkg){
        if(logpkg!=null){
            likeLeft("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgLikeRight(String logpkg){
        if(logpkg!=null){
            likeRight("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgIsNull(){
        isNull("logpkg");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgIsNotNull(){
        isNotNull("logpkg");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("logpkg",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgIn(String... values){
        if(values!=null && values.length>0){
            in("logpkg",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("logpkg",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper logpkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("logpkg",values);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 等于 = entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeEq(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            eq("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 不等于 &lt;&gt; entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeNe(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            ne("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于 &gt; entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeGt(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            gt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于等于 &gt;= entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeGe(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            ge("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于 &lt; entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeLt(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            lt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于等于 &lt;= entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeLe(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            le("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * BETWEEN  entity().getIsOtaUpgrade() AND 值2
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeBetween(Integer isOtaUpgradeEnd){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null && isOtaUpgradeEnd!=null){
            between("is_ota_upgrade",isOtaUpgrade,isOtaUpgradeEnd);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT BETWEEN  entity().getIsOtaUpgrade() AND 值2
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeNotBetween(Integer isOtaUpgradeEnd){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null && isOtaUpgradeEnd!=null){
            notBetween("is_ota_upgrade",isOtaUpgrade,isOtaUpgradeEnd);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * BETWEEN  entity().getIsOtaUpgrade() AND 值2
     * @param isOtaUpgradeStart       值1
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeBetween(Integer isOtaUpgradeStart,Integer isOtaUpgradeEnd){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null && isOtaUpgradeEnd!=null){
            between("is_ota_upgrade",isOtaUpgradeStart,isOtaUpgradeEnd);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT BETWEEN  entity().getIsOtaUpgrade() AND 值2
     * @param isOtaUpgradeStart       值1
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeNotBetween(Integer isOtaUpgradeStart,Integer isOtaUpgradeEnd){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null && isOtaUpgradeEnd!=null){
            notBetween("is_ota_upgrade",isOtaUpgradeStart,isOtaUpgradeEnd);
        }
        return this;
     }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值%' entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeLike(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            like("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT LIKE '%值%' entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeNotLike(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            notLike("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值' entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeLikeLeft(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            likeLeft("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '值%' entity().getIsOtaUpgrade()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeLikeRight(){
        Integer isOtaUpgrade =entity().getIsOtaUpgrade();
        if(isOtaUpgrade!=null){
            likeRight("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

/**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 等于 =
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeEq(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            eq("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 不等于 &lt;&gt;
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeNe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            ne("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于 &gt;
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeGt(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            gt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于等于 &gt;=
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeGe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            ge("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于 &lt;
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeLt(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            lt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于等于 &lt;=
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeLe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            le("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值%'
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeLike(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            like("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT LIKE '%值%'
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeNotLike(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            notLike("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值'
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeLikeLeft(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            likeLeft("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '值%'
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeLikeRight(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            likeRight("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeIsNull(){
        isNull("is_ota_upgrade");
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeIsNotNull(){
        isNotNull("is_ota_upgrade");
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("is_ota_upgrade",value);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeIn(Integer... values){
        if(values!=null && values.length>0){
            in("is_ota_upgrade",values);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("is_ota_upgrade",value);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper isOtaUpgradeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_ota_upgrade",values);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 等于 = entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeEq(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 不等于 &lt;&gt; entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeNe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 大于 &gt; entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeGt(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 大于等于 &gt;= entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeGe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 小于 &lt; entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeLt(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 小于等于 &lt;= entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeLe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeBetween(Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierType,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeNotBetween(Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierType,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeNotBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '%值%' entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeLike(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT LIKE '%值%' entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeNotLike(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '%值' entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeLikeLeft(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '值%' entity().getSupplierType()
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeLikeRight(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            likeRight("supplier_type",supplierType);
        }
        return this;
     }

/**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 等于 =
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeEq(Integer supplierType){
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 不等于 &lt;&gt;
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeNe(Integer supplierType){
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 大于 &gt;
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeGt(Integer supplierType){
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 大于等于 &gt;=
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeGe(Integer supplierType){
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 小于 &lt;
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeLt(Integer supplierType){
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 小于等于 &lt;=
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeLe(Integer supplierType){
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeLike(Integer supplierType){
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeNotLike(Integer supplierType){
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
    }


    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '%值'
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeLikeLeft(Integer supplierType){
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '值%'
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeLikeRight(Integer supplierType){
        if(supplierType!=null){
            likeRight("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * IS NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeIsNull(){
        isNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeIsNotNull(){
        isNotNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("supplier_type",values);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateEntityWrapper supplierTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("supplier_type",values);
        }
        return this;
    }


}
