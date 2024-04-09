package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import com.suqi.center.machine.dao.entity.DevRoomPlayer;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

/**
 * <p>
 * 设备房间成员记录表（dev_room_player）
 * </p>
 * "dev_room_player"
 * @author PC001
 */
public class DevRoomPlayerUpdateWrapper extends UpdateWrapper<DevRoomPlayer> {

    public static DevRoomPlayerUpdateWrapper wrapper() {
        return new DevRoomPlayerUpdateWrapper();
    }

    public DevRoomPlayerUpdateWrapper() {
        super();
    }

    public DevRoomPlayerUpdateWrapper(DevRoomPlayer entity) {
        super(entity);
    }

    /**
     * 房间成员记录
     */
    public DevRoomPlayerUpdateWrapper setId(Long id) {
         set("id",id);
        return this;
    }
    /**
     * 用户设备表id
     */
    public DevRoomPlayerUpdateWrapper setFkMemberDeviceId(Long fkMemberDeviceId) {
         set("fk_member_device_id",fkMemberDeviceId);
        return this;
    }
    /**
     * 用户id
     */
    public DevRoomPlayerUpdateWrapper setFkMemberId(Long fkMemberId) {
         set("fk_member_id",fkMemberId);
        return this;
    }
    /**
     * 设备唯一码
     */
    public DevRoomPlayerUpdateWrapper setDeviceId(String deviceId) {
         set("device_id",deviceId);
        return this;
    }
    /**
     * 应用包名
     */
    public DevRoomPlayerUpdateWrapper setPkg(String pkg) {
         set("pkg",pkg);
        return this;
    }
    /**
     * 位置信息
     */
    public DevRoomPlayerUpdateWrapper setPosition(String position) {
         set("position",position);
        return this;
    }
    /**
     * 房间session
     */
    public DevRoomPlayerUpdateWrapper setRoomSession(String roomSession) {
         set("room_session",roomSession);
        return this;
    }
    /**
     * 房间分享session
     */
    public DevRoomPlayerUpdateWrapper setRoomShareSession(String roomShareSession) {
         set("room_share_session",roomShareSession);
        return this;
    }
    /**
     * 玩家session
     */
    public DevRoomPlayerUpdateWrapper setRoomPlayerSession(String roomPlayerSession) {
         set("room_player_session",roomPlayerSession);
        return this;
    }
    /**
     * 玩家session到期时间
     */
    public DevRoomPlayerUpdateWrapper setPlaySessionExpireTime(Date playSessionExpireTime) {
         set("play_session_expire_time",playSessionExpireTime);
        return this;
    }
    /**
     * 队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id
     */
    public DevRoomPlayerUpdateWrapper setQueueToken(String queueToken) {
         set("queue_token",queueToken);
        return this;
    }
    /**
     * 玩家设备ID
     */
    public DevRoomPlayerUpdateWrapper setPhoneId(String phoneId) {
         set("phone_id",phoneId);
        return this;
    }
    /**
     * 操作系统（android|ios）
     */
    public DevRoomPlayerUpdateWrapper setOs(String os) {
         set("os",os);
        return this;
    }
    /**
     * 盒子服务类型(10：boxStream服务，20：boxRtc服务）
     */
    public DevRoomPlayerUpdateWrapper setServerType(Integer serverType) {
         set("server_type",serverType);
        return this;
    }
    /**
     * 登录状态（0：已退出，5：待进入，10：已进入）
     */
    public DevRoomPlayerUpdateWrapper setPlayerLoginStatus(Integer playerLoginStatus) {
         set("player_login_status",playerLoginStatus);
        return this;
    }
    /**
     * 信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）
     */
    public DevRoomPlayerUpdateWrapper setMsgReportType(Integer msgReportType) {
         set("msg_report_type",msgReportType);
        return this;
    }
    /**
     * 房间成员角色（0：普通玩家，1：队长玩家）
     */
    public DevRoomPlayerUpdateWrapper setRoomPlayerRole(Integer roomPlayerRole) {
         set("room_player_role",roomPlayerRole);
        return this;
    }
    /**
     * 房间继承者id
     */
    public DevRoomPlayerUpdateWrapper setHeirLeaderId(Long heirLeaderId) {
         set("heir_leader_id",heirLeaderId);
        return this;
    }
    /**
     * 获取到设备时间
     */
    public DevRoomPlayerUpdateWrapper setFetchTime(Date fetchTime) {
         set("fetch_time",fetchTime);
        return this;
    }
    /**
     * 记录时间
     */
    public DevRoomPlayerUpdateWrapper setLoginTime(Date loginTime) {
         set("login_time",loginTime);
        return this;
    }
    /**
     * 退出时间
     */
    public DevRoomPlayerUpdateWrapper setLogoutTime(Date logoutTime) {
         set("logout_time",logoutTime);
        return this;
    }
    /**
     * 设备空闲上报时间
     */
    public DevRoomPlayerUpdateWrapper setIdleTime(Date idleTime) {
         set("idle_time",idleTime);
        return this;
    }
    /**
     * 客户端streaming进入时间
     */
    public DevRoomPlayerUpdateWrapper setClientStreamingStartTime(Date clientStreamingStartTime) {
         set("client_streaming_start_time",clientStreamingStartTime);
        return this;
    }
    /**
     * 客户端streaming退出时间
     */
    public DevRoomPlayerUpdateWrapper setClientStreamingEndTime(Date clientStreamingEndTime) {
         set("client_streaming_end_time",clientStreamingEndTime);
        return this;
    }
    /**
     * 版本id
     */
    public DevRoomPlayerUpdateWrapper setVersionId(Long versionId) {
         set("version_id",versionId);
        return this;
    }
    /**
     * 房间类型（0：普通房间，1：小程序试玩房间）
     */
    public DevRoomPlayerUpdateWrapper setRoomType(Integer roomType) {
         set("room_type",roomType);
        return this;
    }
    /**
     * 游族game_id
     */
    public DevRoomPlayerUpdateWrapper setGameId(Integer gameId) {
         set("game_id",gameId);
        return this;
    }
    /**
     * 游族session_id
     */
    public DevRoomPlayerUpdateWrapper setSessionId(String sessionId) {
         set("session_id",sessionId);
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * 等于 = id
     * @param id       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * 不等于 &lt;&gt; id
     * @param id       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 大于 &gt; id
     * @param id       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 大于等于 &gt;= id
     * @param id       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 小于 &lt; id
     * @param id       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 小于等于 &lt;= id
     * @param id       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>房间成员记录</p>
     * LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * NOT LIKE '%值%' id
     * @param id       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>房间成员记录</p>
     * LIKE '%值' id
     * @param id       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * LIKE '值%' id
     * @param id       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idLikeRight(Long id){
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("id",value);
        }
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idIn(Long... values){
        if(values!=null && values.length>0){
            in("id",values);
        }
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("id",value);
        }
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * 等于 = fkMemberDeviceId
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdEq(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            eq("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * 不等于 &lt;&gt; fkMemberDeviceId
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdNe(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            ne("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 大于 &gt; fkMemberDeviceId
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdGt(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            gt("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 大于等于 &gt;= fkMemberDeviceId
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdGe(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            ge("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 小于 &lt; fkMemberDeviceId
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdLt(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            lt("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 小于等于 &lt;= fkMemberDeviceId
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdLe(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            le("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMemberDeviceIdStart       值1
     * @param fkMemberDeviceIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdBetween(Long fkMemberDeviceIdStart,Long fkMemberDeviceIdEnd){
        if(fkMemberDeviceIdStart!=null && fkMemberDeviceIdEnd!=null){
            between("fk_member_device_id",fkMemberDeviceIdStart,fkMemberDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMemberDeviceIdStart       值1
     * @param fkMemberDeviceIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdNotBetween(Long fkMemberDeviceIdStart,Long fkMemberDeviceIdEnd){
        if(fkMemberDeviceIdStart!=null && fkMemberDeviceIdEnd!=null){
            notBetween("fk_member_device_id",fkMemberDeviceIdStart,fkMemberDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>用户设备表id</p>
     * LIKE '%值%' fkMemberDeviceId
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdLike(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            like("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * NOT LIKE '%值%' fkMemberDeviceId
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdNotLike(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            notLike("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }


    /**
     * <p>用户设备表id</p>
     * LIKE '%值' fkMemberDeviceId
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdLikeLeft(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            likeLeft("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * LIKE '值%' fkMemberDeviceId
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdLikeRight(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            likeRight("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdIsNull(){
        isNull("fk_member_device_id");
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdIsNotNull(){
        isNotNull("fk_member_device_id");
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_member_device_id",value);
        }
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_member_device_id",values);
        }
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_member_device_id",value);
        }
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_device_id",values);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 等于 = fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdEq(Long fkMemberId){
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 不等于 &lt;&gt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdNe(Long fkMemberId){
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 大于 &gt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdGt(Long fkMemberId){
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 大于等于 &gt;= fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdGe(Long fkMemberId){
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 小于 &lt; fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdLt(Long fkMemberId){
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 小于等于 &lt;= fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdLe(Long fkMemberId){
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * BETWEEN 值1 AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>用户id</p>
     * LIKE '%值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdLike(Long fkMemberId){
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * NOT LIKE '%值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdNotLike(Long fkMemberId){
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>用户id</p>
     * LIKE '%值' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdLikeLeft(Long fkMemberId){
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * LIKE '值%' fkMemberId
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdLikeRight(Long fkMemberId){
        if(fkMemberId!=null){
            likeRight("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_member_id",value);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 = deviceId
     * @param deviceId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper deviceIdEq(String deviceId){
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
    public DevRoomPlayerUpdateWrapper deviceIdNe(String deviceId){
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
    public DevRoomPlayerUpdateWrapper deviceIdGt(String deviceId){
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
    public DevRoomPlayerUpdateWrapper deviceIdGe(String deviceId){
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
    public DevRoomPlayerUpdateWrapper deviceIdLt(String deviceId){
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
    public DevRoomPlayerUpdateWrapper deviceIdLe(String deviceId){
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
    public DevRoomPlayerUpdateWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public DevRoomPlayerUpdateWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public DevRoomPlayerUpdateWrapper deviceIdLike(String deviceId){
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
    public DevRoomPlayerUpdateWrapper deviceIdNotLike(String deviceId){
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
    public DevRoomPlayerUpdateWrapper deviceIdLikeLeft(String deviceId){
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
    public DevRoomPlayerUpdateWrapper deviceIdLikeRight(String deviceId){
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
    public DevRoomPlayerUpdateWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper deviceIdIn(Collection<String> value){
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
    public DevRoomPlayerUpdateWrapper deviceIdIn(String... values){
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
    public DevRoomPlayerUpdateWrapper deviceIdNotIn(Collection<String> value){
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
    public DevRoomPlayerUpdateWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * 等于 = pkg
     * @param pkg       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper pkgEq(String pkg){
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
    public DevRoomPlayerUpdateWrapper pkgNe(String pkg){
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
    public DevRoomPlayerUpdateWrapper pkgGt(String pkg){
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
    public DevRoomPlayerUpdateWrapper pkgGe(String pkg){
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
    public DevRoomPlayerUpdateWrapper pkgLt(String pkg){
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
    public DevRoomPlayerUpdateWrapper pkgLe(String pkg){
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
    public DevRoomPlayerUpdateWrapper pkgBetween(String pkgStart,String pkgEnd){
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
    public DevRoomPlayerUpdateWrapper pkgNotBetween(String pkgStart,String pkgEnd){
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
    public DevRoomPlayerUpdateWrapper pkgLike(String pkg){
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
    public DevRoomPlayerUpdateWrapper pkgNotLike(String pkg){
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
    public DevRoomPlayerUpdateWrapper pkgLikeLeft(String pkg){
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
    public DevRoomPlayerUpdateWrapper pkgLikeRight(String pkg){
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
    public DevRoomPlayerUpdateWrapper pkgIsNull(){
        isNull("pkg");
        return this;
    }

    /**
     * <p>应用包名</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper pkgIsNotNull(){
        isNotNull("pkg");
        return this;
    }

    /**
     * <p>应用包名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper pkgIn(Collection<String> value){
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
    public DevRoomPlayerUpdateWrapper pkgIn(String... values){
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
    public DevRoomPlayerUpdateWrapper pkgNotIn(Collection<String> value){
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
    public DevRoomPlayerUpdateWrapper pkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("pkg",values);
        }
        return this;
    }

    /**
     * <p>位置信息</p>
     * 等于 = position
     * @param position       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionEq(String position){
        if(position!=null){
            eq("position",position);
        }
        return this;
    }

    /**
     * <p>位置信息</p>
     * 不等于 &lt;&gt; position
     * @param position       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionNe(String position){
        if(position!=null){
            ne("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 大于 &gt; position
     * @param position       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionGt(String position){
        if(position!=null){
            gt("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 大于等于 &gt;= position
     * @param position       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionGe(String position){
        if(position!=null){
            ge("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 小于 &lt; position
     * @param position       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionLt(String position){
        if(position!=null){
            lt("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 小于等于 &lt;= position
     * @param position       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionLe(String position){
        if(position!=null){
            le("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * BETWEEN 值1 AND 值2
     * @param positionStart       值1
     * @param positionEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionBetween(String positionStart,String positionEnd){
        if(positionStart!=null && positionEnd!=null){
            between("position",positionStart,positionEnd);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * NOT BETWEEN 值1 AND 值2
     * @param positionStart       值1
     * @param positionEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionNotBetween(String positionStart,String positionEnd){
        if(positionStart!=null && positionEnd!=null){
            notBetween("position",positionStart,positionEnd);
        }
        return this;
     }


    /**
     * <p>位置信息</p>
     * LIKE '%值%' position
     * @param position       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionLike(String position){
        if(position!=null){
            like("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * NOT LIKE '%值%' position
     * @param position       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionNotLike(String position){
        if(position!=null){
            notLike("position",position);
        }
        return this;
     }


    /**
     * <p>位置信息</p>
     * LIKE '%值' position
     * @param position       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionLikeLeft(String position){
        if(position!=null){
            likeLeft("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * LIKE '值%' position
     * @param position       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionLikeRight(String position){
        if(position!=null){
            likeRight("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionIsNull(){
        isNull("position");
        return this;
    }

    /**
     * <p>位置信息</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionIsNotNull(){
        isNotNull("position");
        return this;
    }

    /**
     * <p>位置信息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("position",value);
        }
        return this;
    }

    /**
     * <p>位置信息</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionIn(String... values){
        if(values!=null && values.length>0){
            in("position",values);
        }
        return this;
    }

    /**
     * <p>位置信息</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("position",value);
        }
        return this;
    }

    /**
     * <p>位置信息</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper positionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("position",values);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 等于 = roomSession
     * @param roomSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomSessionEq(String roomSession){
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
    public DevRoomPlayerUpdateWrapper roomSessionNe(String roomSession){
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
    public DevRoomPlayerUpdateWrapper roomSessionGt(String roomSession){
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
    public DevRoomPlayerUpdateWrapper roomSessionGe(String roomSession){
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
    public DevRoomPlayerUpdateWrapper roomSessionLt(String roomSession){
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
    public DevRoomPlayerUpdateWrapper roomSessionLe(String roomSession){
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
    public DevRoomPlayerUpdateWrapper roomSessionBetween(String roomSessionStart,String roomSessionEnd){
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
    public DevRoomPlayerUpdateWrapper roomSessionNotBetween(String roomSessionStart,String roomSessionEnd){
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
    public DevRoomPlayerUpdateWrapper roomSessionLike(String roomSession){
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
    public DevRoomPlayerUpdateWrapper roomSessionNotLike(String roomSession){
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
    public DevRoomPlayerUpdateWrapper roomSessionLikeLeft(String roomSession){
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
    public DevRoomPlayerUpdateWrapper roomSessionLikeRight(String roomSession){
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
    public DevRoomPlayerUpdateWrapper roomSessionIsNull(){
        isNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomSessionIsNotNull(){
        isNotNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomSessionIn(Collection<String> value){
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
    public DevRoomPlayerUpdateWrapper roomSessionIn(String... values){
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
    public DevRoomPlayerUpdateWrapper roomSessionNotIn(Collection<String> value){
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
    public DevRoomPlayerUpdateWrapper roomSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_session",values);
        }
        return this;
    }

    /**
     * <p>房间分享session</p>
     * 等于 = roomShareSession
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionEq(String roomShareSession){
        if(roomShareSession!=null){
            eq("room_share_session",roomShareSession);
        }
        return this;
    }

    /**
     * <p>房间分享session</p>
     * 不等于 &lt;&gt; roomShareSession
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionNe(String roomShareSession){
        if(roomShareSession!=null){
            ne("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 大于 &gt; roomShareSession
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionGt(String roomShareSession){
        if(roomShareSession!=null){
            gt("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 大于等于 &gt;= roomShareSession
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionGe(String roomShareSession){
        if(roomShareSession!=null){
            ge("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 小于 &lt; roomShareSession
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionLt(String roomShareSession){
        if(roomShareSession!=null){
            lt("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 小于等于 &lt;= roomShareSession
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionLe(String roomShareSession){
        if(roomShareSession!=null){
            le("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * BETWEEN 值1 AND 值2
     * @param roomShareSessionStart       值1
     * @param roomShareSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionBetween(String roomShareSessionStart,String roomShareSessionEnd){
        if(roomShareSessionStart!=null && roomShareSessionEnd!=null){
            between("room_share_session",roomShareSessionStart,roomShareSessionEnd);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * NOT BETWEEN 值1 AND 值2
     * @param roomShareSessionStart       值1
     * @param roomShareSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionNotBetween(String roomShareSessionStart,String roomShareSessionEnd){
        if(roomShareSessionStart!=null && roomShareSessionEnd!=null){
            notBetween("room_share_session",roomShareSessionStart,roomShareSessionEnd);
        }
        return this;
     }


    /**
     * <p>房间分享session</p>
     * LIKE '%值%' roomShareSession
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionLike(String roomShareSession){
        if(roomShareSession!=null){
            like("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * NOT LIKE '%值%' roomShareSession
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionNotLike(String roomShareSession){
        if(roomShareSession!=null){
            notLike("room_share_session",roomShareSession);
        }
        return this;
     }


    /**
     * <p>房间分享session</p>
     * LIKE '%值' roomShareSession
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionLikeLeft(String roomShareSession){
        if(roomShareSession!=null){
            likeLeft("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * LIKE '值%' roomShareSession
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionLikeRight(String roomShareSession){
        if(roomShareSession!=null){
            likeRight("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionIsNull(){
        isNull("room_share_session");
        return this;
    }

    /**
     * <p>房间分享session</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionIsNotNull(){
        isNotNull("room_share_session");
        return this;
    }

    /**
     * <p>房间分享session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("room_share_session",value);
        }
        return this;
    }

    /**
     * <p>房间分享session</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionIn(String... values){
        if(values!=null && values.length>0){
            in("room_share_session",values);
        }
        return this;
    }

    /**
     * <p>房间分享session</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("room_share_session",value);
        }
        return this;
    }

    /**
     * <p>房间分享session</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomShareSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_share_session",values);
        }
        return this;
    }

    /**
     * <p>玩家session</p>
     * 等于 = roomPlayerSession
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionEq(String roomPlayerSession){
        if(roomPlayerSession!=null){
            eq("room_player_session",roomPlayerSession);
        }
        return this;
    }

    /**
     * <p>玩家session</p>
     * 不等于 &lt;&gt; roomPlayerSession
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionNe(String roomPlayerSession){
        if(roomPlayerSession!=null){
            ne("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 大于 &gt; roomPlayerSession
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionGt(String roomPlayerSession){
        if(roomPlayerSession!=null){
            gt("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 大于等于 &gt;= roomPlayerSession
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionGe(String roomPlayerSession){
        if(roomPlayerSession!=null){
            ge("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 小于 &lt; roomPlayerSession
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionLt(String roomPlayerSession){
        if(roomPlayerSession!=null){
            lt("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 小于等于 &lt;= roomPlayerSession
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionLe(String roomPlayerSession){
        if(roomPlayerSession!=null){
            le("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * BETWEEN 值1 AND 值2
     * @param roomPlayerSessionStart       值1
     * @param roomPlayerSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionBetween(String roomPlayerSessionStart,String roomPlayerSessionEnd){
        if(roomPlayerSessionStart!=null && roomPlayerSessionEnd!=null){
            between("room_player_session",roomPlayerSessionStart,roomPlayerSessionEnd);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * NOT BETWEEN 值1 AND 值2
     * @param roomPlayerSessionStart       值1
     * @param roomPlayerSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionNotBetween(String roomPlayerSessionStart,String roomPlayerSessionEnd){
        if(roomPlayerSessionStart!=null && roomPlayerSessionEnd!=null){
            notBetween("room_player_session",roomPlayerSessionStart,roomPlayerSessionEnd);
        }
        return this;
     }


    /**
     * <p>玩家session</p>
     * LIKE '%值%' roomPlayerSession
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionLike(String roomPlayerSession){
        if(roomPlayerSession!=null){
            like("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * NOT LIKE '%值%' roomPlayerSession
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionNotLike(String roomPlayerSession){
        if(roomPlayerSession!=null){
            notLike("room_player_session",roomPlayerSession);
        }
        return this;
     }


    /**
     * <p>玩家session</p>
     * LIKE '%值' roomPlayerSession
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionLikeLeft(String roomPlayerSession){
        if(roomPlayerSession!=null){
            likeLeft("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * LIKE '值%' roomPlayerSession
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionLikeRight(String roomPlayerSession){
        if(roomPlayerSession!=null){
            likeRight("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionIsNull(){
        isNull("room_player_session");
        return this;
    }

    /**
     * <p>玩家session</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionIsNotNull(){
        isNotNull("room_player_session");
        return this;
    }

    /**
     * <p>玩家session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("room_player_session",value);
        }
        return this;
    }

    /**
     * <p>玩家session</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionIn(String... values){
        if(values!=null && values.length>0){
            in("room_player_session",values);
        }
        return this;
    }

    /**
     * <p>玩家session</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("room_player_session",value);
        }
        return this;
    }

    /**
     * <p>玩家session</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_player_session",values);
        }
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * 等于 = playSessionExpireTime
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeEq(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            eq("play_session_expire_time",playSessionExpireTime);
        }
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * 不等于 &lt;&gt; playSessionExpireTime
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeNe(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            ne("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 大于 &gt; playSessionExpireTime
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeGt(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            gt("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 大于等于 &gt;= playSessionExpireTime
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeGe(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            ge("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 小于 &lt; playSessionExpireTime
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeLt(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            lt("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 小于等于 &lt;= playSessionExpireTime
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeLe(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            le("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * BETWEEN 值1 AND 值2
     * @param playSessionExpireTimeStart       值1
     * @param playSessionExpireTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeBetween(Date playSessionExpireTimeStart,Date playSessionExpireTimeEnd){
        if(playSessionExpireTimeStart!=null && playSessionExpireTimeEnd!=null){
            between("play_session_expire_time",playSessionExpireTimeStart,playSessionExpireTimeEnd);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param playSessionExpireTimeStart       值1
     * @param playSessionExpireTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeNotBetween(Date playSessionExpireTimeStart,Date playSessionExpireTimeEnd){
        if(playSessionExpireTimeStart!=null && playSessionExpireTimeEnd!=null){
            notBetween("play_session_expire_time",playSessionExpireTimeStart,playSessionExpireTimeEnd);
        }
        return this;
     }


    /**
     * <p>玩家session到期时间</p>
     * LIKE '%值%' playSessionExpireTime
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeLike(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            like("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * NOT LIKE '%值%' playSessionExpireTime
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeNotLike(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            notLike("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }


    /**
     * <p>玩家session到期时间</p>
     * LIKE '%值' playSessionExpireTime
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeLikeLeft(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            likeLeft("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * LIKE '值%' playSessionExpireTime
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeLikeRight(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            likeRight("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeIsNull(){
        isNull("play_session_expire_time");
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeIsNotNull(){
        isNotNull("play_session_expire_time");
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("play_session_expire_time",value);
        }
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("play_session_expire_time",values);
        }
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("play_session_expire_time",value);
        }
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playSessionExpireTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("play_session_expire_time",values);
        }
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 等于 = queueToken
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenEq(String queueToken){
        if(queueToken!=null){
            eq("queue_token",queueToken);
        }
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 不等于 &lt;&gt; queueToken
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenNe(String queueToken){
        if(queueToken!=null){
            ne("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 大于 &gt; queueToken
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenGt(String queueToken){
        if(queueToken!=null){
            gt("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 大于等于 &gt;= queueToken
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenGe(String queueToken){
        if(queueToken!=null){
            ge("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 小于 &lt; queueToken
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenLt(String queueToken){
        if(queueToken!=null){
            lt("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 小于等于 &lt;= queueToken
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenLe(String queueToken){
        if(queueToken!=null){
            le("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * BETWEEN 值1 AND 值2
     * @param queueTokenStart       值1
     * @param queueTokenEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenBetween(String queueTokenStart,String queueTokenEnd){
        if(queueTokenStart!=null && queueTokenEnd!=null){
            between("queue_token",queueTokenStart,queueTokenEnd);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param queueTokenStart       值1
     * @param queueTokenEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenNotBetween(String queueTokenStart,String queueTokenEnd){
        if(queueTokenStart!=null && queueTokenEnd!=null){
            notBetween("queue_token",queueTokenStart,queueTokenEnd);
        }
        return this;
     }


    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * LIKE '%值%' queueToken
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenLike(String queueToken){
        if(queueToken!=null){
            like("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * NOT LIKE '%值%' queueToken
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenNotLike(String queueToken){
        if(queueToken!=null){
            notLike("queue_token",queueToken);
        }
        return this;
     }


    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * LIKE '%值' queueToken
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenLikeLeft(String queueToken){
        if(queueToken!=null){
            likeLeft("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * LIKE '值%' queueToken
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenLikeRight(String queueToken){
        if(queueToken!=null){
            likeRight("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenIsNull(){
        isNull("queue_token");
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenIsNotNull(){
        isNotNull("queue_token");
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("queue_token",value);
        }
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenIn(String... values){
        if(values!=null && values.length>0){
            in("queue_token",values);
        }
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("queue_token",value);
        }
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper queueTokenNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("queue_token",values);
        }
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * 等于 = phoneId
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdEq(String phoneId){
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * 不等于 &lt;&gt; phoneId
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdNe(String phoneId){
        if(phoneId!=null){
            ne("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 大于 &gt; phoneId
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdGt(String phoneId){
        if(phoneId!=null){
            gt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 大于等于 &gt;= phoneId
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdGe(String phoneId){
        if(phoneId!=null){
            ge("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 小于 &lt; phoneId
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdLt(String phoneId){
        if(phoneId!=null){
            lt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 小于等于 &lt;= phoneId
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdLe(String phoneId){
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * BETWEEN 值1 AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
        if(phoneIdStart!=null && phoneIdEnd!=null){
            between("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * NOT BETWEEN 值1 AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        if(phoneIdStart!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>玩家设备ID</p>
     * LIKE '%值%' phoneId
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdLike(String phoneId){
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * NOT LIKE '%值%' phoneId
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdNotLike(String phoneId){
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
     }


    /**
     * <p>玩家设备ID</p>
     * LIKE '%值' phoneId
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdLikeLeft(String phoneId){
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * LIKE '值%' phoneId
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdLikeRight(String phoneId){
        if(phoneId!=null){
            likeRight("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("phone_id",value);
        }
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdIn(String... values){
        if(values!=null && values.length>0){
            in("phone_id",values);
        }
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("phone_id",value);
        }
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper phoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_id",values);
        }
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * 等于 = os
     * @param os       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osEq(String os){
        if(os!=null){
            eq("os",os);
        }
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * 不等于 &lt;&gt; os
     * @param os       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osNe(String os){
        if(os!=null){
            ne("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 大于 &gt; os
     * @param os       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osGt(String os){
        if(os!=null){
            gt("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 大于等于 &gt;= os
     * @param os       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osGe(String os){
        if(os!=null){
            ge("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 小于 &lt; os
     * @param os       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osLt(String os){
        if(os!=null){
            lt("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 小于等于 &lt;= os
     * @param os       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osLe(String os){
        if(os!=null){
            le("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * BETWEEN 值1 AND 值2
     * @param osStart       值1
     * @param osEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osBetween(String osStart,String osEnd){
        if(osStart!=null && osEnd!=null){
            between("os",osStart,osEnd);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param osStart       值1
     * @param osEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osNotBetween(String osStart,String osEnd){
        if(osStart!=null && osEnd!=null){
            notBetween("os",osStart,osEnd);
        }
        return this;
     }


    /**
     * <p>操作系统（android|ios）</p>
     * LIKE '%值%' os
     * @param os       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osLike(String os){
        if(os!=null){
            like("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * NOT LIKE '%值%' os
     * @param os       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osNotLike(String os){
        if(os!=null){
            notLike("os",os);
        }
        return this;
     }


    /**
     * <p>操作系统（android|ios）</p>
     * LIKE '%值' os
     * @param os       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osLikeLeft(String os){
        if(os!=null){
            likeLeft("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * LIKE '值%' os
     * @param os       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osLikeRight(String os){
        if(os!=null){
            likeRight("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osIsNull(){
        isNull("os");
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osIsNotNull(){
        isNotNull("os");
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("os",value);
        }
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osIn(String... values){
        if(values!=null && values.length>0){
            in("os",values);
        }
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("os",value);
        }
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper osNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os",values);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 等于 = serverType
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeEq(Integer serverType){
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 不等于 &lt;&gt; serverType
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeNe(Integer serverType){
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 大于 &gt; serverType
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeGt(Integer serverType){
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 大于等于 &gt;= serverType
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeGe(Integer serverType){
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 小于 &lt; serverType
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeLt(Integer serverType){
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 小于等于 &lt;= serverType
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeLe(Integer serverType){
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * BETWEEN 值1 AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeBetween(Integer serverTypeStart,Integer serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            between("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeNotBetween(Integer serverTypeStart,Integer serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值%' serverType
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeLike(Integer serverType){
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT LIKE '%值%' serverType
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeNotLike(Integer serverType){
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值' serverType
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeLikeLeft(Integer serverType){
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '值%' serverType
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeLikeRight(Integer serverType){
        if(serverType!=null){
            likeRight("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("server_type",value);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("server_type",values);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("server_type",value);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper serverTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 等于 = playerLoginStatus
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusEq(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            eq("player_login_status",playerLoginStatus);
        }
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 不等于 &lt;&gt; playerLoginStatus
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusNe(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            ne("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 大于 &gt; playerLoginStatus
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusGt(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            gt("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 大于等于 &gt;= playerLoginStatus
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusGe(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            ge("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 小于 &lt; playerLoginStatus
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusLt(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            lt("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 小于等于 &lt;= playerLoginStatus
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusLe(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            le("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * BETWEEN 值1 AND 值2
     * @param playerLoginStatusStart       值1
     * @param playerLoginStatusEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusBetween(Integer playerLoginStatusStart,Integer playerLoginStatusEnd){
        if(playerLoginStatusStart!=null && playerLoginStatusEnd!=null){
            between("player_login_status",playerLoginStatusStart,playerLoginStatusEnd);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param playerLoginStatusStart       值1
     * @param playerLoginStatusEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusNotBetween(Integer playerLoginStatusStart,Integer playerLoginStatusEnd){
        if(playerLoginStatusStart!=null && playerLoginStatusEnd!=null){
            notBetween("player_login_status",playerLoginStatusStart,playerLoginStatusEnd);
        }
        return this;
     }


    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * LIKE '%值%' playerLoginStatus
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusLike(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            like("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * NOT LIKE '%值%' playerLoginStatus
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusNotLike(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            notLike("player_login_status",playerLoginStatus);
        }
        return this;
     }


    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * LIKE '%值' playerLoginStatus
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusLikeLeft(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            likeLeft("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * LIKE '值%' playerLoginStatus
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusLikeRight(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            likeRight("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusIsNull(){
        isNull("player_login_status");
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusIsNotNull(){
        isNotNull("player_login_status");
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("player_login_status",value);
        }
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("player_login_status",values);
        }
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("player_login_status",value);
        }
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper playerLoginStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("player_login_status",values);
        }
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 等于 = msgReportType
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeEq(Integer msgReportType){
        if(msgReportType!=null){
            eq("msg_report_type",msgReportType);
        }
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 不等于 &lt;&gt; msgReportType
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeNe(Integer msgReportType){
        if(msgReportType!=null){
            ne("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 大于 &gt; msgReportType
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeGt(Integer msgReportType){
        if(msgReportType!=null){
            gt("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 大于等于 &gt;= msgReportType
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeGe(Integer msgReportType){
        if(msgReportType!=null){
            ge("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 小于 &lt; msgReportType
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeLt(Integer msgReportType){
        if(msgReportType!=null){
            lt("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 小于等于 &lt;= msgReportType
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeLe(Integer msgReportType){
        if(msgReportType!=null){
            le("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * BETWEEN 值1 AND 值2
     * @param msgReportTypeStart       值1
     * @param msgReportTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeBetween(Integer msgReportTypeStart,Integer msgReportTypeEnd){
        if(msgReportTypeStart!=null && msgReportTypeEnd!=null){
            between("msg_report_type",msgReportTypeStart,msgReportTypeEnd);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param msgReportTypeStart       值1
     * @param msgReportTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeNotBetween(Integer msgReportTypeStart,Integer msgReportTypeEnd){
        if(msgReportTypeStart!=null && msgReportTypeEnd!=null){
            notBetween("msg_report_type",msgReportTypeStart,msgReportTypeEnd);
        }
        return this;
     }


    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * LIKE '%值%' msgReportType
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeLike(Integer msgReportType){
        if(msgReportType!=null){
            like("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * NOT LIKE '%值%' msgReportType
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeNotLike(Integer msgReportType){
        if(msgReportType!=null){
            notLike("msg_report_type",msgReportType);
        }
        return this;
     }


    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * LIKE '%值' msgReportType
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeLikeLeft(Integer msgReportType){
        if(msgReportType!=null){
            likeLeft("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * LIKE '值%' msgReportType
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeLikeRight(Integer msgReportType){
        if(msgReportType!=null){
            likeRight("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeIsNull(){
        isNull("msg_report_type");
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeIsNotNull(){
        isNotNull("msg_report_type");
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("msg_report_type",value);
        }
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("msg_report_type",values);
        }
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("msg_report_type",value);
        }
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper msgReportTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("msg_report_type",values);
        }
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 等于 = roomPlayerRole
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleEq(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            eq("room_player_role",roomPlayerRole);
        }
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 不等于 &lt;&gt; roomPlayerRole
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleNe(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            ne("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 大于 &gt; roomPlayerRole
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleGt(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            gt("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 大于等于 &gt;= roomPlayerRole
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleGe(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            ge("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 小于 &lt; roomPlayerRole
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleLt(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            lt("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 小于等于 &lt;= roomPlayerRole
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleLe(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            le("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * BETWEEN 值1 AND 值2
     * @param roomPlayerRoleStart       值1
     * @param roomPlayerRoleEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleBetween(Integer roomPlayerRoleStart,Integer roomPlayerRoleEnd){
        if(roomPlayerRoleStart!=null && roomPlayerRoleEnd!=null){
            between("room_player_role",roomPlayerRoleStart,roomPlayerRoleEnd);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param roomPlayerRoleStart       值1
     * @param roomPlayerRoleEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleNotBetween(Integer roomPlayerRoleStart,Integer roomPlayerRoleEnd){
        if(roomPlayerRoleStart!=null && roomPlayerRoleEnd!=null){
            notBetween("room_player_role",roomPlayerRoleStart,roomPlayerRoleEnd);
        }
        return this;
     }


    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * LIKE '%值%' roomPlayerRole
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleLike(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            like("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * NOT LIKE '%值%' roomPlayerRole
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleNotLike(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            notLike("room_player_role",roomPlayerRole);
        }
        return this;
     }


    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * LIKE '%值' roomPlayerRole
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleLikeLeft(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            likeLeft("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * LIKE '值%' roomPlayerRole
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleLikeRight(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            likeRight("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleIsNull(){
        isNull("room_player_role");
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleIsNotNull(){
        isNotNull("room_player_role");
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("room_player_role",value);
        }
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleIn(Integer... values){
        if(values!=null && values.length>0){
            in("room_player_role",values);
        }
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("room_player_role",value);
        }
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomPlayerRoleNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_player_role",values);
        }
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * 等于 = heirLeaderId
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdEq(Long heirLeaderId){
        if(heirLeaderId!=null){
            eq("heir_leader_id",heirLeaderId);
        }
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * 不等于 &lt;&gt; heirLeaderId
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdNe(Long heirLeaderId){
        if(heirLeaderId!=null){
            ne("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 大于 &gt; heirLeaderId
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdGt(Long heirLeaderId){
        if(heirLeaderId!=null){
            gt("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 大于等于 &gt;= heirLeaderId
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdGe(Long heirLeaderId){
        if(heirLeaderId!=null){
            ge("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 小于 &lt; heirLeaderId
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdLt(Long heirLeaderId){
        if(heirLeaderId!=null){
            lt("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 小于等于 &lt;= heirLeaderId
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdLe(Long heirLeaderId){
        if(heirLeaderId!=null){
            le("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * BETWEEN 值1 AND 值2
     * @param heirLeaderIdStart       值1
     * @param heirLeaderIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdBetween(Long heirLeaderIdStart,Long heirLeaderIdEnd){
        if(heirLeaderIdStart!=null && heirLeaderIdEnd!=null){
            between("heir_leader_id",heirLeaderIdStart,heirLeaderIdEnd);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param heirLeaderIdStart       值1
     * @param heirLeaderIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdNotBetween(Long heirLeaderIdStart,Long heirLeaderIdEnd){
        if(heirLeaderIdStart!=null && heirLeaderIdEnd!=null){
            notBetween("heir_leader_id",heirLeaderIdStart,heirLeaderIdEnd);
        }
        return this;
     }


    /**
     * <p>房间继承者id</p>
     * LIKE '%值%' heirLeaderId
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdLike(Long heirLeaderId){
        if(heirLeaderId!=null){
            like("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * NOT LIKE '%值%' heirLeaderId
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdNotLike(Long heirLeaderId){
        if(heirLeaderId!=null){
            notLike("heir_leader_id",heirLeaderId);
        }
        return this;
     }


    /**
     * <p>房间继承者id</p>
     * LIKE '%值' heirLeaderId
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdLikeLeft(Long heirLeaderId){
        if(heirLeaderId!=null){
            likeLeft("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * LIKE '值%' heirLeaderId
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdLikeRight(Long heirLeaderId){
        if(heirLeaderId!=null){
            likeRight("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdIsNull(){
        isNull("heir_leader_id");
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdIsNotNull(){
        isNotNull("heir_leader_id");
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("heir_leader_id",value);
        }
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdIn(Long... values){
        if(values!=null && values.length>0){
            in("heir_leader_id",values);
        }
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("heir_leader_id",value);
        }
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper heirLeaderIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("heir_leader_id",values);
        }
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * 等于 = fetchTime
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeEq(Date fetchTime){
        if(fetchTime!=null){
            eq("fetch_time",fetchTime);
        }
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * 不等于 &lt;&gt; fetchTime
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeNe(Date fetchTime){
        if(fetchTime!=null){
            ne("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 大于 &gt; fetchTime
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeGt(Date fetchTime){
        if(fetchTime!=null){
            gt("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 大于等于 &gt;= fetchTime
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeGe(Date fetchTime){
        if(fetchTime!=null){
            ge("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 小于 &lt; fetchTime
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeLt(Date fetchTime){
        if(fetchTime!=null){
            lt("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 小于等于 &lt;= fetchTime
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeLe(Date fetchTime){
        if(fetchTime!=null){
            le("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * BETWEEN 值1 AND 值2
     * @param fetchTimeStart       值1
     * @param fetchTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeBetween(Date fetchTimeStart,Date fetchTimeEnd){
        if(fetchTimeStart!=null && fetchTimeEnd!=null){
            between("fetch_time",fetchTimeStart,fetchTimeEnd);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param fetchTimeStart       值1
     * @param fetchTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeNotBetween(Date fetchTimeStart,Date fetchTimeEnd){
        if(fetchTimeStart!=null && fetchTimeEnd!=null){
            notBetween("fetch_time",fetchTimeStart,fetchTimeEnd);
        }
        return this;
     }


    /**
     * <p>获取到设备时间</p>
     * LIKE '%值%' fetchTime
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeLike(Date fetchTime){
        if(fetchTime!=null){
            like("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * NOT LIKE '%值%' fetchTime
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeNotLike(Date fetchTime){
        if(fetchTime!=null){
            notLike("fetch_time",fetchTime);
        }
        return this;
     }


    /**
     * <p>获取到设备时间</p>
     * LIKE '%值' fetchTime
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeLikeLeft(Date fetchTime){
        if(fetchTime!=null){
            likeLeft("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * LIKE '值%' fetchTime
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeLikeRight(Date fetchTime){
        if(fetchTime!=null){
            likeRight("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeIsNull(){
        isNull("fetch_time");
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeIsNotNull(){
        isNotNull("fetch_time");
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("fetch_time",value);
        }
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("fetch_time",values);
        }
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("fetch_time",value);
        }
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper fetchTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("fetch_time",values);
        }
        return this;
    }

    /**
     * <p>记录时间</p>
     * 等于 = loginTime
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeEq(Date loginTime){
        if(loginTime!=null){
            eq("login_time",loginTime);
        }
        return this;
    }

    /**
     * <p>记录时间</p>
     * 不等于 &lt;&gt; loginTime
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeNe(Date loginTime){
        if(loginTime!=null){
            ne("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 大于 &gt; loginTime
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeGt(Date loginTime){
        if(loginTime!=null){
            gt("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 大于等于 &gt;= loginTime
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeGe(Date loginTime){
        if(loginTime!=null){
            ge("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 小于 &lt; loginTime
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeLt(Date loginTime){
        if(loginTime!=null){
            lt("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 小于等于 &lt;= loginTime
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeLe(Date loginTime){
        if(loginTime!=null){
            le("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * BETWEEN 值1 AND 值2
     * @param loginTimeStart       值1
     * @param loginTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeBetween(Date loginTimeStart,Date loginTimeEnd){
        if(loginTimeStart!=null && loginTimeEnd!=null){
            between("login_time",loginTimeStart,loginTimeEnd);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param loginTimeStart       值1
     * @param loginTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeNotBetween(Date loginTimeStart,Date loginTimeEnd){
        if(loginTimeStart!=null && loginTimeEnd!=null){
            notBetween("login_time",loginTimeStart,loginTimeEnd);
        }
        return this;
     }


    /**
     * <p>记录时间</p>
     * LIKE '%值%' loginTime
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeLike(Date loginTime){
        if(loginTime!=null){
            like("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * NOT LIKE '%值%' loginTime
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeNotLike(Date loginTime){
        if(loginTime!=null){
            notLike("login_time",loginTime);
        }
        return this;
     }


    /**
     * <p>记录时间</p>
     * LIKE '%值' loginTime
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeLikeLeft(Date loginTime){
        if(loginTime!=null){
            likeLeft("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * LIKE '值%' loginTime
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeLikeRight(Date loginTime){
        if(loginTime!=null){
            likeRight("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeIsNull(){
        isNull("login_time");
        return this;
    }

    /**
     * <p>记录时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeIsNotNull(){
        isNotNull("login_time");
        return this;
    }

    /**
     * <p>记录时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("login_time",value);
        }
        return this;
    }

    /**
     * <p>记录时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("login_time",values);
        }
        return this;
    }

    /**
     * <p>记录时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("login_time",value);
        }
        return this;
    }

    /**
     * <p>记录时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper loginTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("login_time",values);
        }
        return this;
    }

    /**
     * <p>退出时间</p>
     * 等于 = logoutTime
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeEq(Date logoutTime){
        if(logoutTime!=null){
            eq("logout_time",logoutTime);
        }
        return this;
    }

    /**
     * <p>退出时间</p>
     * 不等于 &lt;&gt; logoutTime
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeNe(Date logoutTime){
        if(logoutTime!=null){
            ne("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 大于 &gt; logoutTime
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeGt(Date logoutTime){
        if(logoutTime!=null){
            gt("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 大于等于 &gt;= logoutTime
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeGe(Date logoutTime){
        if(logoutTime!=null){
            ge("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 小于 &lt; logoutTime
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeLt(Date logoutTime){
        if(logoutTime!=null){
            lt("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 小于等于 &lt;= logoutTime
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeLe(Date logoutTime){
        if(logoutTime!=null){
            le("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * BETWEEN 值1 AND 值2
     * @param logoutTimeStart       值1
     * @param logoutTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeBetween(Date logoutTimeStart,Date logoutTimeEnd){
        if(logoutTimeStart!=null && logoutTimeEnd!=null){
            between("logout_time",logoutTimeStart,logoutTimeEnd);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param logoutTimeStart       值1
     * @param logoutTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeNotBetween(Date logoutTimeStart,Date logoutTimeEnd){
        if(logoutTimeStart!=null && logoutTimeEnd!=null){
            notBetween("logout_time",logoutTimeStart,logoutTimeEnd);
        }
        return this;
     }


    /**
     * <p>退出时间</p>
     * LIKE '%值%' logoutTime
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeLike(Date logoutTime){
        if(logoutTime!=null){
            like("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * NOT LIKE '%值%' logoutTime
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeNotLike(Date logoutTime){
        if(logoutTime!=null){
            notLike("logout_time",logoutTime);
        }
        return this;
     }


    /**
     * <p>退出时间</p>
     * LIKE '%值' logoutTime
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeLikeLeft(Date logoutTime){
        if(logoutTime!=null){
            likeLeft("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * LIKE '值%' logoutTime
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeLikeRight(Date logoutTime){
        if(logoutTime!=null){
            likeRight("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeIsNull(){
        isNull("logout_time");
        return this;
    }

    /**
     * <p>退出时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeIsNotNull(){
        isNotNull("logout_time");
        return this;
    }

    /**
     * <p>退出时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("logout_time",value);
        }
        return this;
    }

    /**
     * <p>退出时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("logout_time",values);
        }
        return this;
    }

    /**
     * <p>退出时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("logout_time",value);
        }
        return this;
    }

    /**
     * <p>退出时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper logoutTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("logout_time",values);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 等于 = idleTime
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeEq(Date idleTime){
        if(idleTime!=null){
            eq("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 不等于 &lt;&gt; idleTime
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeNe(Date idleTime){
        if(idleTime!=null){
            ne("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 大于 &gt; idleTime
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeGt(Date idleTime){
        if(idleTime!=null){
            gt("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 大于等于 &gt;= idleTime
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeGe(Date idleTime){
        if(idleTime!=null){
            ge("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 小于 &lt; idleTime
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeLt(Date idleTime){
        if(idleTime!=null){
            lt("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 小于等于 &lt;= idleTime
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeLe(Date idleTime){
        if(idleTime!=null){
            le("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * BETWEEN 值1 AND 值2
     * @param idleTimeStart       值1
     * @param idleTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeBetween(Date idleTimeStart,Date idleTimeEnd){
        if(idleTimeStart!=null && idleTimeEnd!=null){
            between("idle_time",idleTimeStart,idleTimeEnd);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param idleTimeStart       值1
     * @param idleTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeNotBetween(Date idleTimeStart,Date idleTimeEnd){
        if(idleTimeStart!=null && idleTimeEnd!=null){
            notBetween("idle_time",idleTimeStart,idleTimeEnd);
        }
        return this;
     }


    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值%' idleTime
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeLike(Date idleTime){
        if(idleTime!=null){
            like("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * NOT LIKE '%值%' idleTime
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeNotLike(Date idleTime){
        if(idleTime!=null){
            notLike("idle_time",idleTime);
        }
        return this;
     }


    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值' idleTime
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeLikeLeft(Date idleTime){
        if(idleTime!=null){
            likeLeft("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * LIKE '值%' idleTime
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeLikeRight(Date idleTime){
        if(idleTime!=null){
            likeRight("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeIsNull(){
        isNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeIsNotNull(){
        isNotNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("idle_time",value);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("idle_time",values);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("idle_time",value);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper idleTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("idle_time",values);
        }
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * 等于 = clientStreamingStartTime
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeEq(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            eq("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * 不等于 &lt;&gt; clientStreamingStartTime
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeNe(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            ne("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 大于 &gt; clientStreamingStartTime
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeGt(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            gt("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 大于等于 &gt;= clientStreamingStartTime
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeGe(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            ge("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 小于 &lt; clientStreamingStartTime
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeLt(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            lt("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 小于等于 &lt;= clientStreamingStartTime
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeLe(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            le("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * BETWEEN 值1 AND 值2
     * @param clientStreamingStartTimeStart       值1
     * @param clientStreamingStartTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeBetween(Date clientStreamingStartTimeStart,Date clientStreamingStartTimeEnd){
        if(clientStreamingStartTimeStart!=null && clientStreamingStartTimeEnd!=null){
            between("client_streaming_start_time",clientStreamingStartTimeStart,clientStreamingStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param clientStreamingStartTimeStart       值1
     * @param clientStreamingStartTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeNotBetween(Date clientStreamingStartTimeStart,Date clientStreamingStartTimeEnd){
        if(clientStreamingStartTimeStart!=null && clientStreamingStartTimeEnd!=null){
            notBetween("client_streaming_start_time",clientStreamingStartTimeStart,clientStreamingStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>客户端streaming进入时间</p>
     * LIKE '%值%' clientStreamingStartTime
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeLike(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            like("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * NOT LIKE '%值%' clientStreamingStartTime
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeNotLike(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            notLike("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }


    /**
     * <p>客户端streaming进入时间</p>
     * LIKE '%值' clientStreamingStartTime
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeLikeLeft(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            likeLeft("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * LIKE '值%' clientStreamingStartTime
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeLikeRight(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            likeRight("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeIsNull(){
        isNull("client_streaming_start_time");
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeIsNotNull(){
        isNotNull("client_streaming_start_time");
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("client_streaming_start_time",value);
        }
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("client_streaming_start_time",values);
        }
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("client_streaming_start_time",value);
        }
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("client_streaming_start_time",values);
        }
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * 等于 = clientStreamingEndTime
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeEq(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            eq("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * 不等于 &lt;&gt; clientStreamingEndTime
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeNe(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            ne("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 大于 &gt; clientStreamingEndTime
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeGt(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            gt("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 大于等于 &gt;= clientStreamingEndTime
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeGe(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            ge("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 小于 &lt; clientStreamingEndTime
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeLt(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            lt("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 小于等于 &lt;= clientStreamingEndTime
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeLe(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            le("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * BETWEEN 值1 AND 值2
     * @param clientStreamingEndTimeStart       值1
     * @param clientStreamingEndTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeBetween(Date clientStreamingEndTimeStart,Date clientStreamingEndTimeEnd){
        if(clientStreamingEndTimeStart!=null && clientStreamingEndTimeEnd!=null){
            between("client_streaming_end_time",clientStreamingEndTimeStart,clientStreamingEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * NOT BETWEEN 值1 AND 值2
     * @param clientStreamingEndTimeStart       值1
     * @param clientStreamingEndTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeNotBetween(Date clientStreamingEndTimeStart,Date clientStreamingEndTimeEnd){
        if(clientStreamingEndTimeStart!=null && clientStreamingEndTimeEnd!=null){
            notBetween("client_streaming_end_time",clientStreamingEndTimeStart,clientStreamingEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>客户端streaming退出时间</p>
     * LIKE '%值%' clientStreamingEndTime
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeLike(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            like("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * NOT LIKE '%值%' clientStreamingEndTime
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeNotLike(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            notLike("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }


    /**
     * <p>客户端streaming退出时间</p>
     * LIKE '%值' clientStreamingEndTime
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeLikeLeft(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            likeLeft("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * LIKE '值%' clientStreamingEndTime
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeLikeRight(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            likeRight("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeIsNull(){
        isNull("client_streaming_end_time");
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeIsNotNull(){
        isNotNull("client_streaming_end_time");
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("client_streaming_end_time",value);
        }
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("client_streaming_end_time",values);
        }
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("client_streaming_end_time",value);
        }
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper clientStreamingEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("client_streaming_end_time",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 = versionId
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 不等于 &lt;&gt; versionId
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于 &gt; versionId
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于等于 &gt;= versionId
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于 &lt; versionId
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于等于 &lt;= versionId
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%' versionId
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值' versionId
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '值%' versionId
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdLikeRight(Long versionId){
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdIn(Long... values){
        if(values!=null && values.length>0){
            in("version_id",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("version_id",value);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 等于 = roomType
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeEq(Integer roomType){
        if(roomType!=null){
            eq("room_type",roomType);
        }
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 不等于 &lt;&gt; roomType
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeNe(Integer roomType){
        if(roomType!=null){
            ne("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 大于 &gt; roomType
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeGt(Integer roomType){
        if(roomType!=null){
            gt("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 大于等于 &gt;= roomType
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeGe(Integer roomType){
        if(roomType!=null){
            ge("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 小于 &lt; roomType
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeLt(Integer roomType){
        if(roomType!=null){
            lt("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 小于等于 &lt;= roomType
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeLe(Integer roomType){
        if(roomType!=null){
            le("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * BETWEEN 值1 AND 值2
     * @param roomTypeStart       值1
     * @param roomTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeBetween(Integer roomTypeStart,Integer roomTypeEnd){
        if(roomTypeStart!=null && roomTypeEnd!=null){
            between("room_type",roomTypeStart,roomTypeEnd);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * NOT BETWEEN 值1 AND 值2
     * @param roomTypeStart       值1
     * @param roomTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeNotBetween(Integer roomTypeStart,Integer roomTypeEnd){
        if(roomTypeStart!=null && roomTypeEnd!=null){
            notBetween("room_type",roomTypeStart,roomTypeEnd);
        }
        return this;
     }


    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * LIKE '%值%' roomType
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeLike(Integer roomType){
        if(roomType!=null){
            like("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * NOT LIKE '%值%' roomType
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeNotLike(Integer roomType){
        if(roomType!=null){
            notLike("room_type",roomType);
        }
        return this;
     }


    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * LIKE '%值' roomType
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeLikeLeft(Integer roomType){
        if(roomType!=null){
            likeLeft("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * LIKE '值%' roomType
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeLikeRight(Integer roomType){
        if(roomType!=null){
            likeRight("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeIsNull(){
        isNull("room_type");
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeIsNotNull(){
        isNotNull("room_type");
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("room_type",value);
        }
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("room_type",values);
        }
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("room_type",value);
        }
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper roomTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_type",values);
        }
        return this;
    }

    /**
     * <p>游族game_id</p>
     * 等于 = gameId
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdEq(Integer gameId){
        if(gameId!=null){
            eq("game_id",gameId);
        }
        return this;
    }

    /**
     * <p>游族game_id</p>
     * 不等于 &lt;&gt; gameId
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdNe(Integer gameId){
        if(gameId!=null){
            ne("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 大于 &gt; gameId
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdGt(Integer gameId){
        if(gameId!=null){
            gt("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 大于等于 &gt;= gameId
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdGe(Integer gameId){
        if(gameId!=null){
            ge("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 小于 &lt; gameId
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdLt(Integer gameId){
        if(gameId!=null){
            lt("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 小于等于 &lt;= gameId
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdLe(Integer gameId){
        if(gameId!=null){
            le("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * BETWEEN 值1 AND 值2
     * @param gameIdStart       值1
     * @param gameIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdBetween(Integer gameIdStart,Integer gameIdEnd){
        if(gameIdStart!=null && gameIdEnd!=null){
            between("game_id",gameIdStart,gameIdEnd);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param gameIdStart       值1
     * @param gameIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdNotBetween(Integer gameIdStart,Integer gameIdEnd){
        if(gameIdStart!=null && gameIdEnd!=null){
            notBetween("game_id",gameIdStart,gameIdEnd);
        }
        return this;
     }


    /**
     * <p>游族game_id</p>
     * LIKE '%值%' gameId
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdLike(Integer gameId){
        if(gameId!=null){
            like("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * NOT LIKE '%值%' gameId
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdNotLike(Integer gameId){
        if(gameId!=null){
            notLike("game_id",gameId);
        }
        return this;
     }


    /**
     * <p>游族game_id</p>
     * LIKE '%值' gameId
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdLikeLeft(Integer gameId){
        if(gameId!=null){
            likeLeft("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * LIKE '值%' gameId
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdLikeRight(Integer gameId){
        if(gameId!=null){
            likeRight("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdIsNull(){
        isNull("game_id");
        return this;
    }

    /**
     * <p>游族game_id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdIsNotNull(){
        isNotNull("game_id");
        return this;
    }

    /**
     * <p>游族game_id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("game_id",value);
        }
        return this;
    }

    /**
     * <p>游族game_id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdIn(Integer... values){
        if(values!=null && values.length>0){
            in("game_id",values);
        }
        return this;
    }

    /**
     * <p>游族game_id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("game_id",value);
        }
        return this;
    }

    /**
     * <p>游族game_id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper gameIdNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("game_id",values);
        }
        return this;
    }

    /**
     * <p>游族session_id</p>
     * 等于 = sessionId
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdEq(String sessionId){
        if(sessionId!=null){
            eq("session_id",sessionId);
        }
        return this;
    }

    /**
     * <p>游族session_id</p>
     * 不等于 &lt;&gt; sessionId
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdNe(String sessionId){
        if(sessionId!=null){
            ne("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 大于 &gt; sessionId
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdGt(String sessionId){
        if(sessionId!=null){
            gt("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 大于等于 &gt;= sessionId
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdGe(String sessionId){
        if(sessionId!=null){
            ge("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 小于 &lt; sessionId
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdLt(String sessionId){
        if(sessionId!=null){
            lt("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 小于等于 &lt;= sessionId
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdLe(String sessionId){
        if(sessionId!=null){
            le("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * BETWEEN 值1 AND 值2
     * @param sessionIdStart       值1
     * @param sessionIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdBetween(String sessionIdStart,String sessionIdEnd){
        if(sessionIdStart!=null && sessionIdEnd!=null){
            between("session_id",sessionIdStart,sessionIdEnd);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * NOT BETWEEN 值1 AND 值2
     * @param sessionIdStart       值1
     * @param sessionIdEnd      值2
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdNotBetween(String sessionIdStart,String sessionIdEnd){
        if(sessionIdStart!=null && sessionIdEnd!=null){
            notBetween("session_id",sessionIdStart,sessionIdEnd);
        }
        return this;
     }


    /**
     * <p>游族session_id</p>
     * LIKE '%值%' sessionId
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdLike(String sessionId){
        if(sessionId!=null){
            like("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * NOT LIKE '%值%' sessionId
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdNotLike(String sessionId){
        if(sessionId!=null){
            notLike("session_id",sessionId);
        }
        return this;
     }


    /**
     * <p>游族session_id</p>
     * LIKE '%值' sessionId
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdLikeLeft(String sessionId){
        if(sessionId!=null){
            likeLeft("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * LIKE '值%' sessionId
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdLikeRight(String sessionId){
        if(sessionId!=null){
            likeRight("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * IS NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdIsNull(){
        isNull("session_id");
        return this;
    }

    /**
     * <p>游族session_id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdIsNotNull(){
        isNotNull("session_id");
        return this;
    }

    /**
     * <p>游族session_id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("session_id",value);
        }
        return this;
    }

    /**
     * <p>游族session_id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdIn(String... values){
        if(values!=null && values.length>0){
            in("session_id",values);
        }
        return this;
    }

    /**
     * <p>游族session_id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("session_id",value);
        }
        return this;
    }

    /**
     * <p>游族session_id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public DevRoomPlayerUpdateWrapper sessionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("session_id",values);
        }
        return this;
    }


}
