package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.BaiduAccount;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 百度账号表
 * </p>
 * "baidu_account"
 * @author PC001
 */
public class BaiduAccountQueryWrapper extends QueryWrapper<BaiduAccount> {


    public static BaiduAccountQueryWrapper wrapper() {
        return new BaiduAccountQueryWrapper();
    }

    public BaiduAccountQueryWrapper() {
        super();
    }

    public BaiduAccountQueryWrapper(BaiduAccount entity) {
        super(entity);
    }

    public BaiduAccountQueryWrapper(BaiduAccount entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public BaiduAccountQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public BaiduAccountQueryWrapper selectColumns(Consumer<BaiduAccountSelect> consumer) {
        BaiduAccountSelect select = new BaiduAccountSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public BaiduAccountQueryWrapper idEq(Long id){
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
    public BaiduAccountQueryWrapper idNe(Long id){
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
    public BaiduAccountQueryWrapper idGt(Long id){
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
    public BaiduAccountQueryWrapper idGe(Long id){
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
    public BaiduAccountQueryWrapper idLt(Long id){
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
    public BaiduAccountQueryWrapper idLe(Long id){
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
    public BaiduAccountQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public BaiduAccountQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public BaiduAccountQueryWrapper idLike(Long id){
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
    public BaiduAccountQueryWrapper idNotLike(Long id){
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
    public BaiduAccountQueryWrapper idLikeLeft(Long id){
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
    public BaiduAccountQueryWrapper idLikeRight(Long id){
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
    public BaiduAccountQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryWrapper idIn(Collection<Long> value){
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
    public BaiduAccountQueryWrapper idIn(Long... values){
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
    public BaiduAccountQueryWrapper idNotIn(Collection<Long> value){
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
    public BaiduAccountQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param mobile       值
     * @return children
     */
    public BaiduAccountQueryWrapper mobileEq(String mobile){
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
    public BaiduAccountQueryWrapper mobileNe(String mobile){
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
    public BaiduAccountQueryWrapper mobileGt(String mobile){
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
    public BaiduAccountQueryWrapper mobileGe(String mobile){
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
    public BaiduAccountQueryWrapper mobileLt(String mobile){
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
    public BaiduAccountQueryWrapper mobileLe(String mobile){
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
    public BaiduAccountQueryWrapper mobileBetween(String mobileStart,String mobileEnd){
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
    public BaiduAccountQueryWrapper mobileNotBetween(String mobileStart,String mobileEnd){
        if(mobileStart!=null && mobileEnd!=null){
            notBetween("mobile",mobileStart,mobileEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param mobile       值
     * @return children
     */
    public BaiduAccountQueryWrapper mobileLike(String mobile){
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
    public BaiduAccountQueryWrapper mobileNotLike(String mobile){
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
    public BaiduAccountQueryWrapper mobileLikeLeft(String mobile){
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
    public BaiduAccountQueryWrapper mobileLikeRight(String mobile){
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
    public BaiduAccountQueryWrapper mobileIsNull(){
        isNull("mobile");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryWrapper mobileIsNotNull(){
        isNotNull("mobile");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryWrapper mobileIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper mobileIn(String... values){
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
    public BaiduAccountQueryWrapper mobileNotIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper mobileNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("mobile",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param accountName       值
     * @return children
     */
    public BaiduAccountQueryWrapper accountNameEq(String accountName){
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
    public BaiduAccountQueryWrapper accountNameNe(String accountName){
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
    public BaiduAccountQueryWrapper accountNameGt(String accountName){
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
    public BaiduAccountQueryWrapper accountNameGe(String accountName){
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
    public BaiduAccountQueryWrapper accountNameLt(String accountName){
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
    public BaiduAccountQueryWrapper accountNameLe(String accountName){
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
    public BaiduAccountQueryWrapper accountNameBetween(String accountNameStart,String accountNameEnd){
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
    public BaiduAccountQueryWrapper accountNameNotBetween(String accountNameStart,String accountNameEnd){
        if(accountNameStart!=null && accountNameEnd!=null){
            notBetween("account_name",accountNameStart,accountNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param accountName       值
     * @return children
     */
    public BaiduAccountQueryWrapper accountNameLike(String accountName){
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
    public BaiduAccountQueryWrapper accountNameNotLike(String accountName){
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
    public BaiduAccountQueryWrapper accountNameLikeLeft(String accountName){
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
    public BaiduAccountQueryWrapper accountNameLikeRight(String accountName){
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
    public BaiduAccountQueryWrapper accountNameIsNull(){
        isNull("account_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryWrapper accountNameIsNotNull(){
        isNotNull("account_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryWrapper accountNameIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper accountNameIn(String... values){
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
    public BaiduAccountQueryWrapper accountNameNotIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper accountNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("account_name",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param host       值
     * @return children
     */
    public BaiduAccountQueryWrapper hostEq(String host){
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
    public BaiduAccountQueryWrapper hostNe(String host){
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
    public BaiduAccountQueryWrapper hostGt(String host){
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
    public BaiduAccountQueryWrapper hostGe(String host){
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
    public BaiduAccountQueryWrapper hostLt(String host){
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
    public BaiduAccountQueryWrapper hostLe(String host){
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
    public BaiduAccountQueryWrapper hostBetween(String hostStart,String hostEnd){
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
    public BaiduAccountQueryWrapper hostNotBetween(String hostStart,String hostEnd){
        if(hostStart!=null && hostEnd!=null){
            notBetween("host",hostStart,hostEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param host       值
     * @return children
     */
    public BaiduAccountQueryWrapper hostLike(String host){
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
    public BaiduAccountQueryWrapper hostNotLike(String host){
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
    public BaiduAccountQueryWrapper hostLikeLeft(String host){
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
    public BaiduAccountQueryWrapper hostLikeRight(String host){
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
    public BaiduAccountQueryWrapper hostIsNull(){
        isNull("host");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryWrapper hostIsNotNull(){
        isNotNull("host");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryWrapper hostIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper hostIn(String... values){
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
    public BaiduAccountQueryWrapper hostNotIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper hostNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("host",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountQueryWrapper bearerTokenEq(String bearerToken){
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
    public BaiduAccountQueryWrapper bearerTokenNe(String bearerToken){
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
    public BaiduAccountQueryWrapper bearerTokenGt(String bearerToken){
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
    public BaiduAccountQueryWrapper bearerTokenGe(String bearerToken){
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
    public BaiduAccountQueryWrapper bearerTokenLt(String bearerToken){
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
    public BaiduAccountQueryWrapper bearerTokenLe(String bearerToken){
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
    public BaiduAccountQueryWrapper bearerTokenBetween(String bearerTokenStart,String bearerTokenEnd){
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
    public BaiduAccountQueryWrapper bearerTokenNotBetween(String bearerTokenStart,String bearerTokenEnd){
        if(bearerTokenStart!=null && bearerTokenEnd!=null){
            notBetween("bearer_token",bearerTokenStart,bearerTokenEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param bearerToken       值
     * @return children
     */
    public BaiduAccountQueryWrapper bearerTokenLike(String bearerToken){
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
    public BaiduAccountQueryWrapper bearerTokenNotLike(String bearerToken){
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
    public BaiduAccountQueryWrapper bearerTokenLikeLeft(String bearerToken){
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
    public BaiduAccountQueryWrapper bearerTokenLikeRight(String bearerToken){
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
    public BaiduAccountQueryWrapper bearerTokenIsNull(){
        isNull("bearer_token");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryWrapper bearerTokenIsNotNull(){
        isNotNull("bearer_token");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryWrapper bearerTokenIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper bearerTokenIn(String... values){
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
    public BaiduAccountQueryWrapper bearerTokenNotIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper bearerTokenNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bearer_token",values);
        }
        return this;
    }

    /**
     * <p>token过期时间</p>
     * 等于 =
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountQueryWrapper tokenExpireEq(Date tokenExpire){
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
    public BaiduAccountQueryWrapper tokenExpireNe(Date tokenExpire){
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
    public BaiduAccountQueryWrapper tokenExpireGt(Date tokenExpire){
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
    public BaiduAccountQueryWrapper tokenExpireGe(Date tokenExpire){
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
    public BaiduAccountQueryWrapper tokenExpireLt(Date tokenExpire){
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
    public BaiduAccountQueryWrapper tokenExpireLe(Date tokenExpire){
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
    public BaiduAccountQueryWrapper tokenExpireBetween(Date tokenExpireStart,Date tokenExpireEnd){
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
    public BaiduAccountQueryWrapper tokenExpireNotBetween(Date tokenExpireStart,Date tokenExpireEnd){
        if(tokenExpireStart!=null && tokenExpireEnd!=null){
            notBetween("token_expire",tokenExpireStart,tokenExpireEnd);
        }
        return this;
     }


    /**
     * <p>token过期时间</p>
     * LIKE '%值%'
     * @param tokenExpire       值
     * @return children
     */
    public BaiduAccountQueryWrapper tokenExpireLike(Date tokenExpire){
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
    public BaiduAccountQueryWrapper tokenExpireNotLike(Date tokenExpire){
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
    public BaiduAccountQueryWrapper tokenExpireLikeLeft(Date tokenExpire){
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
    public BaiduAccountQueryWrapper tokenExpireLikeRight(Date tokenExpire){
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
    public BaiduAccountQueryWrapper tokenExpireIsNull(){
        isNull("token_expire");
        return this;
    }

    /**
     * <p>token过期时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryWrapper tokenExpireIsNotNull(){
        isNotNull("token_expire");
        return this;
    }

    /**
     * <p>token过期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryWrapper tokenExpireIn(Collection<Date> value){
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
    public BaiduAccountQueryWrapper tokenExpireIn(Date... values){
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
    public BaiduAccountQueryWrapper tokenExpireNotIn(Collection<Date> value){
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
    public BaiduAccountQueryWrapper tokenExpireNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("token_expire",values);
        }
        return this;
    }

    /**
     * <p>根分组</p>
     * 等于 =
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountQueryWrapper rootGroupCodeEq(String rootGroupCode){
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
    public BaiduAccountQueryWrapper rootGroupCodeNe(String rootGroupCode){
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
    public BaiduAccountQueryWrapper rootGroupCodeGt(String rootGroupCode){
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
    public BaiduAccountQueryWrapper rootGroupCodeGe(String rootGroupCode){
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
    public BaiduAccountQueryWrapper rootGroupCodeLt(String rootGroupCode){
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
    public BaiduAccountQueryWrapper rootGroupCodeLe(String rootGroupCode){
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
    public BaiduAccountQueryWrapper rootGroupCodeBetween(String rootGroupCodeStart,String rootGroupCodeEnd){
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
    public BaiduAccountQueryWrapper rootGroupCodeNotBetween(String rootGroupCodeStart,String rootGroupCodeEnd){
        if(rootGroupCodeStart!=null && rootGroupCodeEnd!=null){
            notBetween("root_group_code",rootGroupCodeStart,rootGroupCodeEnd);
        }
        return this;
     }


    /**
     * <p>根分组</p>
     * LIKE '%值%'
     * @param rootGroupCode       值
     * @return children
     */
    public BaiduAccountQueryWrapper rootGroupCodeLike(String rootGroupCode){
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
    public BaiduAccountQueryWrapper rootGroupCodeNotLike(String rootGroupCode){
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
    public BaiduAccountQueryWrapper rootGroupCodeLikeLeft(String rootGroupCode){
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
    public BaiduAccountQueryWrapper rootGroupCodeLikeRight(String rootGroupCode){
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
    public BaiduAccountQueryWrapper rootGroupCodeIsNull(){
        isNull("root_group_code");
        return this;
    }

    /**
     * <p>根分组</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryWrapper rootGroupCodeIsNotNull(){
        isNotNull("root_group_code");
        return this;
    }

    /**
     * <p>根分组</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryWrapper rootGroupCodeIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper rootGroupCodeIn(String... values){
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
    public BaiduAccountQueryWrapper rootGroupCodeNotIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper rootGroupCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("root_group_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public BaiduAccountQueryWrapper createTimeEq(Date createTime){
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
    public BaiduAccountQueryWrapper createTimeNe(Date createTime){
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
    public BaiduAccountQueryWrapper createTimeGt(Date createTime){
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
    public BaiduAccountQueryWrapper createTimeGe(Date createTime){
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
    public BaiduAccountQueryWrapper createTimeLt(Date createTime){
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
    public BaiduAccountQueryWrapper createTimeLe(Date createTime){
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
    public BaiduAccountQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduAccountQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public BaiduAccountQueryWrapper createTimeLike(Date createTime){
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
    public BaiduAccountQueryWrapper createTimeNotLike(Date createTime){
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
    public BaiduAccountQueryWrapper createTimeLikeLeft(Date createTime){
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
    public BaiduAccountQueryWrapper createTimeLikeRight(Date createTime){
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
    public BaiduAccountQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryWrapper createTimeIn(Collection<Date> value){
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
    public BaiduAccountQueryWrapper createTimeIn(Date... values){
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
    public BaiduAccountQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public BaiduAccountQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public BaiduAccountQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public BaiduAccountQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public BaiduAccountQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public BaiduAccountQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public BaiduAccountQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public BaiduAccountQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public BaiduAccountQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public BaiduAccountQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public BaiduAccountQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public BaiduAccountQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public BaiduAccountQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public BaiduAccountQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public BaiduAccountQueryWrapper lastUpdateTimeIn(Date... values){
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
    public BaiduAccountQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public BaiduAccountQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>刷新token</p>
     * 等于 =
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountQueryWrapper refreshTokenEq(String refreshToken){
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
    public BaiduAccountQueryWrapper refreshTokenNe(String refreshToken){
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
    public BaiduAccountQueryWrapper refreshTokenGt(String refreshToken){
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
    public BaiduAccountQueryWrapper refreshTokenGe(String refreshToken){
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
    public BaiduAccountQueryWrapper refreshTokenLt(String refreshToken){
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
    public BaiduAccountQueryWrapper refreshTokenLe(String refreshToken){
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
    public BaiduAccountQueryWrapper refreshTokenBetween(String refreshTokenStart,String refreshTokenEnd){
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
    public BaiduAccountQueryWrapper refreshTokenNotBetween(String refreshTokenStart,String refreshTokenEnd){
        if(refreshTokenStart!=null && refreshTokenEnd!=null){
            notBetween("refreshToken",refreshTokenStart,refreshTokenEnd);
        }
        return this;
     }


    /**
     * <p>刷新token</p>
     * LIKE '%值%'
     * @param refreshToken       值
     * @return children
     */
    public BaiduAccountQueryWrapper refreshTokenLike(String refreshToken){
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
    public BaiduAccountQueryWrapper refreshTokenNotLike(String refreshToken){
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
    public BaiduAccountQueryWrapper refreshTokenLikeLeft(String refreshToken){
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
    public BaiduAccountQueryWrapper refreshTokenLikeRight(String refreshToken){
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
    public BaiduAccountQueryWrapper refreshTokenIsNull(){
        isNull("refreshToken");
        return this;
    }

    /**
     * <p>刷新token</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryWrapper refreshTokenIsNotNull(){
        isNotNull("refreshToken");
        return this;
    }

    /**
     * <p>刷新token</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryWrapper refreshTokenIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper refreshTokenIn(String... values){
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
    public BaiduAccountQueryWrapper refreshTokenNotIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper refreshTokenNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("refreshToken",values);
        }
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * 等于 =
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountQueryWrapper refreshtokenExpireEq(String refreshtokenExpire){
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
    public BaiduAccountQueryWrapper refreshtokenExpireNe(String refreshtokenExpire){
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
    public BaiduAccountQueryWrapper refreshtokenExpireGt(String refreshtokenExpire){
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
    public BaiduAccountQueryWrapper refreshtokenExpireGe(String refreshtokenExpire){
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
    public BaiduAccountQueryWrapper refreshtokenExpireLt(String refreshtokenExpire){
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
    public BaiduAccountQueryWrapper refreshtokenExpireLe(String refreshtokenExpire){
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
    public BaiduAccountQueryWrapper refreshtokenExpireBetween(String refreshtokenExpireStart,String refreshtokenExpireEnd){
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
    public BaiduAccountQueryWrapper refreshtokenExpireNotBetween(String refreshtokenExpireStart,String refreshtokenExpireEnd){
        if(refreshtokenExpireStart!=null && refreshtokenExpireEnd!=null){
            notBetween("refreshToken_expire",refreshtokenExpireStart,refreshtokenExpireEnd);
        }
        return this;
     }


    /**
     * <p>刷新token过期时间</p>
     * LIKE '%值%'
     * @param refreshtokenExpire       值
     * @return children
     */
    public BaiduAccountQueryWrapper refreshtokenExpireLike(String refreshtokenExpire){
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
    public BaiduAccountQueryWrapper refreshtokenExpireNotLike(String refreshtokenExpire){
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
    public BaiduAccountQueryWrapper refreshtokenExpireLikeLeft(String refreshtokenExpire){
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
    public BaiduAccountQueryWrapper refreshtokenExpireLikeRight(String refreshtokenExpire){
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
    public BaiduAccountQueryWrapper refreshtokenExpireIsNull(){
        isNull("refreshToken_expire");
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryWrapper refreshtokenExpireIsNotNull(){
        isNotNull("refreshToken_expire");
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryWrapper refreshtokenExpireIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper refreshtokenExpireIn(String... values){
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
    public BaiduAccountQueryWrapper refreshtokenExpireNotIn(Collection<String> value){
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
    public BaiduAccountQueryWrapper refreshtokenExpireNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("refreshToken_expire",values);
        }
        return this;
    }


}
