package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.YunMemberUserDevice;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 商户用户设备表（yun_member_user_device）
 * </p>
 * "yun_member_user_device"
 * @author PC001
 */
public class YunMemberUserDeviceQueryWrapper extends QueryWrapper<YunMemberUserDevice> {


    public static YunMemberUserDeviceQueryWrapper wrapper() {
        return new YunMemberUserDeviceQueryWrapper();
    }

    public YunMemberUserDeviceQueryWrapper() {
        super();
    }

    public YunMemberUserDeviceQueryWrapper(YunMemberUserDevice entity) {
        super(entity);
    }

    public YunMemberUserDeviceQueryWrapper(YunMemberUserDevice entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public YunMemberUserDeviceQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public YunMemberUserDeviceQueryWrapper selectColumns(Consumer<YunMemberUserDeviceSelect> consumer) {
        YunMemberUserDeviceSelect select = new YunMemberUserDeviceSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p>id</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p>id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p>id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p>id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper idNotIn(Long... values){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdEq(Long fkMemberId){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdNe(Long fkMemberId){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdGt(Long fkMemberId){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdGe(Long fkMemberId){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdLt(Long fkMemberId){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdLe(Long fkMemberId){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdLike(Long fkMemberId){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdNotLike(Long fkMemberId){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdLikeLeft(Long fkMemberId){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkMemberIdIn(Collection<Long> value){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdIn(Long... values){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public YunMemberUserDeviceQueryWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * 等于 =
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdEq(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            eq("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * 不等于 &lt;&gt;
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdNe(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            ne("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * 大于 &gt;
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdGt(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            gt("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * 大于等于 &gt;=
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdGe(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            ge("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * 小于 &lt;
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdLt(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            lt("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * 小于等于 &lt;=
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdLe(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            le("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * BETWEEN 值1 AND 值2
     * @param fkYunMemberFacilitiesIdStart       值1
     * @param fkYunMemberFacilitiesIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdBetween(Long fkYunMemberFacilitiesIdStart,Long fkYunMemberFacilitiesIdEnd){
        if(fkYunMemberFacilitiesIdStart!=null && fkYunMemberFacilitiesIdEnd!=null){
            between("fk_yun_member_facilities_id",fkYunMemberFacilitiesIdStart,fkYunMemberFacilitiesIdEnd);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkYunMemberFacilitiesIdStart       值1
     * @param fkYunMemberFacilitiesIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdNotBetween(Long fkYunMemberFacilitiesIdStart,Long fkYunMemberFacilitiesIdEnd){
        if(fkYunMemberFacilitiesIdStart!=null && fkYunMemberFacilitiesIdEnd!=null){
            notBetween("fk_yun_member_facilities_id",fkYunMemberFacilitiesIdStart,fkYunMemberFacilitiesIdEnd);
        }
        return this;
     }


    /**
     * <p>商户设备表id</p>
     * LIKE '%值%'
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdLike(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            like("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * NOT LIKE '%值%'
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdNotLike(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            notLike("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }


    /**
     * <p>商户设备表id</p>
     * LIKE '%值'
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdLikeLeft(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            likeLeft("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * LIKE '值%'
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdLikeRight(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            likeRight("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdIsNull(){
        isNull("fk_yun_member_facilities_id");
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdIsNotNull(){
        isNotNull("fk_yun_member_facilities_id");
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_yun_member_facilities_id",value);
        }
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_yun_member_facilities_id",values);
        }
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_yun_member_facilities_id",value);
        }
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkYunMemberFacilitiesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_yun_member_facilities_id",values);
        }
        return this;
    }

    /**
     * <p>商户用户id</p>
     * 等于 =
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdEq(String userId){
        if(userId!=null){
            eq("user_id",userId);
        }
        return this;
    }

    /**
     * <p>商户用户id</p>
     * 不等于 &lt;&gt;
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdNe(String userId){
        if(userId!=null){
            ne("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * 大于 &gt;
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdGt(String userId){
        if(userId!=null){
            gt("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * 大于等于 &gt;=
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdGe(String userId){
        if(userId!=null){
            ge("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * 小于 &lt;
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdLt(String userId){
        if(userId!=null){
            lt("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * 小于等于 &lt;=
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdLe(String userId){
        if(userId!=null){
            le("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * BETWEEN 值1 AND 值2
     * @param userIdStart       值1
     * @param userIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdBetween(String userIdStart,String userIdEnd){
        if(userIdStart!=null && userIdEnd!=null){
            between("user_id",userIdStart,userIdEnd);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param userIdStart       值1
     * @param userIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdNotBetween(String userIdStart,String userIdEnd){
        if(userIdStart!=null && userIdEnd!=null){
            notBetween("user_id",userIdStart,userIdEnd);
        }
        return this;
     }


    /**
     * <p>商户用户id</p>
     * LIKE '%值%'
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdLike(String userId){
        if(userId!=null){
            like("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * NOT LIKE '%值%'
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdNotLike(String userId){
        if(userId!=null){
            notLike("user_id",userId);
        }
        return this;
     }


    /**
     * <p>商户用户id</p>
     * LIKE '%值'
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdLikeLeft(String userId){
        if(userId!=null){
            likeLeft("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * LIKE '值%'
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdLikeRight(String userId){
        if(userId!=null){
            likeRight("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdIsNull(){
        isNull("user_id");
        return this;
    }

    /**
     * <p>商户用户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdIsNotNull(){
        isNotNull("user_id");
        return this;
    }

    /**
     * <p>商户用户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("user_id",value);
        }
        return this;
    }

    /**
     * <p>商户用户id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdIn(String... values){
        if(values!=null && values.length>0){
            in("user_id",values);
        }
        return this;
    }

    /**
     * <p>商户用户id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("user_id",value);
        }
        return this;
    }

    /**
     * <p>商户用户id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_id",values);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * 等于 =
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdEq(String facilitiesId){
        if(facilitiesId!=null){
            eq("facilities_id",facilitiesId);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * 不等于 &lt;&gt;
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdNe(String facilitiesId){
        if(facilitiesId!=null){
            ne("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 大于 &gt;
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdGt(String facilitiesId){
        if(facilitiesId!=null){
            gt("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 大于等于 &gt;=
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdGe(String facilitiesId){
        if(facilitiesId!=null){
            ge("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 小于 &lt;
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdLt(String facilitiesId){
        if(facilitiesId!=null){
            lt("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 小于等于 &lt;=
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdLe(String facilitiesId){
        if(facilitiesId!=null){
            le("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * BETWEEN 值1 AND 值2
     * @param facilitiesIdStart       值1
     * @param facilitiesIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdBetween(String facilitiesIdStart,String facilitiesIdEnd){
        if(facilitiesIdStart!=null && facilitiesIdEnd!=null){
            between("facilities_id",facilitiesIdStart,facilitiesIdEnd);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param facilitiesIdStart       值1
     * @param facilitiesIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdNotBetween(String facilitiesIdStart,String facilitiesIdEnd){
        if(facilitiesIdStart!=null && facilitiesIdEnd!=null){
            notBetween("facilities_id",facilitiesIdStart,facilitiesIdEnd);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值%'
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdLike(String facilitiesId){
        if(facilitiesId!=null){
            like("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT LIKE '%值%'
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdNotLike(String facilitiesId){
        if(facilitiesId!=null){
            notLike("facilities_id",facilitiesId);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值'
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdLikeLeft(String facilitiesId){
        if(facilitiesId!=null){
            likeLeft("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * LIKE '值%'
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdLikeRight(String facilitiesId){
        if(facilitiesId!=null){
            likeRight("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdIsNull(){
        isNull("facilities_id");
        return this;
    }

    /**
     * <p>设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdIsNotNull(){
        isNotNull("facilities_id");
        return this;
    }

    /**
     * <p>设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("facilities_id",value);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdIn(String... values){
        if(values!=null && values.length>0){
            in("facilities_id",values);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("facilities_id",value);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper facilitiesIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("facilities_id",values);
        }
        return this;
    }

    /**
     * <p>用户设备id</p>
     * 等于 =
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdEq(String userPhoneId){
        if(userPhoneId!=null){
            eq("user_phone_id",userPhoneId);
        }
        return this;
    }

    /**
     * <p>用户设备id</p>
     * 不等于 &lt;&gt;
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdNe(String userPhoneId){
        if(userPhoneId!=null){
            ne("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * 大于 &gt;
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdGt(String userPhoneId){
        if(userPhoneId!=null){
            gt("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * 大于等于 &gt;=
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdGe(String userPhoneId){
        if(userPhoneId!=null){
            ge("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * 小于 &lt;
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdLt(String userPhoneId){
        if(userPhoneId!=null){
            lt("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * 小于等于 &lt;=
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdLe(String userPhoneId){
        if(userPhoneId!=null){
            le("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * BETWEEN 值1 AND 值2
     * @param userPhoneIdStart       值1
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdBetween(String userPhoneIdStart,String userPhoneIdEnd){
        if(userPhoneIdStart!=null && userPhoneIdEnd!=null){
            between("user_phone_id",userPhoneIdStart,userPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param userPhoneIdStart       值1
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdNotBetween(String userPhoneIdStart,String userPhoneIdEnd){
        if(userPhoneIdStart!=null && userPhoneIdEnd!=null){
            notBetween("user_phone_id",userPhoneIdStart,userPhoneIdEnd);
        }
        return this;
     }


    /**
     * <p>用户设备id</p>
     * LIKE '%值%'
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdLike(String userPhoneId){
        if(userPhoneId!=null){
            like("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * NOT LIKE '%值%'
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdNotLike(String userPhoneId){
        if(userPhoneId!=null){
            notLike("user_phone_id",userPhoneId);
        }
        return this;
     }


    /**
     * <p>用户设备id</p>
     * LIKE '%值'
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdLikeLeft(String userPhoneId){
        if(userPhoneId!=null){
            likeLeft("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * LIKE '值%'
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdLikeRight(String userPhoneId){
        if(userPhoneId!=null){
            likeRight("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdIsNull(){
        isNull("user_phone_id");
        return this;
    }

    /**
     * <p>用户设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdIsNotNull(){
        isNotNull("user_phone_id");
        return this;
    }

    /**
     * <p>用户设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("user_phone_id",value);
        }
        return this;
    }

    /**
     * <p>用户设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdIn(String... values){
        if(values!=null && values.length>0){
            in("user_phone_id",values);
        }
        return this;
    }

    /**
     * <p>用户设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("user_phone_id",value);
        }
        return this;
    }

    /**
     * <p>用户设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper userPhoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_phone_id",values);
        }
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 等于 =
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdEq(String requestId){
        if(requestId!=null){
            eq("request_id",requestId);
        }
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 不等于 &lt;&gt;
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdNe(String requestId){
        if(requestId!=null){
            ne("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 大于 &gt;
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdGt(String requestId){
        if(requestId!=null){
            gt("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 大于等于 &gt;=
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdGe(String requestId){
        if(requestId!=null){
            ge("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 小于 &lt;
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdLt(String requestId){
        if(requestId!=null){
            lt("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 小于等于 &lt;=
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdLe(String requestId){
        if(requestId!=null){
            le("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * BETWEEN 值1 AND 值2
     * @param requestIdStart       值1
     * @param requestIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdBetween(String requestIdStart,String requestIdEnd){
        if(requestIdStart!=null && requestIdEnd!=null){
            between("request_id",requestIdStart,requestIdEnd);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param requestIdStart       值1
     * @param requestIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdNotBetween(String requestIdStart,String requestIdEnd){
        if(requestIdStart!=null && requestIdEnd!=null){
            notBetween("request_id",requestIdStart,requestIdEnd);
        }
        return this;
     }


    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * LIKE '%值%'
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdLike(String requestId){
        if(requestId!=null){
            like("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * NOT LIKE '%值%'
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdNotLike(String requestId){
        if(requestId!=null){
            notLike("request_id",requestId);
        }
        return this;
     }


    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * LIKE '%值'
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdLikeLeft(String requestId){
        if(requestId!=null){
            likeLeft("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * LIKE '值%'
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdLikeRight(String requestId){
        if(requestId!=null){
            likeRight("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdIsNull(){
        isNull("request_id");
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdIsNotNull(){
        isNotNull("request_id");
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("request_id",value);
        }
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdIn(String... values){
        if(values!=null && values.length>0){
            in("request_id",values);
        }
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("request_id",value);
        }
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper requestIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("request_id",values);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 等于 =
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeEq(Date validStartTime){
        if(validStartTime!=null){
            eq("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 不等于 &lt;&gt;
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeNe(Date validStartTime){
        if(validStartTime!=null){
            ne("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于 &gt;
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeGt(Date validStartTime){
        if(validStartTime!=null){
            gt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于等于 &gt;=
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeGe(Date validStartTime){
        if(validStartTime!=null){
            ge("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于 &lt;
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeLt(Date validStartTime){
        if(validStartTime!=null){
            lt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于等于 &lt;=
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeLe(Date validStartTime){
        if(validStartTime!=null){
            le("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * BETWEEN 值1 AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeBetween(Date validStartTimeStart,Date validStartTimeEnd){
        if(validStartTimeStart!=null && validStartTimeEnd!=null){
            between("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeNotBetween(Date validStartTimeStart,Date validStartTimeEnd){
        if(validStartTimeStart!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%'
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeLike(Date validStartTime){
        if(validStartTime!=null){
            like("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT LIKE '%值%'
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeNotLike(Date validStartTime){
        if(validStartTime!=null){
            notLike("valid_start_time",validStartTime);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值'
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeLikeLeft(Date validStartTime){
        if(validStartTime!=null){
            likeLeft("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '值%'
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeLikeRight(Date validStartTime){
        if(validStartTime!=null){
            likeRight("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeIsNull(){
        isNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeIsNotNull(){
        isNotNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("valid_start_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("valid_start_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("valid_start_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_start_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 等于 =
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeEq(Date validEndTime){
        if(validEndTime!=null){
            eq("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 不等于 &lt;&gt;
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeNe(Date validEndTime){
        if(validEndTime!=null){
            ne("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于 &gt;
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeGt(Date validEndTime){
        if(validEndTime!=null){
            gt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于等于 &gt;=
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeGe(Date validEndTime){
        if(validEndTime!=null){
            ge("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于 &lt;
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeLt(Date validEndTime){
        if(validEndTime!=null){
            lt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于等于 &lt;=
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeLe(Date validEndTime){
        if(validEndTime!=null){
            le("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * BETWEEN 值1 AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeBetween(Date validEndTimeStart,Date validEndTimeEnd){
        if(validEndTimeStart!=null && validEndTimeEnd!=null){
            between("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeNotBetween(Date validEndTimeStart,Date validEndTimeEnd){
        if(validEndTimeStart!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%'
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeLike(Date validEndTime){
        if(validEndTime!=null){
            like("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT LIKE '%值%'
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeNotLike(Date validEndTime){
        if(validEndTime!=null){
            notLike("valid_end_time",validEndTime);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值'
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeLikeLeft(Date validEndTime){
        if(validEndTime!=null){
            likeLeft("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '值%'
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeLikeRight(Date validEndTime){
        if(validEndTime!=null){
            likeRight("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeIsNull(){
        isNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeIsNotNull(){
        isNotNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("valid_end_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("valid_end_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("valid_end_time",value);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper validEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_end_time",values);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 等于 =
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeEq(Date buyTime){
        if(buyTime!=null){
            eq("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 不等于 &lt;&gt;
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeNe(Date buyTime){
        if(buyTime!=null){
            ne("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 大于 &gt;
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeGt(Date buyTime){
        if(buyTime!=null){
            gt("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 大于等于 &gt;=
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeGe(Date buyTime){
        if(buyTime!=null){
            ge("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 小于 &lt;
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeLt(Date buyTime){
        if(buyTime!=null){
            lt("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 小于等于 &lt;=
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeLe(Date buyTime){
        if(buyTime!=null){
            le("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * BETWEEN 值1 AND 值2
     * @param buyTimeStart       值1
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeBetween(Date buyTimeStart,Date buyTimeEnd){
        if(buyTimeStart!=null && buyTimeEnd!=null){
            between("buy_time",buyTimeStart,buyTimeEnd);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param buyTimeStart       值1
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeNotBetween(Date buyTimeStart,Date buyTimeEnd){
        if(buyTimeStart!=null && buyTimeEnd!=null){
            notBetween("buy_time",buyTimeStart,buyTimeEnd);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值%'
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeLike(Date buyTime){
        if(buyTime!=null){
            like("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * NOT LIKE '%值%'
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeNotLike(Date buyTime){
        if(buyTime!=null){
            notLike("buy_time",buyTime);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值'
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeLikeLeft(Date buyTime){
        if(buyTime!=null){
            likeLeft("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * LIKE '值%'
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeLikeRight(Date buyTime){
        if(buyTime!=null){
            likeRight("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeIsNull(){
        isNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeIsNotNull(){
        isNotNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("buy_time",value);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("buy_time",values);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("buy_time",value);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper buyTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("buy_time",values);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 等于 =
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeEq(Date lastRenewTime){
        if(lastRenewTime!=null){
            eq("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 不等于 &lt;&gt;
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeNe(Date lastRenewTime){
        if(lastRenewTime!=null){
            ne("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 大于 &gt;
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeGt(Date lastRenewTime){
        if(lastRenewTime!=null){
            gt("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 大于等于 &gt;=
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeGe(Date lastRenewTime){
        if(lastRenewTime!=null){
            ge("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 小于 &lt;
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeLt(Date lastRenewTime){
        if(lastRenewTime!=null){
            lt("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 小于等于 &lt;=
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeLe(Date lastRenewTime){
        if(lastRenewTime!=null){
            le("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastRenewTimeStart       值1
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
        if(lastRenewTimeStart!=null && lastRenewTimeEnd!=null){
            between("last_renew_time",lastRenewTimeStart,lastRenewTimeEnd);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastRenewTimeStart       值1
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeNotBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
        if(lastRenewTimeStart!=null && lastRenewTimeEnd!=null){
            notBetween("last_renew_time",lastRenewTimeStart,lastRenewTimeEnd);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值%'
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeLike(Date lastRenewTime){
        if(lastRenewTime!=null){
            like("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * NOT LIKE '%值%'
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeNotLike(Date lastRenewTime){
        if(lastRenewTime!=null){
            notLike("last_renew_time",lastRenewTime);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值'
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeLikeLeft(Date lastRenewTime){
        if(lastRenewTime!=null){
            likeLeft("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * LIKE '值%'
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeLikeRight(Date lastRenewTime){
        if(lastRenewTime!=null){
            likeRight("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeIsNull(){
        isNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeIsNotNull(){
        isNotNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_renew_time",value);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_renew_time",values);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_renew_time",value);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastRenewTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_renew_time",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper createTimeEq(Date createTime){
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
    public YunMemberUserDeviceQueryWrapper createTimeNe(Date createTime){
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
    public YunMemberUserDeviceQueryWrapper createTimeGt(Date createTime){
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
    public YunMemberUserDeviceQueryWrapper createTimeGe(Date createTime){
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
    public YunMemberUserDeviceQueryWrapper createTimeLt(Date createTime){
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
    public YunMemberUserDeviceQueryWrapper createTimeLe(Date createTime){
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
    public YunMemberUserDeviceQueryWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberUserDeviceQueryWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberUserDeviceQueryWrapper createTimeLike(Date createTime){
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
    public YunMemberUserDeviceQueryWrapper createTimeNotLike(Date createTime){
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
    public YunMemberUserDeviceQueryWrapper createTimeLikeLeft(Date createTime){
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
    public YunMemberUserDeviceQueryWrapper createTimeLikeRight(Date createTime){
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
    public YunMemberUserDeviceQueryWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper createTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceQueryWrapper createTimeIn(Date... values){
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
    public YunMemberUserDeviceQueryWrapper createTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceQueryWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * 不等于 &lt;&gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * 大于 &gt;
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * 大于等于 &gt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * 小于 &lt;
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * 小于等于 &lt;=
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最近修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * NOT LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最近修改时间</p>
     * LIKE '%值'
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * LIKE '值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("last_update_time",values);
        }
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("last_update_time",value);
        }
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdLikeRight(Long versionId){
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("version_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("version_id",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_id",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 =
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusEq(Integer runningStatus){
        if(runningStatus!=null){
            eq("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 不等于 &lt;&gt;
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusNe(Integer runningStatus){
        if(runningStatus!=null){
            ne("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于 &gt;
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusGt(Integer runningStatus){
        if(runningStatus!=null){
            gt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于等于 &gt;=
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusGe(Integer runningStatus){
        if(runningStatus!=null){
            ge("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于 &lt;
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusLt(Integer runningStatus){
        if(runningStatus!=null){
            lt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于等于 &lt;=
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusLe(Integer runningStatus){
        if(runningStatus!=null){
            le("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * BETWEEN 值1 AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusBetween(Integer runningStatusStart,Integer runningStatusEnd){
        if(runningStatusStart!=null && runningStatusEnd!=null){
            between("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusNotBetween(Integer runningStatusStart,Integer runningStatusEnd){
        if(runningStatusStart!=null && runningStatusEnd!=null){
            notBetween("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值%'
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusLike(Integer runningStatus){
        if(runningStatus!=null){
            like("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT LIKE '%值%'
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusNotLike(Integer runningStatus){
        if(runningStatus!=null){
            notLike("running_status",runningStatus);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值'
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusLikeLeft(Integer runningStatus){
        if(runningStatus!=null){
            likeLeft("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '值%'
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusLikeRight(Integer runningStatus){
        if(runningStatus!=null){
            likeRight("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusIsNull(){
        isNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusIsNotNull(){
        isNotNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("running_status",value);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("running_status",values);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("running_status",value);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper runningStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("running_status",values);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 等于 =
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeEq(String specCode){
        if(specCode!=null){
            eq("spec_code",specCode);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 不等于 &lt;&gt;
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeNe(String specCode){
        if(specCode!=null){
            ne("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 大于 &gt;
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeGt(String specCode){
        if(specCode!=null){
            gt("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 大于等于 &gt;=
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeGe(String specCode){
        if(specCode!=null){
            ge("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 小于 &lt;
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeLt(String specCode){
        if(specCode!=null){
            lt("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 小于等于 &lt;=
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeLe(String specCode){
        if(specCode!=null){
            le("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * BETWEEN 值1 AND 值2
     * @param specCodeStart       值1
     * @param specCodeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeBetween(String specCodeStart,String specCodeEnd){
        if(specCodeStart!=null && specCodeEnd!=null){
            between("spec_code",specCodeStart,specCodeEnd);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param specCodeStart       值1
     * @param specCodeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeNotBetween(String specCodeStart,String specCodeEnd){
        if(specCodeStart!=null && specCodeEnd!=null){
            notBetween("spec_code",specCodeStart,specCodeEnd);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * LIKE '%值%'
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeLike(String specCode){
        if(specCode!=null){
            like("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * NOT LIKE '%值%'
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeNotLike(String specCode){
        if(specCode!=null){
            notLike("spec_code",specCode);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * LIKE '%值'
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeLikeLeft(String specCode){
        if(specCode!=null){
            likeLeft("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * LIKE '值%'
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeLikeRight(String specCode){
        if(specCode!=null){
            likeRight("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeIsNull(){
        isNull("spec_code");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeIsNotNull(){
        isNotNull("spec_code");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("spec_code",value);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeIn(String... values){
        if(values!=null && values.length>0){
            in("spec_code",values);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("spec_code",value);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper specCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("spec_code",values);
        }
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * 等于 =
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdEq(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            eq("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * 不等于 &lt;&gt;
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdNe(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            ne("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * 大于 &gt;
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdGt(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            gt("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * 大于等于 &gt;=
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdGe(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            ge("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * 小于 &lt;
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdLt(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            lt("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * 小于等于 &lt;=
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdLe(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            le("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * BETWEEN 值1 AND 值2
     * @param fkSysDeviceLabelIdStart       值1
     * @param fkSysDeviceLabelIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdBetween(Long fkSysDeviceLabelIdStart,Long fkSysDeviceLabelIdEnd){
        if(fkSysDeviceLabelIdStart!=null && fkSysDeviceLabelIdEnd!=null){
            between("fk_sys_device_label_id",fkSysDeviceLabelIdStart,fkSysDeviceLabelIdEnd);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkSysDeviceLabelIdStart       值1
     * @param fkSysDeviceLabelIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdNotBetween(Long fkSysDeviceLabelIdStart,Long fkSysDeviceLabelIdEnd){
        if(fkSysDeviceLabelIdStart!=null && fkSysDeviceLabelIdEnd!=null){
            notBetween("fk_sys_device_label_id",fkSysDeviceLabelIdStart,fkSysDeviceLabelIdEnd);
        }
        return this;
     }


    /**
     * <p>设备系统标签Id</p>
     * LIKE '%值%'
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdLike(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            like("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * NOT LIKE '%值%'
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdNotLike(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            notLike("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }


    /**
     * <p>设备系统标签Id</p>
     * LIKE '%值'
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdLikeLeft(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            likeLeft("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * LIKE '值%'
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdLikeRight(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            likeRight("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * IS NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdIsNull(){
        isNull("fk_sys_device_label_id");
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdIsNotNull(){
        isNotNull("fk_sys_device_label_id");
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_sys_device_label_id",value);
        }
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_sys_device_label_id",values);
        }
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_sys_device_label_id",value);
        }
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceQueryWrapper fkSysDeviceLabelIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_sys_device_label_id",values);
        }
        return this;
    }


}
