package com.suqi.center.machine.dao.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 设备（em_soc_devices）
 * </p>
 * "em_soc_devices"
 * @author PC001
 */
public class EmSocDevicesSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public EmSocDevicesSelect columns(){
        set.add("id");
        set.add("fk_pcp_area_id");
        set.add("device_id");
        set.add("imei");
        set.add("imsi");
        set.add("mac_addr");
        set.add("internal_addr");
        set.add("external_addr");
        set.add("province_ccode");
        set.add("province_name");
        set.add("city_ccode");
        set.add("city_name");
        set.add("area_ccode");
        set.add("area_name");
        set.add("region_name");
        set.add("location");
        set.add("processors");
        set.add("build_id");
        set.add("build_radio");
        set.add("build_model");
        set.add("build_manufacturer");
        set.add("build_bootloader");
        set.add("build_board");
        set.add("build_brand");
        set.add("build_cpu_abi");
        set.add("build_cpu_abi2");
        set.add("build_device");
        set.add("build_display");
        set.add("build_fingerprint");
        set.add("build_host");
        set.add("build_product");
        set.add("build_hardware");
        set.add("build_serial");
        set.add("build_supported_abis");
        set.add("build_supported_32_bit_abis");
        set.add("build_supported_64_bit_abis");
        set.add("build_version_incremental");
        set.add("build_version_release");
        set.add("build_version_sdk");
        set.add("build_version_sdkint");
        set.add("build_version_codename");
        set.add("build_type");
        set.add("build_api_level");
        set.add("andorid_id");
        set.add("os_arch");
        set.add("phone_type");
        set.add("os_version");
        set.add("sim_serial_number");
        set.add("network_operator");
        set.add("network_operator_name");
        set.add("uimode");
        set.add("resolution");
        set.add("total_mem");
        set.add("avail_mem");
        set.add("total_storage");
        set.add("avail_storage");
        set.add("root_access");
        set.add("lng");
        set.add("lat");
        set.add("biz_type");
        set.add("server_type");
        set.add("sales_status");
        set.add("running_status");
        set.add("status");
        set.add("health_status");
        set.add("trusteeship_status");
        set.add("plan_switch_type");
        set.add("streaming_status");
        set.add("maint_status");
        set.add("is_reseting");
        set.add("rom_version");
        set.add("version_id");
        set.add("create_time");
        set.add("last_update_time");
        set.add("is_user_save");
        set.add("loglevel");
        set.add("logpkg");
        set.add("is_ota_upgrade");
        set.add("supplier_type");
        return this;
    }

    public EmSocDevicesSelect id(){
        set.add("id");
        return this;
    }

    public EmSocDevicesSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public EmSocDevicesSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public EmSocDevicesSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public EmSocDevicesSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public EmSocDevicesSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public EmSocDevicesSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public EmSocDevicesSelect fkPcpAreaId(){
        set.add("fk_pcp_area_id");
        return this;
    }

    public EmSocDevicesSelect excludeFkPcpAreaId(){
        excludeSet.add("fk_pcp_area_id");
        return this;
    }

    public EmSocDevicesSelect avgFkPcpAreaId(){
        set.add("avg(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public EmSocDevicesSelect countFkPcpAreaId(){
        set.add("count(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public EmSocDevicesSelect minFkPcpAreaId(){
        set.add("min(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public EmSocDevicesSelect maxFkPcpAreaId(){
        set.add("max(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }

    public EmSocDevicesSelect sumFkPcpAreaId(){
        set.add("sum(fk_pcp_area_id) as fk_pcp_area_id");
        return this;
    }
    public EmSocDevicesSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public EmSocDevicesSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public EmSocDevicesSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public EmSocDevicesSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public EmSocDevicesSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public EmSocDevicesSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public EmSocDevicesSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public EmSocDevicesSelect imei(){
        set.add("imei");
        return this;
    }

    public EmSocDevicesSelect excludeImei(){
        excludeSet.add("imei");
        return this;
    }

    public EmSocDevicesSelect avgImei(){
        set.add("avg(imei) as imei");
        return this;
    }

    public EmSocDevicesSelect countImei(){
        set.add("count(imei) as imei");
        return this;
    }

    public EmSocDevicesSelect minImei(){
        set.add("min(imei) as imei");
        return this;
    }

    public EmSocDevicesSelect maxImei(){
        set.add("max(imei) as imei");
        return this;
    }

    public EmSocDevicesSelect sumImei(){
        set.add("sum(imei) as imei");
        return this;
    }
    public EmSocDevicesSelect imsi(){
        set.add("imsi");
        return this;
    }

    public EmSocDevicesSelect excludeImsi(){
        excludeSet.add("imsi");
        return this;
    }

    public EmSocDevicesSelect avgImsi(){
        set.add("avg(imsi) as imsi");
        return this;
    }

    public EmSocDevicesSelect countImsi(){
        set.add("count(imsi) as imsi");
        return this;
    }

    public EmSocDevicesSelect minImsi(){
        set.add("min(imsi) as imsi");
        return this;
    }

    public EmSocDevicesSelect maxImsi(){
        set.add("max(imsi) as imsi");
        return this;
    }

    public EmSocDevicesSelect sumImsi(){
        set.add("sum(imsi) as imsi");
        return this;
    }
    public EmSocDevicesSelect macAddr(){
        set.add("mac_addr");
        return this;
    }

    public EmSocDevicesSelect excludeMacAddr(){
        excludeSet.add("mac_addr");
        return this;
    }

    public EmSocDevicesSelect avgMacAddr(){
        set.add("avg(mac_addr) as mac_addr");
        return this;
    }

    public EmSocDevicesSelect countMacAddr(){
        set.add("count(mac_addr) as mac_addr");
        return this;
    }

    public EmSocDevicesSelect minMacAddr(){
        set.add("min(mac_addr) as mac_addr");
        return this;
    }

    public EmSocDevicesSelect maxMacAddr(){
        set.add("max(mac_addr) as mac_addr");
        return this;
    }

    public EmSocDevicesSelect sumMacAddr(){
        set.add("sum(mac_addr) as mac_addr");
        return this;
    }
    public EmSocDevicesSelect internalAddr(){
        set.add("internal_addr");
        return this;
    }

    public EmSocDevicesSelect excludeInternalAddr(){
        excludeSet.add("internal_addr");
        return this;
    }

    public EmSocDevicesSelect avgInternalAddr(){
        set.add("avg(internal_addr) as internal_addr");
        return this;
    }

    public EmSocDevicesSelect countInternalAddr(){
        set.add("count(internal_addr) as internal_addr");
        return this;
    }

    public EmSocDevicesSelect minInternalAddr(){
        set.add("min(internal_addr) as internal_addr");
        return this;
    }

    public EmSocDevicesSelect maxInternalAddr(){
        set.add("max(internal_addr) as internal_addr");
        return this;
    }

    public EmSocDevicesSelect sumInternalAddr(){
        set.add("sum(internal_addr) as internal_addr");
        return this;
    }
    public EmSocDevicesSelect externalAddr(){
        set.add("external_addr");
        return this;
    }

    public EmSocDevicesSelect excludeExternalAddr(){
        excludeSet.add("external_addr");
        return this;
    }

    public EmSocDevicesSelect avgExternalAddr(){
        set.add("avg(external_addr) as external_addr");
        return this;
    }

    public EmSocDevicesSelect countExternalAddr(){
        set.add("count(external_addr) as external_addr");
        return this;
    }

    public EmSocDevicesSelect minExternalAddr(){
        set.add("min(external_addr) as external_addr");
        return this;
    }

    public EmSocDevicesSelect maxExternalAddr(){
        set.add("max(external_addr) as external_addr");
        return this;
    }

    public EmSocDevicesSelect sumExternalAddr(){
        set.add("sum(external_addr) as external_addr");
        return this;
    }
    public EmSocDevicesSelect provinceCcode(){
        set.add("province_ccode");
        return this;
    }

    public EmSocDevicesSelect excludeProvinceCcode(){
        excludeSet.add("province_ccode");
        return this;
    }

    public EmSocDevicesSelect avgProvinceCcode(){
        set.add("avg(province_ccode) as province_ccode");
        return this;
    }

    public EmSocDevicesSelect countProvinceCcode(){
        set.add("count(province_ccode) as province_ccode");
        return this;
    }

    public EmSocDevicesSelect minProvinceCcode(){
        set.add("min(province_ccode) as province_ccode");
        return this;
    }

    public EmSocDevicesSelect maxProvinceCcode(){
        set.add("max(province_ccode) as province_ccode");
        return this;
    }

    public EmSocDevicesSelect sumProvinceCcode(){
        set.add("sum(province_ccode) as province_ccode");
        return this;
    }
    public EmSocDevicesSelect provinceName(){
        set.add("province_name");
        return this;
    }

    public EmSocDevicesSelect excludeProvinceName(){
        excludeSet.add("province_name");
        return this;
    }

    public EmSocDevicesSelect avgProvinceName(){
        set.add("avg(province_name) as province_name");
        return this;
    }

    public EmSocDevicesSelect countProvinceName(){
        set.add("count(province_name) as province_name");
        return this;
    }

    public EmSocDevicesSelect minProvinceName(){
        set.add("min(province_name) as province_name");
        return this;
    }

    public EmSocDevicesSelect maxProvinceName(){
        set.add("max(province_name) as province_name");
        return this;
    }

    public EmSocDevicesSelect sumProvinceName(){
        set.add("sum(province_name) as province_name");
        return this;
    }
    public EmSocDevicesSelect cityCcode(){
        set.add("city_ccode");
        return this;
    }

    public EmSocDevicesSelect excludeCityCcode(){
        excludeSet.add("city_ccode");
        return this;
    }

    public EmSocDevicesSelect avgCityCcode(){
        set.add("avg(city_ccode) as city_ccode");
        return this;
    }

    public EmSocDevicesSelect countCityCcode(){
        set.add("count(city_ccode) as city_ccode");
        return this;
    }

    public EmSocDevicesSelect minCityCcode(){
        set.add("min(city_ccode) as city_ccode");
        return this;
    }

    public EmSocDevicesSelect maxCityCcode(){
        set.add("max(city_ccode) as city_ccode");
        return this;
    }

    public EmSocDevicesSelect sumCityCcode(){
        set.add("sum(city_ccode) as city_ccode");
        return this;
    }
    public EmSocDevicesSelect cityName(){
        set.add("city_name");
        return this;
    }

    public EmSocDevicesSelect excludeCityName(){
        excludeSet.add("city_name");
        return this;
    }

    public EmSocDevicesSelect avgCityName(){
        set.add("avg(city_name) as city_name");
        return this;
    }

    public EmSocDevicesSelect countCityName(){
        set.add("count(city_name) as city_name");
        return this;
    }

    public EmSocDevicesSelect minCityName(){
        set.add("min(city_name) as city_name");
        return this;
    }

    public EmSocDevicesSelect maxCityName(){
        set.add("max(city_name) as city_name");
        return this;
    }

    public EmSocDevicesSelect sumCityName(){
        set.add("sum(city_name) as city_name");
        return this;
    }
    public EmSocDevicesSelect areaCcode(){
        set.add("area_ccode");
        return this;
    }

    public EmSocDevicesSelect excludeAreaCcode(){
        excludeSet.add("area_ccode");
        return this;
    }

    public EmSocDevicesSelect avgAreaCcode(){
        set.add("avg(area_ccode) as area_ccode");
        return this;
    }

    public EmSocDevicesSelect countAreaCcode(){
        set.add("count(area_ccode) as area_ccode");
        return this;
    }

    public EmSocDevicesSelect minAreaCcode(){
        set.add("min(area_ccode) as area_ccode");
        return this;
    }

    public EmSocDevicesSelect maxAreaCcode(){
        set.add("max(area_ccode) as area_ccode");
        return this;
    }

    public EmSocDevicesSelect sumAreaCcode(){
        set.add("sum(area_ccode) as area_ccode");
        return this;
    }
    public EmSocDevicesSelect areaName(){
        set.add("area_name");
        return this;
    }

    public EmSocDevicesSelect excludeAreaName(){
        excludeSet.add("area_name");
        return this;
    }

    public EmSocDevicesSelect avgAreaName(){
        set.add("avg(area_name) as area_name");
        return this;
    }

    public EmSocDevicesSelect countAreaName(){
        set.add("count(area_name) as area_name");
        return this;
    }

    public EmSocDevicesSelect minAreaName(){
        set.add("min(area_name) as area_name");
        return this;
    }

    public EmSocDevicesSelect maxAreaName(){
        set.add("max(area_name) as area_name");
        return this;
    }

    public EmSocDevicesSelect sumAreaName(){
        set.add("sum(area_name) as area_name");
        return this;
    }
    public EmSocDevicesSelect regionName(){
        set.add("region_name");
        return this;
    }

    public EmSocDevicesSelect excludeRegionName(){
        excludeSet.add("region_name");
        return this;
    }

    public EmSocDevicesSelect avgRegionName(){
        set.add("avg(region_name) as region_name");
        return this;
    }

    public EmSocDevicesSelect countRegionName(){
        set.add("count(region_name) as region_name");
        return this;
    }

    public EmSocDevicesSelect minRegionName(){
        set.add("min(region_name) as region_name");
        return this;
    }

    public EmSocDevicesSelect maxRegionName(){
        set.add("max(region_name) as region_name");
        return this;
    }

    public EmSocDevicesSelect sumRegionName(){
        set.add("sum(region_name) as region_name");
        return this;
    }
    public EmSocDevicesSelect location(){
        set.add("location");
        return this;
    }

    public EmSocDevicesSelect excludeLocation(){
        excludeSet.add("location");
        return this;
    }

    public EmSocDevicesSelect avgLocation(){
        set.add("avg(location) as location");
        return this;
    }

    public EmSocDevicesSelect countLocation(){
        set.add("count(location) as location");
        return this;
    }

    public EmSocDevicesSelect minLocation(){
        set.add("min(location) as location");
        return this;
    }

    public EmSocDevicesSelect maxLocation(){
        set.add("max(location) as location");
        return this;
    }

    public EmSocDevicesSelect sumLocation(){
        set.add("sum(location) as location");
        return this;
    }
    public EmSocDevicesSelect processors(){
        set.add("processors");
        return this;
    }

    public EmSocDevicesSelect excludeProcessors(){
        excludeSet.add("processors");
        return this;
    }

    public EmSocDevicesSelect avgProcessors(){
        set.add("avg(processors) as processors");
        return this;
    }

    public EmSocDevicesSelect countProcessors(){
        set.add("count(processors) as processors");
        return this;
    }

    public EmSocDevicesSelect minProcessors(){
        set.add("min(processors) as processors");
        return this;
    }

    public EmSocDevicesSelect maxProcessors(){
        set.add("max(processors) as processors");
        return this;
    }

    public EmSocDevicesSelect sumProcessors(){
        set.add("sum(processors) as processors");
        return this;
    }
    public EmSocDevicesSelect buildId(){
        set.add("build_id");
        return this;
    }

    public EmSocDevicesSelect excludeBuildId(){
        excludeSet.add("build_id");
        return this;
    }

    public EmSocDevicesSelect avgBuildId(){
        set.add("avg(build_id) as build_id");
        return this;
    }

    public EmSocDevicesSelect countBuildId(){
        set.add("count(build_id) as build_id");
        return this;
    }

    public EmSocDevicesSelect minBuildId(){
        set.add("min(build_id) as build_id");
        return this;
    }

    public EmSocDevicesSelect maxBuildId(){
        set.add("max(build_id) as build_id");
        return this;
    }

    public EmSocDevicesSelect sumBuildId(){
        set.add("sum(build_id) as build_id");
        return this;
    }
    public EmSocDevicesSelect buildRadio(){
        set.add("build_radio");
        return this;
    }

    public EmSocDevicesSelect excludeBuildRadio(){
        excludeSet.add("build_radio");
        return this;
    }

    public EmSocDevicesSelect avgBuildRadio(){
        set.add("avg(build_radio) as build_radio");
        return this;
    }

    public EmSocDevicesSelect countBuildRadio(){
        set.add("count(build_radio) as build_radio");
        return this;
    }

    public EmSocDevicesSelect minBuildRadio(){
        set.add("min(build_radio) as build_radio");
        return this;
    }

    public EmSocDevicesSelect maxBuildRadio(){
        set.add("max(build_radio) as build_radio");
        return this;
    }

    public EmSocDevicesSelect sumBuildRadio(){
        set.add("sum(build_radio) as build_radio");
        return this;
    }
    public EmSocDevicesSelect buildModel(){
        set.add("build_model");
        return this;
    }

    public EmSocDevicesSelect excludeBuildModel(){
        excludeSet.add("build_model");
        return this;
    }

    public EmSocDevicesSelect avgBuildModel(){
        set.add("avg(build_model) as build_model");
        return this;
    }

    public EmSocDevicesSelect countBuildModel(){
        set.add("count(build_model) as build_model");
        return this;
    }

    public EmSocDevicesSelect minBuildModel(){
        set.add("min(build_model) as build_model");
        return this;
    }

    public EmSocDevicesSelect maxBuildModel(){
        set.add("max(build_model) as build_model");
        return this;
    }

    public EmSocDevicesSelect sumBuildModel(){
        set.add("sum(build_model) as build_model");
        return this;
    }
    public EmSocDevicesSelect buildManufacturer(){
        set.add("build_manufacturer");
        return this;
    }

    public EmSocDevicesSelect excludeBuildManufacturer(){
        excludeSet.add("build_manufacturer");
        return this;
    }

    public EmSocDevicesSelect avgBuildManufacturer(){
        set.add("avg(build_manufacturer) as build_manufacturer");
        return this;
    }

    public EmSocDevicesSelect countBuildManufacturer(){
        set.add("count(build_manufacturer) as build_manufacturer");
        return this;
    }

    public EmSocDevicesSelect minBuildManufacturer(){
        set.add("min(build_manufacturer) as build_manufacturer");
        return this;
    }

    public EmSocDevicesSelect maxBuildManufacturer(){
        set.add("max(build_manufacturer) as build_manufacturer");
        return this;
    }

    public EmSocDevicesSelect sumBuildManufacturer(){
        set.add("sum(build_manufacturer) as build_manufacturer");
        return this;
    }
    public EmSocDevicesSelect buildBootloader(){
        set.add("build_bootloader");
        return this;
    }

    public EmSocDevicesSelect excludeBuildBootloader(){
        excludeSet.add("build_bootloader");
        return this;
    }

    public EmSocDevicesSelect avgBuildBootloader(){
        set.add("avg(build_bootloader) as build_bootloader");
        return this;
    }

    public EmSocDevicesSelect countBuildBootloader(){
        set.add("count(build_bootloader) as build_bootloader");
        return this;
    }

    public EmSocDevicesSelect minBuildBootloader(){
        set.add("min(build_bootloader) as build_bootloader");
        return this;
    }

    public EmSocDevicesSelect maxBuildBootloader(){
        set.add("max(build_bootloader) as build_bootloader");
        return this;
    }

    public EmSocDevicesSelect sumBuildBootloader(){
        set.add("sum(build_bootloader) as build_bootloader");
        return this;
    }
    public EmSocDevicesSelect buildBoard(){
        set.add("build_board");
        return this;
    }

    public EmSocDevicesSelect excludeBuildBoard(){
        excludeSet.add("build_board");
        return this;
    }

    public EmSocDevicesSelect avgBuildBoard(){
        set.add("avg(build_board) as build_board");
        return this;
    }

    public EmSocDevicesSelect countBuildBoard(){
        set.add("count(build_board) as build_board");
        return this;
    }

    public EmSocDevicesSelect minBuildBoard(){
        set.add("min(build_board) as build_board");
        return this;
    }

    public EmSocDevicesSelect maxBuildBoard(){
        set.add("max(build_board) as build_board");
        return this;
    }

    public EmSocDevicesSelect sumBuildBoard(){
        set.add("sum(build_board) as build_board");
        return this;
    }
    public EmSocDevicesSelect buildBrand(){
        set.add("build_brand");
        return this;
    }

    public EmSocDevicesSelect excludeBuildBrand(){
        excludeSet.add("build_brand");
        return this;
    }

    public EmSocDevicesSelect avgBuildBrand(){
        set.add("avg(build_brand) as build_brand");
        return this;
    }

    public EmSocDevicesSelect countBuildBrand(){
        set.add("count(build_brand) as build_brand");
        return this;
    }

    public EmSocDevicesSelect minBuildBrand(){
        set.add("min(build_brand) as build_brand");
        return this;
    }

    public EmSocDevicesSelect maxBuildBrand(){
        set.add("max(build_brand) as build_brand");
        return this;
    }

    public EmSocDevicesSelect sumBuildBrand(){
        set.add("sum(build_brand) as build_brand");
        return this;
    }
    public EmSocDevicesSelect buildCpuAbi(){
        set.add("build_cpu_abi");
        return this;
    }

    public EmSocDevicesSelect excludeBuildCpuAbi(){
        excludeSet.add("build_cpu_abi");
        return this;
    }

    public EmSocDevicesSelect avgBuildCpuAbi(){
        set.add("avg(build_cpu_abi) as build_cpu_abi");
        return this;
    }

    public EmSocDevicesSelect countBuildCpuAbi(){
        set.add("count(build_cpu_abi) as build_cpu_abi");
        return this;
    }

    public EmSocDevicesSelect minBuildCpuAbi(){
        set.add("min(build_cpu_abi) as build_cpu_abi");
        return this;
    }

    public EmSocDevicesSelect maxBuildCpuAbi(){
        set.add("max(build_cpu_abi) as build_cpu_abi");
        return this;
    }

    public EmSocDevicesSelect sumBuildCpuAbi(){
        set.add("sum(build_cpu_abi) as build_cpu_abi");
        return this;
    }
    public EmSocDevicesSelect buildCpuAbi2(){
        set.add("build_cpu_abi2");
        return this;
    }

    public EmSocDevicesSelect excludeBuildCpuAbi2(){
        excludeSet.add("build_cpu_abi2");
        return this;
    }

    public EmSocDevicesSelect avgBuildCpuAbi2(){
        set.add("avg(build_cpu_abi2) as build_cpu_abi2");
        return this;
    }

    public EmSocDevicesSelect countBuildCpuAbi2(){
        set.add("count(build_cpu_abi2) as build_cpu_abi2");
        return this;
    }

    public EmSocDevicesSelect minBuildCpuAbi2(){
        set.add("min(build_cpu_abi2) as build_cpu_abi2");
        return this;
    }

    public EmSocDevicesSelect maxBuildCpuAbi2(){
        set.add("max(build_cpu_abi2) as build_cpu_abi2");
        return this;
    }

    public EmSocDevicesSelect sumBuildCpuAbi2(){
        set.add("sum(build_cpu_abi2) as build_cpu_abi2");
        return this;
    }
    public EmSocDevicesSelect buildDevice(){
        set.add("build_device");
        return this;
    }

    public EmSocDevicesSelect excludeBuildDevice(){
        excludeSet.add("build_device");
        return this;
    }

    public EmSocDevicesSelect avgBuildDevice(){
        set.add("avg(build_device) as build_device");
        return this;
    }

    public EmSocDevicesSelect countBuildDevice(){
        set.add("count(build_device) as build_device");
        return this;
    }

    public EmSocDevicesSelect minBuildDevice(){
        set.add("min(build_device) as build_device");
        return this;
    }

    public EmSocDevicesSelect maxBuildDevice(){
        set.add("max(build_device) as build_device");
        return this;
    }

    public EmSocDevicesSelect sumBuildDevice(){
        set.add("sum(build_device) as build_device");
        return this;
    }
    public EmSocDevicesSelect buildDisplay(){
        set.add("build_display");
        return this;
    }

    public EmSocDevicesSelect excludeBuildDisplay(){
        excludeSet.add("build_display");
        return this;
    }

    public EmSocDevicesSelect avgBuildDisplay(){
        set.add("avg(build_display) as build_display");
        return this;
    }

    public EmSocDevicesSelect countBuildDisplay(){
        set.add("count(build_display) as build_display");
        return this;
    }

    public EmSocDevicesSelect minBuildDisplay(){
        set.add("min(build_display) as build_display");
        return this;
    }

    public EmSocDevicesSelect maxBuildDisplay(){
        set.add("max(build_display) as build_display");
        return this;
    }

    public EmSocDevicesSelect sumBuildDisplay(){
        set.add("sum(build_display) as build_display");
        return this;
    }
    public EmSocDevicesSelect buildFingerprint(){
        set.add("build_fingerprint");
        return this;
    }

    public EmSocDevicesSelect excludeBuildFingerprint(){
        excludeSet.add("build_fingerprint");
        return this;
    }

    public EmSocDevicesSelect avgBuildFingerprint(){
        set.add("avg(build_fingerprint) as build_fingerprint");
        return this;
    }

    public EmSocDevicesSelect countBuildFingerprint(){
        set.add("count(build_fingerprint) as build_fingerprint");
        return this;
    }

    public EmSocDevicesSelect minBuildFingerprint(){
        set.add("min(build_fingerprint) as build_fingerprint");
        return this;
    }

    public EmSocDevicesSelect maxBuildFingerprint(){
        set.add("max(build_fingerprint) as build_fingerprint");
        return this;
    }

    public EmSocDevicesSelect sumBuildFingerprint(){
        set.add("sum(build_fingerprint) as build_fingerprint");
        return this;
    }
    public EmSocDevicesSelect buildHost(){
        set.add("build_host");
        return this;
    }

    public EmSocDevicesSelect excludeBuildHost(){
        excludeSet.add("build_host");
        return this;
    }

    public EmSocDevicesSelect avgBuildHost(){
        set.add("avg(build_host) as build_host");
        return this;
    }

    public EmSocDevicesSelect countBuildHost(){
        set.add("count(build_host) as build_host");
        return this;
    }

    public EmSocDevicesSelect minBuildHost(){
        set.add("min(build_host) as build_host");
        return this;
    }

    public EmSocDevicesSelect maxBuildHost(){
        set.add("max(build_host) as build_host");
        return this;
    }

    public EmSocDevicesSelect sumBuildHost(){
        set.add("sum(build_host) as build_host");
        return this;
    }
    public EmSocDevicesSelect buildProduct(){
        set.add("build_product");
        return this;
    }

    public EmSocDevicesSelect excludeBuildProduct(){
        excludeSet.add("build_product");
        return this;
    }

    public EmSocDevicesSelect avgBuildProduct(){
        set.add("avg(build_product) as build_product");
        return this;
    }

    public EmSocDevicesSelect countBuildProduct(){
        set.add("count(build_product) as build_product");
        return this;
    }

    public EmSocDevicesSelect minBuildProduct(){
        set.add("min(build_product) as build_product");
        return this;
    }

    public EmSocDevicesSelect maxBuildProduct(){
        set.add("max(build_product) as build_product");
        return this;
    }

    public EmSocDevicesSelect sumBuildProduct(){
        set.add("sum(build_product) as build_product");
        return this;
    }
    public EmSocDevicesSelect buildHardware(){
        set.add("build_hardware");
        return this;
    }

    public EmSocDevicesSelect excludeBuildHardware(){
        excludeSet.add("build_hardware");
        return this;
    }

    public EmSocDevicesSelect avgBuildHardware(){
        set.add("avg(build_hardware) as build_hardware");
        return this;
    }

    public EmSocDevicesSelect countBuildHardware(){
        set.add("count(build_hardware) as build_hardware");
        return this;
    }

    public EmSocDevicesSelect minBuildHardware(){
        set.add("min(build_hardware) as build_hardware");
        return this;
    }

    public EmSocDevicesSelect maxBuildHardware(){
        set.add("max(build_hardware) as build_hardware");
        return this;
    }

    public EmSocDevicesSelect sumBuildHardware(){
        set.add("sum(build_hardware) as build_hardware");
        return this;
    }
    public EmSocDevicesSelect buildSerial(){
        set.add("build_serial");
        return this;
    }

    public EmSocDevicesSelect excludeBuildSerial(){
        excludeSet.add("build_serial");
        return this;
    }

    public EmSocDevicesSelect avgBuildSerial(){
        set.add("avg(build_serial) as build_serial");
        return this;
    }

    public EmSocDevicesSelect countBuildSerial(){
        set.add("count(build_serial) as build_serial");
        return this;
    }

    public EmSocDevicesSelect minBuildSerial(){
        set.add("min(build_serial) as build_serial");
        return this;
    }

    public EmSocDevicesSelect maxBuildSerial(){
        set.add("max(build_serial) as build_serial");
        return this;
    }

    public EmSocDevicesSelect sumBuildSerial(){
        set.add("sum(build_serial) as build_serial");
        return this;
    }
    public EmSocDevicesSelect buildSupportedAbis(){
        set.add("build_supported_abis");
        return this;
    }

    public EmSocDevicesSelect excludeBuildSupportedAbis(){
        excludeSet.add("build_supported_abis");
        return this;
    }

    public EmSocDevicesSelect avgBuildSupportedAbis(){
        set.add("avg(build_supported_abis) as build_supported_abis");
        return this;
    }

    public EmSocDevicesSelect countBuildSupportedAbis(){
        set.add("count(build_supported_abis) as build_supported_abis");
        return this;
    }

    public EmSocDevicesSelect minBuildSupportedAbis(){
        set.add("min(build_supported_abis) as build_supported_abis");
        return this;
    }

    public EmSocDevicesSelect maxBuildSupportedAbis(){
        set.add("max(build_supported_abis) as build_supported_abis");
        return this;
    }

    public EmSocDevicesSelect sumBuildSupportedAbis(){
        set.add("sum(build_supported_abis) as build_supported_abis");
        return this;
    }
    public EmSocDevicesSelect buildSupported32BitAbis(){
        set.add("build_supported_32_bit_abis");
        return this;
    }

    public EmSocDevicesSelect excludeBuildSupported32BitAbis(){
        excludeSet.add("build_supported_32_bit_abis");
        return this;
    }

    public EmSocDevicesSelect avgBuildSupported32BitAbis(){
        set.add("avg(build_supported_32_bit_abis) as build_supported_32_bit_abis");
        return this;
    }

    public EmSocDevicesSelect countBuildSupported32BitAbis(){
        set.add("count(build_supported_32_bit_abis) as build_supported_32_bit_abis");
        return this;
    }

    public EmSocDevicesSelect minBuildSupported32BitAbis(){
        set.add("min(build_supported_32_bit_abis) as build_supported_32_bit_abis");
        return this;
    }

    public EmSocDevicesSelect maxBuildSupported32BitAbis(){
        set.add("max(build_supported_32_bit_abis) as build_supported_32_bit_abis");
        return this;
    }

    public EmSocDevicesSelect sumBuildSupported32BitAbis(){
        set.add("sum(build_supported_32_bit_abis) as build_supported_32_bit_abis");
        return this;
    }
    public EmSocDevicesSelect buildSupported64BitAbis(){
        set.add("build_supported_64_bit_abis");
        return this;
    }

    public EmSocDevicesSelect excludeBuildSupported64BitAbis(){
        excludeSet.add("build_supported_64_bit_abis");
        return this;
    }

    public EmSocDevicesSelect avgBuildSupported64BitAbis(){
        set.add("avg(build_supported_64_bit_abis) as build_supported_64_bit_abis");
        return this;
    }

    public EmSocDevicesSelect countBuildSupported64BitAbis(){
        set.add("count(build_supported_64_bit_abis) as build_supported_64_bit_abis");
        return this;
    }

    public EmSocDevicesSelect minBuildSupported64BitAbis(){
        set.add("min(build_supported_64_bit_abis) as build_supported_64_bit_abis");
        return this;
    }

    public EmSocDevicesSelect maxBuildSupported64BitAbis(){
        set.add("max(build_supported_64_bit_abis) as build_supported_64_bit_abis");
        return this;
    }

    public EmSocDevicesSelect sumBuildSupported64BitAbis(){
        set.add("sum(build_supported_64_bit_abis) as build_supported_64_bit_abis");
        return this;
    }
    public EmSocDevicesSelect buildVersionIncremental(){
        set.add("build_version_incremental");
        return this;
    }

    public EmSocDevicesSelect excludeBuildVersionIncremental(){
        excludeSet.add("build_version_incremental");
        return this;
    }

    public EmSocDevicesSelect avgBuildVersionIncremental(){
        set.add("avg(build_version_incremental) as build_version_incremental");
        return this;
    }

    public EmSocDevicesSelect countBuildVersionIncremental(){
        set.add("count(build_version_incremental) as build_version_incremental");
        return this;
    }

    public EmSocDevicesSelect minBuildVersionIncremental(){
        set.add("min(build_version_incremental) as build_version_incremental");
        return this;
    }

    public EmSocDevicesSelect maxBuildVersionIncremental(){
        set.add("max(build_version_incremental) as build_version_incremental");
        return this;
    }

    public EmSocDevicesSelect sumBuildVersionIncremental(){
        set.add("sum(build_version_incremental) as build_version_incremental");
        return this;
    }
    public EmSocDevicesSelect buildVersionRelease(){
        set.add("build_version_release");
        return this;
    }

    public EmSocDevicesSelect excludeBuildVersionRelease(){
        excludeSet.add("build_version_release");
        return this;
    }

    public EmSocDevicesSelect avgBuildVersionRelease(){
        set.add("avg(build_version_release) as build_version_release");
        return this;
    }

    public EmSocDevicesSelect countBuildVersionRelease(){
        set.add("count(build_version_release) as build_version_release");
        return this;
    }

    public EmSocDevicesSelect minBuildVersionRelease(){
        set.add("min(build_version_release) as build_version_release");
        return this;
    }

    public EmSocDevicesSelect maxBuildVersionRelease(){
        set.add("max(build_version_release) as build_version_release");
        return this;
    }

    public EmSocDevicesSelect sumBuildVersionRelease(){
        set.add("sum(build_version_release) as build_version_release");
        return this;
    }
    public EmSocDevicesSelect buildVersionSdk(){
        set.add("build_version_sdk");
        return this;
    }

    public EmSocDevicesSelect excludeBuildVersionSdk(){
        excludeSet.add("build_version_sdk");
        return this;
    }

    public EmSocDevicesSelect avgBuildVersionSdk(){
        set.add("avg(build_version_sdk) as build_version_sdk");
        return this;
    }

    public EmSocDevicesSelect countBuildVersionSdk(){
        set.add("count(build_version_sdk) as build_version_sdk");
        return this;
    }

    public EmSocDevicesSelect minBuildVersionSdk(){
        set.add("min(build_version_sdk) as build_version_sdk");
        return this;
    }

    public EmSocDevicesSelect maxBuildVersionSdk(){
        set.add("max(build_version_sdk) as build_version_sdk");
        return this;
    }

    public EmSocDevicesSelect sumBuildVersionSdk(){
        set.add("sum(build_version_sdk) as build_version_sdk");
        return this;
    }
    public EmSocDevicesSelect buildVersionSdkint(){
        set.add("build_version_sdkint");
        return this;
    }

    public EmSocDevicesSelect excludeBuildVersionSdkint(){
        excludeSet.add("build_version_sdkint");
        return this;
    }

    public EmSocDevicesSelect avgBuildVersionSdkint(){
        set.add("avg(build_version_sdkint) as build_version_sdkint");
        return this;
    }

    public EmSocDevicesSelect countBuildVersionSdkint(){
        set.add("count(build_version_sdkint) as build_version_sdkint");
        return this;
    }

    public EmSocDevicesSelect minBuildVersionSdkint(){
        set.add("min(build_version_sdkint) as build_version_sdkint");
        return this;
    }

    public EmSocDevicesSelect maxBuildVersionSdkint(){
        set.add("max(build_version_sdkint) as build_version_sdkint");
        return this;
    }

    public EmSocDevicesSelect sumBuildVersionSdkint(){
        set.add("sum(build_version_sdkint) as build_version_sdkint");
        return this;
    }
    public EmSocDevicesSelect buildVersionCodename(){
        set.add("build_version_codename");
        return this;
    }

    public EmSocDevicesSelect excludeBuildVersionCodename(){
        excludeSet.add("build_version_codename");
        return this;
    }

    public EmSocDevicesSelect avgBuildVersionCodename(){
        set.add("avg(build_version_codename) as build_version_codename");
        return this;
    }

    public EmSocDevicesSelect countBuildVersionCodename(){
        set.add("count(build_version_codename) as build_version_codename");
        return this;
    }

    public EmSocDevicesSelect minBuildVersionCodename(){
        set.add("min(build_version_codename) as build_version_codename");
        return this;
    }

    public EmSocDevicesSelect maxBuildVersionCodename(){
        set.add("max(build_version_codename) as build_version_codename");
        return this;
    }

    public EmSocDevicesSelect sumBuildVersionCodename(){
        set.add("sum(build_version_codename) as build_version_codename");
        return this;
    }
    public EmSocDevicesSelect buildType(){
        set.add("build_type");
        return this;
    }

    public EmSocDevicesSelect excludeBuildType(){
        excludeSet.add("build_type");
        return this;
    }

    public EmSocDevicesSelect avgBuildType(){
        set.add("avg(build_type) as build_type");
        return this;
    }

    public EmSocDevicesSelect countBuildType(){
        set.add("count(build_type) as build_type");
        return this;
    }

    public EmSocDevicesSelect minBuildType(){
        set.add("min(build_type) as build_type");
        return this;
    }

    public EmSocDevicesSelect maxBuildType(){
        set.add("max(build_type) as build_type");
        return this;
    }

    public EmSocDevicesSelect sumBuildType(){
        set.add("sum(build_type) as build_type");
        return this;
    }
    public EmSocDevicesSelect buildApiLevel(){
        set.add("build_api_level");
        return this;
    }

    public EmSocDevicesSelect excludeBuildApiLevel(){
        excludeSet.add("build_api_level");
        return this;
    }

    public EmSocDevicesSelect avgBuildApiLevel(){
        set.add("avg(build_api_level) as build_api_level");
        return this;
    }

    public EmSocDevicesSelect countBuildApiLevel(){
        set.add("count(build_api_level) as build_api_level");
        return this;
    }

    public EmSocDevicesSelect minBuildApiLevel(){
        set.add("min(build_api_level) as build_api_level");
        return this;
    }

    public EmSocDevicesSelect maxBuildApiLevel(){
        set.add("max(build_api_level) as build_api_level");
        return this;
    }

    public EmSocDevicesSelect sumBuildApiLevel(){
        set.add("sum(build_api_level) as build_api_level");
        return this;
    }
    public EmSocDevicesSelect andoridId(){
        set.add("andorid_id");
        return this;
    }

    public EmSocDevicesSelect excludeAndoridId(){
        excludeSet.add("andorid_id");
        return this;
    }

    public EmSocDevicesSelect avgAndoridId(){
        set.add("avg(andorid_id) as andorid_id");
        return this;
    }

    public EmSocDevicesSelect countAndoridId(){
        set.add("count(andorid_id) as andorid_id");
        return this;
    }

    public EmSocDevicesSelect minAndoridId(){
        set.add("min(andorid_id) as andorid_id");
        return this;
    }

    public EmSocDevicesSelect maxAndoridId(){
        set.add("max(andorid_id) as andorid_id");
        return this;
    }

    public EmSocDevicesSelect sumAndoridId(){
        set.add("sum(andorid_id) as andorid_id");
        return this;
    }
    public EmSocDevicesSelect osArch(){
        set.add("os_arch");
        return this;
    }

    public EmSocDevicesSelect excludeOsArch(){
        excludeSet.add("os_arch");
        return this;
    }

    public EmSocDevicesSelect avgOsArch(){
        set.add("avg(os_arch) as os_arch");
        return this;
    }

    public EmSocDevicesSelect countOsArch(){
        set.add("count(os_arch) as os_arch");
        return this;
    }

    public EmSocDevicesSelect minOsArch(){
        set.add("min(os_arch) as os_arch");
        return this;
    }

    public EmSocDevicesSelect maxOsArch(){
        set.add("max(os_arch) as os_arch");
        return this;
    }

    public EmSocDevicesSelect sumOsArch(){
        set.add("sum(os_arch) as os_arch");
        return this;
    }
    public EmSocDevicesSelect phoneType(){
        set.add("phone_type");
        return this;
    }

    public EmSocDevicesSelect excludePhoneType(){
        excludeSet.add("phone_type");
        return this;
    }

    public EmSocDevicesSelect avgPhoneType(){
        set.add("avg(phone_type) as phone_type");
        return this;
    }

    public EmSocDevicesSelect countPhoneType(){
        set.add("count(phone_type) as phone_type");
        return this;
    }

    public EmSocDevicesSelect minPhoneType(){
        set.add("min(phone_type) as phone_type");
        return this;
    }

    public EmSocDevicesSelect maxPhoneType(){
        set.add("max(phone_type) as phone_type");
        return this;
    }

    public EmSocDevicesSelect sumPhoneType(){
        set.add("sum(phone_type) as phone_type");
        return this;
    }
    public EmSocDevicesSelect osVersion(){
        set.add("os_version");
        return this;
    }

    public EmSocDevicesSelect excludeOsVersion(){
        excludeSet.add("os_version");
        return this;
    }

    public EmSocDevicesSelect avgOsVersion(){
        set.add("avg(os_version) as os_version");
        return this;
    }

    public EmSocDevicesSelect countOsVersion(){
        set.add("count(os_version) as os_version");
        return this;
    }

    public EmSocDevicesSelect minOsVersion(){
        set.add("min(os_version) as os_version");
        return this;
    }

    public EmSocDevicesSelect maxOsVersion(){
        set.add("max(os_version) as os_version");
        return this;
    }

    public EmSocDevicesSelect sumOsVersion(){
        set.add("sum(os_version) as os_version");
        return this;
    }
    public EmSocDevicesSelect simSerialNumber(){
        set.add("sim_serial_number");
        return this;
    }

    public EmSocDevicesSelect excludeSimSerialNumber(){
        excludeSet.add("sim_serial_number");
        return this;
    }

    public EmSocDevicesSelect avgSimSerialNumber(){
        set.add("avg(sim_serial_number) as sim_serial_number");
        return this;
    }

    public EmSocDevicesSelect countSimSerialNumber(){
        set.add("count(sim_serial_number) as sim_serial_number");
        return this;
    }

    public EmSocDevicesSelect minSimSerialNumber(){
        set.add("min(sim_serial_number) as sim_serial_number");
        return this;
    }

    public EmSocDevicesSelect maxSimSerialNumber(){
        set.add("max(sim_serial_number) as sim_serial_number");
        return this;
    }

    public EmSocDevicesSelect sumSimSerialNumber(){
        set.add("sum(sim_serial_number) as sim_serial_number");
        return this;
    }
    public EmSocDevicesSelect networkOperator(){
        set.add("network_operator");
        return this;
    }

    public EmSocDevicesSelect excludeNetworkOperator(){
        excludeSet.add("network_operator");
        return this;
    }

    public EmSocDevicesSelect avgNetworkOperator(){
        set.add("avg(network_operator) as network_operator");
        return this;
    }

    public EmSocDevicesSelect countNetworkOperator(){
        set.add("count(network_operator) as network_operator");
        return this;
    }

    public EmSocDevicesSelect minNetworkOperator(){
        set.add("min(network_operator) as network_operator");
        return this;
    }

    public EmSocDevicesSelect maxNetworkOperator(){
        set.add("max(network_operator) as network_operator");
        return this;
    }

    public EmSocDevicesSelect sumNetworkOperator(){
        set.add("sum(network_operator) as network_operator");
        return this;
    }
    public EmSocDevicesSelect networkOperatorName(){
        set.add("network_operator_name");
        return this;
    }

    public EmSocDevicesSelect excludeNetworkOperatorName(){
        excludeSet.add("network_operator_name");
        return this;
    }

    public EmSocDevicesSelect avgNetworkOperatorName(){
        set.add("avg(network_operator_name) as network_operator_name");
        return this;
    }

    public EmSocDevicesSelect countNetworkOperatorName(){
        set.add("count(network_operator_name) as network_operator_name");
        return this;
    }

    public EmSocDevicesSelect minNetworkOperatorName(){
        set.add("min(network_operator_name) as network_operator_name");
        return this;
    }

    public EmSocDevicesSelect maxNetworkOperatorName(){
        set.add("max(network_operator_name) as network_operator_name");
        return this;
    }

    public EmSocDevicesSelect sumNetworkOperatorName(){
        set.add("sum(network_operator_name) as network_operator_name");
        return this;
    }
    public EmSocDevicesSelect uimode(){
        set.add("uimode");
        return this;
    }

    public EmSocDevicesSelect excludeUimode(){
        excludeSet.add("uimode");
        return this;
    }

    public EmSocDevicesSelect avgUimode(){
        set.add("avg(uimode) as uimode");
        return this;
    }

    public EmSocDevicesSelect countUimode(){
        set.add("count(uimode) as uimode");
        return this;
    }

    public EmSocDevicesSelect minUimode(){
        set.add("min(uimode) as uimode");
        return this;
    }

    public EmSocDevicesSelect maxUimode(){
        set.add("max(uimode) as uimode");
        return this;
    }

    public EmSocDevicesSelect sumUimode(){
        set.add("sum(uimode) as uimode");
        return this;
    }
    public EmSocDevicesSelect resolution(){
        set.add("resolution");
        return this;
    }

    public EmSocDevicesSelect excludeResolution(){
        excludeSet.add("resolution");
        return this;
    }

    public EmSocDevicesSelect avgResolution(){
        set.add("avg(resolution) as resolution");
        return this;
    }

    public EmSocDevicesSelect countResolution(){
        set.add("count(resolution) as resolution");
        return this;
    }

    public EmSocDevicesSelect minResolution(){
        set.add("min(resolution) as resolution");
        return this;
    }

    public EmSocDevicesSelect maxResolution(){
        set.add("max(resolution) as resolution");
        return this;
    }

    public EmSocDevicesSelect sumResolution(){
        set.add("sum(resolution) as resolution");
        return this;
    }
    public EmSocDevicesSelect totalMem(){
        set.add("total_mem");
        return this;
    }

    public EmSocDevicesSelect excludeTotalMem(){
        excludeSet.add("total_mem");
        return this;
    }

    public EmSocDevicesSelect avgTotalMem(){
        set.add("avg(total_mem) as total_mem");
        return this;
    }

    public EmSocDevicesSelect countTotalMem(){
        set.add("count(total_mem) as total_mem");
        return this;
    }

    public EmSocDevicesSelect minTotalMem(){
        set.add("min(total_mem) as total_mem");
        return this;
    }

    public EmSocDevicesSelect maxTotalMem(){
        set.add("max(total_mem) as total_mem");
        return this;
    }

    public EmSocDevicesSelect sumTotalMem(){
        set.add("sum(total_mem) as total_mem");
        return this;
    }
    public EmSocDevicesSelect availMem(){
        set.add("avail_mem");
        return this;
    }

    public EmSocDevicesSelect excludeAvailMem(){
        excludeSet.add("avail_mem");
        return this;
    }

    public EmSocDevicesSelect avgAvailMem(){
        set.add("avg(avail_mem) as avail_mem");
        return this;
    }

    public EmSocDevicesSelect countAvailMem(){
        set.add("count(avail_mem) as avail_mem");
        return this;
    }

    public EmSocDevicesSelect minAvailMem(){
        set.add("min(avail_mem) as avail_mem");
        return this;
    }

    public EmSocDevicesSelect maxAvailMem(){
        set.add("max(avail_mem) as avail_mem");
        return this;
    }

    public EmSocDevicesSelect sumAvailMem(){
        set.add("sum(avail_mem) as avail_mem");
        return this;
    }
    public EmSocDevicesSelect totalStorage(){
        set.add("total_storage");
        return this;
    }

    public EmSocDevicesSelect excludeTotalStorage(){
        excludeSet.add("total_storage");
        return this;
    }

    public EmSocDevicesSelect avgTotalStorage(){
        set.add("avg(total_storage) as total_storage");
        return this;
    }

    public EmSocDevicesSelect countTotalStorage(){
        set.add("count(total_storage) as total_storage");
        return this;
    }

    public EmSocDevicesSelect minTotalStorage(){
        set.add("min(total_storage) as total_storage");
        return this;
    }

    public EmSocDevicesSelect maxTotalStorage(){
        set.add("max(total_storage) as total_storage");
        return this;
    }

    public EmSocDevicesSelect sumTotalStorage(){
        set.add("sum(total_storage) as total_storage");
        return this;
    }
    public EmSocDevicesSelect availStorage(){
        set.add("avail_storage");
        return this;
    }

    public EmSocDevicesSelect excludeAvailStorage(){
        excludeSet.add("avail_storage");
        return this;
    }

    public EmSocDevicesSelect avgAvailStorage(){
        set.add("avg(avail_storage) as avail_storage");
        return this;
    }

    public EmSocDevicesSelect countAvailStorage(){
        set.add("count(avail_storage) as avail_storage");
        return this;
    }

    public EmSocDevicesSelect minAvailStorage(){
        set.add("min(avail_storage) as avail_storage");
        return this;
    }

    public EmSocDevicesSelect maxAvailStorage(){
        set.add("max(avail_storage) as avail_storage");
        return this;
    }

    public EmSocDevicesSelect sumAvailStorage(){
        set.add("sum(avail_storage) as avail_storage");
        return this;
    }
    public EmSocDevicesSelect rootAccess(){
        set.add("root_access");
        return this;
    }

    public EmSocDevicesSelect excludeRootAccess(){
        excludeSet.add("root_access");
        return this;
    }

    public EmSocDevicesSelect avgRootAccess(){
        set.add("avg(root_access) as root_access");
        return this;
    }

    public EmSocDevicesSelect countRootAccess(){
        set.add("count(root_access) as root_access");
        return this;
    }

    public EmSocDevicesSelect minRootAccess(){
        set.add("min(root_access) as root_access");
        return this;
    }

    public EmSocDevicesSelect maxRootAccess(){
        set.add("max(root_access) as root_access");
        return this;
    }

    public EmSocDevicesSelect sumRootAccess(){
        set.add("sum(root_access) as root_access");
        return this;
    }
    public EmSocDevicesSelect lng(){
        set.add("lng");
        return this;
    }

    public EmSocDevicesSelect excludeLng(){
        excludeSet.add("lng");
        return this;
    }

    public EmSocDevicesSelect avgLng(){
        set.add("avg(lng) as lng");
        return this;
    }

    public EmSocDevicesSelect countLng(){
        set.add("count(lng) as lng");
        return this;
    }

    public EmSocDevicesSelect minLng(){
        set.add("min(lng) as lng");
        return this;
    }

    public EmSocDevicesSelect maxLng(){
        set.add("max(lng) as lng");
        return this;
    }

    public EmSocDevicesSelect sumLng(){
        set.add("sum(lng) as lng");
        return this;
    }
    public EmSocDevicesSelect lat(){
        set.add("lat");
        return this;
    }

    public EmSocDevicesSelect excludeLat(){
        excludeSet.add("lat");
        return this;
    }

    public EmSocDevicesSelect avgLat(){
        set.add("avg(lat) as lat");
        return this;
    }

    public EmSocDevicesSelect countLat(){
        set.add("count(lat) as lat");
        return this;
    }

    public EmSocDevicesSelect minLat(){
        set.add("min(lat) as lat");
        return this;
    }

    public EmSocDevicesSelect maxLat(){
        set.add("max(lat) as lat");
        return this;
    }

    public EmSocDevicesSelect sumLat(){
        set.add("sum(lat) as lat");
        return this;
    }
    public EmSocDevicesSelect bizType(){
        set.add("biz_type");
        return this;
    }

    public EmSocDevicesSelect excludeBizType(){
        excludeSet.add("biz_type");
        return this;
    }

    public EmSocDevicesSelect avgBizType(){
        set.add("avg(biz_type) as biz_type");
        return this;
    }

    public EmSocDevicesSelect countBizType(){
        set.add("count(biz_type) as biz_type");
        return this;
    }

    public EmSocDevicesSelect minBizType(){
        set.add("min(biz_type) as biz_type");
        return this;
    }

    public EmSocDevicesSelect maxBizType(){
        set.add("max(biz_type) as biz_type");
        return this;
    }

    public EmSocDevicesSelect sumBizType(){
        set.add("sum(biz_type) as biz_type");
        return this;
    }
    public EmSocDevicesSelect serverType(){
        set.add("server_type");
        return this;
    }

    public EmSocDevicesSelect excludeServerType(){
        excludeSet.add("server_type");
        return this;
    }

    public EmSocDevicesSelect avgServerType(){
        set.add("avg(server_type) as server_type");
        return this;
    }

    public EmSocDevicesSelect countServerType(){
        set.add("count(server_type) as server_type");
        return this;
    }

    public EmSocDevicesSelect minServerType(){
        set.add("min(server_type) as server_type");
        return this;
    }

    public EmSocDevicesSelect maxServerType(){
        set.add("max(server_type) as server_type");
        return this;
    }

    public EmSocDevicesSelect sumServerType(){
        set.add("sum(server_type) as server_type");
        return this;
    }
    public EmSocDevicesSelect salesStatus(){
        set.add("sales_status");
        return this;
    }

    public EmSocDevicesSelect excludeSalesStatus(){
        excludeSet.add("sales_status");
        return this;
    }

    public EmSocDevicesSelect avgSalesStatus(){
        set.add("avg(sales_status) as sales_status");
        return this;
    }

    public EmSocDevicesSelect countSalesStatus(){
        set.add("count(sales_status) as sales_status");
        return this;
    }

    public EmSocDevicesSelect minSalesStatus(){
        set.add("min(sales_status) as sales_status");
        return this;
    }

    public EmSocDevicesSelect maxSalesStatus(){
        set.add("max(sales_status) as sales_status");
        return this;
    }

    public EmSocDevicesSelect sumSalesStatus(){
        set.add("sum(sales_status) as sales_status");
        return this;
    }
    public EmSocDevicesSelect runningStatus(){
        set.add("running_status");
        return this;
    }

    public EmSocDevicesSelect excludeRunningStatus(){
        excludeSet.add("running_status");
        return this;
    }

    public EmSocDevicesSelect avgRunningStatus(){
        set.add("avg(running_status) as running_status");
        return this;
    }

    public EmSocDevicesSelect countRunningStatus(){
        set.add("count(running_status) as running_status");
        return this;
    }

    public EmSocDevicesSelect minRunningStatus(){
        set.add("min(running_status) as running_status");
        return this;
    }

    public EmSocDevicesSelect maxRunningStatus(){
        set.add("max(running_status) as running_status");
        return this;
    }

    public EmSocDevicesSelect sumRunningStatus(){
        set.add("sum(running_status) as running_status");
        return this;
    }
    public EmSocDevicesSelect status(){
        set.add("status");
        return this;
    }

    public EmSocDevicesSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public EmSocDevicesSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public EmSocDevicesSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public EmSocDevicesSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public EmSocDevicesSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public EmSocDevicesSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public EmSocDevicesSelect healthStatus(){
        set.add("health_status");
        return this;
    }

    public EmSocDevicesSelect excludeHealthStatus(){
        excludeSet.add("health_status");
        return this;
    }

    public EmSocDevicesSelect avgHealthStatus(){
        set.add("avg(health_status) as health_status");
        return this;
    }

    public EmSocDevicesSelect countHealthStatus(){
        set.add("count(health_status) as health_status");
        return this;
    }

    public EmSocDevicesSelect minHealthStatus(){
        set.add("min(health_status) as health_status");
        return this;
    }

    public EmSocDevicesSelect maxHealthStatus(){
        set.add("max(health_status) as health_status");
        return this;
    }

    public EmSocDevicesSelect sumHealthStatus(){
        set.add("sum(health_status) as health_status");
        return this;
    }
    public EmSocDevicesSelect trusteeshipStatus(){
        set.add("trusteeship_status");
        return this;
    }

    public EmSocDevicesSelect excludeTrusteeshipStatus(){
        excludeSet.add("trusteeship_status");
        return this;
    }

    public EmSocDevicesSelect avgTrusteeshipStatus(){
        set.add("avg(trusteeship_status) as trusteeship_status");
        return this;
    }

    public EmSocDevicesSelect countTrusteeshipStatus(){
        set.add("count(trusteeship_status) as trusteeship_status");
        return this;
    }

    public EmSocDevicesSelect minTrusteeshipStatus(){
        set.add("min(trusteeship_status) as trusteeship_status");
        return this;
    }

    public EmSocDevicesSelect maxTrusteeshipStatus(){
        set.add("max(trusteeship_status) as trusteeship_status");
        return this;
    }

    public EmSocDevicesSelect sumTrusteeshipStatus(){
        set.add("sum(trusteeship_status) as trusteeship_status");
        return this;
    }
    public EmSocDevicesSelect planSwitchType(){
        set.add("plan_switch_type");
        return this;
    }

    public EmSocDevicesSelect excludePlanSwitchType(){
        excludeSet.add("plan_switch_type");
        return this;
    }

    public EmSocDevicesSelect avgPlanSwitchType(){
        set.add("avg(plan_switch_type) as plan_switch_type");
        return this;
    }

    public EmSocDevicesSelect countPlanSwitchType(){
        set.add("count(plan_switch_type) as plan_switch_type");
        return this;
    }

    public EmSocDevicesSelect minPlanSwitchType(){
        set.add("min(plan_switch_type) as plan_switch_type");
        return this;
    }

    public EmSocDevicesSelect maxPlanSwitchType(){
        set.add("max(plan_switch_type) as plan_switch_type");
        return this;
    }

    public EmSocDevicesSelect sumPlanSwitchType(){
        set.add("sum(plan_switch_type) as plan_switch_type");
        return this;
    }
    public EmSocDevicesSelect streamingStatus(){
        set.add("streaming_status");
        return this;
    }

    public EmSocDevicesSelect excludeStreamingStatus(){
        excludeSet.add("streaming_status");
        return this;
    }

    public EmSocDevicesSelect avgStreamingStatus(){
        set.add("avg(streaming_status) as streaming_status");
        return this;
    }

    public EmSocDevicesSelect countStreamingStatus(){
        set.add("count(streaming_status) as streaming_status");
        return this;
    }

    public EmSocDevicesSelect minStreamingStatus(){
        set.add("min(streaming_status) as streaming_status");
        return this;
    }

    public EmSocDevicesSelect maxStreamingStatus(){
        set.add("max(streaming_status) as streaming_status");
        return this;
    }

    public EmSocDevicesSelect sumStreamingStatus(){
        set.add("sum(streaming_status) as streaming_status");
        return this;
    }
    public EmSocDevicesSelect maintStatus(){
        set.add("maint_status");
        return this;
    }

    public EmSocDevicesSelect excludeMaintStatus(){
        excludeSet.add("maint_status");
        return this;
    }

    public EmSocDevicesSelect avgMaintStatus(){
        set.add("avg(maint_status) as maint_status");
        return this;
    }

    public EmSocDevicesSelect countMaintStatus(){
        set.add("count(maint_status) as maint_status");
        return this;
    }

    public EmSocDevicesSelect minMaintStatus(){
        set.add("min(maint_status) as maint_status");
        return this;
    }

    public EmSocDevicesSelect maxMaintStatus(){
        set.add("max(maint_status) as maint_status");
        return this;
    }

    public EmSocDevicesSelect sumMaintStatus(){
        set.add("sum(maint_status) as maint_status");
        return this;
    }
    public EmSocDevicesSelect isReseting(){
        set.add("is_reseting");
        return this;
    }

    public EmSocDevicesSelect excludeIsReseting(){
        excludeSet.add("is_reseting");
        return this;
    }

    public EmSocDevicesSelect avgIsReseting(){
        set.add("avg(is_reseting) as is_reseting");
        return this;
    }

    public EmSocDevicesSelect countIsReseting(){
        set.add("count(is_reseting) as is_reseting");
        return this;
    }

    public EmSocDevicesSelect minIsReseting(){
        set.add("min(is_reseting) as is_reseting");
        return this;
    }

    public EmSocDevicesSelect maxIsReseting(){
        set.add("max(is_reseting) as is_reseting");
        return this;
    }

    public EmSocDevicesSelect sumIsReseting(){
        set.add("sum(is_reseting) as is_reseting");
        return this;
    }
    public EmSocDevicesSelect romVersion(){
        set.add("rom_version");
        return this;
    }

    public EmSocDevicesSelect excludeRomVersion(){
        excludeSet.add("rom_version");
        return this;
    }

    public EmSocDevicesSelect avgRomVersion(){
        set.add("avg(rom_version) as rom_version");
        return this;
    }

    public EmSocDevicesSelect countRomVersion(){
        set.add("count(rom_version) as rom_version");
        return this;
    }

    public EmSocDevicesSelect minRomVersion(){
        set.add("min(rom_version) as rom_version");
        return this;
    }

    public EmSocDevicesSelect maxRomVersion(){
        set.add("max(rom_version) as rom_version");
        return this;
    }

    public EmSocDevicesSelect sumRomVersion(){
        set.add("sum(rom_version) as rom_version");
        return this;
    }
    public EmSocDevicesSelect versionId(){
        set.add("version_id");
        return this;
    }

    public EmSocDevicesSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public EmSocDevicesSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public EmSocDevicesSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public EmSocDevicesSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public EmSocDevicesSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public EmSocDevicesSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public EmSocDevicesSelect createTime(){
        set.add("create_time");
        return this;
    }

    public EmSocDevicesSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public EmSocDevicesSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public EmSocDevicesSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public EmSocDevicesSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public EmSocDevicesSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public EmSocDevicesSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public EmSocDevicesSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public EmSocDevicesSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public EmSocDevicesSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public EmSocDevicesSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public EmSocDevicesSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public EmSocDevicesSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public EmSocDevicesSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public EmSocDevicesSelect isUserSave(){
        set.add("is_user_save");
        return this;
    }

    public EmSocDevicesSelect excludeIsUserSave(){
        excludeSet.add("is_user_save");
        return this;
    }

    public EmSocDevicesSelect avgIsUserSave(){
        set.add("avg(is_user_save) as is_user_save");
        return this;
    }

    public EmSocDevicesSelect countIsUserSave(){
        set.add("count(is_user_save) as is_user_save");
        return this;
    }

    public EmSocDevicesSelect minIsUserSave(){
        set.add("min(is_user_save) as is_user_save");
        return this;
    }

    public EmSocDevicesSelect maxIsUserSave(){
        set.add("max(is_user_save) as is_user_save");
        return this;
    }

    public EmSocDevicesSelect sumIsUserSave(){
        set.add("sum(is_user_save) as is_user_save");
        return this;
    }
    public EmSocDevicesSelect loglevel(){
        set.add("loglevel");
        return this;
    }

    public EmSocDevicesSelect excludeLoglevel(){
        excludeSet.add("loglevel");
        return this;
    }

    public EmSocDevicesSelect avgLoglevel(){
        set.add("avg(loglevel) as loglevel");
        return this;
    }

    public EmSocDevicesSelect countLoglevel(){
        set.add("count(loglevel) as loglevel");
        return this;
    }

    public EmSocDevicesSelect minLoglevel(){
        set.add("min(loglevel) as loglevel");
        return this;
    }

    public EmSocDevicesSelect maxLoglevel(){
        set.add("max(loglevel) as loglevel");
        return this;
    }

    public EmSocDevicesSelect sumLoglevel(){
        set.add("sum(loglevel) as loglevel");
        return this;
    }
    public EmSocDevicesSelect logpkg(){
        set.add("logpkg");
        return this;
    }

    public EmSocDevicesSelect excludeLogpkg(){
        excludeSet.add("logpkg");
        return this;
    }

    public EmSocDevicesSelect avgLogpkg(){
        set.add("avg(logpkg) as logpkg");
        return this;
    }

    public EmSocDevicesSelect countLogpkg(){
        set.add("count(logpkg) as logpkg");
        return this;
    }

    public EmSocDevicesSelect minLogpkg(){
        set.add("min(logpkg) as logpkg");
        return this;
    }

    public EmSocDevicesSelect maxLogpkg(){
        set.add("max(logpkg) as logpkg");
        return this;
    }

    public EmSocDevicesSelect sumLogpkg(){
        set.add("sum(logpkg) as logpkg");
        return this;
    }
    public EmSocDevicesSelect isOtaUpgrade(){
        set.add("is_ota_upgrade");
        return this;
    }

    public EmSocDevicesSelect excludeIsOtaUpgrade(){
        excludeSet.add("is_ota_upgrade");
        return this;
    }

    public EmSocDevicesSelect avgIsOtaUpgrade(){
        set.add("avg(is_ota_upgrade) as is_ota_upgrade");
        return this;
    }

    public EmSocDevicesSelect countIsOtaUpgrade(){
        set.add("count(is_ota_upgrade) as is_ota_upgrade");
        return this;
    }

    public EmSocDevicesSelect minIsOtaUpgrade(){
        set.add("min(is_ota_upgrade) as is_ota_upgrade");
        return this;
    }

    public EmSocDevicesSelect maxIsOtaUpgrade(){
        set.add("max(is_ota_upgrade) as is_ota_upgrade");
        return this;
    }

    public EmSocDevicesSelect sumIsOtaUpgrade(){
        set.add("sum(is_ota_upgrade) as is_ota_upgrade");
        return this;
    }
    public EmSocDevicesSelect supplierType(){
        set.add("supplier_type");
        return this;
    }

    public EmSocDevicesSelect excludeSupplierType(){
        excludeSet.add("supplier_type");
        return this;
    }

    public EmSocDevicesSelect avgSupplierType(){
        set.add("avg(supplier_type) as supplier_type");
        return this;
    }

    public EmSocDevicesSelect countSupplierType(){
        set.add("count(supplier_type) as supplier_type");
        return this;
    }

    public EmSocDevicesSelect minSupplierType(){
        set.add("min(supplier_type) as supplier_type");
        return this;
    }

    public EmSocDevicesSelect maxSupplierType(){
        set.add("max(supplier_type) as supplier_type");
        return this;
    }

    public EmSocDevicesSelect sumSupplierType(){
        set.add("sum(supplier_type) as supplier_type");
        return this;
    }

    boolean distinct=false;

     public EmSocDevicesSelect distinct(){
        this.distinct=true;
        return this;
    }

    public EmSocDevicesSelect includes(Consumer<Set<String>> other){
        if(other!=null){
            other.accept(set);
        }
        return this;
    }

    public String[] select(){
        if(!excludeSet.isEmpty()){
            set.removeAll(excludeSet);
        }
        String[] columns = set.isEmpty() ? new String[]{"*"} : set.toArray(new String[0]);
        set.clear();
        excludeSet.clear();
        set=null;
        excludeSet=null;
        if(distinct){
            columns[0]=" DISTINCT "+columns[0];
        }
        return columns;
    }

    @Override
    public String toString(){
        String[] all=select();
        if(all.length==1){
            return all[0];
        }
        StringBuilder b =new StringBuilder();
        for (String s : all) {
            b.append(s).append(",");
        }
        b.deleteCharAt(b.length()-1);
        return b.toString();
    }
}
