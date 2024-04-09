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
public class TencentAccountUpdateWrapper extends UpdateWrapper<TencentAccount> {

    public static TencentAccountUpdateWrapper wrapper() {
        return new TencentAccountUpdateWrapper();
    }

    public TencentAccountUpdateWrapper() {
        super();
    }

    public TencentAccountUpdateWrapper(TencentAccount entity) {
        super(entity);
    }

    /**
     * 
     */
    public TencentAccountUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 账号唯一标识
     */
    public TencentAccountUpdateWrapper setUuid(String uuid) {
         set("uuid",uuid);
        return this;
    }
    /**
     * 腾讯云密钥Id
     */
    public TencentAccountUpdateWrapper setSecretId(String secretId) {
         set("secret_id",secretId);
        return this;
    }
    /**
     * 腾讯云秘钥key
     */
    public TencentAccountUpdateWrapper setSecretKey(String secretKey) {
         set("secret_key",secretKey);
        return this;
    }
    /**
     * 腾讯云请求地址
     */
    public TencentAccountUpdateWrapper setEndpoint(String endpoint) {
         set("endpoint",endpoint);
        return this;
    }
    /**
     * 创建时间
     */
    public TencentAccountUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最后修改时间
     */
    public TencentAccountUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * box_soc的表的主键ID[用这个id做关联]
     */
    public TencentAccountUpdateWrapper setFkAccountId(Long fkAccountId) {
         set("fk_account_id",fkAccountId);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public TencentAccountUpdateWrapper idEq(Long id){
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
    public TencentAccountUpdateWrapper idNe(Long id){
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
    public TencentAccountUpdateWrapper idGt(Long id){
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
    public TencentAccountUpdateWrapper idGe(Long id){
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
    public TencentAccountUpdateWrapper idLt(Long id){
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
    public TencentAccountUpdateWrapper idLe(Long id){
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
    public TencentAccountUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentAccountUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public TencentAccountUpdateWrapper idLike(Long id){
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
    public TencentAccountUpdateWrapper idNotLike(Long id){
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
    public TencentAccountUpdateWrapper idLikeLeft(Long id){
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
    public TencentAccountUpdateWrapper idLikeRight(Long id){
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
    public TencentAccountUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateWrapper idIn(Collection<Long> value){
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
    public TencentAccountUpdateWrapper idIn(Long... values){
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
    public TencentAccountUpdateWrapper idNotIn(Collection<Long> value){
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
    public TencentAccountUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * 等于 = uuid
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateWrapper uuidEq(String uuid){
        if(uuid!=null){
            eq("uuid",uuid);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * 不等于 &lt;&gt; uuid
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateWrapper uuidNe(String uuid){
        if(uuid!=null){
            ne("uuid",uuid);
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * 大于 &gt; uuid
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateWrapper uuidGt(String uuid){
        if(uuid!=null){
            gt("uuid",uuid);
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * 大于等于 &gt;= uuid
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateWrapper uuidGe(String uuid){
        if(uuid!=null){
            ge("uuid",uuid);
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * 小于 &lt; uuid
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateWrapper uuidLt(String uuid){
        if(uuid!=null){
            lt("uuid",uuid);
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * 小于等于 &lt;= uuid
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateWrapper uuidLe(String uuid){
        if(uuid!=null){
            le("uuid",uuid);
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * BETWEEN 值1 AND 值2
     * @param uuidStart       值1
     * @param uuidEnd      值2
     * @return children
     */
    public TencentAccountUpdateWrapper uuidBetween(String uuidStart,String uuidEnd){
        if(uuidStart!=null && uuidEnd!=null){
            between("uuid",uuidStart,uuidEnd);
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * NOT BETWEEN 值1 AND 值2
     * @param uuidStart       值1
     * @param uuidEnd      值2
     * @return children
     */
    public TencentAccountUpdateWrapper uuidNotBetween(String uuidStart,String uuidEnd){
        if(uuidStart!=null && uuidEnd!=null){
            notBetween("uuid",uuidStart,uuidEnd);
        }
        return this;
     }


    /**
     * <p>账号唯一标识</p>
     * LIKE '%值%' uuid
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateWrapper uuidLike(String uuid){
        if(uuid!=null){
            like("uuid",uuid);
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * NOT LIKE '%值%' uuid
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateWrapper uuidNotLike(String uuid){
        if(uuid!=null){
            notLike("uuid",uuid);
        }
        return this;
     }


    /**
     * <p>账号唯一标识</p>
     * LIKE '%值' uuid
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateWrapper uuidLikeLeft(String uuid){
        if(uuid!=null){
            likeLeft("uuid",uuid);
        }
        return this;
     }

    /**
     * <p>账号唯一标识</p>
     * LIKE '值%' uuid
     * @param uuid       值
     * @return children
     */
    public TencentAccountUpdateWrapper uuidLikeRight(String uuid){
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
    public TencentAccountUpdateWrapper uuidIsNull(){
        isNull("uuid");
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateWrapper uuidIsNotNull(){
        isNotNull("uuid");
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateWrapper uuidIn(Collection<String> value){
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
    public TencentAccountUpdateWrapper uuidIn(String... values){
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
    public TencentAccountUpdateWrapper uuidNotIn(Collection<String> value){
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
    public TencentAccountUpdateWrapper uuidNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("uuid",values);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * 等于 = secretId
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdEq(String secretId){
        if(secretId!=null){
            eq("secret_id",secretId);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * 不等于 &lt;&gt; secretId
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdNe(String secretId){
        if(secretId!=null){
            ne("secret_id",secretId);
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * 大于 &gt; secretId
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdGt(String secretId){
        if(secretId!=null){
            gt("secret_id",secretId);
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * 大于等于 &gt;= secretId
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdGe(String secretId){
        if(secretId!=null){
            ge("secret_id",secretId);
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * 小于 &lt; secretId
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdLt(String secretId){
        if(secretId!=null){
            lt("secret_id",secretId);
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * 小于等于 &lt;= secretId
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdLe(String secretId){
        if(secretId!=null){
            le("secret_id",secretId);
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * BETWEEN 值1 AND 值2
     * @param secretIdStart       值1
     * @param secretIdEnd      值2
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdBetween(String secretIdStart,String secretIdEnd){
        if(secretIdStart!=null && secretIdEnd!=null){
            between("secret_id",secretIdStart,secretIdEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param secretIdStart       值1
     * @param secretIdEnd      值2
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdNotBetween(String secretIdStart,String secretIdEnd){
        if(secretIdStart!=null && secretIdEnd!=null){
            notBetween("secret_id",secretIdStart,secretIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云密钥Id</p>
     * LIKE '%值%' secretId
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdLike(String secretId){
        if(secretId!=null){
            like("secret_id",secretId);
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * NOT LIKE '%值%' secretId
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdNotLike(String secretId){
        if(secretId!=null){
            notLike("secret_id",secretId);
        }
        return this;
     }


    /**
     * <p>腾讯云密钥Id</p>
     * LIKE '%值' secretId
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdLikeLeft(String secretId){
        if(secretId!=null){
            likeLeft("secret_id",secretId);
        }
        return this;
     }

    /**
     * <p>腾讯云密钥Id</p>
     * LIKE '值%' secretId
     * @param secretId       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdLikeRight(String secretId){
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
    public TencentAccountUpdateWrapper secretIdIsNull(){
        isNull("secret_id");
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdIsNotNull(){
        isNotNull("secret_id");
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateWrapper secretIdIn(Collection<String> value){
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
    public TencentAccountUpdateWrapper secretIdIn(String... values){
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
    public TencentAccountUpdateWrapper secretIdNotIn(Collection<String> value){
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
    public TencentAccountUpdateWrapper secretIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("secret_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * 等于 = secretKey
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyEq(String secretKey){
        if(secretKey!=null){
            eq("secret_key",secretKey);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * 不等于 &lt;&gt; secretKey
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyNe(String secretKey){
        if(secretKey!=null){
            ne("secret_key",secretKey);
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * 大于 &gt; secretKey
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyGt(String secretKey){
        if(secretKey!=null){
            gt("secret_key",secretKey);
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * 大于等于 &gt;= secretKey
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyGe(String secretKey){
        if(secretKey!=null){
            ge("secret_key",secretKey);
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * 小于 &lt; secretKey
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyLt(String secretKey){
        if(secretKey!=null){
            lt("secret_key",secretKey);
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * 小于等于 &lt;= secretKey
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyLe(String secretKey){
        if(secretKey!=null){
            le("secret_key",secretKey);
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * BETWEEN 值1 AND 值2
     * @param secretKeyStart       值1
     * @param secretKeyEnd      值2
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyBetween(String secretKeyStart,String secretKeyEnd){
        if(secretKeyStart!=null && secretKeyEnd!=null){
            between("secret_key",secretKeyStart,secretKeyEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * NOT BETWEEN 值1 AND 值2
     * @param secretKeyStart       值1
     * @param secretKeyEnd      值2
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyNotBetween(String secretKeyStart,String secretKeyEnd){
        if(secretKeyStart!=null && secretKeyEnd!=null){
            notBetween("secret_key",secretKeyStart,secretKeyEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云秘钥key</p>
     * LIKE '%值%' secretKey
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyLike(String secretKey){
        if(secretKey!=null){
            like("secret_key",secretKey);
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * NOT LIKE '%值%' secretKey
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyNotLike(String secretKey){
        if(secretKey!=null){
            notLike("secret_key",secretKey);
        }
        return this;
     }


    /**
     * <p>腾讯云秘钥key</p>
     * LIKE '%值' secretKey
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyLikeLeft(String secretKey){
        if(secretKey!=null){
            likeLeft("secret_key",secretKey);
        }
        return this;
     }

    /**
     * <p>腾讯云秘钥key</p>
     * LIKE '值%' secretKey
     * @param secretKey       值
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyLikeRight(String secretKey){
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
    public TencentAccountUpdateWrapper secretKeyIsNull(){
        isNull("secret_key");
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyIsNotNull(){
        isNotNull("secret_key");
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateWrapper secretKeyIn(Collection<String> value){
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
    public TencentAccountUpdateWrapper secretKeyIn(String... values){
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
    public TencentAccountUpdateWrapper secretKeyNotIn(Collection<String> value){
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
    public TencentAccountUpdateWrapper secretKeyNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("secret_key",values);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * 等于 = endpoint
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateWrapper endpointEq(String endpoint){
        if(endpoint!=null){
            eq("endpoint",endpoint);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * 不等于 &lt;&gt; endpoint
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateWrapper endpointNe(String endpoint){
        if(endpoint!=null){
            ne("endpoint",endpoint);
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * 大于 &gt; endpoint
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateWrapper endpointGt(String endpoint){
        if(endpoint!=null){
            gt("endpoint",endpoint);
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * 大于等于 &gt;= endpoint
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateWrapper endpointGe(String endpoint){
        if(endpoint!=null){
            ge("endpoint",endpoint);
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * 小于 &lt; endpoint
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateWrapper endpointLt(String endpoint){
        if(endpoint!=null){
            lt("endpoint",endpoint);
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * 小于等于 &lt;= endpoint
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateWrapper endpointLe(String endpoint){
        if(endpoint!=null){
            le("endpoint",endpoint);
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * BETWEEN 值1 AND 值2
     * @param endpointStart       值1
     * @param endpointEnd      值2
     * @return children
     */
    public TencentAccountUpdateWrapper endpointBetween(String endpointStart,String endpointEnd){
        if(endpointStart!=null && endpointEnd!=null){
            between("endpoint",endpointStart,endpointEnd);
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * NOT BETWEEN 值1 AND 值2
     * @param endpointStart       值1
     * @param endpointEnd      值2
     * @return children
     */
    public TencentAccountUpdateWrapper endpointNotBetween(String endpointStart,String endpointEnd){
        if(endpointStart!=null && endpointEnd!=null){
            notBetween("endpoint",endpointStart,endpointEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云请求地址</p>
     * LIKE '%值%' endpoint
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateWrapper endpointLike(String endpoint){
        if(endpoint!=null){
            like("endpoint",endpoint);
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * NOT LIKE '%值%' endpoint
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateWrapper endpointNotLike(String endpoint){
        if(endpoint!=null){
            notLike("endpoint",endpoint);
        }
        return this;
     }


    /**
     * <p>腾讯云请求地址</p>
     * LIKE '%值' endpoint
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateWrapper endpointLikeLeft(String endpoint){
        if(endpoint!=null){
            likeLeft("endpoint",endpoint);
        }
        return this;
     }

    /**
     * <p>腾讯云请求地址</p>
     * LIKE '值%' endpoint
     * @param endpoint       值
     * @return children
     */
    public TencentAccountUpdateWrapper endpointLikeRight(String endpoint){
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
    public TencentAccountUpdateWrapper endpointIsNull(){
        isNull("endpoint");
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateWrapper endpointIsNotNull(){
        isNotNull("endpoint");
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateWrapper endpointIn(Collection<String> value){
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
    public TencentAccountUpdateWrapper endpointIn(String... values){
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
    public TencentAccountUpdateWrapper endpointNotIn(Collection<String> value){
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
    public TencentAccountUpdateWrapper endpointNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpoint",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public TencentAccountUpdateWrapper createTimeEq(Date createTime){
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
    public TencentAccountUpdateWrapper createTimeNe(Date createTime){
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
    public TencentAccountUpdateWrapper createTimeGt(Date createTime){
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
    public TencentAccountUpdateWrapper createTimeGe(Date createTime){
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
    public TencentAccountUpdateWrapper createTimeLt(Date createTime){
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
    public TencentAccountUpdateWrapper createTimeLe(Date createTime){
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
    public TencentAccountUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentAccountUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentAccountUpdateWrapper createTimeLike(Date createTime){
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
    public TencentAccountUpdateWrapper createTimeNotLike(Date createTime){
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
    public TencentAccountUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public TencentAccountUpdateWrapper createTimeLikeRight(Date createTime){
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
    public TencentAccountUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateWrapper createTimeIn(Collection<Date> value){
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
    public TencentAccountUpdateWrapper createTimeIn(Date... values){
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
    public TencentAccountUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentAccountUpdateWrapper createTimeNotIn(Date... values){
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
    public TencentAccountUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public TencentAccountUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public TencentAccountUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public TencentAccountUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public TencentAccountUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public TencentAccountUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public TencentAccountUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentAccountUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentAccountUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public TencentAccountUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public TencentAccountUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public TencentAccountUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentAccountUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentAccountUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public TencentAccountUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentAccountUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 等于 = fkAccountId
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdEq(Long fkAccountId){
        if(fkAccountId!=null){
            eq("fk_account_id",fkAccountId);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 不等于 &lt;&gt; fkAccountId
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdNe(Long fkAccountId){
        if(fkAccountId!=null){
            ne("fk_account_id",fkAccountId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于 &gt; fkAccountId
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdGt(Long fkAccountId){
        if(fkAccountId!=null){
            gt("fk_account_id",fkAccountId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 大于等于 &gt;= fkAccountId
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdGe(Long fkAccountId){
        if(fkAccountId!=null){
            ge("fk_account_id",fkAccountId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于 &lt; fkAccountId
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdLt(Long fkAccountId){
        if(fkAccountId!=null){
            lt("fk_account_id",fkAccountId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 小于等于 &lt;= fkAccountId
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdLe(Long fkAccountId){
        if(fkAccountId!=null){
            le("fk_account_id",fkAccountId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * BETWEEN 值1 AND 值2
     * @param fkAccountIdStart       值1
     * @param fkAccountIdEnd      值2
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdBetween(Long fkAccountIdStart,Long fkAccountIdEnd){
        if(fkAccountIdStart!=null && fkAccountIdEnd!=null){
            between("fk_account_id",fkAccountIdStart,fkAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkAccountIdStart       值1
     * @param fkAccountIdEnd      值2
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdNotBetween(Long fkAccountIdStart,Long fkAccountIdEnd){
        if(fkAccountIdStart!=null && fkAccountIdEnd!=null){
            notBetween("fk_account_id",fkAccountIdStart,fkAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值%' fkAccountId
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdLike(Long fkAccountId){
        if(fkAccountId!=null){
            like("fk_account_id",fkAccountId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * NOT LIKE '%值%' fkAccountId
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdNotLike(Long fkAccountId){
        if(fkAccountId!=null){
            notLike("fk_account_id",fkAccountId);
        }
        return this;
     }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值' fkAccountId
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdLikeLeft(Long fkAccountId){
        if(fkAccountId!=null){
            likeLeft("fk_account_id",fkAccountId);
        }
        return this;
     }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '值%' fkAccountId
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdLikeRight(Long fkAccountId){
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
    public TencentAccountUpdateWrapper fkAccountIdIsNull(){
        isNull("fk_account_id");
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdIsNotNull(){
        isNotNull("fk_account_id");
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountUpdateWrapper fkAccountIdIn(Collection<Long> value){
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
    public TencentAccountUpdateWrapper fkAccountIdIn(Long... values){
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
    public TencentAccountUpdateWrapper fkAccountIdNotIn(Collection<Long> value){
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
    public TencentAccountUpdateWrapper fkAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_account_id",values);
        }
        return this;
    }


}
