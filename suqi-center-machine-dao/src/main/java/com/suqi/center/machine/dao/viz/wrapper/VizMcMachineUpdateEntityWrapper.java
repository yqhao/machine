package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.viz.entity.VizMcMachine;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 机器基础信息表
 * </p>
 * "viz_mc_machine"
 * @author 18374
 */
public class VizMcMachineUpdateEntityWrapper extends UpdateWrapper<VizMcMachine> {

    public static VizMcMachineUpdateEntityWrapper wrapper(VizMcMachine entity) {
        return new VizMcMachineUpdateEntityWrapper(entity);
    }

    private VizMcMachine entity;

    public VizMcMachineUpdateEntityWrapper(VizMcMachine entity) {
        this.entity=entity;
    }

    /**
     * 记录id自动增长
     */
    public VizMcMachineUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 机房记录id
     */
    public VizMcMachineUpdateEntityWrapper setFkExtCloudRegionId(Long fkExtCloudRegionId) {
         set("fk_ext_cloud_region_id",fkExtCloudRegionId);
        return this;
    }
    /**
     * 机房名称【区域名称】
     */
    public VizMcMachineUpdateEntityWrapper setExtCloudRegionName(String extCloudRegionName) {
         set("ext_cloud_region_name",extCloudRegionName);
        return this;
    }
    /**
     * 内网ip地址
     */
    public VizMcMachineUpdateEntityWrapper setExternalAddr(String externalAddr) {
         set("external_addr",externalAddr);
        return this;
    }
    /**
     * 外网ip地址
     */
    public VizMcMachineUpdateEntityWrapper setInternalAddr(String internalAddr) {
         set("internal_addr",internalAddr);
        return this;
    }
    /**
     * 设备唯一码
     */
    public VizMcMachineUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 实例Id
     */
    public VizMcMachineUpdateEntityWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 设备唯一码macAddr
     */
    public VizMcMachineUpdateEntityWrapper setMacAddr(String macAddr) {
         set("mac_addr",macAddr);
        return this;
    }
    /**
     * 云机端软件包版本
     */
    public VizMcMachineUpdateEntityWrapper setServiceSoftwarePackageVersion(String serviceSoftwarePackageVersion) {
         set("service_software_package_version",serviceSoftwarePackageVersion);
        return this;
    }
    /**
     * 设备型号
     */
    public VizMcMachineUpdateEntityWrapper setChipModel(String chipModel) {
         set("chip_model",chipModel);
        return this;
    }
    /**
     * 系统版本
     */
    public VizMcMachineUpdateEntityWrapper setOsVersion(String osVersion) {
         set("os_version",osVersion);
        return this;
    }
    /**
     * 销售状态(0：未售，1：已售)
     */
    public VizMcMachineUpdateEntityWrapper setSalesStatus(Integer salesStatus) {
         set("sales_status",salesStatus);
        return this;
    }
    /**
     * 3: 打开日志，127: 关闭日志
     */
    public VizMcMachineUpdateEntityWrapper setLogLevel(Integer logLevel) {
         set("log_level",logLevel);
        return this;
    }
    /**
     * 日志包名
     */
    public VizMcMachineUpdateEntityWrapper setLogPkg(String logPkg) {
         set("log_pkg",logPkg);
        return this;
    }
    /**
     * 供应商类型[1:huawei  2:tencent  3: baidu  4: etc]
     */
    public VizMcMachineUpdateEntityWrapper setSupplierType(Integer supplierType) {
         set("supplier_type",supplierType);
        return this;
    }
    /**
     * 设备状态(-50：删除，0：暂停使用，50：正常)
     */
    public VizMcMachineUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 版本id
     */
    public VizMcMachineUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcMachineUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public VizMcMachineUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 物理规格型号
     */
    public VizMcMachineUpdateEntityWrapper setSpecificationModel(String specificationModel) {
         set("specification_model",specificationModel);
        return this;
    }
    /**
     * 内存配额，单位为MB
     */
    public VizMcMachineUpdateEntityWrapper setMemoryLimit(Long memoryLimit) {
         set("memory_limit",memoryLimit);
        return this;
    }

    protected VizMcMachine entity() {
        if(entity==null){
            throw new NullPointerException("VizMcMachine is null");
        }
        return entity;
    }

