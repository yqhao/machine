package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * <p>
 * 机器基础信息表
 * </p>
 * "viz_mc_machine"
 * @author 18374
 */
public class VizMcMachineSelect{

    Set<String> set = new LinkedHashSet<>();
    Set<String> excludeSet = new LinkedHashSet<>();

    public VizMcMachineSelect columns(){
        set.add("id");
        set.add("fk_ext_cloud_region_id");
        set.add("ext_cloud_region_name");
        set.add("external_addr");
        set.add("internal_addr");
        set.add("device_id");
        set.add("instance_id");
        set.add("mac_addr");
        set.add("service_software_package_version");
        set.add("chip_model");
        set.add("os_version");
        set.add("sales_status");
        set.add("log_level");
        set.add("log_pkg");
        set.add("supplier_type");
        set.add("status");
        set.add("version_id");
        set.add("create_time");
        set.add("last_update_time");
        set.add("specification_model");
        set.add("memory_limit");
        return this;
    }

    public VizMcMachineSelect id(){
        set.add("id");
        return this;
    }

    public VizMcMachineSelect excludeId(){
        excludeSet.add("id");
        return this;
    }

    public VizMcMachineSelect avgId(){
        set.add("avg(id) as id");
        return this;
    }

    public VizMcMachineSelect countId(){
        set.add("count(id) as id");
        return this;
    }

    public VizMcMachineSelect minId(){
        set.add("min(id) as id");
        return this;
    }

    public VizMcMachineSelect maxId(){
        set.add("max(id) as id");
        return this;
    }

    public VizMcMachineSelect sumId(){
        set.add("sum(id) as id");
        return this;
    }
    public VizMcMachineSelect fkExtCloudRegionId(){
        set.add("fk_ext_cloud_region_id");
        return this;
    }

    public VizMcMachineSelect excludeFkExtCloudRegionId(){
        excludeSet.add("fk_ext_cloud_region_id");
        return this;
    }

    public VizMcMachineSelect avgFkExtCloudRegionId(){
        set.add("avg(fk_ext_cloud_region_id) as fk_ext_cloud_region_id");
        return this;
    }

    public VizMcMachineSelect countFkExtCloudRegionId(){
        set.add("count(fk_ext_cloud_region_id) as fk_ext_cloud_region_id");
        return this;
    }

    public VizMcMachineSelect minFkExtCloudRegionId(){
        set.add("min(fk_ext_cloud_region_id) as fk_ext_cloud_region_id");
        return this;
    }

    public VizMcMachineSelect maxFkExtCloudRegionId(){
        set.add("max(fk_ext_cloud_region_id) as fk_ext_cloud_region_id");
        return this;
    }

    public VizMcMachineSelect sumFkExtCloudRegionId(){
        set.add("sum(fk_ext_cloud_region_id) as fk_ext_cloud_region_id");
        return this;
    }
    public VizMcMachineSelect extCloudRegionName(){
        set.add("ext_cloud_region_name");
        return this;
    }

    public VizMcMachineSelect excludeExtCloudRegionName(){
        excludeSet.add("ext_cloud_region_name");
        return this;
    }

    public VizMcMachineSelect avgExtCloudRegionName(){
        set.add("avg(ext_cloud_region_name) as ext_cloud_region_name");
        return this;
    }

    public VizMcMachineSelect countExtCloudRegionName(){
        set.add("count(ext_cloud_region_name) as ext_cloud_region_name");
        return this;
    }

    public VizMcMachineSelect minExtCloudRegionName(){
        set.add("min(ext_cloud_region_name) as ext_cloud_region_name");
        return this;
    }

    public VizMcMachineSelect maxExtCloudRegionName(){
        set.add("max(ext_cloud_region_name) as ext_cloud_region_name");
        return this;
    }

    public VizMcMachineSelect sumExtCloudRegionName(){
        set.add("sum(ext_cloud_region_name) as ext_cloud_region_name");
        return this;
    }
    public VizMcMachineSelect externalAddr(){
        set.add("external_addr");
        return this;
    }

    public VizMcMachineSelect excludeExternalAddr(){
        excludeSet.add("external_addr");
        return this;
    }

    public VizMcMachineSelect avgExternalAddr(){
        set.add("avg(external_addr) as external_addr");
        return this;
    }

    public VizMcMachineSelect countExternalAddr(){
        set.add("count(external_addr) as external_addr");
        return this;
    }

    public VizMcMachineSelect minExternalAddr(){
        set.add("min(external_addr) as external_addr");
        return this;
    }

    public VizMcMachineSelect maxExternalAddr(){
        set.add("max(external_addr) as external_addr");
        return this;
    }

    public VizMcMachineSelect sumExternalAddr(){
        set.add("sum(external_addr) as external_addr");
        return this;
    }
    public VizMcMachineSelect internalAddr(){
        set.add("internal_addr");
        return this;
    }

