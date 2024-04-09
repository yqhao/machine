package com.suqi.center.machine.dao.wrapper;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import java.util.Collection;
import java.util.function.Consumer;
import com.suqi.center.machine.dao.entity.YunMemberDevice;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 * 用户设备表（yun_member_device）
 * </p>
 * "yun_member_device"
 * @author PC001
 */
public class YunMemberDeviceQueryEntityWrapper extends QueryWrapper<YunMemberDevice> {

    public static YunMemberDeviceQueryEntityWrapper wrapper(YunMemberDevice entity) {
        return new YunMemberDeviceQueryEntityWrapper(entity);
    }

    private YunMemberDevice entity;

    public YunMemberDeviceQueryEntityWrapper(YunMemberDevice entity) {
         this.entity=entity;
    }


    protected YunMemberDevice entity() {
        if(entity==null){
            throw new NullPointerException("YunMemberDevice is null");
        }
        return entity;
    }

    @Override
    public YunMemberDeviceQueryEntityWrapper select(String... columns) {
        super.select(columns);
        return this;
    }
    public YunMemberDeviceQueryEntityWrapper selectColumns(Consumer<YunMemberDeviceSelect> consumer) {
        YunMemberDeviceSelect select = new YunMemberDeviceSelect();
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
    public YunMemberDeviceQueryEntityWrapper idEq(){
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
    public YunMemberDeviceQueryEntityWrapper idNe(){
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
    public YunMemberDeviceQueryEntityWrapper idGt(){
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
    public YunMemberDeviceQueryEntityWrapper idGe(){
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
    public YunMemberDeviceQueryEntityWrapper idLt(){
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
    public YunMemberDeviceQueryEntityWrapper idLe(){
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
    public YunMemberDeviceQueryEntityWrapper idBetween(Long idEnd){
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
    public YunMemberDeviceQueryEntityWrapper idNotBetween(Long idEnd){
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
    public YunMemberDeviceQueryEntityWrapper idBetween(Long idStart,Long idEnd){
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
    public YunMemberDeviceQueryEntityWrapper idNotBetween(Long idStart,Long idEnd){
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
    public YunMemberDeviceQueryEntityWrapper idLike(){
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
    public YunMemberDeviceQueryEntityWrapper idNotLike(){
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
    public YunMemberDeviceQueryEntityWrapper idLikeLeft(){
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
    public YunMemberDeviceQueryEntityWrapper idLikeRight(){
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
    public YunMemberDeviceQueryEntityWrapper idEq(Long id){
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
    public YunMemberDeviceQueryEntityWrapper idNe(Long id){
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
    public YunMemberDeviceQueryEntityWrapper idGt(Long id){
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
    public YunMemberDeviceQueryEntityWrapper idGe(Long id){
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
    public YunMemberDeviceQueryEntityWrapper idLt(Long id){
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
    public YunMemberDeviceQueryEntityWrapper idLe(Long id){
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
    public YunMemberDeviceQueryEntityWrapper idLike(Long id){
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
    public YunMemberDeviceQueryEntityWrapper idNotLike(Long id){
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
    public YunMemberDeviceQueryEntityWrapper idLikeLeft(Long id){
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
    public YunMemberDeviceQueryEntityWrapper idLikeRight(Long id){
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
    public YunMemberDeviceQueryEntityWrapper idIsNull(){
        isNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper idIsNotNull(){
        isNotNull("id");
        return this;
    }

    /**
     * <p>id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper idIn(Collection<Long> value){
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
    public YunMemberDeviceQueryEntityWrapper idIn(Long... values){
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
    public YunMemberDeviceQueryEntityWrapper idNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryEntityWrapper idNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("id",values);
        }
        return this;
    }


    /**
     * <p>用户id</p>
     * 等于 = entity().getFkMemberId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkMemberIdEq(){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdNe(){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdGt(){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdGe(){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdLt(){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdLe(){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdBetween(Long fkMemberIdEnd){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdNotBetween(Long fkMemberIdEnd){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdNotBetween(Long fkMemberIdStart,Long fkMemberIdEnd){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdLike(){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdNotLike(){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdLikeLeft(){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdLikeRight(){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdEq(Long fkMemberId){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdNe(Long fkMemberId){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdGt(Long fkMemberId){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdGe(Long fkMemberId){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdLt(Long fkMemberId){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdLe(Long fkMemberId){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdLike(Long fkMemberId){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdNotLike(Long fkMemberId){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdLikeLeft(Long fkMemberId){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdLikeRight(Long fkMemberId){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdIsNull(){
        isNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkMemberIdIsNotNull(){
        isNotNull("fk_member_id");
        return this;
    }

    /**
     * <p>用户id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkMemberIdIn(Collection<Long> value){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdIn(Long... values){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryEntityWrapper fkMemberIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_member_id",values);
        }
        return this;
    }


    /**
     * <p>分组id</p>
     * 等于 = entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdEq(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            eq("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * 不等于 &lt;&gt; entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdNe(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            ne("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 大于 &gt; entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdGt(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            gt("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 大于等于 &gt;= entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdGe(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            ge("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 小于 &lt; entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdLt(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            lt("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 小于等于 &lt;= entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdLe(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            le("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * BETWEEN  entity().getFkEmMemberGroupId() AND fkEmMemberGroupIdEnd
     * @param fkEmMemberGroupIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdBetween(Long fkEmMemberGroupIdEnd){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null && fkEmMemberGroupIdEnd!=null){
            between("fk_em_member_group_id",fkEmMemberGroupId,fkEmMemberGroupIdEnd);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * NOT BETWEEN  entity().getFkEmMemberGroupId() AND 值2
     * @param fkEmMemberGroupIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdNotBetween(Long fkEmMemberGroupIdEnd){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null && fkEmMemberGroupIdEnd!=null){
            notBetween("fk_em_member_group_id",fkEmMemberGroupId,fkEmMemberGroupIdEnd);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * BETWEEN  entity().getFkEmMemberGroupId() AND 值2
     * @param fkEmMemberGroupIdStart       值1
     * @param fkEmMemberGroupIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdBetween(Long fkEmMemberGroupIdStart,Long fkEmMemberGroupIdEnd){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null && fkEmMemberGroupIdEnd!=null){
            between("fk_em_member_group_id",fkEmMemberGroupIdStart,fkEmMemberGroupIdEnd);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * NOT BETWEEN  entity().getFkEmMemberGroupId() AND 值2
     * @param fkEmMemberGroupIdStart       值1
     * @param fkEmMemberGroupIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdNotBetween(Long fkEmMemberGroupIdStart,Long fkEmMemberGroupIdEnd){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null && fkEmMemberGroupIdEnd!=null){
            notBetween("fk_em_member_group_id",fkEmMemberGroupIdStart,fkEmMemberGroupIdEnd);
        }
        return this;
     }


    /**
     * <p>分组id</p>
     * LIKE '%值%'  entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdLike(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            like("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * NOT LIKE '%值%'  entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdNotLike(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            notLike("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }


    /**
     * <p>分组id</p>
     * LIKE '%值'  entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdLikeLeft(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            likeLeft("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * LIKE '值%'  entity().getFkEmMemberGroupId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdLikeRight(){
        Long fkEmMemberGroupId =entity().getFkEmMemberGroupId();
        if(fkEmMemberGroupId!=null){
            likeRight("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 等于 =
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdEq(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            eq("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * 不等于 &lt;&gt;
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdNe(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            ne("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 大于 &gt;
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdGt(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            gt("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 大于等于 &gt;=
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdGe(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            ge("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 小于 &lt;
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdLt(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            lt("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * 小于等于 &lt;=
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdLe(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            le("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * LIKE '%值%'
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdLike(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            like("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * NOT LIKE '%值%'
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdNotLike(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            notLike("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }


    /**
     * <p>分组id</p>
     * LIKE '%值'
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdLikeLeft(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            likeLeft("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * LIKE '值%'
     * @param fkEmMemberGroupId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdLikeRight(Long fkEmMemberGroupId){
        if(fkEmMemberGroupId!=null){
            likeRight("fk_em_member_group_id",fkEmMemberGroupId);
        }
        return this;
     }

    /**
     * <p>分组id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdIsNull(){
        isNull("fk_em_member_group_id");
        return this;
    }

    /**
     * <p>分组id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdIsNotNull(){
        isNotNull("fk_em_member_group_id");
        return this;
    }

    /**
     * <p>分组id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_em_member_group_id",value);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_em_member_group_id",values);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_em_member_group_id",value);
        }
        return this;
    }

    /**
     * <p>分组id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmMemberGroupIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_member_group_id",values);
        }
        return this;
    }


    /**
     * <p>用户设备编号</p>
     * 等于 = entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoEq(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            eq("user_device_no",userDeviceNo);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * 不等于 &lt;&gt; entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoNe(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            ne("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 大于 &gt; entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoGt(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            gt("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 大于等于 &gt;= entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoGe(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            ge("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 小于 &lt; entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoLt(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            lt("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 小于等于 &lt;= entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoLe(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            le("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * BETWEEN  entity().getUserDeviceNo() AND userDeviceNoEnd
     * @param userDeviceNoEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoBetween(String userDeviceNoEnd){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null && userDeviceNoEnd!=null){
            between("user_device_no",userDeviceNo,userDeviceNoEnd);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * NOT BETWEEN  entity().getUserDeviceNo() AND 值2
     * @param userDeviceNoEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoNotBetween(String userDeviceNoEnd){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null && userDeviceNoEnd!=null){
            notBetween("user_device_no",userDeviceNo,userDeviceNoEnd);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * BETWEEN  entity().getUserDeviceNo() AND 值2
     * @param userDeviceNoStart       值1
     * @param userDeviceNoEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoBetween(String userDeviceNoStart,String userDeviceNoEnd){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null && userDeviceNoEnd!=null){
            between("user_device_no",userDeviceNoStart,userDeviceNoEnd);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * NOT BETWEEN  entity().getUserDeviceNo() AND 值2
     * @param userDeviceNoStart       值1
     * @param userDeviceNoEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoNotBetween(String userDeviceNoStart,String userDeviceNoEnd){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null && userDeviceNoEnd!=null){
            notBetween("user_device_no",userDeviceNoStart,userDeviceNoEnd);
        }
        return this;
     }


    /**
     * <p>用户设备编号</p>
     * LIKE '%值%'  entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoLike(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            like("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * NOT LIKE '%值%'  entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoNotLike(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            notLike("user_device_no",userDeviceNo);
        }
        return this;
     }


    /**
     * <p>用户设备编号</p>
     * LIKE '%值'  entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoLikeLeft(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            likeLeft("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * LIKE '值%'  entity().getUserDeviceNo()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoLikeRight(){
        String userDeviceNo =entity().getUserDeviceNo();
        if(userDeviceNo!=null){
            likeRight("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 等于 =
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoEq(String userDeviceNo){
        if(userDeviceNo!=null){
            eq("user_device_no",userDeviceNo);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * 不等于 &lt;&gt;
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoNe(String userDeviceNo){
        if(userDeviceNo!=null){
            ne("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 大于 &gt;
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoGt(String userDeviceNo){
        if(userDeviceNo!=null){
            gt("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 大于等于 &gt;=
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoGe(String userDeviceNo){
        if(userDeviceNo!=null){
            ge("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 小于 &lt;
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoLt(String userDeviceNo){
        if(userDeviceNo!=null){
            lt("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * 小于等于 &lt;=
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoLe(String userDeviceNo){
        if(userDeviceNo!=null){
            le("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * LIKE '%值%'
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoLike(String userDeviceNo){
        if(userDeviceNo!=null){
            like("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * NOT LIKE '%值%'
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoNotLike(String userDeviceNo){
        if(userDeviceNo!=null){
            notLike("user_device_no",userDeviceNo);
        }
        return this;
     }


    /**
     * <p>用户设备编号</p>
     * LIKE '%值'
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoLikeLeft(String userDeviceNo){
        if(userDeviceNo!=null){
            likeLeft("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * LIKE '值%'
     * @param userDeviceNo       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoLikeRight(String userDeviceNo){
        if(userDeviceNo!=null){
            likeRight("user_device_no",userDeviceNo);
        }
        return this;
     }

    /**
     * <p>用户设备编号</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoIsNull(){
        isNull("user_device_no");
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoIsNotNull(){
        isNotNull("user_device_no");
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("user_device_no",value);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoIn(String... values){
        if(values!=null && values.length>0){
            in("user_device_no",values);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("user_device_no",value);
        }
        return this;
    }

    /**
     * <p>用户设备编号</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper userDeviceNoNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("user_device_no",values);
        }
        return this;
    }


    /**
     * <p>严选下单实例id</p>
     * 等于 = entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdEq(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            eq("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * 不等于 &lt;&gt; entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdNe(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            ne("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 大于 &gt; entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdGt(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            gt("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 大于等于 &gt;= entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdGe(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            ge("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 小于 &lt; entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdLt(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            lt("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 小于等于 &lt;= entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdLe(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            le("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * BETWEEN  entity().getSmkpInstanceId() AND smkpInstanceIdEnd
     * @param smkpInstanceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdBetween(String smkpInstanceIdEnd){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null && smkpInstanceIdEnd!=null){
            between("smkp_instance_id",smkpInstanceId,smkpInstanceIdEnd);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * NOT BETWEEN  entity().getSmkpInstanceId() AND 值2
     * @param smkpInstanceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdNotBetween(String smkpInstanceIdEnd){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null && smkpInstanceIdEnd!=null){
            notBetween("smkp_instance_id",smkpInstanceId,smkpInstanceIdEnd);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * BETWEEN  entity().getSmkpInstanceId() AND 值2
     * @param smkpInstanceIdStart       值1
     * @param smkpInstanceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdBetween(String smkpInstanceIdStart,String smkpInstanceIdEnd){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null && smkpInstanceIdEnd!=null){
            between("smkp_instance_id",smkpInstanceIdStart,smkpInstanceIdEnd);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * NOT BETWEEN  entity().getSmkpInstanceId() AND 值2
     * @param smkpInstanceIdStart       值1
     * @param smkpInstanceIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdNotBetween(String smkpInstanceIdStart,String smkpInstanceIdEnd){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null && smkpInstanceIdEnd!=null){
            notBetween("smkp_instance_id",smkpInstanceIdStart,smkpInstanceIdEnd);
        }
        return this;
     }


    /**
     * <p>严选下单实例id</p>
     * LIKE '%值%'  entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdLike(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            like("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * NOT LIKE '%值%'  entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdNotLike(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            notLike("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }


    /**
     * <p>严选下单实例id</p>
     * LIKE '%值'  entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdLikeLeft(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            likeLeft("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * LIKE '值%'  entity().getSmkpInstanceId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdLikeRight(){
        String smkpInstanceId =entity().getSmkpInstanceId();
        if(smkpInstanceId!=null){
            likeRight("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 等于 =
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdEq(String smkpInstanceId){
        if(smkpInstanceId!=null){
            eq("smkp_instance_id",smkpInstanceId);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * 不等于 &lt;&gt;
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdNe(String smkpInstanceId){
        if(smkpInstanceId!=null){
            ne("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 大于 &gt;
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdGt(String smkpInstanceId){
        if(smkpInstanceId!=null){
            gt("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 大于等于 &gt;=
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdGe(String smkpInstanceId){
        if(smkpInstanceId!=null){
            ge("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 小于 &lt;
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdLt(String smkpInstanceId){
        if(smkpInstanceId!=null){
            lt("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * 小于等于 &lt;=
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdLe(String smkpInstanceId){
        if(smkpInstanceId!=null){
            le("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * LIKE '%值%'
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdLike(String smkpInstanceId){
        if(smkpInstanceId!=null){
            like("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * NOT LIKE '%值%'
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdNotLike(String smkpInstanceId){
        if(smkpInstanceId!=null){
            notLike("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }


    /**
     * <p>严选下单实例id</p>
     * LIKE '%值'
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdLikeLeft(String smkpInstanceId){
        if(smkpInstanceId!=null){
            likeLeft("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * LIKE '值%'
     * @param smkpInstanceId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdLikeRight(String smkpInstanceId){
        if(smkpInstanceId!=null){
            likeRight("smkp_instance_id",smkpInstanceId);
        }
        return this;
     }

    /**
     * <p>严选下单实例id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdIsNull(){
        isNull("smkp_instance_id");
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdIsNotNull(){
        isNotNull("smkp_instance_id");
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("smkp_instance_id",value);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdIn(String... values){
        if(values!=null && values.length>0){
            in("smkp_instance_id",values);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("smkp_instance_id",value);
        }
        return this;
    }

    /**
     * <p>严选下单实例id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper smkpInstanceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("smkp_instance_id",values);
        }
        return this;
    }


    /**
     * <p>物理设备id</p>
     * 等于 = entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdEq(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            eq("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 不等于 &lt;&gt; entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdNe(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            ne("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 大于 &gt; entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdGt(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            gt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 大于等于 &gt;= entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdGe(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            ge("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 小于 &lt; entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdLt(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            lt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 小于等于 &lt;= entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdLe(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            le("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * BETWEEN  entity().getFkEmSocDevicesId() AND fkEmSocDevicesIdEnd
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            between("fk_em_soc_devices_id",fkEmSocDevicesId,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * NOT BETWEEN  entity().getFkEmSocDevicesId() AND 值2
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            notBetween("fk_em_soc_devices_id",fkEmSocDevicesId,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * BETWEEN  entity().getFkEmSocDevicesId() AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            between("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * NOT BETWEEN  entity().getFkEmSocDevicesId() AND 值2
     * @param fkEmSocDevicesIdStart       值1
     * @param fkEmSocDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdNotBetween(Long fkEmSocDevicesIdStart,Long fkEmSocDevicesIdEnd){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null && fkEmSocDevicesIdEnd!=null){
            notBetween("fk_em_soc_devices_id",fkEmSocDevicesIdStart,fkEmSocDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p>物理设备id</p>
     * LIKE '%值%'  entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdLike(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            like("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * NOT LIKE '%值%'  entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdNotLike(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            notLike("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }


    /**
     * <p>物理设备id</p>
     * LIKE '%值'  entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdLikeLeft(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            likeLeft("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * LIKE '值%'  entity().getFkEmSocDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdLikeRight(){
        Long fkEmSocDevicesId =entity().getFkEmSocDevicesId();
        if(fkEmSocDevicesId!=null){
            likeRight("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 等于 =
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdEq(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            eq("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * 不等于 &lt;&gt;
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdNe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ne("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 大于 &gt;
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdGt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            gt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 大于等于 &gt;=
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdGe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            ge("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 小于 &lt;
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdLt(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            lt("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * 小于等于 &lt;=
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdLe(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            le("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * LIKE '%值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            like("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * NOT LIKE '%值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdNotLike(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            notLike("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }


    /**
     * <p>物理设备id</p>
     * LIKE '%值'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdLikeLeft(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            likeLeft("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * LIKE '值%'
     * @param fkEmSocDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdLikeRight(Long fkEmSocDevicesId){
        if(fkEmSocDevicesId!=null){
            likeRight("fk_em_soc_devices_id",fkEmSocDevicesId);
        }
        return this;
     }

    /**
     * <p>物理设备id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdIsNull(){
        isNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdIsNotNull(){
        isNotNull("fk_em_soc_devices_id");
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_em_soc_devices_id",value);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_em_soc_devices_id",values);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_em_soc_devices_id",value);
        }
        return this;
    }

    /**
     * <p>物理设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkEmSocDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_em_soc_devices_id",values);
        }
        return this;
    }


    /**
     * <p>虚拟设备id</p>
     * 等于 = entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdEq(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            eq("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * 不等于 &lt;&gt; entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdNe(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            ne("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 大于 &gt; entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdGt(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            gt("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 大于等于 &gt;= entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdGe(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            ge("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 小于 &lt; entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdLt(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            lt("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 小于等于 &lt;= entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdLe(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            le("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * BETWEEN  entity().getFkSocVmDevicesId() AND fkSocVmDevicesIdEnd
     * @param fkSocVmDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdBetween(Long fkSocVmDevicesIdEnd){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null && fkSocVmDevicesIdEnd!=null){
            between("fk_soc_vm_devices_id",fkSocVmDevicesId,fkSocVmDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * NOT BETWEEN  entity().getFkSocVmDevicesId() AND 值2
     * @param fkSocVmDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdNotBetween(Long fkSocVmDevicesIdEnd){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null && fkSocVmDevicesIdEnd!=null){
            notBetween("fk_soc_vm_devices_id",fkSocVmDevicesId,fkSocVmDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * BETWEEN  entity().getFkSocVmDevicesId() AND 值2
     * @param fkSocVmDevicesIdStart       值1
     * @param fkSocVmDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdBetween(Long fkSocVmDevicesIdStart,Long fkSocVmDevicesIdEnd){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null && fkSocVmDevicesIdEnd!=null){
            between("fk_soc_vm_devices_id",fkSocVmDevicesIdStart,fkSocVmDevicesIdEnd);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * NOT BETWEEN  entity().getFkSocVmDevicesId() AND 值2
     * @param fkSocVmDevicesIdStart       值1
     * @param fkSocVmDevicesIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdNotBetween(Long fkSocVmDevicesIdStart,Long fkSocVmDevicesIdEnd){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null && fkSocVmDevicesIdEnd!=null){
            notBetween("fk_soc_vm_devices_id",fkSocVmDevicesIdStart,fkSocVmDevicesIdEnd);
        }
        return this;
     }


    /**
     * <p>虚拟设备id</p>
     * LIKE '%值%'  entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdLike(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            like("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * NOT LIKE '%值%'  entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdNotLike(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            notLike("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }


    /**
     * <p>虚拟设备id</p>
     * LIKE '%值'  entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdLikeLeft(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            likeLeft("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * LIKE '值%'  entity().getFkSocVmDevicesId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdLikeRight(){
        Long fkSocVmDevicesId =entity().getFkSocVmDevicesId();
        if(fkSocVmDevicesId!=null){
            likeRight("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 等于 =
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdEq(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            eq("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * 不等于 &lt;&gt;
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdNe(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            ne("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 大于 &gt;
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdGt(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            gt("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 大于等于 &gt;=
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdGe(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            ge("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 小于 &lt;
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdLt(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            lt("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * 小于等于 &lt;=
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdLe(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            le("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * LIKE '%值%'
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdLike(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            like("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * NOT LIKE '%值%'
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdNotLike(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            notLike("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }


    /**
     * <p>虚拟设备id</p>
     * LIKE '%值'
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdLikeLeft(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            likeLeft("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * LIKE '值%'
     * @param fkSocVmDevicesId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdLikeRight(Long fkSocVmDevicesId){
        if(fkSocVmDevicesId!=null){
            likeRight("fk_soc_vm_devices_id",fkSocVmDevicesId);
        }
        return this;
     }

    /**
     * <p>虚拟设备id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdIsNull(){
        isNull("fk_soc_vm_devices_id");
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdIsNotNull(){
        isNotNull("fk_soc_vm_devices_id");
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_soc_vm_devices_id",value);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_soc_vm_devices_id",values);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_soc_vm_devices_id",value);
        }
        return this;
    }

    /**
     * <p>虚拟设备id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkSocVmDevicesIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_soc_vm_devices_id",values);
        }
        return this;
    }


    /**
     * <p>分组名称</p>
     * 等于 = entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameEq(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            eq("member_group_name",memberGroupName);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * 不等于 &lt;&gt; entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameNe(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            ne("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 大于 &gt; entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameGt(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            gt("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 大于等于 &gt;= entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameGe(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            ge("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 小于 &lt; entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameLt(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            lt("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 小于等于 &lt;= entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameLe(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            le("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * BETWEEN  entity().getMemberGroupName() AND memberGroupNameEnd
     * @param memberGroupNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameBetween(String memberGroupNameEnd){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null && memberGroupNameEnd!=null){
            between("member_group_name",memberGroupName,memberGroupNameEnd);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * NOT BETWEEN  entity().getMemberGroupName() AND 值2
     * @param memberGroupNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameNotBetween(String memberGroupNameEnd){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null && memberGroupNameEnd!=null){
            notBetween("member_group_name",memberGroupName,memberGroupNameEnd);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * BETWEEN  entity().getMemberGroupName() AND 值2
     * @param memberGroupNameStart       值1
     * @param memberGroupNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameBetween(String memberGroupNameStart,String memberGroupNameEnd){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null && memberGroupNameEnd!=null){
            between("member_group_name",memberGroupNameStart,memberGroupNameEnd);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * NOT BETWEEN  entity().getMemberGroupName() AND 值2
     * @param memberGroupNameStart       值1
     * @param memberGroupNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameNotBetween(String memberGroupNameStart,String memberGroupNameEnd){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null && memberGroupNameEnd!=null){
            notBetween("member_group_name",memberGroupNameStart,memberGroupNameEnd);
        }
        return this;
     }


    /**
     * <p>分组名称</p>
     * LIKE '%值%'  entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameLike(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            like("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * NOT LIKE '%值%'  entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameNotLike(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            notLike("member_group_name",memberGroupName);
        }
        return this;
     }


    /**
     * <p>分组名称</p>
     * LIKE '%值'  entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameLikeLeft(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            likeLeft("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * LIKE '值%'  entity().getMemberGroupName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameLikeRight(){
        String memberGroupName =entity().getMemberGroupName();
        if(memberGroupName!=null){
            likeRight("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 等于 =
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameEq(String memberGroupName){
        if(memberGroupName!=null){
            eq("member_group_name",memberGroupName);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * 不等于 &lt;&gt;
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameNe(String memberGroupName){
        if(memberGroupName!=null){
            ne("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 大于 &gt;
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameGt(String memberGroupName){
        if(memberGroupName!=null){
            gt("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 大于等于 &gt;=
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameGe(String memberGroupName){
        if(memberGroupName!=null){
            ge("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 小于 &lt;
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameLt(String memberGroupName){
        if(memberGroupName!=null){
            lt("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * 小于等于 &lt;=
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameLe(String memberGroupName){
        if(memberGroupName!=null){
            le("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * LIKE '%值%'
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameLike(String memberGroupName){
        if(memberGroupName!=null){
            like("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * NOT LIKE '%值%'
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameNotLike(String memberGroupName){
        if(memberGroupName!=null){
            notLike("member_group_name",memberGroupName);
        }
        return this;
     }


    /**
     * <p>分组名称</p>
     * LIKE '%值'
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameLikeLeft(String memberGroupName){
        if(memberGroupName!=null){
            likeLeft("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * LIKE '值%'
     * @param memberGroupName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameLikeRight(String memberGroupName){
        if(memberGroupName!=null){
            likeRight("member_group_name",memberGroupName);
        }
        return this;
     }

    /**
     * <p>分组名称</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameIsNull(){
        isNull("member_group_name");
        return this;
    }

    /**
     * <p>分组名称</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameIsNotNull(){
        isNotNull("member_group_name");
        return this;
    }

    /**
     * <p>分组名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("member_group_name",value);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameIn(String... values){
        if(values!=null && values.length>0){
            in("member_group_name",values);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("member_group_name",value);
        }
        return this;
    }

    /**
     * <p>分组名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper memberGroupNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("member_group_name",values);
        }
        return this;
    }


    /**
     * <p>云机产品id</p>
     * 等于 = entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdEq(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            eq("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * 不等于 &lt;&gt; entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdNe(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            ne("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 大于 &gt; entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdGt(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            gt("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 大于等于 &gt;= entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdGe(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            ge("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 小于 &lt; entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdLt(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            lt("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 小于等于 &lt;= entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdLe(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            le("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * BETWEEN  entity().getFkYunProductId() AND fkYunProductIdEnd
     * @param fkYunProductIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdBetween(Long fkYunProductIdEnd){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null && fkYunProductIdEnd!=null){
            between("fk_yun_product_id",fkYunProductId,fkYunProductIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * NOT BETWEEN  entity().getFkYunProductId() AND 值2
     * @param fkYunProductIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdNotBetween(Long fkYunProductIdEnd){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null && fkYunProductIdEnd!=null){
            notBetween("fk_yun_product_id",fkYunProductId,fkYunProductIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * BETWEEN  entity().getFkYunProductId() AND 值2
     * @param fkYunProductIdStart       值1
     * @param fkYunProductIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdBetween(Long fkYunProductIdStart,Long fkYunProductIdEnd){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null && fkYunProductIdEnd!=null){
            between("fk_yun_product_id",fkYunProductIdStart,fkYunProductIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * NOT BETWEEN  entity().getFkYunProductId() AND 值2
     * @param fkYunProductIdStart       值1
     * @param fkYunProductIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdNotBetween(Long fkYunProductIdStart,Long fkYunProductIdEnd){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null && fkYunProductIdEnd!=null){
            notBetween("fk_yun_product_id",fkYunProductIdStart,fkYunProductIdEnd);
        }
        return this;
     }


    /**
     * <p>云机产品id</p>
     * LIKE '%值%'  entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdLike(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            like("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * NOT LIKE '%值%'  entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdNotLike(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            notLike("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }


    /**
     * <p>云机产品id</p>
     * LIKE '%值'  entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdLikeLeft(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            likeLeft("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * LIKE '值%'  entity().getFkYunProductId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdLikeRight(){
        Long fkYunProductId =entity().getFkYunProductId();
        if(fkYunProductId!=null){
            likeRight("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 等于 =
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdEq(Long fkYunProductId){
        if(fkYunProductId!=null){
            eq("fk_yun_product_id",fkYunProductId);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * 不等于 &lt;&gt;
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdNe(Long fkYunProductId){
        if(fkYunProductId!=null){
            ne("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 大于 &gt;
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdGt(Long fkYunProductId){
        if(fkYunProductId!=null){
            gt("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 大于等于 &gt;=
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdGe(Long fkYunProductId){
        if(fkYunProductId!=null){
            ge("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 小于 &lt;
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdLt(Long fkYunProductId){
        if(fkYunProductId!=null){
            lt("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * 小于等于 &lt;=
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdLe(Long fkYunProductId){
        if(fkYunProductId!=null){
            le("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * LIKE '%值%'
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdLike(Long fkYunProductId){
        if(fkYunProductId!=null){
            like("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * NOT LIKE '%值%'
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdNotLike(Long fkYunProductId){
        if(fkYunProductId!=null){
            notLike("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }


    /**
     * <p>云机产品id</p>
     * LIKE '%值'
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdLikeLeft(Long fkYunProductId){
        if(fkYunProductId!=null){
            likeLeft("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * LIKE '值%'
     * @param fkYunProductId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdLikeRight(Long fkYunProductId){
        if(fkYunProductId!=null){
            likeRight("fk_yun_product_id",fkYunProductId);
        }
        return this;
     }

    /**
     * <p>云机产品id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdIsNull(){
        isNull("fk_yun_product_id");
        return this;
    }

    /**
     * <p>云机产品id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdIsNotNull(){
        isNotNull("fk_yun_product_id");
        return this;
    }

    /**
     * <p>云机产品id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_yun_product_id",value);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_yun_product_id",values);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_yun_product_id",value);
        }
        return this;
    }

    /**
     * <p>云机产品id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_yun_product_id",values);
        }
        return this;
    }


    /**
     * <p>云机产品套餐skuid</p>
     * 等于 = entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdEq(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            eq("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * 不等于 &lt;&gt; entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdNe(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            ne("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 大于 &gt; entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdGt(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            gt("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 大于等于 &gt;= entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdGe(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            ge("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 小于 &lt; entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdLt(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            lt("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 小于等于 &lt;= entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdLe(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            le("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * BETWEEN  entity().getFkYunProductSkuId() AND fkYunProductSkuIdEnd
     * @param fkYunProductSkuIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdBetween(Long fkYunProductSkuIdEnd){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null && fkYunProductSkuIdEnd!=null){
            between("fk_yun_product_sku_id",fkYunProductSkuId,fkYunProductSkuIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT BETWEEN  entity().getFkYunProductSkuId() AND 值2
     * @param fkYunProductSkuIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdNotBetween(Long fkYunProductSkuIdEnd){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null && fkYunProductSkuIdEnd!=null){
            notBetween("fk_yun_product_sku_id",fkYunProductSkuId,fkYunProductSkuIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * BETWEEN  entity().getFkYunProductSkuId() AND 值2
     * @param fkYunProductSkuIdStart       值1
     * @param fkYunProductSkuIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdBetween(Long fkYunProductSkuIdStart,Long fkYunProductSkuIdEnd){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null && fkYunProductSkuIdEnd!=null){
            between("fk_yun_product_sku_id",fkYunProductSkuIdStart,fkYunProductSkuIdEnd);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT BETWEEN  entity().getFkYunProductSkuId() AND 值2
     * @param fkYunProductSkuIdStart       值1
     * @param fkYunProductSkuIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdNotBetween(Long fkYunProductSkuIdStart,Long fkYunProductSkuIdEnd){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null && fkYunProductSkuIdEnd!=null){
            notBetween("fk_yun_product_sku_id",fkYunProductSkuIdStart,fkYunProductSkuIdEnd);
        }
        return this;
     }


    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '%值%'  entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdLike(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            like("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT LIKE '%值%'  entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdNotLike(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            notLike("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }


    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '%值'  entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdLikeLeft(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            likeLeft("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '值%'  entity().getFkYunProductSkuId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdLikeRight(){
        Long fkYunProductSkuId =entity().getFkYunProductSkuId();
        if(fkYunProductSkuId!=null){
            likeRight("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 等于 =
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdEq(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            eq("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * 不等于 &lt;&gt;
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdNe(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            ne("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 大于 &gt;
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdGt(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            gt("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 大于等于 &gt;=
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdGe(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            ge("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 小于 &lt;
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdLt(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            lt("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * 小于等于 &lt;=
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdLe(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            le("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '%值%'
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdLike(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            like("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT LIKE '%值%'
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdNotLike(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            notLike("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }


    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '%值'
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdLikeLeft(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            likeLeft("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * LIKE '值%'
     * @param fkYunProductSkuId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdLikeRight(Long fkYunProductSkuId){
        if(fkYunProductSkuId!=null){
            likeRight("fk_yun_product_sku_id",fkYunProductSkuId);
        }
        return this;
     }

    /**
     * <p>云机产品套餐skuid</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdIsNull(){
        isNull("fk_yun_product_sku_id");
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdIsNotNull(){
        isNotNull("fk_yun_product_sku_id");
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_yun_product_sku_id",value);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_yun_product_sku_id",values);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_yun_product_sku_id",value);
        }
        return this;
    }

    /**
     * <p>云机产品套餐skuid</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkYunProductSkuIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_yun_product_sku_id",values);
        }
        return this;
    }


    /**
     * <p>产品名称</p>
     * 等于 = entity().getProductName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameEq(){
        String productName =entity().getProductName();
        if(productName!=null){
            eq("product_name",productName);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * 不等于 &lt;&gt; entity().getProductName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameNe(){
        String productName =entity().getProductName();
        if(productName!=null){
            ne("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 大于 &gt; entity().getProductName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameGt(){
        String productName =entity().getProductName();
        if(productName!=null){
            gt("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 大于等于 &gt;= entity().getProductName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameGe(){
        String productName =entity().getProductName();
        if(productName!=null){
            ge("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 小于 &lt; entity().getProductName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameLt(){
        String productName =entity().getProductName();
        if(productName!=null){
            lt("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 小于等于 &lt;= entity().getProductName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameLe(){
        String productName =entity().getProductName();
        if(productName!=null){
            le("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * BETWEEN  entity().getProductName() AND productNameEnd
     * @param productNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameBetween(String productNameEnd){
        String productName =entity().getProductName();
        if(productName!=null && productNameEnd!=null){
            between("product_name",productName,productNameEnd);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * NOT BETWEEN  entity().getProductName() AND 值2
     * @param productNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameNotBetween(String productNameEnd){
        String productName =entity().getProductName();
        if(productName!=null && productNameEnd!=null){
            notBetween("product_name",productName,productNameEnd);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * BETWEEN  entity().getProductName() AND 值2
     * @param productNameStart       值1
     * @param productNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameBetween(String productNameStart,String productNameEnd){
        String productName =entity().getProductName();
        if(productName!=null && productNameEnd!=null){
            between("product_name",productNameStart,productNameEnd);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * NOT BETWEEN  entity().getProductName() AND 值2
     * @param productNameStart       值1
     * @param productNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameNotBetween(String productNameStart,String productNameEnd){
        String productName =entity().getProductName();
        if(productName!=null && productNameEnd!=null){
            notBetween("product_name",productNameStart,productNameEnd);
        }
        return this;
     }


    /**
     * <p>产品名称</p>
     * LIKE '%值%'  entity().getProductName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameLike(){
        String productName =entity().getProductName();
        if(productName!=null){
            like("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * NOT LIKE '%值%'  entity().getProductName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameNotLike(){
        String productName =entity().getProductName();
        if(productName!=null){
            notLike("product_name",productName);
        }
        return this;
     }


    /**
     * <p>产品名称</p>
     * LIKE '%值'  entity().getProductName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameLikeLeft(){
        String productName =entity().getProductName();
        if(productName!=null){
            likeLeft("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * LIKE '值%'  entity().getProductName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameLikeRight(){
        String productName =entity().getProductName();
        if(productName!=null){
            likeRight("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 等于 =
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameEq(String productName){
        if(productName!=null){
            eq("product_name",productName);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * 不等于 &lt;&gt;
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameNe(String productName){
        if(productName!=null){
            ne("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 大于 &gt;
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameGt(String productName){
        if(productName!=null){
            gt("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 大于等于 &gt;=
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameGe(String productName){
        if(productName!=null){
            ge("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 小于 &lt;
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameLt(String productName){
        if(productName!=null){
            lt("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * 小于等于 &lt;=
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameLe(String productName){
        if(productName!=null){
            le("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * LIKE '%值%'
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameLike(String productName){
        if(productName!=null){
            like("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * NOT LIKE '%值%'
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameNotLike(String productName){
        if(productName!=null){
            notLike("product_name",productName);
        }
        return this;
     }


    /**
     * <p>产品名称</p>
     * LIKE '%值'
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameLikeLeft(String productName){
        if(productName!=null){
            likeLeft("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * LIKE '值%'
     * @param productName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameLikeRight(String productName){
        if(productName!=null){
            likeRight("product_name",productName);
        }
        return this;
     }

    /**
     * <p>产品名称</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameIsNull(){
        isNull("product_name");
        return this;
    }

    /**
     * <p>产品名称</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameIsNotNull(){
        isNotNull("product_name");
        return this;
    }

    /**
     * <p>产品名称</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("product_name",value);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameIn(String... values){
        if(values!=null && values.length>0){
            in("product_name",values);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("product_name",value);
        }
        return this;
    }

    /**
     * <p>产品名称</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper productNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("product_name",values);
        }
        return this;
    }


    /**
     * <p>设备唯一码</p>
     * 等于 = entity().getDeviceId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceIdEq(){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdNe(){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdGt(){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdGe(){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdLt(){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdLe(){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdBetween(String deviceIdEnd){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdNotBetween(String deviceIdEnd){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdBetween(String deviceIdStart,String deviceIdEnd){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdNotBetween(String deviceIdStart,String deviceIdEnd){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdLike(){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdNotLike(){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdLikeLeft(){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdLikeRight(){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdEq(String deviceId){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdNe(String deviceId){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdGt(String deviceId){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdGe(String deviceId){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdLt(String deviceId){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdLe(String deviceId){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdLike(String deviceId){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdNotLike(String deviceId){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdLikeLeft(String deviceId){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdLikeRight(String deviceId){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdIsNull(){
        isNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceIdIsNotNull(){
        isNotNull("device_id");
        return this;
    }

    /**
     * <p>设备唯一码</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceIdIn(Collection<String> value){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdIn(String... values){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryEntityWrapper deviceIdNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_id",values);
        }
        return this;
    }


    /**
     * <p>设备名</p>
     * 等于 = entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameEq(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            eq("device_name",deviceName);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * 不等于 &lt;&gt; entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameNe(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            ne("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 大于 &gt; entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameGt(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            gt("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 大于等于 &gt;= entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameGe(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            ge("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 小于 &lt; entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameLt(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            lt("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 小于等于 &lt;= entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameLe(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            le("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * BETWEEN  entity().getDeviceName() AND deviceNameEnd
     * @param deviceNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameBetween(String deviceNameEnd){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null && deviceNameEnd!=null){
            between("device_name",deviceName,deviceNameEnd);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * NOT BETWEEN  entity().getDeviceName() AND 值2
     * @param deviceNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameNotBetween(String deviceNameEnd){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null && deviceNameEnd!=null){
            notBetween("device_name",deviceName,deviceNameEnd);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * BETWEEN  entity().getDeviceName() AND 值2
     * @param deviceNameStart       值1
     * @param deviceNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameBetween(String deviceNameStart,String deviceNameEnd){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null && deviceNameEnd!=null){
            between("device_name",deviceNameStart,deviceNameEnd);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * NOT BETWEEN  entity().getDeviceName() AND 值2
     * @param deviceNameStart       值1
     * @param deviceNameEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameNotBetween(String deviceNameStart,String deviceNameEnd){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null && deviceNameEnd!=null){
            notBetween("device_name",deviceNameStart,deviceNameEnd);
        }
        return this;
     }


    /**
     * <p>设备名</p>
     * LIKE '%值%'  entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameLike(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            like("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * NOT LIKE '%值%'  entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameNotLike(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            notLike("device_name",deviceName);
        }
        return this;
     }


    /**
     * <p>设备名</p>
     * LIKE '%值'  entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameLikeLeft(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            likeLeft("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * LIKE '值%'  entity().getDeviceName()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameLikeRight(){
        String deviceName =entity().getDeviceName();
        if(deviceName!=null){
            likeRight("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 等于 =
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameEq(String deviceName){
        if(deviceName!=null){
            eq("device_name",deviceName);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * 不等于 &lt;&gt;
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameNe(String deviceName){
        if(deviceName!=null){
            ne("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 大于 &gt;
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameGt(String deviceName){
        if(deviceName!=null){
            gt("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 大于等于 &gt;=
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameGe(String deviceName){
        if(deviceName!=null){
            ge("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 小于 &lt;
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameLt(String deviceName){
        if(deviceName!=null){
            lt("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * 小于等于 &lt;=
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameLe(String deviceName){
        if(deviceName!=null){
            le("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * LIKE '%值%'
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameLike(String deviceName){
        if(deviceName!=null){
            like("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * NOT LIKE '%值%'
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameNotLike(String deviceName){
        if(deviceName!=null){
            notLike("device_name",deviceName);
        }
        return this;
     }


    /**
     * <p>设备名</p>
     * LIKE '%值'
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameLikeLeft(String deviceName){
        if(deviceName!=null){
            likeLeft("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * LIKE '值%'
     * @param deviceName       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameLikeRight(String deviceName){
        if(deviceName!=null){
            likeRight("device_name",deviceName);
        }
        return this;
     }

    /**
     * <p>设备名</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameIsNull(){
        isNull("device_name");
        return this;
    }

    /**
     * <p>设备名</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameIsNotNull(){
        isNotNull("device_name");
        return this;
    }

    /**
     * <p>设备名</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("device_name",value);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameIn(String... values){
        if(values!=null && values.length>0){
            in("device_name",values);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("device_name",value);
        }
        return this;
    }

    /**
     * <p>设备名</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper deviceNameNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("device_name",values);
        }
        return this;
    }


    /**
     * <p>使用有效期开始时间</p>
     * 等于 = entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validStartTimeEq(){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeNe(){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeGt(){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeGe(){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeLt(){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeLe(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            le("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * BETWEEN  entity().getValidStartTime() AND validStartTimeEnd
     * @param validStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validStartTimeBetween(Date validStartTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeNotBetween(Date validStartTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeBetween(Date validStartTimeStart,Date validStartTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeNotBetween(Date validStartTimeStart,Date validStartTimeEnd){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null && validStartTimeEnd!=null){
            notBetween("valid_start_time",validStartTimeStart,validStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值%'  entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validStartTimeLike(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            like("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * NOT LIKE '%值%'  entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validStartTimeNotLike(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            notLike("valid_start_time",validStartTime);
        }
        return this;
     }


    /**
     * <p>使用有效期开始时间</p>
     * LIKE '%值'  entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validStartTimeLikeLeft(){
        Date validStartTime =entity().getValidStartTime();
        if(validStartTime!=null){
            likeLeft("valid_start_time",validStartTime);
        }
        return this;
     }

    /**
     * <p>使用有效期开始时间</p>
     * LIKE '值%'  entity().getValidStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validStartTimeLikeRight(){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeEq(Date validStartTime){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeNe(Date validStartTime){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeGt(Date validStartTime){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeGe(Date validStartTime){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeLt(Date validStartTime){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeLe(Date validStartTime){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeLike(Date validStartTime){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeNotLike(Date validStartTime){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeLikeLeft(Date validStartTime){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeLikeRight(Date validStartTime){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeIsNull(){
        isNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validStartTimeIsNotNull(){
        isNotNull("valid_start_time");
        return this;
    }

    /**
     * <p>使用有效期开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validStartTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeIn(Date... values){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryEntityWrapper validStartTimeNotIn(Date... values){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeEq(){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeNe(){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeGt(){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeGe(){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeLt(){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeLe(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            le("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * BETWEEN  entity().getValidEndTime() AND validEndTimeEnd
     * @param validEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validEndTimeBetween(Date validEndTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeNotBetween(Date validEndTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeBetween(Date validEndTimeStart,Date validEndTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeNotBetween(Date validEndTimeStart,Date validEndTimeEnd){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null && validEndTimeEnd!=null){
            notBetween("valid_end_time",validEndTimeStart,validEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值%'  entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validEndTimeLike(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            like("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * NOT LIKE '%值%'  entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validEndTimeNotLike(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            notLike("valid_end_time",validEndTime);
        }
        return this;
     }


    /**
     * <p>使用有效期结束时间</p>
     * LIKE '%值'  entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validEndTimeLikeLeft(){
        Date validEndTime =entity().getValidEndTime();
        if(validEndTime!=null){
            likeLeft("valid_end_time",validEndTime);
        }
        return this;
     }

    /**
     * <p>使用有效期结束时间</p>
     * LIKE '值%'  entity().getValidEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validEndTimeLikeRight(){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeEq(Date validEndTime){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeNe(Date validEndTime){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeGt(Date validEndTime){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeGe(Date validEndTime){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeLt(Date validEndTime){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeLe(Date validEndTime){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeLike(Date validEndTime){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeNotLike(Date validEndTime){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeLikeLeft(Date validEndTime){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeLikeRight(Date validEndTime){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeIsNull(){
        isNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validEndTimeIsNotNull(){
        isNotNull("valid_end_time");
        return this;
    }

    /**
     * <p>使用有效期结束时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper validEndTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeIn(Date... values){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryEntityWrapper validEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("valid_end_time",values);
        }
        return this;
    }


    /**
     * <p>冻结开始时间</p>
     * 等于 = entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeEq(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            eq("freeze_start_time",freezeStartTime);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * 不等于 &lt;&gt; entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeNe(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            ne("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 大于 &gt; entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeGt(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            gt("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 大于等于 &gt;= entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeGe(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            ge("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 小于 &lt; entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeLt(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            lt("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 小于等于 &lt;= entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeLe(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            le("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * BETWEEN  entity().getFreezeStartTime() AND freezeStartTimeEnd
     * @param freezeStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeBetween(Date freezeStartTimeEnd){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null && freezeStartTimeEnd!=null){
            between("freeze_start_time",freezeStartTime,freezeStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * NOT BETWEEN  entity().getFreezeStartTime() AND 值2
     * @param freezeStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeNotBetween(Date freezeStartTimeEnd){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null && freezeStartTimeEnd!=null){
            notBetween("freeze_start_time",freezeStartTime,freezeStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * BETWEEN  entity().getFreezeStartTime() AND 值2
     * @param freezeStartTimeStart       值1
     * @param freezeStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeBetween(Date freezeStartTimeStart,Date freezeStartTimeEnd){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null && freezeStartTimeEnd!=null){
            between("freeze_start_time",freezeStartTimeStart,freezeStartTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * NOT BETWEEN  entity().getFreezeStartTime() AND 值2
     * @param freezeStartTimeStart       值1
     * @param freezeStartTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeNotBetween(Date freezeStartTimeStart,Date freezeStartTimeEnd){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null && freezeStartTimeEnd!=null){
            notBetween("freeze_start_time",freezeStartTimeStart,freezeStartTimeEnd);
        }
        return this;
     }


    /**
     * <p>冻结开始时间</p>
     * LIKE '%值%'  entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeLike(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            like("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * NOT LIKE '%值%'  entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeNotLike(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            notLike("freeze_start_time",freezeStartTime);
        }
        return this;
     }


    /**
     * <p>冻结开始时间</p>
     * LIKE '%值'  entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeLikeLeft(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            likeLeft("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * LIKE '值%'  entity().getFreezeStartTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeLikeRight(){
        Date freezeStartTime =entity().getFreezeStartTime();
        if(freezeStartTime!=null){
            likeRight("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 等于 =
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeEq(Date freezeStartTime){
        if(freezeStartTime!=null){
            eq("freeze_start_time",freezeStartTime);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * 不等于 &lt;&gt;
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeNe(Date freezeStartTime){
        if(freezeStartTime!=null){
            ne("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 大于 &gt;
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeGt(Date freezeStartTime){
        if(freezeStartTime!=null){
            gt("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 大于等于 &gt;=
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeGe(Date freezeStartTime){
        if(freezeStartTime!=null){
            ge("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 小于 &lt;
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeLt(Date freezeStartTime){
        if(freezeStartTime!=null){
            lt("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * 小于等于 &lt;=
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeLe(Date freezeStartTime){
        if(freezeStartTime!=null){
            le("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * LIKE '%值%'
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeLike(Date freezeStartTime){
        if(freezeStartTime!=null){
            like("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * NOT LIKE '%值%'
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeNotLike(Date freezeStartTime){
        if(freezeStartTime!=null){
            notLike("freeze_start_time",freezeStartTime);
        }
        return this;
     }


    /**
     * <p>冻结开始时间</p>
     * LIKE '%值'
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeLikeLeft(Date freezeStartTime){
        if(freezeStartTime!=null){
            likeLeft("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * LIKE '值%'
     * @param freezeStartTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeLikeRight(Date freezeStartTime){
        if(freezeStartTime!=null){
            likeRight("freeze_start_time",freezeStartTime);
        }
        return this;
     }

    /**
     * <p>冻结开始时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeIsNull(){
        isNull("freeze_start_time");
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeIsNotNull(){
        isNotNull("freeze_start_time");
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("freeze_start_time",value);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("freeze_start_time",values);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("freeze_start_time",value);
        }
        return this;
    }

    /**
     * <p>冻结开始时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeStartTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("freeze_start_time",values);
        }
        return this;
    }


    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 等于 = entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeEq(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            eq("freeze_end_time",freezeEndTime);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 不等于 &lt;&gt; entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeNe(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            ne("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 大于 &gt; entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeGt(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            gt("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 大于等于 &gt;= entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeGe(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            ge("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 小于 &lt; entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeLt(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            lt("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 小于等于 &lt;= entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeLe(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            le("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * BETWEEN  entity().getFreezeEndTime() AND freezeEndTimeEnd
     * @param freezeEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeBetween(Date freezeEndTimeEnd){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null && freezeEndTimeEnd!=null){
            between("freeze_end_time",freezeEndTime,freezeEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT BETWEEN  entity().getFreezeEndTime() AND 值2
     * @param freezeEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeNotBetween(Date freezeEndTimeEnd){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null && freezeEndTimeEnd!=null){
            notBetween("freeze_end_time",freezeEndTime,freezeEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * BETWEEN  entity().getFreezeEndTime() AND 值2
     * @param freezeEndTimeStart       值1
     * @param freezeEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeBetween(Date freezeEndTimeStart,Date freezeEndTimeEnd){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null && freezeEndTimeEnd!=null){
            between("freeze_end_time",freezeEndTimeStart,freezeEndTimeEnd);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT BETWEEN  entity().getFreezeEndTime() AND 值2
     * @param freezeEndTimeStart       值1
     * @param freezeEndTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeNotBetween(Date freezeEndTimeStart,Date freezeEndTimeEnd){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null && freezeEndTimeEnd!=null){
            notBetween("freeze_end_time",freezeEndTimeStart,freezeEndTimeEnd);
        }
        return this;
     }


    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '%值%'  entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeLike(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            like("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT LIKE '%值%'  entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeNotLike(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            notLike("freeze_end_time",freezeEndTime);
        }
        return this;
     }


    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '%值'  entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeLikeLeft(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            likeLeft("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '值%'  entity().getFreezeEndTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeLikeRight(){
        Date freezeEndTime =entity().getFreezeEndTime();
        if(freezeEndTime!=null){
            likeRight("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 等于 =
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeEq(Date freezeEndTime){
        if(freezeEndTime!=null){
            eq("freeze_end_time",freezeEndTime);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 不等于 &lt;&gt;
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeNe(Date freezeEndTime){
        if(freezeEndTime!=null){
            ne("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 大于 &gt;
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeGt(Date freezeEndTime){
        if(freezeEndTime!=null){
            gt("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 大于等于 &gt;=
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeGe(Date freezeEndTime){
        if(freezeEndTime!=null){
            ge("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 小于 &lt;
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeLt(Date freezeEndTime){
        if(freezeEndTime!=null){
            lt("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * 小于等于 &lt;=
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeLe(Date freezeEndTime){
        if(freezeEndTime!=null){
            le("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '%值%'
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeLike(Date freezeEndTime){
        if(freezeEndTime!=null){
            like("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT LIKE '%值%'
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeNotLike(Date freezeEndTime){
        if(freezeEndTime!=null){
            notLike("freeze_end_time",freezeEndTime);
        }
        return this;
     }


    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '%值'
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeLikeLeft(Date freezeEndTime){
        if(freezeEndTime!=null){
            likeLeft("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * LIKE '值%'
     * @param freezeEndTime       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeLikeRight(Date freezeEndTime){
        if(freezeEndTime!=null){
            likeRight("freeze_end_time",freezeEndTime);
        }
        return this;
     }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeIsNull(){
        isNull("freeze_end_time");
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeIsNotNull(){
        isNotNull("freeze_end_time");
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            in("freeze_end_time",value);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeIn(Date... values){
        if(values!=null && values.length>0){
            in("freeze_end_time",values);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeNotIn(Collection<Date> value){
        if(value!=null && !value.isEmpty()){
            notIn("freeze_end_time",value);
        }
        return this;
    }

    /**
     * <p>冻结结束时间（释放设备的时间）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper freezeEndTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("freeze_end_time",values);
        }
        return this;
    }


    /**
     * <p>总天数（单位：天）</p>
     * 等于 = entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysEq(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            eq("total_available_days",totalAvailableDays);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * 不等于 &lt;&gt; entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysNe(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            ne("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 大于 &gt; entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysGt(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            gt("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 大于等于 &gt;= entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysGe(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            ge("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 小于 &lt; entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysLt(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            lt("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 小于等于 &lt;= entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysLe(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            le("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * BETWEEN  entity().getTotalAvailableDays() AND totalAvailableDaysEnd
     * @param totalAvailableDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysBetween(Integer totalAvailableDaysEnd){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null && totalAvailableDaysEnd!=null){
            between("total_available_days",totalAvailableDays,totalAvailableDaysEnd);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * NOT BETWEEN  entity().getTotalAvailableDays() AND 值2
     * @param totalAvailableDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysNotBetween(Integer totalAvailableDaysEnd){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null && totalAvailableDaysEnd!=null){
            notBetween("total_available_days",totalAvailableDays,totalAvailableDaysEnd);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * BETWEEN  entity().getTotalAvailableDays() AND 值2
     * @param totalAvailableDaysStart       值1
     * @param totalAvailableDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysBetween(Integer totalAvailableDaysStart,Integer totalAvailableDaysEnd){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null && totalAvailableDaysEnd!=null){
            between("total_available_days",totalAvailableDaysStart,totalAvailableDaysEnd);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * NOT BETWEEN  entity().getTotalAvailableDays() AND 值2
     * @param totalAvailableDaysStart       值1
     * @param totalAvailableDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysNotBetween(Integer totalAvailableDaysStart,Integer totalAvailableDaysEnd){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null && totalAvailableDaysEnd!=null){
            notBetween("total_available_days",totalAvailableDaysStart,totalAvailableDaysEnd);
        }
        return this;
     }


    /**
     * <p>总天数（单位：天）</p>
     * LIKE '%值%'  entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysLike(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            like("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * NOT LIKE '%值%'  entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysNotLike(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            notLike("total_available_days",totalAvailableDays);
        }
        return this;
     }


    /**
     * <p>总天数（单位：天）</p>
     * LIKE '%值'  entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysLikeLeft(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            likeLeft("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * LIKE '值%'  entity().getTotalAvailableDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysLikeRight(){
        Integer totalAvailableDays =entity().getTotalAvailableDays();
        if(totalAvailableDays!=null){
            likeRight("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 等于 =
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysEq(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            eq("total_available_days",totalAvailableDays);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * 不等于 &lt;&gt;
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysNe(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            ne("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 大于 &gt;
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysGt(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            gt("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 大于等于 &gt;=
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysGe(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            ge("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 小于 &lt;
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysLt(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            lt("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * 小于等于 &lt;=
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysLe(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            le("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * LIKE '%值%'
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysLike(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            like("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * NOT LIKE '%值%'
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysNotLike(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            notLike("total_available_days",totalAvailableDays);
        }
        return this;
     }


    /**
     * <p>总天数（单位：天）</p>
     * LIKE '%值'
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysLikeLeft(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            likeLeft("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * LIKE '值%'
     * @param totalAvailableDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysLikeRight(Integer totalAvailableDays){
        if(totalAvailableDays!=null){
            likeRight("total_available_days",totalAvailableDays);
        }
        return this;
     }

    /**
     * <p>总天数（单位：天）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysIsNull(){
        isNull("total_available_days");
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysIsNotNull(){
        isNotNull("total_available_days");
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("total_available_days",value);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysIn(Integer... values){
        if(values!=null && values.length>0){
            in("total_available_days",values);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("total_available_days",value);
        }
        return this;
    }

    /**
     * <p>总天数（单位：天）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableDaysNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("total_available_days",values);
        }
        return this;
    }


    /**
     * <p>总时长（单位：小时）</p>
     * 等于 = entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesEq(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            eq("total_available_times",totalAvailableTimes);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * 不等于 &lt;&gt; entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesNe(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            ne("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 大于 &gt; entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesGt(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            gt("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 大于等于 &gt;= entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesGe(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            ge("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 小于 &lt; entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesLt(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            lt("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 小于等于 &lt;= entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesLe(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            le("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * BETWEEN  entity().getTotalAvailableTimes() AND totalAvailableTimesEnd
     * @param totalAvailableTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesBetween(Integer totalAvailableTimesEnd){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null && totalAvailableTimesEnd!=null){
            between("total_available_times",totalAvailableTimes,totalAvailableTimesEnd);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT BETWEEN  entity().getTotalAvailableTimes() AND 值2
     * @param totalAvailableTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesNotBetween(Integer totalAvailableTimesEnd){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null && totalAvailableTimesEnd!=null){
            notBetween("total_available_times",totalAvailableTimes,totalAvailableTimesEnd);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * BETWEEN  entity().getTotalAvailableTimes() AND 值2
     * @param totalAvailableTimesStart       值1
     * @param totalAvailableTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesBetween(Integer totalAvailableTimesStart,Integer totalAvailableTimesEnd){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null && totalAvailableTimesEnd!=null){
            between("total_available_times",totalAvailableTimesStart,totalAvailableTimesEnd);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT BETWEEN  entity().getTotalAvailableTimes() AND 值2
     * @param totalAvailableTimesStart       值1
     * @param totalAvailableTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesNotBetween(Integer totalAvailableTimesStart,Integer totalAvailableTimesEnd){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null && totalAvailableTimesEnd!=null){
            notBetween("total_available_times",totalAvailableTimesStart,totalAvailableTimesEnd);
        }
        return this;
     }


    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '%值%'  entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesLike(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            like("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT LIKE '%值%'  entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesNotLike(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            notLike("total_available_times",totalAvailableTimes);
        }
        return this;
     }


    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '%值'  entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesLikeLeft(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            likeLeft("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '值%'  entity().getTotalAvailableTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesLikeRight(){
        Integer totalAvailableTimes =entity().getTotalAvailableTimes();
        if(totalAvailableTimes!=null){
            likeRight("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 等于 =
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesEq(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            eq("total_available_times",totalAvailableTimes);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * 不等于 &lt;&gt;
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesNe(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            ne("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 大于 &gt;
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesGt(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            gt("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 大于等于 &gt;=
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesGe(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            ge("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 小于 &lt;
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesLt(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            lt("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * 小于等于 &lt;=
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesLe(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            le("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '%值%'
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesLike(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            like("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT LIKE '%值%'
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesNotLike(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            notLike("total_available_times",totalAvailableTimes);
        }
        return this;
     }


    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '%值'
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesLikeLeft(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            likeLeft("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * LIKE '值%'
     * @param totalAvailableTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesLikeRight(Integer totalAvailableTimes){
        if(totalAvailableTimes!=null){
            likeRight("total_available_times",totalAvailableTimes);
        }
        return this;
     }

    /**
     * <p>总时长（单位：小时）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesIsNull(){
        isNull("total_available_times");
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesIsNotNull(){
        isNotNull("total_available_times");
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("total_available_times",value);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesIn(Integer... values){
        if(values!=null && values.length>0){
            in("total_available_times",values);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("total_available_times",value);
        }
        return this;
    }

    /**
     * <p>总时长（单位：小时）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper totalAvailableTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("total_available_times",values);
        }
        return this;
    }


    /**
     * <p>剩余可用天数</p>
     * 等于 = entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysEq(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            eq("rest_valid_days",restValidDays);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * 不等于 &lt;&gt; entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysNe(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            ne("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 大于 &gt; entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysGt(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            gt("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 大于等于 &gt;= entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysGe(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            ge("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 小于 &lt; entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysLt(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            lt("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 小于等于 &lt;= entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysLe(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            le("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * BETWEEN  entity().getRestValidDays() AND restValidDaysEnd
     * @param restValidDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysBetween(Integer restValidDaysEnd){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null && restValidDaysEnd!=null){
            between("rest_valid_days",restValidDays,restValidDaysEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * NOT BETWEEN  entity().getRestValidDays() AND 值2
     * @param restValidDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysNotBetween(Integer restValidDaysEnd){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null && restValidDaysEnd!=null){
            notBetween("rest_valid_days",restValidDays,restValidDaysEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * BETWEEN  entity().getRestValidDays() AND 值2
     * @param restValidDaysStart       值1
     * @param restValidDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysBetween(Integer restValidDaysStart,Integer restValidDaysEnd){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null && restValidDaysEnd!=null){
            between("rest_valid_days",restValidDaysStart,restValidDaysEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * NOT BETWEEN  entity().getRestValidDays() AND 值2
     * @param restValidDaysStart       值1
     * @param restValidDaysEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysNotBetween(Integer restValidDaysStart,Integer restValidDaysEnd){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null && restValidDaysEnd!=null){
            notBetween("rest_valid_days",restValidDaysStart,restValidDaysEnd);
        }
        return this;
     }


    /**
     * <p>剩余可用天数</p>
     * LIKE '%值%'  entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysLike(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            like("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * NOT LIKE '%值%'  entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysNotLike(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            notLike("rest_valid_days",restValidDays);
        }
        return this;
     }


    /**
     * <p>剩余可用天数</p>
     * LIKE '%值'  entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysLikeLeft(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            likeLeft("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * LIKE '值%'  entity().getRestValidDays()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysLikeRight(){
        Integer restValidDays =entity().getRestValidDays();
        if(restValidDays!=null){
            likeRight("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 等于 =
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysEq(Integer restValidDays){
        if(restValidDays!=null){
            eq("rest_valid_days",restValidDays);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * 不等于 &lt;&gt;
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysNe(Integer restValidDays){
        if(restValidDays!=null){
            ne("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 大于 &gt;
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysGt(Integer restValidDays){
        if(restValidDays!=null){
            gt("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 大于等于 &gt;=
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysGe(Integer restValidDays){
        if(restValidDays!=null){
            ge("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 小于 &lt;
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysLt(Integer restValidDays){
        if(restValidDays!=null){
            lt("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * 小于等于 &lt;=
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysLe(Integer restValidDays){
        if(restValidDays!=null){
            le("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * LIKE '%值%'
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysLike(Integer restValidDays){
        if(restValidDays!=null){
            like("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * NOT LIKE '%值%'
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysNotLike(Integer restValidDays){
        if(restValidDays!=null){
            notLike("rest_valid_days",restValidDays);
        }
        return this;
     }


    /**
     * <p>剩余可用天数</p>
     * LIKE '%值'
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysLikeLeft(Integer restValidDays){
        if(restValidDays!=null){
            likeLeft("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * LIKE '值%'
     * @param restValidDays       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysLikeRight(Integer restValidDays){
        if(restValidDays!=null){
            likeRight("rest_valid_days",restValidDays);
        }
        return this;
     }

    /**
     * <p>剩余可用天数</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysIsNull(){
        isNull("rest_valid_days");
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysIsNotNull(){
        isNotNull("rest_valid_days");
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("rest_valid_days",value);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysIn(Integer... values){
        if(values!=null && values.length>0){
            in("rest_valid_days",values);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("rest_valid_days",value);
        }
        return this;
    }

    /**
     * <p>剩余可用天数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidDaysNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rest_valid_days",values);
        }
        return this;
    }


    /**
     * <p>剩余可用时长</p>
     * 等于 = entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesEq(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            eq("rest_valid_times",restValidTimes);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * 不等于 &lt;&gt; entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesNe(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            ne("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 大于 &gt; entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesGt(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            gt("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 大于等于 &gt;= entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesGe(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            ge("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 小于 &lt; entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesLt(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            lt("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 小于等于 &lt;= entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesLe(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            le("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * BETWEEN  entity().getRestValidTimes() AND restValidTimesEnd
     * @param restValidTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesBetween(Integer restValidTimesEnd){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null && restValidTimesEnd!=null){
            between("rest_valid_times",restValidTimes,restValidTimesEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * NOT BETWEEN  entity().getRestValidTimes() AND 值2
     * @param restValidTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesNotBetween(Integer restValidTimesEnd){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null && restValidTimesEnd!=null){
            notBetween("rest_valid_times",restValidTimes,restValidTimesEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * BETWEEN  entity().getRestValidTimes() AND 值2
     * @param restValidTimesStart       值1
     * @param restValidTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesBetween(Integer restValidTimesStart,Integer restValidTimesEnd){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null && restValidTimesEnd!=null){
            between("rest_valid_times",restValidTimesStart,restValidTimesEnd);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * NOT BETWEEN  entity().getRestValidTimes() AND 值2
     * @param restValidTimesStart       值1
     * @param restValidTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesNotBetween(Integer restValidTimesStart,Integer restValidTimesEnd){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null && restValidTimesEnd!=null){
            notBetween("rest_valid_times",restValidTimesStart,restValidTimesEnd);
        }
        return this;
     }


    /**
     * <p>剩余可用时长</p>
     * LIKE '%值%'  entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesLike(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            like("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * NOT LIKE '%值%'  entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesNotLike(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            notLike("rest_valid_times",restValidTimes);
        }
        return this;
     }


    /**
     * <p>剩余可用时长</p>
     * LIKE '%值'  entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesLikeLeft(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            likeLeft("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * LIKE '值%'  entity().getRestValidTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesLikeRight(){
        Integer restValidTimes =entity().getRestValidTimes();
        if(restValidTimes!=null){
            likeRight("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 等于 =
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesEq(Integer restValidTimes){
        if(restValidTimes!=null){
            eq("rest_valid_times",restValidTimes);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * 不等于 &lt;&gt;
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesNe(Integer restValidTimes){
        if(restValidTimes!=null){
            ne("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 大于 &gt;
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesGt(Integer restValidTimes){
        if(restValidTimes!=null){
            gt("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 大于等于 &gt;=
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesGe(Integer restValidTimes){
        if(restValidTimes!=null){
            ge("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 小于 &lt;
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesLt(Integer restValidTimes){
        if(restValidTimes!=null){
            lt("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * 小于等于 &lt;=
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesLe(Integer restValidTimes){
        if(restValidTimes!=null){
            le("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * LIKE '%值%'
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesLike(Integer restValidTimes){
        if(restValidTimes!=null){
            like("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * NOT LIKE '%值%'
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesNotLike(Integer restValidTimes){
        if(restValidTimes!=null){
            notLike("rest_valid_times",restValidTimes);
        }
        return this;
     }


    /**
     * <p>剩余可用时长</p>
     * LIKE '%值'
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesLikeLeft(Integer restValidTimes){
        if(restValidTimes!=null){
            likeLeft("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * LIKE '值%'
     * @param restValidTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesLikeRight(Integer restValidTimes){
        if(restValidTimes!=null){
            likeRight("rest_valid_times",restValidTimes);
        }
        return this;
     }

    /**
     * <p>剩余可用时长</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesIsNull(){
        isNull("rest_valid_times");
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesIsNotNull(){
        isNotNull("rest_valid_times");
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("rest_valid_times",value);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesIn(Integer... values){
        if(values!=null && values.length>0){
            in("rest_valid_times",values);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("rest_valid_times",value);
        }
        return this;
    }

    /**
     * <p>剩余可用时长</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper restValidTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("rest_valid_times",values);
        }
        return this;
    }


    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 等于 = entity().getBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeEq(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            eq("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 不等于 &lt;&gt; entity().getBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeNe(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            ne("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 大于 &gt; entity().getBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeGt(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            gt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 大于等于 &gt;= entity().getBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeGe(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            ge("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 小于 &lt; entity().getBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeLt(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            lt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 小于等于 &lt;= entity().getBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeLe(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            le("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * BETWEEN  entity().getBizType() AND bizTypeEnd
     * @param bizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeBetween(Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            between("biz_type",bizType,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeNotBetween(Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            notBetween("biz_type",bizType,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeBetween(Integer bizTypeStart,Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            between("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT BETWEEN  entity().getBizType() AND 值2
     * @param bizTypeStart       值1
     * @param bizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeNotBetween(Integer bizTypeStart,Integer bizTypeEnd){
        Integer bizType =entity().getBizType();
        if(bizType!=null && bizTypeEnd!=null){
            notBetween("biz_type",bizTypeStart,bizTypeEnd);
        }
        return this;
     }


    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '%值%'  entity().getBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeLike(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            like("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT LIKE '%值%'  entity().getBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeNotLike(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            notLike("biz_type",bizType);
        }
        return this;
     }


    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '%值'  entity().getBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeLikeLeft(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            likeLeft("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '值%'  entity().getBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeLikeRight(){
        Integer bizType =entity().getBizType();
        if(bizType!=null){
            likeRight("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 等于 =
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeEq(Integer bizType){
        if(bizType!=null){
            eq("biz_type",bizType);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 不等于 &lt;&gt;
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeNe(Integer bizType){
        if(bizType!=null){
            ne("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 大于 &gt;
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeGt(Integer bizType){
        if(bizType!=null){
            gt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 大于等于 &gt;=
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeGe(Integer bizType){
        if(bizType!=null){
            ge("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 小于 &lt;
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeLt(Integer bizType){
        if(bizType!=null){
            lt("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * 小于等于 &lt;=
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeLe(Integer bizType){
        if(bizType!=null){
            le("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '%值%'
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeLike(Integer bizType){
        if(bizType!=null){
            like("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT LIKE '%值%'
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeNotLike(Integer bizType){
        if(bizType!=null){
            notLike("biz_type",bizType);
        }
        return this;
     }


    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '%值'
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeLikeLeft(Integer bizType){
        if(bizType!=null){
            likeLeft("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * LIKE '值%'
     * @param bizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeLikeRight(Integer bizType){
        if(bizType!=null){
            likeRight("biz_type",bizType);
        }
        return this;
     }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeIsNull(){
        isNull("biz_type");
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeIsNotNull(){
        isNotNull("biz_type");
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("biz_type",value);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("biz_type",values);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("biz_type",value);
        }
        return this;
    }

    /**
     * <p>设备类型(1:测试设备，2：商用设备)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper bizTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("biz_type",values);
        }
        return this;
    }


    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 等于 = entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeEq(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            eq("source_type",sourceType);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 不等于 &lt;&gt; entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeNe(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            ne("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 大于 &gt; entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeGt(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            gt("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 大于等于 &gt;= entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeGe(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            ge("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 小于 &lt; entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeLt(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            lt("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 小于等于 &lt;= entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeLe(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            le("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * BETWEEN  entity().getSourceType() AND sourceTypeEnd
     * @param sourceTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeBetween(Integer sourceTypeEnd){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null && sourceTypeEnd!=null){
            between("source_type",sourceType,sourceTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT BETWEEN  entity().getSourceType() AND 值2
     * @param sourceTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeNotBetween(Integer sourceTypeEnd){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null && sourceTypeEnd!=null){
            notBetween("source_type",sourceType,sourceTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * BETWEEN  entity().getSourceType() AND 值2
     * @param sourceTypeStart       值1
     * @param sourceTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeBetween(Integer sourceTypeStart,Integer sourceTypeEnd){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null && sourceTypeEnd!=null){
            between("source_type",sourceTypeStart,sourceTypeEnd);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT BETWEEN  entity().getSourceType() AND 值2
     * @param sourceTypeStart       值1
     * @param sourceTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeNotBetween(Integer sourceTypeStart,Integer sourceTypeEnd){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null && sourceTypeEnd!=null){
            notBetween("source_type",sourceTypeStart,sourceTypeEnd);
        }
        return this;
     }


    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '%值%'  entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeLike(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            like("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT LIKE '%值%'  entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeNotLike(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            notLike("source_type",sourceType);
        }
        return this;
     }


    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '%值'  entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeLikeLeft(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            likeLeft("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '值%'  entity().getSourceType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeLikeRight(){
        Integer sourceType =entity().getSourceType();
        if(sourceType!=null){
            likeRight("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 等于 =
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeEq(Integer sourceType){
        if(sourceType!=null){
            eq("source_type",sourceType);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 不等于 &lt;&gt;
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeNe(Integer sourceType){
        if(sourceType!=null){
            ne("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 大于 &gt;
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeGt(Integer sourceType){
        if(sourceType!=null){
            gt("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 大于等于 &gt;=
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeGe(Integer sourceType){
        if(sourceType!=null){
            ge("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 小于 &lt;
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeLt(Integer sourceType){
        if(sourceType!=null){
            lt("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * 小于等于 &lt;=
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeLe(Integer sourceType){
        if(sourceType!=null){
            le("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '%值%'
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeLike(Integer sourceType){
        if(sourceType!=null){
            like("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT LIKE '%值%'
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeNotLike(Integer sourceType){
        if(sourceType!=null){
            notLike("source_type",sourceType);
        }
        return this;
     }


    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '%值'
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeLikeLeft(Integer sourceType){
        if(sourceType!=null){
            likeLeft("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * LIKE '值%'
     * @param sourceType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeLikeRight(Integer sourceType){
        if(sourceType!=null){
            likeRight("source_type",sourceType);
        }
        return this;
     }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeIsNull(){
        isNull("source_type");
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeIsNotNull(){
        isNotNull("source_type");
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("source_type",value);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("source_type",values);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("source_type",value);
        }
        return this;
    }

    /**
     * <p>设备来源设备来源（1：平台赠送，2：云游戏市场购买，3：活动补贴，4：华为严选市场购买）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper sourceTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("source_type",values);
        }
        return this;
    }


    /**
     * <p>过期缓冲时间</p>
     * 等于 = entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesEq(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            eq("expired_times",expiredTimes);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * 不等于 &lt;&gt; entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesNe(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            ne("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 大于 &gt; entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesGt(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            gt("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 大于等于 &gt;= entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesGe(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            ge("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 小于 &lt; entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesLt(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            lt("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 小于等于 &lt;= entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesLe(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            le("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * BETWEEN  entity().getExpiredTimes() AND expiredTimesEnd
     * @param expiredTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesBetween(Integer expiredTimesEnd){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null && expiredTimesEnd!=null){
            between("expired_times",expiredTimes,expiredTimesEnd);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * NOT BETWEEN  entity().getExpiredTimes() AND 值2
     * @param expiredTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesNotBetween(Integer expiredTimesEnd){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null && expiredTimesEnd!=null){
            notBetween("expired_times",expiredTimes,expiredTimesEnd);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * BETWEEN  entity().getExpiredTimes() AND 值2
     * @param expiredTimesStart       值1
     * @param expiredTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesBetween(Integer expiredTimesStart,Integer expiredTimesEnd){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null && expiredTimesEnd!=null){
            between("expired_times",expiredTimesStart,expiredTimesEnd);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * NOT BETWEEN  entity().getExpiredTimes() AND 值2
     * @param expiredTimesStart       值1
     * @param expiredTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesNotBetween(Integer expiredTimesStart,Integer expiredTimesEnd){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null && expiredTimesEnd!=null){
            notBetween("expired_times",expiredTimesStart,expiredTimesEnd);
        }
        return this;
     }


    /**
     * <p>过期缓冲时间</p>
     * LIKE '%值%'  entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesLike(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            like("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * NOT LIKE '%值%'  entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesNotLike(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            notLike("expired_times",expiredTimes);
        }
        return this;
     }


    /**
     * <p>过期缓冲时间</p>
     * LIKE '%值'  entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesLikeLeft(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            likeLeft("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * LIKE '值%'  entity().getExpiredTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesLikeRight(){
        Integer expiredTimes =entity().getExpiredTimes();
        if(expiredTimes!=null){
            likeRight("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 等于 =
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesEq(Integer expiredTimes){
        if(expiredTimes!=null){
            eq("expired_times",expiredTimes);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * 不等于 &lt;&gt;
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesNe(Integer expiredTimes){
        if(expiredTimes!=null){
            ne("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 大于 &gt;
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesGt(Integer expiredTimes){
        if(expiredTimes!=null){
            gt("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 大于等于 &gt;=
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesGe(Integer expiredTimes){
        if(expiredTimes!=null){
            ge("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 小于 &lt;
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesLt(Integer expiredTimes){
        if(expiredTimes!=null){
            lt("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * 小于等于 &lt;=
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesLe(Integer expiredTimes){
        if(expiredTimes!=null){
            le("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * LIKE '%值%'
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesLike(Integer expiredTimes){
        if(expiredTimes!=null){
            like("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * NOT LIKE '%值%'
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesNotLike(Integer expiredTimes){
        if(expiredTimes!=null){
            notLike("expired_times",expiredTimes);
        }
        return this;
     }


    /**
     * <p>过期缓冲时间</p>
     * LIKE '%值'
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesLikeLeft(Integer expiredTimes){
        if(expiredTimes!=null){
            likeLeft("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * LIKE '值%'
     * @param expiredTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesLikeRight(Integer expiredTimes){
        if(expiredTimes!=null){
            likeRight("expired_times",expiredTimes);
        }
        return this;
     }

    /**
     * <p>过期缓冲时间</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesIsNull(){
        isNull("expired_times");
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesIsNotNull(){
        isNotNull("expired_times");
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("expired_times",value);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesIn(Integer... values){
        if(values!=null && values.length>0){
            in("expired_times",values);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("expired_times",value);
        }
        return this;
    }

    /**
     * <p>过期缓冲时间</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper expiredTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("expired_times",values);
        }
        return this;
    }


    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 等于 = entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleEq(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            eq("lifecycle",lifecycle);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 不等于 &lt;&gt; entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleNe(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            ne("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 大于 &gt; entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleGt(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            gt("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 大于等于 &gt;= entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleGe(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            ge("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 小于 &lt; entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleLt(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            lt("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 小于等于 &lt;= entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleLe(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            le("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * BETWEEN  entity().getLifecycle() AND lifecycleEnd
     * @param lifecycleEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleBetween(String lifecycleEnd){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null && lifecycleEnd!=null){
            between("lifecycle",lifecycle,lifecycleEnd);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT BETWEEN  entity().getLifecycle() AND 值2
     * @param lifecycleEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleNotBetween(String lifecycleEnd){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null && lifecycleEnd!=null){
            notBetween("lifecycle",lifecycle,lifecycleEnd);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * BETWEEN  entity().getLifecycle() AND 值2
     * @param lifecycleStart       值1
     * @param lifecycleEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleBetween(String lifecycleStart,String lifecycleEnd){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null && lifecycleEnd!=null){
            between("lifecycle",lifecycleStart,lifecycleEnd);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT BETWEEN  entity().getLifecycle() AND 值2
     * @param lifecycleStart       值1
     * @param lifecycleEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleNotBetween(String lifecycleStart,String lifecycleEnd){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null && lifecycleEnd!=null){
            notBetween("lifecycle",lifecycleStart,lifecycleEnd);
        }
        return this;
     }


    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '%值%'  entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleLike(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            like("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT LIKE '%值%'  entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleNotLike(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            notLike("lifecycle",lifecycle);
        }
        return this;
     }


    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '%值'  entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleLikeLeft(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            likeLeft("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '值%'  entity().getLifecycle()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleLikeRight(){
        String lifecycle =entity().getLifecycle();
        if(lifecycle!=null){
            likeRight("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 等于 =
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleEq(String lifecycle){
        if(lifecycle!=null){
            eq("lifecycle",lifecycle);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 不等于 &lt;&gt;
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleNe(String lifecycle){
        if(lifecycle!=null){
            ne("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 大于 &gt;
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleGt(String lifecycle){
        if(lifecycle!=null){
            gt("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 大于等于 &gt;=
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleGe(String lifecycle){
        if(lifecycle!=null){
            ge("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 小于 &lt;
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleLt(String lifecycle){
        if(lifecycle!=null){
            lt("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * 小于等于 &lt;=
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleLe(String lifecycle){
        if(lifecycle!=null){
            le("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '%值%'
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleLike(String lifecycle){
        if(lifecycle!=null){
            like("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT LIKE '%值%'
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleNotLike(String lifecycle){
        if(lifecycle!=null){
            notLike("lifecycle",lifecycle);
        }
        return this;
     }


    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '%值'
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleLikeLeft(String lifecycle){
        if(lifecycle!=null){
            likeLeft("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * LIKE '值%'
     * @param lifecycle       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleLikeRight(String lifecycle){
        if(lifecycle!=null){
            likeRight("lifecycle",lifecycle);
        }
        return this;
     }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleIsNull(){
        isNull("lifecycle");
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleIsNotNull(){
        isNotNull("lifecycle");
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("lifecycle",value);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleIn(String... values){
        if(values!=null && values.length>0){
            in("lifecycle",values);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("lifecycle",value);
        }
        return this;
    }

    /**
     * <p>生命周期(reserving,预订中;alive,正常服务中;expired，已到期/冻结;recycle，已回收/已释放；)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lifecycleNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("lifecycle",values);
        }
        return this;
    }


    /**
     * <p>恢复出厂设置次数</p>
     * 等于 = entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesEq(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            eq("factory_reset_times",factoryResetTimes);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * 不等于 &lt;&gt; entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesNe(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            ne("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 大于 &gt; entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesGt(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            gt("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 大于等于 &gt;= entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesGe(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            ge("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 小于 &lt; entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesLt(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            lt("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 小于等于 &lt;= entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesLe(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            le("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * BETWEEN  entity().getFactoryResetTimes() AND factoryResetTimesEnd
     * @param factoryResetTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesBetween(Integer factoryResetTimesEnd){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null && factoryResetTimesEnd!=null){
            between("factory_reset_times",factoryResetTimes,factoryResetTimesEnd);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT BETWEEN  entity().getFactoryResetTimes() AND 值2
     * @param factoryResetTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesNotBetween(Integer factoryResetTimesEnd){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null && factoryResetTimesEnd!=null){
            notBetween("factory_reset_times",factoryResetTimes,factoryResetTimesEnd);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * BETWEEN  entity().getFactoryResetTimes() AND 值2
     * @param factoryResetTimesStart       值1
     * @param factoryResetTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesBetween(Integer factoryResetTimesStart,Integer factoryResetTimesEnd){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null && factoryResetTimesEnd!=null){
            between("factory_reset_times",factoryResetTimesStart,factoryResetTimesEnd);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT BETWEEN  entity().getFactoryResetTimes() AND 值2
     * @param factoryResetTimesStart       值1
     * @param factoryResetTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesNotBetween(Integer factoryResetTimesStart,Integer factoryResetTimesEnd){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null && factoryResetTimesEnd!=null){
            notBetween("factory_reset_times",factoryResetTimesStart,factoryResetTimesEnd);
        }
        return this;
     }


    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '%值%'  entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesLike(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            like("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT LIKE '%值%'  entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesNotLike(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            notLike("factory_reset_times",factoryResetTimes);
        }
        return this;
     }


    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '%值'  entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesLikeLeft(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            likeLeft("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '值%'  entity().getFactoryResetTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesLikeRight(){
        Integer factoryResetTimes =entity().getFactoryResetTimes();
        if(factoryResetTimes!=null){
            likeRight("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 等于 =
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesEq(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            eq("factory_reset_times",factoryResetTimes);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * 不等于 &lt;&gt;
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesNe(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            ne("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 大于 &gt;
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesGt(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            gt("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 大于等于 &gt;=
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesGe(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            ge("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 小于 &lt;
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesLt(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            lt("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * 小于等于 &lt;=
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesLe(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            le("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '%值%'
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesLike(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            like("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT LIKE '%值%'
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesNotLike(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            notLike("factory_reset_times",factoryResetTimes);
        }
        return this;
     }


    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '%值'
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesLikeLeft(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            likeLeft("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * LIKE '值%'
     * @param factoryResetTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesLikeRight(Integer factoryResetTimes){
        if(factoryResetTimes!=null){
            likeRight("factory_reset_times",factoryResetTimes);
        }
        return this;
     }

    /**
     * <p>恢复出厂设置次数</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesIsNull(){
        isNull("factory_reset_times");
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesIsNotNull(){
        isNotNull("factory_reset_times");
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("factory_reset_times",value);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesIn(Integer... values){
        if(values!=null && values.length>0){
            in("factory_reset_times",values);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("factory_reset_times",value);
        }
        return this;
    }

    /**
     * <p>恢复出厂设置次数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper factoryResetTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("factory_reset_times",values);
        }
        return this;
    }


    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 等于 = entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentEq(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            eq("is_silent",isSilent);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 不等于 &lt;&gt; entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentNe(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            ne("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 大于 &gt; entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentGt(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            gt("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 大于等于 &gt;= entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentGe(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            ge("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 小于 &lt; entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentLt(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            lt("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 小于等于 &lt;= entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentLe(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            le("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * BETWEEN  entity().getIsSilent() AND isSilentEnd
     * @param isSilentEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentBetween(Integer isSilentEnd){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null && isSilentEnd!=null){
            between("is_silent",isSilent,isSilentEnd);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT BETWEEN  entity().getIsSilent() AND 值2
     * @param isSilentEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentNotBetween(Integer isSilentEnd){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null && isSilentEnd!=null){
            notBetween("is_silent",isSilent,isSilentEnd);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * BETWEEN  entity().getIsSilent() AND 值2
     * @param isSilentStart       值1
     * @param isSilentEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentBetween(Integer isSilentStart,Integer isSilentEnd){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null && isSilentEnd!=null){
            between("is_silent",isSilentStart,isSilentEnd);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT BETWEEN  entity().getIsSilent() AND 值2
     * @param isSilentStart       值1
     * @param isSilentEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentNotBetween(Integer isSilentStart,Integer isSilentEnd){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null && isSilentEnd!=null){
            notBetween("is_silent",isSilentStart,isSilentEnd);
        }
        return this;
     }


    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '%值%'  entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentLike(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            like("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT LIKE '%值%'  entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentNotLike(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            notLike("is_silent",isSilent);
        }
        return this;
     }


    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '%值'  entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentLikeLeft(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            likeLeft("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '值%'  entity().getIsSilent()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentLikeRight(){
        Integer isSilent =entity().getIsSilent();
        if(isSilent!=null){
            likeRight("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 等于 =
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentEq(Integer isSilent){
        if(isSilent!=null){
            eq("is_silent",isSilent);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 不等于 &lt;&gt;
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentNe(Integer isSilent){
        if(isSilent!=null){
            ne("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 大于 &gt;
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentGt(Integer isSilent){
        if(isSilent!=null){
            gt("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 大于等于 &gt;=
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentGe(Integer isSilent){
        if(isSilent!=null){
            ge("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 小于 &lt;
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentLt(Integer isSilent){
        if(isSilent!=null){
            lt("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * 小于等于 &lt;=
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentLe(Integer isSilent){
        if(isSilent!=null){
            le("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '%值%'
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentLike(Integer isSilent){
        if(isSilent!=null){
            like("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT LIKE '%值%'
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentNotLike(Integer isSilent){
        if(isSilent!=null){
            notLike("is_silent",isSilent);
        }
        return this;
     }


    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '%值'
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentLikeLeft(Integer isSilent){
        if(isSilent!=null){
            likeLeft("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * LIKE '值%'
     * @param isSilent       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentLikeRight(Integer isSilent){
        if(isSilent!=null){
            likeRight("is_silent",isSilent);
        }
        return this;
     }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentIsNull(){
        isNull("is_silent");
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentIsNotNull(){
        isNotNull("is_silent");
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("is_silent",value);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentIn(Integer... values){
        if(values!=null && values.length>0){
            in("is_silent",values);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("is_silent",value);
        }
        return this;
    }

    /**
     * <p>是否静音（静音：1，非静音：0）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper isSilentNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("is_silent",values);
        }
        return this;
    }


    /**
     * <p>重启设备次数</p>
     * 等于 = entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesEq(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            eq("reboot_times",rebootTimes);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * 不等于 &lt;&gt; entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesNe(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            ne("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 大于 &gt; entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesGt(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            gt("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 大于等于 &gt;= entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesGe(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            ge("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 小于 &lt; entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesLt(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            lt("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 小于等于 &lt;= entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesLe(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            le("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * BETWEEN  entity().getRebootTimes() AND rebootTimesEnd
     * @param rebootTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesBetween(Integer rebootTimesEnd){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null && rebootTimesEnd!=null){
            between("reboot_times",rebootTimes,rebootTimesEnd);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * NOT BETWEEN  entity().getRebootTimes() AND 值2
     * @param rebootTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesNotBetween(Integer rebootTimesEnd){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null && rebootTimesEnd!=null){
            notBetween("reboot_times",rebootTimes,rebootTimesEnd);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * BETWEEN  entity().getRebootTimes() AND 值2
     * @param rebootTimesStart       值1
     * @param rebootTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesBetween(Integer rebootTimesStart,Integer rebootTimesEnd){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null && rebootTimesEnd!=null){
            between("reboot_times",rebootTimesStart,rebootTimesEnd);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * NOT BETWEEN  entity().getRebootTimes() AND 值2
     * @param rebootTimesStart       值1
     * @param rebootTimesEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesNotBetween(Integer rebootTimesStart,Integer rebootTimesEnd){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null && rebootTimesEnd!=null){
            notBetween("reboot_times",rebootTimesStart,rebootTimesEnd);
        }
        return this;
     }


    /**
     * <p>重启设备次数</p>
     * LIKE '%值%'  entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesLike(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            like("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * NOT LIKE '%值%'  entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesNotLike(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            notLike("reboot_times",rebootTimes);
        }
        return this;
     }


    /**
     * <p>重启设备次数</p>
     * LIKE '%值'  entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesLikeLeft(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            likeLeft("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * LIKE '值%'  entity().getRebootTimes()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesLikeRight(){
        Integer rebootTimes =entity().getRebootTimes();
        if(rebootTimes!=null){
            likeRight("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 等于 =
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesEq(Integer rebootTimes){
        if(rebootTimes!=null){
            eq("reboot_times",rebootTimes);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * 不等于 &lt;&gt;
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesNe(Integer rebootTimes){
        if(rebootTimes!=null){
            ne("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 大于 &gt;
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesGt(Integer rebootTimes){
        if(rebootTimes!=null){
            gt("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 大于等于 &gt;=
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesGe(Integer rebootTimes){
        if(rebootTimes!=null){
            ge("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 小于 &lt;
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesLt(Integer rebootTimes){
        if(rebootTimes!=null){
            lt("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * 小于等于 &lt;=
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesLe(Integer rebootTimes){
        if(rebootTimes!=null){
            le("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * LIKE '%值%'
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesLike(Integer rebootTimes){
        if(rebootTimes!=null){
            like("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * NOT LIKE '%值%'
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesNotLike(Integer rebootTimes){
        if(rebootTimes!=null){
            notLike("reboot_times",rebootTimes);
        }
        return this;
     }


    /**
     * <p>重启设备次数</p>
     * LIKE '%值'
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesLikeLeft(Integer rebootTimes){
        if(rebootTimes!=null){
            likeLeft("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * LIKE '值%'
     * @param rebootTimes       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesLikeRight(Integer rebootTimes){
        if(rebootTimes!=null){
            likeRight("reboot_times",rebootTimes);
        }
        return this;
     }

    /**
     * <p>重启设备次数</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesIsNull(){
        isNull("reboot_times");
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesIsNotNull(){
        isNotNull("reboot_times");
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("reboot_times",value);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesIn(Integer... values){
        if(values!=null && values.length>0){
            in("reboot_times",values);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("reboot_times",value);
        }
        return this;
    }

    /**
     * <p>重启设备次数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper rebootTimesNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("reboot_times",values);
        }
        return this;
    }


    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 等于 = entity().getFailure()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureEq(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            eq("failure",failure);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 不等于 &lt;&gt; entity().getFailure()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureNe(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            ne("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 大于 &gt; entity().getFailure()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureGt(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            gt("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 大于等于 &gt;= entity().getFailure()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureGe(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            ge("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 小于 &lt; entity().getFailure()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureLt(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            lt("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 小于等于 &lt;= entity().getFailure()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureLe(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            le("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * BETWEEN  entity().getFailure() AND failureEnd
     * @param failureEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureBetween(Integer failureEnd){
        Integer failure =entity().getFailure();
        if(failure!=null && failureEnd!=null){
            between("failure",failure,failureEnd);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT BETWEEN  entity().getFailure() AND 值2
     * @param failureEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureNotBetween(Integer failureEnd){
        Integer failure =entity().getFailure();
        if(failure!=null && failureEnd!=null){
            notBetween("failure",failure,failureEnd);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * BETWEEN  entity().getFailure() AND 值2
     * @param failureStart       值1
     * @param failureEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureBetween(Integer failureStart,Integer failureEnd){
        Integer failure =entity().getFailure();
        if(failure!=null && failureEnd!=null){
            between("failure",failureStart,failureEnd);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT BETWEEN  entity().getFailure() AND 值2
     * @param failureStart       值1
     * @param failureEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureNotBetween(Integer failureStart,Integer failureEnd){
        Integer failure =entity().getFailure();
        if(failure!=null && failureEnd!=null){
            notBetween("failure",failureStart,failureEnd);
        }
        return this;
     }


    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '%值%'  entity().getFailure()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureLike(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            like("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT LIKE '%值%'  entity().getFailure()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureNotLike(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            notLike("failure",failure);
        }
        return this;
     }


    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '%值'  entity().getFailure()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureLikeLeft(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            likeLeft("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '值%'  entity().getFailure()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureLikeRight(){
        Integer failure =entity().getFailure();
        if(failure!=null){
            likeRight("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 等于 =
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureEq(Integer failure){
        if(failure!=null){
            eq("failure",failure);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 不等于 &lt;&gt;
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureNe(Integer failure){
        if(failure!=null){
            ne("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 大于 &gt;
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureGt(Integer failure){
        if(failure!=null){
            gt("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 大于等于 &gt;=
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureGe(Integer failure){
        if(failure!=null){
            ge("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 小于 &lt;
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureLt(Integer failure){
        if(failure!=null){
            lt("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * 小于等于 &lt;=
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureLe(Integer failure){
        if(failure!=null){
            le("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '%值%'
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureLike(Integer failure){
        if(failure!=null){
            like("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT LIKE '%值%'
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureNotLike(Integer failure){
        if(failure!=null){
            notLike("failure",failure);
        }
        return this;
     }


    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '%值'
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureLikeLeft(Integer failure){
        if(failure!=null){
            likeLeft("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * LIKE '值%'
     * @param failure       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureLikeRight(Integer failure){
        if(failure!=null){
            likeRight("failure",failure);
        }
        return this;
     }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureIsNull(){
        isNull("failure");
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureIsNotNull(){
        isNotNull("failure");
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("failure",value);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureIn(Integer... values){
        if(values!=null && values.length>0){
            in("failure",values);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("failure",value);
        }
        return this;
    }

    /**
     * <p>客户申报故障（0：无，1故障）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper failureNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("failure",values);
        }
        return this;
    }


    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 等于 = entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallEq(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            eq("sync_install",syncInstall);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 不等于 &lt;&gt; entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallNe(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            ne("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 大于 &gt; entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallGt(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            gt("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 大于等于 &gt;= entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallGe(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            ge("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 小于 &lt; entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallLt(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            lt("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 小于等于 &lt;= entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallLe(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            le("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * BETWEEN  entity().getSyncInstall() AND syncInstallEnd
     * @param syncInstallEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallBetween(Integer syncInstallEnd){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null && syncInstallEnd!=null){
            between("sync_install",syncInstall,syncInstallEnd);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT BETWEEN  entity().getSyncInstall() AND 值2
     * @param syncInstallEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallNotBetween(Integer syncInstallEnd){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null && syncInstallEnd!=null){
            notBetween("sync_install",syncInstall,syncInstallEnd);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * BETWEEN  entity().getSyncInstall() AND 值2
     * @param syncInstallStart       值1
     * @param syncInstallEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallBetween(Integer syncInstallStart,Integer syncInstallEnd){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null && syncInstallEnd!=null){
            between("sync_install",syncInstallStart,syncInstallEnd);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT BETWEEN  entity().getSyncInstall() AND 值2
     * @param syncInstallStart       值1
     * @param syncInstallEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallNotBetween(Integer syncInstallStart,Integer syncInstallEnd){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null && syncInstallEnd!=null){
            notBetween("sync_install",syncInstallStart,syncInstallEnd);
        }
        return this;
     }


    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '%值%'  entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallLike(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            like("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT LIKE '%值%'  entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallNotLike(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            notLike("sync_install",syncInstall);
        }
        return this;
     }


    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '%值'  entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallLikeLeft(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            likeLeft("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '值%'  entity().getSyncInstall()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallLikeRight(){
        Integer syncInstall =entity().getSyncInstall();
        if(syncInstall!=null){
            likeRight("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 等于 =
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallEq(Integer syncInstall){
        if(syncInstall!=null){
            eq("sync_install",syncInstall);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 不等于 &lt;&gt;
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallNe(Integer syncInstall){
        if(syncInstall!=null){
            ne("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 大于 &gt;
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallGt(Integer syncInstall){
        if(syncInstall!=null){
            gt("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 大于等于 &gt;=
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallGe(Integer syncInstall){
        if(syncInstall!=null){
            ge("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 小于 &lt;
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallLt(Integer syncInstall){
        if(syncInstall!=null){
            lt("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * 小于等于 &lt;=
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallLe(Integer syncInstall){
        if(syncInstall!=null){
            le("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '%值%'
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallLike(Integer syncInstall){
        if(syncInstall!=null){
            like("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT LIKE '%值%'
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallNotLike(Integer syncInstall){
        if(syncInstall!=null){
            notLike("sync_install",syncInstall);
        }
        return this;
     }


    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '%值'
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallLikeLeft(Integer syncInstall){
        if(syncInstall!=null){
            likeLeft("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * LIKE '值%'
     * @param syncInstall       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallLikeRight(Integer syncInstall){
        if(syncInstall!=null){
            likeRight("sync_install",syncInstall);
        }
        return this;
     }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallIsNull(){
        isNull("sync_install");
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallIsNotNull(){
        isNotNull("sync_install");
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("sync_install",value);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallIn(Integer... values){
        if(values!=null && values.length>0){
            in("sync_install",values);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("sync_install",value);
        }
        return this;
    }

    /**
     * <p>应用同步安装(0：未执行，1同步中)</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper syncInstallNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("sync_install",values);
        }
        return this;
    }


    /**
     * <p>房间session</p>
     * 等于 = entity().getRoomSession()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomSessionEq(){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionNe(){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionGt(){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionGe(){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionLt(){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionLe(){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionBetween(String roomSessionEnd){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionNotBetween(String roomSessionEnd){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionBetween(String roomSessionStart,String roomSessionEnd){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionNotBetween(String roomSessionStart,String roomSessionEnd){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionLike(){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionNotLike(){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionLikeLeft(){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionLikeRight(){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionEq(String roomSession){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionNe(String roomSession){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionGt(String roomSession){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionGe(String roomSession){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionLt(String roomSession){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionLe(String roomSession){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionLike(String roomSession){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionNotLike(String roomSession){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionLikeLeft(String roomSession){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionLikeRight(String roomSession){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionIsNull(){
        isNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomSessionIsNotNull(){
        isNotNull("room_session");
        return this;
    }

    /**
     * <p>房间session</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomSessionIn(Collection<String> value){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionIn(String... values){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionNotIn(Collection<String> value){
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
    public YunMemberDeviceQueryEntityWrapper roomSessionNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("room_session",values);
        }
        return this;
    }


    /**
     * <p>房间最大容纳成员数</p>
     * 等于 = entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumEq(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            eq("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * 不等于 &lt;&gt; entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumNe(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            ne("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 大于 &gt; entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumGt(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            gt("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 大于等于 &gt;= entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumGe(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            ge("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 小于 &lt; entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumLt(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            lt("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 小于等于 &lt;= entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumLe(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            le("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * BETWEEN  entity().getRoomPeopleMaxNum() AND roomPeopleMaxNumEnd
     * @param roomPeopleMaxNumEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumBetween(Integer roomPeopleMaxNumEnd){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null && roomPeopleMaxNumEnd!=null){
            between("room_people_max_num",roomPeopleMaxNum,roomPeopleMaxNumEnd);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT BETWEEN  entity().getRoomPeopleMaxNum() AND 值2
     * @param roomPeopleMaxNumEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumNotBetween(Integer roomPeopleMaxNumEnd){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null && roomPeopleMaxNumEnd!=null){
            notBetween("room_people_max_num",roomPeopleMaxNum,roomPeopleMaxNumEnd);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * BETWEEN  entity().getRoomPeopleMaxNum() AND 值2
     * @param roomPeopleMaxNumStart       值1
     * @param roomPeopleMaxNumEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumBetween(Integer roomPeopleMaxNumStart,Integer roomPeopleMaxNumEnd){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null && roomPeopleMaxNumEnd!=null){
            between("room_people_max_num",roomPeopleMaxNumStart,roomPeopleMaxNumEnd);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT BETWEEN  entity().getRoomPeopleMaxNum() AND 值2
     * @param roomPeopleMaxNumStart       值1
     * @param roomPeopleMaxNumEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumNotBetween(Integer roomPeopleMaxNumStart,Integer roomPeopleMaxNumEnd){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null && roomPeopleMaxNumEnd!=null){
            notBetween("room_people_max_num",roomPeopleMaxNumStart,roomPeopleMaxNumEnd);
        }
        return this;
     }


    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '%值%'  entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumLike(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            like("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT LIKE '%值%'  entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumNotLike(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            notLike("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }


    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '%值'  entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumLikeLeft(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            likeLeft("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '值%'  entity().getRoomPeopleMaxNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumLikeRight(){
        Integer roomPeopleMaxNum =entity().getRoomPeopleMaxNum();
        if(roomPeopleMaxNum!=null){
            likeRight("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 等于 =
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumEq(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            eq("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * 不等于 &lt;&gt;
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumNe(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            ne("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 大于 &gt;
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumGt(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            gt("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 大于等于 &gt;=
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumGe(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            ge("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 小于 &lt;
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumLt(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            lt("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * 小于等于 &lt;=
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumLe(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            le("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '%值%'
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumLike(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            like("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT LIKE '%值%'
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumNotLike(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            notLike("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }


    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '%值'
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumLikeLeft(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            likeLeft("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * LIKE '值%'
     * @param roomPeopleMaxNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumLikeRight(Integer roomPeopleMaxNum){
        if(roomPeopleMaxNum!=null){
            likeRight("room_people_max_num",roomPeopleMaxNum);
        }
        return this;
     }

    /**
     * <p>房间最大容纳成员数</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumIsNull(){
        isNull("room_people_max_num");
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumIsNotNull(){
        isNotNull("room_people_max_num");
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("room_people_max_num",value);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumIn(Integer... values){
        if(values!=null && values.length>0){
            in("room_people_max_num",values);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("room_people_max_num",value);
        }
        return this;
    }

    /**
     * <p>房间最大容纳成员数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleMaxNumNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_people_max_num",values);
        }
        return this;
    }


    /**
     * <p>房间当前总成员数</p>
     * 等于 = entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumEq(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            eq("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * 不等于 &lt;&gt; entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumNe(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            ne("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 大于 &gt; entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumGt(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            gt("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 大于等于 &gt;= entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumGe(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            ge("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 小于 &lt; entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumLt(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            lt("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 小于等于 &lt;= entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumLe(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            le("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * BETWEEN  entity().getRoomPeopleTotalNum() AND roomPeopleTotalNumEnd
     * @param roomPeopleTotalNumEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumBetween(Integer roomPeopleTotalNumEnd){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null && roomPeopleTotalNumEnd!=null){
            between("room_people_total_num",roomPeopleTotalNum,roomPeopleTotalNumEnd);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * NOT BETWEEN  entity().getRoomPeopleTotalNum() AND 值2
     * @param roomPeopleTotalNumEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumNotBetween(Integer roomPeopleTotalNumEnd){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null && roomPeopleTotalNumEnd!=null){
            notBetween("room_people_total_num",roomPeopleTotalNum,roomPeopleTotalNumEnd);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * BETWEEN  entity().getRoomPeopleTotalNum() AND 值2
     * @param roomPeopleTotalNumStart       值1
     * @param roomPeopleTotalNumEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumBetween(Integer roomPeopleTotalNumStart,Integer roomPeopleTotalNumEnd){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null && roomPeopleTotalNumEnd!=null){
            between("room_people_total_num",roomPeopleTotalNumStart,roomPeopleTotalNumEnd);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * NOT BETWEEN  entity().getRoomPeopleTotalNum() AND 值2
     * @param roomPeopleTotalNumStart       值1
     * @param roomPeopleTotalNumEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumNotBetween(Integer roomPeopleTotalNumStart,Integer roomPeopleTotalNumEnd){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null && roomPeopleTotalNumEnd!=null){
            notBetween("room_people_total_num",roomPeopleTotalNumStart,roomPeopleTotalNumEnd);
        }
        return this;
     }


    /**
     * <p>房间当前总成员数</p>
     * LIKE '%值%'  entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumLike(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            like("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * NOT LIKE '%值%'  entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumNotLike(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            notLike("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }


    /**
     * <p>房间当前总成员数</p>
     * LIKE '%值'  entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumLikeLeft(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            likeLeft("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * LIKE '值%'  entity().getRoomPeopleTotalNum()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumLikeRight(){
        Integer roomPeopleTotalNum =entity().getRoomPeopleTotalNum();
        if(roomPeopleTotalNum!=null){
            likeRight("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 等于 =
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumEq(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            eq("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * 不等于 &lt;&gt;
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumNe(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            ne("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 大于 &gt;
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumGt(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            gt("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 大于等于 &gt;=
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumGe(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            ge("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 小于 &lt;
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumLt(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            lt("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * 小于等于 &lt;=
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumLe(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            le("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * LIKE '%值%'
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumLike(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            like("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * NOT LIKE '%值%'
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumNotLike(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            notLike("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }


    /**
     * <p>房间当前总成员数</p>
     * LIKE '%值'
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumLikeLeft(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            likeLeft("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * LIKE '值%'
     * @param roomPeopleTotalNum       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumLikeRight(Integer roomPeopleTotalNum){
        if(roomPeopleTotalNum!=null){
            likeRight("room_people_total_num",roomPeopleTotalNum);
        }
        return this;
     }

    /**
     * <p>房间当前总成员数</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumIsNull(){
        isNull("room_people_total_num");
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumIsNotNull(){
        isNotNull("room_people_total_num");
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("room_people_total_num",value);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumIn(Integer... values){
        if(values!=null && values.length>0){
            in("room_people_total_num",values);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("room_people_total_num",value);
        }
        return this;
    }

    /**
     * <p>房间当前总成员数</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper roomPeopleTotalNumNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("room_people_total_num",values);
        }
        return this;
    }


    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 等于 = entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusEq(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            eq("allot_status",allotStatus);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 不等于 &lt;&gt; entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusNe(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            ne("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 大于 &gt; entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusGt(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            gt("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 大于等于 &gt;= entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusGe(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            ge("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 小于 &lt; entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusLt(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            lt("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 小于等于 &lt;= entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusLe(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            le("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * BETWEEN  entity().getAllotStatus() AND allotStatusEnd
     * @param allotStatusEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusBetween(Integer allotStatusEnd){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null && allotStatusEnd!=null){
            between("allot_status",allotStatus,allotStatusEnd);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT BETWEEN  entity().getAllotStatus() AND 值2
     * @param allotStatusEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusNotBetween(Integer allotStatusEnd){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null && allotStatusEnd!=null){
            notBetween("allot_status",allotStatus,allotStatusEnd);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * BETWEEN  entity().getAllotStatus() AND 值2
     * @param allotStatusStart       值1
     * @param allotStatusEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusBetween(Integer allotStatusStart,Integer allotStatusEnd){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null && allotStatusEnd!=null){
            between("allot_status",allotStatusStart,allotStatusEnd);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT BETWEEN  entity().getAllotStatus() AND 值2
     * @param allotStatusStart       值1
     * @param allotStatusEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusNotBetween(Integer allotStatusStart,Integer allotStatusEnd){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null && allotStatusEnd!=null){
            notBetween("allot_status",allotStatusStart,allotStatusEnd);
        }
        return this;
     }


    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '%值%'  entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusLike(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            like("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT LIKE '%值%'  entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusNotLike(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            notLike("allot_status",allotStatus);
        }
        return this;
     }


    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '%值'  entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusLikeLeft(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            likeLeft("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '值%'  entity().getAllotStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusLikeRight(){
        Integer allotStatus =entity().getAllotStatus();
        if(allotStatus!=null){
            likeRight("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 等于 =
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusEq(Integer allotStatus){
        if(allotStatus!=null){
            eq("allot_status",allotStatus);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 不等于 &lt;&gt;
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusNe(Integer allotStatus){
        if(allotStatus!=null){
            ne("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 大于 &gt;
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusGt(Integer allotStatus){
        if(allotStatus!=null){
            gt("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 大于等于 &gt;=
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusGe(Integer allotStatus){
        if(allotStatus!=null){
            ge("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 小于 &lt;
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusLt(Integer allotStatus){
        if(allotStatus!=null){
            lt("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * 小于等于 &lt;=
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusLe(Integer allotStatus){
        if(allotStatus!=null){
            le("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '%值%'
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusLike(Integer allotStatus){
        if(allotStatus!=null){
            like("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT LIKE '%值%'
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusNotLike(Integer allotStatus){
        if(allotStatus!=null){
            notLike("allot_status",allotStatus);
        }
        return this;
     }


    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '%值'
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusLikeLeft(Integer allotStatus){
        if(allotStatus!=null){
            likeLeft("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * LIKE '值%'
     * @param allotStatus       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusLikeRight(Integer allotStatus){
        if(allotStatus!=null){
            likeRight("allot_status",allotStatus);
        }
        return this;
     }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusIsNull(){
        isNull("allot_status");
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusIsNotNull(){
        isNotNull("allot_status");
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("allot_status",value);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusIn(Integer... values){
        if(values!=null && values.length>0){
            in("allot_status",values);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("allot_status",value);
        }
        return this;
    }

    /**
     * <p>用户设备分配状态（未分配：0，已分配：1）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper allotStatusNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("allot_status",values);
        }
        return this;
    }


    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * 等于 = entity().getServerType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serverTypeEq(){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeNe(){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeGt(){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeGe(){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeLt(){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeLe(){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeBetween(Integer serverTypeEnd){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeNotBetween(Integer serverTypeEnd){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeBetween(Integer serverTypeStart,Integer serverTypeEnd){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeNotBetween(Integer serverTypeStart,Integer serverTypeEnd){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeLike(){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeNotLike(){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeLikeLeft(){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeLikeRight(){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeEq(Integer serverType){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeNe(Integer serverType){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeGt(Integer serverType){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeGe(Integer serverType){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeLt(Integer serverType){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeLe(Integer serverType){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeLike(Integer serverType){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeNotLike(Integer serverType){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeLikeLeft(Integer serverType){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeLikeRight(Integer serverType){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeIsNull(){
        isNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serverTypeIsNotNull(){
        isNotNull("server_type");
        return this;
    }

    /**
     * <p>盒子服务类型(10：boxStream服务，20：boxRtc服务）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serverTypeIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeIn(Integer... values){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeNotIn(Collection<Integer> value){
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
    public YunMemberDeviceQueryEntityWrapper serverTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("server_type",values);
        }
        return this;
    }


    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 等于 = entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeEq(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            eq("service_biz_type",serviceBizType);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 不等于 &lt;&gt; entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeNe(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            ne("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 大于 &gt; entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeGt(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            gt("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 大于等于 &gt;= entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeGe(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            ge("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 小于 &lt; entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeLt(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            lt("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 小于等于 &lt;= entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeLe(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            le("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * BETWEEN  entity().getServiceBizType() AND serviceBizTypeEnd
     * @param serviceBizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeBetween(Integer serviceBizTypeEnd){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null && serviceBizTypeEnd!=null){
            between("service_biz_type",serviceBizType,serviceBizTypeEnd);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT BETWEEN  entity().getServiceBizType() AND 值2
     * @param serviceBizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeNotBetween(Integer serviceBizTypeEnd){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null && serviceBizTypeEnd!=null){
            notBetween("service_biz_type",serviceBizType,serviceBizTypeEnd);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * BETWEEN  entity().getServiceBizType() AND 值2
     * @param serviceBizTypeStart       值1
     * @param serviceBizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeBetween(Integer serviceBizTypeStart,Integer serviceBizTypeEnd){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null && serviceBizTypeEnd!=null){
            between("service_biz_type",serviceBizTypeStart,serviceBizTypeEnd);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT BETWEEN  entity().getServiceBizType() AND 值2
     * @param serviceBizTypeStart       值1
     * @param serviceBizTypeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeNotBetween(Integer serviceBizTypeStart,Integer serviceBizTypeEnd){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null && serviceBizTypeEnd!=null){
            notBetween("service_biz_type",serviceBizTypeStart,serviceBizTypeEnd);
        }
        return this;
     }


    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '%值%'  entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeLike(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            like("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT LIKE '%值%'  entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeNotLike(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            notLike("service_biz_type",serviceBizType);
        }
        return this;
     }


    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '%值'  entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeLikeLeft(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            likeLeft("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '值%'  entity().getServiceBizType()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeLikeRight(){
        Integer serviceBizType =entity().getServiceBizType();
        if(serviceBizType!=null){
            likeRight("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 等于 =
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeEq(Integer serviceBizType){
        if(serviceBizType!=null){
            eq("service_biz_type",serviceBizType);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 不等于 &lt;&gt;
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeNe(Integer serviceBizType){
        if(serviceBizType!=null){
            ne("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 大于 &gt;
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeGt(Integer serviceBizType){
        if(serviceBizType!=null){
            gt("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 大于等于 &gt;=
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeGe(Integer serviceBizType){
        if(serviceBizType!=null){
            ge("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 小于 &lt;
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeLt(Integer serviceBizType){
        if(serviceBizType!=null){
            lt("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * 小于等于 &lt;=
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeLe(Integer serviceBizType){
        if(serviceBizType!=null){
            le("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '%值%'
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeLike(Integer serviceBizType){
        if(serviceBizType!=null){
            like("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT LIKE '%值%'
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeNotLike(Integer serviceBizType){
        if(serviceBizType!=null){
            notLike("service_biz_type",serviceBizType);
        }
        return this;
     }


    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '%值'
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeLikeLeft(Integer serviceBizType){
        if(serviceBizType!=null){
            likeLeft("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * LIKE '值%'
     * @param serviceBizType       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeLikeRight(Integer serviceBizType){
        if(serviceBizType!=null){
            likeRight("service_biz_type",serviceBizType);
        }
        return this;
     }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeIsNull(){
        isNull("service_biz_type");
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeIsNotNull(){
        isNotNull("service_biz_type");
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("service_biz_type",value);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeIn(Integer... values){
        if(values!=null && values.length>0){
            in("service_biz_type",values);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("service_biz_type",value);
        }
        return this;
    }

    /**
     * <p>服务业务类型（0：普通业务类型，1：排队业务类型）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper serviceBizTypeNotIn(Integer... values){
        if(values!=null && values.length>0){
            notIn("service_biz_type",values);
        }
        return this;
    }


    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 等于 = entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandEq(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            eq("downstream_broadband",downstreamBroadband);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 不等于 &lt;&gt; entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandNe(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            ne("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 大于 &gt; entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandGt(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            gt("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 大于等于 &gt;= entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandGe(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            ge("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 小于 &lt; entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandLt(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            lt("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 小于等于 &lt;= entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandLe(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            le("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * BETWEEN  entity().getDownstreamBroadband() AND downstreamBroadbandEnd
     * @param downstreamBroadbandEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandBetween(Long downstreamBroadbandEnd){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null && downstreamBroadbandEnd!=null){
            between("downstream_broadband",downstreamBroadband,downstreamBroadbandEnd);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT BETWEEN  entity().getDownstreamBroadband() AND 值2
     * @param downstreamBroadbandEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandNotBetween(Long downstreamBroadbandEnd){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null && downstreamBroadbandEnd!=null){
            notBetween("downstream_broadband",downstreamBroadband,downstreamBroadbandEnd);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * BETWEEN  entity().getDownstreamBroadband() AND 值2
     * @param downstreamBroadbandStart       值1
     * @param downstreamBroadbandEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandBetween(Long downstreamBroadbandStart,Long downstreamBroadbandEnd){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null && downstreamBroadbandEnd!=null){
            between("downstream_broadband",downstreamBroadbandStart,downstreamBroadbandEnd);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT BETWEEN  entity().getDownstreamBroadband() AND 值2
     * @param downstreamBroadbandStart       值1
     * @param downstreamBroadbandEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandNotBetween(Long downstreamBroadbandStart,Long downstreamBroadbandEnd){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null && downstreamBroadbandEnd!=null){
            notBetween("downstream_broadband",downstreamBroadbandStart,downstreamBroadbandEnd);
        }
        return this;
     }


    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '%值%'  entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandLike(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            like("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT LIKE '%值%'  entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandNotLike(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            notLike("downstream_broadband",downstreamBroadband);
        }
        return this;
     }


    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '%值'  entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandLikeLeft(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            likeLeft("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '值%'  entity().getDownstreamBroadband()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandLikeRight(){
        Long downstreamBroadband =entity().getDownstreamBroadband();
        if(downstreamBroadband!=null){
            likeRight("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 等于 =
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandEq(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            eq("downstream_broadband",downstreamBroadband);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 不等于 &lt;&gt;
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandNe(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            ne("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 大于 &gt;
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandGt(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            gt("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 大于等于 &gt;=
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandGe(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            ge("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 小于 &lt;
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandLt(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            lt("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * 小于等于 &lt;=
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandLe(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            le("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '%值%'
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandLike(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            like("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT LIKE '%值%'
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandNotLike(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            notLike("downstream_broadband",downstreamBroadband);
        }
        return this;
     }


    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '%值'
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandLikeLeft(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            likeLeft("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * LIKE '值%'
     * @param downstreamBroadband       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandLikeRight(Long downstreamBroadband){
        if(downstreamBroadband!=null){
            likeRight("downstream_broadband",downstreamBroadband);
        }
        return this;
     }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandIsNull(){
        isNull("downstream_broadband");
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandIsNotNull(){
        isNotNull("downstream_broadband");
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("downstream_broadband",value);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandIn(Long... values){
        if(values!=null && values.length>0){
            in("downstream_broadband",values);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("downstream_broadband",value);
        }
        return this;
    }

    /**
     * <p>打开当前应用的下行宽带（kb）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper downstreamBroadbandNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("downstream_broadband",values);
        }
        return this;
    }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 等于 = entity().getStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusEq(){
        Integer status =entity().getStatus();
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 不等于 &lt;&gt; entity().getStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusNe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 大于 &gt; entity().getStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusGt(){
        Integer status =entity().getStatus();
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 大于等于 &gt;= entity().getStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusGe(){
        Integer status =entity().getStatus();
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 小于 &lt; entity().getStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusLt(){
        Integer status =entity().getStatus();
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 小于等于 &lt;= entity().getStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusLe(){
        Integer status =entity().getStatus();
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * BETWEEN  entity().getStatus() AND statusEnd
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusNotBetween(Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",status,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            between("status",statusStart,statusEnd);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT BETWEEN  entity().getStatus() AND 值2
     * @param statusStart       值1
     * @param statusEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusNotBetween(Integer statusStart,Integer statusEnd){
        Integer status =entity().getStatus();
        if(status!=null && statusEnd!=null){
            notBetween("status",statusStart,statusEnd);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT LIKE '%值%'  entity().getStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusNotLike(){
        Integer status =entity().getStatus();
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '%值'  entity().getStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusLikeLeft(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '值%'  entity().getStatus()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusLikeRight(){
        Integer status =entity().getStatus();
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 等于 =
     * @param status       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusEq(Integer status){
        if(status!=null){
            eq("status",status);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 不等于 &lt;&gt;
     * @param status       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusNe(Integer status){
        if(status!=null){
            ne("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 大于 &gt;
     * @param status       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusGt(Integer status){
        if(status!=null){
            gt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 大于等于 &gt;=
     * @param status       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusGe(Integer status){
        if(status!=null){
            ge("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 小于 &lt;
     * @param status       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusLt(Integer status){
        if(status!=null){
            lt("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * 小于等于 &lt;=
     * @param status       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusLe(Integer status){
        if(status!=null){
            le("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '%值%'
     * @param status       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusLike(Integer status){
        if(status!=null){
            like("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT LIKE '%值%'
     * @param status       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusNotLike(Integer status){
        if(status!=null){
            notLike("status",status);
        }
        return this;
     }


    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '%值'
     * @param status       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusLikeLeft(Integer status){
        if(status!=null){
            likeLeft("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * LIKE '值%'
     * @param status       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusLikeRight(Integer status){
        if(status!=null){
            likeRight("status",status);
        }
        return this;
     }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusIsNull(){
        isNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusIsNotNull(){
        isNotNull("status");
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            in("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusIn(Integer... values){
        if(values!=null && values.length>0){
            in("status",values);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusNotIn(Collection<Integer> value){
        if(value!=null && !value.isEmpty()){
            notIn("status",value);
        }
        return this;
    }

    /**
     * <p>设备状态（冻结：0，使用中：50，已过期/注销：-50，回收中：-60，已回收/已释放：-70）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper statusNotIn(Integer... values){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeEq(){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeNe(){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeGt(){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeGe(){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeLt(){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeLe(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            le("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * BETWEEN  entity().getBuyTime() AND buyTimeEnd
     * @param buyTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper buyTimeBetween(Date buyTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeNotBetween(Date buyTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeBetween(Date buyTimeStart,Date buyTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeNotBetween(Date buyTimeStart,Date buyTimeEnd){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null && buyTimeEnd!=null){
            notBetween("buy_time",buyTimeStart,buyTimeEnd);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值%'  entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper buyTimeLike(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            like("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * NOT LIKE '%值%'  entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper buyTimeNotLike(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            notLike("buy_time",buyTime);
        }
        return this;
     }


    /**
     * <p>订购时间</p>
     * LIKE '%值'  entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper buyTimeLikeLeft(){
        Date buyTime =entity().getBuyTime();
        if(buyTime!=null){
            likeLeft("buy_time",buyTime);
        }
        return this;
     }

    /**
     * <p>订购时间</p>
     * LIKE '值%'  entity().getBuyTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper buyTimeLikeRight(){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeEq(Date buyTime){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeNe(Date buyTime){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeGt(Date buyTime){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeGe(Date buyTime){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeLt(Date buyTime){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeLe(Date buyTime){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeLike(Date buyTime){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeNotLike(Date buyTime){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeLikeLeft(Date buyTime){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeLikeRight(Date buyTime){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeIsNull(){
        isNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper buyTimeIsNotNull(){
        isNotNull("buy_time");
        return this;
    }

    /**
     * <p>订购时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper buyTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeIn(Date... values){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryEntityWrapper buyTimeNotIn(Date... values){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeEq(){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeNe(){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeGt(){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeGe(){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeLt(){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeLe(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            le("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * BETWEEN  entity().getLastRenewTime() AND lastRenewTimeEnd
     * @param lastRenewTimeEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeBetween(Date lastRenewTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeNotBetween(Date lastRenewTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeNotBetween(Date lastRenewTimeStart,Date lastRenewTimeEnd){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null && lastRenewTimeEnd!=null){
            notBetween("last_renew_time",lastRenewTimeStart,lastRenewTimeEnd);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值%'  entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeLike(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            like("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * NOT LIKE '%值%'  entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeNotLike(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            notLike("last_renew_time",lastRenewTime);
        }
        return this;
     }


    /**
     * <p>最近一次续费时间</p>
     * LIKE '%值'  entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeLikeLeft(){
        Date lastRenewTime =entity().getLastRenewTime();
        if(lastRenewTime!=null){
            likeLeft("last_renew_time",lastRenewTime);
        }
        return this;
     }

    /**
     * <p>最近一次续费时间</p>
     * LIKE '值%'  entity().getLastRenewTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeLikeRight(){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeEq(Date lastRenewTime){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeNe(Date lastRenewTime){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeGt(Date lastRenewTime){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeGe(Date lastRenewTime){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeLt(Date lastRenewTime){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeLe(Date lastRenewTime){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeLike(Date lastRenewTime){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeNotLike(Date lastRenewTime){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeLikeLeft(Date lastRenewTime){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeLikeRight(Date lastRenewTime){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeIsNull(){
        isNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeIsNotNull(){
        isNotNull("last_renew_time");
        return this;
    }

    /**
     * <p>最近一次续费时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeIn(Date... values){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryEntityWrapper lastRenewTimeNotIn(Date... values){
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
    public YunMemberDeviceQueryEntityWrapper createTimeEq(){
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
    public YunMemberDeviceQueryEntityWrapper createTimeNe(){
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
    public YunMemberDeviceQueryEntityWrapper createTimeGt(){
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
    public YunMemberDeviceQueryEntityWrapper createTimeGe(){
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
    public YunMemberDeviceQueryEntityWrapper createTimeLt(){
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
    public YunMemberDeviceQueryEntityWrapper createTimeLe(){
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
    public YunMemberDeviceQueryEntityWrapper createTimeBetween(Date createTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper createTimeNotBetween(Date createTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper createTimeBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper createTimeNotBetween(Date createTimeStart,Date createTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper createTimeLike(){
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
    public YunMemberDeviceQueryEntityWrapper createTimeNotLike(){
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
    public YunMemberDeviceQueryEntityWrapper createTimeLikeLeft(){
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
    public YunMemberDeviceQueryEntityWrapper createTimeLikeRight(){
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
    public YunMemberDeviceQueryEntityWrapper createTimeEq(Date createTime){
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
    public YunMemberDeviceQueryEntityWrapper createTimeNe(Date createTime){
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
    public YunMemberDeviceQueryEntityWrapper createTimeGt(Date createTime){
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
    public YunMemberDeviceQueryEntityWrapper createTimeGe(Date createTime){
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
    public YunMemberDeviceQueryEntityWrapper createTimeLt(Date createTime){
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
    public YunMemberDeviceQueryEntityWrapper createTimeLe(Date createTime){
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
    public YunMemberDeviceQueryEntityWrapper createTimeLike(Date createTime){
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
    public YunMemberDeviceQueryEntityWrapper createTimeNotLike(Date createTime){
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
    public YunMemberDeviceQueryEntityWrapper createTimeLikeLeft(Date createTime){
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
    public YunMemberDeviceQueryEntityWrapper createTimeLikeRight(Date createTime){
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
    public YunMemberDeviceQueryEntityWrapper createTimeIsNull(){
        isNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper createTimeIsNotNull(){
        isNotNull("create_time");
        return this;
    }

    /**
     * <p>创建时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper createTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryEntityWrapper createTimeIn(Date... values){
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
    public YunMemberDeviceQueryEntityWrapper createTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryEntityWrapper createTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("create_time",values);
        }
        return this;
    }


    /**
     * <p>设备空闲上报时间</p>
     * 等于 = entity().getIdleTime()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper idleTimeEq(){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeNe(){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeGt(){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeGe(){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeLt(){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeLe(){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeBetween(Date idleTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeNotBetween(Date idleTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeBetween(Date idleTimeStart,Date idleTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeNotBetween(Date idleTimeStart,Date idleTimeEnd){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeLike(){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeNotLike(){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeLikeLeft(){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeLikeRight(){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeEq(Date idleTime){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeNe(Date idleTime){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeGt(Date idleTime){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeGe(Date idleTime){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeLt(Date idleTime){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeLe(Date idleTime){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeLike(Date idleTime){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeNotLike(Date idleTime){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeLikeLeft(Date idleTime){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeLikeRight(Date idleTime){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeIsNull(){
        isNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper idleTimeIsNotNull(){
        isNotNull("idle_time");
        return this;
    }

    /**
     * <p>设备空闲上报时间</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper idleTimeIn(Collection<Date> value){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeIn(Date... values){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeNotIn(Collection<Date> value){
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
    public YunMemberDeviceQueryEntityWrapper idleTimeNotIn(Date... values){
        if(values!=null && values.length>0){
            notIn("idle_time",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getVersionId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper versionIdEq(){
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
    public YunMemberDeviceQueryEntityWrapper versionIdNe(){
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
    public YunMemberDeviceQueryEntityWrapper versionIdGt(){
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
    public YunMemberDeviceQueryEntityWrapper versionIdGe(){
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
    public YunMemberDeviceQueryEntityWrapper versionIdLt(){
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
    public YunMemberDeviceQueryEntityWrapper versionIdLe(){
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
    public YunMemberDeviceQueryEntityWrapper versionIdBetween(Long versionIdEnd){
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
    public YunMemberDeviceQueryEntityWrapper versionIdNotBetween(Long versionIdEnd){
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
    public YunMemberDeviceQueryEntityWrapper versionIdBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberDeviceQueryEntityWrapper versionIdNotBetween(Long versionIdStart,Long versionIdEnd){
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
    public YunMemberDeviceQueryEntityWrapper versionIdLike(){
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
    public YunMemberDeviceQueryEntityWrapper versionIdNotLike(){
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
    public YunMemberDeviceQueryEntityWrapper versionIdLikeLeft(){
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
    public YunMemberDeviceQueryEntityWrapper versionIdLikeRight(){
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
    public YunMemberDeviceQueryEntityWrapper versionIdEq(Long versionId){
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
    public YunMemberDeviceQueryEntityWrapper versionIdNe(Long versionId){
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
    public YunMemberDeviceQueryEntityWrapper versionIdGt(Long versionId){
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
    public YunMemberDeviceQueryEntityWrapper versionIdGe(Long versionId){
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
    public YunMemberDeviceQueryEntityWrapper versionIdLt(Long versionId){
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
    public YunMemberDeviceQueryEntityWrapper versionIdLe(Long versionId){
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
    public YunMemberDeviceQueryEntityWrapper versionIdLike(Long versionId){
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
    public YunMemberDeviceQueryEntityWrapper versionIdNotLike(Long versionId){
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
    public YunMemberDeviceQueryEntityWrapper versionIdLikeLeft(Long versionId){
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
    public YunMemberDeviceQueryEntityWrapper versionIdLikeRight(Long versionId){
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
    public YunMemberDeviceQueryEntityWrapper versionIdIsNull(){
        isNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper versionIdIsNotNull(){
        isNotNull("version_id");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper versionIdIn(Collection<Long> value){
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
    public YunMemberDeviceQueryEntityWrapper versionIdIn(Long... values){
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
    public YunMemberDeviceQueryEntityWrapper versionIdNotIn(Collection<Long> value){
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
    public YunMemberDeviceQueryEntityWrapper versionIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("version_id",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceEq(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            eq("proxy_province",proxyProvince);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceNe(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            ne("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceGt(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            gt("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceGe(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            ge("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceLt(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            lt("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceLe(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            le("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getProxyProvince() AND proxyProvinceEnd
     * @param proxyProvinceEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceBetween(String proxyProvinceEnd){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null && proxyProvinceEnd!=null){
            between("proxy_province",proxyProvince,proxyProvinceEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getProxyProvince() AND 值2
     * @param proxyProvinceEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceNotBetween(String proxyProvinceEnd){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null && proxyProvinceEnd!=null){
            notBetween("proxy_province",proxyProvince,proxyProvinceEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getProxyProvince() AND 值2
     * @param proxyProvinceStart       值1
     * @param proxyProvinceEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceBetween(String proxyProvinceStart,String proxyProvinceEnd){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null && proxyProvinceEnd!=null){
            between("proxy_province",proxyProvinceStart,proxyProvinceEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getProxyProvince() AND 值2
     * @param proxyProvinceStart       值1
     * @param proxyProvinceEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceNotBetween(String proxyProvinceStart,String proxyProvinceEnd){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null && proxyProvinceEnd!=null){
            notBetween("proxy_province",proxyProvinceStart,proxyProvinceEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceLike(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            like("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceNotLike(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            notLike("proxy_province",proxyProvince);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceLikeLeft(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            likeLeft("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getProxyProvince()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceLikeRight(){
        String proxyProvince =entity().getProxyProvince();
        if(proxyProvince!=null){
            likeRight("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceEq(String proxyProvince){
        if(proxyProvince!=null){
            eq("proxy_province",proxyProvince);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceNe(String proxyProvince){
        if(proxyProvince!=null){
            ne("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceGt(String proxyProvince){
        if(proxyProvince!=null){
            gt("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceGe(String proxyProvince){
        if(proxyProvince!=null){
            ge("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceLt(String proxyProvince){
        if(proxyProvince!=null){
            lt("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceLe(String proxyProvince){
        if(proxyProvince!=null){
            le("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceLike(String proxyProvince){
        if(proxyProvince!=null){
            like("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceNotLike(String proxyProvince){
        if(proxyProvince!=null){
            notLike("proxy_province",proxyProvince);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceLikeLeft(String proxyProvince){
        if(proxyProvince!=null){
            likeLeft("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param proxyProvince       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceLikeRight(String proxyProvince){
        if(proxyProvince!=null){
            likeRight("proxy_province",proxyProvince);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceIsNull(){
        isNull("proxy_province");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceIsNotNull(){
        isNotNull("proxy_province");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("proxy_province",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceIn(String... values){
        if(values!=null && values.length>0){
            in("proxy_province",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("proxy_province",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyProvinceNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_province",values);
        }
        return this;
    }


    /**
     * <p></p>
     * 等于 = entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityEq(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            eq("proxy_city",proxyCity);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt; entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityNe(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            ne("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt; entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityGt(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            gt("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;= entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityGe(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            ge("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt; entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityLt(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            lt("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;= entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityLe(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            le("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getProxyCity() AND proxyCityEnd
     * @param proxyCityEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityBetween(String proxyCityEnd){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null && proxyCityEnd!=null){
            between("proxy_city",proxyCity,proxyCityEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getProxyCity() AND 值2
     * @param proxyCityEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityNotBetween(String proxyCityEnd){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null && proxyCityEnd!=null){
            notBetween("proxy_city",proxyCity,proxyCityEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * BETWEEN  entity().getProxyCity() AND 值2
     * @param proxyCityStart       值1
     * @param proxyCityEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityBetween(String proxyCityStart,String proxyCityEnd){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null && proxyCityEnd!=null){
            between("proxy_city",proxyCityStart,proxyCityEnd);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT BETWEEN  entity().getProxyCity() AND 值2
     * @param proxyCityStart       值1
     * @param proxyCityEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityNotBetween(String proxyCityStart,String proxyCityEnd){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null && proxyCityEnd!=null){
            notBetween("proxy_city",proxyCityStart,proxyCityEnd);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值%'  entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityLike(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            like("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'  entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityNotLike(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            notLike("proxy_city",proxyCity);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'  entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityLikeLeft(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            likeLeft("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'  entity().getProxyCity()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityLikeRight(){
        String proxyCity =entity().getProxyCity();
        if(proxyCity!=null){
            likeRight("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 等于 =
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityEq(String proxyCity){
        if(proxyCity!=null){
            eq("proxy_city",proxyCity);
        }
        return this;
    }

    /**
     * <p></p>
     * 不等于 &lt;&gt;
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityNe(String proxyCity){
        if(proxyCity!=null){
            ne("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于 &gt;
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityGt(String proxyCity){
        if(proxyCity!=null){
            gt("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 大于等于 &gt;=
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityGe(String proxyCity){
        if(proxyCity!=null){
            ge("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于 &lt;
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityLt(String proxyCity){
        if(proxyCity!=null){
            lt("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * 小于等于 &lt;=
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityLe(String proxyCity){
        if(proxyCity!=null){
            le("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '%值%'
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityLike(String proxyCity){
        if(proxyCity!=null){
            like("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * NOT LIKE '%值%'
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityNotLike(String proxyCity){
        if(proxyCity!=null){
            notLike("proxy_city",proxyCity);
        }
        return this;
     }


    /**
     * <p></p>
     * LIKE '%值'
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityLikeLeft(String proxyCity){
        if(proxyCity!=null){
            likeLeft("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * LIKE '值%'
     * @param proxyCity       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityLikeRight(String proxyCity){
        if(proxyCity!=null){
            likeRight("proxy_city",proxyCity);
        }
        return this;
     }

    /**
     * <p></p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityIsNull(){
        isNull("proxy_city");
        return this;
    }

    /**
     * <p></p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityIsNotNull(){
        isNotNull("proxy_city");
        return this;
    }

    /**
     * <p></p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("proxy_city",value);
        }
        return this;
    }

    /**
     * <p></p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityIn(String... values){
        if(values!=null && values.length>0){
            in("proxy_city",values);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("proxy_city",value);
        }
        return this;
    }

    /**
     * <p></p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyCityNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_city",values);
        }
        return this;
    }


    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 等于 = entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerEq(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            eq("proxy_server",proxyServer);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 不等于 &lt;&gt; entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerNe(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            ne("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 大于 &gt; entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerGt(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            gt("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 大于等于 &gt;= entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerGe(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            ge("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 小于 &lt; entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerLt(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            lt("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 小于等于 &lt;= entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerLe(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            le("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * BETWEEN  entity().getProxyServer() AND proxyServerEnd
     * @param proxyServerEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerBetween(String proxyServerEnd){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null && proxyServerEnd!=null){
            between("proxy_server",proxyServer,proxyServerEnd);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT BETWEEN  entity().getProxyServer() AND 值2
     * @param proxyServerEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerNotBetween(String proxyServerEnd){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null && proxyServerEnd!=null){
            notBetween("proxy_server",proxyServer,proxyServerEnd);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * BETWEEN  entity().getProxyServer() AND 值2
     * @param proxyServerStart       值1
     * @param proxyServerEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerBetween(String proxyServerStart,String proxyServerEnd){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null && proxyServerEnd!=null){
            between("proxy_server",proxyServerStart,proxyServerEnd);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT BETWEEN  entity().getProxyServer() AND 值2
     * @param proxyServerStart       值1
     * @param proxyServerEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerNotBetween(String proxyServerStart,String proxyServerEnd){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null && proxyServerEnd!=null){
            notBetween("proxy_server",proxyServerStart,proxyServerEnd);
        }
        return this;
     }


    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '%值%'  entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerLike(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            like("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT LIKE '%值%'  entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerNotLike(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            notLike("proxy_server",proxyServer);
        }
        return this;
     }


    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '%值'  entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerLikeLeft(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            likeLeft("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '值%'  entity().getProxyServer()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerLikeRight(){
        String proxyServer =entity().getProxyServer();
        if(proxyServer!=null){
            likeRight("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 等于 =
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerEq(String proxyServer){
        if(proxyServer!=null){
            eq("proxy_server",proxyServer);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 不等于 &lt;&gt;
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerNe(String proxyServer){
        if(proxyServer!=null){
            ne("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 大于 &gt;
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerGt(String proxyServer){
        if(proxyServer!=null){
            gt("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 大于等于 &gt;=
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerGe(String proxyServer){
        if(proxyServer!=null){
            ge("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 小于 &lt;
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerLt(String proxyServer){
        if(proxyServer!=null){
            lt("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * 小于等于 &lt;=
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerLe(String proxyServer){
        if(proxyServer!=null){
            le("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '%值%'
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerLike(String proxyServer){
        if(proxyServer!=null){
            like("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT LIKE '%值%'
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerNotLike(String proxyServer){
        if(proxyServer!=null){
            notLike("proxy_server",proxyServer);
        }
        return this;
     }


    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '%值'
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerLikeLeft(String proxyServer){
        if(proxyServer!=null){
            likeLeft("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * LIKE '值%'
     * @param proxyServer       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerLikeRight(String proxyServer){
        if(proxyServer!=null){
            likeRight("proxy_server",proxyServer);
        }
        return this;
     }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerIsNull(){
        isNull("proxy_server");
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerIsNotNull(){
        isNotNull("proxy_server");
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("proxy_server",value);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerIn(String... values){
        if(values!=null && values.length>0){
            in("proxy_server",values);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("proxy_server",value);
        }
        return this;
    }

    /**
     * <p>代理服务器的地址，缺省或null或\"\"时，表示没有使用代理</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyServerNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_server",values);
        }
        return this;
    }


    /**
     * <p>代理是否连上</p>
     * 等于 = entity().getConnected()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedEq(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            eq("connected",connected);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * 不等于 &lt;&gt; entity().getConnected()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedNe(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            ne("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 大于 &gt; entity().getConnected()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedGt(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            gt("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 大于等于 &gt;= entity().getConnected()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedGe(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            ge("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 小于 &lt; entity().getConnected()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedLt(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            lt("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 小于等于 &lt;= entity().getConnected()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedLe(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            le("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * BETWEEN  entity().getConnected() AND connectedEnd
     * @param connectedEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedBetween(Boolean connectedEnd){
        Boolean connected =entity().getConnected();
        if(connected!=null && connectedEnd!=null){
            between("connected",connected,connectedEnd);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * NOT BETWEEN  entity().getConnected() AND 值2
     * @param connectedEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedNotBetween(Boolean connectedEnd){
        Boolean connected =entity().getConnected();
        if(connected!=null && connectedEnd!=null){
            notBetween("connected",connected,connectedEnd);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * BETWEEN  entity().getConnected() AND 值2
     * @param connectedStart       值1
     * @param connectedEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedBetween(Boolean connectedStart,Boolean connectedEnd){
        Boolean connected =entity().getConnected();
        if(connected!=null && connectedEnd!=null){
            between("connected",connectedStart,connectedEnd);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * NOT BETWEEN  entity().getConnected() AND 值2
     * @param connectedStart       值1
     * @param connectedEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedNotBetween(Boolean connectedStart,Boolean connectedEnd){
        Boolean connected =entity().getConnected();
        if(connected!=null && connectedEnd!=null){
            notBetween("connected",connectedStart,connectedEnd);
        }
        return this;
     }


    /**
     * <p>代理是否连上</p>
     * LIKE '%值%'  entity().getConnected()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedLike(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            like("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * NOT LIKE '%值%'  entity().getConnected()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedNotLike(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            notLike("connected",connected);
        }
        return this;
     }


    /**
     * <p>代理是否连上</p>
     * LIKE '%值'  entity().getConnected()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedLikeLeft(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            likeLeft("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * LIKE '值%'  entity().getConnected()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedLikeRight(){
        Boolean connected =entity().getConnected();
        if(connected!=null){
            likeRight("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 等于 =
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedEq(Boolean connected){
        if(connected!=null){
            eq("connected",connected);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * 不等于 &lt;&gt;
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedNe(Boolean connected){
        if(connected!=null){
            ne("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 大于 &gt;
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedGt(Boolean connected){
        if(connected!=null){
            gt("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 大于等于 &gt;=
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedGe(Boolean connected){
        if(connected!=null){
            ge("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 小于 &lt;
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedLt(Boolean connected){
        if(connected!=null){
            lt("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * 小于等于 &lt;=
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedLe(Boolean connected){
        if(connected!=null){
            le("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * LIKE '%值%'
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedLike(Boolean connected){
        if(connected!=null){
            like("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * NOT LIKE '%值%'
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedNotLike(Boolean connected){
        if(connected!=null){
            notLike("connected",connected);
        }
        return this;
     }


    /**
     * <p>代理是否连上</p>
     * LIKE '%值'
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedLikeLeft(Boolean connected){
        if(connected!=null){
            likeLeft("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * LIKE '值%'
     * @param connected       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedLikeRight(Boolean connected){
        if(connected!=null){
            likeRight("connected",connected);
        }
        return this;
     }

    /**
     * <p>代理是否连上</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedIsNull(){
        isNull("connected");
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedIsNotNull(){
        isNotNull("connected");
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("connected",value);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedIn(Boolean... values){
        if(values!=null && values.length>0){
            in("connected",values);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("connected",value);
        }
        return this;
    }

    /**
     * <p>代理是否连上</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper connectedNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("connected",values);
        }
        return this;
    }


    /**
     * <p>当前代理的网络IP</p>
     * 等于 = entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpEq(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            eq("proxy_net_ip",proxyNetIp);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * 不等于 &lt;&gt; entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpNe(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            ne("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 大于 &gt; entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpGt(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            gt("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 大于等于 &gt;= entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpGe(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            ge("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 小于 &lt; entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpLt(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            lt("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 小于等于 &lt;= entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpLe(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            le("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * BETWEEN  entity().getProxyNetIp() AND proxyNetIpEnd
     * @param proxyNetIpEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpBetween(String proxyNetIpEnd){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null && proxyNetIpEnd!=null){
            between("proxy_net_ip",proxyNetIp,proxyNetIpEnd);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * NOT BETWEEN  entity().getProxyNetIp() AND 值2
     * @param proxyNetIpEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpNotBetween(String proxyNetIpEnd){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null && proxyNetIpEnd!=null){
            notBetween("proxy_net_ip",proxyNetIp,proxyNetIpEnd);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * BETWEEN  entity().getProxyNetIp() AND 值2
     * @param proxyNetIpStart       值1
     * @param proxyNetIpEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpBetween(String proxyNetIpStart,String proxyNetIpEnd){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null && proxyNetIpEnd!=null){
            between("proxy_net_ip",proxyNetIpStart,proxyNetIpEnd);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * NOT BETWEEN  entity().getProxyNetIp() AND 值2
     * @param proxyNetIpStart       值1
     * @param proxyNetIpEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpNotBetween(String proxyNetIpStart,String proxyNetIpEnd){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null && proxyNetIpEnd!=null){
            notBetween("proxy_net_ip",proxyNetIpStart,proxyNetIpEnd);
        }
        return this;
     }


    /**
     * <p>当前代理的网络IP</p>
     * LIKE '%值%'  entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpLike(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            like("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * NOT LIKE '%值%'  entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpNotLike(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            notLike("proxy_net_ip",proxyNetIp);
        }
        return this;
     }


    /**
     * <p>当前代理的网络IP</p>
     * LIKE '%值'  entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpLikeLeft(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            likeLeft("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * LIKE '值%'  entity().getProxyNetIp()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpLikeRight(){
        String proxyNetIp =entity().getProxyNetIp();
        if(proxyNetIp!=null){
            likeRight("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 等于 =
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpEq(String proxyNetIp){
        if(proxyNetIp!=null){
            eq("proxy_net_ip",proxyNetIp);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * 不等于 &lt;&gt;
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpNe(String proxyNetIp){
        if(proxyNetIp!=null){
            ne("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 大于 &gt;
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpGt(String proxyNetIp){
        if(proxyNetIp!=null){
            gt("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 大于等于 &gt;=
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpGe(String proxyNetIp){
        if(proxyNetIp!=null){
            ge("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 小于 &lt;
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpLt(String proxyNetIp){
        if(proxyNetIp!=null){
            lt("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * 小于等于 &lt;=
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpLe(String proxyNetIp){
        if(proxyNetIp!=null){
            le("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * LIKE '%值%'
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpLike(String proxyNetIp){
        if(proxyNetIp!=null){
            like("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * NOT LIKE '%值%'
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpNotLike(String proxyNetIp){
        if(proxyNetIp!=null){
            notLike("proxy_net_ip",proxyNetIp);
        }
        return this;
     }


    /**
     * <p>当前代理的网络IP</p>
     * LIKE '%值'
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpLikeLeft(String proxyNetIp){
        if(proxyNetIp!=null){
            likeLeft("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * LIKE '值%'
     * @param proxyNetIp       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpLikeRight(String proxyNetIp){
        if(proxyNetIp!=null){
            likeRight("proxy_net_ip",proxyNetIp);
        }
        return this;
     }

    /**
     * <p>当前代理的网络IP</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpIsNull(){
        isNull("proxy_net_ip");
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpIsNotNull(){
        isNotNull("proxy_net_ip");
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("proxy_net_ip",value);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpIn(String... values){
        if(values!=null && values.length>0){
            in("proxy_net_ip",values);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("proxy_net_ip",value);
        }
        return this;
    }

    /**
     * <p>当前代理的网络IP</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_net_ip",values);
        }
        return this;
    }


    /**
     * <p>IP的地理位置显示</p>
     * 等于 = entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressEq(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            eq("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * 不等于 &lt;&gt; entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressNe(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            ne("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 大于 &gt; entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressGt(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            gt("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 大于等于 &gt;= entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressGe(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            ge("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 小于 &lt; entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressLt(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            lt("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 小于等于 &lt;= entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressLe(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            le("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * BETWEEN  entity().getProxyNetIpAddress() AND proxyNetIpAddressEnd
     * @param proxyNetIpAddressEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressBetween(String proxyNetIpAddressEnd){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null && proxyNetIpAddressEnd!=null){
            between("proxy_net_ip_address",proxyNetIpAddress,proxyNetIpAddressEnd);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * NOT BETWEEN  entity().getProxyNetIpAddress() AND 值2
     * @param proxyNetIpAddressEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressNotBetween(String proxyNetIpAddressEnd){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null && proxyNetIpAddressEnd!=null){
            notBetween("proxy_net_ip_address",proxyNetIpAddress,proxyNetIpAddressEnd);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * BETWEEN  entity().getProxyNetIpAddress() AND 值2
     * @param proxyNetIpAddressStart       值1
     * @param proxyNetIpAddressEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressBetween(String proxyNetIpAddressStart,String proxyNetIpAddressEnd){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null && proxyNetIpAddressEnd!=null){
            between("proxy_net_ip_address",proxyNetIpAddressStart,proxyNetIpAddressEnd);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * NOT BETWEEN  entity().getProxyNetIpAddress() AND 值2
     * @param proxyNetIpAddressStart       值1
     * @param proxyNetIpAddressEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressNotBetween(String proxyNetIpAddressStart,String proxyNetIpAddressEnd){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null && proxyNetIpAddressEnd!=null){
            notBetween("proxy_net_ip_address",proxyNetIpAddressStart,proxyNetIpAddressEnd);
        }
        return this;
     }


    /**
     * <p>IP的地理位置显示</p>
     * LIKE '%值%'  entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressLike(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            like("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * NOT LIKE '%值%'  entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressNotLike(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            notLike("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }


    /**
     * <p>IP的地理位置显示</p>
     * LIKE '%值'  entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressLikeLeft(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            likeLeft("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * LIKE '值%'  entity().getProxyNetIpAddress()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressLikeRight(){
        String proxyNetIpAddress =entity().getProxyNetIpAddress();
        if(proxyNetIpAddress!=null){
            likeRight("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 等于 =
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressEq(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            eq("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * 不等于 &lt;&gt;
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressNe(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            ne("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 大于 &gt;
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressGt(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            gt("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 大于等于 &gt;=
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressGe(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            ge("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 小于 &lt;
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressLt(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            lt("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * 小于等于 &lt;=
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressLe(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            le("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * LIKE '%值%'
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressLike(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            like("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * NOT LIKE '%值%'
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressNotLike(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            notLike("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }


    /**
     * <p>IP的地理位置显示</p>
     * LIKE '%值'
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressLikeLeft(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            likeLeft("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * LIKE '值%'
     * @param proxyNetIpAddress       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressLikeRight(String proxyNetIpAddress){
        if(proxyNetIpAddress!=null){
            likeRight("proxy_net_ip_address",proxyNetIpAddress);
        }
        return this;
     }

    /**
     * <p>IP的地理位置显示</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressIsNull(){
        isNull("proxy_net_ip_address");
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressIsNotNull(){
        isNotNull("proxy_net_ip_address");
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            in("proxy_net_ip_address",value);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressIn(String... values){
        if(values!=null && values.length>0){
            in("proxy_net_ip_address",values);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressNotIn(Collection<String> value){
        if(value!=null && !value.isEmpty()){
            notIn("proxy_net_ip_address",value);
        }
        return this;
    }

    /**
     * <p>IP的地理位置显示</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper proxyNetIpAddressNotIn(String... values){
        if(values!=null && values.length>0){
            notIn("proxy_net_ip_address",values);
        }
        return this;
    }


    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 等于 = entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceEq(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            eq("seed_device",seedDevice);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 不等于 &lt;&gt; entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceNe(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            ne("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 大于 &gt; entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceGt(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            gt("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 大于等于 &gt;= entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceGe(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            ge("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 小于 &lt; entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceLt(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            lt("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 小于等于 &lt;= entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceLe(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            le("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * BETWEEN  entity().getSeedDevice() AND seedDeviceEnd
     * @param seedDeviceEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceBetween(Boolean seedDeviceEnd){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null && seedDeviceEnd!=null){
            between("seed_device",seedDevice,seedDeviceEnd);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT BETWEEN  entity().getSeedDevice() AND 值2
     * @param seedDeviceEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceNotBetween(Boolean seedDeviceEnd){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null && seedDeviceEnd!=null){
            notBetween("seed_device",seedDevice,seedDeviceEnd);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * BETWEEN  entity().getSeedDevice() AND 值2
     * @param seedDeviceStart       值1
     * @param seedDeviceEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceBetween(Boolean seedDeviceStart,Boolean seedDeviceEnd){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null && seedDeviceEnd!=null){
            between("seed_device",seedDeviceStart,seedDeviceEnd);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT BETWEEN  entity().getSeedDevice() AND 值2
     * @param seedDeviceStart       值1
     * @param seedDeviceEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceNotBetween(Boolean seedDeviceStart,Boolean seedDeviceEnd){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null && seedDeviceEnd!=null){
            notBetween("seed_device",seedDeviceStart,seedDeviceEnd);
        }
        return this;
     }


    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '%值%'  entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceLike(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            like("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT LIKE '%值%'  entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceNotLike(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            notLike("seed_device",seedDevice);
        }
        return this;
     }


    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '%值'  entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceLikeLeft(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            likeLeft("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '值%'  entity().getSeedDevice()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceLikeRight(){
        Boolean seedDevice =entity().getSeedDevice();
        if(seedDevice!=null){
            likeRight("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 等于 =
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceEq(Boolean seedDevice){
        if(seedDevice!=null){
            eq("seed_device",seedDevice);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 不等于 &lt;&gt;
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceNe(Boolean seedDevice){
        if(seedDevice!=null){
            ne("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 大于 &gt;
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceGt(Boolean seedDevice){
        if(seedDevice!=null){
            gt("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 大于等于 &gt;=
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceGe(Boolean seedDevice){
        if(seedDevice!=null){
            ge("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 小于 &lt;
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceLt(Boolean seedDevice){
        if(seedDevice!=null){
            lt("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * 小于等于 &lt;=
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceLe(Boolean seedDevice){
        if(seedDevice!=null){
            le("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '%值%'
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceLike(Boolean seedDevice){
        if(seedDevice!=null){
            like("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT LIKE '%值%'
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceNotLike(Boolean seedDevice){
        if(seedDevice!=null){
            notLike("seed_device",seedDevice);
        }
        return this;
     }


    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '%值'
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceLikeLeft(Boolean seedDevice){
        if(seedDevice!=null){
            likeLeft("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * LIKE '值%'
     * @param seedDevice       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceLikeRight(Boolean seedDevice){
        if(seedDevice!=null){
            likeRight("seed_device",seedDevice);
        }
        return this;
     }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceIsNull(){
        isNull("seed_device");
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceIsNotNull(){
        isNotNull("seed_device");
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            in("seed_device",value);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceIn(Boolean... values){
        if(values!=null && values.length>0){
            in("seed_device",values);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceNotIn(Collection<Boolean> value){
        if(value!=null && !value.isEmpty()){
            notIn("seed_device",value);
        }
        return this;
    }

    /**
     * <p>是否种子机（0：否，1：是）</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper seedDeviceNotIn(Boolean... values){
        if(values!=null && values.length>0){
            notIn("seed_device",values);
        }
        return this;
    }


    /**
     * <p>物理机使用率记录id</p>
     * 等于 = entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdEq(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            eq("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * 不等于 &lt;&gt; entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdNe(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            ne("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 大于 &gt; entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdGt(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            gt("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 大于等于 &gt;= entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdGe(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            ge("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 小于 &lt; entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdLt(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            lt("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 小于等于 &lt;= entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdLe(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            le("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * BETWEEN  entity().getFkServerHostUsageRateId() AND fkServerHostUsageRateIdEnd
     * @param fkServerHostUsageRateIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdBetween(Long fkServerHostUsageRateIdEnd){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null && fkServerHostUsageRateIdEnd!=null){
            between("fk_server_host_usage_rate_id",fkServerHostUsageRateId,fkServerHostUsageRateIdEnd);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * NOT BETWEEN  entity().getFkServerHostUsageRateId() AND 值2
     * @param fkServerHostUsageRateIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdNotBetween(Long fkServerHostUsageRateIdEnd){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null && fkServerHostUsageRateIdEnd!=null){
            notBetween("fk_server_host_usage_rate_id",fkServerHostUsageRateId,fkServerHostUsageRateIdEnd);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * BETWEEN  entity().getFkServerHostUsageRateId() AND 值2
     * @param fkServerHostUsageRateIdStart       值1
     * @param fkServerHostUsageRateIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdBetween(Long fkServerHostUsageRateIdStart,Long fkServerHostUsageRateIdEnd){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null && fkServerHostUsageRateIdEnd!=null){
            between("fk_server_host_usage_rate_id",fkServerHostUsageRateIdStart,fkServerHostUsageRateIdEnd);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * NOT BETWEEN  entity().getFkServerHostUsageRateId() AND 值2
     * @param fkServerHostUsageRateIdStart       值1
     * @param fkServerHostUsageRateIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdNotBetween(Long fkServerHostUsageRateIdStart,Long fkServerHostUsageRateIdEnd){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null && fkServerHostUsageRateIdEnd!=null){
            notBetween("fk_server_host_usage_rate_id",fkServerHostUsageRateIdStart,fkServerHostUsageRateIdEnd);
        }
        return this;
     }


    /**
     * <p>物理机使用率记录id</p>
     * LIKE '%值%'  entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdLike(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            like("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * NOT LIKE '%值%'  entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdNotLike(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            notLike("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }


    /**
     * <p>物理机使用率记录id</p>
     * LIKE '%值'  entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdLikeLeft(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            likeLeft("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * LIKE '值%'  entity().getFkServerHostUsageRateId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdLikeRight(){
        Long fkServerHostUsageRateId =entity().getFkServerHostUsageRateId();
        if(fkServerHostUsageRateId!=null){
            likeRight("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 等于 =
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdEq(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            eq("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * 不等于 &lt;&gt;
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdNe(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            ne("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 大于 &gt;
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdGt(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            gt("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 大于等于 &gt;=
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdGe(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            ge("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 小于 &lt;
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdLt(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            lt("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * 小于等于 &lt;=
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdLe(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            le("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * LIKE '%值%'
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdLike(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            like("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * NOT LIKE '%值%'
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdNotLike(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            notLike("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }


    /**
     * <p>物理机使用率记录id</p>
     * LIKE '%值'
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdLikeLeft(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            likeLeft("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * LIKE '值%'
     * @param fkServerHostUsageRateId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdLikeRight(Long fkServerHostUsageRateId){
        if(fkServerHostUsageRateId!=null){
            likeRight("fk_server_host_usage_rate_id",fkServerHostUsageRateId);
        }
        return this;
     }

    /**
     * <p>物理机使用率记录id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdIsNull(){
        isNull("fk_server_host_usage_rate_id");
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdIsNotNull(){
        isNotNull("fk_server_host_usage_rate_id");
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_server_host_usage_rate_id",value);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_server_host_usage_rate_id",values);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_server_host_usage_rate_id",value);
        }
        return this;
    }

    /**
     * <p>物理机使用率记录id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkServerHostUsageRateIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_server_host_usage_rate_id",values);
        }
        return this;
    }


    /**
     * <p>区域id</p>
     * 等于 = entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdEq(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 不等于 &lt;&gt; entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdNe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 大于 &gt; entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdGt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 大于等于 &gt;= entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdGe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 小于 &lt; entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdLt(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 小于等于 &lt;= entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdLe(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * BETWEEN  entity().getFkPcpAreaId() AND fkPcpAreaIdEnd
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaId,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaId,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            between("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT BETWEEN  entity().getFkPcpAreaId() AND 值2
     * @param fkPcpAreaIdStart       值1
     * @param fkPcpAreaIdEnd      值2
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdNotBetween(Long fkPcpAreaIdStart,Long fkPcpAreaIdEnd){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null && fkPcpAreaIdEnd!=null){
            notBetween("fk_pcp_area_id",fkPcpAreaIdStart,fkPcpAreaIdEnd);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值%'  entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT LIKE '%值%'  entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdNotLike(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值'  entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdLikeLeft(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * LIKE '值%'  entity().getFkPcpAreaId()
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdLikeRight(){
        Long fkPcpAreaId =entity().getFkPcpAreaId();
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 等于 =
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdEq(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            eq("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * 不等于 &lt;&gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdNe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ne("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 大于 &gt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdGt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            gt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 大于等于 &gt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdGe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            ge("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 小于 &lt;
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdLt(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            lt("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * 小于等于 &lt;=
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdLe(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            le("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            like("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * NOT LIKE '%值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdNotLike(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            notLike("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }


    /**
     * <p>区域id</p>
     * LIKE '%值'
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdLikeLeft(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeLeft("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * LIKE '值%'
     * @param fkPcpAreaId       值
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdLikeRight(Long fkPcpAreaId){
        if(fkPcpAreaId!=null){
            likeRight("fk_pcp_area_id",fkPcpAreaId);
        }
        return this;
     }

    /**
     * <p>区域id</p>
     * IS NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdIsNull(){
        isNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IS NOT NULL
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdIsNotNull(){
        isNotNull("fk_pcp_area_id");
        return this;
    }

    /**
     * <p>区域id</p>
     * IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            in("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdIn(Long... values){
        if(values!=null && values.length>0){
            in("fk_pcp_area_id",values);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * NOT IN (value.get(0), value.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdNotIn(Collection<Long> value){
        if(value!=null && !value.isEmpty()){
            notIn("fk_pcp_area_id",value);
        }
        return this;
    }

    /**
     * <p>区域id</p>
     * NOT IN (values.get(0), values.get(1), ...)
     * @return children
     */
    public YunMemberDeviceQueryEntityWrapper fkPcpAreaIdNotIn(Long... values){
        if(values!=null && values.length>0){
            notIn("fk_pcp_area_id",values);
        }
        return this;
    }



}
