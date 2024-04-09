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
public class BaiduAccountUpdateEntityWrapper extends UpdateWrapper<BaiduAccount> {

    public static BaiduAccountUpdateEntityWrapper wrapper(BaiduAccount entity) {
        return new BaiduAccountUpdateEntityWrapper(entity);
    }

    private BaiduAccount entity;

    public BaiduAccountUpdateEntityWrapper(BaiduAccount entity) {
        this.entity=entity;
    }

    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setMobile(String mobile) {
         set("mobile",mobile);
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setAccountName(String accountName) {
         set("account_name",accountName);
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setHost(String host) {
         set("host",host);
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setBearerToken(String bearerToken) {
         set("bearer_token",bearerToken);
        return this;
    }
    /**
     * token过期时间
     */
    public BaiduAccountUpdateEntityWrapper setTokenExpire(Date tokenExpire) {
         set("token_expire",tokenExpire);
        return this;
    }
    /**
     * 根分组
     */
    public BaiduAccountUpdateEntityWrapper setRootGroupCode(String rootGroupCode) {
         set("root_group_code",rootGroupCode);
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 刷新token
     */
    public BaiduAccountUpdateEntityWrapper setRefreshToken(String refreshToken) {
         set("refreshToken",refreshToken);
        return this;
    }
    /**
     * 刷新token过期时间
     */
    public BaiduAccountUpdateEntityWrapper setRefreshtokenExpire(String refreshtokenExpire) {
         set("refreshToken_expire",refreshtokenExpire);
        return this;
    }

    protected BaiduAccount entity() {
        if(entity==null){
            throw new NullPointerException("BaiduAccount is null");
        }
        return entity;
    }

    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setMobile() {
        String mobile =entity().getMobile();
        if(mobile!=null){
            set("mobile",mobile);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setAccountName() {
        String accountName =entity().getAccountName();
        if(accountName!=null){
            set("account_name",accountName);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setHost() {
        String host =entity().getHost();
        if(host!=null){
            set("host",host);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setBearerToken() {
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            set("bearer_token",bearerToken);
        }
        return this;
    }
    /**
     * token过期时间
     */
    public BaiduAccountUpdateEntityWrapper setTokenExpire() {
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            set("token_expire",tokenExpire);
        }
        return this;
    }
    /**
     * 根分组
     */
    public BaiduAccountUpdateEntityWrapper setRootGroupCode() {
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            set("root_group_code",rootGroupCode);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 
     */
    public BaiduAccountUpdateEntityWrapper setLastUpdateTime() {
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            set("last_update_time",lastUpdateTime);
        }
        return this;
    }
    /**
     * 刷新token
     */
    public BaiduAccountUpdateEntityWrapper setRefreshToken() {
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            set("refreshToken",refreshToken);
        }
        return this;
    }
    /**
     * 刷新token过期时间
     */
    public BaiduAccountUpdateEntityWrapper setRefreshtokenExpire() {
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            set("refreshToken_expire",refreshtokenExpire);
        }
        return this;
    }
    /**
     * <p></p>
     * 等于 = entity().getId()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idEq(){
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
    public BaiduAccountUpdateEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
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
    public BaiduAccountUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public BaiduAccountUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public BaiduAccountUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idEq(Long id){
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
    public BaiduAccountUpdateEntityWrapper idNe(Long id){
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
    public BaiduAccountUpdateEntityWrapper idGt(Long id){
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
    public BaiduAccountUpdateEntityWrapper idGe(Long id){
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
    public BaiduAccountUpdateEntityWrapper idLt(Long id){
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
    public BaiduAccountUpdateEntityWrapper idLe(Long id){
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
    public BaiduAccountUpdateEntityWrapper idLike(Long id){
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
    public BaiduAccountUpdateEntityWrapper idNotLike(Long id){
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
    public BaiduAccountUpdateEntityWrapper idLikeLeft(Long id){
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
    public BaiduAccountUpdateEntityWrapper idLikeRight(Long id){
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
    public BaiduAccountUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper idIn(Collection<Long> value){
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
    public BaiduAccountUpdateEntityWrapper idIn(Long... values){
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
    public BaiduAccountUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public BaiduAccountUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getMobile()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileEq(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            eq("mobile",mobile);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getMobile()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileNe(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            ne("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getMobile()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileGt(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            gt("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getMobile()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileGe(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            ge("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getMobile()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileLt(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            lt("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getMobile()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileLe(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            le("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getMobile() AND 值2
     * @param mobileEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileBetween(String mobileEnd){
        String mobile =entity().getMobile();
        if(mobile!=null && mobileEnd!=null){
            between("mobile",mobile,mobileEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getMobile() AND 值2
     * @param mobileEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileNotBetween(String mobileEnd){
        String mobile =entity().getMobile();
        if(mobile!=null && mobileEnd!=null){
            notBetween("mobile",mobile,mobileEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getMobile() AND 值2
     * @param mobileStart       值1
     * @param mobileEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileBetween(String mobileStart,String mobileEnd){
        String mobile =entity().getMobile();
        if(mobile!=null && mobileEnd!=null){
            between("mobile",mobileStart,mobileEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getMobile() AND 值2
     * @param mobileStart       值1
     * @param mobileEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileNotBetween(String mobileStart,String mobileEnd){
        String mobile =entity().getMobile();
        if(mobile!=null && mobileEnd!=null){
            notBetween("mobile",mobileStart,mobileEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getMobile()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileLike(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            like("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getMobile()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileNotLike(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            notLike("mobile",mobile);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getMobile()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileLikeLeft(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            likeLeft("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getMobile()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileLikeRight(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            likeRight("mobile",mobile);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileEq(String mobile){
        if(mobile!=null){
            eq("mobile",mobile);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileNe(String mobile){
        if(mobile!=null){
            ne("mobile",mobile);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileGt(String mobile){
        if(mobile!=null){
            gt("mobile",mobile);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileGe(String mobile){
        if(mobile!=null){
            ge("mobile",mobile);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileLt(String mobile){
        if(mobile!=null){
            lt("mobile",mobile);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileLe(String mobile){
        if(mobile!=null){
            le("mobile",mobile);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileLike(String mobile){
        if(mobile!=null){
            like("mobile",mobile);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileNotLike(String mobile){
        if(mobile!=null){
            notLike("mobile",mobile);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileLikeLeft(String mobile){
        if(mobile!=null){
            likeLeft("mobile",mobile);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param mobile       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileLikeRight(String mobile){
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
    public BaiduAccountUpdateEntityWrapper mobileIsNull(){
        isNull("mobile");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileIsNotNull(){
        isNotNull("mobile");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper mobileIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper mobileIn(String... values){
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
    public BaiduAccountUpdateEntityWrapper mobileNotIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper mobileNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("mobile",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getAccountName()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameEq(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            eq("account_name",accountName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getAccountName()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameNe(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            ne("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getAccountName()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameGt(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            gt("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getAccountName()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameGe(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            ge("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getAccountName()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameLt(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            lt("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getAccountName()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameLe(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            le("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getAccountName() AND 值2
     * @param accountNameEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameBetween(String accountNameEnd){
        String accountName =entity().getAccountName();
        if(accountName!=null && accountNameEnd!=null){
            between("account_name",accountName,accountNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getAccountName() AND 值2
     * @param accountNameEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameNotBetween(String accountNameEnd){
        String accountName =entity().getAccountName();
        if(accountName!=null && accountNameEnd!=null){
            notBetween("account_name",accountName,accountNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getAccountName() AND 值2
     * @param accountNameStart       值1
     * @param accountNameEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameBetween(String accountNameStart,String accountNameEnd){
        String accountName =entity().getAccountName();
        if(accountName!=null && accountNameEnd!=null){
            between("account_name",accountNameStart,accountNameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getAccountName() AND 值2
     * @param accountNameStart       值1
     * @param accountNameEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameNotBetween(String accountNameStart,String accountNameEnd){
        String accountName =entity().getAccountName();
        if(accountName!=null && accountNameEnd!=null){
            notBetween("account_name",accountNameStart,accountNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getAccountName()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameLike(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            like("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getAccountName()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameNotLike(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            notLike("account_name",accountName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getAccountName()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameLikeLeft(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            likeLeft("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getAccountName()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameLikeRight(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            likeRight("account_name",accountName);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameEq(String accountName){
        if(accountName!=null){
            eq("account_name",accountName);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameNe(String accountName){
        if(accountName!=null){
            ne("account_name",accountName);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameGt(String accountName){
        if(accountName!=null){
            gt("account_name",accountName);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameGe(String accountName){
        if(accountName!=null){
            ge("account_name",accountName);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameLt(String accountName){
        if(accountName!=null){
            lt("account_name",accountName);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameLe(String accountName){
        if(accountName!=null){
            le("account_name",accountName);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameLike(String accountName){
        if(accountName!=null){
            like("account_name",accountName);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameNotLike(String accountName){
        if(accountName!=null){
            notLike("account_name",accountName);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameLikeLeft(String accountName){
        if(accountName!=null){
            likeLeft("account_name",accountName);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param accountName       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameLikeRight(String accountName){
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
    public BaiduAccountUpdateEntityWrapper accountNameIsNull(){
        isNull("account_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameIsNotNull(){
        isNotNull("account_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper accountNameIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper accountNameIn(String... values){
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
    public BaiduAccountUpdateEntityWrapper accountNameNotIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper accountNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("account_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getHost()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostEq(){
        String host =entity().getHost();
        if(host!=null){
            eq("host",host);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getHost()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostNe(){
        String host =entity().getHost();
        if(host!=null){
            ne("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getHost()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostGt(){
        String host =entity().getHost();
        if(host!=null){
            gt("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getHost()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostGe(){
        String host =entity().getHost();
        if(host!=null){
            ge("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getHost()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostLt(){
        String host =entity().getHost();
        if(host!=null){
            lt("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getHost()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostLe(){
        String host =entity().getHost();
        if(host!=null){
            le("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getHost() AND 值2
     * @param hostEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostBetween(String hostEnd){
        String host =entity().getHost();
        if(host!=null && hostEnd!=null){
            between("host",host,hostEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getHost() AND 值2
     * @param hostEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostNotBetween(String hostEnd){
        String host =entity().getHost();
        if(host!=null && hostEnd!=null){
            notBetween("host",host,hostEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getHost() AND 值2
     * @param hostStart       值1
     * @param hostEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostBetween(String hostStart,String hostEnd){
        String host =entity().getHost();
        if(host!=null && hostEnd!=null){
            between("host",hostStart,hostEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getHost() AND 值2
     * @param hostStart       值1
     * @param hostEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostNotBetween(String hostStart,String hostEnd){
        String host =entity().getHost();
        if(host!=null && hostEnd!=null){
            notBetween("host",hostStart,hostEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getHost()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostLike(){
        String host =entity().getHost();
        if(host!=null){
            like("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getHost()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostNotLike(){
        String host =entity().getHost();
        if(host!=null){
            notLike("host",host);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getHost()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostLikeLeft(){
        String host =entity().getHost();
        if(host!=null){
            likeLeft("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getHost()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostLikeRight(){
        String host =entity().getHost();
        if(host!=null){
            likeRight("host",host);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostEq(String host){
        if(host!=null){
            eq("host",host);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostNe(String host){
        if(host!=null){
            ne("host",host);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostGt(String host){
        if(host!=null){
            gt("host",host);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostGe(String host){
        if(host!=null){
            ge("host",host);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostLt(String host){
        if(host!=null){
            lt("host",host);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostLe(String host){
        if(host!=null){
            le("host",host);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostLike(String host){
        if(host!=null){
            like("host",host);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostNotLike(String host){
        if(host!=null){
            notLike("host",host);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostLikeLeft(String host){
        if(host!=null){
            likeLeft("host",host);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param host       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostLikeRight(String host){
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
    public BaiduAccountUpdateEntityWrapper hostIsNull(){
        isNull("host");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostIsNotNull(){
        isNotNull("host");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper hostIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper hostIn(String... values){
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
    public BaiduAccountUpdateEntityWrapper hostNotIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper hostNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("host",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getBearerToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenEq(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            eq("bearer_token",bearerToken);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getBearerToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenNe(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            ne("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getBearerToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenGt(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            gt("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getBearerToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenGe(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            ge("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getBearerToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenLt(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            lt("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getBearerToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenLe(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            le("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getBearerToken() AND 值2
     * @param bearerTokenEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenBetween(String bearerTokenEnd){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null && bearerTokenEnd!=null){
            between("bearer_token",bearerToken,bearerTokenEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getBearerToken() AND 值2
     * @param bearerTokenEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenNotBetween(String bearerTokenEnd){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null && bearerTokenEnd!=null){
            notBetween("bearer_token",bearerToken,bearerTokenEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getBearerToken() AND 值2
     * @param bearerTokenStart       值1
     * @param bearerTokenEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenBetween(String bearerTokenStart,String bearerTokenEnd){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null && bearerTokenEnd!=null){
            between("bearer_token",bearerTokenStart,bearerTokenEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getBearerToken() AND 值2
     * @param bearerTokenStart       值1
     * @param bearerTokenEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenNotBetween(String bearerTokenStart,String bearerTokenEnd){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null && bearerTokenEnd!=null){
            notBetween("bearer_token",bearerTokenStart,bearerTokenEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getBearerToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenLike(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            like("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getBearerToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenNotLike(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            notLike("bearer_token",bearerToken);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getBearerToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenLikeLeft(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            likeLeft("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getBearerToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenLikeRight(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            likeRight("bearer_token",bearerToken);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenEq(String bearerToken){
        if(bearerToken!=null){
            eq("bearer_token",bearerToken);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenNe(String bearerToken){
        if(bearerToken!=null){
            ne("bearer_token",bearerToken);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenGt(String bearerToken){
        if(bearerToken!=null){
            gt("bearer_token",bearerToken);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenGe(String bearerToken){
        if(bearerToken!=null){
            ge("bearer_token",bearerToken);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenLt(String bearerToken){
        if(bearerToken!=null){
            lt("bearer_token",bearerToken);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenLe(String bearerToken){
        if(bearerToken!=null){
            le("bearer_token",bearerToken);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenLike(String bearerToken){
        if(bearerToken!=null){
            like("bearer_token",bearerToken);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenNotLike(String bearerToken){
        if(bearerToken!=null){
            notLike("bearer_token",bearerToken);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenLikeLeft(String bearerToken){
        if(bearerToken!=null){
            likeLeft("bearer_token",bearerToken);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenLikeRight(String bearerToken){
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
    public BaiduAccountUpdateEntityWrapper bearerTokenIsNull(){
        isNull("bearer_token");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenIsNotNull(){
        isNotNull("bearer_token");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper bearerTokenIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper bearerTokenIn(String... values){
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
    public BaiduAccountUpdateEntityWrapper bearerTokenNotIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper bearerTokenNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bearer_token",values);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * 等于 = entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireEq(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            eq("token_expire",tokenExpire);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * 不等于 &lt;&gt; entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireNe(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            ne("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * 大于 &gt; entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireGt(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            gt("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * 大于等于 &gt;= entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireGe(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            ge("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * 小于 &lt; entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireLt(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            lt("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * 小于等于 &lt;= entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireLe(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            le("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * BETWEEN  entity().getTokenExpire() AND 值2
     * @param tokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireBetween(Date tokenExpireEnd){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null && tokenExpireEnd!=null){
            between("token_expire",tokenExpire,tokenExpireEnd);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * NOT BETWEEN  entity().getTokenExpire() AND 值2
     * @param tokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireNotBetween(Date tokenExpireEnd){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null && tokenExpireEnd!=null){
            notBetween("token_expire",tokenExpire,tokenExpireEnd);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * BETWEEN  entity().getTokenExpire() AND 值2
     * @param tokenExpireStart       值1
     * @param tokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireBetween(Date tokenExpireStart,Date tokenExpireEnd){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null && tokenExpireEnd!=null){
            between("token_expire",tokenExpireStart,tokenExpireEnd);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * NOT BETWEEN  entity().getTokenExpire() AND 值2
     * @param tokenExpireStart       值1
     * @param tokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireNotBetween(Date tokenExpireStart,Date tokenExpireEnd){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null && tokenExpireEnd!=null){
            notBetween("token_expire",tokenExpireStart,tokenExpireEnd);
        }
        return this;
     }


    /**
     * <p>token过期时间</p>
     * LIKE '%值%' entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireLike(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            like("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * NOT LIKE '%值%' entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireNotLike(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            notLike("token_expire",tokenExpire);
        }
        return this;
     }


    /**
     * <p>token过期时间</p>
     * LIKE '%值' entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireLikeLeft(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            likeLeft("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * LIKE '值%' entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireLikeRight(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            likeRight("token_expire",tokenExpire);
        }
        return this;
     }

/**
     * <p>token过期时间</p>
     * 等于 =
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireEq(Date tokenExpire){
        if(tokenExpire!=null){
            eq("token_expire",tokenExpire);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * 不等于 &lt;&gt;
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireNe(Date tokenExpire){
        if(tokenExpire!=null){
            ne("token_expire",tokenExpire);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * 大于 &gt;
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireGt(Date tokenExpire){
        if(tokenExpire!=null){
            gt("token_expire",tokenExpire);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * 大于等于 &gt;=
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireGe(Date tokenExpire){
        if(tokenExpire!=null){
            ge("token_expire",tokenExpire);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * 小于 &lt;
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireLt(Date tokenExpire){
        if(tokenExpire!=null){
            lt("token_expire",tokenExpire);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * 小于等于 &lt;=
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireLe(Date tokenExpire){
        if(tokenExpire!=null){
            le("token_expire",tokenExpire);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * LIKE '%值%'
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireLike(Date tokenExpire){
        if(tokenExpire!=null){
            like("token_expire",tokenExpire);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * NOT LIKE '%值%'
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireNotLike(Date tokenExpire){
        if(tokenExpire!=null){
            notLike("token_expire",tokenExpire);
        }
        return this;
    }


    /**
     * <p>token过期时间</p>
     * LIKE '%值'
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireLikeLeft(Date tokenExpire){
        if(tokenExpire!=null){
            likeLeft("token_expire",tokenExpire);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * LIKE '值%'
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireLikeRight(Date tokenExpire){
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
    public BaiduAccountUpdateEntityWrapper tokenExpireIsNull(){
        isNull("token_expire");
        return this;
    }

    /**
     * <p>token过期时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireIsNotNull(){
        isNotNull("token_expire");
        return this;
    }

    /**
     * <p>token过期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper tokenExpireIn(Collection<Date> value){
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
    public BaiduAccountUpdateEntityWrapper tokenExpireIn(Date... values){
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
    public BaiduAccountUpdateEntityWrapper tokenExpireNotIn(Collection<Date> value){
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
    public BaiduAccountUpdateEntityWrapper tokenExpireNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("token_expire",values);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * 等于 = entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeEq(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            eq("root_group_code",rootGroupCode);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * 不等于 &lt;&gt; entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeNe(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            ne("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * 大于 &gt; entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeGt(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            gt("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * 大于等于 &gt;= entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeGe(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            ge("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * 小于 &lt; entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeLt(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            lt("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * 小于等于 &lt;= entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeLe(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            le("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * BETWEEN  entity().getRootGroupCode() AND 值2
     * @param rootGroupCodeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeBetween(String rootGroupCodeEnd){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null && rootGroupCodeEnd!=null){
            between("root_group_code",rootGroupCode,rootGroupCodeEnd);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * NOT BETWEEN  entity().getRootGroupCode() AND 值2
     * @param rootGroupCodeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeNotBetween(String rootGroupCodeEnd){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null && rootGroupCodeEnd!=null){
            notBetween("root_group_code",rootGroupCode,rootGroupCodeEnd);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * BETWEEN  entity().getRootGroupCode() AND 值2
     * @param rootGroupCodeStart       值1
     * @param rootGroupCodeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeBetween(String rootGroupCodeStart,String rootGroupCodeEnd){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null && rootGroupCodeEnd!=null){
            between("root_group_code",rootGroupCodeStart,rootGroupCodeEnd);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * NOT BETWEEN  entity().getRootGroupCode() AND 值2
     * @param rootGroupCodeStart       值1
     * @param rootGroupCodeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeNotBetween(String rootGroupCodeStart,String rootGroupCodeEnd){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null && rootGroupCodeEnd!=null){
            notBetween("root_group_code",rootGroupCodeStart,rootGroupCodeEnd);
        }
        return this;
     }


    /**
     * <p>根分组</p>
     * LIKE '%值%' entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeLike(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            like("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * NOT LIKE '%值%' entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeNotLike(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            notLike("root_group_code",rootGroupCode);
        }
        return this;
     }


    /**
     * <p>根分组</p>
     * LIKE '%值' entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeLikeLeft(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            likeLeft("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * LIKE '值%' entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeLikeRight(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            likeRight("root_group_code",rootGroupCode);
        }
        return this;
     }

/**
     * <p>根分组</p>
     * 等于 =
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeEq(String rootGroupCode){
        if(rootGroupCode!=null){
            eq("root_group_code",rootGroupCode);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * 不等于 &lt;&gt;
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeNe(String rootGroupCode){
        if(rootGroupCode!=null){
            ne("root_group_code",rootGroupCode);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * 大于 &gt;
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeGt(String rootGroupCode){
        if(rootGroupCode!=null){
            gt("root_group_code",rootGroupCode);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * 大于等于 &gt;=
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeGe(String rootGroupCode){
        if(rootGroupCode!=null){
            ge("root_group_code",rootGroupCode);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * 小于 &lt;
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeLt(String rootGroupCode){
        if(rootGroupCode!=null){
            lt("root_group_code",rootGroupCode);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * 小于等于 &lt;=
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeLe(String rootGroupCode){
        if(rootGroupCode!=null){
            le("root_group_code",rootGroupCode);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * LIKE '%值%'
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeLike(String rootGroupCode){
        if(rootGroupCode!=null){
            like("root_group_code",rootGroupCode);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * NOT LIKE '%值%'
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeNotLike(String rootGroupCode){
        if(rootGroupCode!=null){
            notLike("root_group_code",rootGroupCode);
        }
        return this;
    }


    /**
     * <p>根分组</p>
     * LIKE '%值'
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeLikeLeft(String rootGroupCode){
        if(rootGroupCode!=null){
            likeLeft("root_group_code",rootGroupCode);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * LIKE '值%'
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeLikeRight(String rootGroupCode){
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
    public BaiduAccountUpdateEntityWrapper rootGroupCodeIsNull(){
        isNull("root_group_code");
        return this;
    }

    /**
     * <p>根分组</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeIsNotNull(){
        isNotNull("root_group_code");
        return this;
    }

    /**
     * <p>根分组</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper rootGroupCodeIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper rootGroupCodeIn(String... values){
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
    public BaiduAccountUpdateEntityWrapper rootGroupCodeNotIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper rootGroupCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_group_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public BaiduAccountUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public BaiduAccountUpdateEntityWrapper createTimeIn(Date... values){
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
    public BaiduAccountUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public BaiduAccountUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
    }


    /**
     * <p></p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public BaiduAccountUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * 等于 = entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenEq(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            eq("refreshToken",refreshToken);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * 不等于 &lt;&gt; entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenNe(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            ne("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * 大于 &gt; entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenGt(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            gt("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * 大于等于 &gt;= entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenGe(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            ge("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * 小于 &lt; entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenLt(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            lt("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * 小于等于 &lt;= entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenLe(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            le("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * BETWEEN  entity().getRefreshToken() AND 值2
     * @param refreshTokenEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenBetween(String refreshTokenEnd){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null && refreshTokenEnd!=null){
            between("refreshToken",refreshToken,refreshTokenEnd);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * NOT BETWEEN  entity().getRefreshToken() AND 值2
     * @param refreshTokenEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenNotBetween(String refreshTokenEnd){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null && refreshTokenEnd!=null){
            notBetween("refreshToken",refreshToken,refreshTokenEnd);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * BETWEEN  entity().getRefreshToken() AND 值2
     * @param refreshTokenStart       值1
     * @param refreshTokenEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenBetween(String refreshTokenStart,String refreshTokenEnd){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null && refreshTokenEnd!=null){
            between("refreshToken",refreshTokenStart,refreshTokenEnd);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * NOT BETWEEN  entity().getRefreshToken() AND 值2
     * @param refreshTokenStart       值1
     * @param refreshTokenEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenNotBetween(String refreshTokenStart,String refreshTokenEnd){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null && refreshTokenEnd!=null){
            notBetween("refreshToken",refreshTokenStart,refreshTokenEnd);
        }
        return this;
     }


    /**
     * <p>刷新token</p>
     * LIKE '%值%' entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenLike(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            like("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * NOT LIKE '%值%' entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenNotLike(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            notLike("refreshToken",refreshToken);
        }
        return this;
     }


    /**
     * <p>刷新token</p>
     * LIKE '%值' entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenLikeLeft(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            likeLeft("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * LIKE '值%' entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenLikeRight(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            likeRight("refreshToken",refreshToken);
        }
        return this;
     }

/**
     * <p>刷新token</p>
     * 等于 =
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenEq(String refreshToken){
        if(refreshToken!=null){
            eq("refreshToken",refreshToken);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * 不等于 &lt;&gt;
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenNe(String refreshToken){
        if(refreshToken!=null){
            ne("refreshToken",refreshToken);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * 大于 &gt;
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenGt(String refreshToken){
        if(refreshToken!=null){
            gt("refreshToken",refreshToken);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * 大于等于 &gt;=
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenGe(String refreshToken){
        if(refreshToken!=null){
            ge("refreshToken",refreshToken);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * 小于 &lt;
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenLt(String refreshToken){
        if(refreshToken!=null){
            lt("refreshToken",refreshToken);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * 小于等于 &lt;=
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenLe(String refreshToken){
        if(refreshToken!=null){
            le("refreshToken",refreshToken);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * LIKE '%值%'
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenLike(String refreshToken){
        if(refreshToken!=null){
            like("refreshToken",refreshToken);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * NOT LIKE '%值%'
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenNotLike(String refreshToken){
        if(refreshToken!=null){
            notLike("refreshToken",refreshToken);
        }
        return this;
    }


    /**
     * <p>刷新token</p>
     * LIKE '%值'
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenLikeLeft(String refreshToken){
        if(refreshToken!=null){
            likeLeft("refreshToken",refreshToken);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * LIKE '值%'
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenLikeRight(String refreshToken){
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
    public BaiduAccountUpdateEntityWrapper refreshTokenIsNull(){
        isNull("refreshToken");
        return this;
    }

    /**
     * <p>刷新token</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenIsNotNull(){
        isNotNull("refreshToken");
        return this;
    }

    /**
     * <p>刷新token</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshTokenIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper refreshTokenIn(String... values){
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
    public BaiduAccountUpdateEntityWrapper refreshTokenNotIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper refreshTokenNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("refreshToken",values);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * 等于 = entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireEq(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            eq("refreshToken_expire",refreshtokenExpire);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * 不等于 &lt;&gt; entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireNe(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            ne("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * 大于 &gt; entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireGt(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            gt("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * 大于等于 &gt;= entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireGe(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            ge("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * 小于 &lt; entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireLt(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            lt("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * 小于等于 &lt;= entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireLe(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            le("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * BETWEEN  entity().getRefreshtokenExpire() AND 值2
     * @param refreshtokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireBetween(String refreshtokenExpireEnd){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null && refreshtokenExpireEnd!=null){
            between("refreshToken_expire",refreshtokenExpire,refreshtokenExpireEnd);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * NOT BETWEEN  entity().getRefreshtokenExpire() AND 值2
     * @param refreshtokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireNotBetween(String refreshtokenExpireEnd){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null && refreshtokenExpireEnd!=null){
            notBetween("refreshToken_expire",refreshtokenExpire,refreshtokenExpireEnd);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * BETWEEN  entity().getRefreshtokenExpire() AND 值2
     * @param refreshtokenExpireStart       值1
     * @param refreshtokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireBetween(String refreshtokenExpireStart,String refreshtokenExpireEnd){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null && refreshtokenExpireEnd!=null){
            between("refreshToken_expire",refreshtokenExpireStart,refreshtokenExpireEnd);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * NOT BETWEEN  entity().getRefreshtokenExpire() AND 值2
     * @param refreshtokenExpireStart       值1
     * @param refreshtokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireNotBetween(String refreshtokenExpireStart,String refreshtokenExpireEnd){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null && refreshtokenExpireEnd!=null){
            notBetween("refreshToken_expire",refreshtokenExpireStart,refreshtokenExpireEnd);
        }
        return this;
     }


    /**
     * <p>刷新token过期时间</p>
     * LIKE '%值%' entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireLike(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            like("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * NOT LIKE '%值%' entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireNotLike(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            notLike("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }


    /**
     * <p>刷新token过期时间</p>
     * LIKE '%值' entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireLikeLeft(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            likeLeft("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * LIKE '值%' entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireLikeRight(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            likeRight("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

/**
     * <p>刷新token过期时间</p>
     * 等于 =
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireEq(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            eq("refreshToken_expire",refreshtokenExpire);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * 不等于 &lt;&gt;
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireNe(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            ne("refreshToken_expire",refreshtokenExpire);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * 大于 &gt;
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireGt(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            gt("refreshToken_expire",refreshtokenExpire);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * 大于等于 &gt;=
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireGe(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            ge("refreshToken_expire",refreshtokenExpire);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * 小于 &lt;
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireLt(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            lt("refreshToken_expire",refreshtokenExpire);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * 小于等于 &lt;=
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireLe(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            le("refreshToken_expire",refreshtokenExpire);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * LIKE '%值%'
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireLike(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            like("refreshToken_expire",refreshtokenExpire);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * NOT LIKE '%值%'
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireNotLike(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            notLike("refreshToken_expire",refreshtokenExpire);
        }
        return this;
    }


    /**
     * <p>刷新token过期时间</p>
     * LIKE '%值'
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireLikeLeft(String refreshtokenExpire){
        if(refreshtokenExpire!=null){
            likeLeft("refreshToken_expire",refreshtokenExpire);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * LIKE '值%'
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireLikeRight(String refreshtokenExpire){
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
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireIsNull(){
        isNull("refreshToken_expire");
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireIsNotNull(){
        isNotNull("refreshToken_expire");
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireIn(String... values){
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
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireNotIn(Collection<String> value){
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
    public BaiduAccountUpdateEntityWrapper refreshtokenExpireNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("refreshToken_expire",values);
        }
        return this;
    }


}
