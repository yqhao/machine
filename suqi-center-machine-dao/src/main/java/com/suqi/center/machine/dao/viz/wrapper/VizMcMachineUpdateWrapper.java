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
public class VizMcMachineUpdateWrapper extends UpdateWrapper<VizMcMachine> {

    public static VizMcMachineUpdateWrapper wrapper() {
        return new VizMcMachineUpdateWrapper();
    }

    public VizMcMachineUpdateWrapper() {
        super();
    }

    public VizMcMachineUpdateWrapper(VizMcMachine entity) {
        super(entity);
    }

    /**
     * 记录id自动增长
     */
    public VizMcMachineUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 机房记录id
     */
    public VizMcMachineUpdateWrapper setFkExtCloudRegionId(Long fkExtCloudRegionId) {
         set("fk_ext_cloud_region_id",fkExtCloudRegionId);
        return this;
    }
    /**
     * 机房名称【区域名称】
     */
    public VizMcMachineUpdateWrapper setExtCloudRegionName(String extCloudRegionName) {
         set("ext_cloud_region_name",extCloudRegionName);
        return this;
    }
    /**
     * 内网ip地址
     */
    public VizMcMachineUpdateWrapper setExternalAddr(String externalAddr) {
         set("external_addr",externalAddr);
        return this;
    }
    /**
     * 外网ip地址
     */
    public VizMcMachineUpdateWrapper setInternalAddr(String internalAddr) {
         set("internal_addr",internalAddr);
        return this;
    }
    /**
     * 设备唯一码
     */
    public VizMcMachineUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 实例Id
     */
    public VizMcMachineUpdateWrapper setInstanceId(String instanceId) {
         set("instance_id",instanceId);
        return this;
    }
    /**
     * 设备唯一码macAddr
     */
    public VizMcMachineUpdateWrapper setMacAddr(String macAddr) {
         set("mac_addr",macAddr);
        return this;
    }
    /**
     * 云机端软件包版本
     */
    public VizMcMachineUpdateWrapper setServiceSoftwarePackageVersion(String serviceSoftwarePackageVersion) {
         set("service_software_package_version",serviceSoftwarePackageVersion);
        return this;
    }
    /**
     * 设备型号
     */
    public VizMcMachineUpdateWrapper setChipModel(String chipModel) {
         set("chip_model",chipModel);
        return this;
    }
    /**
     * 系统版本
     */
    public VizMcMachineUpdateWrapper setOsVersion(String osVersion) {
         set("os_version",osVersion);
        return this;
    }
    /**
     * 销售状态(0：未售，1：已售)
     */
    public VizMcMachineUpdateWrapper setSalesStatus(Integer salesStatus) {
         set("sales_status",salesStatus);
        return this;
    }
    /**
     * 3: 打开日志，127: 关闭日志
     */
    public VizMcMachineUpdateWrapper setLogLevel(Integer logLevel) {
         set("log_level",logLevel);
        return this;
    }
    /**
     * 日志包名
     */
    public VizMcMachineUpdateWrapper setLogPkg(String logPkg) {
         set("log_pkg",logPkg);
        return this;
    }
    /**
     * 供应商类型[1:huawei  2:tencent  3: baidu  4: etc]
     */
    public VizMcMachineUpdateWrapper setSupplierType(Integer supplierType) {
         set("supplier_type",supplierType);
        return this;
    }
    /**
     * 设备状态(-50：删除，0：暂停使用，50：正常)
     */
    public VizMcMachineUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 版本id
     */
    public VizMcMachineUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 创建时间
     */
    public VizMcMachineUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public VizMcMachineUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 物理规格型号
     */
    public VizMcMachineUpdateWrapper setSpecificationModel(String specificationModel) {
         set("specification_model",specificationModel);
        return this;
    }
    /**
     * 内存配额，单位为MB
     */
    public VizMcMachineUpdateWrapper setMemoryLimit(Long memoryLimit) {
         set("memory_limit",memoryLimit);
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public VizMcMachineUpdateWrapper idLikeRight(Long id){
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
    public VizMcMachineUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper idIn(Collection<Long> value){
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
    public VizMcMachineUpdateWrapper idIn(Long... values){
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
    public VizMcMachineUpdateWrapper idNotIn(Collection<Long> value){
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
    public VizMcMachineUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 等于 = fkExtCloudRegionId
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdEq(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            eq("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房记录id</p>
     * 不等于 &lt;&gt; fkExtCloudRegionId
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdNe(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            ne("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 大于 &gt; fkExtCloudRegionId
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdGt(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            gt("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 大于等于 &gt;= fkExtCloudRegionId
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdGe(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            ge("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 小于 &lt; fkExtCloudRegionId
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdLt(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            lt("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * 小于等于 &lt;= fkExtCloudRegionId
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdLe(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            le("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * BETWEEN 值1 AND 值2
     * @param fkExtCloudRegionIdStart       值1
     * @param fkExtCloudRegionIdEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdBetween(Long fkExtCloudRegionIdStart,Long fkExtCloudRegionIdEnd){
        if(fkExtCloudRegionIdStart!=null && fkExtCloudRegionIdEnd!=null){
            between("fk_ext_cloud_region_id",fkExtCloudRegionIdStart,fkExtCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkExtCloudRegionIdStart       值1
     * @param fkExtCloudRegionIdEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdNotBetween(Long fkExtCloudRegionIdStart,Long fkExtCloudRegionIdEnd){
        if(fkExtCloudRegionIdStart!=null && fkExtCloudRegionIdEnd!=null){
            notBetween("fk_ext_cloud_region_id",fkExtCloudRegionIdStart,fkExtCloudRegionIdEnd);
        }
        return this;
     }


    /**
     * <p>机房记录id</p>
     * LIKE '%值%' fkExtCloudRegionId
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdLike(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            like("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * NOT LIKE '%值%' fkExtCloudRegionId
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdNotLike(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            notLike("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }


    /**
     * <p>机房记录id</p>
     * LIKE '%值' fkExtCloudRegionId
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdLikeLeft(Long fkExtCloudRegionId){
        if(fkExtCloudRegionId!=null){
            likeLeft("fk_ext_cloud_region_id",fkExtCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房记录id</p>
     * LIKE '值%' fkExtCloudRegionId
     * @param fkExtCloudRegionId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdLikeRight(Long fkExtCloudRegionId){
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
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdIsNull(){
        isNull("fk_ext_cloud_region_id");
        return this;
    }

    /**
     * <p>机房记录id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdIsNotNull(){
        isNotNull("fk_ext_cloud_region_id");
        return this;
    }

    /**
     * <p>机房记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdIn(Collection<Long> value){
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
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdIn(Long... values){
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
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdNotIn(Collection<Long> value){
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
    public VizMcMachineUpdateWrapper fkExtCloudRegionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_ext_cloud_region_id",values);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 等于 = extCloudRegionName
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameEq(String extCloudRegionName){
        if(extCloudRegionName!=null){
            eq("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * 不等于 &lt;&gt; extCloudRegionName
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameNe(String extCloudRegionName){
        if(extCloudRegionName!=null){
            ne("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 大于 &gt; extCloudRegionName
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameGt(String extCloudRegionName){
        if(extCloudRegionName!=null){
            gt("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 大于等于 &gt;= extCloudRegionName
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameGe(String extCloudRegionName){
        if(extCloudRegionName!=null){
            ge("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 小于 &lt; extCloudRegionName
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameLt(String extCloudRegionName){
        if(extCloudRegionName!=null){
            lt("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * 小于等于 &lt;= extCloudRegionName
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameLe(String extCloudRegionName){
        if(extCloudRegionName!=null){
            le("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * BETWEEN 值1 AND 值2
     * @param extCloudRegionNameStart       值1
     * @param extCloudRegionNameEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameBetween(String extCloudRegionNameStart,String extCloudRegionNameEnd){
        if(extCloudRegionNameStart!=null && extCloudRegionNameEnd!=null){
            between("ext_cloud_region_name",extCloudRegionNameStart,extCloudRegionNameEnd);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT BETWEEN 值1 AND 值2
     * @param extCloudRegionNameStart       值1
     * @param extCloudRegionNameEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameNotBetween(String extCloudRegionNameStart,String extCloudRegionNameEnd){
        if(extCloudRegionNameStart!=null && extCloudRegionNameEnd!=null){
            notBetween("ext_cloud_region_name",extCloudRegionNameStart,extCloudRegionNameEnd);
        }
        return this;
     }


    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '%值%' extCloudRegionName
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameLike(String extCloudRegionName){
        if(extCloudRegionName!=null){
            like("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * NOT LIKE '%值%' extCloudRegionName
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameNotLike(String extCloudRegionName){
        if(extCloudRegionName!=null){
            notLike("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }


    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '%值' extCloudRegionName
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameLikeLeft(String extCloudRegionName){
        if(extCloudRegionName!=null){
            likeLeft("ext_cloud_region_name",extCloudRegionName);
        }
        return this;
     }

    /**
     * <p>机房名称【区域名称】</p>
     * LIKE '值%' extCloudRegionName
     * @param extCloudRegionName       值
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameLikeRight(String extCloudRegionName){
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
    public VizMcMachineUpdateWrapper extCloudRegionNameIsNull(){
        isNull("ext_cloud_region_name");
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameIsNotNull(){
        isNotNull("ext_cloud_region_name");
        return this;
    }

    /**
     * <p>机房名称【区域名称】</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper extCloudRegionNameIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper extCloudRegionNameIn(String... values){
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
    public VizMcMachineUpdateWrapper extCloudRegionNameNotIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper extCloudRegionNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("ext_cloud_region_name",values);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 等于 = externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrEq(String externalAddr){
        if(externalAddr!=null){
            eq("external_addr",externalAddr);
        }
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * 不等于 &lt;&gt; externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrNe(String externalAddr){
        if(externalAddr!=null){
            ne("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于 &gt; externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrGt(String externalAddr){
        if(externalAddr!=null){
            gt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 大于等于 &gt;= externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrGe(String externalAddr){
        if(externalAddr!=null){
            ge("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于 &lt; externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrLt(String externalAddr){
        if(externalAddr!=null){
            lt("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * 小于等于 &lt;= externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrLe(String externalAddr){
        if(externalAddr!=null){
            le("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * BETWEEN 值1 AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrBetween(String externalAddrStart,String externalAddrEnd){
        if(externalAddrStart!=null && externalAddrEnd!=null){
            between("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param externalAddrStart       值1
     * @param externalAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrNotBetween(String externalAddrStart,String externalAddrEnd){
        if(externalAddrStart!=null && externalAddrEnd!=null){
            notBetween("external_addr",externalAddrStart,externalAddrEnd);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值%' externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrLike(String externalAddr){
        if(externalAddr!=null){
            like("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * NOT LIKE '%值%' externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrNotLike(String externalAddr){
        if(externalAddr!=null){
            notLike("external_addr",externalAddr);
        }
        return this;
     }


    /**
     * <p>内网ip地址</p>
     * LIKE '%值' externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrLikeLeft(String externalAddr){
        if(externalAddr!=null){
            likeLeft("external_addr",externalAddr);
        }
        return this;
     }

    /**
     * <p>内网ip地址</p>
     * LIKE '值%' externalAddr
     * @param externalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrLikeRight(String externalAddr){
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
    public VizMcMachineUpdateWrapper externalAddrIsNull(){
        isNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrIsNotNull(){
        isNotNull("external_addr");
        return this;
    }

    /**
     * <p>内网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper externalAddrIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper externalAddrIn(String... values){
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
    public VizMcMachineUpdateWrapper externalAddrNotIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper externalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("external_addr",values);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 等于 = internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrEq(String internalAddr){
        if(internalAddr!=null){
            eq("internal_addr",internalAddr);
        }
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * 不等于 &lt;&gt; internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrNe(String internalAddr){
        if(internalAddr!=null){
            ne("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于 &gt; internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrGt(String internalAddr){
        if(internalAddr!=null){
            gt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 大于等于 &gt;= internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrGe(String internalAddr){
        if(internalAddr!=null){
            ge("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于 &lt; internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrLt(String internalAddr){
        if(internalAddr!=null){
            lt("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * 小于等于 &lt;= internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrLe(String internalAddr){
        if(internalAddr!=null){
            le("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * BETWEEN 值1 AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrBetween(String internalAddrStart,String internalAddrEnd){
        if(internalAddrStart!=null && internalAddrEnd!=null){
            between("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param internalAddrStart       值1
     * @param internalAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrNotBetween(String internalAddrStart,String internalAddrEnd){
        if(internalAddrStart!=null && internalAddrEnd!=null){
            notBetween("internal_addr",internalAddrStart,internalAddrEnd);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值%' internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrLike(String internalAddr){
        if(internalAddr!=null){
            like("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * NOT LIKE '%值%' internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrNotLike(String internalAddr){
        if(internalAddr!=null){
            notLike("internal_addr",internalAddr);
        }
        return this;
     }


    /**
     * <p>外网ip地址</p>
     * LIKE '%值' internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrLikeLeft(String internalAddr){
        if(internalAddr!=null){
            likeLeft("internal_addr",internalAddr);
        }
        return this;
     }

    /**
     * <p>外网ip地址</p>
     * LIKE '值%' internalAddr
     * @param internalAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrLikeRight(String internalAddr){
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
    public VizMcMachineUpdateWrapper internalAddrIsNull(){
        isNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrIsNotNull(){
        isNotNull("internal_addr");
        return this;
    }

    /**
     * <p>外网ip地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper internalAddrIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper internalAddrIn(String... values){
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
    public VizMcMachineUpdateWrapper internalAddrNotIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper internalAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("internal_addr",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper deviceIdEq(String deviceId){
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
    public VizMcMachineUpdateWrapper deviceIdNe(String deviceId){
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
    public VizMcMachineUpdateWrapper deviceIdGt(String deviceId){
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
    public VizMcMachineUpdateWrapper deviceIdGe(String deviceId){
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
    public VizMcMachineUpdateWrapper deviceIdLt(String deviceId){
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
    public VizMcMachineUpdateWrapper deviceIdLe(String deviceId){
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
    public VizMcMachineUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public VizMcMachineUpdateWrapper deviceIdLike(String deviceId){
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
    public VizMcMachineUpdateWrapper deviceIdNotLike(String deviceId){
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
    public VizMcMachineUpdateWrapper deviceIdLikeLeft(String deviceId){
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
    public VizMcMachineUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public VizMcMachineUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper deviceIdIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper deviceIdIn(String... values){
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
    public VizMcMachineUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 等于 = instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdEq(String instanceId){
        if(instanceId!=null){
            eq("instance_id",instanceId);
        }
        return this;
    }

    /**
     * <p>实例Id</p>
     * 不等于 &lt;&gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdNe(String instanceId){
        if(instanceId!=null){
            ne("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于 &gt; instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdGt(String instanceId){
        if(instanceId!=null){
            gt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 大于等于 &gt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdGe(String instanceId){
        if(instanceId!=null){
            ge("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于 &lt; instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdLt(String instanceId){
        if(instanceId!=null){
            lt("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * 小于等于 &lt;= instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdLe(String instanceId){
        if(instanceId!=null){
            le("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            between("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param instanceIdStart       值1
     * @param instanceIdEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdNotBetween(String instanceIdStart,String instanceIdEnd){
        if(instanceIdStart!=null && instanceIdEnd!=null){
            notBetween("instance_id",instanceIdStart,instanceIdEnd);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdLike(String instanceId){
        if(instanceId!=null){
            like("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * NOT LIKE '%值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdNotLike(String instanceId){
        if(instanceId!=null){
            notLike("instance_id",instanceId);
        }
        return this;
     }


    /**
     * <p>实例Id</p>
     * LIKE '%值' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdLikeLeft(String instanceId){
        if(instanceId!=null){
            likeLeft("instance_id",instanceId);
        }
        return this;
     }

    /**
     * <p>实例Id</p>
     * LIKE '值%' instanceId
     * @param instanceId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdLikeRight(String instanceId){
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
    public VizMcMachineUpdateWrapper instanceIdIsNull(){
        isNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdIsNotNull(){
        isNotNull("instance_id");
        return this;
    }

    /**
     * <p>实例Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper instanceIdIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper instanceIdIn(String... values){
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
    public VizMcMachineUpdateWrapper instanceIdNotIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper instanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("instance_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 等于 = macAddr
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrEq(String macAddr){
        if(macAddr!=null){
            eq("mac_addr",macAddr);
        }
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * 不等于 &lt;&gt; macAddr
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrNe(String macAddr){
        if(macAddr!=null){
            ne("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 大于 &gt; macAddr
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrGt(String macAddr){
        if(macAddr!=null){
            gt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 大于等于 &gt;= macAddr
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrGe(String macAddr){
        if(macAddr!=null){
            ge("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 小于 &lt; macAddr
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrLt(String macAddr){
        if(macAddr!=null){
            lt("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * 小于等于 &lt;= macAddr
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrLe(String macAddr){
        if(macAddr!=null){
            le("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * BETWEEN 值1 AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrBetween(String macAddrStart,String macAddrEnd){
        if(macAddrStart!=null && macAddrEnd!=null){
            between("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT BETWEEN 值1 AND 值2
     * @param macAddrStart       值1
     * @param macAddrEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrNotBetween(String macAddrStart,String macAddrEnd){
        if(macAddrStart!=null && macAddrEnd!=null){
            notBetween("mac_addr",macAddrStart,macAddrEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '%值%' macAddr
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrLike(String macAddr){
        if(macAddr!=null){
            like("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * NOT LIKE '%值%' macAddr
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrNotLike(String macAddr){
        if(macAddr!=null){
            notLike("mac_addr",macAddr);
        }
        return this;
     }


    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '%值' macAddr
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrLikeLeft(String macAddr){
        if(macAddr!=null){
            likeLeft("mac_addr",macAddr);
        }
        return this;
     }

    /**
     * <p>设备唯一码macAddr</p>
     * LIKE '值%' macAddr
     * @param macAddr       值
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrLikeRight(String macAddr){
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
    public VizMcMachineUpdateWrapper macAddrIsNull(){
        isNull("mac_addr");
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrIsNotNull(){
        isNotNull("mac_addr");
        return this;
    }

    /**
     * <p>设备唯一码macAddr</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper macAddrIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper macAddrIn(String... values){
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
    public VizMcMachineUpdateWrapper macAddrNotIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper macAddrNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("mac_addr",values);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 等于 = serviceSoftwarePackageVersion
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionEq(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            eq("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * 不等于 &lt;&gt; serviceSoftwarePackageVersion
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionNe(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            ne("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 大于 &gt; serviceSoftwarePackageVersion
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionGt(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            gt("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 大于等于 &gt;= serviceSoftwarePackageVersion
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionGe(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            ge("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 小于 &lt; serviceSoftwarePackageVersion
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionLt(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            lt("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * 小于等于 &lt;= serviceSoftwarePackageVersion
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionLe(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            le("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * BETWEEN 值1 AND 值2
     * @param serviceSoftwarePackageVersionStart       值1
     * @param serviceSoftwarePackageVersionEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionBetween(String serviceSoftwarePackageVersionStart,String serviceSoftwarePackageVersionEnd){
        if(serviceSoftwarePackageVersionStart!=null && serviceSoftwarePackageVersionEnd!=null){
            between("service_software_package_version",serviceSoftwarePackageVersionStart,serviceSoftwarePackageVersionEnd);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serviceSoftwarePackageVersionStart       值1
     * @param serviceSoftwarePackageVersionEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionNotBetween(String serviceSoftwarePackageVersionStart,String serviceSoftwarePackageVersionEnd){
        if(serviceSoftwarePackageVersionStart!=null && serviceSoftwarePackageVersionEnd!=null){
            notBetween("service_software_package_version",serviceSoftwarePackageVersionStart,serviceSoftwarePackageVersionEnd);
        }
        return this;
     }


    /**
     * <p>云机端软件包版本</p>
     * LIKE '%值%' serviceSoftwarePackageVersion
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionLike(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            like("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * NOT LIKE '%值%' serviceSoftwarePackageVersion
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionNotLike(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            notLike("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }


    /**
     * <p>云机端软件包版本</p>
     * LIKE '%值' serviceSoftwarePackageVersion
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionLikeLeft(String serviceSoftwarePackageVersion){
        if(serviceSoftwarePackageVersion!=null){
            likeLeft("service_software_package_version",serviceSoftwarePackageVersion);
        }
        return this;
     }

    /**
     * <p>云机端软件包版本</p>
     * LIKE '值%' serviceSoftwarePackageVersion
     * @param serviceSoftwarePackageVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionLikeRight(String serviceSoftwarePackageVersion){
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
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionIsNull(){
        isNull("service_software_package_version");
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionIsNotNull(){
        isNotNull("service_software_package_version");
        return this;
    }

    /**
     * <p>云机端软件包版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionIn(String... values){
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
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionNotIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper serviceSoftwarePackageVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("service_software_package_version",values);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 等于 = chipModel
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelEq(String chipModel){
        if(chipModel!=null){
            eq("chip_model",chipModel);
        }
        return this;
    }

    /**
     * <p>设备型号</p>
     * 不等于 &lt;&gt; chipModel
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelNe(String chipModel){
        if(chipModel!=null){
            ne("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 大于 &gt; chipModel
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelGt(String chipModel){
        if(chipModel!=null){
            gt("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 大于等于 &gt;= chipModel
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelGe(String chipModel){
        if(chipModel!=null){
            ge("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 小于 &lt; chipModel
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelLt(String chipModel){
        if(chipModel!=null){
            lt("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * 小于等于 &lt;= chipModel
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelLe(String chipModel){
        if(chipModel!=null){
            le("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * BETWEEN 值1 AND 值2
     * @param chipModelStart       值1
     * @param chipModelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelBetween(String chipModelStart,String chipModelEnd){
        if(chipModelStart!=null && chipModelEnd!=null){
            between("chip_model",chipModelStart,chipModelEnd);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param chipModelStart       值1
     * @param chipModelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelNotBetween(String chipModelStart,String chipModelEnd){
        if(chipModelStart!=null && chipModelEnd!=null){
            notBetween("chip_model",chipModelStart,chipModelEnd);
        }
        return this;
     }


    /**
     * <p>设备型号</p>
     * LIKE '%值%' chipModel
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelLike(String chipModel){
        if(chipModel!=null){
            like("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * NOT LIKE '%值%' chipModel
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelNotLike(String chipModel){
        if(chipModel!=null){
            notLike("chip_model",chipModel);
        }
        return this;
     }


    /**
     * <p>设备型号</p>
     * LIKE '%值' chipModel
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelLikeLeft(String chipModel){
        if(chipModel!=null){
            likeLeft("chip_model",chipModel);
        }
        return this;
     }

    /**
     * <p>设备型号</p>
     * LIKE '值%' chipModel
     * @param chipModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelLikeRight(String chipModel){
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
    public VizMcMachineUpdateWrapper chipModelIsNull(){
        isNull("chip_model");
        return this;
    }

    /**
     * <p>设备型号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelIsNotNull(){
        isNotNull("chip_model");
        return this;
    }

    /**
     * <p>设备型号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper chipModelIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper chipModelIn(String... values){
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
    public VizMcMachineUpdateWrapper chipModelNotIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper chipModelNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("chip_model",values);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 等于 = osVersion
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionEq(String osVersion){
        if(osVersion!=null){
            eq("os_version",osVersion);
        }
        return this;
    }

    /**
     * <p>系统版本</p>
     * 不等于 &lt;&gt; osVersion
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionNe(String osVersion){
        if(osVersion!=null){
            ne("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于 &gt; osVersion
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionGt(String osVersion){
        if(osVersion!=null){
            gt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 大于等于 &gt;= osVersion
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionGe(String osVersion){
        if(osVersion!=null){
            ge("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于 &lt; osVersion
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionLt(String osVersion){
        if(osVersion!=null){
            lt("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * 小于等于 &lt;= osVersion
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionLe(String osVersion){
        if(osVersion!=null){
            le("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * BETWEEN 值1 AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionBetween(String osVersionStart,String osVersionEnd){
        if(osVersionStart!=null && osVersionEnd!=null){
            between("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT BETWEEN 值1 AND 值2
     * @param osVersionStart       值1
     * @param osVersionEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionNotBetween(String osVersionStart,String osVersionEnd){
        if(osVersionStart!=null && osVersionEnd!=null){
            notBetween("os_version",osVersionStart,osVersionEnd);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值%' osVersion
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionLike(String osVersion){
        if(osVersion!=null){
            like("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * NOT LIKE '%值%' osVersion
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionNotLike(String osVersion){
        if(osVersion!=null){
            notLike("os_version",osVersion);
        }
        return this;
     }


    /**
     * <p>系统版本</p>
     * LIKE '%值' osVersion
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionLikeLeft(String osVersion){
        if(osVersion!=null){
            likeLeft("os_version",osVersion);
        }
        return this;
     }

    /**
     * <p>系统版本</p>
     * LIKE '值%' osVersion
     * @param osVersion       值
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionLikeRight(String osVersion){
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
    public VizMcMachineUpdateWrapper osVersionIsNull(){
        isNull("os_version");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionIsNotNull(){
        isNotNull("os_version");
        return this;
    }

    /**
     * <p>系统版本</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper osVersionIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper osVersionIn(String... values){
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
    public VizMcMachineUpdateWrapper osVersionNotIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper osVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os_version",values);
        }
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * 等于 = salesStatus
     * @param salesStatus       值
     * @return children
     */
    public VizMcMachineUpdateWrapper salesStatusEq(Integer salesStatus){
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
    public VizMcMachineUpdateWrapper salesStatusNe(Integer salesStatus){
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
    public VizMcMachineUpdateWrapper salesStatusGt(Integer salesStatus){
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
    public VizMcMachineUpdateWrapper salesStatusGe(Integer salesStatus){
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
    public VizMcMachineUpdateWrapper salesStatusLt(Integer salesStatus){
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
    public VizMcMachineUpdateWrapper salesStatusLe(Integer salesStatus){
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
    public VizMcMachineUpdateWrapper salesStatusBetween(Integer salesStatusStart,Integer salesStatusEnd){
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
    public VizMcMachineUpdateWrapper salesStatusNotBetween(Integer salesStatusStart,Integer salesStatusEnd){
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
    public VizMcMachineUpdateWrapper salesStatusLike(Integer salesStatus){
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
    public VizMcMachineUpdateWrapper salesStatusNotLike(Integer salesStatus){
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
    public VizMcMachineUpdateWrapper salesStatusLikeLeft(Integer salesStatus){
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
    public VizMcMachineUpdateWrapper salesStatusLikeRight(Integer salesStatus){
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
    public VizMcMachineUpdateWrapper salesStatusIsNull(){
        isNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper salesStatusIsNotNull(){
        isNotNull("sales_status");
        return this;
    }

    /**
     * <p>销售状态(0：未售，1：已售)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper salesStatusIn(Collection<Integer> value){
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
    public VizMcMachineUpdateWrapper salesStatusIn(Integer... values){
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
    public VizMcMachineUpdateWrapper salesStatusNotIn(Collection<Integer> value){
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
    public VizMcMachineUpdateWrapper salesStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("sales_status",values);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 等于 = logLevel
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelEq(Integer logLevel){
        if(logLevel!=null){
            eq("log_level",logLevel);
        }
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 不等于 &lt;&gt; logLevel
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelNe(Integer logLevel){
        if(logLevel!=null){
            ne("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于 &gt; logLevel
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelGt(Integer logLevel){
        if(logLevel!=null){
            gt("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 大于等于 &gt;= logLevel
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelGe(Integer logLevel){
        if(logLevel!=null){
            ge("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于 &lt; logLevel
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelLt(Integer logLevel){
        if(logLevel!=null){
            lt("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * 小于等于 &lt;= logLevel
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelLe(Integer logLevel){
        if(logLevel!=null){
            le("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * BETWEEN 值1 AND 值2
     * @param logLevelStart       值1
     * @param logLevelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelBetween(Integer logLevelStart,Integer logLevelEnd){
        if(logLevelStart!=null && logLevelEnd!=null){
            between("log_level",logLevelStart,logLevelEnd);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT BETWEEN 值1 AND 值2
     * @param logLevelStart       值1
     * @param logLevelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelNotBetween(Integer logLevelStart,Integer logLevelEnd){
        if(logLevelStart!=null && logLevelEnd!=null){
            notBetween("log_level",logLevelStart,logLevelEnd);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值%' logLevel
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelLike(Integer logLevel){
        if(logLevel!=null){
            like("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * NOT LIKE '%值%' logLevel
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelNotLike(Integer logLevel){
        if(logLevel!=null){
            notLike("log_level",logLevel);
        }
        return this;
     }


    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '%值' logLevel
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelLikeLeft(Integer logLevel){
        if(logLevel!=null){
            likeLeft("log_level",logLevel);
        }
        return this;
     }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * LIKE '值%' logLevel
     * @param logLevel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelLikeRight(Integer logLevel){
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
    public VizMcMachineUpdateWrapper logLevelIsNull(){
        isNull("log_level");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelIsNotNull(){
        isNotNull("log_level");
        return this;
    }

    /**
     * <p>3: 打开日志，127: 关闭日志</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper logLevelIn(Collection<Integer> value){
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
    public VizMcMachineUpdateWrapper logLevelIn(Integer... values){
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
    public VizMcMachineUpdateWrapper logLevelNotIn(Collection<Integer> value){
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
    public VizMcMachineUpdateWrapper logLevelNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("log_level",values);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 等于 = logPkg
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgEq(String logPkg){
        if(logPkg!=null){
            eq("log_pkg",logPkg);
        }
        return this;
    }

    /**
     * <p>日志包名</p>
     * 不等于 &lt;&gt; logPkg
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgNe(String logPkg){
        if(logPkg!=null){
            ne("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 大于 &gt; logPkg
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgGt(String logPkg){
        if(logPkg!=null){
            gt("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 大于等于 &gt;= logPkg
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgGe(String logPkg){
        if(logPkg!=null){
            ge("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 小于 &lt; logPkg
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgLt(String logPkg){
        if(logPkg!=null){
            lt("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * 小于等于 &lt;= logPkg
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgLe(String logPkg){
        if(logPkg!=null){
            le("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * BETWEEN 值1 AND 值2
     * @param logPkgStart       值1
     * @param logPkgEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgBetween(String logPkgStart,String logPkgEnd){
        if(logPkgStart!=null && logPkgEnd!=null){
            between("log_pkg",logPkgStart,logPkgEnd);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * NOT BETWEEN 值1 AND 值2
     * @param logPkgStart       值1
     * @param logPkgEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgNotBetween(String logPkgStart,String logPkgEnd){
        if(logPkgStart!=null && logPkgEnd!=null){
            notBetween("log_pkg",logPkgStart,logPkgEnd);
        }
        return this;
     }


    /**
     * <p>日志包名</p>
     * LIKE '%值%' logPkg
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgLike(String logPkg){
        if(logPkg!=null){
            like("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * NOT LIKE '%值%' logPkg
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgNotLike(String logPkg){
        if(logPkg!=null){
            notLike("log_pkg",logPkg);
        }
        return this;
     }


    /**
     * <p>日志包名</p>
     * LIKE '%值' logPkg
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgLikeLeft(String logPkg){
        if(logPkg!=null){
            likeLeft("log_pkg",logPkg);
        }
        return this;
     }

    /**
     * <p>日志包名</p>
     * LIKE '值%' logPkg
     * @param logPkg       值
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgLikeRight(String logPkg){
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
    public VizMcMachineUpdateWrapper logPkgIsNull(){
        isNull("log_pkg");
        return this;
    }

    /**
     * <p>日志包名</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgIsNotNull(){
        isNotNull("log_pkg");
        return this;
    }

    /**
     * <p>日志包名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper logPkgIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper logPkgIn(String... values){
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
    public VizMcMachineUpdateWrapper logPkgNotIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper logPkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("log_pkg",values);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 等于 = supplierType
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeEq(Integer supplierType){
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 不等于 &lt;&gt; supplierType
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeNe(Integer supplierType){
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 大于 &gt; supplierType
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeGt(Integer supplierType){
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 大于等于 &gt;= supplierType
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeGe(Integer supplierType){
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 小于 &lt; supplierType
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeLt(Integer supplierType){
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * 小于等于 &lt;= supplierType
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeLe(Integer supplierType){
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * BETWEEN 值1 AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        if(supplierTypeStart!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT BETWEEN 值1 AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeNotBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        if(supplierTypeStart!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '%值%' supplierType
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeLike(Integer supplierType){
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * NOT LIKE '%值%' supplierType
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeNotLike(Integer supplierType){
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
     }


    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '%值' supplierType
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeLikeLeft(Integer supplierType){
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * LIKE '值%' supplierType
     * @param supplierType       值
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeLikeRight(Integer supplierType){
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
    public VizMcMachineUpdateWrapper supplierTypeIsNull(){
        isNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeIsNotNull(){
        isNotNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型[1:huawei  2:tencent  3: baidu  4: etc]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper supplierTypeIn(Collection<Integer> value){
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
    public VizMcMachineUpdateWrapper supplierTypeIn(Integer... values){
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
    public VizMcMachineUpdateWrapper supplierTypeNotIn(Collection<Integer> value){
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
    public VizMcMachineUpdateWrapper supplierTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("supplier_type",values);
        }
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public VizMcMachineUpdateWrapper statusEq(Integer status){
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
    public VizMcMachineUpdateWrapper statusNe(Integer status){
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
    public VizMcMachineUpdateWrapper statusGt(Integer status){
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
    public VizMcMachineUpdateWrapper statusGe(Integer status){
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
    public VizMcMachineUpdateWrapper statusLt(Integer status){
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
    public VizMcMachineUpdateWrapper statusLe(Integer status){
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
    public VizMcMachineUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public VizMcMachineUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
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
    public VizMcMachineUpdateWrapper statusLike(Integer status){
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
    public VizMcMachineUpdateWrapper statusNotLike(Integer status){
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
    public VizMcMachineUpdateWrapper statusLikeLeft(Integer status){
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
    public VizMcMachineUpdateWrapper statusLikeRight(Integer status){
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
    public VizMcMachineUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态(-50：删除，0：暂停使用，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper statusIn(Collection<Integer> value){
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
    public VizMcMachineUpdateWrapper statusIn(Integer... values){
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
    public VizMcMachineUpdateWrapper statusNotIn(Collection<Integer> value){
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
    public VizMcMachineUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public VizMcMachineUpdateWrapper versionIdEq(Long versionId){
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
    public VizMcMachineUpdateWrapper versionIdNe(Long versionId){
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
    public VizMcMachineUpdateWrapper versionIdGt(Long versionId){
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
    public VizMcMachineUpdateWrapper versionIdGe(Long versionId){
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
    public VizMcMachineUpdateWrapper versionIdLt(Long versionId){
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
    public VizMcMachineUpdateWrapper versionIdLe(Long versionId){
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
    public VizMcMachineUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public VizMcMachineUpdateWrapper versionIdLike(Long versionId){
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
    public VizMcMachineUpdateWrapper versionIdNotLike(Long versionId){
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
    public VizMcMachineUpdateWrapper versionIdLikeLeft(Long versionId){
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
    public VizMcMachineUpdateWrapper versionIdLikeRight(Long versionId){
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
    public VizMcMachineUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper versionIdIn(Collection<Long> value){
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
    public VizMcMachineUpdateWrapper versionIdIn(Long... values){
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
    public VizMcMachineUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public VizMcMachineUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeLikeRight(Date createTime){
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
    public VizMcMachineUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper createTimeIn(Collection<Date> value){
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
    public VizMcMachineUpdateWrapper createTimeIn(Date... values){
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
    public VizMcMachineUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public VizMcMachineUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public VizMcMachineUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public VizMcMachineUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public VizMcMachineUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public VizMcMachineUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 等于 = specificationModel
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelEq(String specificationModel){
        if(specificationModel!=null){
            eq("specification_model",specificationModel);
        }
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * 不等于 &lt;&gt; specificationModel
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelNe(String specificationModel){
        if(specificationModel!=null){
            ne("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 大于 &gt; specificationModel
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelGt(String specificationModel){
        if(specificationModel!=null){
            gt("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 大于等于 &gt;= specificationModel
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelGe(String specificationModel){
        if(specificationModel!=null){
            ge("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 小于 &lt; specificationModel
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelLt(String specificationModel){
        if(specificationModel!=null){
            lt("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * 小于等于 &lt;= specificationModel
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelLe(String specificationModel){
        if(specificationModel!=null){
            le("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * BETWEEN 值1 AND 值2
     * @param specificationModelStart       值1
     * @param specificationModelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelBetween(String specificationModelStart,String specificationModelEnd){
        if(specificationModelStart!=null && specificationModelEnd!=null){
            between("specification_model",specificationModelStart,specificationModelEnd);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param specificationModelStart       值1
     * @param specificationModelEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelNotBetween(String specificationModelStart,String specificationModelEnd){
        if(specificationModelStart!=null && specificationModelEnd!=null){
            notBetween("specification_model",specificationModelStart,specificationModelEnd);
        }
        return this;
     }


    /**
     * <p>物理规格型号</p>
     * LIKE '%值%' specificationModel
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelLike(String specificationModel){
        if(specificationModel!=null){
            like("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * NOT LIKE '%值%' specificationModel
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelNotLike(String specificationModel){
        if(specificationModel!=null){
            notLike("specification_model",specificationModel);
        }
        return this;
     }


    /**
     * <p>物理规格型号</p>
     * LIKE '%值' specificationModel
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelLikeLeft(String specificationModel){
        if(specificationModel!=null){
            likeLeft("specification_model",specificationModel);
        }
        return this;
     }

    /**
     * <p>物理规格型号</p>
     * LIKE '值%' specificationModel
     * @param specificationModel       值
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelLikeRight(String specificationModel){
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
    public VizMcMachineUpdateWrapper specificationModelIsNull(){
        isNull("specification_model");
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelIsNotNull(){
        isNotNull("specification_model");
        return this;
    }

    /**
     * <p>物理规格型号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper specificationModelIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper specificationModelIn(String... values){
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
    public VizMcMachineUpdateWrapper specificationModelNotIn(Collection<String> value){
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
    public VizMcMachineUpdateWrapper specificationModelNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("specification_model",values);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 等于 = memoryLimit
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitEq(Long memoryLimit){
        if(memoryLimit!=null){
            eq("memory_limit",memoryLimit);
        }
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * 不等于 &lt;&gt; memoryLimit
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitNe(Long memoryLimit){
        if(memoryLimit!=null){
            ne("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 大于 &gt; memoryLimit
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitGt(Long memoryLimit){
        if(memoryLimit!=null){
            gt("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 大于等于 &gt;= memoryLimit
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitGe(Long memoryLimit){
        if(memoryLimit!=null){
            ge("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 小于 &lt; memoryLimit
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitLt(Long memoryLimit){
        if(memoryLimit!=null){
            lt("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * 小于等于 &lt;= memoryLimit
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitLe(Long memoryLimit){
        if(memoryLimit!=null){
            le("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * BETWEEN 值1 AND 值2
     * @param memoryLimitStart       值1
     * @param memoryLimitEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitBetween(Long memoryLimitStart,Long memoryLimitEnd){
        if(memoryLimitStart!=null && memoryLimitEnd!=null){
            between("memory_limit",memoryLimitStart,memoryLimitEnd);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT BETWEEN 值1 AND 值2
     * @param memoryLimitStart       值1
     * @param memoryLimitEnd      值2
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitNotBetween(Long memoryLimitStart,Long memoryLimitEnd){
        if(memoryLimitStart!=null && memoryLimitEnd!=null){
            notBetween("memory_limit",memoryLimitStart,memoryLimitEnd);
        }
        return this;
     }


    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '%值%' memoryLimit
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitLike(Long memoryLimit){
        if(memoryLimit!=null){
            like("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * NOT LIKE '%值%' memoryLimit
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitNotLike(Long memoryLimit){
        if(memoryLimit!=null){
            notLike("memory_limit",memoryLimit);
        }
        return this;
     }


    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '%值' memoryLimit
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitLikeLeft(Long memoryLimit){
        if(memoryLimit!=null){
            likeLeft("memory_limit",memoryLimit);
        }
        return this;
     }

    /**
     * <p>内存配额，单位为MB</p>
     * LIKE '值%' memoryLimit
     * @param memoryLimit       值
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitLikeRight(Long memoryLimit){
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
    public VizMcMachineUpdateWrapper memoryLimitIsNull(){
        isNull("memory_limit");
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * IS NOT NULL
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitIsNotNull(){
        isNotNull("memory_limit");
        return this;
    }

    /**
     * <p>内存配额，单位为MB</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public VizMcMachineUpdateWrapper memoryLimitIn(Collection<Long> value){
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
    public VizMcMachineUpdateWrapper memoryLimitIn(Long... values){
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
    public VizMcMachineUpdateWrapper memoryLimitNotIn(Collection<Long> value){
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
    public VizMcMachineUpdateWrapper memoryLimitNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("memory_limit",values);
        }
        return this;
    }


}
