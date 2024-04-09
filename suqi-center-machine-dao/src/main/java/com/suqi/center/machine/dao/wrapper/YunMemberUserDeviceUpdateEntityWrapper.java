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
public class YunMemberUserDeviceUpdateEntityWrapper extends UpdateWrapper<YunMemberUserDevice> {

    public static YunMemberUserDeviceUpdateEntityWrapper wrapper(YunMemberUserDevice entity) {
        return new YunMemberUserDeviceUpdateEntityWrapper(entity);
    }

    private YunMemberUserDevice entity;

    public YunMemberUserDeviceUpdateEntityWrapper(YunMemberUserDevice entity) {
        this.entity=entity;
    }

    /**
     * id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 商户id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setFkMemberId(Long fkMemberId) {
         set("fk_member_id",fkMemberId);
        return this;
    }
    /**
     * 商户设备表id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setFkYunMemberFacilitiesId(Long fkYunMemberFacilitiesId) {
         set("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        return this;
    }
    /**
     * 商户用户id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setUserId(String userId) {
         set("user_id",userId);
        return this;
    }
    /**
     * 设备id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setFacilitiesId(String facilitiesId) {
         set("facilities_id",facilitiesId);
        return this;
    }
    /**
     * 用户设备id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setUserPhoneId(String userPhoneId) {
         set("user_phone_id",userPhoneId);
        return this;
    }
    /**
     * 调用方保证每次分配唯一请求id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setRequestId(String requestId) {
         set("request_id",requestId);
        return this;
    }
    /**
     * 使用有效期开始时间
     */
    public YunMemberUserDeviceUpdateEntityWrapper setValidStartTime(Date validStartTime) {
         set("valid_start_time",validStartTime);
        return this;
    }
    /**
     * 使用有效期结束时间
     */
    public YunMemberUserDeviceUpdateEntityWrapper setValidEndTime(Date validEndTime) {
         set("valid_end_time",validEndTime);
        return this;
    }
    /**
     * 设备状态（冻结：0，使用中：50，已过期/注销：-50）
     */
    public YunMemberUserDeviceUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 订购时间
     */
    public YunMemberUserDeviceUpdateEntityWrapper setBuyTime(Date buyTime) {
         set("buy_time",buyTime);
        return this;
    }
    /**
     * 最近一次续费时间
     */
    public YunMemberUserDeviceUpdateEntityWrapper setLastRenewTime(Date lastRenewTime) {
         set("last_renew_time",lastRenewTime);
        return this;
    }
    /**
     * 创建时间
     */
    public YunMemberUserDeviceUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最近修改时间
     */
    public YunMemberUserDeviceUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public YunMemberUserDeviceUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 运行状态(0：空闲，1：运行中)
     */
    public YunMemberUserDeviceUpdateEntityWrapper setRunningStatus(Integer runningStatus) {
         set("running_status",runningStatus);
        return this;
    }
    /**
     * 手机规格名称，不得超过64byte。(废弃)
     */
    public YunMemberUserDeviceUpdateEntityWrapper setSpecCode(String specCode) {
         set("spec_code",specCode);
        return this;
    }
    /**
     * 设备系统标签Id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setFkSysDeviceLabelId(Long fkSysDeviceLabelId) {
         set("fk_sys_device_label_id",fkSysDeviceLabelId);
        return this;
    }

    protected YunMemberUserDevice entity() {
        if(entity==null){
            throw new NullPointerException("YunMemberUserDevice is null");
        }
        return entity;
    }

    /**
     * id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 商户id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setFkMemberId() {
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            set("fk_member_id",fkMemberId);
        }
        return this;
    }
    /**
     * 商户设备表id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setFkYunMemberFacilitiesId() {
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null){
            set("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
    }
    /**
     * 商户用户id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setUserId() {
        String userId =entity().getUserId();
        if(userId!=null){
            set("user_id",userId);
        }
        return this;
    }
    /**
     * 设备id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setFacilitiesId() {
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null){
            set("facilities_id",facilitiesId);
        }
        return this;
    }
    /**
     * 用户设备id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setUserPhoneId() {
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            set("user_phone_id",userPhoneId);
        }
        return this;
    }
    /**
     * 调用方保证每次分配唯一请求id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setRequestId() {
        String requestId =entity().getRequestId();
        if(requestId!=null){
            set("request_id",requestId);
        }
        return this;
    }
    /**
     * 使用有效期开始时间
     */
    public YunMemberUserDeviceUpdateEntityWrapper setValidStartTime() {
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            set("valid_start_time",validStartTime);
        }
        return this;
    }
    /**
     * 使用有效期结束时间
     */
    public YunMemberUserDeviceUpdateEntityWrapper setValidEndTime() {
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            set("valid_end_time",validEndTime);
        }
        return this;
    }
    /**
     * 设备状态（冻结：0，使用中：50，已过期/注销：-50）
     */
    public YunMemberUserDeviceUpdateEntityWrapper setStatus() {
        Integer status =entity().getStatus();
        if(status!=null){
            set("status",status);
        }
        return this;
    }
    /**
     * 订购时间
     */
    public YunMemberUserDeviceUpdateEntityWrapper setBuyTime() {
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            set("buy_time",buyTime);
        }
        return this;
    }
    /**
     * 最近一次续费时间
     */
    public YunMemberUserDeviceUpdateEntityWrapper setLastRenewTime() {
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            set("last_renew_time",lastRenewTime);
        }
        return this;
    }
    /**
     * 创建时间
     */
    public YunMemberUserDeviceUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 最近修改时间
     */
    public YunMemberUserDeviceUpdateEntityWrapper setLastUpdateTime() {
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            set("last_update_time",lastUpdateTime);
        }
        return this;
    }
    /**
     * 
     */
    public YunMemberUserDeviceUpdateEntityWrapper setVersionId() {
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            set("version_id",versionId);
        }
        return this;
    }
    /**
     * 运行状态(0：空闲，1：运行中)
     */
    public YunMemberUserDeviceUpdateEntityWrapper setRunningStatus() {
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            set("running_status",runningStatus);
        }
        return this;
    }
    /**
     * 手机规格名称，不得超过64byte。(废弃)
     */
    public YunMemberUserDeviceUpdateEntityWrapper setSpecCode() {
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            set("spec_code",specCode);
        }
        return this;
    }
    /**
     * 设备系统标签Id
     */
    public YunMemberUserDeviceUpdateEntityWrapper setFkSysDeviceLabelId() {
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null){
            set("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
    }
    /**
     * <p>id</p>
     * 等于 = entity().getId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>id</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>id</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>id</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值%' entity().getId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * NOT LIKE '%值%' entity().getId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值' entity().getId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * LIKE '值%' entity().getId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

/**
     * <p>id</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idEq(Long id){
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
    public YunMemberUserDeviceUpdateEntityWrapper idNe(Long id){
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
    public YunMemberUserDeviceUpdateEntityWrapper idGt(Long id){
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
    public YunMemberUserDeviceUpdateEntityWrapper idGe(Long id){
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
    public YunMemberUserDeviceUpdateEntityWrapper idLt(Long id){
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
    public YunMemberUserDeviceUpdateEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
    }

    /**
     * <p>id</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idLike(Long id){
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
    public YunMemberUserDeviceUpdateEntityWrapper idNotLike(Long id){
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
    public YunMemberUserDeviceUpdateEntityWrapper idLikeLeft(Long id){
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
    public YunMemberUserDeviceUpdateEntityWrapper idLikeRight(Long id){
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
    public YunMemberUserDeviceUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper idIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper idIn(Long... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * 等于 = entity().getFkMemberId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdEq(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * 不等于 &lt;&gt; entity().getFkMemberId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdNe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 大于 &gt; entity().getFkMemberId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdGt(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 大于等于 &gt;= entity().getFkMemberId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdGe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 小于 &lt; entity().getFkMemberId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdLt(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * 小于等于 &lt;= entity().getFkMemberId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdLe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdBetween(Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberId,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * NOT BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdNotBetween(Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberId,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * NOT BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>商户id</p>
     * LIKE '%值%' entity().getFkMemberId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * NOT LIKE '%值%' entity().getFkMemberId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdNotLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>商户id</p>
     * LIKE '%值' entity().getFkMemberId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdLikeLeft(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * LIKE '值%' entity().getFkMemberId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdLikeRight(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeRight("fk_member_id",fkMemberId);
        }
        return this;
     }

/**
     * <p>商户id</p>
     * 等于 =
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdEq(Long fkMemberId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdNe(Long fkMemberId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdGt(Long fkMemberId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdGe(Long fkMemberId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdLt(Long fkMemberId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdLe(Long fkMemberId){
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>商户id</p>
     * LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdLike(Long fkMemberId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdNotLike(Long fkMemberId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdLikeLeft(Long fkMemberId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdIn(Long... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * 等于 = entity().getFkYunMemberFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdEq(){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null){
            eq("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * 不等于 &lt;&gt; entity().getFkYunMemberFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdNe(){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null){
            ne("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * 大于 &gt; entity().getFkYunMemberFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdGt(){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null){
            gt("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * 大于等于 &gt;= entity().getFkYunMemberFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdGe(){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null){
            ge("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * 小于 &lt; entity().getFkYunMemberFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdLt(){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null){
            lt("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * 小于等于 &lt;= entity().getFkYunMemberFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdLe(){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null){
            le("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * BETWEEN  entity().getFkYunMemberFacilitiesId() AND 值2
     * @param fkYunMemberFacilitiesIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdBetween(Long fkYunMemberFacilitiesIdEnd){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null && fkYunMemberFacilitiesIdEnd!=null){
            between("fk_yun_member_facilities_id",fkYunMemberFacilitiesId,fkYunMemberFacilitiesIdEnd);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * NOT BETWEEN  entity().getFkYunMemberFacilitiesId() AND 值2
     * @param fkYunMemberFacilitiesIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdNotBetween(Long fkYunMemberFacilitiesIdEnd){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null && fkYunMemberFacilitiesIdEnd!=null){
            notBetween("fk_yun_member_facilities_id",fkYunMemberFacilitiesId,fkYunMemberFacilitiesIdEnd);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * BETWEEN  entity().getFkYunMemberFacilitiesId() AND 值2
     * @param fkYunMemberFacilitiesIdStart       值1
     * @param fkYunMemberFacilitiesIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdBetween(Long fkYunMemberFacilitiesIdStart,Long fkYunMemberFacilitiesIdEnd){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null && fkYunMemberFacilitiesIdEnd!=null){
            between("fk_yun_member_facilities_id",fkYunMemberFacilitiesIdStart,fkYunMemberFacilitiesIdEnd);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * NOT BETWEEN  entity().getFkYunMemberFacilitiesId() AND 值2
     * @param fkYunMemberFacilitiesIdStart       值1
     * @param fkYunMemberFacilitiesIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdNotBetween(Long fkYunMemberFacilitiesIdStart,Long fkYunMemberFacilitiesIdEnd){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null && fkYunMemberFacilitiesIdEnd!=null){
            notBetween("fk_yun_member_facilities_id",fkYunMemberFacilitiesIdStart,fkYunMemberFacilitiesIdEnd);
        }
        return this;
     }


    /**
     * <p>商户设备表id</p>
     * LIKE '%值%' entity().getFkYunMemberFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdLike(){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null){
            like("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * NOT LIKE '%值%' entity().getFkYunMemberFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdNotLike(){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null){
            notLike("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }


    /**
     * <p>商户设备表id</p>
     * LIKE '%值' entity().getFkYunMemberFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdLikeLeft(){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null){
            likeLeft("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

    /**
     * <p>商户设备表id</p>
     * LIKE '值%' entity().getFkYunMemberFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdLikeRight(){
        Long fkYunMemberFacilitiesId =entity().getFkYunMemberFacilitiesId();
        if(fkYunMemberFacilitiesId!=null){
            likeRight("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
     }

/**
     * <p>商户设备表id</p>
     * 等于 =
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdEq(Long fkYunMemberFacilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdNe(Long fkYunMemberFacilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdGt(Long fkYunMemberFacilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdGe(Long fkYunMemberFacilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdLt(Long fkYunMemberFacilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdLe(Long fkYunMemberFacilitiesId){
        if(fkYunMemberFacilitiesId!=null){
            le("fk_yun_member_facilities_id",fkYunMemberFacilitiesId);
        }
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * LIKE '%值%'
     * @param fkYunMemberFacilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdLike(Long fkYunMemberFacilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdNotLike(Long fkYunMemberFacilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdLikeLeft(Long fkYunMemberFacilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdLikeRight(Long fkYunMemberFacilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdIsNull(){
        isNull("fk_yun_member_facilities_id");
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdIsNotNull(){
        isNotNull("fk_yun_member_facilities_id");
        return this;
    }

    /**
     * <p>商户设备表id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdIn(Long... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdNotIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkYunMemberFacilitiesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_yun_member_facilities_id",values);
        }
        return this;
    }

    /**
     * <p>商户用户id</p>
     * 等于 = entity().getUserId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdEq(){
        String userId =entity().getUserId();
        if(userId!=null){
            eq("user_id",userId);
        }
        return this;
    }

    /**
     * <p>商户用户id</p>
     * 不等于 &lt;&gt; entity().getUserId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdNe(){
        String userId =entity().getUserId();
        if(userId!=null){
            ne("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * 大于 &gt; entity().getUserId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdGt(){
        String userId =entity().getUserId();
        if(userId!=null){
            gt("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * 大于等于 &gt;= entity().getUserId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdGe(){
        String userId =entity().getUserId();
        if(userId!=null){
            ge("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * 小于 &lt; entity().getUserId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdLt(){
        String userId =entity().getUserId();
        if(userId!=null){
            lt("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * 小于等于 &lt;= entity().getUserId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdLe(){
        String userId =entity().getUserId();
        if(userId!=null){
            le("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * BETWEEN  entity().getUserId() AND 值2
     * @param userIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdBetween(String userIdEnd){
        String userId =entity().getUserId();
        if(userId!=null && userIdEnd!=null){
            between("user_id",userId,userIdEnd);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * NOT BETWEEN  entity().getUserId() AND 值2
     * @param userIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdNotBetween(String userIdEnd){
        String userId =entity().getUserId();
        if(userId!=null && userIdEnd!=null){
            notBetween("user_id",userId,userIdEnd);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * BETWEEN  entity().getUserId() AND 值2
     * @param userIdStart       值1
     * @param userIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdBetween(String userIdStart,String userIdEnd){
        String userId =entity().getUserId();
        if(userId!=null && userIdEnd!=null){
            between("user_id",userIdStart,userIdEnd);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * NOT BETWEEN  entity().getUserId() AND 值2
     * @param userIdStart       值1
     * @param userIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdNotBetween(String userIdStart,String userIdEnd){
        String userId =entity().getUserId();
        if(userId!=null && userIdEnd!=null){
            notBetween("user_id",userIdStart,userIdEnd);
        }
        return this;
     }


    /**
     * <p>商户用户id</p>
     * LIKE '%值%' entity().getUserId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdLike(){
        String userId =entity().getUserId();
        if(userId!=null){
            like("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * NOT LIKE '%值%' entity().getUserId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdNotLike(){
        String userId =entity().getUserId();
        if(userId!=null){
            notLike("user_id",userId);
        }
        return this;
     }


    /**
     * <p>商户用户id</p>
     * LIKE '%值' entity().getUserId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdLikeLeft(){
        String userId =entity().getUserId();
        if(userId!=null){
            likeLeft("user_id",userId);
        }
        return this;
     }

    /**
     * <p>商户用户id</p>
     * LIKE '值%' entity().getUserId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdLikeRight(){
        String userId =entity().getUserId();
        if(userId!=null){
            likeRight("user_id",userId);
        }
        return this;
     }

/**
     * <p>商户用户id</p>
     * 等于 =
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdEq(String userId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userIdNe(String userId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userIdGt(String userId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userIdGe(String userId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userIdLt(String userId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userIdLe(String userId){
        if(userId!=null){
            le("user_id",userId);
        }
        return this;
    }

    /**
     * <p>商户用户id</p>
     * LIKE '%值%'
     * @param userId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdLike(String userId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userIdNotLike(String userId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userIdLikeLeft(String userId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userIdLikeRight(String userId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userIdIsNull(){
        isNull("user_id");
        return this;
    }

    /**
     * <p>商户用户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdIsNotNull(){
        isNotNull("user_id");
        return this;
    }

    /**
     * <p>商户用户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userIdIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper userIdIn(String... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper userIdNotIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper userIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_id",values);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * 等于 = entity().getFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdEq(){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null){
            eq("facilities_id",facilitiesId);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * 不等于 &lt;&gt; entity().getFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdNe(){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null){
            ne("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 大于 &gt; entity().getFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdGt(){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null){
            gt("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 大于等于 &gt;= entity().getFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdGe(){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null){
            ge("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 小于 &lt; entity().getFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdLt(){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null){
            lt("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * 小于等于 &lt;= entity().getFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdLe(){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null){
            le("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * BETWEEN  entity().getFacilitiesId() AND 值2
     * @param facilitiesIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdBetween(String facilitiesIdEnd){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null && facilitiesIdEnd!=null){
            between("facilities_id",facilitiesId,facilitiesIdEnd);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT BETWEEN  entity().getFacilitiesId() AND 值2
     * @param facilitiesIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdNotBetween(String facilitiesIdEnd){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null && facilitiesIdEnd!=null){
            notBetween("facilities_id",facilitiesId,facilitiesIdEnd);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * BETWEEN  entity().getFacilitiesId() AND 值2
     * @param facilitiesIdStart       值1
     * @param facilitiesIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdBetween(String facilitiesIdStart,String facilitiesIdEnd){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null && facilitiesIdEnd!=null){
            between("facilities_id",facilitiesIdStart,facilitiesIdEnd);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT BETWEEN  entity().getFacilitiesId() AND 值2
     * @param facilitiesIdStart       值1
     * @param facilitiesIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdNotBetween(String facilitiesIdStart,String facilitiesIdEnd){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null && facilitiesIdEnd!=null){
            notBetween("facilities_id",facilitiesIdStart,facilitiesIdEnd);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值%' entity().getFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdLike(){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null){
            like("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * NOT LIKE '%值%' entity().getFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdNotLike(){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null){
            notLike("facilities_id",facilitiesId);
        }
        return this;
     }


    /**
     * <p>设备id</p>
     * LIKE '%值' entity().getFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdLikeLeft(){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null){
            likeLeft("facilities_id",facilitiesId);
        }
        return this;
     }

    /**
     * <p>设备id</p>
     * LIKE '值%' entity().getFacilitiesId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdLikeRight(){
        String facilitiesId =entity().getFacilitiesId();
        if(facilitiesId!=null){
            likeRight("facilities_id",facilitiesId);
        }
        return this;
     }

/**
     * <p>设备id</p>
     * 等于 =
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdEq(String facilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdNe(String facilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdGt(String facilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdGe(String facilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdLt(String facilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdLe(String facilitiesId){
        if(facilitiesId!=null){
            le("facilities_id",facilitiesId);
        }
        return this;
    }

    /**
     * <p>设备id</p>
     * LIKE '%值%'
     * @param facilitiesId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdLike(String facilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdNotLike(String facilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdLikeLeft(String facilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdLikeRight(String facilitiesId){
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
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdIsNull(){
        isNull("facilities_id");
        return this;
    }

    /**
     * <p>设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdIsNotNull(){
        isNotNull("facilities_id");
        return this;
    }

    /**
     * <p>设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdIn(String... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdNotIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper facilitiesIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("facilities_id",values);
        }
        return this;
    }

    /**
     * <p>用户设备id</p>
     * 等于 = entity().getUserPhoneId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdEq(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            eq("user_phone_id",userPhoneId);
        }
        return this;
    }

    /**
     * <p>用户设备id</p>
     * 不等于 &lt;&gt; entity().getUserPhoneId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdNe(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            ne("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * 大于 &gt; entity().getUserPhoneId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdGt(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            gt("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * 大于等于 &gt;= entity().getUserPhoneId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdGe(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            ge("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * 小于 &lt; entity().getUserPhoneId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdLt(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            lt("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * 小于等于 &lt;= entity().getUserPhoneId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdLe(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            le("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * BETWEEN  entity().getUserPhoneId() AND 值2
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdBetween(String userPhoneIdEnd){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null && userPhoneIdEnd!=null){
            between("user_phone_id",userPhoneId,userPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * NOT BETWEEN  entity().getUserPhoneId() AND 值2
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdNotBetween(String userPhoneIdEnd){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null && userPhoneIdEnd!=null){
            notBetween("user_phone_id",userPhoneId,userPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * BETWEEN  entity().getUserPhoneId() AND 值2
     * @param userPhoneIdStart       值1
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdBetween(String userPhoneIdStart,String userPhoneIdEnd){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null && userPhoneIdEnd!=null){
            between("user_phone_id",userPhoneIdStart,userPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * NOT BETWEEN  entity().getUserPhoneId() AND 值2
     * @param userPhoneIdStart       值1
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdNotBetween(String userPhoneIdStart,String userPhoneIdEnd){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null && userPhoneIdEnd!=null){
            notBetween("user_phone_id",userPhoneIdStart,userPhoneIdEnd);
        }
        return this;
     }


    /**
     * <p>用户设备id</p>
     * LIKE '%值%' entity().getUserPhoneId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdLike(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            like("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * NOT LIKE '%值%' entity().getUserPhoneId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdNotLike(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            notLike("user_phone_id",userPhoneId);
        }
        return this;
     }


    /**
     * <p>用户设备id</p>
     * LIKE '%值' entity().getUserPhoneId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdLikeLeft(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            likeLeft("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p>用户设备id</p>
     * LIKE '值%' entity().getUserPhoneId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdLikeRight(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            likeRight("user_phone_id",userPhoneId);
        }
        return this;
     }

/**
     * <p>用户设备id</p>
     * 等于 =
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdEq(String userPhoneId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdNe(String userPhoneId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdGt(String userPhoneId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdGe(String userPhoneId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdLt(String userPhoneId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdLe(String userPhoneId){
        if(userPhoneId!=null){
            le("user_phone_id",userPhoneId);
        }
        return this;
    }

    /**
     * <p>用户设备id</p>
     * LIKE '%值%'
     * @param userPhoneId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdLike(String userPhoneId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdNotLike(String userPhoneId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdLikeLeft(String userPhoneId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdLikeRight(String userPhoneId){
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
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdIsNull(){
        isNull("user_phone_id");
        return this;
    }

    /**
     * <p>用户设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdIsNotNull(){
        isNotNull("user_phone_id");
        return this;
    }

    /**
     * <p>用户设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdIn(String... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdNotIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper userPhoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_phone_id",values);
        }
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 等于 = entity().getRequestId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdEq(){
        String requestId =entity().getRequestId();
        if(requestId!=null){
            eq("request_id",requestId);
        }
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 不等于 &lt;&gt; entity().getRequestId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdNe(){
        String requestId =entity().getRequestId();
        if(requestId!=null){
            ne("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 大于 &gt; entity().getRequestId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdGt(){
        String requestId =entity().getRequestId();
        if(requestId!=null){
            gt("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 大于等于 &gt;= entity().getRequestId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdGe(){
        String requestId =entity().getRequestId();
        if(requestId!=null){
            ge("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 小于 &lt; entity().getRequestId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdLt(){
        String requestId =entity().getRequestId();
        if(requestId!=null){
            lt("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * 小于等于 &lt;= entity().getRequestId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdLe(){
        String requestId =entity().getRequestId();
        if(requestId!=null){
            le("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * BETWEEN  entity().getRequestId() AND 值2
     * @param requestIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdBetween(String requestIdEnd){
        String requestId =entity().getRequestId();
        if(requestId!=null && requestIdEnd!=null){
            between("request_id",requestId,requestIdEnd);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * NOT BETWEEN  entity().getRequestId() AND 值2
     * @param requestIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdNotBetween(String requestIdEnd){
        String requestId =entity().getRequestId();
        if(requestId!=null && requestIdEnd!=null){
            notBetween("request_id",requestId,requestIdEnd);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * BETWEEN  entity().getRequestId() AND 值2
     * @param requestIdStart       值1
     * @param requestIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdBetween(String requestIdStart,String requestIdEnd){
        String requestId =entity().getRequestId();
        if(requestId!=null && requestIdEnd!=null){
            between("request_id",requestIdStart,requestIdEnd);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * NOT BETWEEN  entity().getRequestId() AND 值2
     * @param requestIdStart       值1
     * @param requestIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdNotBetween(String requestIdStart,String requestIdEnd){
        String requestId =entity().getRequestId();
        if(requestId!=null && requestIdEnd!=null){
            notBetween("request_id",requestIdStart,requestIdEnd);
        }
        return this;
     }


    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * LIKE '%值%' entity().getRequestId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdLike(){
        String requestId =entity().getRequestId();
        if(requestId!=null){
            like("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * NOT LIKE '%值%' entity().getRequestId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdNotLike(){
        String requestId =entity().getRequestId();
        if(requestId!=null){
            notLike("request_id",requestId);
        }
        return this;
     }


    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * LIKE '%值' entity().getRequestId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdLikeLeft(){
        String requestId =entity().getRequestId();
        if(requestId!=null){
            likeLeft("request_id",requestId);
        }
        return this;
     }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * LIKE '值%' entity().getRequestId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdLikeRight(){
        String requestId =entity().getRequestId();
        if(requestId!=null){
            likeRight("request_id",requestId);
        }
        return this;
     }

/**
     * <p>调用方保证每次分配唯一请求id</p>
     * 等于 =
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdEq(String requestId){
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
    public YunMemberUserDeviceUpdateEntityWrapper requestIdNe(String requestId){
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
    public YunMemberUserDeviceUpdateEntityWrapper requestIdGt(String requestId){
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
    public YunMemberUserDeviceUpdateEntityWrapper requestIdGe(String requestId){
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
    public YunMemberUserDeviceUpdateEntityWrapper requestIdLt(String requestId){
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
    public YunMemberUserDeviceUpdateEntityWrapper requestIdLe(String requestId){
        if(requestId!=null){
            le("request_id",requestId);
        }
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * LIKE '%值%'
     * @param requestId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdLike(String requestId){
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
    public YunMemberUserDeviceUpdateEntityWrapper requestIdNotLike(String requestId){
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
    public YunMemberUserDeviceUpdateEntityWrapper requestIdLikeLeft(String requestId){
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
    public YunMemberUserDeviceUpdateEntityWrapper requestIdLikeRight(String requestId){
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
    public YunMemberUserDeviceUpdateEntityWrapper requestIdIsNull(){
        isNull("request_id");
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdIsNotNull(){
        isNotNull("request_id");
        return this;
    }

    /**
     * <p>调用方保证每次分配唯一请求id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper requestIdIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper requestIdIn(String... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper requestIdNotIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper requestIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("request_id",values);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 等于 = entity().getValidStartTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeEq(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            eq("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * 不等于 &lt;&gt; entity().getValidStartTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeNe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            ne("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于 &gt; entity().getValidStartTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeGt(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            gt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 大于等于 &gt;= entity().getValidStartTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeGe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            ge("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于 &lt; entity().getValidStartTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeLt(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            lt("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * 小于等于 &lt;= entity().getValidStartTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeLe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            le("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeBetween(Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            between("valid_start_time",validStartTime,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeNotBetween(Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTime,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeBetween(Date validStartTimeStart,Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            between("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT BETWEEN  entity().getValidStartTime() AND 值2
     * @param validStartTimeStart       值1
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeNotBetween(Date validStartTimeStart,Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%' entity().getValidStartTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeLike(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            like("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT LIKE '%值%' entity().getValidStartTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeNotLike(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            notLike("valid_start_time",validStartTime);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值' entity().getValidStartTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeLikeLeft(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            likeLeft("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '值%' entity().getValidStartTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeLikeRight(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            likeRight("valid_start_time",validStartTime);
        }
        return this;
     }

/**
     * <p>使用有效期开始时间</p>
     * 等于 =
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeEq(Date validStartTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeNe(Date validStartTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeGt(Date validStartTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeGe(Date validStartTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeLt(Date validStartTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeLe(Date validStartTime){
        if(validStartTime!=null){
            le("valid_start_time",validStartTime);
        }
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%'
     * @param validStartTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeLike(Date validStartTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeNotLike(Date validStartTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeLikeLeft(Date validStartTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeLikeRight(Date validStartTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeIsNull(){
        isNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeIsNotNull(){
        isNotNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeIn(Date... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper validStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_start_time",values);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 等于 = entity().getValidEndTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeEq(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            eq("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * 不等于 &lt;&gt; entity().getValidEndTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeNe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            ne("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于 &gt; entity().getValidEndTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeGt(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            gt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 大于等于 &gt;= entity().getValidEndTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeGe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            ge("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于 &lt; entity().getValidEndTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeLt(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            lt("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * 小于等于 &lt;= entity().getValidEndTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeLe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            le("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeBetween(Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            between("valid_end_time",validEndTime,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeNotBetween(Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTime,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeBetween(Date validEndTimeStart,Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            between("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT BETWEEN  entity().getValidEndTime() AND 值2
     * @param validEndTimeStart       值1
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeNotBetween(Date validEndTimeStart,Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%' entity().getValidEndTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeLike(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            like("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT LIKE '%值%' entity().getValidEndTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeNotLike(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            notLike("valid_end_time",validEndTime);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值' entity().getValidEndTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeLikeLeft(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            likeLeft("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '值%' entity().getValidEndTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeLikeRight(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            likeRight("valid_end_time",validEndTime);
        }
        return this;
     }

/**
     * <p>使用有效期结束时间</p>
     * 等于 =
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeEq(Date validEndTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeNe(Date validEndTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeGt(Date validEndTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeGe(Date validEndTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeLt(Date validEndTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeLe(Date validEndTime){
        if(validEndTime!=null){
            le("valid_end_time",validEndTime);
        }
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%'
     * @param validEndTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeLike(Date validEndTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeNotLike(Date validEndTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeLikeLeft(Date validEndTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeLikeRight(Date validEndTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeIsNull(){
        isNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeIsNotNull(){
        isNotNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeIn(Date... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper validEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_end_time",values);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

/**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusEq(Integer status){
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
    public YunMemberUserDeviceUpdateEntityWrapper statusNe(Integer status){
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
    public YunMemberUserDeviceUpdateEntityWrapper statusGt(Integer status){
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
    public YunMemberUserDeviceUpdateEntityWrapper statusGe(Integer status){
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
    public YunMemberUserDeviceUpdateEntityWrapper statusLt(Integer status){
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
    public YunMemberUserDeviceUpdateEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusLike(Integer status){
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
    public YunMemberUserDeviceUpdateEntityWrapper statusNotLike(Integer status){
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
    public YunMemberUserDeviceUpdateEntityWrapper statusLikeLeft(Integer status){
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
    public YunMemberUserDeviceUpdateEntityWrapper statusLikeRight(Integer status){
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
    public YunMemberUserDeviceUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper statusIn(Collection<Integer> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper statusIn(Integer... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper statusNotIn(Collection<Integer> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 等于 = entity().getBuyTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeEq(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            eq("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * 不等于 &lt;&gt; entity().getBuyTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeNe(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            ne("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 大于 &gt; entity().getBuyTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeGt(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            gt("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 大于等于 &gt;= entity().getBuyTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeGe(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            ge("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 小于 &lt; entity().getBuyTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeLt(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            lt("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * 小于等于 &lt;= entity().getBuyTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeLe(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            le("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * BETWEEN  entity().getBuyTime() AND 值2
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeBetween(Date buyTimeEnd){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null && buyTimeEnd!=null){
            between("buy_time",buyTime,buyTimeEnd);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * NOT BETWEEN  entity().getBuyTime() AND 值2
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeNotBetween(Date buyTimeEnd){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null && buyTimeEnd!=null){
            notBetween("buy_time",buyTime,buyTimeEnd);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * BETWEEN  entity().getBuyTime() AND 值2
     * @param buyTimeStart       值1
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeBetween(Date buyTimeStart,Date buyTimeEnd){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null && buyTimeEnd!=null){
            between("buy_time",buyTimeStart,buyTimeEnd);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * NOT BETWEEN  entity().getBuyTime() AND 值2
     * @param buyTimeStart       值1
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeNotBetween(Date buyTimeStart,Date buyTimeEnd){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null && buyTimeEnd!=null){
            notBetween("buy_time",buyTimeStart,buyTimeEnd);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值%' entity().getBuyTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeLike(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            like("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * NOT LIKE '%值%' entity().getBuyTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeNotLike(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            notLike("buy_time",buyTime);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值' entity().getBuyTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeLikeLeft(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            likeLeft("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * LIKE '值%' entity().getBuyTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeLikeRight(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            likeRight("buy_time",buyTime);
        }
        return this;
     }

/**
     * <p>订购时间</p>
     * 等于 =
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeEq(Date buyTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeNe(Date buyTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeGt(Date buyTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeGe(Date buyTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeLt(Date buyTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeLe(Date buyTime){
        if(buyTime!=null){
            le("buy_time",buyTime);
        }
        return this;
    }

    /**
     * <p>订购时间</p>
     * LIKE '%值%'
     * @param buyTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeLike(Date buyTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeNotLike(Date buyTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeLikeLeft(Date buyTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeLikeRight(Date buyTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeIsNull(){
        isNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeIsNotNull(){
        isNotNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeIn(Date... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper buyTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("buy_time",values);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 等于 = entity().getLastRenewTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeEq(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            eq("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * 不等于 &lt;&gt; entity().getLastRenewTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeNe(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            ne("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 大于 &gt; entity().getLastRenewTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeGt(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            gt("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 大于等于 &gt;= entity().getLastRenewTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeGe(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            ge("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 小于 &lt; entity().getLastRenewTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeLt(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            lt("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * 小于等于 &lt;= entity().getLastRenewTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeLe(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            le("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * BETWEEN  entity().getLastRenewTime() AND 值2
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeBetween(Date lastRenewTimeEnd){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null && lastRenewTimeEnd!=null){
            between("last_renew_time",lastRenewTime,lastRenewTimeEnd);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * NOT BETWEEN  entity().getLastRenewTime() AND 值2
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeNotBetween(Date lastRenewTimeEnd){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null && lastRenewTimeEnd!=null){
            notBetween("last_renew_time",lastRenewTime,lastRenewTimeEnd);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * BETWEEN  entity().getLastRenewTime() AND 值2
     * @param lastRenewTimeStart       值1
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null && lastRenewTimeEnd!=null){
            between("last_renew_time",lastRenewTimeStart,lastRenewTimeEnd);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * NOT BETWEEN  entity().getLastRenewTime() AND 值2
     * @param lastRenewTimeStart       值1
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeNotBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null && lastRenewTimeEnd!=null){
            notBetween("last_renew_time",lastRenewTimeStart,lastRenewTimeEnd);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值%' entity().getLastRenewTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeLike(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            like("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * NOT LIKE '%值%' entity().getLastRenewTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeNotLike(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            notLike("last_renew_time",lastRenewTime);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值' entity().getLastRenewTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeLikeLeft(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            likeLeft("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * LIKE '值%' entity().getLastRenewTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeLikeRight(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            likeRight("last_renew_time",lastRenewTime);
        }
        return this;
     }

/**
     * <p>最近一次续费时间</p>
     * 等于 =
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeEq(Date lastRenewTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeNe(Date lastRenewTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeGt(Date lastRenewTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeGe(Date lastRenewTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeLt(Date lastRenewTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeLe(Date lastRenewTime){
        if(lastRenewTime!=null){
            le("last_renew_time",lastRenewTime);
        }
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值%'
     * @param lastRenewTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeLike(Date lastRenewTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeNotLike(Date lastRenewTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeLikeLeft(Date lastRenewTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeLikeRight(Date lastRenewTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeIsNull(){
        isNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeIsNotNull(){
        isNotNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeIn(Date... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastRenewTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_renew_time",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%' entity().getCreateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值' entity().getCreateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%' entity().getCreateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

/**
     * <p>创建时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeEq(Date createTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper createTimeNe(Date createTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper createTimeGt(Date createTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper createTimeGe(Date createTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper createTimeLt(Date createTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeLike(Date createTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper createTimeIn(Date... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最近修改时间</p>
     * LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * NOT LIKE '%值%' entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最近修改时间</p>
     * LIKE '%值' entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * LIKE '值%' entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

/**
     * <p>最近修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }

    /**
     * <p></p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdEq(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getVersionId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%' entity().getVersionId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值' entity().getVersionId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%' entity().getVersionId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

/**
     * <p></p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdEq(Long versionId){
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
    public YunMemberUserDeviceUpdateEntityWrapper versionIdNe(Long versionId){
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
    public YunMemberUserDeviceUpdateEntityWrapper versionIdGt(Long versionId){
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
    public YunMemberUserDeviceUpdateEntityWrapper versionIdGe(Long versionId){
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
    public YunMemberUserDeviceUpdateEntityWrapper versionIdLt(Long versionId){
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
    public YunMemberUserDeviceUpdateEntityWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
    }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdLike(Long versionId){
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
    public YunMemberUserDeviceUpdateEntityWrapper versionIdNotLike(Long versionId){
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
    public YunMemberUserDeviceUpdateEntityWrapper versionIdLikeLeft(Long versionId){
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
    public YunMemberUserDeviceUpdateEntityWrapper versionIdLikeRight(Long versionId){
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
    public YunMemberUserDeviceUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper versionIdIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper versionIdIn(Long... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 = entity().getRunningStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusEq(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            eq("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 不等于 &lt;&gt; entity().getRunningStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusNe(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            ne("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于 &gt; entity().getRunningStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusGt(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            gt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 大于等于 &gt;= entity().getRunningStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusGe(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            ge("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于 &lt; entity().getRunningStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusLt(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            lt("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 小于等于 &lt;= entity().getRunningStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusLe(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            le("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusBetween(Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            between("running_status",runningStatus,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusNotBetween(Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            notBetween("running_status",runningStatus,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusBetween(Integer runningStatusStart,Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            between("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT BETWEEN  entity().getRunningStatus() AND 值2
     * @param runningStatusStart       值1
     * @param runningStatusEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusNotBetween(Integer runningStatusStart,Integer runningStatusEnd){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null && runningStatusEnd!=null){
            notBetween("running_status",runningStatusStart,runningStatusEnd);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值%' entity().getRunningStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusLike(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            like("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * NOT LIKE '%值%' entity().getRunningStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusNotLike(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            notLike("running_status",runningStatus);
        }
        return this;
     }


    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值' entity().getRunningStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusLikeLeft(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            likeLeft("running_status",runningStatus);
        }
        return this;
     }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '值%' entity().getRunningStatus()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusLikeRight(){
        Integer runningStatus =entity().getRunningStatus();
        if(runningStatus!=null){
            likeRight("running_status",runningStatus);
        }
        return this;
     }

/**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * 等于 =
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusEq(Integer runningStatus){
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
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusNe(Integer runningStatus){
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
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusGt(Integer runningStatus){
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
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusGe(Integer runningStatus){
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
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusLt(Integer runningStatus){
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
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusLe(Integer runningStatus){
        if(runningStatus!=null){
            le("running_status",runningStatus);
        }
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * LIKE '%值%'
     * @param runningStatus       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusLike(Integer runningStatus){
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
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusNotLike(Integer runningStatus){
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
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusLikeLeft(Integer runningStatus){
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
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusLikeRight(Integer runningStatus){
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
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusIsNull(){
        isNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusIsNotNull(){
        isNotNull("running_status");
        return this;
    }

    /**
     * <p>运行状态(0：空闲，1：运行中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusIn(Collection<Integer> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusIn(Integer... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusNotIn(Collection<Integer> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper runningStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("running_status",values);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 等于 = entity().getSpecCode()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeEq(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            eq("spec_code",specCode);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 不等于 &lt;&gt; entity().getSpecCode()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeNe(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            ne("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 大于 &gt; entity().getSpecCode()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeGt(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            gt("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 大于等于 &gt;= entity().getSpecCode()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeGe(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            ge("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 小于 &lt; entity().getSpecCode()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeLt(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            lt("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 小于等于 &lt;= entity().getSpecCode()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeLe(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            le("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * BETWEEN  entity().getSpecCode() AND 值2
     * @param specCodeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeBetween(String specCodeEnd){
        String specCode =entity().getSpecCode();
        if(specCode!=null && specCodeEnd!=null){
            between("spec_code",specCode,specCodeEnd);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * NOT BETWEEN  entity().getSpecCode() AND 值2
     * @param specCodeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeNotBetween(String specCodeEnd){
        String specCode =entity().getSpecCode();
        if(specCode!=null && specCodeEnd!=null){
            notBetween("spec_code",specCode,specCodeEnd);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * BETWEEN  entity().getSpecCode() AND 值2
     * @param specCodeStart       值1
     * @param specCodeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeBetween(String specCodeStart,String specCodeEnd){
        String specCode =entity().getSpecCode();
        if(specCode!=null && specCodeEnd!=null){
            between("spec_code",specCodeStart,specCodeEnd);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * NOT BETWEEN  entity().getSpecCode() AND 值2
     * @param specCodeStart       值1
     * @param specCodeEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeNotBetween(String specCodeStart,String specCodeEnd){
        String specCode =entity().getSpecCode();
        if(specCode!=null && specCodeEnd!=null){
            notBetween("spec_code",specCodeStart,specCodeEnd);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * LIKE '%值%' entity().getSpecCode()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeLike(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            like("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * NOT LIKE '%值%' entity().getSpecCode()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeNotLike(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            notLike("spec_code",specCode);
        }
        return this;
     }


    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * LIKE '%值' entity().getSpecCode()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeLikeLeft(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            likeLeft("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * LIKE '值%' entity().getSpecCode()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeLikeRight(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            likeRight("spec_code",specCode);
        }
        return this;
     }

/**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * 等于 =
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeEq(String specCode){
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
    public YunMemberUserDeviceUpdateEntityWrapper specCodeNe(String specCode){
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
    public YunMemberUserDeviceUpdateEntityWrapper specCodeGt(String specCode){
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
    public YunMemberUserDeviceUpdateEntityWrapper specCodeGe(String specCode){
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
    public YunMemberUserDeviceUpdateEntityWrapper specCodeLt(String specCode){
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
    public YunMemberUserDeviceUpdateEntityWrapper specCodeLe(String specCode){
        if(specCode!=null){
            le("spec_code",specCode);
        }
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * LIKE '%值%'
     * @param specCode       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeLike(String specCode){
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
    public YunMemberUserDeviceUpdateEntityWrapper specCodeNotLike(String specCode){
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
    public YunMemberUserDeviceUpdateEntityWrapper specCodeLikeLeft(String specCode){
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
    public YunMemberUserDeviceUpdateEntityWrapper specCodeLikeRight(String specCode){
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
    public YunMemberUserDeviceUpdateEntityWrapper specCodeIsNull(){
        isNull("spec_code");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeIsNotNull(){
        isNotNull("spec_code");
        return this;
    }

    /**
     * <p>手机规格名称，不得超过64byte。(废弃)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper specCodeIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper specCodeIn(String... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper specCodeNotIn(Collection<String> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper specCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("spec_code",values);
        }
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * 等于 = entity().getFkSysDeviceLabelId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdEq(){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null){
            eq("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * 不等于 &lt;&gt; entity().getFkSysDeviceLabelId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdNe(){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null){
            ne("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * 大于 &gt; entity().getFkSysDeviceLabelId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdGt(){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null){
            gt("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * 大于等于 &gt;= entity().getFkSysDeviceLabelId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdGe(){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null){
            ge("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * 小于 &lt; entity().getFkSysDeviceLabelId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdLt(){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null){
            lt("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * 小于等于 &lt;= entity().getFkSysDeviceLabelId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdLe(){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null){
            le("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * BETWEEN  entity().getFkSysDeviceLabelId() AND 值2
     * @param fkSysDeviceLabelIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdBetween(Long fkSysDeviceLabelIdEnd){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null && fkSysDeviceLabelIdEnd!=null){
            between("fk_sys_device_label_id",fkSysDeviceLabelId,fkSysDeviceLabelIdEnd);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * NOT BETWEEN  entity().getFkSysDeviceLabelId() AND 值2
     * @param fkSysDeviceLabelIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdNotBetween(Long fkSysDeviceLabelIdEnd){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null && fkSysDeviceLabelIdEnd!=null){
            notBetween("fk_sys_device_label_id",fkSysDeviceLabelId,fkSysDeviceLabelIdEnd);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * BETWEEN  entity().getFkSysDeviceLabelId() AND 值2
     * @param fkSysDeviceLabelIdStart       值1
     * @param fkSysDeviceLabelIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdBetween(Long fkSysDeviceLabelIdStart,Long fkSysDeviceLabelIdEnd){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null && fkSysDeviceLabelIdEnd!=null){
            between("fk_sys_device_label_id",fkSysDeviceLabelIdStart,fkSysDeviceLabelIdEnd);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * NOT BETWEEN  entity().getFkSysDeviceLabelId() AND 值2
     * @param fkSysDeviceLabelIdStart       值1
     * @param fkSysDeviceLabelIdEnd      值2
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdNotBetween(Long fkSysDeviceLabelIdStart,Long fkSysDeviceLabelIdEnd){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null && fkSysDeviceLabelIdEnd!=null){
            notBetween("fk_sys_device_label_id",fkSysDeviceLabelIdStart,fkSysDeviceLabelIdEnd);
        }
        return this;
     }


    /**
     * <p>设备系统标签Id</p>
     * LIKE '%值%' entity().getFkSysDeviceLabelId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdLike(){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null){
            like("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * NOT LIKE '%值%' entity().getFkSysDeviceLabelId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdNotLike(){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null){
            notLike("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }


    /**
     * <p>设备系统标签Id</p>
     * LIKE '%值' entity().getFkSysDeviceLabelId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdLikeLeft(){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null){
            likeLeft("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

    /**
     * <p>设备系统标签Id</p>
     * LIKE '值%' entity().getFkSysDeviceLabelId()
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdLikeRight(){
        Long fkSysDeviceLabelId =entity().getFkSysDeviceLabelId();
        if(fkSysDeviceLabelId!=null){
            likeRight("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
     }

/**
     * <p>设备系统标签Id</p>
     * 等于 =
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdEq(Long fkSysDeviceLabelId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdNe(Long fkSysDeviceLabelId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdGt(Long fkSysDeviceLabelId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdGe(Long fkSysDeviceLabelId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdLt(Long fkSysDeviceLabelId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdLe(Long fkSysDeviceLabelId){
        if(fkSysDeviceLabelId!=null){
            le("fk_sys_device_label_id",fkSysDeviceLabelId);
        }
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * LIKE '%值%'
     * @param fkSysDeviceLabelId       值
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdLike(Long fkSysDeviceLabelId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdNotLike(Long fkSysDeviceLabelId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdLikeLeft(Long fkSysDeviceLabelId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdLikeRight(Long fkSysDeviceLabelId){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdIsNull(){
        isNull("fk_sys_device_label_id");
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdIsNotNull(){
        isNotNull("fk_sys_device_label_id");
        return this;
    }

    /**
     * <p>设备系统标签Id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdIn(Long... values){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdNotIn(Collection<Long> value){
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
    public YunMemberUserDeviceUpdateEntityWrapper fkSysDeviceLabelIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_sys_device_label_id",values);
        }
        return this;
    }


}
