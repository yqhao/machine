package com.suqi.center.machine.dao.viz.wrapper;

import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.viz.entity.McServiceSoftwarePackageType;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 云机端软件包类型表
 * </p>
 * "mc_service_software_package_type"
 * @author 18374
 */
public class McServiceSoftwarePackageTypeUpdateEntityWrapper extends UpdateWrapper<McServiceSoftwarePackageType> {

    public static McServiceSoftwarePackageTypeUpdateEntityWrapper wrapper(McServiceSoftwarePackageType entity) {
        return new McServiceSoftwarePackageTypeUpdateEntityWrapper(entity);
    }

    private McServiceSoftwarePackageType entity;

    public McServiceSoftwarePackageTypeUpdateEntityWrapper(McServiceSoftwarePackageType entity) {
        this.entity=entity;
    }

    /**
     * 记录id自动增长
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 类型名称
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper setName(String name) {
         set("name",name);
        return this;
    }
    /**
     * 状态(-50：删除，50：正常)
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 创建时间
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }

    protected McServiceSoftwarePackageType entity() {
        if(entity==null){
            throw new NullPointerException("McServiceSoftwarePackageType is null");
        }
        return entity;
    }

    /**
     * <p>记录id自动增长</p>
     * 等于 = entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idEq(){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",entity().getId(),idEnd);
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",entity().getId(),idEnd);
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p>记录id自动增长</p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p>记录id自动增长</p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",entity().getId());
        }
        return this;
     }

/**
     * <p>记录id自动增长</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idEq(Long id){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idNe(Long id){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idGt(Long id){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idGe(Long id){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idLt(Long id){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idLe(Long id){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idLike(Long id){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idNotLike(Long id){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idLikeLeft(Long id){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idLikeRight(Long id){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>记录id自动增长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idIn(Collection<Long> value){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idIn(Long... values){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * 等于 = entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameEq(){
        String name =entity().getName();
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * 不等于 &lt;&gt; entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameNe(){
        String name =entity().getName();
        if(name!=null){
            ne("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>类型名称</p>
     * 大于 &gt; entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameGt(){
        String name =entity().getName();
        if(name!=null){
            gt("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>类型名称</p>
     * 大于等于 &gt;= entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameGe(){
        String name =entity().getName();
        if(name!=null){
            ge("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>类型名称</p>
     * 小于 &lt; entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameLt(){
        String name =entity().getName();
        if(name!=null){
            lt("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>类型名称</p>
     * 小于等于 &lt;= entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameLe(){
        String name =entity().getName();
        if(name!=null){
            le("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>类型名称</p>
     * BETWEEN  entity().getName() AND 值2
     * @param nameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameBetween(String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            between("name",entity().getName(),nameEnd);
        }
        return this;
     }

    /**
     * <p>类型名称</p>
     * NOT BETWEEN  entity().getName() AND 值2
     * @param nameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameNotBetween(String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            notBetween("name",entity().getName(),nameEnd);
        }
        return this;
     }

    /**
     * <p>类型名称</p>
     * BETWEEN  entity().getName() AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameBetween(String nameStart,String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            between("name",nameStart,nameEnd);
        }
        return this;
     }

    /**
     * <p>类型名称</p>
     * NOT BETWEEN  entity().getName() AND 值2
     * @param nameStart       值1
     * @param nameEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameNotBetween(String nameStart,String nameEnd){
        String name =entity().getName();
        if(name!=null && nameEnd!=null){
            notBetween("name",nameStart,nameEnd);
        }
        return this;
     }


    /**
     * <p>类型名称</p>
     * LIKE '%值%' entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameLike(){
        String name =entity().getName();
        if(name!=null){
            like("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>类型名称</p>
     * NOT LIKE '%值%' entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameNotLike(){
        String name =entity().getName();
        if(name!=null){
            notLike("name",entity().getName());
        }
        return this;
     }


    /**
     * <p>类型名称</p>
     * LIKE '%值' entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameLikeLeft(){
        String name =entity().getName();
        if(name!=null){
            likeLeft("name",entity().getName());
        }
        return this;
     }

    /**
     * <p>类型名称</p>
     * LIKE '值%' entity().getName()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameLikeRight(){
        String name =entity().getName();
        if(name!=null){
            likeRight("name",entity().getName());
        }
        return this;
     }

/**
     * <p>类型名称</p>
     * 等于 =
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameEq(String name){
        if(name!=null){
            eq("name",name);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * 不等于 &lt;&gt;
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameNe(String name){
        if(name!=null){
            ne("name",name);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * 大于 &gt;
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameGt(String name){
        if(name!=null){
            gt("name",name);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * 大于等于 &gt;=
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameGe(String name){
        if(name!=null){
            ge("name",name);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * 小于 &lt;
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameLt(String name){
        if(name!=null){
            lt("name",name);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * 小于等于 &lt;=
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameLe(String name){
        if(name!=null){
            le("name",name);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * LIKE '%值%'
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameLike(String name){
        if(name!=null){
            like("name",name);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * NOT LIKE '%值%'
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameNotLike(String name){
        if(name!=null){
            notLike("name",name);
        }
        return this;
    }


    /**
     * <p>类型名称</p>
     * LIKE '%值'
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameLikeLeft(String name){
        if(name!=null){
            likeLeft("name",name);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * LIKE '值%'
     * @param name       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameLikeRight(String name){
        if(name!=null){
            likeRight("name",name);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * IS NULL
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameIsNull(){
        isNull("name");
        return this;
    }

    /**
     * <p>类型名称</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameIsNotNull(){
        isNotNull("name");
        return this;
    }

    /**
     * <p>类型名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("name",value);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameIn(String... values){
        if(values!=null && values.length>0){
            in("name",values);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("name",value);
        }
        return this;
    }

    /**
     * <p>类型名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper nameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("name",values);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",entity().getStatus(),statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",entity().getStatus());
        }
        return this;
     }


    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",entity().getStatus());
        }
        return this;
     }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",entity().getStatus());
        }
        return this;
     }

/**
     * <p>状态(-50：删除，50：正常)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusEq(Integer status){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusNe(Integer status){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusGt(Integer status){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusGe(Integer status){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusLt(Integer status){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusLike(Integer status){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusNotLike(Integer status){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusLikeLeft(Integer status){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusLikeRight(Integer status){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(-50：删除，50：正常)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusIn(Integer... values){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusNotIn(Collection<Integer> value){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeEq(){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",entity().getCreateTime(),createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",entity().getCreateTime(),createTimeEnd);
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",entity().getCreateTime());
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",entity().getCreateTime());
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",entity().getCreateTime());
        }
        return this;
     }

/**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeEq(Date createTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeNe(Date createTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeGt(Date createTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeGe(Date createTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeLt(Date createTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeLe(Date createTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeLike(Date createTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeIn(Date... values){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeEq(){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",entity().getLastUpdateTime(),lastUpdateTimeEnd);
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",entity().getLastUpdateTime());
        }
        return this;
     }

/**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McServiceSoftwarePackageTypeUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


}
