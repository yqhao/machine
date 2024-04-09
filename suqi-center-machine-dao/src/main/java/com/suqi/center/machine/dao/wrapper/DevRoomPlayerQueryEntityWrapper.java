package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.DevRoomPlayer;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 设备房间成员记录表（dev_room_player）
 * </p>
 * "dev_room_player"
 * @author PC001
 */
public class DevRoomPlayerQueryEntityWrapper extends QueryWrapper<DevRoomPlayer> {

    public static DevRoomPlayerQueryEntityWrapper wrapper(DevRoomPlayer entity) {
        return new DevRoomPlayerQueryEntityWrapper(entity);
    }

    private DevRoomPlayer entity;

    public DevRoomPlayerQueryEntityWrapper(DevRoomPlayer entity) {
         this.entity=entity;
    }


    protected DevRoomPlayer entity() {
        if(entity==null){
            throw new NullPointerException("DevRoomPlayer is null");
        }
        return entity;
    }

    @Override
    public DevRoomPlayerQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public DevRoomPlayerQueryEntityWrapper selectColumns(Consumer<DevRoomPlayerSelect> consumer) {
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
     * 等于 = entity().getId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>房间成员记录</p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>房间成员记录</p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idEq(Long id){
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
    public DevRoomPlayerQueryEntityWrapper idNe(Long id){
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
    public DevRoomPlayerQueryEntityWrapper idGt(Long id){
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
    public DevRoomPlayerQueryEntityWrapper idGe(Long id){
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
    public DevRoomPlayerQueryEntityWrapper idLt(Long id){
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
    public DevRoomPlayerQueryEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>房间成员记录</p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idLike(Long id){
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
    public DevRoomPlayerQueryEntityWrapper idNotLike(Long id){
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
    public DevRoomPlayerQueryEntityWrapper idLikeLeft(Long id){
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
    public DevRoomPlayerQueryEntityWrapper idLikeRight(Long id){
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
    public DevRoomPlayerQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>房间成员记录</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idIn(Collection<Long> value){
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
    public DevRoomPlayerQueryEntityWrapper idIn(Long... values){
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
    public DevRoomPlayerQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public DevRoomPlayerQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>用户设备表id</p>
     * 等于 = entity().getFkMemberDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdEq(){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null){
            eq("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * 不等于 &lt;&gt; entity().getFkMemberDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdNe(){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null){
            ne("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 大于 &gt; entity().getFkMemberDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdGt(){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null){
            gt("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 大于等于 &gt;= entity().getFkMemberDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdGe(){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null){
            ge("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 小于 &lt; entity().getFkMemberDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdLt(){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null){
            lt("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 小于等于 &lt;= entity().getFkMemberDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdLe(){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null){
            le("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * BETWEEN  entity().getFkMemberDeviceId() AND fkMemberDeviceIdEnd
     * @param fkMemberDeviceIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdBetween(Long fkMemberDeviceIdEnd){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null && fkMemberDeviceIdEnd!=null){
            between("fk_member_device_id",fkMemberDeviceId,fkMemberDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * NOT BETWEEN  entity().getFkMemberDeviceId() AND 值2
     * @param fkMemberDeviceIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdNotBetween(Long fkMemberDeviceIdEnd){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null && fkMemberDeviceIdEnd!=null){
            notBetween("fk_member_device_id",fkMemberDeviceId,fkMemberDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * BETWEEN  entity().getFkMemberDeviceId() AND 值2
     * @param fkMemberDeviceIdStart       值1
     * @param fkMemberDeviceIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdBetween(Long fkMemberDeviceIdStart,Long fkMemberDeviceIdEnd){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null && fkMemberDeviceIdEnd!=null){
            between("fk_member_device_id",fkMemberDeviceIdStart,fkMemberDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * NOT BETWEEN  entity().getFkMemberDeviceId() AND 值2
     * @param fkMemberDeviceIdStart       值1
     * @param fkMemberDeviceIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdNotBetween(Long fkMemberDeviceIdStart,Long fkMemberDeviceIdEnd){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null && fkMemberDeviceIdEnd!=null){
            notBetween("fk_member_device_id",fkMemberDeviceIdStart,fkMemberDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>用户设备表id</p>
     * LIKE '%值%'  entity().getFkMemberDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdLike(){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null){
            like("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * NOT LIKE '%值%'  entity().getFkMemberDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdNotLike(){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null){
            notLike("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }


    /**
     * <p>用户设备表id</p>
     * LIKE '%值'  entity().getFkMemberDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdLikeLeft(){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null){
            likeLeft("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * LIKE '值%'  entity().getFkMemberDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdLikeRight(){
        Long fkMemberDeviceId =entity().getFkMemberDeviceId();
        if(fkMemberDeviceId!=null){
            likeRight("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * 等于 =
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdEq(Long fkMemberDeviceId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdNe(Long fkMemberDeviceId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdGt(Long fkMemberDeviceId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdGe(Long fkMemberDeviceId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdLt(Long fkMemberDeviceId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdLe(Long fkMemberDeviceId){
        if(fkMemberDeviceId!=null){
            le("fk_member_device_id",fkMemberDeviceId);
        }
        return this;
     }

    /**
     * <p>用户设备表id</p>
     * LIKE '%值%'
     * @param fkMemberDeviceId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdLike(Long fkMemberDeviceId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdNotLike(Long fkMemberDeviceId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdLikeLeft(Long fkMemberDeviceId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdLikeRight(Long fkMemberDeviceId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdIsNull(){
        isNull("fk_member_device_id");
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdIsNotNull(){
        isNotNull("fk_member_device_id");
        return this;
    }

    /**
     * <p>用户设备表id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdIn(Collection<Long> value){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdIn(Long... values){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdNotIn(Collection<Long> value){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberDeviceIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_device_id",values);
        }
        return this;
    }


    /**
     * <p>用户id</p>
     * 等于 = entity().getFkMemberId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdEq(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            eq("fk_member_id",fkMemberId);
        }
        return this;
    }

    /**
     * <p>用户id</p>
     * 不等于 &lt;&gt; entity().getFkMemberId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdNe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            ne("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 大于 &gt; entity().getFkMemberId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdGt(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            gt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 大于等于 &gt;= entity().getFkMemberId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdGe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            ge("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 小于 &lt; entity().getFkMemberId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdLt(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            lt("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 小于等于 &lt;= entity().getFkMemberId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdLe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * BETWEEN  entity().getFkMemberId() AND fkMemberIdEnd
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdBetween(Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberId,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * NOT BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdNotBetween(Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberId,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            between("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * NOT BETWEEN  entity().getFkMemberId() AND 值2
     * @param fkMemberIdStart       值1
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>用户id</p>
     * LIKE '%值%'  entity().getFkMemberId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * NOT LIKE '%值%'  entity().getFkMemberId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdNotLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>用户id</p>
     * LIKE '%值'  entity().getFkMemberId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdLikeLeft(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * LIKE '值%'  entity().getFkMemberId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdLikeRight(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeRight("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * 等于 =
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdEq(Long fkMemberId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberIdNe(Long fkMemberId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberIdGt(Long fkMemberId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberIdGe(Long fkMemberId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberIdLt(Long fkMemberId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberIdLe(Long fkMemberId){
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>用户id</p>
     * LIKE '%值%'
     * @param fkMemberId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdLike(Long fkMemberId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberIdNotLike(Long fkMemberId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberIdLikeLeft(Long fkMemberId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fkMemberIdIn(Collection<Long> value){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberIdIn(Long... values){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public DevRoomPlayerQueryEntityWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }


    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper deviceIdEq(){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdNe(){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdGt(){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdGe(){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdLt(){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdLe(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            le("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * BETWEEN  entity().getDeviceId() AND deviceIdEnd
     * @param deviceIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null && deviceIdEnd!=null){
            notBetween("device_id",deviceIdStart,deviceIdEnd);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值%'  entity().getDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper deviceIdLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            like("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * NOT LIKE '%值%'  entity().getDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper deviceIdNotLike(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            notLike("device_id",deviceId);
        }
        return this;
     }


    /**
     * <p>设备唯一码</p>
     * LIKE '%值'  entity().getDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper deviceIdLikeLeft(){
        String deviceId =entity().getDeviceId();
        if(deviceId!=null){
            likeLeft("device_id",deviceId);
        }
        return this;
     }

    /**
     * <p>设备唯一码</p>
     * LIKE '值%'  entity().getDeviceId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper deviceIdLikeRight(){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdEq(String deviceId){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdNe(String deviceId){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdGt(String deviceId){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdGe(String deviceId){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdLt(String deviceId){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdLe(String deviceId){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdLike(String deviceId){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdNotLike(String deviceId){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdLikeRight(String deviceId){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper deviceIdIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdIn(String... values){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }


    /**
     * <p>应用包名</p>
     * 等于 = entity().getPkg()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper pkgEq(){
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
    public DevRoomPlayerQueryEntityWrapper pkgNe(){
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
    public DevRoomPlayerQueryEntityWrapper pkgGt(){
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
    public DevRoomPlayerQueryEntityWrapper pkgGe(){
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
    public DevRoomPlayerQueryEntityWrapper pkgLt(){
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
    public DevRoomPlayerQueryEntityWrapper pkgLe(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            le("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * BETWEEN  entity().getPkg() AND pkgEnd
     * @param pkgEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper pkgBetween(String pkgEnd){
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
    public DevRoomPlayerQueryEntityWrapper pkgNotBetween(String pkgEnd){
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
    public DevRoomPlayerQueryEntityWrapper pkgBetween(String pkgStart,String pkgEnd){
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
    public DevRoomPlayerQueryEntityWrapper pkgNotBetween(String pkgStart,String pkgEnd){
        String pkg =entity().getPkg();
        if(pkg!=null && pkgEnd!=null){
            notBetween("pkg",pkgStart,pkgEnd);
        }
        return this;
     }


    /**
     * <p>应用包名</p>
     * LIKE '%值%'  entity().getPkg()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper pkgLike(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            like("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * NOT LIKE '%值%'  entity().getPkg()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper pkgNotLike(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            notLike("pkg",pkg);
        }
        return this;
     }


    /**
     * <p>应用包名</p>
     * LIKE '%值'  entity().getPkg()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper pkgLikeLeft(){
        String pkg =entity().getPkg();
        if(pkg!=null){
            likeLeft("pkg",pkg);
        }
        return this;
     }

    /**
     * <p>应用包名</p>
     * LIKE '值%'  entity().getPkg()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper pkgLikeRight(){
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
    public DevRoomPlayerQueryEntityWrapper pkgEq(String pkg){
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
    public DevRoomPlayerQueryEntityWrapper pkgNe(String pkg){
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
    public DevRoomPlayerQueryEntityWrapper pkgGt(String pkg){
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
    public DevRoomPlayerQueryEntityWrapper pkgGe(String pkg){
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
    public DevRoomPlayerQueryEntityWrapper pkgLt(String pkg){
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
    public DevRoomPlayerQueryEntityWrapper pkgLe(String pkg){
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
    public DevRoomPlayerQueryEntityWrapper pkgLike(String pkg){
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
    public DevRoomPlayerQueryEntityWrapper pkgNotLike(String pkg){
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
    public DevRoomPlayerQueryEntityWrapper pkgLikeLeft(String pkg){
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
    public DevRoomPlayerQueryEntityWrapper pkgLikeRight(String pkg){
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
    public DevRoomPlayerQueryEntityWrapper pkgIsNull(){
        isNull("pkg");
        return this;
    }

    /**
     * <p>应用包名</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper pkgIsNotNull(){
        isNotNull("pkg");
        return this;
    }

    /**
     * <p>应用包名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper pkgIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper pkgIn(String... values){
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
    public DevRoomPlayerQueryEntityWrapper pkgNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper pkgNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("pkg",values);
        }
        return this;
    }


    /**
     * <p>位置信息</p>
     * 等于 = entity().getPosition()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionEq(){
        String position =entity().getPosition();
        if(position!=null){
            eq("position",position);
        }
        return this;
    }

    /**
     * <p>位置信息</p>
     * 不等于 &lt;&gt; entity().getPosition()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionNe(){
        String position =entity().getPosition();
        if(position!=null){
            ne("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 大于 &gt; entity().getPosition()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionGt(){
        String position =entity().getPosition();
        if(position!=null){
            gt("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 大于等于 &gt;= entity().getPosition()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionGe(){
        String position =entity().getPosition();
        if(position!=null){
            ge("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 小于 &lt; entity().getPosition()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionLt(){
        String position =entity().getPosition();
        if(position!=null){
            lt("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 小于等于 &lt;= entity().getPosition()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionLe(){
        String position =entity().getPosition();
        if(position!=null){
            le("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * BETWEEN  entity().getPosition() AND positionEnd
     * @param positionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionBetween(String positionEnd){
        String position =entity().getPosition();
        if(position!=null && positionEnd!=null){
            between("position",position,positionEnd);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * NOT BETWEEN  entity().getPosition() AND 值2
     * @param positionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionNotBetween(String positionEnd){
        String position =entity().getPosition();
        if(position!=null && positionEnd!=null){
            notBetween("position",position,positionEnd);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * BETWEEN  entity().getPosition() AND 值2
     * @param positionStart       值1
     * @param positionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionBetween(String positionStart,String positionEnd){
        String position =entity().getPosition();
        if(position!=null && positionEnd!=null){
            between("position",positionStart,positionEnd);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * NOT BETWEEN  entity().getPosition() AND 值2
     * @param positionStart       值1
     * @param positionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionNotBetween(String positionStart,String positionEnd){
        String position =entity().getPosition();
        if(position!=null && positionEnd!=null){
            notBetween("position",positionStart,positionEnd);
        }
        return this;
     }


    /**
     * <p>位置信息</p>
     * LIKE '%值%'  entity().getPosition()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionLike(){
        String position =entity().getPosition();
        if(position!=null){
            like("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * NOT LIKE '%值%'  entity().getPosition()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionNotLike(){
        String position =entity().getPosition();
        if(position!=null){
            notLike("position",position);
        }
        return this;
     }


    /**
     * <p>位置信息</p>
     * LIKE '%值'  entity().getPosition()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionLikeLeft(){
        String position =entity().getPosition();
        if(position!=null){
            likeLeft("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * LIKE '值%'  entity().getPosition()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionLikeRight(){
        String position =entity().getPosition();
        if(position!=null){
            likeRight("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * 等于 =
     * @param position       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionEq(String position){
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
    public DevRoomPlayerQueryEntityWrapper positionNe(String position){
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
    public DevRoomPlayerQueryEntityWrapper positionGt(String position){
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
    public DevRoomPlayerQueryEntityWrapper positionGe(String position){
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
    public DevRoomPlayerQueryEntityWrapper positionLt(String position){
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
    public DevRoomPlayerQueryEntityWrapper positionLe(String position){
        if(position!=null){
            le("position",position);
        }
        return this;
     }

    /**
     * <p>位置信息</p>
     * LIKE '%值%'
     * @param position       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionLike(String position){
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
    public DevRoomPlayerQueryEntityWrapper positionNotLike(String position){
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
    public DevRoomPlayerQueryEntityWrapper positionLikeLeft(String position){
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
    public DevRoomPlayerQueryEntityWrapper positionLikeRight(String position){
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
    public DevRoomPlayerQueryEntityWrapper positionIsNull(){
        isNull("position");
        return this;
    }

    /**
     * <p>位置信息</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionIsNotNull(){
        isNotNull("position");
        return this;
    }

    /**
     * <p>位置信息</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper positionIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper positionIn(String... values){
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
    public DevRoomPlayerQueryEntityWrapper positionNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper positionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("position",values);
        }
        return this;
    }


    /**
     * <p>房间session</p>
     * 等于 = entity().getRoomSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomSessionEq(){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionNe(){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionGt(){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionGe(){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionLt(){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionLe(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            le("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * BETWEEN  entity().getRoomSession() AND roomSessionEnd
     * @param roomSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomSessionBetween(String roomSessionEnd){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionNotBetween(String roomSessionEnd){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionBetween(String roomSessionStart,String roomSessionEnd){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionNotBetween(String roomSessionStart,String roomSessionEnd){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null && roomSessionEnd!=null){
            notBetween("room_session",roomSessionStart,roomSessionEnd);
        }
        return this;
     }


    /**
     * <p>房间session</p>
     * LIKE '%值%'  entity().getRoomSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomSessionLike(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            like("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * NOT LIKE '%值%'  entity().getRoomSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomSessionNotLike(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            notLike("room_session",roomSession);
        }
        return this;
     }


    /**
     * <p>房间session</p>
     * LIKE '%值'  entity().getRoomSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomSessionLikeLeft(){
        String roomSession =entity().getRoomSession();
        if(roomSession!=null){
            likeLeft("room_session",roomSession);
        }
        return this;
     }

    /**
     * <p>房间session</p>
     * LIKE '值%'  entity().getRoomSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomSessionLikeRight(){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionEq(String roomSession){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionNe(String roomSession){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionGt(String roomSession){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionGe(String roomSession){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionLt(String roomSession){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionLe(String roomSession){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionLike(String roomSession){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionNotLike(String roomSession){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionLikeLeft(String roomSession){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionLikeRight(String roomSession){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionIsNull(){
        isNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomSessionIsNotNull(){
        isNotNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomSessionIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionIn(String... values){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper roomSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_session",values);
        }
        return this;
    }


    /**
     * <p>房间分享session</p>
     * 等于 = entity().getRoomShareSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionEq(){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null){
            eq("room_share_session",roomShareSession);
        }
        return this;
    }

    /**
     * <p>房间分享session</p>
     * 不等于 &lt;&gt; entity().getRoomShareSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionNe(){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null){
            ne("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 大于 &gt; entity().getRoomShareSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionGt(){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null){
            gt("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 大于等于 &gt;= entity().getRoomShareSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionGe(){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null){
            ge("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 小于 &lt; entity().getRoomShareSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionLt(){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null){
            lt("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 小于等于 &lt;= entity().getRoomShareSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionLe(){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null){
            le("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * BETWEEN  entity().getRoomShareSession() AND roomShareSessionEnd
     * @param roomShareSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionBetween(String roomShareSessionEnd){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null && roomShareSessionEnd!=null){
            between("room_share_session",roomShareSession,roomShareSessionEnd);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * NOT BETWEEN  entity().getRoomShareSession() AND 值2
     * @param roomShareSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionNotBetween(String roomShareSessionEnd){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null && roomShareSessionEnd!=null){
            notBetween("room_share_session",roomShareSession,roomShareSessionEnd);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * BETWEEN  entity().getRoomShareSession() AND 值2
     * @param roomShareSessionStart       值1
     * @param roomShareSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionBetween(String roomShareSessionStart,String roomShareSessionEnd){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null && roomShareSessionEnd!=null){
            between("room_share_session",roomShareSessionStart,roomShareSessionEnd);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * NOT BETWEEN  entity().getRoomShareSession() AND 值2
     * @param roomShareSessionStart       值1
     * @param roomShareSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionNotBetween(String roomShareSessionStart,String roomShareSessionEnd){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null && roomShareSessionEnd!=null){
            notBetween("room_share_session",roomShareSessionStart,roomShareSessionEnd);
        }
        return this;
     }


    /**
     * <p>房间分享session</p>
     * LIKE '%值%'  entity().getRoomShareSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionLike(){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null){
            like("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * NOT LIKE '%值%'  entity().getRoomShareSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionNotLike(){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null){
            notLike("room_share_session",roomShareSession);
        }
        return this;
     }


    /**
     * <p>房间分享session</p>
     * LIKE '%值'  entity().getRoomShareSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionLikeLeft(){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null){
            likeLeft("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * LIKE '值%'  entity().getRoomShareSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionLikeRight(){
        String roomShareSession =entity().getRoomShareSession();
        if(roomShareSession!=null){
            likeRight("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * 等于 =
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionEq(String roomShareSession){
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
    public DevRoomPlayerQueryEntityWrapper roomShareSessionNe(String roomShareSession){
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
    public DevRoomPlayerQueryEntityWrapper roomShareSessionGt(String roomShareSession){
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
    public DevRoomPlayerQueryEntityWrapper roomShareSessionGe(String roomShareSession){
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
    public DevRoomPlayerQueryEntityWrapper roomShareSessionLt(String roomShareSession){
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
    public DevRoomPlayerQueryEntityWrapper roomShareSessionLe(String roomShareSession){
        if(roomShareSession!=null){
            le("room_share_session",roomShareSession);
        }
        return this;
     }

    /**
     * <p>房间分享session</p>
     * LIKE '%值%'
     * @param roomShareSession       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionLike(String roomShareSession){
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
    public DevRoomPlayerQueryEntityWrapper roomShareSessionNotLike(String roomShareSession){
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
    public DevRoomPlayerQueryEntityWrapper roomShareSessionLikeLeft(String roomShareSession){
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
    public DevRoomPlayerQueryEntityWrapper roomShareSessionLikeRight(String roomShareSession){
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
    public DevRoomPlayerQueryEntityWrapper roomShareSessionIsNull(){
        isNull("room_share_session");
        return this;
    }

    /**
     * <p>房间分享session</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionIsNotNull(){
        isNotNull("room_share_session");
        return this;
    }

    /**
     * <p>房间分享session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomShareSessionIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper roomShareSessionIn(String... values){
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
    public DevRoomPlayerQueryEntityWrapper roomShareSessionNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper roomShareSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_share_session",values);
        }
        return this;
    }


    /**
     * <p>玩家session</p>
     * 等于 = entity().getRoomPlayerSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionEq(){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null){
            eq("room_player_session",roomPlayerSession);
        }
        return this;
    }

    /**
     * <p>玩家session</p>
     * 不等于 &lt;&gt; entity().getRoomPlayerSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionNe(){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null){
            ne("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 大于 &gt; entity().getRoomPlayerSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionGt(){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null){
            gt("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 大于等于 &gt;= entity().getRoomPlayerSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionGe(){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null){
            ge("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 小于 &lt; entity().getRoomPlayerSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionLt(){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null){
            lt("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 小于等于 &lt;= entity().getRoomPlayerSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionLe(){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null){
            le("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * BETWEEN  entity().getRoomPlayerSession() AND roomPlayerSessionEnd
     * @param roomPlayerSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionBetween(String roomPlayerSessionEnd){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null && roomPlayerSessionEnd!=null){
            between("room_player_session",roomPlayerSession,roomPlayerSessionEnd);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * NOT BETWEEN  entity().getRoomPlayerSession() AND 值2
     * @param roomPlayerSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionNotBetween(String roomPlayerSessionEnd){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null && roomPlayerSessionEnd!=null){
            notBetween("room_player_session",roomPlayerSession,roomPlayerSessionEnd);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * BETWEEN  entity().getRoomPlayerSession() AND 值2
     * @param roomPlayerSessionStart       值1
     * @param roomPlayerSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionBetween(String roomPlayerSessionStart,String roomPlayerSessionEnd){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null && roomPlayerSessionEnd!=null){
            between("room_player_session",roomPlayerSessionStart,roomPlayerSessionEnd);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * NOT BETWEEN  entity().getRoomPlayerSession() AND 值2
     * @param roomPlayerSessionStart       值1
     * @param roomPlayerSessionEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionNotBetween(String roomPlayerSessionStart,String roomPlayerSessionEnd){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null && roomPlayerSessionEnd!=null){
            notBetween("room_player_session",roomPlayerSessionStart,roomPlayerSessionEnd);
        }
        return this;
     }


    /**
     * <p>玩家session</p>
     * LIKE '%值%'  entity().getRoomPlayerSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionLike(){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null){
            like("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * NOT LIKE '%值%'  entity().getRoomPlayerSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionNotLike(){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null){
            notLike("room_player_session",roomPlayerSession);
        }
        return this;
     }


    /**
     * <p>玩家session</p>
     * LIKE '%值'  entity().getRoomPlayerSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionLikeLeft(){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null){
            likeLeft("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * LIKE '值%'  entity().getRoomPlayerSession()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionLikeRight(){
        String roomPlayerSession =entity().getRoomPlayerSession();
        if(roomPlayerSession!=null){
            likeRight("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * 等于 =
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionEq(String roomPlayerSession){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionNe(String roomPlayerSession){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionGt(String roomPlayerSession){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionGe(String roomPlayerSession){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionLt(String roomPlayerSession){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionLe(String roomPlayerSession){
        if(roomPlayerSession!=null){
            le("room_player_session",roomPlayerSession);
        }
        return this;
     }

    /**
     * <p>玩家session</p>
     * LIKE '%值%'
     * @param roomPlayerSession       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionLike(String roomPlayerSession){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionNotLike(String roomPlayerSession){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionLikeLeft(String roomPlayerSession){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionLikeRight(String roomPlayerSession){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionIsNull(){
        isNull("room_player_session");
        return this;
    }

    /**
     * <p>玩家session</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionIsNotNull(){
        isNotNull("room_player_session");
        return this;
    }

    /**
     * <p>玩家session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionIn(String... values){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_player_session",values);
        }
        return this;
    }


    /**
     * <p>玩家session到期时间</p>
     * 等于 = entity().getPlaySessionExpireTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeEq(){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null){
            eq("play_session_expire_time",playSessionExpireTime);
        }
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * 不等于 &lt;&gt; entity().getPlaySessionExpireTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeNe(){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null){
            ne("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 大于 &gt; entity().getPlaySessionExpireTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeGt(){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null){
            gt("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 大于等于 &gt;= entity().getPlaySessionExpireTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeGe(){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null){
            ge("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 小于 &lt; entity().getPlaySessionExpireTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeLt(){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null){
            lt("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 小于等于 &lt;= entity().getPlaySessionExpireTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeLe(){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null){
            le("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * BETWEEN  entity().getPlaySessionExpireTime() AND playSessionExpireTimeEnd
     * @param playSessionExpireTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeBetween(Date playSessionExpireTimeEnd){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null && playSessionExpireTimeEnd!=null){
            between("play_session_expire_time",playSessionExpireTime,playSessionExpireTimeEnd);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * NOT BETWEEN  entity().getPlaySessionExpireTime() AND 值2
     * @param playSessionExpireTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeNotBetween(Date playSessionExpireTimeEnd){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null && playSessionExpireTimeEnd!=null){
            notBetween("play_session_expire_time",playSessionExpireTime,playSessionExpireTimeEnd);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * BETWEEN  entity().getPlaySessionExpireTime() AND 值2
     * @param playSessionExpireTimeStart       值1
     * @param playSessionExpireTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeBetween(Date playSessionExpireTimeStart,Date playSessionExpireTimeEnd){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null && playSessionExpireTimeEnd!=null){
            between("play_session_expire_time",playSessionExpireTimeStart,playSessionExpireTimeEnd);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * NOT BETWEEN  entity().getPlaySessionExpireTime() AND 值2
     * @param playSessionExpireTimeStart       值1
     * @param playSessionExpireTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeNotBetween(Date playSessionExpireTimeStart,Date playSessionExpireTimeEnd){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null && playSessionExpireTimeEnd!=null){
            notBetween("play_session_expire_time",playSessionExpireTimeStart,playSessionExpireTimeEnd);
        }
        return this;
     }


    /**
     * <p>玩家session到期时间</p>
     * LIKE '%值%'  entity().getPlaySessionExpireTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeLike(){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null){
            like("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * NOT LIKE '%值%'  entity().getPlaySessionExpireTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeNotLike(){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null){
            notLike("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }


    /**
     * <p>玩家session到期时间</p>
     * LIKE '%值'  entity().getPlaySessionExpireTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeLikeLeft(){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null){
            likeLeft("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * LIKE '值%'  entity().getPlaySessionExpireTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeLikeRight(){
        Date playSessionExpireTime =entity().getPlaySessionExpireTime();
        if(playSessionExpireTime!=null){
            likeRight("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * 等于 =
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeEq(Date playSessionExpireTime){
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
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeNe(Date playSessionExpireTime){
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
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeGt(Date playSessionExpireTime){
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
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeGe(Date playSessionExpireTime){
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
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeLt(Date playSessionExpireTime){
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
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeLe(Date playSessionExpireTime){
        if(playSessionExpireTime!=null){
            le("play_session_expire_time",playSessionExpireTime);
        }
        return this;
     }

    /**
     * <p>玩家session到期时间</p>
     * LIKE '%值%'
     * @param playSessionExpireTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeLike(Date playSessionExpireTime){
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
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeNotLike(Date playSessionExpireTime){
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
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeLikeLeft(Date playSessionExpireTime){
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
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeLikeRight(Date playSessionExpireTime){
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
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeIsNull(){
        isNull("play_session_expire_time");
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeIsNotNull(){
        isNotNull("play_session_expire_time");
        return this;
    }

    /**
     * <p>玩家session到期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeIn(Date... values){
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
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper playSessionExpireTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("play_session_expire_time",values);
        }
        return this;
    }


    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 等于 = entity().getQueueToken()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenEq(){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null){
            eq("queue_token",queueToken);
        }
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 不等于 &lt;&gt; entity().getQueueToken()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenNe(){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null){
            ne("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 大于 &gt; entity().getQueueToken()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenGt(){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null){
            gt("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 大于等于 &gt;= entity().getQueueToken()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenGe(){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null){
            ge("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 小于 &lt; entity().getQueueToken()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenLt(){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null){
            lt("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 小于等于 &lt;= entity().getQueueToken()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenLe(){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null){
            le("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * BETWEEN  entity().getQueueToken() AND queueTokenEnd
     * @param queueTokenEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenBetween(String queueTokenEnd){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null && queueTokenEnd!=null){
            between("queue_token",queueToken,queueTokenEnd);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * NOT BETWEEN  entity().getQueueToken() AND 值2
     * @param queueTokenEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenNotBetween(String queueTokenEnd){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null && queueTokenEnd!=null){
            notBetween("queue_token",queueToken,queueTokenEnd);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * BETWEEN  entity().getQueueToken() AND 值2
     * @param queueTokenStart       值1
     * @param queueTokenEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenBetween(String queueTokenStart,String queueTokenEnd){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null && queueTokenEnd!=null){
            between("queue_token",queueTokenStart,queueTokenEnd);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * NOT BETWEEN  entity().getQueueToken() AND 值2
     * @param queueTokenStart       值1
     * @param queueTokenEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenNotBetween(String queueTokenStart,String queueTokenEnd){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null && queueTokenEnd!=null){
            notBetween("queue_token",queueTokenStart,queueTokenEnd);
        }
        return this;
     }


    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * LIKE '%值%'  entity().getQueueToken()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenLike(){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null){
            like("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * NOT LIKE '%值%'  entity().getQueueToken()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenNotLike(){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null){
            notLike("queue_token",queueToken);
        }
        return this;
     }


    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * LIKE '%值'  entity().getQueueToken()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenLikeLeft(){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null){
            likeLeft("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * LIKE '值%'  entity().getQueueToken()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenLikeRight(){
        String queueToken =entity().getQueueToken();
        if(queueToken!=null){
            likeRight("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * 等于 =
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenEq(String queueToken){
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
    public DevRoomPlayerQueryEntityWrapper queueTokenNe(String queueToken){
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
    public DevRoomPlayerQueryEntityWrapper queueTokenGt(String queueToken){
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
    public DevRoomPlayerQueryEntityWrapper queueTokenGe(String queueToken){
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
    public DevRoomPlayerQueryEntityWrapper queueTokenLt(String queueToken){
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
    public DevRoomPlayerQueryEntityWrapper queueTokenLe(String queueToken){
        if(queueToken!=null){
            le("queue_token",queueToken);
        }
        return this;
     }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * LIKE '%值%'
     * @param queueToken       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenLike(String queueToken){
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
    public DevRoomPlayerQueryEntityWrapper queueTokenNotLike(String queueToken){
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
    public DevRoomPlayerQueryEntityWrapper queueTokenLikeLeft(String queueToken){
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
    public DevRoomPlayerQueryEntityWrapper queueTokenLikeRight(String queueToken){
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
    public DevRoomPlayerQueryEntityWrapper queueTokenIsNull(){
        isNull("queue_token");
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenIsNotNull(){
        isNotNull("queue_token");
        return this;
    }

    /**
     * <p>队列token，给到云机业务接口获取设备时，通过这个token获取队列中的设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper queueTokenIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper queueTokenIn(String... values){
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
    public DevRoomPlayerQueryEntityWrapper queueTokenNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper queueTokenNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("queue_token",values);
        }
        return this;
    }


    /**
     * <p>玩家设备ID</p>
     * 等于 = entity().getPhoneId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdEq(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            eq("phone_id",phoneId);
        }
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * 不等于 &lt;&gt; entity().getPhoneId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdNe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            ne("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 大于 &gt; entity().getPhoneId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdGt(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            gt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 大于等于 &gt;= entity().getPhoneId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdGe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            ge("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 小于 &lt; entity().getPhoneId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdLt(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            lt("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 小于等于 &lt;= entity().getPhoneId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdLe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * BETWEEN  entity().getPhoneId() AND phoneIdEnd
     * @param phoneIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdBetween(String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            between("phone_id",phoneId,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * NOT BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdNotBetween(String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneId,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            between("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * NOT BETWEEN  entity().getPhoneId() AND 值2
     * @param phoneIdStart       值1
     * @param phoneIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>玩家设备ID</p>
     * LIKE '%值%'  entity().getPhoneId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * NOT LIKE '%值%'  entity().getPhoneId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdNotLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
     }


    /**
     * <p>玩家设备ID</p>
     * LIKE '%值'  entity().getPhoneId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdLikeLeft(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * LIKE '值%'  entity().getPhoneId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdLikeRight(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            likeRight("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * 等于 =
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdEq(String phoneId){
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
    public DevRoomPlayerQueryEntityWrapper phoneIdNe(String phoneId){
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
    public DevRoomPlayerQueryEntityWrapper phoneIdGt(String phoneId){
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
    public DevRoomPlayerQueryEntityWrapper phoneIdGe(String phoneId){
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
    public DevRoomPlayerQueryEntityWrapper phoneIdLt(String phoneId){
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
    public DevRoomPlayerQueryEntityWrapper phoneIdLe(String phoneId){
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家设备ID</p>
     * LIKE '%值%'
     * @param phoneId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdLike(String phoneId){
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
    public DevRoomPlayerQueryEntityWrapper phoneIdNotLike(String phoneId){
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
    public DevRoomPlayerQueryEntityWrapper phoneIdLikeLeft(String phoneId){
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
    public DevRoomPlayerQueryEntityWrapper phoneIdLikeRight(String phoneId){
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
    public DevRoomPlayerQueryEntityWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>玩家设备ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper phoneIdIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper phoneIdIn(String... values){
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
    public DevRoomPlayerQueryEntityWrapper phoneIdNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper phoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("phone_id",values);
        }
        return this;
    }


    /**
     * <p>操作系统（android|ios）</p>
     * 等于 = entity().getOs()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osEq(){
        String os =entity().getOs();
        if(os!=null){
            eq("os",os);
        }
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * 不等于 &lt;&gt; entity().getOs()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osNe(){
        String os =entity().getOs();
        if(os!=null){
            ne("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 大于 &gt; entity().getOs()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osGt(){
        String os =entity().getOs();
        if(os!=null){
            gt("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 大于等于 &gt;= entity().getOs()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osGe(){
        String os =entity().getOs();
        if(os!=null){
            ge("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 小于 &lt; entity().getOs()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osLt(){
        String os =entity().getOs();
        if(os!=null){
            lt("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 小于等于 &lt;= entity().getOs()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osLe(){
        String os =entity().getOs();
        if(os!=null){
            le("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * BETWEEN  entity().getOs() AND osEnd
     * @param osEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osBetween(String osEnd){
        String os =entity().getOs();
        if(os!=null && osEnd!=null){
            between("os",os,osEnd);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * NOT BETWEEN  entity().getOs() AND 值2
     * @param osEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osNotBetween(String osEnd){
        String os =entity().getOs();
        if(os!=null && osEnd!=null){
            notBetween("os",os,osEnd);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * BETWEEN  entity().getOs() AND 值2
     * @param osStart       值1
     * @param osEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osBetween(String osStart,String osEnd){
        String os =entity().getOs();
        if(os!=null && osEnd!=null){
            between("os",osStart,osEnd);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * NOT BETWEEN  entity().getOs() AND 值2
     * @param osStart       值1
     * @param osEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osNotBetween(String osStart,String osEnd){
        String os =entity().getOs();
        if(os!=null && osEnd!=null){
            notBetween("os",osStart,osEnd);
        }
        return this;
     }


    /**
     * <p>操作系统（android|ios）</p>
     * LIKE '%值%'  entity().getOs()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osLike(){
        String os =entity().getOs();
        if(os!=null){
            like("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * NOT LIKE '%值%'  entity().getOs()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osNotLike(){
        String os =entity().getOs();
        if(os!=null){
            notLike("os",os);
        }
        return this;
     }


    /**
     * <p>操作系统（android|ios）</p>
     * LIKE '%值'  entity().getOs()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osLikeLeft(){
        String os =entity().getOs();
        if(os!=null){
            likeLeft("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * LIKE '值%'  entity().getOs()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osLikeRight(){
        String os =entity().getOs();
        if(os!=null){
            likeRight("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * 等于 =
     * @param os       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osEq(String os){
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
    public DevRoomPlayerQueryEntityWrapper osNe(String os){
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
    public DevRoomPlayerQueryEntityWrapper osGt(String os){
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
    public DevRoomPlayerQueryEntityWrapper osGe(String os){
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
    public DevRoomPlayerQueryEntityWrapper osLt(String os){
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
    public DevRoomPlayerQueryEntityWrapper osLe(String os){
        if(os!=null){
            le("os",os);
        }
        return this;
     }

    /**
     * <p>操作系统（android|ios）</p>
     * LIKE '%值%'
     * @param os       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osLike(String os){
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
    public DevRoomPlayerQueryEntityWrapper osNotLike(String os){
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
    public DevRoomPlayerQueryEntityWrapper osLikeLeft(String os){
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
    public DevRoomPlayerQueryEntityWrapper osLikeRight(String os){
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
    public DevRoomPlayerQueryEntityWrapper osIsNull(){
        isNull("os");
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osIsNotNull(){
        isNotNull("os");
        return this;
    }

    /**
     * <p>操作系统（android|ios）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper osIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper osIn(String... values){
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
    public DevRoomPlayerQueryEntityWrapper osNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper osNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("os",values);
        }
        return this;
    }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 等于 = entity().getServerType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeEq(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            eq("server_type",serverType);
        }
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 不等于 &lt;&gt; entity().getServerType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeNe(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            ne("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 大于 &gt; entity().getServerType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeGt(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            gt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 大于等于 &gt;= entity().getServerType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeGe(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            ge("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 小于 &lt; entity().getServerType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeLt(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            lt("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 小于等于 &lt;= entity().getServerType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeLe(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * BETWEEN  entity().getServerType() AND serverTypeEnd
     * @param serverTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeBetween(Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            between("server_type",serverType,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeNotBetween(Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            notBetween("server_type",serverType,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeBetween(Integer serverTypeStart,Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            between("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT BETWEEN  entity().getServerType() AND 值2
     * @param serverTypeStart       值1
     * @param serverTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeNotBetween(Integer serverTypeStart,Integer serverTypeEnd){
        Integer serverType =entity().getServerType();
        if(serverType!=null && serverTypeEnd!=null){
            notBetween("server_type",serverTypeStart,serverTypeEnd);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值%'  entity().getServerType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeLike(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            like("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * NOT LIKE '%值%'  entity().getServerType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeNotLike(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            notLike("server_type",serverType);
        }
        return this;
     }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值'  entity().getServerType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeLikeLeft(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            likeLeft("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '值%'  entity().getServerType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeLikeRight(){
        Integer serverType =entity().getServerType();
        if(serverType!=null){
            likeRight("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 等于 =
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeEq(Integer serverType){
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
    public DevRoomPlayerQueryEntityWrapper serverTypeNe(Integer serverType){
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
    public DevRoomPlayerQueryEntityWrapper serverTypeGt(Integer serverType){
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
    public DevRoomPlayerQueryEntityWrapper serverTypeGe(Integer serverType){
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
    public DevRoomPlayerQueryEntityWrapper serverTypeLt(Integer serverType){
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
    public DevRoomPlayerQueryEntityWrapper serverTypeLe(Integer serverType){
        if(serverType!=null){
            le("server_type",serverType);
        }
        return this;
     }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * LIKE '%值%'
     * @param serverType       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeLike(Integer serverType){
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
    public DevRoomPlayerQueryEntityWrapper serverTypeNotLike(Integer serverType){
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
    public DevRoomPlayerQueryEntityWrapper serverTypeLikeLeft(Integer serverType){
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
    public DevRoomPlayerQueryEntityWrapper serverTypeLikeRight(Integer serverType){
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
    public DevRoomPlayerQueryEntityWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper serverTypeIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryEntityWrapper serverTypeIn(Integer... values){
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
    public DevRoomPlayerQueryEntityWrapper serverTypeNotIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryEntityWrapper serverTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }


    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 等于 = entity().getPlayerLoginStatus()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusEq(){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null){
            eq("player_login_status",playerLoginStatus);
        }
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 不等于 &lt;&gt; entity().getPlayerLoginStatus()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusNe(){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null){
            ne("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 大于 &gt; entity().getPlayerLoginStatus()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusGt(){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null){
            gt("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 大于等于 &gt;= entity().getPlayerLoginStatus()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusGe(){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null){
            ge("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 小于 &lt; entity().getPlayerLoginStatus()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusLt(){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null){
            lt("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 小于等于 &lt;= entity().getPlayerLoginStatus()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusLe(){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null){
            le("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * BETWEEN  entity().getPlayerLoginStatus() AND playerLoginStatusEnd
     * @param playerLoginStatusEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusBetween(Integer playerLoginStatusEnd){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null && playerLoginStatusEnd!=null){
            between("player_login_status",playerLoginStatus,playerLoginStatusEnd);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * NOT BETWEEN  entity().getPlayerLoginStatus() AND 值2
     * @param playerLoginStatusEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusNotBetween(Integer playerLoginStatusEnd){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null && playerLoginStatusEnd!=null){
            notBetween("player_login_status",playerLoginStatus,playerLoginStatusEnd);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * BETWEEN  entity().getPlayerLoginStatus() AND 值2
     * @param playerLoginStatusStart       值1
     * @param playerLoginStatusEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusBetween(Integer playerLoginStatusStart,Integer playerLoginStatusEnd){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null && playerLoginStatusEnd!=null){
            between("player_login_status",playerLoginStatusStart,playerLoginStatusEnd);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * NOT BETWEEN  entity().getPlayerLoginStatus() AND 值2
     * @param playerLoginStatusStart       值1
     * @param playerLoginStatusEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusNotBetween(Integer playerLoginStatusStart,Integer playerLoginStatusEnd){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null && playerLoginStatusEnd!=null){
            notBetween("player_login_status",playerLoginStatusStart,playerLoginStatusEnd);
        }
        return this;
     }


    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * LIKE '%值%'  entity().getPlayerLoginStatus()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusLike(){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null){
            like("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * NOT LIKE '%值%'  entity().getPlayerLoginStatus()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusNotLike(){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null){
            notLike("player_login_status",playerLoginStatus);
        }
        return this;
     }


    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * LIKE '%值'  entity().getPlayerLoginStatus()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusLikeLeft(){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null){
            likeLeft("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * LIKE '值%'  entity().getPlayerLoginStatus()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusLikeRight(){
        Integer playerLoginStatus =entity().getPlayerLoginStatus();
        if(playerLoginStatus!=null){
            likeRight("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * 等于 =
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusEq(Integer playerLoginStatus){
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
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusNe(Integer playerLoginStatus){
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
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusGt(Integer playerLoginStatus){
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
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusGe(Integer playerLoginStatus){
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
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusLt(Integer playerLoginStatus){
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
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusLe(Integer playerLoginStatus){
        if(playerLoginStatus!=null){
            le("player_login_status",playerLoginStatus);
        }
        return this;
     }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * LIKE '%值%'
     * @param playerLoginStatus       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusLike(Integer playerLoginStatus){
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
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusNotLike(Integer playerLoginStatus){
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
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusLikeLeft(Integer playerLoginStatus){
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
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusLikeRight(Integer playerLoginStatus){
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
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusIsNull(){
        isNull("player_login_status");
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusIsNotNull(){
        isNotNull("player_login_status");
        return this;
    }

    /**
     * <p>登录状态（0：已退出，5：待进入，10：已进入）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusIn(Integer... values){
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
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusNotIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryEntityWrapper playerLoginStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("player_login_status",values);
        }
        return this;
    }


    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 等于 = entity().getMsgReportType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeEq(){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null){
            eq("msg_report_type",msgReportType);
        }
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 不等于 &lt;&gt; entity().getMsgReportType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeNe(){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null){
            ne("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 大于 &gt; entity().getMsgReportType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeGt(){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null){
            gt("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 大于等于 &gt;= entity().getMsgReportType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeGe(){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null){
            ge("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 小于 &lt; entity().getMsgReportType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeLt(){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null){
            lt("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 小于等于 &lt;= entity().getMsgReportType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeLe(){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null){
            le("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * BETWEEN  entity().getMsgReportType() AND msgReportTypeEnd
     * @param msgReportTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeBetween(Integer msgReportTypeEnd){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null && msgReportTypeEnd!=null){
            between("msg_report_type",msgReportType,msgReportTypeEnd);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * NOT BETWEEN  entity().getMsgReportType() AND 值2
     * @param msgReportTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeNotBetween(Integer msgReportTypeEnd){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null && msgReportTypeEnd!=null){
            notBetween("msg_report_type",msgReportType,msgReportTypeEnd);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * BETWEEN  entity().getMsgReportType() AND 值2
     * @param msgReportTypeStart       值1
     * @param msgReportTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeBetween(Integer msgReportTypeStart,Integer msgReportTypeEnd){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null && msgReportTypeEnd!=null){
            between("msg_report_type",msgReportTypeStart,msgReportTypeEnd);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * NOT BETWEEN  entity().getMsgReportType() AND 值2
     * @param msgReportTypeStart       值1
     * @param msgReportTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeNotBetween(Integer msgReportTypeStart,Integer msgReportTypeEnd){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null && msgReportTypeEnd!=null){
            notBetween("msg_report_type",msgReportTypeStart,msgReportTypeEnd);
        }
        return this;
     }


    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * LIKE '%值%'  entity().getMsgReportType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeLike(){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null){
            like("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * NOT LIKE '%值%'  entity().getMsgReportType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeNotLike(){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null){
            notLike("msg_report_type",msgReportType);
        }
        return this;
     }


    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * LIKE '%值'  entity().getMsgReportType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeLikeLeft(){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null){
            likeLeft("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * LIKE '值%'  entity().getMsgReportType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeLikeRight(){
        Integer msgReportType =entity().getMsgReportType();
        if(msgReportType!=null){
            likeRight("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * 等于 =
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeEq(Integer msgReportType){
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
    public DevRoomPlayerQueryEntityWrapper msgReportTypeNe(Integer msgReportType){
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
    public DevRoomPlayerQueryEntityWrapper msgReportTypeGt(Integer msgReportType){
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
    public DevRoomPlayerQueryEntityWrapper msgReportTypeGe(Integer msgReportType){
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
    public DevRoomPlayerQueryEntityWrapper msgReportTypeLt(Integer msgReportType){
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
    public DevRoomPlayerQueryEntityWrapper msgReportTypeLe(Integer msgReportType){
        if(msgReportType!=null){
            le("msg_report_type",msgReportType);
        }
        return this;
     }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * LIKE '%值%'
     * @param msgReportType       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeLike(Integer msgReportType){
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
    public DevRoomPlayerQueryEntityWrapper msgReportTypeNotLike(Integer msgReportType){
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
    public DevRoomPlayerQueryEntityWrapper msgReportTypeLikeLeft(Integer msgReportType){
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
    public DevRoomPlayerQueryEntityWrapper msgReportTypeLikeRight(Integer msgReportType){
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
    public DevRoomPlayerQueryEntityWrapper msgReportTypeIsNull(){
        isNull("msg_report_type");
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeIsNotNull(){
        isNotNull("msg_report_type");
        return this;
    }

    /**
     * <p>信息上报类型（app上报：1，soc上报：2，server端上报：3，定时器：4）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper msgReportTypeIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryEntityWrapper msgReportTypeIn(Integer... values){
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
    public DevRoomPlayerQueryEntityWrapper msgReportTypeNotIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryEntityWrapper msgReportTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("msg_report_type",values);
        }
        return this;
    }


    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 等于 = entity().getRoomPlayerRole()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleEq(){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null){
            eq("room_player_role",roomPlayerRole);
        }
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 不等于 &lt;&gt; entity().getRoomPlayerRole()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleNe(){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null){
            ne("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 大于 &gt; entity().getRoomPlayerRole()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleGt(){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null){
            gt("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 大于等于 &gt;= entity().getRoomPlayerRole()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleGe(){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null){
            ge("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 小于 &lt; entity().getRoomPlayerRole()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleLt(){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null){
            lt("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 小于等于 &lt;= entity().getRoomPlayerRole()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleLe(){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null){
            le("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * BETWEEN  entity().getRoomPlayerRole() AND roomPlayerRoleEnd
     * @param roomPlayerRoleEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleBetween(Integer roomPlayerRoleEnd){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null && roomPlayerRoleEnd!=null){
            between("room_player_role",roomPlayerRole,roomPlayerRoleEnd);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * NOT BETWEEN  entity().getRoomPlayerRole() AND 值2
     * @param roomPlayerRoleEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleNotBetween(Integer roomPlayerRoleEnd){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null && roomPlayerRoleEnd!=null){
            notBetween("room_player_role",roomPlayerRole,roomPlayerRoleEnd);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * BETWEEN  entity().getRoomPlayerRole() AND 值2
     * @param roomPlayerRoleStart       值1
     * @param roomPlayerRoleEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleBetween(Integer roomPlayerRoleStart,Integer roomPlayerRoleEnd){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null && roomPlayerRoleEnd!=null){
            between("room_player_role",roomPlayerRoleStart,roomPlayerRoleEnd);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * NOT BETWEEN  entity().getRoomPlayerRole() AND 值2
     * @param roomPlayerRoleStart       值1
     * @param roomPlayerRoleEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleNotBetween(Integer roomPlayerRoleStart,Integer roomPlayerRoleEnd){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null && roomPlayerRoleEnd!=null){
            notBetween("room_player_role",roomPlayerRoleStart,roomPlayerRoleEnd);
        }
        return this;
     }


    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * LIKE '%值%'  entity().getRoomPlayerRole()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleLike(){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null){
            like("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * NOT LIKE '%值%'  entity().getRoomPlayerRole()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleNotLike(){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null){
            notLike("room_player_role",roomPlayerRole);
        }
        return this;
     }


    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * LIKE '%值'  entity().getRoomPlayerRole()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleLikeLeft(){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null){
            likeLeft("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * LIKE '值%'  entity().getRoomPlayerRole()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleLikeRight(){
        Integer roomPlayerRole =entity().getRoomPlayerRole();
        if(roomPlayerRole!=null){
            likeRight("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * 等于 =
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleEq(Integer roomPlayerRole){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleNe(Integer roomPlayerRole){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleGt(Integer roomPlayerRole){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleGe(Integer roomPlayerRole){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleLt(Integer roomPlayerRole){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleLe(Integer roomPlayerRole){
        if(roomPlayerRole!=null){
            le("room_player_role",roomPlayerRole);
        }
        return this;
     }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * LIKE '%值%'
     * @param roomPlayerRole       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleLike(Integer roomPlayerRole){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleNotLike(Integer roomPlayerRole){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleLikeLeft(Integer roomPlayerRole){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleLikeRight(Integer roomPlayerRole){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleIsNull(){
        isNull("room_player_role");
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleIsNotNull(){
        isNotNull("room_player_role");
        return this;
    }

    /**
     * <p>房间成员角色（0：普通玩家，1：队长玩家）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleIn(Integer... values){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleNotIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryEntityWrapper roomPlayerRoleNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_player_role",values);
        }
        return this;
    }


    /**
     * <p>房间继承者id</p>
     * 等于 = entity().getHeirLeaderId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdEq(){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null){
            eq("heir_leader_id",heirLeaderId);
        }
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * 不等于 &lt;&gt; entity().getHeirLeaderId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdNe(){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null){
            ne("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 大于 &gt; entity().getHeirLeaderId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdGt(){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null){
            gt("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 大于等于 &gt;= entity().getHeirLeaderId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdGe(){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null){
            ge("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 小于 &lt; entity().getHeirLeaderId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdLt(){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null){
            lt("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 小于等于 &lt;= entity().getHeirLeaderId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdLe(){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null){
            le("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * BETWEEN  entity().getHeirLeaderId() AND heirLeaderIdEnd
     * @param heirLeaderIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdBetween(Long heirLeaderIdEnd){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null && heirLeaderIdEnd!=null){
            between("heir_leader_id",heirLeaderId,heirLeaderIdEnd);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * NOT BETWEEN  entity().getHeirLeaderId() AND 值2
     * @param heirLeaderIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdNotBetween(Long heirLeaderIdEnd){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null && heirLeaderIdEnd!=null){
            notBetween("heir_leader_id",heirLeaderId,heirLeaderIdEnd);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * BETWEEN  entity().getHeirLeaderId() AND 值2
     * @param heirLeaderIdStart       值1
     * @param heirLeaderIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdBetween(Long heirLeaderIdStart,Long heirLeaderIdEnd){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null && heirLeaderIdEnd!=null){
            between("heir_leader_id",heirLeaderIdStart,heirLeaderIdEnd);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * NOT BETWEEN  entity().getHeirLeaderId() AND 值2
     * @param heirLeaderIdStart       值1
     * @param heirLeaderIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdNotBetween(Long heirLeaderIdStart,Long heirLeaderIdEnd){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null && heirLeaderIdEnd!=null){
            notBetween("heir_leader_id",heirLeaderIdStart,heirLeaderIdEnd);
        }
        return this;
     }


    /**
     * <p>房间继承者id</p>
     * LIKE '%值%'  entity().getHeirLeaderId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdLike(){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null){
            like("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * NOT LIKE '%值%'  entity().getHeirLeaderId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdNotLike(){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null){
            notLike("heir_leader_id",heirLeaderId);
        }
        return this;
     }


    /**
     * <p>房间继承者id</p>
     * LIKE '%值'  entity().getHeirLeaderId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdLikeLeft(){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null){
            likeLeft("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * LIKE '值%'  entity().getHeirLeaderId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdLikeRight(){
        Long heirLeaderId =entity().getHeirLeaderId();
        if(heirLeaderId!=null){
            likeRight("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * 等于 =
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdEq(Long heirLeaderId){
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
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdNe(Long heirLeaderId){
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
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdGt(Long heirLeaderId){
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
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdGe(Long heirLeaderId){
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
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdLt(Long heirLeaderId){
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
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdLe(Long heirLeaderId){
        if(heirLeaderId!=null){
            le("heir_leader_id",heirLeaderId);
        }
        return this;
     }

    /**
     * <p>房间继承者id</p>
     * LIKE '%值%'
     * @param heirLeaderId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdLike(Long heirLeaderId){
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
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdNotLike(Long heirLeaderId){
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
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdLikeLeft(Long heirLeaderId){
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
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdLikeRight(Long heirLeaderId){
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
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdIsNull(){
        isNull("heir_leader_id");
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdIsNotNull(){
        isNotNull("heir_leader_id");
        return this;
    }

    /**
     * <p>房间继承者id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdIn(Collection<Long> value){
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
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdIn(Long... values){
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
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdNotIn(Collection<Long> value){
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
    public DevRoomPlayerQueryEntityWrapper heirLeaderIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("heir_leader_id",values);
        }
        return this;
    }


    /**
     * <p>获取到设备时间</p>
     * 等于 = entity().getFetchTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeEq(){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null){
            eq("fetch_time",fetchTime);
        }
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * 不等于 &lt;&gt; entity().getFetchTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeNe(){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null){
            ne("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 大于 &gt; entity().getFetchTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeGt(){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null){
            gt("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 大于等于 &gt;= entity().getFetchTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeGe(){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null){
            ge("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 小于 &lt; entity().getFetchTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeLt(){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null){
            lt("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 小于等于 &lt;= entity().getFetchTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeLe(){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null){
            le("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * BETWEEN  entity().getFetchTime() AND fetchTimeEnd
     * @param fetchTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeBetween(Date fetchTimeEnd){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null && fetchTimeEnd!=null){
            between("fetch_time",fetchTime,fetchTimeEnd);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * NOT BETWEEN  entity().getFetchTime() AND 值2
     * @param fetchTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeNotBetween(Date fetchTimeEnd){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null && fetchTimeEnd!=null){
            notBetween("fetch_time",fetchTime,fetchTimeEnd);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * BETWEEN  entity().getFetchTime() AND 值2
     * @param fetchTimeStart       值1
     * @param fetchTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeBetween(Date fetchTimeStart,Date fetchTimeEnd){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null && fetchTimeEnd!=null){
            between("fetch_time",fetchTimeStart,fetchTimeEnd);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * NOT BETWEEN  entity().getFetchTime() AND 值2
     * @param fetchTimeStart       值1
     * @param fetchTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeNotBetween(Date fetchTimeStart,Date fetchTimeEnd){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null && fetchTimeEnd!=null){
            notBetween("fetch_time",fetchTimeStart,fetchTimeEnd);
        }
        return this;
     }


    /**
     * <p>获取到设备时间</p>
     * LIKE '%值%'  entity().getFetchTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeLike(){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null){
            like("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * NOT LIKE '%值%'  entity().getFetchTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeNotLike(){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null){
            notLike("fetch_time",fetchTime);
        }
        return this;
     }


    /**
     * <p>获取到设备时间</p>
     * LIKE '%值'  entity().getFetchTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeLikeLeft(){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null){
            likeLeft("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * LIKE '值%'  entity().getFetchTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeLikeRight(){
        Date fetchTime =entity().getFetchTime();
        if(fetchTime!=null){
            likeRight("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * 等于 =
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeEq(Date fetchTime){
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
    public DevRoomPlayerQueryEntityWrapper fetchTimeNe(Date fetchTime){
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
    public DevRoomPlayerQueryEntityWrapper fetchTimeGt(Date fetchTime){
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
    public DevRoomPlayerQueryEntityWrapper fetchTimeGe(Date fetchTime){
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
    public DevRoomPlayerQueryEntityWrapper fetchTimeLt(Date fetchTime){
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
    public DevRoomPlayerQueryEntityWrapper fetchTimeLe(Date fetchTime){
        if(fetchTime!=null){
            le("fetch_time",fetchTime);
        }
        return this;
     }

    /**
     * <p>获取到设备时间</p>
     * LIKE '%值%'
     * @param fetchTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeLike(Date fetchTime){
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
    public DevRoomPlayerQueryEntityWrapper fetchTimeNotLike(Date fetchTime){
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
    public DevRoomPlayerQueryEntityWrapper fetchTimeLikeLeft(Date fetchTime){
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
    public DevRoomPlayerQueryEntityWrapper fetchTimeLikeRight(Date fetchTime){
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
    public DevRoomPlayerQueryEntityWrapper fetchTimeIsNull(){
        isNull("fetch_time");
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeIsNotNull(){
        isNotNull("fetch_time");
        return this;
    }

    /**
     * <p>获取到设备时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper fetchTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper fetchTimeIn(Date... values){
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
    public DevRoomPlayerQueryEntityWrapper fetchTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper fetchTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("fetch_time",values);
        }
        return this;
    }


    /**
     * <p>记录时间</p>
     * 等于 = entity().getLoginTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeEq(){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null){
            eq("login_time",loginTime);
        }
        return this;
    }

    /**
     * <p>记录时间</p>
     * 不等于 &lt;&gt; entity().getLoginTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeNe(){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null){
            ne("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 大于 &gt; entity().getLoginTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeGt(){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null){
            gt("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 大于等于 &gt;= entity().getLoginTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeGe(){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null){
            ge("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 小于 &lt; entity().getLoginTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeLt(){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null){
            lt("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 小于等于 &lt;= entity().getLoginTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeLe(){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null){
            le("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * BETWEEN  entity().getLoginTime() AND loginTimeEnd
     * @param loginTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeBetween(Date loginTimeEnd){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null && loginTimeEnd!=null){
            between("login_time",loginTime,loginTimeEnd);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * NOT BETWEEN  entity().getLoginTime() AND 值2
     * @param loginTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeNotBetween(Date loginTimeEnd){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null && loginTimeEnd!=null){
            notBetween("login_time",loginTime,loginTimeEnd);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * BETWEEN  entity().getLoginTime() AND 值2
     * @param loginTimeStart       值1
     * @param loginTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeBetween(Date loginTimeStart,Date loginTimeEnd){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null && loginTimeEnd!=null){
            between("login_time",loginTimeStart,loginTimeEnd);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * NOT BETWEEN  entity().getLoginTime() AND 值2
     * @param loginTimeStart       值1
     * @param loginTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeNotBetween(Date loginTimeStart,Date loginTimeEnd){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null && loginTimeEnd!=null){
            notBetween("login_time",loginTimeStart,loginTimeEnd);
        }
        return this;
     }


    /**
     * <p>记录时间</p>
     * LIKE '%值%'  entity().getLoginTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeLike(){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null){
            like("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * NOT LIKE '%值%'  entity().getLoginTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeNotLike(){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null){
            notLike("login_time",loginTime);
        }
        return this;
     }


    /**
     * <p>记录时间</p>
     * LIKE '%值'  entity().getLoginTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeLikeLeft(){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null){
            likeLeft("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * LIKE '值%'  entity().getLoginTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeLikeRight(){
        Date loginTime =entity().getLoginTime();
        if(loginTime!=null){
            likeRight("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * 等于 =
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeEq(Date loginTime){
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
    public DevRoomPlayerQueryEntityWrapper loginTimeNe(Date loginTime){
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
    public DevRoomPlayerQueryEntityWrapper loginTimeGt(Date loginTime){
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
    public DevRoomPlayerQueryEntityWrapper loginTimeGe(Date loginTime){
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
    public DevRoomPlayerQueryEntityWrapper loginTimeLt(Date loginTime){
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
    public DevRoomPlayerQueryEntityWrapper loginTimeLe(Date loginTime){
        if(loginTime!=null){
            le("login_time",loginTime);
        }
        return this;
     }

    /**
     * <p>记录时间</p>
     * LIKE '%值%'
     * @param loginTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeLike(Date loginTime){
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
    public DevRoomPlayerQueryEntityWrapper loginTimeNotLike(Date loginTime){
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
    public DevRoomPlayerQueryEntityWrapper loginTimeLikeLeft(Date loginTime){
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
    public DevRoomPlayerQueryEntityWrapper loginTimeLikeRight(Date loginTime){
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
    public DevRoomPlayerQueryEntityWrapper loginTimeIsNull(){
        isNull("login_time");
        return this;
    }

    /**
     * <p>记录时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeIsNotNull(){
        isNotNull("login_time");
        return this;
    }

    /**
     * <p>记录时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper loginTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper loginTimeIn(Date... values){
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
    public DevRoomPlayerQueryEntityWrapper loginTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper loginTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("login_time",values);
        }
        return this;
    }


    /**
     * <p>退出时间</p>
     * 等于 = entity().getLogoutTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeEq(){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null){
            eq("logout_time",logoutTime);
        }
        return this;
    }

    /**
     * <p>退出时间</p>
     * 不等于 &lt;&gt; entity().getLogoutTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeNe(){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null){
            ne("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 大于 &gt; entity().getLogoutTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeGt(){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null){
            gt("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 大于等于 &gt;= entity().getLogoutTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeGe(){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null){
            ge("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 小于 &lt; entity().getLogoutTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeLt(){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null){
            lt("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 小于等于 &lt;= entity().getLogoutTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeLe(){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null){
            le("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * BETWEEN  entity().getLogoutTime() AND logoutTimeEnd
     * @param logoutTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeBetween(Date logoutTimeEnd){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null && logoutTimeEnd!=null){
            between("logout_time",logoutTime,logoutTimeEnd);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * NOT BETWEEN  entity().getLogoutTime() AND 值2
     * @param logoutTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeNotBetween(Date logoutTimeEnd){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null && logoutTimeEnd!=null){
            notBetween("logout_time",logoutTime,logoutTimeEnd);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * BETWEEN  entity().getLogoutTime() AND 值2
     * @param logoutTimeStart       值1
     * @param logoutTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeBetween(Date logoutTimeStart,Date logoutTimeEnd){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null && logoutTimeEnd!=null){
            between("logout_time",logoutTimeStart,logoutTimeEnd);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * NOT BETWEEN  entity().getLogoutTime() AND 值2
     * @param logoutTimeStart       值1
     * @param logoutTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeNotBetween(Date logoutTimeStart,Date logoutTimeEnd){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null && logoutTimeEnd!=null){
            notBetween("logout_time",logoutTimeStart,logoutTimeEnd);
        }
        return this;
     }


    /**
     * <p>退出时间</p>
     * LIKE '%值%'  entity().getLogoutTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeLike(){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null){
            like("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * NOT LIKE '%值%'  entity().getLogoutTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeNotLike(){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null){
            notLike("logout_time",logoutTime);
        }
        return this;
     }


    /**
     * <p>退出时间</p>
     * LIKE '%值'  entity().getLogoutTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeLikeLeft(){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null){
            likeLeft("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * LIKE '值%'  entity().getLogoutTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeLikeRight(){
        Date logoutTime =entity().getLogoutTime();
        if(logoutTime!=null){
            likeRight("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * 等于 =
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeEq(Date logoutTime){
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
    public DevRoomPlayerQueryEntityWrapper logoutTimeNe(Date logoutTime){
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
    public DevRoomPlayerQueryEntityWrapper logoutTimeGt(Date logoutTime){
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
    public DevRoomPlayerQueryEntityWrapper logoutTimeGe(Date logoutTime){
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
    public DevRoomPlayerQueryEntityWrapper logoutTimeLt(Date logoutTime){
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
    public DevRoomPlayerQueryEntityWrapper logoutTimeLe(Date logoutTime){
        if(logoutTime!=null){
            le("logout_time",logoutTime);
        }
        return this;
     }

    /**
     * <p>退出时间</p>
     * LIKE '%值%'
     * @param logoutTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeLike(Date logoutTime){
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
    public DevRoomPlayerQueryEntityWrapper logoutTimeNotLike(Date logoutTime){
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
    public DevRoomPlayerQueryEntityWrapper logoutTimeLikeLeft(Date logoutTime){
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
    public DevRoomPlayerQueryEntityWrapper logoutTimeLikeRight(Date logoutTime){
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
    public DevRoomPlayerQueryEntityWrapper logoutTimeIsNull(){
        isNull("logout_time");
        return this;
    }

    /**
     * <p>退出时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeIsNotNull(){
        isNotNull("logout_time");
        return this;
    }

    /**
     * <p>退出时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper logoutTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper logoutTimeIn(Date... values){
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
    public DevRoomPlayerQueryEntityWrapper logoutTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper logoutTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("logout_time",values);
        }
        return this;
    }


    /**
     * <p>设备空闲上报时间</p>
     * 等于 = entity().getIdleTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeEq(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            eq("idle_time",idleTime);
        }
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * 不等于 &lt;&gt; entity().getIdleTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeNe(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            ne("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 大于 &gt; entity().getIdleTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeGt(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            gt("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 大于等于 &gt;= entity().getIdleTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeGe(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            ge("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 小于 &lt; entity().getIdleTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeLt(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            lt("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 小于等于 &lt;= entity().getIdleTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeLe(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            le("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * BETWEEN  entity().getIdleTime() AND idleTimeEnd
     * @param idleTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeBetween(Date idleTimeEnd){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null && idleTimeEnd!=null){
            between("idle_time",idleTime,idleTimeEnd);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * NOT BETWEEN  entity().getIdleTime() AND 值2
     * @param idleTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeNotBetween(Date idleTimeEnd){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null && idleTimeEnd!=null){
            notBetween("idle_time",idleTime,idleTimeEnd);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * BETWEEN  entity().getIdleTime() AND 值2
     * @param idleTimeStart       值1
     * @param idleTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeBetween(Date idleTimeStart,Date idleTimeEnd){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null && idleTimeEnd!=null){
            between("idle_time",idleTimeStart,idleTimeEnd);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * NOT BETWEEN  entity().getIdleTime() AND 值2
     * @param idleTimeStart       值1
     * @param idleTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeNotBetween(Date idleTimeStart,Date idleTimeEnd){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null && idleTimeEnd!=null){
            notBetween("idle_time",idleTimeStart,idleTimeEnd);
        }
        return this;
     }


    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值%'  entity().getIdleTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeLike(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            like("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * NOT LIKE '%值%'  entity().getIdleTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeNotLike(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            notLike("idle_time",idleTime);
        }
        return this;
     }


    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值'  entity().getIdleTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeLikeLeft(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            likeLeft("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * LIKE '值%'  entity().getIdleTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeLikeRight(){
        Date idleTime =entity().getIdleTime();
        if(idleTime!=null){
            likeRight("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * 等于 =
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeEq(Date idleTime){
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
    public DevRoomPlayerQueryEntityWrapper idleTimeNe(Date idleTime){
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
    public DevRoomPlayerQueryEntityWrapper idleTimeGt(Date idleTime){
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
    public DevRoomPlayerQueryEntityWrapper idleTimeGe(Date idleTime){
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
    public DevRoomPlayerQueryEntityWrapper idleTimeLt(Date idleTime){
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
    public DevRoomPlayerQueryEntityWrapper idleTimeLe(Date idleTime){
        if(idleTime!=null){
            le("idle_time",idleTime);
        }
        return this;
     }

    /**
     * <p>设备空闲上报时间</p>
     * LIKE '%值%'
     * @param idleTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeLike(Date idleTime){
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
    public DevRoomPlayerQueryEntityWrapper idleTimeNotLike(Date idleTime){
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
    public DevRoomPlayerQueryEntityWrapper idleTimeLikeLeft(Date idleTime){
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
    public DevRoomPlayerQueryEntityWrapper idleTimeLikeRight(Date idleTime){
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
    public DevRoomPlayerQueryEntityWrapper idleTimeIsNull(){
        isNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeIsNotNull(){
        isNotNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper idleTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper idleTimeIn(Date... values){
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
    public DevRoomPlayerQueryEntityWrapper idleTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper idleTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("idle_time",values);
        }
        return this;
    }


    /**
     * <p>客户端streaming进入时间</p>
     * 等于 = entity().getClientStreamingStartTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeEq(){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null){
            eq("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * 不等于 &lt;&gt; entity().getClientStreamingStartTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeNe(){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null){
            ne("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 大于 &gt; entity().getClientStreamingStartTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeGt(){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null){
            gt("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 大于等于 &gt;= entity().getClientStreamingStartTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeGe(){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null){
            ge("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 小于 &lt; entity().getClientStreamingStartTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeLt(){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null){
            lt("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 小于等于 &lt;= entity().getClientStreamingStartTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeLe(){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null){
            le("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * BETWEEN  entity().getClientStreamingStartTime() AND clientStreamingStartTimeEnd
     * @param clientStreamingStartTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeBetween(Date clientStreamingStartTimeEnd){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null && clientStreamingStartTimeEnd!=null){
            between("client_streaming_start_time",clientStreamingStartTime,clientStreamingStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * NOT BETWEEN  entity().getClientStreamingStartTime() AND 值2
     * @param clientStreamingStartTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeNotBetween(Date clientStreamingStartTimeEnd){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null && clientStreamingStartTimeEnd!=null){
            notBetween("client_streaming_start_time",clientStreamingStartTime,clientStreamingStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * BETWEEN  entity().getClientStreamingStartTime() AND 值2
     * @param clientStreamingStartTimeStart       值1
     * @param clientStreamingStartTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeBetween(Date clientStreamingStartTimeStart,Date clientStreamingStartTimeEnd){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null && clientStreamingStartTimeEnd!=null){
            between("client_streaming_start_time",clientStreamingStartTimeStart,clientStreamingStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * NOT BETWEEN  entity().getClientStreamingStartTime() AND 值2
     * @param clientStreamingStartTimeStart       值1
     * @param clientStreamingStartTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeNotBetween(Date clientStreamingStartTimeStart,Date clientStreamingStartTimeEnd){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null && clientStreamingStartTimeEnd!=null){
            notBetween("client_streaming_start_time",clientStreamingStartTimeStart,clientStreamingStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>客户端streaming进入时间</p>
     * LIKE '%值%'  entity().getClientStreamingStartTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeLike(){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null){
            like("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * NOT LIKE '%值%'  entity().getClientStreamingStartTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeNotLike(){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null){
            notLike("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }


    /**
     * <p>客户端streaming进入时间</p>
     * LIKE '%值'  entity().getClientStreamingStartTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeLikeLeft(){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null){
            likeLeft("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * LIKE '值%'  entity().getClientStreamingStartTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeLikeRight(){
        Date clientStreamingStartTime =entity().getClientStreamingStartTime();
        if(clientStreamingStartTime!=null){
            likeRight("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * 等于 =
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeEq(Date clientStreamingStartTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeNe(Date clientStreamingStartTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeGt(Date clientStreamingStartTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeGe(Date clientStreamingStartTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeLt(Date clientStreamingStartTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeLe(Date clientStreamingStartTime){
        if(clientStreamingStartTime!=null){
            le("client_streaming_start_time",clientStreamingStartTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming进入时间</p>
     * LIKE '%值%'
     * @param clientStreamingStartTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeLike(Date clientStreamingStartTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeNotLike(Date clientStreamingStartTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeLikeLeft(Date clientStreamingStartTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeLikeRight(Date clientStreamingStartTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeIsNull(){
        isNull("client_streaming_start_time");
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeIsNotNull(){
        isNotNull("client_streaming_start_time");
        return this;
    }

    /**
     * <p>客户端streaming进入时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeIn(Date... values){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("client_streaming_start_time",values);
        }
        return this;
    }


    /**
     * <p>客户端streaming退出时间</p>
     * 等于 = entity().getClientStreamingEndTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeEq(){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null){
            eq("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * 不等于 &lt;&gt; entity().getClientStreamingEndTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeNe(){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null){
            ne("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 大于 &gt; entity().getClientStreamingEndTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeGt(){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null){
            gt("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 大于等于 &gt;= entity().getClientStreamingEndTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeGe(){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null){
            ge("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 小于 &lt; entity().getClientStreamingEndTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeLt(){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null){
            lt("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 小于等于 &lt;= entity().getClientStreamingEndTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeLe(){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null){
            le("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * BETWEEN  entity().getClientStreamingEndTime() AND clientStreamingEndTimeEnd
     * @param clientStreamingEndTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeBetween(Date clientStreamingEndTimeEnd){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null && clientStreamingEndTimeEnd!=null){
            between("client_streaming_end_time",clientStreamingEndTime,clientStreamingEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * NOT BETWEEN  entity().getClientStreamingEndTime() AND 值2
     * @param clientStreamingEndTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeNotBetween(Date clientStreamingEndTimeEnd){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null && clientStreamingEndTimeEnd!=null){
            notBetween("client_streaming_end_time",clientStreamingEndTime,clientStreamingEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * BETWEEN  entity().getClientStreamingEndTime() AND 值2
     * @param clientStreamingEndTimeStart       值1
     * @param clientStreamingEndTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeBetween(Date clientStreamingEndTimeStart,Date clientStreamingEndTimeEnd){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null && clientStreamingEndTimeEnd!=null){
            between("client_streaming_end_time",clientStreamingEndTimeStart,clientStreamingEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * NOT BETWEEN  entity().getClientStreamingEndTime() AND 值2
     * @param clientStreamingEndTimeStart       值1
     * @param clientStreamingEndTimeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeNotBetween(Date clientStreamingEndTimeStart,Date clientStreamingEndTimeEnd){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null && clientStreamingEndTimeEnd!=null){
            notBetween("client_streaming_end_time",clientStreamingEndTimeStart,clientStreamingEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>客户端streaming退出时间</p>
     * LIKE '%值%'  entity().getClientStreamingEndTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeLike(){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null){
            like("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * NOT LIKE '%值%'  entity().getClientStreamingEndTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeNotLike(){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null){
            notLike("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }


    /**
     * <p>客户端streaming退出时间</p>
     * LIKE '%值'  entity().getClientStreamingEndTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeLikeLeft(){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null){
            likeLeft("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * LIKE '值%'  entity().getClientStreamingEndTime()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeLikeRight(){
        Date clientStreamingEndTime =entity().getClientStreamingEndTime();
        if(clientStreamingEndTime!=null){
            likeRight("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * 等于 =
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeEq(Date clientStreamingEndTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeNe(Date clientStreamingEndTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeGt(Date clientStreamingEndTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeGe(Date clientStreamingEndTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeLt(Date clientStreamingEndTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeLe(Date clientStreamingEndTime){
        if(clientStreamingEndTime!=null){
            le("client_streaming_end_time",clientStreamingEndTime);
        }
        return this;
     }

    /**
     * <p>客户端streaming退出时间</p>
     * LIKE '%值%'
     * @param clientStreamingEndTime       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeLike(Date clientStreamingEndTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeNotLike(Date clientStreamingEndTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeLikeLeft(Date clientStreamingEndTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeLikeRight(Date clientStreamingEndTime){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeIsNull(){
        isNull("client_streaming_end_time");
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeIsNotNull(){
        isNotNull("client_streaming_end_time");
        return this;
    }

    /**
     * <p>客户端streaming退出时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeIn(Date... values){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeNotIn(Collection<Date> value){
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
    public DevRoomPlayerQueryEntityWrapper clientStreamingEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("client_streaming_end_time",values);
        }
        return this;
    }


    /**
     * <p>版本id</p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdEq(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            eq("version_id",versionId);
        }
        return this;
    }

    /**
     * <p>版本id</p>
     * 不等于 &lt;&gt; entity().getVersionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdNe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ne("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于 &gt; entity().getVersionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdGt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            gt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 大于等于 &gt;= entity().getVersionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdGe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            ge("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于 &lt; entity().getVersionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdLt(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            lt("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 小于等于 &lt;= entity().getVersionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN  entity().getVersionId() AND versionIdEnd
     * @param versionIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionId,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            between("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT BETWEEN  entity().getVersionId() AND 值2
     * @param versionIdStart       值1
     * @param versionIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * NOT LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p>版本id</p>
     * LIKE '%值'  entity().getVersionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '值%'  entity().getVersionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdLikeRight(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeRight("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * 等于 =
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdEq(Long versionId){
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
    public DevRoomPlayerQueryEntityWrapper versionIdNe(Long versionId){
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
    public DevRoomPlayerQueryEntityWrapper versionIdGt(Long versionId){
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
    public DevRoomPlayerQueryEntityWrapper versionIdGe(Long versionId){
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
    public DevRoomPlayerQueryEntityWrapper versionIdLt(Long versionId){
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
    public DevRoomPlayerQueryEntityWrapper versionIdLe(Long versionId){
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p>版本id</p>
     * LIKE '%值%'
     * @param versionId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdLike(Long versionId){
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
    public DevRoomPlayerQueryEntityWrapper versionIdNotLike(Long versionId){
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
    public DevRoomPlayerQueryEntityWrapper versionIdLikeLeft(Long versionId){
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
    public DevRoomPlayerQueryEntityWrapper versionIdLikeRight(Long versionId){
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
    public DevRoomPlayerQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p>版本id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper versionIdIn(Collection<Long> value){
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
    public DevRoomPlayerQueryEntityWrapper versionIdIn(Long... values){
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
    public DevRoomPlayerQueryEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public DevRoomPlayerQueryEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }


    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 等于 = entity().getRoomType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeEq(){
        Integer roomType =entity().getRoomType();
        if(roomType!=null){
            eq("room_type",roomType);
        }
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 不等于 &lt;&gt; entity().getRoomType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeNe(){
        Integer roomType =entity().getRoomType();
        if(roomType!=null){
            ne("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 大于 &gt; entity().getRoomType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeGt(){
        Integer roomType =entity().getRoomType();
        if(roomType!=null){
            gt("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 大于等于 &gt;= entity().getRoomType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeGe(){
        Integer roomType =entity().getRoomType();
        if(roomType!=null){
            ge("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 小于 &lt; entity().getRoomType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeLt(){
        Integer roomType =entity().getRoomType();
        if(roomType!=null){
            lt("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 小于等于 &lt;= entity().getRoomType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeLe(){
        Integer roomType =entity().getRoomType();
        if(roomType!=null){
            le("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * BETWEEN  entity().getRoomType() AND roomTypeEnd
     * @param roomTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeBetween(Integer roomTypeEnd){
        Integer roomType =entity().getRoomType();
        if(roomType!=null && roomTypeEnd!=null){
            between("room_type",roomType,roomTypeEnd);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * NOT BETWEEN  entity().getRoomType() AND 值2
     * @param roomTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeNotBetween(Integer roomTypeEnd){
        Integer roomType =entity().getRoomType();
        if(roomType!=null && roomTypeEnd!=null){
            notBetween("room_type",roomType,roomTypeEnd);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * BETWEEN  entity().getRoomType() AND 值2
     * @param roomTypeStart       值1
     * @param roomTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeBetween(Integer roomTypeStart,Integer roomTypeEnd){
        Integer roomType =entity().getRoomType();
        if(roomType!=null && roomTypeEnd!=null){
            between("room_type",roomTypeStart,roomTypeEnd);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * NOT BETWEEN  entity().getRoomType() AND 值2
     * @param roomTypeStart       值1
     * @param roomTypeEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeNotBetween(Integer roomTypeStart,Integer roomTypeEnd){
        Integer roomType =entity().getRoomType();
        if(roomType!=null && roomTypeEnd!=null){
            notBetween("room_type",roomTypeStart,roomTypeEnd);
        }
        return this;
     }


    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * LIKE '%值%'  entity().getRoomType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeLike(){
        Integer roomType =entity().getRoomType();
        if(roomType!=null){
            like("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * NOT LIKE '%值%'  entity().getRoomType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeNotLike(){
        Integer roomType =entity().getRoomType();
        if(roomType!=null){
            notLike("room_type",roomType);
        }
        return this;
     }


    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * LIKE '%值'  entity().getRoomType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeLikeLeft(){
        Integer roomType =entity().getRoomType();
        if(roomType!=null){
            likeLeft("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * LIKE '值%'  entity().getRoomType()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeLikeRight(){
        Integer roomType =entity().getRoomType();
        if(roomType!=null){
            likeRight("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * 等于 =
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeEq(Integer roomType){
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
    public DevRoomPlayerQueryEntityWrapper roomTypeNe(Integer roomType){
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
    public DevRoomPlayerQueryEntityWrapper roomTypeGt(Integer roomType){
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
    public DevRoomPlayerQueryEntityWrapper roomTypeGe(Integer roomType){
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
    public DevRoomPlayerQueryEntityWrapper roomTypeLt(Integer roomType){
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
    public DevRoomPlayerQueryEntityWrapper roomTypeLe(Integer roomType){
        if(roomType!=null){
            le("room_type",roomType);
        }
        return this;
     }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * LIKE '%值%'
     * @param roomType       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeLike(Integer roomType){
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
    public DevRoomPlayerQueryEntityWrapper roomTypeNotLike(Integer roomType){
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
    public DevRoomPlayerQueryEntityWrapper roomTypeLikeLeft(Integer roomType){
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
    public DevRoomPlayerQueryEntityWrapper roomTypeLikeRight(Integer roomType){
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
    public DevRoomPlayerQueryEntityWrapper roomTypeIsNull(){
        isNull("room_type");
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeIsNotNull(){
        isNotNull("room_type");
        return this;
    }

    /**
     * <p>房间类型（0：普通房间，1：小程序试玩房间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper roomTypeIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryEntityWrapper roomTypeIn(Integer... values){
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
    public DevRoomPlayerQueryEntityWrapper roomTypeNotIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryEntityWrapper roomTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_type",values);
        }
        return this;
    }


    /**
     * <p>游族game_id</p>
     * 等于 = entity().getGameId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdEq(){
        Integer gameId =entity().getGameId();
        if(gameId!=null){
            eq("game_id",gameId);
        }
        return this;
    }

    /**
     * <p>游族game_id</p>
     * 不等于 &lt;&gt; entity().getGameId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdNe(){
        Integer gameId =entity().getGameId();
        if(gameId!=null){
            ne("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 大于 &gt; entity().getGameId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdGt(){
        Integer gameId =entity().getGameId();
        if(gameId!=null){
            gt("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 大于等于 &gt;= entity().getGameId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdGe(){
        Integer gameId =entity().getGameId();
        if(gameId!=null){
            ge("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 小于 &lt; entity().getGameId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdLt(){
        Integer gameId =entity().getGameId();
        if(gameId!=null){
            lt("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 小于等于 &lt;= entity().getGameId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdLe(){
        Integer gameId =entity().getGameId();
        if(gameId!=null){
            le("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * BETWEEN  entity().getGameId() AND gameIdEnd
     * @param gameIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdBetween(Integer gameIdEnd){
        Integer gameId =entity().getGameId();
        if(gameId!=null && gameIdEnd!=null){
            between("game_id",gameId,gameIdEnd);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * NOT BETWEEN  entity().getGameId() AND 值2
     * @param gameIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdNotBetween(Integer gameIdEnd){
        Integer gameId =entity().getGameId();
        if(gameId!=null && gameIdEnd!=null){
            notBetween("game_id",gameId,gameIdEnd);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * BETWEEN  entity().getGameId() AND 值2
     * @param gameIdStart       值1
     * @param gameIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdBetween(Integer gameIdStart,Integer gameIdEnd){
        Integer gameId =entity().getGameId();
        if(gameId!=null && gameIdEnd!=null){
            between("game_id",gameIdStart,gameIdEnd);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * NOT BETWEEN  entity().getGameId() AND 值2
     * @param gameIdStart       值1
     * @param gameIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdNotBetween(Integer gameIdStart,Integer gameIdEnd){
        Integer gameId =entity().getGameId();
        if(gameId!=null && gameIdEnd!=null){
            notBetween("game_id",gameIdStart,gameIdEnd);
        }
        return this;
     }


    /**
     * <p>游族game_id</p>
     * LIKE '%值%'  entity().getGameId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdLike(){
        Integer gameId =entity().getGameId();
        if(gameId!=null){
            like("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * NOT LIKE '%值%'  entity().getGameId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdNotLike(){
        Integer gameId =entity().getGameId();
        if(gameId!=null){
            notLike("game_id",gameId);
        }
        return this;
     }


    /**
     * <p>游族game_id</p>
     * LIKE '%值'  entity().getGameId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdLikeLeft(){
        Integer gameId =entity().getGameId();
        if(gameId!=null){
            likeLeft("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * LIKE '值%'  entity().getGameId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdLikeRight(){
        Integer gameId =entity().getGameId();
        if(gameId!=null){
            likeRight("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * 等于 =
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdEq(Integer gameId){
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
    public DevRoomPlayerQueryEntityWrapper gameIdNe(Integer gameId){
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
    public DevRoomPlayerQueryEntityWrapper gameIdGt(Integer gameId){
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
    public DevRoomPlayerQueryEntityWrapper gameIdGe(Integer gameId){
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
    public DevRoomPlayerQueryEntityWrapper gameIdLt(Integer gameId){
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
    public DevRoomPlayerQueryEntityWrapper gameIdLe(Integer gameId){
        if(gameId!=null){
            le("game_id",gameId);
        }
        return this;
     }

    /**
     * <p>游族game_id</p>
     * LIKE '%值%'
     * @param gameId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdLike(Integer gameId){
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
    public DevRoomPlayerQueryEntityWrapper gameIdNotLike(Integer gameId){
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
    public DevRoomPlayerQueryEntityWrapper gameIdLikeLeft(Integer gameId){
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
    public DevRoomPlayerQueryEntityWrapper gameIdLikeRight(Integer gameId){
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
    public DevRoomPlayerQueryEntityWrapper gameIdIsNull(){
        isNull("game_id");
        return this;
    }

    /**
     * <p>游族game_id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdIsNotNull(){
        isNotNull("game_id");
        return this;
    }

    /**
     * <p>游族game_id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper gameIdIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryEntityWrapper gameIdIn(Integer... values){
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
    public DevRoomPlayerQueryEntityWrapper gameIdNotIn(Collection<Integer> value){
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
    public DevRoomPlayerQueryEntityWrapper gameIdNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("game_id",values);
        }
        return this;
    }


    /**
     * <p>游族session_id</p>
     * 等于 = entity().getSessionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdEq(){
        String sessionId =entity().getSessionId();
        if(sessionId!=null){
            eq("session_id",sessionId);
        }
        return this;
    }

    /**
     * <p>游族session_id</p>
     * 不等于 &lt;&gt; entity().getSessionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdNe(){
        String sessionId =entity().getSessionId();
        if(sessionId!=null){
            ne("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 大于 &gt; entity().getSessionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdGt(){
        String sessionId =entity().getSessionId();
        if(sessionId!=null){
            gt("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 大于等于 &gt;= entity().getSessionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdGe(){
        String sessionId =entity().getSessionId();
        if(sessionId!=null){
            ge("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 小于 &lt; entity().getSessionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdLt(){
        String sessionId =entity().getSessionId();
        if(sessionId!=null){
            lt("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 小于等于 &lt;= entity().getSessionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdLe(){
        String sessionId =entity().getSessionId();
        if(sessionId!=null){
            le("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * BETWEEN  entity().getSessionId() AND sessionIdEnd
     * @param sessionIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdBetween(String sessionIdEnd){
        String sessionId =entity().getSessionId();
        if(sessionId!=null && sessionIdEnd!=null){
            between("session_id",sessionId,sessionIdEnd);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * NOT BETWEEN  entity().getSessionId() AND 值2
     * @param sessionIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdNotBetween(String sessionIdEnd){
        String sessionId =entity().getSessionId();
        if(sessionId!=null && sessionIdEnd!=null){
            notBetween("session_id",sessionId,sessionIdEnd);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * BETWEEN  entity().getSessionId() AND 值2
     * @param sessionIdStart       值1
     * @param sessionIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdBetween(String sessionIdStart,String sessionIdEnd){
        String sessionId =entity().getSessionId();
        if(sessionId!=null && sessionIdEnd!=null){
            between("session_id",sessionIdStart,sessionIdEnd);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * NOT BETWEEN  entity().getSessionId() AND 值2
     * @param sessionIdStart       值1
     * @param sessionIdEnd      值2
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdNotBetween(String sessionIdStart,String sessionIdEnd){
        String sessionId =entity().getSessionId();
        if(sessionId!=null && sessionIdEnd!=null){
            notBetween("session_id",sessionIdStart,sessionIdEnd);
        }
        return this;
     }


    /**
     * <p>游族session_id</p>
     * LIKE '%值%'  entity().getSessionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdLike(){
        String sessionId =entity().getSessionId();
        if(sessionId!=null){
            like("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * NOT LIKE '%值%'  entity().getSessionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdNotLike(){
        String sessionId =entity().getSessionId();
        if(sessionId!=null){
            notLike("session_id",sessionId);
        }
        return this;
     }


    /**
     * <p>游族session_id</p>
     * LIKE '%值'  entity().getSessionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdLikeLeft(){
        String sessionId =entity().getSessionId();
        if(sessionId!=null){
            likeLeft("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * LIKE '值%'  entity().getSessionId()
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdLikeRight(){
        String sessionId =entity().getSessionId();
        if(sessionId!=null){
            likeRight("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * 等于 =
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdEq(String sessionId){
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
    public DevRoomPlayerQueryEntityWrapper sessionIdNe(String sessionId){
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
    public DevRoomPlayerQueryEntityWrapper sessionIdGt(String sessionId){
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
    public DevRoomPlayerQueryEntityWrapper sessionIdGe(String sessionId){
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
    public DevRoomPlayerQueryEntityWrapper sessionIdLt(String sessionId){
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
    public DevRoomPlayerQueryEntityWrapper sessionIdLe(String sessionId){
        if(sessionId!=null){
            le("session_id",sessionId);
        }
        return this;
     }

    /**
     * <p>游族session_id</p>
     * LIKE '%值%'
     * @param sessionId       值
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdLike(String sessionId){
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
    public DevRoomPlayerQueryEntityWrapper sessionIdNotLike(String sessionId){
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
    public DevRoomPlayerQueryEntityWrapper sessionIdLikeLeft(String sessionId){
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
    public DevRoomPlayerQueryEntityWrapper sessionIdLikeRight(String sessionId){
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
    public DevRoomPlayerQueryEntityWrapper sessionIdIsNull(){
        isNull("session_id");
        return this;
    }

    /**
     * <p>游族session_id</p>
     * IS NOT NULL
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdIsNotNull(){
        isNotNull("session_id");
        return this;
    }

    /**
     * <p>游族session_id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public DevRoomPlayerQueryEntityWrapper sessionIdIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper sessionIdIn(String... values){
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
    public DevRoomPlayerQueryEntityWrapper sessionIdNotIn(Collection<String> value){
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
    public DevRoomPlayerQueryEntityWrapper sessionIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("session_id",values);
        }
        return this;
    }



}
