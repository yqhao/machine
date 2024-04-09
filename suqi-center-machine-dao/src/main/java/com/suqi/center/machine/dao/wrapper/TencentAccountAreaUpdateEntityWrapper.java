package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.TencentAccountArea;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 腾讯账号区域表
 * </p>
 * "tencent_account_area"
 * @author PC001
 */
public class TencentAccountAreaUpdateEntityWrapper extends UpdateWrapper<TencentAccountArea> {

    public static TencentAccountAreaUpdateEntityWrapper wrapper(TencentAccountArea entity) {
        return new TencentAccountAreaUpdateEntityWrapper(entity);
    }

    private TencentAccountArea entity;

    public TencentAccountAreaUpdateEntityWrapper(TencentAccountArea entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public TencentAccountAreaUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 腾讯账号Id
     */
    public TencentAccountAreaUpdateEntityWrapper setFkTencentAccountId(Long fkTencentAccountId) {
         set("fk_tencent_account_id",fkTencentAccountId);
        return this;
    }
    /**
     * box_soc的表的主键ID[用这个id做关联]
     */
    public TencentAccountAreaUpdateEntityWrapper setFkAccountAreaId(Long fkAccountAreaId) {
         set("fk_account_area_id",fkAccountAreaId);
        return this;
    }
    /**
     * 腾讯区域
     */
    public TencentAccountAreaUpdateEntityWrapper setRegion(String region) {
         set("region",region);
        return this;
    }
    /**
     * 创建时间
     */
    public TencentAccountAreaUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public TencentAccountAreaUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 区域表ID
     */
    public TencentAccountAreaUpdateEntityWrapper setFkPcpAreaId(Long fkPcpAreaId) {
         set("fk_pcp_area_id",fkPcpAreaId);
        return this;
    }

    protected TencentAccountArea entity() {
        if(entity==null){
            throw new NullPointerException("TencentAccountArea is null");
        }
        return entity;
    }

    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idEq(){
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
    public TencentAccountAreaUpdateEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",entity().getId(),idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",entity().getId(),idEnd);
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
    public TencentAccountAreaUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentAccountAreaUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentAccountAreaUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",entity().getId());
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",entity().getId());
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",entity().getId());
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idEq(Long id){
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
    public TencentAccountAreaUpdateEntityWrapper idNe(Long id){
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
    public TencentAccountAreaUpdateEntityWrapper idGt(Long id){
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
    public TencentAccountAreaUpdateEntityWrapper idGe(Long id){
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
    public TencentAccountAreaUpdateEntityWrapper idLt(Long id){
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
    public TencentAccountAreaUpdateEntityWrapper idLe(Long id){
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
    public TencentAccountAreaUpdateEntityWrapper idLike(Long id){
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
    public TencentAccountAreaUpdateEntityWrapper idNotLike(Long id){
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
    public TencentAccountAreaUpdateEntityWrapper idLikeLeft(Long id){
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
    public TencentAccountAreaUpdateEntityWrapper idLikeRight(Long id){
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
    public TencentAccountAreaUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper idIn(Collection<Long> value){
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
    public TencentAccountAreaUpdateEntityWrapper idIn(Long... values){
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
    public TencentAccountAreaUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public TencentAccountAreaUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * 等于 = entity().getFkTencentAccountId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdEq(){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null){
            eq("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * 不等于 &lt;&gt; entity().getFkTencentAccountId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdNe(){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null){
            ne("fk_tencent_account_id",entity().getFkTencentAccountId());
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * 大于 &gt; entity().getFkTencentAccountId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdGt(){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null){
            gt("fk_tencent_account_id",entity().getFkTencentAccountId());
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * 大于等于 &gt;= entity().getFkTencentAccountId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdGe(){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null){
            ge("fk_tencent_account_id",entity().getFkTencentAccountId());
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * 小于 &lt; entity().getFkTencentAccountId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdLt(){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null){
            lt("fk_tencent_account_id",entity().getFkTencentAccountId());
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * 小于等于 &lt;= entity().getFkTencentAccountId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdLe(){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null){
            le("fk_tencent_account_id",entity().getFkTencentAccountId());
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * BETWEEN  entity().getFkTencentAccountId() AND 值2
     * @param fkTencentAccountIdEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdBetween(Long fkTencentAccountIdEnd){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null && fkTencentAccountIdEnd!=null){
            between("fk_tencent_account_id",entity().getFkTencentAccountId(),fkTencentAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * NOT BETWEEN  entity().getFkTencentAccountId() AND 值2
     * @param fkTencentAccountIdEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdNotBetween(Long fkTencentAccountIdEnd){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null && fkTencentAccountIdEnd!=null){
            notBetween("fk_tencent_account_id",entity().getFkTencentAccountId(),fkTencentAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * BETWEEN  entity().getFkTencentAccountId() AND 值2
     * @param fkTencentAccountIdStart       值1
     * @param fkTencentAccountIdEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdBetween(Long fkTencentAccountIdStart,Long fkTencentAccountIdEnd){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null && fkTencentAccountIdEnd!=null){
            between("fk_tencent_account_id",fkTencentAccountIdStart,fkTencentAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * NOT BETWEEN  entity().getFkTencentAccountId() AND 值2
     * @param fkTencentAccountIdStart       值1
     * @param fkTencentAccountIdEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdNotBetween(Long fkTencentAccountIdStart,Long fkTencentAccountIdEnd){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null && fkTencentAccountIdEnd!=null){
            notBetween("fk_tencent_account_id",fkTencentAccountIdStart,fkTencentAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯账号Id</p>
     * LIKE '%值%' entity().getFkTencentAccountId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdLike(){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null){
            like("fk_tencent_account_id",entity().getFkTencentAccountId());
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * NOT LIKE '%值%' entity().getFkTencentAccountId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdNotLike(){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null){
            notLike("fk_tencent_account_id",entity().getFkTencentAccountId());
        }
        return this;
     }


    /**
     * <p>腾讯账号Id</p>
     * LIKE '%值' entity().getFkTencentAccountId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdLikeLeft(){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null){
            likeLeft("fk_tencent_account_id",entity().getFkTencentAccountId());
        }
        return this;
     }

    /**
     * <p>腾讯账号Id</p>
     * LIKE '值%' entity().getFkTencentAccountId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdLikeRight(){
        Long fkTencentAccountId =entity().getFkTencentAccountId();
        if(fkTencentAccountId!=null){
            likeRight("fk_tencent_account_id",entity().getFkTencentAccountId());
        }
        return this;
     }

/**
     * <p>腾讯账号Id</p>
     * 等于 =
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdEq(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            eq("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * 不等于 &lt;&gt;
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdNe(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            ne("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * 大于 &gt;
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdGt(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            gt("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * 大于等于 &gt;=
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdGe(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            ge("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * 小于 &lt;
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdLt(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            lt("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * 小于等于 &lt;=
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdLe(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            le("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * LIKE '%值%'
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdLike(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            like("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * NOT LIKE '%值%'
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdNotLike(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            notLike("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }


    /**
     * <p>腾讯账号Id</p>
     * LIKE '%值'
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdLikeLeft(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            likeLeft("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * LIKE '值%'
     * @param fkTencentAccountId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdLikeRight(Long fkTencentAccountId){
        if(fkTencentAccountId!=null){
            likeRight("fk_tencent_account_id",fkTencentAccountId);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * IS NULL
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdIsNull(){
        isNull("fk_tencent_account_id");
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdIsNotNull(){
        isNotNull("fk_tencent_account_id");
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_tencent_account_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_tencent_account_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_tencent_account_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯账号Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkTencentAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_tencent_account_id",values);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 等于 = entity().getFkAccountAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdEq(){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null){
            eq("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 不等于 &lt;&gt; entity().getFkAccountAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdNe(){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null){
            ne("fk_account_area_id",entity().getFkAccountAreaId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于 &gt; entity().getFkAccountAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdGt(){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null){
            gt("fk_account_area_id",entity().getFkAccountAreaId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于等于 &gt;= entity().getFkAccountAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdGe(){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null){
            ge("fk_account_area_id",entity().getFkAccountAreaId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于 &lt; entity().getFkAccountAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdLt(){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null){
            lt("fk_account_area_id",entity().getFkAccountAreaId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于等于 &lt;= entity().getFkAccountAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdLe(){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null){
            le("fk_account_area_id",entity().getFkAccountAreaId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * BETWEEN  entity().getFkAccountAreaId() AND 值2
     * @param fkAccountAreaIdEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdBetween(Long fkAccountAreaIdEnd){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null && fkAccountAreaIdEnd!=null){
            between("fk_account_area_id",entity().getFkAccountAreaId(),fkAccountAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT BETWEEN  entity().getFkAccountAreaId() AND 值2
     * @param fkAccountAreaIdEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdNotBetween(Long fkAccountAreaIdEnd){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null && fkAccountAreaIdEnd!=null){
            notBetween("fk_account_area_id",entity().getFkAccountAreaId(),fkAccountAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * BETWEEN  entity().getFkAccountAreaId() AND 值2
     * @param fkAccountAreaIdStart       值1
     * @param fkAccountAreaIdEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdBetween(Long fkAccountAreaIdStart,Long fkAccountAreaIdEnd){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null && fkAccountAreaIdEnd!=null){
            between("fk_account_area_id",fkAccountAreaIdStart,fkAccountAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT BETWEEN  entity().getFkAccountAreaId() AND 值2
     * @param fkAccountAreaIdStart       值1
     * @param fkAccountAreaIdEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdNotBetween(Long fkAccountAreaIdStart,Long fkAccountAreaIdEnd){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null && fkAccountAreaIdEnd!=null){
            notBetween("fk_account_area_id",fkAccountAreaIdStart,fkAccountAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值%' entity().getFkAccountAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdLike(){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null){
            like("fk_account_area_id",entity().getFkAccountAreaId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT LIKE '%值%' entity().getFkAccountAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdNotLike(){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null){
            notLike("fk_account_area_id",entity().getFkAccountAreaId());
        }
        return this;
     }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值' entity().getFkAccountAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdLikeLeft(){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null){
            likeLeft("fk_account_area_id",entity().getFkAccountAreaId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '值%' entity().getFkAccountAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdLikeRight(){
        Long fkAccountAreaId =entity().getFkAccountAreaId();
        if(fkAccountAreaId!=null){
            likeRight("fk_account_area_id",entity().getFkAccountAreaId());
        }
        return this;
     }

/**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 等于 =
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdEq(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            eq("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 不等于 &lt;&gt;
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdNe(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            ne("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于 &gt;
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdGt(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            gt("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于等于 &gt;=
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdGe(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            ge("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于 &lt;
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdLt(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            lt("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于等于 &lt;=
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdLe(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            le("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值%'
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdLike(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            like("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT LIKE '%值%'
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdNotLike(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            notLike("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值'
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdLikeLeft(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            likeLeft("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '值%'
     * @param fkAccountAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdLikeRight(Long fkAccountAreaId){
        if(fkAccountAreaId!=null){
            likeRight("fk_account_area_id",fkAccountAreaId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IS NULL
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdIsNull(){
        isNull("fk_account_area_id");
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdIsNotNull(){
        isNotNull("fk_account_area_id");
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_account_area_id",value);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_account_area_id",values);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_account_area_id",value);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkAccountAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_account_area_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * 等于 = entity().getRegion()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionEq(){
        String region =entity().getRegion();
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * 不等于 &lt;&gt; entity().getRegion()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionNe(){
        String region =entity().getRegion();
        if(region!=null){
            ne("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * 大于 &gt; entity().getRegion()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionGt(){
        String region =entity().getRegion();
        if(region!=null){
            gt("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * 大于等于 &gt;= entity().getRegion()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionGe(){
        String region =entity().getRegion();
        if(region!=null){
            ge("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * 小于 &lt; entity().getRegion()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionLt(){
        String region =entity().getRegion();
        if(region!=null){
            lt("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * 小于等于 &lt;= entity().getRegion()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionLe(){
        String region =entity().getRegion();
        if(region!=null){
            le("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * BETWEEN  entity().getRegion() AND 值2
     * @param regionEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionBetween(String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            between("region",entity().getRegion(),regionEnd);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * NOT BETWEEN  entity().getRegion() AND 值2
     * @param regionEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionNotBetween(String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            notBetween("region",entity().getRegion(),regionEnd);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * BETWEEN  entity().getRegion() AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionBetween(String regionStart,String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            between("region",regionStart,regionEnd);
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * NOT BETWEEN  entity().getRegion() AND 值2
     * @param regionStart       值1
     * @param regionEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionNotBetween(String regionStart,String regionEnd){
        String region =entity().getRegion();
        if(region!=null && regionEnd!=null){
            notBetween("region",regionStart,regionEnd);
        }
        return this;
     }


    /**
     * <p>腾讯区域</p>
     * LIKE '%值%' entity().getRegion()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionLike(){
        String region =entity().getRegion();
        if(region!=null){
            like("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * NOT LIKE '%值%' entity().getRegion()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionNotLike(){
        String region =entity().getRegion();
        if(region!=null){
            notLike("region",entity().getRegion());
        }
        return this;
     }


    /**
     * <p>腾讯区域</p>
     * LIKE '%值' entity().getRegion()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionLikeLeft(){
        String region =entity().getRegion();
        if(region!=null){
            likeLeft("region",entity().getRegion());
        }
        return this;
     }

    /**
     * <p>腾讯区域</p>
     * LIKE '值%' entity().getRegion()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionLikeRight(){
        String region =entity().getRegion();
        if(region!=null){
            likeRight("region",entity().getRegion());
        }
        return this;
     }

/**
     * <p>腾讯区域</p>
     * 等于 =
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionEq(String region){
        if(region!=null){
            eq("region",region);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * 不等于 &lt;&gt;
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionNe(String region){
        if(region!=null){
            ne("region",region);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * 大于 &gt;
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionGt(String region){
        if(region!=null){
            gt("region",region);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * 大于等于 &gt;=
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionGe(String region){
        if(region!=null){
            ge("region",region);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * 小于 &lt;
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionLt(String region){
        if(region!=null){
            lt("region",region);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * 小于等于 &lt;=
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionLe(String region){
        if(region!=null){
            le("region",region);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * LIKE '%值%'
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionLike(String region){
        if(region!=null){
            like("region",region);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * NOT LIKE '%值%'
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionNotLike(String region){
        if(region!=null){
            notLike("region",region);
        }
        return this;
    }


    /**
     * <p>腾讯区域</p>
     * LIKE '%值'
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionLikeLeft(String region){
        if(region!=null){
            likeLeft("region",region);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * LIKE '值%'
     * @param region       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionLikeRight(String region){
        if(region!=null){
            likeRight("region",region);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * IS NULL
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionIsNull(){
        isNull("region");
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionIsNotNull(){
        isNotNull("region");
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("region",value);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionIn(String... values){
        if(values!=null && values.length>0){
            in("region",values);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("region",value);
        }
        return this;
    }

    /**
     * <p>腾讯区域</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper regionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("region",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper createTimeEq(){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeNe(){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeGt(){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeGe(){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeLt(){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeLe(){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeLike(){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeNotLike(){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeLikeLeft(){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeLikeRight(){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeEq(Date createTime){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeNe(Date createTime){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeGt(Date createTime){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeGe(Date createTime){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeLt(Date createTime){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeLe(Date createTime){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeLike(Date createTime){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeIn(Date... values){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentAccountAreaUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeEq(){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeNe(){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeGt(){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeGe(){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeLt(){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeLe(){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeLike(){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeNotLike(){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeLikeLeft(){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeLikeRight(){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentAccountAreaUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * 等于 = entity().getFkPcpAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdEq(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * 不等于 &lt;&gt; entity().getFkPcpAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdNe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",entity().getFkPcpAreaId());
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * 大于 &gt; entity().getFkPcpAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdGt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",entity().getFkPcpAreaId());
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * 大于等于 &gt;= entity().getFkPcpAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdGe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",entity().getFkPcpAreaId());
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * 小于 &lt; entity().getFkPcpAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdLt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",entity().getFkPcpAreaId());
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * 小于等于 &lt;= entity().getFkPcpAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdLe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",entity().getFkPcpAreaId());
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",entity().getFkPcpAreaId(),fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",entity().getFkPcpAreaId(),fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>区域表ID</p>
     * LIKE '%值%' entity().getFkPcpAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",entity().getFkPcpAreaId());
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * NOT LIKE '%值%' entity().getFkPcpAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdNotLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",entity().getFkPcpAreaId());
        }
        return this;
     }


    /**
     * <p>区域表ID</p>
     * LIKE '%值' entity().getFkPcpAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdLikeLeft(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",entity().getFkPcpAreaId());
        }
        return this;
     }

    /**
     * <p>区域表ID</p>
     * LIKE '值%' entity().getFkPcpAreaId()
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdLikeRight(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",entity().getFkPcpAreaId());
        }
        return this;
     }

/**
     * <p>区域表ID</p>
     * 等于 =
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * 不等于 &lt;&gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * 大于 &gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * 大于等于 &gt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * 小于 &lt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * 小于等于 &lt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * NOT LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }


    /**
     * <p>区域表ID</p>
     * LIKE '%值'
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * LIKE '值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * IS NULL
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域表ID</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域表ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p>区域表ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountAreaUpdateEntityWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }


}
