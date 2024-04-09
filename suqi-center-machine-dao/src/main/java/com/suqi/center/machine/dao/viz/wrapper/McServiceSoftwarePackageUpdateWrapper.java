package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackage;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 云机端软件包表
 * </p>
 * "mc_service_software_package"
 * @author 18374
 */
public class McServiceSoftwarePackageUpdateWrapper extends UpdateWrapper<McServiceSoftwarePackage> {

    public static McServiceSoftwarePackageUpdateWrapper wrapper() {
        return new McServiceSoftwarePackageUpdateWrapper();
    }

    public McServiceSoftwarePackageUpdateWrapper() {
        super();
    }

    public McServiceSoftwarePackageUpdateWrapper(McServiceSoftwarePackage entity) {
        super(entity);
    }

    /**
     * 记录id自动增长
     */
    public McServiceSoftwarePackageUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 软件包类型记录id
     */
    public McServiceSoftwarePackageUpdateWrapper setFkMcServiceSoftwarePackageTypeId(Long fkMcServiceSoftwarePackageTypeId) {
         set("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        return this;
    }
    /**
     * 供应商类型（1：华为，2：腾讯，3：百度）
     */
    public McServiceSoftwarePackageUpdateWrapper setSupplierType(Integer supplierType) {
         set("supplier_type",supplierType);
        return this;
    }
    /**
     * 软件包名称
     */
    public McServiceSoftwarePackageUpdateWrapper setName(String name) {
         set("name",name);
        return this;
    }
    /**
     * 镜像id
     */
    public McServiceSoftwarePackageUpdateWrapper setImageId(String imageId) {
         set("image_id",imageId);
        return this;
    }
    /**
     * 版本名称
     */
    public McServiceSoftwarePackageUpdateWrapper setVersion(String version) {
         set("version",version);
        return this;
    }
    /**
     * 状态(-50：删除，50：正常)
     */
    public McServiceSoftwarePackageUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 创建时间
     */
    public McServiceSoftwarePackageUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public McServiceSoftwarePackageUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper idEq(Long id){
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
    public McServiceSoftwarePackageUpdateWrapper idNe(Long id){
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
    public McServiceSoftwarePackageUpdateWrapper idGt(Long id){
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
    public McServiceSoftwarePackageUpdateWrapper idGe(Long id){
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
    public McServiceSoftwarePackageUpdateWrapper idLt(Long id){
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
    public McServiceSoftwarePackageUpdateWrapper idLe(Long id){
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
    public McServiceSoftwarePackageUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public McServiceSoftwarePackageUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public McServiceSoftwarePackageUpdateWrapper idLike(Long id){
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
    public McServiceSoftwarePackageUpdateWrapper idNotLike(Long id){
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
    public McServiceSoftwarePackageUpdateWrapper idLikeLeft(Long id){
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
    public McServiceSoftwarePackageUpdateWrapper idLikeRight(Long id){
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
    public McServiceSoftwarePackageUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper idIn(Collection<Long> value){
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
    public McServiceSoftwarePackageUpdateWrapper idIn(Long... values){
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
    public McServiceSoftwarePackageUpdateWrapper idNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 等于 = fkMcServiceSoftwarePackageTypeId
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdEq(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            eq("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 不等于 &lt;&gt; fkMcServiceSoftwarePackageTypeId
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdNe(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            ne("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 大于 &gt; fkMcServiceSoftwarePackageTypeId
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdGt(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            gt("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 大于等于 &gt;= fkMcServiceSoftwarePackageTypeId
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdGe(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            ge("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 小于 &lt; fkMcServiceSoftwarePackageTypeId
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdLt(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            lt("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 小于等于 &lt;= fkMcServiceSoftwarePackageTypeId
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdLe(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            le("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMcServiceSoftwarePackageTypeIdStart       值1
     * @param fkMcServiceSoftwarePackageTypeIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdBetween(Long fkMcServiceSoftwarePackageTypeIdStart,Long fkMcServiceSoftwarePackageTypeIdEnd){
        if(fkMcServiceSoftwarePackageTypeIdStart!=null && fkMcServiceSoftwarePackageTypeIdEnd!=null){
            between("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeIdStart,fkMcServiceSoftwarePackageTypeIdEnd);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMcServiceSoftwarePackageTypeIdStart       值1
     * @param fkMcServiceSoftwarePackageTypeIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdNotBetween(Long fkMcServiceSoftwarePackageTypeIdStart,Long fkMcServiceSoftwarePackageTypeIdEnd){
        if(fkMcServiceSoftwarePackageTypeIdStart!=null && fkMcServiceSoftwarePackageTypeIdEnd!=null){
            notBetween("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeIdStart,fkMcServiceSoftwarePackageTypeIdEnd);
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值%' fkMcServiceSoftwarePackageTypeId
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdLike(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            like("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT LIKE '%值%' fkMcServiceSoftwarePackageTypeId
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdNotLike(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            notLike("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值' fkMcServiceSoftwarePackageTypeId
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdLikeLeft(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            likeLeft("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * LIKE '值%' fkMcServiceSoftwarePackageTypeId
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdLikeRight(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            likeRight("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdIsNull(){
        isNull("fk_mc_service_software_package_type_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdIsNotNull(){
        isNotNull("fk_mc_service_software_package_type_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_mc_service_software_package_type_id",value);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_mc_service_software_package_type_id",values);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_mc_service_software_package_type_id",value);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper fkMcServiceSoftwarePackageTypeIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_service_software_package_type_id",values);
        }
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 等于 = supplierType
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeEq(Integer supplierType){
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 不等于 &lt;&gt; supplierType
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeNe(Integer supplierType){
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 大于 &gt; supplierType
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeGt(Integer supplierType){
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 大于等于 &gt;= supplierType
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeGe(Integer supplierType){
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 小于 &lt; supplierType
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeLt(Integer supplierType){
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 小于等于 &lt;= supplierType
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeLe(Integer supplierType){
        if(supplierType!=null){
            le("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * BETWEEN 值1 AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        if(supplierTypeStart!=null && supplierTypeEnd!=null){
            between("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param supplierTypeStart       值1
     * @param supplierTypeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeNotBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        if(supplierTypeStart!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }


    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * LIKE '%值%' supplierType
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeLike(Integer supplierType){
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * NOT LIKE '%值%' supplierType
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeNotLike(Integer supplierType){
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
     }


    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * LIKE '%值' supplierType
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeLikeLeft(Integer supplierType){
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * LIKE '值%' supplierType
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeLikeRight(Integer supplierType){
        if(supplierType!=null){
            likeRight("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeIsNull(){
        isNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeIsNotNull(){
        isNotNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("supplier_type",values);
        }
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("supplier_type",value);
        }
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper supplierTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("supplier_type",values);
        }
        return this;
    }

    /**
     * <p>软件包名称</p>
     * 等于 = name
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameEq(String name){
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p>软件包名称</p>
     * 不等于 &lt;&gt; name
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameNe(String name){
        if(name!=null){
            ne("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 大于 &gt; name
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameGt(String name){
        if(name!=null){
            gt("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 大于等于 &gt;= name
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameGe(String name){
        if(name!=null){
            ge("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 小于 &lt; name
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameLt(String name){
        if(name!=null){
            lt("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 小于等于 &lt;= name
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameLe(String name){
        if(name!=null){
            le("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * BETWEEN 值1 AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameBetween(String nameStart,String nameEnd){
        if(nameStart!=null && nameEnd!=null){
            between("name",nameStart,nameEnd);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameNotBetween(String nameStart,String nameEnd){
        if(nameStart!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p>软件包名称</p>
     * LIKE '%值%' name
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameLike(String name){
        if(name!=null){
            like("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * NOT LIKE '%值%' name
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameNotLike(String name){
        if(name!=null){
            notLike("name",name);
        }
        return this;
     }


    /**
     * <p>软件包名称</p>
     * LIKE '%值' name
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameLikeLeft(String name){
        if(name!=null){
            likeLeft("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * LIKE '值%' name
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameLikeRight(String name){
        if(name!=null){
            likeRight("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p>软件包名称</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p>软件包名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("name",value);
        }
        return this;
    }

    /**
     * <p>软件包名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameIn(String... values){
        if(values!=null && values.length>0){
            in("name",values);
        }
        return this;
    }

    /**
     * <p>软件包名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("name",value);
        }
        return this;
    }

    /**
     * <p>软件包名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 等于 = imageId
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt; imageId
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于 &gt; imageId
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;= imageId
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于 &lt; imageId
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;= imageId
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdLe(String imageId){
        if(imageId!=null){
            le("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            between("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageIdStart       值1
     * @param imageIdEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值%' imageId
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%' imageId
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("image_id",imageId);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值' imageId
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '值%' imageId
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdLikeRight(String imageId){
        if(imageId!=null){
            likeRight("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("image_id",value);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdIn(String... values){
        if(values!=null && values.length>0){
            in("image_id",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("image_id",value);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_id",values);
        }
        return this;
    }

    /**
     * <p>版本名称</p>
     * 等于 = version
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionEq(String version){
        if(version!=null){
            eq("version",version);
        }
        return this;
    }

    /**
     * <p>版本名称</p>
     * 不等于 &lt;&gt; version
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionNe(String version){
        if(version!=null){
            ne("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 大于 &gt; version
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionGt(String version){
        if(version!=null){
            gt("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 大于等于 &gt;= version
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionGe(String version){
        if(version!=null){
            ge("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 小于 &lt; version
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionLt(String version){
        if(version!=null){
            lt("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 小于等于 &lt;= version
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionLe(String version){
        if(version!=null){
            le("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * BETWEEN 值1 AND 值2
     * @param versionStart       值1
     * @param versionEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionBetween(String versionStart,String versionEnd){
        if(versionStart!=null && versionEnd!=null){
            between("version",versionStart,versionEnd);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionStart       值1
     * @param versionEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionNotBetween(String versionStart,String versionEnd){
        if(versionStart!=null && versionEnd!=null){
            notBetween("version",versionStart,versionEnd);
        }
        return this;
     }


    /**
     * <p>版本名称</p>
     * LIKE '%值%' version
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionLike(String version){
        if(version!=null){
            like("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * NOT LIKE '%值%' version
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionNotLike(String version){
        if(version!=null){
            notLike("version",version);
        }
        return this;
     }


    /**
     * <p>版本名称</p>
     * LIKE '%值' version
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionLikeLeft(String version){
        if(version!=null){
            likeLeft("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * LIKE '值%' version
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionLikeRight(String version){
        if(version!=null){
            likeRight("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionIsNull(){
        isNull("version");
        return this;
    }

    /**
     * <p>版本名称</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionIsNotNull(){
        isNotNull("version");
        return this;
    }

    /**
     * <p>版本名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("version",value);
        }
        return this;
    }

    /**
     * <p>版本名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionIn(String... values){
        if(values!=null && values.length>0){
            in("version",values);
        }
        return this;
    }

    /**
     * <p>版本名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("version",value);
        }
        return this;
    }

    /**
     * <p>版本名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper versionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper createTimeEq(Date createTime){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeNe(Date createTime){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeGt(Date createTime){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeGe(Date createTime){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeLt(Date createTime){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeLe(Date createTime){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeLike(Date createTime){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeNotLike(Date createTime){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeLikeRight(Date createTime){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper createTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeIn(Date... values){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageUpdateWrapper createTimeNotIn(Date... values){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