    public VizMcMachineSelect excludeInternalAddr(){
        excludeSet.add("internal_addr");
        return this;
    }

    public VizMcMachineSelect avgInternalAddr(){
        set.add("avg(internal_addr) as internal_addr");
        return this;
    }

    public VizMcMachineSelect countInternalAddr(){
        set.add("count(internal_addr) as internal_addr");
        return this;
    }

    public VizMcMachineSelect minInternalAddr(){
        set.add("min(internal_addr) as internal_addr");
        return this;
    }

    public VizMcMachineSelect maxInternalAddr(){
        set.add("max(internal_addr) as internal_addr");
        return this;
    }

    public VizMcMachineSelect sumInternalAddr(){
        set.add("sum(internal_addr) as internal_addr");
        return this;
    }
    public VizMcMachineSelect deviceId(){
        set.add("device_id");
        return this;
    }

    public VizMcMachineSelect excludeDeviceId(){
        excludeSet.add("device_id");
        return this;
    }

    public VizMcMachineSelect avgDeviceId(){
        set.add("avg(device_id) as device_id");
        return this;
    }

    public VizMcMachineSelect countDeviceId(){
        set.add("count(device_id) as device_id");
        return this;
    }

    public VizMcMachineSelect minDeviceId(){
        set.add("min(device_id) as device_id");
        return this;
    }

    public VizMcMachineSelect maxDeviceId(){
        set.add("max(device_id) as device_id");
        return this;
    }

    public VizMcMachineSelect sumDeviceId(){
        set.add("sum(device_id) as device_id");
        return this;
    }
    public VizMcMachineSelect instanceId(){
        set.add("instance_id");
        return this;
    }

    public VizMcMachineSelect excludeInstanceId(){
        excludeSet.add("instance_id");
        return this;
    }

