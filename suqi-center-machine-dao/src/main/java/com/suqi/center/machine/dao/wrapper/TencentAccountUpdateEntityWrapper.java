package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.TencentAccount;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 腾讯账号表
 * </p>
 * "tencent_account"
 * @author PC001
 * @since 2023-06-14
 */
public class TencentAccountUpdateEntityWrapper extends UpdateWrapper<TencentAccount> {

    public static TencentAccountUpdateEntityWrapper wrapper(TencentAccount entity) {
        return new TencentAccountUpdateEntityWrapper(entity);
    }

    private TencentAccount entity;

    public TencentAccountUpdateEntityWrapper(TencentAccount entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public TencentAccountUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 账号唯一标识
     */
    public TencentAccountUpdateEntityWrapper setUuid(String uuid) {
         set("uuid",uuid);
        return this;
    }
    /**
     * 腾讯云密钥Id
     */
    public TencentAccountUpdateEntityWrapper setSecretId(String secretId) {
         set("secret_id",secretId);
        return this;
    }
    /**
     * 腾讯云秘钥key
     */
    public TencentAccountUpdateEntityWrapper setSecretKey(String secretKey) {
         set("secret_key",secretKey);
        return this;
    }
    /**
     * 腾讯云请求地址
     */
    public TencentAccountUpdateEntityWrapper setEndpoint(String endpoint) {
         set("endpoint",endpoint);
        return this;
    }
    /**
     * 创建时间
     */
    public TencentAccountUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public TencentAccountUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * box_soc的表的主键ID[用这个id做关联]
     */
    public TencentAccountUpdateEntityWrapper setFkAccountId(Long fkAccountId) {
         set("fk_account_id",fkAccountId);
        return this;
    }

    protected TencentAccount entity() {
        if(entity==null){
            throw new NullPointerException("TencentAccount is null");
        }
        return entity;
    }

    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper idEq(){
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
    public TencentAccountUpdateEntityWrapper idNe(){
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
    public TencentAccountUpdateEntityWrapper idGt(){
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
    public TencentAccountUpdateEntityWrapper idGe(){
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
    public TencentAccountUpdateEntityWrapper idLt(){
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
    public TencentAccountUpdateEntityWrapper idLe(){
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
    public TencentAccountUpdateEntityWrapper idBetween(Long idEnd){
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
    public TencentAccountUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public TencentAccountUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentAccountUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentAccountUpdateEntityWrapper idLike(){
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
    public TencentAccountUpdateEntityWrapper idNotLike(){
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
    public TencentAccountUpdateEntityWrapper idLikeLeft(){
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
    public TencentAccountUpdateEntityWrapper idLikeRight(){
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
    public TencentAccountUpdateEntityWrapper idEq(Long id){
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
    public TencentAccountUpdateEntityWrapper idNe(Long id){
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
    public TencentAccountUpdateEntityWrapper idGt(Long id){
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
    public TencentAccountUpdateEntityWrapper idGe(Long id){
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
    public TencentAccountUpdateEntityWrapper idLt(Long id){
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
    public TencentAccountUpdateEntityWrapper idLe(Long id){
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
    public TencentAccountUpdateEntityWrapper idLike(Long id){
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
    public TencentAccountUpdateEntityWrapper idNotLike(Long id){
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
    public TencentAccountUpdateEntityWrapper idLikeLeft(Long id){
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
    public TencentAccountUpdateEntityWrapper idLikeRight(Long id){
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
    public TencentAccountUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper idIn(Collection<Long> value){
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
    public TencentAccountUpdateEntityWrapper idIn(Long... values){
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
    public TencentAccountUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public TencentAccountUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * 等于 = entity().getUuid()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidEq(){
        String uuid =entity().getUuid();
        if(uuid!=null){
            eq("uuid",uuid);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * 不等于 &lt;&gt; entity().getUuid()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidNe(){
        String uuid =entity().getUuid();
        if(uuid!=null){
            ne("uuid",entity().getUuid());
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * 大于 &gt; entity().getUuid()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidGt(){
        String uuid =entity().getUuid();
        if(uuid!=null){
            gt("uuid",entity().getUuid());
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * 大于等于 &gt;= entity().getUuid()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidGe(){
        String uuid =entity().getUuid();
        if(uuid!=null){
            ge("uuid",entity().getUuid());
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * 小于 &lt; entity().getUuid()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidLt(){
        String uuid =entity().getUuid();
        if(uuid!=null){
            lt("uuid",entity().getUuid());
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * 小于等于 &lt;= entity().getUuid()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidLe(){
        String uuid =entity().getUuid();
        if(uuid!=null){
            le("uuid",entity().getUuid());
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * BETWEEN  entity().getUuid() AND 值2
     * @param uuidEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidBetween(String uuidEnd){
        String uuid =entity().getUuid();
        if(uuid!=null && uuidEnd!=null){
            between("uuid",entity().getUuid(),uuidEnd);
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * NOT BETWEEN  entity().getUuid() AND 值2
     * @param uuidEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidNotBetween(String uuidEnd){
        String uuid =entity().getUuid();
        if(uuid!=null && uuidEnd!=null){
            notBetween("uuid",entity().getUuid(),uuidEnd);
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * BETWEEN  entity().getUuid() AND 值2
     * @param uuidStart       值1
     * @param uuidEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidBetween(String uuidStart,String uuidEnd){
        String uuid =entity().getUuid();
        if(uuid!=null && uuidEnd!=null){
            between("uuid",uuidStart,uuidEnd);
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * NOT BETWEEN  entity().getUuid() AND 值2
     * @param uuidStart       值1
     * @param uuidEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidNotBetween(String uuidStart,String uuidEnd){
        String uuid =entity().getUuid();
        if(uuid!=null && uuidEnd!=null){
            notBetween("uuid",uuidStart,uuidEnd);
        }
        return this;
     }


    /**
     * <p>账号唯一标识</p>
     * LIKE '%值%' entity().getUuid()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidLike(){
        String uuid =entity().getUuid();
        if(uuid!=null){
            like("uuid",entity().getUuid());
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * NOT LIKE '%值%' entity().getUuid()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidNotLike(){
        String uuid =entity().getUuid();
        if(uuid!=null){
            notLike("uuid",entity().getUuid());
        }
        return this;
     }


    /**
     * <p>账号唯一标识</p>
     * LIKE '%值' entity().getUuid()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidLikeLeft(){
        String uuid =entity().getUuid();
        if(uuid!=null){
            likeLeft("uuid",entity().getUuid());
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * LIKE '值%' entity().getUuid()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidLikeRight(){
        String uuid =entity().getUuid();
        if(uuid!=null){
            likeRight("uuid",entity().getUuid());
        }
        return this;
     }

/**
     * <p>账号唯一标识</p>
     * 等于 =
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidEq(String uuid){
        if(uuid!=null){
            eq("uuid",uuid);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * 不等于 &lt;&gt;
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidNe(String uuid){
        if(uuid!=null){
            ne("uuid",uuid);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * 大于 &gt;
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidGt(String uuid){
        if(uuid!=null){
            gt("uuid",uuid);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * 大于等于 &gt;=
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidGe(String uuid){
        if(uuid!=null){
            ge("uuid",uuid);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * 小于 &lt;
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidLt(String uuid){
        if(uuid!=null){
            lt("uuid",uuid);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * 小于等于 &lt;=
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidLe(String uuid){
        if(uuid!=null){
            le("uuid",uuid);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * LIKE '%值%'
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidLike(String uuid){
        if(uuid!=null){
            like("uuid",uuid);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * NOT LIKE '%值%'
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidNotLike(String uuid){
        if(uuid!=null){
            notLike("uuid",uuid);
        }
        return this;
    }


    /**
     * <p>账号唯一标识</p>
     * LIKE '%值'
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidLikeLeft(String uuid){
        if(uuid!=null){
            likeLeft("uuid",uuid);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * LIKE '值%'
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidLikeRight(String uuid){
        if(uuid!=null){
            likeRight("uuid",uuid);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * IS NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidIsNull(){
        isNull("uuid");
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidIsNotNull(){
        isNotNull("uuid");
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("uuid",value);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidIn(String... values){
        if(values!=null && values.length>0){
            in("uuid",values);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("uuid",value);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper uuidNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("uuid",values);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * 等于 = entity().getSecretId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdEq(){
        String secretId =entity().getSecretId();
        if(secretId!=null){
            eq("secret_id",secretId);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * 不等于 &lt;&gt; entity().getSecretId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdNe(){
        String secretId =entity().getSecretId();
        if(secretId!=null){
            ne("secret_id",entity().getSecretId());
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * 大于 &gt; entity().getSecretId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdGt(){
        String secretId =entity().getSecretId();
        if(secretId!=null){
            gt("secret_id",entity().getSecretId());
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * 大于等于 &gt;= entity().getSecretId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdGe(){
        String secretId =entity().getSecretId();
        if(secretId!=null){
            ge("secret_id",entity().getSecretId());
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * 小于 &lt; entity().getSecretId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdLt(){
        String secretId =entity().getSecretId();
        if(secretId!=null){
            lt("secret_id",entity().getSecretId());
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * 小于等于 &lt;= entity().getSecretId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdLe(){
        String secretId =entity().getSecretId();
        if(secretId!=null){
            le("secret_id",entity().getSecretId());
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * BETWEEN  entity().getSecretId() AND 值2
     * @param secretIdEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdBetween(String secretIdEnd){
        String secretId =entity().getSecretId();
        if(secretId!=null && secretIdEnd!=null){
            between("secret_id",entity().getSecretId(),secretIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * NOT BETWEEN  entity().getSecretId() AND 值2
     * @param secretIdEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdNotBetween(String secretIdEnd){
        String secretId =entity().getSecretId();
        if(secretId!=null && secretIdEnd!=null){
            notBetween("secret_id",entity().getSecretId(),secretIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * BETWEEN  entity().getSecretId() AND 值2
     * @param secretIdStart       值1
     * @param secretIdEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdBetween(String secretIdStart,String secretIdEnd){
        String secretId =entity().getSecretId();
        if(secretId!=null && secretIdEnd!=null){
            between("secret_id",secretIdStart,secretIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * NOT BETWEEN  entity().getSecretId() AND 值2
     * @param secretIdStart       值1
     * @param secretIdEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdNotBetween(String secretIdStart,String secretIdEnd){
        String secretId =entity().getSecretId();
        if(secretId!=null && secretIdEnd!=null){
            notBetween("secret_id",secretIdStart,secretIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云密钥Id</p>
     * LIKE '%值%' entity().getSecretId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdLike(){
        String secretId =entity().getSecretId();
        if(secretId!=null){
            like("secret_id",entity().getSecretId());
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * NOT LIKE '%值%' entity().getSecretId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdNotLike(){
        String secretId =entity().getSecretId();
        if(secretId!=null){
            notLike("secret_id",entity().getSecretId());
        }
        return this;
     }


    /**
     * <p>腾讯云密钥Id</p>
     * LIKE '%值' entity().getSecretId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdLikeLeft(){
        String secretId =entity().getSecretId();
        if(secretId!=null){
            likeLeft("secret_id",entity().getSecretId());
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * LIKE '值%' entity().getSecretId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdLikeRight(){
        String secretId =entity().getSecretId();
        if(secretId!=null){
            likeRight("secret_id",entity().getSecretId());
        }
        return this;
     }

/**
     * <p>腾讯云密钥Id</p>
     * 等于 =
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdEq(String secretId){
        if(secretId!=null){
            eq("secret_id",secretId);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * 不等于 &lt;&gt;
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdNe(String secretId){
        if(secretId!=null){
            ne("secret_id",secretId);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * 大于 &gt;
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdGt(String secretId){
        if(secretId!=null){
            gt("secret_id",secretId);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * 大于等于 &gt;=
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdGe(String secretId){
        if(secretId!=null){
            ge("secret_id",secretId);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * 小于 &lt;
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdLt(String secretId){
        if(secretId!=null){
            lt("secret_id",secretId);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * 小于等于 &lt;=
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdLe(String secretId){
        if(secretId!=null){
            le("secret_id",secretId);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * LIKE '%值%'
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdLike(String secretId){
        if(secretId!=null){
            like("secret_id",secretId);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * NOT LIKE '%值%'
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdNotLike(String secretId){
        if(secretId!=null){
            notLike("secret_id",secretId);
        }
        return this;
    }


    /**
     * <p>腾讯云密钥Id</p>
     * LIKE '%值'
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdLikeLeft(String secretId){
        if(secretId!=null){
            likeLeft("secret_id",secretId);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * LIKE '值%'
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdLikeRight(String secretId){
        if(secretId!=null){
            likeRight("secret_id",secretId);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * IS NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdIsNull(){
        isNull("secret_id");
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdIsNotNull(){
        isNotNull("secret_id");
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("secret_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdIn(String... values){
        if(values!=null && values.length>0){
            in("secret_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("secret_id",value);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("secret_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * 等于 = entity().getSecretKey()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyEq(){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null){
            eq("secret_key",secretKey);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * 不等于 &lt;&gt; entity().getSecretKey()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyNe(){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null){
            ne("secret_key",entity().getSecretKey());
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * 大于 &gt; entity().getSecretKey()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyGt(){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null){
            gt("secret_key",entity().getSecretKey());
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * 大于等于 &gt;= entity().getSecretKey()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyGe(){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null){
            ge("secret_key",entity().getSecretKey());
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * 小于 &lt; entity().getSecretKey()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyLt(){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null){
            lt("secret_key",entity().getSecretKey());
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * 小于等于 &lt;= entity().getSecretKey()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyLe(){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null){
            le("secret_key",entity().getSecretKey());
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * BETWEEN  entity().getSecretKey() AND 值2
     * @param secretKeyEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyBetween(String secretKeyEnd){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null && secretKeyEnd!=null){
            between("secret_key",entity().getSecretKey(),secretKeyEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * NOT BETWEEN  entity().getSecretKey() AND 值2
     * @param secretKeyEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyNotBetween(String secretKeyEnd){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null && secretKeyEnd!=null){
            notBetween("secret_key",entity().getSecretKey(),secretKeyEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * BETWEEN  entity().getSecretKey() AND 值2
     * @param secretKeyStart       值1
     * @param secretKeyEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyBetween(String secretKeyStart,String secretKeyEnd){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null && secretKeyEnd!=null){
            between("secret_key",secretKeyStart,secretKeyEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * NOT BETWEEN  entity().getSecretKey() AND 值2
     * @param secretKeyStart       值1
     * @param secretKeyEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyNotBetween(String secretKeyStart,String secretKeyEnd){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null && secretKeyEnd!=null){
            notBetween("secret_key",secretKeyStart,secretKeyEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云秘钥key</p>
     * LIKE '%值%' entity().getSecretKey()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyLike(){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null){
            like("secret_key",entity().getSecretKey());
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * NOT LIKE '%值%' entity().getSecretKey()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyNotLike(){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null){
            notLike("secret_key",entity().getSecretKey());
        }
        return this;
     }


    /**
     * <p>腾讯云秘钥key</p>
     * LIKE '%值' entity().getSecretKey()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyLikeLeft(){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null){
            likeLeft("secret_key",entity().getSecretKey());
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * LIKE '值%' entity().getSecretKey()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyLikeRight(){
        String secretKey =entity().getSecretKey();
        if(secretKey!=null){
            likeRight("secret_key",entity().getSecretKey());
        }
        return this;
     }

/**
     * <p>腾讯云秘钥key</p>
     * 等于 =
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyEq(String secretKey){
        if(secretKey!=null){
            eq("secret_key",secretKey);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * 不等于 &lt;&gt;
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyNe(String secretKey){
        if(secretKey!=null){
            ne("secret_key",secretKey);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * 大于 &gt;
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyGt(String secretKey){
        if(secretKey!=null){
            gt("secret_key",secretKey);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * 大于等于 &gt;=
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyGe(String secretKey){
        if(secretKey!=null){
            ge("secret_key",secretKey);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * 小于 &lt;
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyLt(String secretKey){
        if(secretKey!=null){
            lt("secret_key",secretKey);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * 小于等于 &lt;=
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyLe(String secretKey){
        if(secretKey!=null){
            le("secret_key",secretKey);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * LIKE '%值%'
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyLike(String secretKey){
        if(secretKey!=null){
            like("secret_key",secretKey);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * NOT LIKE '%值%'
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyNotLike(String secretKey){
        if(secretKey!=null){
            notLike("secret_key",secretKey);
        }
        return this;
    }


    /**
     * <p>腾讯云秘钥key</p>
     * LIKE '%值'
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyLikeLeft(String secretKey){
        if(secretKey!=null){
            likeLeft("secret_key",secretKey);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * LIKE '值%'
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyLikeRight(String secretKey){
        if(secretKey!=null){
            likeRight("secret_key",secretKey);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * IS NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyIsNull(){
        isNull("secret_key");
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyIsNotNull(){
        isNotNull("secret_key");
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("secret_key",value);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyIn(String... values){
        if(values!=null && values.length>0){
            in("secret_key",values);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("secret_key",value);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper secretKeyNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("secret_key",values);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * 等于 = entity().getEndpoint()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointEq(){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null){
            eq("endpoint",endpoint);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * 不等于 &lt;&gt; entity().getEndpoint()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointNe(){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null){
            ne("endpoint",entity().getEndpoint());
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * 大于 &gt; entity().getEndpoint()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointGt(){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null){
            gt("endpoint",entity().getEndpoint());
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * 大于等于 &gt;= entity().getEndpoint()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointGe(){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null){
            ge("endpoint",entity().getEndpoint());
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * 小于 &lt; entity().getEndpoint()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointLt(){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null){
            lt("endpoint",entity().getEndpoint());
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * 小于等于 &lt;= entity().getEndpoint()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointLe(){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null){
            le("endpoint",entity().getEndpoint());
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * BETWEEN  entity().getEndpoint() AND 值2
     * @param endpointEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointBetween(String endpointEnd){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null && endpointEnd!=null){
            between("endpoint",entity().getEndpoint(),endpointEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * NOT BETWEEN  entity().getEndpoint() AND 值2
     * @param endpointEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointNotBetween(String endpointEnd){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null && endpointEnd!=null){
            notBetween("endpoint",entity().getEndpoint(),endpointEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * BETWEEN  entity().getEndpoint() AND 值2
     * @param endpointStart       值1
     * @param endpointEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointBetween(String endpointStart,String endpointEnd){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null && endpointEnd!=null){
            between("endpoint",endpointStart,endpointEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * NOT BETWEEN  entity().getEndpoint() AND 值2
     * @param endpointStart       值1
     * @param endpointEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointNotBetween(String endpointStart,String endpointEnd){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null && endpointEnd!=null){
            notBetween("endpoint",endpointStart,endpointEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云请求地址</p>
     * LIKE '%值%' entity().getEndpoint()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointLike(){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null){
            like("endpoint",entity().getEndpoint());
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * NOT LIKE '%值%' entity().getEndpoint()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointNotLike(){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null){
            notLike("endpoint",entity().getEndpoint());
        }
        return this;
     }


    /**
     * <p>腾讯云请求地址</p>
     * LIKE '%值' entity().getEndpoint()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointLikeLeft(){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null){
            likeLeft("endpoint",entity().getEndpoint());
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * LIKE '值%' entity().getEndpoint()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointLikeRight(){
        String endpoint =entity().getEndpoint();
        if(endpoint!=null){
            likeRight("endpoint",entity().getEndpoint());
        }
        return this;
     }

/**
     * <p>腾讯云请求地址</p>
     * 等于 =
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointEq(String endpoint){
        if(endpoint!=null){
            eq("endpoint",endpoint);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * 不等于 &lt;&gt;
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointNe(String endpoint){
        if(endpoint!=null){
            ne("endpoint",endpoint);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * 大于 &gt;
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointGt(String endpoint){
        if(endpoint!=null){
            gt("endpoint",endpoint);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * 大于等于 &gt;=
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointGe(String endpoint){
        if(endpoint!=null){
            ge("endpoint",endpoint);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * 小于 &lt;
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointLt(String endpoint){
        if(endpoint!=null){
            lt("endpoint",endpoint);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * 小于等于 &lt;=
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointLe(String endpoint){
        if(endpoint!=null){
            le("endpoint",endpoint);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * LIKE '%值%'
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointLike(String endpoint){
        if(endpoint!=null){
            like("endpoint",endpoint);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * NOT LIKE '%值%'
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointNotLike(String endpoint){
        if(endpoint!=null){
            notLike("endpoint",endpoint);
        }
        return this;
    }


    /**
     * <p>腾讯云请求地址</p>
     * LIKE '%值'
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointLikeLeft(String endpoint){
        if(endpoint!=null){
            likeLeft("endpoint",endpoint);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * LIKE '值%'
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointLikeRight(String endpoint){
        if(endpoint!=null){
            likeRight("endpoint",endpoint);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * IS NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointIsNull(){
        isNull("endpoint");
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointIsNotNull(){
        isNotNull("endpoint");
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("endpoint",value);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointIn(String... values){
        if(values!=null && values.length>0){
            in("endpoint",values);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("endpoint",value);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper endpointNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpoint",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper createTimeEq(){
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
    public TencentAccountUpdateEntityWrapper createTimeNe(){
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
    public TencentAccountUpdateEntityWrapper createTimeGt(){
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
    public TencentAccountUpdateEntityWrapper createTimeGe(){
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
    public TencentAccountUpdateEntityWrapper createTimeLt(){
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
    public TencentAccountUpdateEntityWrapper createTimeLe(){
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
    public TencentAccountUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public TencentAccountUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public TencentAccountUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentAccountUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentAccountUpdateEntityWrapper createTimeLike(){
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
    public TencentAccountUpdateEntityWrapper createTimeNotLike(){
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
    public TencentAccountUpdateEntityWrapper createTimeLikeLeft(){
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
    public TencentAccountUpdateEntityWrapper createTimeLikeRight(){
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
    public TencentAccountUpdateEntityWrapper createTimeEq(Date createTime){
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
    public TencentAccountUpdateEntityWrapper createTimeNe(Date createTime){
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
    public TencentAccountUpdateEntityWrapper createTimeGt(Date createTime){
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
    public TencentAccountUpdateEntityWrapper createTimeGe(Date createTime){
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
    public TencentAccountUpdateEntityWrapper createTimeLt(Date createTime){
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
    public TencentAccountUpdateEntityWrapper createTimeLe(Date createTime){
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
    public TencentAccountUpdateEntityWrapper createTimeLike(Date createTime){
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
    public TencentAccountUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public TencentAccountUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public TencentAccountUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public TencentAccountUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public TencentAccountUpdateEntityWrapper createTimeIn(Date... values){
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
    public TencentAccountUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentAccountUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeEq(){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeNe(){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeGt(){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeGe(){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeLt(){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeLe(){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeLike(){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeNotLike(){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeLikeLeft(){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeLikeRight(){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentAccountUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 等于 = entity().getFkAccountId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdEq(){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null){
            eq("fk_account_id",fkAccountId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 不等于 &lt;&gt; entity().getFkAccountId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdNe(){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null){
            ne("fk_account_id",entity().getFkAccountId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于 &gt; entity().getFkAccountId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdGt(){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null){
            gt("fk_account_id",entity().getFkAccountId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于等于 &gt;= entity().getFkAccountId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdGe(){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null){
            ge("fk_account_id",entity().getFkAccountId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于 &lt; entity().getFkAccountId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdLt(){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null){
            lt("fk_account_id",entity().getFkAccountId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于等于 &lt;= entity().getFkAccountId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdLe(){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null){
            le("fk_account_id",entity().getFkAccountId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * BETWEEN  entity().getFkAccountId() AND 值2
     * @param fkAccountIdEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdBetween(Long fkAccountIdEnd){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null && fkAccountIdEnd!=null){
            between("fk_account_id",entity().getFkAccountId(),fkAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT BETWEEN  entity().getFkAccountId() AND 值2
     * @param fkAccountIdEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdNotBetween(Long fkAccountIdEnd){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null && fkAccountIdEnd!=null){
            notBetween("fk_account_id",entity().getFkAccountId(),fkAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * BETWEEN  entity().getFkAccountId() AND 值2
     * @param fkAccountIdStart       值1
     * @param fkAccountIdEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdBetween(Long fkAccountIdStart,Long fkAccountIdEnd){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null && fkAccountIdEnd!=null){
            between("fk_account_id",fkAccountIdStart,fkAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT BETWEEN  entity().getFkAccountId() AND 值2
     * @param fkAccountIdStart       值1
     * @param fkAccountIdEnd      值2
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdNotBetween(Long fkAccountIdStart,Long fkAccountIdEnd){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null && fkAccountIdEnd!=null){
            notBetween("fk_account_id",fkAccountIdStart,fkAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值%' entity().getFkAccountId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdLike(){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null){
            like("fk_account_id",entity().getFkAccountId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT LIKE '%值%' entity().getFkAccountId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdNotLike(){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null){
            notLike("fk_account_id",entity().getFkAccountId());
        }
        return this;
     }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值' entity().getFkAccountId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdLikeLeft(){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null){
            likeLeft("fk_account_id",entity().getFkAccountId());
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '值%' entity().getFkAccountId()
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdLikeRight(){
        Long fkAccountId =entity().getFkAccountId();
        if(fkAccountId!=null){
            likeRight("fk_account_id",entity().getFkAccountId());
        }
        return this;
     }

/**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 等于 =
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdEq(Long fkAccountId){
        if(fkAccountId!=null){
            eq("fk_account_id",fkAccountId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 不等于 &lt;&gt;
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdNe(Long fkAccountId){
        if(fkAccountId!=null){
            ne("fk_account_id",fkAccountId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于 &gt;
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdGt(Long fkAccountId){
        if(fkAccountId!=null){
            gt("fk_account_id",fkAccountId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于等于 &gt;=
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdGe(Long fkAccountId){
        if(fkAccountId!=null){
            ge("fk_account_id",fkAccountId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于 &lt;
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdLt(Long fkAccountId){
        if(fkAccountId!=null){
            lt("fk_account_id",fkAccountId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于等于 &lt;=
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdLe(Long fkAccountId){
        if(fkAccountId!=null){
            le("fk_account_id",fkAccountId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值%'
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdLike(Long fkAccountId){
        if(fkAccountId!=null){
            like("fk_account_id",fkAccountId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT LIKE '%值%'
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdNotLike(Long fkAccountId){
        if(fkAccountId!=null){
            notLike("fk_account_id",fkAccountId);
        }
        return this;
    }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值'
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdLikeLeft(Long fkAccountId){
        if(fkAccountId!=null){
            likeLeft("fk_account_id",fkAccountId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '值%'
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdLikeRight(Long fkAccountId){
        if(fkAccountId!=null){
            likeRight("fk_account_id",fkAccountId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IS NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdIsNull(){
        isNull("fk_account_id");
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdIsNotNull(){
        isNotNull("fk_account_id");
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_account_id",value);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_account_id",values);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_account_id",value);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateEntityWrapper fkAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_account_id",values);
        }
        return this;
    }


}
