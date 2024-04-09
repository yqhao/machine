package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.YunMemberHangUp;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 商户挂机时长表
 * </p>
 * "yun_member_hang_up"
 * @author PC001
 */
public class YunMemberHangUpQueryEntityWrapper extends QueryWrapper<YunMemberHangUp> {

    public static YunMemberHangUpQueryEntityWrapper wrapper(YunMemberHangUp entity) {
        return new YunMemberHangUpQueryEntityWrapper(entity);
    }

    private YunMemberHangUp entity;

    public YunMemberHangUpQueryEntityWrapper(YunMemberHangUp entity) {
         this.entity=entity;
    }


    protected YunMemberHangUp entity() {
        if(entity==null){
            throw new NullPointerException("YunMemberHangUp is null");
        }
        return entity;
    }

    @Override
    public YunMemberHangUpQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public YunMemberHangUpQueryEntityWrapper selectColumns(Consumer<YunMemberHangUpSelect> consumer) {
        YunMemberHangUpSelect select = new YunMemberHangUpSelect();
        consumer.accept(select);
        String[] columns = select.select();
        //if(columns!=null && columns.length>0) {
        super.select(columns);
        //}
        return this;
    }

    /**
     * <p>id</p>
     * 等于 = entity().getId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper idEq(){
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
    public YunMemberHangUpQueryEntityWrapper idNe(){
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
    public YunMemberHangUpQueryEntityWrapper idGt(){
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
    public YunMemberHangUpQueryEntityWrapper idGe(){
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
    public YunMemberHangUpQueryEntityWrapper idLt(){
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
    public YunMemberHangUpQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper idBetween(Long idEnd){
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
    public YunMemberHangUpQueryEntityWrapper idNotBetween(Long idEnd){
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
    public YunMemberHangUpQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public YunMemberHangUpQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p>id</p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p>id</p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper idLikeRight(){
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
    public YunMemberHangUpQueryEntityWrapper idEq(Long id){
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
    public YunMemberHangUpQueryEntityWrapper idNe(Long id){
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
    public YunMemberHangUpQueryEntityWrapper idGt(Long id){
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
    public YunMemberHangUpQueryEntityWrapper idGe(Long id){
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
    public YunMemberHangUpQueryEntityWrapper idLt(Long id){
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
    public YunMemberHangUpQueryEntityWrapper idLe(Long id){
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
    public YunMemberHangUpQueryEntityWrapper idLike(Long id){
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
    public YunMemberHangUpQueryEntityWrapper idNotLike(Long id){
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
    public YunMemberHangUpQueryEntityWrapper idLikeLeft(Long id){
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
    public YunMemberHangUpQueryEntityWrapper idLikeRight(Long id){
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
    public YunMemberHangUpQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper idIn(Collection<Long> value){
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
    public YunMemberHangUpQueryEntityWrapper idIn(Long... values){
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
    public YunMemberHangUpQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public YunMemberHangUpQueryEntityWrapper idNotIn(Long... values){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdEq(){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdNe(){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdGt(){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdGe(){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdLt(){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdLe(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            le("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * BETWEEN  entity().getFkMemberId() AND fkMemberIdEnd
     * @param fkMemberIdEnd      值2
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper fkMemberIdBetween(Long fkMemberIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdNotBetween(Long fkMemberIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null && fkMemberIdEnd!=null){
            notBetween("fk_member_id",fkMemberIdStart,fkMemberIdEnd);
        }
        return this;
     }


    /**
     * <p>商户id</p>
     * LIKE '%值%'  entity().getFkMemberId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper fkMemberIdLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            like("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * NOT LIKE '%值%'  entity().getFkMemberId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper fkMemberIdNotLike(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            notLike("fk_member_id",fkMemberId);
        }
        return this;
     }


    /**
     * <p>商户id</p>
     * LIKE '%值'  entity().getFkMemberId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper fkMemberIdLikeLeft(){
        Long fkMemberId =entity().getFkMemberId();
        if(fkMemberId!=null){
            likeLeft("fk_member_id",fkMemberId);
        }
        return this;
     }

    /**
     * <p>商户id</p>
     * LIKE '值%'  entity().getFkMemberId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper fkMemberIdLikeRight(){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdEq(Long fkMemberId){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdNe(Long fkMemberId){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdGt(Long fkMemberId){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdGe(Long fkMemberId){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdLt(Long fkMemberId){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdLe(Long fkMemberId){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdLike(Long fkMemberId){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdNotLike(Long fkMemberId){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdLikeLeft(Long fkMemberId){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper fkMemberIdIn(Collection<Long> value){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdIn(Long... values){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public YunMemberHangUpQueryEntityWrapper fkMemberIdNotIn(Long... values){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionEq(){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionNe(){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionGt(){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionGe(){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionLt(){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionLe(){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionBetween(String roomSessionEnd){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionNotBetween(String roomSessionEnd){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionBetween(String roomSessionStart,String roomSessionEnd){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionNotBetween(String roomSessionStart,String roomSessionEnd){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionLike(){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionNotLike(){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionLikeLeft(){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionLikeRight(){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionEq(String roomSession){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionNe(String roomSession){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionGt(String roomSession){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionGe(String roomSession){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionLt(String roomSession){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionLe(String roomSession){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionLike(String roomSession){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionNotLike(String roomSession){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionLikeLeft(String roomSession){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionLikeRight(String roomSession){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionIsNull(){
        isNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper roomSessionIsNotNull(){
        isNotNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper roomSessionIn(Collection<String> value){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionIn(String... values){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionNotIn(Collection<String> value){
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
    public YunMemberHangUpQueryEntityWrapper roomSessionNotIn(String... values){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdEq(){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdNe(){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdGt(){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdGe(){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdLt(){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdLe(){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdLike(){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdNotLike(){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdLikeLeft(){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdLikeRight(){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdEq(String deviceId){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdNe(String deviceId){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdGt(String deviceId){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdGe(String deviceId){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdLt(String deviceId){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdLe(String deviceId){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdLike(String deviceId){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdNotLike(String deviceId){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdLikeRight(String deviceId){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper deviceIdIn(Collection<String> value){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdIn(String... values){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public YunMemberHangUpQueryEntityWrapper deviceIdNotIn(String... values){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdEq(){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdNe(){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdGt(){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdGe(){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdLt(){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdLe(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            le("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * BETWEEN  entity().getPhoneId() AND phoneIdEnd
     * @param phoneIdEnd      值2
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper phoneIdBetween(String phoneIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdNotBetween(String phoneIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdBetween(String phoneIdStart,String phoneIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdNotBetween(String phoneIdStart,String phoneIdEnd){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null && phoneIdEnd!=null){
            notBetween("phone_id",phoneIdStart,phoneIdEnd);
        }
        return this;
     }


    /**
     * <p>玩家ID</p>
     * LIKE '%值%'  entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper phoneIdLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            like("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * NOT LIKE '%值%'  entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper phoneIdNotLike(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            notLike("phone_id",phoneId);
        }
        return this;
     }


    /**
     * <p>玩家ID</p>
     * LIKE '%值'  entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper phoneIdLikeLeft(){
        String phoneId =entity().getPhoneId();
        if(phoneId!=null){
            likeLeft("phone_id",phoneId);
        }
        return this;
     }

    /**
     * <p>玩家ID</p>
     * LIKE '值%'  entity().getPhoneId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper phoneIdLikeRight(){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdEq(String phoneId){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdNe(String phoneId){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdGt(String phoneId){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdGe(String phoneId){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdLt(String phoneId){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdLe(String phoneId){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdLike(String phoneId){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdNotLike(String phoneId){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdLikeLeft(String phoneId){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdLikeRight(String phoneId){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdIsNull(){
        isNull("phone_id");
        return this;
    }

    /**
     * <p>玩家ID</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper phoneIdIsNotNull(){
        isNotNull("phone_id");
        return this;
    }

    /**
     * <p>玩家ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper phoneIdIn(Collection<String> value){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdIn(String... values){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdNotIn(Collection<String> value){
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
    public YunMemberHangUpQueryEntityWrapper phoneIdNotIn(String... values){
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
    public YunMemberHangUpQueryEntityWrapper pkgEq(){
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
    public YunMemberHangUpQueryEntityWrapper pkgNe(){
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
    public YunMemberHangUpQueryEntityWrapper pkgGt(){
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
    public YunMemberHangUpQueryEntityWrapper pkgGe(){
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
    public YunMemberHangUpQueryEntityWrapper pkgLt(){
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
    public YunMemberHangUpQueryEntityWrapper pkgLe(){
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
    public YunMemberHangUpQueryEntityWrapper pkgBetween(String pkgEnd){
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
    public YunMemberHangUpQueryEntityWrapper pkgNotBetween(String pkgEnd){
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
    public YunMemberHangUpQueryEntityWrapper pkgBetween(String pkgStart,String pkgEnd){
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
    public YunMemberHangUpQueryEntityWrapper pkgNotBetween(String pkgStart,String pkgEnd){
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
    public YunMemberHangUpQueryEntityWrapper pkgLike(){
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
    public YunMemberHangUpQueryEntityWrapper pkgNotLike(){
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
    public YunMemberHangUpQueryEntityWrapper pkgLikeLeft(){
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
    public YunMemberHangUpQueryEntityWrapper pkgLikeRight(){
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
    public YunMemberHangUpQueryEntityWrapper pkgEq(String pkg){
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
    public YunMemberHangUpQueryEntityWrapper pkgNe(String pkg){
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
    public YunMemberHangUpQueryEntityWrapper pkgGt(String pkg){
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
    public YunMemberHangUpQueryEntityWrapper pkgGe(String pkg){
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
    public YunMemberHangUpQueryEntityWrapper pkgLt(String pkg){
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
    public YunMemberHangUpQueryEntityWrapper pkgLe(String pkg){
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
    public YunMemberHangUpQueryEntityWrapper pkgLike(String pkg){
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
    public YunMemberHangUpQueryEntityWrapper pkgNotLike(String pkg){
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
    public YunMemberHangUpQueryEntityWrapper pkgLikeLeft(String pkg){
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
    public YunMemberHangUpQueryEntityWrapper pkgLikeRight(String pkg){
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
    public YunMemberHangUpQueryEntityWrapper pkgIsNull(){
        isNull("pkg");
        return this;
    }

    /**
     * <p>应用包名</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper pkgIsNotNull(){
        isNotNull("pkg");
        return this;
    }

    /**
     * <p>应用包名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper pkgIn(Collection<String> value){
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
    public YunMemberHangUpQueryEntityWrapper pkgIn(String... values){
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
    public YunMemberHangUpQueryEntityWrapper pkgNotIn(Collection<String> value){
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
    public YunMemberHangUpQueryEntityWrapper pkgNotIn(String... values){
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
    public YunMemberHangUpQueryEntityWrapper statusEq(){
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
    public YunMemberHangUpQueryEntityWrapper statusNe(){
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
    public YunMemberHangUpQueryEntityWrapper statusGt(){
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
    public YunMemberHangUpQueryEntityWrapper statusGe(){
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
    public YunMemberHangUpQueryEntityWrapper statusLt(){
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
    public YunMemberHangUpQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper statusBetween(Integer statusEnd){
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
    public YunMemberHangUpQueryEntityWrapper statusNotBetween(Integer statusEnd){
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
    public YunMemberHangUpQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
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
    public YunMemberHangUpQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper statusLikeRight(){
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
    public YunMemberHangUpQueryEntityWrapper statusEq(Integer status){
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
    public YunMemberHangUpQueryEntityWrapper statusNe(Integer status){
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
    public YunMemberHangUpQueryEntityWrapper statusGt(Integer status){
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
    public YunMemberHangUpQueryEntityWrapper statusGe(Integer status){
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
    public YunMemberHangUpQueryEntityWrapper statusLt(Integer status){
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
    public YunMemberHangUpQueryEntityWrapper statusLe(Integer status){
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
    public YunMemberHangUpQueryEntityWrapper statusLike(Integer status){
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
    public YunMemberHangUpQueryEntityWrapper statusNotLike(Integer status){
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
    public YunMemberHangUpQueryEntityWrapper statusLikeLeft(Integer status){
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
    public YunMemberHangUpQueryEntityWrapper statusLikeRight(Integer status){
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
    public YunMemberHangUpQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>状态(0：已退出，5：in，10：out，15：idle)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper statusIn(Collection<Integer> value){
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
    public YunMemberHangUpQueryEntityWrapper statusIn(Integer... values){
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
    public YunMemberHangUpQueryEntityWrapper statusNotIn(Collection<Integer> value){
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
    public YunMemberHangUpQueryEntityWrapper statusNotIn(Integer... values){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeEq(){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeNe(){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeGt(){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeGe(){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeLt(){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeLe(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            le("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * BETWEEN  entity().getHangUpTime() AND hangUpTimeEnd
     * @param hangUpTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpTimeBetween(Long hangUpTimeEnd){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeNotBetween(Long hangUpTimeEnd){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeBetween(Long hangUpTimeStart,Long hangUpTimeEnd){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeNotBetween(Long hangUpTimeStart,Long hangUpTimeEnd){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null && hangUpTimeEnd!=null){
            notBetween("hang_up_time",hangUpTimeStart,hangUpTimeEnd);
        }
        return this;
     }


    /**
     * <p>挂机时长单位（秒）</p>
     * LIKE '%值%'  entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpTimeLike(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            like("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * NOT LIKE '%值%'  entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpTimeNotLike(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            notLike("hang_up_time",hangUpTime);
        }
        return this;
     }


    /**
     * <p>挂机时长单位（秒）</p>
     * LIKE '%值'  entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpTimeLikeLeft(){
        Long hangUpTime =entity().getHangUpTime();
        if(hangUpTime!=null){
            likeLeft("hang_up_time",hangUpTime);
        }
        return this;
     }

    /**
     * <p>挂机时长单位（秒）</p>
     * LIKE '值%'  entity().getHangUpTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpTimeLikeRight(){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeEq(Long hangUpTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeNe(Long hangUpTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeGt(Long hangUpTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeGe(Long hangUpTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeLt(Long hangUpTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeLe(Long hangUpTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeLike(Long hangUpTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeNotLike(Long hangUpTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeLikeLeft(Long hangUpTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeLikeRight(Long hangUpTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeIsNull(){
        isNull("hang_up_time");
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpTimeIsNotNull(){
        isNotNull("hang_up_time");
        return this;
    }

    /**
     * <p>挂机时长单位（秒）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpTimeIn(Collection<Long> value){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeIn(Long... values){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeNotIn(Collection<Long> value){
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
    public YunMemberHangUpQueryEntityWrapper hangUpTimeNotIn(Long... values){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeEq(){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeNe(){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeGt(){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeGe(){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeLt(){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeLe(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            le("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * BETWEEN  entity().getHangUpMaturityTime() AND hangUpMaturityTimeEnd
     * @param hangUpMaturityTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeBetween(Date hangUpMaturityTimeEnd){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeNotBetween(Date hangUpMaturityTimeEnd){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeBetween(Date hangUpMaturityTimeStart,Date hangUpMaturityTimeEnd){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeNotBetween(Date hangUpMaturityTimeStart,Date hangUpMaturityTimeEnd){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null && hangUpMaturityTimeEnd!=null){
            notBetween("hang_up_maturity_time",hangUpMaturityTimeStart,hangUpMaturityTimeEnd);
        }
        return this;
     }


    /**
     * <p>挂机到期时间</p>
     * LIKE '%值%'  entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeLike(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            like("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * NOT LIKE '%值%'  entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeNotLike(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            notLike("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }


    /**
     * <p>挂机到期时间</p>
     * LIKE '%值'  entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeLikeLeft(){
        Date hangUpMaturityTime =entity().getHangUpMaturityTime();
        if(hangUpMaturityTime!=null){
            likeLeft("hang_up_maturity_time",hangUpMaturityTime);
        }
        return this;
     }

    /**
     * <p>挂机到期时间</p>
     * LIKE '值%'  entity().getHangUpMaturityTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeLikeRight(){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeEq(Date hangUpMaturityTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeNe(Date hangUpMaturityTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeGt(Date hangUpMaturityTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeGe(Date hangUpMaturityTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeLt(Date hangUpMaturityTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeLe(Date hangUpMaturityTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeLike(Date hangUpMaturityTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeNotLike(Date hangUpMaturityTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeLikeLeft(Date hangUpMaturityTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeLikeRight(Date hangUpMaturityTime){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeIsNull(){
        isNull("hang_up_maturity_time");
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeIsNotNull(){
        isNotNull("hang_up_maturity_time");
        return this;
    }

    /**
     * <p>挂机到期时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeIn(Collection<Date> value){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeIn(Date... values){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeNotIn(Collection<Date> value){
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
    public YunMemberHangUpQueryEntityWrapper hangUpMaturityTimeNotIn(Date... values){
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
    public YunMemberHangUpQueryEntityWrapper createTimeEq(){
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
    public YunMemberHangUpQueryEntityWrapper createTimeNe(){
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
    public YunMemberHangUpQueryEntityWrapper createTimeGt(){
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
    public YunMemberHangUpQueryEntityWrapper createTimeGe(){
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
    public YunMemberHangUpQueryEntityWrapper createTimeLt(){
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
    public YunMemberHangUpQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public YunMemberHangUpQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public YunMemberHangUpQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberHangUpQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>创建时间</p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>创建时间</p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper createTimeLikeRight(){
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
    public YunMemberHangUpQueryEntityWrapper createTimeEq(Date createTime){
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
    public YunMemberHangUpQueryEntityWrapper createTimeNe(Date createTime){
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
    public YunMemberHangUpQueryEntityWrapper createTimeGt(Date createTime){
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
    public YunMemberHangUpQueryEntityWrapper createTimeGe(Date createTime){
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
    public YunMemberHangUpQueryEntityWrapper createTimeLt(Date createTime){
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
    public YunMemberHangUpQueryEntityWrapper createTimeLe(Date createTime){
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
    public YunMemberHangUpQueryEntityWrapper createTimeLike(Date createTime){
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
    public YunMemberHangUpQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public YunMemberHangUpQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public YunMemberHangUpQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public YunMemberHangUpQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public YunMemberHangUpQueryEntityWrapper createTimeIn(Date... values){
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
    public YunMemberHangUpQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public YunMemberHangUpQueryEntityWrapper createTimeNotIn(Date... values){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeEq(){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeNe(){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeGt(){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeGe(){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeLt(){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最近修改时间</p>
     * LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最近修改时间</p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最近修改时间</p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeLikeRight(){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最近修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public YunMemberHangUpQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
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
    public YunMemberHangUpQueryEntityWrapper versionIdEq(){
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
    public YunMemberHangUpQueryEntityWrapper versionIdNe(){
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
    public YunMemberHangUpQueryEntityWrapper versionIdGt(){
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
    public YunMemberHangUpQueryEntityWrapper versionIdGe(){
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
    public YunMemberHangUpQueryEntityWrapper versionIdLt(){
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
    public YunMemberHangUpQueryEntityWrapper versionIdLe(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            le("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getVersionId() AND versionIdEnd
     * @param versionIdEnd      值2
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberHangUpQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
        Long versionId =entity().getVersionId();
        if(versionId!=null && versionIdEnd!=null){
            notBetween("version_id",versionIdStart,versionIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper versionIdLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            like("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getVersionId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper versionIdNotLike(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            notLike("version_id",versionId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getVersionId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper versionIdLikeLeft(){
        Long versionId =entity().getVersionId();
        if(versionId!=null){
            likeLeft("version_id",versionId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getVersionId()
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper versionIdLikeRight(){
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
    public YunMemberHangUpQueryEntityWrapper versionIdEq(Long versionId){
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
    public YunMemberHangUpQueryEntityWrapper versionIdNe(Long versionId){
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
    public YunMemberHangUpQueryEntityWrapper versionIdGt(Long versionId){
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
    public YunMemberHangUpQueryEntityWrapper versionIdGe(Long versionId){
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
    public YunMemberHangUpQueryEntityWrapper versionIdLt(Long versionId){
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
    public YunMemberHangUpQueryEntityWrapper versionIdLe(Long versionId){
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
    public YunMemberHangUpQueryEntityWrapper versionIdLike(Long versionId){
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
    public YunMemberHangUpQueryEntityWrapper versionIdNotLike(Long versionId){
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
    public YunMemberHangUpQueryEntityWrapper versionIdLikeLeft(Long versionId){
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
    public YunMemberHangUpQueryEntityWrapper versionIdLikeRight(Long versionId){
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
    public YunMemberHangUpQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberHangUpQueryEntityWrapper versionIdIn(Collection<Long> value){
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
    public YunMemberHangUpQueryEntityWrapper versionIdIn(Long... values){
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
    public YunMemberHangUpQueryEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public YunMemberHangUpQueryEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }



}
