package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.TencentAccount;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 腾讯账号表
 * </p>
 * "tencent_account"
 * @author PC001
 * @since 2023-06-14
 */
public class TencentAccountQueryWrapper extends QueryWrapper<TencentAccount> {


    public static TencentAccountQueryWrapper wrapper() {
        return new TencentAccountQueryWrapper();
    }

    public TencentAccountQueryWrapper() {
        super();
    }

    public TencentAccountQueryWrapper(TencentAccount entity) {
        super(entity);
    }

    public TencentAccountQueryWrapper(TencentAccount entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public TencentAccountQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }



    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public TencentAccountQueryWrapper idEq(Long id){
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
    public TencentAccountQueryWrapper idNe(Long id){
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
    public TencentAccountQueryWrapper idGt(Long id){
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
    public TencentAccountQueryWrapper idGe(Long id){
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
    public TencentAccountQueryWrapper idLt(Long id){
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
    public TencentAccountQueryWrapper idLe(Long id){
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
    public TencentAccountQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public TencentAccountQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public TencentAccountQueryWrapper idLike(Long id){
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
    public TencentAccountQueryWrapper idNotLike(Long id){
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
    public TencentAccountQueryWrapper idLikeLeft(Long id){
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
    public TencentAccountQueryWrapper idLikeRight(Long id){
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
    public TencentAccountQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountQueryWrapper idIn(Collection<Long> value){
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
    public TencentAccountQueryWrapper idIn(Long... values){
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
    public TencentAccountQueryWrapper idNotIn(Collection<Long> value){
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
    public TencentAccountQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * 等于 =
     * @param uuid       值
     * @return children
     */
    public TencentAccountQueryWrapper uuidEq(String uuid){
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
    public TencentAccountQueryWrapper uuidNe(String uuid){
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
    public TencentAccountQueryWrapper uuidGt(String uuid){
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
    public TencentAccountQueryWrapper uuidGe(String uuid){
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
    public TencentAccountQueryWrapper uuidLt(String uuid){
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
    public TencentAccountQueryWrapper uuidLe(String uuid){
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
    public TencentAccountQueryWrapper uuidBetween(String uuidStart,String uuidEnd){
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
    public TencentAccountQueryWrapper uuidNotBetween(String uuidStart,String uuidEnd){
        if(uuidStart!=null && uuidEnd!=null){
            notBetween("uuid",uuidStart,uuidEnd);
        }
        return this;
     }


    /**
     * <p>账号唯一标识</p>
     * LIKE '%值%'
     * @param uuid       值
     * @return children
     */
    public TencentAccountQueryWrapper uuidLike(String uuid){
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
    public TencentAccountQueryWrapper uuidNotLike(String uuid){
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
    public TencentAccountQueryWrapper uuidLikeLeft(String uuid){
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
    public TencentAccountQueryWrapper uuidLikeRight(String uuid){
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
    public TencentAccountQueryWrapper uuidIsNull(){
        isNull("uuid");
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountQueryWrapper uuidIsNotNull(){
        isNotNull("uuid");
        return this;
    }

    /**
     * <p>账号唯一标识</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountQueryWrapper uuidIn(Collection<String> value){
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
    public TencentAccountQueryWrapper uuidIn(String... values){
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
    public TencentAccountQueryWrapper uuidNotIn(Collection<String> value){
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
    public TencentAccountQueryWrapper uuidNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("uuid",values);
        }
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * 等于 =
     * @param secretId       值
     * @return children
     */
    public TencentAccountQueryWrapper secretIdEq(String secretId){
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
    public TencentAccountQueryWrapper secretIdNe(String secretId){
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
    public TencentAccountQueryWrapper secretIdGt(String secretId){
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
    public TencentAccountQueryWrapper secretIdGe(String secretId){
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
    public TencentAccountQueryWrapper secretIdLt(String secretId){
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
    public TencentAccountQueryWrapper secretIdLe(String secretId){
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
    public TencentAccountQueryWrapper secretIdBetween(String secretIdStart,String secretIdEnd){
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
    public TencentAccountQueryWrapper secretIdNotBetween(String secretIdStart,String secretIdEnd){
        if(secretIdStart!=null && secretIdEnd!=null){
            notBetween("secret_id",secretIdStart,secretIdEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云密钥Id</p>
     * LIKE '%值%'
     * @param secretId       值
     * @return children
     */
    public TencentAccountQueryWrapper secretIdLike(String secretId){
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
    public TencentAccountQueryWrapper secretIdNotLike(String secretId){
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
    public TencentAccountQueryWrapper secretIdLikeLeft(String secretId){
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
    public TencentAccountQueryWrapper secretIdLikeRight(String secretId){
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
    public TencentAccountQueryWrapper secretIdIsNull(){
        isNull("secret_id");
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountQueryWrapper secretIdIsNotNull(){
        isNotNull("secret_id");
        return this;
    }

    /**
     * <p>腾讯云密钥Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountQueryWrapper secretIdIn(Collection<String> value){
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
    public TencentAccountQueryWrapper secretIdIn(String... values){
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
    public TencentAccountQueryWrapper secretIdNotIn(Collection<String> value){
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
    public TencentAccountQueryWrapper secretIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("secret_id",values);
        }
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * 等于 =
     * @param secretKey       值
     * @return children
     */
    public TencentAccountQueryWrapper secretKeyEq(String secretKey){
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
    public TencentAccountQueryWrapper secretKeyNe(String secretKey){
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
    public TencentAccountQueryWrapper secretKeyGt(String secretKey){
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
    public TencentAccountQueryWrapper secretKeyGe(String secretKey){
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
    public TencentAccountQueryWrapper secretKeyLt(String secretKey){
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
    public TencentAccountQueryWrapper secretKeyLe(String secretKey){
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
    public TencentAccountQueryWrapper secretKeyBetween(String secretKeyStart,String secretKeyEnd){
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
    public TencentAccountQueryWrapper secretKeyNotBetween(String secretKeyStart,String secretKeyEnd){
        if(secretKeyStart!=null && secretKeyEnd!=null){
            notBetween("secret_key",secretKeyStart,secretKeyEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云秘钥key</p>
     * LIKE '%值%'
     * @param secretKey       值
     * @return children
     */
    public TencentAccountQueryWrapper secretKeyLike(String secretKey){
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
    public TencentAccountQueryWrapper secretKeyNotLike(String secretKey){
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
    public TencentAccountQueryWrapper secretKeyLikeLeft(String secretKey){
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
    public TencentAccountQueryWrapper secretKeyLikeRight(String secretKey){
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
    public TencentAccountQueryWrapper secretKeyIsNull(){
        isNull("secret_key");
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountQueryWrapper secretKeyIsNotNull(){
        isNotNull("secret_key");
        return this;
    }

    /**
     * <p>腾讯云秘钥key</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountQueryWrapper secretKeyIn(Collection<String> value){
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
    public TencentAccountQueryWrapper secretKeyIn(String... values){
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
    public TencentAccountQueryWrapper secretKeyNotIn(Collection<String> value){
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
    public TencentAccountQueryWrapper secretKeyNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("secret_key",values);
        }
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * 等于 =
     * @param endpoint       值
     * @return children
     */
    public TencentAccountQueryWrapper endpointEq(String endpoint){
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
    public TencentAccountQueryWrapper endpointNe(String endpoint){
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
    public TencentAccountQueryWrapper endpointGt(String endpoint){
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
    public TencentAccountQueryWrapper endpointGe(String endpoint){
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
    public TencentAccountQueryWrapper endpointLt(String endpoint){
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
    public TencentAccountQueryWrapper endpointLe(String endpoint){
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
    public TencentAccountQueryWrapper endpointBetween(String endpointStart,String endpointEnd){
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
    public TencentAccountQueryWrapper endpointNotBetween(String endpointStart,String endpointEnd){
        if(endpointStart!=null && endpointEnd!=null){
            notBetween("endpoint",endpointStart,endpointEnd);
        }
        return this;
     }


    /**
     * <p>腾讯云请求地址</p>
     * LIKE '%值%'
     * @param endpoint       值
     * @return children
     */
    public TencentAccountQueryWrapper endpointLike(String endpoint){
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
    public TencentAccountQueryWrapper endpointNotLike(String endpoint){
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
    public TencentAccountQueryWrapper endpointLikeLeft(String endpoint){
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
    public TencentAccountQueryWrapper endpointLikeRight(String endpoint){
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
    public TencentAccountQueryWrapper endpointIsNull(){
        isNull("endpoint");
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountQueryWrapper endpointIsNotNull(){
        isNotNull("endpoint");
        return this;
    }

    /**
     * <p>腾讯云请求地址</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountQueryWrapper endpointIn(Collection<String> value){
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
    public TencentAccountQueryWrapper endpointIn(String... values){
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
    public TencentAccountQueryWrapper endpointNotIn(Collection<String> value){
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
    public TencentAccountQueryWrapper endpointNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("endpoint",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public TencentAccountQueryWrapper createTimeEq(Date createTime){
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
    public TencentAccountQueryWrapper createTimeNe(Date createTime){
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
    public TencentAccountQueryWrapper createTimeGt(Date createTime){
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
    public TencentAccountQueryWrapper createTimeGe(Date createTime){
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
    public TencentAccountQueryWrapper createTimeLt(Date createTime){
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
    public TencentAccountQueryWrapper createTimeLe(Date createTime){
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
    public TencentAccountQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentAccountQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public TencentAccountQueryWrapper createTimeLike(Date createTime){
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
    public TencentAccountQueryWrapper createTimeNotLike(Date createTime){
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
    public TencentAccountQueryWrapper createTimeLikeLeft(Date createTime){
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
    public TencentAccountQueryWrapper createTimeLikeRight(Date createTime){
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
    public TencentAccountQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountQueryWrapper createTimeIn(Collection<Date> value){
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
    public TencentAccountQueryWrapper createTimeIn(Date... values){
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
    public TencentAccountQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public TencentAccountQueryWrapper createTimeNotIn(Date... values){
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
    public TencentAccountQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public TencentAccountQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public TencentAccountQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public TencentAccountQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public TencentAccountQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public TencentAccountQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public TencentAccountQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentAccountQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public TencentAccountQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public TencentAccountQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public TencentAccountQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public TencentAccountQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public TencentAccountQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public TencentAccountQueryWrapper lastUpdateTimeIn(Date... values){
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
    public TencentAccountQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public TencentAccountQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * 等于 =
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountQueryWrapper fkAccountIdEq(Long fkAccountId){
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
    public TencentAccountQueryWrapper fkAccountIdNe(Long fkAccountId){
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
    public TencentAccountQueryWrapper fkAccountIdGt(Long fkAccountId){
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
    public TencentAccountQueryWrapper fkAccountIdGe(Long fkAccountId){
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
    public TencentAccountQueryWrapper fkAccountIdLt(Long fkAccountId){
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
    public TencentAccountQueryWrapper fkAccountIdLe(Long fkAccountId){
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
    public TencentAccountQueryWrapper fkAccountIdBetween(Long fkAccountIdStart,Long fkAccountIdEnd){
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
    public TencentAccountQueryWrapper fkAccountIdNotBetween(Long fkAccountIdStart,Long fkAccountIdEnd){
        if(fkAccountIdStart!=null && fkAccountIdEnd!=null){
            notBetween("fk_account_id",fkAccountIdStart,fkAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * LIKE '%值%'
     * @param fkAccountId       值
     * @return children
     */
    public TencentAccountQueryWrapper fkAccountIdLike(Long fkAccountId){
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
    public TencentAccountQueryWrapper fkAccountIdNotLike(Long fkAccountId){
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
    public TencentAccountQueryWrapper fkAccountIdLikeLeft(Long fkAccountId){
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
    public TencentAccountQueryWrapper fkAccountIdLikeRight(Long fkAccountId){
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
    public TencentAccountQueryWrapper fkAccountIdIsNull(){
        isNull("fk_account_id");
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IS NOT NULL
     * @return children
     */
    public TencentAccountQueryWrapper fkAccountIdIsNotNull(){
        isNotNull("fk_account_id");
        return this;
    }

    /**
     * <p>box_soc的表的主键ID[用这个id做关联]</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public TencentAccountQueryWrapper fkAccountIdIn(Collection<Long> value){
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
    public TencentAccountQueryWrapper fkAccountIdIn(Long... values){
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
    public TencentAccountQueryWrapper fkAccountIdNotIn(Collection<Long> value){
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
    public TencentAccountQueryWrapper fkAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_account_id",values);
        }
        return this;
    }



}
