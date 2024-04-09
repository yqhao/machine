package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.BaiduAccount;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 百度账号表
 * </p>
 * "baidu_account"
 * @author PC001
 */
public class BaiduAccountQueryEntityWrapper extends QueryWrapper<BaiduAccount> {

    public static BaiduAccountQueryEntityWrapper wrapper(BaiduAccount entity) {
        return new BaiduAccountQueryEntityWrapper(entity);
    }

    private BaiduAccount entity;

    public BaiduAccountQueryEntityWrapper(BaiduAccount entity) {
         this.entity=entity;
    }


    protected BaiduAccount entity() {
        if(entity==null){
            throw new NullPointerException("BaiduAccount is null");
        }
        return entity;
    }

    @Override
    public BaiduAccountQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public BaiduAccountQueryEntityWrapper selectColumns(Consumer<BaiduAccountSelect> consumer) {
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
     * 等于 = entity().getId()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper idEq(){
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
    public BaiduAccountQueryEntityWrapper idNe(){
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
    public BaiduAccountQueryEntityWrapper idGt(){
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
    public BaiduAccountQueryEntityWrapper idGe(){
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
    public BaiduAccountQueryEntityWrapper idLt(){
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
    public BaiduAccountQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public BaiduAccountQueryEntityWrapper idBetween(Long idEnd){
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
    public BaiduAccountQueryEntityWrapper idNotBetween(Long idEnd){
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
    public BaiduAccountQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public BaiduAccountQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper idLikeRight(){
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
    public BaiduAccountQueryEntityWrapper idEq(Long id){
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
    public BaiduAccountQueryEntityWrapper idNe(Long id){
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
    public BaiduAccountQueryEntityWrapper idGt(Long id){
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
    public BaiduAccountQueryEntityWrapper idGe(Long id){
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
    public BaiduAccountQueryEntityWrapper idLt(Long id){
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
    public BaiduAccountQueryEntityWrapper idLe(Long id){
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
    public BaiduAccountQueryEntityWrapper idLike(Long id){
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
    public BaiduAccountQueryEntityWrapper idNotLike(Long id){
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
    public BaiduAccountQueryEntityWrapper idLikeLeft(Long id){
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
    public BaiduAccountQueryEntityWrapper idLikeRight(Long id){
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
    public BaiduAccountQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryEntityWrapper idIn(Collection<Long> value){
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
    public BaiduAccountQueryEntityWrapper idIn(Long... values){
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
    public BaiduAccountQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public BaiduAccountQueryEntityWrapper idNotIn(Long... values){
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
    public BaiduAccountQueryEntityWrapper mobileEq(){
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
    public BaiduAccountQueryEntityWrapper mobileNe(){
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
    public BaiduAccountQueryEntityWrapper mobileGt(){
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
    public BaiduAccountQueryEntityWrapper mobileGe(){
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
    public BaiduAccountQueryEntityWrapper mobileLt(){
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
    public BaiduAccountQueryEntityWrapper mobileLe(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            le("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getMobile() AND mobileEnd
     * @param mobileEnd      值2
     * @return children
     */
    public BaiduAccountQueryEntityWrapper mobileBetween(String mobileEnd){
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
    public BaiduAccountQueryEntityWrapper mobileNotBetween(String mobileEnd){
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
    public BaiduAccountQueryEntityWrapper mobileBetween(String mobileStart,String mobileEnd){
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
    public BaiduAccountQueryEntityWrapper mobileNotBetween(String mobileStart,String mobileEnd){
        String mobile =entity().getMobile();
        if(mobile!=null && mobileEnd!=null){
            notBetween("mobile",mobileStart,mobileEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getMobile()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper mobileLike(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            like("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getMobile()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper mobileNotLike(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            notLike("mobile",mobile);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getMobile()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper mobileLikeLeft(){
        String mobile =entity().getMobile();
        if(mobile!=null){
            likeLeft("mobile",mobile);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getMobile()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper mobileLikeRight(){
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
    public BaiduAccountQueryEntityWrapper mobileEq(String mobile){
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
    public BaiduAccountQueryEntityWrapper mobileNe(String mobile){
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
    public BaiduAccountQueryEntityWrapper mobileGt(String mobile){
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
    public BaiduAccountQueryEntityWrapper mobileGe(String mobile){
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
    public BaiduAccountQueryEntityWrapper mobileLt(String mobile){
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
    public BaiduAccountQueryEntityWrapper mobileLe(String mobile){
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
    public BaiduAccountQueryEntityWrapper mobileLike(String mobile){
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
    public BaiduAccountQueryEntityWrapper mobileNotLike(String mobile){
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
    public BaiduAccountQueryEntityWrapper mobileLikeLeft(String mobile){
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
    public BaiduAccountQueryEntityWrapper mobileLikeRight(String mobile){
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
    public BaiduAccountQueryEntityWrapper mobileIsNull(){
        isNull("mobile");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryEntityWrapper mobileIsNotNull(){
        isNotNull("mobile");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryEntityWrapper mobileIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper mobileIn(String... values){
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
    public BaiduAccountQueryEntityWrapper mobileNotIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper mobileNotIn(String... values){
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
    public BaiduAccountQueryEntityWrapper accountNameEq(){
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
    public BaiduAccountQueryEntityWrapper accountNameNe(){
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
    public BaiduAccountQueryEntityWrapper accountNameGt(){
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
    public BaiduAccountQueryEntityWrapper accountNameGe(){
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
    public BaiduAccountQueryEntityWrapper accountNameLt(){
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
    public BaiduAccountQueryEntityWrapper accountNameLe(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            le("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getAccountName() AND accountNameEnd
     * @param accountNameEnd      值2
     * @return children
     */
    public BaiduAccountQueryEntityWrapper accountNameBetween(String accountNameEnd){
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
    public BaiduAccountQueryEntityWrapper accountNameNotBetween(String accountNameEnd){
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
    public BaiduAccountQueryEntityWrapper accountNameBetween(String accountNameStart,String accountNameEnd){
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
    public BaiduAccountQueryEntityWrapper accountNameNotBetween(String accountNameStart,String accountNameEnd){
        String accountName =entity().getAccountName();
        if(accountName!=null && accountNameEnd!=null){
            notBetween("account_name",accountNameStart,accountNameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getAccountName()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper accountNameLike(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            like("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getAccountName()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper accountNameNotLike(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            notLike("account_name",accountName);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getAccountName()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper accountNameLikeLeft(){
        String accountName =entity().getAccountName();
        if(accountName!=null){
            likeLeft("account_name",accountName);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getAccountName()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper accountNameLikeRight(){
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
    public BaiduAccountQueryEntityWrapper accountNameEq(String accountName){
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
    public BaiduAccountQueryEntityWrapper accountNameNe(String accountName){
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
    public BaiduAccountQueryEntityWrapper accountNameGt(String accountName){
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
    public BaiduAccountQueryEntityWrapper accountNameGe(String accountName){
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
    public BaiduAccountQueryEntityWrapper accountNameLt(String accountName){
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
    public BaiduAccountQueryEntityWrapper accountNameLe(String accountName){
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
    public BaiduAccountQueryEntityWrapper accountNameLike(String accountName){
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
    public BaiduAccountQueryEntityWrapper accountNameNotLike(String accountName){
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
    public BaiduAccountQueryEntityWrapper accountNameLikeLeft(String accountName){
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
    public BaiduAccountQueryEntityWrapper accountNameLikeRight(String accountName){
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
    public BaiduAccountQueryEntityWrapper accountNameIsNull(){
        isNull("account_name");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryEntityWrapper accountNameIsNotNull(){
        isNotNull("account_name");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryEntityWrapper accountNameIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper accountNameIn(String... values){
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
    public BaiduAccountQueryEntityWrapper accountNameNotIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper accountNameNotIn(String... values){
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
    public BaiduAccountQueryEntityWrapper hostEq(){
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
    public BaiduAccountQueryEntityWrapper hostNe(){
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
    public BaiduAccountQueryEntityWrapper hostGt(){
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
    public BaiduAccountQueryEntityWrapper hostGe(){
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
    public BaiduAccountQueryEntityWrapper hostLt(){
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
    public BaiduAccountQueryEntityWrapper hostLe(){
        String host =entity().getHost();
        if(host!=null){
            le("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getHost() AND hostEnd
     * @param hostEnd      值2
     * @return children
     */
    public BaiduAccountQueryEntityWrapper hostBetween(String hostEnd){
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
    public BaiduAccountQueryEntityWrapper hostNotBetween(String hostEnd){
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
    public BaiduAccountQueryEntityWrapper hostBetween(String hostStart,String hostEnd){
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
    public BaiduAccountQueryEntityWrapper hostNotBetween(String hostStart,String hostEnd){
        String host =entity().getHost();
        if(host!=null && hostEnd!=null){
            notBetween("host",hostStart,hostEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getHost()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper hostLike(){
        String host =entity().getHost();
        if(host!=null){
            like("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getHost()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper hostNotLike(){
        String host =entity().getHost();
        if(host!=null){
            notLike("host",host);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getHost()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper hostLikeLeft(){
        String host =entity().getHost();
        if(host!=null){
            likeLeft("host",host);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getHost()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper hostLikeRight(){
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
    public BaiduAccountQueryEntityWrapper hostEq(String host){
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
    public BaiduAccountQueryEntityWrapper hostNe(String host){
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
    public BaiduAccountQueryEntityWrapper hostGt(String host){
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
    public BaiduAccountQueryEntityWrapper hostGe(String host){
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
    public BaiduAccountQueryEntityWrapper hostLt(String host){
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
    public BaiduAccountQueryEntityWrapper hostLe(String host){
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
    public BaiduAccountQueryEntityWrapper hostLike(String host){
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
    public BaiduAccountQueryEntityWrapper hostNotLike(String host){
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
    public BaiduAccountQueryEntityWrapper hostLikeLeft(String host){
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
    public BaiduAccountQueryEntityWrapper hostLikeRight(String host){
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
    public BaiduAccountQueryEntityWrapper hostIsNull(){
        isNull("host");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryEntityWrapper hostIsNotNull(){
        isNotNull("host");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryEntityWrapper hostIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper hostIn(String... values){
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
    public BaiduAccountQueryEntityWrapper hostNotIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper hostNotIn(String... values){
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
    public BaiduAccountQueryEntityWrapper bearerTokenEq(){
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
    public BaiduAccountQueryEntityWrapper bearerTokenNe(){
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
    public BaiduAccountQueryEntityWrapper bearerTokenGt(){
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
    public BaiduAccountQueryEntityWrapper bearerTokenGe(){
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
    public BaiduAccountQueryEntityWrapper bearerTokenLt(){
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
    public BaiduAccountQueryEntityWrapper bearerTokenLe(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            le("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getBearerToken() AND bearerTokenEnd
     * @param bearerTokenEnd      值2
     * @return children
     */
    public BaiduAccountQueryEntityWrapper bearerTokenBetween(String bearerTokenEnd){
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
    public BaiduAccountQueryEntityWrapper bearerTokenNotBetween(String bearerTokenEnd){
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
    public BaiduAccountQueryEntityWrapper bearerTokenBetween(String bearerTokenStart,String bearerTokenEnd){
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
    public BaiduAccountQueryEntityWrapper bearerTokenNotBetween(String bearerTokenStart,String bearerTokenEnd){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null && bearerTokenEnd!=null){
            notBetween("bearer_token",bearerTokenStart,bearerTokenEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getBearerToken()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper bearerTokenLike(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            like("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getBearerToken()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper bearerTokenNotLike(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            notLike("bearer_token",bearerToken);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getBearerToken()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper bearerTokenLikeLeft(){
        String bearerToken =entity().getBearerToken();
        if(bearerToken!=null){
            likeLeft("bearer_token",bearerToken);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getBearerToken()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper bearerTokenLikeRight(){
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
    public BaiduAccountQueryEntityWrapper bearerTokenEq(String bearerToken){
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
    public BaiduAccountQueryEntityWrapper bearerTokenNe(String bearerToken){
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
    public BaiduAccountQueryEntityWrapper bearerTokenGt(String bearerToken){
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
    public BaiduAccountQueryEntityWrapper bearerTokenGe(String bearerToken){
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
    public BaiduAccountQueryEntityWrapper bearerTokenLt(String bearerToken){
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
    public BaiduAccountQueryEntityWrapper bearerTokenLe(String bearerToken){
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
    public BaiduAccountQueryEntityWrapper bearerTokenLike(String bearerToken){
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
    public BaiduAccountQueryEntityWrapper bearerTokenNotLike(String bearerToken){
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
    public BaiduAccountQueryEntityWrapper bearerTokenLikeLeft(String bearerToken){
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
    public BaiduAccountQueryEntityWrapper bearerTokenLikeRight(String bearerToken){
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
    public BaiduAccountQueryEntityWrapper bearerTokenIsNull(){
        isNull("bearer_token");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryEntityWrapper bearerTokenIsNotNull(){
        isNotNull("bearer_token");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryEntityWrapper bearerTokenIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper bearerTokenIn(String... values){
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
    public BaiduAccountQueryEntityWrapper bearerTokenNotIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper bearerTokenNotIn(String... values){
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
    public BaiduAccountQueryEntityWrapper tokenExpireEq(){
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
    public BaiduAccountQueryEntityWrapper tokenExpireNe(){
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
    public BaiduAccountQueryEntityWrapper tokenExpireGt(){
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
    public BaiduAccountQueryEntityWrapper tokenExpireGe(){
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
    public BaiduAccountQueryEntityWrapper tokenExpireLt(){
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
    public BaiduAccountQueryEntityWrapper tokenExpireLe(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            le("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * BETWEEN  entity().getTokenExpire() AND tokenExpireEnd
     * @param tokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountQueryEntityWrapper tokenExpireBetween(Date tokenExpireEnd){
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
    public BaiduAccountQueryEntityWrapper tokenExpireNotBetween(Date tokenExpireEnd){
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
    public BaiduAccountQueryEntityWrapper tokenExpireBetween(Date tokenExpireStart,Date tokenExpireEnd){
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
    public BaiduAccountQueryEntityWrapper tokenExpireNotBetween(Date tokenExpireStart,Date tokenExpireEnd){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null && tokenExpireEnd!=null){
            notBetween("token_expire",tokenExpireStart,tokenExpireEnd);
        }
        return this;
     }


    /**
     * <p>token过期时间</p>
     * LIKE '%值%'  entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper tokenExpireLike(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            like("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * NOT LIKE '%值%'  entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper tokenExpireNotLike(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            notLike("token_expire",tokenExpire);
        }
        return this;
     }


    /**
     * <p>token过期时间</p>
     * LIKE '%值'  entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper tokenExpireLikeLeft(){
        Date tokenExpire =entity().getTokenExpire();
        if(tokenExpire!=null){
            likeLeft("token_expire",tokenExpire);
        }
        return this;
     }

    /**
     * <p>token过期时间</p>
     * LIKE '值%'  entity().getTokenExpire()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper tokenExpireLikeRight(){
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
    public BaiduAccountQueryEntityWrapper tokenExpireEq(Date tokenExpire){
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
    public BaiduAccountQueryEntityWrapper tokenExpireNe(Date tokenExpire){
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
    public BaiduAccountQueryEntityWrapper tokenExpireGt(Date tokenExpire){
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
    public BaiduAccountQueryEntityWrapper tokenExpireGe(Date tokenExpire){
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
    public BaiduAccountQueryEntityWrapper tokenExpireLt(Date tokenExpire){
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
    public BaiduAccountQueryEntityWrapper tokenExpireLe(Date tokenExpire){
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
    public BaiduAccountQueryEntityWrapper tokenExpireLike(Date tokenExpire){
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
    public BaiduAccountQueryEntityWrapper tokenExpireNotLike(Date tokenExpire){
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
    public BaiduAccountQueryEntityWrapper tokenExpireLikeLeft(Date tokenExpire){
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
    public BaiduAccountQueryEntityWrapper tokenExpireLikeRight(Date tokenExpire){
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
    public BaiduAccountQueryEntityWrapper tokenExpireIsNull(){
        isNull("token_expire");
        return this;
    }

    /**
     * <p>token过期时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryEntityWrapper tokenExpireIsNotNull(){
        isNotNull("token_expire");
        return this;
    }

    /**
     * <p>token过期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryEntityWrapper tokenExpireIn(Collection<Date> value){
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
    public BaiduAccountQueryEntityWrapper tokenExpireIn(Date... values){
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
    public BaiduAccountQueryEntityWrapper tokenExpireNotIn(Collection<Date> value){
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
    public BaiduAccountQueryEntityWrapper tokenExpireNotIn(Date... values){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeEq(){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeNe(){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeGt(){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeGe(){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeLt(){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeLe(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            le("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * BETWEEN  entity().getRootGroupCode() AND rootGroupCodeEnd
     * @param rootGroupCodeEnd      值2
     * @return children
     */
    public BaiduAccountQueryEntityWrapper rootGroupCodeBetween(String rootGroupCodeEnd){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeNotBetween(String rootGroupCodeEnd){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeBetween(String rootGroupCodeStart,String rootGroupCodeEnd){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeNotBetween(String rootGroupCodeStart,String rootGroupCodeEnd){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null && rootGroupCodeEnd!=null){
            notBetween("root_group_code",rootGroupCodeStart,rootGroupCodeEnd);
        }
        return this;
     }


    /**
     * <p>根分组</p>
     * LIKE '%值%'  entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper rootGroupCodeLike(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            like("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * NOT LIKE '%值%'  entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper rootGroupCodeNotLike(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            notLike("root_group_code",rootGroupCode);
        }
        return this;
     }


    /**
     * <p>根分组</p>
     * LIKE '%值'  entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper rootGroupCodeLikeLeft(){
        String rootGroupCode =entity().getRootGroupCode();
        if(rootGroupCode!=null){
            likeLeft("root_group_code",rootGroupCode);
        }
        return this;
     }

    /**
     * <p>根分组</p>
     * LIKE '值%'  entity().getRootGroupCode()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper rootGroupCodeLikeRight(){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeEq(String rootGroupCode){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeNe(String rootGroupCode){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeGt(String rootGroupCode){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeGe(String rootGroupCode){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeLt(String rootGroupCode){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeLe(String rootGroupCode){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeLike(String rootGroupCode){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeNotLike(String rootGroupCode){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeLikeLeft(String rootGroupCode){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeLikeRight(String rootGroupCode){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeIsNull(){
        isNull("root_group_code");
        return this;
    }

    /**
     * <p>根分组</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryEntityWrapper rootGroupCodeIsNotNull(){
        isNotNull("root_group_code");
        return this;
    }

    /**
     * <p>根分组</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryEntityWrapper rootGroupCodeIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeIn(String... values){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeNotIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper rootGroupCodeNotIn(String... values){
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
    public BaiduAccountQueryEntityWrapper createTimeEq(){
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
    public BaiduAccountQueryEntityWrapper createTimeNe(){
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
    public BaiduAccountQueryEntityWrapper createTimeGt(){
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
    public BaiduAccountQueryEntityWrapper createTimeGe(){
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
    public BaiduAccountQueryEntityWrapper createTimeLt(){
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
    public BaiduAccountQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public BaiduAccountQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public BaiduAccountQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public BaiduAccountQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduAccountQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper createTimeLikeRight(){
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
    public BaiduAccountQueryEntityWrapper createTimeEq(Date createTime){
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
    public BaiduAccountQueryEntityWrapper createTimeNe(Date createTime){
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
    public BaiduAccountQueryEntityWrapper createTimeGt(Date createTime){
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
    public BaiduAccountQueryEntityWrapper createTimeGe(Date createTime){
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
    public BaiduAccountQueryEntityWrapper createTimeLt(Date createTime){
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
    public BaiduAccountQueryEntityWrapper createTimeLe(Date createTime){
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
    public BaiduAccountQueryEntityWrapper createTimeLike(Date createTime){
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
    public BaiduAccountQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public BaiduAccountQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public BaiduAccountQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public BaiduAccountQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public BaiduAccountQueryEntityWrapper createTimeIn(Date... values){
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
    public BaiduAccountQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public BaiduAccountQueryEntityWrapper createTimeNotIn(Date... values){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeEq(){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeNe(){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeGt(){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeGe(){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeLt(){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public BaiduAccountQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper lastUpdateTimeLikeRight(){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public BaiduAccountQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
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
    public BaiduAccountQueryEntityWrapper refreshTokenEq(){
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
    public BaiduAccountQueryEntityWrapper refreshTokenNe(){
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
    public BaiduAccountQueryEntityWrapper refreshTokenGt(){
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
    public BaiduAccountQueryEntityWrapper refreshTokenGe(){
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
    public BaiduAccountQueryEntityWrapper refreshTokenLt(){
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
    public BaiduAccountQueryEntityWrapper refreshTokenLe(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            le("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * BETWEEN  entity().getRefreshToken() AND refreshTokenEnd
     * @param refreshTokenEnd      值2
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshTokenBetween(String refreshTokenEnd){
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
    public BaiduAccountQueryEntityWrapper refreshTokenNotBetween(String refreshTokenEnd){
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
    public BaiduAccountQueryEntityWrapper refreshTokenBetween(String refreshTokenStart,String refreshTokenEnd){
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
    public BaiduAccountQueryEntityWrapper refreshTokenNotBetween(String refreshTokenStart,String refreshTokenEnd){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null && refreshTokenEnd!=null){
            notBetween("refreshToken",refreshTokenStart,refreshTokenEnd);
        }
        return this;
     }


    /**
     * <p>刷新token</p>
     * LIKE '%值%'  entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshTokenLike(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            like("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * NOT LIKE '%值%'  entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshTokenNotLike(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            notLike("refreshToken",refreshToken);
        }
        return this;
     }


    /**
     * <p>刷新token</p>
     * LIKE '%值'  entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshTokenLikeLeft(){
        String refreshToken =entity().getRefreshToken();
        if(refreshToken!=null){
            likeLeft("refreshToken",refreshToken);
        }
        return this;
     }

    /**
     * <p>刷新token</p>
     * LIKE '值%'  entity().getRefreshToken()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshTokenLikeRight(){
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
    public BaiduAccountQueryEntityWrapper refreshTokenEq(String refreshToken){
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
    public BaiduAccountQueryEntityWrapper refreshTokenNe(String refreshToken){
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
    public BaiduAccountQueryEntityWrapper refreshTokenGt(String refreshToken){
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
    public BaiduAccountQueryEntityWrapper refreshTokenGe(String refreshToken){
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
    public BaiduAccountQueryEntityWrapper refreshTokenLt(String refreshToken){
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
    public BaiduAccountQueryEntityWrapper refreshTokenLe(String refreshToken){
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
    public BaiduAccountQueryEntityWrapper refreshTokenLike(String refreshToken){
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
    public BaiduAccountQueryEntityWrapper refreshTokenNotLike(String refreshToken){
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
    public BaiduAccountQueryEntityWrapper refreshTokenLikeLeft(String refreshToken){
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
    public BaiduAccountQueryEntityWrapper refreshTokenLikeRight(String refreshToken){
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
    public BaiduAccountQueryEntityWrapper refreshTokenIsNull(){
        isNull("refreshToken");
        return this;
    }

    /**
     * <p>刷新token</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshTokenIsNotNull(){
        isNotNull("refreshToken");
        return this;
    }

    /**
     * <p>刷新token</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshTokenIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper refreshTokenIn(String... values){
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
    public BaiduAccountQueryEntityWrapper refreshTokenNotIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper refreshTokenNotIn(String... values){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireEq(){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireNe(){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireGt(){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireGe(){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireLt(){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireLe(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            le("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * BETWEEN  entity().getRefreshtokenExpire() AND refreshtokenExpireEnd
     * @param refreshtokenExpireEnd      值2
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshtokenExpireBetween(String refreshtokenExpireEnd){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireNotBetween(String refreshtokenExpireEnd){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireBetween(String refreshtokenExpireStart,String refreshtokenExpireEnd){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireNotBetween(String refreshtokenExpireStart,String refreshtokenExpireEnd){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null && refreshtokenExpireEnd!=null){
            notBetween("refreshToken_expire",refreshtokenExpireStart,refreshtokenExpireEnd);
        }
        return this;
     }


    /**
     * <p>刷新token过期时间</p>
     * LIKE '%值%'  entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshtokenExpireLike(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            like("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * NOT LIKE '%值%'  entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshtokenExpireNotLike(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            notLike("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }


    /**
     * <p>刷新token过期时间</p>
     * LIKE '%值'  entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshtokenExpireLikeLeft(){
        String refreshtokenExpire =entity().getRefreshtokenExpire();
        if(refreshtokenExpire!=null){
            likeLeft("refreshToken_expire",refreshtokenExpire);
        }
        return this;
     }

    /**
     * <p>刷新token过期时间</p>
     * LIKE '值%'  entity().getRefreshtokenExpire()
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshtokenExpireLikeRight(){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireEq(String refreshtokenExpire){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireNe(String refreshtokenExpire){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireGt(String refreshtokenExpire){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireGe(String refreshtokenExpire){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireLt(String refreshtokenExpire){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireLe(String refreshtokenExpire){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireLike(String refreshtokenExpire){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireNotLike(String refreshtokenExpire){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireLikeLeft(String refreshtokenExpire){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireLikeRight(String refreshtokenExpire){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireIsNull(){
        isNull("refreshToken_expire");
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshtokenExpireIsNotNull(){
        isNotNull("refreshToken_expire");
        return this;
    }

    /**
     * <p>刷新token过期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduAccountQueryEntityWrapper refreshtokenExpireIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireIn(String... values){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireNotIn(Collection<String> value){
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
    public BaiduAccountQueryEntityWrapper refreshtokenExpireNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("refreshToken_expire",values);
        }
        return this;
    }



}
