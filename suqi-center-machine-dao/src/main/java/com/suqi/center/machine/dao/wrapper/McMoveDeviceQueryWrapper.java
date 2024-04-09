package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.McMoveDevice;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 
 * </p>
 * "mc_move_device"
 * @author PC001
 */
public class McMoveDeviceQueryWrapper extends QueryWrapper<McMoveDevice> {


    public static McMoveDeviceQueryWrapper wrapper() {
        return new McMoveDeviceQueryWrapper();
    }

    public McMoveDeviceQueryWrapper() {
        super();
    }

    public McMoveDeviceQueryWrapper(McMoveDevice entity) {
        super(entity);
    }

    public McMoveDeviceQueryWrapper(McMoveDevice entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public McMoveDeviceQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public McMoveDeviceQueryWrapper selectColumns(Consumer<McMoveDeviceSelect> consumer) {
        McMoveDeviceSelect select = new McMoveDeviceSelect();
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
    public McMoveDeviceQueryWrapper idEq(Long id){
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
    public McMoveDeviceQueryWrapper idNe(Long id){
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
    public McMoveDeviceQueryWrapper idGt(Long id){
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
    public McMoveDeviceQueryWrapper idGe(Long id){
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
    public McMoveDeviceQueryWrapper idLt(Long id){
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
    public McMoveDeviceQueryWrapper idLe(Long id){
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
    public McMoveDeviceQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public McMoveDeviceQueryWrapper idNotBetween(Long idStart,Long idEnd){
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
    public McMoveDeviceQueryWrapper idLike(Long id){
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
    public McMoveDeviceQueryWrapper idNotLike(Long id){
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
    public McMoveDeviceQueryWrapper idLikeLeft(Long id){
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
    public McMoveDeviceQueryWrapper idLikeRight(Long id){
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
    public McMoveDeviceQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper idIn(Collection<Long> value){
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
    public McMoveDeviceQueryWrapper idIn(Long... values){
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
    public McMoveDeviceQueryWrapper idNotIn(Collection<Long> value){
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
    public McMoveDeviceQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * 等于 =
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdEq(Long fkMemberId){
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * 不等于 &lt;&gt;
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdNe(Long fkMemberId){
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 大于 &gt;
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdGt(Long fkMemberId){
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 大于等于 &gt;=
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdGe(Long fkMemberId){
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 小于 &lt;
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdLt(Long fkMemberId){
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 小于等于 &lt;=
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdLe(Long fkMemberId){
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>商户id</p>
     * LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdLike(Long fkMemberId){
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * NOT LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdNotLike(Long fkMemberId){
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>商户id</p>
     * LIKE '%值'
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdLikeLeft(Long fkMemberId){
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * LIKE '值%'
     * @param fkMemberId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdLikeRight(Long fkMemberId){
        if(fkMemberId!=null){
            likeRight("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdEq(String userPhoneId){
        if(userPhoneId!=null){
            eq("user_phone_id",userPhoneId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdNe(String userPhoneId){
        if(userPhoneId!=null){
            ne("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdGt(String userPhoneId){
        if(userPhoneId!=null){
            gt("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdGe(String userPhoneId){
        if(userPhoneId!=null){
            ge("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdLt(String userPhoneId){
        if(userPhoneId!=null){
            lt("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdLe(String userPhoneId){
        if(userPhoneId!=null){
            le("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param userPhoneIdStart       值1
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdBetween(String userPhoneIdStart,String userPhoneIdEnd){
        if(userPhoneIdStart!=null && userPhoneIdEnd!=null){
            between("user_phone_id",userPhoneIdStart,userPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param userPhoneIdStart       值1
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdNotBetween(String userPhoneIdStart,String userPhoneIdEnd){
        if(userPhoneIdStart!=null && userPhoneIdEnd!=null){
            notBetween("user_phone_id",userPhoneIdStart,userPhoneIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdLike(String userPhoneId){
        if(userPhoneId!=null){
            like("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdNotLike(String userPhoneId){
        if(userPhoneId!=null){
            notLike("user_phone_id",userPhoneId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdLikeLeft(String userPhoneId){
        if(userPhoneId!=null){
            likeLeft("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdLikeRight(String userPhoneId){
        if(userPhoneId!=null){
            likeRight("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdIsNull(){
        isNull("user_phone_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdIsNotNull(){
        isNotNull("user_phone_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("user_phone_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdIn(String... values){
        if(values!=null && values.length>0){
            in("user_phone_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("user_phone_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper userPhoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_phone_id",values);
        }
        return this;
    }

    /**
     * <p>旧设备id</p>
     * 等于 =
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdEq(String fromDeviceId){
        if(fromDeviceId!=null){
            eq("from_device_id",fromDeviceId);
        }
        return this;
    }

    /**
     * <p>旧设备id</p>
     * 不等于 &lt;&gt;
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdNe(String fromDeviceId){
        if(fromDeviceId!=null){
            ne("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 大于 &gt;
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdGt(String fromDeviceId){
        if(fromDeviceId!=null){
            gt("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 大于等于 &gt;=
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdGe(String fromDeviceId){
        if(fromDeviceId!=null){
            ge("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 小于 &lt;
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdLt(String fromDeviceId){
        if(fromDeviceId!=null){
            lt("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 小于等于 &lt;=
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdLe(String fromDeviceId){
        if(fromDeviceId!=null){
            le("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * BETWEEN 值1 AND 值2
     * @param fromDeviceIdStart       值1
     * @param fromDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdBetween(String fromDeviceIdStart,String fromDeviceIdEnd){
        if(fromDeviceIdStart!=null && fromDeviceIdEnd!=null){
            between("from_device_id",fromDeviceIdStart,fromDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fromDeviceIdStart       值1
     * @param fromDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdNotBetween(String fromDeviceIdStart,String fromDeviceIdEnd){
        if(fromDeviceIdStart!=null && fromDeviceIdEnd!=null){
            notBetween("from_device_id",fromDeviceIdStart,fromDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>旧设备id</p>
     * LIKE '%值%'
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdLike(String fromDeviceId){
        if(fromDeviceId!=null){
            like("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * NOT LIKE '%值%'
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdNotLike(String fromDeviceId){
        if(fromDeviceId!=null){
            notLike("from_device_id",fromDeviceId);
        }
        return this;
     }


    /**
     * <p>旧设备id</p>
     * LIKE '%值'
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdLikeLeft(String fromDeviceId){
        if(fromDeviceId!=null){
            likeLeft("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * LIKE '值%'
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdLikeRight(String fromDeviceId){
        if(fromDeviceId!=null){
            likeRight("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdIsNull(){
        isNull("from_device_id");
        return this;
    }

    /**
     * <p>旧设备id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdIsNotNull(){
        isNotNull("from_device_id");
        return this;
    }

    /**
     * <p>旧设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("from_device_id",value);
        }
        return this;
    }

    /**
     * <p>旧设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("from_device_id",values);
        }
        return this;
    }

    /**
     * <p>旧设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("from_device_id",value);
        }
        return this;
    }

    /**
     * <p>旧设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper fromDeviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("from_device_id",values);
        }
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * 等于 =
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdEq(String fromPhoneId){
        if(fromPhoneId!=null){
            eq("from_phone_id",fromPhoneId);
        }
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * 不等于 &lt;&gt;
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdNe(String fromPhoneId){
        if(fromPhoneId!=null){
            ne("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 大于 &gt;
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdGt(String fromPhoneId){
        if(fromPhoneId!=null){
            gt("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 大于等于 &gt;=
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdGe(String fromPhoneId){
        if(fromPhoneId!=null){
            ge("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 小于 &lt;
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdLt(String fromPhoneId){
        if(fromPhoneId!=null){
            lt("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 小于等于 &lt;=
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdLe(String fromPhoneId){
        if(fromPhoneId!=null){
            le("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * BETWEEN 值1 AND 值2
     * @param fromPhoneIdStart       值1
     * @param fromPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdBetween(String fromPhoneIdStart,String fromPhoneIdEnd){
        if(fromPhoneIdStart!=null && fromPhoneIdEnd!=null){
            between("from_phone_id",fromPhoneIdStart,fromPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fromPhoneIdStart       值1
     * @param fromPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdNotBetween(String fromPhoneIdStart,String fromPhoneIdEnd){
        if(fromPhoneIdStart!=null && fromPhoneIdEnd!=null){
            notBetween("from_phone_id",fromPhoneIdStart,fromPhoneIdEnd);
        }
        return this;
     }


    /**
     * <p>旧云手机ID</p>
     * LIKE '%值%'
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdLike(String fromPhoneId){
        if(fromPhoneId!=null){
            like("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * NOT LIKE '%值%'
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdNotLike(String fromPhoneId){
        if(fromPhoneId!=null){
            notLike("from_phone_id",fromPhoneId);
        }
        return this;
     }


    /**
     * <p>旧云手机ID</p>
     * LIKE '%值'
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdLikeLeft(String fromPhoneId){
        if(fromPhoneId!=null){
            likeLeft("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * LIKE '值%'
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdLikeRight(String fromPhoneId){
        if(fromPhoneId!=null){
            likeRight("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdIsNull(){
        isNull("from_phone_id");
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdIsNotNull(){
        isNotNull("from_phone_id");
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("from_phone_id",value);
        }
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdIn(String... values){
        if(values!=null && values.length>0){
            in("from_phone_id",values);
        }
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("from_phone_id",value);
        }
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper fromPhoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("from_phone_id",values);
        }
        return this;
    }

    /**
     * <p>新设备id</p>
     * 等于 =
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdEq(String toDeviceId){
        if(toDeviceId!=null){
            eq("to_device_id",toDeviceId);
        }
        return this;
    }

    /**
     * <p>新设备id</p>
     * 不等于 &lt;&gt;
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdNe(String toDeviceId){
        if(toDeviceId!=null){
            ne("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 大于 &gt;
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdGt(String toDeviceId){
        if(toDeviceId!=null){
            gt("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 大于等于 &gt;=
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdGe(String toDeviceId){
        if(toDeviceId!=null){
            ge("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 小于 &lt;
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdLt(String toDeviceId){
        if(toDeviceId!=null){
            lt("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 小于等于 &lt;=
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdLe(String toDeviceId){
        if(toDeviceId!=null){
            le("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * BETWEEN 值1 AND 值2
     * @param toDeviceIdStart       值1
     * @param toDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdBetween(String toDeviceIdStart,String toDeviceIdEnd){
        if(toDeviceIdStart!=null && toDeviceIdEnd!=null){
            between("to_device_id",toDeviceIdStart,toDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param toDeviceIdStart       值1
     * @param toDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdNotBetween(String toDeviceIdStart,String toDeviceIdEnd){
        if(toDeviceIdStart!=null && toDeviceIdEnd!=null){
            notBetween("to_device_id",toDeviceIdStart,toDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>新设备id</p>
     * LIKE '%值%'
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdLike(String toDeviceId){
        if(toDeviceId!=null){
            like("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * NOT LIKE '%值%'
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdNotLike(String toDeviceId){
        if(toDeviceId!=null){
            notLike("to_device_id",toDeviceId);
        }
        return this;
     }


    /**
     * <p>新设备id</p>
     * LIKE '%值'
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdLikeLeft(String toDeviceId){
        if(toDeviceId!=null){
            likeLeft("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * LIKE '值%'
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdLikeRight(String toDeviceId){
        if(toDeviceId!=null){
            likeRight("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdIsNull(){
        isNull("to_device_id");
        return this;
    }

    /**
     * <p>新设备id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdIsNotNull(){
        isNotNull("to_device_id");
        return this;
    }

    /**
     * <p>新设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("to_device_id",value);
        }
        return this;
    }

    /**
     * <p>新设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("to_device_id",values);
        }
        return this;
    }

    /**
     * <p>新设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("to_device_id",value);
        }
        return this;
    }

    /**
     * <p>新设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper toDeviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("to_device_id",values);
        }
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * 等于 =
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdEq(String toPhoneId){
        if(toPhoneId!=null){
            eq("to_phone_id",toPhoneId);
        }
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * 不等于 &lt;&gt;
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdNe(String toPhoneId){
        if(toPhoneId!=null){
            ne("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 大于 &gt;
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdGt(String toPhoneId){
        if(toPhoneId!=null){
            gt("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 大于等于 &gt;=
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdGe(String toPhoneId){
        if(toPhoneId!=null){
            ge("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 小于 &lt;
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdLt(String toPhoneId){
        if(toPhoneId!=null){
            lt("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 小于等于 &lt;=
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdLe(String toPhoneId){
        if(toPhoneId!=null){
            le("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * BETWEEN 值1 AND 值2
     * @param toPhoneIdStart       值1
     * @param toPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdBetween(String toPhoneIdStart,String toPhoneIdEnd){
        if(toPhoneIdStart!=null && toPhoneIdEnd!=null){
            between("to_phone_id",toPhoneIdStart,toPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param toPhoneIdStart       值1
     * @param toPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdNotBetween(String toPhoneIdStart,String toPhoneIdEnd){
        if(toPhoneIdStart!=null && toPhoneIdEnd!=null){
            notBetween("to_phone_id",toPhoneIdStart,toPhoneIdEnd);
        }
        return this;
     }


    /**
     * <p>新设备云手机ID</p>
     * LIKE '%值%'
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdLike(String toPhoneId){
        if(toPhoneId!=null){
            like("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * NOT LIKE '%值%'
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdNotLike(String toPhoneId){
        if(toPhoneId!=null){
            notLike("to_phone_id",toPhoneId);
        }
        return this;
     }


    /**
     * <p>新设备云手机ID</p>
     * LIKE '%值'
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdLikeLeft(String toPhoneId){
        if(toPhoneId!=null){
            likeLeft("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * LIKE '值%'
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdLikeRight(String toPhoneId){
        if(toPhoneId!=null){
            likeRight("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdIsNull(){
        isNull("to_phone_id");
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdIsNotNull(){
        isNotNull("to_phone_id");
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("to_phone_id",value);
        }
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdIn(String... values){
        if(values!=null && values.length>0){
            in("to_phone_id",values);
        }
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("to_phone_id",value);
        }
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper toPhoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("to_phone_id",values);
        }
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 等于 =
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesEq(String includeFiles){
        if(includeFiles!=null){
            eq("include_files",includeFiles);
        }
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 不等于 &lt;&gt;
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesNe(String includeFiles){
        if(includeFiles!=null){
            ne("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 大于 &gt;
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesGt(String includeFiles){
        if(includeFiles!=null){
            gt("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 大于等于 &gt;=
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesGe(String includeFiles){
        if(includeFiles!=null){
            ge("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 小于 &lt;
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesLt(String includeFiles){
        if(includeFiles!=null){
            lt("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 小于等于 &lt;=
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesLe(String includeFiles){
        if(includeFiles!=null){
            le("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * BETWEEN 值1 AND 值2
     * @param includeFilesStart       值1
     * @param includeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesBetween(String includeFilesStart,String includeFilesEnd){
        if(includeFilesStart!=null && includeFilesEnd!=null){
            between("include_files",includeFilesStart,includeFilesEnd);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT BETWEEN 值1 AND 值2
     * @param includeFilesStart       值1
     * @param includeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesNotBetween(String includeFilesStart,String includeFilesEnd){
        if(includeFilesStart!=null && includeFilesEnd!=null){
            notBetween("include_files",includeFilesStart,includeFilesEnd);
        }
        return this;
     }


    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值%'
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesLike(String includeFiles){
        if(includeFiles!=null){
            like("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT LIKE '%值%'
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesNotLike(String includeFiles){
        if(includeFiles!=null){
            notLike("include_files",includeFiles);
        }
        return this;
     }


    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值'
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesLikeLeft(String includeFiles){
        if(includeFiles!=null){
            likeLeft("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '值%'
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesLikeRight(String includeFiles){
        if(includeFiles!=null){
            likeRight("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesIsNull(){
        isNull("include_files");
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesIsNotNull(){
        isNotNull("include_files");
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("include_files",value);
        }
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesIn(String... values){
        if(values!=null && values.length>0){
            in("include_files",values);
        }
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("include_files",value);
        }
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper includeFilesNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("include_files",values);
        }
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 等于 =
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesEq(String excludeFiles){
        if(excludeFiles!=null){
            eq("exclude_files",excludeFiles);
        }
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 不等于 &lt;&gt;
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesNe(String excludeFiles){
        if(excludeFiles!=null){
            ne("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 大于 &gt;
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesGt(String excludeFiles){
        if(excludeFiles!=null){
            gt("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 大于等于 &gt;=
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesGe(String excludeFiles){
        if(excludeFiles!=null){
            ge("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 小于 &lt;
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesLt(String excludeFiles){
        if(excludeFiles!=null){
            lt("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 小于等于 &lt;=
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesLe(String excludeFiles){
        if(excludeFiles!=null){
            le("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * BETWEEN 值1 AND 值2
     * @param excludeFilesStart       值1
     * @param excludeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesBetween(String excludeFilesStart,String excludeFilesEnd){
        if(excludeFilesStart!=null && excludeFilesEnd!=null){
            between("exclude_files",excludeFilesStart,excludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * NOT BETWEEN 值1 AND 值2
     * @param excludeFilesStart       值1
     * @param excludeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesNotBetween(String excludeFilesStart,String excludeFilesEnd){
        if(excludeFilesStart!=null && excludeFilesEnd!=null){
            notBetween("exclude_files",excludeFilesStart,excludeFilesEnd);
        }
        return this;
     }


    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * LIKE '%值%'
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesLike(String excludeFiles){
        if(excludeFiles!=null){
            like("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * NOT LIKE '%值%'
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesNotLike(String excludeFiles){
        if(excludeFiles!=null){
            notLike("exclude_files",excludeFiles);
        }
        return this;
     }


    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * LIKE '%值'
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesLikeLeft(String excludeFiles){
        if(excludeFiles!=null){
            likeLeft("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * LIKE '值%'
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesLikeRight(String excludeFiles){
        if(excludeFiles!=null){
            likeRight("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesIsNull(){
        isNull("exclude_files");
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesIsNotNull(){
        isNotNull("exclude_files");
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("exclude_files",value);
        }
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesIn(String... values){
        if(values!=null && values.length>0){
            in("exclude_files",values);
        }
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("exclude_files",value);
        }
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper excludeFilesNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("exclude_files",values);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 等于 =
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameEq(String bucketName){
        if(bucketName!=null){
            eq("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 不等于 &lt;&gt;
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameNe(String bucketName){
        if(bucketName!=null){
            ne("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 大于 &gt;
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameGt(String bucketName){
        if(bucketName!=null){
            gt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 大于等于 &gt;=
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameGe(String bucketName){
        if(bucketName!=null){
            ge("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 小于 &lt;
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameLt(String bucketName){
        if(bucketName!=null){
            lt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 小于等于 &lt;=
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameLe(String bucketName){
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * BETWEEN 值1 AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            between("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * NOT BETWEEN 值1 AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        if(bucketNameStart!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * LIKE '%值%'
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameLike(String bucketName){
        if(bucketName!=null){
            like("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * NOT LIKE '%值%'
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameNotLike(String bucketName){
        if(bucketName!=null){
            notLike("bucket_name",bucketName);
        }
        return this;
     }


    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * LIKE '%值'
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameLikeLeft(String bucketName){
        if(bucketName!=null){
            likeLeft("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * LIKE '值%'
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameLikeRight(String bucketName){
        if(bucketName!=null){
            likeRight("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("bucket_name",value);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameIn(String... values){
        if(values!=null && values.length>0){
            in("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("bucket_name",value);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper bucketNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bucket_name",values);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 等于 =
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathEq(String objectPath){
        if(objectPath!=null){
            eq("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 不等于 &lt;&gt;
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathNe(String objectPath){
        if(objectPath!=null){
            ne("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 大于 &gt;
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathGt(String objectPath){
        if(objectPath!=null){
            gt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 大于等于 &gt;=
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathGe(String objectPath){
        if(objectPath!=null){
            ge("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 小于 &lt;
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathLt(String objectPath){
        if(objectPath!=null){
            lt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 小于等于 &lt;=
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathLe(String objectPath){
        if(objectPath!=null){
            le("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * BETWEEN 值1 AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathBetween(String objectPathStart,String objectPathEnd){
        if(objectPathStart!=null && objectPathEnd!=null){
            between("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT BETWEEN 值1 AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathNotBetween(String objectPathStart,String objectPathEnd){
        if(objectPathStart!=null && objectPathEnd!=null){
            notBetween("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }


    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值%'
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathLike(String objectPath){
        if(objectPath!=null){
            like("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT LIKE '%值%'
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathNotLike(String objectPath){
        if(objectPath!=null){
            notLike("object_path",objectPath);
        }
        return this;
     }


    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值'
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathLikeLeft(String objectPath){
        if(objectPath!=null){
            likeLeft("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '值%'
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathLikeRight(String objectPath){
        if(objectPath!=null){
            likeRight("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathIsNull(){
        isNull("object_path");
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathIsNotNull(){
        isNotNull("object_path");
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("object_path",value);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathIn(String... values){
        if(values!=null && values.length>0){
            in("object_path",values);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("object_path",value);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper objectPathNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("object_path",values);
        }
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeEq(Date createTime){
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * 不等于 &lt;&gt;
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeNe(Date createTime){
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 大于 &gt;
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeGt(Date createTime){
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 大于等于 &gt;=
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeGe(Date createTime){
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 小于 &lt;
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeLt(Date createTime){
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 小于等于 &lt;=
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        if(createTimeStart!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>申请换机时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeLike(Date createTime){
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * NOT LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeNotLike(Date createTime){
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>申请换机时间</p>
     * LIKE '%值'
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeLikeLeft(Date createTime){
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * LIKE '值%'
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeLikeRight(Date createTime){
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("create_time",value);
        }
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("create_time",values);
        }
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("create_time",value);
        }
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McMoveDeviceQueryWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public McMoveDeviceQueryWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public McMoveDeviceQueryWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public McMoveDeviceQueryWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public McMoveDeviceQueryWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public McMoveDeviceQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McMoveDeviceQueryWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McMoveDeviceQueryWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public McMoveDeviceQueryWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public McMoveDeviceQueryWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>最后任务id</p>
     * 等于 =
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdEq(String jobId){
        if(jobId!=null){
            eq("job_id",jobId);
        }
        return this;
    }

    /**
     * <p>最后任务id</p>
     * 不等于 &lt;&gt;
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdNe(String jobId){
        if(jobId!=null){
            ne("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 大于 &gt;
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdGt(String jobId){
        if(jobId!=null){
            gt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 大于等于 &gt;=
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdGe(String jobId){
        if(jobId!=null){
            ge("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 小于 &lt;
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdLt(String jobId){
        if(jobId!=null){
            lt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 小于等于 &lt;=
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdLe(String jobId){
        if(jobId!=null){
            le("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * BETWEEN 值1 AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdBetween(String jobIdStart,String jobIdEnd){
        if(jobIdStart!=null && jobIdEnd!=null){
            between("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdNotBetween(String jobIdStart,String jobIdEnd){
        if(jobIdStart!=null && jobIdEnd!=null){
            notBetween("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }


    /**
     * <p>最后任务id</p>
     * LIKE '%值%'
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdLike(String jobId){
        if(jobId!=null){
            like("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * NOT LIKE '%值%'
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdNotLike(String jobId){
        if(jobId!=null){
            notLike("job_id",jobId);
        }
        return this;
     }


    /**
     * <p>最后任务id</p>
     * LIKE '%值'
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdLikeLeft(String jobId){
        if(jobId!=null){
            likeLeft("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * LIKE '值%'
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdLikeRight(String jobId){
        if(jobId!=null){
            likeRight("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdIsNull(){
        isNull("job_id");
        return this;
    }

    /**
     * <p>最后任务id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdIsNotNull(){
        isNotNull("job_id");
        return this;
    }

    /**
     * <p>最后任务id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("job_id",value);
        }
        return this;
    }

    /**
     * <p>最后任务id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdIn(String... values){
        if(values!=null && values.length>0){
            in("job_id",values);
        }
        return this;
    }

    /**
     * <p>最后任务id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("job_id",value);
        }
        return this;
    }

    /**
     * <p>最后任务id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper jobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("job_id",values);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveDeviceQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeIn(Date... values){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McMoveDeviceQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeEq(String specCode){
        if(specCode!=null){
            eq("spec_code",specCode);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeNe(String specCode){
        if(specCode!=null){
            ne("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeGt(String specCode){
        if(specCode!=null){
            gt("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeGe(String specCode){
        if(specCode!=null){
            ge("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeLt(String specCode){
        if(specCode!=null){
            lt("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeLe(String specCode){
        if(specCode!=null){
            le("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param specCodeStart       值1
     * @param specCodeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeBetween(String specCodeStart,String specCodeEnd){
        if(specCodeStart!=null && specCodeEnd!=null){
            between("spec_code",specCodeStart,specCodeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param specCodeStart       值1
     * @param specCodeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeNotBetween(String specCodeStart,String specCodeEnd){
        if(specCodeStart!=null && specCodeEnd!=null){
            notBetween("spec_code",specCodeStart,specCodeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeLike(String specCode){
        if(specCode!=null){
            like("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeNotLike(String specCode){
        if(specCode!=null){
            notLike("spec_code",specCode);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeLikeLeft(String specCode){
        if(specCode!=null){
            likeLeft("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeLikeRight(String specCode){
        if(specCode!=null){
            likeRight("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeIsNull(){
        isNull("spec_code");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeIsNotNull(){
        isNotNull("spec_code");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("spec_code",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeIn(String... values){
        if(values!=null && values.length>0){
            in("spec_code",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("spec_code",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper specCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("spec_code",values);
        }
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 等于 =
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseEq(Boolean releaseUse){
        if(releaseUse!=null){
            eq("release_use",releaseUse);
        }
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 不等于 &lt;&gt;
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseNe(Boolean releaseUse){
        if(releaseUse!=null){
            ne("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 大于 &gt;
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseGt(Boolean releaseUse){
        if(releaseUse!=null){
            gt("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 大于等于 &gt;=
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseGe(Boolean releaseUse){
        if(releaseUse!=null){
            ge("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 小于 &lt;
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseLt(Boolean releaseUse){
        if(releaseUse!=null){
            lt("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 小于等于 &lt;=
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseLe(Boolean releaseUse){
        if(releaseUse!=null){
            le("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * BETWEEN 值1 AND 值2
     * @param releaseUseStart       值1
     * @param releaseUseEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseBetween(Boolean releaseUseStart,Boolean releaseUseEnd){
        if(releaseUseStart!=null && releaseUseEnd!=null){
            between("release_use",releaseUseStart,releaseUseEnd);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param releaseUseStart       值1
     * @param releaseUseEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseNotBetween(Boolean releaseUseStart,Boolean releaseUseEnd){
        if(releaseUseStart!=null && releaseUseEnd!=null){
            notBetween("release_use",releaseUseStart,releaseUseEnd);
        }
        return this;
     }


    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * LIKE '%值%'
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseLike(Boolean releaseUse){
        if(releaseUse!=null){
            like("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * NOT LIKE '%值%'
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseNotLike(Boolean releaseUse){
        if(releaseUse!=null){
            notLike("release_use",releaseUse);
        }
        return this;
     }


    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * LIKE '%值'
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseLikeLeft(Boolean releaseUse){
        if(releaseUse!=null){
            likeLeft("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * LIKE '值%'
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseLikeRight(Boolean releaseUse){
        if(releaseUse!=null){
            likeRight("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseIsNull(){
        isNull("release_use");
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseIsNotNull(){
        isNotNull("release_use");
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("release_use",value);
        }
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseIn(Boolean... values){
        if(values!=null && values.length>0){
            in("release_use",values);
        }
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("release_use",value);
        }
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper releaseUseNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("release_use",values);
        }
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 等于 =
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationEq(Boolean dataMigration){
        if(dataMigration!=null){
            eq("data_migration",dataMigration);
        }
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 不等于 &lt;&gt;
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationNe(Boolean dataMigration){
        if(dataMigration!=null){
            ne("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 大于 &gt;
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationGt(Boolean dataMigration){
        if(dataMigration!=null){
            gt("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 大于等于 &gt;=
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationGe(Boolean dataMigration){
        if(dataMigration!=null){
            ge("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 小于 &lt;
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationLt(Boolean dataMigration){
        if(dataMigration!=null){
            lt("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 小于等于 &lt;=
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationLe(Boolean dataMigration){
        if(dataMigration!=null){
            le("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * BETWEEN 值1 AND 值2
     * @param dataMigrationStart       值1
     * @param dataMigrationEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationBetween(Boolean dataMigrationStart,Boolean dataMigrationEnd){
        if(dataMigrationStart!=null && dataMigrationEnd!=null){
            between("data_migration",dataMigrationStart,dataMigrationEnd);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * NOT BETWEEN 值1 AND 值2
     * @param dataMigrationStart       值1
     * @param dataMigrationEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationNotBetween(Boolean dataMigrationStart,Boolean dataMigrationEnd){
        if(dataMigrationStart!=null && dataMigrationEnd!=null){
            notBetween("data_migration",dataMigrationStart,dataMigrationEnd);
        }
        return this;
     }


    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * LIKE '%值%'
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationLike(Boolean dataMigration){
        if(dataMigration!=null){
            like("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * NOT LIKE '%值%'
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationNotLike(Boolean dataMigration){
        if(dataMigration!=null){
            notLike("data_migration",dataMigration);
        }
        return this;
     }


    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * LIKE '%值'
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationLikeLeft(Boolean dataMigration){
        if(dataMigration!=null){
            likeLeft("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * LIKE '值%'
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationLikeRight(Boolean dataMigration){
        if(dataMigration!=null){
            likeRight("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationIsNull(){
        isNull("data_migration");
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationIsNotNull(){
        isNotNull("data_migration");
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("data_migration",value);
        }
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationIn(Boolean... values){
        if(values!=null && values.length>0){
            in("data_migration",values);
        }
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("data_migration",value);
        }
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper dataMigrationNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("data_migration",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdEq(String taskId){
        if(taskId!=null){
            eq("task_id",taskId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdNe(String taskId){
        if(taskId!=null){
            ne("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdGt(String taskId){
        if(taskId!=null){
            gt("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdGe(String taskId){
        if(taskId!=null){
            ge("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdLt(String taskId){
        if(taskId!=null){
            lt("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdLe(String taskId){
        if(taskId!=null){
            le("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param taskIdStart       值1
     * @param taskIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdBetween(String taskIdStart,String taskIdEnd){
        if(taskIdStart!=null && taskIdEnd!=null){
            between("task_id",taskIdStart,taskIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param taskIdStart       值1
     * @param taskIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdNotBetween(String taskIdStart,String taskIdEnd){
        if(taskIdStart!=null && taskIdEnd!=null){
            notBetween("task_id",taskIdStart,taskIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdLike(String taskId){
        if(taskId!=null){
            like("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdNotLike(String taskId){
        if(taskId!=null){
            notLike("task_id",taskId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdLikeLeft(String taskId){
        if(taskId!=null){
            likeLeft("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdLikeRight(String taskId){
        if(taskId!=null){
            likeRight("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdIsNull(){
        isNull("task_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdIsNotNull(){
        isNotNull("task_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("task_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdIn(String... values){
        if(values!=null && values.length>0){
            in("task_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("task_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryWrapper taskIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("task_id",values);
        }
        return this;
    }


}
