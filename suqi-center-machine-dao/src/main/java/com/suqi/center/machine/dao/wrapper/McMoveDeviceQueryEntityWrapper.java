package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.McMoveDevice;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 
 * </p>
 * "mc_move_device"
 * @author PC001
 */
public class McMoveDeviceQueryEntityWrapper extends QueryWrapper<McMoveDevice> {

    public static McMoveDeviceQueryEntityWrapper wrapper(McMoveDevice entity) {
        return new McMoveDeviceQueryEntityWrapper(entity);
    }

    private McMoveDevice entity;

    public McMoveDeviceQueryEntityWrapper(McMoveDevice entity) {
         this.entity=entity;
    }


    protected McMoveDevice entity() {
        if(entity==null){
            throw new NullPointerException("McMoveDevice is null");
        }
        return entity;
    }

    @Override
    public McMoveDeviceQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public McMoveDeviceQueryEntityWrapper selectColumns(Consumer<McMoveDeviceSelect> consumer) {
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
     * 等于 = entity().getId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idEq(){
        Long id =entity().getId();
        if(id!=null){
            eq("id",id);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idNe(){
        Long id =entity().getId();
        if(id!=null){
            ne("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idGt(){
        Long id =entity().getId();
        if(id!=null){
            gt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idGe(){
        Long id =entity().getId();
        if(id!=null){
            ge("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idLt(){
        Long id =entity().getId();
        if(id!=null){
            lt("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idLe(){
        Long id =entity().getId();
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND idEnd
     * @param idEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idNotBetween(Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",id,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            between("id",idStart,idEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getId() AND 值2
     * @param idStart       值1
     * @param idEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
        Long id =entity().getId();
        if(id!=null && idEnd!=null){
            notBetween("id",idStart,idEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idLike(){
        Long id =entity().getId();
        if(id!=null){
            like("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idNotLike(){
        Long id =entity().getId();
        if(id!=null){
            notLike("id",id);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idLikeLeft(){
        Long id =entity().getId();
        if(id!=null){
            likeLeft("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idLikeRight(){
        Long id =entity().getId();
        if(id!=null){
            likeRight("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param id       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idEq(Long id){
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
    public McMoveDeviceQueryEntityWrapper idNe(Long id){
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
    public McMoveDeviceQueryEntityWrapper idGt(Long id){
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
    public McMoveDeviceQueryEntityWrapper idGe(Long id){
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
    public McMoveDeviceQueryEntityWrapper idLt(Long id){
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
    public McMoveDeviceQueryEntityWrapper idLe(Long id){
        if(id!=null){
            le("id",id);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param id       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idLike(Long id){
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
    public McMoveDeviceQueryEntityWrapper idNotLike(Long id){
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
    public McMoveDeviceQueryEntityWrapper idLikeLeft(Long id){
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
    public McMoveDeviceQueryEntityWrapper idLikeRight(Long id){
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
    public McMoveDeviceQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper idIn(Collection<Long> value){
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
    public McMoveDeviceQueryEntityWrapper idIn(Long... values){
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
    public McMoveDeviceQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public McMoveDeviceQueryEntityWrapper idNotIn(Long... values){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdEq(){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdNe(){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdGt(){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdGe(){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdLt(){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdLe(){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdBetween(Long fkMemberIdEnd){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdNotBetween(Long fkMemberIdEnd){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdLike(){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdNotLike(){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdLikeLeft(){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdLikeRight(){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdEq(Long fkMemberId){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdNe(Long fkMemberId){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdGt(Long fkMemberId){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdGe(Long fkMemberId){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdLt(Long fkMemberId){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdLe(Long fkMemberId){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdLike(Long fkMemberId){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdNotLike(Long fkMemberId){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdLikeLeft(Long fkMemberId){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>商户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fkMemberIdIn(Collection<Long> value){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdIn(Long... values){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public McMoveDeviceQueryEntityWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getUserPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdEq(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            eq("user_phone_id",userPhoneId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getUserPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdNe(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            ne("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getUserPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdGt(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            gt("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getUserPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdGe(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            ge("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getUserPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdLt(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            lt("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getUserPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdLe(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            le("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getUserPhoneId() AND userPhoneIdEnd
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdBetween(String userPhoneIdEnd){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null && userPhoneIdEnd!=null){
            between("user_phone_id",userPhoneId,userPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getUserPhoneId() AND 值2
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdNotBetween(String userPhoneIdEnd){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null && userPhoneIdEnd!=null){
            notBetween("user_phone_id",userPhoneId,userPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getUserPhoneId() AND 值2
     * @param userPhoneIdStart       值1
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdBetween(String userPhoneIdStart,String userPhoneIdEnd){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null && userPhoneIdEnd!=null){
            between("user_phone_id",userPhoneIdStart,userPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getUserPhoneId() AND 值2
     * @param userPhoneIdStart       值1
     * @param userPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdNotBetween(String userPhoneIdStart,String userPhoneIdEnd){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null && userPhoneIdEnd!=null){
            notBetween("user_phone_id",userPhoneIdStart,userPhoneIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getUserPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdLike(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            like("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getUserPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdNotLike(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            notLike("user_phone_id",userPhoneId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getUserPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdLikeLeft(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            likeLeft("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getUserPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdLikeRight(){
        String userPhoneId =entity().getUserPhoneId();
        if(userPhoneId!=null){
            likeRight("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdEq(String userPhoneId){
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
    public McMoveDeviceQueryEntityWrapper userPhoneIdNe(String userPhoneId){
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
    public McMoveDeviceQueryEntityWrapper userPhoneIdGt(String userPhoneId){
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
    public McMoveDeviceQueryEntityWrapper userPhoneIdGe(String userPhoneId){
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
    public McMoveDeviceQueryEntityWrapper userPhoneIdLt(String userPhoneId){
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
    public McMoveDeviceQueryEntityWrapper userPhoneIdLe(String userPhoneId){
        if(userPhoneId!=null){
            le("user_phone_id",userPhoneId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param userPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdLike(String userPhoneId){
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
    public McMoveDeviceQueryEntityWrapper userPhoneIdNotLike(String userPhoneId){
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
    public McMoveDeviceQueryEntityWrapper userPhoneIdLikeLeft(String userPhoneId){
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
    public McMoveDeviceQueryEntityWrapper userPhoneIdLikeRight(String userPhoneId){
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
    public McMoveDeviceQueryEntityWrapper userPhoneIdIsNull(){
        isNull("user_phone_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdIsNotNull(){
        isNotNull("user_phone_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper userPhoneIdIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper userPhoneIdIn(String... values){
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
    public McMoveDeviceQueryEntityWrapper userPhoneIdNotIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper userPhoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_phone_id",values);
        }
        return this;
    }


    /**
     * <p>旧设备id</p>
     * 等于 = entity().getFromDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdEq(){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null){
            eq("from_device_id",fromDeviceId);
        }
        return this;
    }

    /**
     * <p>旧设备id</p>
     * 不等于 &lt;&gt; entity().getFromDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdNe(){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null){
            ne("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 大于 &gt; entity().getFromDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdGt(){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null){
            gt("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 大于等于 &gt;= entity().getFromDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdGe(){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null){
            ge("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 小于 &lt; entity().getFromDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdLt(){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null){
            lt("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 小于等于 &lt;= entity().getFromDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdLe(){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null){
            le("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * BETWEEN  entity().getFromDeviceId() AND fromDeviceIdEnd
     * @param fromDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdBetween(String fromDeviceIdEnd){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null && fromDeviceIdEnd!=null){
            between("from_device_id",fromDeviceId,fromDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * NOT BETWEEN  entity().getFromDeviceId() AND 值2
     * @param fromDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdNotBetween(String fromDeviceIdEnd){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null && fromDeviceIdEnd!=null){
            notBetween("from_device_id",fromDeviceId,fromDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * BETWEEN  entity().getFromDeviceId() AND 值2
     * @param fromDeviceIdStart       值1
     * @param fromDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdBetween(String fromDeviceIdStart,String fromDeviceIdEnd){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null && fromDeviceIdEnd!=null){
            between("from_device_id",fromDeviceIdStart,fromDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * NOT BETWEEN  entity().getFromDeviceId() AND 值2
     * @param fromDeviceIdStart       值1
     * @param fromDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdNotBetween(String fromDeviceIdStart,String fromDeviceIdEnd){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null && fromDeviceIdEnd!=null){
            notBetween("from_device_id",fromDeviceIdStart,fromDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>旧设备id</p>
     * LIKE '%值%'  entity().getFromDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdLike(){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null){
            like("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * NOT LIKE '%值%'  entity().getFromDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdNotLike(){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null){
            notLike("from_device_id",fromDeviceId);
        }
        return this;
     }


    /**
     * <p>旧设备id</p>
     * LIKE '%值'  entity().getFromDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdLikeLeft(){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null){
            likeLeft("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * LIKE '值%'  entity().getFromDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdLikeRight(){
        String fromDeviceId =entity().getFromDeviceId();
        if(fromDeviceId!=null){
            likeRight("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * 等于 =
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdEq(String fromDeviceId){
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
    public McMoveDeviceQueryEntityWrapper fromDeviceIdNe(String fromDeviceId){
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
    public McMoveDeviceQueryEntityWrapper fromDeviceIdGt(String fromDeviceId){
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
    public McMoveDeviceQueryEntityWrapper fromDeviceIdGe(String fromDeviceId){
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
    public McMoveDeviceQueryEntityWrapper fromDeviceIdLt(String fromDeviceId){
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
    public McMoveDeviceQueryEntityWrapper fromDeviceIdLe(String fromDeviceId){
        if(fromDeviceId!=null){
            le("from_device_id",fromDeviceId);
        }
        return this;
     }

    /**
     * <p>旧设备id</p>
     * LIKE '%值%'
     * @param fromDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdLike(String fromDeviceId){
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
    public McMoveDeviceQueryEntityWrapper fromDeviceIdNotLike(String fromDeviceId){
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
    public McMoveDeviceQueryEntityWrapper fromDeviceIdLikeLeft(String fromDeviceId){
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
    public McMoveDeviceQueryEntityWrapper fromDeviceIdLikeRight(String fromDeviceId){
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
    public McMoveDeviceQueryEntityWrapper fromDeviceIdIsNull(){
        isNull("from_device_id");
        return this;
    }

    /**
     * <p>旧设备id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdIsNotNull(){
        isNotNull("from_device_id");
        return this;
    }

    /**
     * <p>旧设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromDeviceIdIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper fromDeviceIdIn(String... values){
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
    public McMoveDeviceQueryEntityWrapper fromDeviceIdNotIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper fromDeviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("from_device_id",values);
        }
        return this;
    }


    /**
     * <p>旧云手机ID</p>
     * 等于 = entity().getFromPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdEq(){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null){
            eq("from_phone_id",fromPhoneId);
        }
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * 不等于 &lt;&gt; entity().getFromPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdNe(){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null){
            ne("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 大于 &gt; entity().getFromPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdGt(){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null){
            gt("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 大于等于 &gt;= entity().getFromPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdGe(){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null){
            ge("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 小于 &lt; entity().getFromPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdLt(){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null){
            lt("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 小于等于 &lt;= entity().getFromPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdLe(){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null){
            le("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * BETWEEN  entity().getFromPhoneId() AND fromPhoneIdEnd
     * @param fromPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdBetween(String fromPhoneIdEnd){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null && fromPhoneIdEnd!=null){
            between("from_phone_id",fromPhoneId,fromPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * NOT BETWEEN  entity().getFromPhoneId() AND 值2
     * @param fromPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdNotBetween(String fromPhoneIdEnd){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null && fromPhoneIdEnd!=null){
            notBetween("from_phone_id",fromPhoneId,fromPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * BETWEEN  entity().getFromPhoneId() AND 值2
     * @param fromPhoneIdStart       值1
     * @param fromPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdBetween(String fromPhoneIdStart,String fromPhoneIdEnd){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null && fromPhoneIdEnd!=null){
            between("from_phone_id",fromPhoneIdStart,fromPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * NOT BETWEEN  entity().getFromPhoneId() AND 值2
     * @param fromPhoneIdStart       值1
     * @param fromPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdNotBetween(String fromPhoneIdStart,String fromPhoneIdEnd){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null && fromPhoneIdEnd!=null){
            notBetween("from_phone_id",fromPhoneIdStart,fromPhoneIdEnd);
        }
        return this;
     }


    /**
     * <p>旧云手机ID</p>
     * LIKE '%值%'  entity().getFromPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdLike(){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null){
            like("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * NOT LIKE '%值%'  entity().getFromPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdNotLike(){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null){
            notLike("from_phone_id",fromPhoneId);
        }
        return this;
     }


    /**
     * <p>旧云手机ID</p>
     * LIKE '%值'  entity().getFromPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdLikeLeft(){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null){
            likeLeft("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * LIKE '值%'  entity().getFromPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdLikeRight(){
        String fromPhoneId =entity().getFromPhoneId();
        if(fromPhoneId!=null){
            likeRight("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * 等于 =
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdEq(String fromPhoneId){
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
    public McMoveDeviceQueryEntityWrapper fromPhoneIdNe(String fromPhoneId){
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
    public McMoveDeviceQueryEntityWrapper fromPhoneIdGt(String fromPhoneId){
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
    public McMoveDeviceQueryEntityWrapper fromPhoneIdGe(String fromPhoneId){
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
    public McMoveDeviceQueryEntityWrapper fromPhoneIdLt(String fromPhoneId){
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
    public McMoveDeviceQueryEntityWrapper fromPhoneIdLe(String fromPhoneId){
        if(fromPhoneId!=null){
            le("from_phone_id",fromPhoneId);
        }
        return this;
     }

    /**
     * <p>旧云手机ID</p>
     * LIKE '%值%'
     * @param fromPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdLike(String fromPhoneId){
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
    public McMoveDeviceQueryEntityWrapper fromPhoneIdNotLike(String fromPhoneId){
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
    public McMoveDeviceQueryEntityWrapper fromPhoneIdLikeLeft(String fromPhoneId){
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
    public McMoveDeviceQueryEntityWrapper fromPhoneIdLikeRight(String fromPhoneId){
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
    public McMoveDeviceQueryEntityWrapper fromPhoneIdIsNull(){
        isNull("from_phone_id");
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdIsNotNull(){
        isNotNull("from_phone_id");
        return this;
    }

    /**
     * <p>旧云手机ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper fromPhoneIdIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper fromPhoneIdIn(String... values){
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
    public McMoveDeviceQueryEntityWrapper fromPhoneIdNotIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper fromPhoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("from_phone_id",values);
        }
        return this;
    }


    /**
     * <p>新设备id</p>
     * 等于 = entity().getToDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdEq(){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null){
            eq("to_device_id",toDeviceId);
        }
        return this;
    }

    /**
     * <p>新设备id</p>
     * 不等于 &lt;&gt; entity().getToDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdNe(){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null){
            ne("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 大于 &gt; entity().getToDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdGt(){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null){
            gt("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 大于等于 &gt;= entity().getToDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdGe(){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null){
            ge("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 小于 &lt; entity().getToDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdLt(){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null){
            lt("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 小于等于 &lt;= entity().getToDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdLe(){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null){
            le("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * BETWEEN  entity().getToDeviceId() AND toDeviceIdEnd
     * @param toDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdBetween(String toDeviceIdEnd){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null && toDeviceIdEnd!=null){
            between("to_device_id",toDeviceId,toDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * NOT BETWEEN  entity().getToDeviceId() AND 值2
     * @param toDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdNotBetween(String toDeviceIdEnd){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null && toDeviceIdEnd!=null){
            notBetween("to_device_id",toDeviceId,toDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * BETWEEN  entity().getToDeviceId() AND 值2
     * @param toDeviceIdStart       值1
     * @param toDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdBetween(String toDeviceIdStart,String toDeviceIdEnd){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null && toDeviceIdEnd!=null){
            between("to_device_id",toDeviceIdStart,toDeviceIdEnd);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * NOT BETWEEN  entity().getToDeviceId() AND 值2
     * @param toDeviceIdStart       值1
     * @param toDeviceIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdNotBetween(String toDeviceIdStart,String toDeviceIdEnd){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null && toDeviceIdEnd!=null){
            notBetween("to_device_id",toDeviceIdStart,toDeviceIdEnd);
        }
        return this;
     }


    /**
     * <p>新设备id</p>
     * LIKE '%值%'  entity().getToDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdLike(){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null){
            like("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * NOT LIKE '%值%'  entity().getToDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdNotLike(){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null){
            notLike("to_device_id",toDeviceId);
        }
        return this;
     }


    /**
     * <p>新设备id</p>
     * LIKE '%值'  entity().getToDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdLikeLeft(){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null){
            likeLeft("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * LIKE '值%'  entity().getToDeviceId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdLikeRight(){
        String toDeviceId =entity().getToDeviceId();
        if(toDeviceId!=null){
            likeRight("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * 等于 =
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdEq(String toDeviceId){
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
    public McMoveDeviceQueryEntityWrapper toDeviceIdNe(String toDeviceId){
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
    public McMoveDeviceQueryEntityWrapper toDeviceIdGt(String toDeviceId){
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
    public McMoveDeviceQueryEntityWrapper toDeviceIdGe(String toDeviceId){
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
    public McMoveDeviceQueryEntityWrapper toDeviceIdLt(String toDeviceId){
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
    public McMoveDeviceQueryEntityWrapper toDeviceIdLe(String toDeviceId){
        if(toDeviceId!=null){
            le("to_device_id",toDeviceId);
        }
        return this;
     }

    /**
     * <p>新设备id</p>
     * LIKE '%值%'
     * @param toDeviceId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdLike(String toDeviceId){
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
    public McMoveDeviceQueryEntityWrapper toDeviceIdNotLike(String toDeviceId){
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
    public McMoveDeviceQueryEntityWrapper toDeviceIdLikeLeft(String toDeviceId){
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
    public McMoveDeviceQueryEntityWrapper toDeviceIdLikeRight(String toDeviceId){
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
    public McMoveDeviceQueryEntityWrapper toDeviceIdIsNull(){
        isNull("to_device_id");
        return this;
    }

    /**
     * <p>新设备id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdIsNotNull(){
        isNotNull("to_device_id");
        return this;
    }

    /**
     * <p>新设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toDeviceIdIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper toDeviceIdIn(String... values){
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
    public McMoveDeviceQueryEntityWrapper toDeviceIdNotIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper toDeviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("to_device_id",values);
        }
        return this;
    }


    /**
     * <p>新设备云手机ID</p>
     * 等于 = entity().getToPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdEq(){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null){
            eq("to_phone_id",toPhoneId);
        }
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * 不等于 &lt;&gt; entity().getToPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdNe(){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null){
            ne("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 大于 &gt; entity().getToPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdGt(){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null){
            gt("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 大于等于 &gt;= entity().getToPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdGe(){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null){
            ge("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 小于 &lt; entity().getToPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdLt(){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null){
            lt("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 小于等于 &lt;= entity().getToPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdLe(){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null){
            le("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * BETWEEN  entity().getToPhoneId() AND toPhoneIdEnd
     * @param toPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdBetween(String toPhoneIdEnd){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null && toPhoneIdEnd!=null){
            between("to_phone_id",toPhoneId,toPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * NOT BETWEEN  entity().getToPhoneId() AND 值2
     * @param toPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdNotBetween(String toPhoneIdEnd){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null && toPhoneIdEnd!=null){
            notBetween("to_phone_id",toPhoneId,toPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * BETWEEN  entity().getToPhoneId() AND 值2
     * @param toPhoneIdStart       值1
     * @param toPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdBetween(String toPhoneIdStart,String toPhoneIdEnd){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null && toPhoneIdEnd!=null){
            between("to_phone_id",toPhoneIdStart,toPhoneIdEnd);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * NOT BETWEEN  entity().getToPhoneId() AND 值2
     * @param toPhoneIdStart       值1
     * @param toPhoneIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdNotBetween(String toPhoneIdStart,String toPhoneIdEnd){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null && toPhoneIdEnd!=null){
            notBetween("to_phone_id",toPhoneIdStart,toPhoneIdEnd);
        }
        return this;
     }


    /**
     * <p>新设备云手机ID</p>
     * LIKE '%值%'  entity().getToPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdLike(){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null){
            like("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * NOT LIKE '%值%'  entity().getToPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdNotLike(){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null){
            notLike("to_phone_id",toPhoneId);
        }
        return this;
     }


    /**
     * <p>新设备云手机ID</p>
     * LIKE '%值'  entity().getToPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdLikeLeft(){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null){
            likeLeft("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * LIKE '值%'  entity().getToPhoneId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdLikeRight(){
        String toPhoneId =entity().getToPhoneId();
        if(toPhoneId!=null){
            likeRight("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * 等于 =
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdEq(String toPhoneId){
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
    public McMoveDeviceQueryEntityWrapper toPhoneIdNe(String toPhoneId){
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
    public McMoveDeviceQueryEntityWrapper toPhoneIdGt(String toPhoneId){
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
    public McMoveDeviceQueryEntityWrapper toPhoneIdGe(String toPhoneId){
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
    public McMoveDeviceQueryEntityWrapper toPhoneIdLt(String toPhoneId){
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
    public McMoveDeviceQueryEntityWrapper toPhoneIdLe(String toPhoneId){
        if(toPhoneId!=null){
            le("to_phone_id",toPhoneId);
        }
        return this;
     }

    /**
     * <p>新设备云手机ID</p>
     * LIKE '%值%'
     * @param toPhoneId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdLike(String toPhoneId){
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
    public McMoveDeviceQueryEntityWrapper toPhoneIdNotLike(String toPhoneId){
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
    public McMoveDeviceQueryEntityWrapper toPhoneIdLikeLeft(String toPhoneId){
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
    public McMoveDeviceQueryEntityWrapper toPhoneIdLikeRight(String toPhoneId){
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
    public McMoveDeviceQueryEntityWrapper toPhoneIdIsNull(){
        isNull("to_phone_id");
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdIsNotNull(){
        isNotNull("to_phone_id");
        return this;
    }

    /**
     * <p>新设备云手机ID</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper toPhoneIdIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper toPhoneIdIn(String... values){
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
    public McMoveDeviceQueryEntityWrapper toPhoneIdNotIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper toPhoneIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("to_phone_id",values);
        }
        return this;
    }


    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 等于 = entity().getIncludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesEq(){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null){
            eq("include_files",includeFiles);
        }
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 不等于 &lt;&gt; entity().getIncludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesNe(){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null){
            ne("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 大于 &gt; entity().getIncludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesGt(){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null){
            gt("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 大于等于 &gt;= entity().getIncludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesGe(){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null){
            ge("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 小于 &lt; entity().getIncludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesLt(){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null){
            lt("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 小于等于 &lt;= entity().getIncludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesLe(){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null){
            le("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * BETWEEN  entity().getIncludeFiles() AND includeFilesEnd
     * @param includeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesBetween(String includeFilesEnd){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null && includeFilesEnd!=null){
            between("include_files",includeFiles,includeFilesEnd);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT BETWEEN  entity().getIncludeFiles() AND 值2
     * @param includeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesNotBetween(String includeFilesEnd){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null && includeFilesEnd!=null){
            notBetween("include_files",includeFiles,includeFilesEnd);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * BETWEEN  entity().getIncludeFiles() AND 值2
     * @param includeFilesStart       值1
     * @param includeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesBetween(String includeFilesStart,String includeFilesEnd){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null && includeFilesEnd!=null){
            between("include_files",includeFilesStart,includeFilesEnd);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT BETWEEN  entity().getIncludeFiles() AND 值2
     * @param includeFilesStart       值1
     * @param includeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesNotBetween(String includeFilesStart,String includeFilesEnd){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null && includeFilesEnd!=null){
            notBetween("include_files",includeFilesStart,includeFilesEnd);
        }
        return this;
     }


    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值%'  entity().getIncludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesLike(){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null){
            like("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT LIKE '%值%'  entity().getIncludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesNotLike(){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null){
            notLike("include_files",includeFiles);
        }
        return this;
     }


    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值'  entity().getIncludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesLikeLeft(){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null){
            likeLeft("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '值%'  entity().getIncludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesLikeRight(){
        String includeFiles =entity().getIncludeFiles();
        if(includeFiles!=null){
            likeRight("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 等于 =
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesEq(String includeFiles){
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
    public McMoveDeviceQueryEntityWrapper includeFilesNe(String includeFiles){
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
    public McMoveDeviceQueryEntityWrapper includeFilesGt(String includeFiles){
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
    public McMoveDeviceQueryEntityWrapper includeFilesGe(String includeFiles){
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
    public McMoveDeviceQueryEntityWrapper includeFilesLt(String includeFiles){
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
    public McMoveDeviceQueryEntityWrapper includeFilesLe(String includeFiles){
        if(includeFiles!=null){
            le("include_files",includeFiles);
        }
        return this;
     }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值%'
     * @param includeFiles       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesLike(String includeFiles){
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
    public McMoveDeviceQueryEntityWrapper includeFilesNotLike(String includeFiles){
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
    public McMoveDeviceQueryEntityWrapper includeFilesLikeLeft(String includeFiles){
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
    public McMoveDeviceQueryEntityWrapper includeFilesLikeRight(String includeFiles){
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
    public McMoveDeviceQueryEntityWrapper includeFilesIsNull(){
        isNull("include_files");
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesIsNotNull(){
        isNotNull("include_files");
        return this;
    }

    /**
     * <p>需要导出数据的存储路径，绝对路径，最大长度4096字节。仅支持导出/data和、cache目录下的数据。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper includeFilesIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper includeFilesIn(String... values){
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
    public McMoveDeviceQueryEntityWrapper includeFilesNotIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper includeFilesNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("include_files",values);
        }
        return this;
    }


    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 等于 = entity().getExcludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesEq(){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null){
            eq("exclude_files",excludeFiles);
        }
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 不等于 &lt;&gt; entity().getExcludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesNe(){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null){
            ne("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 大于 &gt; entity().getExcludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesGt(){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null){
            gt("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 大于等于 &gt;= entity().getExcludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesGe(){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null){
            ge("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 小于 &lt; entity().getExcludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesLt(){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null){
            lt("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 小于等于 &lt;= entity().getExcludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesLe(){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null){
            le("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * BETWEEN  entity().getExcludeFiles() AND excludeFilesEnd
     * @param excludeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesBetween(String excludeFilesEnd){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null && excludeFilesEnd!=null){
            between("exclude_files",excludeFiles,excludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * NOT BETWEEN  entity().getExcludeFiles() AND 值2
     * @param excludeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesNotBetween(String excludeFilesEnd){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null && excludeFilesEnd!=null){
            notBetween("exclude_files",excludeFiles,excludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * BETWEEN  entity().getExcludeFiles() AND 值2
     * @param excludeFilesStart       值1
     * @param excludeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesBetween(String excludeFilesStart,String excludeFilesEnd){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null && excludeFilesEnd!=null){
            between("exclude_files",excludeFilesStart,excludeFilesEnd);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * NOT BETWEEN  entity().getExcludeFiles() AND 值2
     * @param excludeFilesStart       值1
     * @param excludeFilesEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesNotBetween(String excludeFilesStart,String excludeFilesEnd){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null && excludeFilesEnd!=null){
            notBetween("exclude_files",excludeFilesStart,excludeFilesEnd);
        }
        return this;
     }


    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * LIKE '%值%'  entity().getExcludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesLike(){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null){
            like("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * NOT LIKE '%值%'  entity().getExcludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesNotLike(){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null){
            notLike("exclude_files",excludeFiles);
        }
        return this;
     }


    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * LIKE '%值'  entity().getExcludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesLikeLeft(){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null){
            likeLeft("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * LIKE '值%'  entity().getExcludeFiles()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesLikeRight(){
        String excludeFiles =entity().getExcludeFiles();
        if(excludeFiles!=null){
            likeRight("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * 等于 =
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesEq(String excludeFiles){
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
    public McMoveDeviceQueryEntityWrapper excludeFilesNe(String excludeFiles){
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
    public McMoveDeviceQueryEntityWrapper excludeFilesGt(String excludeFiles){
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
    public McMoveDeviceQueryEntityWrapper excludeFilesGe(String excludeFiles){
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
    public McMoveDeviceQueryEntityWrapper excludeFilesLt(String excludeFiles){
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
    public McMoveDeviceQueryEntityWrapper excludeFilesLe(String excludeFiles){
        if(excludeFiles!=null){
            le("exclude_files",excludeFiles);
        }
        return this;
     }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * LIKE '%值%'
     * @param excludeFiles       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesLike(String excludeFiles){
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
    public McMoveDeviceQueryEntityWrapper excludeFilesNotLike(String excludeFiles){
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
    public McMoveDeviceQueryEntityWrapper excludeFilesLikeLeft(String excludeFiles){
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
    public McMoveDeviceQueryEntityWrapper excludeFilesLikeRight(String excludeFiles){
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
    public McMoveDeviceQueryEntityWrapper excludeFilesIsNull(){
        isNull("exclude_files");
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesIsNotNull(){
        isNotNull("exclude_files");
        return this;
    }

    /**
     * <p>不能导出数据的存储路径。exclude_files优先级比include_files高，如果冲突，exclude_files生效。 参数可选，如果指定参数，则不能为空。 路径要求同include_files。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper excludeFilesIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper excludeFilesIn(String... values){
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
    public McMoveDeviceQueryEntityWrapper excludeFilesNotIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper excludeFilesNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("exclude_files",values);
        }
        return this;
    }


    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 等于 = entity().getBucketName()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameEq(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            eq("bucket_name",bucketName);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 不等于 &lt;&gt; entity().getBucketName()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameNe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            ne("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 大于 &gt; entity().getBucketName()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameGt(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            gt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 大于等于 &gt;= entity().getBucketName()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameGe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            ge("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 小于 &lt; entity().getBucketName()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameLt(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            lt("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 小于等于 &lt;= entity().getBucketName()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameLe(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * BETWEEN  entity().getBucketName() AND bucketNameEnd
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameBetween(String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            between("bucket_name",bucketName,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * NOT BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameNotBetween(String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketName,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameBetween(String bucketNameStart,String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            between("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * NOT BETWEEN  entity().getBucketName() AND 值2
     * @param bucketNameStart       值1
     * @param bucketNameEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameNotBetween(String bucketNameStart,String bucketNameEnd){
        String bucketName =entity().getBucketName();
        if(bucketName!=null && bucketNameEnd!=null){
            notBetween("bucket_name",bucketNameStart,bucketNameEnd);
        }
        return this;
     }


    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * LIKE '%值%'  entity().getBucketName()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameLike(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            like("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * NOT LIKE '%值%'  entity().getBucketName()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameNotLike(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            notLike("bucket_name",bucketName);
        }
        return this;
     }


    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * LIKE '%值'  entity().getBucketName()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameLikeLeft(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            likeLeft("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * LIKE '值%'  entity().getBucketName()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameLikeRight(){
        String bucketName =entity().getBucketName();
        if(bucketName!=null){
            likeRight("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * 等于 =
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameEq(String bucketName){
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
    public McMoveDeviceQueryEntityWrapper bucketNameNe(String bucketName){
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
    public McMoveDeviceQueryEntityWrapper bucketNameGt(String bucketName){
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
    public McMoveDeviceQueryEntityWrapper bucketNameGe(String bucketName){
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
    public McMoveDeviceQueryEntityWrapper bucketNameLt(String bucketName){
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
    public McMoveDeviceQueryEntityWrapper bucketNameLe(String bucketName){
        if(bucketName!=null){
            le("bucket_name",bucketName);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * LIKE '%值%'
     * @param bucketName       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameLike(String bucketName){
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
    public McMoveDeviceQueryEntityWrapper bucketNameNotLike(String bucketName){
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
    public McMoveDeviceQueryEntityWrapper bucketNameLikeLeft(String bucketName){
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
    public McMoveDeviceQueryEntityWrapper bucketNameLikeRight(String bucketName){
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
    public McMoveDeviceQueryEntityWrapper bucketNameIsNull(){
        isNull("bucket_name");
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameIsNotNull(){
        isNotNull("bucket_name");
        return this;
    }

    /**
     * <p>导出数据存储的OBS桶名。 合法的OBS桶名，3-63个字符，只能由小写字母、数字、中划线（-）和小数点（.）组成。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper bucketNameIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper bucketNameIn(String... values){
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
    public McMoveDeviceQueryEntityWrapper bucketNameNotIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper bucketNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("bucket_name",values);
        }
        return this;
    }


    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 等于 = entity().getObjectPath()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathEq(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            eq("object_path",objectPath);
        }
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 不等于 &lt;&gt; entity().getObjectPath()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathNe(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            ne("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 大于 &gt; entity().getObjectPath()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathGt(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            gt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 大于等于 &gt;= entity().getObjectPath()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathGe(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            ge("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 小于 &lt; entity().getObjectPath()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathLt(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            lt("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 小于等于 &lt;= entity().getObjectPath()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathLe(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            le("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * BETWEEN  entity().getObjectPath() AND objectPathEnd
     * @param objectPathEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathBetween(String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            between("object_path",objectPath,objectPathEnd);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT BETWEEN  entity().getObjectPath() AND 值2
     * @param objectPathEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathNotBetween(String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            notBetween("object_path",objectPath,objectPathEnd);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * BETWEEN  entity().getObjectPath() AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathBetween(String objectPathStart,String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            between("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT BETWEEN  entity().getObjectPath() AND 值2
     * @param objectPathStart       值1
     * @param objectPathEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathNotBetween(String objectPathStart,String objectPathEnd){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null && objectPathEnd!=null){
            notBetween("object_path",objectPathStart,objectPathEnd);
        }
        return this;
     }


    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值%'  entity().getObjectPath()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathLike(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            like("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * NOT LIKE '%值%'  entity().getObjectPath()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathNotLike(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            notLike("object_path",objectPath);
        }
        return this;
     }


    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值'  entity().getObjectPath()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathLikeLeft(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            likeLeft("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '值%'  entity().getObjectPath()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathLikeRight(){
        String objectPath =entity().getObjectPath();
        if(objectPath!=null){
            likeRight("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * 等于 =
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathEq(String objectPath){
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
    public McMoveDeviceQueryEntityWrapper objectPathNe(String objectPath){
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
    public McMoveDeviceQueryEntityWrapper objectPathGt(String objectPath){
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
    public McMoveDeviceQueryEntityWrapper objectPathGe(String objectPath){
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
    public McMoveDeviceQueryEntityWrapper objectPathLt(String objectPath){
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
    public McMoveDeviceQueryEntityWrapper objectPathLe(String objectPath){
        if(objectPath!=null){
            le("object_path",objectPath);
        }
        return this;
     }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * LIKE '%值%'
     * @param objectPath       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathLike(String objectPath){
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
    public McMoveDeviceQueryEntityWrapper objectPathNotLike(String objectPath){
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
    public McMoveDeviceQueryEntityWrapper objectPathLikeLeft(String objectPath){
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
    public McMoveDeviceQueryEntityWrapper objectPathLikeRight(String objectPath){
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
    public McMoveDeviceQueryEntityWrapper objectPathIsNull(){
        isNull("object_path");
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathIsNotNull(){
        isNotNull("object_path");
        return this;
    }

    /**
     * <p>导出数据存储的OBS路径名。 符合OBS的路径名规范，最大长度1024字符。目前只支持大小写字母、数字、小数点（.）、斜线（/）、中划线（-）、下划线（_）、加号（+）、井号（#）、等号这些字符。</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper objectPathIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper objectPathIn(String... values){
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
    public McMoveDeviceQueryEntityWrapper objectPathNotIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper objectPathNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("object_path",values);
        }
        return this;
    }


    /**
     * <p>申请换机时间</p>
     * 等于 = entity().getCreateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeEq(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            eq("create_time",createTime);
        }
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * 不等于 &lt;&gt; entity().getCreateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeNe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ne("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 大于 &gt; entity().getCreateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeGt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            gt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 大于等于 &gt;= entity().getCreateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeGe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            ge("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 小于 &lt; entity().getCreateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeLt(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            lt("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 小于等于 &lt;= entity().getCreateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeLe(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * BETWEEN  entity().getCreateTime() AND createTimeEnd
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTime,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            between("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * NOT BETWEEN  entity().getCreateTime() AND 值2
     * @param createTimeStart       值1
     * @param createTimeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
        Date createTime =entity().getCreateTime();
        if(createTime!=null && createTimeEnd!=null){
            notBetween("create_time",createTimeStart,createTimeEnd);
        }
        return this;
     }


    /**
     * <p>申请换机时间</p>
     * LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            like("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * NOT LIKE '%值%'  entity().getCreateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeNotLike(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            notLike("create_time",createTime);
        }
        return this;
     }


    /**
     * <p>申请换机时间</p>
     * LIKE '%值'  entity().getCreateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeLikeLeft(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeLeft("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * LIKE '值%'  entity().getCreateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeLikeRight(){
        Date createTime =entity().getCreateTime();
        if(createTime!=null){
            likeRight("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * 等于 =
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeEq(Date createTime){
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
    public McMoveDeviceQueryEntityWrapper createTimeNe(Date createTime){
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
    public McMoveDeviceQueryEntityWrapper createTimeGt(Date createTime){
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
    public McMoveDeviceQueryEntityWrapper createTimeGe(Date createTime){
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
    public McMoveDeviceQueryEntityWrapper createTimeLt(Date createTime){
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
    public McMoveDeviceQueryEntityWrapper createTimeLe(Date createTime){
        if(createTime!=null){
            le("create_time",createTime);
        }
        return this;
     }

    /**
     * <p>申请换机时间</p>
     * LIKE '%值%'
     * @param createTime       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeLike(Date createTime){
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
    public McMoveDeviceQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public McMoveDeviceQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public McMoveDeviceQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public McMoveDeviceQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>申请换机时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public McMoveDeviceQueryEntityWrapper createTimeIn(Date... values){
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
    public McMoveDeviceQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public McMoveDeviceQueryEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusEq(Integer status){
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
    public McMoveDeviceQueryEntityWrapper statusNe(Integer status){
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
    public McMoveDeviceQueryEntityWrapper statusGt(Integer status){
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
    public McMoveDeviceQueryEntityWrapper statusGe(Integer status){
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
    public McMoveDeviceQueryEntityWrapper statusLt(Integer status){
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
    public McMoveDeviceQueryEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusLike(Integer status){
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
    public McMoveDeviceQueryEntityWrapper statusNotLike(Integer status){
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
    public McMoveDeviceQueryEntityWrapper statusLikeLeft(Integer status){
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
    public McMoveDeviceQueryEntityWrapper statusLikeRight(Integer status){
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
    public McMoveDeviceQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>换机状态（-50：取消，-40：超时，0：申请换机，1：获取空闲云机失败，2：获取空闲云机成功，3：旧机器进入维护模式和排队模式失败，4：旧机器进入维护模式和排队模式成功，5：旧云机关机中，6：旧云机关机失败，7：旧云机关机成功 ,8：导出旧云机数据中，9：导出就云机数据失败，10：导出旧云机数据成功，11：恢复数据中，12：恢复数据失败，13：恢复成功，14：恢复关系数据失败，15：恢复关系数据成功，16：新云机重启中，17：新云机重启失败，18：新云机重启成功，19：重启旧云机中，20：重启旧云机失败，21：重启旧云机成功，22：开始重设置旧云机中，23：重置旧云机失败，50：换机完成</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper statusIn(Collection<Integer> value){
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
    public McMoveDeviceQueryEntityWrapper statusIn(Integer... values){
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
    public McMoveDeviceQueryEntityWrapper statusNotIn(Collection<Integer> value){
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
    public McMoveDeviceQueryEntityWrapper statusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("status",values);
        }
        return this;
    }


    /**
     * <p>最后任务id</p>
     * 等于 = entity().getJobId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdEq(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            eq("job_id",jobId);
        }
        return this;
    }

    /**
     * <p>最后任务id</p>
     * 不等于 &lt;&gt; entity().getJobId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdNe(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            ne("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 大于 &gt; entity().getJobId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdGt(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            gt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 大于等于 &gt;= entity().getJobId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdGe(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            ge("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 小于 &lt; entity().getJobId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdLt(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            lt("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 小于等于 &lt;= entity().getJobId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdLe(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            le("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * BETWEEN  entity().getJobId() AND jobIdEnd
     * @param jobIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdBetween(String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            between("job_id",jobId,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * NOT BETWEEN  entity().getJobId() AND 值2
     * @param jobIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdNotBetween(String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            notBetween("job_id",jobId,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * BETWEEN  entity().getJobId() AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdBetween(String jobIdStart,String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            between("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * NOT BETWEEN  entity().getJobId() AND 值2
     * @param jobIdStart       值1
     * @param jobIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdNotBetween(String jobIdStart,String jobIdEnd){
        String jobId =entity().getJobId();
        if(jobId!=null && jobIdEnd!=null){
            notBetween("job_id",jobIdStart,jobIdEnd);
        }
        return this;
     }


    /**
     * <p>最后任务id</p>
     * LIKE '%值%'  entity().getJobId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdLike(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            like("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * NOT LIKE '%值%'  entity().getJobId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdNotLike(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            notLike("job_id",jobId);
        }
        return this;
     }


    /**
     * <p>最后任务id</p>
     * LIKE '%值'  entity().getJobId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdLikeLeft(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            likeLeft("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * LIKE '值%'  entity().getJobId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdLikeRight(){
        String jobId =entity().getJobId();
        if(jobId!=null){
            likeRight("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * 等于 =
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdEq(String jobId){
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
    public McMoveDeviceQueryEntityWrapper jobIdNe(String jobId){
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
    public McMoveDeviceQueryEntityWrapper jobIdGt(String jobId){
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
    public McMoveDeviceQueryEntityWrapper jobIdGe(String jobId){
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
    public McMoveDeviceQueryEntityWrapper jobIdLt(String jobId){
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
    public McMoveDeviceQueryEntityWrapper jobIdLe(String jobId){
        if(jobId!=null){
            le("job_id",jobId);
        }
        return this;
     }

    /**
     * <p>最后任务id</p>
     * LIKE '%值%'
     * @param jobId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdLike(String jobId){
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
    public McMoveDeviceQueryEntityWrapper jobIdNotLike(String jobId){
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
    public McMoveDeviceQueryEntityWrapper jobIdLikeLeft(String jobId){
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
    public McMoveDeviceQueryEntityWrapper jobIdLikeRight(String jobId){
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
    public McMoveDeviceQueryEntityWrapper jobIdIsNull(){
        isNull("job_id");
        return this;
    }

    /**
     * <p>最后任务id</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdIsNotNull(){
        isNotNull("job_id");
        return this;
    }

    /**
     * <p>最后任务id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper jobIdIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper jobIdIn(String... values){
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
    public McMoveDeviceQueryEntityWrapper jobIdNotIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper jobIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("job_id",values);
        }
        return this;
    }


    /**
     * <p>最后修改时间</p>
     * 等于 = entity().getLastUpdateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeEq(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            eq("last_update_time",lastUpdateTime);
        }
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * 不等于 &lt;&gt; entity().getLastUpdateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeNe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ne("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于 &gt; entity().getLastUpdateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeGt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            gt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 大于等于 &gt;= entity().getLastUpdateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeGe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            ge("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于 &lt; entity().getLastUpdateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeLt(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            lt("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 小于等于 &lt;= entity().getLastUpdateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeLe(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND lastUpdateTimeEnd
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTime,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            between("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT BETWEEN  entity().getLastUpdateTime() AND 值2
     * @param lastUpdateTimeStart       值1
     * @param lastUpdateTimeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeNotBetween(Date lastUpdateTimeStart,Date lastUpdateTimeEnd){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null && lastUpdateTimeEnd!=null){
            notBetween("last_update_time",lastUpdateTimeStart,lastUpdateTimeEnd);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            like("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * NOT LIKE '%值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeNotLike(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            notLike("last_update_time",lastUpdateTime);
        }
        return this;
     }


    /**
     * <p>最后修改时间</p>
     * LIKE '%值'  entity().getLastUpdateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeLikeLeft(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeLeft("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '值%'  entity().getLastUpdateTime()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeLikeRight(){
        Date lastUpdateTime =entity().getLastUpdateTime();
        if(lastUpdateTime!=null){
            likeRight("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * 等于 =
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeEq(Date lastUpdateTime){
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
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeNe(Date lastUpdateTime){
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
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeGt(Date lastUpdateTime){
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
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeGe(Date lastUpdateTime){
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
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeLt(Date lastUpdateTime){
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
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeLe(Date lastUpdateTime){
        if(lastUpdateTime!=null){
            le("last_update_time",lastUpdateTime);
        }
        return this;
     }

    /**
     * <p>最后修改时间</p>
     * LIKE '%值%'
     * @param lastUpdateTime       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeLike(Date lastUpdateTime){
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
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeNotLike(Date lastUpdateTime){
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
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeLikeLeft(Date lastUpdateTime){
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
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeLikeRight(Date lastUpdateTime){
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
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeIsNull(){
        isNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeIsNotNull(){
        isNotNull("last_update_time");
        return this;
    }

    /**
     * <p>最后修改时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeIn(Collection<Date> value){
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
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeIn(Date... values){
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
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeNotIn(Collection<Date> value){
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
    public McMoveDeviceQueryEntityWrapper lastUpdateTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("last_update_time",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getSpecCode()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeEq(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            eq("spec_code",specCode);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getSpecCode()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeNe(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            ne("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getSpecCode()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeGt(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            gt("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getSpecCode()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeGe(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            ge("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getSpecCode()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeLt(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            lt("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getSpecCode()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeLe(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            le("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSpecCode() AND specCodeEnd
     * @param specCodeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeBetween(String specCodeEnd){
        String specCode =entity().getSpecCode();
        if(specCode!=null && specCodeEnd!=null){
            between("spec_code",specCode,specCodeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSpecCode() AND 值2
     * @param specCodeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeNotBetween(String specCodeEnd){
        String specCode =entity().getSpecCode();
        if(specCode!=null && specCodeEnd!=null){
            notBetween("spec_code",specCode,specCodeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getSpecCode() AND 值2
     * @param specCodeStart       值1
     * @param specCodeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeBetween(String specCodeStart,String specCodeEnd){
        String specCode =entity().getSpecCode();
        if(specCode!=null && specCodeEnd!=null){
            between("spec_code",specCodeStart,specCodeEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getSpecCode() AND 值2
     * @param specCodeStart       值1
     * @param specCodeEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeNotBetween(String specCodeStart,String specCodeEnd){
        String specCode =entity().getSpecCode();
        if(specCode!=null && specCodeEnd!=null){
            notBetween("spec_code",specCodeStart,specCodeEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getSpecCode()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeLike(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            like("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getSpecCode()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeNotLike(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            notLike("spec_code",specCode);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getSpecCode()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeLikeLeft(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            likeLeft("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getSpecCode()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeLikeRight(){
        String specCode =entity().getSpecCode();
        if(specCode!=null){
            likeRight("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeEq(String specCode){
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
    public McMoveDeviceQueryEntityWrapper specCodeNe(String specCode){
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
    public McMoveDeviceQueryEntityWrapper specCodeGt(String specCode){
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
    public McMoveDeviceQueryEntityWrapper specCodeGe(String specCode){
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
    public McMoveDeviceQueryEntityWrapper specCodeLt(String specCode){
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
    public McMoveDeviceQueryEntityWrapper specCodeLe(String specCode){
        if(specCode!=null){
            le("spec_code",specCode);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param specCode       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeLike(String specCode){
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
    public McMoveDeviceQueryEntityWrapper specCodeNotLike(String specCode){
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
    public McMoveDeviceQueryEntityWrapper specCodeLikeLeft(String specCode){
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
    public McMoveDeviceQueryEntityWrapper specCodeLikeRight(String specCode){
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
    public McMoveDeviceQueryEntityWrapper specCodeIsNull(){
        isNull("spec_code");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeIsNotNull(){
        isNotNull("spec_code");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper specCodeIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper specCodeIn(String... values){
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
    public McMoveDeviceQueryEntityWrapper specCodeNotIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper specCodeNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("spec_code",values);
        }
        return this;
    }


    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 等于 = entity().getReleaseUse()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseEq(){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null){
            eq("release_use",releaseUse);
        }
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 不等于 &lt;&gt; entity().getReleaseUse()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseNe(){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null){
            ne("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 大于 &gt; entity().getReleaseUse()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseGt(){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null){
            gt("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 大于等于 &gt;= entity().getReleaseUse()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseGe(){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null){
            ge("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 小于 &lt; entity().getReleaseUse()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseLt(){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null){
            lt("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 小于等于 &lt;= entity().getReleaseUse()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseLe(){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null){
            le("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * BETWEEN  entity().getReleaseUse() AND releaseUseEnd
     * @param releaseUseEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseBetween(Boolean releaseUseEnd){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null && releaseUseEnd!=null){
            between("release_use",releaseUse,releaseUseEnd);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * NOT BETWEEN  entity().getReleaseUse() AND 值2
     * @param releaseUseEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseNotBetween(Boolean releaseUseEnd){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null && releaseUseEnd!=null){
            notBetween("release_use",releaseUse,releaseUseEnd);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * BETWEEN  entity().getReleaseUse() AND 值2
     * @param releaseUseStart       值1
     * @param releaseUseEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseBetween(Boolean releaseUseStart,Boolean releaseUseEnd){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null && releaseUseEnd!=null){
            between("release_use",releaseUseStart,releaseUseEnd);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * NOT BETWEEN  entity().getReleaseUse() AND 值2
     * @param releaseUseStart       值1
     * @param releaseUseEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseNotBetween(Boolean releaseUseStart,Boolean releaseUseEnd){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null && releaseUseEnd!=null){
            notBetween("release_use",releaseUseStart,releaseUseEnd);
        }
        return this;
     }


    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * LIKE '%值%'  entity().getReleaseUse()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseLike(){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null){
            like("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * NOT LIKE '%值%'  entity().getReleaseUse()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseNotLike(){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null){
            notLike("release_use",releaseUse);
        }
        return this;
     }


    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * LIKE '%值'  entity().getReleaseUse()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseLikeLeft(){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null){
            likeLeft("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * LIKE '值%'  entity().getReleaseUse()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseLikeRight(){
        Boolean releaseUse =entity().getReleaseUse();
        if(releaseUse!=null){
            likeRight("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * 等于 =
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseEq(Boolean releaseUse){
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
    public McMoveDeviceQueryEntityWrapper releaseUseNe(Boolean releaseUse){
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
    public McMoveDeviceQueryEntityWrapper releaseUseGt(Boolean releaseUse){
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
    public McMoveDeviceQueryEntityWrapper releaseUseGe(Boolean releaseUse){
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
    public McMoveDeviceQueryEntityWrapper releaseUseLt(Boolean releaseUse){
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
    public McMoveDeviceQueryEntityWrapper releaseUseLe(Boolean releaseUse){
        if(releaseUse!=null){
            le("release_use",releaseUse);
        }
        return this;
     }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * LIKE '%值%'
     * @param releaseUse       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseLike(Boolean releaseUse){
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
    public McMoveDeviceQueryEntityWrapper releaseUseNotLike(Boolean releaseUse){
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
    public McMoveDeviceQueryEntityWrapper releaseUseLikeLeft(Boolean releaseUse){
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
    public McMoveDeviceQueryEntityWrapper releaseUseLikeRight(Boolean releaseUse){
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
    public McMoveDeviceQueryEntityWrapper releaseUseIsNull(){
        isNull("release_use");
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseIsNotNull(){
        isNotNull("release_use");
        return this;
    }

    /**
     * <p>重设置完成后是否释放旧云机出来使用（false：不释放，true：释放）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper releaseUseIn(Collection<Boolean> value){
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
    public McMoveDeviceQueryEntityWrapper releaseUseIn(Boolean... values){
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
    public McMoveDeviceQueryEntityWrapper releaseUseNotIn(Collection<Boolean> value){
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
    public McMoveDeviceQueryEntityWrapper releaseUseNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("release_use",values);
        }
        return this;
    }


    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 等于 = entity().getDataMigration()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationEq(){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null){
            eq("data_migration",dataMigration);
        }
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 不等于 &lt;&gt; entity().getDataMigration()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationNe(){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null){
            ne("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 大于 &gt; entity().getDataMigration()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationGt(){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null){
            gt("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 大于等于 &gt;= entity().getDataMigration()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationGe(){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null){
            ge("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 小于 &lt; entity().getDataMigration()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationLt(){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null){
            lt("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 小于等于 &lt;= entity().getDataMigration()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationLe(){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null){
            le("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * BETWEEN  entity().getDataMigration() AND dataMigrationEnd
     * @param dataMigrationEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationBetween(Boolean dataMigrationEnd){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null && dataMigrationEnd!=null){
            between("data_migration",dataMigration,dataMigrationEnd);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * NOT BETWEEN  entity().getDataMigration() AND 值2
     * @param dataMigrationEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationNotBetween(Boolean dataMigrationEnd){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null && dataMigrationEnd!=null){
            notBetween("data_migration",dataMigration,dataMigrationEnd);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * BETWEEN  entity().getDataMigration() AND 值2
     * @param dataMigrationStart       值1
     * @param dataMigrationEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationBetween(Boolean dataMigrationStart,Boolean dataMigrationEnd){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null && dataMigrationEnd!=null){
            between("data_migration",dataMigrationStart,dataMigrationEnd);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * NOT BETWEEN  entity().getDataMigration() AND 值2
     * @param dataMigrationStart       值1
     * @param dataMigrationEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationNotBetween(Boolean dataMigrationStart,Boolean dataMigrationEnd){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null && dataMigrationEnd!=null){
            notBetween("data_migration",dataMigrationStart,dataMigrationEnd);
        }
        return this;
     }


    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * LIKE '%值%'  entity().getDataMigration()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationLike(){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null){
            like("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * NOT LIKE '%值%'  entity().getDataMigration()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationNotLike(){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null){
            notLike("data_migration",dataMigration);
        }
        return this;
     }


    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * LIKE '%值'  entity().getDataMigration()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationLikeLeft(){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null){
            likeLeft("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * LIKE '值%'  entity().getDataMigration()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationLikeRight(){
        Boolean dataMigration =entity().getDataMigration();
        if(dataMigration!=null){
            likeRight("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * 等于 =
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationEq(Boolean dataMigration){
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
    public McMoveDeviceQueryEntityWrapper dataMigrationNe(Boolean dataMigration){
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
    public McMoveDeviceQueryEntityWrapper dataMigrationGt(Boolean dataMigration){
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
    public McMoveDeviceQueryEntityWrapper dataMigrationGe(Boolean dataMigration){
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
    public McMoveDeviceQueryEntityWrapper dataMigrationLt(Boolean dataMigration){
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
    public McMoveDeviceQueryEntityWrapper dataMigrationLe(Boolean dataMigration){
        if(dataMigration!=null){
            le("data_migration",dataMigration);
        }
        return this;
     }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * LIKE '%值%'
     * @param dataMigration       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationLike(Boolean dataMigration){
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
    public McMoveDeviceQueryEntityWrapper dataMigrationNotLike(Boolean dataMigration){
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
    public McMoveDeviceQueryEntityWrapper dataMigrationLikeLeft(Boolean dataMigration){
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
    public McMoveDeviceQueryEntityWrapper dataMigrationLikeRight(Boolean dataMigration){
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
    public McMoveDeviceQueryEntityWrapper dataMigrationIsNull(){
        isNull("data_migration");
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationIsNotNull(){
        isNotNull("data_migration");
        return this;
    }

    /**
     * <p>是否迁移数据（false：不迁移，true：迁移）默认不迁移</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper dataMigrationIn(Collection<Boolean> value){
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
    public McMoveDeviceQueryEntityWrapper dataMigrationIn(Boolean... values){
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
    public McMoveDeviceQueryEntityWrapper dataMigrationNotIn(Collection<Boolean> value){
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
    public McMoveDeviceQueryEntityWrapper dataMigrationNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("data_migration",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getTaskId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdEq(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            eq("task_id",taskId);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getTaskId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdNe(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            ne("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getTaskId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdGt(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            gt("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getTaskId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdGe(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            ge("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getTaskId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdLt(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            lt("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getTaskId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdLe(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            le("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getTaskId() AND taskIdEnd
     * @param taskIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdBetween(String taskIdEnd){
        String taskId =entity().getTaskId();
        if(taskId!=null && taskIdEnd!=null){
            between("task_id",taskId,taskIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getTaskId() AND 值2
     * @param taskIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdNotBetween(String taskIdEnd){
        String taskId =entity().getTaskId();
        if(taskId!=null && taskIdEnd!=null){
            notBetween("task_id",taskId,taskIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getTaskId() AND 值2
     * @param taskIdStart       值1
     * @param taskIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdBetween(String taskIdStart,String taskIdEnd){
        String taskId =entity().getTaskId();
        if(taskId!=null && taskIdEnd!=null){
            between("task_id",taskIdStart,taskIdEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getTaskId() AND 值2
     * @param taskIdStart       值1
     * @param taskIdEnd      值2
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdNotBetween(String taskIdStart,String taskIdEnd){
        String taskId =entity().getTaskId();
        if(taskId!=null && taskIdEnd!=null){
            notBetween("task_id",taskIdStart,taskIdEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getTaskId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdLike(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            like("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getTaskId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdNotLike(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            notLike("task_id",taskId);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getTaskId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdLikeLeft(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            likeLeft("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getTaskId()
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdLikeRight(){
        String taskId =entity().getTaskId();
        if(taskId!=null){
            likeRight("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdEq(String taskId){
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
    public McMoveDeviceQueryEntityWrapper taskIdNe(String taskId){
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
    public McMoveDeviceQueryEntityWrapper taskIdGt(String taskId){
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
    public McMoveDeviceQueryEntityWrapper taskIdGe(String taskId){
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
    public McMoveDeviceQueryEntityWrapper taskIdLt(String taskId){
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
    public McMoveDeviceQueryEntityWrapper taskIdLe(String taskId){
        if(taskId!=null){
            le("task_id",taskId);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param taskId       值
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdLike(String taskId){
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
    public McMoveDeviceQueryEntityWrapper taskIdNotLike(String taskId){
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
    public McMoveDeviceQueryEntityWrapper taskIdLikeLeft(String taskId){
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
    public McMoveDeviceQueryEntityWrapper taskIdLikeRight(String taskId){
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
    public McMoveDeviceQueryEntityWrapper taskIdIsNull(){
        isNull("task_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdIsNotNull(){
        isNotNull("task_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public McMoveDeviceQueryEntityWrapper taskIdIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper taskIdIn(String... values){
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
    public McMoveDeviceQueryEntityWrapper taskIdNotIn(Collection<String> value){
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
    public McMoveDeviceQueryEntityWrapper taskIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("task_id",values);
        }
        return this;
    }



}