    public VizMcMachineSelect avgInstanceId(){
        set.add("avg(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineSelect countInstanceId(){
        set.add("count(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineSelect minInstanceId(){
        set.add("min(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineSelect maxInstanceId(){
        set.add("max(instance_id) as instance_id");
        return this;
    }

    public VizMcMachineSelect sumInstanceId(){
        set.add("sum(instance_id) as instance_id");
        return this;
    }
    public VizMcMachineSelect macAddr(){
        set.add("mac_addr");
        return this;
    }

    public VizMcMachineSelect excludeMacAddr(){
        excludeSet.add("mac_addr");
        return this;
    }

    public VizMcMachineSelect avgMacAddr(){
        set.add("avg(mac_addr) as mac_addr");
        return this;
    }

    public VizMcMachineSelect countMacAddr(){
        set.add("count(mac_addr) as mac_addr");
        return this;
    }

    public VizMcMachineSelect minMacAddr(){
        set.add("min(mac_addr) as mac_addr");
        return this;
    }

    public VizMcMachineSelect maxMacAddr(){
        set.add("max(mac_addr) as mac_addr");
        return this;
    }

    public VizMcMachineSelect sumMacAddr(){
        set.add("sum(mac_addr) as mac_addr");
        return this;
    }
    public VizMcMachineSelect serviceSoftwarePackageVersion(){
        set.add("service_software_package_version");
        return this;
    }

    public VizMcMachineSelect excludeServiceSoftwarePackageVersion(){
        excludeSet.add("service_software_package_version");
        return this;
    }

    public VizMcMachineSelect avgServiceSoftwarePackageVersion(){
        set.add("avg(service_software_package_version) as service_software_package_version");
        return this;
    }

    public VizMcMachineSelect countServiceSoftwarePackageVersion(){
        set.add("count(service_software_package_version) as service_software_package_version");
        return this;
    }

    public VizMcMachineSelect minServiceSoftwarePackageVersion(){
        set.add("min(service_software_package_version) as service_software_package_version");
        return this;
    }

    public VizMcMachineSelect maxServiceSoftwarePackageVersion(){
        set.add("max(service_software_package_version) as service_software_package_version");
        return this;
    }

    public VizMcMachineSelect sumServiceSoftwarePackageVersion(){
        set.add("sum(service_software_package_version) as service_software_package_version");
        return this;
    }
    public VizMcMachineSelect chipModel(){
        set.add("chip_model");
        return this;
    }

    public VizMcMachineSelect excludeChipModel(){
        excludeSet.add("chip_model");
        return this;
    }

    public VizMcMachineSelect avgChipModel(){
        set.add("avg(chip_model) as chip_model");
        return this;
    }

    public VizMcMachineSelect countChipModel(){
        set.add("count(chip_model) as chip_model");
        return this;
    }

    public VizMcMachineSelect minChipModel(){
        set.add("min(chip_model) as chip_model");
        return this;
    }

    public VizMcMachineSelect maxChipModel(){
        set.add("max(chip_model) as chip_model");
        return this;
    }

    public VizMcMachineSelect sumChipModel(){
        set.add("sum(chip_model) as chip_model");
        return this;
    }
    public VizMcMachineSelect osVersion(){
        set.add("os_version");
        return this;
    }

    public VizMcMachineSelect excludeOsVersion(){
        excludeSet.add("os_version");
        return this;
    }

    public VizMcMachineSelect avgOsVersion(){
        set.add("avg(os_version) as os_version");
        return this;
    }

    public VizMcMachineSelect countOsVersion(){
        set.add("count(os_version) as os_version");
        return this;
    }

    public VizMcMachineSelect minOsVersion(){
        set.add("min(os_version) as os_version");
        return this;
    }

    public VizMcMachineSelect maxOsVersion(){
        set.add("max(os_version) as os_version");
        return this;
    }

    public VizMcMachineSelect sumOsVersion(){
        set.add("sum(os_version) as os_version");
        return this;
    }
    public VizMcMachineSelect salesStatus(){
        set.add("sales_status");
        return this;
    }

    public VizMcMachineSelect excludeSalesStatus(){
        excludeSet.add("sales_status");
        return this;
    }

    public VizMcMachineSelect avgSalesStatus(){
        set.add("avg(sales_status) as sales_status");
        return this;
    }

    public VizMcMachineSelect countSalesStatus(){
        set.add("count(sales_status) as sales_status");
        return this;
    }

    public VizMcMachineSelect minSalesStatus(){
        set.add("min(sales_status) as sales_status");
        return this;
    }

    public VizMcMachineSelect maxSalesStatus(){
        set.add("max(sales_status) as sales_status");
        return this;
    }

    public VizMcMachineSelect sumSalesStatus(){
        set.add("sum(sales_status) as sales_status");
        return this;
    }
    public VizMcMachineSelect logLevel(){
        set.add("log_level");
        return this;
    }

    public VizMcMachineSelect excludeLogLevel(){
        excludeSet.add("log_level");
        return this;
    }

    public VizMcMachineSelect avgLogLevel(){
        set.add("avg(log_level) as log_level");
        return this;
    }

    public VizMcMachineSelect countLogLevel(){
        set.add("count(log_level) as log_level");
        return this;
    }

    public VizMcMachineSelect minLogLevel(){
        set.add("min(log_level) as log_level");
        return this;
    }

    public VizMcMachineSelect maxLogLevel(){
        set.add("max(log_level) as log_level");
        return this;
    }

    public VizMcMachineSelect sumLogLevel(){
        set.add("sum(log_level) as log_level");
        return this;
    }
    public VizMcMachineSelect logPkg(){
        set.add("log_pkg");
        return this;
    }

    public VizMcMachineSelect excludeLogPkg(){
        excludeSet.add("log_pkg");
        return this;
    }

    public VizMcMachineSelect avgLogPkg(){
        set.add("avg(log_pkg) as log_pkg");
        return this;
    }

    public VizMcMachineSelect countLogPkg(){
        set.add("count(log_pkg) as log_pkg");
        return this;
    }

    public VizMcMachineSelect minLogPkg(){
        set.add("min(log_pkg) as log_pkg");
        return this;
    }

    public VizMcMachineSelect maxLogPkg(){
        set.add("max(log_pkg) as log_pkg");
        return this;
    }

    public VizMcMachineSelect sumLogPkg(){
        set.add("sum(log_pkg) as log_pkg");
        return this;
    }
    public VizMcMachineSelect supplierType(){
        set.add("supplier_type");
        return this;
    }

    public VizMcMachineSelect excludeSupplierType(){
        excludeSet.add("supplier_type");
        return this;
    }

    public VizMcMachineSelect avgSupplierType(){
        set.add("avg(supplier_type) as supplier_type");
        return this;
    }

    public VizMcMachineSelect countSupplierType(){
        set.add("count(supplier_type) as supplier_type");
        return this;
    }

    public VizMcMachineSelect minSupplierType(){
        set.add("min(supplier_type) as supplier_type");
        return this;
    }

    public VizMcMachineSelect maxSupplierType(){
        set.add("max(supplier_type) as supplier_type");
        return this;
    }

    public VizMcMachineSelect sumSupplierType(){
        set.add("sum(supplier_type) as supplier_type");
        return this;
    }
    public VizMcMachineSelect status(){
        set.add("status");
        return this;
    }

    public VizMcMachineSelect excludeStatus(){
        excludeSet.add("status");
        return this;
    }

    public VizMcMachineSelect avgStatus(){
        set.add("avg(status) as status");
        return this;
    }

    public VizMcMachineSelect countStatus(){
        set.add("count(status) as status");
        return this;
    }

    public VizMcMachineSelect minStatus(){
        set.add("min(status) as status");
        return this;
    }

    public VizMcMachineSelect maxStatus(){
        set.add("max(status) as status");
        return this;
    }

    public VizMcMachineSelect sumStatus(){
        set.add("sum(status) as status");
        return this;
    }
    public VizMcMachineSelect versionId(){
        set.add("version_id");
        return this;
    }

    public VizMcMachineSelect excludeVersionId(){
        excludeSet.add("version_id");
        return this;
    }

    public VizMcMachineSelect avgVersionId(){
        set.add("avg(version_id) as version_id");
        return this;
    }

    public VizMcMachineSelect countVersionId(){
        set.add("count(version_id) as version_id");
        return this;
    }

    public VizMcMachineSelect minVersionId(){
        set.add("min(version_id) as version_id");
        return this;
    }

    public VizMcMachineSelect maxVersionId(){
        set.add("max(version_id) as version_id");
        return this;
    }

    public VizMcMachineSelect sumVersionId(){
        set.add("sum(version_id) as version_id");
        return this;
    }
    public VizMcMachineSelect createTime(){
        set.add("create_time");
        return this;
    }

    public VizMcMachineSelect excludeCreateTime(){
        excludeSet.add("create_time");
        return this;
    }

    public VizMcMachineSelect avgCreateTime(){
        set.add("avg(create_time) as create_time");
        return this;
    }

    public VizMcMachineSelect countCreateTime(){
        set.add("count(create_time) as create_time");
        return this;
    }

    public VizMcMachineSelect minCreateTime(){
        set.add("min(create_time) as create_time");
        return this;
    }

    public VizMcMachineSelect maxCreateTime(){
        set.add("max(create_time) as create_time");
        return this;
    }

    public VizMcMachineSelect sumCreateTime(){
        set.add("sum(create_time) as create_time");
        return this;
    }
    public VizMcMachineSelect lastUpdateTime(){
        set.add("last_update_time");
        return this;
    }

    public VizMcMachineSelect excludeLastUpdateTime(){
        excludeSet.add("last_update_time");
        return this;
    }

    public VizMcMachineSelect avgLastUpdateTime(){
        set.add("avg(last_update_time) as last_update_time");
        return this;
    }

    public VizMcMachineSelect countLastUpdateTime(){
        set.add("count(last_update_time) as last_update_time");
        return this;
    }

    public VizMcMachineSelect minLastUpdateTime(){
        set.add("min(last_update_time) as last_update_time");
        return this;
    }

    public VizMcMachineSelect maxLastUpdateTime(){
        set.add("max(last_update_time) as last_update_time");
        return this;
    }

    public VizMcMachineSelect sumLastUpdateTime(){
        set.add("sum(last_update_time) as last_update_time");
        return this;
    }
    public VizMcMachineSelect specificationModel(){
        set.add("specification_model");
        return this;
    }

    public VizMcMachineSelect excludeSpecificationModel(){
        excludeSet.add("specification_model");
        return this;
    }

    public VizMcMachineSelect avgSpecificationModel(){
        set.add("avg(specification_model) as specification_model");
        return this;
    }

    public VizMcMachineSelect countSpecificationModel(){
        set.add("count(specification_model) as specification_model");
        return this;
    }

    public VizMcMachineSelect minSpecificationModel(){
        set.add("min(specification_model) as specification_model");
        return this;
    }

    public VizMcMachineSelect maxSpecificationModel(){
        set.add("max(specification_model) as specification_model");
        return this;
    }

    public VizMcMachineSelect sumSpecificationModel(){
        set.add("sum(specification_model) as specification_model");
        return this;
    }
    public VizMcMachineSelect memoryLimit(){
        set.add("memory_limit");
        return this;
    }

    public VizMcMachineSelect excludeMemoryLimit(){
        excludeSet.add("memory_limit");
        return this;
    }

    public VizMcMachineSelect avgMemoryLimit(){
        set.add("avg(memory_limit) as memory_limit");
        return this;
    }

    public VizMcMachineSelect countMemoryLimit(){
        set.add("count(memory_limit) as memory_limit");
        return this;
    }

    public VizMcMachineSelect minMemoryLimit(){
        set.add("min(memory_limit) as memory_limit");
        return this;
    }

    public VizMcMachineSelect maxMemoryLimit(){
        set.add("max(memory_limit) as memory_limit");
        return this;
    }

    public VizMcMachineSelect sumMemoryLimit(){
        set.add("sum(memory_limit) as memory_limit");
        return this;
    }

    boolean distinct=false;

     public VizMcMachineSelect distinct(){
        this.distinct=true;
        return this;
    }

    public VizMcMachineSelect includes(Consumer<Set<String>> other){
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
