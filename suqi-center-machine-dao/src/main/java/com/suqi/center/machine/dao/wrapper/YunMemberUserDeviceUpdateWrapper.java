package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.YunMemberUserDevice;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 商户用户设备表（yun_member_user_device）
 * </p>
 * "yun_member_user_device"
 * @author PC001
 */
public class YunMemberUserDeviceUpdateWrapper extends UpdateWrapper<YunMemberUserDevice> {

    public static YunMemberUserDeviceUpdateWrapper wrapper() {
        return new YunMemberUserDeviceUpdateWrapper();
    }

    public YunMemberUserDeviceUpdateWrapper() {
        super();
    }

    public YunMemberUserDeviceUpdateWrapper(YunMemberUserDevice entity) {
        super(entity);
    }

    /**
     * id
     */
    public YunMemberUserDeviceUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 商户id
     */
    public YunMemberUserDeviceUpdateWrapper setFkMemberId(Long fkMemberId) {
         set("fk_member_id",fkMemberId);
        return this;
    }
    /**
     * 商户设备表id
     */
    public YunMemberUserDeviceUpdateWrapper setFkYunMemberFacilitiesId(Long fkYunMemberFacilitiesId) {
         set("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        return this;
    }
    /**
     * 商户用户id
     */
    public YunMemberUserDeviceUpdateWrapper setUserId(String userId) {
         set("user_id",userId);
        return this;
    }
    /**
     * 设备id
     */
    public YunMemberUserDeviceUpdateWrapper setFacilitiesId(String facilitiesId) {
         set("facilities_id",facilitiesId);
        return this;
    }
    /**
     * 用户设备id
     */
    public YunMemberUserDeviceUpdateWrapper setUserPhoneId(String userPhoneId) {
         set("user_phone_id",userPhoneId);
        return this;
    }
    /**
     * 调用方保证每次分配唯一请求id
     */
    public YunMemberUserDeviceUpdateWrapper setRequestId(String requestId) {
         set("request_id",requestId);
        return this;
    }
    /**
     * 使用有效期开始时间
     */
    public YunMemberUserDeviceUpdateWrapper setValidStartTime(Date validStartTime) {
         set("valid_start_time",validStartTime);
        return this;
    }
    /**
     * 使用有效期结束时间
     */
    public YunMemberUserDeviceUpdateWrapper setValidEndTime(Date validEndTime) {
         set("valid_end_time",validEndTime);
        return this;
    }
    /**
     * 设备状态（冻结：0，使用中：50，已过期/注销：-50）
     */
    public YunMemberUserDeviceUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 订购时间
     */
    public YunMemberUserDeviceUpdateWrapper setBuyTime(Date buyTime) {
         set("buy_time",buyTime);
        return this;
    }
    /**
     * 最近一次续费时间
     */
    public YunMemberUserDeviceUpdateWrapper setLastRenewTime(Date lastRenewTime) {
         set("last_renew_time",lastRenewTime);
        return this;
    }
    /**
     * 创建时间
     */
    public YunMemberUserDeviceUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最近修改时间
     */
    public YunMemberUserDeviceUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public YunMemberUserDeviceUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 运行状态(0：空闲，1：运行中)
     */
    public YunMemberUserDeviceUpdateWrapper setRunningStatus(Integer runningStatus) {
         set("running_status",runningStatus);
        return this;
    }
    /**
     * 手机规格名称，不得超过64byte。(废弃)
     */
    public YunMemberUserDeviceUpdateWrapper setSpecCode(String specCode) {
         set("spec_code",specCode);
        return this;
    }
    /**
     * 设备系统标签Id
     */
    public YunMemberUserDeviceUpdateWrapper setFkSysDeviceLabelId(Long fkSysDeviceLabelId) {
         set("fk_sys_device_label_id",fkSysDeviceLabelId);
        return this;
    }

    /**
     * <p>id</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper idLe(Long id){
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
    public YunMemberUserDeviceUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public YunMemberUserDeviceUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper idLikeRight(Long id){
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
    public YunMemberUserDeviceUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper idIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateWrapper idIn(Long... values){
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
    public YunMemberUserDeviceUpdateWrapper idNotIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * 等于 = fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkMemberIdEq(Long fkMemberId){
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * 不等于 &lt;&gt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkMemberIdNe(Long fkMemberId){
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 大于 &gt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkMemberIdGt(Long fkMemberId){
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 大于等于 &gt;= fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkMemberIdGe(Long fkMemberId){
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 小于 &lt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkMemberIdLt(Long fkMemberId){
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 小于等于 &lt;= fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkMemberIdLe(Long fkMemberId){
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
    public YunMemberUserDeviceUpdateWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public YunMemberUserDeviceUpdateWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>商户id</p>
     * LIKE '%值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkMemberIdLike(Long fkMemberId){
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * NOT LIKE '%值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkMemberIdNotLike(Long fkMemberId){
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>商户id</p>
     * LIKE '%值' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkMemberIdLikeLeft(Long fkMemberId){
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * LIKE '值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public YunMemberUserDeviceUpdateWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkMemberIdIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateWrapper fkMemberIdIn(Long... values){
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
    public YunMemberUserDeviceUpdateWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * 等于 = fkYunMemberFacilitiesId
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdEq(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            eq("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * 不等于 &lt;&gt; fkYunMemberFacilitiesId
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdNe(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            ne("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * 大于 &gt; fkYunMemberFacilitiesId
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdGt(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            gt("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * 大于等于 &gt;= fkYunMemberFacilitiesId
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdGe(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            ge("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * 小于 &lt; fkYunMemberFacilitiesId
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdLt(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            lt("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * 小于等于 &lt;= fkYunMemberFacilitiesId
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdLe(Long fkYunMemberFacilitiesId){
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
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdBetween(Long fkYunMemberFacilitiesIdStart,Long fkYunMemberFacilitiesIdEnd){
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
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdNotBetween(Long fkYunMemberFacilitiesIdStart,Long fkYunMemberFacilitiesIdEnd){
        if(fkYunMemberFacilitiesIdStart!=null && fkYunMemberFacilitiesIdEnd!=null){
            notBetween("fk_yun_member_facilities_id",fkYunMemberFacilitiesIdStart,fkYunMemberFacilitiesIdEnd);
        }
        return this;
     }


    /**
     * <p>商户设备表id</p>
     * LIKE '%值%' fkYunMemberFacilitiesId
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdLike(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            like("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * NOT LIKE '%值%' fkYunMemberFacilitiesId
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdNotLike(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            notLike("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }


    /**
     * <p>商户设备表id</p>
     * LIKE '%值' fkYunMemberFacilitiesId
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdLikeLeft(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            likeLeft("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * LIKE '值%' fkYunMemberFacilitiesId
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdLikeRight(Long fkYunMemberFacilitiesId){
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
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdIsNull(){
        isNull("fk_yun_member_facilities_id");
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdIsNotNull(){
        isNotNull("fk_yun_member_facilities_id");
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdIn(Long... values){
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
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdNotIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateWrapper fkYunMemberFacilitiesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_yun_member_facilities_id",values);
        }
        return this;
    }

    /**
     * <p>商户用户id</p>
     * 等于 = userId
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userIdEq(String userId){
        if(userId!=null){
            eq("user_id",userId);
        }
        return this;
    }

    /**
     * <p>商户用户id</p>
     * 不等于 &lt;&gt; userId
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userIdNe(String userId){
        if(userId!=null){
            ne("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * 大于 &gt; userId
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userIdGt(String userId){
        if(userId!=null){
            gt("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * 大于等于 &gt;= userId
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userIdGe(String userId){
        if(userId!=null){
            ge("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * 小于 &lt; userId
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userIdLt(String userId){
        if(userId!=null){
            lt("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * 小于等于 &lt;= userId
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userIdLe(String userId){
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
    public YunMemberUserDeviceUpdateWrapper userIdBetween(String userIdStart,String userIdEnd){
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
    public YunMemberUserDeviceUpdateWrapper userIdNotBetween(String userIdStart,String userIdEnd){
        if(userIdStart!=null && userIdEnd!=null){
            notBetween("user_id",userIdStart,userIdEnd);
        }
        return this;
     }


    /**
     * <p>商户用户id</p>
     * LIKE '%值%' userId
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userIdLike(String userId){
        if(userId!=null){
            like("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * NOT LIKE '%值%' userId
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userIdNotLike(String userId){
        if(userId!=null){
            notLike("user_id",userId);
        }
        return this;
     }


    /**
     * <p>商户用户id</p>
     * LIKE '%值' userId
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userIdLikeLeft(String userId){
        if(userId!=null){
            likeLeft("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * LIKE '值%' userId
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userIdLikeRight(String userId){
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
    public YunMemberUserDeviceUpdateWrapper userIdIsNull(){
        isNull("user_id");
        return this;
    }

    /**
     * <p>商户用户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userIdIsNotNull(){
        isNotNull("user_id");
        return this;
    }

    /**
     * <p>商户用户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userIdIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateWrapper userIdIn(String... values){
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
    public YunMemberUserDeviceUpdateWrapper userIdNotIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateWrapper userIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_id",values);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * 等于 = facilitiesId
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper facilitiesIdEq(String facilitiesId){
        if(facilitiesId!=null){
            eq("facilities_id",facilitiesId);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * 不等于 &lt;&gt; facilitiesId
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper facilitiesIdNe(String facilitiesId){
        if(facilitiesId!=null){
            ne("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 大于 &gt; facilitiesId
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper facilitiesIdGt(String facilitiesId){
        if(facilitiesId!=null){
            gt("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 大于等于 &gt;= facilitiesId
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper facilitiesIdGe(String facilitiesId){
        if(facilitiesId!=null){
            ge("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 小于 &lt; facilitiesId
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper facilitiesIdLt(String facilitiesId){
        if(facilitiesId!=null){
            lt("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 小于等于 &lt;= facilitiesId
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper facilitiesIdLe(String facilitiesId){
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
    public YunMemberUserDeviceUpdateWrapper facilitiesIdBetween(String facilitiesIdStart,String facilitiesIdEnd){
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
    public YunMemberUserDeviceUpdateWrapper facilitiesIdNotBetween(String facilitiesIdStart,String facilitiesIdEnd){
        if(facilitiesIdStart!=null && facilitiesIdEnd!=null){
            notBetween("facilities_id",facilitiesIdStart,facilitiesIdEnd);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值%' facilitiesId
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper facilitiesIdLike(String facilitiesId){
        if(facilitiesId!=null){
            like("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT LIKE '%值%' facilitiesId
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper facilitiesIdNotLike(String facilitiesId){
        if(facilitiesId!=null){
            notLike("facilities_id",facilitiesId);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值' facilitiesId
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper facilitiesIdLikeLeft(String facilitiesId){
        if(facilitiesId!=null){
            likeLeft("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * LIKE '值%' facilitiesId
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper facilitiesIdLikeRight(String facilitiesId){
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
    public YunMemberUserDeviceUpdateWrapper facilitiesIdIsNull(){
        isNull("facilities_id");
        return this;
    }

    /**
     * <p>设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper facilitiesIdIsNotNull(){
        isNotNull("facilities_id");
        return this;
    }

    /**
     * <p>设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper facilitiesIdIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateWrapper facilitiesIdIn(String... values){
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
    public YunMemberUserDeviceUpdateWrapper facilitiesIdNotIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateWrapper facilitiesIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("facilities_id",values);
        }
        return this;
    }

    /**
     * <p>用户设备id</p>
     * 等于 = userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userPhoneIdEq(String userPhoneId){
        if(userPhoneId!=null){
            eq("user_phone_id",userPhoneId);
        }
        return this;
    }

    /**
     * <p>用户设备id</p>
     * 不等于 &lt;&gt; userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userPhoneIdNe(String userPhoneId){
        if(userPhoneId!=null){
            ne("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * 大于 &gt; userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userPhoneIdGt(String userPhoneId){
        if(userPhoneId!=null){
            gt("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * 大于等于 &gt;= userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userPhoneIdGe(String userPhoneId){
        if(userPhoneId!=null){
            ge("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * 小于 &lt; userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userPhoneIdLt(String userPhoneId){
        if(userPhoneId!=null){
            lt("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * 小于等于 &lt;= userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userPhoneIdLe(String userPhoneId){
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
    public YunMemberUserDeviceUpdateWrapper userPhoneIdBetween(String userPhoneIdStart,String userPhoneIdEnd){
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
    public YunMemberUserDeviceUpdateWrapper userPhoneIdNotBetween(String userPhoneIdStart,String userPhoneIdEnd){
        if(userPhoneIdStart!=null && userPhoneIdEnd!=null){
            notBetween("user_phone_id",userPhoneIdStart,userPhoneIdEnd);
        }
        return this;
     }


    /**
     * <p>用户设备id</p>
     * LIKE '%值%' userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userPhoneIdLike(String userPhoneId){
        if(userPhoneId!=null){
            like("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * NOT LIKE '%值%' userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userPhoneIdNotLike(String userPhoneId){
        if(userPhoneId!=null){
            notLike("user_phone_id",userPhoneId);
        }
        return this;
     }


    /**
     * <p>用户设备id</p>
     * LIKE '%值' userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userPhoneIdLikeLeft(String userPhoneId){
        if(userPhoneId!=null){
            likeLeft("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * LIKE '值%' userPhoneId
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userPhoneIdLikeRight(String userPhoneId){
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
    public YunMemberUserDeviceUpdateWrapper userPhoneIdIsNull(){
        isNull("user_phone_id");
        return this;
    }

    /**
     * <p>用户设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userPhoneIdIsNotNull(){
        isNotNull("user_phone_id");
        return this;
    }

    /**
     * <p>用户设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper userPhoneIdIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateWrapper userPhoneIdIn(String... values){
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
    public YunMemberUserDeviceUpdateWrapper userPhoneIdNotIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateWrapper userPhoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_phone_id",values);
        }
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 等于 = requestId
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper requestIdEq(String requestId){
        if(requestId!=null){
            eq("request_id",requestId);
        }
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 不等于 &lt;&gt; requestId
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper requestIdNe(String requestId){
        if(requestId!=null){
            ne("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 大于 &gt; requestId
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper requestIdGt(String requestId){
        if(requestId!=null){
            gt("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 大于等于 &gt;= requestId
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper requestIdGe(String requestId){
        if(requestId!=null){
            ge("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 小于 &lt; requestId
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper requestIdLt(String requestId){
        if(requestId!=null){
            lt("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 小于等于 &lt;= requestId
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper requestIdLe(String requestId){
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
    public YunMemberUserDeviceUpdateWrapper requestIdBetween(String requestIdStart,String requestIdEnd){
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
    public YunMemberUserDeviceUpdateWrapper requestIdNotBetween(String requestIdStart,String requestIdEnd){
        if(requestIdStart!=null && requestIdEnd!=null){
            notBetween("request_id",requestIdStart,requestIdEnd);
        }
        return this;
     }


    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * LIKE '%值%' requestId
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper requestIdLike(String requestId){
        if(requestId!=null){
            like("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * NOT LIKE '%值%' requestId
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper requestIdNotLike(String requestId){
        if(requestId!=null){
            notLike("request_id",requestId);
        }
        return this;
     }


    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * LIKE '%值' requestId
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper requestIdLikeLeft(String requestId){
        if(requestId!=null){
            likeLeft("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * LIKE '值%' requestId
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper requestIdLikeRight(String requestId){
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
    public YunMemberUserDeviceUpdateWrapper requestIdIsNull(){
        isNull("request_id");
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper requestIdIsNotNull(){
        isNotNull("request_id");
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper requestIdIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateWrapper requestIdIn(String... values){
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
    public YunMemberUserDeviceUpdateWrapper requestIdNotIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateWrapper requestIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("request_id",values);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 等于 = validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validStartTimeEq(Date validStartTime){
        if(validStartTime!=null){
            eq("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 不等于 &lt;&gt; validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validStartTimeNe(Date validStartTime){
        if(validStartTime!=null){
            ne("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于 &gt; validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validStartTimeGt(Date validStartTime){
        if(validStartTime!=null){
            gt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于等于 &gt;= validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validStartTimeGe(Date validStartTime){
        if(validStartTime!=null){
            ge("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于 &lt; validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validStartTimeLt(Date validStartTime){
        if(validStartTime!=null){
            lt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于等于 &lt;= validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validStartTimeLe(Date validStartTime){
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
    public YunMemberUserDeviceUpdateWrapper validStartTimeBetween(Date validStartTimeStart,Date validStartTimeEnd){
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
    public YunMemberUserDeviceUpdateWrapper validStartTimeNotBetween(Date validStartTimeStart,Date validStartTimeEnd){
        if(validStartTimeStart!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%' validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validStartTimeLike(Date validStartTime){
        if(validStartTime!=null){
            like("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT LIKE '%值%' validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validStartTimeNotLike(Date validStartTime){
        if(validStartTime!=null){
            notLike("valid_start_time",validStartTime);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值' validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validStartTimeLikeLeft(Date validStartTime){
        if(validStartTime!=null){
            likeLeft("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '值%' validStartTime
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validStartTimeLikeRight(Date validStartTime){
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
    public YunMemberUserDeviceUpdateWrapper validStartTimeIsNull(){
        isNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validStartTimeIsNotNull(){
        isNotNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validStartTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateWrapper validStartTimeIn(Date... values){
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
    public YunMemberUserDeviceUpdateWrapper validStartTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateWrapper validStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_start_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 等于 = validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validEndTimeEq(Date validEndTime){
        if(validEndTime!=null){
            eq("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 不等于 &lt;&gt; validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validEndTimeNe(Date validEndTime){
        if(validEndTime!=null){
            ne("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于 &gt; validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validEndTimeGt(Date validEndTime){
        if(validEndTime!=null){
            gt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于等于 &gt;= validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validEndTimeGe(Date validEndTime){
        if(validEndTime!=null){
            ge("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于 &lt; validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validEndTimeLt(Date validEndTime){
        if(validEndTime!=null){
            lt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于等于 &lt;= validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validEndTimeLe(Date validEndTime){
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
    public YunMemberUserDeviceUpdateWrapper validEndTimeBetween(Date validEndTimeStart,Date validEndTimeEnd){
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
    public YunMemberUserDeviceUpdateWrapper validEndTimeNotBetween(Date validEndTimeStart,Date validEndTimeEnd){
        if(validEndTimeStart!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%' validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validEndTimeLike(Date validEndTime){
        if(validEndTime!=null){
            like("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT LIKE '%值%' validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validEndTimeNotLike(Date validEndTime){
        if(validEndTime!=null){
            notLike("valid_end_time",validEndTime);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值' validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validEndTimeLikeLeft(Date validEndTime){
        if(validEndTime!=null){
            likeLeft("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '值%' validEndTime
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validEndTimeLikeRight(Date validEndTime){
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
    public YunMemberUserDeviceUpdateWrapper validEndTimeIsNull(){
        isNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validEndTimeIsNotNull(){
        isNotNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper validEndTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateWrapper validEndTimeIn(Date... values){
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
    public YunMemberUserDeviceUpdateWrapper validEndTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateWrapper validEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_end_time",values);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper statusLe(Integer status){
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
    public YunMemberUserDeviceUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public YunMemberUserDeviceUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper statusLikeRight(Integer status){
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
    public YunMemberUserDeviceUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper statusIn(Collection<Integer> value){
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
    public YunMemberUserDeviceUpdateWrapper statusIn(Integer... values){
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
    public YunMemberUserDeviceUpdateWrapper statusNotIn(Collection<Integer> value){
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
    public YunMemberUserDeviceUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 等于 = buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper buyTimeEq(Date buyTime){
        if(buyTime!=null){
            eq("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 不等于 &lt;&gt; buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper buyTimeNe(Date buyTime){
        if(buyTime!=null){
            ne("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 大于 &gt; buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper buyTimeGt(Date buyTime){
        if(buyTime!=null){
            gt("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 大于等于 &gt;= buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper buyTimeGe(Date buyTime){
        if(buyTime!=null){
            ge("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 小于 &lt; buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper buyTimeLt(Date buyTime){
        if(buyTime!=null){
            lt("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 小于等于 &lt;= buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper buyTimeLe(Date buyTime){
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
    public YunMemberUserDeviceUpdateWrapper buyTimeBetween(Date buyTimeStart,Date buyTimeEnd){
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
    public YunMemberUserDeviceUpdateWrapper buyTimeNotBetween(Date buyTimeStart,Date buyTimeEnd){
        if(buyTimeStart!=null && buyTimeEnd!=null){
            notBetween("buy_time",buyTimeStart,buyTimeEnd);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值%' buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper buyTimeLike(Date buyTime){
        if(buyTime!=null){
            like("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * NOT LIKE '%值%' buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper buyTimeNotLike(Date buyTime){
        if(buyTime!=null){
            notLike("buy_time",buyTime);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值' buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper buyTimeLikeLeft(Date buyTime){
        if(buyTime!=null){
            likeLeft("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * LIKE '值%' buyTime
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper buyTimeLikeRight(Date buyTime){
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
    public YunMemberUserDeviceUpdateWrapper buyTimeIsNull(){
        isNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper buyTimeIsNotNull(){
        isNotNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper buyTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateWrapper buyTimeIn(Date... values){
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
    public YunMemberUserDeviceUpdateWrapper buyTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateWrapper buyTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("buy_time",values);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 等于 = lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeEq(Date lastRenewTime){
        if(lastRenewTime!=null){
            eq("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 不等于 &lt;&gt; lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeNe(Date lastRenewTime){
        if(lastRenewTime!=null){
            ne("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 大于 &gt; lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeGt(Date lastRenewTime){
        if(lastRenewTime!=null){
            gt("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 大于等于 &gt;= lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeGe(Date lastRenewTime){
        if(lastRenewTime!=null){
            ge("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 小于 &lt; lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeLt(Date lastRenewTime){
        if(lastRenewTime!=null){
            lt("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 小于等于 &lt;= lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeLe(Date lastRenewTime){
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
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
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
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeNotBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
        if(lastRenewTimeStart!=null && lastRenewTimeEnd!=null){
            notBetween("last_renew_time",lastRenewTimeStart,lastRenewTimeEnd);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值%' lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeLike(Date lastRenewTime){
        if(lastRenewTime!=null){
            like("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * NOT LIKE '%值%' lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeNotLike(Date lastRenewTime){
        if(lastRenewTime!=null){
            notLike("last_renew_time",lastRenewTime);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值' lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeLikeLeft(Date lastRenewTime){
        if(lastRenewTime!=null){
            likeLeft("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * LIKE '值%' lastRenewTime
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeLikeRight(Date lastRenewTime){
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
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeIsNull(){
        isNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeIsNotNull(){
        isNotNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeIn(Date... values){
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
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateWrapper lastRenewTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_renew_time",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper createTimeEq(Date createTime){
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
    public YunMemberUserDeviceUpdateWrapper createTimeNe(Date createTime){
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
    public YunMemberUserDeviceUpdateWrapper createTimeGt(Date createTime){
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
    public YunMemberUserDeviceUpdateWrapper createTimeGe(Date createTime){
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
    public YunMemberUserDeviceUpdateWrapper createTimeLt(Date createTime){
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
    public YunMemberUserDeviceUpdateWrapper createTimeLe(Date createTime){
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
    public YunMemberUserDeviceUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberUserDeviceUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberUserDeviceUpdateWrapper createTimeLike(Date createTime){
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
    public YunMemberUserDeviceUpdateWrapper createTimeNotLike(Date createTime){
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
    public YunMemberUserDeviceUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public YunMemberUserDeviceUpdateWrapper createTimeLikeRight(Date createTime){
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
    public YunMemberUserDeviceUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper createTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateWrapper createTimeIn(Date... values){
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
    public YunMemberUserDeviceUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * 等于 = lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * 不等于 &lt;&gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * 大于 &gt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * 大于等于 &gt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * 小于 &lt; lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * 小于等于 &lt;= lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        if(lastUpdateTimeStart!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最近修改时间</p>
     * LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * NOT LIKE '%值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最近修改时间</p>
     * LIKE '%值' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * LIKE '值%' lastUpdateTime
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; versionId
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; versionId
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= versionId
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; versionId
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= versionId
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper versionIdLe(Long versionId){
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
    public YunMemberUserDeviceUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberUserDeviceUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' versionId
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' versionId
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper versionIdLikeRight(Long versionId){
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
    public YunMemberUserDeviceUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper versionIdIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateWrapper versionIdIn(Long... values){
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
    public YunMemberUserDeviceUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 = runningStatus
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper runningStatusEq(Integer runningStatus){
        if(runningStatus!=null){
            eq("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 不等于 &lt;&gt; runningStatus
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper runningStatusNe(Integer runningStatus){
        if(runningStatus!=null){
            ne("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于 &gt; runningStatus
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper runningStatusGt(Integer runningStatus){
        if(runningStatus!=null){
            gt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于等于 &gt;= runningStatus
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper runningStatusGe(Integer runningStatus){
        if(runningStatus!=null){
            ge("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于 &lt; runningStatus
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper runningStatusLt(Integer runningStatus){
        if(runningStatus!=null){
            lt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于等于 &lt;= runningStatus
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper runningStatusLe(Integer runningStatus){
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
    public YunMemberUserDeviceUpdateWrapper runningStatusBetween(Integer runningStatusStart,Integer runningStatusEnd){
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
    public YunMemberUserDeviceUpdateWrapper runningStatusNotBetween(Integer runningStatusStart,Integer runningStatusEnd){
        if(runningStatusStart!=null && runningStatusEnd!=null){
            notBetween("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值%' runningStatus
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper runningStatusLike(Integer runningStatus){
        if(runningStatus!=null){
            like("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT LIKE '%值%' runningStatus
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper runningStatusNotLike(Integer runningStatus){
        if(runningStatus!=null){
            notLike("running_status",runningStatus);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值' runningStatus
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper runningStatusLikeLeft(Integer runningStatus){
        if(runningStatus!=null){
            likeLeft("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '值%' runningStatus
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper runningStatusLikeRight(Integer runningStatus){
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
    public YunMemberUserDeviceUpdateWrapper runningStatusIsNull(){
        isNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper runningStatusIsNotNull(){
        isNotNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper runningStatusIn(Collection<Integer> value){
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
    public YunMemberUserDeviceUpdateWrapper runningStatusIn(Integer... values){
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
    public YunMemberUserDeviceUpdateWrapper runningStatusNotIn(Collection<Integer> value){
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
    public YunMemberUserDeviceUpdateWrapper runningStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("running_status",values);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 等于 = specCode
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper specCodeEq(String specCode){
        if(specCode!=null){
            eq("spec_code",specCode);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 不等于 &lt;&gt; specCode
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper specCodeNe(String specCode){
        if(specCode!=null){
            ne("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 大于 &gt; specCode
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper specCodeGt(String specCode){
        if(specCode!=null){
            gt("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 大于等于 &gt;= specCode
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper specCodeGe(String specCode){
        if(specCode!=null){
            ge("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 小于 &lt; specCode
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper specCodeLt(String specCode){
        if(specCode!=null){
            lt("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 小于等于 &lt;= specCode
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper specCodeLe(String specCode){
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
    public YunMemberUserDeviceUpdateWrapper specCodeBetween(String specCodeStart,String specCodeEnd){
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
    public YunMemberUserDeviceUpdateWrapper specCodeNotBetween(String specCodeStart,String specCodeEnd){
        if(specCodeStart!=null && specCodeEnd!=null){
            notBetween("spec_code",specCodeStart,specCodeEnd);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * LIKE '%值%' specCode
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper specCodeLike(String specCode){
        if(specCode!=null){
            like("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * NOT LIKE '%值%' specCode
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper specCodeNotLike(String specCode){
        if(specCode!=null){
            notLike("spec_code",specCode);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * LIKE '%值' specCode
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper specCodeLikeLeft(String specCode){
        if(specCode!=null){
            likeLeft("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * LIKE '值%' specCode
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper specCodeLikeRight(String specCode){
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
    public YunMemberUserDeviceUpdateWrapper specCodeIsNull(){
        isNull("spec_code");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper specCodeIsNotNull(){
        isNotNull("spec_code");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper specCodeIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateWrapper specCodeIn(String... values){
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
    public YunMemberUserDeviceUpdateWrapper specCodeNotIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateWrapper specCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("spec_code",values);
        }
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * 等于 = fkSysDeviceLabelId
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdEq(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            eq("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * 不等于 &lt;&gt; fkSysDeviceLabelId
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdNe(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            ne("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * 大于 &gt; fkSysDeviceLabelId
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdGt(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            gt("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * 大于等于 &gt;= fkSysDeviceLabelId
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdGe(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            ge("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * 小于 &lt; fkSysDeviceLabelId
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdLt(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            lt("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * 小于等于 &lt;= fkSysDeviceLabelId
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdLe(Long fkSysDeviceLabelId){
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
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdBetween(Long fkSysDeviceLabelIdStart,Long fkSysDeviceLabelIdEnd){
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
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdNotBetween(Long fkSysDeviceLabelIdStart,Long fkSysDeviceLabelIdEnd){
        if(fkSysDeviceLabelIdStart!=null && fkSysDeviceLabelIdEnd!=null){
            notBetween("fk_sys_device_label_id",fkSysDeviceLabelIdStart,fkSysDeviceLabelIdEnd);
        }
        return this;
     }


    /**
     * <p>设备系统标签Id</p>
     * LIKE '%值%' fkSysDeviceLabelId
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdLike(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            like("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * NOT LIKE '%值%' fkSysDeviceLabelId
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdNotLike(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            notLike("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }


    /**
     * <p>设备系统标签Id</p>
     * LIKE '%值' fkSysDeviceLabelId
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdLikeLeft(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            likeLeft("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * LIKE '值%' fkSysDeviceLabelId
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdLikeRight(Long fkSysDeviceLabelId){
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
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdIsNull(){
        isNull("fk_sys_device_label_id");
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdIsNotNull(){
        isNotNull("fk_sys_device_label_id");
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdIn(Long... values){
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
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdNotIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateWrapper fkSysDeviceLabelIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_sys_device_label_id",values);
        }
        return this;
    }


}
