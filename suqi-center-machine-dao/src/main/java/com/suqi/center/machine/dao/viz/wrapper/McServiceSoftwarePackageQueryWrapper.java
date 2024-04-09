package com.suqi.center.machine.dao.viz.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackage;

import java.util.Collection;
import java.util.Date;
import java.util.function.Consumer;


/**
 * <p>
 * 云机端软件包表
 * </p>
 * "mc_service_software_package"
 * @author 18374
 */
public class McServiceSoftwarePackageQueryWrapper extends QueryWrapper<McServiceSoftwarePackage> {


    public static McServiceSoftwarePackageQueryWrapper wrapper() {
        return new McServiceSoftwarePackageQueryWrapper();
    }

    public McServiceSoftwarePackageQueryWrapper() {
        super();
    }

    public McServiceSoftwarePackageQueryWrapper(McServiceSoftwarePackage entity) {
        super(entity);
    }

    public McServiceSoftwarePackageQueryWrapper(McServiceSoftwarePackage entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public McServiceSoftwarePackageQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public McServiceSoftwarePackageQueryWrapper selectColumns(Consumer<McServiceSoftwarePackageSelect> consumer) {
        McServiceSoftwarePackageSelect select = new McServiceSoftwarePackageSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p>记录id自动增长</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper idEq(Long id){
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
    public McServiceSoftwarePackageQueryWrapper idNe(Long id){
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
    public McServiceSoftwarePackageQueryWrapper idGt(Long id){
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
    public McServiceSoftwarePackageQueryWrapper idGe(Long id){
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
    public McServiceSoftwarePackageQueryWrapper idLt(Long id){
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
    public McServiceSoftwarePackageQueryWrapper idLe(Long id){
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
    public McServiceSoftwarePackageQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public McServiceSoftwarePackageQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper idLike(Long id){
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
    public McServiceSoftwarePackageQueryWrapper idNotLike(Long id){
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
    public McServiceSoftwarePackageQueryWrapper idLikeLeft(Long id){
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
    public McServiceSoftwarePackageQueryWrapper idLikeRight(Long id){
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
    public McServiceSoftwarePackageQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper idIn(Collection<Long> value){
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
    public McServiceSoftwarePackageQueryWrapper idIn(Long... values){
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
    public McServiceSoftwarePackageQueryWrapper idNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 等于 =
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdEq(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            eq("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * 不等于 &lt;&gt;
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdNe(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            ne("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 大于 &gt;
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdGt(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            gt("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 大于等于 &gt;=
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdGe(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            ge("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 小于 &lt;
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdLt(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            lt("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * 小于等于 &lt;=
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdLe(Long fkMcServiceSoftwarePackageTypeId){
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
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdBetween(Long fkMcServiceSoftwarePackageTypeIdStart,Long fkMcServiceSoftwarePackageTypeIdEnd){
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
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdNotBetween(Long fkMcServiceSoftwarePackageTypeIdStart,Long fkMcServiceSoftwarePackageTypeIdEnd){
        if(fkMcServiceSoftwarePackageTypeIdStart!=null && fkMcServiceSoftwarePackageTypeIdEnd!=null){
            notBetween("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeIdStart,fkMcServiceSoftwarePackageTypeIdEnd);
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值%'
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdLike(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            like("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * NOT LIKE '%值%'
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdNotLike(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            notLike("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }


    /**
     * <p>软件包类型记录id</p>
     * LIKE '%值'
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdLikeLeft(Long fkMcServiceSoftwarePackageTypeId){
        if(fkMcServiceSoftwarePackageTypeId!=null){
            likeLeft("fk_mc_service_software_package_type_id",fkMcServiceSoftwarePackageTypeId);
        }
        return this;
     }

    /**
     * <p>软件包类型记录id</p>
     * LIKE '值%'
     * @param fkMcServiceSoftwarePackageTypeId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdLikeRight(Long fkMcServiceSoftwarePackageTypeId){
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
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdIsNull(){
        isNull("fk_mc_service_software_package_type_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdIsNotNull(){
        isNotNull("fk_mc_service_software_package_type_id");
        return this;
    }

    /**
     * <p>软件包类型记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdIn(Collection<Long> value){
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
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdIn(Long... values){
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
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageQueryWrapper fkMcServiceSoftwarePackageTypeIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_mc_service_software_package_type_id",values);
        }
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 等于 =
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper supplierTypeEq(Integer supplierType){
        if(supplierType!=null){
            eq("supplier_type",supplierType);
        }
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 不等于 &lt;&gt;
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper supplierTypeNe(Integer supplierType){
        if(supplierType!=null){
            ne("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 大于 &gt;
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper supplierTypeGt(Integer supplierType){
        if(supplierType!=null){
            gt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 大于等于 &gt;=
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper supplierTypeGe(Integer supplierType){
        if(supplierType!=null){
            ge("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 小于 &lt;
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper supplierTypeLt(Integer supplierType){
        if(supplierType!=null){
            lt("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * 小于等于 &lt;=
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper supplierTypeLe(Integer supplierType){
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
    public McServiceSoftwarePackageQueryWrapper supplierTypeBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
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
    public McServiceSoftwarePackageQueryWrapper supplierTypeNotBetween(Integer supplierTypeStart,Integer supplierTypeEnd){
        if(supplierTypeStart!=null && supplierTypeEnd!=null){
            notBetween("supplier_type",supplierTypeStart,supplierTypeEnd);
        }
        return this;
     }


    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper supplierTypeLike(Integer supplierType){
        if(supplierType!=null){
            like("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * NOT LIKE '%值%'
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper supplierTypeNotLike(Integer supplierType){
        if(supplierType!=null){
            notLike("supplier_type",supplierType);
        }
        return this;
     }


    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * LIKE '%值'
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper supplierTypeLikeLeft(Integer supplierType){
        if(supplierType!=null){
            likeLeft("supplier_type",supplierType);
        }
        return this;
     }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * LIKE '值%'
     * @param supplierType       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper supplierTypeLikeRight(Integer supplierType){
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
    public McServiceSoftwarePackageQueryWrapper supplierTypeIsNull(){
        isNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper supplierTypeIsNotNull(){
        isNotNull("supplier_type");
        return this;
    }

    /**
     * <p>供应商类型（1：华为，2：腾讯，3：百度）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper supplierTypeIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageQueryWrapper supplierTypeIn(Integer... values){
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
    public McServiceSoftwarePackageQueryWrapper supplierTypeNotIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageQueryWrapper supplierTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("supplier_type",values);
        }
        return this;
    }

    /**
     * <p>软件包名称</p>
     * 等于 =
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper nameEq(String name){
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p>软件包名称</p>
     * 不等于 &lt;&gt;
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper nameNe(String name){
        if(name!=null){
            ne("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 大于 &gt;
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper nameGt(String name){
        if(name!=null){
            gt("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 大于等于 &gt;=
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper nameGe(String name){
        if(name!=null){
            ge("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 小于 &lt;
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper nameLt(String name){
        if(name!=null){
            lt("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * 小于等于 &lt;=
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper nameLe(String name){
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
    public McServiceSoftwarePackageQueryWrapper nameBetween(String nameStart,String nameEnd){
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
    public McServiceSoftwarePackageQueryWrapper nameNotBetween(String nameStart,String nameEnd){
        if(nameStart!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p>软件包名称</p>
     * LIKE '%值%'
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper nameLike(String name){
        if(name!=null){
            like("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * NOT LIKE '%值%'
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper nameNotLike(String name){
        if(name!=null){
            notLike("name",name);
        }
        return this;
     }


    /**
     * <p>软件包名称</p>
     * LIKE '%值'
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper nameLikeLeft(String name){
        if(name!=null){
            likeLeft("name",name);
        }
        return this;
     }

    /**
     * <p>软件包名称</p>
     * LIKE '值%'
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper nameLikeRight(String name){
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
    public McServiceSoftwarePackageQueryWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p>软件包名称</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p>软件包名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper nameIn(Collection<String> value){
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
    public McServiceSoftwarePackageQueryWrapper nameIn(String... values){
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
    public McServiceSoftwarePackageQueryWrapper nameNotIn(Collection<String> value){
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
    public McServiceSoftwarePackageQueryWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 等于 =
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper imageIdEq(String imageId){
        if(imageId!=null){
            eq("image_id",imageId);
        }
        return this;
    }

    /**
     * <p>镜像id</p>
     * 不等于 &lt;&gt;
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper imageIdNe(String imageId){
        if(imageId!=null){
            ne("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于 &gt;
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper imageIdGt(String imageId){
        if(imageId!=null){
            gt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 大于等于 &gt;=
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper imageIdGe(String imageId){
        if(imageId!=null){
            ge("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于 &lt;
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper imageIdLt(String imageId){
        if(imageId!=null){
            lt("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * 小于等于 &lt;=
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper imageIdLe(String imageId){
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
    public McServiceSoftwarePackageQueryWrapper imageIdBetween(String imageIdStart,String imageIdEnd){
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
    public McServiceSoftwarePackageQueryWrapper imageIdNotBetween(String imageIdStart,String imageIdEnd){
        if(imageIdStart!=null && imageIdEnd!=null){
            notBetween("image_id",imageIdStart,imageIdEnd);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper imageIdLike(String imageId){
        if(imageId!=null){
            like("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * NOT LIKE '%值%'
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper imageIdNotLike(String imageId){
        if(imageId!=null){
            notLike("image_id",imageId);
        }
        return this;
     }


    /**
     * <p>镜像id</p>
     * LIKE '%值'
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper imageIdLikeLeft(String imageId){
        if(imageId!=null){
            likeLeft("image_id",imageId);
        }
        return this;
     }

    /**
     * <p>镜像id</p>
     * LIKE '值%'
     * @param imageId       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper imageIdLikeRight(String imageId){
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
    public McServiceSoftwarePackageQueryWrapper imageIdIsNull(){
        isNull("image_id");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper imageIdIsNotNull(){
        isNotNull("image_id");
        return this;
    }

    /**
     * <p>镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper imageIdIn(Collection<String> value){
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
    public McServiceSoftwarePackageQueryWrapper imageIdIn(String... values){
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
    public McServiceSoftwarePackageQueryWrapper imageIdNotIn(Collection<String> value){
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
    public McServiceSoftwarePackageQueryWrapper imageIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_id",values);
        }
        return this;
    }

    /**
     * <p>版本名称</p>
     * 等于 =
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper versionEq(String version){
        if(version!=null){
            eq("version",version);
        }
        return this;
    }

    /**
     * <p>版本名称</p>
     * 不等于 &lt;&gt;
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper versionNe(String version){
        if(version!=null){
            ne("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 大于 &gt;
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper versionGt(String version){
        if(version!=null){
            gt("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 大于等于 &gt;=
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper versionGe(String version){
        if(version!=null){
            ge("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 小于 &lt;
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper versionLt(String version){
        if(version!=null){
            lt("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * 小于等于 &lt;=
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper versionLe(String version){
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
    public McServiceSoftwarePackageQueryWrapper versionBetween(String versionStart,String versionEnd){
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
    public McServiceSoftwarePackageQueryWrapper versionNotBetween(String versionStart,String versionEnd){
        if(versionStart!=null && versionEnd!=null){
            notBetween("version",versionStart,versionEnd);
        }
        return this;
     }


    /**
     * <p>版本名称</p>
     * LIKE '%值%'
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper versionLike(String version){
        if(version!=null){
            like("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * NOT LIKE '%值%'
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper versionNotLike(String version){
        if(version!=null){
            notLike("version",version);
        }
        return this;
     }


    /**
     * <p>版本名称</p>
     * LIKE '%值'
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper versionLikeLeft(String version){
        if(version!=null){
            likeLeft("version",version);
        }
        return this;
     }

    /**
     * <p>版本名称</p>
     * LIKE '值%'
     * @param version       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper versionLikeRight(String version){
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
    public McServiceSoftwarePackageQueryWrapper versionIsNull(){
        isNull("version");
        return this;
    }

    /**
     * <p>版本名称</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper versionIsNotNull(){
        isNotNull("version");
        return this;
    }

    /**
     * <p>版本名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper versionIn(Collection<String> value){
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
    public McServiceSoftwarePackageQueryWrapper versionIn(String... values){
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
    public McServiceSoftwarePackageQueryWrapper versionNotIn(Collection<String> value){
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
    public McServiceSoftwarePackageQueryWrapper versionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("version",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper statusLe(Integer status){
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
    public McServiceSoftwarePackageQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public McServiceSoftwarePackageQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper statusLikeRight(Integer status){
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
    public McServiceSoftwarePackageQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper statusIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageQueryWrapper statusIn(Integer... values){
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
    public McServiceSoftwarePackageQueryWrapper statusNotIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper createTimeEq(Date createTime){
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
    public McServiceSoftwarePackageQueryWrapper createTimeNe(Date createTime){
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
    public McServiceSoftwarePackageQueryWrapper createTimeGt(Date createTime){
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
    public McServiceSoftwarePackageQueryWrapper createTimeGe(Date createTime){
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
    public McServiceSoftwarePackageQueryWrapper createTimeLt(Date createTime){
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
    public McServiceSoftwarePackageQueryWrapper createTimeLe(Date createTime){
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
    public McServiceSoftwarePackageQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper createTimeLike(Date createTime){
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
    public McServiceSoftwarePackageQueryWrapper createTimeNotLike(Date createTime){
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
    public McServiceSoftwarePackageQueryWrapper createTimeLikeLeft(Date createTime){
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
    public McServiceSoftwarePackageQueryWrapper createTimeLikeRight(Date createTime){
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
    public McServiceSoftwarePackageQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper createTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageQueryWrapper createTimeIn(Date... values){
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
    public McServiceSoftwarePackageQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeIn(Date... values){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
