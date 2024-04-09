package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.BaiduAccount;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 百度账号表
 * </p>
 * "baidu_account"
 * @author PC001
 */
public class BaiduAccountUpdateWrapper extends UpdateWrapper<BaiduAccount> {

    public static BaiduAccountUpdateWrapper wrapper() {
        return new BaiduAccountUpdateWrapper();
    }

    public BaiduAccountUpdateWrapper() {
        super();
    }

    public BaiduAccountUpdateWrapper(BaiduAccount entity) {
        super(entity);
    }

    /**
     * 
     */
    public BaiduAccountUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateWrapper setMobile(String mobile) {
         set("mobile",mobile);
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateWrapper setAccountName(String accountName) {
         set("account_name",accountName);
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateWrapper setHost(String host) {
         set("host",host);
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateWrapper setBearerToken(String bearerToken) {
         set("bearer_token",bearerToken);
        return this;
    }
    /**
     * token过期时间
     */
    public BaiduAccountUpdateWrapper setTokenExpire(Date tokenExpire) {
         set("token_expire",tokenExpire);
        return this;
    }
    /**
     * 根分组
     */
    public BaiduAccountUpdateWrapper setRootGroupCode(String rootGroupCode) {
         set("root_group_code",rootGroupCode);
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 刷新token
     */
    public BaiduAccountUpdateWrapper setRefreshToken(String refreshToken) {
         set("refreshToken",refreshToken);
        return this;
    }
    /**
     * 刷新token过期时间
     */
    public BaiduAccountUpdateWrapper setRefreshtokenExpire(String refreshtokenExpire) {
         set("refreshToken_expire",refreshtokenExpire);
        return this;
    }

    /**
     * <p></p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public BaiduAccountUpdateWrapper idEq(Long id){
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
    public BaiduAccountUpdateWrapper idNe(Long id){
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
    public BaiduAccountUpdateWrapper idGt(Long id){
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
    public BaiduAccountUpdateWrapper idGe(Long id){
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
    public BaiduAccountUpdateWrapper idLt(Long id){
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
    public BaiduAccountUpdateWrapper idLe(Long id){
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
    public BaiduAccountUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public BaiduAccountUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public BaiduAccountUpdateWrapper idLike(Long id){
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
    public BaiduAccountUpdateWrapper idNotLike(Long id){
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
    public BaiduAccountUpdateWrapper idLikeLeft(Long id){
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
    public BaiduAccountUpdateWrapper idLikeRight(Long id){
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
    public BaiduAccountUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper idIn(Collection<Long> value){
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
    public BaiduAccountUpdateWrapper idIn(Long... values){
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
    public BaiduAccountUpdateWrapper idNotIn(Collection<Long> value){
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
    public BaiduAccountUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = mobile
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileEq(String mobile){
        if(mobile!=null){
            eq("mobile",mobile);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; mobile
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileNe(String mobile){
        if(mobile!=null){
            ne("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; mobile
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileGt(String mobile){
        if(mobile!=null){
            gt("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= mobile
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileGe(String mobile){
        if(mobile!=null){
            ge("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; mobile
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileLt(String mobile){
        if(mobile!=null){
            lt("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= mobile
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileLe(String mobile){
        if(mobile!=null){
            le("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param mobileStart       值1
     * @param mobileEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileBetween(String mobileStart,String mobileEnd){
        if(mobileStart!=null && mobileEnd!=null){
            between("mobile",mobileStart,mobileEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param mobileStart       值1
     * @param mobileEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileNotBetween(String mobileStart,String mobileEnd){
        if(mobileStart!=null && mobileEnd!=null){
            notBetween("mobile",mobileStart,mobileEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' mobile
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileLike(String mobile){
        if(mobile!=null){
            like("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' mobile
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileNotLike(String mobile){
        if(mobile!=null){
            notLike("mobile",mobile);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' mobile
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileLikeLeft(String mobile){
        if(mobile!=null){
            likeLeft("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' mobile
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileLikeRight(String mobile){
        if(mobile!=null){
            likeRight("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileIsNull(){
        isNull("mobile");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileIsNotNull(){
        isNotNull("mobile");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("mobile",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileIn(String... values){
        if(values!=null && values.length>0){
            in("mobile",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("mobile",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper mobileNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("mobile",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = accountName
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameEq(String accountName){
        if(accountName!=null){
            eq("account_name",accountName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; accountName
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameNe(String accountName){
        if(accountName!=null){
            ne("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; accountName
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameGt(String accountName){
        if(accountName!=null){
            gt("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= accountName
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameGe(String accountName){
        if(accountName!=null){
            ge("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; accountName
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameLt(String accountName){
        if(accountName!=null){
            lt("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= accountName
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameLe(String accountName){
        if(accountName!=null){
            le("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param accountNameStart       值1
     * @param accountNameEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameBetween(String accountNameStart,String accountNameEnd){
        if(accountNameStart!=null && accountNameEnd!=null){
            between("account_name",accountNameStart,accountNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param accountNameStart       值1
     * @param accountNameEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameNotBetween(String accountNameStart,String accountNameEnd){
        if(accountNameStart!=null && accountNameEnd!=null){
            notBetween("account_name",accountNameStart,accountNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' accountName
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameLike(String accountName){
        if(accountName!=null){
            like("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' accountName
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameNotLike(String accountName){
        if(accountName!=null){
            notLike("account_name",accountName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' accountName
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameLikeLeft(String accountName){
        if(accountName!=null){
            likeLeft("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' accountName
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameLikeRight(String accountName){
        if(accountName!=null){
            likeRight("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameIsNull(){
        isNull("account_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameIsNotNull(){
        isNotNull("account_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("account_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameIn(String... values){
        if(values!=null && values.length>0){
            in("account_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("account_name",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper accountNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("account_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = host
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateWrapper hostEq(String host){
        if(host!=null){
            eq("host",host);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; host
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateWrapper hostNe(String host){
        if(host!=null){
            ne("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; host
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateWrapper hostGt(String host){
        if(host!=null){
            gt("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= host
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateWrapper hostGe(String host){
        if(host!=null){
            ge("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; host
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateWrapper hostLt(String host){
        if(host!=null){
            lt("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= host
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateWrapper hostLe(String host){
        if(host!=null){
            le("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param hostStart       值1
     * @param hostEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper hostBetween(String hostStart,String hostEnd){
        if(hostStart!=null && hostEnd!=null){
            between("host",hostStart,hostEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param hostStart       值1
     * @param hostEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper hostNotBetween(String hostStart,String hostEnd){
        if(hostStart!=null && hostEnd!=null){
            notBetween("host",hostStart,hostEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' host
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateWrapper hostLike(String host){
        if(host!=null){
            like("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' host
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateWrapper hostNotLike(String host){
        if(host!=null){
            notLike("host",host);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' host
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateWrapper hostLikeLeft(String host){
        if(host!=null){
            likeLeft("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' host
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateWrapper hostLikeRight(String host){
        if(host!=null){
            likeRight("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper hostIsNull(){
        isNull("host");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper hostIsNotNull(){
        isNotNull("host");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper hostIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("host",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper hostIn(String... values){
        if(values!=null && values.length>0){
            in("host",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper hostNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("host",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper hostNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("host",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = bearerToken
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenEq(String bearerToken){
        if(bearerToken!=null){
            eq("bearer_token",bearerToken);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; bearerToken
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenNe(String bearerToken){
        if(bearerToken!=null){
            ne("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; bearerToken
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenGt(String bearerToken){
        if(bearerToken!=null){
            gt("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= bearerToken
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenGe(String bearerToken){
        if(bearerToken!=null){
            ge("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; bearerToken
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenLt(String bearerToken){
        if(bearerToken!=null){
            lt("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= bearerToken
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenLe(String bearerToken){
        if(bearerToken!=null){
            le("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param bearerTokenStart       值1
     * @param bearerTokenEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenBetween(String bearerTokenStart,String bearerTokenEnd){
        if(bearerTokenStart!=null && bearerTokenEnd!=null){
            between("bearer_token",bearerTokenStart,bearerTokenEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param bearerTokenStart       值1
     * @param bearerTokenEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenNotBetween(String bearerTokenStart,String bearerTokenEnd){
        if(bearerTokenStart!=null && bearerTokenEnd!=null){
            notBetween("bearer_token",bearerTokenStart,bearerTokenEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' bearerToken
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenLike(String bearerToken){
        if(bearerToken!=null){
            like("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' bearerToken
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenNotLike(String bearerToken){
        if(bearerToken!=null){
            notLike("bearer_token",bearerToken);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' bearerToken
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenLikeLeft(String bearerToken){
        if(bearerToken!=null){
            likeLeft("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' bearerToken
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenLikeRight(String bearerToken){
        if(bearerToken!=null){
            likeRight("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenIsNull(){
        isNull("bearer_token");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenIsNotNull(){
        isNotNull("bearer_token");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("bearer_token",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenIn(String... values){
        if(values!=null && values.length>0){
            in("bearer_token",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("bearer_token",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper bearerTokenNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bearer_token",values);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * 等于 = tokenExpire
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireEq(Date tokenExpire){
        if(tokenExpire!=null){
            eq("token_expire",tokenExpire);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * 不等于 &lt;&gt; tokenExpire
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireNe(Date tokenExpire){
        if(tokenExpire!=null){
            ne("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * 大于 &gt; tokenExpire
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireGt(Date tokenExpire){
        if(tokenExpire!=null){
            gt("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * 大于等于 &gt;= tokenExpire
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireGe(Date tokenExpire){
        if(tokenExpire!=null){
            ge("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * 小于 &lt; tokenExpire
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireLt(Date tokenExpire){
        if(tokenExpire!=null){
            lt("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * 小于等于 &lt;= tokenExpire
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireLe(Date tokenExpire){
        if(tokenExpire!=null){
            le("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * BETWEEN 值1 AND 值2
     * @param tokenExpireStart       值1
     * @param tokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireBetween(Date tokenExpireStart,Date tokenExpireEnd){
        if(tokenExpireStart!=null && tokenExpireEnd!=null){
            between("token_expire",tokenExpireStart,tokenExpireEnd);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param tokenExpireStart       值1
     * @param tokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireNotBetween(Date tokenExpireStart,Date tokenExpireEnd){
        if(tokenExpireStart!=null && tokenExpireEnd!=null){
            notBetween("token_expire",tokenExpireStart,tokenExpireEnd);
        }
        return this;
     }


    /**
     * <p>token过期时间</p>
     * LIKE '%值%' tokenExpire
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireLike(Date tokenExpire){
        if(tokenExpire!=null){
            like("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * NOT LIKE '%值%' tokenExpire
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireNotLike(Date tokenExpire){
        if(tokenExpire!=null){
            notLike("token_expire",tokenExpire);
        }
        return this;
     }


    /**
     * <p>token过期时间</p>
     * LIKE '%值' tokenExpire
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireLikeLeft(Date tokenExpire){
        if(tokenExpire!=null){
            likeLeft("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * LIKE '值%' tokenExpire
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireLikeRight(Date tokenExpire){
        if(tokenExpire!=null){
            likeRight("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * IS NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireIsNull(){
        isNull("token_expire");
        return this;
    }

    /**
     * <p>token过期时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireIsNotNull(){
        isNotNull("token_expire");
        return this;
    }

    /**
     * <p>token过期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("token_expire",value);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireIn(Date... values){
        if(values!=null && values.length>0){
            in("token_expire",values);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("token_expire",value);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper tokenExpireNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("token_expire",values);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * 等于 = rootGroupCode
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeEq(String rootGroupCode){
        if(rootGroupCode!=null){
            eq("root_group_code",rootGroupCode);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * 不等于 &lt;&gt; rootGroupCode
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeNe(String rootGroupCode){
        if(rootGroupCode!=null){
            ne("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * 大于 &gt; rootGroupCode
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeGt(String rootGroupCode){
        if(rootGroupCode!=null){
            gt("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * 大于等于 &gt;= rootGroupCode
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeGe(String rootGroupCode){
        if(rootGroupCode!=null){
            ge("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * 小于 &lt; rootGroupCode
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeLt(String rootGroupCode){
        if(rootGroupCode!=null){
            lt("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * 小于等于 &lt;= rootGroupCode
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeLe(String rootGroupCode){
        if(rootGroupCode!=null){
            le("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * BETWEEN 值1 AND 值2
     * @param rootGroupCodeStart       值1
     * @param rootGroupCodeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeBetween(String rootGroupCodeStart,String rootGroupCodeEnd){
        if(rootGroupCodeStart!=null && rootGroupCodeEnd!=null){
            between("root_group_code",rootGroupCodeStart,rootGroupCodeEnd);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * NOT BETWEEN 值1 AND 值2
     * @param rootGroupCodeStart       值1
     * @param rootGroupCodeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeNotBetween(String rootGroupCodeStart,String rootGroupCodeEnd){
        if(rootGroupCodeStart!=null && rootGroupCodeEnd!=null){
            notBetween("root_group_code",rootGroupCodeStart,rootGroupCodeEnd);
        }
        return this;
     }


    /**
     * <p>根分组</p>
     * LIKE '%值%' rootGroupCode
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeLike(String rootGroupCode){
        if(rootGroupCode!=null){
            like("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * NOT LIKE '%值%' rootGroupCode
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeNotLike(String rootGroupCode){
        if(rootGroupCode!=null){
            notLike("root_group_code",rootGroupCode);
        }
        return this;
     }


    /**
     * <p>根分组</p>
     * LIKE '%值' rootGroupCode
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeLikeLeft(String rootGroupCode){
        if(rootGroupCode!=null){
            likeLeft("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * LIKE '值%' rootGroupCode
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeLikeRight(String rootGroupCode){
        if(rootGroupCode!=null){
            likeRight("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * IS NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeIsNull(){
        isNull("root_group_code");
        return this;
    }

    /**
     * <p>根分组</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeIsNotNull(){
        isNotNull("root_group_code");
        return this;
    }

    /**
     * <p>根分组</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("root_group_code",value);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeIn(String... values){
        if(values!=null && values.length>0){
            in("root_group_code",values);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("root_group_code",value);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper rootGroupCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_group_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; createTime
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; createTime
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= createTime
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; createTime
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= createTime
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' createTime
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' createTime
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' createTime
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * 等于 = refreshToken
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenEq(String refreshToken){
        if(refreshToken!=null){
            eq("refreshToken",refreshToken);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * 不等于 &lt;&gt; refreshToken
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenNe(String refreshToken){
        if(refreshToken!=null){
            ne("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * 大于 &gt; refreshToken
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenGt(String refreshToken){
        if(refreshToken!=null){
            gt("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * 大于等于 &gt;= refreshToken
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenGe(String refreshToken){
        if(refreshToken!=null){
            ge("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * 小于 &lt; refreshToken
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenLt(String refreshToken){
        if(refreshToken!=null){
            lt("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * 小于等于 &lt;= refreshToken
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenLe(String refreshToken){
        if(refreshToken!=null){
            le("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * BETWEEN 值1 AND 值2
     * @param refreshTokenStart       值1
     * @param refreshTokenEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenBetween(String refreshTokenStart,String refreshTokenEnd){
        if(refreshTokenStart!=null && refreshTokenEnd!=null){
            between("refreshToken",refreshTokenStart,refreshTokenEnd);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * NOT BETWEEN 值1 AND 值2
     * @param refreshTokenStart       值1
     * @param refreshTokenEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenNotBetween(String refreshTokenStart,String refreshTokenEnd){
        if(refreshTokenStart!=null && refreshTokenEnd!=null){
            notBetween("refreshToken",refreshTokenStart,refreshTokenEnd);
        }
        return this;
     }


    /**
     * <p>刷新token</p>
     * LIKE '%值%' refreshToken
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenLike(String refreshToken){
        if(refreshToken!=null){
            like("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * NOT LIKE '%值%' refreshToken
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenNotLike(String refreshToken){
        if(refreshToken!=null){
            notLike("refreshToken",refreshToken);
        }
        return this;
     }


    /**
     * <p>刷新token</p>
     * LIKE '%值' refreshToken
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenLikeLeft(String refreshToken){
        if(refreshToken!=null){
            likeLeft("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * LIKE '值%' refreshToken
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenLikeRight(String refreshToken){
        if(refreshToken!=null){
            likeRight("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * IS NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenIsNull(){
        isNull("refreshToken");
        return this;
    }

    /**
     * <p>刷新token</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenIsNotNull(){
        isNotNull("refreshToken");
        return this;
    }

    /**
     * <p>刷新token</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("refreshToken",value);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenIn(String... values){
        if(values!=null && values.length>0){
            in("refreshToken",values);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("refreshToken",value);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshTokenNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("refreshToken",values);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * 等于 = refreshtokenExpire
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireEq(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            eq("refreshToken_expire",refreshtokenExpire);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * 不等于 &lt;&gt; refreshtokenExpire
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireNe(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            ne("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * 大于 &gt; refreshtokenExpire
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireGt(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            gt("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * 大于等于 &gt;= refreshtokenExpire
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireGe(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            ge("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * 小于 &lt; refreshtokenExpire
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireLt(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            lt("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * 小于等于 &lt;= refreshtokenExpire
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireLe(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            le("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * BETWEEN 值1 AND 值2
     * @param refreshtokenExpireStart       值1
     * @param refreshtokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireBetween(String refreshtokenExpireStart,String refreshtokenExpireEnd){
        if(refreshtokenExpireStart!=null && refreshtokenExpireEnd!=null){
            between("refreshToken_expire",refreshtokenExpireStart,refreshtokenExpireEnd);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param refreshtokenExpireStart       值1
     * @param refreshtokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireNotBetween(String refreshtokenExpireStart,String refreshtokenExpireEnd){
        if(refreshtokenExpireStart!=null && refreshtokenExpireEnd!=null){
            notBetween("refreshToken_expire",refreshtokenExpireStart,refreshtokenExpireEnd);
        }
        return this;
     }


    /**
     * <p>刷新token过期时间</p>
     * LIKE '%值%' refreshtokenExpire
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireLike(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            like("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * NOT LIKE '%值%' refreshtokenExpire
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireNotLike(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            notLike("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }


    /**
     * <p>刷新token过期时间</p>
     * LIKE '%值' refreshtokenExpire
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireLikeLeft(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            likeLeft("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * LIKE '值%' refreshtokenExpire
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireLikeRight(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            likeRight("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * IS NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireIsNull(){
        isNull("refreshToken_expire");
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireIsNotNull(){
        isNotNull("refreshToken_expire");
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("refreshToken_expire",value);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireIn(String... values){
        if(values!=null && values.length>0){
            in("refreshToken_expire",values);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("refreshToken_expire",value);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateWrapper refreshtokenExpireNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("refreshToken_expire",values);
        }
        return this;
    }


}