    /**
     * 记录id自动增长
     */
    public VizMcMachineUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 机房记录id
     */
    public VizMcMachineUpdateEntityWrapper setFkExtCloudRegionId() {
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            set("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }
    /**
     * 机房名称【区域名称】
     */
    public VizMcMachineUpdateEntityWrapper setExtCloudRegionName() {
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            set("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }
    /**
     * 内网ip地址
     */
    public VizMcMachineUpdateEntityWrapper setExternalAddr() {
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            set("external_addr",externalAddr);
        }
        return this;
    }
    /**
     * 外网ip地址
     */
    public VizMcMachineUpdateEntityWrapper setInternalAddr() {
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            set("internal_addr",internalAddr);
        }
        return this;
    }
    /**
     * 设备唯一码
     */
    public VizMcMachineUpdateEntityWrapper setDeviceId() {
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            set("device_id",deviceId);
        }
        return this;
    }
    /**
     * 实例Id
     */
    public VizMcMachineUpdateEntityWrapper setInstanceId() {
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            set("instance_id",instanceId);
        }
        return this;
    }
    /**
     * 设备唯一码macAddr
     */
    public VizMcMachineUpdateEntityWrapper setMacAddr() {
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            set("mac_addr",macAddr);
        }
        return this;
    }
    /**
     * 云机端软件包版本
     */
    public VizMcMachineUpdateEntityWrapper setServiceSoftwarePackageVersion() {
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            set("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }
    /**
     * 设备型号
     */
    public VizMcMachineUpdateEntityWrapper setChipModel() {
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            set("chip_model",chipModel);
        }
        return this;
    }
    /**
     * 系统版本
     */
    public VizMcMachineUpdateEntityWrapper setOsVersion() {
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            set("os_version",osVersion);
        }
        return this;
    }
    /**
     * 销售状态(0：未售，1：已售)
     */
    public VizMcMachineUpdateEntityWrapper setSalesStatus() {
        Integer salesStatus =entity().getSalesStatus();
        if(salesStatus!=null){
            set("sales_status",salesStatus);
        }
        return this;
    }
    /**
     * 3: 打开日志，127: 关闭日志
     */
    public VizMcMachineUpdateEntityWrapper setLogLevel() {
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            set("log_level",logLevel);
        }
        return this;
    }
    /**
     * 日志包名
     */
    public VizMcMachineUpdateEntityWrapper setLogPkg() {
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            set("log_pkg",logPkg);
        }
        return this;
    }
    /**
     * 供应商类型[1:huawei  2:tencent  3: baidu  4: etc]
     */
    public VizMcMachineUpdateEntityWrapper setSupplierType() {
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            set("supplier_type",supplierType);
        }
        return this;
    }
    /**
     * 设备状态(-50：删除，0：暂停使用，50：正常)
     */
    public VizMcMachineUpdateEntityWrapper setStatus() {
        Integer status =entity().getStatus();
        if(status!=null){
            set("status",status);
        }
        return this;
    }
    /**
     * 版本id
     */
    public VizMcMachineUpdateEntityWrapper setVersionId() {
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            set("version_id",versionId);
        }
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcMachineUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 最后修改时间
     */
    public VizMcMachineUpdateEntityWrapper setLastUpdateTime() {
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            set("last_update_time",lastUpdateTime);
        }
        return this;
    }
    /**
     * 物理规格型号
     */
    public VizMcMachineUpdateEntityWrapper setSpecificationModel() {
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            set("specification_model",specificationModel);
        }
        return this;
    }
    /**
     * 内存配额，单位为MB
     */
    public VizMcMachineUpdateEntityWrapper setMemoryLimit() {
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            set("memory_limit",memoryLimit);
        }
        return this;
    }
    /**
     * <p>记录id自动增长</p>
     * 等于 = entity().getId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

/**
     * <p>记录id自动增长</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
    }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 等于 = entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdEq(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            eq("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 不等于 &lt;&gt; entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdNe(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            ne("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 大于 &gt; entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdGt(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            gt("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 大于等于 &gt;= entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdGe(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            ge("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 小于 &lt; entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdLt(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            lt("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 小于等于 &lt;= entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdLe(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            le("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * BETWEEN  entity().getFkExtCloudRegionId() AND 值2
     * @param fkExtCloudRegionIdEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdBetween(Long fkExtCloudRegionIdEnd){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null && fkExtCloudRegionIdEnd!=null){
            between("fk_ext_cloud_region_id",fkExtCloudRegionId,fkExtCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * NOT BETWEEN  entity().getFkExtCloudRegionId() AND 值2
     * @param fkExtCloudRegionIdEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdNotBetween(Long fkExtCloudRegionIdEnd){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null && fkExtCloudRegionIdEnd!=null){
            notBetween("fk_ext_cloud_region_id",fkExtCloudRegionId,fkExtCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * BETWEEN  entity().getFkExtCloudRegionId() AND 值2
     * @param fkExtCloudRegionIdStart       值1
     * @param fkExtCloudRegionIdEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdBetween(Long fkExtCloudRegionIdStart,Long fkExtCloudRegionIdEnd){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null && fkExtCloudRegionIdEnd!=null){
            between("fk_ext_cloud_region_id",fkExtCloudRegionIdStart,fkExtCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * NOT BETWEEN  entity().getFkExtCloudRegionId() AND 值2
     * @param fkExtCloudRegionIdStart       值1
     * @param fkExtCloudRegionIdEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdNotBetween(Long fkExtCloudRegionIdStart,Long fkExtCloudRegionIdEnd){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null && fkExtCloudRegionIdEnd!=null){
            notBetween("fk_ext_cloud_region_id",fkExtCloudRegionIdStart,fkExtCloudRegionIdEnd);
        }
        return this;
     }


    /**
     * <p>机房记录id</p>
     * LIKE '%值%' entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdLike(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            like("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * NOT LIKE '%值%' entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdNotLike(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            notLike("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }


    /**
     * <p>机房记录id</p>
     * LIKE '%值' entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdLikeLeft(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            likeLeft("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * LIKE '值%' entity().getFkExtCloudRegionId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdLikeRight(){
        Long fkExtCloudRegionId =entity().getFkExtCloudRegionId();
        if(fkExtCloudRegionId!=null){
            likeRight("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

/**
     * <p>机房记录id</p>
     * 等于 =
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdEq(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            eq("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 不等于 &lt;&gt;
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdNe(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            ne("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 大于 &gt;
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdGt(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            gt("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 大于等于 &gt;=
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdGe(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            ge("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 小于 &lt;
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdLt(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            lt("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 小于等于 &lt;=
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdLe(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            le("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * LIKE '%值%'
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdLike(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            like("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * NOT LIKE '%值%'
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdNotLike(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            notLike("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }


    /**
     * <p>机房记录id</p>
     * LIKE '%值'
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdLikeLeft(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            likeLeft("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * LIKE '值%'
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdLikeRight(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            likeRight("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdIsNull(){
        isNull("fk_ext_cloud_region_id");
        return this;
    }

    /**
     * <p>机房记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdIsNotNull(){
        isNotNull("fk_ext_cloud_region_id");
        return this;
    }

    /**
     * <p>机房记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_ext_cloud_region_id",value);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_ext_cloud_region_id",values);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_ext_cloud_region_id",value);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper fkExtCloudRegionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_ext_cloud_region_id",values);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 等于 = entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameEq(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            eq("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 不等于 &lt;&gt; entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameNe(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            ne("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 大于 &gt; entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameGt(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            gt("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 大于等于 &gt;= entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameGe(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            ge("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 小于 &lt; entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameLt(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            lt("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 小于等于 &lt;= entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameLe(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            le("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * BETWEEN  entity().getExtCloudRegionName() AND 值2
     * @param extCloudRegionNameEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameBetween(String extCloudRegionNameEnd){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null && extCloudRegionNameEnd!=null){
            between("ext_cloud_region_name",extCloudRegionName,extCloudRegionNameEnd);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT BETWEEN  entity().getExtCloudRegionName() AND 值2
     * @param extCloudRegionNameEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameNotBetween(String extCloudRegionNameEnd){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null && extCloudRegionNameEnd!=null){
            notBetween("ext_cloud_region_name",extCloudRegionName,extCloudRegionNameEnd);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * BETWEEN  entity().getExtCloudRegionName() AND 值2
     * @param extCloudRegionNameStart       值1
     * @param extCloudRegionNameEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameBetween(String extCloudRegionNameStart,String extCloudRegionNameEnd){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null && extCloudRegionNameEnd!=null){
            between("ext_cloud_region_name",extCloudRegionNameStart,extCloudRegionNameEnd);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT BETWEEN  entity().getExtCloudRegionName() AND 值2
     * @param extCloudRegionNameStart       值1
     * @param extCloudRegionNameEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameNotBetween(String extCloudRegionNameStart,String extCloudRegionNameEnd){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null && extCloudRegionNameEnd!=null){
            notBetween("ext_cloud_region_name",extCloudRegionNameStart,extCloudRegionNameEnd);
        }
        return this;
     }


    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '%值%' entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameLike(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            like("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT LIKE '%值%' entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameNotLike(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            notLike("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }


    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '%值' entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameLikeLeft(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            likeLeft("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '值%' entity().getExtCloudRegionName()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameLikeRight(){
        String extCloudRegionName =entity().getExtCloudRegionName();
        if(extCloudRegionName!=null){
            likeRight("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

/**
     * <p>机房名称【区域名称】</p>
     * 等于 =
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameEq(String extCloudRegionName){
        if(extCloudRegionName!=null){
            eq("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 不等于 &lt;&gt;
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameNe(String extCloudRegionName){
        if(extCloudRegionName!=null){
            ne("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 大于 &gt;
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameGt(String extCloudRegionName){
        if(extCloudRegionName!=null){
            gt("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 大于等于 &gt;=
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameGe(String extCloudRegionName){
        if(extCloudRegionName!=null){
            ge("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 小于 &lt;
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameLt(String extCloudRegionName){
        if(extCloudRegionName!=null){
            lt("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 小于等于 &lt;=
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameLe(String extCloudRegionName){
        if(extCloudRegionName!=null){
            le("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '%值%'
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameLike(String extCloudRegionName){
        if(extCloudRegionName!=null){
            like("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT LIKE '%值%'
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameNotLike(String extCloudRegionName){
        if(extCloudRegionName!=null){
            notLike("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }


    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '%值'
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameLikeLeft(String extCloudRegionName){
        if(extCloudRegionName!=null){
            likeLeft("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '值%'
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameLikeRight(String extCloudRegionName){
        if(extCloudRegionName!=null){
            likeRight("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameIsNull(){
        isNull("ext_cloud_region_name");
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameIsNotNull(){
        isNotNull("ext_cloud_region_name");
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("ext_cloud_region_name",value);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameIn(String... values){
        if(values!=null && values.length>0){
            in("ext_cloud_region_name",values);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("ext_cloud_region_name",value);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper extCloudRegionNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("ext_cloud_region_name",values);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 等于 = entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrEq(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 不等于 &lt;&gt; entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrNe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于 &gt; entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrGt(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于等于 &gt;= entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrGe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于 &lt; entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrLt(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于等于 &lt;= entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrLe(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrBetween(String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            between("external_addr",externalAddr,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrNotBetween(String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddr,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            between("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT BETWEEN  entity().getExternalAddr() AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值%' entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrLike(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT LIKE '%值%' entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrNotLike(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值' entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrLikeLeft(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * LIKE '值%' entity().getExternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrLikeRight(){
        String externalAddr =entity().getExternalAddr();
        if(externalAddr!=null){
            likeRight("external_addr",externalAddr);
        }
        return this;
     }

/**
     * <p>内网ip地址</p>
     * 等于 =
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrEq(String externalAddr){
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 不等于 &lt;&gt;
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrNe(String externalAddr){
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 大于 &gt;
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrGt(String externalAddr){
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 大于等于 &gt;=
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrGe(String externalAddr){
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 小于 &lt;
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrLt(String externalAddr){
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 小于等于 &lt;=
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrLe(String externalAddr){
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrLike(String externalAddr){
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * NOT LIKE '%值%'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrNotLike(String externalAddr){
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
    }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrLikeLeft(String externalAddr){
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * LIKE '值%'
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrLikeRight(String externalAddr){
        if(externalAddr!=null){
            likeRight("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("external_addr",value);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrIn(String... values){
        if(values!=null && values.length>0){
            in("external_addr",values);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("external_addr",value);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper externalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_addr",values);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 等于 = entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrEq(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 不等于 &lt;&gt; entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrNe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于 &gt; entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrGt(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于等于 &gt;= entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrGe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于 &lt; entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrLt(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于等于 &lt;= entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrLe(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrBetween(String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddr,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrNotBetween(String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddr,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT BETWEEN  entity().getInternalAddr() AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值%' entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrLike(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT LIKE '%值%' entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrNotLike(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值' entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrLikeLeft(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * LIKE '值%' entity().getInternalAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrLikeRight(){
        String internalAddr =entity().getInternalAddr();
        if(internalAddr!=null){
            likeRight("internal_addr",internalAddr);
        }
        return this;
     }

/**
     * <p>外网ip地址</p>
     * 等于 =
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrEq(String internalAddr){
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 不等于 &lt;&gt;
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrNe(String internalAddr){
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 大于 &gt;
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrGt(String internalAddr){
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 大于等于 &gt;=
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrGe(String internalAddr){
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 小于 &lt;
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrLt(String internalAddr){
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 小于等于 &lt;=
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrLe(String internalAddr){
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrLike(String internalAddr){
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * NOT LIKE '%值%'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrNotLike(String internalAddr){
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
    }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrLikeLeft(String internalAddr){
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * LIKE '值%'
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrLikeRight(String internalAddr){
        if(internalAddr!=null){
            likeRight("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("internal_addr",value);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrIn(String... values){
        if(values!=null && values.length>0){
            in("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("internal_addr",value);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper internalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper deviceIdEq(){
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
    public VizMcMachineUpdateEntityWrapper deviceIdNe(){
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
    public VizMcMachineUpdateEntityWrapper deviceIdGt(){
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
    public VizMcMachineUpdateEntityWrapper deviceIdGe(){
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
    public VizMcMachineUpdateEntityWrapper deviceIdLt(){
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
    public VizMcMachineUpdateEntityWrapper deviceIdLe(){
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
    public VizMcMachineUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public VizMcMachineUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public VizMcMachineUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineUpdateEntityWrapper deviceIdLike(){
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
    public VizMcMachineUpdateEntityWrapper deviceIdNotLike(){
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
    public VizMcMachineUpdateEntityWrapper deviceIdLikeLeft(){
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
    public VizMcMachineUpdateEntityWrapper deviceIdLikeRight(){
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
    public VizMcMachineUpdateEntityWrapper deviceIdEq(String deviceId){
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
    public VizMcMachineUpdateEntityWrapper deviceIdNe(String deviceId){
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
    public VizMcMachineUpdateEntityWrapper deviceIdGt(String deviceId){
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
    public VizMcMachineUpdateEntityWrapper deviceIdGe(String deviceId){
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
    public VizMcMachineUpdateEntityWrapper deviceIdLt(String deviceId){
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
    public VizMcMachineUpdateEntityWrapper deviceIdLe(String deviceId){
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
    public VizMcMachineUpdateEntityWrapper deviceIdLike(String deviceId){
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
    public VizMcMachineUpdateEntityWrapper deviceIdNotLike(String deviceId){
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
    public VizMcMachineUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcMachineUpdateEntityWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcMachineUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper deviceIdIn(Collection<String> value){
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
    public VizMcMachineUpdateEntityWrapper deviceIdIn(String... values){
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
    public VizMcMachineUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcMachineUpdateEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 等于 = entity().getInstanceId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdEq(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 不等于 &lt;&gt; entity().getInstanceId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdNe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于 &gt; entity().getInstanceId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdGt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于等于 &gt;= entity().getInstanceId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdGe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于 &lt; entity().getInstanceId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdLt(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于等于 &lt;= entity().getInstanceId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdLe(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceId,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdNotBetween(String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceId,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT BETWEEN  entity().getInstanceId() AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT LIKE '%值%' entity().getInstanceId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdNotLike(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值' entity().getInstanceId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdLikeLeft(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * LIKE '值%' entity().getInstanceId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdLikeRight(){
        String instanceId =entity().getInstanceId();
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
     }

/**
     * <p>实例Id</p>
     * 等于 =
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 不等于 &lt;&gt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 大于 &gt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 大于等于 &gt;=
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 小于 &lt;
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 小于等于 &lt;=
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * NOT LIKE '%值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
    }


    /**
     * <p>实例Id</p>
     * LIKE '%值'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * LIKE '值%'
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdLikeRight(String instanceId){
        if(instanceId!=null){
            likeRight("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("instance_id",values);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("instance_id",value);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 等于 = entity().getMacAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrEq(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            eq("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 不等于 &lt;&gt; entity().getMacAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrNe(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            ne("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 大于 &gt; entity().getMacAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrGt(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            gt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 大于等于 &gt;= entity().getMacAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrGe(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            ge("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 小于 &lt; entity().getMacAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrLt(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            lt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 小于等于 &lt;= entity().getMacAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrLe(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            le("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrBetween(String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            between("mac_addr",macAddr,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrNotBetween(String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            notBetween("mac_addr",macAddr,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrBetween(String macAddrStart,String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            between("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT BETWEEN  entity().getMacAddr() AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrNotBetween(String macAddrStart,String macAddrEnd){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null && macAddrEnd!=null){
            notBetween("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '%值%' entity().getMacAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrLike(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            like("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT LIKE '%值%' entity().getMacAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrNotLike(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            notLike("mac_addr",macAddr);
        }
        return this;
     }


    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '%值' entity().getMacAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrLikeLeft(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            likeLeft("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '值%' entity().getMacAddr()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrLikeRight(){
        String macAddr =entity().getMacAddr();
        if(macAddr!=null){
            likeRight("mac_addr",macAddr);
        }
        return this;
     }

/**
     * <p>设备唯一码macAddr</p>
     * 等于 =
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrEq(String macAddr){
        if(macAddr!=null){
            eq("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 不等于 &lt;&gt;
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrNe(String macAddr){
        if(macAddr!=null){
            ne("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 大于 &gt;
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrGt(String macAddr){
        if(macAddr!=null){
            gt("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 大于等于 &gt;=
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrGe(String macAddr){
        if(macAddr!=null){
            ge("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 小于 &lt;
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrLt(String macAddr){
        if(macAddr!=null){
            lt("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 小于等于 &lt;=
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrLe(String macAddr){
        if(macAddr!=null){
            le("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '%值%'
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrLike(String macAddr){
        if(macAddr!=null){
            like("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT LIKE '%值%'
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrNotLike(String macAddr){
        if(macAddr!=null){
            notLike("mac_addr",macAddr);
        }
        return this;
    }


    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '%值'
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrLikeLeft(String macAddr){
        if(macAddr!=null){
            likeLeft("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '值%'
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrLikeRight(String macAddr){
        if(macAddr!=null){
            likeRight("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrIsNull(){
        isNull("mac_addr");
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrIsNotNull(){
        isNotNull("mac_addr");
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("mac_addr",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrIn(String... values){
        if(values!=null && values.length>0){
            in("mac_addr",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("mac_addr",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper macAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("mac_addr",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 等于 = entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionEq(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            eq("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 不等于 &lt;&gt; entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionNe(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            ne("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 大于 &gt; entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionGt(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            gt("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 大于等于 &gt;= entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionGe(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            ge("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 小于 &lt; entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionLt(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            lt("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 小于等于 &lt;= entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionLe(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            le("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * BETWEEN  entity().getServiceSoftwarePackageVersion() AND 值2
     * @param serviceSoftwarePackageVersionEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionBetween(String serviceSoftwarePackageVersionEnd){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null && serviceSoftwarePackageVersionEnd!=null){
            between("service_software_package_version",serviceSoftwarePackageVersion,serviceSoftwarePackageVersionEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * NOT BETWEEN  entity().getServiceSoftwarePackageVersion() AND 值2
     * @param serviceSoftwarePackageVersionEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionNotBetween(String serviceSoftwarePackageVersionEnd){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null && serviceSoftwarePackageVersionEnd!=null){
            notBetween("service_software_package_version",serviceSoftwarePackageVersion,serviceSoftwarePackageVersionEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * BETWEEN  entity().getServiceSoftwarePackageVersion() AND 值2
     * @param serviceSoftwarePackageVersionStart       值1
     * @param serviceSoftwarePackageVersionEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionBetween(String serviceSoftwarePackageVersionStart,String serviceSoftwarePackageVersionEnd){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null && serviceSoftwarePackageVersionEnd!=null){
            between("service_software_package_version",serviceSoftwarePackageVersionStart,serviceSoftwarePackageVersionEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * NOT BETWEEN  entity().getServiceSoftwarePackageVersion() AND 值2
     * @param serviceSoftwarePackageVersionStart       值1
     * @param serviceSoftwarePackageVersionEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionNotBetween(String serviceSoftwarePackageVersionStart,String serviceSoftwarePackageVersionEnd){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null && serviceSoftwarePackageVersionEnd!=null){
            notBetween("service_software_package_version",serviceSoftwarePackageVersionStart,serviceSoftwarePackageVersionEnd);
        }
        return this;
     }


    /**
     * <p>云机端软件包版本</p>
     * LIKE '%值%' entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionLike(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            like("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * NOT LIKE '%值%' entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionNotLike(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            notLike("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }


    /**
     * <p>云机端软件包版本</p>
     * LIKE '%值' entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionLikeLeft(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            likeLeft("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * LIKE '值%' entity().getServiceSoftwarePackageVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionLikeRight(){
        String serviceSoftwarePackageVersion =entity().getServiceSoftwarePackageVersion();
        if(serviceSoftwarePackageVersion!=null){
            likeRight("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

/**
     * <p>云机端软件包版本</p>
     * 等于 =
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionEq(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            eq("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 不等于 &lt;&gt;
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionNe(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            ne("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 大于 &gt;
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionGt(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            gt("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 大于等于 &gt;=
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionGe(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            ge("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 小于 &lt;
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionLt(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            lt("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 小于等于 &lt;=
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionLe(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            le("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * LIKE '%值%'
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionLike(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            like("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * NOT LIKE '%值%'
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionNotLike(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            notLike("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }


    /**
     * <p>云机端软件包版本</p>
     * LIKE '%值'
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionLikeLeft(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            likeLeft("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * LIKE '值%'
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionLikeRight(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            likeRight("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionIsNull(){
        isNull("service_software_package_version");
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionIsNotNull(){
        isNotNull("service_software_package_version");
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("service_software_package_version",value);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionIn(String... values){
        if(values!=null && values.length>0){
            in("service_software_package_version",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("service_software_package_version",value);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper serviceSoftwarePackageVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("service_software_package_version",values);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 等于 = entity().getChipModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelEq(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            eq("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 不等于 &lt;&gt; entity().getChipModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelNe(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            ne("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 大于 &gt; entity().getChipModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelGt(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            gt("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 大于等于 &gt;= entity().getChipModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelGe(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            ge("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 小于 &lt; entity().getChipModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelLt(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            lt("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 小于等于 &lt;= entity().getChipModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelLe(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            le("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * BETWEEN  entity().getChipModel() AND 值2
     * @param chipModelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelBetween(String chipModelEnd){
        String chipModel =entity().getChipModel();
        if(chipModel!=null && chipModelEnd!=null){
            between("chip_model",chipModel,chipModelEnd);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * NOT BETWEEN  entity().getChipModel() AND 值2
     * @param chipModelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelNotBetween(String chipModelEnd){
        String chipModel =entity().getChipModel();
        if(chipModel!=null && chipModelEnd!=null){
            notBetween("chip_model",chipModel,chipModelEnd);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * BETWEEN  entity().getChipModel() AND 值2
     * @param chipModelStart       值1
     * @param chipModelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelBetween(String chipModelStart,String chipModelEnd){
        String chipModel =entity().getChipModel();
        if(chipModel!=null && chipModelEnd!=null){
            between("chip_model",chipModelStart,chipModelEnd);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * NOT BETWEEN  entity().getChipModel() AND 值2
     * @param chipModelStart       值1
     * @param chipModelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelNotBetween(String chipModelStart,String chipModelEnd){
        String chipModel =entity().getChipModel();
        if(chipModel!=null && chipModelEnd!=null){
            notBetween("chip_model",chipModelStart,chipModelEnd);
        }
        return this;
     }


    /**
     * <p>设备型号</p>
     * LIKE '%值%' entity().getChipModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelLike(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            like("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * NOT LIKE '%值%' entity().getChipModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelNotLike(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            notLike("chip_model",chipModel);
        }
        return this;
     }


    /**
     * <p>设备型号</p>
     * LIKE '%值' entity().getChipModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelLikeLeft(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            likeLeft("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * LIKE '值%' entity().getChipModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelLikeRight(){
        String chipModel =entity().getChipModel();
        if(chipModel!=null){
            likeRight("chip_model",chipModel);
        }
        return this;
     }

/**
     * <p>设备型号</p>
     * 等于 =
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelEq(String chipModel){
        if(chipModel!=null){
            eq("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 不等于 &lt;&gt;
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelNe(String chipModel){
        if(chipModel!=null){
            ne("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 大于 &gt;
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelGt(String chipModel){
        if(chipModel!=null){
            gt("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 大于等于 &gt;=
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelGe(String chipModel){
        if(chipModel!=null){
            ge("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 小于 &lt;
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelLt(String chipModel){
        if(chipModel!=null){
            lt("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 小于等于 &lt;=
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelLe(String chipModel){
        if(chipModel!=null){
            le("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * LIKE '%值%'
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelLike(String chipModel){
        if(chipModel!=null){
            like("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * NOT LIKE '%值%'
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelNotLike(String chipModel){
        if(chipModel!=null){
            notLike("chip_model",chipModel);
        }
        return this;
    }


    /**
     * <p>设备型号</p>
     * LIKE '%值'
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelLikeLeft(String chipModel){
        if(chipModel!=null){
            likeLeft("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * LIKE '值%'
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelLikeRight(String chipModel){
        if(chipModel!=null){
            likeRight("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelIsNull(){
        isNull("chip_model");
        return this;
    }

    /**
     * <p>设备型号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelIsNotNull(){
        isNotNull("chip_model");
        return this;
    }

    /**
     * <p>设备型号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("chip_model",value);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelIn(String... values){
        if(values!=null && values.length>0){
            in("chip_model",values);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("chip_model",value);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper chipModelNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("chip_model",values);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 等于 = entity().getOsVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionEq(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            eq("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 不等于 &lt;&gt; entity().getOsVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionNe(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            ne("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于 &gt; entity().getOsVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionGt(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            gt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于等于 &gt;= entity().getOsVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionGe(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            ge("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于 &lt; entity().getOsVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionLt(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            lt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于等于 &lt;= entity().getOsVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionLe(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            le("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionBetween(String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            between("os_version",osVersion,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionNotBetween(String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            notBetween("os_version",osVersion,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionBetween(String osVersionStart,String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            between("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT BETWEEN  entity().getOsVersion() AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionNotBetween(String osVersionStart,String osVersionEnd){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null && osVersionEnd!=null){
            notBetween("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值%' entity().getOsVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionLike(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            like("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT LIKE '%值%' entity().getOsVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionNotLike(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            notLike("os_version",osVersion);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值' entity().getOsVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionLikeLeft(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            likeLeft("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * LIKE '值%' entity().getOsVersion()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionLikeRight(){
        String osVersion =entity().getOsVersion();
        if(osVersion!=null){
            likeRight("os_version",osVersion);
        }
        return this;
     }

/**
     * <p>系统版本</p>
     * 等于 =
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionEq(String osVersion){
        if(osVersion!=null){
            eq("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 不等于 &lt;&gt;
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionNe(String osVersion){
        if(osVersion!=null){
            ne("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 大于 &gt;
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionGt(String osVersion){
        if(osVersion!=null){
            gt("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 大于等于 &gt;=
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionGe(String osVersion){
        if(osVersion!=null){
            ge("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 小于 &lt;
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionLt(String osVersion){
        if(osVersion!=null){
            lt("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 小于等于 &lt;=
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionLe(String osVersion){
        if(osVersion!=null){
            le("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * LIKE '%值%'
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionLike(String osVersion){
        if(osVersion!=null){
            like("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * NOT LIKE '%值%'
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionNotLike(String osVersion){
        if(osVersion!=null){
            notLike("os_version",osVersion);
        }
        return this;
    }


    /**
     * <p>系统版本</p>
     * LIKE '%值'
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionLikeLeft(String osVersion){
        if(osVersion!=null){
            likeLeft("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * LIKE '值%'
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionLikeRight(String osVersion){
        if(osVersion!=null){
            likeRight("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionIsNull(){
        isNull("os_version");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionIsNotNull(){
        isNotNull("os_version");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("os_version",value);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionIn(String... values){
        if(values!=null && values.length>0){
            in("os_version",values);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("os_version",value);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper osVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os_version",values);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 等于 = entity().getSalesStatus()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper salesStatusEq(){
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
    public VizMcMachineUpdateEntityWrapper salesStatusNe(){
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
    public VizMcMachineUpdateEntityWrapper salesStatusGt(){
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
    public VizMcMachineUpdateEntityWrapper salesStatusGe(){
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
    public VizMcMachineUpdateEntityWrapper salesStatusLt(){
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
    public VizMcMachineUpdateEntityWrapper salesStatusLe(){
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
    public VizMcMachineUpdateEntityWrapper salesStatusBetween(Integer salesStatusEnd){
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
    public VizMcMachineUpdateEntityWrapper salesStatusNotBetween(Integer salesStatusEnd){
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
    public VizMcMachineUpdateEntityWrapper salesStatusBetween(Integer salesStatusStart,Integer salesStatusEnd){
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
    public VizMcMachineUpdateEntityWrapper salesStatusNotBetween(Integer salesStatusStart,Integer salesStatusEnd){
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
    public VizMcMachineUpdateEntityWrapper salesStatusLike(){
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
    public VizMcMachineUpdateEntityWrapper salesStatusNotLike(){
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
    public VizMcMachineUpdateEntityWrapper salesStatusLikeLeft(){
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
    public VizMcMachineUpdateEntityWrapper salesStatusLikeRight(){
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
    public VizMcMachineUpdateEntityWrapper salesStatusEq(Integer salesStatus){
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
    public VizMcMachineUpdateEntityWrapper salesStatusNe(Integer salesStatus){
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
    public VizMcMachineUpdateEntityWrapper salesStatusGt(Integer salesStatus){
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
    public VizMcMachineUpdateEntityWrapper salesStatusGe(Integer salesStatus){
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
    public VizMcMachineUpdateEntityWrapper salesStatusLt(Integer salesStatus){
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
    public VizMcMachineUpdateEntityWrapper salesStatusLe(Integer salesStatus){
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
    public VizMcMachineUpdateEntityWrapper salesStatusLike(Integer salesStatus){
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
    public VizMcMachineUpdateEntityWrapper salesStatusNotLike(Integer salesStatus){
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
    public VizMcMachineUpdateEntityWrapper salesStatusLikeLeft(Integer salesStatus){
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
    public VizMcMachineUpdateEntityWrapper salesStatusLikeRight(Integer salesStatus){
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
    public VizMcMachineUpdateEntityWrapper salesStatusIsNull(){
        isNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper salesStatusIsNotNull(){
        isNotNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper salesStatusIn(Collection<Integer> value){
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
    public VizMcMachineUpdateEntityWrapper salesStatusIn(Integer... values){
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
    public VizMcMachineUpdateEntityWrapper salesStatusNotIn(Collection<Integer> value){
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
    public VizMcMachineUpdateEntityWrapper salesStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("sales_status",values);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 等于 = entity().getLogLevel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelEq(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            eq("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 不等于 &lt;&gt; entity().getLogLevel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelNe(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            ne("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于 &gt; entity().getLogLevel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelGt(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            gt("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于等于 &gt;= entity().getLogLevel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelGe(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            ge("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于 &lt; entity().getLogLevel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelLt(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            lt("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于等于 &lt;= entity().getLogLevel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelLe(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            le("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * BETWEEN  entity().getLogLevel() AND 值2
     * @param logLevelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelBetween(Integer logLevelEnd){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null && logLevelEnd!=null){
            between("log_level",logLevel,logLevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT BETWEEN  entity().getLogLevel() AND 值2
     * @param logLevelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelNotBetween(Integer logLevelEnd){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null && logLevelEnd!=null){
            notBetween("log_level",logLevel,logLevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * BETWEEN  entity().getLogLevel() AND 值2
     * @param logLevelStart       值1
     * @param logLevelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelBetween(Integer logLevelStart,Integer logLevelEnd){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null && logLevelEnd!=null){
            between("log_level",logLevelStart,logLevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT BETWEEN  entity().getLogLevel() AND 值2
     * @param logLevelStart       值1
     * @param logLevelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelNotBetween(Integer logLevelStart,Integer logLevelEnd){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null && logLevelEnd!=null){
            notBetween("log_level",logLevelStart,logLevelEnd);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值%' entity().getLogLevel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelLike(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            like("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT LIKE '%值%' entity().getLogLevel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelNotLike(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            notLike("log_level",logLevel);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值' entity().getLogLevel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelLikeLeft(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            likeLeft("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '值%' entity().getLogLevel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelLikeRight(){
        Integer logLevel =entity().getLogLevel();
        if(logLevel!=null){
            likeRight("log_level",logLevel);
        }
        return this;
     }

/**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 等于 =
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelEq(Integer logLevel){
        if(logLevel!=null){
            eq("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 不等于 &lt;&gt;
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelNe(Integer logLevel){
        if(logLevel!=null){
            ne("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于 &gt;
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelGt(Integer logLevel){
        if(logLevel!=null){
            gt("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于等于 &gt;=
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelGe(Integer logLevel){
        if(logLevel!=null){
            ge("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于 &lt;
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelLt(Integer logLevel){
        if(logLevel!=null){
            lt("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于等于 &lt;=
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelLe(Integer logLevel){
        if(logLevel!=null){
            le("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值%'
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelLike(Integer logLevel){
        if(logLevel!=null){
            like("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT LIKE '%值%'
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelNotLike(Integer logLevel){
        if(logLevel!=null){
            notLike("log_level",logLevel);
        }
        return this;
    }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值'
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelLikeLeft(Integer logLevel){
        if(logLevel!=null){
            likeLeft("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '值%'
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelLikeRight(Integer logLevel){
        if(logLevel!=null){
            likeRight("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelIsNull(){
        isNull("log_level");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelIsNotNull(){
        isNotNull("log_level");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("log_level",value);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelIn(Integer... values){
        if(values!=null && values.length>0){
            in("log_level",values);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("log_level",value);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logLevelNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("log_level",values);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 等于 = entity().getLogPkg()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgEq(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            eq("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 不等于 &lt;&gt; entity().getLogPkg()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgNe(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            ne("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 大于 &gt; entity().getLogPkg()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgGt(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            gt("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 大于等于 &gt;= entity().getLogPkg()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgGe(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            ge("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 小于 &lt; entity().getLogPkg()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgLt(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            lt("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 小于等于 &lt;= entity().getLogPkg()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgLe(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            le("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * BETWEEN  entity().getLogPkg() AND 值2
     * @param logPkgEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgBetween(String logPkgEnd){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null && logPkgEnd!=null){
            between("log_pkg",logPkg,logPkgEnd);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * NOT BETWEEN  entity().getLogPkg() AND 值2
     * @param logPkgEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgNotBetween(String logPkgEnd){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null && logPkgEnd!=null){
            notBetween("log_pkg",logPkg,logPkgEnd);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * BETWEEN  entity().getLogPkg() AND 值2
     * @param logPkgStart       值1
     * @param logPkgEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgBetween(String logPkgStart,String logPkgEnd){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null && logPkgEnd!=null){
            between("log_pkg",logPkgStart,logPkgEnd);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * NOT BETWEEN  entity().getLogPkg() AND 值2
     * @param logPkgStart       值1
     * @param logPkgEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgNotBetween(String logPkgStart,String logPkgEnd){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null && logPkgEnd!=null){
            notBetween("log_pkg",logPkgStart,logPkgEnd);
        }
        return this;
     }


    /**
     * <p>日志包名</p>
     * LIKE '%值%' entity().getLogPkg()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgLike(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            like("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * NOT LIKE '%值%' entity().getLogPkg()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgNotLike(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            notLike("log_pkg",logPkg);
        }
        return this;
     }


    /**
     * <p>日志包名</p>
     * LIKE '%值' entity().getLogPkg()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgLikeLeft(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            likeLeft("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * LIKE '值%' entity().getLogPkg()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgLikeRight(){
        String logPkg =entity().getLogPkg();
        if(logPkg!=null){
            likeRight("log_pkg",logPkg);
        }
        return this;
     }

/**
     * <p>日志包名</p>
     * 等于 =
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgEq(String logPkg){
        if(logPkg!=null){
            eq("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 不等于 &lt;&gt;
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgNe(String logPkg){
        if(logPkg!=null){
            ne("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 大于 &gt;
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgGt(String logPkg){
        if(logPkg!=null){
            gt("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 大于等于 &gt;=
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgGe(String logPkg){
        if(logPkg!=null){
            ge("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 小于 &lt;
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgLt(String logPkg){
        if(logPkg!=null){
            lt("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 小于等于 &lt;=
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgLe(String logPkg){
        if(logPkg!=null){
            le("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * LIKE '%值%'
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgLike(String logPkg){
        if(logPkg!=null){
            like("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * NOT LIKE '%值%'
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgNotLike(String logPkg){
        if(logPkg!=null){
            notLike("log_pkg",logPkg);
        }
        return this;
    }


    /**
     * <p>日志包名</p>
     * LIKE '%值'
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgLikeLeft(String logPkg){
        if(logPkg!=null){
            likeLeft("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * LIKE '值%'
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgLikeRight(String logPkg){
        if(logPkg!=null){
            likeRight("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgIsNull(){
        isNull("log_pkg");
        return this;
    }

    /**
     * <p>日志包名</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgIsNotNull(){
        isNotNull("log_pkg");
        return this;
    }

    /**
     * <p>日志包名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("log_pkg",value);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgIn(String... values){
        if(values!=null && values.length>0){
            in("log_pkg",values);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("log_pkg",value);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper logPkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("log_pkg",values);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 等于 = entity().getSupplierType()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeEq(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 不等于 &lt;&gt; entity().getSupplierType()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeNe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 大于 &gt; entity().getSupplierType()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeGt(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 大于等于 &gt;= entity().getSupplierType()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeGe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 小于 &lt; entity().getSupplierType()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeLt(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 小于等于 &lt;= entity().getSupplierType()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeLe(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeBetween(Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierType,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeNotBetween(Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierType,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT BETWEEN  entity().getSupplierType() AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeNotBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '%值%' entity().getSupplierType()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeLike(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT LIKE '%值%' entity().getSupplierType()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeNotLike(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '%值' entity().getSupplierType()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeLikeLeft(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '值%' entity().getSupplierType()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeLikeRight(){
        Integer supplierType =entity().getSupplierType();
        if(supplierType!=null){
            likeRight("supplier_type",supplierType);
        }
        return this;
     }

/**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 等于 =
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeEq(Integer supplierType){
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 不等于 &lt;&gt;
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeNe(Integer supplierType){
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 大于 &gt;
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeGt(Integer supplierType){
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 大于等于 &gt;=
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeGe(Integer supplierType){
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 小于 &lt;
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeLt(Integer supplierType){
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 小于等于 &lt;=
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeLe(Integer supplierType){
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeLike(Integer supplierType){
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeNotLike(Integer supplierType){
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
    }


    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '%值'
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeLikeLeft(Integer supplierType){
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '值%'
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeLikeRight(Integer supplierType){
        if(supplierType!=null){
            likeRight("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeIsNull(){
        isNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeIsNotNull(){
        isNotNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("supplier_type",values);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper supplierTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("supplier_type",values);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper statusEq(){
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
    public VizMcMachineUpdateEntityWrapper statusNe(){
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
    public VizMcMachineUpdateEntityWrapper statusGt(){
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
    public VizMcMachineUpdateEntityWrapper statusGe(){
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
    public VizMcMachineUpdateEntityWrapper statusLt(){
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
    public VizMcMachineUpdateEntityWrapper statusLe(){
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
    public VizMcMachineUpdateEntityWrapper statusBetween(Integer statusEnd){
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
    public VizMcMachineUpdateEntityWrapper statusNotBetween(Integer statusEnd){
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
    public VizMcMachineUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public VizMcMachineUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
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
    public VizMcMachineUpdateEntityWrapper statusLike(){
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
    public VizMcMachineUpdateEntityWrapper statusNotLike(){
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
    public VizMcMachineUpdateEntityWrapper statusLikeLeft(){
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
    public VizMcMachineUpdateEntityWrapper statusLikeRight(){
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
    public VizMcMachineUpdateEntityWrapper statusEq(Integer status){
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
    public VizMcMachineUpdateEntityWrapper statusNe(Integer status){
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
    public VizMcMachineUpdateEntityWrapper statusGt(Integer status){
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
    public VizMcMachineUpdateEntityWrapper statusGe(Integer status){
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
    public VizMcMachineUpdateEntityWrapper statusLt(Integer status){
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
    public VizMcMachineUpdateEntityWrapper statusLe(Integer status){
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
    public VizMcMachineUpdateEntityWrapper statusLike(Integer status){
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
    public VizMcMachineUpdateEntityWrapper statusNotLike(Integer status){
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
    public VizMcMachineUpdateEntityWrapper statusLikeLeft(Integer status){
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
    public VizMcMachineUpdateEntityWrapper statusLikeRight(Integer status){
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
    public VizMcMachineUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper statusIn(Collection<Integer> value){
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
    public VizMcMachineUpdateEntityWrapper statusIn(Integer... values){
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
    public VizMcMachineUpdateEntityWrapper statusNotIn(Collection<Integer> value){
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
    public VizMcMachineUpdateEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper versionIdEq(){
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
    public VizMcMachineUpdateEntityWrapper versionIdNe(){
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
    public VizMcMachineUpdateEntityWrapper versionIdGt(){
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
    public VizMcMachineUpdateEntityWrapper versionIdGe(){
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
    public VizMcMachineUpdateEntityWrapper versionIdLt(){
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
    public VizMcMachineUpdateEntityWrapper versionIdLe(){
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
    public VizMcMachineUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public VizMcMachineUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public VizMcMachineUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineUpdateEntityWrapper versionIdLike(){
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
    public VizMcMachineUpdateEntityWrapper versionIdNotLike(){
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
    public VizMcMachineUpdateEntityWrapper versionIdLikeLeft(){
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
    public VizMcMachineUpdateEntityWrapper versionIdLikeRight(){
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
    public VizMcMachineUpdateEntityWrapper versionIdEq(Long versionId){
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
    public VizMcMachineUpdateEntityWrapper versionIdNe(Long versionId){
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
    public VizMcMachineUpdateEntityWrapper versionIdGt(Long versionId){
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
    public VizMcMachineUpdateEntityWrapper versionIdGe(Long versionId){
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
    public VizMcMachineUpdateEntityWrapper versionIdLt(Long versionId){
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
    public VizMcMachineUpdateEntityWrapper versionIdLe(Long versionId){
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
    public VizMcMachineUpdateEntityWrapper versionIdLike(Long versionId){
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
    public VizMcMachineUpdateEntityWrapper versionIdNotLike(Long versionId){
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
    public VizMcMachineUpdateEntityWrapper versionIdLikeLeft(Long versionId){
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
    public VizMcMachineUpdateEntityWrapper versionIdLikeRight(Long versionId){
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
    public VizMcMachineUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper versionIdIn(Collection<Long> value){
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
    public VizMcMachineUpdateEntityWrapper versionIdIn(Long... values){
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
    public VizMcMachineUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcMachineUpdateEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

/**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
    }


    /**
     * <p>创建时间</p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

/**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
    }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 等于 = entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelEq(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            eq("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 不等于 &lt;&gt; entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelNe(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            ne("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 大于 &gt; entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelGt(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            gt("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 大于等于 &gt;= entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelGe(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            ge("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 小于 &lt; entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelLt(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            lt("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 小于等于 &lt;= entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelLe(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            le("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * BETWEEN  entity().getSpecificationModel() AND 值2
     * @param specificationModelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelBetween(String specificationModelEnd){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null && specificationModelEnd!=null){
            between("specification_model",specificationModel,specificationModelEnd);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * NOT BETWEEN  entity().getSpecificationModel() AND 值2
     * @param specificationModelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelNotBetween(String specificationModelEnd){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null && specificationModelEnd!=null){
            notBetween("specification_model",specificationModel,specificationModelEnd);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * BETWEEN  entity().getSpecificationModel() AND 值2
     * @param specificationModelStart       值1
     * @param specificationModelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelBetween(String specificationModelStart,String specificationModelEnd){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null && specificationModelEnd!=null){
            between("specification_model",specificationModelStart,specificationModelEnd);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * NOT BETWEEN  entity().getSpecificationModel() AND 值2
     * @param specificationModelStart       值1
     * @param specificationModelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelNotBetween(String specificationModelStart,String specificationModelEnd){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null && specificationModelEnd!=null){
            notBetween("specification_model",specificationModelStart,specificationModelEnd);
        }
        return this;
     }


    /**
     * <p>物理规格型号</p>
     * LIKE '%值%' entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelLike(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            like("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * NOT LIKE '%值%' entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelNotLike(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            notLike("specification_model",specificationModel);
        }
        return this;
     }


    /**
     * <p>物理规格型号</p>
     * LIKE '%值' entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelLikeLeft(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            likeLeft("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * LIKE '值%' entity().getSpecificationModel()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelLikeRight(){
        String specificationModel =entity().getSpecificationModel();
        if(specificationModel!=null){
            likeRight("specification_model",specificationModel);
        }
        return this;
     }

/**
     * <p>物理规格型号</p>
     * 等于 =
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelEq(String specificationModel){
        if(specificationModel!=null){
            eq("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 不等于 &lt;&gt;
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelNe(String specificationModel){
        if(specificationModel!=null){
            ne("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 大于 &gt;
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelGt(String specificationModel){
        if(specificationModel!=null){
            gt("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 大于等于 &gt;=
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelGe(String specificationModel){
        if(specificationModel!=null){
            ge("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 小于 &lt;
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelLt(String specificationModel){
        if(specificationModel!=null){
            lt("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 小于等于 &lt;=
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelLe(String specificationModel){
        if(specificationModel!=null){
            le("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * LIKE '%值%'
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelLike(String specificationModel){
        if(specificationModel!=null){
            like("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * NOT LIKE '%值%'
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelNotLike(String specificationModel){
        if(specificationModel!=null){
            notLike("specification_model",specificationModel);
        }
        return this;
    }


    /**
     * <p>物理规格型号</p>
     * LIKE '%值'
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelLikeLeft(String specificationModel){
        if(specificationModel!=null){
            likeLeft("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * LIKE '值%'
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelLikeRight(String specificationModel){
        if(specificationModel!=null){
            likeRight("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelIsNull(){
        isNull("specification_model");
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelIsNotNull(){
        isNotNull("specification_model");
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("specification_model",value);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelIn(String... values){
        if(values!=null && values.length>0){
            in("specification_model",values);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("specification_model",value);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper specificationModelNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("specification_model",values);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 等于 = entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitEq(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            eq("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 不等于 &lt;&gt; entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitNe(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            ne("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 大于 &gt; entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitGt(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            gt("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 大于等于 &gt;= entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitGe(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            ge("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 小于 &lt; entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitLt(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            lt("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 小于等于 &lt;= entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitLe(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            le("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * BETWEEN  entity().getMemoryLimit() AND 值2
     * @param memoryLimitEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitBetween(Long memoryLimitEnd){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null && memoryLimitEnd!=null){
            between("memory_limit",memoryLimit,memoryLimitEnd);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT BETWEEN  entity().getMemoryLimit() AND 值2
     * @param memoryLimitEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitNotBetween(Long memoryLimitEnd){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null && memoryLimitEnd!=null){
            notBetween("memory_limit",memoryLimit,memoryLimitEnd);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * BETWEEN  entity().getMemoryLimit() AND 值2
     * @param memoryLimitStart       值1
     * @param memoryLimitEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitBetween(Long memoryLimitStart,Long memoryLimitEnd){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null && memoryLimitEnd!=null){
            between("memory_limit",memoryLimitStart,memoryLimitEnd);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT BETWEEN  entity().getMemoryLimit() AND 值2
     * @param memoryLimitStart       值1
     * @param memoryLimitEnd      值2
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitNotBetween(Long memoryLimitStart,Long memoryLimitEnd){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null && memoryLimitEnd!=null){
            notBetween("memory_limit",memoryLimitStart,memoryLimitEnd);
        }
        return this;
     }


    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '%值%' entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitLike(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            like("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT LIKE '%值%' entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitNotLike(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            notLike("memory_limit",memoryLimit);
        }
        return this;
     }


    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '%值' entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitLikeLeft(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            likeLeft("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '值%' entity().getMemoryLimit()
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitLikeRight(){
        Long memoryLimit =entity().getMemoryLimit();
        if(memoryLimit!=null){
            likeRight("memory_limit",memoryLimit);
        }
        return this;
     }

/**
     * <p>内存配额，单位为MB</p>
     * 等于 =
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitEq(Long memoryLimit){
        if(memoryLimit!=null){
            eq("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 不等于 &lt;&gt;
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitNe(Long memoryLimit){
        if(memoryLimit!=null){
            ne("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 大于 &gt;
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitGt(Long memoryLimit){
        if(memoryLimit!=null){
            gt("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 大于等于 &gt;=
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitGe(Long memoryLimit){
        if(memoryLimit!=null){
            ge("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 小于 &lt;
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitLt(Long memoryLimit){
        if(memoryLimit!=null){
            lt("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 小于等于 &lt;=
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitLe(Long memoryLimit){
        if(memoryLimit!=null){
            le("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '%值%'
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitLike(Long memoryLimit){
        if(memoryLimit!=null){
            like("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT LIKE '%值%'
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitNotLike(Long memoryLimit){
        if(memoryLimit!=null){
            notLike("memory_limit",memoryLimit);
        }
        return this;
    }


    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '%值'
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitLikeLeft(Long memoryLimit){
        if(memoryLimit!=null){
            likeLeft("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '值%'
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitLikeRight(Long memoryLimit){
        if(memoryLimit!=null){
            likeRight("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * IS NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitIsNull(){
        isNull("memory_limit");
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitIsNotNull(){
        isNotNull("memory_limit");
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("memory_limit",value);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitIn(Long... values){
        if(values!=null && values.length>0){
            in("memory_limit",values);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("memory_limit",value);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateEntityWrapper memoryLimitNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("memory_limit",values);
        }
        return this;
    }


}
