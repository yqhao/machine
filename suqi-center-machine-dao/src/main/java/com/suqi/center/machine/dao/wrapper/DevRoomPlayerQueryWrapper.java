package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.suqi.center.machine.dao.entity.DevRoomPlayer;

import java.util.Collection;
import java.util.function.Consumer;


/**
 * <p>
 * 设备房间成员记录表（dev_room_player）
 * </p>
 * "dev_room_player"
 * @author PC001
 */
public class DevRoomPlayerQueryWrapper extends QueryWrapper<DevRoomPlayer> {


    public static DevRoomPlayerQueryWrapper wrapper() {
        return new DevRoomPlayerQueryWrapper();
    }

    public DevRoomPlayerQueryWrapper() {
        super();
    }

    public DevRoomPlayerQueryWrapper(DevRoomPlayer entity) {
        super(entity);
    }

    public DevRoomPlayerQueryWrapper(DevRoomPlayer entity, String... columns) {
        super(entity,columns);
    }


    @Override
    public DevRoomPlayerQueryWrapper select(String... columns) {
        super.select(columns);
        return this;
    }

    public DevRoomPlayerQueryWrapper selectColumns(Consumer<DevRoomPlayerSelect> consumer) {
        DevRoomPlayerSelect select = new DevRoomPlayerSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }


