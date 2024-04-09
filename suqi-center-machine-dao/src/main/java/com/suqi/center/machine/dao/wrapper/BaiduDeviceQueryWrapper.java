package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.BaiduDevice;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 百度云机
 * </p>
 * "baidu_device"
 * @author PC001
 */
public class BaiduDeviceQueryWrapper extends QueryWrapper<BaiduDevice> {


    public static BaiduDeviceQueryWrapper wrapper() {
        return new BaiduDeviceQueryWrapper();
    }

    public BaiduDeviceQueryWrapper() {
        super();
    }

    public BaiduDeviceQueryWrapper(BaiduDevice entity) {
        super(entity);
    }

    public BaiduDeviceQueryWrapper(BaiduDevice entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public BaiduDeviceQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public BaiduDeviceQueryWrapper selectColumns(Consumer<BaiduDeviceSelect> consumer) {
        BaiduDeviceSelect select = new BaiduDeviceSelect();
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
    public BaiduDeviceQueryWrapper idEq(Long id){
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
    public BaiduDeviceQueryWrapper idNe(Long id){
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
    public BaiduDeviceQueryWrapper idGt(Long id){
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
    public BaiduDeviceQueryWrapper idGe(Long id){
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
    public BaiduDeviceQueryWrapper idLt(Long id){
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
    public BaiduDeviceQueryWrapper idLe(Long id){
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
    public BaiduDeviceQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public BaiduDeviceQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public BaiduDeviceQueryWrapper idLike(Long id){
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
    public BaiduDeviceQueryWrapper idNotLike(Long id){
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
    public BaiduDeviceQueryWrapper idLikeLeft(Long id){
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
    public BaiduDeviceQueryWrapper idLikeRight(Long id){
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
    public BaiduDeviceQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper idIn(Collection<Long> value){
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
    public BaiduDeviceQueryWrapper idIn(Long... values){
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
    public BaiduDeviceQueryWrapper idNotIn(Collection<Long> value){
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
    public BaiduDeviceQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * 等于 =
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdEq(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            eq("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * 不等于 &lt;&gt;
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdNe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            ne("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * 大于 &gt;
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdGt(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            gt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * 大于等于 &gt;=
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdGe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            ge("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * 小于 &lt;
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdLt(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            lt("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * 小于等于 &lt;=
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdLe(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            le("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * BETWEEN 值1 AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        if(fkBaiduAccountIdStart!=null && fkBaiduAccountIdEnd!=null){
            between("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkBaiduAccountIdStart       值1
     * @param fkBaiduAccountIdEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdNotBetween(Long fkBaiduAccountIdStart,Long fkBaiduAccountIdEnd){
        if(fkBaiduAccountIdStart!=null && fkBaiduAccountIdEnd!=null){
            notBetween("fk_baidu_account_id",fkBaiduAccountIdStart,fkBaiduAccountIdEnd);
        }
        return this;
     }


    /**
     * <p>百度云机所属账号</p>
     * LIKE '%值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdLike(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            like("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * NOT LIKE '%值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdNotLike(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            notLike("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }


    /**
     * <p>百度云机所属账号</p>
     * LIKE '%值'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdLikeLeft(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            likeLeft("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * LIKE '值%'
     * @param fkBaiduAccountId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdLikeRight(Long fkBaiduAccountId){
        if(fkBaiduAccountId!=null){
            likeRight("fk_baidu_account_id",fkBaiduAccountId);
        }
        return this;
     }

    /**
     * <p>百度云机所属账号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdIsNull(){
        isNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdIsNotNull(){
        isNotNull("fk_baidu_account_id");
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_baidu_account_id",value);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_baidu_account_id",values);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_baidu_account_id",value);
        }
        return this;
    }

    /**
     * <p>百度云机所属账号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper fkBaiduAccountIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_baidu_account_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param uid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uidEq(String uid){
        if(uid!=null){
            eq("uid",uid);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param uid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uidNe(String uid){
        if(uid!=null){
            ne("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param uid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uidGt(String uid){
        if(uid!=null){
            gt("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param uid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uidGe(String uid){
        if(uid!=null){
            ge("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param uid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uidLt(String uid){
        if(uid!=null){
            lt("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param uid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uidLe(String uid){
        if(uid!=null){
            le("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param uidStart       值1
     * @param uidEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper uidBetween(String uidStart,String uidEnd){
        if(uidStart!=null && uidEnd!=null){
            between("uid",uidStart,uidEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param uidStart       值1
     * @param uidEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper uidNotBetween(String uidStart,String uidEnd){
        if(uidStart!=null && uidEnd!=null){
            notBetween("uid",uidStart,uidEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param uid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uidLike(String uid){
        if(uid!=null){
            like("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param uid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uidNotLike(String uid){
        if(uid!=null){
            notLike("uid",uid);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param uid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uidLikeLeft(String uid){
        if(uid!=null){
            likeLeft("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param uid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uidLikeRight(String uid){
        if(uid!=null){
            likeRight("uid",uid);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper uidIsNull(){
        isNull("uid");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper uidIsNotNull(){
        isNotNull("uid");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper uidIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("uid",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper uidIn(String... values){
        if(values!=null && values.length>0){
            in("uid",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper uidNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("uid",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper uidNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("uid",values);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * 等于 =
     * @param code       值
     * @return children
     */
    public BaiduDeviceQueryWrapper codeEq(String code){
        if(code!=null){
            eq("code",code);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * 不等于 &lt;&gt;
     * @param code       值
     * @return children
     */
    public BaiduDeviceQueryWrapper codeNe(String code){
        if(code!=null){
            ne("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * 大于 &gt;
     * @param code       值
     * @return children
     */
    public BaiduDeviceQueryWrapper codeGt(String code){
        if(code!=null){
            gt("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * 大于等于 &gt;=
     * @param code       值
     * @return children
     */
    public BaiduDeviceQueryWrapper codeGe(String code){
        if(code!=null){
            ge("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * 小于 &lt;
     * @param code       值
     * @return children
     */
    public BaiduDeviceQueryWrapper codeLt(String code){
        if(code!=null){
            lt("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * 小于等于 &lt;=
     * @param code       值
     * @return children
     */
    public BaiduDeviceQueryWrapper codeLe(String code){
        if(code!=null){
            le("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * BETWEEN 值1 AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper codeBetween(String codeStart,String codeEnd){
        if(codeStart!=null && codeEnd!=null){
            between("code",codeStart,codeEnd);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param codeStart       值1
     * @param codeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper codeNotBetween(String codeStart,String codeEnd){
        if(codeStart!=null && codeEnd!=null){
            notBetween("code",codeStart,codeEnd);
        }
        return this;
     }


    /**
     * <p>云机编号</p>
     * LIKE '%值%'
     * @param code       值
     * @return children
     */
    public BaiduDeviceQueryWrapper codeLike(String code){
        if(code!=null){
            like("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * NOT LIKE '%值%'
     * @param code       值
     * @return children
     */
    public BaiduDeviceQueryWrapper codeNotLike(String code){
        if(code!=null){
            notLike("code",code);
        }
        return this;
     }


    /**
     * <p>云机编号</p>
     * LIKE '%值'
     * @param code       值
     * @return children
     */
    public BaiduDeviceQueryWrapper codeLikeLeft(String code){
        if(code!=null){
            likeLeft("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * LIKE '值%'
     * @param code       值
     * @return children
     */
    public BaiduDeviceQueryWrapper codeLikeRight(String code){
        if(code!=null){
            likeRight("code",code);
        }
        return this;
     }

    /**
     * <p>云机编号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper codeIsNull(){
        isNull("code");
        return this;
    }

    /**
     * <p>云机编号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper codeIsNotNull(){
        isNotNull("code");
        return this;
    }

    /**
     * <p>云机编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper codeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("code",value);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper codeIn(String... values){
        if(values!=null && values.length>0){
            in("code",values);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper codeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("code",value);
        }
        return this;
    }

    /**
     * <p>云机编号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper codeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("code",values);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * 等于 =
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeEq(String groupCode){
        if(groupCode!=null){
            eq("group_code",groupCode);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * 不等于 &lt;&gt;
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeNe(String groupCode){
        if(groupCode!=null){
            ne("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * 大于 &gt;
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeGt(String groupCode){
        if(groupCode!=null){
            gt("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * 大于等于 &gt;=
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeGe(String groupCode){
        if(groupCode!=null){
            ge("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * 小于 &lt;
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeLt(String groupCode){
        if(groupCode!=null){
            lt("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * 小于等于 &lt;=
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeLe(String groupCode){
        if(groupCode!=null){
            le("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * BETWEEN 值1 AND 值2
     * @param groupCodeStart       值1
     * @param groupCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeBetween(String groupCodeStart,String groupCodeEnd){
        if(groupCodeStart!=null && groupCodeEnd!=null){
            between("group_code",groupCodeStart,groupCodeEnd);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * NOT BETWEEN 值1 AND 值2
     * @param groupCodeStart       值1
     * @param groupCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeNotBetween(String groupCodeStart,String groupCodeEnd){
        if(groupCodeStart!=null && groupCodeEnd!=null){
            notBetween("group_code",groupCodeStart,groupCodeEnd);
        }
        return this;
     }


    /**
     * <p>云机所属分组</p>
     * LIKE '%值%'
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeLike(String groupCode){
        if(groupCode!=null){
            like("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * NOT LIKE '%值%'
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeNotLike(String groupCode){
        if(groupCode!=null){
            notLike("group_code",groupCode);
        }
        return this;
     }


    /**
     * <p>云机所属分组</p>
     * LIKE '%值'
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeLikeLeft(String groupCode){
        if(groupCode!=null){
            likeLeft("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * LIKE '值%'
     * @param groupCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeLikeRight(String groupCode){
        if(groupCode!=null){
            likeRight("group_code",groupCode);
        }
        return this;
     }

    /**
     * <p>云机所属分组</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeIsNull(){
        isNull("group_code");
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeIsNotNull(){
        isNotNull("group_code");
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("group_code",value);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeIn(String... values){
        if(values!=null && values.length>0){
            in("group_code",values);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("group_code",value);
        }
        return this;
    }

    /**
     * <p>云机所属分组</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper groupCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("group_code",values);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * 等于 =
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeEq(String idcCode){
        if(idcCode!=null){
            eq("idc_code",idcCode);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * 不等于 &lt;&gt;
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeNe(String idcCode){
        if(idcCode!=null){
            ne("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * 大于 &gt;
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeGt(String idcCode){
        if(idcCode!=null){
            gt("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * 大于等于 &gt;=
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeGe(String idcCode){
        if(idcCode!=null){
            ge("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * 小于 &lt;
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeLt(String idcCode){
        if(idcCode!=null){
            lt("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * 小于等于 &lt;=
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeLe(String idcCode){
        if(idcCode!=null){
            le("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * BETWEEN 值1 AND 值2
     * @param idcCodeStart       值1
     * @param idcCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeBetween(String idcCodeStart,String idcCodeEnd){
        if(idcCodeStart!=null && idcCodeEnd!=null){
            between("idc_code",idcCodeStart,idcCodeEnd);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idcCodeStart       值1
     * @param idcCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeNotBetween(String idcCodeStart,String idcCodeEnd){
        if(idcCodeStart!=null && idcCodeEnd!=null){
            notBetween("idc_code",idcCodeStart,idcCodeEnd);
        }
        return this;
     }


    /**
     * <p>机房号</p>
     * LIKE '%值%'
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeLike(String idcCode){
        if(idcCode!=null){
            like("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * NOT LIKE '%值%'
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeNotLike(String idcCode){
        if(idcCode!=null){
            notLike("idc_code",idcCode);
        }
        return this;
     }


    /**
     * <p>机房号</p>
     * LIKE '%值'
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeLikeLeft(String idcCode){
        if(idcCode!=null){
            likeLeft("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * LIKE '值%'
     * @param idcCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeLikeRight(String idcCode){
        if(idcCode!=null){
            likeRight("idc_code",idcCode);
        }
        return this;
     }

    /**
     * <p>机房号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeIsNull(){
        isNull("idc_code");
        return this;
    }

    /**
     * <p>机房号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeIsNotNull(){
        isNotNull("idc_code");
        return this;
    }

    /**
     * <p>机房号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("idc_code",value);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeIn(String... values){
        if(values!=null && values.length>0){
            in("idc_code",values);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("idc_code",value);
        }
        return this;
    }

    /**
     * <p>机房号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper idcCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("idc_code",values);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * 等于 =
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdEq(String imageVersionId){
        if(imageVersionId!=null){
            eq("image_version_id",imageVersionId);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * 不等于 &lt;&gt;
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdNe(String imageVersionId){
        if(imageVersionId!=null){
            ne("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * 大于 &gt;
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdGt(String imageVersionId){
        if(imageVersionId!=null){
            gt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * 大于等于 &gt;=
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdGe(String imageVersionId){
        if(imageVersionId!=null){
            ge("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * 小于 &lt;
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdLt(String imageVersionId){
        if(imageVersionId!=null){
            lt("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * 小于等于 &lt;=
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdLe(String imageVersionId){
        if(imageVersionId!=null){
            le("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * BETWEEN 值1 AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdBetween(String imageVersionIdStart,String imageVersionIdEnd){
        if(imageVersionIdStart!=null && imageVersionIdEnd!=null){
            between("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param imageVersionIdStart       值1
     * @param imageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdNotBetween(String imageVersionIdStart,String imageVersionIdEnd){
        if(imageVersionIdStart!=null && imageVersionIdEnd!=null){
            notBetween("image_version_id",imageVersionIdStart,imageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>当前镜像版本号</p>
     * LIKE '%值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdLike(String imageVersionId){
        if(imageVersionId!=null){
            like("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * NOT LIKE '%值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdNotLike(String imageVersionId){
        if(imageVersionId!=null){
            notLike("image_version_id",imageVersionId);
        }
        return this;
     }


    /**
     * <p>当前镜像版本号</p>
     * LIKE '%值'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdLikeLeft(String imageVersionId){
        if(imageVersionId!=null){
            likeLeft("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * LIKE '值%'
     * @param imageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdLikeRight(String imageVersionId){
        if(imageVersionId!=null){
            likeRight("image_version_id",imageVersionId);
        }
        return this;
     }

    /**
     * <p>当前镜像版本号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdIsNull(){
        isNull("image_version_id");
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdIsNotNull(){
        isNotNull("image_version_id");
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("image_version_id",value);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdIn(String... values){
        if(values!=null && values.length>0){
            in("image_version_id",values);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("image_version_id",value);
        }
        return this;
    }

    /**
     * <p>当前镜像版本号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper imageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("image_version_id",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 等于 =
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeEq(Date lastResetTime){
        if(lastResetTime!=null){
            eq("last_reset_time",lastResetTime);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * 不等于 &lt;&gt;
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeNe(Date lastResetTime){
        if(lastResetTime!=null){
            ne("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于 &gt;
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeGt(Date lastResetTime){
        if(lastResetTime!=null){
            gt("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 大于等于 &gt;=
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeGe(Date lastResetTime){
        if(lastResetTime!=null){
            ge("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于 &lt;
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeLt(Date lastResetTime){
        if(lastResetTime!=null){
            lt("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * 小于等于 &lt;=
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeLe(Date lastResetTime){
        if(lastResetTime!=null){
            le("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastResetTimeStart       值1
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        if(lastResetTimeStart!=null && lastResetTimeEnd!=null){
            between("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastResetTimeStart       值1
     * @param lastResetTimeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeNotBetween(Date lastResetTimeStart,Date lastResetTimeEnd){
        if(lastResetTimeStart!=null && lastResetTimeEnd!=null){
            notBetween("last_reset_time",lastResetTimeStart,lastResetTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值%'
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeLike(Date lastResetTime){
        if(lastResetTime!=null){
            like("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * NOT LIKE '%值%'
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeNotLike(Date lastResetTime){
        if(lastResetTime!=null){
            notLike("last_reset_time",lastResetTime);
        }
        return this;
     }


    /**
     * <p>最后一次重置时间</p>
     * LIKE '%值'
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeLikeLeft(Date lastResetTime){
        if(lastResetTime!=null){
            likeLeft("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * LIKE '值%'
     * @param lastResetTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeLikeRight(Date lastResetTime){
        if(lastResetTime!=null){
            likeRight("last_reset_time",lastResetTime);
        }
        return this;
     }

    /**
     * <p>最后一次重置时间</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeIsNull(){
        isNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeIsNotNull(){
        isNotNull("last_reset_time");
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_reset_time",value);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_reset_time",values);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_reset_time",value);
        }
        return this;
    }

    /**
     * <p>最后一次重置时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastResetTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_reset_time",values);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 等于 =
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusEq(Integer resetStatus){
        if(resetStatus!=null){
            eq("reset_status",resetStatus);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 不等于 &lt;&gt;
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusNe(Integer resetStatus){
        if(resetStatus!=null){
            ne("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 大于 &gt;
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusGt(Integer resetStatus){
        if(resetStatus!=null){
            gt("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 大于等于 &gt;=
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusGe(Integer resetStatus){
        if(resetStatus!=null){
            ge("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 小于 &lt;
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusLt(Integer resetStatus){
        if(resetStatus!=null){
            lt("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * 小于等于 &lt;=
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusLe(Integer resetStatus){
        if(resetStatus!=null){
            le("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * BETWEEN 值1 AND 值2
     * @param resetStatusStart       值1
     * @param resetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusBetween(Integer resetStatusStart,Integer resetStatusEnd){
        if(resetStatusStart!=null && resetStatusEnd!=null){
            between("reset_status",resetStatusStart,resetStatusEnd);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetStatusStart       值1
     * @param resetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusNotBetween(Integer resetStatusStart,Integer resetStatusEnd){
        if(resetStatusStart!=null && resetStatusEnd!=null){
            notBetween("reset_status",resetStatusStart,resetStatusEnd);
        }
        return this;
     }


    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * LIKE '%值%'
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusLike(Integer resetStatus){
        if(resetStatus!=null){
            like("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * NOT LIKE '%值%'
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusNotLike(Integer resetStatus){
        if(resetStatus!=null){
            notLike("reset_status",resetStatus);
        }
        return this;
     }


    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * LIKE '%值'
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusLikeLeft(Integer resetStatus){
        if(resetStatus!=null){
            likeLeft("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * LIKE '值%'
     * @param resetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusLikeRight(Integer resetStatus){
        if(resetStatus!=null){
            likeRight("reset_status",resetStatus);
        }
        return this;
     }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusIsNull(){
        isNull("reset_status");
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusIsNotNull(){
        isNotNull("reset_status");
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("reset_status",value);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("reset_status",values);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_status",value);
        }
        return this;
    }

    /**
     * <p>重置状态（0：未重设置，1：重置中，2：重置失败，3：重置完成待镜像升级，4：镜像升级中，5：镜像升级失败，6：镜像升级成功,</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("reset_status",values);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 等于 =
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdEq(String resetImageVersionId){
        if(resetImageVersionId!=null){
            eq("reset_image_version_id",resetImageVersionId);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 不等于 &lt;&gt;
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdNe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            ne("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 大于 &gt;
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdGt(String resetImageVersionId){
        if(resetImageVersionId!=null){
            gt("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 大于等于 &gt;=
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdGe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            ge("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 小于 &lt;
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdLt(String resetImageVersionId){
        if(resetImageVersionId!=null){
            lt("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * 小于等于 &lt;=
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdLe(String resetImageVersionId){
        if(resetImageVersionId!=null){
            le("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * BETWEEN 值1 AND 值2
     * @param resetImageVersionIdStart       值1
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdBetween(String resetImageVersionIdStart,String resetImageVersionIdEnd){
        if(resetImageVersionIdStart!=null && resetImageVersionIdEnd!=null){
            between("reset_image_version_id",resetImageVersionIdStart,resetImageVersionIdEnd);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetImageVersionIdStart       值1
     * @param resetImageVersionIdEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdNotBetween(String resetImageVersionIdStart,String resetImageVersionIdEnd){
        if(resetImageVersionIdStart!=null && resetImageVersionIdEnd!=null){
            notBetween("reset_image_version_id",resetImageVersionIdStart,resetImageVersionIdEnd);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * LIKE '%值%'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdLike(String resetImageVersionId){
        if(resetImageVersionId!=null){
            like("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * NOT LIKE '%值%'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdNotLike(String resetImageVersionId){
        if(resetImageVersionId!=null){
            notLike("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }


    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * LIKE '%值'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdLikeLeft(String resetImageVersionId){
        if(resetImageVersionId!=null){
            likeLeft("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * LIKE '值%'
     * @param resetImageVersionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdLikeRight(String resetImageVersionId){
        if(resetImageVersionId!=null){
            likeRight("reset_image_version_id",resetImageVersionId);
        }
        return this;
     }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdIsNull(){
        isNull("reset_image_version_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdIsNotNull(){
        isNotNull("reset_image_version_id");
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("reset_image_version_id",value);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdIn(String... values){
        if(values!=null && values.length>0){
            in("reset_image_version_id",values);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_image_version_id",value);
        }
        return this;
    }

    /**
     * <p>重置使用的镜像id不配置时使用image_version_id当前云机使用的镜像id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetImageVersionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_image_version_id",values);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * 等于 =
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeEq(String orderCode){
        if(orderCode!=null){
            eq("order_code",orderCode);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * 不等于 &lt;&gt;
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeNe(String orderCode){
        if(orderCode!=null){
            ne("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * 大于 &gt;
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeGt(String orderCode){
        if(orderCode!=null){
            gt("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * 大于等于 &gt;=
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeGe(String orderCode){
        if(orderCode!=null){
            ge("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * 小于 &lt;
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeLt(String orderCode){
        if(orderCode!=null){
            lt("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * 小于等于 &lt;=
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeLe(String orderCode){
        if(orderCode!=null){
            le("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * BETWEEN 值1 AND 值2
     * @param orderCodeStart       值1
     * @param orderCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeBetween(String orderCodeStart,String orderCodeEnd){
        if(orderCodeStart!=null && orderCodeEnd!=null){
            between("order_code",orderCodeStart,orderCodeEnd);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param orderCodeStart       值1
     * @param orderCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeNotBetween(String orderCodeStart,String orderCodeEnd){
        if(orderCodeStart!=null && orderCodeEnd!=null){
            notBetween("order_code",orderCodeStart,orderCodeEnd);
        }
        return this;
     }


    /**
     * <p>交付的订单编号</p>
     * LIKE '%值%'
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeLike(String orderCode){
        if(orderCode!=null){
            like("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * NOT LIKE '%值%'
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeNotLike(String orderCode){
        if(orderCode!=null){
            notLike("order_code",orderCode);
        }
        return this;
     }


    /**
     * <p>交付的订单编号</p>
     * LIKE '%值'
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeLikeLeft(String orderCode){
        if(orderCode!=null){
            likeLeft("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * LIKE '值%'
     * @param orderCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeLikeRight(String orderCode){
        if(orderCode!=null){
            likeRight("order_code",orderCode);
        }
        return this;
     }

    /**
     * <p>交付的订单编号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeIsNull(){
        isNull("order_code");
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeIsNotNull(){
        isNotNull("order_code");
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("order_code",value);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeIn(String... values){
        if(values!=null && values.length>0){
            in("order_code",values);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("order_code",value);
        }
        return this;
    }

    /**
     * <p>交付的订单编号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper orderCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("order_code",values);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * 等于 =
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayEq(String deliverDay){
        if(deliverDay!=null){
            eq("deliver_day",deliverDay);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * 不等于 &lt;&gt;
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayNe(String deliverDay){
        if(deliverDay!=null){
            ne("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * 大于 &gt;
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayGt(String deliverDay){
        if(deliverDay!=null){
            gt("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * 大于等于 &gt;=
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayGe(String deliverDay){
        if(deliverDay!=null){
            ge("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * 小于 &lt;
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayLt(String deliverDay){
        if(deliverDay!=null){
            lt("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * 小于等于 &lt;=
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayLe(String deliverDay){
        if(deliverDay!=null){
            le("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * BETWEEN 值1 AND 值2
     * @param deliverDayStart       值1
     * @param deliverDayEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayBetween(String deliverDayStart,String deliverDayEnd){
        if(deliverDayStart!=null && deliverDayEnd!=null){
            between("deliver_day",deliverDayStart,deliverDayEnd);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deliverDayStart       值1
     * @param deliverDayEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayNotBetween(String deliverDayStart,String deliverDayEnd){
        if(deliverDayStart!=null && deliverDayEnd!=null){
            notBetween("deliver_day",deliverDayStart,deliverDayEnd);
        }
        return this;
     }


    /**
     * <p>交付日期的备注</p>
     * LIKE '%值%'
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayLike(String deliverDay){
        if(deliverDay!=null){
            like("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * NOT LIKE '%值%'
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayNotLike(String deliverDay){
        if(deliverDay!=null){
            notLike("deliver_day",deliverDay);
        }
        return this;
     }


    /**
     * <p>交付日期的备注</p>
     * LIKE '%值'
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayLikeLeft(String deliverDay){
        if(deliverDay!=null){
            likeLeft("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * LIKE '值%'
     * @param deliverDay       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayLikeRight(String deliverDay){
        if(deliverDay!=null){
            likeRight("deliver_day",deliverDay);
        }
        return this;
     }

    /**
     * <p>交付日期的备注</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayIsNull(){
        isNull("deliver_day");
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayIsNotNull(){
        isNotNull("deliver_day");
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("deliver_day",value);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayIn(String... values){
        if(values!=null && values.length>0){
            in("deliver_day",values);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("deliver_day",value);
        }
        return this;
    }

    /**
     * <p>交付日期的备注</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deliverDayNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("deliver_day",values);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * 等于 =
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeEq(String oldCode){
        if(oldCode!=null){
            eq("old_code",oldCode);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * 不等于 &lt;&gt;
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeNe(String oldCode){
        if(oldCode!=null){
            ne("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * 大于 &gt;
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeGt(String oldCode){
        if(oldCode!=null){
            gt("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * 大于等于 &gt;=
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeGe(String oldCode){
        if(oldCode!=null){
            ge("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * 小于 &lt;
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeLt(String oldCode){
        if(oldCode!=null){
            lt("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * 小于等于 &lt;=
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeLe(String oldCode){
        if(oldCode!=null){
            le("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * BETWEEN 值1 AND 值2
     * @param oldCodeStart       值1
     * @param oldCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeBetween(String oldCodeStart,String oldCodeEnd){
        if(oldCodeStart!=null && oldCodeEnd!=null){
            between("old_code",oldCodeStart,oldCodeEnd);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param oldCodeStart       值1
     * @param oldCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeNotBetween(String oldCodeStart,String oldCodeEnd){
        if(oldCodeStart!=null && oldCodeEnd!=null){
            notBetween("old_code",oldCodeStart,oldCodeEnd);
        }
        return this;
     }


    /**
     * <p>在营销云1.0中的编号</p>
     * LIKE '%值%'
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeLike(String oldCode){
        if(oldCode!=null){
            like("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * NOT LIKE '%值%'
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeNotLike(String oldCode){
        if(oldCode!=null){
            notLike("old_code",oldCode);
        }
        return this;
     }


    /**
     * <p>在营销云1.0中的编号</p>
     * LIKE '%值'
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeLikeLeft(String oldCode){
        if(oldCode!=null){
            likeLeft("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * LIKE '值%'
     * @param oldCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeLikeRight(String oldCode){
        if(oldCode!=null){
            likeRight("old_code",oldCode);
        }
        return this;
     }

    /**
     * <p>在营销云1.0中的编号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeIsNull(){
        isNull("old_code");
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeIsNotNull(){
        isNotNull("old_code");
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("old_code",value);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeIn(String... values){
        if(values!=null && values.length>0){
            in("old_code",values);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("old_code",value);
        }
        return this;
    }

    /**
     * <p>在营销云1.0中的编号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper oldCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("old_code",values);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * 等于 =
     * @param sn       值
     * @return children
     */
    public BaiduDeviceQueryWrapper snEq(String sn){
        if(sn!=null){
            eq("sn",sn);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * 不等于 &lt;&gt;
     * @param sn       值
     * @return children
     */
    public BaiduDeviceQueryWrapper snNe(String sn){
        if(sn!=null){
            ne("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * 大于 &gt;
     * @param sn       值
     * @return children
     */
    public BaiduDeviceQueryWrapper snGt(String sn){
        if(sn!=null){
            gt("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * 大于等于 &gt;=
     * @param sn       值
     * @return children
     */
    public BaiduDeviceQueryWrapper snGe(String sn){
        if(sn!=null){
            ge("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * 小于 &lt;
     * @param sn       值
     * @return children
     */
    public BaiduDeviceQueryWrapper snLt(String sn){
        if(sn!=null){
            lt("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * 小于等于 &lt;=
     * @param sn       值
     * @return children
     */
    public BaiduDeviceQueryWrapper snLe(String sn){
        if(sn!=null){
            le("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * BETWEEN 值1 AND 值2
     * @param snStart       值1
     * @param snEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper snBetween(String snStart,String snEnd){
        if(snStart!=null && snEnd!=null){
            between("sn",snStart,snEnd);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * NOT BETWEEN 值1 AND 值2
     * @param snStart       值1
     * @param snEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper snNotBetween(String snStart,String snEnd){
        if(snStart!=null && snEnd!=null){
            notBetween("sn",snStart,snEnd);
        }
        return this;
     }


    /**
     * <p>在物理机上的多开序号</p>
     * LIKE '%值%'
     * @param sn       值
     * @return children
     */
    public BaiduDeviceQueryWrapper snLike(String sn){
        if(sn!=null){
            like("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * NOT LIKE '%值%'
     * @param sn       值
     * @return children
     */
    public BaiduDeviceQueryWrapper snNotLike(String sn){
        if(sn!=null){
            notLike("sn",sn);
        }
        return this;
     }


    /**
     * <p>在物理机上的多开序号</p>
     * LIKE '%值'
     * @param sn       值
     * @return children
     */
    public BaiduDeviceQueryWrapper snLikeLeft(String sn){
        if(sn!=null){
            likeLeft("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * LIKE '值%'
     * @param sn       值
     * @return children
     */
    public BaiduDeviceQueryWrapper snLikeRight(String sn){
        if(sn!=null){
            likeRight("sn",sn);
        }
        return this;
     }

    /**
     * <p>在物理机上的多开序号</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper snIsNull(){
        isNull("sn");
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper snIsNotNull(){
        isNotNull("sn");
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper snIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("sn",value);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper snIn(String... values){
        if(values!=null && values.length>0){
            in("sn",values);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper snNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("sn",value);
        }
        return this;
    }

    /**
     * <p>在物理机上的多开序号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper snNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("sn",values);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * 等于 =
     * @param ip       值
     * @return children
     */
    public BaiduDeviceQueryWrapper ipEq(String ip){
        if(ip!=null){
            eq("ip",ip);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * 不等于 &lt;&gt;
     * @param ip       值
     * @return children
     */
    public BaiduDeviceQueryWrapper ipNe(String ip){
        if(ip!=null){
            ne("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * 大于 &gt;
     * @param ip       值
     * @return children
     */
    public BaiduDeviceQueryWrapper ipGt(String ip){
        if(ip!=null){
            gt("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * 大于等于 &gt;=
     * @param ip       值
     * @return children
     */
    public BaiduDeviceQueryWrapper ipGe(String ip){
        if(ip!=null){
            ge("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * 小于 &lt;
     * @param ip       值
     * @return children
     */
    public BaiduDeviceQueryWrapper ipLt(String ip){
        if(ip!=null){
            lt("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * 小于等于 &lt;=
     * @param ip       值
     * @return children
     */
    public BaiduDeviceQueryWrapper ipLe(String ip){
        if(ip!=null){
            le("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * BETWEEN 值1 AND 值2
     * @param ipStart       值1
     * @param ipEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper ipBetween(String ipStart,String ipEnd){
        if(ipStart!=null && ipEnd!=null){
            between("ip",ipStart,ipEnd);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * NOT BETWEEN 值1 AND 值2
     * @param ipStart       值1
     * @param ipEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper ipNotBetween(String ipStart,String ipEnd){
        if(ipStart!=null && ipEnd!=null){
            notBetween("ip",ipStart,ipEnd);
        }
        return this;
     }


    /**
     * <p>云机的虚拟ip</p>
     * LIKE '%值%'
     * @param ip       值
     * @return children
     */
    public BaiduDeviceQueryWrapper ipLike(String ip){
        if(ip!=null){
            like("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * NOT LIKE '%值%'
     * @param ip       值
     * @return children
     */
    public BaiduDeviceQueryWrapper ipNotLike(String ip){
        if(ip!=null){
            notLike("ip",ip);
        }
        return this;
     }


    /**
     * <p>云机的虚拟ip</p>
     * LIKE '%值'
     * @param ip       值
     * @return children
     */
    public BaiduDeviceQueryWrapper ipLikeLeft(String ip){
        if(ip!=null){
            likeLeft("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * LIKE '值%'
     * @param ip       值
     * @return children
     */
    public BaiduDeviceQueryWrapper ipLikeRight(String ip){
        if(ip!=null){
            likeRight("ip",ip);
        }
        return this;
     }

    /**
     * <p>云机的虚拟ip</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper ipIsNull(){
        isNull("ip");
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper ipIsNotNull(){
        isNotNull("ip");
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper ipIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("ip",value);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper ipIn(String... values){
        if(values!=null && values.length>0){
            in("ip",values);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper ipNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("ip",value);
        }
        return this;
    }

    /**
     * <p>云机的虚拟ip</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper ipNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("ip",values);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * 等于 =
     * @param paas       值
     * @return children
     */
    public BaiduDeviceQueryWrapper paasEq(String paas){
        if(paas!=null){
            eq("paas",paas);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * 不等于 &lt;&gt;
     * @param paas       值
     * @return children
     */
    public BaiduDeviceQueryWrapper paasNe(String paas){
        if(paas!=null){
            ne("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * 大于 &gt;
     * @param paas       值
     * @return children
     */
    public BaiduDeviceQueryWrapper paasGt(String paas){
        if(paas!=null){
            gt("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * 大于等于 &gt;=
     * @param paas       值
     * @return children
     */
    public BaiduDeviceQueryWrapper paasGe(String paas){
        if(paas!=null){
            ge("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * 小于 &lt;
     * @param paas       值
     * @return children
     */
    public BaiduDeviceQueryWrapper paasLt(String paas){
        if(paas!=null){
            lt("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * 小于等于 &lt;=
     * @param paas       值
     * @return children
     */
    public BaiduDeviceQueryWrapper paasLe(String paas){
        if(paas!=null){
            le("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * BETWEEN 值1 AND 值2
     * @param paasStart       值1
     * @param paasEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper paasBetween(String paasStart,String paasEnd){
        if(paasStart!=null && paasEnd!=null){
            between("paas",paasStart,paasEnd);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * NOT BETWEEN 值1 AND 值2
     * @param paasStart       值1
     * @param paasEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper paasNotBetween(String paasStart,String paasEnd){
        if(paasStart!=null && paasEnd!=null){
            notBetween("paas",paasStart,paasEnd);
        }
        return this;
     }


    /**
     * <p>底层paas标记</p>
     * LIKE '%值%'
     * @param paas       值
     * @return children
     */
    public BaiduDeviceQueryWrapper paasLike(String paas){
        if(paas!=null){
            like("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * NOT LIKE '%值%'
     * @param paas       值
     * @return children
     */
    public BaiduDeviceQueryWrapper paasNotLike(String paas){
        if(paas!=null){
            notLike("paas",paas);
        }
        return this;
     }


    /**
     * <p>底层paas标记</p>
     * LIKE '%值'
     * @param paas       值
     * @return children
     */
    public BaiduDeviceQueryWrapper paasLikeLeft(String paas){
        if(paas!=null){
            likeLeft("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * LIKE '值%'
     * @param paas       值
     * @return children
     */
    public BaiduDeviceQueryWrapper paasLikeRight(String paas){
        if(paas!=null){
            likeRight("paas",paas);
        }
        return this;
     }

    /**
     * <p>底层paas标记</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper paasIsNull(){
        isNull("paas");
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper paasIsNotNull(){
        isNotNull("paas");
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper paasIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("paas",value);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper paasIn(String... values){
        if(values!=null && values.length>0){
            in("paas",values);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper paasNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("paas",value);
        }
        return this;
    }

    /**
     * <p>底层paas标记</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper paasNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("paas",values);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * 等于 =
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeEq(String deviceCode){
        if(deviceCode!=null){
            eq("device_code",deviceCode);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * 不等于 &lt;&gt;
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeNe(String deviceCode){
        if(deviceCode!=null){
            ne("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * 大于 &gt;
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeGt(String deviceCode){
        if(deviceCode!=null){
            gt("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * 大于等于 &gt;=
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeGe(String deviceCode){
        if(deviceCode!=null){
            ge("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * 小于 &lt;
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeLt(String deviceCode){
        if(deviceCode!=null){
            lt("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * 小于等于 &lt;=
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeLe(String deviceCode){
        if(deviceCode!=null){
            le("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * BETWEEN 值1 AND 值2
     * @param deviceCodeStart       值1
     * @param deviceCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeBetween(String deviceCodeStart,String deviceCodeEnd){
        if(deviceCodeStart!=null && deviceCodeEnd!=null){
            between("device_code",deviceCodeStart,deviceCodeEnd);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceCodeStart       值1
     * @param deviceCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeNotBetween(String deviceCodeStart,String deviceCodeEnd){
        if(deviceCodeStart!=null && deviceCodeEnd!=null){
            notBetween("device_code",deviceCodeStart,deviceCodeEnd);
        }
        return this;
     }


    /**
     * <p>物理机的code</p>
     * LIKE '%值%'
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeLike(String deviceCode){
        if(deviceCode!=null){
            like("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * NOT LIKE '%值%'
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeNotLike(String deviceCode){
        if(deviceCode!=null){
            notLike("device_code",deviceCode);
        }
        return this;
     }


    /**
     * <p>物理机的code</p>
     * LIKE '%值'
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeLikeLeft(String deviceCode){
        if(deviceCode!=null){
            likeLeft("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * LIKE '值%'
     * @param deviceCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeLikeRight(String deviceCode){
        if(deviceCode!=null){
            likeRight("device_code",deviceCode);
        }
        return this;
     }

    /**
     * <p>物理机的code</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeIsNull(){
        isNull("device_code");
        return this;
    }

    /**
     * <p>物理机的code</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeIsNotNull(){
        isNotNull("device_code");
        return this;
    }

    /**
     * <p>物理机的code</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_code",value);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeIn(String... values){
        if(values!=null && values.length>0){
            in("device_code",values);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_code",value);
        }
        return this;
    }

    /**
     * <p>物理机的code</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_code",values);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * 等于 =
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpEq(String deviceIp){
        if(deviceIp!=null){
            eq("device_ip",deviceIp);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * 不等于 &lt;&gt;
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpNe(String deviceIp){
        if(deviceIp!=null){
            ne("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * 大于 &gt;
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpGt(String deviceIp){
        if(deviceIp!=null){
            gt("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * 大于等于 &gt;=
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpGe(String deviceIp){
        if(deviceIp!=null){
            ge("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * 小于 &lt;
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpLt(String deviceIp){
        if(deviceIp!=null){
            lt("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * 小于等于 &lt;=
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpLe(String deviceIp){
        if(deviceIp!=null){
            le("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * BETWEEN 值1 AND 值2
     * @param deviceIpStart       值1
     * @param deviceIpEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpBetween(String deviceIpStart,String deviceIpEnd){
        if(deviceIpStart!=null && deviceIpEnd!=null){
            between("device_ip",deviceIpStart,deviceIpEnd);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIpStart       值1
     * @param deviceIpEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpNotBetween(String deviceIpStart,String deviceIpEnd){
        if(deviceIpStart!=null && deviceIpEnd!=null){
            notBetween("device_ip",deviceIpStart,deviceIpEnd);
        }
        return this;
     }


    /**
     * <p>物理机ip</p>
     * LIKE '%值%'
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpLike(String deviceIp){
        if(deviceIp!=null){
            like("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * NOT LIKE '%值%'
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpNotLike(String deviceIp){
        if(deviceIp!=null){
            notLike("device_ip",deviceIp);
        }
        return this;
     }


    /**
     * <p>物理机ip</p>
     * LIKE '%值'
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpLikeLeft(String deviceIp){
        if(deviceIp!=null){
            likeLeft("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * LIKE '值%'
     * @param deviceIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpLikeRight(String deviceIp){
        if(deviceIp!=null){
            likeRight("device_ip",deviceIp);
        }
        return this;
     }

    /**
     * <p>物理机ip</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpIsNull(){
        isNull("device_ip");
        return this;
    }

    /**
     * <p>物理机ip</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpIsNotNull(){
        isNotNull("device_ip");
        return this;
    }

    /**
     * <p>物理机ip</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_ip",value);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpIn(String... values){
        if(values!=null && values.length>0){
            in("device_ip",values);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_ip",value);
        }
        return this;
    }

    /**
     * <p>物理机ip</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper deviceIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_ip",values);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * 等于 =
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeEq(String hardwareCode){
        if(hardwareCode!=null){
            eq("hardware_code",hardwareCode);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * 不等于 &lt;&gt;
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeNe(String hardwareCode){
        if(hardwareCode!=null){
            ne("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * 大于 &gt;
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeGt(String hardwareCode){
        if(hardwareCode!=null){
            gt("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * 大于等于 &gt;=
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeGe(String hardwareCode){
        if(hardwareCode!=null){
            ge("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * 小于 &lt;
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeLt(String hardwareCode){
        if(hardwareCode!=null){
            lt("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * 小于等于 &lt;=
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeLe(String hardwareCode){
        if(hardwareCode!=null){
            le("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * BETWEEN 值1 AND 值2
     * @param hardwareCodeStart       值1
     * @param hardwareCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeBetween(String hardwareCodeStart,String hardwareCodeEnd){
        if(hardwareCodeStart!=null && hardwareCodeEnd!=null){
            between("hardware_code",hardwareCodeStart,hardwareCodeEnd);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * NOT BETWEEN 值1 AND 值2
     * @param hardwareCodeStart       值1
     * @param hardwareCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeNotBetween(String hardwareCodeStart,String hardwareCodeEnd){
        if(hardwareCodeStart!=null && hardwareCodeEnd!=null){
            notBetween("hardware_code",hardwareCodeStart,hardwareCodeEnd);
        }
        return this;
     }


    /**
     * <p>硬件配置</p>
     * LIKE '%值%'
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeLike(String hardwareCode){
        if(hardwareCode!=null){
            like("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * NOT LIKE '%值%'
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeNotLike(String hardwareCode){
        if(hardwareCode!=null){
            notLike("hardware_code",hardwareCode);
        }
        return this;
     }


    /**
     * <p>硬件配置</p>
     * LIKE '%值'
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeLikeLeft(String hardwareCode){
        if(hardwareCode!=null){
            likeLeft("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * LIKE '值%'
     * @param hardwareCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeLikeRight(String hardwareCode){
        if(hardwareCode!=null){
            likeRight("hardware_code",hardwareCode);
        }
        return this;
     }

    /**
     * <p>硬件配置</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeIsNull(){
        isNull("hardware_code");
        return this;
    }

    /**
     * <p>硬件配置</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeIsNotNull(){
        isNotNull("hardware_code");
        return this;
    }

    /**
     * <p>硬件配置</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("hardware_code",value);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeIn(String... values){
        if(values!=null && values.length>0){
            in("hardware_code",values);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("hardware_code",value);
        }
        return this;
    }

    /**
     * <p>硬件配置</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper hardwareCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("hardware_code",values);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * 等于 =
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegEq(String unitSeg){
        if(unitSeg!=null){
            eq("unit_seg",unitSeg);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * 不等于 &lt;&gt;
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegNe(String unitSeg){
        if(unitSeg!=null){
            ne("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * 大于 &gt;
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegGt(String unitSeg){
        if(unitSeg!=null){
            gt("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * 大于等于 &gt;=
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegGe(String unitSeg){
        if(unitSeg!=null){
            ge("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * 小于 &lt;
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegLt(String unitSeg){
        if(unitSeg!=null){
            lt("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * 小于等于 &lt;=
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegLe(String unitSeg){
        if(unitSeg!=null){
            le("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * BETWEEN 值1 AND 值2
     * @param unitSegStart       值1
     * @param unitSegEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegBetween(String unitSegStart,String unitSegEnd){
        if(unitSegStart!=null && unitSegEnd!=null){
            between("unit_seg",unitSegStart,unitSegEnd);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * NOT BETWEEN 值1 AND 值2
     * @param unitSegStart       值1
     * @param unitSegEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegNotBetween(String unitSegStart,String unitSegEnd){
        if(unitSegStart!=null && unitSegEnd!=null){
            notBetween("unit_seg",unitSegStart,unitSegEnd);
        }
        return this;
     }


    /**
     * <p>网段</p>
     * LIKE '%值%'
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegLike(String unitSeg){
        if(unitSeg!=null){
            like("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * NOT LIKE '%值%'
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegNotLike(String unitSeg){
        if(unitSeg!=null){
            notLike("unit_seg",unitSeg);
        }
        return this;
     }


    /**
     * <p>网段</p>
     * LIKE '%值'
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegLikeLeft(String unitSeg){
        if(unitSeg!=null){
            likeLeft("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * LIKE '值%'
     * @param unitSeg       值
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegLikeRight(String unitSeg){
        if(unitSeg!=null){
            likeRight("unit_seg",unitSeg);
        }
        return this;
     }

    /**
     * <p>网段</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegIsNull(){
        isNull("unit_seg");
        return this;
    }

    /**
     * <p>网段</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegIsNotNull(){
        isNotNull("unit_seg");
        return this;
    }

    /**
     * <p>网段</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("unit_seg",value);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegIn(String... values){
        if(values!=null && values.length>0){
            in("unit_seg",values);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("unit_seg",value);
        }
        return this;
    }

    /**
     * <p>网段</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper unitSegNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("unit_seg",values);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * 等于 =
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeEq(Date bootTime){
        if(bootTime!=null){
            eq("boot_time",bootTime);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * 不等于 &lt;&gt;
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeNe(Date bootTime){
        if(bootTime!=null){
            ne("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * 大于 &gt;
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeGt(Date bootTime){
        if(bootTime!=null){
            gt("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * 大于等于 &gt;=
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeGe(Date bootTime){
        if(bootTime!=null){
            ge("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * 小于 &lt;
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeLt(Date bootTime){
        if(bootTime!=null){
            lt("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * 小于等于 &lt;=
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeLe(Date bootTime){
        if(bootTime!=null){
            le("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * BETWEEN 值1 AND 值2
     * @param bootTimeStart       值1
     * @param bootTimeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeBetween(Date bootTimeStart,Date bootTimeEnd){
        if(bootTimeStart!=null && bootTimeEnd!=null){
            between("boot_time",bootTimeStart,bootTimeEnd);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param bootTimeStart       值1
     * @param bootTimeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeNotBetween(Date bootTimeStart,Date bootTimeEnd){
        if(bootTimeStart!=null && bootTimeEnd!=null){
            notBetween("boot_time",bootTimeStart,bootTimeEnd);
        }
        return this;
     }


    /**
     * <p>启动时间</p>
     * LIKE '%值%'
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeLike(Date bootTime){
        if(bootTime!=null){
            like("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * NOT LIKE '%值%'
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeNotLike(Date bootTime){
        if(bootTime!=null){
            notLike("boot_time",bootTime);
        }
        return this;
     }


    /**
     * <p>启动时间</p>
     * LIKE '%值'
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeLikeLeft(Date bootTime){
        if(bootTime!=null){
            likeLeft("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * LIKE '值%'
     * @param bootTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeLikeRight(Date bootTime){
        if(bootTime!=null){
            likeRight("boot_time",bootTime);
        }
        return this;
     }

    /**
     * <p>启动时间</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeIsNull(){
        isNull("boot_time");
        return this;
    }

    /**
     * <p>启动时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeIsNotNull(){
        isNotNull("boot_time");
        return this;
    }

    /**
     * <p>启动时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("boot_time",value);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("boot_time",values);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("boot_time",value);
        }
        return this;
    }

    /**
     * <p>启动时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper bootTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("boot_time",values);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * 等于 =
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeEq(Date hbTime){
        if(hbTime!=null){
            eq("hb_time",hbTime);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * 不等于 &lt;&gt;
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeNe(Date hbTime){
        if(hbTime!=null){
            ne("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * 大于 &gt;
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeGt(Date hbTime){
        if(hbTime!=null){
            gt("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * 大于等于 &gt;=
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeGe(Date hbTime){
        if(hbTime!=null){
            ge("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * 小于 &lt;
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeLt(Date hbTime){
        if(hbTime!=null){
            lt("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * 小于等于 &lt;=
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeLe(Date hbTime){
        if(hbTime!=null){
            le("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * BETWEEN 值1 AND 值2
     * @param hbTimeStart       值1
     * @param hbTimeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeBetween(Date hbTimeStart,Date hbTimeEnd){
        if(hbTimeStart!=null && hbTimeEnd!=null){
            between("hb_time",hbTimeStart,hbTimeEnd);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param hbTimeStart       值1
     * @param hbTimeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeNotBetween(Date hbTimeStart,Date hbTimeEnd){
        if(hbTimeStart!=null && hbTimeEnd!=null){
            notBetween("hb_time",hbTimeStart,hbTimeEnd);
        }
        return this;
     }


    /**
     * <p>上次心跳时间</p>
     * LIKE '%值%'
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeLike(Date hbTime){
        if(hbTime!=null){
            like("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * NOT LIKE '%值%'
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeNotLike(Date hbTime){
        if(hbTime!=null){
            notLike("hb_time",hbTime);
        }
        return this;
     }


    /**
     * <p>上次心跳时间</p>
     * LIKE '%值'
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeLikeLeft(Date hbTime){
        if(hbTime!=null){
            likeLeft("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * LIKE '值%'
     * @param hbTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeLikeRight(Date hbTime){
        if(hbTime!=null){
            likeRight("hb_time",hbTime);
        }
        return this;
     }

    /**
     * <p>上次心跳时间</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeIsNull(){
        isNull("hb_time");
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeIsNotNull(){
        isNotNull("hb_time");
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("hb_time",value);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("hb_time",values);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("hb_time",value);
        }
        return this;
    }

    /**
     * <p>上次心跳时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper hbTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("hb_time",values);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * 等于 =
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeEq(Date alertExpireTime){
        if(alertExpireTime!=null){
            eq("alert_expire_time",alertExpireTime);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * 不等于 &lt;&gt;
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeNe(Date alertExpireTime){
        if(alertExpireTime!=null){
            ne("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * 大于 &gt;
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeGt(Date alertExpireTime){
        if(alertExpireTime!=null){
            gt("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * 大于等于 &gt;=
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeGe(Date alertExpireTime){
        if(alertExpireTime!=null){
            ge("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * 小于 &lt;
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeLt(Date alertExpireTime){
        if(alertExpireTime!=null){
            lt("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * 小于等于 &lt;=
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeLe(Date alertExpireTime){
        if(alertExpireTime!=null){
            le("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * BETWEEN 值1 AND 值2
     * @param alertExpireTimeStart       值1
     * @param alertExpireTimeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeBetween(Date alertExpireTimeStart,Date alertExpireTimeEnd){
        if(alertExpireTimeStart!=null && alertExpireTimeEnd!=null){
            between("alert_expire_time",alertExpireTimeStart,alertExpireTimeEnd);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param alertExpireTimeStart       值1
     * @param alertExpireTimeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeNotBetween(Date alertExpireTimeStart,Date alertExpireTimeEnd){
        if(alertExpireTimeStart!=null && alertExpireTimeEnd!=null){
            notBetween("alert_expire_time",alertExpireTimeStart,alertExpireTimeEnd);
        }
        return this;
     }


    /**
     * <p>报警超时时间</p>
     * LIKE '%值%'
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeLike(Date alertExpireTime){
        if(alertExpireTime!=null){
            like("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * NOT LIKE '%值%'
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeNotLike(Date alertExpireTime){
        if(alertExpireTime!=null){
            notLike("alert_expire_time",alertExpireTime);
        }
        return this;
     }


    /**
     * <p>报警超时时间</p>
     * LIKE '%值'
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeLikeLeft(Date alertExpireTime){
        if(alertExpireTime!=null){
            likeLeft("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * LIKE '值%'
     * @param alertExpireTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeLikeRight(Date alertExpireTime){
        if(alertExpireTime!=null){
            likeRight("alert_expire_time",alertExpireTime);
        }
        return this;
     }

    /**
     * <p>报警超时时间</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeIsNull(){
        isNull("alert_expire_time");
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeIsNotNull(){
        isNotNull("alert_expire_time");
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("alert_expire_time",value);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("alert_expire_time",values);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("alert_expire_time",value);
        }
        return this;
    }

    /**
     * <p>报警超时时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper alertExpireTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("alert_expire_time",values);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 等于 =
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeEq(Date offlineTime){
        if(offlineTime!=null){
            eq("offline_time",offlineTime);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 不等于 &lt;&gt;
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeNe(Date offlineTime){
        if(offlineTime!=null){
            ne("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 大于 &gt;
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeGt(Date offlineTime){
        if(offlineTime!=null){
            gt("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 大于等于 &gt;=
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeGe(Date offlineTime){
        if(offlineTime!=null){
            ge("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 小于 &lt;
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeLt(Date offlineTime){
        if(offlineTime!=null){
            lt("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * 小于等于 &lt;=
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeLe(Date offlineTime){
        if(offlineTime!=null){
            le("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * BETWEEN 值1 AND 值2
     * @param offlineTimeStart       值1
     * @param offlineTimeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeBetween(Date offlineTimeStart,Date offlineTimeEnd){
        if(offlineTimeStart!=null && offlineTimeEnd!=null){
            between("offline_time",offlineTimeStart,offlineTimeEnd);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * NOT BETWEEN 值1 AND 值2
     * @param offlineTimeStart       值1
     * @param offlineTimeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeNotBetween(Date offlineTimeStart,Date offlineTimeEnd){
        if(offlineTimeStart!=null && offlineTimeEnd!=null){
            notBetween("offline_time",offlineTimeStart,offlineTimeEnd);
        }
        return this;
     }


    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * LIKE '%值%'
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeLike(Date offlineTime){
        if(offlineTime!=null){
            like("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * NOT LIKE '%值%'
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeNotLike(Date offlineTime){
        if(offlineTime!=null){
            notLike("offline_time",offlineTime);
        }
        return this;
     }


    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * LIKE '%值'
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeLikeLeft(Date offlineTime){
        if(offlineTime!=null){
            likeLeft("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * LIKE '值%'
     * @param offlineTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeLikeRight(Date offlineTime){
        if(offlineTime!=null){
            likeRight("offline_time",offlineTime);
        }
        return this;
     }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeIsNull(){
        isNull("offline_time");
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeIsNotNull(){
        isNotNull("offline_time");
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("offline_time",value);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("offline_time",values);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("offline_time",value);
        }
        return this;
    }

    /**
     * <p>已离线时长用来判断处于离线的云机是重启，还是故障</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper offlineTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("offline_time",values);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 等于 =
     * @param tx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper txEq(String tx){
        if(tx!=null){
            eq("tx",tx);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 不等于 &lt;&gt;
     * @param tx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper txNe(String tx){
        if(tx!=null){
            ne("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 大于 &gt;
     * @param tx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper txGt(String tx){
        if(tx!=null){
            gt("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 大于等于 &gt;=
     * @param tx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper txGe(String tx){
        if(tx!=null){
            ge("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 小于 &lt;
     * @param tx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper txLt(String tx){
        if(tx!=null){
            lt("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * 小于等于 &lt;=
     * @param tx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper txLe(String tx){
        if(tx!=null){
            le("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * BETWEEN 值1 AND 值2
     * @param txStart       值1
     * @param txEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper txBetween(String txStart,String txEnd){
        if(txStart!=null && txEnd!=null){
            between("tx",txStart,txEnd);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * NOT BETWEEN 值1 AND 值2
     * @param txStart       值1
     * @param txEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper txNotBetween(String txStart,String txEnd){
        if(txStart!=null && txEnd!=null){
            notBetween("tx",txStart,txEnd);
        }
        return this;
     }


    /**
     * <p>上行网速，单位B/s网速测算</p>
     * LIKE '%值%'
     * @param tx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper txLike(String tx){
        if(tx!=null){
            like("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * NOT LIKE '%值%'
     * @param tx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper txNotLike(String tx){
        if(tx!=null){
            notLike("tx",tx);
        }
        return this;
     }


    /**
     * <p>上行网速，单位B/s网速测算</p>
     * LIKE '%值'
     * @param tx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper txLikeLeft(String tx){
        if(tx!=null){
            likeLeft("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * LIKE '值%'
     * @param tx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper txLikeRight(String tx){
        if(tx!=null){
            likeRight("tx",tx);
        }
        return this;
     }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper txIsNull(){
        isNull("tx");
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper txIsNotNull(){
        isNotNull("tx");
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper txIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("tx",value);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper txIn(String... values){
        if(values!=null && values.length>0){
            in("tx",values);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper txNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("tx",value);
        }
        return this;
    }

    /**
     * <p>上行网速，单位B/s网速测算</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper txNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("tx",values);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * 等于 =
     * @param rx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rxEq(String rx){
        if(rx!=null){
            eq("rx",rx);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * 不等于 &lt;&gt;
     * @param rx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rxNe(String rx){
        if(rx!=null){
            ne("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * 大于 &gt;
     * @param rx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rxGt(String rx){
        if(rx!=null){
            gt("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * 大于等于 &gt;=
     * @param rx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rxGe(String rx){
        if(rx!=null){
            ge("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * 小于 &lt;
     * @param rx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rxLt(String rx){
        if(rx!=null){
            lt("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * 小于等于 &lt;=
     * @param rx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rxLe(String rx){
        if(rx!=null){
            le("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * BETWEEN 值1 AND 值2
     * @param rxStart       值1
     * @param rxEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper rxBetween(String rxStart,String rxEnd){
        if(rxStart!=null && rxEnd!=null){
            between("rx",rxStart,rxEnd);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * NOT BETWEEN 值1 AND 值2
     * @param rxStart       值1
     * @param rxEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper rxNotBetween(String rxStart,String rxEnd){
        if(rxStart!=null && rxEnd!=null){
            notBetween("rx",rxStart,rxEnd);
        }
        return this;
     }


    /**
     * <p>下行网速，单位B/s</p>
     * LIKE '%值%'
     * @param rx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rxLike(String rx){
        if(rx!=null){
            like("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * NOT LIKE '%值%'
     * @param rx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rxNotLike(String rx){
        if(rx!=null){
            notLike("rx",rx);
        }
        return this;
     }


    /**
     * <p>下行网速，单位B/s</p>
     * LIKE '%值'
     * @param rx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rxLikeLeft(String rx){
        if(rx!=null){
            likeLeft("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * LIKE '值%'
     * @param rx       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rxLikeRight(String rx){
        if(rx!=null){
            likeRight("rx",rx);
        }
        return this;
     }

    /**
     * <p>下行网速，单位B/s</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper rxIsNull(){
        isNull("rx");
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper rxIsNotNull(){
        isNotNull("rx");
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rxIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("rx",value);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rxIn(String... values){
        if(values!=null && values.length>0){
            in("rx",values);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rxNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("rx",value);
        }
        return this;
    }

    /**
     * <p>下行网速，单位B/s</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rxNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("rx",values);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 等于 =
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineEq(Integer statusOnline){
        if(statusOnline!=null){
            eq("status_online",statusOnline);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 不等于 &lt;&gt;
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineNe(Integer statusOnline){
        if(statusOnline!=null){
            ne("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 大于 &gt;
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineGt(Integer statusOnline){
        if(statusOnline!=null){
            gt("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 大于等于 &gt;=
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineGe(Integer statusOnline){
        if(statusOnline!=null){
            ge("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 小于 &lt;
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineLt(Integer statusOnline){
        if(statusOnline!=null){
            lt("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * 小于等于 &lt;=
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineLe(Integer statusOnline){
        if(statusOnline!=null){
            le("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * BETWEEN 值1 AND 值2
     * @param statusOnlineStart       值1
     * @param statusOnlineEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineBetween(Integer statusOnlineStart,Integer statusOnlineEnd){
        if(statusOnlineStart!=null && statusOnlineEnd!=null){
            between("status_online",statusOnlineStart,statusOnlineEnd);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusOnlineStart       值1
     * @param statusOnlineEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineNotBetween(Integer statusOnlineStart,Integer statusOnlineEnd){
        if(statusOnlineStart!=null && statusOnlineEnd!=null){
            notBetween("status_online",statusOnlineStart,statusOnlineEnd);
        }
        return this;
     }


    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * LIKE '%值%'
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineLike(Integer statusOnline){
        if(statusOnline!=null){
            like("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * NOT LIKE '%值%'
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineNotLike(Integer statusOnline){
        if(statusOnline!=null){
            notLike("status_online",statusOnline);
        }
        return this;
     }


    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * LIKE '%值'
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineLikeLeft(Integer statusOnline){
        if(statusOnline!=null){
            likeLeft("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * LIKE '值%'
     * @param statusOnline       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineLikeRight(Integer statusOnline){
        if(statusOnline!=null){
            likeRight("status_online",statusOnline);
        }
        return this;
     }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineIsNull(){
        isNull("status_online");
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineIsNotNull(){
        isNotNull("status_online");
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status_online",value);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineIn(Integer... values){
        if(values!=null && values.length>0){
            in("status_online",values);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status_online",value);
        }
        return this;
    }

    /**
     * <p>云机状态(0: 正常 1:物ping离线 2:物ssh离线 3:物agent离线 10:ping离线 11:启动中 12:ip错误 13:ssh错误)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper statusOnlineNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status_online",values);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 等于 =
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsEq(Long offSeconds){
        if(offSeconds!=null){
            eq("off_seconds",offSeconds);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 不等于 &lt;&gt;
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsNe(Long offSeconds){
        if(offSeconds!=null){
            ne("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 大于 &gt;
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsGt(Long offSeconds){
        if(offSeconds!=null){
            gt("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 大于等于 &gt;=
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsGe(Long offSeconds){
        if(offSeconds!=null){
            ge("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 小于 &lt;
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsLt(Long offSeconds){
        if(offSeconds!=null){
            lt("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * 小于等于 &lt;=
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsLe(Long offSeconds){
        if(offSeconds!=null){
            le("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * BETWEEN 值1 AND 值2
     * @param offSecondsStart       值1
     * @param offSecondsEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsBetween(Long offSecondsStart,Long offSecondsEnd){
        if(offSecondsStart!=null && offSecondsEnd!=null){
            between("off_seconds",offSecondsStart,offSecondsEnd);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * NOT BETWEEN 值1 AND 值2
     * @param offSecondsStart       值1
     * @param offSecondsEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsNotBetween(Long offSecondsStart,Long offSecondsEnd){
        if(offSecondsStart!=null && offSecondsEnd!=null){
            notBetween("off_seconds",offSecondsStart,offSecondsEnd);
        }
        return this;
     }


    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * LIKE '%值%'
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsLike(Long offSeconds){
        if(offSeconds!=null){
            like("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * NOT LIKE '%值%'
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsNotLike(Long offSeconds){
        if(offSeconds!=null){
            notLike("off_seconds",offSeconds);
        }
        return this;
     }


    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * LIKE '%值'
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsLikeLeft(Long offSeconds){
        if(offSeconds!=null){
            likeLeft("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * LIKE '值%'
     * @param offSeconds       值
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsLikeRight(Long offSeconds){
        if(offSeconds!=null){
            likeRight("off_seconds",offSeconds);
        }
        return this;
     }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsIsNull(){
        isNull("off_seconds");
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsIsNotNull(){
        isNotNull("off_seconds");
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("off_seconds",value);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsIn(Long... values){
        if(values!=null && values.length>0){
            in("off_seconds",values);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("off_seconds",value);
        }
        return this;
    }

    /**
     * <p>如果云机状态是ping离线或者启动中，这个值是已离线时长</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper offSecondsNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("off_seconds",values);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * 等于 =
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageEq(String errorMessage){
        if(errorMessage!=null){
            eq("error_message",errorMessage);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * 不等于 &lt;&gt;
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageNe(String errorMessage){
        if(errorMessage!=null){
            ne("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * 大于 &gt;
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageGt(String errorMessage){
        if(errorMessage!=null){
            gt("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * 大于等于 &gt;=
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageGe(String errorMessage){
        if(errorMessage!=null){
            ge("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * 小于 &lt;
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageLt(String errorMessage){
        if(errorMessage!=null){
            lt("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * 小于等于 &lt;=
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageLe(String errorMessage){
        if(errorMessage!=null){
            le("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * BETWEEN 值1 AND 值2
     * @param errorMessageStart       值1
     * @param errorMessageEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageBetween(String errorMessageStart,String errorMessageEnd){
        if(errorMessageStart!=null && errorMessageEnd!=null){
            between("error_message",errorMessageStart,errorMessageEnd);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * NOT BETWEEN 值1 AND 值2
     * @param errorMessageStart       值1
     * @param errorMessageEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageNotBetween(String errorMessageStart,String errorMessageEnd){
        if(errorMessageStart!=null && errorMessageEnd!=null){
            notBetween("error_message",errorMessageStart,errorMessageEnd);
        }
        return this;
     }


    /**
     * <p>云机错误消息</p>
     * LIKE '%值%'
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageLike(String errorMessage){
        if(errorMessage!=null){
            like("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * NOT LIKE '%值%'
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageNotLike(String errorMessage){
        if(errorMessage!=null){
            notLike("error_message",errorMessage);
        }
        return this;
     }


    /**
     * <p>云机错误消息</p>
     * LIKE '%值'
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageLikeLeft(String errorMessage){
        if(errorMessage!=null){
            likeLeft("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * LIKE '值%'
     * @param errorMessage       值
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageLikeRight(String errorMessage){
        if(errorMessage!=null){
            likeRight("error_message",errorMessage);
        }
        return this;
     }

    /**
     * <p>云机错误消息</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageIsNull(){
        isNull("error_message");
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageIsNotNull(){
        isNotNull("error_message");
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("error_message",value);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageIn(String... values){
        if(values!=null && values.length>0){
            in("error_message",values);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("error_message",value);
        }
        return this;
    }

    /**
     * <p>云机错误消息</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper errorMessageNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("error_message",values);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 等于 =
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlEq(Integer statusControl){
        if(statusControl!=null){
            eq("status_control",statusControl);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 不等于 &lt;&gt;
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlNe(Integer statusControl){
        if(statusControl!=null){
            ne("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 大于 &gt;
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlGt(Integer statusControl){
        if(statusControl!=null){
            gt("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 大于等于 &gt;=
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlGe(Integer statusControl){
        if(statusControl!=null){
            ge("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 小于 &lt;
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlLt(Integer statusControl){
        if(statusControl!=null){
            lt("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * 小于等于 &lt;=
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlLe(Integer statusControl){
        if(statusControl!=null){
            le("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * BETWEEN 值1 AND 值2
     * @param statusControlStart       值1
     * @param statusControlEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlBetween(Integer statusControlStart,Integer statusControlEnd){
        if(statusControlStart!=null && statusControlEnd!=null){
            between("status_control",statusControlStart,statusControlEnd);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusControlStart       值1
     * @param statusControlEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlNotBetween(Integer statusControlStart,Integer statusControlEnd){
        if(statusControlStart!=null && statusControlEnd!=null){
            notBetween("status_control",statusControlStart,statusControlEnd);
        }
        return this;
     }


    /**
     * <p>0 未推流 1 正在推流</p>
     * LIKE '%值%'
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlLike(Integer statusControl){
        if(statusControl!=null){
            like("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * NOT LIKE '%值%'
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlNotLike(Integer statusControl){
        if(statusControl!=null){
            notLike("status_control",statusControl);
        }
        return this;
     }


    /**
     * <p>0 未推流 1 正在推流</p>
     * LIKE '%值'
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlLikeLeft(Integer statusControl){
        if(statusControl!=null){
            likeLeft("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * LIKE '值%'
     * @param statusControl       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlLikeRight(Integer statusControl){
        if(statusControl!=null){
            likeRight("status_control",statusControl);
        }
        return this;
     }

    /**
     * <p>0 未推流 1 正在推流</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlIsNull(){
        isNull("status_control");
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlIsNotNull(){
        isNotNull("status_control");
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status_control",value);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlIn(Integer... values){
        if(values!=null && values.length>0){
            in("status_control",values);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status_control",value);
        }
        return this;
    }

    /**
     * <p>0 未推流 1 正在推流</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper statusControlNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status_control",values);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * 等于 =
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledEq(Boolean alertEnabled){
        if(alertEnabled!=null){
            eq("alert_enabled",alertEnabled);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * 不等于 &lt;&gt;
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledNe(Boolean alertEnabled){
        if(alertEnabled!=null){
            ne("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * 大于 &gt;
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledGt(Boolean alertEnabled){
        if(alertEnabled!=null){
            gt("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * 大于等于 &gt;=
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledGe(Boolean alertEnabled){
        if(alertEnabled!=null){
            ge("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * 小于 &lt;
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledLt(Boolean alertEnabled){
        if(alertEnabled!=null){
            lt("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * 小于等于 &lt;=
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledLe(Boolean alertEnabled){
        if(alertEnabled!=null){
            le("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * BETWEEN 值1 AND 值2
     * @param alertEnabledStart       值1
     * @param alertEnabledEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledBetween(Boolean alertEnabledStart,Boolean alertEnabledEnd){
        if(alertEnabledStart!=null && alertEnabledEnd!=null){
            between("alert_enabled",alertEnabledStart,alertEnabledEnd);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * NOT BETWEEN 值1 AND 值2
     * @param alertEnabledStart       值1
     * @param alertEnabledEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledNotBetween(Boolean alertEnabledStart,Boolean alertEnabledEnd){
        if(alertEnabledStart!=null && alertEnabledEnd!=null){
            notBetween("alert_enabled",alertEnabledStart,alertEnabledEnd);
        }
        return this;
     }


    /**
     * <p>是否开启报警</p>
     * LIKE '%值%'
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledLike(Boolean alertEnabled){
        if(alertEnabled!=null){
            like("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * NOT LIKE '%值%'
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledNotLike(Boolean alertEnabled){
        if(alertEnabled!=null){
            notLike("alert_enabled",alertEnabled);
        }
        return this;
     }


    /**
     * <p>是否开启报警</p>
     * LIKE '%值'
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledLikeLeft(Boolean alertEnabled){
        if(alertEnabled!=null){
            likeLeft("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * LIKE '值%'
     * @param alertEnabled       值
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledLikeRight(Boolean alertEnabled){
        if(alertEnabled!=null){
            likeRight("alert_enabled",alertEnabled);
        }
        return this;
     }

    /**
     * <p>是否开启报警</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledIsNull(){
        isNull("alert_enabled");
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledIsNotNull(){
        isNotNull("alert_enabled");
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("alert_enabled",value);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledIn(Boolean... values){
        if(values!=null && values.length>0){
            in("alert_enabled",values);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("alert_enabled",value);
        }
        return this;
    }

    /**
     * <p>是否开启报警</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper alertEnabledNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("alert_enabled",values);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * 等于 =
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSEq(Boolean statusPaaS){
        if(statusPaaS!=null){
            eq("status_paa_s",statusPaaS);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * 不等于 &lt;&gt;
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSNe(Boolean statusPaaS){
        if(statusPaaS!=null){
            ne("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * 大于 &gt;
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSGt(Boolean statusPaaS){
        if(statusPaaS!=null){
            gt("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * 大于等于 &gt;=
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSGe(Boolean statusPaaS){
        if(statusPaaS!=null){
            ge("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * 小于 &lt;
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSLt(Boolean statusPaaS){
        if(statusPaaS!=null){
            lt("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * 小于等于 &lt;=
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSLe(Boolean statusPaaS){
        if(statusPaaS!=null){
            le("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * BETWEEN 值1 AND 值2
     * @param statusPaaSStart       值1
     * @param statusPaaSEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSBetween(Boolean statusPaaSStart,Boolean statusPaaSEnd){
        if(statusPaaSStart!=null && statusPaaSEnd!=null){
            between("status_paa_s",statusPaaSStart,statusPaaSEnd);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusPaaSStart       值1
     * @param statusPaaSEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSNotBetween(Boolean statusPaaSStart,Boolean statusPaaSEnd){
        if(statusPaaSStart!=null && statusPaaSEnd!=null){
            notBetween("status_paa_s",statusPaaSStart,statusPaaSEnd);
        }
        return this;
     }


    /**
     * <p>在paas中状态是否正常</p>
     * LIKE '%值%'
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSLike(Boolean statusPaaS){
        if(statusPaaS!=null){
            like("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * NOT LIKE '%值%'
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSNotLike(Boolean statusPaaS){
        if(statusPaaS!=null){
            notLike("status_paa_s",statusPaaS);
        }
        return this;
     }


    /**
     * <p>在paas中状态是否正常</p>
     * LIKE '%值'
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSLikeLeft(Boolean statusPaaS){
        if(statusPaaS!=null){
            likeLeft("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * LIKE '值%'
     * @param statusPaaS       值
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSLikeRight(Boolean statusPaaS){
        if(statusPaaS!=null){
            likeRight("status_paa_s",statusPaaS);
        }
        return this;
     }

    /**
     * <p>在paas中状态是否正常</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSIsNull(){
        isNull("status_paa_s");
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSIsNotNull(){
        isNotNull("status_paa_s");
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("status_paa_s",value);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSIn(Boolean... values){
        if(values!=null && values.length>0){
            in("status_paa_s",values);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("status_paa_s",value);
        }
        return this;
    }

    /**
     * <p>在paas中状态是否正常</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper statusPaaSNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("status_paa_s",values);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 等于 =
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameEq(String lastApplyUsername){
        if(lastApplyUsername!=null){
            eq("last_apply_username",lastApplyUsername);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 不等于 &lt;&gt;
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameNe(String lastApplyUsername){
        if(lastApplyUsername!=null){
            ne("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 大于 &gt;
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameGt(String lastApplyUsername){
        if(lastApplyUsername!=null){
            gt("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 大于等于 &gt;=
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameGe(String lastApplyUsername){
        if(lastApplyUsername!=null){
            ge("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 小于 &lt;
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameLt(String lastApplyUsername){
        if(lastApplyUsername!=null){
            lt("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * 小于等于 &lt;=
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameLe(String lastApplyUsername){
        if(lastApplyUsername!=null){
            le("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * BETWEEN 值1 AND 值2
     * @param lastApplyUsernameStart       值1
     * @param lastApplyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameBetween(String lastApplyUsernameStart,String lastApplyUsernameEnd){
        if(lastApplyUsernameStart!=null && lastApplyUsernameEnd!=null){
            between("last_apply_username",lastApplyUsernameStart,lastApplyUsernameEnd);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastApplyUsernameStart       值1
     * @param lastApplyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameNotBetween(String lastApplyUsernameStart,String lastApplyUsernameEnd){
        if(lastApplyUsernameStart!=null && lastApplyUsernameEnd!=null){
            notBetween("last_apply_username",lastApplyUsernameStart,lastApplyUsernameEnd);
        }
        return this;
     }


    /**
     * <p>上次成功申请到推流token的用户名</p>
     * LIKE '%值%'
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameLike(String lastApplyUsername){
        if(lastApplyUsername!=null){
            like("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * NOT LIKE '%值%'
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameNotLike(String lastApplyUsername){
        if(lastApplyUsername!=null){
            notLike("last_apply_username",lastApplyUsername);
        }
        return this;
     }


    /**
     * <p>上次成功申请到推流token的用户名</p>
     * LIKE '%值'
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameLikeLeft(String lastApplyUsername){
        if(lastApplyUsername!=null){
            likeLeft("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * LIKE '值%'
     * @param lastApplyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameLikeRight(String lastApplyUsername){
        if(lastApplyUsername!=null){
            likeRight("last_apply_username",lastApplyUsername);
        }
        return this;
     }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameIsNull(){
        isNull("last_apply_username");
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameIsNotNull(){
        isNotNull("last_apply_username");
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("last_apply_username",value);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameIn(String... values){
        if(values!=null && values.length>0){
            in("last_apply_username",values);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_apply_username",value);
        }
        return this;
    }

    /**
     * <p>上次成功申请到推流token的用户名</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyUsernameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("last_apply_username",values);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * 等于 =
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateEq(Date lastApplyDate){
        if(lastApplyDate!=null){
            eq("last_apply_date",lastApplyDate);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * 不等于 &lt;&gt;
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateNe(Date lastApplyDate){
        if(lastApplyDate!=null){
            ne("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * 大于 &gt;
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateGt(Date lastApplyDate){
        if(lastApplyDate!=null){
            gt("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * 大于等于 &gt;=
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateGe(Date lastApplyDate){
        if(lastApplyDate!=null){
            ge("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * 小于 &lt;
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateLt(Date lastApplyDate){
        if(lastApplyDate!=null){
            lt("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * 小于等于 &lt;=
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateLe(Date lastApplyDate){
        if(lastApplyDate!=null){
            le("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * BETWEEN 值1 AND 值2
     * @param lastApplyDateStart       值1
     * @param lastApplyDateEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateBetween(Date lastApplyDateStart,Date lastApplyDateEnd){
        if(lastApplyDateStart!=null && lastApplyDateEnd!=null){
            between("last_apply_date",lastApplyDateStart,lastApplyDateEnd);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastApplyDateStart       值1
     * @param lastApplyDateEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateNotBetween(Date lastApplyDateStart,Date lastApplyDateEnd){
        if(lastApplyDateStart!=null && lastApplyDateEnd!=null){
            notBetween("last_apply_date",lastApplyDateStart,lastApplyDateEnd);
        }
        return this;
     }


    /**
     * <p>上次成功申请到token的日期</p>
     * LIKE '%值%'
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateLike(Date lastApplyDate){
        if(lastApplyDate!=null){
            like("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * NOT LIKE '%值%'
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateNotLike(Date lastApplyDate){
        if(lastApplyDate!=null){
            notLike("last_apply_date",lastApplyDate);
        }
        return this;
     }


    /**
     * <p>上次成功申请到token的日期</p>
     * LIKE '%值'
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateLikeLeft(Date lastApplyDate){
        if(lastApplyDate!=null){
            likeLeft("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * LIKE '值%'
     * @param lastApplyDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateLikeRight(Date lastApplyDate){
        if(lastApplyDate!=null){
            likeRight("last_apply_date",lastApplyDate);
        }
        return this;
     }

    /**
     * <p>上次成功申请到token的日期</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateIsNull(){
        isNull("last_apply_date");
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateIsNotNull(){
        isNotNull("last_apply_date");
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_apply_date",value);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateIn(Date... values){
        if(values!=null && values.length>0){
            in("last_apply_date",values);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_apply_date",value);
        }
        return this;
    }

    /**
     * <p>上次成功申请到token的日期</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastApplyDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_apply_date",values);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * 等于 =
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateEq(Date lastActiveDate){
        if(lastActiveDate!=null){
            eq("last_active_date",lastActiveDate);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * 不等于 &lt;&gt;
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateNe(Date lastActiveDate){
        if(lastActiveDate!=null){
            ne("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * 大于 &gt;
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateGt(Date lastActiveDate){
        if(lastActiveDate!=null){
            gt("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * 大于等于 &gt;=
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateGe(Date lastActiveDate){
        if(lastActiveDate!=null){
            ge("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * 小于 &lt;
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateLt(Date lastActiveDate){
        if(lastActiveDate!=null){
            lt("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * 小于等于 &lt;=
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateLe(Date lastActiveDate){
        if(lastActiveDate!=null){
            le("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * BETWEEN 值1 AND 值2
     * @param lastActiveDateStart       值1
     * @param lastActiveDateEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateBetween(Date lastActiveDateStart,Date lastActiveDateEnd){
        if(lastActiveDateStart!=null && lastActiveDateEnd!=null){
            between("last_active_date",lastActiveDateStart,lastActiveDateEnd);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastActiveDateStart       值1
     * @param lastActiveDateEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateNotBetween(Date lastActiveDateStart,Date lastActiveDateEnd){
        if(lastActiveDateStart!=null && lastActiveDateEnd!=null){
            notBetween("last_active_date",lastActiveDateStart,lastActiveDateEnd);
        }
        return this;
     }


    /**
     * <p>上次活跃日期</p>
     * LIKE '%值%'
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateLike(Date lastActiveDate){
        if(lastActiveDate!=null){
            like("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * NOT LIKE '%值%'
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateNotLike(Date lastActiveDate){
        if(lastActiveDate!=null){
            notLike("last_active_date",lastActiveDate);
        }
        return this;
     }


    /**
     * <p>上次活跃日期</p>
     * LIKE '%值'
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateLikeLeft(Date lastActiveDate){
        if(lastActiveDate!=null){
            likeLeft("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * LIKE '值%'
     * @param lastActiveDate       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateLikeRight(Date lastActiveDate){
        if(lastActiveDate!=null){
            likeRight("last_active_date",lastActiveDate);
        }
        return this;
     }

    /**
     * <p>上次活跃日期</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateIsNull(){
        isNull("last_active_date");
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateIsNotNull(){
        isNotNull("last_active_date");
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_active_date",value);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateIn(Date... values){
        if(values!=null && values.length>0){
            in("last_active_date",values);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_active_date",value);
        }
        return this;
    }

    /**
     * <p>上次活跃日期</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastActiveDateNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_active_date",values);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 等于 =
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsEq(String pkgs){
        if(pkgs!=null){
            eq("pkgs",pkgs);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 不等于 &lt;&gt;
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsNe(String pkgs){
        if(pkgs!=null){
            ne("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 大于 &gt;
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsGt(String pkgs){
        if(pkgs!=null){
            gt("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 大于等于 &gt;=
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsGe(String pkgs){
        if(pkgs!=null){
            ge("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 小于 &lt;
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsLt(String pkgs){
        if(pkgs!=null){
            lt("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * 小于等于 &lt;=
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsLe(String pkgs){
        if(pkgs!=null){
            le("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * BETWEEN 值1 AND 值2
     * @param pkgsStart       值1
     * @param pkgsEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsBetween(String pkgsStart,String pkgsEnd){
        if(pkgsStart!=null && pkgsEnd!=null){
            between("pkgs",pkgsStart,pkgsEnd);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * NOT BETWEEN 值1 AND 值2
     * @param pkgsStart       值1
     * @param pkgsEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsNotBetween(String pkgsStart,String pkgsEnd){
        if(pkgsStart!=null && pkgsEnd!=null){
            notBetween("pkgs",pkgsStart,pkgsEnd);
        }
        return this;
     }


    /**
     * <p>安装的应用，多个使用,分割</p>
     * LIKE '%值%'
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsLike(String pkgs){
        if(pkgs!=null){
            like("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * NOT LIKE '%值%'
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsNotLike(String pkgs){
        if(pkgs!=null){
            notLike("pkgs",pkgs);
        }
        return this;
     }


    /**
     * <p>安装的应用，多个使用,分割</p>
     * LIKE '%值'
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsLikeLeft(String pkgs){
        if(pkgs!=null){
            likeLeft("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * LIKE '值%'
     * @param pkgs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsLikeRight(String pkgs){
        if(pkgs!=null){
            likeRight("pkgs",pkgs);
        }
        return this;
     }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsIsNull(){
        isNull("pkgs");
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsIsNotNull(){
        isNotNull("pkgs");
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("pkgs",value);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsIn(String... values){
        if(values!=null && values.length>0){
            in("pkgs",values);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("pkgs",value);
        }
        return this;
    }

    /**
     * <p>安装的应用，多个使用,分割</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper pkgsNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("pkgs",values);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * 等于 =
     * @param tag       值
     * @return children
     */
    public BaiduDeviceQueryWrapper tagEq(String tag){
        if(tag!=null){
            eq("tag",tag);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * 不等于 &lt;&gt;
     * @param tag       值
     * @return children
     */
    public BaiduDeviceQueryWrapper tagNe(String tag){
        if(tag!=null){
            ne("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * 大于 &gt;
     * @param tag       值
     * @return children
     */
    public BaiduDeviceQueryWrapper tagGt(String tag){
        if(tag!=null){
            gt("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * 大于等于 &gt;=
     * @param tag       值
     * @return children
     */
    public BaiduDeviceQueryWrapper tagGe(String tag){
        if(tag!=null){
            ge("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * 小于 &lt;
     * @param tag       值
     * @return children
     */
    public BaiduDeviceQueryWrapper tagLt(String tag){
        if(tag!=null){
            lt("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * 小于等于 &lt;=
     * @param tag       值
     * @return children
     */
    public BaiduDeviceQueryWrapper tagLe(String tag){
        if(tag!=null){
            le("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * BETWEEN 值1 AND 值2
     * @param tagStart       值1
     * @param tagEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper tagBetween(String tagStart,String tagEnd){
        if(tagStart!=null && tagEnd!=null){
            between("tag",tagStart,tagEnd);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * NOT BETWEEN 值1 AND 值2
     * @param tagStart       值1
     * @param tagEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper tagNotBetween(String tagStart,String tagEnd){
        if(tagStart!=null && tagEnd!=null){
            notBetween("tag",tagStart,tagEnd);
        }
        return this;
     }


    /**
     * <p>标签</p>
     * LIKE '%值%'
     * @param tag       值
     * @return children
     */
    public BaiduDeviceQueryWrapper tagLike(String tag){
        if(tag!=null){
            like("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * NOT LIKE '%值%'
     * @param tag       值
     * @return children
     */
    public BaiduDeviceQueryWrapper tagNotLike(String tag){
        if(tag!=null){
            notLike("tag",tag);
        }
        return this;
     }


    /**
     * <p>标签</p>
     * LIKE '%值'
     * @param tag       值
     * @return children
     */
    public BaiduDeviceQueryWrapper tagLikeLeft(String tag){
        if(tag!=null){
            likeLeft("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * LIKE '值%'
     * @param tag       值
     * @return children
     */
    public BaiduDeviceQueryWrapper tagLikeRight(String tag){
        if(tag!=null){
            likeRight("tag",tag);
        }
        return this;
     }

    /**
     * <p>标签</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper tagIsNull(){
        isNull("tag");
        return this;
    }

    /**
     * <p>标签</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper tagIsNotNull(){
        isNotNull("tag");
        return this;
    }

    /**
     * <p>标签</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper tagIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("tag",value);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper tagIn(String... values){
        if(values!=null && values.length>0){
            in("tag",values);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper tagNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("tag",value);
        }
        return this;
    }

    /**
     * <p>标签</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper tagNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("tag",values);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * 等于 =
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkEq(Boolean captureOk){
        if(captureOk!=null){
            eq("capture_ok",captureOk);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * 不等于 &lt;&gt;
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkNe(Boolean captureOk){
        if(captureOk!=null){
            ne("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * 大于 &gt;
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkGt(Boolean captureOk){
        if(captureOk!=null){
            gt("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * 大于等于 &gt;=
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkGe(Boolean captureOk){
        if(captureOk!=null){
            ge("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * 小于 &lt;
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkLt(Boolean captureOk){
        if(captureOk!=null){
            lt("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * 小于等于 &lt;=
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkLe(Boolean captureOk){
        if(captureOk!=null){
            le("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * BETWEEN 值1 AND 值2
     * @param captureOkStart       值1
     * @param captureOkEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkBetween(Boolean captureOkStart,Boolean captureOkEnd){
        if(captureOkStart!=null && captureOkEnd!=null){
            between("capture_ok",captureOkStart,captureOkEnd);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * NOT BETWEEN 值1 AND 值2
     * @param captureOkStart       值1
     * @param captureOkEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkNotBetween(Boolean captureOkStart,Boolean captureOkEnd){
        if(captureOkStart!=null && captureOkEnd!=null){
            notBetween("capture_ok",captureOkStart,captureOkEnd);
        }
        return this;
     }


    /**
     * <p>截图是否正常</p>
     * LIKE '%值%'
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkLike(Boolean captureOk){
        if(captureOk!=null){
            like("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * NOT LIKE '%值%'
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkNotLike(Boolean captureOk){
        if(captureOk!=null){
            notLike("capture_ok",captureOk);
        }
        return this;
     }


    /**
     * <p>截图是否正常</p>
     * LIKE '%值'
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkLikeLeft(Boolean captureOk){
        if(captureOk!=null){
            likeLeft("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * LIKE '值%'
     * @param captureOk       值
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkLikeRight(Boolean captureOk){
        if(captureOk!=null){
            likeRight("capture_ok",captureOk);
        }
        return this;
     }

    /**
     * <p>截图是否正常</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkIsNull(){
        isNull("capture_ok");
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkIsNotNull(){
        isNotNull("capture_ok");
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("capture_ok",value);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkIn(Boolean... values){
        if(values!=null && values.length>0){
            in("capture_ok",values);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("capture_ok",value);
        }
        return this;
    }

    /**
     * <p>截图是否正常</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper captureOkNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("capture_ok",values);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 等于 =
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffEq(Integer capDiff){
        if(capDiff!=null){
            eq("cap_diff",capDiff);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 不等于 &lt;&gt;
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffNe(Integer capDiff){
        if(capDiff!=null){
            ne("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 大于 &gt;
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffGt(Integer capDiff){
        if(capDiff!=null){
            gt("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 大于等于 &gt;=
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffGe(Integer capDiff){
        if(capDiff!=null){
            ge("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 小于 &lt;
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffLt(Integer capDiff){
        if(capDiff!=null){
            lt("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * 小于等于 &lt;=
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffLe(Integer capDiff){
        if(capDiff!=null){
            le("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * BETWEEN 值1 AND 值2
     * @param capDiffStart       值1
     * @param capDiffEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffBetween(Integer capDiffStart,Integer capDiffEnd){
        if(capDiffStart!=null && capDiffEnd!=null){
            between("cap_diff",capDiffStart,capDiffEnd);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * NOT BETWEEN 值1 AND 值2
     * @param capDiffStart       值1
     * @param capDiffEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffNotBetween(Integer capDiffStart,Integer capDiffEnd){
        if(capDiffStart!=null && capDiffEnd!=null){
            notBetween("cap_diff",capDiffStart,capDiffEnd);
        }
        return this;
     }


    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * LIKE '%值%'
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffLike(Integer capDiff){
        if(capDiff!=null){
            like("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * NOT LIKE '%值%'
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffNotLike(Integer capDiff){
        if(capDiff!=null){
            notLike("cap_diff",capDiff);
        }
        return this;
     }


    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * LIKE '%值'
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffLikeLeft(Integer capDiff){
        if(capDiff!=null){
            likeLeft("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * LIKE '值%'
     * @param capDiff       值
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffLikeRight(Integer capDiff){
        if(capDiff!=null){
            likeRight("cap_diff",capDiff);
        }
        return this;
     }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffIsNull(){
        isNull("cap_diff");
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffIsNotNull(){
        isNotNull("cap_diff");
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("cap_diff",value);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffIn(Integer... values){
        if(values!=null && values.length>0){
            in("cap_diff",values);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("cap_diff",value);
        }
        return this;
    }

    /**
     * <p>截图差异值，目前只有0 1两个值，0就是不活跃，1就是活跃</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper capDiffNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("cap_diff",values);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * 等于 =
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionEq(String dgVersion){
        if(dgVersion!=null){
            eq("dg_version",dgVersion);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * 不等于 &lt;&gt;
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionNe(String dgVersion){
        if(dgVersion!=null){
            ne("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * 大于 &gt;
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionGt(String dgVersion){
        if(dgVersion!=null){
            gt("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * 大于等于 &gt;=
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionGe(String dgVersion){
        if(dgVersion!=null){
            ge("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * 小于 &lt;
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionLt(String dgVersion){
        if(dgVersion!=null){
            lt("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * 小于等于 &lt;=
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionLe(String dgVersion){
        if(dgVersion!=null){
            le("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * BETWEEN 值1 AND 值2
     * @param dgVersionStart       值1
     * @param dgVersionEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionBetween(String dgVersionStart,String dgVersionEnd){
        if(dgVersionStart!=null && dgVersionEnd!=null){
            between("dg_version",dgVersionStart,dgVersionEnd);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgVersionStart       值1
     * @param dgVersionEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionNotBetween(String dgVersionStart,String dgVersionEnd){
        if(dgVersionStart!=null && dgVersionEnd!=null){
            notBetween("dg_version",dgVersionStart,dgVersionEnd);
        }
        return this;
     }


    /**
     * <p>dg相应字段</p>
     * LIKE '%值%'
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionLike(String dgVersion){
        if(dgVersion!=null){
            like("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * NOT LIKE '%值%'
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionNotLike(String dgVersion){
        if(dgVersion!=null){
            notLike("dg_version",dgVersion);
        }
        return this;
     }


    /**
     * <p>dg相应字段</p>
     * LIKE '%值'
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionLikeLeft(String dgVersion){
        if(dgVersion!=null){
            likeLeft("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * LIKE '值%'
     * @param dgVersion       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionLikeRight(String dgVersion){
        if(dgVersion!=null){
            likeRight("dg_version",dgVersion);
        }
        return this;
     }

    /**
     * <p>dg相应字段</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionIsNull(){
        isNull("dg_version");
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionIsNotNull(){
        isNotNull("dg_version");
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_version",value);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionIn(String... values){
        if(values!=null && values.length>0){
            in("dg_version",values);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_version",value);
        }
        return this;
    }

    /**
     * <p>dg相应字段</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_version",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeEq(String dgVersionCode){
        if(dgVersionCode!=null){
            eq("dg_version_code",dgVersionCode);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeNe(String dgVersionCode){
        if(dgVersionCode!=null){
            ne("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeGt(String dgVersionCode){
        if(dgVersionCode!=null){
            gt("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeGe(String dgVersionCode){
        if(dgVersionCode!=null){
            ge("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeLt(String dgVersionCode){
        if(dgVersionCode!=null){
            lt("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeLe(String dgVersionCode){
        if(dgVersionCode!=null){
            le("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgVersionCodeStart       值1
     * @param dgVersionCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeBetween(String dgVersionCodeStart,String dgVersionCodeEnd){
        if(dgVersionCodeStart!=null && dgVersionCodeEnd!=null){
            between("dg_version_code",dgVersionCodeStart,dgVersionCodeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgVersionCodeStart       值1
     * @param dgVersionCodeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeNotBetween(String dgVersionCodeStart,String dgVersionCodeEnd){
        if(dgVersionCodeStart!=null && dgVersionCodeEnd!=null){
            notBetween("dg_version_code",dgVersionCodeStart,dgVersionCodeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeLike(String dgVersionCode){
        if(dgVersionCode!=null){
            like("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeNotLike(String dgVersionCode){
        if(dgVersionCode!=null){
            notLike("dg_version_code",dgVersionCode);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeLikeLeft(String dgVersionCode){
        if(dgVersionCode!=null){
            likeLeft("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgVersionCode       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeLikeRight(String dgVersionCode){
        if(dgVersionCode!=null){
            likeRight("dg_version_code",dgVersionCode);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeIsNull(){
        isNull("dg_version_code");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeIsNotNull(){
        isNotNull("dg_version_code");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_version_code",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeIn(String... values){
        if(values!=null && values.length>0){
            in("dg_version_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_version_code",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgVersionCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_version_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusEq(String dgXmStatus){
        if(dgXmStatus!=null){
            eq("dg_xm_status",dgXmStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusNe(String dgXmStatus){
        if(dgXmStatus!=null){
            ne("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusGt(String dgXmStatus){
        if(dgXmStatus!=null){
            gt("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusGe(String dgXmStatus){
        if(dgXmStatus!=null){
            ge("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusLt(String dgXmStatus){
        if(dgXmStatus!=null){
            lt("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusLe(String dgXmStatus){
        if(dgXmStatus!=null){
            le("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgXmStatusStart       值1
     * @param dgXmStatusEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusBetween(String dgXmStatusStart,String dgXmStatusEnd){
        if(dgXmStatusStart!=null && dgXmStatusEnd!=null){
            between("dg_xm_status",dgXmStatusStart,dgXmStatusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgXmStatusStart       值1
     * @param dgXmStatusEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusNotBetween(String dgXmStatusStart,String dgXmStatusEnd){
        if(dgXmStatusStart!=null && dgXmStatusEnd!=null){
            notBetween("dg_xm_status",dgXmStatusStart,dgXmStatusEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusLike(String dgXmStatus){
        if(dgXmStatus!=null){
            like("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusNotLike(String dgXmStatus){
        if(dgXmStatus!=null){
            notLike("dg_xm_status",dgXmStatus);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusLikeLeft(String dgXmStatus){
        if(dgXmStatus!=null){
            likeLeft("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgXmStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusLikeRight(String dgXmStatus){
        if(dgXmStatus!=null){
            likeRight("dg_xm_status",dgXmStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusIsNull(){
        isNull("dg_xm_status");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusIsNotNull(){
        isNotNull("dg_xm_status");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_xm_status",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusIn(String... values){
        if(values!=null && values.length>0){
            in("dg_xm_status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_xm_status",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgXmStatusNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_xm_status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppEq(String dgTopApp){
        if(dgTopApp!=null){
            eq("dg_top_app",dgTopApp);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppNe(String dgTopApp){
        if(dgTopApp!=null){
            ne("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppGt(String dgTopApp){
        if(dgTopApp!=null){
            gt("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppGe(String dgTopApp){
        if(dgTopApp!=null){
            ge("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppLt(String dgTopApp){
        if(dgTopApp!=null){
            lt("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppLe(String dgTopApp){
        if(dgTopApp!=null){
            le("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgTopAppStart       值1
     * @param dgTopAppEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppBetween(String dgTopAppStart,String dgTopAppEnd){
        if(dgTopAppStart!=null && dgTopAppEnd!=null){
            between("dg_top_app",dgTopAppStart,dgTopAppEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgTopAppStart       值1
     * @param dgTopAppEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppNotBetween(String dgTopAppStart,String dgTopAppEnd){
        if(dgTopAppStart!=null && dgTopAppEnd!=null){
            notBetween("dg_top_app",dgTopAppStart,dgTopAppEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppLike(String dgTopApp){
        if(dgTopApp!=null){
            like("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppNotLike(String dgTopApp){
        if(dgTopApp!=null){
            notLike("dg_top_app",dgTopApp);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppLikeLeft(String dgTopApp){
        if(dgTopApp!=null){
            likeLeft("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgTopApp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppLikeRight(String dgTopApp){
        if(dgTopApp!=null){
            likeRight("dg_top_app",dgTopApp);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppIsNull(){
        isNull("dg_top_app");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppIsNotNull(){
        isNotNull("dg_top_app");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_top_app",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppIn(String... values){
        if(values!=null && values.length>0){
            in("dg_top_app",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_top_app",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgTopAppNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_top_app",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthEq(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            eq("dg_display_width",dgDisplayWidth);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthNe(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            ne("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthGt(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            gt("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthGe(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            ge("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthLt(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            lt("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthLe(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            le("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgDisplayWidthStart       值1
     * @param dgDisplayWidthEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthBetween(Integer dgDisplayWidthStart,Integer dgDisplayWidthEnd){
        if(dgDisplayWidthStart!=null && dgDisplayWidthEnd!=null){
            between("dg_display_width",dgDisplayWidthStart,dgDisplayWidthEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgDisplayWidthStart       值1
     * @param dgDisplayWidthEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthNotBetween(Integer dgDisplayWidthStart,Integer dgDisplayWidthEnd){
        if(dgDisplayWidthStart!=null && dgDisplayWidthEnd!=null){
            notBetween("dg_display_width",dgDisplayWidthStart,dgDisplayWidthEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthLike(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            like("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthNotLike(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            notLike("dg_display_width",dgDisplayWidth);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthLikeLeft(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            likeLeft("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgDisplayWidth       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthLikeRight(Integer dgDisplayWidth){
        if(dgDisplayWidth!=null){
            likeRight("dg_display_width",dgDisplayWidth);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthIsNull(){
        isNull("dg_display_width");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthIsNotNull(){
        isNotNull("dg_display_width");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dg_display_width",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthIn(Integer... values){
        if(values!=null && values.length>0){
            in("dg_display_width",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_display_width",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgDisplayWidthNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_display_width",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountEq(Integer dgAppsCount){
        if(dgAppsCount!=null){
            eq("dg_apps_count",dgAppsCount);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountNe(Integer dgAppsCount){
        if(dgAppsCount!=null){
            ne("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountGt(Integer dgAppsCount){
        if(dgAppsCount!=null){
            gt("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountGe(Integer dgAppsCount){
        if(dgAppsCount!=null){
            ge("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountLt(Integer dgAppsCount){
        if(dgAppsCount!=null){
            lt("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountLe(Integer dgAppsCount){
        if(dgAppsCount!=null){
            le("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgAppsCountStart       值1
     * @param dgAppsCountEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountBetween(Integer dgAppsCountStart,Integer dgAppsCountEnd){
        if(dgAppsCountStart!=null && dgAppsCountEnd!=null){
            between("dg_apps_count",dgAppsCountStart,dgAppsCountEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgAppsCountStart       值1
     * @param dgAppsCountEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountNotBetween(Integer dgAppsCountStart,Integer dgAppsCountEnd){
        if(dgAppsCountStart!=null && dgAppsCountEnd!=null){
            notBetween("dg_apps_count",dgAppsCountStart,dgAppsCountEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountLike(Integer dgAppsCount){
        if(dgAppsCount!=null){
            like("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountNotLike(Integer dgAppsCount){
        if(dgAppsCount!=null){
            notLike("dg_apps_count",dgAppsCount);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountLikeLeft(Integer dgAppsCount){
        if(dgAppsCount!=null){
            likeLeft("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgAppsCount       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountLikeRight(Integer dgAppsCount){
        if(dgAppsCount!=null){
            likeRight("dg_apps_count",dgAppsCount);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountIsNull(){
        isNull("dg_apps_count");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountIsNotNull(){
        isNotNull("dg_apps_count");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dg_apps_count",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountIn(Integer... values){
        if(values!=null && values.length>0){
            in("dg_apps_count",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_apps_count",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgAppsCountNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_apps_count",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductEq(String dgPropProduct){
        if(dgPropProduct!=null){
            eq("dg_prop_product",dgPropProduct);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductNe(String dgPropProduct){
        if(dgPropProduct!=null){
            ne("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductGt(String dgPropProduct){
        if(dgPropProduct!=null){
            gt("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductGe(String dgPropProduct){
        if(dgPropProduct!=null){
            ge("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductLt(String dgPropProduct){
        if(dgPropProduct!=null){
            lt("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductLe(String dgPropProduct){
        if(dgPropProduct!=null){
            le("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgPropProductStart       值1
     * @param dgPropProductEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductBetween(String dgPropProductStart,String dgPropProductEnd){
        if(dgPropProductStart!=null && dgPropProductEnd!=null){
            between("dg_prop_product",dgPropProductStart,dgPropProductEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgPropProductStart       值1
     * @param dgPropProductEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductNotBetween(String dgPropProductStart,String dgPropProductEnd){
        if(dgPropProductStart!=null && dgPropProductEnd!=null){
            notBetween("dg_prop_product",dgPropProductStart,dgPropProductEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductLike(String dgPropProduct){
        if(dgPropProduct!=null){
            like("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductNotLike(String dgPropProduct){
        if(dgPropProduct!=null){
            notLike("dg_prop_product",dgPropProduct);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductLikeLeft(String dgPropProduct){
        if(dgPropProduct!=null){
            likeLeft("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgPropProduct       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductLikeRight(String dgPropProduct){
        if(dgPropProduct!=null){
            likeRight("dg_prop_product",dgPropProduct);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductIsNull(){
        isNull("dg_prop_product");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductIsNotNull(){
        isNotNull("dg_prop_product");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_prop_product",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductIn(String... values){
        if(values!=null && values.length>0){
            in("dg_prop_product",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_prop_product",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgPropProductNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_prop_product",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiEq(String dgSimImei){
        if(dgSimImei!=null){
            eq("dg_sim_imei",dgSimImei);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiNe(String dgSimImei){
        if(dgSimImei!=null){
            ne("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiGt(String dgSimImei){
        if(dgSimImei!=null){
            gt("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiGe(String dgSimImei){
        if(dgSimImei!=null){
            ge("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiLt(String dgSimImei){
        if(dgSimImei!=null){
            lt("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiLe(String dgSimImei){
        if(dgSimImei!=null){
            le("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgSimImeiStart       值1
     * @param dgSimImeiEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiBetween(String dgSimImeiStart,String dgSimImeiEnd){
        if(dgSimImeiStart!=null && dgSimImeiEnd!=null){
            between("dg_sim_imei",dgSimImeiStart,dgSimImeiEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgSimImeiStart       值1
     * @param dgSimImeiEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiNotBetween(String dgSimImeiStart,String dgSimImeiEnd){
        if(dgSimImeiStart!=null && dgSimImeiEnd!=null){
            notBetween("dg_sim_imei",dgSimImeiStart,dgSimImeiEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiLike(String dgSimImei){
        if(dgSimImei!=null){
            like("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiNotLike(String dgSimImei){
        if(dgSimImei!=null){
            notLike("dg_sim_imei",dgSimImei);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiLikeLeft(String dgSimImei){
        if(dgSimImei!=null){
            likeLeft("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgSimImei       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiLikeRight(String dgSimImei){
        if(dgSimImei!=null){
            likeRight("dg_sim_imei",dgSimImei);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiIsNull(){
        isNull("dg_sim_imei");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiIsNotNull(){
        isNotNull("dg_sim_imei");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_sim_imei",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiIn(String... values){
        if(values!=null && values.length>0){
            in("dg_sim_imei",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_sim_imei",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgSimImeiNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_sim_imei",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusEq(Integer dgNetStatus){
        if(dgNetStatus!=null){
            eq("dg_net_status",dgNetStatus);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusNe(Integer dgNetStatus){
        if(dgNetStatus!=null){
            ne("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusGt(Integer dgNetStatus){
        if(dgNetStatus!=null){
            gt("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusGe(Integer dgNetStatus){
        if(dgNetStatus!=null){
            ge("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusLt(Integer dgNetStatus){
        if(dgNetStatus!=null){
            lt("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusLe(Integer dgNetStatus){
        if(dgNetStatus!=null){
            le("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgNetStatusStart       值1
     * @param dgNetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusBetween(Integer dgNetStatusStart,Integer dgNetStatusEnd){
        if(dgNetStatusStart!=null && dgNetStatusEnd!=null){
            between("dg_net_status",dgNetStatusStart,dgNetStatusEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgNetStatusStart       值1
     * @param dgNetStatusEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusNotBetween(Integer dgNetStatusStart,Integer dgNetStatusEnd){
        if(dgNetStatusStart!=null && dgNetStatusEnd!=null){
            notBetween("dg_net_status",dgNetStatusStart,dgNetStatusEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusLike(Integer dgNetStatus){
        if(dgNetStatus!=null){
            like("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusNotLike(Integer dgNetStatus){
        if(dgNetStatus!=null){
            notLike("dg_net_status",dgNetStatus);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusLikeLeft(Integer dgNetStatus){
        if(dgNetStatus!=null){
            likeLeft("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgNetStatus       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusLikeRight(Integer dgNetStatus){
        if(dgNetStatus!=null){
            likeRight("dg_net_status",dgNetStatus);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusIsNull(){
        isNull("dg_net_status");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusIsNotNull(){
        isNotNull("dg_net_status");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dg_net_status",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("dg_net_status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_net_status",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_net_status",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsEq(Integer dgNetBs){
        if(dgNetBs!=null){
            eq("dg_net_bs",dgNetBs);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsNe(Integer dgNetBs){
        if(dgNetBs!=null){
            ne("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsGt(Integer dgNetBs){
        if(dgNetBs!=null){
            gt("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsGe(Integer dgNetBs){
        if(dgNetBs!=null){
            ge("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsLt(Integer dgNetBs){
        if(dgNetBs!=null){
            lt("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsLe(Integer dgNetBs){
        if(dgNetBs!=null){
            le("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgNetBsStart       值1
     * @param dgNetBsEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsBetween(Integer dgNetBsStart,Integer dgNetBsEnd){
        if(dgNetBsStart!=null && dgNetBsEnd!=null){
            between("dg_net_bs",dgNetBsStart,dgNetBsEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgNetBsStart       值1
     * @param dgNetBsEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsNotBetween(Integer dgNetBsStart,Integer dgNetBsEnd){
        if(dgNetBsStart!=null && dgNetBsEnd!=null){
            notBetween("dg_net_bs",dgNetBsStart,dgNetBsEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsLike(Integer dgNetBs){
        if(dgNetBs!=null){
            like("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsNotLike(Integer dgNetBs){
        if(dgNetBs!=null){
            notLike("dg_net_bs",dgNetBs);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsLikeLeft(Integer dgNetBs){
        if(dgNetBs!=null){
            likeLeft("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgNetBs       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsLikeRight(Integer dgNetBs){
        if(dgNetBs!=null){
            likeRight("dg_net_bs",dgNetBs);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsIsNull(){
        isNull("dg_net_bs");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsIsNotNull(){
        isNotNull("dg_net_bs");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dg_net_bs",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsIn(Integer... values){
        if(values!=null && values.length>0){
            in("dg_net_bs",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_net_bs",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgNetBsNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_net_bs",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostEq(String dgProxyHost){
        if(dgProxyHost!=null){
            eq("dg_proxy_host",dgProxyHost);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostNe(String dgProxyHost){
        if(dgProxyHost!=null){
            ne("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostGt(String dgProxyHost){
        if(dgProxyHost!=null){
            gt("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostGe(String dgProxyHost){
        if(dgProxyHost!=null){
            ge("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostLt(String dgProxyHost){
        if(dgProxyHost!=null){
            lt("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostLe(String dgProxyHost){
        if(dgProxyHost!=null){
            le("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgProxyHostStart       值1
     * @param dgProxyHostEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostBetween(String dgProxyHostStart,String dgProxyHostEnd){
        if(dgProxyHostStart!=null && dgProxyHostEnd!=null){
            between("dg_proxy_host",dgProxyHostStart,dgProxyHostEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgProxyHostStart       值1
     * @param dgProxyHostEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostNotBetween(String dgProxyHostStart,String dgProxyHostEnd){
        if(dgProxyHostStart!=null && dgProxyHostEnd!=null){
            notBetween("dg_proxy_host",dgProxyHostStart,dgProxyHostEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostLike(String dgProxyHost){
        if(dgProxyHost!=null){
            like("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostNotLike(String dgProxyHost){
        if(dgProxyHost!=null){
            notLike("dg_proxy_host",dgProxyHost);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostLikeLeft(String dgProxyHost){
        if(dgProxyHost!=null){
            likeLeft("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgProxyHost       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostLikeRight(String dgProxyHost){
        if(dgProxyHost!=null){
            likeRight("dg_proxy_host",dgProxyHost);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostIsNull(){
        isNull("dg_proxy_host");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostIsNotNull(){
        isNotNull("dg_proxy_host");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_proxy_host",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostIn(String... values){
        if(values!=null && values.length>0){
            in("dg_proxy_host",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_proxy_host",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyHostNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_host",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortEq(Integer dgProxyPort){
        if(dgProxyPort!=null){
            eq("dg_proxy_port",dgProxyPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortNe(Integer dgProxyPort){
        if(dgProxyPort!=null){
            ne("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortGt(Integer dgProxyPort){
        if(dgProxyPort!=null){
            gt("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortGe(Integer dgProxyPort){
        if(dgProxyPort!=null){
            ge("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortLt(Integer dgProxyPort){
        if(dgProxyPort!=null){
            lt("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortLe(Integer dgProxyPort){
        if(dgProxyPort!=null){
            le("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgProxyPortStart       值1
     * @param dgProxyPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortBetween(Integer dgProxyPortStart,Integer dgProxyPortEnd){
        if(dgProxyPortStart!=null && dgProxyPortEnd!=null){
            between("dg_proxy_port",dgProxyPortStart,dgProxyPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgProxyPortStart       值1
     * @param dgProxyPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortNotBetween(Integer dgProxyPortStart,Integer dgProxyPortEnd){
        if(dgProxyPortStart!=null && dgProxyPortEnd!=null){
            notBetween("dg_proxy_port",dgProxyPortStart,dgProxyPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortLike(Integer dgProxyPort){
        if(dgProxyPort!=null){
            like("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortNotLike(Integer dgProxyPort){
        if(dgProxyPort!=null){
            notLike("dg_proxy_port",dgProxyPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortLikeLeft(Integer dgProxyPort){
        if(dgProxyPort!=null){
            likeLeft("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgProxyPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortLikeRight(Integer dgProxyPort){
        if(dgProxyPort!=null){
            likeRight("dg_proxy_port",dgProxyPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortIsNull(){
        isNull("dg_proxy_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortIsNotNull(){
        isNotNull("dg_proxy_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("dg_proxy_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("dg_proxy_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_proxy_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameEq(String dgProxyUsername){
        if(dgProxyUsername!=null){
            eq("dg_proxy_username",dgProxyUsername);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameNe(String dgProxyUsername){
        if(dgProxyUsername!=null){
            ne("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameGt(String dgProxyUsername){
        if(dgProxyUsername!=null){
            gt("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameGe(String dgProxyUsername){
        if(dgProxyUsername!=null){
            ge("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameLt(String dgProxyUsername){
        if(dgProxyUsername!=null){
            lt("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameLe(String dgProxyUsername){
        if(dgProxyUsername!=null){
            le("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgProxyUsernameStart       值1
     * @param dgProxyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameBetween(String dgProxyUsernameStart,String dgProxyUsernameEnd){
        if(dgProxyUsernameStart!=null && dgProxyUsernameEnd!=null){
            between("dg_proxy_username",dgProxyUsernameStart,dgProxyUsernameEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgProxyUsernameStart       值1
     * @param dgProxyUsernameEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameNotBetween(String dgProxyUsernameStart,String dgProxyUsernameEnd){
        if(dgProxyUsernameStart!=null && dgProxyUsernameEnd!=null){
            notBetween("dg_proxy_username",dgProxyUsernameStart,dgProxyUsernameEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameLike(String dgProxyUsername){
        if(dgProxyUsername!=null){
            like("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameNotLike(String dgProxyUsername){
        if(dgProxyUsername!=null){
            notLike("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameLikeLeft(String dgProxyUsername){
        if(dgProxyUsername!=null){
            likeLeft("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgProxyUsername       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameLikeRight(String dgProxyUsername){
        if(dgProxyUsername!=null){
            likeRight("dg_proxy_username",dgProxyUsername);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameIsNull(){
        isNull("dg_proxy_username");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameIsNotNull(){
        isNotNull("dg_proxy_username");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_proxy_username",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameIn(String... values){
        if(values!=null && values.length>0){
            in("dg_proxy_username",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_proxy_username",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyUsernameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_username",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationEq(String dgProxyLocation){
        if(dgProxyLocation!=null){
            eq("dg_proxy_location",dgProxyLocation);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationNe(String dgProxyLocation){
        if(dgProxyLocation!=null){
            ne("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationGt(String dgProxyLocation){
        if(dgProxyLocation!=null){
            gt("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationGe(String dgProxyLocation){
        if(dgProxyLocation!=null){
            ge("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationLt(String dgProxyLocation){
        if(dgProxyLocation!=null){
            lt("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationLe(String dgProxyLocation){
        if(dgProxyLocation!=null){
            le("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgProxyLocationStart       值1
     * @param dgProxyLocationEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationBetween(String dgProxyLocationStart,String dgProxyLocationEnd){
        if(dgProxyLocationStart!=null && dgProxyLocationEnd!=null){
            between("dg_proxy_location",dgProxyLocationStart,dgProxyLocationEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgProxyLocationStart       值1
     * @param dgProxyLocationEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationNotBetween(String dgProxyLocationStart,String dgProxyLocationEnd){
        if(dgProxyLocationStart!=null && dgProxyLocationEnd!=null){
            notBetween("dg_proxy_location",dgProxyLocationStart,dgProxyLocationEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationLike(String dgProxyLocation){
        if(dgProxyLocation!=null){
            like("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationNotLike(String dgProxyLocation){
        if(dgProxyLocation!=null){
            notLike("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationLikeLeft(String dgProxyLocation){
        if(dgProxyLocation!=null){
            likeLeft("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgProxyLocation       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationLikeRight(String dgProxyLocation){
        if(dgProxyLocation!=null){
            likeRight("dg_proxy_location",dgProxyLocation);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationIsNull(){
        isNull("dg_proxy_location");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationIsNotNull(){
        isNotNull("dg_proxy_location");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_proxy_location",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationIn(String... values){
        if(values!=null && values.length>0){
            in("dg_proxy_location",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_proxy_location",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyLocationNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_location",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpEq(String dgProxyIp){
        if(dgProxyIp!=null){
            eq("dg_proxy_ip",dgProxyIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpNe(String dgProxyIp){
        if(dgProxyIp!=null){
            ne("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpGt(String dgProxyIp){
        if(dgProxyIp!=null){
            gt("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpGe(String dgProxyIp){
        if(dgProxyIp!=null){
            ge("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpLt(String dgProxyIp){
        if(dgProxyIp!=null){
            lt("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpLe(String dgProxyIp){
        if(dgProxyIp!=null){
            le("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param dgProxyIpStart       值1
     * @param dgProxyIpEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpBetween(String dgProxyIpStart,String dgProxyIpEnd){
        if(dgProxyIpStart!=null && dgProxyIpEnd!=null){
            between("dg_proxy_ip",dgProxyIpStart,dgProxyIpEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param dgProxyIpStart       值1
     * @param dgProxyIpEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpNotBetween(String dgProxyIpStart,String dgProxyIpEnd){
        if(dgProxyIpStart!=null && dgProxyIpEnd!=null){
            notBetween("dg_proxy_ip",dgProxyIpStart,dgProxyIpEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpLike(String dgProxyIp){
        if(dgProxyIp!=null){
            like("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpNotLike(String dgProxyIp){
        if(dgProxyIp!=null){
            notLike("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpLikeLeft(String dgProxyIp){
        if(dgProxyIp!=null){
            likeLeft("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param dgProxyIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpLikeRight(String dgProxyIp){
        if(dgProxyIp!=null){
            likeRight("dg_proxy_ip",dgProxyIp);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpIsNull(){
        isNull("dg_proxy_ip");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpIsNotNull(){
        isNotNull("dg_proxy_ip");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("dg_proxy_ip",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpIn(String... values){
        if(values!=null && values.length>0){
            in("dg_proxy_ip",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("dg_proxy_ip",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper dgProxyIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("dg_proxy_ip",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper createTimeEq(Date createTime){
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
    public BaiduDeviceQueryWrapper createTimeNe(Date createTime){
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
    public BaiduDeviceQueryWrapper createTimeGt(Date createTime){
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
    public BaiduDeviceQueryWrapper createTimeGe(Date createTime){
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
    public BaiduDeviceQueryWrapper createTimeLt(Date createTime){
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
    public BaiduDeviceQueryWrapper createTimeLe(Date createTime){
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
    public BaiduDeviceQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduDeviceQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public BaiduDeviceQueryWrapper createTimeLike(Date createTime){
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
    public BaiduDeviceQueryWrapper createTimeNotLike(Date createTime){
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
    public BaiduDeviceQueryWrapper createTimeLikeLeft(Date createTime){
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
    public BaiduDeviceQueryWrapper createTimeLikeRight(Date createTime){
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
    public BaiduDeviceQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper createTimeIn(Collection<Date> value){
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
    public BaiduDeviceQueryWrapper createTimeIn(Date... values){
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
    public BaiduDeviceQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public BaiduDeviceQueryWrapper createTimeNotIn(Date... values){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeIn(Date... values){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public BaiduDeviceQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeEq(Date lastSyncTime){
        if(lastSyncTime!=null){
            eq("last_sync_time",lastSyncTime);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeNe(Date lastSyncTime){
        if(lastSyncTime!=null){
            ne("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeGt(Date lastSyncTime){
        if(lastSyncTime!=null){
            gt("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeGe(Date lastSyncTime){
        if(lastSyncTime!=null){
            ge("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeLt(Date lastSyncTime){
        if(lastSyncTime!=null){
            lt("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeLe(Date lastSyncTime){
        if(lastSyncTime!=null){
            le("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param lastSyncTimeStart       值1
     * @param lastSyncTimeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeBetween(Date lastSyncTimeStart,Date lastSyncTimeEnd){
        if(lastSyncTimeStart!=null && lastSyncTimeEnd!=null){
            between("last_sync_time",lastSyncTimeStart,lastSyncTimeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastSyncTimeStart       值1
     * @param lastSyncTimeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeNotBetween(Date lastSyncTimeStart,Date lastSyncTimeEnd){
        if(lastSyncTimeStart!=null && lastSyncTimeEnd!=null){
            notBetween("last_sync_time",lastSyncTimeStart,lastSyncTimeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeLike(Date lastSyncTime){
        if(lastSyncTime!=null){
            like("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeNotLike(Date lastSyncTime){
        if(lastSyncTime!=null){
            notLike("last_sync_time",lastSyncTime);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeLikeLeft(Date lastSyncTime){
        if(lastSyncTime!=null){
            likeLeft("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param lastSyncTime       值
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeLikeRight(Date lastSyncTime){
        if(lastSyncTime!=null){
            likeRight("last_sync_time",lastSyncTime);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeIsNull(){
        isNull("last_sync_time");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeIsNotNull(){
        isNotNull("last_sync_time");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_sync_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_sync_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_sync_time",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper lastSyncTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_sync_time",values);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * 等于 =
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdEq(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            eq("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * 不等于 &lt;&gt;
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdNe(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            ne("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * 大于 &gt;
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdGt(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            gt("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * 大于等于 &gt;=
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdGe(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            ge("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * 小于 &lt;
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdLt(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            lt("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * 小于等于 &lt;=
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdLe(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            le("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * BETWEEN 值1 AND 值2
     * @param fkCloudRegionIdStart       值1
     * @param fkCloudRegionIdEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdBetween(Long fkCloudRegionIdStart,Long fkCloudRegionIdEnd){
        if(fkCloudRegionIdStart!=null && fkCloudRegionIdEnd!=null){
            between("fk_cloud_region_id",fkCloudRegionIdStart,fkCloudRegionIdEnd);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkCloudRegionIdStart       值1
     * @param fkCloudRegionIdEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdNotBetween(Long fkCloudRegionIdStart,Long fkCloudRegionIdEnd){
        if(fkCloudRegionIdStart!=null && fkCloudRegionIdEnd!=null){
            notBetween("fk_cloud_region_id",fkCloudRegionIdStart,fkCloudRegionIdEnd);
        }
        return this;
     }


    /**
     * <p>机房表区域id</p>
     * LIKE '%值%'
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdLike(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            like("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * NOT LIKE '%值%'
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdNotLike(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            notLike("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }


    /**
     * <p>机房表区域id</p>
     * LIKE '%值'
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdLikeLeft(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            likeLeft("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * LIKE '值%'
     * @param fkCloudRegionId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdLikeRight(Long fkCloudRegionId){
        if(fkCloudRegionId!=null){
            likeRight("fk_cloud_region_id",fkCloudRegionId);
        }
        return this;
     }

    /**
     * <p>机房表区域id</p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdIsNull(){
        isNull("fk_cloud_region_id");
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdIsNotNull(){
        isNotNull("fk_cloud_region_id");
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_cloud_region_id",value);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_cloud_region_id",values);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_cloud_region_id",value);
        }
        return this;
    }

    /**
     * <p>机房表区域id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper fkCloudRegionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_cloud_region_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpEq(String pubIp){
        if(pubIp!=null){
            eq("pub_ip",pubIp);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpNe(String pubIp){
        if(pubIp!=null){
            ne("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpGt(String pubIp){
        if(pubIp!=null){
            gt("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpGe(String pubIp){
        if(pubIp!=null){
            ge("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpLt(String pubIp){
        if(pubIp!=null){
            lt("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpLe(String pubIp){
        if(pubIp!=null){
            le("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param pubIpStart       值1
     * @param pubIpEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpBetween(String pubIpStart,String pubIpEnd){
        if(pubIpStart!=null && pubIpEnd!=null){
            between("pub_ip",pubIpStart,pubIpEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param pubIpStart       值1
     * @param pubIpEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpNotBetween(String pubIpStart,String pubIpEnd){
        if(pubIpStart!=null && pubIpEnd!=null){
            notBetween("pub_ip",pubIpStart,pubIpEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpLike(String pubIp){
        if(pubIp!=null){
            like("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpNotLike(String pubIp){
        if(pubIp!=null){
            notLike("pub_ip",pubIp);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpLikeLeft(String pubIp){
        if(pubIp!=null){
            likeLeft("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param pubIp       值
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpLikeRight(String pubIp){
        if(pubIp!=null){
            likeRight("pub_ip",pubIp);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpIsNull(){
        isNull("pub_ip");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpIsNotNull(){
        isNotNull("pub_ip");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("pub_ip",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpIn(String... values){
        if(values!=null && values.length>0){
            in("pub_ip",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("pub_ip",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper pubIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("pub_ip",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeEq(Integer audioSockType){
        if(audioSockType!=null){
            eq("audio_sock_type",audioSockType);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeNe(Integer audioSockType){
        if(audioSockType!=null){
            ne("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeGt(Integer audioSockType){
        if(audioSockType!=null){
            gt("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeGe(Integer audioSockType){
        if(audioSockType!=null){
            ge("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeLt(Integer audioSockType){
        if(audioSockType!=null){
            lt("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeLe(Integer audioSockType){
        if(audioSockType!=null){
            le("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param audioSockTypeStart       值1
     * @param audioSockTypeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeBetween(Integer audioSockTypeStart,Integer audioSockTypeEnd){
        if(audioSockTypeStart!=null && audioSockTypeEnd!=null){
            between("audio_sock_type",audioSockTypeStart,audioSockTypeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param audioSockTypeStart       值1
     * @param audioSockTypeEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeNotBetween(Integer audioSockTypeStart,Integer audioSockTypeEnd){
        if(audioSockTypeStart!=null && audioSockTypeEnd!=null){
            notBetween("audio_sock_type",audioSockTypeStart,audioSockTypeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeLike(Integer audioSockType){
        if(audioSockType!=null){
            like("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeNotLike(Integer audioSockType){
        if(audioSockType!=null){
            notLike("audio_sock_type",audioSockType);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeLikeLeft(Integer audioSockType){
        if(audioSockType!=null){
            likeLeft("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param audioSockType       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeLikeRight(Integer audioSockType){
        if(audioSockType!=null){
            likeRight("audio_sock_type",audioSockType);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeIsNull(){
        isNull("audio_sock_type");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeIsNotNull(){
        isNotNull("audio_sock_type");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("audio_sock_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("audio_sock_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("audio_sock_type",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper audioSockTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("audio_sock_type",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortEq(Integer audioPort){
        if(audioPort!=null){
            eq("audio_port",audioPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortNe(Integer audioPort){
        if(audioPort!=null){
            ne("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortGt(Integer audioPort){
        if(audioPort!=null){
            gt("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortGe(Integer audioPort){
        if(audioPort!=null){
            ge("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortLt(Integer audioPort){
        if(audioPort!=null){
            lt("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortLe(Integer audioPort){
        if(audioPort!=null){
            le("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param audioPortStart       值1
     * @param audioPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortBetween(Integer audioPortStart,Integer audioPortEnd){
        if(audioPortStart!=null && audioPortEnd!=null){
            between("audio_port",audioPortStart,audioPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param audioPortStart       值1
     * @param audioPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortNotBetween(Integer audioPortStart,Integer audioPortEnd){
        if(audioPortStart!=null && audioPortEnd!=null){
            notBetween("audio_port",audioPortStart,audioPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortLike(Integer audioPort){
        if(audioPort!=null){
            like("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortNotLike(Integer audioPort){
        if(audioPort!=null){
            notLike("audio_port",audioPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortLikeLeft(Integer audioPort){
        if(audioPort!=null){
            likeLeft("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param audioPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortLikeRight(Integer audioPort){
        if(audioPort!=null){
            likeRight("audio_port",audioPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortIsNull(){
        isNull("audio_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortIsNotNull(){
        isNotNull("audio_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("audio_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("audio_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("audio_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper audioPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("audio_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortEq(Integer audioExternalPort){
        if(audioExternalPort!=null){
            eq("audio_external_port",audioExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortNe(Integer audioExternalPort){
        if(audioExternalPort!=null){
            ne("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortGt(Integer audioExternalPort){
        if(audioExternalPort!=null){
            gt("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortGe(Integer audioExternalPort){
        if(audioExternalPort!=null){
            ge("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortLt(Integer audioExternalPort){
        if(audioExternalPort!=null){
            lt("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortLe(Integer audioExternalPort){
        if(audioExternalPort!=null){
            le("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param audioExternalPortStart       值1
     * @param audioExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortBetween(Integer audioExternalPortStart,Integer audioExternalPortEnd){
        if(audioExternalPortStart!=null && audioExternalPortEnd!=null){
            between("audio_external_port",audioExternalPortStart,audioExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param audioExternalPortStart       值1
     * @param audioExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortNotBetween(Integer audioExternalPortStart,Integer audioExternalPortEnd){
        if(audioExternalPortStart!=null && audioExternalPortEnd!=null){
            notBetween("audio_external_port",audioExternalPortStart,audioExternalPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortLike(Integer audioExternalPort){
        if(audioExternalPort!=null){
            like("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortNotLike(Integer audioExternalPort){
        if(audioExternalPort!=null){
            notLike("audio_external_port",audioExternalPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortLikeLeft(Integer audioExternalPort){
        if(audioExternalPort!=null){
            likeLeft("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param audioExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortLikeRight(Integer audioExternalPort){
        if(audioExternalPort!=null){
            likeRight("audio_external_port",audioExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortIsNull(){
        isNull("audio_external_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortIsNotNull(){
        isNotNull("audio_external_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("audio_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("audio_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("audio_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper audioExternalPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("audio_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortEq(Integer videoPort){
        if(videoPort!=null){
            eq("video_port",videoPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortNe(Integer videoPort){
        if(videoPort!=null){
            ne("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortGt(Integer videoPort){
        if(videoPort!=null){
            gt("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortGe(Integer videoPort){
        if(videoPort!=null){
            ge("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortLt(Integer videoPort){
        if(videoPort!=null){
            lt("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortLe(Integer videoPort){
        if(videoPort!=null){
            le("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param videoPortStart       值1
     * @param videoPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortBetween(Integer videoPortStart,Integer videoPortEnd){
        if(videoPortStart!=null && videoPortEnd!=null){
            between("video_port",videoPortStart,videoPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param videoPortStart       值1
     * @param videoPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortNotBetween(Integer videoPortStart,Integer videoPortEnd){
        if(videoPortStart!=null && videoPortEnd!=null){
            notBetween("video_port",videoPortStart,videoPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortLike(Integer videoPort){
        if(videoPort!=null){
            like("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortNotLike(Integer videoPort){
        if(videoPort!=null){
            notLike("video_port",videoPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortLikeLeft(Integer videoPort){
        if(videoPort!=null){
            likeLeft("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param videoPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortLikeRight(Integer videoPort){
        if(videoPort!=null){
            likeRight("video_port",videoPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortIsNull(){
        isNull("video_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortIsNotNull(){
        isNotNull("video_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("video_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("video_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("video_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper videoPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("video_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortEq(Integer videoExternalPort){
        if(videoExternalPort!=null){
            eq("video_external_port",videoExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortNe(Integer videoExternalPort){
        if(videoExternalPort!=null){
            ne("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortGt(Integer videoExternalPort){
        if(videoExternalPort!=null){
            gt("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortGe(Integer videoExternalPort){
        if(videoExternalPort!=null){
            ge("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortLt(Integer videoExternalPort){
        if(videoExternalPort!=null){
            lt("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortLe(Integer videoExternalPort){
        if(videoExternalPort!=null){
            le("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param videoExternalPortStart       值1
     * @param videoExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortBetween(Integer videoExternalPortStart,Integer videoExternalPortEnd){
        if(videoExternalPortStart!=null && videoExternalPortEnd!=null){
            between("video_external_port",videoExternalPortStart,videoExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param videoExternalPortStart       值1
     * @param videoExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortNotBetween(Integer videoExternalPortStart,Integer videoExternalPortEnd){
        if(videoExternalPortStart!=null && videoExternalPortEnd!=null){
            notBetween("video_external_port",videoExternalPortStart,videoExternalPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortLike(Integer videoExternalPort){
        if(videoExternalPort!=null){
            like("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortNotLike(Integer videoExternalPort){
        if(videoExternalPort!=null){
            notLike("video_external_port",videoExternalPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortLikeLeft(Integer videoExternalPort){
        if(videoExternalPort!=null){
            likeLeft("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param videoExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortLikeRight(Integer videoExternalPort){
        if(videoExternalPort!=null){
            likeRight("video_external_port",videoExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortIsNull(){
        isNull("video_external_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortIsNotNull(){
        isNotNull("video_external_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("video_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("video_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("video_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper videoExternalPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("video_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsEq(Integer maxslots){
        if(maxslots!=null){
            eq("maxslots",maxslots);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsNe(Integer maxslots){
        if(maxslots!=null){
            ne("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsGt(Integer maxslots){
        if(maxslots!=null){
            gt("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsGe(Integer maxslots){
        if(maxslots!=null){
            ge("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsLt(Integer maxslots){
        if(maxslots!=null){
            lt("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsLe(Integer maxslots){
        if(maxslots!=null){
            le("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param maxslotsStart       值1
     * @param maxslotsEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsBetween(Integer maxslotsStart,Integer maxslotsEnd){
        if(maxslotsStart!=null && maxslotsEnd!=null){
            between("maxslots",maxslotsStart,maxslotsEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param maxslotsStart       值1
     * @param maxslotsEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsNotBetween(Integer maxslotsStart,Integer maxslotsEnd){
        if(maxslotsStart!=null && maxslotsEnd!=null){
            notBetween("maxslots",maxslotsStart,maxslotsEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsLike(Integer maxslots){
        if(maxslots!=null){
            like("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsNotLike(Integer maxslots){
        if(maxslots!=null){
            notLike("maxslots",maxslots);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsLikeLeft(Integer maxslots){
        if(maxslots!=null){
            likeLeft("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param maxslots       值
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsLikeRight(Integer maxslots){
        if(maxslots!=null){
            likeRight("maxslots",maxslots);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsIsNull(){
        isNull("maxslots");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsIsNotNull(){
        isNotNull("maxslots");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("maxslots",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsIn(Integer... values){
        if(values!=null && values.length>0){
            in("maxslots",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("maxslots",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper maxslotsNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("maxslots",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortEq(Integer rtcMinPort){
        if(rtcMinPort!=null){
            eq("rtc_min_port",rtcMinPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortNe(Integer rtcMinPort){
        if(rtcMinPort!=null){
            ne("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortGt(Integer rtcMinPort){
        if(rtcMinPort!=null){
            gt("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortGe(Integer rtcMinPort){
        if(rtcMinPort!=null){
            ge("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortLt(Integer rtcMinPort){
        if(rtcMinPort!=null){
            lt("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortLe(Integer rtcMinPort){
        if(rtcMinPort!=null){
            le("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rtcMinPortStart       值1
     * @param rtcMinPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortBetween(Integer rtcMinPortStart,Integer rtcMinPortEnd){
        if(rtcMinPortStart!=null && rtcMinPortEnd!=null){
            between("rtc_min_port",rtcMinPortStart,rtcMinPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rtcMinPortStart       值1
     * @param rtcMinPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortNotBetween(Integer rtcMinPortStart,Integer rtcMinPortEnd){
        if(rtcMinPortStart!=null && rtcMinPortEnd!=null){
            notBetween("rtc_min_port",rtcMinPortStart,rtcMinPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortLike(Integer rtcMinPort){
        if(rtcMinPort!=null){
            like("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortNotLike(Integer rtcMinPort){
        if(rtcMinPort!=null){
            notLike("rtc_min_port",rtcMinPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortLikeLeft(Integer rtcMinPort){
        if(rtcMinPort!=null){
            likeLeft("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rtcMinPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortLikeRight(Integer rtcMinPort){
        if(rtcMinPort!=null){
            likeRight("rtc_min_port",rtcMinPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortIsNull(){
        isNull("rtc_min_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortIsNotNull(){
        isNotNull("rtc_min_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("rtc_min_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("rtc_min_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("rtc_min_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rtc_min_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortEq(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            eq("rtc_max_port",rtcMaxPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortNe(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            ne("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortGt(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            gt("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortGe(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            ge("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortLt(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            lt("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortLe(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            le("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rtcMaxPortStart       值1
     * @param rtcMaxPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortBetween(Integer rtcMaxPortStart,Integer rtcMaxPortEnd){
        if(rtcMaxPortStart!=null && rtcMaxPortEnd!=null){
            between("rtc_max_port",rtcMaxPortStart,rtcMaxPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rtcMaxPortStart       值1
     * @param rtcMaxPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortNotBetween(Integer rtcMaxPortStart,Integer rtcMaxPortEnd){
        if(rtcMaxPortStart!=null && rtcMaxPortEnd!=null){
            notBetween("rtc_max_port",rtcMaxPortStart,rtcMaxPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortLike(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            like("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortNotLike(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            notLike("rtc_max_port",rtcMaxPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortLikeLeft(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            likeLeft("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rtcMaxPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortLikeRight(Integer rtcMaxPort){
        if(rtcMaxPort!=null){
            likeRight("rtc_max_port",rtcMaxPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortIsNull(){
        isNull("rtc_max_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortIsNotNull(){
        isNotNull("rtc_max_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("rtc_max_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("rtc_max_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("rtc_max_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rtc_max_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortEq(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            eq("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortNe(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            ne("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortGt(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            gt("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortGe(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            ge("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortLt(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            lt("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortLe(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            le("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rtcMinExternalPortStart       值1
     * @param rtcMinExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortBetween(Integer rtcMinExternalPortStart,Integer rtcMinExternalPortEnd){
        if(rtcMinExternalPortStart!=null && rtcMinExternalPortEnd!=null){
            between("rtc_min_external_port",rtcMinExternalPortStart,rtcMinExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rtcMinExternalPortStart       值1
     * @param rtcMinExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortNotBetween(Integer rtcMinExternalPortStart,Integer rtcMinExternalPortEnd){
        if(rtcMinExternalPortStart!=null && rtcMinExternalPortEnd!=null){
            notBetween("rtc_min_external_port",rtcMinExternalPortStart,rtcMinExternalPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortLike(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            like("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortNotLike(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            notLike("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortLikeLeft(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            likeLeft("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rtcMinExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortLikeRight(Integer rtcMinExternalPort){
        if(rtcMinExternalPort!=null){
            likeRight("rtc_min_external_port",rtcMinExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortIsNull(){
        isNull("rtc_min_external_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortIsNotNull(){
        isNotNull("rtc_min_external_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("rtc_min_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("rtc_min_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("rtc_min_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMinExternalPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rtc_min_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortEq(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            eq("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortNe(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            ne("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortGt(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            gt("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortGe(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            ge("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortLt(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            lt("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortLe(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            le("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param rtcMaxExternalPortStart       值1
     * @param rtcMaxExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortBetween(Integer rtcMaxExternalPortStart,Integer rtcMaxExternalPortEnd){
        if(rtcMaxExternalPortStart!=null && rtcMaxExternalPortEnd!=null){
            between("rtc_max_external_port",rtcMaxExternalPortStart,rtcMaxExternalPortEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param rtcMaxExternalPortStart       值1
     * @param rtcMaxExternalPortEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortNotBetween(Integer rtcMaxExternalPortStart,Integer rtcMaxExternalPortEnd){
        if(rtcMaxExternalPortStart!=null && rtcMaxExternalPortEnd!=null){
            notBetween("rtc_max_external_port",rtcMaxExternalPortStart,rtcMaxExternalPortEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortLike(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            like("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortNotLike(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            notLike("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortLikeLeft(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            likeLeft("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param rtcMaxExternalPort       值
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortLikeRight(Integer rtcMaxExternalPort){
        if(rtcMaxExternalPort!=null){
            likeRight("rtc_max_external_port",rtcMaxExternalPort);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortIsNull(){
        isNull("rtc_max_external_port");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortIsNotNull(){
        isNotNull("rtc_max_external_port");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("rtc_max_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortIn(Integer... values){
        if(values!=null && values.length>0){
            in("rtc_max_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("rtc_max_external_port",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper rtcMaxExternalPortNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rtc_max_external_port",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidEq(String resetTastUid){
        if(resetTastUid!=null){
            eq("reset_tast_uid",resetTastUid);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidNe(String resetTastUid){
        if(resetTastUid!=null){
            ne("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidGt(String resetTastUid){
        if(resetTastUid!=null){
            gt("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidGe(String resetTastUid){
        if(resetTastUid!=null){
            ge("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidLt(String resetTastUid){
        if(resetTastUid!=null){
            lt("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidLe(String resetTastUid){
        if(resetTastUid!=null){
            le("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param resetTastUidStart       值1
     * @param resetTastUidEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidBetween(String resetTastUidStart,String resetTastUidEnd){
        if(resetTastUidStart!=null && resetTastUidEnd!=null){
            between("reset_tast_uid",resetTastUidStart,resetTastUidEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetTastUidStart       值1
     * @param resetTastUidEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidNotBetween(String resetTastUidStart,String resetTastUidEnd){
        if(resetTastUidStart!=null && resetTastUidEnd!=null){
            notBetween("reset_tast_uid",resetTastUidStart,resetTastUidEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidLike(String resetTastUid){
        if(resetTastUid!=null){
            like("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidNotLike(String resetTastUid){
        if(resetTastUid!=null){
            notLike("reset_tast_uid",resetTastUid);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidLikeLeft(String resetTastUid){
        if(resetTastUid!=null){
            likeLeft("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param resetTastUid       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidLikeRight(String resetTastUid){
        if(resetTastUid!=null){
            likeRight("reset_tast_uid",resetTastUid);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidIsNull(){
        isNull("reset_tast_uid");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidIsNotNull(){
        isNotNull("reset_tast_uid");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("reset_tast_uid",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidIn(String... values){
        if(values!=null && values.length>0){
            in("reset_tast_uid",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_tast_uid",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetTastUidNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_tast_uid",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdEq(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            eq("upload_image_task_id",uploadImageTaskId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdNe(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            ne("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdGt(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            gt("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdGe(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            ge("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdLt(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            lt("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdLe(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            le("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param uploadImageTaskIdStart       值1
     * @param uploadImageTaskIdEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdBetween(String uploadImageTaskIdStart,String uploadImageTaskIdEnd){
        if(uploadImageTaskIdStart!=null && uploadImageTaskIdEnd!=null){
            between("upload_image_task_id",uploadImageTaskIdStart,uploadImageTaskIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param uploadImageTaskIdStart       值1
     * @param uploadImageTaskIdEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdNotBetween(String uploadImageTaskIdStart,String uploadImageTaskIdEnd){
        if(uploadImageTaskIdStart!=null && uploadImageTaskIdEnd!=null){
            notBetween("upload_image_task_id",uploadImageTaskIdStart,uploadImageTaskIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdLike(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            like("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdNotLike(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            notLike("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdLikeLeft(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            likeLeft("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param uploadImageTaskId       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdLikeRight(String uploadImageTaskId){
        if(uploadImageTaskId!=null){
            likeRight("upload_image_task_id",uploadImageTaskId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdIsNull(){
        isNull("upload_image_task_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdIsNotNull(){
        isNotNull("upload_image_task_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("upload_image_task_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdIn(String... values){
        if(values!=null && values.length>0){
            in("upload_image_task_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("upload_image_task_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadImageTaskIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("upload_image_task_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseEq(String resetReponse){
        if(resetReponse!=null){
            eq("reset_reponse",resetReponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseNe(String resetReponse){
        if(resetReponse!=null){
            ne("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseGt(String resetReponse){
        if(resetReponse!=null){
            gt("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseGe(String resetReponse){
        if(resetReponse!=null){
            ge("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseLt(String resetReponse){
        if(resetReponse!=null){
            lt("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseLe(String resetReponse){
        if(resetReponse!=null){
            le("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param resetReponseStart       值1
     * @param resetReponseEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseBetween(String resetReponseStart,String resetReponseEnd){
        if(resetReponseStart!=null && resetReponseEnd!=null){
            between("reset_reponse",resetReponseStart,resetReponseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param resetReponseStart       值1
     * @param resetReponseEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseNotBetween(String resetReponseStart,String resetReponseEnd){
        if(resetReponseStart!=null && resetReponseEnd!=null){
            notBetween("reset_reponse",resetReponseStart,resetReponseEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseLike(String resetReponse){
        if(resetReponse!=null){
            like("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseNotLike(String resetReponse){
        if(resetReponse!=null){
            notLike("reset_reponse",resetReponse);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseLikeLeft(String resetReponse){
        if(resetReponse!=null){
            likeLeft("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param resetReponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseLikeRight(String resetReponse){
        if(resetReponse!=null){
            likeRight("reset_reponse",resetReponse);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseIsNull(){
        isNull("reset_reponse");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseIsNotNull(){
        isNotNull("reset_reponse");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("reset_reponse",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseIn(String... values){
        if(values!=null && values.length>0){
            in("reset_reponse",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("reset_reponse",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper resetReponseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("reset_reponse",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseEq(String uploadResponse){
        if(uploadResponse!=null){
            eq("upload_response",uploadResponse);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseNe(String uploadResponse){
        if(uploadResponse!=null){
            ne("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseGt(String uploadResponse){
        if(uploadResponse!=null){
            gt("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseGe(String uploadResponse){
        if(uploadResponse!=null){
            ge("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseLt(String uploadResponse){
        if(uploadResponse!=null){
            lt("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseLe(String uploadResponse){
        if(uploadResponse!=null){
            le("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param uploadResponseStart       值1
     * @param uploadResponseEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseBetween(String uploadResponseStart,String uploadResponseEnd){
        if(uploadResponseStart!=null && uploadResponseEnd!=null){
            between("upload_response",uploadResponseStart,uploadResponseEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param uploadResponseStart       值1
     * @param uploadResponseEnd      值2
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseNotBetween(String uploadResponseStart,String uploadResponseEnd){
        if(uploadResponseStart!=null && uploadResponseEnd!=null){
            notBetween("upload_response",uploadResponseStart,uploadResponseEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseLike(String uploadResponse){
        if(uploadResponse!=null){
            like("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseNotLike(String uploadResponse){
        if(uploadResponse!=null){
            notLike("upload_response",uploadResponse);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseLikeLeft(String uploadResponse){
        if(uploadResponse!=null){
            likeLeft("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param uploadResponse       值
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseLikeRight(String uploadResponse){
        if(uploadResponse!=null){
            likeRight("upload_response",uploadResponse);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseIsNull(){
        isNull("upload_response");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseIsNotNull(){
        isNotNull("upload_response");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("upload_response",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseIn(String... values){
        if(values!=null && values.length>0){
            in("upload_response",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("upload_response",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public BaiduDeviceQueryWrapper uploadResponseNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("upload_response",values);
        }
        return this;
    }


}
