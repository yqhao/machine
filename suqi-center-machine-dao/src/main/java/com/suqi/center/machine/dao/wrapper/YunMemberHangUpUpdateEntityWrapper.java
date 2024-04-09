package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.YunMemberHangUp;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 商户挂机时长表
 * </p>
 * "yun_member_hang_up"
 * @author PC001
 */
public class YunMemberHangUpUpdateEntityWrapper extends UpdateWrapper<YunMemberHangUp> {

    public static YunMemberHangUpUpdateEntityWrapper wrapper(YunMemberHangUp entity) {
        return new YunMemberHangUpUpdateEntityWrapper(entity);
    }

    private YunMemberHangUp entity;

    public YunMemberHangUpUpdateEntityWrapper(YunMemberHangUp entity) {
        this.entity=entity;
    }

    /**
     * id
     */
    public YunMemberHangUpUpdateEntityWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 商户id
     */
    public YunMemberHangUpUpdateEntityWrapper setFkMemberId(Long fkMemberId) {
         set("fk_member_id",fkMemberId);
        return this;
    }
    /**
     * 房间session
     */
    public YunMemberHangUpUpdateEntityWrapper setRoomSession(String roomSession) {
         set("room_session",roomSession);
        return this;
    }
    /**
     * 设备唯一码
     */
    public YunMemberHangUpUpdateEntityWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 玩家ID
     */
    public YunMemberHangUpUpdateEntityWrapper setPhoneId(String phoneId) {
         set("phone_id",phoneId);
        return this;
    }
    /**
     * 应用包名
     */
    public YunMemberHangUpUpdateEntityWrapper setPkg(String pkg) {
         set("pkg",pkg);
        return this;
    }
    /**
     * 状态(0：已退出，5：in，10：out，15：idle)
     */
    public YunMemberHangUpUpdateEntityWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 挂机时长单位（秒）
     */
    public YunMemberHangUpUpdateEntityWrapper setHangUpTime(Long hangUpTime) {
         set("hang_up_time",hangUpTime);
        return this;
    }
    /**
     * 挂机到期时间
     */
    public YunMemberHangUpUpdateEntityWrapper setHangUpMaturityTime(Date hangUpMaturityTime) {
         set("hang_up_maturity_time",hangUpMaturityTime);
        return this;
    }
    /**
     * 创建时间
     */
    public YunMemberHangUpUpdateEntityWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最近修改时间
     */
    public YunMemberHangUpUpdateEntityWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public YunMemberHangUpUpdateEntityWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }

    protected YunMemberHangUp entity() {
        if(entity==null){
            throw new NullPointerException("YunMemberHangUp is null");
        }
        return entity;
    }

    /**
     * id
     */
    public YunMemberHangUpUpdateEntityWrapper setId() {
        Long id =entity().getId();
        if(id!=null){
            set("id",id);
        }
        return this;
    }
    /**
     * 商户id
     */
    public YunMemberHangUpUpdateEntityWrapper setFkMemberId() {
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            set("fk_member_id",fkMemberId);
        }
        return this;
    }
    /**
     * 房间session
     */
    public YunMemberHangUpUpdateEntityWrapper setRoomSession() {
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            set("room_session",roomSession);
        }
        return this;
    }
    /**
     * 设备唯一码
     */
    public YunMemberHangUpUpdateEntityWrapper setDeviceId() {
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            set("device_id",deviceId);
        }
        return this;
    }
    /**
     * 玩家ID
     */
    public YunMemberHangUpUpdateEntityWrapper setPhoneId() {
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            set("phone_id",phoneId);
        }
        return this;
    }
    /**
     * 应用包名
     */
    public YunMemberHangUpUpdateEntityWrapper setPkg() {
        String pkg =entity().getPkg();
        if(pkg!=null){
            set("pkg",pkg);
        }
        return this;
    }
    /**
     * 状态(0：已退出，5：in，10：out，15：idle)
     */
    public YunMemberHangUpUpdateEntityWrapper setStatus() {
        Integer status =entity().getStatus();
        if(status!=null){
            set("status",status);
        }
        return this;
    }
    /**
     * 挂机时长单位（秒）
     */
    public YunMemberHangUpUpdateEntityWrapper setHangUpTime() {
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            set("hang_up_time",hangUpTime);
        }
        return this;
    }
    /**
     * 挂机到期时间
     */
    public YunMemberHangUpUpdateEntityWrapper setHangUpMaturityTime() {
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            set("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }
    /**
     * 创建时间
     */
    public YunMemberHangUpUpdateEntityWrapper setCreateTime() {
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            set("create_time",createTime);
        }
        return this;
    }
    /**
     * 最近修改时间
     */
    public YunMemberHangUpUpdateEntityWrapper setLastUpdateTime() {
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            set("last_update_time",lastUpdateTime);
        }
        return this;
    }
    /**
     * 
     */
    public YunMemberHangUpUpdateEntityWrapper setVersionId() {
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            set("version_id",versionId);
        }
        return this;
    }

    public YunMemberHangUpUpdateEntityWrapper Where() {
        return this;
    }

    /**
     * <p>id</p>
     * 等于 = entity().getId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper idEq(){
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
    public YunMemberHangUpUpdateEntityWrapper idNe(){
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
    public YunMemberHangUpUpdateEntityWrapper idGt(){
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
    public YunMemberHangUpUpdateEntityWrapper idGe(){
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
    public YunMemberHangUpUpdateEntityWrapper idLt(){
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
    public YunMemberHangUpUpdateEntityWrapper idLe(){
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
    public YunMemberHangUpUpdateEntityWrapper idBetween(Long idEnd){
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
    public YunMemberHangUpUpdateEntityWrapper idNotBetween(Long idEnd){
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
    public YunMemberHangUpUpdateEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public YunMemberHangUpUpdateEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public YunMemberHangUpUpdateEntityWrapper idLike(){
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
    public YunMemberHangUpUpdateEntityWrapper idNotLike(){
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
    public YunMemberHangUpUpdateEntityWrapper idLikeLeft(){
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
    public YunMemberHangUpUpdateEntityWrapper idLikeRight(){
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
    public YunMemberHangUpUpdateEntityWrapper idEq(Long id){
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
    public YunMemberHangUpUpdateEntityWrapper idNe(Long id){
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
    public YunMemberHangUpUpdateEntityWrapper idGt(Long id){
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
    public YunMemberHangUpUpdateEntityWrapper idGe(Long id){
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
    public YunMemberHangUpUpdateEntityWrapper idLt(Long id){
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
    public YunMemberHangUpUpdateEntityWrapper idLe(Long id){
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
    public YunMemberHangUpUpdateEntityWrapper idLike(Long id){
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
    public YunMemberHangUpUpdateEntityWrapper idNotLike(Long id){
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
    public YunMemberHangUpUpdateEntityWrapper idLikeLeft(Long id){
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
    public YunMemberHangUpUpdateEntityWrapper idLikeRight(Long id){
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
    public YunMemberHangUpUpdateEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper idIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateEntityWrapper idIn(Long... values){
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
    public YunMemberHangUpUpdateEntityWrapper idNotIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateEntityWrapper idNotIn(Long... values){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdEq(){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdNe(){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdGt(){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdGe(){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdLt(){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdLe(){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdBetween(Long fkMemberIdEnd){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdNotBetween(Long fkMemberIdEnd){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdLike(){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdNotLike(){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdLikeLeft(){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdLikeRight(){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdEq(Long fkMemberId){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdNe(Long fkMemberId){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdGt(Long fkMemberId){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdGe(Long fkMemberId){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdLt(Long fkMemberId){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdLe(Long fkMemberId){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdLike(Long fkMemberId){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdNotLike(Long fkMemberId){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdLikeLeft(Long fkMemberId){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdIn(Long... values){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateEntityWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 等于 = entity().getRoomSession()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionEq(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            eq("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 不等于 &lt;&gt; entity().getRoomSession()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionNe(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            ne("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 大于 &gt; entity().getRoomSession()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionGt(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            gt("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 大于等于 &gt;= entity().getRoomSession()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionGe(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            ge("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 小于 &lt; entity().getRoomSession()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionLt(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            lt("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 小于等于 &lt;= entity().getRoomSession()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionLe(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            le("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * BETWEEN  entity().getRoomSession() AND 值2
     * @param roomSessionEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionBetween(String roomSessionEnd){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null && roomSessionEnd!=null){
            between("room_session",roomSession,roomSessionEnd);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * NOT BETWEEN  entity().getRoomSession() AND 值2
     * @param roomSessionEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionNotBetween(String roomSessionEnd){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null && roomSessionEnd!=null){
            notBetween("room_session",roomSession,roomSessionEnd);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * BETWEEN  entity().getRoomSession() AND 值2
     * @param roomSessionStart       值1
     * @param roomSessionEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionBetween(String roomSessionStart,String roomSessionEnd){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null && roomSessionEnd!=null){
            between("room_session",roomSessionStart,roomSessionEnd);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * NOT BETWEEN  entity().getRoomSession() AND 值2
     * @param roomSessionStart       值1
     * @param roomSessionEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionNotBetween(String roomSessionStart,String roomSessionEnd){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null && roomSessionEnd!=null){
            notBetween("room_session",roomSessionStart,roomSessionEnd);
        }
        return this;
     }


    /**
     * <p>房间session</p>
     * LIKE '%值%' entity().getRoomSession()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionLike(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            like("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * NOT LIKE '%值%' entity().getRoomSession()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionNotLike(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            notLike("room_session",roomSession);
        }
        return this;
     }


    /**
     * <p>房间session</p>
     * LIKE '%值' entity().getRoomSession()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionLikeLeft(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            likeLeft("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * LIKE '值%' entity().getRoomSession()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionLikeRight(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            likeRight("room_session",roomSession);
        }
        return this;
     }

/**
     * <p>房间session</p>
     * 等于 =
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionEq(String roomSession){
        if(roomSession!=null){
            eq("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 不等于 &lt;&gt;
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionNe(String roomSession){
        if(roomSession!=null){
            ne("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 大于 &gt;
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionGt(String roomSession){
        if(roomSession!=null){
            gt("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 大于等于 &gt;=
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionGe(String roomSession){
        if(roomSession!=null){
            ge("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 小于 &lt;
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionLt(String roomSession){
        if(roomSession!=null){
            lt("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 小于等于 &lt;=
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionLe(String roomSession){
        if(roomSession!=null){
            le("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * LIKE '%值%'
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionLike(String roomSession){
        if(roomSession!=null){
            like("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * NOT LIKE '%值%'
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionNotLike(String roomSession){
        if(roomSession!=null){
            notLike("room_session",roomSession);
        }
        return this;
    }


    /**
     * <p>房间session</p>
     * LIKE '%值'
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionLikeLeft(String roomSession){
        if(roomSession!=null){
            likeLeft("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * LIKE '值%'
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionLikeRight(String roomSession){
        if(roomSession!=null){
            likeRight("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * IS NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionIsNull(){
        isNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionIsNotNull(){
        isNotNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("room_session",value);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionIn(String... values){
        if(values!=null && values.length>0){
            in("room_session",values);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("room_session",value);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper roomSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_session",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdEq(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 不等于 &lt;&gt; entity().getDeviceId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdNe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt; entity().getDeviceId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdGt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;= entity().getDeviceId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdGe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt; entity().getDeviceId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdLt(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;= entity().getDeviceId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdNotBetween(String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceId,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN  entity().getDeviceId() AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%' entity().getDeviceId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值' entity().getDeviceId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%' entity().getDeviceId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdLikeRight(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
     }

/**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 不等于 &lt;&gt;
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt;
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;=
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt;
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;=
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
    }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值'
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%'
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdLikeRight(String deviceId){
        if(deviceId!=null){
            likeRight("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdIn(String... values){
        if(values!=null && values.length>0){
            in("device_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_id",value);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * 等于 = entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdEq(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * 不等于 &lt;&gt; entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdNe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            ne("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * 大于 &gt; entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdGt(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            gt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * 大于等于 &gt;= entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdGe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            ge("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * 小于 &lt; entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdLt(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            lt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * 小于等于 &lt;= entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdLe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdBetween(String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            between("phone_id",phoneId,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * NOT BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdNotBetween(String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneId,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            between("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * NOT BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>玩家ID</p>
     * LIKE '%值%' entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * NOT LIKE '%值%' entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdNotLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
     }


    /**
     * <p>玩家ID</p>
     * LIKE '%值' entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdLikeLeft(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * LIKE '值%' entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdLikeRight(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            likeRight("phone_id",phoneId);
        }
        return this;
     }

/**
     * <p>玩家ID</p>
     * 等于 =
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdEq(String phoneId){
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * 不等于 &lt;&gt;
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdNe(String phoneId){
        if(phoneId!=null){
            ne("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * 大于 &gt;
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdGt(String phoneId){
        if(phoneId!=null){
            gt("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * 大于等于 &gt;=
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdGe(String phoneId){
        if(phoneId!=null){
            ge("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * 小于 &lt;
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdLt(String phoneId){
        if(phoneId!=null){
            lt("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * 小于等于 &lt;=
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdLe(String phoneId){
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * LIKE '%值%'
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdLike(String phoneId){
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * NOT LIKE '%值%'
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdNotLike(String phoneId){
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
    }


    /**
     * <p>玩家ID</p>
     * LIKE '%值'
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdLikeLeft(String phoneId){
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * LIKE '值%'
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdLikeRight(String phoneId){
        if(phoneId!=null){
            likeRight("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * IS NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>玩家ID</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>玩家ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_id",value);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdIn(String... values){
        if(values!=null && values.length>0){
            in("phone_id",values);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_id",value);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper phoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_id",values);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * 等于 = entity().getPkg()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgEq(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            eq("pkg",pkg);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * 不等于 &lt;&gt; entity().getPkg()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgNe(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            ne("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * 大于 &gt; entity().getPkg()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgGt(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            gt("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * 大于等于 &gt;= entity().getPkg()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgGe(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            ge("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * 小于 &lt; entity().getPkg()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgLt(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            lt("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * 小于等于 &lt;= entity().getPkg()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgLe(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            le("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * BETWEEN  entity().getPkg() AND 值2
     * @param pkgEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgBetween(String pkgEnd){
        String pkg =entity().getPkg();
        if(pkg!=null && pkgEnd!=null){
            between("pkg",pkg,pkgEnd);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * NOT BETWEEN  entity().getPkg() AND 值2
     * @param pkgEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgNotBetween(String pkgEnd){
        String pkg =entity().getPkg();
        if(pkg!=null && pkgEnd!=null){
            notBetween("pkg",pkg,pkgEnd);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * BETWEEN  entity().getPkg() AND 值2
     * @param pkgStart       值1
     * @param pkgEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgBetween(String pkgStart,String pkgEnd){
        String pkg =entity().getPkg();
        if(pkg!=null && pkgEnd!=null){
            between("pkg",pkgStart,pkgEnd);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * NOT BETWEEN  entity().getPkg() AND 值2
     * @param pkgStart       值1
     * @param pkgEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgNotBetween(String pkgStart,String pkgEnd){
        String pkg =entity().getPkg();
        if(pkg!=null && pkgEnd!=null){
            notBetween("pkg",pkgStart,pkgEnd);
        }
        return this;
     }


    /**
     * <p>应用包名</p>
     * LIKE '%值%' entity().getPkg()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgLike(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            like("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * NOT LIKE '%值%' entity().getPkg()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgNotLike(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            notLike("pkg",pkg);
        }
        return this;
     }


    /**
     * <p>应用包名</p>
     * LIKE '%值' entity().getPkg()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgLikeLeft(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            likeLeft("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * LIKE '值%' entity().getPkg()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgLikeRight(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            likeRight("pkg",pkg);
        }
        return this;
     }

/**
     * <p>应用包名</p>
     * 等于 =
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgEq(String pkg){
        if(pkg!=null){
            eq("pkg",pkg);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * 不等于 &lt;&gt;
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgNe(String pkg){
        if(pkg!=null){
            ne("pkg",pkg);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * 大于 &gt;
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgGt(String pkg){
        if(pkg!=null){
            gt("pkg",pkg);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * 大于等于 &gt;=
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgGe(String pkg){
        if(pkg!=null){
            ge("pkg",pkg);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * 小于 &lt;
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgLt(String pkg){
        if(pkg!=null){
            lt("pkg",pkg);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * 小于等于 &lt;=
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgLe(String pkg){
        if(pkg!=null){
            le("pkg",pkg);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * LIKE '%值%'
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgLike(String pkg){
        if(pkg!=null){
            like("pkg",pkg);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * NOT LIKE '%值%'
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgNotLike(String pkg){
        if(pkg!=null){
            notLike("pkg",pkg);
        }
        return this;
    }


    /**
     * <p>应用包名</p>
     * LIKE '%值'
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgLikeLeft(String pkg){
        if(pkg!=null){
            likeLeft("pkg",pkg);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * LIKE '值%'
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgLikeRight(String pkg){
        if(pkg!=null){
            likeRight("pkg",pkg);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * IS NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgIsNull(){
        isNull("pkg");
        return this;
    }

    /**
     * <p>应用包名</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgIsNotNull(){
        isNotNull("pkg");
        return this;
    }

    /**
     * <p>应用包名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("pkg",value);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgIn(String... values){
        if(values!=null && values.length>0){
            in("pkg",values);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("pkg",value);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper pkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("pkg",values);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * LIKE '%值%' entity().getStatus()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * NOT LIKE '%值%' entity().getStatus()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * LIKE '%值' entity().getStatus()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * LIKE '值%' entity().getStatus()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

/**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
    }


    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * IS NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * 等于 = entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeEq(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            eq("hang_up_time",hangUpTime);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * 不等于 &lt;&gt; entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeNe(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            ne("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * 大于 &gt; entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeGt(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            gt("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * 大于等于 &gt;= entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeGe(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            ge("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * 小于 &lt; entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeLt(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            lt("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * 小于等于 &lt;= entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeLe(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            le("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * BETWEEN  entity().getHangUpTime() AND 值2
     * @param hangUpTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeBetween(Long hangUpTimeEnd){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null && hangUpTimeEnd!=null){
            between("hang_up_time",hangUpTime,hangUpTimeEnd);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * NOT BETWEEN  entity().getHangUpTime() AND 值2
     * @param hangUpTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeNotBetween(Long hangUpTimeEnd){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null && hangUpTimeEnd!=null){
            notBetween("hang_up_time",hangUpTime,hangUpTimeEnd);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * BETWEEN  entity().getHangUpTime() AND 值2
     * @param hangUpTimeStart       值1
     * @param hangUpTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeBetween(Long hangUpTimeStart,Long hangUpTimeEnd){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null && hangUpTimeEnd!=null){
            between("hang_up_time",hangUpTimeStart,hangUpTimeEnd);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * NOT BETWEEN  entity().getHangUpTime() AND 值2
     * @param hangUpTimeStart       值1
     * @param hangUpTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeNotBetween(Long hangUpTimeStart,Long hangUpTimeEnd){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null && hangUpTimeEnd!=null){
            notBetween("hang_up_time",hangUpTimeStart,hangUpTimeEnd);
        }
        return this;
     }


    /**
     * <p>挂机时长单位（秒）</p>
     * LIKE '%值%' entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeLike(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            like("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * NOT LIKE '%值%' entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeNotLike(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            notLike("hang_up_time",hangUpTime);
        }
        return this;
     }


    /**
     * <p>挂机时长单位（秒）</p>
     * LIKE '%值' entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeLikeLeft(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            likeLeft("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * LIKE '值%' entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeLikeRight(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            likeRight("hang_up_time",hangUpTime);
        }
        return this;
     }

/**
     * <p>挂机时长单位（秒）</p>
     * 等于 =
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeEq(Long hangUpTime){
        if(hangUpTime!=null){
            eq("hang_up_time",hangUpTime);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * 不等于 &lt;&gt;
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeNe(Long hangUpTime){
        if(hangUpTime!=null){
            ne("hang_up_time",hangUpTime);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * 大于 &gt;
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeGt(Long hangUpTime){
        if(hangUpTime!=null){
            gt("hang_up_time",hangUpTime);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * 大于等于 &gt;=
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeGe(Long hangUpTime){
        if(hangUpTime!=null){
            ge("hang_up_time",hangUpTime);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * 小于 &lt;
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeLt(Long hangUpTime){
        if(hangUpTime!=null){
            lt("hang_up_time",hangUpTime);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * 小于等于 &lt;=
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeLe(Long hangUpTime){
        if(hangUpTime!=null){
            le("hang_up_time",hangUpTime);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * LIKE '%值%'
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeLike(Long hangUpTime){
        if(hangUpTime!=null){
            like("hang_up_time",hangUpTime);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * NOT LIKE '%值%'
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeNotLike(Long hangUpTime){
        if(hangUpTime!=null){
            notLike("hang_up_time",hangUpTime);
        }
        return this;
    }


    /**
     * <p>挂机时长单位（秒）</p>
     * LIKE '%值'
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeLikeLeft(Long hangUpTime){
        if(hangUpTime!=null){
            likeLeft("hang_up_time",hangUpTime);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * LIKE '值%'
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeLikeRight(Long hangUpTime){
        if(hangUpTime!=null){
            likeRight("hang_up_time",hangUpTime);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * IS NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeIsNull(){
        isNull("hang_up_time");
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeIsNotNull(){
        isNotNull("hang_up_time");
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("hang_up_time",value);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeIn(Long... values){
        if(values!=null && values.length>0){
            in("hang_up_time",values);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("hang_up_time",value);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpTimeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("hang_up_time",values);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * 等于 = entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeEq(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            eq("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * 不等于 &lt;&gt; entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeNe(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            ne("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * 大于 &gt; entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeGt(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            gt("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * 大于等于 &gt;= entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeGe(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            ge("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * 小于 &lt; entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeLt(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            lt("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * 小于等于 &lt;= entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeLe(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            le("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * BETWEEN  entity().getHangUpMaturityTime() AND 值2
     * @param hangUpMaturityTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeBetween(Date hangUpMaturityTimeEnd){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null && hangUpMaturityTimeEnd!=null){
            between("hang_up_maturity_time",hangUpMaturityTime,hangUpMaturityTimeEnd);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * NOT BETWEEN  entity().getHangUpMaturityTime() AND 值2
     * @param hangUpMaturityTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeNotBetween(Date hangUpMaturityTimeEnd){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null && hangUpMaturityTimeEnd!=null){
            notBetween("hang_up_maturity_time",hangUpMaturityTime,hangUpMaturityTimeEnd);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * BETWEEN  entity().getHangUpMaturityTime() AND 值2
     * @param hangUpMaturityTimeStart       值1
     * @param hangUpMaturityTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeBetween(Date hangUpMaturityTimeStart,Date hangUpMaturityTimeEnd){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null && hangUpMaturityTimeEnd!=null){
            between("hang_up_maturity_time",hangUpMaturityTimeStart,hangUpMaturityTimeEnd);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * NOT BETWEEN  entity().getHangUpMaturityTime() AND 值2
     * @param hangUpMaturityTimeStart       值1
     * @param hangUpMaturityTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeNotBetween(Date hangUpMaturityTimeStart,Date hangUpMaturityTimeEnd){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null && hangUpMaturityTimeEnd!=null){
            notBetween("hang_up_maturity_time",hangUpMaturityTimeStart,hangUpMaturityTimeEnd);
        }
        return this;
     }


    /**
     * <p>挂机到期时间</p>
     * LIKE '%值%' entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeLike(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            like("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * NOT LIKE '%值%' entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeNotLike(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            notLike("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }


    /**
     * <p>挂机到期时间</p>
     * LIKE '%值' entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeLikeLeft(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            likeLeft("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * LIKE '值%' entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeLikeRight(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            likeRight("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

/**
     * <p>挂机到期时间</p>
     * 等于 =
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeEq(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            eq("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * 不等于 &lt;&gt;
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeNe(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            ne("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * 大于 &gt;
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeGt(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            gt("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * 大于等于 &gt;=
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeGe(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            ge("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * 小于 &lt;
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeLt(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            lt("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * 小于等于 &lt;=
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeLe(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            le("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * LIKE '%值%'
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeLike(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            like("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * NOT LIKE '%值%'
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeNotLike(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            notLike("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }


    /**
     * <p>挂机到期时间</p>
     * LIKE '%值'
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeLikeLeft(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            likeLeft("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * LIKE '值%'
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeLikeRight(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            likeRight("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeIsNull(){
        isNull("hang_up_maturity_time");
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeIsNotNull(){
        isNotNull("hang_up_maturity_time");
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("hang_up_maturity_time",value);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("hang_up_maturity_time",values);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("hang_up_maturity_time",value);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper hangUpMaturityTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("hang_up_maturity_time",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper createTimeEq(){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeNe(){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeGt(){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeGe(){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeLt(){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeLe(){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeLike(){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeNotLike(){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeLikeLeft(){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeLikeRight(){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeEq(Date createTime){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeNe(Date createTime){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeGt(Date createTime){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeGe(Date createTime){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeLt(Date createTime){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeLe(Date createTime){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeLike(Date createTime){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeNotLike(Date createTime){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeLikeLeft(Date createTime){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeLikeRight(Date createTime){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper createTimeIn(Collection<Date> value){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeIn(Date... values){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public YunMemberHangUpUpdateEntityWrapper createTimeNotIn(Date... values){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeEq(){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeNe(){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeGt(){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeGe(){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeLt(){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeLe(){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeLike(){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeNotLike(){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeLikeLeft(){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeLikeRight(){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeIn(Date... values){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public YunMemberHangUpUpdateEntityWrapper lastUpdateTimeNotIn(Date... values){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdEq(){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdNe(){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdGt(){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdGe(){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdLt(){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdLe(){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdLike(){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdNotLike(){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdLikeLeft(){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdLikeRight(){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdEq(Long versionId){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdNe(Long versionId){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdGt(Long versionId){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdGe(Long versionId){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdLt(Long versionId){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdLe(Long versionId){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdLike(Long versionId){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdNotLike(Long versionId){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdLikeLeft(Long versionId){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdLikeRight(Long versionId){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateEntityWrapper versionIdIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdIn(Long... values){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }


}