    /**
     * <p>房间成员记录</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idEq(Long id){
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * 不等于 &lt;&gt;
     * @param id       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idNe(Long id){
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 大于 &gt;
     * @param id       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idGt(Long id){
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 大于等于 &gt;=
     * @param id       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idGe(Long id){
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 小于 &lt;
     * @param id       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idLt(Long id){
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 小于等于 &lt;=
     * @param id       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idLe(Long id){
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
    public DevRoomPlayerQueryWrapper idBetween(Long idStart,Long idEnd){
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
    public DevRoomPlayerQueryWrapper idNotBetween(Long idStart,Long idEnd){
        if(idStart!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>房间成员记录</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idLike(Long id){
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * NOT LIKE '%值%'
     * @param id       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idNotLike(Long id){
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>房间成员记录</p>
     * LIKE '%值'
     * @param id       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idLikeLeft(Long id){
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * LIKE '值%'
     * @param id       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idLikeRight(Long id){
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
    public DevRoomPlayerQueryWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper idIn(Collection<Long> value){
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
    public DevRoomPlayerQueryWrapper idIn(Long... values){
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
    public DevRoomPlayerQueryWrapper idNotIn(Collection<Long> value){
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
    public DevRoomPlayerQueryWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * 等于 =
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdEq(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            eq("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * 不等于 &lt;&gt;
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdNe(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            ne("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 大于 &gt;
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdGt(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            gt("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 大于等于 &gt;=
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdGe(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            ge("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 小于 &lt;
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdLt(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            lt("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 小于等于 &lt;=
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdLe(Long fkMemberDeviceId){
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
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdBetween(Long fkMemberDeviceIdStart,Long fkMemberDeviceIdEnd){
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
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdNotBetween(Long fkMemberDeviceIdStart,Long fkMemberDeviceIdEnd){
        if(fkMemberDeviceIdStart!=null && fkMemberDeviceIdEnd!=null){
            notBetween("fk_member_device_id",fkMemberDeviceIdStart,fkMemberDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>用户设备表id</p>
     * LIKE '%值%'
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdLike(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            like("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * NOT LIKE '%值%'
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdNotLike(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            notLike("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }


    /**
     * <p>用户设备表id</p>
     * LIKE '%值'
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdLikeLeft(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            likeLeft("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * LIKE '值%'
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdLikeRight(Long fkMemberDeviceId){
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
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdIsNull(){
        isNull("fk_member_device_id");
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdIsNotNull(){
        isNotNull("fk_member_device_id");
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdIn(Collection<Long> value){
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
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdIn(Long... values){
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
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdNotIn(Collection<Long> value){
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
    public DevRoomPlayerQueryWrapper fkMemberDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_device_id",values);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 等于 =
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberIdEq(Long fkMemberId){
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 不等于 &lt;&gt;
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberIdNe(Long fkMemberId){
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 大于 &gt;
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberIdGt(Long fkMemberId){
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 大于等于 &gt;=
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberIdGe(Long fkMemberId){
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 小于 &lt;
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberIdLt(Long fkMemberId){
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 小于等于 &lt;=
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberIdLe(Long fkMemberId){
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
    public DevRoomPlayerQueryWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public DevRoomPlayerQueryWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        if(fkMemberIdStart!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>用户id</p>
     * LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberIdLike(Long fkMemberId){
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * NOT LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberIdNotLike(Long fkMemberId){
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>用户id</p>
     * LIKE '%值'
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberIdLikeLeft(Long fkMemberId){
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * LIKE '值%'
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public DevRoomPlayerQueryWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper fkMemberIdIn(Collection<Long> value){
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
    public DevRoomPlayerQueryWrapper fkMemberIdIn(Long... values){
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
    public DevRoomPlayerQueryWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public DevRoomPlayerQueryWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * 等于 =
     * @param deviceId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper deviceIdEq(String deviceId){
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
    public DevRoomPlayerQueryWrapper deviceIdNe(String deviceId){
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
    public DevRoomPlayerQueryWrapper deviceIdGt(String deviceId){
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
    public DevRoomPlayerQueryWrapper deviceIdGe(String deviceId){
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
    public DevRoomPlayerQueryWrapper deviceIdLt(String deviceId){
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
    public DevRoomPlayerQueryWrapper deviceIdLe(String deviceId){
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
    public DevRoomPlayerQueryWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public DevRoomPlayerQueryWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        if(deviceIdStart!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%'
     * @param deviceId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper deviceIdLike(String deviceId){
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
    public DevRoomPlayerQueryWrapper deviceIdNotLike(String deviceId){
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
    public DevRoomPlayerQueryWrapper deviceIdLikeLeft(String deviceId){
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
    public DevRoomPlayerQueryWrapper deviceIdLikeRight(String deviceId){
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
    public DevRoomPlayerQueryWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper deviceIdIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper deviceIdIn(String... values){
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
    public DevRoomPlayerQueryWrapper deviceIdNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }

    /**
     * <p>应用包名</p>
     * 等于 =
     * @param pkg       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper pkgEq(String pkg){
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
    public DevRoomPlayerQueryWrapper pkgNe(String pkg){
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
    public DevRoomPlayerQueryWrapper pkgGt(String pkg){
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
    public DevRoomPlayerQueryWrapper pkgGe(String pkg){
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
    public DevRoomPlayerQueryWrapper pkgLt(String pkg){
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
    public DevRoomPlayerQueryWrapper pkgLe(String pkg){
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
    public DevRoomPlayerQueryWrapper pkgBetween(String pkgStart,String pkgEnd){
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
    public DevRoomPlayerQueryWrapper pkgNotBetween(String pkgStart,String pkgEnd){
        if(pkgStart!=null && pkgEnd!=null){
            notBetween("pkg",pkgStart,pkgEnd);
        }
        return this;
     }


    /**
     * <p>应用包名</p>
     * LIKE '%值%'
     * @param pkg       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper pkgLike(String pkg){
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
    public DevRoomPlayerQueryWrapper pkgNotLike(String pkg){
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
    public DevRoomPlayerQueryWrapper pkgLikeLeft(String pkg){
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
    public DevRoomPlayerQueryWrapper pkgLikeRight(String pkg){
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
    public DevRoomPlayerQueryWrapper pkgIsNull(){
        isNull("pkg");
        return this;
    }

    /**
     * <p>应用包名</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper pkgIsNotNull(){
        isNotNull("pkg");
        return this;
    }

    /**
     * <p>应用包名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper pkgIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper pkgIn(String... values){
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
    public DevRoomPlayerQueryWrapper pkgNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper pkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("pkg",values);
        }
        return this;
    }

    /**
     * <p>位置信息</p>
     * 等于 =
     * @param position       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper positionEq(String position){
        if(position!=null){
            eq("position",position);
        }
        return this;
    }

    /**
     * <p>位置信息</p>
     * 不等于 &lt;&gt;
     * @param position       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper positionNe(String position){
        if(position!=null){
            ne("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 大于 &gt;
     * @param position       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper positionGt(String position){
        if(position!=null){
            gt("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 大于等于 &gt;=
     * @param position       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper positionGe(String position){
        if(position!=null){
            ge("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 小于 &lt;
     * @param position       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper positionLt(String position){
        if(position!=null){
            lt("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 小于等于 &lt;=
     * @param position       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper positionLe(String position){
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
    public DevRoomPlayerQueryWrapper positionBetween(String positionStart,String positionEnd){
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
    public DevRoomPlayerQueryWrapper positionNotBetween(String positionStart,String positionEnd){
        if(positionStart!=null && positionEnd!=null){
            notBetween("position",positionStart,positionEnd);
        }
        return this;
     }


    /**
     * <p>位置信息</p>
     * LIKE '%值%'
     * @param position       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper positionLike(String position){
        if(position!=null){
            like("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * NOT LIKE '%值%'
     * @param position       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper positionNotLike(String position){
        if(position!=null){
            notLike("position",position);
        }
        return this;
     }


    /**
     * <p>位置信息</p>
     * LIKE '%值'
     * @param position       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper positionLikeLeft(String position){
        if(position!=null){
            likeLeft("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * LIKE '值%'
     * @param position       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper positionLikeRight(String position){
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
    public DevRoomPlayerQueryWrapper positionIsNull(){
        isNull("position");
        return this;
    }

    /**
     * <p>位置信息</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper positionIsNotNull(){
        isNotNull("position");
        return this;
    }

    /**
     * <p>位置信息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper positionIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper positionIn(String... values){
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
    public DevRoomPlayerQueryWrapper positionNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper positionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("position",values);
        }
        return this;
    }

    /**
     * <p>房间session</p>
     * 等于 =
     * @param roomSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomSessionEq(String roomSession){
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
    public DevRoomPlayerQueryWrapper roomSessionNe(String roomSession){
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
    public DevRoomPlayerQueryWrapper roomSessionGt(String roomSession){
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
    public DevRoomPlayerQueryWrapper roomSessionGe(String roomSession){
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
    public DevRoomPlayerQueryWrapper roomSessionLt(String roomSession){
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
    public DevRoomPlayerQueryWrapper roomSessionLe(String roomSession){
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
    public DevRoomPlayerQueryWrapper roomSessionBetween(String roomSessionStart,String roomSessionEnd){
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
    public DevRoomPlayerQueryWrapper roomSessionNotBetween(String roomSessionStart,String roomSessionEnd){
        if(roomSessionStart!=null && roomSessionEnd!=null){
            notBetween("room_session",roomSessionStart,roomSessionEnd);
        }
        return this;
     }


    /**
     * <p>房间session</p>
     * LIKE '%值%'
     * @param roomSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomSessionLike(String roomSession){
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
    public DevRoomPlayerQueryWrapper roomSessionNotLike(String roomSession){
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
    public DevRoomPlayerQueryWrapper roomSessionLikeLeft(String roomSession){
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
    public DevRoomPlayerQueryWrapper roomSessionLikeRight(String roomSession){
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
    public DevRoomPlayerQueryWrapper roomSessionIsNull(){
        isNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomSessionIsNotNull(){
        isNotNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomSessionIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper roomSessionIn(String... values){
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
    public DevRoomPlayerQueryWrapper roomSessionNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper roomSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_session",values);
        }
        return this;
    }

    /**
     * <p>房间分享session</p>
     * 等于 =
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomShareSessionEq(String roomShareSession){
        if(roomShareSession!=null){
            eq("room_share_session",roomShareSession);
        }
        return this;
    }

    /**
     * <p>房间分享session</p>
     * 不等于 &lt;&gt;
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomShareSessionNe(String roomShareSession){
        if(roomShareSession!=null){
            ne("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 大于 &gt;
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomShareSessionGt(String roomShareSession){
        if(roomShareSession!=null){
            gt("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 大于等于 &gt;=
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomShareSessionGe(String roomShareSession){
        if(roomShareSession!=null){
            ge("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 小于 &lt;
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomShareSessionLt(String roomShareSession){
        if(roomShareSession!=null){
            lt("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 小于等于 &lt;=
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomShareSessionLe(String roomShareSession){
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
    public DevRoomPlayerQueryWrapper roomShareSessionBetween(String roomShareSessionStart,String roomShareSessionEnd){
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
    public DevRoomPlayerQueryWrapper roomShareSessionNotBetween(String roomShareSessionStart,String roomShareSessionEnd){
        if(roomShareSessionStart!=null && roomShareSessionEnd!=null){
            notBetween("room_share_session",roomShareSessionStart,roomShareSessionEnd);
        }
        return this;
     }


    /**
     * <p>房间分享session</p>
     * LIKE '%值%'
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomShareSessionLike(String roomShareSession){
        if(roomShareSession!=null){
            like("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * NOT LIKE '%值%'
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomShareSessionNotLike(String roomShareSession){
        if(roomShareSession!=null){
            notLike("room_share_session",roomShareSession);
        }
        return this;
     }


    /**
     * <p>房间分享session</p>
     * LIKE '%值'
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomShareSessionLikeLeft(String roomShareSession){
        if(roomShareSession!=null){
            likeLeft("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * LIKE '值%'
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomShareSessionLikeRight(String roomShareSession){
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
    public DevRoomPlayerQueryWrapper roomShareSessionIsNull(){
        isNull("room_share_session");
        return this;
    }

    /**
     * <p>房间分享session</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomShareSessionIsNotNull(){
        isNotNull("room_share_session");
        return this;
    }

    /**
     * <p>房间分享session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomShareSessionIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper roomShareSessionIn(String... values){
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
    public DevRoomPlayerQueryWrapper roomShareSessionNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper roomShareSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_share_session",values);
        }
        return this;
    }

    /**
     * <p>玩家session</p>
     * 等于 =
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerSessionEq(String roomPlayerSession){
        if(roomPlayerSession!=null){
            eq("room_player_session",roomPlayerSession);
        }
        return this;
    }

    /**
     * <p>玩家session</p>
     * 不等于 &lt;&gt;
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerSessionNe(String roomPlayerSession){
        if(roomPlayerSession!=null){
            ne("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 大于 &gt;
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerSessionGt(String roomPlayerSession){
        if(roomPlayerSession!=null){
            gt("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 大于等于 &gt;=
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerSessionGe(String roomPlayerSession){
        if(roomPlayerSession!=null){
            ge("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 小于 &lt;
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerSessionLt(String roomPlayerSession){
        if(roomPlayerSession!=null){
            lt("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 小于等于 &lt;=
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerSessionLe(String roomPlayerSession){
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
    public DevRoomPlayerQueryWrapper roomPlayerSessionBetween(String roomPlayerSessionStart,String roomPlayerSessionEnd){
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
    public DevRoomPlayerQueryWrapper roomPlayerSessionNotBetween(String roomPlayerSessionStart,String roomPlayerSessionEnd){
        if(roomPlayerSessionStart!=null && roomPlayerSessionEnd!=null){
            notBetween("room_player_session",roomPlayerSessionStart,roomPlayerSessionEnd);
        }
        return this;
     }


    /**
     * <p>玩家session</p>
     * LIKE '%值%'
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerSessionLike(String roomPlayerSession){
        if(roomPlayerSession!=null){
            like("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * NOT LIKE '%值%'
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerSessionNotLike(String roomPlayerSession){
        if(roomPlayerSession!=null){
            notLike("room_player_session",roomPlayerSession);
        }
        return this;
     }


    /**
     * <p>玩家session</p>
     * LIKE '%值'
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerSessionLikeLeft(String roomPlayerSession){
        if(roomPlayerSession!=null){
            likeLeft("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * LIKE '值%'
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerSessionLikeRight(String roomPlayerSession){
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
    public DevRoomPlayerQueryWrapper roomPlayerSessionIsNull(){
        isNull("room_player_session");
        return this;
    }

    /**
     * <p>玩家session</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerSessionIsNotNull(){
        isNotNull("room_player_session");
        return this;
    }

    /**
     * <p>玩家session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerSessionIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper roomPlayerSessionIn(String... values){
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
    public DevRoomPlayerQueryWrapper roomPlayerSessionNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper roomPlayerSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_player_session",values);
        }
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * 等于 =
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playSessionExpireTimeEq(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            eq("play_session_expire_time",playSessionExpireTime);
        }
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * 不等于 &lt;&gt;
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playSessionExpireTimeNe(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            ne("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 大于 &gt;
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playSessionExpireTimeGt(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            gt("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 大于等于 &gt;=
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playSessionExpireTimeGe(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            ge("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 小于 &lt;
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playSessionExpireTimeLt(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            lt("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 小于等于 &lt;=
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playSessionExpireTimeLe(Date playSessionExpireTime){
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
    public DevRoomPlayerQueryWrapper playSessionExpireTimeBetween(Date playSessionExpireTimeStart,Date playSessionExpireTimeEnd){
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
    public DevRoomPlayerQueryWrapper playSessionExpireTimeNotBetween(Date playSessionExpireTimeStart,Date playSessionExpireTimeEnd){
        if(playSessionExpireTimeStart!=null && playSessionExpireTimeEnd!=null){
            notBetween("play_session_expire_time",playSessionExpireTimeStart,playSessionExpireTimeEnd);
        }
        return this;
     }


    /**
     * <p>玩家session到期时间</p>
     * LIKE '%值%'
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playSessionExpireTimeLike(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            like("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * NOT LIKE '%值%'
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playSessionExpireTimeNotLike(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            notLike("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }


    /**
     * <p>玩家session到期时间</p>
     * LIKE '%值'
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playSessionExpireTimeLikeLeft(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            likeLeft("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * LIKE '值%'
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playSessionExpireTimeLikeRight(Date playSessionExpireTime){
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
    public DevRoomPlayerQueryWrapper playSessionExpireTimeIsNull(){
        isNull("play_session_expire_time");
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper playSessionExpireTimeIsNotNull(){
        isNotNull("play_session_expire_time");
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper playSessionExpireTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper playSessionExpireTimeIn(Date... values){
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
    public DevRoomPlayerQueryWrapper playSessionExpireTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper playSessionExpireTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("play_session_expire_time",values);
        }
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 等于 =
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper queueTokenEq(String queueToken){
        if(queueToken!=null){
            eq("queue_token",queueToken);
        }
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 不等于 &lt;&gt;
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper queueTokenNe(String queueToken){
        if(queueToken!=null){
            ne("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 大于 &gt;
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper queueTokenGt(String queueToken){
        if(queueToken!=null){
            gt("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 大于等于 &gt;=
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper queueTokenGe(String queueToken){
        if(queueToken!=null){
            ge("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 小于 &lt;
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper queueTokenLt(String queueToken){
        if(queueToken!=null){
            lt("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 小于等于 &lt;=
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper queueTokenLe(String queueToken){
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
    public DevRoomPlayerQueryWrapper queueTokenBetween(String queueTokenStart,String queueTokenEnd){
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
    public DevRoomPlayerQueryWrapper queueTokenNotBetween(String queueTokenStart,String queueTokenEnd){
        if(queueTokenStart!=null && queueTokenEnd!=null){
            notBetween("queue_token",queueTokenStart,queueTokenEnd);
        }
        return this;
     }


    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * LIKE '%值%'
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper queueTokenLike(String queueToken){
        if(queueToken!=null){
            like("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * NOT LIKE '%值%'
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper queueTokenNotLike(String queueToken){
        if(queueToken!=null){
            notLike("queue_token",queueToken);
        }
        return this;
     }


    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * LIKE '%值'
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper queueTokenLikeLeft(String queueToken){
        if(queueToken!=null){
            likeLeft("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * LIKE '值%'
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper queueTokenLikeRight(String queueToken){
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
    public DevRoomPlayerQueryWrapper queueTokenIsNull(){
        isNull("queue_token");
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper queueTokenIsNotNull(){
        isNotNull("queue_token");
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper queueTokenIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper queueTokenIn(String... values){
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
    public DevRoomPlayerQueryWrapper queueTokenNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper queueTokenNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("queue_token",values);
        }
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * 等于 =
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper phoneIdEq(String phoneId){
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * 不等于 &lt;&gt;
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper phoneIdNe(String phoneId){
        if(phoneId!=null){
            ne("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 大于 &gt;
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper phoneIdGt(String phoneId){
        if(phoneId!=null){
            gt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 大于等于 &gt;=
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper phoneIdGe(String phoneId){
        if(phoneId!=null){
            ge("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 小于 &lt;
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper phoneIdLt(String phoneId){
        if(phoneId!=null){
            lt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 小于等于 &lt;=
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper phoneIdLe(String phoneId){
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
    public DevRoomPlayerQueryWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
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
    public DevRoomPlayerQueryWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        if(phoneIdStart!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>玩家设备ID</p>
     * LIKE '%值%'
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper phoneIdLike(String phoneId){
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * NOT LIKE '%值%'
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper phoneIdNotLike(String phoneId){
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
     }


    /**
     * <p>玩家设备ID</p>
     * LIKE '%值'
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper phoneIdLikeLeft(String phoneId){
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * LIKE '值%'
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper phoneIdLikeRight(String phoneId){
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
    public DevRoomPlayerQueryWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper phoneIdIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper phoneIdIn(String... values){
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
    public DevRoomPlayerQueryWrapper phoneIdNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper phoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_id",values);
        }
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * 等于 =
     * @param os       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper osEq(String os){
        if(os!=null){
            eq("os",os);
        }
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * 不等于 &lt;&gt;
     * @param os       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper osNe(String os){
        if(os!=null){
            ne("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 大于 &gt;
     * @param os       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper osGt(String os){
        if(os!=null){
            gt("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 大于等于 &gt;=
     * @param os       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper osGe(String os){
        if(os!=null){
            ge("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 小于 &lt;
     * @param os       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper osLt(String os){
        if(os!=null){
            lt("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 小于等于 &lt;=
     * @param os       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper osLe(String os){
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
    public DevRoomPlayerQueryWrapper osBetween(String osStart,String osEnd){
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
    public DevRoomPlayerQueryWrapper osNotBetween(String osStart,String osEnd){
        if(osStart!=null && osEnd!=null){
            notBetween("os",osStart,osEnd);
        }
        return this;
     }


    /**
     * <p>操作系统（android|ios）</p>
     * LIKE '%值%'
     * @param os       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper osLike(String os){
        if(os!=null){
            like("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * NOT LIKE '%值%'
     * @param os       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper osNotLike(String os){
        if(os!=null){
            notLike("os",os);
        }
        return this;
     }


    /**
     * <p>操作系统（android|ios）</p>
     * LIKE '%值'
     * @param os       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper osLikeLeft(String os){
        if(os!=null){
            likeLeft("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * LIKE '值%'
     * @param os       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper osLikeRight(String os){
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
    public DevRoomPlayerQueryWrapper osIsNull(){
        isNull("os");
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper osIsNotNull(){
        isNotNull("os");
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper osIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper osIn(String... values){
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
    public DevRoomPlayerQueryWrapper osNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper osNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os",values);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 等于 =
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper serverTypeEq(Integer serverType){
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 不等于 &lt;&gt;
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper serverTypeNe(Integer serverType){
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 大于 &gt;
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper serverTypeGt(Integer serverType){
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 大于等于 &gt;=
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper serverTypeGe(Integer serverType){
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 小于 &lt;
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper serverTypeLt(Integer serverType){
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 小于等于 &lt;=
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper serverTypeLe(Integer serverType){
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
    public DevRoomPlayerQueryWrapper serverTypeBetween(Integer serverTypeStart,Integer serverTypeEnd){
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
    public DevRoomPlayerQueryWrapper serverTypeNotBetween(Integer serverTypeStart,Integer serverTypeEnd){
        if(serverTypeStart!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper serverTypeLike(Integer serverType){
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper serverTypeNotLike(Integer serverType){
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值'
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper serverTypeLikeLeft(Integer serverType){
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '值%'
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper serverTypeLikeRight(Integer serverType){
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
    public DevRoomPlayerQueryWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper serverTypeIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryWrapper serverTypeIn(Integer... values){
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
    public DevRoomPlayerQueryWrapper serverTypeNotIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryWrapper serverTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 等于 =
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playerLoginStatusEq(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            eq("player_login_status",playerLoginStatus);
        }
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 不等于 &lt;&gt;
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playerLoginStatusNe(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            ne("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 大于 &gt;
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playerLoginStatusGt(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            gt("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 大于等于 &gt;=
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playerLoginStatusGe(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            ge("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 小于 &lt;
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playerLoginStatusLt(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            lt("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 小于等于 &lt;=
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playerLoginStatusLe(Integer playerLoginStatus){
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
    public DevRoomPlayerQueryWrapper playerLoginStatusBetween(Integer playerLoginStatusStart,Integer playerLoginStatusEnd){
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
    public DevRoomPlayerQueryWrapper playerLoginStatusNotBetween(Integer playerLoginStatusStart,Integer playerLoginStatusEnd){
        if(playerLoginStatusStart!=null && playerLoginStatusEnd!=null){
            notBetween("player_login_status",playerLoginStatusStart,playerLoginStatusEnd);
        }
        return this;
     }


    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * LIKE '%值%'
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playerLoginStatusLike(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            like("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * NOT LIKE '%值%'
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playerLoginStatusNotLike(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            notLike("player_login_status",playerLoginStatus);
        }
        return this;
     }


    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * LIKE '%值'
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playerLoginStatusLikeLeft(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            likeLeft("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * LIKE '值%'
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper playerLoginStatusLikeRight(Integer playerLoginStatus){
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
    public DevRoomPlayerQueryWrapper playerLoginStatusIsNull(){
        isNull("player_login_status");
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper playerLoginStatusIsNotNull(){
        isNotNull("player_login_status");
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper playerLoginStatusIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryWrapper playerLoginStatusIn(Integer... values){
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
    public DevRoomPlayerQueryWrapper playerLoginStatusNotIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryWrapper playerLoginStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("player_login_status",values);
        }
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 等于 =
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper msgReportTypeEq(Integer msgReportType){
        if(msgReportType!=null){
            eq("msg_report_type",msgReportType);
        }
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 不等于 &lt;&gt;
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper msgReportTypeNe(Integer msgReportType){
        if(msgReportType!=null){
            ne("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 大于 &gt;
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper msgReportTypeGt(Integer msgReportType){
        if(msgReportType!=null){
            gt("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 大于等于 &gt;=
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper msgReportTypeGe(Integer msgReportType){
        if(msgReportType!=null){
            ge("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 小于 &lt;
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper msgReportTypeLt(Integer msgReportType){
        if(msgReportType!=null){
            lt("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 小于等于 &lt;=
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper msgReportTypeLe(Integer msgReportType){
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
    public DevRoomPlayerQueryWrapper msgReportTypeBetween(Integer msgReportTypeStart,Integer msgReportTypeEnd){
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
    public DevRoomPlayerQueryWrapper msgReportTypeNotBetween(Integer msgReportTypeStart,Integer msgReportTypeEnd){
        if(msgReportTypeStart!=null && msgReportTypeEnd!=null){
            notBetween("msg_report_type",msgReportTypeStart,msgReportTypeEnd);
        }
        return this;
     }


    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * LIKE '%值%'
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper msgReportTypeLike(Integer msgReportType){
        if(msgReportType!=null){
            like("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * NOT LIKE '%值%'
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper msgReportTypeNotLike(Integer msgReportType){
        if(msgReportType!=null){
            notLike("msg_report_type",msgReportType);
        }
        return this;
     }


    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * LIKE '%值'
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper msgReportTypeLikeLeft(Integer msgReportType){
        if(msgReportType!=null){
            likeLeft("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * LIKE '值%'
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper msgReportTypeLikeRight(Integer msgReportType){
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
    public DevRoomPlayerQueryWrapper msgReportTypeIsNull(){
        isNull("msg_report_type");
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper msgReportTypeIsNotNull(){
        isNotNull("msg_report_type");
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper msgReportTypeIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryWrapper msgReportTypeIn(Integer... values){
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
    public DevRoomPlayerQueryWrapper msgReportTypeNotIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryWrapper msgReportTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("msg_report_type",values);
        }
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 等于 =
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerRoleEq(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            eq("room_player_role",roomPlayerRole);
        }
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 不等于 &lt;&gt;
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerRoleNe(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            ne("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 大于 &gt;
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerRoleGt(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            gt("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 大于等于 &gt;=
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerRoleGe(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            ge("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 小于 &lt;
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerRoleLt(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            lt("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 小于等于 &lt;=
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerRoleLe(Integer roomPlayerRole){
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
    public DevRoomPlayerQueryWrapper roomPlayerRoleBetween(Integer roomPlayerRoleStart,Integer roomPlayerRoleEnd){
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
    public DevRoomPlayerQueryWrapper roomPlayerRoleNotBetween(Integer roomPlayerRoleStart,Integer roomPlayerRoleEnd){
        if(roomPlayerRoleStart!=null && roomPlayerRoleEnd!=null){
            notBetween("room_player_role",roomPlayerRoleStart,roomPlayerRoleEnd);
        }
        return this;
     }


    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * LIKE '%值%'
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerRoleLike(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            like("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * NOT LIKE '%值%'
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerRoleNotLike(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            notLike("room_player_role",roomPlayerRole);
        }
        return this;
     }


    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * LIKE '%值'
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerRoleLikeLeft(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            likeLeft("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * LIKE '值%'
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerRoleLikeRight(Integer roomPlayerRole){
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
    public DevRoomPlayerQueryWrapper roomPlayerRoleIsNull(){
        isNull("room_player_role");
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerRoleIsNotNull(){
        isNotNull("room_player_role");
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomPlayerRoleIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryWrapper roomPlayerRoleIn(Integer... values){
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
    public DevRoomPlayerQueryWrapper roomPlayerRoleNotIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryWrapper roomPlayerRoleNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_player_role",values);
        }
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * 等于 =
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper heirLeaderIdEq(Long heirLeaderId){
        if(heirLeaderId!=null){
            eq("heir_leader_id",heirLeaderId);
        }
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * 不等于 &lt;&gt;
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper heirLeaderIdNe(Long heirLeaderId){
        if(heirLeaderId!=null){
            ne("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 大于 &gt;
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper heirLeaderIdGt(Long heirLeaderId){
        if(heirLeaderId!=null){
            gt("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 大于等于 &gt;=
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper heirLeaderIdGe(Long heirLeaderId){
        if(heirLeaderId!=null){
            ge("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 小于 &lt;
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper heirLeaderIdLt(Long heirLeaderId){
        if(heirLeaderId!=null){
            lt("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 小于等于 &lt;=
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper heirLeaderIdLe(Long heirLeaderId){
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
    public DevRoomPlayerQueryWrapper heirLeaderIdBetween(Long heirLeaderIdStart,Long heirLeaderIdEnd){
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
    public DevRoomPlayerQueryWrapper heirLeaderIdNotBetween(Long heirLeaderIdStart,Long heirLeaderIdEnd){
        if(heirLeaderIdStart!=null && heirLeaderIdEnd!=null){
            notBetween("heir_leader_id",heirLeaderIdStart,heirLeaderIdEnd);
        }
        return this;
     }


    /**
     * <p>房间继承者id</p>
     * LIKE '%值%'
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper heirLeaderIdLike(Long heirLeaderId){
        if(heirLeaderId!=null){
            like("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * NOT LIKE '%值%'
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper heirLeaderIdNotLike(Long heirLeaderId){
        if(heirLeaderId!=null){
            notLike("heir_leader_id",heirLeaderId);
        }
        return this;
     }


    /**
     * <p>房间继承者id</p>
     * LIKE '%值'
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper heirLeaderIdLikeLeft(Long heirLeaderId){
        if(heirLeaderId!=null){
            likeLeft("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * LIKE '值%'
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper heirLeaderIdLikeRight(Long heirLeaderId){
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
    public DevRoomPlayerQueryWrapper heirLeaderIdIsNull(){
        isNull("heir_leader_id");
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper heirLeaderIdIsNotNull(){
        isNotNull("heir_leader_id");
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper heirLeaderIdIn(Collection<Long> value){
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
    public DevRoomPlayerQueryWrapper heirLeaderIdIn(Long... values){
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
    public DevRoomPlayerQueryWrapper heirLeaderIdNotIn(Collection<Long> value){
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
    public DevRoomPlayerQueryWrapper heirLeaderIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("heir_leader_id",values);
        }
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * 等于 =
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fetchTimeEq(Date fetchTime){
        if(fetchTime!=null){
            eq("fetch_time",fetchTime);
        }
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * 不等于 &lt;&gt;
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fetchTimeNe(Date fetchTime){
        if(fetchTime!=null){
            ne("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 大于 &gt;
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fetchTimeGt(Date fetchTime){
        if(fetchTime!=null){
            gt("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 大于等于 &gt;=
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fetchTimeGe(Date fetchTime){
        if(fetchTime!=null){
            ge("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 小于 &lt;
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fetchTimeLt(Date fetchTime){
        if(fetchTime!=null){
            lt("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 小于等于 &lt;=
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fetchTimeLe(Date fetchTime){
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
    public DevRoomPlayerQueryWrapper fetchTimeBetween(Date fetchTimeStart,Date fetchTimeEnd){
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
    public DevRoomPlayerQueryWrapper fetchTimeNotBetween(Date fetchTimeStart,Date fetchTimeEnd){
        if(fetchTimeStart!=null && fetchTimeEnd!=null){
            notBetween("fetch_time",fetchTimeStart,fetchTimeEnd);
        }
        return this;
     }


    /**
     * <p>获取到设备时间</p>
     * LIKE '%值%'
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fetchTimeLike(Date fetchTime){
        if(fetchTime!=null){
            like("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * NOT LIKE '%值%'
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fetchTimeNotLike(Date fetchTime){
        if(fetchTime!=null){
            notLike("fetch_time",fetchTime);
        }
        return this;
     }


    /**
     * <p>获取到设备时间</p>
     * LIKE '%值'
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fetchTimeLikeLeft(Date fetchTime){
        if(fetchTime!=null){
            likeLeft("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * LIKE '值%'
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper fetchTimeLikeRight(Date fetchTime){
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
    public DevRoomPlayerQueryWrapper fetchTimeIsNull(){
        isNull("fetch_time");
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper fetchTimeIsNotNull(){
        isNotNull("fetch_time");
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper fetchTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper fetchTimeIn(Date... values){
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
    public DevRoomPlayerQueryWrapper fetchTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper fetchTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("fetch_time",values);
        }
        return this;
    }

    /**
     * <p>记录时间</p>
     * 等于 =
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper loginTimeEq(Date loginTime){
        if(loginTime!=null){
            eq("login_time",loginTime);
        }
        return this;
    }

    /**
     * <p>记录时间</p>
     * 不等于 &lt;&gt;
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper loginTimeNe(Date loginTime){
        if(loginTime!=null){
            ne("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 大于 &gt;
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper loginTimeGt(Date loginTime){
        if(loginTime!=null){
            gt("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 大于等于 &gt;=
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper loginTimeGe(Date loginTime){
        if(loginTime!=null){
            ge("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 小于 &lt;
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper loginTimeLt(Date loginTime){
        if(loginTime!=null){
            lt("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 小于等于 &lt;=
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper loginTimeLe(Date loginTime){
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
    public DevRoomPlayerQueryWrapper loginTimeBetween(Date loginTimeStart,Date loginTimeEnd){
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
    public DevRoomPlayerQueryWrapper loginTimeNotBetween(Date loginTimeStart,Date loginTimeEnd){
        if(loginTimeStart!=null && loginTimeEnd!=null){
            notBetween("login_time",loginTimeStart,loginTimeEnd);
        }
        return this;
     }


    /**
     * <p>记录时间</p>
     * LIKE '%值%'
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper loginTimeLike(Date loginTime){
        if(loginTime!=null){
            like("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * NOT LIKE '%值%'
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper loginTimeNotLike(Date loginTime){
        if(loginTime!=null){
            notLike("login_time",loginTime);
        }
        return this;
     }


    /**
     * <p>记录时间</p>
     * LIKE '%值'
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper loginTimeLikeLeft(Date loginTime){
        if(loginTime!=null){
            likeLeft("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * LIKE '值%'
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper loginTimeLikeRight(Date loginTime){
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
    public DevRoomPlayerQueryWrapper loginTimeIsNull(){
        isNull("login_time");
        return this;
    }

    /**
     * <p>记录时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper loginTimeIsNotNull(){
        isNotNull("login_time");
        return this;
    }

    /**
     * <p>记录时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper loginTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper loginTimeIn(Date... values){
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
    public DevRoomPlayerQueryWrapper loginTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper loginTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("login_time",values);
        }
        return this;
    }

    /**
     * <p>退出时间</p>
     * 等于 =
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper logoutTimeEq(Date logoutTime){
        if(logoutTime!=null){
            eq("logout_time",logoutTime);
        }
        return this;
    }

    /**
     * <p>退出时间</p>
     * 不等于 &lt;&gt;
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper logoutTimeNe(Date logoutTime){
        if(logoutTime!=null){
            ne("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 大于 &gt;
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper logoutTimeGt(Date logoutTime){
        if(logoutTime!=null){
            gt("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 大于等于 &gt;=
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper logoutTimeGe(Date logoutTime){
        if(logoutTime!=null){
            ge("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 小于 &lt;
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper logoutTimeLt(Date logoutTime){
        if(logoutTime!=null){
            lt("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 小于等于 &lt;=
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper logoutTimeLe(Date logoutTime){
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
    public DevRoomPlayerQueryWrapper logoutTimeBetween(Date logoutTimeStart,Date logoutTimeEnd){
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
    public DevRoomPlayerQueryWrapper logoutTimeNotBetween(Date logoutTimeStart,Date logoutTimeEnd){
        if(logoutTimeStart!=null && logoutTimeEnd!=null){
            notBetween("logout_time",logoutTimeStart,logoutTimeEnd);
        }
        return this;
     }


    /**
     * <p>退出时间</p>
     * LIKE '%值%'
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper logoutTimeLike(Date logoutTime){
        if(logoutTime!=null){
            like("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * NOT LIKE '%值%'
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper logoutTimeNotLike(Date logoutTime){
        if(logoutTime!=null){
            notLike("logout_time",logoutTime);
        }
        return this;
     }


    /**
     * <p>退出时间</p>
     * LIKE '%值'
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper logoutTimeLikeLeft(Date logoutTime){
        if(logoutTime!=null){
            likeLeft("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * LIKE '值%'
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper logoutTimeLikeRight(Date logoutTime){
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
    public DevRoomPlayerQueryWrapper logoutTimeIsNull(){
        isNull("logout_time");
        return this;
    }

    /**
     * <p>退出时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper logoutTimeIsNotNull(){
        isNotNull("logout_time");
        return this;
    }

    /**
     * <p>退出时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper logoutTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper logoutTimeIn(Date... values){
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
    public DevRoomPlayerQueryWrapper logoutTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper logoutTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("logout_time",values);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 等于 =
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idleTimeEq(Date idleTime){
        if(idleTime!=null){
            eq("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 不等于 &lt;&gt;
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idleTimeNe(Date idleTime){
        if(idleTime!=null){
            ne("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 大于 &gt;
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idleTimeGt(Date idleTime){
        if(idleTime!=null){
            gt("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 大于等于 &gt;=
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idleTimeGe(Date idleTime){
        if(idleTime!=null){
            ge("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 小于 &lt;
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idleTimeLt(Date idleTime){
        if(idleTime!=null){
            lt("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 小于等于 &lt;=
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idleTimeLe(Date idleTime){
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
    public DevRoomPlayerQueryWrapper idleTimeBetween(Date idleTimeStart,Date idleTimeEnd){
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
    public DevRoomPlayerQueryWrapper idleTimeNotBetween(Date idleTimeStart,Date idleTimeEnd){
        if(idleTimeStart!=null && idleTimeEnd!=null){
            notBetween("idle_time",idleTimeStart,idleTimeEnd);
        }
        return this;
     }


    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值%'
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idleTimeLike(Date idleTime){
        if(idleTime!=null){
            like("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * NOT LIKE '%值%'
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idleTimeNotLike(Date idleTime){
        if(idleTime!=null){
            notLike("idle_time",idleTime);
        }
        return this;
     }


    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值'
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idleTimeLikeLeft(Date idleTime){
        if(idleTime!=null){
            likeLeft("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * LIKE '值%'
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper idleTimeLikeRight(Date idleTime){
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
    public DevRoomPlayerQueryWrapper idleTimeIsNull(){
        isNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper idleTimeIsNotNull(){
        isNotNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper idleTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper idleTimeIn(Date... values){
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
    public DevRoomPlayerQueryWrapper idleTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper idleTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("idle_time",values);
        }
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * 等于 =
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeEq(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            eq("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * 不等于 &lt;&gt;
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeNe(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            ne("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 大于 &gt;
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeGt(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            gt("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 大于等于 &gt;=
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeGe(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            ge("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 小于 &lt;
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeLt(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            lt("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 小于等于 &lt;=
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeLe(Date clientStreamingStartTime){
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
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeBetween(Date clientStreamingStartTimeStart,Date clientStreamingStartTimeEnd){
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
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeNotBetween(Date clientStreamingStartTimeStart,Date clientStreamingStartTimeEnd){
        if(clientStreamingStartTimeStart!=null && clientStreamingStartTimeEnd!=null){
            notBetween("client_streaming_start_time",clientStreamingStartTimeStart,clientStreamingStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>客户端streaming进入时间</p>
     * LIKE '%值%'
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeLike(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            like("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * NOT LIKE '%值%'
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeNotLike(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            notLike("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }


    /**
     * <p>客户端streaming进入时间</p>
     * LIKE '%值'
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeLikeLeft(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            likeLeft("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * LIKE '值%'
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeLikeRight(Date clientStreamingStartTime){
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
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeIsNull(){
        isNull("client_streaming_start_time");
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeIsNotNull(){
        isNotNull("client_streaming_start_time");
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeIn(Date... values){
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
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper clientStreamingStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("client_streaming_start_time",values);
        }
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * 等于 =
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeEq(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            eq("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * 不等于 &lt;&gt;
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeNe(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            ne("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 大于 &gt;
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeGt(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            gt("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 大于等于 &gt;=
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeGe(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            ge("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 小于 &lt;
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeLt(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            lt("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 小于等于 &lt;=
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeLe(Date clientStreamingEndTime){
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
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeBetween(Date clientStreamingEndTimeStart,Date clientStreamingEndTimeEnd){
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
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeNotBetween(Date clientStreamingEndTimeStart,Date clientStreamingEndTimeEnd){
        if(clientStreamingEndTimeStart!=null && clientStreamingEndTimeEnd!=null){
            notBetween("client_streaming_end_time",clientStreamingEndTimeStart,clientStreamingEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>客户端streaming退出时间</p>
     * LIKE '%值%'
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeLike(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            like("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * NOT LIKE '%值%'
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeNotLike(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            notLike("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }


    /**
     * <p>客户端streaming退出时间</p>
     * LIKE '%值'
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeLikeLeft(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            likeLeft("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * LIKE '值%'
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeLikeRight(Date clientStreamingEndTime){
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
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeIsNull(){
        isNull("client_streaming_end_time");
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeIsNotNull(){
        isNotNull("client_streaming_end_time");
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeIn(Date... values){
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
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryWrapper clientStreamingEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("client_streaming_end_time",values);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper versionIdEq(Long versionId){
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 不等于 &lt;&gt;
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper versionIdNe(Long versionId){
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于 &gt;
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper versionIdGt(Long versionId){
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于等于 &gt;=
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper versionIdGe(Long versionId){
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于 &lt;
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper versionIdLt(Long versionId){
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于等于 &lt;=
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper versionIdLe(Long versionId){
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
    public DevRoomPlayerQueryWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public DevRoomPlayerQueryWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        if(versionIdStart!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper versionIdLike(Long versionId){
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper versionIdNotLike(Long versionId){
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值'
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper versionIdLikeLeft(Long versionId){
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '值%'
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper versionIdLikeRight(Long versionId){
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
    public DevRoomPlayerQueryWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper versionIdIn(Collection<Long> value){
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
    public DevRoomPlayerQueryWrapper versionIdIn(Long... values){
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
    public DevRoomPlayerQueryWrapper versionIdNotIn(Collection<Long> value){
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
    public DevRoomPlayerQueryWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 等于 =
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomTypeEq(Integer roomType){
        if(roomType!=null){
            eq("room_type",roomType);
        }
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 不等于 &lt;&gt;
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomTypeNe(Integer roomType){
        if(roomType!=null){
            ne("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 大于 &gt;
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomTypeGt(Integer roomType){
        if(roomType!=null){
            gt("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 大于等于 &gt;=
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomTypeGe(Integer roomType){
        if(roomType!=null){
            ge("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 小于 &lt;
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomTypeLt(Integer roomType){
        if(roomType!=null){
            lt("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 小于等于 &lt;=
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomTypeLe(Integer roomType){
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
    public DevRoomPlayerQueryWrapper roomTypeBetween(Integer roomTypeStart,Integer roomTypeEnd){
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
    public DevRoomPlayerQueryWrapper roomTypeNotBetween(Integer roomTypeStart,Integer roomTypeEnd){
        if(roomTypeStart!=null && roomTypeEnd!=null){
            notBetween("room_type",roomTypeStart,roomTypeEnd);
        }
        return this;
     }


    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * LIKE '%值%'
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomTypeLike(Integer roomType){
        if(roomType!=null){
            like("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * NOT LIKE '%值%'
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomTypeNotLike(Integer roomType){
        if(roomType!=null){
            notLike("room_type",roomType);
        }
        return this;
     }


    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * LIKE '%值'
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomTypeLikeLeft(Integer roomType){
        if(roomType!=null){
            likeLeft("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * LIKE '值%'
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomTypeLikeRight(Integer roomType){
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
    public DevRoomPlayerQueryWrapper roomTypeIsNull(){
        isNull("room_type");
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomTypeIsNotNull(){
        isNotNull("room_type");
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper roomTypeIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryWrapper roomTypeIn(Integer... values){
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
    public DevRoomPlayerQueryWrapper roomTypeNotIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryWrapper roomTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_type",values);
        }
        return this;
    }

    /**
     * <p>游族game_id</p>
     * 等于 =
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper gameIdEq(Integer gameId){
        if(gameId!=null){
            eq("game_id",gameId);
        }
        return this;
    }

    /**
     * <p>游族game_id</p>
     * 不等于 &lt;&gt;
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper gameIdNe(Integer gameId){
        if(gameId!=null){
            ne("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 大于 &gt;
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper gameIdGt(Integer gameId){
        if(gameId!=null){
            gt("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 大于等于 &gt;=
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper gameIdGe(Integer gameId){
        if(gameId!=null){
            ge("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 小于 &lt;
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper gameIdLt(Integer gameId){
        if(gameId!=null){
            lt("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 小于等于 &lt;=
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper gameIdLe(Integer gameId){
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
    public DevRoomPlayerQueryWrapper gameIdBetween(Integer gameIdStart,Integer gameIdEnd){
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
    public DevRoomPlayerQueryWrapper gameIdNotBetween(Integer gameIdStart,Integer gameIdEnd){
        if(gameIdStart!=null && gameIdEnd!=null){
            notBetween("game_id",gameIdStart,gameIdEnd);
        }
        return this;
     }


    /**
     * <p>游族game_id</p>
     * LIKE '%值%'
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper gameIdLike(Integer gameId){
        if(gameId!=null){
            like("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * NOT LIKE '%值%'
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper gameIdNotLike(Integer gameId){
        if(gameId!=null){
            notLike("game_id",gameId);
        }
        return this;
     }


    /**
     * <p>游族game_id</p>
     * LIKE '%值'
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper gameIdLikeLeft(Integer gameId){
        if(gameId!=null){
            likeLeft("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * LIKE '值%'
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper gameIdLikeRight(Integer gameId){
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
    public DevRoomPlayerQueryWrapper gameIdIsNull(){
        isNull("game_id");
        return this;
    }

    /**
     * <p>游族game_id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper gameIdIsNotNull(){
        isNotNull("game_id");
        return this;
    }

    /**
     * <p>游族game_id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper gameIdIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryWrapper gameIdIn(Integer... values){
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
    public DevRoomPlayerQueryWrapper gameIdNotIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryWrapper gameIdNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("game_id",values);
        }
        return this;
    }

    /**
     * <p>游族session_id</p>
     * 等于 =
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper sessionIdEq(String sessionId){
        if(sessionId!=null){
            eq("session_id",sessionId);
        }
        return this;
    }

    /**
     * <p>游族session_id</p>
     * 不等于 &lt;&gt;
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper sessionIdNe(String sessionId){
        if(sessionId!=null){
            ne("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 大于 &gt;
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper sessionIdGt(String sessionId){
        if(sessionId!=null){
            gt("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 大于等于 &gt;=
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper sessionIdGe(String sessionId){
        if(sessionId!=null){
            ge("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 小于 &lt;
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper sessionIdLt(String sessionId){
        if(sessionId!=null){
            lt("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 小于等于 &lt;=
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper sessionIdLe(String sessionId){
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
    public DevRoomPlayerQueryWrapper sessionIdBetween(String sessionIdStart,String sessionIdEnd){
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
    public DevRoomPlayerQueryWrapper sessionIdNotBetween(String sessionIdStart,String sessionIdEnd){
        if(sessionIdStart!=null && sessionIdEnd!=null){
            notBetween("session_id",sessionIdStart,sessionIdEnd);
        }
        return this;
     }


    /**
     * <p>游族session_id</p>
     * LIKE '%值%'
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper sessionIdLike(String sessionId){
        if(sessionId!=null){
            like("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * NOT LIKE '%值%'
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper sessionIdNotLike(String sessionId){
        if(sessionId!=null){
            notLike("session_id",sessionId);
        }
        return this;
     }


    /**
     * <p>游族session_id</p>
     * LIKE '%值'
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper sessionIdLikeLeft(String sessionId){
        if(sessionId!=null){
            likeLeft("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * LIKE '值%'
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerQueryWrapper sessionIdLikeRight(String sessionId){
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
    public DevRoomPlayerQueryWrapper sessionIdIsNull(){
        isNull("session_id");
        return this;
    }

    /**
     * <p>游族session_id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryWrapper sessionIdIsNotNull(){
        isNotNull("session_id");
        return this;
    }

    /**
     * <p>游族session_id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryWrapper sessionIdIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper sessionIdIn(String... values){
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
    public DevRoomPlayerQueryWrapper sessionIdNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryWrapper sessionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("session_id",values);
        }
        return this;
    }


}
