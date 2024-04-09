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
public class YunMemberHangUpUpdateWrapper extends UpdateWrapper<YunMemberHangUp> {

    public static YunMemberHangUpUpdateWrapper wrapper() {
        return new YunMemberHangUpUpdateWrapper();
    }

    public YunMemberHangUpUpdateWrapper() {
        super();
    }

    public YunMemberHangUpUpdateWrapper(YunMemberHangUp entity) {
        super(entity);
    }

    /**
     * id
     */
    public YunMemberHangUpUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 商户id
     */
    public YunMemberHangUpUpdateWrapper setFkMemberId(Long fkMemberId) {
         set("fk_member_id",fkMemberId);
        return this;
    }
    /**
     * 房间session
     */
    public YunMemberHangUpUpdateWrapper setRoomSession(String roomSession) {
         set("room_session",roomSession);
        return this;
    }
    /**
     * 设备唯一码
     */
    public YunMemberHangUpUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 玩家ID
     */
    public YunMemberHangUpUpdateWrapper setPhoneId(String phoneId) {
         set("phone_id",phoneId);
        return this;
    }
    /**
     * 应用包名
     */
    public YunMemberHangUpUpdateWrapper setPkg(String pkg) {
         set("pkg",pkg);
        return this;
    }
    /**
     * 状态(0：已退出，5：in，10：out，15：idle)
     */
    public YunMemberHangUpUpdateWrapper setStatus(Integer status) {
         set("status",status);
        return this;
    }
    /**
     * 挂机时长单位（秒）
     */
    public YunMemberHangUpUpdateWrapper setHangUpTime(Long hangUpTime) {
         set("hang_up_time",hangUpTime);
        return this;
    }
    /**
     * 挂机到期时间
     */
    public YunMemberHangUpUpdateWrapper setHangUpMaturityTime(Date hangUpMaturityTime) {
         set("hang_up_maturity_time",hangUpMaturityTime);
        return this;
    }
    /**
     * 创建时间
     */
    public YunMemberHangUpUpdateWrapper setCreateTime(Date createTime) {
         set("create_time",createTime);
        return this;
    }
    /**
     * 最近修改时间
     */
    public YunMemberHangUpUpdateWrapper setLastUpdateTime(Date lastUpdateTime) {
         set("last_update_time",lastUpdateTime);
        return this;
    }
    /**
     * 
     */
    public YunMemberHangUpUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }

    /**
     * <p>id</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper idEq(Long id){
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
    public YunMemberHangUpUpdateWrapper idNe(Long id){
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
    public YunMemberHangUpUpdateWrapper idGt(Long id){
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
    public YunMemberHangUpUpdateWrapper idGe(Long id){
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
    public YunMemberHangUpUpdateWrapper idLt(Long id){
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
    public YunMemberHangUpUpdateWrapper idLe(Long id){
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
    public YunMemberHangUpUpdateWrapper idBetween(Long idStart,Long idEnd){
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
    public YunMemberHangUpUpdateWrapper idNotBetween(Long idStart,Long idEnd){
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
    public YunMemberHangUpUpdateWrapper idLike(Long id){
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
    public YunMemberHangUpUpdateWrapper idNotLike(Long id){
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
    public YunMemberHangUpUpdateWrapper idLikeLeft(Long id){
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
    public YunMemberHangUpUpdateWrapper idLikeRight(Long id){
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
    public YunMemberHangUpUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateWrapper idIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateWrapper idIn(Long... values){
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
    public YunMemberHangUpUpdateWrapper idNotIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateWrapper idNotIn(Long... values){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdEq(Long fkMemberId){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdNe(Long fkMemberId){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdGt(Long fkMemberId){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdGe(Long fkMemberId){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdLt(Long fkMemberId){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdLe(Long fkMemberId){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdLike(Long fkMemberId){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdNotLike(Long fkMemberId){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdLikeLeft(Long fkMemberId){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateWrapper fkMemberIdIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdIn(Long... values){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 等于 = roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionEq(String roomSession){
        if(roomSession!=null){
            eq("room_session",roomSession);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 不等于 &lt;&gt; roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionNe(String roomSession){
        if(roomSession!=null){
            ne("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 大于 &gt; roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionGt(String roomSession){
        if(roomSession!=null){
            gt("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 大于等于 &gt;= roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionGe(String roomSession){
        if(roomSession!=null){
            ge("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 小于 &lt; roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionLt(String roomSession){
        if(roomSession!=null){
            lt("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * 小于等于 &lt;= roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionLe(String roomSession){
        if(roomSession!=null){
            le("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * BETWEEN 值1 AND 值2
     * @param roomSessionStart       值1
     * @param roomSessionEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionBetween(String roomSessionStart,String roomSessionEnd){
        if(roomSessionStart!=null && roomSessionEnd!=null){
            between("room_session",roomSessionStart,roomSessionEnd);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * NOT BETWEEN 值1 AND 值2
     * @param roomSessionStart       值1
     * @param roomSessionEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionNotBetween(String roomSessionStart,String roomSessionEnd){
        if(roomSessionStart!=null && roomSessionEnd!=null){
            notBetween("room_session",roomSessionStart,roomSessionEnd);
        }
        return this;
     }


    /**
     * <p>房间session</p>
     * LIKE '%值%' roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionLike(String roomSession){
        if(roomSession!=null){
            like("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * NOT LIKE '%值%' roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionNotLike(String roomSession){
        if(roomSession!=null){
            notLike("room_session",roomSession);
        }
        return this;
     }


    /**
     * <p>房间session</p>
     * LIKE '%值' roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionLikeLeft(String roomSession){
        if(roomSession!=null){
            likeLeft("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * LIKE '值%' roomSession
     * @param roomSession       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionLikeRight(String roomSession){
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
    public YunMemberHangUpUpdateWrapper roomSessionIsNull(){
        isNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionIsNotNull(){
        isNotNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateWrapper roomSessionIn(Collection<String> value){
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
    public YunMemberHangUpUpdateWrapper roomSessionIn(String... values){
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
    public YunMemberHangUpUpdateWrapper roomSessionNotIn(Collection<String> value){
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
    public YunMemberHangUpUpdateWrapper roomSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_session",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdEq(String deviceId){
        if(deviceId!=null){
            eq("device_id",deviceId);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 不等于 &lt;&gt; deviceId
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdNe(String deviceId){
        if(deviceId!=null){
            ne("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于 &gt; deviceId
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdGt(String deviceId){
        if(deviceId!=null){
            gt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 大于等于 &gt;= deviceId
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdGe(String deviceId){
        if(deviceId!=null){
            ge("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于 &lt; deviceId
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdLt(String deviceId){
        if(deviceId!=null){
            lt("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * 小于等于 &lt;= deviceId
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdLe(String deviceId){
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            between("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT BETWEEN 值1 AND 值2
     * @param deviceIdStart       值1
     * @param deviceIdEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdLike(String deviceId){
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdNotLike(String deviceId){
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值' deviceId
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdLikeLeft(String deviceId){
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%' deviceId
     * @param deviceId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public YunMemberHangUpUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateWrapper deviceIdIn(Collection<String> value){
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
    public YunMemberHangUpUpdateWrapper deviceIdIn(String... values){
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
    public YunMemberHangUpUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public YunMemberHangUpUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * 等于 = phoneId
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdEq(String phoneId){
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家ID</p>
     * 不等于 &lt;&gt; phoneId
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdNe(String phoneId){
        if(phoneId!=null){
            ne("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * 大于 &gt; phoneId
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdGt(String phoneId){
        if(phoneId!=null){
            gt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * 大于等于 &gt;= phoneId
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdGe(String phoneId){
        if(phoneId!=null){
            ge("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * 小于 &lt; phoneId
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdLt(String phoneId){
        if(phoneId!=null){
            lt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * 小于等于 &lt;= phoneId
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdLe(String phoneId){
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * BETWEEN 值1 AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
        if(phoneIdStart!=null && phoneIdEnd!=null){
            between("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        if(phoneIdStart!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>玩家ID</p>
     * LIKE '%值%' phoneId
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdLike(String phoneId){
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * NOT LIKE '%值%' phoneId
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdNotLike(String phoneId){
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
     }


    /**
     * <p>玩家ID</p>
     * LIKE '%值' phoneId
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdLikeLeft(String phoneId){
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * LIKE '值%' phoneId
     * @param phoneId       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdLikeRight(String phoneId){
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
    public YunMemberHangUpUpdateWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>玩家ID</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>玩家ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateWrapper phoneIdIn(Collection<String> value){
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
    public YunMemberHangUpUpdateWrapper phoneIdIn(String... values){
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
    public YunMemberHangUpUpdateWrapper phoneIdNotIn(Collection<String> value){
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
    public YunMemberHangUpUpdateWrapper phoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_id",values);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * 等于 = pkg
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgEq(String pkg){
        if(pkg!=null){
            eq("pkg",pkg);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * 不等于 &lt;&gt; pkg
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgNe(String pkg){
        if(pkg!=null){
            ne("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * 大于 &gt; pkg
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgGt(String pkg){
        if(pkg!=null){
            gt("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * 大于等于 &gt;= pkg
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgGe(String pkg){
        if(pkg!=null){
            ge("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * 小于 &lt; pkg
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgLt(String pkg){
        if(pkg!=null){
            lt("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * 小于等于 &lt;= pkg
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgLe(String pkg){
        if(pkg!=null){
            le("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * BETWEEN 值1 AND 值2
     * @param pkgStart       值1
     * @param pkgEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgBetween(String pkgStart,String pkgEnd){
        if(pkgStart!=null && pkgEnd!=null){
            between("pkg",pkgStart,pkgEnd);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * NOT BETWEEN 值1 AND 值2
     * @param pkgStart       值1
     * @param pkgEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgNotBetween(String pkgStart,String pkgEnd){
        if(pkgStart!=null && pkgEnd!=null){
            notBetween("pkg",pkgStart,pkgEnd);
        }
        return this;
     }


    /**
     * <p>应用包名</p>
     * LIKE '%值%' pkg
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgLike(String pkg){
        if(pkg!=null){
            like("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * NOT LIKE '%值%' pkg
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgNotLike(String pkg){
        if(pkg!=null){
            notLike("pkg",pkg);
        }
        return this;
     }


    /**
     * <p>应用包名</p>
     * LIKE '%值' pkg
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgLikeLeft(String pkg){
        if(pkg!=null){
            likeLeft("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * LIKE '值%' pkg
     * @param pkg       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgLikeRight(String pkg){
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
    public YunMemberHangUpUpdateWrapper pkgIsNull(){
        isNull("pkg");
        return this;
    }

    /**
     * <p>应用包名</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgIsNotNull(){
        isNotNull("pkg");
        return this;
    }

    /**
     * <p>应用包名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateWrapper pkgIn(Collection<String> value){
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
    public YunMemberHangUpUpdateWrapper pkgIn(String... values){
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
    public YunMemberHangUpUpdateWrapper pkgNotIn(Collection<String> value){
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
    public YunMemberHangUpUpdateWrapper pkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("pkg",values);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 等于 = status
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 不等于 &lt;&gt; status
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 大于 &gt; status
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 大于等于 &gt;= status
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 小于 &lt; status
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * 小于等于 &lt;= status
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * NOT BETWEEN 值1 AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        if(statusStart!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * NOT LIKE '%值%' status
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * LIKE '%值' status
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * LIKE '值%' status
     * @param status       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusLikeRight(Integer status){
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
    public YunMemberHangUpUpdateWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateWrapper statusIn(Collection<Integer> value){
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
    public YunMemberHangUpUpdateWrapper statusIn(Integer... values){
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
    public YunMemberHangUpUpdateWrapper statusNotIn(Collection<Integer> value){
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
    public YunMemberHangUpUpdateWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * 等于 = hangUpTime
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeEq(Long hangUpTime){
        if(hangUpTime!=null){
            eq("hang_up_time",hangUpTime);
        }
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * 不等于 &lt;&gt; hangUpTime
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeNe(Long hangUpTime){
        if(hangUpTime!=null){
            ne("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * 大于 &gt; hangUpTime
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeGt(Long hangUpTime){
        if(hangUpTime!=null){
            gt("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * 大于等于 &gt;= hangUpTime
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeGe(Long hangUpTime){
        if(hangUpTime!=null){
            ge("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * 小于 &lt; hangUpTime
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeLt(Long hangUpTime){
        if(hangUpTime!=null){
            lt("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * 小于等于 &lt;= hangUpTime
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeLe(Long hangUpTime){
        if(hangUpTime!=null){
            le("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * BETWEEN 值1 AND 值2
     * @param hangUpTimeStart       值1
     * @param hangUpTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeBetween(Long hangUpTimeStart,Long hangUpTimeEnd){
        if(hangUpTimeStart!=null && hangUpTimeEnd!=null){
            between("hang_up_time",hangUpTimeStart,hangUpTimeEnd);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param hangUpTimeStart       值1
     * @param hangUpTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeNotBetween(Long hangUpTimeStart,Long hangUpTimeEnd){
        if(hangUpTimeStart!=null && hangUpTimeEnd!=null){
            notBetween("hang_up_time",hangUpTimeStart,hangUpTimeEnd);
        }
        return this;
     }


    /**
     * <p>挂机时长单位（秒）</p>
     * LIKE '%值%' hangUpTime
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeLike(Long hangUpTime){
        if(hangUpTime!=null){
            like("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * NOT LIKE '%值%' hangUpTime
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeNotLike(Long hangUpTime){
        if(hangUpTime!=null){
            notLike("hang_up_time",hangUpTime);
        }
        return this;
     }


    /**
     * <p>挂机时长单位（秒）</p>
     * LIKE '%值' hangUpTime
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeLikeLeft(Long hangUpTime){
        if(hangUpTime!=null){
            likeLeft("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * LIKE '值%' hangUpTime
     * @param hangUpTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeLikeRight(Long hangUpTime){
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
    public YunMemberHangUpUpdateWrapper hangUpTimeIsNull(){
        isNull("hang_up_time");
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeIsNotNull(){
        isNotNull("hang_up_time");
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpTimeIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateWrapper hangUpTimeIn(Long... values){
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
    public YunMemberHangUpUpdateWrapper hangUpTimeNotIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateWrapper hangUpTimeNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("hang_up_time",values);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * 等于 = hangUpMaturityTime
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeEq(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            eq("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * 不等于 &lt;&gt; hangUpMaturityTime
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeNe(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            ne("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * 大于 &gt; hangUpMaturityTime
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeGt(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            gt("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * 大于等于 &gt;= hangUpMaturityTime
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeGe(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            ge("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * 小于 &lt; hangUpMaturityTime
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeLt(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            lt("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * 小于等于 &lt;= hangUpMaturityTime
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeLe(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            le("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * BETWEEN 值1 AND 值2
     * @param hangUpMaturityTimeStart       值1
     * @param hangUpMaturityTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeBetween(Date hangUpMaturityTimeStart,Date hangUpMaturityTimeEnd){
        if(hangUpMaturityTimeStart!=null && hangUpMaturityTimeEnd!=null){
            between("hang_up_maturity_time",hangUpMaturityTimeStart,hangUpMaturityTimeEnd);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param hangUpMaturityTimeStart       值1
     * @param hangUpMaturityTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeNotBetween(Date hangUpMaturityTimeStart,Date hangUpMaturityTimeEnd){
        if(hangUpMaturityTimeStart!=null && hangUpMaturityTimeEnd!=null){
            notBetween("hang_up_maturity_time",hangUpMaturityTimeStart,hangUpMaturityTimeEnd);
        }
        return this;
     }


    /**
     * <p>挂机到期时间</p>
     * LIKE '%值%' hangUpMaturityTime
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeLike(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            like("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * NOT LIKE '%值%' hangUpMaturityTime
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeNotLike(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            notLike("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }


    /**
     * <p>挂机到期时间</p>
     * LIKE '%值' hangUpMaturityTime
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeLikeLeft(Date hangUpMaturityTime){
        if(hangUpMaturityTime!=null){
            likeLeft("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * LIKE '值%' hangUpMaturityTime
     * @param hangUpMaturityTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeLikeRight(Date hangUpMaturityTime){
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
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeIsNull(){
        isNull("hang_up_maturity_time");
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeIsNotNull(){
        isNotNull("hang_up_maturity_time");
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeIn(Collection<Date> value){
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
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeIn(Date... values){
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
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeNotIn(Collection<Date> value){
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
    public YunMemberHangUpUpdateWrapper hangUpMaturityTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("hang_up_maturity_time",values);
        }
        return this;
    }

    /**
     * <p>创建时间</p>
     * 等于 = createTime
     * @param createTime       值
     * @return children
     */
    public YunMemberHangUpUpdateWrapper createTimeEq(Date createTime){
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
    public YunMemberHangUpUpdateWrapper createTimeNe(Date createTime){
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
    public YunMemberHangUpUpdateWrapper createTimeGt(Date createTime){
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
    public YunMemberHangUpUpdateWrapper createTimeGe(Date createTime){
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
    public YunMemberHangUpUpdateWrapper createTimeLt(Date createTime){
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
    public YunMemberHangUpUpdateWrapper createTimeLe(Date createTime){
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
    public YunMemberHangUpUpdateWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberHangUpUpdateWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberHangUpUpdateWrapper createTimeLike(Date createTime){
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
    public YunMemberHangUpUpdateWrapper createTimeNotLike(Date createTime){
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
    public YunMemberHangUpUpdateWrapper createTimeLikeLeft(Date createTime){
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
    public YunMemberHangUpUpdateWrapper createTimeLikeRight(Date createTime){
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
    public YunMemberHangUpUpdateWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateWrapper createTimeIn(Collection<Date> value){
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
    public YunMemberHangUpUpdateWrapper createTimeIn(Date... values){
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
    public YunMemberHangUpUpdateWrapper createTimeNotIn(Collection<Date> value){
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
    public YunMemberHangUpUpdateWrapper createTimeNotIn(Date... values){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeIn(Date... values){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public YunMemberHangUpUpdateWrapper lastUpdateTimeNotIn(Date... values){
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
    public YunMemberHangUpUpdateWrapper versionIdEq(Long versionId){
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
    public YunMemberHangUpUpdateWrapper versionIdNe(Long versionId){
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
    public YunMemberHangUpUpdateWrapper versionIdGt(Long versionId){
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
    public YunMemberHangUpUpdateWrapper versionIdGe(Long versionId){
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
    public YunMemberHangUpUpdateWrapper versionIdLt(Long versionId){
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
    public YunMemberHangUpUpdateWrapper versionIdLe(Long versionId){
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
    public YunMemberHangUpUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberHangUpUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberHangUpUpdateWrapper versionIdLike(Long versionId){
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
    public YunMemberHangUpUpdateWrapper versionIdNotLike(Long versionId){
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
    public YunMemberHangUpUpdateWrapper versionIdLikeLeft(Long versionId){
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
    public YunMemberHangUpUpdateWrapper versionIdLikeRight(Long versionId){
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
    public YunMemberHangUpUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpUpdateWrapper versionIdIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateWrapper versionIdIn(Long... values){
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
    public YunMemberHangUpUpdateWrapper versionIdNotIn(Collection<Long> value){
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
    public YunMemberHangUpUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }


}
