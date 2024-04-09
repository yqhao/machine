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
public class EmSocDevicesUpdateWrapper extends UpdateWrapper<EmSocDevices> {

    public static EmSocDevicesUpdateWrapper wrapper() {
        return new EmSocDevicesUpdateWrapper();
    }

    public EmSocDevicesUpdateWrapper() {
        super();
    }

    public EmSocDevicesUpdateWrapper(EmSocDevices entity) {
        super(entity);
    }

    /**
     * 
     */
    public EmSocDevicesUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public EmSocDevicesUpdateWrapper setFkPcpAreaId(Long fkPcpAreaId) {
         set("fk_pcp_area_id",fkPcpAreaId);
        return this;
    }
    /**
     * 设备唯一码
     */
    public EmSocDevicesUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 移动终端的唯一标识
     */
    public EmSocDevicesUpdateWrapper setImei(String imei) {
         set("imei",imei);
        return this;
    }
    /**
     * 国际移动用户识别码
     */
    public EmSocDevicesUpdateWrapper setImsi(String imsi) {
         set("imsi",imsi);
        return this;
    }
    /**
     * macAddr
     */
    public EmSocDevicesUpdateWrapper setMacAddr(String macAddr) {
         set("mac_addr",macAddr);
        return this;
    }
    /**
     * internalAddr
     */
    public EmSocDevicesUpdateWrapper setInternalAddr(String internalAddr) {
         set("internal_addr",internalAddr);
        return this;
    }
    /**
     * externalAddr
     */
    public EmSocDevicesUpdateWrapper setExternalAddr(String externalAddr) {
         set("external_addr",externalAddr);
        return this;
    }
    /**
     * 省份ccode
     */
    public EmSocDevicesUpdateWrapper setProvinceCcode(Long provinceCcode) {
         set("province_ccode",provinceCcode);
        return this;
    }
    /**
     * 省份名称
     */
    public EmSocDevicesUpdateWrapper setProvinceName(String provinceName) {
         set("province_name",provinceName);
        return this;
    }
    /**
     * 城市ccode
     */
    public EmSocDevicesUpdateWrapper setCityCcode(Long cityCcode) {
         set("city_ccode",cityCcode);
        return this;
    }
    /**
     * 城市名称
     */
    public EmSocDevicesUpdateWrapper setCityName(String cityName) {
         set("city_name",cityName);
        return this;
    }
    /**
     * 地区ccode
     */
    public EmSocDevicesUpdateWrapper setAreaCcode(Long areaCcode) {
         set("area_ccode",areaCcode);
        return this;
    }
    /**
     * 地区名称
     */
    public EmSocDevicesUpdateWrapper setAreaName(String areaName) {
         set("area_name",areaName);
        return this;
    }
    /**
     * 地址地区名称详细（省市区街道名称以逗号分开）
     */
    public EmSocDevicesUpdateWrapper setRegionName(String regionName) {
         set("region_name",regionName);
        return this;
    }
    /**
     * location
     */
    public EmSocDevicesUpdateWrapper setLocation(String location) {
         set("location",location);
        return this;
    }
    /**
     * cpu线程数
     */
    public EmSocDevicesUpdateWrapper setProcessors(Integer processors) {
         set("processors",processors);
        return this;
    }
    /**
     * 修订版本号
     */
    public EmSocDevicesUpdateWrapper setBuildId(String buildId) {
         set("build_id",buildId);
        return this;
    }
    /**
     * build_radio
     */
    public EmSocDevicesUpdateWrapper setBuildRadio(String buildRadio) {
         set("build_radio",buildRadio);
        return this;
    }
    /**
     * 版本即最终用户可见的名称
     */
    public EmSocDevicesUpdateWrapper setBuildModel(String buildModel) {
         set("build_model",buildModel);
        return this;
    }
    /**
     * 硬件制造商
     */
    public EmSocDevicesUpdateWrapper setBuildManufacturer(String buildManufacturer) {
         set("build_manufacturer",buildManufacturer);
        return this;
    }
    /**
     * build_bootloader
     */
    public EmSocDevicesUpdateWrapper setBuildBootloader(String buildBootloader) {
         set("build_bootloader",buildBootloader);
        return this;
    }
    /**
     * 主板
     */
    public EmSocDevicesUpdateWrapper setBuildBoard(String buildBoard) {
         set("build_board",buildBoard);
        return this;
    }
    /**
     * 系统定制商
     */
    public EmSocDevicesUpdateWrapper setBuildBrand(String buildBrand) {
         set("build_brand",buildBrand);
        return this;
    }
    /**
     * build_cpu_abi
     */
    public EmSocDevicesUpdateWrapper setBuildCpuAbi(String buildCpuAbi) {
         set("build_cpu_abi",buildCpuAbi);
        return this;
    }
    /**
     * build_cpu_abi2
     */
    public EmSocDevicesUpdateWrapper setBuildCpuAbi2(String buildCpuAbi2) {
         set("build_cpu_abi2",buildCpuAbi2);
        return this;
    }
    /**
     * 设备参数
     */
    public EmSocDevicesUpdateWrapper setBuildDevice(String buildDevice) {
         set("build_device",buildDevice);
        return this;
    }
    /**
     * 显示屏参数
     */
    public EmSocDevicesUpdateWrapper setBuildDisplay(String buildDisplay) {
         set("build_display",buildDisplay);
        return this;
    }
    /**
     * 唯一识别码
     */
    public EmSocDevicesUpdateWrapper setBuildFingerprint(String buildFingerprint) {
         set("build_fingerprint",buildFingerprint);
        return this;
    }
    /**
     * build_host
     */
    public EmSocDevicesUpdateWrapper setBuildHost(String buildHost) {
         set("build_host",buildHost);
        return this;
    }
    /**
     * 整个产品的名称
     */
    public EmSocDevicesUpdateWrapper setBuildProduct(String buildProduct) {
         set("build_product",buildProduct);
        return this;
    }
    /**
     * 硬件名称
     */
    public EmSocDevicesUpdateWrapper setBuildHardware(String buildHardware) {
         set("build_hardware",buildHardware);
        return this;
    }
    /**
     * 硬件序列
     */
    public EmSocDevicesUpdateWrapper setBuildSerial(String buildSerial) {
         set("build_serial",buildSerial);
        return this;
    }
    /**
     * cpu指令集
     */
    public EmSocDevicesUpdateWrapper setBuildSupportedAbis(String buildSupportedAbis) {
         set("build_supported_abis",buildSupportedAbis);
        return this;
    }
    /**
     * cpu指令集
     */
    public EmSocDevicesUpdateWrapper setBuildSupported32BitAbis(String buildSupported32BitAbis) {
         set("build_supported_32_bit_abis",buildSupported32BitAbis);
        return this;
    }
    /**
     * cpu指令集
     */
    public EmSocDevicesUpdateWrapper setBuildSupported64BitAbis(String buildSupported64BitAbis) {
         set("build_supported_64_bit_abis",buildSupported64BitAbis);
        return this;
    }
    /**
     * build_version_incremental
     */
    public EmSocDevicesUpdateWrapper setBuildVersionIncremental(String buildVersionIncremental) {
         set("build_version_incremental",buildVersionIncremental);
        return this;
    }
    /**
     * 系统版本
     */
    public EmSocDevicesUpdateWrapper setBuildVersionRelease(String buildVersionRelease) {
         set("build_version_release",buildVersionRelease);
        return this;
    }
    /**
     * build_version_sdk
     */
    public EmSocDevicesUpdateWrapper setBuildVersionSdk(String buildVersionSdk) {
         set("build_version_sdk",buildVersionSdk);
        return this;
    }
    /**
     * SDK版本
     */
    public EmSocDevicesUpdateWrapper setBuildVersionSdkint(String buildVersionSdkint) {
         set("build_version_sdkint",buildVersionSdkint);
        return this;
    }
    /**
     * build_version_codename
     */
    public EmSocDevicesUpdateWrapper setBuildVersionCodename(String buildVersionCodename) {
         set("build_version_codename",buildVersionCodename);
        return this;
    }
    /**
     * build_type
     */
    public EmSocDevicesUpdateWrapper setBuildType(String buildType) {
         set("build_type",buildType);
        return this;
    }
    /**
     * build_api_level
     */
    public EmSocDevicesUpdateWrapper setBuildApiLevel(Integer buildApiLevel) {
         set("build_api_level",buildApiLevel);
        return this;
    }
    /**
     * Android系统第一次启动时产生的一个64bit数
     */
    public EmSocDevicesUpdateWrapper setAndoridId(String andoridId) {
         set("andorid_id",andoridId);
        return this;
    }
    /**
     * os_arch
     */
    public EmSocDevicesUpdateWrapper setOsArch(String osArch) {
         set("os_arch",osArch);
        return this;
    }
    /**
     * 手机的网络制式(GSM,CDMA)
     */
    public EmSocDevicesUpdateWrapper setPhoneType(String phoneType) {
         set("phone_type",phoneType);
        return this;
    }
    /**
     * os_version
     */
    public EmSocDevicesUpdateWrapper setOsVersion(String osVersion) {
         set("os_version",osVersion);
        return this;
    }
    /**
     * SIM卡的序列号
     */
    public EmSocDevicesUpdateWrapper setSimSerialNumber(String simSerialNumber) {
         set("sim_serial_number",simSerialNumber);
        return this;
    }
    /**
     * SIM卡的运营商
     */
    public EmSocDevicesUpdateWrapper setNetworkOperator(String networkOperator) {
         set("network_operator",networkOperator);
        return this;
    }
    /**
     * SIM卡的运营商名称
     */
    public EmSocDevicesUpdateWrapper setNetworkOperatorName(String networkOperatorName) {
         set("network_operator_name",networkOperatorName);
        return this;
    }
    /**
     * UI mode
     */
    public EmSocDevicesUpdateWrapper setUimode(String uimode) {
         set("uimode",uimode);
        return this;
    }
    /**
     * resolution
     */
    public EmSocDevicesUpdateWrapper setResolution(String resolution) {
         set("resolution",resolution);
        return this;
    }
    /**
     * totalMem
     */
    public EmSocDevicesUpdateWrapper setTotalMem(Long totalMem) {
         set("total_mem",totalMem);
        return this;
    }
    /**
     * availMem
     */
    public EmSocDevicesUpdateWrapper setAvailMem(Long availMem) {
         set("avail_mem",availMem);
        return this;
    }
    /**
     * totalStorage
     */
    public EmSocDevicesUpdateWrapper setTotalStorage(Long totalStorage) {
         set("total_storage",totalStorage);
        return this;
    }
    /**
     * availStorage
     */
    public EmSocDevicesUpdateWrapper setAvailStorage(Long availStorage) {
         set("avail_storage",availStorage);
        return this;
    }
    /**
     * root_access(true:1；false:0)
     */
    public EmSocDevicesUpdateWrapper setRootAccess(Integer rootAccess) {
         set("root_access",rootAccess);
        return this;
    }
    /**
     * 经度
     */
    public EmSocDevicesUpdateWrapper setLng(BigDecimal lng) {
         set("lng",lng);
        return this;
    }
    /**
     * 纬度
     */
    public EmSocDevicesUpdateWrapper setLat(BigDecimal lat) {
         set("lat",lat);
        return this;
    }
    /**
     * 业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)
     */
    public EmSocDevicesUpdateWrapper setBizType(Integer bizType) {
         set("biz_type",bizType);
        return this;
    }
    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）
     */
    public EmSocDevicesUpdateWrapper setServerType(Integer serverType) {
         set("server_type",serverType);
        return this;
    }
    /**
     * 销售状态(0：未售，1：已售)
     */
    public EmSocDevicesUpdateWrapper setSalesStatus(Integer salesStatus) {
         set("sales_status",salesStatus);
        return this;
    }
    /**
     * 运行状态(0：空闲，1：运行中)
     */
    public EmSocDevicesUpdateWrapper setRunningStatus(Integer runningStatus) {
         set("running_status",runningStatus);
        return this;
    }
    /**
     * 设备状态(-50：删除，0：暂停使用，50：正常)
     */
    public EmSocDevicesUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 健康状态(1：在线，0:故障)
     */
    public EmSocDevicesUpdateWrapper setHealthStatus(Integer healthStatus) {
         set("health_status",healthStatus);
        return this;
    }
    /**
     * 托管状态(0：待托管/已解除托管，1:已托管（默认）)
     */
    public EmSocDevicesUpdateWrapper setTrusteeshipStatus(Integer trusteeshipStatus) {
         set("trusteeship_status",trusteeshipStatus);
        return this;
    }
    /**
     * 是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）
     */
    public EmSocDevicesUpdateWrapper setPlanSwitchType(Integer planSwitchType) {
         set("plan_switch_type",planSwitchType);
        return this;
    }
    /**
     * streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）
     */
    public EmSocDevicesUpdateWrapper setStreamingStatus(Integer streamingStatus) {
         set("streaming_status",streamingStatus);
        return this;
    }
    /**
     * 维护模式状态（0：非维护模式，1：维护模式）
     */
    public EmSocDevicesUpdateWrapper setMaintStatus(Integer maintStatus) {
         set("maint_status",maintStatus);
        return this;
    }
    /**
     * 是否重置中（0：未重置，1：重置中，2：重启中）
     */
    public EmSocDevicesUpdateWrapper setIsReseting(Integer isReseting) {
         set("is_reseting",isReseting);
        return this;
    }
    /**
     * rom系统软件版本
     */
    public EmSocDevicesUpdateWrapper setRomVersion(String romVersion) {
         set("rom_version",romVersion);
        return this;
    }
    /**
     * 版本id
     */
    public EmSocDevicesUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 
     */
    public EmSocDevicesUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 盒子信息修改时间
     */
    public EmSocDevicesUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 是否在保存app用户数据(0：否，1：是)
     */
    public EmSocDevicesUpdateWrapper setIsUserSave(Integer isUserSave) {
         set("is_user_save",isUserSave);
        return this;
    }
    /**
     * 3: 打开日志，127: 关闭日志
     */
    public EmSocDevicesUpdateWrapper setLoglevel(Integer loglevel) {
         set("loglevel",loglevel);
        return this;
    }
    /**
     * 
     */
    public EmSocDevicesUpdateWrapper setLogpkg(String logpkg) {
         set("logpkg",logpkg);
        return this;
    }
    /**
     * 是升级中（0：未升级，1：升级中）
     */
    public EmSocDevicesUpdateWrapper setIsOtaUpgrade(Integer isOtaUpgrade) {
         set("is_ota_upgrade",isOtaUpgrade);
        return this;
    }
    /**
     * 供应商类型[1:华为 2:腾讯]
     */
    public EmSocDevicesUpdateWrapper setSupplierType(Integer supplierType) {
         set("supplier_type",supplierType);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper idLikeRight(Long id){
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
    public EmSocDevicesUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper idIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper idIn(Long... values){
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
    public EmSocDevicesUpdateWrapper idNotIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        if(fkPcpAreaIdStart!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' fkPcpAreaId
     * @param fkPcpAreaId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
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
    public EmSocDevicesUpdateWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper fkPcpAreaIdIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper fkPcpAreaIdIn(Long... values){
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
    public EmSocDevicesUpdateWrapper fkPcpAreaIdNotIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 不等于 &lt;&gt; deviceId
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt; deviceId
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;= deviceId
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt; deviceId
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;= deviceId
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值' deviceId
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public EmSocDevicesUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper deviceIdIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper deviceIdIn(String... values){
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
    public EmSocDevicesUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * 等于 = imei
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiEq(String imei){
        if(imei!=null){
            eq("imei",imei);
        }
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * 不等于 &lt;&gt; imei
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiNe(String imei){
        if(imei!=null){
            ne("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 大于 &gt; imei
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiGt(String imei){
        if(imei!=null){
            gt("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 大于等于 &gt;= imei
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiGe(String imei){
        if(imei!=null){
            ge("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 小于 &lt; imei
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiLt(String imei){
        if(imei!=null){
            lt("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * 小于等于 &lt;= imei
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiLe(String imei){
        if(imei!=null){
            le("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * BETWEEN 值1 AND 值2
     * @param imeiStart       值1
     * @param imeiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiBetween(String imeiStart,String imeiEnd){
        if(imeiStart!=null && imeiEnd!=null){
            between("imei",imeiStart,imeiEnd);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imeiStart       值1
     * @param imeiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiNotBetween(String imeiStart,String imeiEnd){
        if(imeiStart!=null && imeiEnd!=null){
            notBetween("imei",imeiStart,imeiEnd);
        }
        return this;
     }


    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '%值%' imei
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiLike(String imei){
        if(imei!=null){
            like("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * NOT LIKE '%值%' imei
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiNotLike(String imei){
        if(imei!=null){
            notLike("imei",imei);
        }
        return this;
     }


    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '%值' imei
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiLikeLeft(String imei){
        if(imei!=null){
            likeLeft("imei",imei);
        }
        return this;
     }

    /**
     * <p>移动终端的唯一标识</p>
     * LIKE '值%' imei
     * @param imei       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiLikeRight(String imei){
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
    public EmSocDevicesUpdateWrapper imeiIsNull(){
        isNull("imei");
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiIsNotNull(){
        isNotNull("imei");
        return this;
    }

    /**
     * <p>移动终端的唯一标识</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper imeiIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper imeiIn(String... values){
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
    public EmSocDevicesUpdateWrapper imeiNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper imeiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("imei",values);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * 等于 = imsi
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiEq(String imsi){
        if(imsi!=null){
            eq("imsi",imsi);
        }
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * 不等于 &lt;&gt; imsi
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiNe(String imsi){
        if(imsi!=null){
            ne("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 大于 &gt; imsi
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiGt(String imsi){
        if(imsi!=null){
            gt("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 大于等于 &gt;= imsi
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiGe(String imsi){
        if(imsi!=null){
            ge("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 小于 &lt; imsi
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiLt(String imsi){
        if(imsi!=null){
            lt("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * 小于等于 &lt;= imsi
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiLe(String imsi){
        if(imsi!=null){
            le("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * BETWEEN 值1 AND 值2
     * @param imsiStart       值1
     * @param imsiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiBetween(String imsiStart,String imsiEnd){
        if(imsiStart!=null && imsiEnd!=null){
            between("imsi",imsiStart,imsiEnd);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imsiStart       值1
     * @param imsiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiNotBetween(String imsiStart,String imsiEnd){
        if(imsiStart!=null && imsiEnd!=null){
            notBetween("imsi",imsiStart,imsiEnd);
        }
        return this;
     }


    /**
     * <p>国际移动用户识别码</p>
     * LIKE '%值%' imsi
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiLike(String imsi){
        if(imsi!=null){
            like("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * NOT LIKE '%值%' imsi
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiNotLike(String imsi){
        if(imsi!=null){
            notLike("imsi",imsi);
        }
        return this;
     }


    /**
     * <p>国际移动用户识别码</p>
     * LIKE '%值' imsi
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiLikeLeft(String imsi){
        if(imsi!=null){
            likeLeft("imsi",imsi);
        }
        return this;
     }

    /**
     * <p>国际移动用户识别码</p>
     * LIKE '值%' imsi
     * @param imsi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiLikeRight(String imsi){
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
    public EmSocDevicesUpdateWrapper imsiIsNull(){
        isNull("imsi");
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiIsNotNull(){
        isNotNull("imsi");
        return this;
    }

    /**
     * <p>国际移动用户识别码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper imsiIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper imsiIn(String... values){
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
    public EmSocDevicesUpdateWrapper imsiNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper imsiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("imsi",values);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * 等于 = macAddr
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrEq(String macAddr){
        if(macAddr!=null){
            eq("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>macAddr</p>
     * 不等于 &lt;&gt; macAddr
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrNe(String macAddr){
        if(macAddr!=null){
            ne("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 大于 &gt; macAddr
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrGt(String macAddr){
        if(macAddr!=null){
            gt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 大于等于 &gt;= macAddr
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrGe(String macAddr){
        if(macAddr!=null){
            ge("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 小于 &lt; macAddr
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrLt(String macAddr){
        if(macAddr!=null){
            lt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * 小于等于 &lt;= macAddr
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrLe(String macAddr){
        if(macAddr!=null){
            le("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * BETWEEN 值1 AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrBetween(String macAddrStart,String macAddrEnd){
        if(macAddrStart!=null && macAddrEnd!=null){
            between("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * NOT BETWEEN 值1 AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrNotBetween(String macAddrStart,String macAddrEnd){
        if(macAddrStart!=null && macAddrEnd!=null){
            notBetween("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }


    /**
     * <p>macAddr</p>
     * LIKE '%值%' macAddr
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrLike(String macAddr){
        if(macAddr!=null){
            like("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * NOT LIKE '%值%' macAddr
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrNotLike(String macAddr){
        if(macAddr!=null){
            notLike("mac_addr",macAddr);
        }
        return this;
     }


    /**
     * <p>macAddr</p>
     * LIKE '%值' macAddr
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrLikeLeft(String macAddr){
        if(macAddr!=null){
            likeLeft("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>macAddr</p>
     * LIKE '值%' macAddr
     * @param macAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrLikeRight(String macAddr){
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
    public EmSocDevicesUpdateWrapper macAddrIsNull(){
        isNull("mac_addr");
        return this;
    }

    /**
     * <p>macAddr</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrIsNotNull(){
        isNotNull("mac_addr");
        return this;
    }

    /**
     * <p>macAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper macAddrIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper macAddrIn(String... values){
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
    public EmSocDevicesUpdateWrapper macAddrNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper macAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("mac_addr",values);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * 等于 = internalAddr
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrEq(String internalAddr){
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>internalAddr</p>
     * 不等于 &lt;&gt; internalAddr
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrNe(String internalAddr){
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 大于 &gt; internalAddr
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrGt(String internalAddr){
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 大于等于 &gt;= internalAddr
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrGe(String internalAddr){
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 小于 &lt; internalAddr
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrLt(String internalAddr){
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * 小于等于 &lt;= internalAddr
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrLe(String internalAddr){
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * BETWEEN 值1 AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
        if(internalAddrStart!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * NOT BETWEEN 值1 AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
        if(internalAddrStart!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }


    /**
     * <p>internalAddr</p>
     * LIKE '%值%' internalAddr
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrLike(String internalAddr){
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * NOT LIKE '%值%' internalAddr
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrNotLike(String internalAddr){
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
     }


    /**
     * <p>internalAddr</p>
     * LIKE '%值' internalAddr
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrLikeLeft(String internalAddr){
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>internalAddr</p>
     * LIKE '值%' internalAddr
     * @param internalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrLikeRight(String internalAddr){
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
    public EmSocDevicesUpdateWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>internalAddr</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>internalAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper internalAddrIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper internalAddrIn(String... values){
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
    public EmSocDevicesUpdateWrapper internalAddrNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper internalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * 等于 = externalAddr
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrEq(String externalAddr){
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>externalAddr</p>
     * 不等于 &lt;&gt; externalAddr
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrNe(String externalAddr){
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 大于 &gt; externalAddr
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrGt(String externalAddr){
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 大于等于 &gt;= externalAddr
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrGe(String externalAddr){
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 小于 &lt; externalAddr
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrLt(String externalAddr){
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * 小于等于 &lt;= externalAddr
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrLe(String externalAddr){
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * BETWEEN 值1 AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
        if(externalAddrStart!=null && externalAddrEnd!=null){
            between("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * NOT BETWEEN 值1 AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
        if(externalAddrStart!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }


    /**
     * <p>externalAddr</p>
     * LIKE '%值%' externalAddr
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrLike(String externalAddr){
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * NOT LIKE '%值%' externalAddr
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrNotLike(String externalAddr){
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
     }


    /**
     * <p>externalAddr</p>
     * LIKE '%值' externalAddr
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrLikeLeft(String externalAddr){
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>externalAddr</p>
     * LIKE '值%' externalAddr
     * @param externalAddr       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrLikeRight(String externalAddr){
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
    public EmSocDevicesUpdateWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>externalAddr</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>externalAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper externalAddrIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper externalAddrIn(String... values){
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
    public EmSocDevicesUpdateWrapper externalAddrNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper externalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_addr",values);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * 等于 = provinceCcode
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeEq(Long provinceCcode){
        if(provinceCcode!=null){
            eq("province_ccode",provinceCcode);
        }
        return this;
    }

    /**
     * <p>省份ccode</p>
     * 不等于 &lt;&gt; provinceCcode
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeNe(Long provinceCcode){
        if(provinceCcode!=null){
            ne("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 大于 &gt; provinceCcode
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeGt(Long provinceCcode){
        if(provinceCcode!=null){
            gt("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 大于等于 &gt;= provinceCcode
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeGe(Long provinceCcode){
        if(provinceCcode!=null){
            ge("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 小于 &lt; provinceCcode
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeLt(Long provinceCcode){
        if(provinceCcode!=null){
            lt("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * 小于等于 &lt;= provinceCcode
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeLe(Long provinceCcode){
        if(provinceCcode!=null){
            le("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * BETWEEN 值1 AND 值2
     * @param provinceCcodeStart       值1
     * @param provinceCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeBetween(Long provinceCcodeStart,Long provinceCcodeEnd){
        if(provinceCcodeStart!=null && provinceCcodeEnd!=null){
            between("province_ccode",provinceCcodeStart,provinceCcodeEnd);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * NOT BETWEEN 值1 AND 值2
     * @param provinceCcodeStart       值1
     * @param provinceCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeNotBetween(Long provinceCcodeStart,Long provinceCcodeEnd){
        if(provinceCcodeStart!=null && provinceCcodeEnd!=null){
            notBetween("province_ccode",provinceCcodeStart,provinceCcodeEnd);
        }
        return this;
     }


    /**
     * <p>省份ccode</p>
     * LIKE '%值%' provinceCcode
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeLike(Long provinceCcode){
        if(provinceCcode!=null){
            like("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * NOT LIKE '%值%' provinceCcode
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeNotLike(Long provinceCcode){
        if(provinceCcode!=null){
            notLike("province_ccode",provinceCcode);
        }
        return this;
     }


    /**
     * <p>省份ccode</p>
     * LIKE '%值' provinceCcode
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeLikeLeft(Long provinceCcode){
        if(provinceCcode!=null){
            likeLeft("province_ccode",provinceCcode);
        }
        return this;
     }

    /**
     * <p>省份ccode</p>
     * LIKE '值%' provinceCcode
     * @param provinceCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeLikeRight(Long provinceCcode){
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
    public EmSocDevicesUpdateWrapper provinceCcodeIsNull(){
        isNull("province_ccode");
        return this;
    }

    /**
     * <p>省份ccode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeIsNotNull(){
        isNotNull("province_ccode");
        return this;
    }

    /**
     * <p>省份ccode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceCcodeIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper provinceCcodeIn(Long... values){
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
    public EmSocDevicesUpdateWrapper provinceCcodeNotIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper provinceCcodeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("province_ccode",values);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * 等于 = provinceName
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameEq(String provinceName){
        if(provinceName!=null){
            eq("province_name",provinceName);
        }
        return this;
    }

    /**
     * <p>省份名称</p>
     * 不等于 &lt;&gt; provinceName
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameNe(String provinceName){
        if(provinceName!=null){
            ne("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 大于 &gt; provinceName
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameGt(String provinceName){
        if(provinceName!=null){
            gt("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 大于等于 &gt;= provinceName
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameGe(String provinceName){
        if(provinceName!=null){
            ge("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 小于 &lt; provinceName
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameLt(String provinceName){
        if(provinceName!=null){
            lt("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * 小于等于 &lt;= provinceName
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameLe(String provinceName){
        if(provinceName!=null){
            le("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * BETWEEN 值1 AND 值2
     * @param provinceNameStart       值1
     * @param provinceNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameBetween(String provinceNameStart,String provinceNameEnd){
        if(provinceNameStart!=null && provinceNameEnd!=null){
            between("province_name",provinceNameStart,provinceNameEnd);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param provinceNameStart       值1
     * @param provinceNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameNotBetween(String provinceNameStart,String provinceNameEnd){
        if(provinceNameStart!=null && provinceNameEnd!=null){
            notBetween("province_name",provinceNameStart,provinceNameEnd);
        }
        return this;
     }


    /**
     * <p>省份名称</p>
     * LIKE '%值%' provinceName
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameLike(String provinceName){
        if(provinceName!=null){
            like("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * NOT LIKE '%值%' provinceName
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameNotLike(String provinceName){
        if(provinceName!=null){
            notLike("province_name",provinceName);
        }
        return this;
     }


    /**
     * <p>省份名称</p>
     * LIKE '%值' provinceName
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameLikeLeft(String provinceName){
        if(provinceName!=null){
            likeLeft("province_name",provinceName);
        }
        return this;
     }

    /**
     * <p>省份名称</p>
     * LIKE '值%' provinceName
     * @param provinceName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameLikeRight(String provinceName){
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
    public EmSocDevicesUpdateWrapper provinceNameIsNull(){
        isNull("province_name");
        return this;
    }

    /**
     * <p>省份名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameIsNotNull(){
        isNotNull("province_name");
        return this;
    }

    /**
     * <p>省份名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper provinceNameIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper provinceNameIn(String... values){
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
    public EmSocDevicesUpdateWrapper provinceNameNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper provinceNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("province_name",values);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * 等于 = cityCcode
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeEq(Long cityCcode){
        if(cityCcode!=null){
            eq("city_ccode",cityCcode);
        }
        return this;
    }

    /**
     * <p>城市ccode</p>
     * 不等于 &lt;&gt; cityCcode
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeNe(Long cityCcode){
        if(cityCcode!=null){
            ne("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 大于 &gt; cityCcode
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeGt(Long cityCcode){
        if(cityCcode!=null){
            gt("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 大于等于 &gt;= cityCcode
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeGe(Long cityCcode){
        if(cityCcode!=null){
            ge("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 小于 &lt; cityCcode
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeLt(Long cityCcode){
        if(cityCcode!=null){
            lt("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * 小于等于 &lt;= cityCcode
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeLe(Long cityCcode){
        if(cityCcode!=null){
            le("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * BETWEEN 值1 AND 值2
     * @param cityCcodeStart       值1
     * @param cityCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeBetween(Long cityCcodeStart,Long cityCcodeEnd){
        if(cityCcodeStart!=null && cityCcodeEnd!=null){
            between("city_ccode",cityCcodeStart,cityCcodeEnd);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * NOT BETWEEN 值1 AND 值2
     * @param cityCcodeStart       值1
     * @param cityCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeNotBetween(Long cityCcodeStart,Long cityCcodeEnd){
        if(cityCcodeStart!=null && cityCcodeEnd!=null){
            notBetween("city_ccode",cityCcodeStart,cityCcodeEnd);
        }
        return this;
     }


    /**
     * <p>城市ccode</p>
     * LIKE '%值%' cityCcode
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeLike(Long cityCcode){
        if(cityCcode!=null){
            like("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * NOT LIKE '%值%' cityCcode
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeNotLike(Long cityCcode){
        if(cityCcode!=null){
            notLike("city_ccode",cityCcode);
        }
        return this;
     }


    /**
     * <p>城市ccode</p>
     * LIKE '%值' cityCcode
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeLikeLeft(Long cityCcode){
        if(cityCcode!=null){
            likeLeft("city_ccode",cityCcode);
        }
        return this;
     }

    /**
     * <p>城市ccode</p>
     * LIKE '值%' cityCcode
     * @param cityCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeLikeRight(Long cityCcode){
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
    public EmSocDevicesUpdateWrapper cityCcodeIsNull(){
        isNull("city_ccode");
        return this;
    }

    /**
     * <p>城市ccode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeIsNotNull(){
        isNotNull("city_ccode");
        return this;
    }

    /**
     * <p>城市ccode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityCcodeIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper cityCcodeIn(Long... values){
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
    public EmSocDevicesUpdateWrapper cityCcodeNotIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper cityCcodeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("city_ccode",values);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * 等于 = cityName
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameEq(String cityName){
        if(cityName!=null){
            eq("city_name",cityName);
        }
        return this;
    }

    /**
     * <p>城市名称</p>
     * 不等于 &lt;&gt; cityName
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameNe(String cityName){
        if(cityName!=null){
            ne("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 大于 &gt; cityName
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameGt(String cityName){
        if(cityName!=null){
            gt("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 大于等于 &gt;= cityName
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameGe(String cityName){
        if(cityName!=null){
            ge("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 小于 &lt; cityName
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameLt(String cityName){
        if(cityName!=null){
            lt("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * 小于等于 &lt;= cityName
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameLe(String cityName){
        if(cityName!=null){
            le("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * BETWEEN 值1 AND 值2
     * @param cityNameStart       值1
     * @param cityNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameBetween(String cityNameStart,String cityNameEnd){
        if(cityNameStart!=null && cityNameEnd!=null){
            between("city_name",cityNameStart,cityNameEnd);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param cityNameStart       值1
     * @param cityNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameNotBetween(String cityNameStart,String cityNameEnd){
        if(cityNameStart!=null && cityNameEnd!=null){
            notBetween("city_name",cityNameStart,cityNameEnd);
        }
        return this;
     }


    /**
     * <p>城市名称</p>
     * LIKE '%值%' cityName
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameLike(String cityName){
        if(cityName!=null){
            like("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * NOT LIKE '%值%' cityName
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameNotLike(String cityName){
        if(cityName!=null){
            notLike("city_name",cityName);
        }
        return this;
     }


    /**
     * <p>城市名称</p>
     * LIKE '%值' cityName
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameLikeLeft(String cityName){
        if(cityName!=null){
            likeLeft("city_name",cityName);
        }
        return this;
     }

    /**
     * <p>城市名称</p>
     * LIKE '值%' cityName
     * @param cityName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameLikeRight(String cityName){
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
    public EmSocDevicesUpdateWrapper cityNameIsNull(){
        isNull("city_name");
        return this;
    }

    /**
     * <p>城市名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameIsNotNull(){
        isNotNull("city_name");
        return this;
    }

    /**
     * <p>城市名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper cityNameIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper cityNameIn(String... values){
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
    public EmSocDevicesUpdateWrapper cityNameNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper cityNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("city_name",values);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * 等于 = areaCcode
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeEq(Long areaCcode){
        if(areaCcode!=null){
            eq("area_ccode",areaCcode);
        }
        return this;
    }

    /**
     * <p>地区ccode</p>
     * 不等于 &lt;&gt; areaCcode
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeNe(Long areaCcode){
        if(areaCcode!=null){
            ne("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 大于 &gt; areaCcode
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeGt(Long areaCcode){
        if(areaCcode!=null){
            gt("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 大于等于 &gt;= areaCcode
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeGe(Long areaCcode){
        if(areaCcode!=null){
            ge("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 小于 &lt; areaCcode
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeLt(Long areaCcode){
        if(areaCcode!=null){
            lt("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * 小于等于 &lt;= areaCcode
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeLe(Long areaCcode){
        if(areaCcode!=null){
            le("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * BETWEEN 值1 AND 值2
     * @param areaCcodeStart       值1
     * @param areaCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeBetween(Long areaCcodeStart,Long areaCcodeEnd){
        if(areaCcodeStart!=null && areaCcodeEnd!=null){
            between("area_ccode",areaCcodeStart,areaCcodeEnd);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * NOT BETWEEN 值1 AND 值2
     * @param areaCcodeStart       值1
     * @param areaCcodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeNotBetween(Long areaCcodeStart,Long areaCcodeEnd){
        if(areaCcodeStart!=null && areaCcodeEnd!=null){
            notBetween("area_ccode",areaCcodeStart,areaCcodeEnd);
        }
        return this;
     }


    /**
     * <p>地区ccode</p>
     * LIKE '%值%' areaCcode
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeLike(Long areaCcode){
        if(areaCcode!=null){
            like("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * NOT LIKE '%值%' areaCcode
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeNotLike(Long areaCcode){
        if(areaCcode!=null){
            notLike("area_ccode",areaCcode);
        }
        return this;
     }


    /**
     * <p>地区ccode</p>
     * LIKE '%值' areaCcode
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeLikeLeft(Long areaCcode){
        if(areaCcode!=null){
            likeLeft("area_ccode",areaCcode);
        }
        return this;
     }

    /**
     * <p>地区ccode</p>
     * LIKE '值%' areaCcode
     * @param areaCcode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeLikeRight(Long areaCcode){
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
    public EmSocDevicesUpdateWrapper areaCcodeIsNull(){
        isNull("area_ccode");
        return this;
    }

    /**
     * <p>地区ccode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeIsNotNull(){
        isNotNull("area_ccode");
        return this;
    }

    /**
     * <p>地区ccode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaCcodeIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper areaCcodeIn(Long... values){
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
    public EmSocDevicesUpdateWrapper areaCcodeNotIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper areaCcodeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("area_ccode",values);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * 等于 = areaName
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameEq(String areaName){
        if(areaName!=null){
            eq("area_name",areaName);
        }
        return this;
    }

    /**
     * <p>地区名称</p>
     * 不等于 &lt;&gt; areaName
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameNe(String areaName){
        if(areaName!=null){
            ne("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 大于 &gt; areaName
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameGt(String areaName){
        if(areaName!=null){
            gt("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 大于等于 &gt;= areaName
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameGe(String areaName){
        if(areaName!=null){
            ge("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 小于 &lt; areaName
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameLt(String areaName){
        if(areaName!=null){
            lt("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * 小于等于 &lt;= areaName
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameLe(String areaName){
        if(areaName!=null){
            le("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * BETWEEN 值1 AND 值2
     * @param areaNameStart       值1
     * @param areaNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameBetween(String areaNameStart,String areaNameEnd){
        if(areaNameStart!=null && areaNameEnd!=null){
            between("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param areaNameStart       值1
     * @param areaNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameNotBetween(String areaNameStart,String areaNameEnd){
        if(areaNameStart!=null && areaNameEnd!=null){
            notBetween("area_name",areaNameStart,areaNameEnd);
        }
        return this;
     }


    /**
     * <p>地区名称</p>
     * LIKE '%值%' areaName
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameLike(String areaName){
        if(areaName!=null){
            like("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * NOT LIKE '%值%' areaName
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameNotLike(String areaName){
        if(areaName!=null){
            notLike("area_name",areaName);
        }
        return this;
     }


    /**
     * <p>地区名称</p>
     * LIKE '%值' areaName
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameLikeLeft(String areaName){
        if(areaName!=null){
            likeLeft("area_name",areaName);
        }
        return this;
     }

    /**
     * <p>地区名称</p>
     * LIKE '值%' areaName
     * @param areaName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameLikeRight(String areaName){
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
    public EmSocDevicesUpdateWrapper areaNameIsNull(){
        isNull("area_name");
        return this;
    }

    /**
     * <p>地区名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameIsNotNull(){
        isNotNull("area_name");
        return this;
    }

    /**
     * <p>地区名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper areaNameIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper areaNameIn(String... values){
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
    public EmSocDevicesUpdateWrapper areaNameNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper areaNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("area_name",values);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 等于 = regionName
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameEq(String regionName){
        if(regionName!=null){
            eq("region_name",regionName);
        }
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 不等于 &lt;&gt; regionName
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameNe(String regionName){
        if(regionName!=null){
            ne("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 大于 &gt; regionName
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameGt(String regionName){
        if(regionName!=null){
            gt("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 大于等于 &gt;= regionName
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameGe(String regionName){
        if(regionName!=null){
            ge("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 小于 &lt; regionName
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameLt(String regionName){
        if(regionName!=null){
            lt("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * 小于等于 &lt;= regionName
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameLe(String regionName){
        if(regionName!=null){
            le("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * BETWEEN 值1 AND 值2
     * @param regionNameStart       值1
     * @param regionNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameBetween(String regionNameStart,String regionNameEnd){
        if(regionNameStart!=null && regionNameEnd!=null){
            between("region_name",regionNameStart,regionNameEnd);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param regionNameStart       值1
     * @param regionNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameNotBetween(String regionNameStart,String regionNameEnd){
        if(regionNameStart!=null && regionNameEnd!=null){
            notBetween("region_name",regionNameStart,regionNameEnd);
        }
        return this;
     }


    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '%值%' regionName
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameLike(String regionName){
        if(regionName!=null){
            like("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * NOT LIKE '%值%' regionName
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameNotLike(String regionName){
        if(regionName!=null){
            notLike("region_name",regionName);
        }
        return this;
     }


    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '%值' regionName
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameLikeLeft(String regionName){
        if(regionName!=null){
            likeLeft("region_name",regionName);
        }
        return this;
     }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * LIKE '值%' regionName
     * @param regionName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameLikeRight(String regionName){
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
    public EmSocDevicesUpdateWrapper regionNameIsNull(){
        isNull("region_name");
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameIsNotNull(){
        isNotNull("region_name");
        return this;
    }

    /**
     * <p>地址地区名称详细（省市区街道名称以逗号分开）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper regionNameIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper regionNameIn(String... values){
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
    public EmSocDevicesUpdateWrapper regionNameNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper regionNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region_name",values);
        }
        return this;
    }

    /**
     * <p>location</p>
     * 等于 = location
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationEq(String location){
        if(location!=null){
            eq("location",location);
        }
        return this;
    }

    /**
     * <p>location</p>
     * 不等于 &lt;&gt; location
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationNe(String location){
        if(location!=null){
            ne("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 大于 &gt; location
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationGt(String location){
        if(location!=null){
            gt("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 大于等于 &gt;= location
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationGe(String location){
        if(location!=null){
            ge("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 小于 &lt; location
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationLt(String location){
        if(location!=null){
            lt("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * 小于等于 &lt;= location
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationLe(String location){
        if(location!=null){
            le("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * BETWEEN 值1 AND 值2
     * @param locationStart       值1
     * @param locationEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationBetween(String locationStart,String locationEnd){
        if(locationStart!=null && locationEnd!=null){
            between("location",locationStart,locationEnd);
        }
        return this;
     }

    /**
     * <p>location</p>
     * NOT BETWEEN 值1 AND 值2
     * @param locationStart       值1
     * @param locationEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationNotBetween(String locationStart,String locationEnd){
        if(locationStart!=null && locationEnd!=null){
            notBetween("location",locationStart,locationEnd);
        }
        return this;
     }


    /**
     * <p>location</p>
     * LIKE '%值%' location
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationLike(String location){
        if(location!=null){
            like("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * NOT LIKE '%值%' location
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationNotLike(String location){
        if(location!=null){
            notLike("location",location);
        }
        return this;
     }


    /**
     * <p>location</p>
     * LIKE '%值' location
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationLikeLeft(String location){
        if(location!=null){
            likeLeft("location",location);
        }
        return this;
     }

    /**
     * <p>location</p>
     * LIKE '值%' location
     * @param location       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationLikeRight(String location){
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
    public EmSocDevicesUpdateWrapper locationIsNull(){
        isNull("location");
        return this;
    }

    /**
     * <p>location</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationIsNotNull(){
        isNotNull("location");
        return this;
    }

    /**
     * <p>location</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper locationIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper locationIn(String... values){
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
    public EmSocDevicesUpdateWrapper locationNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper locationNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("location",values);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * 等于 = processors
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsEq(Integer processors){
        if(processors!=null){
            eq("processors",processors);
        }
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * 不等于 &lt;&gt; processors
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsNe(Integer processors){
        if(processors!=null){
            ne("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 大于 &gt; processors
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsGt(Integer processors){
        if(processors!=null){
            gt("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 大于等于 &gt;= processors
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsGe(Integer processors){
        if(processors!=null){
            ge("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 小于 &lt; processors
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsLt(Integer processors){
        if(processors!=null){
            lt("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * 小于等于 &lt;= processors
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsLe(Integer processors){
        if(processors!=null){
            le("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * BETWEEN 值1 AND 值2
     * @param processorsStart       值1
     * @param processorsEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsBetween(Integer processorsStart,Integer processorsEnd){
        if(processorsStart!=null && processorsEnd!=null){
            between("processors",processorsStart,processorsEnd);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param processorsStart       值1
     * @param processorsEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsNotBetween(Integer processorsStart,Integer processorsEnd){
        if(processorsStart!=null && processorsEnd!=null){
            notBetween("processors",processorsStart,processorsEnd);
        }
        return this;
     }


    /**
     * <p>cpu线程数</p>
     * LIKE '%值%' processors
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsLike(Integer processors){
        if(processors!=null){
            like("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * NOT LIKE '%值%' processors
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsNotLike(Integer processors){
        if(processors!=null){
            notLike("processors",processors);
        }
        return this;
     }


    /**
     * <p>cpu线程数</p>
     * LIKE '%值' processors
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsLikeLeft(Integer processors){
        if(processors!=null){
            likeLeft("processors",processors);
        }
        return this;
     }

    /**
     * <p>cpu线程数</p>
     * LIKE '值%' processors
     * @param processors       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsLikeRight(Integer processors){
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
    public EmSocDevicesUpdateWrapper processorsIsNull(){
        isNull("processors");
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsIsNotNull(){
        isNotNull("processors");
        return this;
    }

    /**
     * <p>cpu线程数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper processorsIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper processorsIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper processorsNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper processorsNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("processors",values);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * 等于 = buildId
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdEq(String buildId){
        if(buildId!=null){
            eq("build_id",buildId);
        }
        return this;
    }

    /**
     * <p>修订版本号</p>
     * 不等于 &lt;&gt; buildId
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdNe(String buildId){
        if(buildId!=null){
            ne("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 大于 &gt; buildId
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdGt(String buildId){
        if(buildId!=null){
            gt("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 大于等于 &gt;= buildId
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdGe(String buildId){
        if(buildId!=null){
            ge("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 小于 &lt; buildId
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdLt(String buildId){
        if(buildId!=null){
            lt("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * 小于等于 &lt;= buildId
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdLe(String buildId){
        if(buildId!=null){
            le("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * BETWEEN 值1 AND 值2
     * @param buildIdStart       值1
     * @param buildIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdBetween(String buildIdStart,String buildIdEnd){
        if(buildIdStart!=null && buildIdEnd!=null){
            between("build_id",buildIdStart,buildIdEnd);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildIdStart       值1
     * @param buildIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdNotBetween(String buildIdStart,String buildIdEnd){
        if(buildIdStart!=null && buildIdEnd!=null){
            notBetween("build_id",buildIdStart,buildIdEnd);
        }
        return this;
     }


    /**
     * <p>修订版本号</p>
     * LIKE '%值%' buildId
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdLike(String buildId){
        if(buildId!=null){
            like("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * NOT LIKE '%值%' buildId
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdNotLike(String buildId){
        if(buildId!=null){
            notLike("build_id",buildId);
        }
        return this;
     }


    /**
     * <p>修订版本号</p>
     * LIKE '%值' buildId
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdLikeLeft(String buildId){
        if(buildId!=null){
            likeLeft("build_id",buildId);
        }
        return this;
     }

    /**
     * <p>修订版本号</p>
     * LIKE '值%' buildId
     * @param buildId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdLikeRight(String buildId){
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
    public EmSocDevicesUpdateWrapper buildIdIsNull(){
        isNull("build_id");
        return this;
    }

    /**
     * <p>修订版本号</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdIsNotNull(){
        isNotNull("build_id");
        return this;
    }

    /**
     * <p>修订版本号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildIdIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildIdIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildIdNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_id",values);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * 等于 = buildRadio
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioEq(String buildRadio){
        if(buildRadio!=null){
            eq("build_radio",buildRadio);
        }
        return this;
    }

    /**
     * <p>build_radio</p>
     * 不等于 &lt;&gt; buildRadio
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioNe(String buildRadio){
        if(buildRadio!=null){
            ne("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 大于 &gt; buildRadio
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioGt(String buildRadio){
        if(buildRadio!=null){
            gt("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 大于等于 &gt;= buildRadio
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioGe(String buildRadio){
        if(buildRadio!=null){
            ge("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 小于 &lt; buildRadio
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioLt(String buildRadio){
        if(buildRadio!=null){
            lt("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * 小于等于 &lt;= buildRadio
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioLe(String buildRadio){
        if(buildRadio!=null){
            le("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * BETWEEN 值1 AND 值2
     * @param buildRadioStart       值1
     * @param buildRadioEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioBetween(String buildRadioStart,String buildRadioEnd){
        if(buildRadioStart!=null && buildRadioEnd!=null){
            between("build_radio",buildRadioStart,buildRadioEnd);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildRadioStart       值1
     * @param buildRadioEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioNotBetween(String buildRadioStart,String buildRadioEnd){
        if(buildRadioStart!=null && buildRadioEnd!=null){
            notBetween("build_radio",buildRadioStart,buildRadioEnd);
        }
        return this;
     }


    /**
     * <p>build_radio</p>
     * LIKE '%值%' buildRadio
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioLike(String buildRadio){
        if(buildRadio!=null){
            like("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * NOT LIKE '%值%' buildRadio
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioNotLike(String buildRadio){
        if(buildRadio!=null){
            notLike("build_radio",buildRadio);
        }
        return this;
     }


    /**
     * <p>build_radio</p>
     * LIKE '%值' buildRadio
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioLikeLeft(String buildRadio){
        if(buildRadio!=null){
            likeLeft("build_radio",buildRadio);
        }
        return this;
     }

    /**
     * <p>build_radio</p>
     * LIKE '值%' buildRadio
     * @param buildRadio       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioLikeRight(String buildRadio){
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
    public EmSocDevicesUpdateWrapper buildRadioIsNull(){
        isNull("build_radio");
        return this;
    }

    /**
     * <p>build_radio</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioIsNotNull(){
        isNotNull("build_radio");
        return this;
    }

    /**
     * <p>build_radio</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildRadioIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildRadioIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildRadioNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildRadioNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_radio",values);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 等于 = buildModel
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelEq(String buildModel){
        if(buildModel!=null){
            eq("build_model",buildModel);
        }
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 不等于 &lt;&gt; buildModel
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelNe(String buildModel){
        if(buildModel!=null){
            ne("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 大于 &gt; buildModel
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelGt(String buildModel){
        if(buildModel!=null){
            gt("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 大于等于 &gt;= buildModel
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelGe(String buildModel){
        if(buildModel!=null){
            ge("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 小于 &lt; buildModel
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelLt(String buildModel){
        if(buildModel!=null){
            lt("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * 小于等于 &lt;= buildModel
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelLe(String buildModel){
        if(buildModel!=null){
            le("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * BETWEEN 值1 AND 值2
     * @param buildModelStart       值1
     * @param buildModelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelBetween(String buildModelStart,String buildModelEnd){
        if(buildModelStart!=null && buildModelEnd!=null){
            between("build_model",buildModelStart,buildModelEnd);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildModelStart       值1
     * @param buildModelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelNotBetween(String buildModelStart,String buildModelEnd){
        if(buildModelStart!=null && buildModelEnd!=null){
            notBetween("build_model",buildModelStart,buildModelEnd);
        }
        return this;
     }


    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '%值%' buildModel
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelLike(String buildModel){
        if(buildModel!=null){
            like("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * NOT LIKE '%值%' buildModel
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelNotLike(String buildModel){
        if(buildModel!=null){
            notLike("build_model",buildModel);
        }
        return this;
     }


    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '%值' buildModel
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelLikeLeft(String buildModel){
        if(buildModel!=null){
            likeLeft("build_model",buildModel);
        }
        return this;
     }

    /**
     * <p>版本即最终用户可见的名称</p>
     * LIKE '值%' buildModel
     * @param buildModel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelLikeRight(String buildModel){
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
    public EmSocDevicesUpdateWrapper buildModelIsNull(){
        isNull("build_model");
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelIsNotNull(){
        isNotNull("build_model");
        return this;
    }

    /**
     * <p>版本即最终用户可见的名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildModelIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildModelIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildModelNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildModelNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_model",values);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * 等于 = buildManufacturer
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerEq(String buildManufacturer){
        if(buildManufacturer!=null){
            eq("build_manufacturer",buildManufacturer);
        }
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * 不等于 &lt;&gt; buildManufacturer
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerNe(String buildManufacturer){
        if(buildManufacturer!=null){
            ne("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 大于 &gt; buildManufacturer
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerGt(String buildManufacturer){
        if(buildManufacturer!=null){
            gt("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 大于等于 &gt;= buildManufacturer
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerGe(String buildManufacturer){
        if(buildManufacturer!=null){
            ge("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 小于 &lt; buildManufacturer
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerLt(String buildManufacturer){
        if(buildManufacturer!=null){
            lt("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * 小于等于 &lt;= buildManufacturer
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerLe(String buildManufacturer){
        if(buildManufacturer!=null){
            le("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * BETWEEN 值1 AND 值2
     * @param buildManufacturerStart       值1
     * @param buildManufacturerEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerBetween(String buildManufacturerStart,String buildManufacturerEnd){
        if(buildManufacturerStart!=null && buildManufacturerEnd!=null){
            between("build_manufacturer",buildManufacturerStart,buildManufacturerEnd);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildManufacturerStart       值1
     * @param buildManufacturerEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerNotBetween(String buildManufacturerStart,String buildManufacturerEnd){
        if(buildManufacturerStart!=null && buildManufacturerEnd!=null){
            notBetween("build_manufacturer",buildManufacturerStart,buildManufacturerEnd);
        }
        return this;
     }


    /**
     * <p>硬件制造商</p>
     * LIKE '%值%' buildManufacturer
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerLike(String buildManufacturer){
        if(buildManufacturer!=null){
            like("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * NOT LIKE '%值%' buildManufacturer
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerNotLike(String buildManufacturer){
        if(buildManufacturer!=null){
            notLike("build_manufacturer",buildManufacturer);
        }
        return this;
     }


    /**
     * <p>硬件制造商</p>
     * LIKE '%值' buildManufacturer
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerLikeLeft(String buildManufacturer){
        if(buildManufacturer!=null){
            likeLeft("build_manufacturer",buildManufacturer);
        }
        return this;
     }

    /**
     * <p>硬件制造商</p>
     * LIKE '值%' buildManufacturer
     * @param buildManufacturer       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerLikeRight(String buildManufacturer){
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
    public EmSocDevicesUpdateWrapper buildManufacturerIsNull(){
        isNull("build_manufacturer");
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerIsNotNull(){
        isNotNull("build_manufacturer");
        return this;
    }

    /**
     * <p>硬件制造商</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildManufacturerIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildManufacturerIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildManufacturerNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildManufacturerNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_manufacturer",values);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * 等于 = buildBootloader
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderEq(String buildBootloader){
        if(buildBootloader!=null){
            eq("build_bootloader",buildBootloader);
        }
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * 不等于 &lt;&gt; buildBootloader
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderNe(String buildBootloader){
        if(buildBootloader!=null){
            ne("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 大于 &gt; buildBootloader
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderGt(String buildBootloader){
        if(buildBootloader!=null){
            gt("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 大于等于 &gt;= buildBootloader
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderGe(String buildBootloader){
        if(buildBootloader!=null){
            ge("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 小于 &lt; buildBootloader
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderLt(String buildBootloader){
        if(buildBootloader!=null){
            lt("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * 小于等于 &lt;= buildBootloader
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderLe(String buildBootloader){
        if(buildBootloader!=null){
            le("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * BETWEEN 值1 AND 值2
     * @param buildBootloaderStart       值1
     * @param buildBootloaderEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderBetween(String buildBootloaderStart,String buildBootloaderEnd){
        if(buildBootloaderStart!=null && buildBootloaderEnd!=null){
            between("build_bootloader",buildBootloaderStart,buildBootloaderEnd);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildBootloaderStart       值1
     * @param buildBootloaderEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderNotBetween(String buildBootloaderStart,String buildBootloaderEnd){
        if(buildBootloaderStart!=null && buildBootloaderEnd!=null){
            notBetween("build_bootloader",buildBootloaderStart,buildBootloaderEnd);
        }
        return this;
     }


    /**
     * <p>build_bootloader</p>
     * LIKE '%值%' buildBootloader
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderLike(String buildBootloader){
        if(buildBootloader!=null){
            like("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * NOT LIKE '%值%' buildBootloader
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderNotLike(String buildBootloader){
        if(buildBootloader!=null){
            notLike("build_bootloader",buildBootloader);
        }
        return this;
     }


    /**
     * <p>build_bootloader</p>
     * LIKE '%值' buildBootloader
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderLikeLeft(String buildBootloader){
        if(buildBootloader!=null){
            likeLeft("build_bootloader",buildBootloader);
        }
        return this;
     }

    /**
     * <p>build_bootloader</p>
     * LIKE '值%' buildBootloader
     * @param buildBootloader       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderLikeRight(String buildBootloader){
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
    public EmSocDevicesUpdateWrapper buildBootloaderIsNull(){
        isNull("build_bootloader");
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderIsNotNull(){
        isNotNull("build_bootloader");
        return this;
    }

    /**
     * <p>build_bootloader</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBootloaderIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildBootloaderIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildBootloaderNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildBootloaderNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_bootloader",values);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * 等于 = buildBoard
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardEq(String buildBoard){
        if(buildBoard!=null){
            eq("build_board",buildBoard);
        }
        return this;
    }

    /**
     * <p>主板</p>
     * 不等于 &lt;&gt; buildBoard
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardNe(String buildBoard){
        if(buildBoard!=null){
            ne("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 大于 &gt; buildBoard
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardGt(String buildBoard){
        if(buildBoard!=null){
            gt("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 大于等于 &gt;= buildBoard
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardGe(String buildBoard){
        if(buildBoard!=null){
            ge("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 小于 &lt; buildBoard
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardLt(String buildBoard){
        if(buildBoard!=null){
            lt("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * 小于等于 &lt;= buildBoard
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardLe(String buildBoard){
        if(buildBoard!=null){
            le("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * BETWEEN 值1 AND 值2
     * @param buildBoardStart       值1
     * @param buildBoardEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardBetween(String buildBoardStart,String buildBoardEnd){
        if(buildBoardStart!=null && buildBoardEnd!=null){
            between("build_board",buildBoardStart,buildBoardEnd);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildBoardStart       值1
     * @param buildBoardEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardNotBetween(String buildBoardStart,String buildBoardEnd){
        if(buildBoardStart!=null && buildBoardEnd!=null){
            notBetween("build_board",buildBoardStart,buildBoardEnd);
        }
        return this;
     }


    /**
     * <p>主板</p>
     * LIKE '%值%' buildBoard
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardLike(String buildBoard){
        if(buildBoard!=null){
            like("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * NOT LIKE '%值%' buildBoard
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardNotLike(String buildBoard){
        if(buildBoard!=null){
            notLike("build_board",buildBoard);
        }
        return this;
     }


    /**
     * <p>主板</p>
     * LIKE '%值' buildBoard
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardLikeLeft(String buildBoard){
        if(buildBoard!=null){
            likeLeft("build_board",buildBoard);
        }
        return this;
     }

    /**
     * <p>主板</p>
     * LIKE '值%' buildBoard
     * @param buildBoard       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardLikeRight(String buildBoard){
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
    public EmSocDevicesUpdateWrapper buildBoardIsNull(){
        isNull("build_board");
        return this;
    }

    /**
     * <p>主板</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardIsNotNull(){
        isNotNull("build_board");
        return this;
    }

    /**
     * <p>主板</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBoardIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildBoardIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildBoardNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildBoardNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_board",values);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * 等于 = buildBrand
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandEq(String buildBrand){
        if(buildBrand!=null){
            eq("build_brand",buildBrand);
        }
        return this;
    }

    /**
     * <p>系统定制商</p>
     * 不等于 &lt;&gt; buildBrand
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandNe(String buildBrand){
        if(buildBrand!=null){
            ne("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 大于 &gt; buildBrand
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandGt(String buildBrand){
        if(buildBrand!=null){
            gt("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 大于等于 &gt;= buildBrand
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandGe(String buildBrand){
        if(buildBrand!=null){
            ge("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 小于 &lt; buildBrand
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandLt(String buildBrand){
        if(buildBrand!=null){
            lt("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * 小于等于 &lt;= buildBrand
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandLe(String buildBrand){
        if(buildBrand!=null){
            le("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * BETWEEN 值1 AND 值2
     * @param buildBrandStart       值1
     * @param buildBrandEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandBetween(String buildBrandStart,String buildBrandEnd){
        if(buildBrandStart!=null && buildBrandEnd!=null){
            between("build_brand",buildBrandStart,buildBrandEnd);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildBrandStart       值1
     * @param buildBrandEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandNotBetween(String buildBrandStart,String buildBrandEnd){
        if(buildBrandStart!=null && buildBrandEnd!=null){
            notBetween("build_brand",buildBrandStart,buildBrandEnd);
        }
        return this;
     }


    /**
     * <p>系统定制商</p>
     * LIKE '%值%' buildBrand
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandLike(String buildBrand){
        if(buildBrand!=null){
            like("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * NOT LIKE '%值%' buildBrand
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandNotLike(String buildBrand){
        if(buildBrand!=null){
            notLike("build_brand",buildBrand);
        }
        return this;
     }


    /**
     * <p>系统定制商</p>
     * LIKE '%值' buildBrand
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandLikeLeft(String buildBrand){
        if(buildBrand!=null){
            likeLeft("build_brand",buildBrand);
        }
        return this;
     }

    /**
     * <p>系统定制商</p>
     * LIKE '值%' buildBrand
     * @param buildBrand       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandLikeRight(String buildBrand){
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
    public EmSocDevicesUpdateWrapper buildBrandIsNull(){
        isNull("build_brand");
        return this;
    }

    /**
     * <p>系统定制商</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandIsNotNull(){
        isNotNull("build_brand");
        return this;
    }

    /**
     * <p>系统定制商</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildBrandIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildBrandIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildBrandNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildBrandNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_brand",values);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * 等于 = buildCpuAbi
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiEq(String buildCpuAbi){
        if(buildCpuAbi!=null){
            eq("build_cpu_abi",buildCpuAbi);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * 不等于 &lt;&gt; buildCpuAbi
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiNe(String buildCpuAbi){
        if(buildCpuAbi!=null){
            ne("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 大于 &gt; buildCpuAbi
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiGt(String buildCpuAbi){
        if(buildCpuAbi!=null){
            gt("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 大于等于 &gt;= buildCpuAbi
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiGe(String buildCpuAbi){
        if(buildCpuAbi!=null){
            ge("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 小于 &lt; buildCpuAbi
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiLt(String buildCpuAbi){
        if(buildCpuAbi!=null){
            lt("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * 小于等于 &lt;= buildCpuAbi
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiLe(String buildCpuAbi){
        if(buildCpuAbi!=null){
            le("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * BETWEEN 值1 AND 值2
     * @param buildCpuAbiStart       值1
     * @param buildCpuAbiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiBetween(String buildCpuAbiStart,String buildCpuAbiEnd){
        if(buildCpuAbiStart!=null && buildCpuAbiEnd!=null){
            between("build_cpu_abi",buildCpuAbiStart,buildCpuAbiEnd);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildCpuAbiStart       值1
     * @param buildCpuAbiEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiNotBetween(String buildCpuAbiStart,String buildCpuAbiEnd){
        if(buildCpuAbiStart!=null && buildCpuAbiEnd!=null){
            notBetween("build_cpu_abi",buildCpuAbiStart,buildCpuAbiEnd);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi</p>
     * LIKE '%值%' buildCpuAbi
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiLike(String buildCpuAbi){
        if(buildCpuAbi!=null){
            like("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * NOT LIKE '%值%' buildCpuAbi
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiNotLike(String buildCpuAbi){
        if(buildCpuAbi!=null){
            notLike("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi</p>
     * LIKE '%值' buildCpuAbi
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiLikeLeft(String buildCpuAbi){
        if(buildCpuAbi!=null){
            likeLeft("build_cpu_abi",buildCpuAbi);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi</p>
     * LIKE '值%' buildCpuAbi
     * @param buildCpuAbi       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiLikeRight(String buildCpuAbi){
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
    public EmSocDevicesUpdateWrapper buildCpuAbiIsNull(){
        isNull("build_cpu_abi");
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiIsNotNull(){
        isNotNull("build_cpu_abi");
        return this;
    }

    /**
     * <p>build_cpu_abi</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbiIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildCpuAbiIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildCpuAbiNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildCpuAbiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_cpu_abi",values);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * 等于 = buildCpuAbi2
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2Eq(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            eq("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * 不等于 &lt;&gt; buildCpuAbi2
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2Ne(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            ne("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 大于 &gt; buildCpuAbi2
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2Gt(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            gt("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 大于等于 &gt;= buildCpuAbi2
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2Ge(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            ge("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 小于 &lt; buildCpuAbi2
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2Lt(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            lt("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * 小于等于 &lt;= buildCpuAbi2
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2Le(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            le("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * BETWEEN 值1 AND 值2
     * @param buildCpuAbi2Start       值1
     * @param buildCpuAbi2End      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2Between(String buildCpuAbi2Start,String buildCpuAbi2End){
        if(buildCpuAbi2Start!=null && buildCpuAbi2End!=null){
            between("build_cpu_abi2",buildCpuAbi2Start,buildCpuAbi2End);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildCpuAbi2Start       值1
     * @param buildCpuAbi2End      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2NotBetween(String buildCpuAbi2Start,String buildCpuAbi2End){
        if(buildCpuAbi2Start!=null && buildCpuAbi2End!=null){
            notBetween("build_cpu_abi2",buildCpuAbi2Start,buildCpuAbi2End);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi2</p>
     * LIKE '%值%' buildCpuAbi2
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2Like(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            like("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * NOT LIKE '%值%' buildCpuAbi2
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2NotLike(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            notLike("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }


    /**
     * <p>build_cpu_abi2</p>
     * LIKE '%值' buildCpuAbi2
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2LikeLeft(String buildCpuAbi2){
        if(buildCpuAbi2!=null){
            likeLeft("build_cpu_abi2",buildCpuAbi2);
        }
        return this;
     }

    /**
     * <p>build_cpu_abi2</p>
     * LIKE '值%' buildCpuAbi2
     * @param buildCpuAbi2       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2LikeRight(String buildCpuAbi2){
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
    public EmSocDevicesUpdateWrapper buildCpuAbi2IsNull(){
        isNull("build_cpu_abi2");
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2IsNotNull(){
        isNotNull("build_cpu_abi2");
        return this;
    }

    /**
     * <p>build_cpu_abi2</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildCpuAbi2In(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildCpuAbi2In(String... values){
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
    public EmSocDevicesUpdateWrapper buildCpuAbi2NotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildCpuAbi2NotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_cpu_abi2",values);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * 等于 = buildDevice
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceEq(String buildDevice){
        if(buildDevice!=null){
            eq("build_device",buildDevice);
        }
        return this;
    }

    /**
     * <p>设备参数</p>
     * 不等于 &lt;&gt; buildDevice
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceNe(String buildDevice){
        if(buildDevice!=null){
            ne("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 大于 &gt; buildDevice
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceGt(String buildDevice){
        if(buildDevice!=null){
            gt("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 大于等于 &gt;= buildDevice
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceGe(String buildDevice){
        if(buildDevice!=null){
            ge("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 小于 &lt; buildDevice
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceLt(String buildDevice){
        if(buildDevice!=null){
            lt("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * 小于等于 &lt;= buildDevice
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceLe(String buildDevice){
        if(buildDevice!=null){
            le("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * BETWEEN 值1 AND 值2
     * @param buildDeviceStart       值1
     * @param buildDeviceEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceBetween(String buildDeviceStart,String buildDeviceEnd){
        if(buildDeviceStart!=null && buildDeviceEnd!=null){
            between("build_device",buildDeviceStart,buildDeviceEnd);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildDeviceStart       值1
     * @param buildDeviceEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceNotBetween(String buildDeviceStart,String buildDeviceEnd){
        if(buildDeviceStart!=null && buildDeviceEnd!=null){
            notBetween("build_device",buildDeviceStart,buildDeviceEnd);
        }
        return this;
     }


    /**
     * <p>设备参数</p>
     * LIKE '%值%' buildDevice
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceLike(String buildDevice){
        if(buildDevice!=null){
            like("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * NOT LIKE '%值%' buildDevice
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceNotLike(String buildDevice){
        if(buildDevice!=null){
            notLike("build_device",buildDevice);
        }
        return this;
     }


    /**
     * <p>设备参数</p>
     * LIKE '%值' buildDevice
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceLikeLeft(String buildDevice){
        if(buildDevice!=null){
            likeLeft("build_device",buildDevice);
        }
        return this;
     }

    /**
     * <p>设备参数</p>
     * LIKE '值%' buildDevice
     * @param buildDevice       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceLikeRight(String buildDevice){
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
    public EmSocDevicesUpdateWrapper buildDeviceIsNull(){
        isNull("build_device");
        return this;
    }

    /**
     * <p>设备参数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceIsNotNull(){
        isNotNull("build_device");
        return this;
    }

    /**
     * <p>设备参数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDeviceIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildDeviceIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildDeviceNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildDeviceNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_device",values);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * 等于 = buildDisplay
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayEq(String buildDisplay){
        if(buildDisplay!=null){
            eq("build_display",buildDisplay);
        }
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * 不等于 &lt;&gt; buildDisplay
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayNe(String buildDisplay){
        if(buildDisplay!=null){
            ne("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 大于 &gt; buildDisplay
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayGt(String buildDisplay){
        if(buildDisplay!=null){
            gt("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 大于等于 &gt;= buildDisplay
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayGe(String buildDisplay){
        if(buildDisplay!=null){
            ge("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 小于 &lt; buildDisplay
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayLt(String buildDisplay){
        if(buildDisplay!=null){
            lt("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * 小于等于 &lt;= buildDisplay
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayLe(String buildDisplay){
        if(buildDisplay!=null){
            le("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * BETWEEN 值1 AND 值2
     * @param buildDisplayStart       值1
     * @param buildDisplayEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayBetween(String buildDisplayStart,String buildDisplayEnd){
        if(buildDisplayStart!=null && buildDisplayEnd!=null){
            between("build_display",buildDisplayStart,buildDisplayEnd);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildDisplayStart       值1
     * @param buildDisplayEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayNotBetween(String buildDisplayStart,String buildDisplayEnd){
        if(buildDisplayStart!=null && buildDisplayEnd!=null){
            notBetween("build_display",buildDisplayStart,buildDisplayEnd);
        }
        return this;
     }


    /**
     * <p>显示屏参数</p>
     * LIKE '%值%' buildDisplay
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayLike(String buildDisplay){
        if(buildDisplay!=null){
            like("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * NOT LIKE '%值%' buildDisplay
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayNotLike(String buildDisplay){
        if(buildDisplay!=null){
            notLike("build_display",buildDisplay);
        }
        return this;
     }


    /**
     * <p>显示屏参数</p>
     * LIKE '%值' buildDisplay
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayLikeLeft(String buildDisplay){
        if(buildDisplay!=null){
            likeLeft("build_display",buildDisplay);
        }
        return this;
     }

    /**
     * <p>显示屏参数</p>
     * LIKE '值%' buildDisplay
     * @param buildDisplay       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayLikeRight(String buildDisplay){
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
    public EmSocDevicesUpdateWrapper buildDisplayIsNull(){
        isNull("build_display");
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayIsNotNull(){
        isNotNull("build_display");
        return this;
    }

    /**
     * <p>显示屏参数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildDisplayIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildDisplayIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildDisplayNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildDisplayNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_display",values);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * 等于 = buildFingerprint
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintEq(String buildFingerprint){
        if(buildFingerprint!=null){
            eq("build_fingerprint",buildFingerprint);
        }
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * 不等于 &lt;&gt; buildFingerprint
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintNe(String buildFingerprint){
        if(buildFingerprint!=null){
            ne("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 大于 &gt; buildFingerprint
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintGt(String buildFingerprint){
        if(buildFingerprint!=null){
            gt("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 大于等于 &gt;= buildFingerprint
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintGe(String buildFingerprint){
        if(buildFingerprint!=null){
            ge("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 小于 &lt; buildFingerprint
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintLt(String buildFingerprint){
        if(buildFingerprint!=null){
            lt("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * 小于等于 &lt;= buildFingerprint
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintLe(String buildFingerprint){
        if(buildFingerprint!=null){
            le("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * BETWEEN 值1 AND 值2
     * @param buildFingerprintStart       值1
     * @param buildFingerprintEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintBetween(String buildFingerprintStart,String buildFingerprintEnd){
        if(buildFingerprintStart!=null && buildFingerprintEnd!=null){
            between("build_fingerprint",buildFingerprintStart,buildFingerprintEnd);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildFingerprintStart       值1
     * @param buildFingerprintEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintNotBetween(String buildFingerprintStart,String buildFingerprintEnd){
        if(buildFingerprintStart!=null && buildFingerprintEnd!=null){
            notBetween("build_fingerprint",buildFingerprintStart,buildFingerprintEnd);
        }
        return this;
     }


    /**
     * <p>唯一识别码</p>
     * LIKE '%值%' buildFingerprint
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintLike(String buildFingerprint){
        if(buildFingerprint!=null){
            like("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * NOT LIKE '%值%' buildFingerprint
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintNotLike(String buildFingerprint){
        if(buildFingerprint!=null){
            notLike("build_fingerprint",buildFingerprint);
        }
        return this;
     }


    /**
     * <p>唯一识别码</p>
     * LIKE '%值' buildFingerprint
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintLikeLeft(String buildFingerprint){
        if(buildFingerprint!=null){
            likeLeft("build_fingerprint",buildFingerprint);
        }
        return this;
     }

    /**
     * <p>唯一识别码</p>
     * LIKE '值%' buildFingerprint
     * @param buildFingerprint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintLikeRight(String buildFingerprint){
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
    public EmSocDevicesUpdateWrapper buildFingerprintIsNull(){
        isNull("build_fingerprint");
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintIsNotNull(){
        isNotNull("build_fingerprint");
        return this;
    }

    /**
     * <p>唯一识别码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildFingerprintIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildFingerprintIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildFingerprintNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildFingerprintNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_fingerprint",values);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * 等于 = buildHost
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostEq(String buildHost){
        if(buildHost!=null){
            eq("build_host",buildHost);
        }
        return this;
    }

    /**
     * <p>build_host</p>
     * 不等于 &lt;&gt; buildHost
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostNe(String buildHost){
        if(buildHost!=null){
            ne("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 大于 &gt; buildHost
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostGt(String buildHost){
        if(buildHost!=null){
            gt("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 大于等于 &gt;= buildHost
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostGe(String buildHost){
        if(buildHost!=null){
            ge("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 小于 &lt; buildHost
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostLt(String buildHost){
        if(buildHost!=null){
            lt("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * 小于等于 &lt;= buildHost
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostLe(String buildHost){
        if(buildHost!=null){
            le("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * BETWEEN 值1 AND 值2
     * @param buildHostStart       值1
     * @param buildHostEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostBetween(String buildHostStart,String buildHostEnd){
        if(buildHostStart!=null && buildHostEnd!=null){
            between("build_host",buildHostStart,buildHostEnd);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildHostStart       值1
     * @param buildHostEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostNotBetween(String buildHostStart,String buildHostEnd){
        if(buildHostStart!=null && buildHostEnd!=null){
            notBetween("build_host",buildHostStart,buildHostEnd);
        }
        return this;
     }


    /**
     * <p>build_host</p>
     * LIKE '%值%' buildHost
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostLike(String buildHost){
        if(buildHost!=null){
            like("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * NOT LIKE '%值%' buildHost
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostNotLike(String buildHost){
        if(buildHost!=null){
            notLike("build_host",buildHost);
        }
        return this;
     }


    /**
     * <p>build_host</p>
     * LIKE '%值' buildHost
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostLikeLeft(String buildHost){
        if(buildHost!=null){
            likeLeft("build_host",buildHost);
        }
        return this;
     }

    /**
     * <p>build_host</p>
     * LIKE '值%' buildHost
     * @param buildHost       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostLikeRight(String buildHost){
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
    public EmSocDevicesUpdateWrapper buildHostIsNull(){
        isNull("build_host");
        return this;
    }

    /**
     * <p>build_host</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostIsNotNull(){
        isNotNull("build_host");
        return this;
    }

    /**
     * <p>build_host</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHostIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildHostIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildHostNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildHostNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_host",values);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * 等于 = buildProduct
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductEq(String buildProduct){
        if(buildProduct!=null){
            eq("build_product",buildProduct);
        }
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * 不等于 &lt;&gt; buildProduct
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductNe(String buildProduct){
        if(buildProduct!=null){
            ne("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 大于 &gt; buildProduct
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductGt(String buildProduct){
        if(buildProduct!=null){
            gt("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 大于等于 &gt;= buildProduct
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductGe(String buildProduct){
        if(buildProduct!=null){
            ge("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 小于 &lt; buildProduct
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductLt(String buildProduct){
        if(buildProduct!=null){
            lt("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * 小于等于 &lt;= buildProduct
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductLe(String buildProduct){
        if(buildProduct!=null){
            le("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * BETWEEN 值1 AND 值2
     * @param buildProductStart       值1
     * @param buildProductEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductBetween(String buildProductStart,String buildProductEnd){
        if(buildProductStart!=null && buildProductEnd!=null){
            between("build_product",buildProductStart,buildProductEnd);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildProductStart       值1
     * @param buildProductEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductNotBetween(String buildProductStart,String buildProductEnd){
        if(buildProductStart!=null && buildProductEnd!=null){
            notBetween("build_product",buildProductStart,buildProductEnd);
        }
        return this;
     }


    /**
     * <p>整个产品的名称</p>
     * LIKE '%值%' buildProduct
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductLike(String buildProduct){
        if(buildProduct!=null){
            like("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * NOT LIKE '%值%' buildProduct
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductNotLike(String buildProduct){
        if(buildProduct!=null){
            notLike("build_product",buildProduct);
        }
        return this;
     }


    /**
     * <p>整个产品的名称</p>
     * LIKE '%值' buildProduct
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductLikeLeft(String buildProduct){
        if(buildProduct!=null){
            likeLeft("build_product",buildProduct);
        }
        return this;
     }

    /**
     * <p>整个产品的名称</p>
     * LIKE '值%' buildProduct
     * @param buildProduct       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductLikeRight(String buildProduct){
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
    public EmSocDevicesUpdateWrapper buildProductIsNull(){
        isNull("build_product");
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductIsNotNull(){
        isNotNull("build_product");
        return this;
    }

    /**
     * <p>整个产品的名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildProductIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildProductIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildProductNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildProductNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_product",values);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * 等于 = buildHardware
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareEq(String buildHardware){
        if(buildHardware!=null){
            eq("build_hardware",buildHardware);
        }
        return this;
    }

    /**
     * <p>硬件名称</p>
     * 不等于 &lt;&gt; buildHardware
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareNe(String buildHardware){
        if(buildHardware!=null){
            ne("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 大于 &gt; buildHardware
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareGt(String buildHardware){
        if(buildHardware!=null){
            gt("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 大于等于 &gt;= buildHardware
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareGe(String buildHardware){
        if(buildHardware!=null){
            ge("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 小于 &lt; buildHardware
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareLt(String buildHardware){
        if(buildHardware!=null){
            lt("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * 小于等于 &lt;= buildHardware
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareLe(String buildHardware){
        if(buildHardware!=null){
            le("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * BETWEEN 值1 AND 值2
     * @param buildHardwareStart       值1
     * @param buildHardwareEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareBetween(String buildHardwareStart,String buildHardwareEnd){
        if(buildHardwareStart!=null && buildHardwareEnd!=null){
            between("build_hardware",buildHardwareStart,buildHardwareEnd);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildHardwareStart       值1
     * @param buildHardwareEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareNotBetween(String buildHardwareStart,String buildHardwareEnd){
        if(buildHardwareStart!=null && buildHardwareEnd!=null){
            notBetween("build_hardware",buildHardwareStart,buildHardwareEnd);
        }
        return this;
     }


    /**
     * <p>硬件名称</p>
     * LIKE '%值%' buildHardware
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareLike(String buildHardware){
        if(buildHardware!=null){
            like("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * NOT LIKE '%值%' buildHardware
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareNotLike(String buildHardware){
        if(buildHardware!=null){
            notLike("build_hardware",buildHardware);
        }
        return this;
     }


    /**
     * <p>硬件名称</p>
     * LIKE '%值' buildHardware
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareLikeLeft(String buildHardware){
        if(buildHardware!=null){
            likeLeft("build_hardware",buildHardware);
        }
        return this;
     }

    /**
     * <p>硬件名称</p>
     * LIKE '值%' buildHardware
     * @param buildHardware       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareLikeRight(String buildHardware){
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
    public EmSocDevicesUpdateWrapper buildHardwareIsNull(){
        isNull("build_hardware");
        return this;
    }

    /**
     * <p>硬件名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareIsNotNull(){
        isNotNull("build_hardware");
        return this;
    }

    /**
     * <p>硬件名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildHardwareIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildHardwareIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildHardwareNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildHardwareNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_hardware",values);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * 等于 = buildSerial
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialEq(String buildSerial){
        if(buildSerial!=null){
            eq("build_serial",buildSerial);
        }
        return this;
    }

    /**
     * <p>硬件序列</p>
     * 不等于 &lt;&gt; buildSerial
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialNe(String buildSerial){
        if(buildSerial!=null){
            ne("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 大于 &gt; buildSerial
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialGt(String buildSerial){
        if(buildSerial!=null){
            gt("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 大于等于 &gt;= buildSerial
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialGe(String buildSerial){
        if(buildSerial!=null){
            ge("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 小于 &lt; buildSerial
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialLt(String buildSerial){
        if(buildSerial!=null){
            lt("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * 小于等于 &lt;= buildSerial
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialLe(String buildSerial){
        if(buildSerial!=null){
            le("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * BETWEEN 值1 AND 值2
     * @param buildSerialStart       值1
     * @param buildSerialEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialBetween(String buildSerialStart,String buildSerialEnd){
        if(buildSerialStart!=null && buildSerialEnd!=null){
            between("build_serial",buildSerialStart,buildSerialEnd);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildSerialStart       值1
     * @param buildSerialEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialNotBetween(String buildSerialStart,String buildSerialEnd){
        if(buildSerialStart!=null && buildSerialEnd!=null){
            notBetween("build_serial",buildSerialStart,buildSerialEnd);
        }
        return this;
     }


    /**
     * <p>硬件序列</p>
     * LIKE '%值%' buildSerial
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialLike(String buildSerial){
        if(buildSerial!=null){
            like("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * NOT LIKE '%值%' buildSerial
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialNotLike(String buildSerial){
        if(buildSerial!=null){
            notLike("build_serial",buildSerial);
        }
        return this;
     }


    /**
     * <p>硬件序列</p>
     * LIKE '%值' buildSerial
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialLikeLeft(String buildSerial){
        if(buildSerial!=null){
            likeLeft("build_serial",buildSerial);
        }
        return this;
     }

    /**
     * <p>硬件序列</p>
     * LIKE '值%' buildSerial
     * @param buildSerial       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialLikeRight(String buildSerial){
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
    public EmSocDevicesUpdateWrapper buildSerialIsNull(){
        isNull("build_serial");
        return this;
    }

    /**
     * <p>硬件序列</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialIsNotNull(){
        isNotNull("build_serial");
        return this;
    }

    /**
     * <p>硬件序列</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSerialIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildSerialIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildSerialNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildSerialNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_serial",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 等于 = buildSupportedAbis
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisEq(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            eq("build_supported_abis",buildSupportedAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt; buildSupportedAbis
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisNe(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            ne("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt; buildSupportedAbis
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisGt(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            gt("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;= buildSupportedAbis
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisGe(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            ge("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt; buildSupportedAbis
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisLt(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            lt("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;= buildSupportedAbis
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisLe(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            le("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN 值1 AND 值2
     * @param buildSupportedAbisStart       值1
     * @param buildSupportedAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisBetween(String buildSupportedAbisStart,String buildSupportedAbisEnd){
        if(buildSupportedAbisStart!=null && buildSupportedAbisEnd!=null){
            between("build_supported_abis",buildSupportedAbisStart,buildSupportedAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildSupportedAbisStart       值1
     * @param buildSupportedAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisNotBetween(String buildSupportedAbisStart,String buildSupportedAbisEnd){
        if(buildSupportedAbisStart!=null && buildSupportedAbisEnd!=null){
            notBetween("build_supported_abis",buildSupportedAbisStart,buildSupportedAbisEnd);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值%' buildSupportedAbis
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisLike(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            like("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%' buildSupportedAbis
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisNotLike(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            notLike("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值' buildSupportedAbis
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisLikeLeft(String buildSupportedAbis){
        if(buildSupportedAbis!=null){
            likeLeft("build_supported_abis",buildSupportedAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%' buildSupportedAbis
     * @param buildSupportedAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisLikeRight(String buildSupportedAbis){
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
    public EmSocDevicesUpdateWrapper buildSupportedAbisIsNull(){
        isNull("build_supported_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisIsNotNull(){
        isNotNull("build_supported_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupportedAbisIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildSupportedAbisIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildSupportedAbisNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildSupportedAbisNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_supported_abis",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 等于 = buildSupported32BitAbis
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisEq(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            eq("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt; buildSupported32BitAbis
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisNe(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            ne("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt; buildSupported32BitAbis
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisGt(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            gt("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;= buildSupported32BitAbis
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisGe(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            ge("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt; buildSupported32BitAbis
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisLt(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            lt("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;= buildSupported32BitAbis
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisLe(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            le("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN 值1 AND 值2
     * @param buildSupported32BitAbisStart       值1
     * @param buildSupported32BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisBetween(String buildSupported32BitAbisStart,String buildSupported32BitAbisEnd){
        if(buildSupported32BitAbisStart!=null && buildSupported32BitAbisEnd!=null){
            between("build_supported_32_bit_abis",buildSupported32BitAbisStart,buildSupported32BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildSupported32BitAbisStart       值1
     * @param buildSupported32BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisNotBetween(String buildSupported32BitAbisStart,String buildSupported32BitAbisEnd){
        if(buildSupported32BitAbisStart!=null && buildSupported32BitAbisEnd!=null){
            notBetween("build_supported_32_bit_abis",buildSupported32BitAbisStart,buildSupported32BitAbisEnd);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值%' buildSupported32BitAbis
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisLike(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            like("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%' buildSupported32BitAbis
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisNotLike(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            notLike("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值' buildSupported32BitAbis
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisLikeLeft(String buildSupported32BitAbis){
        if(buildSupported32BitAbis!=null){
            likeLeft("build_supported_32_bit_abis",buildSupported32BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%' buildSupported32BitAbis
     * @param buildSupported32BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisLikeRight(String buildSupported32BitAbis){
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
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisIsNull(){
        isNull("build_supported_32_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisIsNotNull(){
        isNotNull("build_supported_32_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildSupported32BitAbisNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_supported_32_bit_abis",values);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 等于 = buildSupported64BitAbis
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisEq(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            eq("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * 不等于 &lt;&gt; buildSupported64BitAbis
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisNe(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            ne("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于 &gt; buildSupported64BitAbis
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisGt(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            gt("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 大于等于 &gt;= buildSupported64BitAbis
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisGe(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            ge("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于 &lt; buildSupported64BitAbis
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisLt(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            lt("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * 小于等于 &lt;= buildSupported64BitAbis
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisLe(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            le("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * BETWEEN 值1 AND 值2
     * @param buildSupported64BitAbisStart       值1
     * @param buildSupported64BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisBetween(String buildSupported64BitAbisStart,String buildSupported64BitAbisEnd){
        if(buildSupported64BitAbisStart!=null && buildSupported64BitAbisEnd!=null){
            between("build_supported_64_bit_abis",buildSupported64BitAbisStart,buildSupported64BitAbisEnd);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildSupported64BitAbisStart       值1
     * @param buildSupported64BitAbisEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisNotBetween(String buildSupported64BitAbisStart,String buildSupported64BitAbisEnd){
        if(buildSupported64BitAbisStart!=null && buildSupported64BitAbisEnd!=null){
            notBetween("build_supported_64_bit_abis",buildSupported64BitAbisStart,buildSupported64BitAbisEnd);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值%' buildSupported64BitAbis
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisLike(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            like("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * NOT LIKE '%值%' buildSupported64BitAbis
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisNotLike(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            notLike("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }


    /**
     * <p>cpu指令集</p>
     * LIKE '%值' buildSupported64BitAbis
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisLikeLeft(String buildSupported64BitAbis){
        if(buildSupported64BitAbis!=null){
            likeLeft("build_supported_64_bit_abis",buildSupported64BitAbis);
        }
        return this;
     }

    /**
     * <p>cpu指令集</p>
     * LIKE '值%' buildSupported64BitAbis
     * @param buildSupported64BitAbis       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisLikeRight(String buildSupported64BitAbis){
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
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisIsNull(){
        isNull("build_supported_64_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisIsNotNull(){
        isNotNull("build_supported_64_bit_abis");
        return this;
    }

    /**
     * <p>cpu指令集</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildSupported64BitAbisNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_supported_64_bit_abis",values);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * 等于 = buildVersionIncremental
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalEq(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            eq("build_version_incremental",buildVersionIncremental);
        }
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * 不等于 &lt;&gt; buildVersionIncremental
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalNe(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            ne("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 大于 &gt; buildVersionIncremental
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalGt(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            gt("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 大于等于 &gt;= buildVersionIncremental
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalGe(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            ge("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 小于 &lt; buildVersionIncremental
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalLt(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            lt("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * 小于等于 &lt;= buildVersionIncremental
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalLe(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            le("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * BETWEEN 值1 AND 值2
     * @param buildVersionIncrementalStart       值1
     * @param buildVersionIncrementalEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalBetween(String buildVersionIncrementalStart,String buildVersionIncrementalEnd){
        if(buildVersionIncrementalStart!=null && buildVersionIncrementalEnd!=null){
            between("build_version_incremental",buildVersionIncrementalStart,buildVersionIncrementalEnd);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildVersionIncrementalStart       值1
     * @param buildVersionIncrementalEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalNotBetween(String buildVersionIncrementalStart,String buildVersionIncrementalEnd){
        if(buildVersionIncrementalStart!=null && buildVersionIncrementalEnd!=null){
            notBetween("build_version_incremental",buildVersionIncrementalStart,buildVersionIncrementalEnd);
        }
        return this;
     }


    /**
     * <p>build_version_incremental</p>
     * LIKE '%值%' buildVersionIncremental
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalLike(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            like("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * NOT LIKE '%值%' buildVersionIncremental
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalNotLike(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            notLike("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }


    /**
     * <p>build_version_incremental</p>
     * LIKE '%值' buildVersionIncremental
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalLikeLeft(String buildVersionIncremental){
        if(buildVersionIncremental!=null){
            likeLeft("build_version_incremental",buildVersionIncremental);
        }
        return this;
     }

    /**
     * <p>build_version_incremental</p>
     * LIKE '值%' buildVersionIncremental
     * @param buildVersionIncremental       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalLikeRight(String buildVersionIncremental){
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
    public EmSocDevicesUpdateWrapper buildVersionIncrementalIsNull(){
        isNull("build_version_incremental");
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalIsNotNull(){
        isNotNull("build_version_incremental");
        return this;
    }

    /**
     * <p>build_version_incremental</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionIncrementalIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildVersionIncrementalIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildVersionIncrementalNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildVersionIncrementalNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_incremental",values);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 等于 = buildVersionRelease
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseEq(String buildVersionRelease){
        if(buildVersionRelease!=null){
            eq("build_version_release",buildVersionRelease);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 不等于 &lt;&gt; buildVersionRelease
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseNe(String buildVersionRelease){
        if(buildVersionRelease!=null){
            ne("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于 &gt; buildVersionRelease
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseGt(String buildVersionRelease){
        if(buildVersionRelease!=null){
            gt("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于等于 &gt;= buildVersionRelease
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseGe(String buildVersionRelease){
        if(buildVersionRelease!=null){
            ge("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于 &lt; buildVersionRelease
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseLt(String buildVersionRelease){
        if(buildVersionRelease!=null){
            lt("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于等于 &lt;= buildVersionRelease
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseLe(String buildVersionRelease){
        if(buildVersionRelease!=null){
            le("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * BETWEEN 值1 AND 值2
     * @param buildVersionReleaseStart       值1
     * @param buildVersionReleaseEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseBetween(String buildVersionReleaseStart,String buildVersionReleaseEnd){
        if(buildVersionReleaseStart!=null && buildVersionReleaseEnd!=null){
            between("build_version_release",buildVersionReleaseStart,buildVersionReleaseEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildVersionReleaseStart       值1
     * @param buildVersionReleaseEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseNotBetween(String buildVersionReleaseStart,String buildVersionReleaseEnd){
        if(buildVersionReleaseStart!=null && buildVersionReleaseEnd!=null){
            notBetween("build_version_release",buildVersionReleaseStart,buildVersionReleaseEnd);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值%' buildVersionRelease
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseLike(String buildVersionRelease){
        if(buildVersionRelease!=null){
            like("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT LIKE '%值%' buildVersionRelease
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseNotLike(String buildVersionRelease){
        if(buildVersionRelease!=null){
            notLike("build_version_release",buildVersionRelease);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值' buildVersionRelease
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseLikeLeft(String buildVersionRelease){
        if(buildVersionRelease!=null){
            likeLeft("build_version_release",buildVersionRelease);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * LIKE '值%' buildVersionRelease
     * @param buildVersionRelease       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseLikeRight(String buildVersionRelease){
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
    public EmSocDevicesUpdateWrapper buildVersionReleaseIsNull(){
        isNull("build_version_release");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseIsNotNull(){
        isNotNull("build_version_release");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionReleaseIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildVersionReleaseIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildVersionReleaseNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildVersionReleaseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_release",values);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * 等于 = buildVersionSdk
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkEq(String buildVersionSdk){
        if(buildVersionSdk!=null){
            eq("build_version_sdk",buildVersionSdk);
        }
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * 不等于 &lt;&gt; buildVersionSdk
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkNe(String buildVersionSdk){
        if(buildVersionSdk!=null){
            ne("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 大于 &gt; buildVersionSdk
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkGt(String buildVersionSdk){
        if(buildVersionSdk!=null){
            gt("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 大于等于 &gt;= buildVersionSdk
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkGe(String buildVersionSdk){
        if(buildVersionSdk!=null){
            ge("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 小于 &lt; buildVersionSdk
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkLt(String buildVersionSdk){
        if(buildVersionSdk!=null){
            lt("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * 小于等于 &lt;= buildVersionSdk
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkLe(String buildVersionSdk){
        if(buildVersionSdk!=null){
            le("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * BETWEEN 值1 AND 值2
     * @param buildVersionSdkStart       值1
     * @param buildVersionSdkEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkBetween(String buildVersionSdkStart,String buildVersionSdkEnd){
        if(buildVersionSdkStart!=null && buildVersionSdkEnd!=null){
            between("build_version_sdk",buildVersionSdkStart,buildVersionSdkEnd);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildVersionSdkStart       值1
     * @param buildVersionSdkEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkNotBetween(String buildVersionSdkStart,String buildVersionSdkEnd){
        if(buildVersionSdkStart!=null && buildVersionSdkEnd!=null){
            notBetween("build_version_sdk",buildVersionSdkStart,buildVersionSdkEnd);
        }
        return this;
     }


    /**
     * <p>build_version_sdk</p>
     * LIKE '%值%' buildVersionSdk
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkLike(String buildVersionSdk){
        if(buildVersionSdk!=null){
            like("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * NOT LIKE '%值%' buildVersionSdk
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkNotLike(String buildVersionSdk){
        if(buildVersionSdk!=null){
            notLike("build_version_sdk",buildVersionSdk);
        }
        return this;
     }


    /**
     * <p>build_version_sdk</p>
     * LIKE '%值' buildVersionSdk
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkLikeLeft(String buildVersionSdk){
        if(buildVersionSdk!=null){
            likeLeft("build_version_sdk",buildVersionSdk);
        }
        return this;
     }

    /**
     * <p>build_version_sdk</p>
     * LIKE '值%' buildVersionSdk
     * @param buildVersionSdk       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkLikeRight(String buildVersionSdk){
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
    public EmSocDevicesUpdateWrapper buildVersionSdkIsNull(){
        isNull("build_version_sdk");
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkIsNotNull(){
        isNotNull("build_version_sdk");
        return this;
    }

    /**
     * <p>build_version_sdk</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildVersionSdkIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildVersionSdkNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildVersionSdkNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_sdk",values);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * 等于 = buildVersionSdkint
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintEq(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            eq("build_version_sdkint",buildVersionSdkint);
        }
        return this;
    }

    /**
     * <p>SDK版本</p>
     * 不等于 &lt;&gt; buildVersionSdkint
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintNe(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            ne("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 大于 &gt; buildVersionSdkint
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintGt(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            gt("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 大于等于 &gt;= buildVersionSdkint
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintGe(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            ge("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 小于 &lt; buildVersionSdkint
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintLt(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            lt("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * 小于等于 &lt;= buildVersionSdkint
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintLe(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            le("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * BETWEEN 值1 AND 值2
     * @param buildVersionSdkintStart       值1
     * @param buildVersionSdkintEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintBetween(String buildVersionSdkintStart,String buildVersionSdkintEnd){
        if(buildVersionSdkintStart!=null && buildVersionSdkintEnd!=null){
            between("build_version_sdkint",buildVersionSdkintStart,buildVersionSdkintEnd);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildVersionSdkintStart       值1
     * @param buildVersionSdkintEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintNotBetween(String buildVersionSdkintStart,String buildVersionSdkintEnd){
        if(buildVersionSdkintStart!=null && buildVersionSdkintEnd!=null){
            notBetween("build_version_sdkint",buildVersionSdkintStart,buildVersionSdkintEnd);
        }
        return this;
     }


    /**
     * <p>SDK版本</p>
     * LIKE '%值%' buildVersionSdkint
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintLike(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            like("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * NOT LIKE '%值%' buildVersionSdkint
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintNotLike(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            notLike("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }


    /**
     * <p>SDK版本</p>
     * LIKE '%值' buildVersionSdkint
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintLikeLeft(String buildVersionSdkint){
        if(buildVersionSdkint!=null){
            likeLeft("build_version_sdkint",buildVersionSdkint);
        }
        return this;
     }

    /**
     * <p>SDK版本</p>
     * LIKE '值%' buildVersionSdkint
     * @param buildVersionSdkint       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintLikeRight(String buildVersionSdkint){
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
    public EmSocDevicesUpdateWrapper buildVersionSdkintIsNull(){
        isNull("build_version_sdkint");
        return this;
    }

    /**
     * <p>SDK版本</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintIsNotNull(){
        isNotNull("build_version_sdkint");
        return this;
    }

    /**
     * <p>SDK版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionSdkintIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildVersionSdkintIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildVersionSdkintNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildVersionSdkintNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_sdkint",values);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * 等于 = buildVersionCodename
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameEq(String buildVersionCodename){
        if(buildVersionCodename!=null){
            eq("build_version_codename",buildVersionCodename);
        }
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * 不等于 &lt;&gt; buildVersionCodename
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameNe(String buildVersionCodename){
        if(buildVersionCodename!=null){
            ne("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 大于 &gt; buildVersionCodename
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameGt(String buildVersionCodename){
        if(buildVersionCodename!=null){
            gt("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 大于等于 &gt;= buildVersionCodename
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameGe(String buildVersionCodename){
        if(buildVersionCodename!=null){
            ge("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 小于 &lt; buildVersionCodename
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameLt(String buildVersionCodename){
        if(buildVersionCodename!=null){
            lt("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * 小于等于 &lt;= buildVersionCodename
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameLe(String buildVersionCodename){
        if(buildVersionCodename!=null){
            le("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * BETWEEN 值1 AND 值2
     * @param buildVersionCodenameStart       值1
     * @param buildVersionCodenameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameBetween(String buildVersionCodenameStart,String buildVersionCodenameEnd){
        if(buildVersionCodenameStart!=null && buildVersionCodenameEnd!=null){
            between("build_version_codename",buildVersionCodenameStart,buildVersionCodenameEnd);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildVersionCodenameStart       值1
     * @param buildVersionCodenameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameNotBetween(String buildVersionCodenameStart,String buildVersionCodenameEnd){
        if(buildVersionCodenameStart!=null && buildVersionCodenameEnd!=null){
            notBetween("build_version_codename",buildVersionCodenameStart,buildVersionCodenameEnd);
        }
        return this;
     }


    /**
     * <p>build_version_codename</p>
     * LIKE '%值%' buildVersionCodename
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameLike(String buildVersionCodename){
        if(buildVersionCodename!=null){
            like("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * NOT LIKE '%值%' buildVersionCodename
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameNotLike(String buildVersionCodename){
        if(buildVersionCodename!=null){
            notLike("build_version_codename",buildVersionCodename);
        }
        return this;
     }


    /**
     * <p>build_version_codename</p>
     * LIKE '%值' buildVersionCodename
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameLikeLeft(String buildVersionCodename){
        if(buildVersionCodename!=null){
            likeLeft("build_version_codename",buildVersionCodename);
        }
        return this;
     }

    /**
     * <p>build_version_codename</p>
     * LIKE '值%' buildVersionCodename
     * @param buildVersionCodename       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameLikeRight(String buildVersionCodename){
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
    public EmSocDevicesUpdateWrapper buildVersionCodenameIsNull(){
        isNull("build_version_codename");
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameIsNotNull(){
        isNotNull("build_version_codename");
        return this;
    }

    /**
     * <p>build_version_codename</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildVersionCodenameIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildVersionCodenameIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildVersionCodenameNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildVersionCodenameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_version_codename",values);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * 等于 = buildType
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeEq(String buildType){
        if(buildType!=null){
            eq("build_type",buildType);
        }
        return this;
    }

    /**
     * <p>build_type</p>
     * 不等于 &lt;&gt; buildType
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeNe(String buildType){
        if(buildType!=null){
            ne("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 大于 &gt; buildType
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeGt(String buildType){
        if(buildType!=null){
            gt("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 大于等于 &gt;= buildType
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeGe(String buildType){
        if(buildType!=null){
            ge("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 小于 &lt; buildType
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeLt(String buildType){
        if(buildType!=null){
            lt("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * 小于等于 &lt;= buildType
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeLe(String buildType){
        if(buildType!=null){
            le("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * BETWEEN 值1 AND 值2
     * @param buildTypeStart       值1
     * @param buildTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeBetween(String buildTypeStart,String buildTypeEnd){
        if(buildTypeStart!=null && buildTypeEnd!=null){
            between("build_type",buildTypeStart,buildTypeEnd);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildTypeStart       值1
     * @param buildTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeNotBetween(String buildTypeStart,String buildTypeEnd){
        if(buildTypeStart!=null && buildTypeEnd!=null){
            notBetween("build_type",buildTypeStart,buildTypeEnd);
        }
        return this;
     }


    /**
     * <p>build_type</p>
     * LIKE '%值%' buildType
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeLike(String buildType){
        if(buildType!=null){
            like("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * NOT LIKE '%值%' buildType
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeNotLike(String buildType){
        if(buildType!=null){
            notLike("build_type",buildType);
        }
        return this;
     }


    /**
     * <p>build_type</p>
     * LIKE '%值' buildType
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeLikeLeft(String buildType){
        if(buildType!=null){
            likeLeft("build_type",buildType);
        }
        return this;
     }

    /**
     * <p>build_type</p>
     * LIKE '值%' buildType
     * @param buildType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeLikeRight(String buildType){
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
    public EmSocDevicesUpdateWrapper buildTypeIsNull(){
        isNull("build_type");
        return this;
    }

    /**
     * <p>build_type</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeIsNotNull(){
        isNotNull("build_type");
        return this;
    }

    /**
     * <p>build_type</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildTypeIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildTypeIn(String... values){
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
    public EmSocDevicesUpdateWrapper buildTypeNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper buildTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("build_type",values);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * 等于 = buildApiLevel
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelEq(Integer buildApiLevel){
        if(buildApiLevel!=null){
            eq("build_api_level",buildApiLevel);
        }
        return this;
    }

    /**
     * <p>build_api_level</p>
     * 不等于 &lt;&gt; buildApiLevel
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelNe(Integer buildApiLevel){
        if(buildApiLevel!=null){
            ne("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 大于 &gt; buildApiLevel
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelGt(Integer buildApiLevel){
        if(buildApiLevel!=null){
            gt("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 大于等于 &gt;= buildApiLevel
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelGe(Integer buildApiLevel){
        if(buildApiLevel!=null){
            ge("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 小于 &lt; buildApiLevel
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelLt(Integer buildApiLevel){
        if(buildApiLevel!=null){
            lt("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * 小于等于 &lt;= buildApiLevel
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelLe(Integer buildApiLevel){
        if(buildApiLevel!=null){
            le("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * BETWEEN 值1 AND 值2
     * @param buildApiLevelStart       值1
     * @param buildApiLevelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelBetween(Integer buildApiLevelStart,Integer buildApiLevelEnd){
        if(buildApiLevelStart!=null && buildApiLevelEnd!=null){
            between("build_api_level",buildApiLevelStart,buildApiLevelEnd);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buildApiLevelStart       值1
     * @param buildApiLevelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelNotBetween(Integer buildApiLevelStart,Integer buildApiLevelEnd){
        if(buildApiLevelStart!=null && buildApiLevelEnd!=null){
            notBetween("build_api_level",buildApiLevelStart,buildApiLevelEnd);
        }
        return this;
     }


    /**
     * <p>build_api_level</p>
     * LIKE '%值%' buildApiLevel
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelLike(Integer buildApiLevel){
        if(buildApiLevel!=null){
            like("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * NOT LIKE '%值%' buildApiLevel
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelNotLike(Integer buildApiLevel){
        if(buildApiLevel!=null){
            notLike("build_api_level",buildApiLevel);
        }
        return this;
     }


    /**
     * <p>build_api_level</p>
     * LIKE '%值' buildApiLevel
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelLikeLeft(Integer buildApiLevel){
        if(buildApiLevel!=null){
            likeLeft("build_api_level",buildApiLevel);
        }
        return this;
     }

    /**
     * <p>build_api_level</p>
     * LIKE '值%' buildApiLevel
     * @param buildApiLevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelLikeRight(Integer buildApiLevel){
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
    public EmSocDevicesUpdateWrapper buildApiLevelIsNull(){
        isNull("build_api_level");
        return this;
    }

    /**
     * <p>build_api_level</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelIsNotNull(){
        isNotNull("build_api_level");
        return this;
    }

    /**
     * <p>build_api_level</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper buildApiLevelIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper buildApiLevelIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper buildApiLevelNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper buildApiLevelNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("build_api_level",values);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 等于 = andoridId
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdEq(String andoridId){
        if(andoridId!=null){
            eq("andorid_id",andoridId);
        }
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 不等于 &lt;&gt; andoridId
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdNe(String andoridId){
        if(andoridId!=null){
            ne("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 大于 &gt; andoridId
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdGt(String andoridId){
        if(andoridId!=null){
            gt("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 大于等于 &gt;= andoridId
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdGe(String andoridId){
        if(andoridId!=null){
            ge("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 小于 &lt; andoridId
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdLt(String andoridId){
        if(andoridId!=null){
            lt("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * 小于等于 &lt;= andoridId
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdLe(String andoridId){
        if(andoridId!=null){
            le("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * BETWEEN 值1 AND 值2
     * @param andoridIdStart       值1
     * @param andoridIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdBetween(String andoridIdStart,String andoridIdEnd){
        if(andoridIdStart!=null && andoridIdEnd!=null){
            between("andorid_id",andoridIdStart,andoridIdEnd);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT BETWEEN 值1 AND 值2
     * @param andoridIdStart       值1
     * @param andoridIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdNotBetween(String andoridIdStart,String andoridIdEnd){
        if(andoridIdStart!=null && andoridIdEnd!=null){
            notBetween("andorid_id",andoridIdStart,andoridIdEnd);
        }
        return this;
     }


    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '%值%' andoridId
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdLike(String andoridId){
        if(andoridId!=null){
            like("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * NOT LIKE '%值%' andoridId
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdNotLike(String andoridId){
        if(andoridId!=null){
            notLike("andorid_id",andoridId);
        }
        return this;
     }


    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '%值' andoridId
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdLikeLeft(String andoridId){
        if(andoridId!=null){
            likeLeft("andorid_id",andoridId);
        }
        return this;
     }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * LIKE '值%' andoridId
     * @param andoridId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdLikeRight(String andoridId){
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
    public EmSocDevicesUpdateWrapper andoridIdIsNull(){
        isNull("andorid_id");
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdIsNotNull(){
        isNotNull("andorid_id");
        return this;
    }

    /**
     * <p>Android系统第一次启动时产生的一个64bit数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper andoridIdIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper andoridIdIn(String... values){
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
    public EmSocDevicesUpdateWrapper andoridIdNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper andoridIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("andorid_id",values);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * 等于 = osArch
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchEq(String osArch){
        if(osArch!=null){
            eq("os_arch",osArch);
        }
        return this;
    }

    /**
     * <p>os_arch</p>
     * 不等于 &lt;&gt; osArch
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchNe(String osArch){
        if(osArch!=null){
            ne("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 大于 &gt; osArch
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchGt(String osArch){
        if(osArch!=null){
            gt("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 大于等于 &gt;= osArch
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchGe(String osArch){
        if(osArch!=null){
            ge("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 小于 &lt; osArch
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchLt(String osArch){
        if(osArch!=null){
            lt("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * 小于等于 &lt;= osArch
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchLe(String osArch){
        if(osArch!=null){
            le("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * BETWEEN 值1 AND 值2
     * @param osArchStart       值1
     * @param osArchEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchBetween(String osArchStart,String osArchEnd){
        if(osArchStart!=null && osArchEnd!=null){
            between("os_arch",osArchStart,osArchEnd);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * NOT BETWEEN 值1 AND 值2
     * @param osArchStart       值1
     * @param osArchEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchNotBetween(String osArchStart,String osArchEnd){
        if(osArchStart!=null && osArchEnd!=null){
            notBetween("os_arch",osArchStart,osArchEnd);
        }
        return this;
     }


    /**
     * <p>os_arch</p>
     * LIKE '%值%' osArch
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchLike(String osArch){
        if(osArch!=null){
            like("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * NOT LIKE '%值%' osArch
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchNotLike(String osArch){
        if(osArch!=null){
            notLike("os_arch",osArch);
        }
        return this;
     }


    /**
     * <p>os_arch</p>
     * LIKE '%值' osArch
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchLikeLeft(String osArch){
        if(osArch!=null){
            likeLeft("os_arch",osArch);
        }
        return this;
     }

    /**
     * <p>os_arch</p>
     * LIKE '值%' osArch
     * @param osArch       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchLikeRight(String osArch){
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
    public EmSocDevicesUpdateWrapper osArchIsNull(){
        isNull("os_arch");
        return this;
    }

    /**
     * <p>os_arch</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchIsNotNull(){
        isNotNull("os_arch");
        return this;
    }

    /**
     * <p>os_arch</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper osArchIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper osArchIn(String... values){
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
    public EmSocDevicesUpdateWrapper osArchNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper osArchNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os_arch",values);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 等于 = phoneType
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeEq(String phoneType){
        if(phoneType!=null){
            eq("phone_type",phoneType);
        }
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 不等于 &lt;&gt; phoneType
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeNe(String phoneType){
        if(phoneType!=null){
            ne("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 大于 &gt; phoneType
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeGt(String phoneType){
        if(phoneType!=null){
            gt("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 大于等于 &gt;= phoneType
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeGe(String phoneType){
        if(phoneType!=null){
            ge("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 小于 &lt; phoneType
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeLt(String phoneType){
        if(phoneType!=null){
            lt("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * 小于等于 &lt;= phoneType
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeLe(String phoneType){
        if(phoneType!=null){
            le("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * BETWEEN 值1 AND 值2
     * @param phoneTypeStart       值1
     * @param phoneTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeBetween(String phoneTypeStart,String phoneTypeEnd){
        if(phoneTypeStart!=null && phoneTypeEnd!=null){
            between("phone_type",phoneTypeStart,phoneTypeEnd);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param phoneTypeStart       值1
     * @param phoneTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeNotBetween(String phoneTypeStart,String phoneTypeEnd){
        if(phoneTypeStart!=null && phoneTypeEnd!=null){
            notBetween("phone_type",phoneTypeStart,phoneTypeEnd);
        }
        return this;
     }


    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '%值%' phoneType
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeLike(String phoneType){
        if(phoneType!=null){
            like("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * NOT LIKE '%值%' phoneType
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeNotLike(String phoneType){
        if(phoneType!=null){
            notLike("phone_type",phoneType);
        }
        return this;
     }


    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '%值' phoneType
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeLikeLeft(String phoneType){
        if(phoneType!=null){
            likeLeft("phone_type",phoneType);
        }
        return this;
     }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * LIKE '值%' phoneType
     * @param phoneType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeLikeRight(String phoneType){
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
    public EmSocDevicesUpdateWrapper phoneTypeIsNull(){
        isNull("phone_type");
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeIsNotNull(){
        isNotNull("phone_type");
        return this;
    }

    /**
     * <p>手机的网络制式(GSM,CDMA)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper phoneTypeIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper phoneTypeIn(String... values){
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
    public EmSocDevicesUpdateWrapper phoneTypeNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper phoneTypeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_type",values);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * 等于 = osVersion
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionEq(String osVersion){
        if(osVersion!=null){
            eq("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>os_version</p>
     * 不等于 &lt;&gt; osVersion
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionNe(String osVersion){
        if(osVersion!=null){
            ne("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 大于 &gt; osVersion
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionGt(String osVersion){
        if(osVersion!=null){
            gt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 大于等于 &gt;= osVersion
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionGe(String osVersion){
        if(osVersion!=null){
            ge("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 小于 &lt; osVersion
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionLt(String osVersion){
        if(osVersion!=null){
            lt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * 小于等于 &lt;= osVersion
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionLe(String osVersion){
        if(osVersion!=null){
            le("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * BETWEEN 值1 AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionBetween(String osVersionStart,String osVersionEnd){
        if(osVersionStart!=null && osVersionEnd!=null){
            between("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * NOT BETWEEN 值1 AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionNotBetween(String osVersionStart,String osVersionEnd){
        if(osVersionStart!=null && osVersionEnd!=null){
            notBetween("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }


    /**
     * <p>os_version</p>
     * LIKE '%值%' osVersion
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionLike(String osVersion){
        if(osVersion!=null){
            like("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * NOT LIKE '%值%' osVersion
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionNotLike(String osVersion){
        if(osVersion!=null){
            notLike("os_version",osVersion);
        }
        return this;
     }


    /**
     * <p>os_version</p>
     * LIKE '%值' osVersion
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionLikeLeft(String osVersion){
        if(osVersion!=null){
            likeLeft("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>os_version</p>
     * LIKE '值%' osVersion
     * @param osVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionLikeRight(String osVersion){
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
    public EmSocDevicesUpdateWrapper osVersionIsNull(){
        isNull("os_version");
        return this;
    }

    /**
     * <p>os_version</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionIsNotNull(){
        isNotNull("os_version");
        return this;
    }

    /**
     * <p>os_version</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper osVersionIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper osVersionIn(String... values){
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
    public EmSocDevicesUpdateWrapper osVersionNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper osVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os_version",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * 等于 = simSerialNumber
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberEq(String simSerialNumber){
        if(simSerialNumber!=null){
            eq("sim_serial_number",simSerialNumber);
        }
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * 不等于 &lt;&gt; simSerialNumber
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberNe(String simSerialNumber){
        if(simSerialNumber!=null){
            ne("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 大于 &gt; simSerialNumber
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberGt(String simSerialNumber){
        if(simSerialNumber!=null){
            gt("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 大于等于 &gt;= simSerialNumber
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberGe(String simSerialNumber){
        if(simSerialNumber!=null){
            ge("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 小于 &lt; simSerialNumber
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberLt(String simSerialNumber){
        if(simSerialNumber!=null){
            lt("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * 小于等于 &lt;= simSerialNumber
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberLe(String simSerialNumber){
        if(simSerialNumber!=null){
            le("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * BETWEEN 值1 AND 值2
     * @param simSerialNumberStart       值1
     * @param simSerialNumberEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberBetween(String simSerialNumberStart,String simSerialNumberEnd){
        if(simSerialNumberStart!=null && simSerialNumberEnd!=null){
            between("sim_serial_number",simSerialNumberStart,simSerialNumberEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param simSerialNumberStart       值1
     * @param simSerialNumberEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberNotBetween(String simSerialNumberStart,String simSerialNumberEnd){
        if(simSerialNumberStart!=null && simSerialNumberEnd!=null){
            notBetween("sim_serial_number",simSerialNumberStart,simSerialNumberEnd);
        }
        return this;
     }


    /**
     * <p>SIM卡的序列号</p>
     * LIKE '%值%' simSerialNumber
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberLike(String simSerialNumber){
        if(simSerialNumber!=null){
            like("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * NOT LIKE '%值%' simSerialNumber
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberNotLike(String simSerialNumber){
        if(simSerialNumber!=null){
            notLike("sim_serial_number",simSerialNumber);
        }
        return this;
     }


    /**
     * <p>SIM卡的序列号</p>
     * LIKE '%值' simSerialNumber
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberLikeLeft(String simSerialNumber){
        if(simSerialNumber!=null){
            likeLeft("sim_serial_number",simSerialNumber);
        }
        return this;
     }

    /**
     * <p>SIM卡的序列号</p>
     * LIKE '值%' simSerialNumber
     * @param simSerialNumber       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberLikeRight(String simSerialNumber){
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
    public EmSocDevicesUpdateWrapper simSerialNumberIsNull(){
        isNull("sim_serial_number");
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberIsNotNull(){
        isNotNull("sim_serial_number");
        return this;
    }

    /**
     * <p>SIM卡的序列号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper simSerialNumberIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper simSerialNumberIn(String... values){
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
    public EmSocDevicesUpdateWrapper simSerialNumberNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper simSerialNumberNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("sim_serial_number",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * 等于 = networkOperator
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorEq(String networkOperator){
        if(networkOperator!=null){
            eq("network_operator",networkOperator);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * 不等于 &lt;&gt; networkOperator
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNe(String networkOperator){
        if(networkOperator!=null){
            ne("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 大于 &gt; networkOperator
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorGt(String networkOperator){
        if(networkOperator!=null){
            gt("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 大于等于 &gt;= networkOperator
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorGe(String networkOperator){
        if(networkOperator!=null){
            ge("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 小于 &lt; networkOperator
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorLt(String networkOperator){
        if(networkOperator!=null){
            lt("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * 小于等于 &lt;= networkOperator
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorLe(String networkOperator){
        if(networkOperator!=null){
            le("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * BETWEEN 值1 AND 值2
     * @param networkOperatorStart       值1
     * @param networkOperatorEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorBetween(String networkOperatorStart,String networkOperatorEnd){
        if(networkOperatorStart!=null && networkOperatorEnd!=null){
            between("network_operator",networkOperatorStart,networkOperatorEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * NOT BETWEEN 值1 AND 值2
     * @param networkOperatorStart       值1
     * @param networkOperatorEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNotBetween(String networkOperatorStart,String networkOperatorEnd){
        if(networkOperatorStart!=null && networkOperatorEnd!=null){
            notBetween("network_operator",networkOperatorStart,networkOperatorEnd);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商</p>
     * LIKE '%值%' networkOperator
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorLike(String networkOperator){
        if(networkOperator!=null){
            like("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * NOT LIKE '%值%' networkOperator
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNotLike(String networkOperator){
        if(networkOperator!=null){
            notLike("network_operator",networkOperator);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商</p>
     * LIKE '%值' networkOperator
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorLikeLeft(String networkOperator){
        if(networkOperator!=null){
            likeLeft("network_operator",networkOperator);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商</p>
     * LIKE '值%' networkOperator
     * @param networkOperator       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorLikeRight(String networkOperator){
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
    public EmSocDevicesUpdateWrapper networkOperatorIsNull(){
        isNull("network_operator");
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorIsNotNull(){
        isNotNull("network_operator");
        return this;
    }

    /**
     * <p>SIM卡的运营商</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper networkOperatorIn(String... values){
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
    public EmSocDevicesUpdateWrapper networkOperatorNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper networkOperatorNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("network_operator",values);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * 等于 = networkOperatorName
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameEq(String networkOperatorName){
        if(networkOperatorName!=null){
            eq("network_operator_name",networkOperatorName);
        }
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * 不等于 &lt;&gt; networkOperatorName
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameNe(String networkOperatorName){
        if(networkOperatorName!=null){
            ne("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 大于 &gt; networkOperatorName
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameGt(String networkOperatorName){
        if(networkOperatorName!=null){
            gt("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 大于等于 &gt;= networkOperatorName
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameGe(String networkOperatorName){
        if(networkOperatorName!=null){
            ge("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 小于 &lt; networkOperatorName
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameLt(String networkOperatorName){
        if(networkOperatorName!=null){
            lt("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * 小于等于 &lt;= networkOperatorName
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameLe(String networkOperatorName){
        if(networkOperatorName!=null){
            le("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * BETWEEN 值1 AND 值2
     * @param networkOperatorNameStart       值1
     * @param networkOperatorNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameBetween(String networkOperatorNameStart,String networkOperatorNameEnd){
        if(networkOperatorNameStart!=null && networkOperatorNameEnd!=null){
            between("network_operator_name",networkOperatorNameStart,networkOperatorNameEnd);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param networkOperatorNameStart       值1
     * @param networkOperatorNameEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameNotBetween(String networkOperatorNameStart,String networkOperatorNameEnd){
        if(networkOperatorNameStart!=null && networkOperatorNameEnd!=null){
            notBetween("network_operator_name",networkOperatorNameStart,networkOperatorNameEnd);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '%值%' networkOperatorName
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameLike(String networkOperatorName){
        if(networkOperatorName!=null){
            like("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * NOT LIKE '%值%' networkOperatorName
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameNotLike(String networkOperatorName){
        if(networkOperatorName!=null){
            notLike("network_operator_name",networkOperatorName);
        }
        return this;
     }


    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '%值' networkOperatorName
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameLikeLeft(String networkOperatorName){
        if(networkOperatorName!=null){
            likeLeft("network_operator_name",networkOperatorName);
        }
        return this;
     }

    /**
     * <p>SIM卡的运营商名称</p>
     * LIKE '值%' networkOperatorName
     * @param networkOperatorName       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameLikeRight(String networkOperatorName){
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
    public EmSocDevicesUpdateWrapper networkOperatorNameIsNull(){
        isNull("network_operator_name");
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameIsNotNull(){
        isNotNull("network_operator_name");
        return this;
    }

    /**
     * <p>SIM卡的运营商名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper networkOperatorNameIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper networkOperatorNameIn(String... values){
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
    public EmSocDevicesUpdateWrapper networkOperatorNameNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper networkOperatorNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("network_operator_name",values);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * 等于 = uimode
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeEq(String uimode){
        if(uimode!=null){
            eq("uimode",uimode);
        }
        return this;
    }

    /**
     * <p>UI mode</p>
     * 不等于 &lt;&gt; uimode
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeNe(String uimode){
        if(uimode!=null){
            ne("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 大于 &gt; uimode
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeGt(String uimode){
        if(uimode!=null){
            gt("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 大于等于 &gt;= uimode
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeGe(String uimode){
        if(uimode!=null){
            ge("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 小于 &lt; uimode
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeLt(String uimode){
        if(uimode!=null){
            lt("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * 小于等于 &lt;= uimode
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeLe(String uimode){
        if(uimode!=null){
            le("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * BETWEEN 值1 AND 值2
     * @param uimodeStart       值1
     * @param uimodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeBetween(String uimodeStart,String uimodeEnd){
        if(uimodeStart!=null && uimodeEnd!=null){
            between("uimode",uimodeStart,uimodeEnd);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * NOT BETWEEN 值1 AND 值2
     * @param uimodeStart       值1
     * @param uimodeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeNotBetween(String uimodeStart,String uimodeEnd){
        if(uimodeStart!=null && uimodeEnd!=null){
            notBetween("uimode",uimodeStart,uimodeEnd);
        }
        return this;
     }


    /**
     * <p>UI mode</p>
     * LIKE '%值%' uimode
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeLike(String uimode){
        if(uimode!=null){
            like("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * NOT LIKE '%值%' uimode
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeNotLike(String uimode){
        if(uimode!=null){
            notLike("uimode",uimode);
        }
        return this;
     }


    /**
     * <p>UI mode</p>
     * LIKE '%值' uimode
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeLikeLeft(String uimode){
        if(uimode!=null){
            likeLeft("uimode",uimode);
        }
        return this;
     }

    /**
     * <p>UI mode</p>
     * LIKE '值%' uimode
     * @param uimode       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeLikeRight(String uimode){
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
    public EmSocDevicesUpdateWrapper uimodeIsNull(){
        isNull("uimode");
        return this;
    }

    /**
     * <p>UI mode</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeIsNotNull(){
        isNotNull("uimode");
        return this;
    }

    /**
     * <p>UI mode</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper uimodeIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper uimodeIn(String... values){
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
    public EmSocDevicesUpdateWrapper uimodeNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper uimodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("uimode",values);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * 等于 = resolution
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionEq(String resolution){
        if(resolution!=null){
            eq("resolution",resolution);
        }
        return this;
    }

    /**
     * <p>resolution</p>
     * 不等于 &lt;&gt; resolution
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionNe(String resolution){
        if(resolution!=null){
            ne("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 大于 &gt; resolution
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionGt(String resolution){
        if(resolution!=null){
            gt("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 大于等于 &gt;= resolution
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionGe(String resolution){
        if(resolution!=null){
            ge("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 小于 &lt; resolution
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionLt(String resolution){
        if(resolution!=null){
            lt("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * 小于等于 &lt;= resolution
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionLe(String resolution){
        if(resolution!=null){
            le("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * BETWEEN 值1 AND 值2
     * @param resolutionStart       值1
     * @param resolutionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionBetween(String resolutionStart,String resolutionEnd){
        if(resolutionStart!=null && resolutionEnd!=null){
            between("resolution",resolutionStart,resolutionEnd);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resolutionStart       值1
     * @param resolutionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionNotBetween(String resolutionStart,String resolutionEnd){
        if(resolutionStart!=null && resolutionEnd!=null){
            notBetween("resolution",resolutionStart,resolutionEnd);
        }
        return this;
     }


    /**
     * <p>resolution</p>
     * LIKE '%值%' resolution
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionLike(String resolution){
        if(resolution!=null){
            like("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * NOT LIKE '%值%' resolution
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionNotLike(String resolution){
        if(resolution!=null){
            notLike("resolution",resolution);
        }
        return this;
     }


    /**
     * <p>resolution</p>
     * LIKE '%值' resolution
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionLikeLeft(String resolution){
        if(resolution!=null){
            likeLeft("resolution",resolution);
        }
        return this;
     }

    /**
     * <p>resolution</p>
     * LIKE '值%' resolution
     * @param resolution       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionLikeRight(String resolution){
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
    public EmSocDevicesUpdateWrapper resolutionIsNull(){
        isNull("resolution");
        return this;
    }

    /**
     * <p>resolution</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionIsNotNull(){
        isNotNull("resolution");
        return this;
    }

    /**
     * <p>resolution</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper resolutionIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper resolutionIn(String... values){
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
    public EmSocDevicesUpdateWrapper resolutionNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper resolutionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("resolution",values);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * 等于 = totalMem
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemEq(Long totalMem){
        if(totalMem!=null){
            eq("total_mem",totalMem);
        }
        return this;
    }

    /**
     * <p>totalMem</p>
     * 不等于 &lt;&gt; totalMem
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemNe(Long totalMem){
        if(totalMem!=null){
            ne("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 大于 &gt; totalMem
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemGt(Long totalMem){
        if(totalMem!=null){
            gt("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 大于等于 &gt;= totalMem
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemGe(Long totalMem){
        if(totalMem!=null){
            ge("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 小于 &lt; totalMem
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemLt(Long totalMem){
        if(totalMem!=null){
            lt("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * 小于等于 &lt;= totalMem
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemLe(Long totalMem){
        if(totalMem!=null){
            le("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * BETWEEN 值1 AND 值2
     * @param totalMemStart       值1
     * @param totalMemEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemBetween(Long totalMemStart,Long totalMemEnd){
        if(totalMemStart!=null && totalMemEnd!=null){
            between("total_mem",totalMemStart,totalMemEnd);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * NOT BETWEEN 值1 AND 值2
     * @param totalMemStart       值1
     * @param totalMemEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemNotBetween(Long totalMemStart,Long totalMemEnd){
        if(totalMemStart!=null && totalMemEnd!=null){
            notBetween("total_mem",totalMemStart,totalMemEnd);
        }
        return this;
     }


    /**
     * <p>totalMem</p>
     * LIKE '%值%' totalMem
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemLike(Long totalMem){
        if(totalMem!=null){
            like("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * NOT LIKE '%值%' totalMem
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemNotLike(Long totalMem){
        if(totalMem!=null){
            notLike("total_mem",totalMem);
        }
        return this;
     }


    /**
     * <p>totalMem</p>
     * LIKE '%值' totalMem
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemLikeLeft(Long totalMem){
        if(totalMem!=null){
            likeLeft("total_mem",totalMem);
        }
        return this;
     }

    /**
     * <p>totalMem</p>
     * LIKE '值%' totalMem
     * @param totalMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemLikeRight(Long totalMem){
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
    public EmSocDevicesUpdateWrapper totalMemIsNull(){
        isNull("total_mem");
        return this;
    }

    /**
     * <p>totalMem</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemIsNotNull(){
        isNotNull("total_mem");
        return this;
    }

    /**
     * <p>totalMem</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalMemIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper totalMemIn(Long... values){
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
    public EmSocDevicesUpdateWrapper totalMemNotIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper totalMemNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("total_mem",values);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * 等于 = availMem
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemEq(Long availMem){
        if(availMem!=null){
            eq("avail_mem",availMem);
        }
        return this;
    }

    /**
     * <p>availMem</p>
     * 不等于 &lt;&gt; availMem
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemNe(Long availMem){
        if(availMem!=null){
            ne("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 大于 &gt; availMem
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemGt(Long availMem){
        if(availMem!=null){
            gt("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 大于等于 &gt;= availMem
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemGe(Long availMem){
        if(availMem!=null){
            ge("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 小于 &lt; availMem
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemLt(Long availMem){
        if(availMem!=null){
            lt("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * 小于等于 &lt;= availMem
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemLe(Long availMem){
        if(availMem!=null){
            le("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * BETWEEN 值1 AND 值2
     * @param availMemStart       值1
     * @param availMemEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemBetween(Long availMemStart,Long availMemEnd){
        if(availMemStart!=null && availMemEnd!=null){
            between("avail_mem",availMemStart,availMemEnd);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * NOT BETWEEN 值1 AND 值2
     * @param availMemStart       值1
     * @param availMemEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemNotBetween(Long availMemStart,Long availMemEnd){
        if(availMemStart!=null && availMemEnd!=null){
            notBetween("avail_mem",availMemStart,availMemEnd);
        }
        return this;
     }


    /**
     * <p>availMem</p>
     * LIKE '%值%' availMem
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemLike(Long availMem){
        if(availMem!=null){
            like("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * NOT LIKE '%值%' availMem
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemNotLike(Long availMem){
        if(availMem!=null){
            notLike("avail_mem",availMem);
        }
        return this;
     }


    /**
     * <p>availMem</p>
     * LIKE '%值' availMem
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemLikeLeft(Long availMem){
        if(availMem!=null){
            likeLeft("avail_mem",availMem);
        }
        return this;
     }

    /**
     * <p>availMem</p>
     * LIKE '值%' availMem
     * @param availMem       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemLikeRight(Long availMem){
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
    public EmSocDevicesUpdateWrapper availMemIsNull(){
        isNull("avail_mem");
        return this;
    }

    /**
     * <p>availMem</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemIsNotNull(){
        isNotNull("avail_mem");
        return this;
    }

    /**
     * <p>availMem</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper availMemIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper availMemIn(Long... values){
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
    public EmSocDevicesUpdateWrapper availMemNotIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper availMemNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("avail_mem",values);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * 等于 = totalStorage
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageEq(Long totalStorage){
        if(totalStorage!=null){
            eq("total_storage",totalStorage);
        }
        return this;
    }

    /**
     * <p>totalStorage</p>
     * 不等于 &lt;&gt; totalStorage
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageNe(Long totalStorage){
        if(totalStorage!=null){
            ne("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 大于 &gt; totalStorage
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageGt(Long totalStorage){
        if(totalStorage!=null){
            gt("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 大于等于 &gt;= totalStorage
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageGe(Long totalStorage){
        if(totalStorage!=null){
            ge("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 小于 &lt; totalStorage
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageLt(Long totalStorage){
        if(totalStorage!=null){
            lt("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * 小于等于 &lt;= totalStorage
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageLe(Long totalStorage){
        if(totalStorage!=null){
            le("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * BETWEEN 值1 AND 值2
     * @param totalStorageStart       值1
     * @param totalStorageEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageBetween(Long totalStorageStart,Long totalStorageEnd){
        if(totalStorageStart!=null && totalStorageEnd!=null){
            between("total_storage",totalStorageStart,totalStorageEnd);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * NOT BETWEEN 值1 AND 值2
     * @param totalStorageStart       值1
     * @param totalStorageEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageNotBetween(Long totalStorageStart,Long totalStorageEnd){
        if(totalStorageStart!=null && totalStorageEnd!=null){
            notBetween("total_storage",totalStorageStart,totalStorageEnd);
        }
        return this;
     }


    /**
     * <p>totalStorage</p>
     * LIKE '%值%' totalStorage
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageLike(Long totalStorage){
        if(totalStorage!=null){
            like("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * NOT LIKE '%值%' totalStorage
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageNotLike(Long totalStorage){
        if(totalStorage!=null){
            notLike("total_storage",totalStorage);
        }
        return this;
     }


    /**
     * <p>totalStorage</p>
     * LIKE '%值' totalStorage
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageLikeLeft(Long totalStorage){
        if(totalStorage!=null){
            likeLeft("total_storage",totalStorage);
        }
        return this;
     }

    /**
     * <p>totalStorage</p>
     * LIKE '值%' totalStorage
     * @param totalStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageLikeRight(Long totalStorage){
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
    public EmSocDevicesUpdateWrapper totalStorageIsNull(){
        isNull("total_storage");
        return this;
    }

    /**
     * <p>totalStorage</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageIsNotNull(){
        isNotNull("total_storage");
        return this;
    }

    /**
     * <p>totalStorage</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper totalStorageIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper totalStorageIn(Long... values){
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
    public EmSocDevicesUpdateWrapper totalStorageNotIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper totalStorageNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("total_storage",values);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * 等于 = availStorage
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageEq(Long availStorage){
        if(availStorage!=null){
            eq("avail_storage",availStorage);
        }
        return this;
    }

    /**
     * <p>availStorage</p>
     * 不等于 &lt;&gt; availStorage
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageNe(Long availStorage){
        if(availStorage!=null){
            ne("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 大于 &gt; availStorage
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageGt(Long availStorage){
        if(availStorage!=null){
            gt("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 大于等于 &gt;= availStorage
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageGe(Long availStorage){
        if(availStorage!=null){
            ge("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 小于 &lt; availStorage
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageLt(Long availStorage){
        if(availStorage!=null){
            lt("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * 小于等于 &lt;= availStorage
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageLe(Long availStorage){
        if(availStorage!=null){
            le("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * BETWEEN 值1 AND 值2
     * @param availStorageStart       值1
     * @param availStorageEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageBetween(Long availStorageStart,Long availStorageEnd){
        if(availStorageStart!=null && availStorageEnd!=null){
            between("avail_storage",availStorageStart,availStorageEnd);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * NOT BETWEEN 值1 AND 值2
     * @param availStorageStart       值1
     * @param availStorageEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageNotBetween(Long availStorageStart,Long availStorageEnd){
        if(availStorageStart!=null && availStorageEnd!=null){
            notBetween("avail_storage",availStorageStart,availStorageEnd);
        }
        return this;
     }


    /**
     * <p>availStorage</p>
     * LIKE '%值%' availStorage
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageLike(Long availStorage){
        if(availStorage!=null){
            like("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * NOT LIKE '%值%' availStorage
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageNotLike(Long availStorage){
        if(availStorage!=null){
            notLike("avail_storage",availStorage);
        }
        return this;
     }


    /**
     * <p>availStorage</p>
     * LIKE '%值' availStorage
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageLikeLeft(Long availStorage){
        if(availStorage!=null){
            likeLeft("avail_storage",availStorage);
        }
        return this;
     }

    /**
     * <p>availStorage</p>
     * LIKE '值%' availStorage
     * @param availStorage       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageLikeRight(Long availStorage){
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
    public EmSocDevicesUpdateWrapper availStorageIsNull(){
        isNull("avail_storage");
        return this;
    }

    /**
     * <p>availStorage</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageIsNotNull(){
        isNotNull("avail_storage");
        return this;
    }

    /**
     * <p>availStorage</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper availStorageIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper availStorageIn(Long... values){
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
    public EmSocDevicesUpdateWrapper availStorageNotIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper availStorageNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("avail_storage",values);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 等于 = rootAccess
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessEq(Integer rootAccess){
        if(rootAccess!=null){
            eq("root_access",rootAccess);
        }
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 不等于 &lt;&gt; rootAccess
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessNe(Integer rootAccess){
        if(rootAccess!=null){
            ne("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 大于 &gt; rootAccess
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessGt(Integer rootAccess){
        if(rootAccess!=null){
            gt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 大于等于 &gt;= rootAccess
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessGe(Integer rootAccess){
        if(rootAccess!=null){
            ge("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 小于 &lt; rootAccess
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessLt(Integer rootAccess){
        if(rootAccess!=null){
            lt("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * 小于等于 &lt;= rootAccess
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessLe(Integer rootAccess){
        if(rootAccess!=null){
            le("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * BETWEEN 值1 AND 值2
     * @param rootAccessStart       值1
     * @param rootAccessEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessBetween(Integer rootAccessStart,Integer rootAccessEnd){
        if(rootAccessStart!=null && rootAccessEnd!=null){
            between("root_access",rootAccessStart,rootAccessEnd);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param rootAccessStart       值1
     * @param rootAccessEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessNotBetween(Integer rootAccessStart,Integer rootAccessEnd){
        if(rootAccessStart!=null && rootAccessEnd!=null){
            notBetween("root_access",rootAccessStart,rootAccessEnd);
        }
        return this;
     }


    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '%值%' rootAccess
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessLike(Integer rootAccess){
        if(rootAccess!=null){
            like("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * NOT LIKE '%值%' rootAccess
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessNotLike(Integer rootAccess){
        if(rootAccess!=null){
            notLike("root_access",rootAccess);
        }
        return this;
     }


    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '%值' rootAccess
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessLikeLeft(Integer rootAccess){
        if(rootAccess!=null){
            likeLeft("root_access",rootAccess);
        }
        return this;
     }

    /**
     * <p>root_access(true:1；false:0)</p>
     * LIKE '值%' rootAccess
     * @param rootAccess       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessLikeRight(Integer rootAccess){
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
    public EmSocDevicesUpdateWrapper rootAccessIsNull(){
        isNull("root_access");
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessIsNotNull(){
        isNotNull("root_access");
        return this;
    }

    /**
     * <p>root_access(true:1；false:0)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper rootAccessIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper rootAccessIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper rootAccessNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper rootAccessNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("root_access",values);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 等于 = lng
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngEq(BigDecimal lng){
        if(lng!=null){
            eq("lng",lng);
        }
        return this;
    }

    /**
     * <p>经度</p>
     * 不等于 &lt;&gt; lng
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngNe(BigDecimal lng){
        if(lng!=null){
            ne("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于 &gt; lng
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngGt(BigDecimal lng){
        if(lng!=null){
            gt("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 大于等于 &gt;= lng
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngGe(BigDecimal lng){
        if(lng!=null){
            ge("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于 &lt; lng
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngLt(BigDecimal lng){
        if(lng!=null){
            lt("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * 小于等于 &lt;= lng
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngLe(BigDecimal lng){
        if(lng!=null){
            le("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * BETWEEN 值1 AND 值2
     * @param lngStart       值1
     * @param lngEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngBetween(BigDecimal lngStart,BigDecimal lngEnd){
        if(lngStart!=null && lngEnd!=null){
            between("lng",lngStart,lngEnd);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lngStart       值1
     * @param lngEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngNotBetween(BigDecimal lngStart,BigDecimal lngEnd){
        if(lngStart!=null && lngEnd!=null){
            notBetween("lng",lngStart,lngEnd);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值%' lng
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngLike(BigDecimal lng){
        if(lng!=null){
            like("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * NOT LIKE '%值%' lng
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngNotLike(BigDecimal lng){
        if(lng!=null){
            notLike("lng",lng);
        }
        return this;
     }


    /**
     * <p>经度</p>
     * LIKE '%值' lng
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngLikeLeft(BigDecimal lng){
        if(lng!=null){
            likeLeft("lng",lng);
        }
        return this;
     }

    /**
     * <p>经度</p>
     * LIKE '值%' lng
     * @param lng       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngLikeRight(BigDecimal lng){
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
    public EmSocDevicesUpdateWrapper lngIsNull(){
        isNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngIsNotNull(){
        isNotNull("lng");
        return this;
    }

    /**
     * <p>经度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper lngIn(Collection<BigDecimal> value){
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
    public EmSocDevicesUpdateWrapper lngIn(BigDecimal... values){
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
    public EmSocDevicesUpdateWrapper lngNotIn(Collection<BigDecimal> value){
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
    public EmSocDevicesUpdateWrapper lngNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lng",values);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 等于 = lat
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper latEq(BigDecimal lat){
        if(lat!=null){
            eq("lat",lat);
        }
        return this;
    }

    /**
     * <p>纬度</p>
     * 不等于 &lt;&gt; lat
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper latNe(BigDecimal lat){
        if(lat!=null){
            ne("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于 &gt; lat
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper latGt(BigDecimal lat){
        if(lat!=null){
            gt("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 大于等于 &gt;= lat
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper latGe(BigDecimal lat){
        if(lat!=null){
            ge("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于 &lt; lat
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper latLt(BigDecimal lat){
        if(lat!=null){
            lt("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * 小于等于 &lt;= lat
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper latLe(BigDecimal lat){
        if(lat!=null){
            le("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * BETWEEN 值1 AND 值2
     * @param latStart       值1
     * @param latEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper latBetween(BigDecimal latStart,BigDecimal latEnd){
        if(latStart!=null && latEnd!=null){
            between("lat",latStart,latEnd);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT BETWEEN 值1 AND 值2
     * @param latStart       值1
     * @param latEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper latNotBetween(BigDecimal latStart,BigDecimal latEnd){
        if(latStart!=null && latEnd!=null){
            notBetween("lat",latStart,latEnd);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值%' lat
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper latLike(BigDecimal lat){
        if(lat!=null){
            like("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * NOT LIKE '%值%' lat
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper latNotLike(BigDecimal lat){
        if(lat!=null){
            notLike("lat",lat);
        }
        return this;
     }


    /**
     * <p>纬度</p>
     * LIKE '%值' lat
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper latLikeLeft(BigDecimal lat){
        if(lat!=null){
            likeLeft("lat",lat);
        }
        return this;
     }

    /**
     * <p>纬度</p>
     * LIKE '值%' lat
     * @param lat       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper latLikeRight(BigDecimal lat){
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
    public EmSocDevicesUpdateWrapper latIsNull(){
        isNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper latIsNotNull(){
        isNotNull("lat");
        return this;
    }

    /**
     * <p>纬度</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper latIn(Collection<BigDecimal> value){
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
    public EmSocDevicesUpdateWrapper latIn(BigDecimal... values){
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
    public EmSocDevicesUpdateWrapper latNotIn(Collection<BigDecimal> value){
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
    public EmSocDevicesUpdateWrapper latNotIn(BigDecimal... values){
        if(values!=null && values.length>0){
            notIn("lat",values);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 等于 = bizType
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeEq(Integer bizType){
        if(bizType!=null){
            eq("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 不等于 &lt;&gt; bizType
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeNe(Integer bizType){
        if(bizType!=null){
            ne("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 大于 &gt; bizType
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeGt(Integer bizType){
        if(bizType!=null){
            gt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 大于等于 &gt;= bizType
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeGe(Integer bizType){
        if(bizType!=null){
            ge("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 小于 &lt; bizType
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeLt(Integer bizType){
        if(bizType!=null){
            lt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * 小于等于 &lt;= bizType
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeLe(Integer bizType){
        if(bizType!=null){
            le("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * BETWEEN 值1 AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeBetween(Integer bizTypeStart,Integer bizTypeEnd){
        if(bizTypeStart!=null && bizTypeEnd!=null){
            between("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeNotBetween(Integer bizTypeStart,Integer bizTypeEnd){
        if(bizTypeStart!=null && bizTypeEnd!=null){
            notBetween("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }


    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '%值%' bizType
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeLike(Integer bizType){
        if(bizType!=null){
            like("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * NOT LIKE '%值%' bizType
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeNotLike(Integer bizType){
        if(bizType!=null){
            notLike("biz_type",bizType);
        }
        return this;
     }


    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '%值' bizType
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeLikeLeft(Integer bizType){
        if(bizType!=null){
            likeLeft("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * LIKE '值%' bizType
     * @param bizType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeLikeRight(Integer bizType){
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
    public EmSocDevicesUpdateWrapper bizTypeIsNull(){
        isNull("biz_type");
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeIsNotNull(){
        isNotNull("biz_type");
        return this;
    }

    /**
     * <p>业务类型(1：盒子业务（包括任务业务和互动广告试玩业务），21：云机业务)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper bizTypeIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper bizTypeIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper bizTypeNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper bizTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("biz_type",values);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 等于 = serverType
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeEq(Integer serverType){
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 不等于 &lt;&gt; serverType
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeNe(Integer serverType){
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 大于 &gt; serverType
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeGt(Integer serverType){
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 大于等于 &gt;= serverType
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeGe(Integer serverType){
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 小于 &lt; serverType
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeLt(Integer serverType){
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * 小于等于 &lt;= serverType
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeLe(Integer serverType){
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * BETWEEN 值1 AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeBetween(Integer serverTypeStart,Integer serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            between("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeNotBetween(Integer serverTypeStart,Integer serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '%值%' serverType
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeLike(Integer serverType){
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * NOT LIKE '%值%' serverType
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeNotLike(Integer serverType){
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '%值' serverType
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeLikeLeft(Integer serverType){
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * LIKE '值%' serverType
     * @param serverType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeLikeRight(Integer serverType){
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
    public EmSocDevicesUpdateWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务，100：综合服务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper serverTypeIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper serverTypeIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper serverTypeNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper serverTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 等于 = salesStatus
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusEq(Integer salesStatus){
        if(salesStatus!=null){
            eq("sales_status",salesStatus);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 不等于 &lt;&gt; salesStatus
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusNe(Integer salesStatus){
        if(salesStatus!=null){
            ne("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于 &gt; salesStatus
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusGt(Integer salesStatus){
        if(salesStatus!=null){
            gt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 大于等于 &gt;= salesStatus
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusGe(Integer salesStatus){
        if(salesStatus!=null){
            ge("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于 &lt; salesStatus
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusLt(Integer salesStatus){
        if(salesStatus!=null){
            lt("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 小于等于 &lt;= salesStatus
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusLe(Integer salesStatus){
        if(salesStatus!=null){
            le("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * BETWEEN 值1 AND 值2
     * @param salesStatusStart       值1
     * @param salesStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusBetween(Integer salesStatusStart,Integer salesStatusEnd){
        if(salesStatusStart!=null && salesStatusEnd!=null){
            between("sales_status",salesStatusStart,salesStatusEnd);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param salesStatusStart       值1
     * @param salesStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusNotBetween(Integer salesStatusStart,Integer salesStatusEnd){
        if(salesStatusStart!=null && salesStatusEnd!=null){
            notBetween("sales_status",salesStatusStart,salesStatusEnd);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值%' salesStatus
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusLike(Integer salesStatus){
        if(salesStatus!=null){
            like("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * NOT LIKE '%值%' salesStatus
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusNotLike(Integer salesStatus){
        if(salesStatus!=null){
            notLike("sales_status",salesStatus);
        }
        return this;
     }


    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '%值' salesStatus
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusLikeLeft(Integer salesStatus){
        if(salesStatus!=null){
            likeLeft("sales_status",salesStatus);
        }
        return this;
     }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * LIKE '值%' salesStatus
     * @param salesStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusLikeRight(Integer salesStatus){
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
    public EmSocDevicesUpdateWrapper salesStatusIsNull(){
        isNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusIsNotNull(){
        isNotNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper salesStatusIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper salesStatusIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper salesStatusNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper salesStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("sales_status",values);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 = runningStatus
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusEq(Integer runningStatus){
        if(runningStatus!=null){
            eq("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 不等于 &lt;&gt; runningStatus
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusNe(Integer runningStatus){
        if(runningStatus!=null){
            ne("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于 &gt; runningStatus
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusGt(Integer runningStatus){
        if(runningStatus!=null){
            gt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于等于 &gt;= runningStatus
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusGe(Integer runningStatus){
        if(runningStatus!=null){
            ge("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于 &lt; runningStatus
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusLt(Integer runningStatus){
        if(runningStatus!=null){
            lt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于等于 &lt;= runningStatus
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusLe(Integer runningStatus){
        if(runningStatus!=null){
            le("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * BETWEEN 值1 AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusBetween(Integer runningStatusStart,Integer runningStatusEnd){
        if(runningStatusStart!=null && runningStatusEnd!=null){
            between("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusNotBetween(Integer runningStatusStart,Integer runningStatusEnd){
        if(runningStatusStart!=null && runningStatusEnd!=null){
            notBetween("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值%' runningStatus
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusLike(Integer runningStatus){
        if(runningStatus!=null){
            like("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT LIKE '%值%' runningStatus
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusNotLike(Integer runningStatus){
        if(runningStatus!=null){
            notLike("running_status",runningStatus);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值' runningStatus
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusLikeLeft(Integer runningStatus){
        if(runningStatus!=null){
            likeLeft("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '值%' runningStatus
     * @param runningStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusLikeRight(Integer runningStatus){
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
    public EmSocDevicesUpdateWrapper runningStatusIsNull(){
        isNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusIsNotNull(){
        isNotNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper runningStatusIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper runningStatusIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper runningStatusNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper runningStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("running_status",values);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusLikeRight(Integer status){
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
    public EmSocDevicesUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper statusIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper statusIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper statusNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 等于 = healthStatus
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusEq(Integer healthStatus){
        if(healthStatus!=null){
            eq("health_status",healthStatus);
        }
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 不等于 &lt;&gt; healthStatus
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusNe(Integer healthStatus){
        if(healthStatus!=null){
            ne("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于 &gt; healthStatus
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusGt(Integer healthStatus){
        if(healthStatus!=null){
            gt("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 大于等于 &gt;= healthStatus
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusGe(Integer healthStatus){
        if(healthStatus!=null){
            ge("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于 &lt; healthStatus
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusLt(Integer healthStatus){
        if(healthStatus!=null){
            lt("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * 小于等于 &lt;= healthStatus
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusLe(Integer healthStatus){
        if(healthStatus!=null){
            le("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * BETWEEN 值1 AND 值2
     * @param healthStatusStart       值1
     * @param healthStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusBetween(Integer healthStatusStart,Integer healthStatusEnd){
        if(healthStatusStart!=null && healthStatusEnd!=null){
            between("health_status",healthStatusStart,healthStatusEnd);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param healthStatusStart       值1
     * @param healthStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusNotBetween(Integer healthStatusStart,Integer healthStatusEnd){
        if(healthStatusStart!=null && healthStatusEnd!=null){
            notBetween("health_status",healthStatusStart,healthStatusEnd);
        }
        return this;
     }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值%' healthStatus
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusLike(Integer healthStatus){
        if(healthStatus!=null){
            like("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * NOT LIKE '%值%' healthStatus
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusNotLike(Integer healthStatus){
        if(healthStatus!=null){
            notLike("health_status",healthStatus);
        }
        return this;
     }


    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '%值' healthStatus
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusLikeLeft(Integer healthStatus){
        if(healthStatus!=null){
            likeLeft("health_status",healthStatus);
        }
        return this;
     }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * LIKE '值%' healthStatus
     * @param healthStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusLikeRight(Integer healthStatus){
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
    public EmSocDevicesUpdateWrapper healthStatusIsNull(){
        isNull("health_status");
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusIsNotNull(){
        isNotNull("health_status");
        return this;
    }

    /**
     * <p>健康状态(1：在线，0:故障)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper healthStatusIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper healthStatusIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper healthStatusNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper healthStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("health_status",values);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 等于 = trusteeshipStatus
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusEq(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            eq("trusteeship_status",trusteeshipStatus);
        }
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 不等于 &lt;&gt; trusteeshipStatus
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusNe(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            ne("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 大于 &gt; trusteeshipStatus
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusGt(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            gt("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 大于等于 &gt;= trusteeshipStatus
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusGe(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            ge("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 小于 &lt; trusteeshipStatus
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusLt(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            lt("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * 小于等于 &lt;= trusteeshipStatus
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusLe(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            le("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * BETWEEN 值1 AND 值2
     * @param trusteeshipStatusStart       值1
     * @param trusteeshipStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusBetween(Integer trusteeshipStatusStart,Integer trusteeshipStatusEnd){
        if(trusteeshipStatusStart!=null && trusteeshipStatusEnd!=null){
            between("trusteeship_status",trusteeshipStatusStart,trusteeshipStatusEnd);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param trusteeshipStatusStart       值1
     * @param trusteeshipStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusNotBetween(Integer trusteeshipStatusStart,Integer trusteeshipStatusEnd){
        if(trusteeshipStatusStart!=null && trusteeshipStatusEnd!=null){
            notBetween("trusteeship_status",trusteeshipStatusStart,trusteeshipStatusEnd);
        }
        return this;
     }


    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '%值%' trusteeshipStatus
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusLike(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            like("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * NOT LIKE '%值%' trusteeshipStatus
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusNotLike(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            notLike("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }


    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '%值' trusteeshipStatus
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusLikeLeft(Integer trusteeshipStatus){
        if(trusteeshipStatus!=null){
            likeLeft("trusteeship_status",trusteeshipStatus);
        }
        return this;
     }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * LIKE '值%' trusteeshipStatus
     * @param trusteeshipStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusLikeRight(Integer trusteeshipStatus){
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
    public EmSocDevicesUpdateWrapper trusteeshipStatusIsNull(){
        isNull("trusteeship_status");
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusIsNotNull(){
        isNotNull("trusteeship_status");
        return this;
    }

    /**
     * <p>托管状态(0：待托管/已解除托管，1:已托管（默认）)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper trusteeshipStatusIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper trusteeshipStatusIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper trusteeshipStatusNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper trusteeshipStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("trusteeship_status",values);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 等于 = planSwitchType
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeEq(Integer planSwitchType){
        if(planSwitchType!=null){
            eq("plan_switch_type",planSwitchType);
        }
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 不等于 &lt;&gt; planSwitchType
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeNe(Integer planSwitchType){
        if(planSwitchType!=null){
            ne("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 大于 &gt; planSwitchType
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeGt(Integer planSwitchType){
        if(planSwitchType!=null){
            gt("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 大于等于 &gt;= planSwitchType
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeGe(Integer planSwitchType){
        if(planSwitchType!=null){
            ge("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 小于 &lt; planSwitchType
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeLt(Integer planSwitchType){
        if(planSwitchType!=null){
            lt("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * 小于等于 &lt;= planSwitchType
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeLe(Integer planSwitchType){
        if(planSwitchType!=null){
            le("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * BETWEEN 值1 AND 值2
     * @param planSwitchTypeStart       值1
     * @param planSwitchTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeBetween(Integer planSwitchTypeStart,Integer planSwitchTypeEnd){
        if(planSwitchTypeStart!=null && planSwitchTypeEnd!=null){
            between("plan_switch_type",planSwitchTypeStart,planSwitchTypeEnd);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param planSwitchTypeStart       值1
     * @param planSwitchTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeNotBetween(Integer planSwitchTypeStart,Integer planSwitchTypeEnd){
        if(planSwitchTypeStart!=null && planSwitchTypeEnd!=null){
            notBetween("plan_switch_type",planSwitchTypeStart,planSwitchTypeEnd);
        }
        return this;
     }


    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '%值%' planSwitchType
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeLike(Integer planSwitchType){
        if(planSwitchType!=null){
            like("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * NOT LIKE '%值%' planSwitchType
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeNotLike(Integer planSwitchType){
        if(planSwitchType!=null){
            notLike("plan_switch_type",planSwitchType);
        }
        return this;
     }


    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '%值' planSwitchType
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeLikeLeft(Integer planSwitchType){
        if(planSwitchType!=null){
            likeLeft("plan_switch_type",planSwitchType);
        }
        return this;
     }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * LIKE '值%' planSwitchType
     * @param planSwitchType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeLikeRight(Integer planSwitchType){
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
    public EmSocDevicesUpdateWrapper planSwitchTypeIsNull(){
        isNull("plan_switch_type");
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeIsNotNull(){
        isNotNull("plan_switch_type");
        return this;
    }

    /**
     * <p>是否准备切换类型（0：不准备切换（默认），1：准备切换）（设备切换至非托管状态时，如果设备正忙，则需要更新当前类型=1）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper planSwitchTypeIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper planSwitchTypeIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper planSwitchTypeNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper planSwitchTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("plan_switch_type",values);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 等于 = streamingStatus
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusEq(Integer streamingStatus){
        if(streamingStatus!=null){
            eq("streaming_status",streamingStatus);
        }
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 不等于 &lt;&gt; streamingStatus
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusNe(Integer streamingStatus){
        if(streamingStatus!=null){
            ne("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于 &gt; streamingStatus
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusGt(Integer streamingStatus){
        if(streamingStatus!=null){
            gt("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 大于等于 &gt;= streamingStatus
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusGe(Integer streamingStatus){
        if(streamingStatus!=null){
            ge("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于 &lt; streamingStatus
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusLt(Integer streamingStatus){
        if(streamingStatus!=null){
            lt("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * 小于等于 &lt;= streamingStatus
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusLe(Integer streamingStatus){
        if(streamingStatus!=null){
            le("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * BETWEEN 值1 AND 值2
     * @param streamingStatusStart       值1
     * @param streamingStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusBetween(Integer streamingStatusStart,Integer streamingStatusEnd){
        if(streamingStatusStart!=null && streamingStatusEnd!=null){
            between("streaming_status",streamingStatusStart,streamingStatusEnd);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param streamingStatusStart       值1
     * @param streamingStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusNotBetween(Integer streamingStatusStart,Integer streamingStatusEnd){
        if(streamingStatusStart!=null && streamingStatusEnd!=null){
            notBetween("streaming_status",streamingStatusStart,streamingStatusEnd);
        }
        return this;
     }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值%' streamingStatus
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusLike(Integer streamingStatus){
        if(streamingStatus!=null){
            like("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * NOT LIKE '%值%' streamingStatus
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusNotLike(Integer streamingStatus){
        if(streamingStatus!=null){
            notLike("streaming_status",streamingStatus);
        }
        return this;
     }


    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '%值' streamingStatus
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusLikeLeft(Integer streamingStatus){
        if(streamingStatus!=null){
            likeLeft("streaming_status",streamingStatus);
        }
        return this;
     }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * LIKE '值%' streamingStatus
     * @param streamingStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusLikeRight(Integer streamingStatus){
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
    public EmSocDevicesUpdateWrapper streamingStatusIsNull(){
        isNull("streaming_status");
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusIsNotNull(){
        isNotNull("streaming_status");
        return this;
    }

    /**
     * <p>streaming状态（0：未streaming（或streaming失败），5：streaming启功中，10：正在streaming）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper streamingStatusIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper streamingStatusIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper streamingStatusNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper streamingStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("streaming_status",values);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 等于 = maintStatus
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusEq(Integer maintStatus){
        if(maintStatus!=null){
            eq("maint_status",maintStatus);
        }
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 不等于 &lt;&gt; maintStatus
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusNe(Integer maintStatus){
        if(maintStatus!=null){
            ne("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于 &gt; maintStatus
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusGt(Integer maintStatus){
        if(maintStatus!=null){
            gt("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 大于等于 &gt;= maintStatus
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusGe(Integer maintStatus){
        if(maintStatus!=null){
            ge("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于 &lt; maintStatus
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusLt(Integer maintStatus){
        if(maintStatus!=null){
            lt("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * 小于等于 &lt;= maintStatus
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusLe(Integer maintStatus){
        if(maintStatus!=null){
            le("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * BETWEEN 值1 AND 值2
     * @param maintStatusStart       值1
     * @param maintStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusBetween(Integer maintStatusStart,Integer maintStatusEnd){
        if(maintStatusStart!=null && maintStatusEnd!=null){
            between("maint_status",maintStatusStart,maintStatusEnd);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param maintStatusStart       值1
     * @param maintStatusEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusNotBetween(Integer maintStatusStart,Integer maintStatusEnd){
        if(maintStatusStart!=null && maintStatusEnd!=null){
            notBetween("maint_status",maintStatusStart,maintStatusEnd);
        }
        return this;
     }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值%' maintStatus
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusLike(Integer maintStatus){
        if(maintStatus!=null){
            like("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * NOT LIKE '%值%' maintStatus
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusNotLike(Integer maintStatus){
        if(maintStatus!=null){
            notLike("maint_status",maintStatus);
        }
        return this;
     }


    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '%值' maintStatus
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusLikeLeft(Integer maintStatus){
        if(maintStatus!=null){
            likeLeft("maint_status",maintStatus);
        }
        return this;
     }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * LIKE '值%' maintStatus
     * @param maintStatus       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusLikeRight(Integer maintStatus){
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
    public EmSocDevicesUpdateWrapper maintStatusIsNull(){
        isNull("maint_status");
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusIsNotNull(){
        isNotNull("maint_status");
        return this;
    }

    /**
     * <p>维护模式状态（0：非维护模式，1：维护模式）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper maintStatusIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper maintStatusIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper maintStatusNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper maintStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("maint_status",values);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 等于 = isReseting
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingEq(Integer isReseting){
        if(isReseting!=null){
            eq("is_reseting",isReseting);
        }
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 不等于 &lt;&gt; isReseting
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingNe(Integer isReseting){
        if(isReseting!=null){
            ne("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 大于 &gt; isReseting
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingGt(Integer isReseting){
        if(isReseting!=null){
            gt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 大于等于 &gt;= isReseting
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingGe(Integer isReseting){
        if(isReseting!=null){
            ge("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 小于 &lt; isReseting
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingLt(Integer isReseting){
        if(isReseting!=null){
            lt("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * 小于等于 &lt;= isReseting
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingLe(Integer isReseting){
        if(isReseting!=null){
            le("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * BETWEEN 值1 AND 值2
     * @param isResetingStart       值1
     * @param isResetingEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingBetween(Integer isResetingStart,Integer isResetingEnd){
        if(isResetingStart!=null && isResetingEnd!=null){
            between("is_reseting",isResetingStart,isResetingEnd);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param isResetingStart       值1
     * @param isResetingEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingNotBetween(Integer isResetingStart,Integer isResetingEnd){
        if(isResetingStart!=null && isResetingEnd!=null){
            notBetween("is_reseting",isResetingStart,isResetingEnd);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '%值%' isReseting
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingLike(Integer isReseting){
        if(isReseting!=null){
            like("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * NOT LIKE '%值%' isReseting
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingNotLike(Integer isReseting){
        if(isReseting!=null){
            notLike("is_reseting",isReseting);
        }
        return this;
     }


    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '%值' isReseting
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingLikeLeft(Integer isReseting){
        if(isReseting!=null){
            likeLeft("is_reseting",isReseting);
        }
        return this;
     }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * LIKE '值%' isReseting
     * @param isReseting       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingLikeRight(Integer isReseting){
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
    public EmSocDevicesUpdateWrapper isResetingIsNull(){
        isNull("is_reseting");
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingIsNotNull(){
        isNotNull("is_reseting");
        return this;
    }

    /**
     * <p>是否重置中（0：未重置，1：重置中，2：重启中）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper isResetingIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper isResetingIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper isResetingNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper isResetingNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_reseting",values);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * 等于 = romVersion
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionEq(String romVersion){
        if(romVersion!=null){
            eq("rom_version",romVersion);
        }
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * 不等于 &lt;&gt; romVersion
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionNe(String romVersion){
        if(romVersion!=null){
            ne("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 大于 &gt; romVersion
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionGt(String romVersion){
        if(romVersion!=null){
            gt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 大于等于 &gt;= romVersion
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionGe(String romVersion){
        if(romVersion!=null){
            ge("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 小于 &lt; romVersion
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionLt(String romVersion){
        if(romVersion!=null){
            lt("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * 小于等于 &lt;= romVersion
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionLe(String romVersion){
        if(romVersion!=null){
            le("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * BETWEEN 值1 AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionBetween(String romVersionStart,String romVersionEnd){
        if(romVersionStart!=null && romVersionEnd!=null){
            between("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * NOT BETWEEN 值1 AND 值2
     * @param romVersionStart       值1
     * @param romVersionEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionNotBetween(String romVersionStart,String romVersionEnd){
        if(romVersionStart!=null && romVersionEnd!=null){
            notBetween("rom_version",romVersionStart,romVersionEnd);
        }
        return this;
     }


    /**
     * <p>rom系统软件版本</p>
     * LIKE '%值%' romVersion
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionLike(String romVersion){
        if(romVersion!=null){
            like("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * NOT LIKE '%值%' romVersion
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionNotLike(String romVersion){
        if(romVersion!=null){
            notLike("rom_version",romVersion);
        }
        return this;
     }


    /**
     * <p>rom系统软件版本</p>
     * LIKE '%值' romVersion
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionLikeLeft(String romVersion){
        if(romVersion!=null){
            likeLeft("rom_version",romVersion);
        }
        return this;
     }

    /**
     * <p>rom系统软件版本</p>
     * LIKE '值%' romVersion
     * @param romVersion       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionLikeRight(String romVersion){
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
    public EmSocDevicesUpdateWrapper romVersionIsNull(){
        isNull("rom_version");
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionIsNotNull(){
        isNotNull("rom_version");
        return this;
    }

    /**
     * <p>rom系统软件版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper romVersionIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper romVersionIn(String... values){
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
    public EmSocDevicesUpdateWrapper romVersionNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper romVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("rom_version",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 不等于 &lt;&gt; versionId
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于 &gt; versionId
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于等于 &gt;= versionId
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于 &lt; versionId
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于等于 &lt;= versionId
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值' versionId
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '值%' versionId
     * @param versionId       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdLikeRight(Long versionId){
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
    public EmSocDevicesUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper versionIdIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper versionIdIn(Long... values){
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
    public EmSocDevicesUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public EmSocDevicesUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeLikeRight(Date createTime){
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
    public EmSocDevicesUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper createTimeIn(Collection<Date> value){
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
    public EmSocDevicesUpdateWrapper createTimeIn(Date... values){
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
    public EmSocDevicesUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public EmSocDevicesUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>盒子信息修改时间</p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>盒子信息修改时间</p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>盒子信息修改时间</p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public EmSocDevicesUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>盒子信息修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public EmSocDevicesUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public EmSocDevicesUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public EmSocDevicesUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 等于 = isUserSave
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveEq(Integer isUserSave){
        if(isUserSave!=null){
            eq("is_user_save",isUserSave);
        }
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 不等于 &lt;&gt; isUserSave
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveNe(Integer isUserSave){
        if(isUserSave!=null){
            ne("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于 &gt; isUserSave
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveGt(Integer isUserSave){
        if(isUserSave!=null){
            gt("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 大于等于 &gt;= isUserSave
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveGe(Integer isUserSave){
        if(isUserSave!=null){
            ge("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于 &lt; isUserSave
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveLt(Integer isUserSave){
        if(isUserSave!=null){
            lt("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * 小于等于 &lt;= isUserSave
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveLe(Integer isUserSave){
        if(isUserSave!=null){
            le("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * BETWEEN 值1 AND 值2
     * @param isUserSaveStart       值1
     * @param isUserSaveEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveBetween(Integer isUserSaveStart,Integer isUserSaveEnd){
        if(isUserSaveStart!=null && isUserSaveEnd!=null){
            between("is_user_save",isUserSaveStart,isUserSaveEnd);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param isUserSaveStart       值1
     * @param isUserSaveEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveNotBetween(Integer isUserSaveStart,Integer isUserSaveEnd){
        if(isUserSaveStart!=null && isUserSaveEnd!=null){
            notBetween("is_user_save",isUserSaveStart,isUserSaveEnd);
        }
        return this;
     }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值%' isUserSave
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveLike(Integer isUserSave){
        if(isUserSave!=null){
            like("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * NOT LIKE '%值%' isUserSave
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveNotLike(Integer isUserSave){
        if(isUserSave!=null){
            notLike("is_user_save",isUserSave);
        }
        return this;
     }


    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '%值' isUserSave
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveLikeLeft(Integer isUserSave){
        if(isUserSave!=null){
            likeLeft("is_user_save",isUserSave);
        }
        return this;
     }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * LIKE '值%' isUserSave
     * @param isUserSave       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveLikeRight(Integer isUserSave){
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
    public EmSocDevicesUpdateWrapper isUserSaveIsNull(){
        isNull("is_user_save");
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveIsNotNull(){
        isNotNull("is_user_save");
        return this;
    }

    /**
     * <p>是否在保存app用户数据(0：否，1：是)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper isUserSaveIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper isUserSaveIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper isUserSaveNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper isUserSaveNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_user_save",values);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 等于 = loglevel
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelEq(Integer loglevel){
        if(loglevel!=null){
            eq("loglevel",loglevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 不等于 &lt;&gt; loglevel
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelNe(Integer loglevel){
        if(loglevel!=null){
            ne("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于 &gt; loglevel
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelGt(Integer loglevel){
        if(loglevel!=null){
            gt("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于等于 &gt;= loglevel
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelGe(Integer loglevel){
        if(loglevel!=null){
            ge("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于 &lt; loglevel
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelLt(Integer loglevel){
        if(loglevel!=null){
            lt("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于等于 &lt;= loglevel
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelLe(Integer loglevel){
        if(loglevel!=null){
            le("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * BETWEEN 值1 AND 值2
     * @param loglevelStart       值1
     * @param loglevelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelBetween(Integer loglevelStart,Integer loglevelEnd){
        if(loglevelStart!=null && loglevelEnd!=null){
            between("loglevel",loglevelStart,loglevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT BETWEEN 值1 AND 值2
     * @param loglevelStart       值1
     * @param loglevelEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelNotBetween(Integer loglevelStart,Integer loglevelEnd){
        if(loglevelStart!=null && loglevelEnd!=null){
            notBetween("loglevel",loglevelStart,loglevelEnd);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值%' loglevel
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelLike(Integer loglevel){
        if(loglevel!=null){
            like("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT LIKE '%值%' loglevel
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelNotLike(Integer loglevel){
        if(loglevel!=null){
            notLike("loglevel",loglevel);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值' loglevel
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelLikeLeft(Integer loglevel){
        if(loglevel!=null){
            likeLeft("loglevel",loglevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '值%' loglevel
     * @param loglevel       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelLikeRight(Integer loglevel){
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
    public EmSocDevicesUpdateWrapper loglevelIsNull(){
        isNull("loglevel");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelIsNotNull(){
        isNotNull("loglevel");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper loglevelIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper loglevelIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper loglevelNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper loglevelNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("loglevel",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = logpkg
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgEq(String logpkg){
        if(logpkg!=null){
            eq("logpkg",logpkg);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; logpkg
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgNe(String logpkg){
        if(logpkg!=null){
            ne("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; logpkg
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgGt(String logpkg){
        if(logpkg!=null){
            gt("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= logpkg
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgGe(String logpkg){
        if(logpkg!=null){
            ge("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; logpkg
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgLt(String logpkg){
        if(logpkg!=null){
            lt("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= logpkg
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgLe(String logpkg){
        if(logpkg!=null){
            le("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param logpkgStart       值1
     * @param logpkgEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgBetween(String logpkgStart,String logpkgEnd){
        if(logpkgStart!=null && logpkgEnd!=null){
            between("logpkg",logpkgStart,logpkgEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param logpkgStart       值1
     * @param logpkgEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgNotBetween(String logpkgStart,String logpkgEnd){
        if(logpkgStart!=null && logpkgEnd!=null){
            notBetween("logpkg",logpkgStart,logpkgEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' logpkg
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgLike(String logpkg){
        if(logpkg!=null){
            like("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' logpkg
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgNotLike(String logpkg){
        if(logpkg!=null){
            notLike("logpkg",logpkg);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' logpkg
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgLikeLeft(String logpkg){
        if(logpkg!=null){
            likeLeft("logpkg",logpkg);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' logpkg
     * @param logpkg       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgLikeRight(String logpkg){
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
    public EmSocDevicesUpdateWrapper logpkgIsNull(){
        isNull("logpkg");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgIsNotNull(){
        isNotNull("logpkg");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper logpkgIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper logpkgIn(String... values){
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
    public EmSocDevicesUpdateWrapper logpkgNotIn(Collection<String> value){
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
    public EmSocDevicesUpdateWrapper logpkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("logpkg",values);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 等于 = isOtaUpgrade
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeEq(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            eq("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 不等于 &lt;&gt; isOtaUpgrade
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeNe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            ne("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于 &gt; isOtaUpgrade
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeGt(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            gt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 大于等于 &gt;= isOtaUpgrade
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeGe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            ge("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于 &lt; isOtaUpgrade
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeLt(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            lt("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * 小于等于 &lt;= isOtaUpgrade
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeLe(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            le("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * BETWEEN 值1 AND 值2
     * @param isOtaUpgradeStart       值1
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeBetween(Integer isOtaUpgradeStart,Integer isOtaUpgradeEnd){
        if(isOtaUpgradeStart!=null && isOtaUpgradeEnd!=null){
            between("is_ota_upgrade",isOtaUpgradeStart,isOtaUpgradeEnd);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param isOtaUpgradeStart       值1
     * @param isOtaUpgradeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeNotBetween(Integer isOtaUpgradeStart,Integer isOtaUpgradeEnd){
        if(isOtaUpgradeStart!=null && isOtaUpgradeEnd!=null){
            notBetween("is_ota_upgrade",isOtaUpgradeStart,isOtaUpgradeEnd);
        }
        return this;
     }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值%' isOtaUpgrade
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeLike(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            like("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * NOT LIKE '%值%' isOtaUpgrade
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeNotLike(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            notLike("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }


    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '%值' isOtaUpgrade
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeLikeLeft(Integer isOtaUpgrade){
        if(isOtaUpgrade!=null){
            likeLeft("is_ota_upgrade",isOtaUpgrade);
        }
        return this;
     }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * LIKE '值%' isOtaUpgrade
     * @param isOtaUpgrade       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeLikeRight(Integer isOtaUpgrade){
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
    public EmSocDevicesUpdateWrapper isOtaUpgradeIsNull(){
        isNull("is_ota_upgrade");
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeIsNotNull(){
        isNotNull("is_ota_upgrade");
        return this;
    }

    /**
     * <p>是升级中（0：未升级，1：升级中）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper isOtaUpgradeIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper isOtaUpgradeIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper isOtaUpgradeNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper isOtaUpgradeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_ota_upgrade",values);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 等于 = supplierType
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeEq(Integer supplierType){
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 不等于 &lt;&gt; supplierType
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeNe(Integer supplierType){
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 大于 &gt; supplierType
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeGt(Integer supplierType){
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 大于等于 &gt;= supplierType
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeGe(Integer supplierType){
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 小于 &lt; supplierType
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeLt(Integer supplierType){
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * 小于等于 &lt;= supplierType
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeLe(Integer supplierType){
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * BETWEEN 值1 AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        if(supplierTypeStart!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT BETWEEN 值1 AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeNotBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        if(supplierTypeStart!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '%值%' supplierType
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeLike(Integer supplierType){
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * NOT LIKE '%值%' supplierType
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeNotLike(Integer supplierType){
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '%值' supplierType
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeLikeLeft(Integer supplierType){
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * LIKE '值%' supplierType
     * @param supplierType       值
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeLikeRight(Integer supplierType){
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
    public EmSocDevicesUpdateWrapper supplierTypeIsNull(){
        isNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * IS NOT NULL
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeIsNotNull(){
        isNotNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:华为 2:腾讯]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public EmSocDevicesUpdateWrapper supplierTypeIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper supplierTypeIn(Integer... values){
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
    public EmSocDevicesUpdateWrapper supplierTypeNotIn(Collection<Integer> value){
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
    public EmSocDevicesUpdateWrapper supplierTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("supplier_type",values);
        }
        return this;
    }


}
